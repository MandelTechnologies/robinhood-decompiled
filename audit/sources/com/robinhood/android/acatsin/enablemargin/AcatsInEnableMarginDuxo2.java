package com.robinhood.android.acatsin.enablemargin;

import bonfire.proto.idl.margin.p036v1.GetMultiAccountEligibilityResponseDto;
import bonfire.proto.idl.margin.p036v1.MultiAccountEligibilityContextDto;
import com.robinhood.android.acatsin.enablemargin.AcatsInEnableMarginContract;
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

/* compiled from: AcatsInEnableMarginDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lbonfire/proto/idl/margin/v1/GetMultiAccountEligibilityResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.acatsin.enablemargin.AcatsInEnableMarginDuxo$onCreate$1$2$1$1", m3645f = "AcatsInEnableMarginDuxo.kt", m3646l = {52}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.acatsin.enablemargin.AcatsInEnableMarginDuxo$onCreate$1$2$1$1, reason: use source file name */
/* loaded from: classes24.dex */
final class AcatsInEnableMarginDuxo2 extends ContinuationImpl7 implements Function1<Continuation<? super GetMultiAccountEligibilityResponseDto>, Object> {
    int label;
    final /* synthetic */ AcatsInEnableMarginDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AcatsInEnableMarginDuxo2(AcatsInEnableMarginDuxo acatsInEnableMarginDuxo, Continuation<? super AcatsInEnableMarginDuxo2> continuation) {
        super(1, continuation);
        this.this$0 = acatsInEnableMarginDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new AcatsInEnableMarginDuxo2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super GetMultiAccountEligibilityResponseDto> continuation) {
        return ((AcatsInEnableMarginDuxo2) create(continuation)).invokeSuspend(Unit.INSTANCE);
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
        String accountNumber = ((AcatsInEnableMarginContract.Key) AcatsInEnableMarginDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getAccountNumber();
        MultiAccountEligibilityContextDto multiAccountEligibilityContextDto = MultiAccountEligibilityContextDto.MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_ACATS;
        this.label = 1;
        Object multiAccountMarginEligibility = marginEligibilityStore.getMultiAccountMarginEligibility(accountNumber, multiAccountEligibilityContextDto, this);
        return multiAccountMarginEligibility == coroutine_suspended ? coroutine_suspended : multiAccountMarginEligibility;
    }
}
