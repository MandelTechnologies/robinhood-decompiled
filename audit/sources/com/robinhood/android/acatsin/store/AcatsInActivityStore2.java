package com.robinhood.android.acatsin.store;

import com.robinhood.librobinhood.data.store.bonfire.AcatsPlaidStore;
import com.robinhood.models.acats.p299db.bonfire.plaid.brokerassets.PlaidBrokerAssetRequest;
import com.robinhood.models.acats.p299db.bonfire.plaid.brokerassets.PlaidBrokerAssets;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AcatsInActivityStore.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/acats/db/bonfire/plaid/brokerassets/PlaidBrokerAssets;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.acatsin.store.AcatsInActivityStore$getPlaidBrokerAssets$deferred$2", m3645f = "AcatsInActivityStore.kt", m3646l = {60}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.acatsin.store.AcatsInActivityStore$getPlaidBrokerAssets$deferred$2, reason: use source file name */
/* loaded from: classes24.dex */
final class AcatsInActivityStore2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super PlaidBrokerAssets>, Object> {
    final /* synthetic */ PlaidBrokerAssetRequest $request;
    int label;
    final /* synthetic */ AcatsInActivityStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AcatsInActivityStore2(AcatsInActivityStore acatsInActivityStore, PlaidBrokerAssetRequest plaidBrokerAssetRequest, Continuation<? super AcatsInActivityStore2> continuation) {
        super(2, continuation);
        this.this$0 = acatsInActivityStore;
        this.$request = plaidBrokerAssetRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AcatsInActivityStore2(this.this$0, this.$request, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super PlaidBrokerAssets> continuation) {
        return ((AcatsInActivityStore2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
        AcatsPlaidStore acatsPlaidStore = this.this$0.acatsPlaidStore;
        PlaidBrokerAssetRequest plaidBrokerAssetRequest = this.$request;
        this.label = 1;
        Object plaidBrokerAssets = acatsPlaidStore.getPlaidBrokerAssets(plaidBrokerAssetRequest, this);
        return plaidBrokerAssets == coroutine_suspended ? coroutine_suspended : plaidBrokerAssets;
    }
}
