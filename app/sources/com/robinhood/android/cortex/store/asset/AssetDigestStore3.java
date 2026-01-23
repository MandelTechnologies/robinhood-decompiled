package com.robinhood.android.cortex.store.asset;

import com.robinhood.android.cortex.store.asset.AssetDigestStore;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.StateFlow2;

/* compiled from: AssetDigestStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "result", "Lcom/robinhood/android/cortex/store/asset/AssetDigestStore$AssetDigestResult;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.cortex.store.asset.AssetDigestStore$digestEndpoint$2", m3645f = "AssetDigestStore.kt", m3646l = {74, 78}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.cortex.store.asset.AssetDigestStore$digestEndpoint$2, reason: use source file name */
/* loaded from: classes2.dex */
final class AssetDigestStore3 extends ContinuationImpl7 implements Function2<AssetDigestStore.AssetDigestResult, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AssetDigestStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AssetDigestStore3(AssetDigestStore assetDigestStore, Continuation<? super AssetDigestStore3> continuation) {
        super(2, continuation);
        this.this$0 = assetDigestStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AssetDigestStore3 assetDigestStore3 = new AssetDigestStore3(this.this$0, continuation);
        assetDigestStore3.L$0 = obj;
        return assetDigestStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AssetDigestStore.AssetDigestResult assetDigestResult, Continuation<? super Unit> continuation) {
        return ((AssetDigestStore3) create(assetDigestResult, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
    
        if (r2.emit(r6, r5) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0072, code lost:
    
        if (r3.emit(r6, r5) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0074, code lost:
    
        return r0;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            AssetDigestStore.AssetDigestResult assetDigestResult = (AssetDigestStore.AssetDigestResult) this.L$0;
            Map map = (Map) this.this$0.digestCacheFlow.getValue();
            if (assetDigestResult instanceof AssetDigestStore.AssetDigestResult.NotFound) {
                StateFlow2 stateFlow2 = this.this$0.digestCacheFlow;
                Map mapPlus = MapsKt.plus(map, Tuples4.m3642to(((AssetDigestStore.AssetDigestResult.NotFound) assetDigestResult).getKey(), null));
                this.label = 1;
            } else if (assetDigestResult instanceof AssetDigestStore.AssetDigestResult.Success) {
                StateFlow2 stateFlow22 = this.this$0.digestCacheFlow;
                AssetDigestStore.AssetDigestResult.Success success = (AssetDigestStore.AssetDigestResult.Success) assetDigestResult;
                Map mapPlus2 = MapsKt.plus(map, Tuples4.m3642to(success.getKey(), success.getDigest()));
                this.label = 2;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
