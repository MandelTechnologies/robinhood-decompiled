package com.robinhood.android.options.lib.simulatedreturn.chart;

import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsProfitAndLossChartUtils.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossSegment;", "", "points", "", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartPoint;", "sign", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossSegment$Sign;", "<init>", "(Ljava/util/List;Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossSegment$Sign;)V", "getPoints", "()Ljava/util/List;", "getSign", "()Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossSegment$Sign;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Sign", "lib-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionsProfitAndLossSegment {
    public static final int $stable = 8;
    private final List<OptionsSimulatedReturnChartPoint> points;
    private final Sign sign;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OptionsProfitAndLossSegment copy$default(OptionsProfitAndLossSegment optionsProfitAndLossSegment, List list, Sign sign, int i, Object obj) {
        if ((i & 1) != 0) {
            list = optionsProfitAndLossSegment.points;
        }
        if ((i & 2) != 0) {
            sign = optionsProfitAndLossSegment.sign;
        }
        return optionsProfitAndLossSegment.copy(list, sign);
    }

    public final List<OptionsSimulatedReturnChartPoint> component1() {
        return this.points;
    }

    /* renamed from: component2, reason: from getter */
    public final Sign getSign() {
        return this.sign;
    }

    public final OptionsProfitAndLossSegment copy(List<OptionsSimulatedReturnChartPoint> points, Sign sign) {
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(sign, "sign");
        return new OptionsProfitAndLossSegment(points, sign);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionsProfitAndLossSegment)) {
            return false;
        }
        OptionsProfitAndLossSegment optionsProfitAndLossSegment = (OptionsProfitAndLossSegment) other;
        return Intrinsics.areEqual(this.points, optionsProfitAndLossSegment.points) && this.sign == optionsProfitAndLossSegment.sign;
    }

    public int hashCode() {
        return (this.points.hashCode() * 31) + this.sign.hashCode();
    }

    public String toString() {
        return "OptionsProfitAndLossSegment(points=" + this.points + ", sign=" + this.sign + ")";
    }

    public OptionsProfitAndLossSegment(List<OptionsSimulatedReturnChartPoint> points, Sign sign) {
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(sign, "sign");
        this.points = points;
        this.sign = sign;
    }

    public final List<OptionsSimulatedReturnChartPoint> getPoints() {
        return this.points;
    }

    public final Sign getSign() {
        return this.sign;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OptionsProfitAndLossChartUtils.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossSegment$Sign;", "", "<init>", "(Ljava/lang/String;I)V", "POSITIVE", "NEGATIVE", "ZERO", "lib-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Sign {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Sign[] $VALUES;
        public static final Sign POSITIVE = new Sign("POSITIVE", 0);
        public static final Sign NEGATIVE = new Sign("NEGATIVE", 1);
        public static final Sign ZERO = new Sign("ZERO", 2);

        private static final /* synthetic */ Sign[] $values() {
            return new Sign[]{POSITIVE, NEGATIVE, ZERO};
        }

        public static EnumEntries<Sign> getEntries() {
            return $ENTRIES;
        }

        private Sign(String str, int i) {
        }

        static {
            Sign[] signArr$values = $values();
            $VALUES = signArr$values;
            $ENTRIES = EnumEntries2.enumEntries(signArr$values);
        }

        public static Sign valueOf(String str) {
            return (Sign) Enum.valueOf(Sign.class, str);
        }

        public static Sign[] values() {
            return (Sign[]) $VALUES.clone();
        }
    }
}
