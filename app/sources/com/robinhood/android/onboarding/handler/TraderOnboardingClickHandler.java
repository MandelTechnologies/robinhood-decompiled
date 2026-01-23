package com.robinhood.android.onboarding.handler;

import androidx.fragment.app.Fragment;
import com.robinhood.android.common.util.CardManager;
import com.robinhood.librobinhood.data.store.identi.BaseSortingHatStore;
import com.robinhood.shared.onboarding.handler.OnboardingClickHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TraderOnboardingClickHandler.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/onboarding/handler/TraderOnboardingClickHandler;", "Lcom/robinhood/shared/onboarding/handler/OnboardingClickHandler;", "<init>", "()V", "onFinishDocUpload", "", "fragment", "Landroidx/fragment/app/Fragment;", "cardManager", "Lcom/robinhood/android/common/util/CardManager;", "sortingHatStore", "Lcom/robinhood/librobinhood/data/store/identi/BaseSortingHatStore;", "lib-onboarding-handler_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class TraderOnboardingClickHandler implements OnboardingClickHandler {
    public static final TraderOnboardingClickHandler INSTANCE = new TraderOnboardingClickHandler();

    private TraderOnboardingClickHandler() {
    }

    @Override // com.robinhood.shared.onboarding.handler.OnboardingClickHandler
    public void onFinishDocUpload(Fragment fragment, CardManager cardManager, BaseSortingHatStore sortingHatStore) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(cardManager, "cardManager");
        Intrinsics.checkNotNullParameter(sortingHatStore, "sortingHatStore");
        cardManager.invalidateCardsBestEffort();
        sortingHatStore.invalidateSortingHatCacheIfNeeded();
        sortingHatStore.refreshSortingHatForDocUploadBestEffort();
        fragment.requireActivity().finish();
    }
}
