package com.plaid.internal;

import android.util.Log;

/* renamed from: com.plaid.internal.T3 */
/* loaded from: classes16.dex */
public final class C5969T3 {

    /* renamed from: a */
    public static final EnumC5943Q3 f1714a;

    /* renamed from: b */
    public static final InterfaceC5951R3 f1715b;

    /* renamed from: c */
    public static final a f1716c;

    /* renamed from: com.plaid.internal.T3$b */
    public class b {
    }

    static {
        C5912N c5912n = new C5912N();
        f1714a = EnumC5943Q3.INFO;
        f1715b = c5912n;
        f1716c = new a();
    }

    /* renamed from: com.plaid.internal.T3$a */
    public class a implements InterfaceC5951R3 {
        @Override // com.plaid.internal.InterfaceC5951R3
        /* renamed from: a */
        public final void mo1260a(EnumC5943Q3 enumC5943Q3, String str) {
            try {
                C5969T3.f1715b.mo1260a(enumC5943Q3, str);
            } catch (Exception e) {
                Log.e("ProveSDK", "log writer error!", e);
            }
        }

        @Override // com.plaid.internal.InterfaceC5951R3
        /* renamed from: a */
        public final void mo1261a(EnumC5943Q3 enumC5943Q3, String str, Exception exc) {
            try {
                C5969T3.f1715b.mo1261a(enumC5943Q3, str, exc);
            } catch (Exception e) {
                Log.e("ProveSDK", "log writer error!", e);
            }
        }
    }
}
