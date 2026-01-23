package p479j$.time.format;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p479j$.time.chrono.Chronology;
import p479j$.time.temporal.TemporalField;

/* renamed from: j$.time.format.a */
/* loaded from: classes29.dex */
public final class C45759a extends C45756A {

    /* renamed from: d */
    public final /* synthetic */ C45784z f6825d;

    public C45759a(C45784z c45784z) {
        this.f6825d = c45784z;
    }

    @Override // p479j$.time.format.C45756A
    /* renamed from: c */
    public final String mo3529c(Chronology chronology, TemporalField temporalField, long j, TextStyle textStyle, Locale locale) {
        return this.f6825d.m3592a(j, textStyle);
    }

    @Override // p479j$.time.format.C45756A
    /* renamed from: d */
    public final String mo3530d(TemporalField temporalField, long j, TextStyle textStyle, Locale locale) {
        return this.f6825d.m3592a(j, textStyle);
    }

    @Override // p479j$.time.format.C45756A
    /* renamed from: e */
    public final Iterator mo3531e(Chronology chronology, TemporalField temporalField, TextStyle textStyle, Locale locale) {
        List list = (List) ((HashMap) this.f6825d.f6893b).get(textStyle);
        if (list != null) {
            return list.iterator();
        }
        return null;
    }

    @Override // p479j$.time.format.C45756A
    /* renamed from: f */
    public final Iterator mo3532f(TemporalField temporalField, TextStyle textStyle, Locale locale) {
        List list = (List) ((HashMap) this.f6825d.f6893b).get(textStyle);
        if (list != null) {
            return list.iterator();
        }
        return null;
    }
}
