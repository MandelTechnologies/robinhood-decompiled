package com.robinhood.librobinhood.data.store.bonfire.portfolio;

import com.robinhood.android.api.portfolio.AssetHomeApi;
import com.robinhood.android.models.portfolio.AssetHomeState;
import com.robinhood.android.models.portfolio.AssetHomeState2;
import com.robinhood.android.models.portfolio.api.ApiAssetHomesState;
import com.robinhood.android.models.portfolio.api.AssetType;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.AssetHomeStateStore;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: AssetHomeStateStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/models/portfolio/AssetHomeState;", "it", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/AssetHomeStateStore$AssetHomeKey;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.portfolio.AssetHomeStateStore$stateEndpoint$2", m3645f = "AssetHomeStateStore.kt", m3646l = {29}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.portfolio.AssetHomeStateStore$stateEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class AssetHomeStateStore3 extends ContinuationImpl7 implements Function2<AssetHomeStateStore.AssetHomeKey, Continuation<? super AssetHomeState>, Object> {
    final /* synthetic */ AssetHomeApi $assetHomeApi;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AssetHomeStateStore3(AssetHomeApi assetHomeApi, Continuation<? super AssetHomeStateStore3> continuation) {
        super(2, continuation);
        this.$assetHomeApi = assetHomeApi;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AssetHomeStateStore3 assetHomeStateStore3 = new AssetHomeStateStore3(this.$assetHomeApi, continuation);
        assetHomeStateStore3.L$0 = obj;
        return assetHomeStateStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AssetHomeStateStore.AssetHomeKey assetHomeKey, Continuation<? super AssetHomeState> continuation) {
        return ((AssetHomeStateStore3) create(assetHomeKey, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            AssetHomeStateStore.AssetHomeKey assetHomeKey = (AssetHomeStateStore.AssetHomeKey) this.L$0;
            AssetHomeApi assetHomeApi = this.$assetHomeApi;
            String accountNumber = assetHomeKey.getAccountNumber();
            AssetType assetType = assetHomeKey.getAssetType();
            this.label = 1;
            obj = assetHomeApi.getAssetHomeState(accountNumber, assetType, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return AssetHomeState2.toDbModel((ApiAssetHomesState) obj);
    }
}
