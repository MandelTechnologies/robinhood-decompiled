package com.plaid.internal;

import android.content.res.Resources;
import android.os.Build;

/* renamed from: com.plaid.internal.H4 */
/* loaded from: classes16.dex */
public final class C5860H4 implements InterfaceC5847G0 {

    /* renamed from: a */
    public static final C5860H4 f1365a = new C5860H4();

    /* renamed from: b */
    public static final String f1366b = Build.ID;

    /* renamed from: c */
    public static final String f1367c = Build.MANUFACTURER;

    /* renamed from: d */
    public static final String f1368d = Build.MODEL;

    /* renamed from: e */
    public static final String f1369e = Build.DEVICE;

    /* renamed from: f */
    public static final String f1370f = Build.TYPE;

    /* renamed from: g */
    public static final String f1371g = Build.VERSION.RELEASE;

    /* renamed from: h */
    public static final String f1372h = Build.VERSION.CODENAME;

    /* renamed from: i */
    public static final int f1373i = Build.VERSION.SDK_INT;

    /* renamed from: j */
    public static final int f1374j = Resources.getSystem().getDisplayMetrics().heightPixels;

    /* renamed from: k */
    public static final int f1375k = Resources.getSystem().getDisplayMetrics().widthPixels;

    @Override // com.plaid.internal.InterfaceC5847G0
    /* renamed from: a */
    public final String mo1200a() {
        return f1367c;
    }

    @Override // com.plaid.internal.InterfaceC5847G0
    /* renamed from: b */
    public final String mo1201b() {
        return f1368d;
    }

    @Override // com.plaid.internal.InterfaceC5847G0
    /* renamed from: c */
    public final String mo1202c() {
        return f1372h;
    }

    @Override // com.plaid.internal.InterfaceC5847G0
    /* renamed from: d */
    public final String mo1203d() {
        return f1370f;
    }

    @Override // com.plaid.internal.InterfaceC5847G0
    /* renamed from: e */
    public final String mo1204e() {
        return f1371g;
    }

    @Override // com.plaid.internal.InterfaceC5847G0
    /* renamed from: f */
    public final int mo1205f() {
        return f1373i;
    }

    @Override // com.plaid.internal.InterfaceC5847G0
    /* renamed from: g */
    public final String mo1206g() {
        return f1369e;
    }

    @Override // com.plaid.internal.InterfaceC5847G0
    public final String getId() {
        return f1366b;
    }
}
