package com.robinhood.shared.tradeladder.p398ui.ladder.math;

import kotlin.Metadata;

/* compiled from: QuantityFraction.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0002\u0003\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/shared/tradeladder/ui/ladder/math/QuantityFraction;", "", "Logarithmic", "Lcom/robinhood/shared/tradeladder/ui/ladder/math/AlphaFraction$PiecewiseLinear;", "Lcom/robinhood/shared/tradeladder/ui/ladder/math/QuantityFraction$Logarithmic;", "lib-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface QuantityFraction {

    /* compiled from: QuantityFraction.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0086\u0002J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u0007HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/shared/tradeladder/ui/ladder/math/QuantityFraction$Logarithmic;", "Lcom/robinhood/shared/tradeladder/ui/ladder/math/QuantityFraction;", "<init>", "()V", "invoke", "", "quantity", "", "maxQuantity", "equals", "", "other", "", "hashCode", "toString", "", "lib-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Logarithmic implements QuantityFraction {
        public static final int $stable = 0;
        public static final Logarithmic INSTANCE = new Logarithmic();

        public boolean equals(Object other) {
            return this == other || (other instanceof Logarithmic);
        }

        public int hashCode() {
            return -355647498;
        }

        public String toString() {
            return "Logarithmic";
        }

        private Logarithmic() {
        }

        public final float invoke(int quantity, int maxQuantity) {
            if (quantity <= 0 || maxQuantity <= 0) {
                return 0.0f;
            }
            if (quantity == maxQuantity) {
                return 1.0f;
            }
            try {
                float fLog10 = (float) Math.log10(quantity);
                float fLog102 = (float) Math.log10(maxQuantity);
                if (!Float.isNaN(fLog10) && !Float.isInfinite(fLog10) && !Float.isNaN(fLog102)) {
                    if (!Float.isInfinite(fLog102)) {
                        return fLog10 / fLog102;
                    }
                }
            } catch (Exception unused) {
            }
            return quantity / maxQuantity;
        }
    }
}
