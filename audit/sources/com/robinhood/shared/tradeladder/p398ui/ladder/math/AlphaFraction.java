package com.robinhood.shared.tradeladder.p398ui.ladder.math;

import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import kotlin.Metadata;

/* compiled from: AlphaFraction.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m3636d2 = {"Lcom/robinhood/shared/tradeladder/ui/ladder/math/AlphaFraction;", "", "PiecewiseLinear", "lib-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface AlphaFraction {

    /* compiled from: AlphaFraction.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0086\u0002J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\u0007HÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/shared/tradeladder/ui/ladder/math/AlphaFraction$PiecewiseLinear;", "Lcom/robinhood/shared/tradeladder/ui/ladder/math/QuantityFraction;", "<init>", "()V", "invoke", "", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "equals", "", "other", "", "hashCode", "toString", "", "lib-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PiecewiseLinear implements QuantityFraction {
        public static final int $stable = 0;
        public static final PiecewiseLinear INSTANCE = new PiecewiseLinear();

        public boolean equals(Object other) {
            return this == other || (other instanceof PiecewiseLinear);
        }

        public int hashCode() {
            return 1219493681;
        }

        public final float invoke(int index) {
            if (Integer.MIN_VALUE <= index && index < 0) {
                return 0.0f;
            }
            if (index < 0 || index >= 10) {
                return 0.1f;
            }
            return 1.0f - (index * 0.1f);
        }

        public String toString() {
            return "PiecewiseLinear";
        }

        private PiecewiseLinear() {
        }
    }
}
