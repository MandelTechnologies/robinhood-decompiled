package com.robinhood.shared.onboarding.handler;

import androidx.fragment.app.Fragment;
import com.robinhood.android.common.util.CardManager;
import com.robinhood.librobinhood.data.store.identi.BaseSortingHatStore;
import kotlin.Metadata;

/* compiled from: OnboardingClickHandler.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/onboarding/handler/OnboardingClickHandler;", "", "onFinishDocUpload", "", "fragment", "Landroidx/fragment/app/Fragment;", "cardManager", "Lcom/robinhood/android/common/util/CardManager;", "sortingHatStore", "Lcom/robinhood/librobinhood/data/store/identi/BaseSortingHatStore;", "lib-onboarding-handler_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface OnboardingClickHandler {
    void onFinishDocUpload(Fragment fragment, CardManager cardManager, BaseSortingHatStore sortingHatStore);
}
