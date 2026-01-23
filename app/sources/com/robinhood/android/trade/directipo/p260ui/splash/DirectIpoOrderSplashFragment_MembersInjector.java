package com.robinhood.android.trade.directipo.p260ui.splash;

import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.trade.directipo.pref.ShowDirectIpoOrderSplashPref;
import com.robinhood.librobinhood.data.store.bonfire.DirectIpoOrderEntryIntroStore;
import com.robinhood.prefs.StringToBooleanMapPreference;
import dagger.MembersInjector;
import io.noties.markwon.Markwon;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DirectIpoOrderSplashFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/trade/directipo/ui/splash/DirectIpoOrderSplashFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/trade/directipo/ui/splash/DirectIpoOrderSplashFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "showDirectIpoOrderSplashPref", "Lcom/robinhood/prefs/StringToBooleanMapPreference;", "directIpoOrderEntryIntroStore", "Lcom/robinhood/librobinhood/data/store/bonfire/DirectIpoOrderEntryIntroStore;", "markwon", "Lio/noties/markwon/Markwon;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-lib-trade-direct-ipo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class DirectIpoOrderSplashFragment_MembersInjector implements MembersInjector<DirectIpoOrderSplashFragment> {
    private final Provider<DirectIpoOrderEntryIntroStore> directIpoOrderEntryIntroStore;
    private final Provider<Markwon> markwon;
    private final Provider<StringToBooleanMapPreference> showDirectIpoOrderSplashPref;
    private final Provider<BaseFragmentSingletons> singletons;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<DirectIpoOrderSplashFragment> create(Provider<BaseFragmentSingletons> provider, Provider<StringToBooleanMapPreference> provider2, Provider<DirectIpoOrderEntryIntroStore> provider3, Provider<Markwon> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final void injectDirectIpoOrderEntryIntroStore(DirectIpoOrderSplashFragment directIpoOrderSplashFragment, DirectIpoOrderEntryIntroStore directIpoOrderEntryIntroStore) {
        INSTANCE.injectDirectIpoOrderEntryIntroStore(directIpoOrderSplashFragment, directIpoOrderEntryIntroStore);
    }

    @JvmStatic
    public static final void injectMarkwon(DirectIpoOrderSplashFragment directIpoOrderSplashFragment, Markwon markwon) {
        INSTANCE.injectMarkwon(directIpoOrderSplashFragment, markwon);
    }

    @JvmStatic
    @ShowDirectIpoOrderSplashPref
    public static final void injectShowDirectIpoOrderSplashPref(DirectIpoOrderSplashFragment directIpoOrderSplashFragment, StringToBooleanMapPreference stringToBooleanMapPreference) {
        INSTANCE.injectShowDirectIpoOrderSplashPref(directIpoOrderSplashFragment, stringToBooleanMapPreference);
    }

    public DirectIpoOrderSplashFragment_MembersInjector(Provider<BaseFragmentSingletons> singletons, Provider<StringToBooleanMapPreference> showDirectIpoOrderSplashPref, Provider<DirectIpoOrderEntryIntroStore> directIpoOrderEntryIntroStore, Provider<Markwon> markwon) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(showDirectIpoOrderSplashPref, "showDirectIpoOrderSplashPref");
        Intrinsics.checkNotNullParameter(directIpoOrderEntryIntroStore, "directIpoOrderEntryIntroStore");
        Intrinsics.checkNotNullParameter(markwon, "markwon");
        this.singletons = singletons;
        this.showDirectIpoOrderSplashPref = showDirectIpoOrderSplashPref;
        this.directIpoOrderEntryIntroStore = directIpoOrderEntryIntroStore;
        this.markwon = markwon;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(DirectIpoOrderSplashFragment instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseFragment_MembersInjector.Companion companion = BaseFragment_MembersInjector.INSTANCE;
        BaseFragmentSingletons baseFragmentSingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseFragmentSingletons, "get(...)");
        companion.injectSingletons(instance, baseFragmentSingletons);
        Companion companion2 = INSTANCE;
        StringToBooleanMapPreference stringToBooleanMapPreference = this.showDirectIpoOrderSplashPref.get();
        Intrinsics.checkNotNullExpressionValue(stringToBooleanMapPreference, "get(...)");
        companion2.injectShowDirectIpoOrderSplashPref(instance, stringToBooleanMapPreference);
        DirectIpoOrderEntryIntroStore directIpoOrderEntryIntroStore = this.directIpoOrderEntryIntroStore.get();
        Intrinsics.checkNotNullExpressionValue(directIpoOrderEntryIntroStore, "get(...)");
        companion2.injectDirectIpoOrderEntryIntroStore(instance, directIpoOrderEntryIntroStore);
        Markwon markwon = this.markwon.get();
        Intrinsics.checkNotNullExpressionValue(markwon, "get(...)");
        companion2.injectMarkwon(instance, markwon);
    }

    /* compiled from: DirectIpoOrderSplashFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JF\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\bH\u0007J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/trade/directipo/ui/splash/DirectIpoOrderSplashFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/trade/directipo/ui/splash/DirectIpoOrderSplashFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "showDirectIpoOrderSplashPref", "Lcom/robinhood/prefs/StringToBooleanMapPreference;", "directIpoOrderEntryIntroStore", "Lcom/robinhood/librobinhood/data/store/bonfire/DirectIpoOrderEntryIntroStore;", "markwon", "Lio/noties/markwon/Markwon;", "injectShowDirectIpoOrderSplashPref", "", "instance", "injectDirectIpoOrderEntryIntroStore", "injectMarkwon", "feature-lib-trade-direct-ipo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<DirectIpoOrderSplashFragment> create(Provider<BaseFragmentSingletons> singletons, Provider<StringToBooleanMapPreference> showDirectIpoOrderSplashPref, Provider<DirectIpoOrderEntryIntroStore> directIpoOrderEntryIntroStore, Provider<Markwon> markwon) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(showDirectIpoOrderSplashPref, "showDirectIpoOrderSplashPref");
            Intrinsics.checkNotNullParameter(directIpoOrderEntryIntroStore, "directIpoOrderEntryIntroStore");
            Intrinsics.checkNotNullParameter(markwon, "markwon");
            return new DirectIpoOrderSplashFragment_MembersInjector(singletons, showDirectIpoOrderSplashPref, directIpoOrderEntryIntroStore, markwon);
        }

        @JvmStatic
        @ShowDirectIpoOrderSplashPref
        public final void injectShowDirectIpoOrderSplashPref(DirectIpoOrderSplashFragment instance, StringToBooleanMapPreference showDirectIpoOrderSplashPref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(showDirectIpoOrderSplashPref, "showDirectIpoOrderSplashPref");
            instance.setShowDirectIpoOrderSplashPref(showDirectIpoOrderSplashPref);
        }

        @JvmStatic
        public final void injectDirectIpoOrderEntryIntroStore(DirectIpoOrderSplashFragment instance, DirectIpoOrderEntryIntroStore directIpoOrderEntryIntroStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(directIpoOrderEntryIntroStore, "directIpoOrderEntryIntroStore");
            instance.setDirectIpoOrderEntryIntroStore(directIpoOrderEntryIntroStore);
        }

        @JvmStatic
        public final void injectMarkwon(DirectIpoOrderSplashFragment instance, Markwon markwon) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(markwon, "markwon");
            instance.setMarkwon(markwon);
        }
    }
}
