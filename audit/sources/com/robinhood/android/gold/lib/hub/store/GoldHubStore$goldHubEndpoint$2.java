package com.robinhood.android.gold.lib.hub.store;

import com.robinhood.android.gold.lib.hub.api.ApiGoldHub;
import com.robinhood.android.gold.lib.hub.api.GoldHubApi;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: GoldHubStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/gold/lib/hub/api/ApiGoldHub;", "<unused var>", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.gold.lib.hub.store.GoldHubStore$goldHubEndpoint$2", m3645f = "GoldHubStore.kt", m3646l = {52}, m3647m = "invokeSuspend")
/* loaded from: classes10.dex */
final class GoldHubStore$goldHubEndpoint$2 extends ContinuationImpl7 implements Function2<Unit, Continuation<? super ApiGoldHub>, Object> {
    int label;
    final /* synthetic */ GoldHubStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GoldHubStore$goldHubEndpoint$2(GoldHubStore goldHubStore, Continuation<? super GoldHubStore$goldHubEndpoint$2> continuation) {
        super(2, continuation);
        this.this$0 = goldHubStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GoldHubStore$goldHubEndpoint$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, Continuation<? super ApiGoldHub> continuation) {
        return ((GoldHubStore$goldHubEndpoint$2) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
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
        GoldHubApi goldHubApi = this.this$0.goldHubApi;
        this.label = 1;
        Object goldHub = goldHubApi.getGoldHub(this);
        return goldHub == coroutine_suspended ? coroutine_suspended : goldHub;
    }
}
