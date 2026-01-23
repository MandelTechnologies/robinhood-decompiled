package com.robinhood.android.trade.directipo.validation;

import com.robinhood.android.lib.trade.validation.Validator;
import com.robinhood.librobinhood.data.prefs.HasConvertedToRhsPref;
import com.robinhood.prefs.BooleanPreference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DirectIpoOrderValidator.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/trade/directipo/validation/DirectIpoOrderValidator;", "Lcom/robinhood/android/lib/trade/validation/Validator;", "Lcom/robinhood/android/trade/directipo/validation/DirectIpoOrderContext;", "Lcom/robinhood/android/trade/directipo/validation/DirectIpoOrderFailureResolver;", "hasConvertedToRhsPref", "Lcom/robinhood/prefs/BooleanPreference;", "<init>", "(Lcom/robinhood/prefs/BooleanPreference;)V", "feature-lib-trade-direct-ipo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class DirectIpoOrderValidator extends Validator<DirectIpoOrderContext, DirectIpoOrderFailureResolver> {
    public static final int $stable = Validator.$stable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DirectIpoOrderValidator(@HasConvertedToRhsPref BooleanPreference hasConvertedToRhsPref) {
        super(DirectIpoSufficientBuyingPowerCheck.INSTANCE, new DirectIpoRhsConversionCheck(hasConvertedToRhsPref), DirectIpoCobCheck.INSTANCE, DirectIpoAggressiveLimitPriceCheck.INSTANCE);
        Intrinsics.checkNotNullParameter(hasConvertedToRhsPref, "hasConvertedToRhsPref");
    }
}
