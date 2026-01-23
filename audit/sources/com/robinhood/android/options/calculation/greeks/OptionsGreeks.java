package com.robinhood.android.options.calculation.greeks;

import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsGreekAggregationCalculation.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/options/calculation/greeks/OptionsGreeks;", "", "delta", "Ljava/math/BigDecimal;", "gamma", "theta", "vega", "rho", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getDelta", "()Ljava/math/BigDecimal;", "getGamma", "getTheta", "getVega", "getRho", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-options-calculation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionsGreeks {
    public static final int $stable = 8;
    private final BigDecimal delta;
    private final BigDecimal gamma;
    private final BigDecimal rho;
    private final BigDecimal theta;
    private final BigDecimal vega;

    public static /* synthetic */ OptionsGreeks copy$default(OptionsGreeks optionsGreeks, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, int i, Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = optionsGreeks.delta;
        }
        if ((i & 2) != 0) {
            bigDecimal2 = optionsGreeks.gamma;
        }
        if ((i & 4) != 0) {
            bigDecimal3 = optionsGreeks.theta;
        }
        if ((i & 8) != 0) {
            bigDecimal4 = optionsGreeks.vega;
        }
        if ((i & 16) != 0) {
            bigDecimal5 = optionsGreeks.rho;
        }
        BigDecimal bigDecimal6 = bigDecimal5;
        BigDecimal bigDecimal7 = bigDecimal3;
        return optionsGreeks.copy(bigDecimal, bigDecimal2, bigDecimal7, bigDecimal4, bigDecimal6);
    }

    /* renamed from: component1, reason: from getter */
    public final BigDecimal getDelta() {
        return this.delta;
    }

    /* renamed from: component2, reason: from getter */
    public final BigDecimal getGamma() {
        return this.gamma;
    }

    /* renamed from: component3, reason: from getter */
    public final BigDecimal getTheta() {
        return this.theta;
    }

    /* renamed from: component4, reason: from getter */
    public final BigDecimal getVega() {
        return this.vega;
    }

    /* renamed from: component5, reason: from getter */
    public final BigDecimal getRho() {
        return this.rho;
    }

    public final OptionsGreeks copy(BigDecimal delta, BigDecimal gamma, BigDecimal theta, BigDecimal vega, BigDecimal rho) {
        return new OptionsGreeks(delta, gamma, theta, vega, rho);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionsGreeks)) {
            return false;
        }
        OptionsGreeks optionsGreeks = (OptionsGreeks) other;
        return Intrinsics.areEqual(this.delta, optionsGreeks.delta) && Intrinsics.areEqual(this.gamma, optionsGreeks.gamma) && Intrinsics.areEqual(this.theta, optionsGreeks.theta) && Intrinsics.areEqual(this.vega, optionsGreeks.vega) && Intrinsics.areEqual(this.rho, optionsGreeks.rho);
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.delta;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        BigDecimal bigDecimal2 = this.gamma;
        int iHashCode2 = (iHashCode + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.theta;
        int iHashCode3 = (iHashCode2 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.vega;
        int iHashCode4 = (iHashCode3 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.rho;
        return iHashCode4 + (bigDecimal5 != null ? bigDecimal5.hashCode() : 0);
    }

    public String toString() {
        return "OptionsGreeks(delta=" + this.delta + ", gamma=" + this.gamma + ", theta=" + this.theta + ", vega=" + this.vega + ", rho=" + this.rho + ")";
    }

    public OptionsGreeks(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5) {
        this.delta = bigDecimal;
        this.gamma = bigDecimal2;
        this.theta = bigDecimal3;
        this.vega = bigDecimal4;
        this.rho = bigDecimal5;
    }

    public final BigDecimal getDelta() {
        return this.delta;
    }

    public final BigDecimal getGamma() {
        return this.gamma;
    }

    public final BigDecimal getTheta() {
        return this.theta;
    }

    public final BigDecimal getVega() {
        return this.vega;
    }

    public final BigDecimal getRho() {
        return this.rho;
    }
}
