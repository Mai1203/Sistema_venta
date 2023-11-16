/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import model.Connection_jdbc;
import model.Productos;

/**
 *
 * @author maico
 */
public class NuevaVentaDAO {

    Connection_jdbc cn = new Connection_jdbc();
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public Productos BuscarCod(String cod) {
        Productos codigo = new Productos();
        String sql = "SELECT * FROM productos WHERE codigo = ?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, cod);
            rs = ps.executeQuery();

            if(rs.next()) {
                codigo.setProducto(rs.getString("producto"));
                codigo.setPrecio(rs.getDouble("precio"));
                codigo.setStock(rs.getInt("stock"));
            }

        } catch (SQLException e) {
            System.out.println(e.toString());
        }finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }

        }
        return codigo;
    }
    
    public Productos BuscarPro(String pro) {
        Productos producto = new Productos();
        String sql = "SELECT * FROM productos WHERE producto = ?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, pro);
            rs = ps.executeQuery();

            if(rs.next()) {
                producto.setCodigo(rs.getString("codigo"));
                producto.setPrecio(rs.getDouble("precio"));
                producto.setStock(rs.getInt("stock"));
            }

        } catch (SQLException e) {
            System.out.println(e.toString());
        }finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }

        }
        return producto;
    }

    public List codigos_Autocom() {
        List lista_cod = new ArrayList();
        String sql = "SELECT codigo FROM productos";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                lista_cod.add(rs.getString("codigo"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return lista_cod;
    }
    
    public List productos_Autocom() {
        List lista_pro = new ArrayList();
        String sql = "SELECT producto FROM productos";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                lista_pro.add(rs.getString("producto"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return lista_pro;
    }
    
    private void pdf() throws FileNotFoundException{
        Document documento = new Document();
        try {
            String ruta = System.getProperty("user.home");       
            PdfWriter.getInstance(documento, new FileOutputStream(ruta+"/Documents/NetBeansProjects/Ferelinares/src/pdf/Reporte.pdf"));
            documento.open();

            //Image img = Image.getInstance("scr/Image/Clientes.png");
            Paragraph fech = new Paragraph();
            Font negrita = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD, BaseColor.BLUE);
            fech.add(Chunk.NEWLINE);
            Date date = new Date();
            fech.add("Factura 1\n" + "Fecha: " + new SimpleDateFormat("dd-mm-yyyy").format(date) + "\n\n");
            documento.add(fech);

            try {
                PdfPTable Encabezado = new PdfPTable(4);
                Encabezado.setWidthPercentage(100);
                Encabezado.getDefaultCell().setBorder(0);
                float[] ColumnaEncabezado = new float[]{20f, 30f, 70f, 40f};
                Encabezado.setWidths(ColumnaEncabezado);
                Encabezado.setHorizontalAlignment(Element.ALIGN_LEFT);

                //Encabezado.addCell(img);
                String ruc = "10004598203";
                String nom = "Maicol";
                String tel = "3229443506";
                String dir = "San Francisco-Centro";

                Encabezado.addCell("");
                Encabezado.addCell("Ruc: " + ruc + "\nNombre: " + nom + "\nTelefono: " + tel + "\nDireccion: " + dir);
                Encabezado.addCell(fech);
                
                documento.add(Encabezado);
            } catch (DocumentException e) {
                System.out.println(e.toString());
            }
            
            

            documento.close();
            JOptionPane.showMessageDialog(null, "pdf creado");
            
        } catch (DocumentException e) {
            System.out.println(e.toString());
        }
    }
}
