package com.robinhood.android.trade.directipo.p260ui.order;

import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.trade.BaseOrderParentFragmentSingletons;
import com.robinhood.android.lib.trade.BaseOrderParentFragment_MembersInjector;
import com.robinhood.android.trade.directipo.pref.ShowDirectIpoOrderSplashPref;
import com.robinhood.android.trade.directipo.util.DirectIpoOrderSubmissionManager;
import com.robinhood.prefs.StringToBooleanMapPreference;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DirectIpoOrderParentFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderParentFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderParentFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "orderSingletons", "Lcom/robinhood/android/lib/trade/BaseOrderParentFragmentSingletons;", "showDirectIpoOrderSplashPref", "Lcom/robinhood/prefs/StringToBooleanMapPreference;", "orderManager", "Lcom/robinhood/android/trade/directipo/util/DirectIpoOrderSubmissionManager;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-lib-trade-direct-ipo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class DirectIpoOrderParentFragment_MembersInjector implements MembersInjector<DirectIpoOrderParentFragment> {
    private final Provider<DirectIpoOrderSubmissionManager> orderManager;
    private final Provider<BaseOrderParentFragmentSingletons> orderSingletons;
    private final Provider<StringToBooleanMapPreference> showDirectIpoOrderSplashPref;
    private final Provider<BaseFragmentSingletons> singletons;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<DirectIpoOrderParentFragment> create(Provider<BaseFragmentSingletons> provider, Provider<BaseOrderParentFragmentSingletons> provider2, Provider<StringToBooleanMapPreference> provider3, Provider<DirectIpoOrderSubmissionManager> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final void injectOrderManager(DirectIpoOrderParentFragment directIpoOrderParentFragment, DirectIpoOrderSubmissionManager directIpoOrderSubmissionManager) {
        INSTANCE.injectOrderManager(directIpoOrderParentFragment, directIpoOrderSubmissionManager);
    }

    @JvmStatic
    @ShowDirectIpoOrderSplashPref
    public static final void injectShowDirectIpoOrderSplashPref(DirectIpoOrderParentFragment directIpoOrderParentFragment, StringToBooleanMapPreference stringToBooleanMapPreference) {
        INSTANCE.injectShowDirectIpoOrderSplashPref(directIpoOrderParentFragment, stringToBooleanMapPreference);
    }

    public DirectIpoOrderParentFragment_MembersInjector(Provider<BaseFragmentSingletons> singletons, Provider<BaseOrderParentFragmentSingletons> orderSingletons, Provider<StringToBooleanMapPreference> showDirectIpoOrderSplashPref, Provider<DirectIpoOrderSubmissionManager> orderManager) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(orderSingletons, "orderSingletons");
        Intrinsics.checkNotNullParameter(showDirectIpoOrderSplashPref, "showDirectIpoOrderSplashPref");
        Intrinsics.checkNotNullParameter(orderManager, "orderManager");
        this.singletons = singletons;
        this.orderSingletons = orderSingletons;
        this.showDirectIpoOrderSplashPref = showDirectIpoOrderSplashPref;
        this.orderManager = orderManager;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(DirectIpoOrderParentFragment instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseFragment_MembersInjector.Companion companion = BaseFragment_MembersInjector.INSTANCE;
        BaseFragmentSingletons baseFragmentSingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseFragmentSingletons, "get(...)");
        companion.injectSingletons(instance, baseFragmentSingletons);
        BaseOrderParentFragment_MembersInjector.Companion companion2 = BaseOrderParentFragment_MembersInjector.INSTANCE;
        BaseOrderParentFragmentSingletons baseOrderParentFragmentSingletons = this.orderSingletons.get();
        Intrinsics.checkNotNullExpressionValue(baseOrderParentFragmentSingletons, "get(...)");
        companion2.injectOrderSingletons(instance, baseOrderParentFragmentSingletons);
        Companion companion3 = INSTANCE;
        StringToBooleanMapPreference stringToBooleanMapPreference = this.showDirectIpoOrderSplashPref.get();
        Intrinsics.checkNotNullExpressionValue(stringToBooleanMapPreference, "get(...)");
        companion3.injectShowDirectIpoOrderSplashPref(instance, stringToBooleanMapPreference);
        DirectIpoOrderSubmissionManager directIpoOrderSubmissionManager = this.orderManager.get();
        Intrinsics.checkNotNullExpressionValue(directIpoOrderSubmissionManager, "get(...)");
        companion3.injectOrderManager(instance, directIpoOrderSubmissionManager);
    }

    /* compiled from: DirectIpoOrderParentFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JF\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\bH\u0007J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderParentFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderParentFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "orderSingletons", "Lcom/robinhood/android/lib/trade/BaseOrderParentFragmentSingletons;", "showDirectIpoOrderSplashPref", "Lcom/robinhood/prefs/StringToBooleanMapPreference;", "orderManager", "Lcom/robinhood/android/trade/directipo/util/DirectIpoOrderSubmissionManager;", "injectShowDirectIpoOrderSplashPref", "", "instance", "injectOrderManager", "feature-lib-trade-direct-ipo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<DirectIpoOrderParentFragment> create(Provider<BaseFragmentSingletons> singletons, Provider<BaseOrderParentFragmentSingletons> orderSingletons, Provider<StringToBooleanMapPreference> showDirectIpoOrderSplashPref, Provider<DirectIpoOrderSubmissionManager> orderManager) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(orderSingletons, "orderSingletons");
            Intrinsics.checkNotNullParameter(showDirectIpoOrderSplashPref, "showDirectIpoOrderSplashPref");
            Intrinsics.checkNotNullParameter(orderManager, "orderManager");
            return new DirectIpoOrderParentFragment_MembersInjector(singletons, orderSingletons, showDirectIpoOrderSplashPref, orderManager);
        }

        @JvmStatic
        @ShowDirectIpoOrderSplashPref
        public final void injectShowDirectIpoOrderSplashPref(DirectIpoOrderParentFragment instance, StringToBooleanMapPreference showDirectIpoOrderSplashPref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(showDirectIpoOrderSplashPref, "showDirectIpoOrderSplashPref");
            instance.setShowDirectIpoOrderSplashPref(showDirectIpoOrderSplashPref);
        }

        @JvmStatic
        public final void injectOrderManager(DirectIpoOrderParentFragment instance, DirectIpoOrderSubmissionManager orderManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(orderManager, "orderManager");
            instance.setOrderManager(orderManager);
        }
    }
}
