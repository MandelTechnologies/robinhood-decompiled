package com.adjust.sdk.sig;

import android.content.Context;
import android.util.Log;

/* loaded from: classes16.dex */
class NativeLibHelper implements InterfaceC4749a {
    static {
        try {
            System.loadLibrary("signer");
        } catch (UnsatisfiedLinkError e) {
            Log.e("NativeLibHelper", "Signer Library could not be loaded: " + e.getMessage());
        }
    }

    private native void nOnResume();

    private native byte[] nSign(Context context, Object obj, byte[] bArr, int i);

    /* renamed from: a */
    public final void m759a() {
        nOnResume();
    }

    /* renamed from: a */
    public final byte[] m760a(Context context, Object obj, byte[] bArr, int i) {
        return nSign(context, obj, bArr, i);
    }
}
