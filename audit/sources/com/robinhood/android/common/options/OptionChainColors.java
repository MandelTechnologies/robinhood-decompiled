package com.robinhood.android.common.options;

import com.robinhood.android.designsystem.style.DirectionOverlay;
import kotlin.Metadata;

/* compiled from: OptionChainColors.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/common/options/OptionChainColors;", "", "<init>", "()V", "getDirectionOverlay", "Lcom/robinhood/android/designsystem/style/DirectionOverlay;", "isUnderlyingQuote", "", "isBullish", "feature-lib-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class OptionChainColors {
    public static final int $stable = 0;
    public static final OptionChainColors INSTANCE = new OptionChainColors();

    private OptionChainColors() {
    }

    public final DirectionOverlay getDirectionOverlay(boolean isUnderlyingQuote, boolean isBullish) {
        if (isBullish && isUnderlyingQuote) {
            return DirectionOverlay.POSITIVE;
        }
        if (isBullish && !isUnderlyingQuote) {
            return DirectionOverlay.NEGATIVE;
        }
        if (!isBullish && isUnderlyingQuote) {
            return DirectionOverlay.NEGATIVE;
        }
        if (!isBullish && !isUnderlyingQuote) {
            return DirectionOverlay.POSITIVE;
        }
        throw new AssertionError("All cases should have been covered");
    }
}
