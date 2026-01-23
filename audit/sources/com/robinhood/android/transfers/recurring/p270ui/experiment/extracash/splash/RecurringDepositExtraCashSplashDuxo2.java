package com.robinhood.android.transfers.recurring.p270ui.experiment.extracash.splash;

import com.robinhood.android.gold.subscription.store.GoldSubscriptionStore;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: RecurringDepositExtraCashSplashDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/splash/RecurringDepositExtraCashSplashDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.transfers.recurring.ui.experiment.extracash.splash.RecurringDepositExtraCashSplashDuxo$onCreate$1$1", m3645f = "RecurringDepositExtraCashSplashDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.transfers.recurring.ui.experiment.extracash.splash.RecurringDepositExtraCashSplashDuxo$onCreate$1$1, reason: use source file name */
/* loaded from: classes9.dex */
final class RecurringDepositExtraCashSplashDuxo2 extends ContinuationImpl7 implements Function2<RecurringDepositExtraCashSplashDataState, Continuation<? super RecurringDepositExtraCashSplashDataState>, Object> {
    final /* synthetic */ GoldSubscriptionStore.GoldSubscriptionState $goldSubscriptionState;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RecurringDepositExtraCashSplashDuxo2(GoldSubscriptionStore.GoldSubscriptionState goldSubscriptionState, Continuation<? super RecurringDepositExtraCashSplashDuxo2> continuation) {
        super(2, continuation);
        this.$goldSubscriptionState = goldSubscriptionState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RecurringDepositExtraCashSplashDuxo2 recurringDepositExtraCashSplashDuxo2 = new RecurringDepositExtraCashSplashDuxo2(this.$goldSubscriptionState, continuation);
        recurringDepositExtraCashSplashDuxo2.L$0 = obj;
        return recurringDepositExtraCashSplashDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(RecurringDepositExtraCashSplashDataState recurringDepositExtraCashSplashDataState, Continuation<? super RecurringDepositExtraCashSplashDataState> continuation) {
        return ((RecurringDepositExtraCashSplashDuxo2) create(recurringDepositExtraCashSplashDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return RecurringDepositExtraCashSplashDataState.copy$default((RecurringDepositExtraCashSplashDataState) this.L$0, this.$goldSubscriptionState, null, 2, null);
    }
}
