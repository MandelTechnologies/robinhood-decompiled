package com.robinhood.shared.iac.infobanner;

import com.robinhood.android.history.p153ui.MerchantRewardDetailComposable;
import com.robinhood.models.p320db.IacInfoBanner;
import kotlin.Metadata;

/* compiled from: InfoBannerCallbacks.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/shared/iac/infobanner/InfoBannerCallbacks;", "", "onClickInfoBanner", "", MerchantRewardDetailComposable.BANNER_TEST_TAG, "Lcom/robinhood/models/db/IacInfoBanner;", "onDismissInfoBanner", "lib-iac-info-banner_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface InfoBannerCallbacks {
    void onClickInfoBanner(IacInfoBanner banner);

    void onDismissInfoBanner(IacInfoBanner banner);
}
