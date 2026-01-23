package org.bouncycastle.util;

/* loaded from: classes25.dex */
public class StreamParsingException extends Exception {

    /* renamed from: _e */
    Throwable f8093_e;

    public StreamParsingException(String str, Throwable th) {
        super(str);
        this.f8093_e = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f8093_e;
    }
}
