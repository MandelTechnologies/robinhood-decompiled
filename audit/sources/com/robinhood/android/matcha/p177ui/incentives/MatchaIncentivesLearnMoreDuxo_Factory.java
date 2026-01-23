package com.robinhood.android.matcha.p177ui.incentives;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.store.matcha.MatchaIncentivesSummaryStore;
import com.robinhood.android.udf.DuxoBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchaIncentivesLearnMoreDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/incentives/MatchaIncentivesLearnMoreDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/matcha/ui/incentives/MatchaIncentivesLearnMoreDuxo;", "matchaIncentivesSummaryStore", "Ljavax/inject/Provider;", "Lcom/robinhood/android/store/matcha/MatchaIncentivesSummaryStore;", "stateProvider", "Lcom/robinhood/android/matcha/ui/incentives/MatchaIncentivesLearnMoreStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class MatchaIncentivesLearnMoreDuxo_Factory implements Factory<MatchaIncentivesLearnMoreDuxo> {
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<MatchaIncentivesSummaryStore> matchaIncentivesSummaryStore;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<MatchaIncentivesLearnMoreStateProvider> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MatchaIncentivesLearnMoreDuxo_Factory create(Provider<MatchaIncentivesSummaryStore> provider, Provider<MatchaIncentivesLearnMoreStateProvider> provider2, Provider<DuxoBundle> provider3, Provider<SavedStateHandle> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final MatchaIncentivesLearnMoreDuxo newInstance(MatchaIncentivesSummaryStore matchaIncentivesSummaryStore, MatchaIncentivesLearnMoreStateProvider matchaIncentivesLearnMoreStateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(matchaIncentivesSummaryStore, matchaIncentivesLearnMoreStateProvider, duxoBundle, savedStateHandle);
    }

    public MatchaIncentivesLearnMoreDuxo_Factory(Provider<MatchaIncentivesSummaryStore> matchaIncentivesSummaryStore, Provider<MatchaIncentivesLearnMoreStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
        Intrinsics.checkNotNullParameter(matchaIncentivesSummaryStore, "matchaIncentivesSummaryStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.matchaIncentivesSummaryStore = matchaIncentivesSummaryStore;
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // javax.inject.Provider
    public MatchaIncentivesLearnMoreDuxo get() {
        Companion companion = INSTANCE;
        MatchaIncentivesSummaryStore matchaIncentivesSummaryStore = this.matchaIncentivesSummaryStore.get();
        Intrinsics.checkNotNullExpressionValue(matchaIncentivesSummaryStore, "get(...)");
        MatchaIncentivesLearnMoreStateProvider matchaIncentivesLearnMoreStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(matchaIncentivesLearnMoreStateProvider, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        return companion.newInstance(matchaIncentivesSummaryStore, matchaIncentivesLearnMoreStateProvider, duxoBundle, savedStateHandle);
    }

    /* compiled from: MatchaIncentivesLearnMoreDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/incentives/MatchaIncentivesLearnMoreDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/matcha/ui/incentives/MatchaIncentivesLearnMoreDuxo_Factory;", "matchaIncentivesSummaryStore", "Ljavax/inject/Provider;", "Lcom/robinhood/android/store/matcha/MatchaIncentivesSummaryStore;", "stateProvider", "Lcom/robinhood/android/matcha/ui/incentives/MatchaIncentivesLearnMoreStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "newInstance", "Lcom/robinhood/android/matcha/ui/incentives/MatchaIncentivesLearnMoreDuxo;", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MatchaIncentivesLearnMoreDuxo_Factory create(Provider<MatchaIncentivesSummaryStore> matchaIncentivesSummaryStore, Provider<MatchaIncentivesLearnMoreStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
            Intrinsics.checkNotNullParameter(matchaIncentivesSummaryStore, "matchaIncentivesSummaryStore");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new MatchaIncentivesLearnMoreDuxo_Factory(matchaIncentivesSummaryStore, stateProvider, duxoBundle, savedStateHandle);
        }

        @JvmStatic
        public final MatchaIncentivesLearnMoreDuxo newInstance(MatchaIncentivesSummaryStore matchaIncentivesSummaryStore, MatchaIncentivesLearnMoreStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(matchaIncentivesSummaryStore, "matchaIncentivesSummaryStore");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new MatchaIncentivesLearnMoreDuxo(matchaIncentivesSummaryStore, stateProvider, duxoBundle, savedStateHandle);
        }
    }
}
