package com.robinhood.librobinhood.data.store;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.api.options.retrofit.OptionsApi;
import com.robinhood.models.api.ApiAggregateOptionPosition;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: AggregateOptionPositionStore.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiAggregateOptionPosition;", "<destruct>", "Lkotlin/Pair;", "Ljava/util/UUID;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.AggregateOptionPositionStore$getAggregateOptionPositionEndpoint$2", m3645f = "AggregateOptionPositionStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_EXIT_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.AggregateOptionPositionStore$getAggregateOptionPositionEndpoint$2 */
/* loaded from: classes13.dex */
final class C33554xe4b1b66a extends ContinuationImpl7 implements Function2<Tuples2<? extends UUID, ? extends String>, Continuation<? super ApiAggregateOptionPosition>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AggregateOptionPositionStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C33554xe4b1b66a(AggregateOptionPositionStore aggregateOptionPositionStore, Continuation<? super C33554xe4b1b66a> continuation) {
        super(2, continuation);
        this.this$0 = aggregateOptionPositionStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        C33554xe4b1b66a c33554xe4b1b66a = new C33554xe4b1b66a(this.this$0, continuation);
        c33554xe4b1b66a.L$0 = obj;
        return c33554xe4b1b66a;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends UUID, ? extends String> tuples2, Continuation<? super ApiAggregateOptionPosition> continuation) {
        return invoke2((Tuples2<UUID, String>) tuples2, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<UUID, String> tuples2, Continuation<? super ApiAggregateOptionPosition> continuation) {
        return ((C33554xe4b1b66a) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
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
        UUID uuid = (UUID) tuples2.component1();
        String str = (String) tuples2.component2();
        OptionsApi optionsApi = this.this$0.optionsApi;
        this.label = 1;
        Object aggregateOptionPosition = optionsApi.getAggregateOptionPosition(uuid, str, this);
        return aggregateOptionPosition == coroutine_suspended ? coroutine_suspended : aggregateOptionPosition;
    }
}
