package p479j$.time.format;

import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p479j$.time.chrono.Chronology;

/* renamed from: j$.time.format.i */
/* loaded from: classes29.dex */
public final class C45767i implements InterfaceC45763e {

    /* renamed from: c */
    public static final ConcurrentMap f6834c = new ConcurrentHashMap(16, 0.75f, 2);

    /* renamed from: a */
    public final FormatStyle f6835a;

    /* renamed from: b */
    public final FormatStyle f6836b;

    @Override // p479j$.time.format.InterfaceC45763e
    /* renamed from: c */
    public final boolean mo3559c(C45782x c45782x, StringBuilder sb) {
        m3566a(c45782x.f6890b.f6801b, Chronology.from(c45782x.f6889a)).m3543c().mo3559c(c45782x, sb);
        return true;
    }

    public C45767i(FormatStyle formatStyle, FormatStyle formatStyle2) {
        this.f6835a = formatStyle;
        this.f6836b = formatStyle2;
    }

    @Override // p479j$.time.format.InterfaceC45763e
    /* renamed from: i */
    public final int mo3560i(C45780v c45780v, CharSequence charSequence, int i) {
        return m3566a(c45780v.f6880a.f6801b, c45780v.m3585d()).m3543c().mo3560i(c45780v, charSequence, i);
    }

    /* renamed from: a */
    public final DateTimeFormatter m3566a(Locale locale, Chronology chronology) {
        String id = chronology.getId();
        String string2 = locale.toString();
        StringBuilder sb = new StringBuilder();
        sb.append(id);
        sb.append("|");
        sb.append(string2);
        sb.append("|");
        FormatStyle formatStyle = this.f6835a;
        sb.append(formatStyle);
        FormatStyle formatStyle2 = this.f6836b;
        sb.append(formatStyle2);
        String string3 = sb.toString();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) f6834c;
        DateTimeFormatter dateTimeFormatter = (DateTimeFormatter) concurrentHashMap.get(string3);
        if (dateTimeFormatter != null) {
            return dateTimeFormatter;
        }
        String localizedDateTimePattern = DateTimeFormatterBuilder.getLocalizedDateTimePattern(formatStyle, formatStyle2, chronology, locale);
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.m3549f(localizedDateTimePattern);
        DateTimeFormatter formatter = dateTimeFormatterBuilder.toFormatter(locale);
        DateTimeFormatter dateTimeFormatter2 = (DateTimeFormatter) concurrentHashMap.putIfAbsent(string3, formatter);
        return dateTimeFormatter2 != null ? dateTimeFormatter2 : formatter;
    }

    public final String toString() {
        Object obj = this.f6835a;
        if (obj == null) {
            obj = "";
        }
        Object obj2 = this.f6836b;
        return "Localized(" + obj + "," + (obj2 != null ? obj2 : "") + ")";
    }
}
