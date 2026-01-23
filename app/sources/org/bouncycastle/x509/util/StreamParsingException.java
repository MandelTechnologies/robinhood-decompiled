package org.bouncycastle.x509.util;

/* loaded from: classes25.dex */
public class StreamParsingException extends Exception {

    /* renamed from: _e */
    Throwable f8095_e;

    public StreamParsingException(String str, Throwable th) {
        super(str);
        this.f8095_e = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f8095_e;
    }
}
