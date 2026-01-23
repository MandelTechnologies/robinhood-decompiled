package com.robinhood.android.referral.rewardoffers.referralOffer.sdui;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.navigation.NavigationResolver;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Hammer_ReferralOfferV2SduiFragment_Companion_NavigationResolverModule_Provide_ReferralOfferV2SduiFragmentKeyFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0016J\b\u0010\b\u001a\u00020\u0000H\u0007J\u0013\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0007¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/referral/rewardoffers/referralOffer/sdui/Hammer_ReferralOfferV2SduiFragment_Companion_NavigationResolverModule_Provide_ReferralOfferV2SduiFragmentKeyFactory;", "Ldagger/internal/Factory;", "Lkotlin/Function0;", "Lcom/robinhood/android/navigation/NavigationResolver;", "Lkotlin/jvm/JvmSuppressWildcards;", "<init>", "()V", "get", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "provide_ReferralOfferV2SduiFragmentKey", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.referral.rewardoffers.referralOffer.sdui.Hammer_ReferralOfferV2SduiFragment_Companion_NavigationResolverModule_Provide_ReferralOfferV2SduiFragmentKeyFactory */
/* loaded from: classes5.dex */
public final class C26902xcb2e213f implements Factory<Function0<NavigationResolver>> {
    public static final int $stable = 0;
    public static final C26902xcb2e213f INSTANCE = new C26902xcb2e213f();

    private C26902xcb2e213f() {
    }

    @Override // javax.inject.Provider
    public Function0<NavigationResolver> get() {
        return provide_ReferralOfferV2SduiFragmentKey();
    }

    @JvmStatic
    public static final C26902xcb2e213f create() {
        return INSTANCE;
    }

    @JvmStatic
    public static final Function0<NavigationResolver> provide_ReferralOfferV2SduiFragmentKey() {
        Object objCheckNotNull = Preconditions.checkNotNull(C26901x4aab4541.INSTANCE.provide_ReferralOfferV2SduiFragmentKey(), "Cannot return null from a non-@Nullable @Provides method");
        Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
        return (Function0) objCheckNotNull;
    }
}
