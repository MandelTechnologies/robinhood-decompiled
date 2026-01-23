package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.play.integrity.internal.C5213s;
import com.google.android.play.integrity.internal.InterfaceC5191ay;
import com.google.android.play.integrity.internal.InterfaceC5196bd;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* renamed from: com.google.android.play.core.integrity.al */
/* loaded from: classes27.dex */
public final class C5100al implements InterfaceC5191ay {

    /* renamed from: a */
    private final InterfaceC5196bd f708a;

    /* renamed from: b */
    private final InterfaceC5196bd f709b;

    /* renamed from: c */
    private final InterfaceC5196bd f710c;

    public C5100al(InterfaceC5196bd interfaceC5196bd, InterfaceC5196bd interfaceC5196bd2, InterfaceC5196bd interfaceC5196bd3, InterfaceC5196bd interfaceC5196bd4) {
        this.f708a = interfaceC5196bd;
        this.f709b = interfaceC5196bd2;
        this.f710c = interfaceC5196bd3;
    }

    @Override // com.google.android.play.integrity.internal.InterfaceC5196bd
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo857a() {
        return new C5098aj((Context) this.f708a.mo857a(), (C5213s) this.f709b.mo857a(), ((C5109au) this.f710c).mo857a(), new C5144i());
    }
}
