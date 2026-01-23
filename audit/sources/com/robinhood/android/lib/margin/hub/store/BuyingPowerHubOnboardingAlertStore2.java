package com.robinhood.android.lib.margin.hub.store;

import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.margin.hub.api.MarginHubApi;
import com.robinhood.android.lib.margin.hub.api.models.ApiBuyingPowerHubOnboardingAlert;
import com.robinhood.utils.Optional;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: BuyingPowerHubOnboardingAlertStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/lib/margin/hub/api/models/ApiBuyingPowerHubOnboardingAlert;", "accNum", "Lcom/robinhood/utils/Optional;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.lib.margin.hub.store.BuyingPowerHubOnboardingAlertStore$getEndpoint$1", m3645f = "BuyingPowerHubOnboardingAlertStore.kt", m3646l = {23, 24}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.lib.margin.hub.store.BuyingPowerHubOnboardingAlertStore$getEndpoint$1, reason: use source file name */
/* loaded from: classes8.dex */
final class BuyingPowerHubOnboardingAlertStore2 extends ContinuationImpl7 implements Function2<Optional<? extends String>, Continuation<? super ApiBuyingPowerHubOnboardingAlert>, Object> {
    final /* synthetic */ MarginHubApi $api;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BuyingPowerHubOnboardingAlertStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BuyingPowerHubOnboardingAlertStore2(BuyingPowerHubOnboardingAlertStore buyingPowerHubOnboardingAlertStore, MarginHubApi marginHubApi, Continuation<? super BuyingPowerHubOnboardingAlertStore2> continuation) {
        super(2, continuation);
        this.this$0 = buyingPowerHubOnboardingAlertStore;
        this.$api = marginHubApi;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BuyingPowerHubOnboardingAlertStore2 buyingPowerHubOnboardingAlertStore2 = new BuyingPowerHubOnboardingAlertStore2(this.this$0, this.$api, continuation);
        buyingPowerHubOnboardingAlertStore2.L$0 = obj;
        return buyingPowerHubOnboardingAlertStore2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Optional<String> optional, Continuation<? super ApiBuyingPowerHubOnboardingAlert> continuation) {
        return ((BuyingPowerHubOnboardingAlertStore2) create(optional, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Optional<? extends String> optional, Continuation<? super ApiBuyingPowerHubOnboardingAlert> continuation) {
        return invoke2((Optional<String>) optional, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        if (r5 == r0) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        Object buyingPowerHubOnboardingAlert;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            str = (String) ((Optional) this.L$0).getOrNull();
            if (str == null) {
                AccountProvider accountProvider = this.this$0.accountProvider;
                this.label = 1;
                obj = accountProvider.getIndividualAccountNumberForced(this);
            } else {
                MarginHubApi marginHubApi = this.$api;
                this.label = 2;
                buyingPowerHubOnboardingAlert = marginHubApi.getBuyingPowerHubOnboardingAlert(str, this);
                if (buyingPowerHubOnboardingAlert != coroutine_suspended) {
                    return buyingPowerHubOnboardingAlert;
                }
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        str = (String) obj;
        MarginHubApi marginHubApi2 = this.$api;
        this.label = 2;
        buyingPowerHubOnboardingAlert = marginHubApi2.getBuyingPowerHubOnboardingAlert(str, this);
        if (buyingPowerHubOnboardingAlert != coroutine_suspended) {
            return coroutine_suspended;
        }
    }
}
