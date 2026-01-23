package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.play.integrity.internal.C5190ax;
import com.google.android.play.integrity.internal.C5192az;
import com.google.android.play.integrity.internal.InterfaceC5191ay;
import com.google.android.play.integrity.internal.InterfaceC5195bb;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* renamed from: com.google.android.play.core.integrity.s */
/* loaded from: classes27.dex */
final class C5156s {

    /* renamed from: a */
    private final InterfaceC5195bb f794a;

    /* renamed from: b */
    private final InterfaceC5195bb f795b;

    /* renamed from: c */
    private final InterfaceC5195bb f796c;

    /* renamed from: d */
    private final InterfaceC5195bb f797d;

    /* renamed from: e */
    private final InterfaceC5195bb f798e;

    /* synthetic */ C5156s(Context context, C5155r c5155r) {
        InterfaceC5191ay interfaceC5191ayM964b = C5192az.m964b(context);
        this.f794a = interfaceC5191ayM964b;
        InterfaceC5195bb interfaceC5195bbM963b = C5190ax.m963b(C5091ac.f685a);
        this.f795b = interfaceC5195bbM963b;
        C5109au c5109au = new C5109au(interfaceC5191ayM964b, C5147l.f787a);
        this.f796c = c5109au;
        InterfaceC5195bb interfaceC5195bbM963b2 = C5190ax.m963b(new C5100al(interfaceC5191ayM964b, interfaceC5195bbM963b, c5109au, C5147l.f787a));
        this.f797d = interfaceC5195bbM963b2;
        this.f798e = C5190ax.m963b(new C5090ab(interfaceC5195bbM963b2));
    }

    /* renamed from: a */
    public final IntegrityManager m909a() {
        return (IntegrityManager) this.f798e.mo857a();
    }
}
