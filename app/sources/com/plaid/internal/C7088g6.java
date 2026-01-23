package com.plaid.internal;

import android.content.Context;
import com.plaid.internal.C5835E6;
import com.plaid.internal.C5953R5;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.g6 */
/* loaded from: classes16.dex */
public final class C7088g6 {

    /* renamed from: a */
    public final ExecutorService f2808a;

    /* renamed from: b */
    public final C5990V6 f2809b;

    /* renamed from: c */
    public final C7118j6 f2810c;

    /* renamed from: d */
    public final C7098h6 f2811d;

    public C7088g6(Context context, InterfaceC5910M6 snaApi) {
        Intrinsics.checkNotNullParameter(snaApi, "snaApi");
        this.f2808a = Executors.newSingleThreadExecutor();
        C7118j6 c7118j6 = new C7118j6(snaApi);
        this.f2810c = c7118j6;
        C7098h6 c7098h6 = new C7098h6(snaApi);
        this.f2811d = c7098h6;
        C7066e4 c7066e4 = new C7066e4(context);
        C5820D0 c5820d0 = new C5820D0(context);
        C7228v0 c7228v0 = new C7228v0(new C7219u0(c7066e4, EnumC6053c4.CELLULAR, new C5981U6(), new C7201s0()));
        C7192r0 c7192r0 = new C7192r0();
        C5990V6 c5990v6 = new C5990V6(new C7164o(new C7089g7(), c7228v0, new C7210t0(), c7118j6, c7192r0, c7098h6), c5820d0);
        Intrinsics.checkNotNullExpressionValue(c5990v6, "build(...)");
        this.f2809b = c5990v6;
    }

    /* renamed from: a */
    public final void m1512a(final C7108i6 proveSnaSessionInfo) {
        Intrinsics.checkNotNullParameter(proveSnaSessionInfo, "proveSnaSessionInfo");
        this.f2808a.submit(new Runnable() { // from class: com.plaid.internal.g6$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C7088g6.m1511a(this.f$0, proveSnaSessionInfo);
            }
        });
    }

    /* renamed from: a */
    public static final void m1511a(C7088g6 this$0, C7108i6 proveSnaSessionInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(proveSnaSessionInfo, "$proveSnaSessionInfo");
        try {
            this$0.f2809b.m1334b();
            String strM1531a = proveSnaSessionInfo.m1531a();
            this$0.f2810c.f2881b = strM1531a;
            this$0.f2811d.f2840b = strM1531a;
            try {
                try {
                    this$0.f2809b.m1332a();
                    C5953R5.a.m1299a(C5953R5.f1671a, "Prove SNA success");
                    this$0.f2810c.f2881b = null;
                } catch (Exception e) {
                    C5835E6.a.m1187a("Prove SNA failure - exception: " + e);
                    this$0.f2810c.f2881b = null;
                }
                this$0.f2811d.f2840b = null;
            } catch (Throwable th) {
                this$0.f2810c.f2881b = null;
                this$0.f2811d.f2840b = null;
                throw th;
            }
        } catch (Exception e2) {
            C5835E6.a.m1187a("Prove SNA authentication is not possible- exception: " + e2);
        }
    }
}
