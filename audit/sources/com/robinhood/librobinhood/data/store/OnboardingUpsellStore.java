package com.robinhood.librobinhood.data.store;

import com.robinhood.android.api.onboarding.upsell.OnboardingUpsellApi;
import com.robinhood.models.onboardingupsell.ApiOnboardingUpsellFlow;
import com.robinhood.prefs.Installation;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OnboardingUpsellStore.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\"\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0086@¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OnboardingUpsellStore;", "Lcom/robinhood/store/Store;", "onboardingUpsellApi", "Lcom/robinhood/android/api/onboarding/upsell/OnboardingUpsellApi;", "installation", "Lcom/robinhood/prefs/Installation;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/api/onboarding/upsell/OnboardingUpsellApi;Lcom/robinhood/prefs/Installation;Lcom/robinhood/store/StoreBundle;)V", "getOnboardingUpsellFlow", "Lcom/robinhood/models/onboardingupsell/ApiOnboardingUpsellFlow;", "source", "", "amount", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-store-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class OnboardingUpsellStore extends Store {
    private final Installation installation;
    private final OnboardingUpsellApi onboardingUpsellApi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingUpsellStore(OnboardingUpsellApi onboardingUpsellApi, Installation installation, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(onboardingUpsellApi, "onboardingUpsellApi");
        Intrinsics.checkNotNullParameter(installation, "installation");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.onboardingUpsellApi = onboardingUpsellApi;
        this.installation = installation;
    }

    public static /* synthetic */ Object getOnboardingUpsellFlow$default(OnboardingUpsellStore onboardingUpsellStore, String str, String str2, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return onboardingUpsellStore.getOnboardingUpsellFlow(str, str2, continuation);
    }

    public final Object getOnboardingUpsellFlow(String str, String str2, Continuation<? super ApiOnboardingUpsellFlow> continuation) {
        return this.onboardingUpsellApi.getOnboardingUpsellFlow(str, str2, this.installation.mo2745id(), continuation);
    }
}
