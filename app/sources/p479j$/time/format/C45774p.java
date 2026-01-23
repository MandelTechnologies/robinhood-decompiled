package p479j$.time.format;

import java.util.ArrayList;
import java.util.function.Consumer;
import p479j$.time.LocalDate;
import p479j$.time.chrono.ChronoLocalDate;
import p479j$.time.chrono.Chronology;
import p479j$.time.temporal.TemporalField;

/* renamed from: j$.time.format.p */
/* loaded from: classes29.dex */
public final class C45774p extends C45768j {

    /* renamed from: h */
    public static final LocalDate f6862h = LocalDate.m3377of(2000, 1, 1);

    /* renamed from: g */
    public final ChronoLocalDate f6863g;

    @Override // p479j$.time.format.C45768j
    /* renamed from: b */
    public final boolean mo3561b(C45780v c45780v) {
        if (c45780v.f6882c) {
            return super.mo3561b(c45780v);
        }
        return false;
    }

    public C45774p(TemporalField temporalField, int i, int i2, ChronoLocalDate chronoLocalDate, int i3) {
        super(temporalField, i, i2, SignStyle.NOT_NEGATIVE, i3);
        this.f6863g = chronoLocalDate;
    }

    @Override // p479j$.time.format.C45768j
    /* renamed from: a */
    public final long mo3567a(C45782x c45782x, long j) {
        long jAbs = Math.abs(j);
        ChronoLocalDate chronoLocalDate = this.f6863g;
        long j2 = chronoLocalDate != null ? Chronology.from(c45782x.f6889a).date(chronoLocalDate).get(this.f6838a) : 0;
        long[] jArr = C45768j.f6837f;
        if (j >= j2) {
            long j3 = jArr[this.f6839b];
            if (j < j2 + j3) {
                return jAbs % j3;
            }
        }
        return jAbs % jArr[this.f6840c];
    }

    @Override // p479j$.time.format.C45768j
    /* renamed from: d */
    public final int mo3568d(C45780v c45780v, long j, int i, int i2) {
        final C45774p c45774p;
        final C45780v c45780v2;
        final long j2;
        final int i3;
        final int i4;
        int i5;
        long j3;
        ChronoLocalDate chronoLocalDate = this.f6863g;
        if (chronoLocalDate != null) {
            i5 = c45780v.m3585d().date(chronoLocalDate).get(this.f6838a);
            c45774p = this;
            c45780v2 = c45780v;
            j2 = j;
            i3 = i;
            i4 = i2;
            Consumer consumer = new Consumer() { // from class: j$.time.format.o
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    this.f6857a.mo3568d(c45780v2, j2, i3, i4);
                }
            };
            if (c45780v2.f6884e == null) {
                c45780v2.f6884e = new ArrayList();
            }
            c45780v2.f6884e.add(consumer);
        } else {
            c45774p = this;
            c45780v2 = c45780v;
            j2 = j;
            i3 = i;
            i4 = i2;
            i5 = 0;
        }
        int i6 = i4 - i3;
        int i7 = c45774p.f6839b;
        if (i6 != i7 || j2 < 0) {
            j3 = j2;
        } else {
            long j4 = C45768j.f6837f[i7];
            long j5 = i5;
            long j6 = j5 - (j5 % j4);
            long j7 = i5 > 0 ? j6 + j2 : j6 - j2;
            j3 = j7 < j5 ? j7 + j4 : j7;
        }
        return c45780v2.m3588g(c45774p.f6838a, j3, i3, i4);
    }

    @Override // p479j$.time.format.C45768j
    /* renamed from: e */
    public final C45768j mo3562e() {
        if (this.f6842e == -1) {
            return this;
        }
        return new C45774p(this.f6838a, this.f6839b, this.f6840c, this.f6863g, -1);
    }

    @Override // p479j$.time.format.C45768j
    /* renamed from: f */
    public final C45768j mo3563f(int i) {
        return new C45774p(this.f6838a, this.f6839b, this.f6840c, this.f6863g, this.f6842e + i);
    }

    @Override // p479j$.time.format.C45768j
    public final String toString() {
        Object obj = this.f6863g;
        return "ReducedValue(" + this.f6838a + "," + this.f6839b + "," + this.f6840c + "," + (obj != null ? obj : 0) + ")";
    }
}
