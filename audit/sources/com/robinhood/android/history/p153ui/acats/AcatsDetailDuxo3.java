package com.robinhood.android.history.p153ui.acats;

import com.robinhood.models.acats.p299db.bonfire.AcatsDetailPageResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: AcatsDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/history/ui/acats/AcatsDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.history.ui.acats.AcatsDetailDuxo$loadAcatsIn$4$1", m3645f = "AcatsDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.history.ui.acats.AcatsDetailDuxo$loadAcatsIn$4$1, reason: use source file name */
/* loaded from: classes10.dex */
final class AcatsDetailDuxo3 extends ContinuationImpl7 implements Function2<AcatsDetailDataState, Continuation<? super AcatsDetailDataState>, Object> {
    final /* synthetic */ AcatsDetailPageResponse $detailPageResponse;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AcatsDetailDuxo3(AcatsDetailPageResponse acatsDetailPageResponse, Continuation<? super AcatsDetailDuxo3> continuation) {
        super(2, continuation);
        this.$detailPageResponse = acatsDetailPageResponse;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AcatsDetailDuxo3 acatsDetailDuxo3 = new AcatsDetailDuxo3(this.$detailPageResponse, continuation);
        acatsDetailDuxo3.L$0 = obj;
        return acatsDetailDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AcatsDetailDataState acatsDetailDataState, Continuation<? super AcatsDetailDataState> continuation) {
        return ((AcatsDetailDuxo3) create(acatsDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return AcatsDetailDataState.copy$default((AcatsDetailDataState) this.L$0, this.$detailPageResponse, null, 2, null);
    }
}
