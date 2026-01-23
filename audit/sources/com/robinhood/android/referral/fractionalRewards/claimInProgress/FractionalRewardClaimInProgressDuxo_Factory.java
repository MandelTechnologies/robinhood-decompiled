package com.robinhood.android.referral.fractionalRewards.claimInProgress;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.CardManager;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.identi.BaseSortingHatStore;
import com.robinhood.referral.api.RewardsApi;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FractionalRewardClaimInProgressDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/referral/fractionalRewards/claimInProgress/FractionalRewardClaimInProgressDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/referral/fractionalRewards/claimInProgress/FractionalRewardClaimInProgressDuxo;", "rewardsApi", "Ljavax/inject/Provider;", "Lcom/robinhood/referral/api/RewardsApi;", "cardManager", "Lcom/robinhood/android/common/util/CardManager;", "sortingHatStore", "Lcom/robinhood/librobinhood/data/store/identi/BaseSortingHatStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class FractionalRewardClaimInProgressDuxo_Factory implements Factory<FractionalRewardClaimInProgressDuxo> {
    private final Provider<CardManager> cardManager;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<RewardsApi> rewardsApi;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<BaseSortingHatStore> sortingHatStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final FractionalRewardClaimInProgressDuxo_Factory create(Provider<RewardsApi> provider, Provider<CardManager> provider2, Provider<BaseSortingHatStore> provider3, Provider<SavedStateHandle> provider4, Provider<DuxoBundle> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final FractionalRewardClaimInProgressDuxo newInstance(RewardsApi rewardsApi, CardManager cardManager, BaseSortingHatStore baseSortingHatStore, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(rewardsApi, cardManager, baseSortingHatStore, savedStateHandle, duxoBundle);
    }

    public FractionalRewardClaimInProgressDuxo_Factory(Provider<RewardsApi> rewardsApi, Provider<CardManager> cardManager, Provider<BaseSortingHatStore> sortingHatStore, Provider<SavedStateHandle> savedStateHandle, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(rewardsApi, "rewardsApi");
        Intrinsics.checkNotNullParameter(cardManager, "cardManager");
        Intrinsics.checkNotNullParameter(sortingHatStore, "sortingHatStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.rewardsApi = rewardsApi;
        this.cardManager = cardManager;
        this.sortingHatStore = sortingHatStore;
        this.savedStateHandle = savedStateHandle;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public FractionalRewardClaimInProgressDuxo get() {
        Companion companion = INSTANCE;
        RewardsApi rewardsApi = this.rewardsApi.get();
        Intrinsics.checkNotNullExpressionValue(rewardsApi, "get(...)");
        CardManager cardManager = this.cardManager.get();
        Intrinsics.checkNotNullExpressionValue(cardManager, "get(...)");
        BaseSortingHatStore baseSortingHatStore = this.sortingHatStore.get();
        Intrinsics.checkNotNullExpressionValue(baseSortingHatStore, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(rewardsApi, cardManager, baseSortingHatStore, savedStateHandle, duxoBundle);
    }

    /* compiled from: FractionalRewardClaimInProgressDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JN\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007H\u0007J0\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/referral/fractionalRewards/claimInProgress/FractionalRewardClaimInProgressDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/referral/fractionalRewards/claimInProgress/FractionalRewardClaimInProgressDuxo_Factory;", "rewardsApi", "Ljavax/inject/Provider;", "Lcom/robinhood/referral/api/RewardsApi;", "cardManager", "Lcom/robinhood/android/common/util/CardManager;", "sortingHatStore", "Lcom/robinhood/librobinhood/data/store/identi/BaseSortingHatStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/referral/fractionalRewards/claimInProgress/FractionalRewardClaimInProgressDuxo;", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final FractionalRewardClaimInProgressDuxo_Factory create(Provider<RewardsApi> rewardsApi, Provider<CardManager> cardManager, Provider<BaseSortingHatStore> sortingHatStore, Provider<SavedStateHandle> savedStateHandle, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(rewardsApi, "rewardsApi");
            Intrinsics.checkNotNullParameter(cardManager, "cardManager");
            Intrinsics.checkNotNullParameter(sortingHatStore, "sortingHatStore");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new FractionalRewardClaimInProgressDuxo_Factory(rewardsApi, cardManager, sortingHatStore, savedStateHandle, duxoBundle);
        }

        @JvmStatic
        public final FractionalRewardClaimInProgressDuxo newInstance(RewardsApi rewardsApi, CardManager cardManager, BaseSortingHatStore sortingHatStore, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(rewardsApi, "rewardsApi");
            Intrinsics.checkNotNullParameter(cardManager, "cardManager");
            Intrinsics.checkNotNullParameter(sortingHatStore, "sortingHatStore");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new FractionalRewardClaimInProgressDuxo(rewardsApi, cardManager, sortingHatStore, savedStateHandle, duxoBundle);
        }
    }
}
