package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.play.integrity.internal.C5213s;
import com.google.android.play.integrity.internal.InterfaceC5191ay;
import com.google.android.play.integrity.internal.InterfaceC5196bd;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* renamed from: com.google.android.play.core.integrity.bp */
/* loaded from: classes27.dex */
public final class C5131bp implements InterfaceC5191ay {

    /* renamed from: a */
    private final InterfaceC5196bd f770a;

    /* renamed from: b */
    private final InterfaceC5196bd f771b;

    /* renamed from: c */
    private final InterfaceC5196bd f772c;

    public C5131bp(InterfaceC5196bd interfaceC5196bd, InterfaceC5196bd interfaceC5196bd2, InterfaceC5196bd interfaceC5196bd3, InterfaceC5196bd interfaceC5196bd4) {
        this.f770a = interfaceC5196bd;
        this.f771b = interfaceC5196bd2;
        this.f772c = interfaceC5196bd3;
    }

    @Override // com.google.android.play.integrity.internal.InterfaceC5196bd
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo857a() {
        return new C5129bn((Context) this.f770a.mo857a(), (C5213s) this.f771b.mo857a(), ((C5109au) this.f772c).mo857a(), new C5145j());
    }
}
