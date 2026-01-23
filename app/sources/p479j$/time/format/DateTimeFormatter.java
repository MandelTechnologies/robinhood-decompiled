package p479j$.time.format;

import java.io.IOException;
import java.text.ParsePosition;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import p479j$.time.C45754e;
import p479j$.time.DateTimeException;
import p479j$.time.LocalTime;
import p479j$.time.Period;
import p479j$.time.ZoneId;
import p479j$.time.ZoneOffset;
import p479j$.time.chrono.ChronoLocalDate;
import p479j$.time.chrono.ChronoLocalDateTime;
import p479j$.time.chrono.ChronoZonedDateTime;
import p479j$.time.chrono.Chronology;
import p479j$.time.chrono.IsoChronology;
import p479j$.time.temporal.ChronoField;
import p479j$.time.temporal.IsoFields;
import p479j$.time.temporal.TemporalAccessor;
import p479j$.time.temporal.TemporalAmount;
import p479j$.time.temporal.TemporalField;
import p479j$.time.temporal.TemporalQuery;

/* loaded from: classes29.dex */
public final class DateTimeFormatter {
    public static final DateTimeFormatter ISO_INSTANT;
    public static final DateTimeFormatter ISO_LOCAL_DATE;
    public static final DateTimeFormatter ISO_OFFSET_DATE_TIME;

    /* renamed from: g */
    public static final DateTimeFormatter f6797g;

    /* renamed from: h */
    public static final DateTimeFormatter f6798h;

    /* renamed from: i */
    public static final DateTimeFormatter f6799i;

    /* renamed from: a */
    public final C45762d f6800a;

    /* renamed from: b */
    public final Locale f6801b;

    /* renamed from: c */
    public final DecimalStyle f6802c;

    /* renamed from: d */
    public final ResolverStyle f6803d;

    /* renamed from: e */
    public final Chronology f6804e;

    /* renamed from: f */
    public final ZoneId f6805f;

    public static DateTimeFormatter ofPattern(String str) {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.m3549f(str);
        return dateTimeFormatterBuilder.toFormatter();
    }

    public static DateTimeFormatter ofPattern(String str, Locale locale) {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.m3549f(str);
        return dateTimeFormatterBuilder.toFormatter(locale);
    }

    public static DateTimeFormatter ofLocalizedDate(FormatStyle formatStyle) {
        Objects.requireNonNull(formatStyle, "dateStyle");
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.m3546c(new C45767i(formatStyle, null));
        return dateTimeFormatterBuilder.m3555l(ResolverStyle.SMART, IsoChronology.INSTANCE);
    }

    public static DateTimeFormatter ofLocalizedTime(FormatStyle formatStyle) {
        Objects.requireNonNull(formatStyle, "timeStyle");
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.m3546c(new C45767i(null, formatStyle));
        return dateTimeFormatterBuilder.m3555l(ResolverStyle.SMART, IsoChronology.INSTANCE);
    }

    static {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        ChronoField chronoField = ChronoField.YEAR;
        SignStyle signStyle = SignStyle.EXCEEDS_PAD;
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendLiteral = dateTimeFormatterBuilder.appendValue(chronoField, 4, 10, signStyle).appendLiteral('-');
        ChronoField chronoField2 = ChronoField.MONTH_OF_YEAR;
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendLiteral2 = dateTimeFormatterBuilderAppendLiteral.appendValue(chronoField2, 2).appendLiteral('-');
        ChronoField chronoField3 = ChronoField.DAY_OF_MONTH;
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendValue = dateTimeFormatterBuilderAppendLiteral2.appendValue(chronoField3, 2);
        ResolverStyle resolverStyle = ResolverStyle.STRICT;
        IsoChronology isoChronology = IsoChronology.INSTANCE;
        DateTimeFormatter dateTimeFormatterM3555l = dateTimeFormatterBuilderAppendValue.m3555l(resolverStyle, isoChronology);
        ISO_LOCAL_DATE = dateTimeFormatterM3555l;
        DateTimeFormatterBuilder caseInsensitive = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive.m3544a(dateTimeFormatterM3555l);
        caseInsensitive.appendOffsetId().m3555l(resolverStyle, isoChronology);
        DateTimeFormatterBuilder caseInsensitive2 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive2.m3544a(dateTimeFormatterM3555l);
        caseInsensitive2.m3554k();
        caseInsensitive2.appendOffsetId().m3555l(resolverStyle, isoChronology);
        DateTimeFormatterBuilder dateTimeFormatterBuilder2 = new DateTimeFormatterBuilder();
        ChronoField chronoField4 = ChronoField.HOUR_OF_DAY;
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendLiteral3 = dateTimeFormatterBuilder2.appendValue(chronoField4, 2).appendLiteral(':');
        ChronoField chronoField5 = ChronoField.MINUTE_OF_HOUR;
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendValue2 = dateTimeFormatterBuilderAppendLiteral3.appendValue(chronoField5, 2);
        dateTimeFormatterBuilderAppendValue2.m3554k();
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendLiteral4 = dateTimeFormatterBuilderAppendValue2.appendLiteral(':');
        ChronoField chronoField6 = ChronoField.SECOND_OF_MINUTE;
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendValue3 = dateTimeFormatterBuilderAppendLiteral4.appendValue(chronoField6, 2);
        dateTimeFormatterBuilderAppendValue3.m3554k();
        dateTimeFormatterBuilderAppendValue3.m3545b(ChronoField.NANO_OF_SECOND, 0, 9, true);
        DateTimeFormatter dateTimeFormatterM3555l2 = dateTimeFormatterBuilderAppendValue3.m3555l(resolverStyle, null);
        f6797g = dateTimeFormatterM3555l2;
        DateTimeFormatterBuilder caseInsensitive3 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive3.m3544a(dateTimeFormatterM3555l2);
        caseInsensitive3.appendOffsetId().m3555l(resolverStyle, null);
        DateTimeFormatterBuilder caseInsensitive4 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive4.m3544a(dateTimeFormatterM3555l2);
        caseInsensitive4.m3554k();
        caseInsensitive4.appendOffsetId().m3555l(resolverStyle, null);
        DateTimeFormatterBuilder caseInsensitive5 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive5.m3544a(dateTimeFormatterM3555l);
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendLiteral5 = caseInsensitive5.appendLiteral('T');
        dateTimeFormatterBuilderAppendLiteral5.m3544a(dateTimeFormatterM3555l2);
        DateTimeFormatter dateTimeFormatterM3555l3 = dateTimeFormatterBuilderAppendLiteral5.m3555l(resolverStyle, isoChronology);
        f6798h = dateTimeFormatterM3555l3;
        DateTimeFormatterBuilder caseInsensitive6 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive6.m3544a(dateTimeFormatterM3555l3);
        EnumC45775q enumC45775q = EnumC45775q.LENIENT;
        caseInsensitive6.m3546c(enumC45775q);
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendOffsetId = caseInsensitive6.appendOffsetId();
        EnumC45775q enumC45775q2 = EnumC45775q.STRICT;
        dateTimeFormatterBuilderAppendOffsetId.m3546c(enumC45775q2);
        DateTimeFormatter dateTimeFormatterM3555l4 = dateTimeFormatterBuilderAppendOffsetId.m3555l(resolverStyle, isoChronology);
        ISO_OFFSET_DATE_TIME = dateTimeFormatterM3555l4;
        DateTimeFormatterBuilder dateTimeFormatterBuilder3 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder3.m3544a(dateTimeFormatterM3555l4);
        dateTimeFormatterBuilder3.m3554k();
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendLiteral6 = dateTimeFormatterBuilder3.appendLiteral('[');
        EnumC45775q enumC45775q3 = EnumC45775q.SENSITIVE;
        dateTimeFormatterBuilderAppendLiteral6.m3546c(enumC45775q3);
        C45754e c45754e = DateTimeFormatterBuilder.f6806h;
        dateTimeFormatterBuilderAppendLiteral6.m3546c(new C45778t(c45754e, "ZoneRegionId()"));
        f6799i = dateTimeFormatterBuilderAppendLiteral6.appendLiteral(']').m3555l(resolverStyle, isoChronology);
        DateTimeFormatterBuilder dateTimeFormatterBuilder4 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder4.m3544a(dateTimeFormatterM3555l3);
        dateTimeFormatterBuilder4.m3554k();
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendOffsetId2 = dateTimeFormatterBuilder4.appendOffsetId();
        dateTimeFormatterBuilderAppendOffsetId2.m3554k();
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendLiteral7 = dateTimeFormatterBuilderAppendOffsetId2.appendLiteral('[');
        dateTimeFormatterBuilderAppendLiteral7.m3546c(enumC45775q3);
        dateTimeFormatterBuilderAppendLiteral7.m3546c(new C45778t(c45754e, "ZoneRegionId()"));
        dateTimeFormatterBuilderAppendLiteral7.appendLiteral(']').m3555l(resolverStyle, isoChronology);
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendValue4 = new DateTimeFormatterBuilder().parseCaseInsensitive().appendValue(chronoField, 4, 10, signStyle).appendLiteral('-').appendValue(ChronoField.DAY_OF_YEAR, 3);
        dateTimeFormatterBuilderAppendValue4.m3554k();
        dateTimeFormatterBuilderAppendValue4.appendOffsetId().m3555l(resolverStyle, isoChronology);
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendValue5 = new DateTimeFormatterBuilder().parseCaseInsensitive().appendValue(IsoFields.f6922b, 4, 10, signStyle);
        dateTimeFormatterBuilderAppendValue5.m3547d("-W");
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendLiteral8 = dateTimeFormatterBuilderAppendValue5.appendValue(IsoFields.f6921a, 2).appendLiteral('-');
        ChronoField chronoField7 = ChronoField.DAY_OF_WEEK;
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendValue6 = dateTimeFormatterBuilderAppendLiteral8.appendValue(chronoField7, 1);
        dateTimeFormatterBuilderAppendValue6.m3554k();
        dateTimeFormatterBuilderAppendValue6.appendOffsetId().m3555l(resolverStyle, isoChronology);
        DateTimeFormatterBuilder caseInsensitive7 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive7.getClass();
        caseInsensitive7.m3546c(new C45765g(-2));
        ISO_INSTANT = caseInsensitive7.m3555l(resolverStyle, null);
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendValue7 = new DateTimeFormatterBuilder().parseCaseInsensitive().appendValue(chronoField, 4).appendValue(chronoField2, 2).appendValue(chronoField3, 2);
        dateTimeFormatterBuilderAppendValue7.m3554k();
        dateTimeFormatterBuilderAppendValue7.m3546c(enumC45775q);
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendOffset = dateTimeFormatterBuilderAppendValue7.appendOffset("+HHMMss", "Z");
        dateTimeFormatterBuilderAppendOffset.m3546c(enumC45775q2);
        dateTimeFormatterBuilderAppendOffset.m3555l(resolverStyle, isoChronology);
        HashMap map = new HashMap();
        map.put(1L, "Mon");
        map.put(2L, "Tue");
        map.put(3L, "Wed");
        map.put(4L, "Thu");
        map.put(5L, "Fri");
        map.put(6L, "Sat");
        map.put(7L, "Sun");
        HashMap map2 = new HashMap();
        map2.put(1L, "Jan");
        map2.put(2L, "Feb");
        map2.put(3L, "Mar");
        map2.put(4L, "Apr");
        map2.put(5L, "May");
        map2.put(6L, "Jun");
        map2.put(7L, "Jul");
        map2.put(8L, "Aug");
        map2.put(9L, "Sep");
        map2.put(10L, "Oct");
        map2.put(11L, "Nov");
        map2.put(12L, "Dec");
        DateTimeFormatterBuilder caseInsensitive8 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive8.m3546c(enumC45775q);
        caseInsensitive8.m3554k();
        caseInsensitive8.m3550g(chronoField7, map);
        caseInsensitive8.m3547d(", ");
        caseInsensitive8.m3553j();
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendLiteral9 = caseInsensitive8.appendValue(chronoField3, 1, 2, SignStyle.NOT_NEGATIVE).appendLiteral(' ');
        dateTimeFormatterBuilderAppendLiteral9.m3550g(chronoField2, map2);
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendValue8 = dateTimeFormatterBuilderAppendLiteral9.appendLiteral(' ').appendValue(chronoField, 4).appendLiteral(' ').appendValue(chronoField4, 2).appendLiteral(':').appendValue(chronoField5, 2);
        dateTimeFormatterBuilderAppendValue8.m3554k();
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendValue9 = dateTimeFormatterBuilderAppendValue8.appendLiteral(':').appendValue(chronoField6, 2);
        dateTimeFormatterBuilderAppendValue9.m3553j();
        dateTimeFormatterBuilderAppendValue9.appendLiteral(' ').appendOffset("+HHMM", "GMT").m3555l(ResolverStyle.SMART, isoChronology);
    }

    public DateTimeFormatter(C45762d c45762d, Locale locale, DecimalStyle decimalStyle, ResolverStyle resolverStyle, Chronology chronology, ZoneId zoneId) {
        Objects.requireNonNull(c45762d, "printerParser");
        this.f6800a = c45762d;
        Objects.requireNonNull(locale, "locale");
        this.f6801b = locale;
        Objects.requireNonNull(decimalStyle, "decimalStyle");
        this.f6802c = decimalStyle;
        Objects.requireNonNull(resolverStyle, "resolverStyle");
        this.f6803d = resolverStyle;
        this.f6804e = chronology;
        this.f6805f = zoneId;
    }

    public DateTimeFormatter withLocale(Locale locale) {
        if (this.f6801b.equals(locale)) {
            return this;
        }
        return new DateTimeFormatter(this.f6800a, locale, this.f6802c, this.f6803d, this.f6804e, this.f6805f);
    }

    public DateTimeFormatter withDecimalStyle(DecimalStyle decimalStyle) {
        if (this.f6802c.equals(decimalStyle)) {
            return this;
        }
        return new DateTimeFormatter(this.f6800a, this.f6801b, decimalStyle, this.f6803d, this.f6804e, this.f6805f);
    }

    public DateTimeFormatter withZone(ZoneId zoneId) {
        if (Objects.equals(this.f6805f, zoneId)) {
            return this;
        }
        return new DateTimeFormatter(this.f6800a, this.f6801b, this.f6802c, this.f6803d, this.f6804e, zoneId);
    }

    public DateTimeFormatter withResolverStyle(ResolverStyle resolverStyle) {
        Objects.requireNonNull(resolverStyle, "resolverStyle");
        if (Objects.equals(this.f6803d, resolverStyle)) {
            return this;
        }
        return new DateTimeFormatter(this.f6800a, this.f6801b, this.f6802c, resolverStyle, this.f6804e, this.f6805f);
    }

    public String format(TemporalAccessor temporalAccessor) {
        StringBuilder sb = new StringBuilder(32);
        C45762d c45762d = this.f6800a;
        Objects.requireNonNull(temporalAccessor, "temporal");
        try {
            c45762d.mo3559c(new C45782x(temporalAccessor, this), sb);
            return sb.toString();
        } catch (IOException e) {
            throw new DateTimeException(e.getMessage(), e);
        }
    }

    public TemporalAccessor parse(CharSequence charSequence) {
        Objects.requireNonNull(charSequence, "text");
        try {
            return m3542b(charSequence);
        } catch (DateTimeParseException e) {
            throw e;
        } catch (RuntimeException e2) {
            throw m3541a(charSequence, e2);
        }
    }

    public <T> T parse(CharSequence charSequence, TemporalQuery<T> temporalQuery) {
        Objects.requireNonNull(charSequence, "text");
        Objects.requireNonNull(temporalQuery, "query");
        try {
            return (T) m3542b(charSequence).query(temporalQuery);
        } catch (DateTimeParseException e) {
            throw e;
        } catch (RuntimeException e2) {
            throw m3541a(charSequence, e2);
        }
    }

    /* renamed from: a */
    public static DateTimeParseException m3541a(CharSequence charSequence, RuntimeException runtimeException) {
        String string2;
        if (charSequence.length() > 64) {
            string2 = charSequence.subSequence(0, 64).toString() + "...";
        } else {
            string2 = charSequence.toString();
        }
        DateTimeParseException dateTimeParseException = new DateTimeParseException("Text '" + string2 + "' could not be parsed: " + runtimeException.getMessage(), runtimeException);
        charSequence.toString();
        return dateTimeParseException;
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0259  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C45757B m3542b(CharSequence charSequence) {
        String string2;
        long j;
        int i = 0;
        ParsePosition parsePosition = new ParsePosition(0);
        C45780v c45780v = new C45780v(this);
        int iMo3560i = this.f6800a.mo3560i(c45780v, charSequence, parsePosition.getIndex());
        if (iMo3560i < 0) {
            parsePosition.setErrorIndex(~iMo3560i);
            c45780v = null;
        } else {
            parsePosition.setIndex(iMo3560i);
        }
        if (c45780v != null && parsePosition.getErrorIndex() < 0 && parsePosition.getIndex() >= charSequence.length()) {
            C45757B c45757bM3584c = c45780v.m3584c();
            c45757bM3584c.f6784c = c45780v.m3585d();
            ZoneId zoneId = c45757bM3584c.f6783b;
            if (zoneId == null) {
                zoneId = c45780v.f6880a.f6805f;
            }
            c45757bM3584c.f6783b = zoneId;
            c45757bM3584c.f6786e = this.f6803d;
            c45757bM3584c.m3534e();
            c45757bM3584c.m3539m(c45757bM3584c.f6784c.resolveDate(c45757bM3584c.f6782a, c45757bM3584c.f6786e));
            c45757bM3584c.m3537k();
            if (((HashMap) c45757bM3584c.f6782a).size() > 0) {
                loop0: while (i < 50) {
                    Iterator it = ((HashMap) c45757bM3584c.f6782a).entrySet().iterator();
                    while (it.hasNext()) {
                        TemporalField temporalField = (TemporalField) ((Map.Entry) it.next()).getKey();
                        TemporalAccessor temporalAccessorMo3597c = temporalField.mo3597c(c45757bM3584c.f6782a, c45757bM3584c, c45757bM3584c.f6786e);
                        if (temporalAccessorMo3597c != null) {
                            if (temporalAccessorMo3597c instanceof ChronoZonedDateTime) {
                                ChronoZonedDateTime chronoZonedDateTime = (ChronoZonedDateTime) temporalAccessorMo3597c;
                                ZoneId zoneId2 = c45757bM3584c.f6783b;
                                if (zoneId2 == null) {
                                    c45757bM3584c.f6783b = chronoZonedDateTime.mo3463h();
                                } else if (!zoneId2.equals(chronoZonedDateTime.mo3463h())) {
                                    throw new DateTimeException("ChronoZonedDateTime must use the effective parsed zone: " + c45757bM3584c.f6783b);
                                }
                                temporalAccessorMo3597c = chronoZonedDateTime.mo3461d();
                            }
                            if (temporalAccessorMo3597c instanceof ChronoLocalDateTime) {
                                ChronoLocalDateTime chronoLocalDateTime = (ChronoLocalDateTime) temporalAccessorMo3597c;
                                c45757bM3584c.m3538l(chronoLocalDateTime.toLocalTime(), Period.ZERO);
                                c45757bM3584c.m3539m(chronoLocalDateTime.mo3394a());
                            } else if (temporalAccessorMo3597c instanceof ChronoLocalDate) {
                                c45757bM3584c.m3539m((ChronoLocalDate) temporalAccessorMo3597c);
                            } else if (temporalAccessorMo3597c instanceof LocalTime) {
                                c45757bM3584c.m3538l((LocalTime) temporalAccessorMo3597c, Period.ZERO);
                            } else {
                                throw new DateTimeException("Method resolve() can only return ChronoZonedDateTime, ChronoLocalDateTime, ChronoLocalDate or LocalTime");
                            }
                        } else if (!((HashMap) c45757bM3584c.f6782a).containsKey(temporalField)) {
                            break;
                        }
                        i++;
                    }
                }
                if (i == 50) {
                    throw new DateTimeException("One of the parsed fields has an incorrectly implemented resolve method");
                }
                if (i > 0) {
                    c45757bM3584c.m3534e();
                    c45757bM3584c.m3539m(c45757bM3584c.f6784c.resolveDate(c45757bM3584c.f6782a, c45757bM3584c.f6786e));
                    c45757bM3584c.m3537k();
                }
            }
            if (c45757bM3584c.f6788g == null) {
                Map map = c45757bM3584c.f6782a;
                ChronoField chronoField = ChronoField.MILLI_OF_SECOND;
                if (((HashMap) map).containsKey(chronoField)) {
                    long jLongValue = ((Long) ((HashMap) c45757bM3584c.f6782a).remove(chronoField)).longValue();
                    Map map2 = c45757bM3584c.f6782a;
                    ChronoField chronoField2 = ChronoField.MICRO_OF_SECOND;
                    if (((HashMap) map2).containsKey(chronoField2)) {
                        long jLongValue2 = (((Long) ((HashMap) c45757bM3584c.f6782a).get(chronoField2)).longValue() % 1000) + (jLongValue * 1000);
                        c45757bM3584c.m3540n(chronoField, chronoField2, Long.valueOf(jLongValue2));
                        ((HashMap) c45757bM3584c.f6782a).remove(chronoField2);
                        ((HashMap) c45757bM3584c.f6782a).put(ChronoField.NANO_OF_SECOND, Long.valueOf(jLongValue2 * 1000));
                    } else {
                        ((HashMap) c45757bM3584c.f6782a).put(ChronoField.NANO_OF_SECOND, Long.valueOf(jLongValue * 1000000));
                    }
                } else {
                    Map map3 = c45757bM3584c.f6782a;
                    ChronoField chronoField3 = ChronoField.MICRO_OF_SECOND;
                    if (((HashMap) map3).containsKey(chronoField3)) {
                        ((HashMap) c45757bM3584c.f6782a).put(ChronoField.NANO_OF_SECOND, Long.valueOf(((Long) ((HashMap) c45757bM3584c.f6782a).remove(chronoField3)).longValue() * 1000));
                    }
                }
                Map map4 = c45757bM3584c.f6782a;
                ChronoField chronoField4 = ChronoField.HOUR_OF_DAY;
                Long l = (Long) ((HashMap) map4).get(chronoField4);
                if (l != null) {
                    Map map5 = c45757bM3584c.f6782a;
                    ChronoField chronoField5 = ChronoField.MINUTE_OF_HOUR;
                    Long l2 = (Long) ((HashMap) map5).get(chronoField5);
                    Map map6 = c45757bM3584c.f6782a;
                    ChronoField chronoField6 = ChronoField.SECOND_OF_MINUTE;
                    Long l3 = (Long) ((HashMap) map6).get(chronoField6);
                    Map map7 = c45757bM3584c.f6782a;
                    ChronoField chronoField7 = ChronoField.NANO_OF_SECOND;
                    Long l4 = (Long) ((HashMap) map7).get(chronoField7);
                    if ((l2 != null || (l3 == null && l4 == null)) && (l2 == null || l3 != null || l4 == null)) {
                        long jLongValue3 = l2 != null ? l2.longValue() : 0L;
                        long jLongValue4 = l3 != null ? l3.longValue() : 0L;
                        long jLongValue5 = l4 != null ? l4.longValue() : 0L;
                        long j2 = jLongValue4;
                        j = 1000000;
                        c45757bM3584c.m3536j(l.longValue(), jLongValue3, j2, jLongValue5);
                        ((HashMap) c45757bM3584c.f6782a).remove(chronoField4);
                        ((HashMap) c45757bM3584c.f6782a).remove(chronoField5);
                        ((HashMap) c45757bM3584c.f6782a).remove(chronoField6);
                        ((HashMap) c45757bM3584c.f6782a).remove(chronoField7);
                    } else {
                        j = 1000000;
                    }
                } else {
                    j = 1000000;
                }
                if (c45757bM3584c.f6786e != ResolverStyle.LENIENT && ((HashMap) c45757bM3584c.f6782a).size() > 0) {
                    for (Map.Entry entry : ((HashMap) c45757bM3584c.f6782a).entrySet()) {
                        TemporalField temporalField2 = (TemporalField) entry.getKey();
                        if ((temporalField2 instanceof ChronoField) && ((ChronoField) temporalField2).m3595i()) {
                            ((ChronoField) temporalField2).checkValidValue(((Long) entry.getValue()).longValue());
                        }
                    }
                }
            }
            ChronoLocalDate chronoLocalDate = c45757bM3584c.f6787f;
            if (chronoLocalDate != null) {
                c45757bM3584c.m3533c(chronoLocalDate);
            }
            LocalTime localTime = c45757bM3584c.f6788g;
            if (localTime != null) {
                c45757bM3584c.m3533c(localTime);
                if (c45757bM3584c.f6787f != null && ((HashMap) c45757bM3584c.f6782a).size() > 0) {
                    c45757bM3584c.m3533c(c45757bM3584c.f6787f.atTime(c45757bM3584c.f6788g));
                }
            }
            if (c45757bM3584c.f6787f != null && c45757bM3584c.f6788g != null && !c45757bM3584c.f6789h.isZero()) {
                c45757bM3584c.f6787f = c45757bM3584c.f6787f.plus((TemporalAmount) c45757bM3584c.f6789h);
                c45757bM3584c.f6789h = Period.ZERO;
            }
            if (c45757bM3584c.f6788g == null) {
                if (!((HashMap) c45757bM3584c.f6782a).containsKey(ChronoField.INSTANT_SECONDS)) {
                    if (!((HashMap) c45757bM3584c.f6782a).containsKey(ChronoField.SECOND_OF_DAY)) {
                        if (((HashMap) c45757bM3584c.f6782a).containsKey(ChronoField.SECOND_OF_MINUTE)) {
                            Map map8 = c45757bM3584c.f6782a;
                            ChronoField chronoField8 = ChronoField.NANO_OF_SECOND;
                            if (((HashMap) map8).containsKey(chronoField8)) {
                                long jLongValue6 = ((Long) ((HashMap) c45757bM3584c.f6782a).get(chronoField8)).longValue();
                                ((HashMap) c45757bM3584c.f6782a).put(ChronoField.MICRO_OF_SECOND, Long.valueOf(jLongValue6 / 1000));
                                ((HashMap) c45757bM3584c.f6782a).put(ChronoField.MILLI_OF_SECOND, Long.valueOf(jLongValue6 / j));
                            } else {
                                ((HashMap) c45757bM3584c.f6782a).put(chronoField8, 0L);
                                ((HashMap) c45757bM3584c.f6782a).put(ChronoField.MICRO_OF_SECOND, 0L);
                                ((HashMap) c45757bM3584c.f6782a).put(ChronoField.MILLI_OF_SECOND, 0L);
                            }
                        }
                    }
                }
            }
            if (c45757bM3584c.f6787f != null && c45757bM3584c.f6788g != null) {
                Long l5 = (Long) ((HashMap) c45757bM3584c.f6782a).get(ChronoField.OFFSET_SECONDS);
                if (l5 != null) {
                    ((HashMap) c45757bM3584c.f6782a).put(ChronoField.INSTANT_SECONDS, Long.valueOf(c45757bM3584c.f6787f.atTime(c45757bM3584c.f6788g).mo3396g(ZoneOffset.ofTotalSeconds(l5.intValue())).toEpochSecond()));
                    return c45757bM3584c;
                }
                if (c45757bM3584c.f6783b != null) {
                    ((HashMap) c45757bM3584c.f6782a).put(ChronoField.INSTANT_SECONDS, Long.valueOf(c45757bM3584c.f6787f.atTime(c45757bM3584c.f6788g).mo3396g(c45757bM3584c.f6783b).toEpochSecond()));
                }
            }
            return c45757bM3584c;
        }
        if (charSequence.length() > 64) {
            string2 = charSequence.subSequence(0, 64).toString() + "...";
        } else {
            string2 = charSequence.toString();
        }
        if (parsePosition.getErrorIndex() >= 0) {
            String str = "Text '" + string2 + "' could not be parsed at index " + parsePosition.getErrorIndex();
            parsePosition.getErrorIndex();
            throw new DateTimeParseException(str, charSequence);
        }
        String str2 = "Text '" + string2 + "' could not be parsed, unparsed text found at index " + parsePosition.getIndex();
        parsePosition.getIndex();
        throw new DateTimeParseException(str2, charSequence);
    }

    public final String toString() {
        String string2 = this.f6800a.toString();
        return string2.startsWith("[") ? string2 : string2.substring(1, string2.length() - 1);
    }

    /* renamed from: c */
    public final C45762d m3543c() {
        C45762d c45762d = this.f6800a;
        return !c45762d.f6829b ? c45762d : new C45762d(c45762d.f6828a, false);
    }
}
