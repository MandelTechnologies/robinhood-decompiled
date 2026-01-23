package com.robinhood.android.assethomes;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: AssetHomeDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/assethomes/AssetHomeDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.assethomes.AssetHomeDuxo$onPnlNavigate$1", m3645f = "AssetHomeDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.assethomes.AssetHomeDuxo$onPnlNavigate$1, reason: use source file name */
/* loaded from: classes7.dex */
final class AssetHomeDuxo2 extends ContinuationImpl7 implements Function2<AssetHomeDataState, Continuation<? super AssetHomeDataState>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    AssetHomeDuxo2(Continuation<? super AssetHomeDuxo2> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AssetHomeDuxo2 assetHomeDuxo2 = new AssetHomeDuxo2(continuation);
        assetHomeDuxo2.L$0 = obj;
        return assetHomeDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AssetHomeDataState assetHomeDataState, Continuation<? super AssetHomeDataState> continuation) {
        return ((AssetHomeDuxo2) create(assetHomeDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return AssetHomeDataState.copy$default((AssetHomeDataState) this.L$0, null, null, null, null, null, null, false, false, false, false, false, false, 4031, null);
    }
}
