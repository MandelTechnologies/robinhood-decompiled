package com.robinhood.android.rhyrewards.p246ui;

import android.content.res.Resources;
import com.adjust.sdk.network.ErrorCodes;
import com.robinhood.android.rhyrewards.C27650R;
import com.robinhood.models.p320db.mcduckling.MerchantOfferV2;
import com.robinhood.models.util.Money;
import kotlin.Metadata;

/* compiled from: MerchantRewardsOfferDetailsBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¨\u0006\u0005"}, m3636d2 = {"toV2", "Lcom/robinhood/models/db/mcduckling/MerchantOfferV2$DetailAsset$GaugeV2$GaugeMoney;", "Lcom/robinhood/models/db/mcduckling/MerchantOfferV2$DetailAsset$Gauge;", "resources", "Landroid/content/res/Resources;", "feature-lib-rhy-rewards_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsBottomSheetKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class MerchantRewardsOfferDetailsBottomSheet9 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final MerchantOfferV2.DetailAsset.GaugeV2.GaugeMoney toV2(MerchantOfferV2.DetailAsset.Gauge gauge, Resources resources) {
        return new MerchantOfferV2.DetailAsset.GaugeV2.GaugeMoney(gauge.getRedeemedChunks(), gauge.getPendingChunks(), gauge.getTotalChunks(), false, resources.getString(C27650R.string.cash_merchant_rewards_offer_gauge_content_subtitle_of_bonus, Money.format$default(gauge.getTotalMoney(), null, false, null, false, 0, null, false, null, false, false, ErrorCodes.IO_EXCEPTION, null)), gauge.getPendingChunks() > 0 ? resources.getString(C27650R.string.cash_merchant_rewards_offer_gauge_content_pending, Integer.valueOf(gauge.getPendingChunks())) : null, gauge.getRedeemedMoney());
    }
}
