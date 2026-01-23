package com.robinhood.android.matcha.p177ui.history.detail.transfer;

import com.robinhood.models.api.bonfire.ApiSocialProfileInfo;
import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchaTransferDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/matcha/ui/history/detail/transfer/MatchaTransferDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.history.detail.transfer.MatchaTransferDetailDuxo$toggleBlockState$1$2$1", m3645f = "MatchaTransferDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.matcha.ui.history.detail.transfer.MatchaTransferDetailDuxo$toggleBlockState$1$2$1, reason: use source file name */
/* loaded from: classes8.dex */
final class MatchaTransferDetailDuxo3 extends ContinuationImpl7 implements Function2<MatchaTransferDetailDataState, Continuation<? super MatchaTransferDetailDataState>, Object> {
    final /* synthetic */ ApiSocialProfileInfo $socialProfileResponse;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MatchaTransferDetailDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MatchaTransferDetailDuxo3(MatchaTransferDetailDuxo matchaTransferDetailDuxo, ApiSocialProfileInfo apiSocialProfileInfo, Continuation<? super MatchaTransferDetailDuxo3> continuation) {
        super(2, continuation);
        this.this$0 = matchaTransferDetailDuxo;
        this.$socialProfileResponse = apiSocialProfileInfo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MatchaTransferDetailDuxo3 matchaTransferDetailDuxo3 = new MatchaTransferDetailDuxo3(this.this$0, this.$socialProfileResponse, continuation);
        matchaTransferDetailDuxo3.L$0 = obj;
        return matchaTransferDetailDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(MatchaTransferDetailDataState matchaTransferDetailDataState, Continuation<? super MatchaTransferDetailDataState> continuation) {
        return ((MatchaTransferDetailDuxo3) create(matchaTransferDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        MatchaTransferDetailDataState matchaTransferDetailDataState = (MatchaTransferDetailDataState) this.L$0;
        MatchaTransferDetailDuxo matchaTransferDetailDuxo = this.this$0;
        ApiSocialProfileInfo apiSocialProfileInfo = this.$socialProfileResponse;
        Intrinsics.checkNotNull(apiSocialProfileInfo);
        return MatchaTransferDetailDataState.copy$default(matchaTransferDetailDataState, null, null, null, null, new UiEvent(Result.m28549boximpl(Result.m28550constructorimpl(matchaTransferDetailDuxo.getBlockConfirmationText(apiSocialProfileInfo)))), 15, null);
    }
}
