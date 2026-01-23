package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.play.integrity.internal.C5190ax;
import com.google.android.play.integrity.internal.C5192az;
import com.google.android.play.integrity.internal.InterfaceC5191ay;
import com.google.android.play.integrity.internal.InterfaceC5195bb;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* renamed from: com.google.android.play.core.integrity.w */
/* loaded from: classes27.dex */
final class C5160w implements InterfaceC5111aw {

    /* renamed from: a */
    private final InterfaceC5195bb f800a;

    /* renamed from: b */
    private final InterfaceC5195bb f801b;

    /* renamed from: c */
    private final InterfaceC5195bb f802c;

    /* renamed from: d */
    private final InterfaceC5195bb f803d;

    /* renamed from: e */
    private final InterfaceC5195bb f804e;

    /* renamed from: f */
    private final InterfaceC5195bb f805f;

    /* synthetic */ C5160w(Context context, C5159v c5159v) {
        InterfaceC5191ay interfaceC5191ayM964b = C5192az.m964b(context);
        this.f800a = interfaceC5191ayM964b;
        InterfaceC5195bb interfaceC5195bbM963b = C5190ax.m963b(C5117bb.f738a);
        this.f801b = interfaceC5195bbM963b;
        C5109au c5109au = new C5109au(interfaceC5191ayM964b, C5151n.f792a);
        this.f802c = c5109au;
        InterfaceC5195bb interfaceC5195bbM963b2 = C5190ax.m963b(new C5131bp(interfaceC5191ayM964b, interfaceC5195bbM963b, c5109au, C5151n.f792a));
        this.f803d = interfaceC5195bbM963b2;
        InterfaceC5195bb interfaceC5195bbM963b3 = C5190ax.m963b(new C5136bu(interfaceC5195bbM963b2));
        this.f804e = interfaceC5195bbM963b3;
        this.f805f = C5190ax.m963b(new C5116ba(interfaceC5195bbM963b2, interfaceC5195bbM963b3));
    }

    @Override // com.google.android.play.core.integrity.InterfaceC5111aw
    /* renamed from: a */
    public final StandardIntegrityManager mo876a() {
        return (StandardIntegrityManager) this.f805f.mo857a();
    }
}
