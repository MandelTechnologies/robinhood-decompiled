package p479j$.time.format;

import java.lang.ref.SoftReference;
import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import p479j$.time.Instant;
import p479j$.time.LocalDate;
import p479j$.time.LocalDateTime;
import p479j$.time.LocalTime;
import p479j$.time.ZoneId;
import p479j$.time.ZoneOffset;
import p479j$.time.temporal.ChronoField;
import p479j$.time.temporal.TemporalAccessor;
import p479j$.time.temporal.TemporalQueries;
import p479j$.time.zone.C45809b;
import p479j$.time.zone.C45815h;

/* renamed from: j$.time.format.u */
/* loaded from: classes29.dex */
public final class C45779u extends C45778t {

    /* renamed from: i */
    public static final Map f6875i = new ConcurrentHashMap();

    /* renamed from: e */
    public final TextStyle f6876e;

    /* renamed from: f */
    public final boolean f6877f;

    /* renamed from: g */
    public final Map f6878g;

    /* renamed from: h */
    public final Map f6879h;

    public C45779u(TextStyle textStyle, boolean z) {
        super(TemporalQueries.f6928e, "ZoneText(" + textStyle + ")");
        this.f6878g = new HashMap();
        this.f6879h = new HashMap();
        Objects.requireNonNull(textStyle, "textStyle");
        this.f6876e = textStyle;
        this.f6877f = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f4  */
    @Override // p479j$.time.format.C45778t, p479j$.time.format.InterfaceC45763e
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo3559c(C45782x c45782x, StringBuilder sb) {
        boolean zM3624f;
        TextStyle textStyle;
        TextStyle textStyle2;
        String[] strArr;
        ZoneId zoneId = (ZoneId) c45782x.m3591b(TemporalQueries.f6924a);
        if (zoneId == null) {
            return false;
        }
        String id = zoneId.getId();
        if (!(zoneId instanceof ZoneOffset)) {
            TemporalAccessor temporalAccessor = c45782x.f6889a;
            String str = null;
            Map concurrentHashMap = null;
            if (this.f6877f) {
                zM3624f = 2;
                Locale locale = c45782x.f6890b.f6801b;
                textStyle = TextStyle.NARROW;
                textStyle2 = this.f6876e;
                if (textStyle2 != textStyle) {
                    ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) f6875i;
                    SoftReference softReference = (SoftReference) concurrentHashMap2.get(id);
                    if (softReference == null || (concurrentHashMap = (Map) softReference.get()) == null || (strArr = (String[]) concurrentHashMap.get(locale)) == null) {
                        TimeZone timeZone = TimeZone.getTimeZone(id);
                        String[] strArr2 = {id, timeZone.getDisplayName(false, 1, locale), timeZone.getDisplayName(false, 0, locale), timeZone.getDisplayName(true, 1, locale), timeZone.getDisplayName(true, 0, locale), id, id};
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        concurrentHashMap.put(locale, strArr2);
                        concurrentHashMap2.put(id, new SoftReference(concurrentHashMap));
                        strArr = strArr2;
                    }
                    if (!zM3624f) {
                        str = strArr[textStyle2.f6824a + 1];
                    } else if (zM3624f) {
                        str = strArr[textStyle2.f6824a + 3];
                    } else {
                        str = strArr[textStyle2.f6824a + 5];
                    }
                }
                if (str != null) {
                    id = str;
                }
            } else {
                if (temporalAccessor.isSupported(ChronoField.INSTANT_SECONDS)) {
                    zM3624f = zoneId.getRules().m3624f(Instant.from(temporalAccessor));
                } else {
                    ChronoField chronoField = ChronoField.EPOCH_DAY;
                    if (temporalAccessor.isSupported(chronoField)) {
                        ChronoField chronoField2 = ChronoField.NANO_OF_DAY;
                        if (temporalAccessor.isSupported(chronoField2)) {
                            LocalDateTime localDateTimeAtTime = LocalDate.ofEpochDay(temporalAccessor.getLong(chronoField)).atTime(LocalTime.m3407k(temporalAccessor.getLong(chronoField2)));
                            Object objM3622d = zoneId.getRules().m3622d(localDateTimeAtTime);
                            if ((objM3622d instanceof C45809b ? (C45809b) objM3622d : null) == null) {
                                zM3624f = zoneId.getRules().m3624f(localDateTimeAtTime.mo3396g(zoneId).toInstant());
                            }
                        }
                    }
                }
                Locale locale2 = c45782x.f6890b.f6801b;
                textStyle = TextStyle.NARROW;
                textStyle2 = this.f6876e;
                if (textStyle2 != textStyle) {
                }
                if (str != null) {
                }
            }
        }
        sb.append(id);
        return true;
    }

    @Override // p479j$.time.format.C45778t
    /* renamed from: a */
    public final C45772n mo3581a(C45780v c45780v) {
        C45772n c45772n;
        if (this.f6876e == TextStyle.NARROW) {
            return super.mo3581a(c45780v);
        }
        Locale locale = c45780v.f6880a.f6801b;
        boolean z = c45780v.f6881b;
        Set set = C45815h.f7000d;
        int size = set.size();
        Map map = z ? this.f6878g : this.f6879h;
        Map.Entry entry = (Map.Entry) map.get(locale);
        if (entry != null && ((Integer) entry.getKey()).intValue() == size && (c45772n = (C45772n) ((SoftReference) entry.getValue()).get()) != null) {
            return c45772n;
        }
        C45772n c45772n2 = c45780v.f6881b ? new C45772n("", null, null) : new C45771m("", null, null);
        for (String[] strArr : DateFormatSymbols.getInstance(locale).getZoneStrings()) {
            String str = strArr[0];
            if (set.contains(str)) {
                c45772n2.m3577a(str, str);
                HashMap map2 = (HashMap) AbstractC45758C.f6793d;
                String str2 = (String) map2.get(str);
                if (str2 == null) {
                    HashMap map3 = (HashMap) AbstractC45758C.f6796g;
                    if (map3.containsKey(str)) {
                        str = (String) map3.get(str);
                        str2 = (String) map2.get(str);
                    }
                }
                if (str2 != null) {
                    Map map4 = (Map) ((HashMap) AbstractC45758C.f6795f).get(str2);
                    str = (map4 == null || !map4.containsKey(locale.getCountry())) ? (String) ((HashMap) AbstractC45758C.f6794e).get(str2) : (String) map4.get(locale.getCountry());
                }
                HashMap map5 = (HashMap) AbstractC45758C.f6796g;
                if (map5.containsKey(str)) {
                    str = (String) map5.get(str);
                }
                for (int i = this.f6876e == TextStyle.FULL ? 1 : 2; i < strArr.length; i += 2) {
                    c45772n2.m3577a(strArr[i], str);
                }
            }
        }
        map.put(locale, new AbstractMap.SimpleImmutableEntry(Integer.valueOf(size), new SoftReference(c45772n2)));
        return c45772n2;
    }
}
