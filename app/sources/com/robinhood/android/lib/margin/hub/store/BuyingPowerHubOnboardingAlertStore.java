package com.robinhood.android.lib.margin.hub.store;

import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.margin.hub.api.MarginHubApi;
import com.robinhood.android.lib.margin.hub.api.models.ApiBuyingPowerHubOnboardingAlert;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BuyingPowerHubOnboardingAlertStore.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\rH\u0086@¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u000e0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/lib/margin/hub/store/BuyingPowerHubOnboardingAlertStore;", "Lcom/robinhood/store/Store;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "api", "Lcom/robinhood/android/lib/margin/hub/api/MarginHubApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/android/lib/margin/hub/api/MarginHubApi;Lcom/robinhood/store/StoreBundle;)V", "getEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/utils/Optional;", "", "Lcom/robinhood/android/lib/margin/hub/api/models/ApiBuyingPowerHubOnboardingAlert;", "getOnboardingAlert", "accountNumber", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-margin-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class BuyingPowerHubOnboardingAlertStore extends Store {
    private final AccountProvider accountProvider;
    private final Endpoint<Optional<String>, ApiBuyingPowerHubOnboardingAlert> getEndpoint;

    /* compiled from: BuyingPowerHubOnboardingAlertStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.lib.margin.hub.store.BuyingPowerHubOnboardingAlertStore", m3645f = "BuyingPowerHubOnboardingAlertStore.kt", m3646l = {33}, m3647m = "getOnboardingAlert")
    /* renamed from: com.robinhood.android.lib.margin.hub.store.BuyingPowerHubOnboardingAlertStore$getOnboardingAlert$1 */
    static final class C203291 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C203291(Continuation<? super C203291> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BuyingPowerHubOnboardingAlertStore.this.getOnboardingAlert(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyingPowerHubOnboardingAlertStore(AccountProvider accountProvider, MarginHubApi api, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.accountProvider = accountProvider;
        this.getEndpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new BuyingPowerHubOnboardingAlertStore2(this, api, null), getLogoutKillswitch(), new BuyingPowerHubOnboardingAlertStore3(null), storeBundle.getClock(), null, 16, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getOnboardingAlert(String str, Continuation<? super ApiBuyingPowerHubOnboardingAlert> continuation) {
        C203291 c203291;
        if (continuation instanceof C203291) {
            c203291 = (C203291) continuation;
            int i = c203291.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c203291.label = i - Integer.MIN_VALUE;
            } else {
                c203291 = new C203291(continuation);
            }
        }
        C203291 c2032912 = c203291;
        Object objFetch$default = c2032912.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c2032912.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objFetch$default);
                Endpoint<Optional<String>, ApiBuyingPowerHubOnboardingAlert> endpoint = this.getEndpoint;
                Optional optionalAsOptional = Optional3.asOptional(str);
                c2032912.label = 1;
                objFetch$default = Endpoint.DefaultImpls.fetch$default(endpoint, optionalAsOptional, null, c2032912, 2, null);
                if (objFetch$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objFetch$default);
            }
            return (ApiBuyingPowerHubOnboardingAlert) objFetch$default;
        } catch (Exception unused) {
            return null;
        }
    }
}
