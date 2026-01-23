package p479j$.time.format;

import com.robinhood.utils.extensions.ResourceTypes;
import com.singular.sdk.internal.Constants;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;
import p479j$.time.C45754e;
import p479j$.time.LocalDate;
import p479j$.time.chrono.Chronology;
import p479j$.time.chrono.IsoChronology;
import p479j$.time.temporal.AbstractC45805i;
import p479j$.time.temporal.ChronoField;
import p479j$.time.temporal.IsoFields;
import p479j$.time.temporal.TemporalField;
import p479j$.time.temporal.TemporalQueries;

/* loaded from: classes29.dex */
public final class DateTimeFormatterBuilder {

    /* renamed from: h */
    public static final C45754e f6806h = new C45754e(6);

    /* renamed from: i */
    public static final Map f6807i;

    /* renamed from: a */
    public DateTimeFormatterBuilder f6808a;

    /* renamed from: b */
    public final DateTimeFormatterBuilder f6809b;

    /* renamed from: c */
    public final List f6810c;

    /* renamed from: d */
    public final boolean f6811d;

    /* renamed from: e */
    public int f6812e;

    /* renamed from: f */
    public char f6813f;

    /* renamed from: g */
    public int f6814g;

    static {
        HashMap map = new HashMap();
        f6807i = map;
        map.put('G', ChronoField.ERA);
        map.put('y', ChronoField.YEAR_OF_ERA);
        map.put('u', ChronoField.YEAR);
        TemporalField temporalField = IsoFields.QUARTER_OF_YEAR;
        map.put('Q', temporalField);
        map.put('q', temporalField);
        ChronoField chronoField = ChronoField.MONTH_OF_YEAR;
        map.put('M', chronoField);
        map.put(Character.valueOf(Matrix.MATRIX_TYPE_RANDOM_LT), chronoField);
        map.put('D', ChronoField.DAY_OF_YEAR);
        map.put('d', ChronoField.DAY_OF_MONTH);
        map.put('F', ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        ChronoField chronoField2 = ChronoField.DAY_OF_WEEK;
        map.put('E', chronoField2);
        map.put('c', chronoField2);
        map.put('e', chronoField2);
        map.put('a', ChronoField.AMPM_OF_DAY);
        map.put('H', ChronoField.HOUR_OF_DAY);
        map.put('k', ChronoField.CLOCK_HOUR_OF_DAY);
        map.put('K', ChronoField.HOUR_OF_AMPM);
        map.put('h', ChronoField.CLOCK_HOUR_OF_AMPM);
        map.put('m', ChronoField.MINUTE_OF_HOUR);
        map.put('s', ChronoField.SECOND_OF_MINUTE);
        ChronoField chronoField3 = ChronoField.NANO_OF_SECOND;
        map.put('S', chronoField3);
        map.put('A', ChronoField.MILLI_OF_DAY);
        map.put('n', chronoField3);
        map.put('N', ChronoField.NANO_OF_DAY);
        map.put('g', AbstractC45805i.f6955a);
    }

    public static String getLocalizedDateTimePattern(FormatStyle formatStyle, FormatStyle formatStyle2, Chronology chronology, Locale locale) {
        DateFormat dateTimeInstance;
        Objects.requireNonNull(locale, "locale");
        Objects.requireNonNull(chronology, "chrono");
        if (formatStyle == null && formatStyle2 == null) {
            throw new IllegalArgumentException("Either dateStyle or timeStyle must be non-null");
        }
        if (formatStyle2 == null) {
            dateTimeInstance = DateFormat.getDateInstance(formatStyle.ordinal(), locale);
        } else if (formatStyle == null) {
            dateTimeInstance = DateFormat.getTimeInstance(formatStyle2.ordinal(), locale);
        } else {
            dateTimeInstance = DateFormat.getDateTimeInstance(formatStyle.ordinal(), formatStyle2.ordinal(), locale);
        }
        if (dateTimeInstance instanceof SimpleDateFormat) {
            String pattern = ((SimpleDateFormat) dateTimeInstance).toPattern();
            if (pattern == null) {
                return null;
            }
            int i = 0;
            boolean z = pattern.indexOf(66) != -1;
            boolean z2 = pattern.indexOf(98) != -1;
            if (!z && !z2) {
                return pattern;
            }
            StringBuilder sb = new StringBuilder(pattern.length());
            char c = ' ';
            while (i < pattern.length()) {
                char cCharAt = pattern.charAt(i);
                if (cCharAt != ' ') {
                    if (cCharAt != 'B' && cCharAt != 'b') {
                        sb.append(cCharAt);
                    }
                } else if (i == 0 || (c != 'B' && c != 'b')) {
                    sb.append(cCharAt);
                }
                i++;
                c = cCharAt;
            }
            int length = sb.length() - 1;
            if (length >= 0 && sb.charAt(length) == ' ') {
                sb.deleteCharAt(length);
            }
            return sb.toString();
        }
        throw new UnsupportedOperationException("Can't determine pattern from " + dateTimeInstance);
    }

    public DateTimeFormatterBuilder() {
        this.f6808a = this;
        this.f6810c = new ArrayList();
        this.f6814g = -1;
        this.f6809b = null;
        this.f6811d = false;
    }

    public DateTimeFormatterBuilder(DateTimeFormatterBuilder dateTimeFormatterBuilder) {
        this.f6808a = this;
        this.f6810c = new ArrayList();
        this.f6814g = -1;
        this.f6809b = dateTimeFormatterBuilder;
        this.f6811d = true;
    }

    public DateTimeFormatterBuilder parseCaseInsensitive() {
        m3546c(EnumC45775q.INSENSITIVE);
        return this;
    }

    /* renamed from: i */
    public final void m3552i(TemporalField temporalField) {
        m3551h(new C45768j(temporalField, 1, 19, SignStyle.NORMAL));
    }

    public DateTimeFormatterBuilder appendValue(TemporalField temporalField, int i) {
        Objects.requireNonNull(temporalField, "field");
        if (i < 1 || i > 19) {
            throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i);
        }
        m3551h(new C45768j(temporalField, i, i, SignStyle.NOT_NEGATIVE));
        return this;
    }

    public DateTimeFormatterBuilder appendValue(TemporalField temporalField, int i, int i2, SignStyle signStyle) {
        if (i == i2 && signStyle == SignStyle.NOT_NEGATIVE) {
            return appendValue(temporalField, i2);
        }
        Objects.requireNonNull(temporalField, "field");
        Objects.requireNonNull(signStyle, "signStyle");
        if (i < 1 || i > 19) {
            throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i);
        }
        if (i2 < 1 || i2 > 19) {
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i2);
        }
        if (i2 < i) {
            throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i2 + " < " + i);
        }
        m3551h(new C45768j(temporalField, i, i2, signStyle));
        return this;
    }

    /* renamed from: h */
    public final void m3551h(C45768j c45768j) {
        C45768j c45768jMo3562e;
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.f6808a;
        int i = dateTimeFormatterBuilder.f6814g;
        if (i < 0) {
            dateTimeFormatterBuilder.f6814g = m3546c(c45768j);
            return;
        }
        C45768j c45768j2 = (C45768j) ((ArrayList) dateTimeFormatterBuilder.f6810c).get(i);
        int i2 = c45768j.f6839b;
        int i3 = c45768j.f6840c;
        if (i2 == i3 && c45768j.f6841d == SignStyle.NOT_NEGATIVE) {
            c45768jMo3562e = c45768j2.mo3563f(i3);
            m3546c(c45768j.mo3562e());
            this.f6808a.f6814g = i;
        } else {
            c45768jMo3562e = c45768j2.mo3562e();
            this.f6808a.f6814g = m3546c(c45768j);
        }
        ((ArrayList) this.f6808a.f6810c).set(i, c45768jMo3562e);
    }

    /* renamed from: b */
    public final void m3545b(ChronoField chronoField, int i, int i2, boolean z) {
        if (i == i2 && !z) {
            m3551h(new C45764f(chronoField, i, i2, z));
        } else {
            m3546c(new C45764f(chronoField, i, i2, z));
        }
    }

    public DateTimeFormatterBuilder appendText(TemporalField temporalField, TextStyle textStyle) {
        Objects.requireNonNull(temporalField, "field");
        Objects.requireNonNull(textStyle, "textStyle");
        m3546c(new C45776r(temporalField, textStyle, C45756A.f6781c));
        return this;
    }

    /* renamed from: g */
    public final void m3550g(ChronoField chronoField, Map map) {
        Objects.requireNonNull(chronoField, "field");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        TextStyle textStyle = TextStyle.FULL;
        m3546c(new C45776r(chronoField, textStyle, new C45759a(new C45784z(Collections.singletonMap(textStyle, linkedHashMap)))));
    }

    public DateTimeFormatterBuilder appendInstant(int i) {
        if (i < -1 || i > 9) {
            throw new IllegalArgumentException("The fractional digits must be from -1 to 9 inclusive but was " + i);
        }
        m3546c(new C45765g(i));
        return this;
    }

    public DateTimeFormatterBuilder appendOffsetId() {
        m3546c(C45769k.f6844e);
        return this;
    }

    public DateTimeFormatterBuilder appendOffset(String str, String str2) {
        m3546c(new C45769k(str, str2));
        return this;
    }

    /* renamed from: e */
    public final void m3548e(TextStyle textStyle) {
        Objects.requireNonNull(textStyle, ResourceTypes.STYLE);
        if (textStyle != TextStyle.FULL && textStyle != TextStyle.SHORT) {
            throw new IllegalArgumentException("Style must be either full or short");
        }
        m3546c(new C45766h(textStyle, 0));
    }

    public DateTimeFormatterBuilder appendLiteral(char c) {
        m3546c(new C45761c(c));
        return this;
    }

    /* renamed from: d */
    public final void m3547d(String str) {
        Objects.requireNonNull(str, "literal");
        if (str.isEmpty()) {
            return;
        }
        if (str.length() == 1) {
            m3546c(new C45761c(str.charAt(0)));
        } else {
            m3546c(new C45766h(str, 1));
        }
    }

    /* renamed from: a */
    public final void m3544a(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        m3546c(dateTimeFormatter.m3543c());
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0471 A[SYNTHETIC] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3549f(String str) {
        boolean z;
        int i;
        int i2;
        Objects.requireNonNull(str, "pattern");
        int i3 = 0;
        while (i3 < str.length()) {
            char cCharAt = str.charAt(i3);
            if ((cCharAt >= 'A' && cCharAt <= 'Z') || (cCharAt >= 'a' && cCharAt <= 'z')) {
                int i4 = i3 + 1;
                while (i4 < str.length() && str.charAt(i4) == cCharAt) {
                    i4++;
                }
                int i5 = i4 - i3;
                if (cCharAt == 'p') {
                    if (i4 >= str.length() || (((cCharAt = str.charAt(i4)) < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z'))) {
                        i = i4;
                        i2 = i5;
                        i5 = 0;
                    } else {
                        i = i4 + 1;
                        while (i < str.length() && str.charAt(i) == cCharAt) {
                            i++;
                        }
                        i2 = i - i4;
                    }
                    if (i5 == 0) {
                        throw new IllegalArgumentException("Pad letter 'p' must be followed by valid pad pattern: ".concat(str));
                    }
                    if (i5 < 1) {
                        throw new IllegalArgumentException("The pad width must be at least one but was " + i5);
                    }
                    DateTimeFormatterBuilder dateTimeFormatterBuilder = this.f6808a;
                    dateTimeFormatterBuilder.f6812e = i5;
                    dateTimeFormatterBuilder.f6813f = ' ';
                    dateTimeFormatterBuilder.f6814g = -1;
                    i5 = i2;
                    i4 = i;
                }
                TemporalField temporalField = (TemporalField) ((HashMap) f6807i).get(Character.valueOf(cCharAt));
                if (temporalField != null) {
                    if (cCharAt == 'A') {
                        appendValue(temporalField, i5, 19, SignStyle.NOT_NEGATIVE);
                    } else if (cCharAt == 'Q') {
                        z = false;
                        if (i5 != 1 || i5 == 2) {
                            if (cCharAt != 'e') {
                                int i6 = i5;
                                m3551h(new C45777s(cCharAt, i6, i6, i6, 0));
                            } else if (cCharAt == 'E') {
                                appendText(temporalField, TextStyle.SHORT);
                            } else if (i5 == 1) {
                                m3552i(temporalField);
                            } else {
                                appendValue(temporalField, 2);
                            }
                        } else if (i5 == 3) {
                            appendText(temporalField, z ? TextStyle.SHORT_STANDALONE : TextStyle.SHORT);
                        } else if (i5 == 4) {
                            appendText(temporalField, z ? TextStyle.FULL_STANDALONE : TextStyle.FULL);
                        } else {
                            if (i5 != 5) {
                                throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                            }
                            appendText(temporalField, z ? TextStyle.NARROW_STANDALONE : TextStyle.NARROW);
                        }
                    } else if (cCharAt == 'S') {
                        m3545b(ChronoField.NANO_OF_SECOND, i5, i5, false);
                    } else if (cCharAt != 'a') {
                        if (cCharAt != 'k') {
                            if (cCharAt != 'q') {
                                if (cCharAt != 's') {
                                    if (cCharAt == 'u' || cCharAt == 'y') {
                                        if (i5 == 2) {
                                            LocalDate localDate = C45774p.f6862h;
                                            Objects.requireNonNull(localDate, "baseDate");
                                            m3551h(new C45774p(temporalField, 2, 2, localDate, 0));
                                        } else if (i5 < 4) {
                                            appendValue(temporalField, i5, 19, SignStyle.NORMAL);
                                        } else {
                                            appendValue(temporalField, i5, 19, SignStyle.EXCEEDS_PAD);
                                        }
                                    } else if (cCharAt == 'g') {
                                        appendValue(temporalField, i5, 19, SignStyle.NORMAL);
                                    } else if (cCharAt != 'h' && cCharAt != 'm') {
                                        if (cCharAt != 'n') {
                                            switch (cCharAt) {
                                                case SDK_ASSET_ICON_HOME_VALUE:
                                                    if (i5 == 1) {
                                                        m3552i(temporalField);
                                                        break;
                                                    } else {
                                                        if (i5 != 2 && i5 != 3) {
                                                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                                        }
                                                        appendValue(temporalField, i5, 3, SignStyle.NOT_NEGATIVE);
                                                        break;
                                                    }
                                                case 'E':
                                                    break;
                                                case 'F':
                                                    if (i5 != 1) {
                                                        throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                                    }
                                                    m3552i(temporalField);
                                                    break;
                                                case SDK_ASSET_ICON_GUIDE_VALUE:
                                                    if (i5 != 1 && i5 != 2 && i5 != 3) {
                                                        if (i5 == 4) {
                                                            appendText(temporalField, TextStyle.FULL);
                                                            break;
                                                        } else {
                                                            if (i5 != 5) {
                                                                throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                                            }
                                                            appendText(temporalField, TextStyle.NARROW);
                                                            break;
                                                        }
                                                    } else {
                                                        appendText(temporalField, TextStyle.SHORT);
                                                        break;
                                                    }
                                                case SDK_ASSET_ICON_GLOBE_VALUE:
                                                    break;
                                                default:
                                                    switch (cCharAt) {
                                                        case 'K':
                                                            break;
                                                        case 'L':
                                                            break;
                                                        case 'M':
                                                            break;
                                                        case 'N':
                                                            break;
                                                        default:
                                                            switch (cCharAt) {
                                                                case 'c':
                                                                    if (i5 == 1) {
                                                                        int i7 = i5;
                                                                        m3551h(new C45777s(cCharAt, i7, i7, i7, 0));
                                                                        break;
                                                                    } else if (i5 == 2) {
                                                                        throw new IllegalArgumentException("Invalid pattern \"cc\"");
                                                                    }
                                                                    break;
                                                                case 'd':
                                                                    break;
                                                                case 'e':
                                                                    break;
                                                                default:
                                                                    if (i5 != 1) {
                                                                        appendValue(temporalField, i5);
                                                                        break;
                                                                    } else {
                                                                        m3552i(temporalField);
                                                                        break;
                                                                    }
                                                            }
                                                    }
                                            }
                                        }
                                    }
                                }
                            }
                            z = true;
                            if (i5 != 1) {
                                if (cCharAt != 'e') {
                                }
                            }
                        } else if (i5 == 1) {
                            m3552i(temporalField);
                        } else {
                            if (i5 != 2) {
                                throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                            }
                            appendValue(temporalField, i5);
                        }
                    } else {
                        if (i5 != 1) {
                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                        }
                        appendText(temporalField, TextStyle.SHORT);
                    }
                } else if (cCharAt == 'z') {
                    if (i5 > 4) {
                        throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                    }
                    if (i5 == 4) {
                        m3546c(new C45779u(TextStyle.FULL, false));
                    } else {
                        m3546c(new C45779u(TextStyle.SHORT, false));
                    }
                } else if (cCharAt == 'V') {
                    if (i5 != 2) {
                        throw new IllegalArgumentException("Pattern letter count must be 2: " + cCharAt);
                    }
                    m3546c(new C45778t(TemporalQueries.f6924a, "ZoneId()"));
                } else if (cCharAt != 'v') {
                    String str2 = "+0000";
                    if (cCharAt == 'Z') {
                        if (i5 < 4) {
                            appendOffset("+HHMM", "+0000");
                        } else if (i5 == 4) {
                            m3548e(TextStyle.FULL);
                        } else {
                            if (i5 != 5) {
                                throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                            }
                            appendOffset("+HH:MM:ss", "Z");
                        }
                    } else if (cCharAt == 'O') {
                        if (i5 == 1) {
                            m3548e(TextStyle.SHORT);
                        } else {
                            if (i5 != 4) {
                                throw new IllegalArgumentException("Pattern letter count must be 1 or 4: " + cCharAt);
                            }
                            m3548e(TextStyle.FULL);
                        }
                    } else if (cCharAt == 'X') {
                        if (i5 > 5) {
                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                        }
                        appendOffset(C45769k.f6843d[i5 + (i5 == 1 ? 0 : 1)], "Z");
                    } else if (cCharAt == 'x') {
                        if (i5 > 5) {
                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                        }
                        if (i5 == 1) {
                            str2 = "+00";
                        } else if (i5 % 2 != 0) {
                            str2 = "+00:00";
                        }
                        appendOffset(C45769k.f6843d[i5 + (i5 == 1 ? 0 : 1)], str2);
                    } else if (cCharAt != 'W') {
                        int i8 = i5;
                        if (cCharAt == 'w') {
                            if (i8 > 2) {
                                throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                            }
                            m3551h(new C45777s(cCharAt, i8, i8, 2, 0));
                        } else {
                            if (cCharAt != 'Y') {
                                throw new IllegalArgumentException("Unknown pattern letter: " + cCharAt);
                            }
                            if (i8 == 2) {
                                m3551h(new C45777s(cCharAt, i8, i8, 2, 0));
                            } else {
                                m3551h(new C45777s(cCharAt, i8, i8, 19, 0));
                            }
                        }
                    } else {
                        if (i5 > 1) {
                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                        }
                        int i9 = i5;
                        m3551h(new C45777s(cCharAt, i9, i9, i9, 0));
                    }
                } else if (i5 == 1) {
                    m3546c(new C45779u(TextStyle.SHORT, true));
                } else {
                    if (i5 != 4) {
                        throw new IllegalArgumentException("Wrong number of  pattern letters: " + cCharAt);
                    }
                    m3546c(new C45779u(TextStyle.FULL, true));
                }
                i3 = i4 - 1;
            } else if (cCharAt == '\'') {
                int i10 = i3 + 1;
                int i11 = i10;
                while (i11 < str.length()) {
                    if (str.charAt(i11) == '\'') {
                        int i12 = i11 + 1;
                        if (i12 < str.length() && str.charAt(i12) == '\'') {
                            i11 = i12;
                        } else {
                            if (i11 < str.length()) {
                                throw new IllegalArgumentException("Pattern ends with an incomplete string literal: ".concat(str));
                            }
                            String strSubstring = str.substring(i10, i11);
                            if (strSubstring.isEmpty()) {
                                appendLiteral('\'');
                            } else {
                                m3547d(strSubstring.replace("''", "'"));
                            }
                            i3 = i11;
                        }
                    }
                    i11++;
                }
                if (i11 < str.length()) {
                }
            } else if (cCharAt == '[') {
                m3554k();
            } else if (cCharAt == ']') {
                if (this.f6808a.f6809b == null) {
                    throw new IllegalArgumentException("Pattern invalid as it contains ] without previous [");
                }
                m3553j();
            } else {
                if (cCharAt == '{' || cCharAt == '}' || cCharAt == '#') {
                    throw new IllegalArgumentException("Pattern includes reserved character: '" + cCharAt + "'");
                }
                appendLiteral(cCharAt);
            }
            i3++;
        }
    }

    /* renamed from: k */
    public final void m3554k() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.f6808a;
        dateTimeFormatterBuilder.f6814g = -1;
        this.f6808a = new DateTimeFormatterBuilder(dateTimeFormatterBuilder);
    }

    /* renamed from: j */
    public final void m3553j() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.f6808a;
        if (dateTimeFormatterBuilder.f6809b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        if (((ArrayList) dateTimeFormatterBuilder.f6810c).size() > 0) {
            DateTimeFormatterBuilder dateTimeFormatterBuilder2 = this.f6808a;
            C45762d c45762d = new C45762d(dateTimeFormatterBuilder2.f6810c, dateTimeFormatterBuilder2.f6811d);
            this.f6808a = this.f6808a.f6809b;
            m3546c(c45762d);
            return;
        }
        this.f6808a = this.f6808a.f6809b;
    }

    /* renamed from: c */
    public final int m3546c(InterfaceC45763e interfaceC45763e) {
        Objects.requireNonNull(interfaceC45763e, Constants.REVENUE_PRODUCT_PRICE_KEY);
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.f6808a;
        int i = dateTimeFormatterBuilder.f6812e;
        if (i > 0) {
            C45770l c45770l = new C45770l(interfaceC45763e, i, dateTimeFormatterBuilder.f6813f);
            dateTimeFormatterBuilder.f6812e = 0;
            dateTimeFormatterBuilder.f6813f = (char) 0;
            interfaceC45763e = c45770l;
        }
        ((ArrayList) dateTimeFormatterBuilder.f6810c).add(interfaceC45763e);
        this.f6808a.f6814g = -1;
        return ((ArrayList) r5.f6810c).size() - 1;
    }

    public DateTimeFormatter toFormatter() {
        return toFormatter(Locale.getDefault());
    }

    public DateTimeFormatter toFormatter(Locale locale) {
        return m3556m(locale, ResolverStyle.SMART, null);
    }

    /* renamed from: l */
    public final DateTimeFormatter m3555l(ResolverStyle resolverStyle, IsoChronology isoChronology) {
        return m3556m(Locale.getDefault(), resolverStyle, isoChronology);
    }

    /* renamed from: m */
    public final DateTimeFormatter m3556m(Locale locale, ResolverStyle resolverStyle, Chronology chronology) {
        Objects.requireNonNull(locale, "locale");
        while (this.f6808a.f6809b != null) {
            m3553j();
        }
        return new DateTimeFormatter(new C45762d(this.f6810c, false), locale, DecimalStyle.f6815d, resolverStyle, chronology, null);
    }
}
