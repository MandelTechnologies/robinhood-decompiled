package com.plaid.internal;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.W3 */
/* loaded from: classes16.dex */
public final class C5996W3 implements InterfaceC5852G5 {

    /* renamed from: a */
    public InterfaceC5852G5 f1800a;

    @Override // com.plaid.internal.InterfaceC5852G5
    /* renamed from: a */
    public final boolean mo1142a(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        InterfaceC5852G5 interfaceC5852G5 = this.f1800a;
        if (interfaceC5852G5 != null) {
            return interfaceC5852G5.mo1142a(url);
        }
        return false;
    }

    @Override // com.plaid.internal.InterfaceC5852G5
    /* renamed from: a */
    public final void mo1135a(AbstractC7134l4 openInterstitialMessage) {
        Intrinsics.checkNotNullParameter(openInterstitialMessage, "openInterstitialMessage");
        InterfaceC5852G5 interfaceC5852G5 = this.f1800a;
        if (interfaceC5852G5 != null) {
            interfaceC5852G5.mo1135a(openInterstitialMessage);
        }
    }
}
