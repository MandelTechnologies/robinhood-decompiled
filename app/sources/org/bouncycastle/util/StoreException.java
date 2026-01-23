package org.bouncycastle.util;

/* loaded from: classes25.dex */
public class StoreException extends RuntimeException {

    /* renamed from: _e */
    private Throwable f8092_e;

    public StoreException(String str, Throwable th) {
        super(str);
        this.f8092_e = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f8092_e;
    }
}
