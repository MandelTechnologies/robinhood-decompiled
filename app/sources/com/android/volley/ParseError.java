package com.android.volley;

/* loaded from: classes16.dex */
public class ParseError extends VolleyError {
    public ParseError(NetworkResponse networkResponse) {
        super(networkResponse);
    }

    public ParseError(Throwable th) {
        super(th);
    }
}
