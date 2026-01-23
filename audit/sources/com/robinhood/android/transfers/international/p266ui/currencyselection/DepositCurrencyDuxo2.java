package com.robinhood.android.transfers.international.p266ui.currencyselection;

import com.robinhood.models.p320db.sheriff.User;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: DepositCurrencyDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/international/ui/currencyselection/DepositCurrencyDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.transfers.international.ui.currencyselection.DepositCurrencyDuxo$onStart$1$1", m3645f = "DepositCurrencyDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.transfers.international.ui.currencyselection.DepositCurrencyDuxo$onStart$1$1, reason: use source file name */
/* loaded from: classes9.dex */
final class DepositCurrencyDuxo2 extends ContinuationImpl7 implements Function2<DepositCurrencyDataState, Continuation<? super DepositCurrencyDataState>, Object> {
    final /* synthetic */ User $it;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DepositCurrencyDuxo2(User user, Continuation<? super DepositCurrencyDuxo2> continuation) {
        super(2, continuation);
        this.$it = user;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DepositCurrencyDuxo2 depositCurrencyDuxo2 = new DepositCurrencyDuxo2(this.$it, continuation);
        depositCurrencyDuxo2.L$0 = obj;
        return depositCurrencyDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(DepositCurrencyDataState depositCurrencyDataState, Continuation<? super DepositCurrencyDataState> continuation) {
        return ((DepositCurrencyDuxo2) create(depositCurrencyDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return ((DepositCurrencyDataState) this.L$0).copy(this.$it.getOrigin().getLocality());
    }
}
