/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.normalizer.main;

import dk.normalizer.controller.NormalizeFromBankJSON;
import java.io.IOException;

/**
 *
 * @author marekrigan
 */
public class NormalizerBankJSON {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        NormalizeFromBankJSON.receiveMessages();
    }
    
}
