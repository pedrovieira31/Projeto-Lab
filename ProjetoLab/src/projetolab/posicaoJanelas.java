/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetolab;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

/**
 *
 * @author dolva
 */
public class posicaoJanelas {
    
    public void centralizar(JInternalFrame janela, JDesktopPane desktop){
        int wdesk = desktop.getWidth();
        int hdesk = desktop.getHeight();
        int winter = janela.getWidth();
        int hinter = janela.getHeight();
        janela.setLocation(wdesk / 2- winter / 2, hdesk / 2 - hinter / 2);
        desktop.add(janela);
        janela.setVisible(true);
    }
    
}
