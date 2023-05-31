package Scenes;

import java.io.IOException;

import Source.*;
import javafx.event.ActionEvent;

public class P_CustomOrder 
{
    public void somefunction(ActionEvent event) throws IOException
    {
        Main.sceneManager.P_RestockInv(event);
    }    
}
