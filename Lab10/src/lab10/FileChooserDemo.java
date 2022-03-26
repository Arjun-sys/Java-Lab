/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;
/**
 *
 * @author admin
 */
public class FileChooserDemo {
    public static void main(String[] args)
    {
        JFileChooser jfc=new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        int returnValue=jfc.showOpenDialog(null);
        if(returnValue==JFileChooser.APPROVE_OPTION)
        {
            File selectedFile=jfc.getSelectedFile();
            System.out.println(selectedFile.getAbsoluteFile());
        }
    }
    
}
