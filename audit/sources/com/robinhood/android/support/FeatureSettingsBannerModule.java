package com.robinhood.android.support;

import com.robinhood.android.common.banner.BannerProvider;
import com.robinhood.android.history.p153ui.MerchantRewardDetailComposable;
import com.robinhood.android.support.call.banner.SupportCallBannerProvider;
import kotlin.Metadata;

/* compiled from: FeatureSettingsBannerModule.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H'¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/support/FeatureSettingsBannerModule;", "", "<init>", "()V", "supportCallBannerProvider", "Lcom/robinhood/android/common/banner/BannerProvider;", MerchantRewardDetailComposable.BANNER_TEST_TAG, "Lcom/robinhood/android/support/call/banner/SupportCallBannerProvider;", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public abstract class FeatureSettingsBannerModule {
    public static final int $stable = 0;

    public abstract BannerProvider supportCallBannerProvider(SupportCallBannerProvider banner);
}
