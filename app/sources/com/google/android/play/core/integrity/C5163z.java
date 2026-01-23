package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.play.integrity.internal.C5173ag;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* renamed from: com.google.android.play.core.integrity.z */
/* loaded from: classes27.dex */
final class C5163z {

    /* renamed from: a */
    private static C5156s f811a;

    /* renamed from: a */
    static synchronized C5156s m912a(Context context) {
        try {
            if (f811a == null) {
                C5154q c5154q = new C5154q(null);
                c5154q.m907a(C5173ag.m940a(context));
                f811a = c5154q.mo908b();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f811a;
    }
}
