package p479j$.time.format;

import java.util.Iterator;
import java.util.Map;
import p479j$.time.chrono.Chronology;
import p479j$.time.chrono.Era;
import p479j$.time.chrono.IsoChronology;
import p479j$.time.temporal.ChronoField;
import p479j$.time.temporal.TemporalField;
import p479j$.time.temporal.TemporalQueries;

/* renamed from: j$.time.format.r */
/* loaded from: classes29.dex */
public final class C45776r implements InterfaceC45763e {

    /* renamed from: a */
    public final TemporalField f6865a;

    /* renamed from: b */
    public final TextStyle f6866b;

    /* renamed from: c */
    public final C45756A f6867c;

    /* renamed from: d */
    public volatile C45768j f6868d;

    public C45776r(TemporalField temporalField, TextStyle textStyle, C45756A c45756a) {
        this.f6865a = temporalField;
        this.f6866b = textStyle;
        this.f6867c = c45756a;
    }

    @Override // p479j$.time.format.InterfaceC45763e
    /* renamed from: c */
    public final boolean mo3559c(C45782x c45782x, StringBuilder sb) {
        String strMo3530d;
        Long lM3590a = c45782x.m3590a(this.f6865a);
        DateTimeFormatter dateTimeFormatter = c45782x.f6890b;
        if (lM3590a == null) {
            return false;
        }
        Chronology chronology = (Chronology) c45782x.f6889a.query(TemporalQueries.chronology());
        if (chronology == null || chronology == IsoChronology.INSTANCE) {
            strMo3530d = this.f6867c.mo3530d(this.f6865a, lM3590a.longValue(), this.f6866b, dateTimeFormatter.f6801b);
        } else {
            strMo3530d = this.f6867c.mo3529c(chronology, this.f6865a, lM3590a.longValue(), this.f6866b, dateTimeFormatter.f6801b);
        }
        if (strMo3530d != null) {
            sb.append(strMo3530d);
            return true;
        }
        if (this.f6868d == null) {
            this.f6868d = new C45768j(this.f6865a, 1, 19, SignStyle.NORMAL);
        }
        return this.f6868d.mo3559c(c45782x, sb);
    }

    @Override // p479j$.time.format.InterfaceC45763e
    /* renamed from: i */
    public final int mo3560i(C45780v c45780v, CharSequence charSequence, int i) {
        Iterator itMo3532f;
        C45756A c45756a = this.f6867c;
        TemporalField temporalField = this.f6865a;
        int length = charSequence.length();
        if (i >= 0 && i <= length) {
            boolean z = c45780v.f6882c;
            DateTimeFormatter dateTimeFormatter = c45780v.f6880a;
            TextStyle textStyle = z ? this.f6866b : null;
            Chronology chronologyM3585d = c45780v.m3585d();
            if (chronologyM3585d == null || chronologyM3585d == IsoChronology.INSTANCE) {
                itMo3532f = c45756a.mo3532f(temporalField, textStyle, dateTimeFormatter.f6801b);
            } else {
                itMo3532f = c45756a.mo3531e(chronologyM3585d, temporalField, textStyle, dateTimeFormatter.f6801b);
            }
            Iterator it = itMo3532f;
            if (it != null) {
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    String str = (String) entry.getKey();
                    if (c45780v.m3589h(str, 0, charSequence, i, str.length())) {
                        return c45780v.m3588g(this.f6865a, ((Long) entry.getValue()).longValue(), i, str.length() + i);
                    }
                }
                if (temporalField == ChronoField.ERA && !c45780v.f6882c) {
                    Iterator<Era> it2 = chronologyM3585d.eras().iterator();
                    while (it2.hasNext()) {
                        String string2 = it2.next().toString();
                        if (c45780v.m3589h(string2, 0, charSequence, i, string2.length())) {
                            return c45780v.m3588g(this.f6865a, r7.getValue(), i, string2.length() + i);
                        }
                    }
                }
                if (c45780v.f6882c) {
                    return ~i;
                }
            }
            if (this.f6868d == null) {
                this.f6868d = new C45768j(this.f6865a, 1, 19, SignStyle.NORMAL);
            }
            return this.f6868d.mo3560i(c45780v, charSequence, i);
        }
        throw new IndexOutOfBoundsException();
    }

    public final String toString() {
        TextStyle textStyle = TextStyle.FULL;
        TemporalField temporalField = this.f6865a;
        TextStyle textStyle2 = this.f6866b;
        if (textStyle2 == textStyle) {
            return "Text(" + temporalField + ")";
        }
        return "Text(" + temporalField + "," + textStyle2 + ")";
    }
}
