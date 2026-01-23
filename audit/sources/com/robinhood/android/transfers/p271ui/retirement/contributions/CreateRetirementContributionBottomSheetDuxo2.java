package com.robinhood.android.transfers.p271ui.retirement.contributions;

import com.robinhood.android.models.retirement.api.contributions.ApiIraContributionBottomSheetResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: CreateRetirementContributionBottomSheetDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionBottomSheetViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionBottomSheetDuxo$onCreate$1$2$1", m3645f = "CreateRetirementContributionBottomSheetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionBottomSheetDuxo$onCreate$1$2$1, reason: use source file name */
/* loaded from: classes9.dex */
final class CreateRetirementContributionBottomSheetDuxo2 extends ContinuationImpl7 implements Function2<CreateRetirementContributionBottomSheetViewState, Continuation<? super CreateRetirementContributionBottomSheetViewState>, Object> {
    final /* synthetic */ ApiIraContributionBottomSheetResponse $it;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CreateRetirementContributionBottomSheetDuxo2(ApiIraContributionBottomSheetResponse apiIraContributionBottomSheetResponse, Continuation<? super CreateRetirementContributionBottomSheetDuxo2> continuation) {
        super(2, continuation);
        this.$it = apiIraContributionBottomSheetResponse;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CreateRetirementContributionBottomSheetDuxo2 createRetirementContributionBottomSheetDuxo2 = new CreateRetirementContributionBottomSheetDuxo2(this.$it, continuation);
        createRetirementContributionBottomSheetDuxo2.L$0 = obj;
        return createRetirementContributionBottomSheetDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CreateRetirementContributionBottomSheetViewState createRetirementContributionBottomSheetViewState, Continuation<? super CreateRetirementContributionBottomSheetViewState> continuation) {
        return ((CreateRetirementContributionBottomSheetDuxo2) create(createRetirementContributionBottomSheetViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return ((CreateRetirementContributionBottomSheetViewState) this.L$0).copy(this.$it);
    }
}
