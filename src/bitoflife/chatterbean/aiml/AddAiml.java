/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bitoflife.chatterbean.aiml;


import java.io.File;
import org.alicebot.ab.Bot;
import org.alicebot.ab.MagicBooleans;
 
public class AddAiml {
 
    private static final boolean TRACE_MODE = false;
    static String botName = "";
 
    public static void main(String[] args) {
        try {
 
            String resourcesPath = "C:"+File.separator+"Users"+File.separator+"Shradha"+File.separator+"Documents"+File.separator+"NetBeansProjects"+File.separator+"chatbot"+File.separator+"Bots"+File.separator+"Alice";
        
            java.lang.System.out.println(resourcesPath);
 //           MagicBooleans.trace_mode = TRACE_MODE;
            Bot bot = new Bot("Alice", resourcesPath);
             
            bot.writeAIMLFiles();
 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
    private static String getResourcesPath() {
        File currDir = new File(".");
        String path = currDir.getAbsolutePath();
        path = path.substring(0, path.length() - 2);
        java.lang.System.out.println(path);
	//"C:"+File.separator+"Users"+File.separator+"Shradha"+File.separator+"Documents"+File.separator+"NetBeansProjects"+File.separator+"chatbot"+File.separator+"Bots"+File.separator+"Alice"
        String resourcesPath = "C:"+File.separator+"Users"+File.separator+"Shradha"+File.separator+"Documents"+File.separator+"NetBeansProjects"+File.separator+"chatbot"+File.separator+"Bots"+File.separator+"Alice";
        return resourcesPath;
    }
}