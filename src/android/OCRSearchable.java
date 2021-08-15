package cordova-plugin-ocrsearchable;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class echoes a string called from JavaScript.
 */
public class OCRSearchable extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("coolMethod")) {
            String message = args.getString(0);
            this.coolMethod(message, callbackContext);
            return true;
        }
        else if (action.equals("capture")) {
            this.capture(args, callbackContext);
            return true;
        }
        return false;
    }

    private void coolMethod(String message, CallbackContext callbackContext) {
        if (message != null && message.length() > 0) {
            callbackContext.success(message);
        } else {
            callbackContext.error("Expected one non-empty string argument.");
        }
    }

    private void capture(JSONArray args, CallbackContext callback) {
        if (args!= null) 
        {
            //callbackContext.success(message);
            try 
            {
                String s1 = args.getJSONObject(0).getString("string1");
                console.log("This is working! " + s1);
                callbackContext.success(" done !!");
            } 
            catch (Exception e) 
            {
                callback.error("Expected one non-empty string argument.",e);
            }
        } 
        else 
        {
            callback.error("Expected one non-empty string argument.");
        }
    }
}
