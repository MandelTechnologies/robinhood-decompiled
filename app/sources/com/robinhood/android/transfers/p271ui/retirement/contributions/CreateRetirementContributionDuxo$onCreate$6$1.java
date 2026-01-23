package com.robinhood.android.transfers.p271ui.retirement.contributions;

import com.robinhood.models.crypto.p314db.UnifiedBalances;
import com.robinhood.models.p320db.Portfolio;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: CreateRetirementContributionDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionDuxo$onCreate$6$1", m3645f = "CreateRetirementContributionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes9.dex */
final class CreateRetirementContributionDuxo$onCreate$6$1 extends ContinuationImpl7 implements Function2<CreateRetirementContributionDataState, Continuation<? super CreateRetirementContributionDataState>, Object> {
    final /* synthetic */ UnifiedBalances $balances;
    final /* synthetic */ Portfolio $portfolio;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CreateRetirementContributionDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CreateRetirementContributionDuxo$onCreate$6$1(Portfolio portfolio, UnifiedBalances unifiedBalances, CreateRetirementContributionDuxo createRetirementContributionDuxo, Continuation<? super CreateRetirementContributionDuxo$onCreate$6$1> continuation) {
        super(2, continuation);
        this.$portfolio = portfolio;
        this.$balances = unifiedBalances;
        this.this$0 = createRetirementContributionDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CreateRetirementContributionDuxo$onCreate$6$1 createRetirementContributionDuxo$onCreate$6$1 = new CreateRetirementContributionDuxo$onCreate$6$1(this.$portfolio, this.$balances, this.this$0, continuation);
        createRetirementContributionDuxo$onCreate$6$1.L$0 = obj;
        return createRetirementContributionDuxo$onCreate$6$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CreateRetirementContributionDataState createRetirementContributionDataState, Continuation<? super CreateRetirementContributionDataState> continuation) {
        return ((CreateRetirementContributionDuxo$onCreate$6$1) create(createRetirementContributionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return CreateRetirementContributionDataState.copy$default((CreateRetirementContributionDataState) this.L$0, null, null, null, false, null, null, null, null, false, this.$portfolio, this.$balances, this.this$0.marketHoursManager.areMarketsOpenExtended(), false, null, false, null, null, null, false, false, false, null, null, false, false, null, false, 134214143, null);
    }
}
