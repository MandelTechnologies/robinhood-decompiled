package com.robinhood.android.cash.merchantrewards.p073ui;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.cash.merchantrewards.C10127R;
import com.robinhood.scarlet.ScarletOverlay;
import com.robinhood.scarlet.util.resource.DirectResourceReference;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.StyleResource;
import kotlin.Metadata;

/* compiled from: MerchantRewardsOverlay.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/cash/merchantrewards/ui/MerchantRewardsOverlay;", "Lcom/robinhood/scarlet/ScarletOverlay;", "<init>", "()V", "styleReference", "Lcom/robinhood/scarlet/util/resource/DirectResourceReference;", "Lcom/robinhood/scarlet/util/resource/StyleResource;", "getStyleReference", "()Lcom/robinhood/scarlet/util/resource/DirectResourceReference;", "priority", "", "getPriority", "()I", "feature-cash-merchant-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class MerchantRewardsOverlay implements ScarletOverlay {
    public static final MerchantRewardsOverlay INSTANCE = new MerchantRewardsOverlay();
    private static final DirectResourceReference<StyleResource> styleReference = new DirectResourceReference<>(ResourceType.STYLE.INSTANCE, C10127R.style.ThemeOverlay_Robinhood_MerchantRewards_Welcome);
    public static final int $stable = DirectResourceReference.$stable;

    @Override // com.robinhood.scarlet.ScarletOverlay
    public int getPriority() {
        return EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
    }

    private MerchantRewardsOverlay() {
    }

    @Override // com.robinhood.scarlet.ScarletOverlay
    public DirectResourceReference<StyleResource> getStyleReference() {
        return styleReference;
    }
}
