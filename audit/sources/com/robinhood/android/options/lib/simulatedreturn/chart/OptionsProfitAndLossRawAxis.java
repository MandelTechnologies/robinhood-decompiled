package com.robinhood.android.options.lib.simulatedreturn.chart;

import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: OptionsProfitAndLossRawAxis.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossRawAxis;", "", "value", "Ljava/math/BigDecimal;", AnnotatedPrivateKey.LABEL, "", "<init>", "(Ljava/math/BigDecimal;Ljava/lang/String;)V", "getValue", "()Ljava/math/BigDecimal;", "getLabel", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionsProfitAndLossRawAxis {
    public static final int $stable = 8;
    private final String label;
    private final BigDecimal value;

    public static /* synthetic */ OptionsProfitAndLossRawAxis copy$default(OptionsProfitAndLossRawAxis optionsProfitAndLossRawAxis, BigDecimal bigDecimal, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = optionsProfitAndLossRawAxis.value;
        }
        if ((i & 2) != 0) {
            str = optionsProfitAndLossRawAxis.label;
        }
        return optionsProfitAndLossRawAxis.copy(bigDecimal, str);
    }

    /* renamed from: component1, reason: from getter */
    public final BigDecimal getValue() {
        return this.value;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    public final OptionsProfitAndLossRawAxis copy(BigDecimal value, String label) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(label, "label");
        return new OptionsProfitAndLossRawAxis(value, label);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionsProfitAndLossRawAxis)) {
            return false;
        }
        OptionsProfitAndLossRawAxis optionsProfitAndLossRawAxis = (OptionsProfitAndLossRawAxis) other;
        return Intrinsics.areEqual(this.value, optionsProfitAndLossRawAxis.value) && Intrinsics.areEqual(this.label, optionsProfitAndLossRawAxis.label);
    }

    public int hashCode() {
        return (this.value.hashCode() * 31) + this.label.hashCode();
    }

    public String toString() {
        return "OptionsProfitAndLossRawAxis(value=" + this.value + ", label=" + this.label + ")";
    }

    public OptionsProfitAndLossRawAxis(BigDecimal value, String label) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(label, "label");
        this.value = value;
        this.label = label;
    }

    public final BigDecimal getValue() {
        return this.value;
    }

    public final String getLabel() {
        return this.label;
    }
}
