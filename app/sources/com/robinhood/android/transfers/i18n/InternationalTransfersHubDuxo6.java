package com.robinhood.android.transfers.i18n;

import com.robinhood.models.api.bonfire.withdrawablecash.ApiWithdrawableCashOverview;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: InternationalTransfersHubDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.transfers.i18n.InternationalTransfersHubDuxo$onStart$5$1", m3645f = "InternationalTransfersHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.transfers.i18n.InternationalTransfersHubDuxo$onStart$5$1, reason: use source file name */
/* loaded from: classes9.dex */
final class InternationalTransfersHubDuxo6 extends ContinuationImpl7 implements Function2<InternationalTransfersHubDataState, Continuation<? super InternationalTransfersHubDataState>, Object> {
    final /* synthetic */ ApiWithdrawableCashOverview $it;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InternationalTransfersHubDuxo6(ApiWithdrawableCashOverview apiWithdrawableCashOverview, Continuation<? super InternationalTransfersHubDuxo6> continuation) {
        super(2, continuation);
        this.$it = apiWithdrawableCashOverview;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InternationalTransfersHubDuxo6 internationalTransfersHubDuxo6 = new InternationalTransfersHubDuxo6(this.$it, continuation);
        internationalTransfersHubDuxo6.L$0 = obj;
        return internationalTransfersHubDuxo6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InternationalTransfersHubDataState internationalTransfersHubDataState, Continuation<? super InternationalTransfersHubDataState> continuation) {
        return ((InternationalTransfersHubDuxo6) create(internationalTransfersHubDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return InternationalTransfersHubDataState.copy$default((InternationalTransfersHubDataState) this.L$0, null, null, null, null, this.$it.getContent(), null, false, null, 239, null);
    }
}
