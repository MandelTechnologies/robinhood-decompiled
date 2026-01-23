package com.robinhood.android.acatsin.assets;

import com.robinhood.models.acats.p299db.bonfire.AcatsListPageResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: AcatsInAssetListDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/assets/AcatsInAssetListDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.acatsin.assets.AcatsInAssetListDuxo$onCreate$1$2$1", m3645f = "AcatsInAssetListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.acatsin.assets.AcatsInAssetListDuxo$onCreate$1$2$1, reason: use source file name */
/* loaded from: classes24.dex */
final class AcatsInAssetListDuxo2 extends ContinuationImpl7 implements Function2<AcatsInAssetListDataState, Continuation<? super AcatsInAssetListDataState>, Object> {
    final /* synthetic */ AcatsListPageResponse $response;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AcatsInAssetListDuxo2(AcatsListPageResponse acatsListPageResponse, Continuation<? super AcatsInAssetListDuxo2> continuation) {
        super(2, continuation);
        this.$response = acatsListPageResponse;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AcatsInAssetListDuxo2 acatsInAssetListDuxo2 = new AcatsInAssetListDuxo2(this.$response, continuation);
        acatsInAssetListDuxo2.L$0 = obj;
        return acatsInAssetListDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AcatsInAssetListDataState acatsInAssetListDataState, Continuation<? super AcatsInAssetListDataState> continuation) {
        return ((AcatsInAssetListDuxo2) create(acatsInAssetListDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return AcatsInAssetListDataState.copy$default((AcatsInAssetListDataState) this.L$0, this.$response, null, 2, null);
    }
}
