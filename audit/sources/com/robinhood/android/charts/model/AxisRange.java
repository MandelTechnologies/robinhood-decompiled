package com.robinhood.android.charts.model;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.util.Money;
import java.math.BigDecimal;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* compiled from: Axis.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\r\u000eJ\u0015\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0005H&¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u0000H&¢\u0006\u0002\u0010\f\u0082\u0001\u0002\u000f\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/charts/model/AxisRange;", "T", "", "getValueByNormalizedValue", "normalizedValue", "", "(F)Ljava/lang/Object;", "getLabelByNormalizedValue", "", "isWithinRange", "", "value", "(Ljava/lang/Object;)Z", "MoneyAxisRange", "UnitlessAxisRange", "Lcom/robinhood/android/charts/model/AxisRange$MoneyAxisRange;", "Lcom/robinhood/android/charts/model/AxisRange$UnitlessAxisRange;", "lib-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface AxisRange<T> {
    String getLabelByNormalizedValue(float normalizedValue);

    T getValueByNormalizedValue(float normalizedValue);

    boolean isWithinRange(T value);

    /* compiled from: Axis.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0002H\u0016J\t\u0010\u0013\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/charts/model/AxisRange$MoneyAxisRange;", "Lcom/robinhood/android/charts/model/AxisRange;", "Lcom/robinhood/models/util/Money;", "min", "Lcom/robinhood/models/serverdriven/experimental/api/Money;", AnalyticsStrings.MAX_WELCOME_TAG, "<init>", "(Lcom/robinhood/models/serverdriven/experimental/api/Money;Lcom/robinhood/models/serverdriven/experimental/api/Money;)V", "getMin", "()Lcom/robinhood/models/serverdriven/experimental/api/Money;", "getMax", "getValueByNormalizedValue", "normalizedValue", "", "getLabelByNormalizedValue", "", "isWithinRange", "", "value", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "lib-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class MoneyAxisRange implements AxisRange<Money> {
        public static final int $stable = 8;
        private final com.robinhood.models.serverdriven.experimental.api.Money max;
        private final com.robinhood.models.serverdriven.experimental.api.Money min;

        public static /* synthetic */ MoneyAxisRange copy$default(MoneyAxisRange moneyAxisRange, com.robinhood.models.serverdriven.experimental.api.Money money, com.robinhood.models.serverdriven.experimental.api.Money money2, int i, Object obj) {
            if ((i & 1) != 0) {
                money = moneyAxisRange.min;
            }
            if ((i & 2) != 0) {
                money2 = moneyAxisRange.max;
            }
            return moneyAxisRange.copy(money, money2);
        }

        /* renamed from: component1, reason: from getter */
        public final com.robinhood.models.serverdriven.experimental.api.Money getMin() {
            return this.min;
        }

        /* renamed from: component2, reason: from getter */
        public final com.robinhood.models.serverdriven.experimental.api.Money getMax() {
            return this.max;
        }

        public final MoneyAxisRange copy(com.robinhood.models.serverdriven.experimental.api.Money min, com.robinhood.models.serverdriven.experimental.api.Money max) {
            Intrinsics.checkNotNullParameter(min, "min");
            Intrinsics.checkNotNullParameter(max, "max");
            return new MoneyAxisRange(min, max);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MoneyAxisRange)) {
                return false;
            }
            MoneyAxisRange moneyAxisRange = (MoneyAxisRange) other;
            return Intrinsics.areEqual(this.min, moneyAxisRange.min) && Intrinsics.areEqual(this.max, moneyAxisRange.max);
        }

        public int hashCode() {
            return (this.min.hashCode() * 31) + this.max.hashCode();
        }

        public String toString() {
            return "MoneyAxisRange(min=" + this.min + ", max=" + this.max + ")";
        }

        public MoneyAxisRange(com.robinhood.models.serverdriven.experimental.api.Money min, com.robinhood.models.serverdriven.experimental.api.Money max) {
            Intrinsics.checkNotNullParameter(min, "min");
            Intrinsics.checkNotNullParameter(max, "max");
            this.min = min;
            this.max = max;
        }

        public final com.robinhood.models.serverdriven.experimental.api.Money getMin() {
            return this.min;
        }

        public final com.robinhood.models.serverdriven.experimental.api.Money getMax() {
            return this.max;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.robinhood.android.charts.model.AxisRange
        public Money getValueByNormalizedValue(float normalizedValue) {
            Money money = AxisKt.toMoney(this.min);
            return money.plus(AxisKt.toMoney(this.max).minus(money).times(new BigDecimal(String.valueOf(normalizedValue))));
        }

        @Override // com.robinhood.android.charts.model.AxisRange
        public String getLabelByNormalizedValue(float normalizedValue) {
            return Money.format$default(getValueByNormalizedValue(normalizedValue), null, false, null, false, 0, null, false, null, false, false, 1023, null);
        }

        @Override // com.robinhood.android.charts.model.AxisRange
        public boolean isWithinRange(Money value) {
            Intrinsics.checkNotNullParameter(value, "value");
            BigDecimal decimalValue = AxisKt.toMoney(this.min).getDecimalValue();
            BigDecimal decimalValue2 = AxisKt.toMoney(this.max).getDecimalValue();
            BigDecimal decimalValue3 = value.getDecimalValue();
            return decimalValue3.compareTo(decimalValue) >= 0 && decimalValue3.compareTo(decimalValue2) <= 0;
        }
    }

    /* compiled from: Axis.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0002H\u0016J\t\u0010\u0012\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/charts/model/AxisRange$UnitlessAxisRange;", "Lcom/robinhood/android/charts/model/AxisRange;", "", "min", AnalyticsStrings.MAX_WELCOME_TAG, "<init>", "(FF)V", "getMin", "()F", "getMax", "getValueByNormalizedValue", "normalizedValue", "(F)Ljava/lang/Float;", "getLabelByNormalizedValue", "", "isWithinRange", "", "value", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "lib-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class UnitlessAxisRange implements AxisRange<Float> {
        public static final int $stable = 0;
        private final float max;
        private final float min;

        public static /* synthetic */ UnitlessAxisRange copy$default(UnitlessAxisRange unitlessAxisRange, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = unitlessAxisRange.min;
            }
            if ((i & 2) != 0) {
                f2 = unitlessAxisRange.max;
            }
            return unitlessAxisRange.copy(f, f2);
        }

        /* renamed from: component1, reason: from getter */
        public final float getMin() {
            return this.min;
        }

        /* renamed from: component2, reason: from getter */
        public final float getMax() {
            return this.max;
        }

        public final UnitlessAxisRange copy(float min, float max) {
            return new UnitlessAxisRange(min, max);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UnitlessAxisRange)) {
                return false;
            }
            UnitlessAxisRange unitlessAxisRange = (UnitlessAxisRange) other;
            return Float.compare(this.min, unitlessAxisRange.min) == 0 && Float.compare(this.max, unitlessAxisRange.max) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.min) * 31) + Float.hashCode(this.max);
        }

        public String toString() {
            return "UnitlessAxisRange(min=" + this.min + ", max=" + this.max + ")";
        }

        public UnitlessAxisRange(float f, float f2) {
            this.min = f;
            this.max = f2;
        }

        @Override // com.robinhood.android.charts.model.AxisRange
        public /* bridge */ /* synthetic */ boolean isWithinRange(Float f) {
            return isWithinRange(f.floatValue());
        }

        public final float getMin() {
            return this.min;
        }

        public final float getMax() {
            return this.max;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.robinhood.android.charts.model.AxisRange
        public Float getValueByNormalizedValue(float normalizedValue) {
            float f = this.min;
            return Float.valueOf(f + ((this.max - f) * normalizedValue));
        }

        @Override // com.robinhood.android.charts.model.AxisRange
        public String getLabelByNormalizedValue(float normalizedValue) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("%.2f", Arrays.copyOf(new Object[]{getValueByNormalizedValue(normalizedValue)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str;
        }

        public boolean isWithinRange(float value) {
            return value <= this.max && this.min <= value;
        }
    }
}
