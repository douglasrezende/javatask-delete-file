import com.sterlingcommerce.woodstock.workflow.Document;    
import java.io.File;     
import java.io.FileNotFoundException;     
import java.io.FileReader;     
import java.io.IOException;     
File file = null;     
String[] files = null;     
String path = (String)wfc.getWFContent("directory");     
try{         
   File folder = new File(path);         
   files = folder.list();         
   if (folder.isDirectory()){                   
     File[] listFiles = folder.listFiles();                
     for (int i = 0; i < listFiles.length; ++i) {                              
        String name = files[i];         
        file = new File(folder.getPath(), name);                          
        file.delete();                          
     }
   }  
}catch(Exception ex){            
   log.log("File Not Exist!"+ ex.getMessage());    
}    
return "000";