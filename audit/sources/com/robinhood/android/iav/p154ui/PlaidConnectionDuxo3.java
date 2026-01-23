package com.robinhood.android.iav.p154ui;

import com.robinhood.android.api.gold.nativefunding.upsell.ApiGoldNativeFundingUpsell;
import com.robinhood.android.api.gold.nativefunding.upsell.GoldNativeFundingUpsellApi;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PlaidConnectionDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.iav.ui.PlaidConnectionDuxo$onCreate$2$2", m3645f = "PlaidConnectionDuxo.kt", m3646l = {53}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.iav.ui.PlaidConnectionDuxo$onCreate$2$2, reason: use source file name */
/* loaded from: classes10.dex */
final class PlaidConnectionDuxo3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PlaidConnectionDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlaidConnectionDuxo3(PlaidConnectionDuxo plaidConnectionDuxo, Continuation<? super PlaidConnectionDuxo3> continuation) {
        super(2, continuation);
        this.this$0 = plaidConnectionDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PlaidConnectionDuxo3 plaidConnectionDuxo3 = new PlaidConnectionDuxo3(this.this$0, continuation);
        plaidConnectionDuxo3.L$0 = obj;
        return plaidConnectionDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PlaidConnectionDuxo3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object objM28550constructorimpl;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        boolean z = true;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PlaidConnectionDuxo plaidConnectionDuxo = this.this$0;
                Result.Companion companion = Result.INSTANCE;
                GoldNativeFundingUpsellApi goldNativeFundingUpsellApi = plaidConnectionDuxo.goldNativeFundingUpsellApi;
                this.label = 1;
                obj = goldNativeFundingUpsellApi.getGoldNativeFundingUpsell(PlaidConnectionFragment.ONBOARDING_PLAID_CONNECTION_SOURCE, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            objM28550constructorimpl = Result.m28550constructorimpl((ApiGoldNativeFundingUpsell) obj);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m28555isFailureimpl(objM28550constructorimpl)) {
            objM28550constructorimpl = null;
        }
        ApiGoldNativeFundingUpsell apiGoldNativeFundingUpsell = (ApiGoldNativeFundingUpsell) objM28550constructorimpl;
        if ((apiGoldNativeFundingUpsell != null ? apiGoldNativeFundingUpsell.getEarnExtraDepositScreen() : null) == null) {
            if ((apiGoldNativeFundingUpsell != null ? apiGoldNativeFundingUpsell.getStartEarningDepositScreen() : null) == null) {
                z = false;
            }
        }
        this.this$0.applyMutation(new C184851(z, null));
        return Unit.INSTANCE;
    }

    /* compiled from: PlaidConnectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/iav/ui/PlaidConnectionDuxoDS;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.iav.ui.PlaidConnectionDuxo$onCreate$2$2$1", m3645f = "PlaidConnectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.iav.ui.PlaidConnectionDuxo$onCreate$2$2$1 */
    static final class C184851 extends ContinuationImpl7 implements Function2<PlaidConnectionDuxoDS, Continuation<? super PlaidConnectionDuxoDS>, Object> {
        final /* synthetic */ boolean $isOnboardingGoldUpsellAvailable;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C184851(boolean z, Continuation<? super C184851> continuation) {
            super(2, continuation);
            this.$isOnboardingGoldUpsellAvailable = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C184851 c184851 = new C184851(this.$isOnboardingGoldUpsellAvailable, continuation);
            c184851.L$0 = obj;
            return c184851;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PlaidConnectionDuxoDS plaidConnectionDuxoDS, Continuation<? super PlaidConnectionDuxoDS> continuation) {
            return ((C184851) create(plaidConnectionDuxoDS, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return PlaidConnectionDuxoDS.copy$default((PlaidConnectionDuxoDS) this.L$0, false, false, null, false, false, false, null, null, null, false, false, this.$isOnboardingGoldUpsellAvailable, 2047, null);
        }
    }
}
