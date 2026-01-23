package com.robinhood.android.equitytradeladder.extensions;

import com.robinhood.android.equitytradeladder.C15889R;
import com.robinhood.models.p320db.InstrumentBuyingPower;
import com.robinhood.models.util.Money;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InstrumentBuyingPower.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a,\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001¨\u0006\b"}, m3636d2 = {"generateBuyingPowerDisplay", "Lcom/robinhood/utils/resource/StringResource;", "Lcom/robinhood/models/db/InstrumentBuyingPower;", "shortingEnabled", "", "isShortPosition", "isLongPosition", "accountDisplayName", "feature-equity-trade-ladder_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equitytradeladder.extensions.InstrumentBuyingPowerKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class InstrumentBuyingPower2 {
    public static final StringResource generateBuyingPowerDisplay(InstrumentBuyingPower instrumentBuyingPower, boolean z, boolean z2, boolean z3, StringResource stringResource) {
        Intrinsics.checkNotNullParameter(instrumentBuyingPower, "<this>");
        Money shortSellingPower = instrumentBuyingPower.getShortSellingPower();
        Money buyingPowerAmount = instrumentBuyingPower.getBuyingPowerAmount();
        if (shortSellingPower != null && z && !Intrinsics.areEqual(shortSellingPower, buyingPowerAmount)) {
            return StringResource.INSTANCE.invoke(C15889R.string.trade_amount_bottom_sheet_account_dual_buying_power, stringResource, Money.format$default(buyingPowerAmount, null, false, null, false, 0, null, false, null, false, false, 1023, null), Money.format$default(shortSellingPower, null, false, null, false, 0, null, false, null, false, false, 1023, null));
        }
        if (z2 && shortSellingPower != null && z) {
            return StringResource.INSTANCE.invoke(C15889R.string.trade_amount_bottom_sheet_account_buying_power, stringResource, Money.format$default(shortSellingPower, null, false, null, false, 0, null, false, null, false, false, 1023, null));
        }
        if (z3) {
            return StringResource.INSTANCE.invoke(C15889R.string.trade_amount_bottom_sheet_account_buying_power, stringResource, Money.format$default(buyingPowerAmount, null, false, null, false, 0, null, false, null, false, false, 1023, null));
        }
        return StringResource.INSTANCE.invoke(C15889R.string.trade_amount_bottom_sheet_account_buying_power, stringResource, Money.format$default(buyingPowerAmount, null, false, null, false, 0, null, false, null, false, false, 1023, null));
    }
}
