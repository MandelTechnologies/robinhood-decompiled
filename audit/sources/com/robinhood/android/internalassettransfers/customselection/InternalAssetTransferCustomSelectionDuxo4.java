package com.robinhood.android.internalassettransfers.customselection;

import bonfire.proto.idl.margin.p036v1.GetMultiAccountEligibilityResponseDto;
import bonfire.proto.idl.margin.p036v1.MultiAccountEligibilityContextDto;
import com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionFragment;
import com.robinhood.android.lib.margin.MarginEligibilityStore;
import com.robinhood.android.udf.HasSavedState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;

/* compiled from: InternalAssetTransferCustomSelectionDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lbonfire/proto/idl/margin/v1/GetMultiAccountEligibilityResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionDuxo$onCreate$1$1$2", m3645f = "InternalAssetTransferCustomSelectionDuxo.kt", m3646l = {69}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionDuxo$onCreate$1$1$2, reason: use source file name */
/* loaded from: classes10.dex */
final class InternalAssetTransferCustomSelectionDuxo4 extends ContinuationImpl7 implements Function1<Continuation<? super GetMultiAccountEligibilityResponseDto>, Object> {
    int label;
    final /* synthetic */ InternalAssetTransferCustomSelectionDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InternalAssetTransferCustomSelectionDuxo4(InternalAssetTransferCustomSelectionDuxo internalAssetTransferCustomSelectionDuxo, Continuation<? super InternalAssetTransferCustomSelectionDuxo4> continuation) {
        super(1, continuation);
        this.this$0 = internalAssetTransferCustomSelectionDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new InternalAssetTransferCustomSelectionDuxo4(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super GetMultiAccountEligibilityResponseDto> continuation) {
        return ((InternalAssetTransferCustomSelectionDuxo4) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        MarginEligibilityStore marginEligibilityStore = this.this$0.marginEligibilityStore;
        String rhsAccountNumber = ((InternalAssetTransferCustomSelectionFragment.Args) InternalAssetTransferCustomSelectionDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getAccountSelection().getSinkAccount().getRhsAccountNumber();
        MultiAccountEligibilityContextDto multiAccountEligibilityContextDto = MultiAccountEligibilityContextDto.MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_IAT;
        this.label = 1;
        Object multiAccountMarginEligibility = marginEligibilityStore.getMultiAccountMarginEligibility(rhsAccountNumber, multiAccountEligibilityContextDto, this);
        return multiAccountMarginEligibility == coroutine_suspended ? coroutine_suspended : multiAccountMarginEligibility;
    }
}
