package com.robinhood.librobinhood.data.store;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.models.api.ApiQuickTradeAmounts;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: QuickTradeAmountsStore.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiQuickTradeAmounts;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.QuickTradeAmountsStore$refreshForAllAccounts$1$1", m3645f = "QuickTradeAmountsStore.kt", m3646l = {53}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.QuickTradeAmountsStore$refreshForAllAccounts$1$1, reason: use source file name */
/* loaded from: classes13.dex */
final class QuickTradeAmountsStore4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiQuickTradeAmounts>, Object> {
    final /* synthetic */ String $accountNumber;
    final /* synthetic */ UUID $instrumentId;
    int label;
    final /* synthetic */ QuickTradeAmountsStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    QuickTradeAmountsStore4(QuickTradeAmountsStore quickTradeAmountsStore, String str, UUID uuid, Continuation<? super QuickTradeAmountsStore4> continuation) {
        super(2, continuation);
        this.this$0 = quickTradeAmountsStore;
        this.$accountNumber = str;
        this.$instrumentId = uuid;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new QuickTradeAmountsStore4(this.this$0, this.$accountNumber, this.$instrumentId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiQuickTradeAmounts> continuation) {
        return ((QuickTradeAmountsStore4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
        Endpoint endpoint = this.this$0.quickTradeAmountsEndpoint;
        Tuples2 tuples2M3642to = Tuples4.m3642to(this.$accountNumber, this.$instrumentId);
        this.label = 1;
        Object objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, tuples2M3642to, null, this, 2, null);
        return objForceFetch$default == coroutine_suspended ? coroutine_suspended : objForceFetch$default;
    }
}
