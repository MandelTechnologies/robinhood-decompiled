package com.plaid.internal;

import com.plaid.internal.C5953R5;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.Q0 */
/* loaded from: classes16.dex */
public final class C5940Q0 implements InterfaceC5852G5 {

    /* renamed from: a */
    public final C5948R0 f1638a;

    public C5940Q0(C5948R0 embeddedWebviewUrlParser) {
        Intrinsics.checkNotNullParameter(embeddedWebviewUrlParser, "embeddedWebviewUrlParser");
        this.f1638a = embeddedWebviewUrlParser;
    }

    @Override // com.plaid.internal.InterfaceC5852G5
    /* renamed from: a */
    public final void mo1135a(AbstractC7134l4 openInterstitialMessage) {
        Intrinsics.checkNotNullParameter(openInterstitialMessage, "openInterstitialMessage");
    }

    @Override // com.plaid.internal.InterfaceC5852G5
    /* renamed from: a */
    public final boolean mo1142a(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            this.f1638a.m1298b(url);
            return true;
        } catch (Exception e) {
            C5953R5.a.m1301a(C5953R5.f1671a, e);
            return true;
        }
    }
}
