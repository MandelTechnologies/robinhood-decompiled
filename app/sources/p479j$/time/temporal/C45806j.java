package p479j$.time.temporal;

/* renamed from: j$.time.temporal.j */
/* loaded from: classes29.dex */
public final /* synthetic */ class C45806j implements TemporalAdjuster {

    /* renamed from: a */
    public final /* synthetic */ int f6956a;

    /* renamed from: b */
    public final /* synthetic */ int f6957b;

    public /* synthetic */ C45806j(int i, int i2) {
        this.f6956a = i2;
        this.f6957b = i;
    }

    @Override // p479j$.time.temporal.TemporalAdjuster
    public final Temporal adjustInto(Temporal temporal) {
        switch (this.f6956a) {
            case 0:
                int i = temporal.get(ChronoField.DAY_OF_WEEK);
                int i2 = this.f6957b;
                if (i == i2) {
                    return temporal;
                }
                return temporal.plus(i - i2 >= 0 ? 7 - r0 : -r0, ChronoUnit.DAYS);
            default:
                int i3 = temporal.get(ChronoField.DAY_OF_WEEK);
                int i4 = this.f6957b;
                if (i3 == i4) {
                    return temporal;
                }
                return temporal.minus(i4 - i3 >= 0 ? 7 - r1 : -r1, ChronoUnit.DAYS);
        }
    }
}
