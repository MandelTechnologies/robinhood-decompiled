package com.robinhood.android.cortex.digest.asset;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: AssetDigestDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/cortex/digest/asset/AssetDigestViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.cortex.digest.asset.AssetDigestDuxo$submitFeedback$1$3$1", m3645f = "AssetDigestDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.cortex.digest.asset.AssetDigestDuxo$submitFeedback$1$3$1, reason: use source file name */
/* loaded from: classes2.dex */
final class AssetDigestDuxo2 extends ContinuationImpl7 implements Function2<AssetDigestViewState, Continuation<? super AssetDigestViewState>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    AssetDigestDuxo2(Continuation<? super AssetDigestDuxo2> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AssetDigestDuxo2 assetDigestDuxo2 = new AssetDigestDuxo2(continuation);
        assetDigestDuxo2.L$0 = obj;
        return assetDigestDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AssetDigestViewState assetDigestViewState, Continuation<? super AssetDigestViewState> continuation) {
        return ((AssetDigestDuxo2) create(assetDigestViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return AssetDigestViewState.copy$default((AssetDigestViewState) this.L$0, null, null, null, null, null, null, null, null, false, null, false, null, 3839, null);
    }
}
