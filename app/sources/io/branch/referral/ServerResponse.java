package io.branch.referral;

import org.json.JSONObject;

/* loaded from: classes21.dex */
public class ServerResponse {
    private Object post_;
    private String requestId_;
    private int statusCode_;
    private String tag_;

    public ServerResponse(String str, int i, String str2) {
        this.tag_ = str;
        this.statusCode_ = i;
        this.requestId_ = str2;
    }

    public int getStatusCode() {
        return this.statusCode_;
    }

    public void setPost(Object obj) {
        this.post_ = obj;
    }

    public JSONObject getObject() {
        Object obj = this.post_;
        if (obj instanceof JSONObject) {
            return (JSONObject) obj;
        }
        return new JSONObject();
    }

    public String getFailReason() {
        String string2 = "";
        try {
            JSONObject object = getObject();
            if (object != null && object.has("error") && object.getJSONObject("error").has("message") && (string2 = object.getJSONObject("error").getString("message")) != null && string2.trim().length() > 0) {
                return string2 + ".";
            }
        } catch (Exception unused) {
        }
        return string2;
    }
}
