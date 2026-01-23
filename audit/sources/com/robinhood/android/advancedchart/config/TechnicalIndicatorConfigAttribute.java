package com.robinhood.android.advancedchart.config;

import com.robinhood.shared.chart.contracts.advancedChart.AdvancedChartEditIndicatorLaunchMode;
import com.robinhood.shared.education.order.OrderTypeEducationLearnMoreFragment;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TechnicalIndicatorConfigAttribute.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001:\u0001#B!\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J'\u0010\u001e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001f\u001a\u00020\u00182\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000bR\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/advancedchart/config/TechnicalIndicatorConfigAttribute;", "", OrderTypeEducationLearnMoreFragment.ARG_TITLE_RES, "", "value", "Ljava/math/BigDecimal;", "type", "Lcom/robinhood/android/advancedchart/config/TechnicalIndicatorConfigAttribute$Type;", "<init>", "(ILjava/math/BigDecimal;Lcom/robinhood/android/advancedchart/config/TechnicalIndicatorConfigAttribute$Type;)V", "getTitleRes", "()I", "getValue", "()Ljava/math/BigDecimal;", "getType", "()Lcom/robinhood/android/advancedchart/config/TechnicalIndicatorConfigAttribute$Type;", "getHint", "", "launchMode", "Lcom/robinhood/shared/chart/contracts/advancedChart/AdvancedChartEditIndicatorLaunchMode;", "getFieldValue", "inputType", "getInputType", "delimiterEnabled", "", "getDelimiterEnabled", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "Type", "feature-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class TechnicalIndicatorConfigAttribute {
    public static final int $stable = 8;
    private final boolean delimiterEnabled;
    private final int inputType;
    private final int titleRes;
    private final Type type;
    private final BigDecimal value;

    /* compiled from: TechnicalIndicatorConfigAttribute.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Type.values().length];
            try {
                iArr[Type.INTEGER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Type.DECIMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ TechnicalIndicatorConfigAttribute copy$default(TechnicalIndicatorConfigAttribute technicalIndicatorConfigAttribute, int i, BigDecimal bigDecimal, Type type2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = technicalIndicatorConfigAttribute.titleRes;
        }
        if ((i2 & 2) != 0) {
            bigDecimal = technicalIndicatorConfigAttribute.value;
        }
        if ((i2 & 4) != 0) {
            type2 = technicalIndicatorConfigAttribute.type;
        }
        return technicalIndicatorConfigAttribute.copy(i, bigDecimal, type2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getTitleRes() {
        return this.titleRes;
    }

    /* renamed from: component2, reason: from getter */
    public final BigDecimal getValue() {
        return this.value;
    }

    /* renamed from: component3, reason: from getter */
    public final Type getType() {
        return this.type;
    }

    public final TechnicalIndicatorConfigAttribute copy(int titleRes, BigDecimal value, Type type2) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(type2, "type");
        return new TechnicalIndicatorConfigAttribute(titleRes, value, type2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TechnicalIndicatorConfigAttribute)) {
            return false;
        }
        TechnicalIndicatorConfigAttribute technicalIndicatorConfigAttribute = (TechnicalIndicatorConfigAttribute) other;
        return this.titleRes == technicalIndicatorConfigAttribute.titleRes && Intrinsics.areEqual(this.value, technicalIndicatorConfigAttribute.value) && this.type == technicalIndicatorConfigAttribute.type;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.titleRes) * 31) + this.value.hashCode()) * 31) + this.type.hashCode();
    }

    public String toString() {
        return "TechnicalIndicatorConfigAttribute(titleRes=" + this.titleRes + ", value=" + this.value + ", type=" + this.type + ")";
    }

    public TechnicalIndicatorConfigAttribute(int i, BigDecimal value, Type type2) {
        int i2;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(type2, "type");
        this.titleRes = i;
        this.value = value;
        this.type = type2;
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i3 = iArr[type2.ordinal()];
        boolean z = true;
        if (i3 == 1) {
            i2 = 2;
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = 8194;
        }
        this.inputType = i2;
        int i4 = iArr[type2.ordinal()];
        if (i4 == 1) {
            z = false;
        } else if (i4 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        this.delimiterEnabled = z;
    }

    public final int getTitleRes() {
        return this.titleRes;
    }

    public final BigDecimal getValue() {
        return this.value;
    }

    public final Type getType() {
        return this.type;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TechnicalIndicatorConfigAttribute.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advancedchart/config/TechnicalIndicatorConfigAttribute$Type;", "", "<init>", "(Ljava/lang/String;I)V", "INTEGER", "DECIMAL", "feature-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Type {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type INTEGER = new Type("INTEGER", 0);
        public static final Type DECIMAL = new Type("DECIMAL", 1);

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{INTEGER, DECIMAL};
        }

        public static EnumEntries<Type> getEntries() {
            return $ENTRIES;
        }

        static {
            Type[] typeArr$values = $values();
            $VALUES = typeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(typeArr$values);
        }

        private Type(String str, int i) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public final String getHint(AdvancedChartEditIndicatorLaunchMode launchMode) {
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        if (launchMode instanceof AdvancedChartEditIndicatorLaunchMode.Adding) {
            String string2 = this.value.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            return string2;
        }
        if (launchMode instanceof AdvancedChartEditIndicatorLaunchMode.Editing) {
            return "0";
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String getFieldValue(AdvancedChartEditIndicatorLaunchMode launchMode) {
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        if (launchMode instanceof AdvancedChartEditIndicatorLaunchMode.Adding) {
            return "";
        }
        if (!(launchMode instanceof AdvancedChartEditIndicatorLaunchMode.Editing)) {
            throw new NoWhenBranchMatchedException();
        }
        String string2 = this.value.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    public final int getInputType() {
        return this.inputType;
    }

    public final boolean getDelimiterEnabled() {
        return this.delimiterEnabled;
    }
}
