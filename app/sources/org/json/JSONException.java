package org.json;

/* loaded from: classes25.dex */
public class JSONException extends RuntimeException {
    public JSONException(String str) {
        super(str);
    }

    public JSONException(String str, Throwable th) {
        super(str, th);
    }

    public JSONException(Throwable th) {
        super(th.getMessage(), th);
    }
}
