package com.robinhood.android.rhy.referral.fund.splash;

import android.R;
import android.content.res.Resources;
import androidx.appcompat.R$attr;
import com.robinhood.android.common.p088ui.daynight.DayNightChanges;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyReferralFundSplashFragment.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0004"}, m3636d2 = {"setToolbarStyle", "", "Lcom/robinhood/android/rhy/referral/fund/splash/RhyReferralFundSplashFragment;", "removeToolbarStyle", "feature-rhy-referral_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.rhy.referral.fund.splash.RhyReferralFundSplashFragmentKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class RhyReferralFundSplashFragment4 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void setToolbarStyle(RhyReferralFundSplashFragment rhyReferralFundSplashFragment) {
        int i;
        if (DayNightChanges.isDay(ScarletManager2.getScarletManager(rhyReferralFundSplashFragment.requireToolbar()))) {
            i = C20690R.color.mobius_x_ray_light_day;
        } else {
            i = C20690R.color.mobius_x_ray_light_night;
        }
        rhyReferralFundSplashFragment.requireBaseActivity().overrideStatusBarStyle(true);
        RhToolbar rhToolbarRequireToolbar = rhyReferralFundSplashFragment.requireToolbar();
        ResourceReferences4.Companion companion = ResourceReferences4.INSTANCE;
        Resources resources = rhyReferralFundSplashFragment.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        ScarletManager2.overrideAttribute(rhToolbarRequireToolbar, R.attr.backgroundTint, companion.from(resources, ResourceType.COLOR.INSTANCE, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeToolbarStyle(RhyReferralFundSplashFragment rhyReferralFundSplashFragment) {
        rhyReferralFundSplashFragment.requireBaseActivity().resetStatusBarStyleOverride();
        ScarletManager2.overrideAttribute(rhyReferralFundSplashFragment.requireToolbar(), R.attr.backgroundTint, new ThemedResourceReference(ResourceType.COLOR.INSTANCE, R$attr.backgroundTint));
    }
}
