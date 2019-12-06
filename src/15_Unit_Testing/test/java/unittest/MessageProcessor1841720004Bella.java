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
public class MessageProcessor1841720004Bella {
    private String mSender, mRecipient, mMessage;

    public String getmSenderBella() {
        return mSender;
    }

    public void setmSenderBella(String mSender) {
        this.mSender = mSender;
    }

    public String getmRecipientBella() {
        return mRecipient;
    }

    public void setmRecipientBella(String mRecipient) {
        this.mRecipient = mRecipient;
    }

    public String getmMessageBella() {
        return mMessage;
    }

    public void setmMessageBella(String mMessage) {
        this.mMessage = mMessage;
    }
    
    public String messageFormatBella(){
        String message = String.format("Hai %s, you have message from %s.\nThe message as follows : %s", 
                this.mRecipient, this.mSender, this.mMessage);
        return message;
    }
    
    public void showMessage(){
        System.out.println(messageFormatBella());
    }
}
