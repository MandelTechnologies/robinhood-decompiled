package com.truelayer.payments.core.domain.payments;

import com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MandateConstraints.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0003\u001f !BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\""}, m3636d2 = {"Lcom/truelayer/payments/core/domain/payments/PeriodicLimits;", "", "day", "Lcom/truelayer/payments/core/domain/payments/PeriodicLimits$Limit;", "week", "fortnight", ManagedDashboardOverviewDuxo.DEFAULT_SPAN_RETURNS, "halfYear", "year", "(Lcom/truelayer/payments/core/domain/payments/PeriodicLimits$Limit;Lcom/truelayer/payments/core/domain/payments/PeriodicLimits$Limit;Lcom/truelayer/payments/core/domain/payments/PeriodicLimits$Limit;Lcom/truelayer/payments/core/domain/payments/PeriodicLimits$Limit;Lcom/truelayer/payments/core/domain/payments/PeriodicLimits$Limit;Lcom/truelayer/payments/core/domain/payments/PeriodicLimits$Limit;)V", "getDay", "()Lcom/truelayer/payments/core/domain/payments/PeriodicLimits$Limit;", "getFortnight", "getHalfYear", "getMonth", "getWeek", "getYear", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "Limit", "PeriodAlignment", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class PeriodicLimits {
    private final Limit day;
    private final Limit fortnight;
    private final Limit halfYear;
    private final Limit month;
    private final Limit week;
    private final Limit year;

    public PeriodicLimits() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ PeriodicLimits copy$default(PeriodicLimits periodicLimits, Limit limit, Limit limit2, Limit limit3, Limit limit4, Limit limit5, Limit limit6, int i, Object obj) {
        if ((i & 1) != 0) {
            limit = periodicLimits.day;
        }
        if ((i & 2) != 0) {
            limit2 = periodicLimits.week;
        }
        if ((i & 4) != 0) {
            limit3 = periodicLimits.fortnight;
        }
        if ((i & 8) != 0) {
            limit4 = periodicLimits.month;
        }
        if ((i & 16) != 0) {
            limit5 = periodicLimits.halfYear;
        }
        if ((i & 32) != 0) {
            limit6 = periodicLimits.year;
        }
        Limit limit7 = limit5;
        Limit limit8 = limit6;
        return periodicLimits.copy(limit, limit2, limit3, limit4, limit7, limit8);
    }

    /* renamed from: component1, reason: from getter */
    public final Limit getDay() {
        return this.day;
    }

    /* renamed from: component2, reason: from getter */
    public final Limit getWeek() {
        return this.week;
    }

    /* renamed from: component3, reason: from getter */
    public final Limit getFortnight() {
        return this.fortnight;
    }

    /* renamed from: component4, reason: from getter */
    public final Limit getMonth() {
        return this.month;
    }

    /* renamed from: component5, reason: from getter */
    public final Limit getHalfYear() {
        return this.halfYear;
    }

    /* renamed from: component6, reason: from getter */
    public final Limit getYear() {
        return this.year;
    }

    public final PeriodicLimits copy(Limit day, Limit week, Limit fortnight, Limit month, Limit halfYear, Limit year) {
        return new PeriodicLimits(day, week, fortnight, month, halfYear, year);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PeriodicLimits)) {
            return false;
        }
        PeriodicLimits periodicLimits = (PeriodicLimits) other;
        return Intrinsics.areEqual(this.day, periodicLimits.day) && Intrinsics.areEqual(this.week, periodicLimits.week) && Intrinsics.areEqual(this.fortnight, periodicLimits.fortnight) && Intrinsics.areEqual(this.month, periodicLimits.month) && Intrinsics.areEqual(this.halfYear, periodicLimits.halfYear) && Intrinsics.areEqual(this.year, periodicLimits.year);
    }

    public int hashCode() {
        Limit limit = this.day;
        int iHashCode = (limit == null ? 0 : limit.hashCode()) * 31;
        Limit limit2 = this.week;
        int iHashCode2 = (iHashCode + (limit2 == null ? 0 : limit2.hashCode())) * 31;
        Limit limit3 = this.fortnight;
        int iHashCode3 = (iHashCode2 + (limit3 == null ? 0 : limit3.hashCode())) * 31;
        Limit limit4 = this.month;
        int iHashCode4 = (iHashCode3 + (limit4 == null ? 0 : limit4.hashCode())) * 31;
        Limit limit5 = this.halfYear;
        int iHashCode5 = (iHashCode4 + (limit5 == null ? 0 : limit5.hashCode())) * 31;
        Limit limit6 = this.year;
        return iHashCode5 + (limit6 != null ? limit6.hashCode() : 0);
    }

    public String toString() {
        return "PeriodicLimits(day=" + this.day + ", week=" + this.week + ", fortnight=" + this.fortnight + ", month=" + this.month + ", halfYear=" + this.halfYear + ", year=" + this.year + ")";
    }

    public PeriodicLimits(Limit limit, Limit limit2, Limit limit3, Limit limit4, Limit limit5, Limit limit6) {
        this.day = limit;
        this.week = limit2;
        this.fortnight = limit3;
        this.month = limit4;
        this.halfYear = limit5;
        this.year = limit6;
    }

    public /* synthetic */ PeriodicLimits(Limit limit, Limit limit2, Limit limit3, Limit limit4, Limit limit5, Limit limit6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : limit, (i & 2) != 0 ? null : limit2, (i & 4) != 0 ? null : limit3, (i & 8) != 0 ? null : limit4, (i & 16) != 0 ? null : limit5, (i & 32) != 0 ? null : limit6);
    }

    public final Limit getDay() {
        return this.day;
    }

    public final Limit getWeek() {
        return this.week;
    }

    public final Limit getFortnight() {
        return this.fortnight;
    }

    public final Limit getMonth() {
        return this.month;
    }

    public final Limit getHalfYear() {
        return this.halfYear;
    }

    public final Limit getYear() {
        return this.year;
    }

    /* compiled from: MandateConstraints.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/payments/PeriodicLimits$Limit;", "", "maximumAmount", "", "periodAlignment", "Lcom/truelayer/payments/core/domain/payments/PeriodicLimits$PeriodAlignment;", "(JLcom/truelayer/payments/core/domain/payments/PeriodicLimits$PeriodAlignment;)V", "getMaximumAmount", "()J", "getPeriodAlignment", "()Lcom/truelayer/payments/core/domain/payments/PeriodicLimits$PeriodAlignment;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class Limit {
        private final long maximumAmount;
        private final PeriodAlignment periodAlignment;

        public static /* synthetic */ Limit copy$default(Limit limit, long j, PeriodAlignment periodAlignment, int i, Object obj) {
            if ((i & 1) != 0) {
                j = limit.maximumAmount;
            }
            if ((i & 2) != 0) {
                periodAlignment = limit.periodAlignment;
            }
            return limit.copy(j, periodAlignment);
        }

        /* renamed from: component1, reason: from getter */
        public final long getMaximumAmount() {
            return this.maximumAmount;
        }

        /* renamed from: component2, reason: from getter */
        public final PeriodAlignment getPeriodAlignment() {
            return this.periodAlignment;
        }

        public final Limit copy(long maximumAmount, PeriodAlignment periodAlignment) {
            Intrinsics.checkNotNullParameter(periodAlignment, "periodAlignment");
            return new Limit(maximumAmount, periodAlignment);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Limit)) {
                return false;
            }
            Limit limit = (Limit) other;
            return this.maximumAmount == limit.maximumAmount && this.periodAlignment == limit.periodAlignment;
        }

        public int hashCode() {
            return (Long.hashCode(this.maximumAmount) * 31) + this.periodAlignment.hashCode();
        }

        public String toString() {
            return "Limit(maximumAmount=" + this.maximumAmount + ", periodAlignment=" + this.periodAlignment + ")";
        }

        public Limit(long j, PeriodAlignment periodAlignment) {
            Intrinsics.checkNotNullParameter(periodAlignment, "periodAlignment");
            this.maximumAmount = j;
            this.periodAlignment = periodAlignment;
        }

        public final long getMaximumAmount() {
            return this.maximumAmount;
        }

        public final PeriodAlignment getPeriodAlignment() {
            return this.periodAlignment;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MandateConstraints.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/payments/PeriodicLimits$PeriodAlignment;", "", "(Ljava/lang/String;I)V", "Consent", "Calendar", "Unknown", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class PeriodAlignment {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ PeriodAlignment[] $VALUES;
        public static final PeriodAlignment Consent = new PeriodAlignment("Consent", 0);
        public static final PeriodAlignment Calendar = new PeriodAlignment("Calendar", 1);
        public static final PeriodAlignment Unknown = new PeriodAlignment("Unknown", 2);

        private static final /* synthetic */ PeriodAlignment[] $values() {
            return new PeriodAlignment[]{Consent, Calendar, Unknown};
        }

        public static EnumEntries<PeriodAlignment> getEntries() {
            return $ENTRIES;
        }

        public static PeriodAlignment valueOf(String str) {
            return (PeriodAlignment) Enum.valueOf(PeriodAlignment.class, str);
        }

        public static PeriodAlignment[] values() {
            return (PeriodAlignment[]) $VALUES.clone();
        }

        private PeriodAlignment(String str, int i) {
        }

        static {
            PeriodAlignment[] periodAlignmentArr$values = $values();
            $VALUES = periodAlignmentArr$values;
            $ENTRIES = EnumEntries2.enumEntries(periodAlignmentArr$values);
        }
    }
}
