/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest;

/**
 *
 * @author bella
 */
import org.junit.Assert;
import org.junit.Test;
public class MessageProcessorTest1841720004Bella {
    MessageProcessor1841720004Bella mProcessor;

    public MessageProcessorTest1841720004Bella() {
        mProcessor = new MessageProcessor1841720004Bella();
        mProcessor.setmSenderBella("Ronaldo");
        mProcessor.setmRecipientBella("Rafael");
        mProcessor.setmMessageBella("Whats up bro?");
    }
    
    @Test
    public void testShowMessageBella(){
        String expectedResult = "Hai Rafael, you have message from Ronaldo.\nThe message as follows : Whats up bro?";
        Assert.assertEquals(expectedResult, mProcessor.messageFormatBella());
    }
}
