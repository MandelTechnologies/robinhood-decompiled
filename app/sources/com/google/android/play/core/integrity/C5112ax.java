package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.play.integrity.internal.C5173ag;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* renamed from: com.google.android.play.core.integrity.ax */
/* loaded from: classes27.dex */
final class C5112ax {

    /* renamed from: a */
    private static InterfaceC5111aw f729a;

    /* renamed from: a */
    static synchronized InterfaceC5111aw m877a(Context context) {
        try {
            if (f729a == null) {
                C5158u c5158u = new C5158u(null);
                c5158u.m910a(C5173ag.m940a(context));
                f729a = c5158u.mo875b();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f729a;
    }
}
