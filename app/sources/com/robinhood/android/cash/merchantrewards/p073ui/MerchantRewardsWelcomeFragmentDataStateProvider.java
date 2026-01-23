package com.robinhood.android.cash.merchantrewards.p073ui;

import com.robinhood.android.udf.StateProvider;
import com.robinhood.contentful.markdown.MarkdownContent;
import com.robinhood.staticcontent.model.productmarketing.ProductMarketing;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MerchantRewardsWelcomeFragmentDataStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/cash/merchantrewards/ui/MerchantRewardsWelcomeFragmentDataStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/cash/merchantrewards/ui/MerchantRewardsWelcomeFragmentDataState;", "Lcom/robinhood/android/cash/merchantrewards/ui/MerchantRewardsWelcomeFragmentViewState;", "<init>", "()V", "reduce", "dataState", "feature-cash-merchant-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class MerchantRewardsWelcomeFragmentDataStateProvider implements StateProvider<MerchantRewardsWelcomeFragmentDataState, MerchantRewardsWelcomeFragmentViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public MerchantRewardsWelcomeFragmentViewState reduce(MerchantRewardsWelcomeFragmentDataState dataState) {
        ProductMarketing mainContent;
        ProductMarketing mainContent2;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        boolean z = false;
        boolean z2 = dataState.getMainContent() == null && !Intrinsics.areEqual(dataState.isTimedOut(), Boolean.TRUE);
        Boolean boolIsInP2pUpsellExperiment = dataState.isInP2pUpsellExperiment();
        Boolean bool = Boolean.TRUE;
        MarkdownContent productDescription = null;
        String pageTitle = (!Intrinsics.areEqual(boolIsInP2pUpsellExperiment, bool) || (mainContent2 = dataState.getMainContent()) == null) ? null : mainContent2.getPageTitle();
        if (Intrinsics.areEqual(dataState.isInP2pUpsellExperiment(), bool) && (mainContent = dataState.getMainContent()) != null) {
            productDescription = mainContent.getProductDescription();
        }
        MarkdownContent markdownContent = productDescription;
        if (dataState.getMinervaSpendingAccount() == null && dataState.getSpendingAccount() != null && Intrinsics.areEqual(dataState.isInP2pUpsellExperiment(), bool)) {
            z = true;
        }
        return new MerchantRewardsWelcomeFragmentViewState(Boolean.valueOf(z), z2, null, pageTitle, markdownContent, 4, null);
    }
}
