package com.robinhood.librobinhood.data.store;

import com.robinhood.android.api.options.retrofit.OptionsBonfireApi;
import com.robinhood.librobinhood.data.prefs.HasShownOptionAlertOnboardingPref;
import com.robinhood.models.api.ApiToggleAllOptionsPriceMovementAlertsRequest;
import com.robinhood.models.api.ApiToggleAllOptionsPriceMovementAlertsRequest2;
import com.robinhood.models.api.ApiToggleAllOptionsPriceMovementAlertsResponse;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionAlertOnboardingStore.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u0015H\u0086@¢\u0006\u0002\u0010\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionAlertOnboardingStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "bonfireApi", "Lcom/robinhood/android/api/options/retrofit/OptionsBonfireApi;", "hasShownOptionAlertOnboarding", "Lcom/robinhood/prefs/BooleanPreference;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/android/api/options/retrofit/OptionsBonfireApi;Lcom/robinhood/prefs/BooleanPreference;)V", "shouldShowOptionAlertOnboarding", "Lio/reactivex/Observable;", "", "getShouldShowOptionAlertOnboarding", "()Lio/reactivex/Observable;", "hasShownOptionsAlertUpsell", "getHasShownOptionsAlertUpsell", "()Z", "markOptionAlertOnboardingShown", "", "turnOnAllOptionsPriceMovementAlerts", "Lcom/robinhood/models/api/ApiToggleAllOptionsPriceMovementAlertsResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class OptionAlertOnboardingStore extends Store {
    private final OptionsBonfireApi bonfireApi;
    private final BooleanPreference hasShownOptionAlertOnboarding;
    private final Observable<Boolean> shouldShowOptionAlertOnboarding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionAlertOnboardingStore(StoreBundle storeBundle, OptionsBonfireApi bonfireApi, @HasShownOptionAlertOnboardingPref BooleanPreference hasShownOptionAlertOnboarding) {
        super(storeBundle, OptionChain.INSTANCE);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(bonfireApi, "bonfireApi");
        Intrinsics.checkNotNullParameter(hasShownOptionAlertOnboarding, "hasShownOptionAlertOnboarding");
        this.bonfireApi = bonfireApi;
        this.hasShownOptionAlertOnboarding = hasShownOptionAlertOnboarding;
        Observable map = hasShownOptionAlertOnboarding.getChanges().map(new Function() { // from class: com.robinhood.librobinhood.data.store.OptionAlertOnboardingStore$shouldShowOptionAlertOnboarding$1
            @Override // io.reactivex.functions.Function
            public final Boolean apply(Boolean it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(!it.booleanValue());
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        this.shouldShowOptionAlertOnboarding = map;
    }

    public final Observable<Boolean> getShouldShowOptionAlertOnboarding() {
        return this.shouldShowOptionAlertOnboarding;
    }

    public final boolean getHasShownOptionsAlertUpsell() {
        return this.hasShownOptionAlertOnboarding.get();
    }

    public final void markOptionAlertOnboardingShown() {
        this.hasShownOptionAlertOnboarding.set(true);
    }

    public final Object turnOnAllOptionsPriceMovementAlerts(Continuation<? super ApiToggleAllOptionsPriceMovementAlertsResponse> continuation) {
        return this.bonfireApi.toggleAllOptionsPriceMovementAlerts(new ApiToggleAllOptionsPriceMovementAlertsRequest(ApiToggleAllOptionsPriceMovementAlertsRequest2.f5465ON), continuation);
    }
}
