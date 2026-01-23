package com.robinhood.android.history.p153ui;

import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.store.margin.MarginSubscriptionFeeStore;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarginSubscriptionFeeFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/history/ui/MarginSubscriptionFeeFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/history/ui/MarginSubscriptionFeeFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "marginSubscriptionFeeStore", "Lcom/robinhood/android/lib/store/margin/MarginSubscriptionFeeStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class MarginSubscriptionFeeFragment_MembersInjector implements MembersInjector<MarginSubscriptionFeeFragment> {
    private final Provider<MarginSubscriptionFeeStore> marginSubscriptionFeeStore;
    private final Provider<BaseFragmentSingletons> singletons;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<MarginSubscriptionFeeFragment> create(Provider<BaseFragmentSingletons> provider, Provider<MarginSubscriptionFeeStore> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final void injectMarginSubscriptionFeeStore(MarginSubscriptionFeeFragment marginSubscriptionFeeFragment, MarginSubscriptionFeeStore marginSubscriptionFeeStore) {
        INSTANCE.injectMarginSubscriptionFeeStore(marginSubscriptionFeeFragment, marginSubscriptionFeeStore);
    }

    public MarginSubscriptionFeeFragment_MembersInjector(Provider<BaseFragmentSingletons> singletons, Provider<MarginSubscriptionFeeStore> marginSubscriptionFeeStore) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(marginSubscriptionFeeStore, "marginSubscriptionFeeStore");
        this.singletons = singletons;
        this.marginSubscriptionFeeStore = marginSubscriptionFeeStore;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(MarginSubscriptionFeeFragment instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseFragment_MembersInjector.Companion companion = BaseFragment_MembersInjector.INSTANCE;
        BaseFragmentSingletons baseFragmentSingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseFragmentSingletons, "get(...)");
        companion.injectSingletons(instance, baseFragmentSingletons);
        Companion companion2 = INSTANCE;
        MarginSubscriptionFeeStore marginSubscriptionFeeStore = this.marginSubscriptionFeeStore.get();
        Intrinsics.checkNotNullExpressionValue(marginSubscriptionFeeStore, "get(...)");
        companion2.injectMarginSubscriptionFeeStore(instance, marginSubscriptionFeeStore);
    }

    /* compiled from: MarginSubscriptionFeeFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH\u0007J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/history/ui/MarginSubscriptionFeeFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/history/ui/MarginSubscriptionFeeFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "marginSubscriptionFeeStore", "Lcom/robinhood/android/lib/store/margin/MarginSubscriptionFeeStore;", "injectMarginSubscriptionFeeStore", "", "instance", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<MarginSubscriptionFeeFragment> create(Provider<BaseFragmentSingletons> singletons, Provider<MarginSubscriptionFeeStore> marginSubscriptionFeeStore) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(marginSubscriptionFeeStore, "marginSubscriptionFeeStore");
            return new MarginSubscriptionFeeFragment_MembersInjector(singletons, marginSubscriptionFeeStore);
        }

        @JvmStatic
        public final void injectMarginSubscriptionFeeStore(MarginSubscriptionFeeFragment instance, MarginSubscriptionFeeStore marginSubscriptionFeeStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(marginSubscriptionFeeStore, "marginSubscriptionFeeStore");
            instance.setMarginSubscriptionFeeStore(marginSubscriptionFeeStore);
        }
    }
}
