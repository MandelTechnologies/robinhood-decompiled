package com.robinhood.android.matcha.p177ui.sourceoffunds;

import com.robinhood.models.api.bonfire.transfer.banner.ApiTransferBanners;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: SourceOfFundsBottomSheetDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/matcha/ui/sourceoffunds/SourceOfFundsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.sourceoffunds.SourceOfFundsBottomSheetDuxo$onStart$3$1", m3645f = "SourceOfFundsBottomSheetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.matcha.ui.sourceoffunds.SourceOfFundsBottomSheetDuxo$onStart$3$1, reason: use source file name */
/* loaded from: classes8.dex */
final class SourceOfFundsBottomSheetDuxo4 extends ContinuationImpl7 implements Function2<SourceOfFundsDataState, Continuation<? super SourceOfFundsDataState>, Object> {
    final /* synthetic */ ApiTransferBanners $transferBanners;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SourceOfFundsBottomSheetDuxo4(ApiTransferBanners apiTransferBanners, Continuation<? super SourceOfFundsBottomSheetDuxo4> continuation) {
        super(2, continuation);
        this.$transferBanners = apiTransferBanners;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SourceOfFundsBottomSheetDuxo4 sourceOfFundsBottomSheetDuxo4 = new SourceOfFundsBottomSheetDuxo4(this.$transferBanners, continuation);
        sourceOfFundsBottomSheetDuxo4.L$0 = obj;
        return sourceOfFundsBottomSheetDuxo4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SourceOfFundsDataState sourceOfFundsDataState, Continuation<? super SourceOfFundsDataState> continuation) {
        return ((SourceOfFundsBottomSheetDuxo4) create(sourceOfFundsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return SourceOfFundsDataState.copy$default((SourceOfFundsDataState) this.L$0, null, null, null, this.$transferBanners, null, 23, null);
    }
}
