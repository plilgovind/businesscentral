package com.demo;

import java.util.HashMap;
import java.util.Map;
import org.kie.api.runtime.process.ProcessContext;

/**
 * ReceiptCreation helper class for jBPM 2025
 */
public class ReceiptCreation {

    /**
     * Called from Script Task: com.demo.ReceiptCreation.startProcessesCreateReceipt(kcontext);
     */
    public static void startProcessesCreateReceipt(ProcessContext kcontext) {
        try {
            Map<String, Object> params = new HashMap<>();
            params.put("message", "Hello jBPM 2025!");
            
            // Your Process ID
            String processId = "cosmos_digital.nbs"; 
            
            // Set the variable back to the process
            kcontext.setVariable("processInstanceList", processId);
            
           
        } catch (Exception e) {
            // System.err.println(">>> Error in ReceiptCreation: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Leave empty for Business Central
    }
}
