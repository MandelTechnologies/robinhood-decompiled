package com.robinhood.internalassettransfers.data.store;

import com.robinhood.android.models.internalassettransfers.api.ApiEligibleAssets;
import com.robinhood.api.internalassettransfers.retrofit.InternalAssetTransfersApi;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: InternalAssetTransfersStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/models/internalassettransfers/api/ApiEligibleAssets;", "<destruct>", "Lkotlin/Pair;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.internalassettransfers.data.store.InternalAssetTransfersStore$getEligibleAssetsEndpoint$1", m3645f = "InternalAssetTransfersStore.kt", m3646l = {59}, m3647m = "invokeSuspend")
/* loaded from: classes15.dex */
final class InternalAssetTransfersStore$getEligibleAssetsEndpoint$1 extends ContinuationImpl7 implements Function2<Tuples2<? extends String, ? extends String>, Continuation<? super ApiEligibleAssets>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ InternalAssetTransfersStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InternalAssetTransfersStore$getEligibleAssetsEndpoint$1(InternalAssetTransfersStore internalAssetTransfersStore, Continuation<? super InternalAssetTransfersStore$getEligibleAssetsEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = internalAssetTransfersStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InternalAssetTransfersStore$getEligibleAssetsEndpoint$1 internalAssetTransfersStore$getEligibleAssetsEndpoint$1 = new InternalAssetTransfersStore$getEligibleAssetsEndpoint$1(this.this$0, continuation);
        internalAssetTransfersStore$getEligibleAssetsEndpoint$1.L$0 = obj;
        return internalAssetTransfersStore$getEligibleAssetsEndpoint$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends String, ? extends String> tuples2, Continuation<? super ApiEligibleAssets> continuation) {
        return invoke2((Tuples2<String, String>) tuples2, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<String, String> tuples2, Continuation<? super ApiEligibleAssets> continuation) {
        return ((InternalAssetTransfersStore$getEligibleAssetsEndpoint$1) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
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
        Tuples2 tuples2 = (Tuples2) this.L$0;
        String str = (String) tuples2.component1();
        String str2 = (String) tuples2.component2();
        InternalAssetTransfersApi internalAssetTransfersApi = this.this$0.internalAssetTransfersApi;
        this.label = 1;
        Object eligibleAssets = internalAssetTransfersApi.getEligibleAssets(str, str2, this);
        return eligibleAssets == coroutine_suspended ? coroutine_suspended : eligibleAssets;
    }
}
