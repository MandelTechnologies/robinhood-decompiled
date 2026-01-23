package com.robinhood.android.investFlow.search.item;

import com.robinhood.models.p320db.Quote;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: DiscoveryItemDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/investFlow/search/item/DiscoveryItemDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.investFlow.search.item.DiscoveryItemDuxo$onStart$4$1", m3645f = "DiscoveryItemDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.investFlow.search.item.DiscoveryItemDuxo$onStart$4$1, reason: use source file name */
/* loaded from: classes10.dex */
final class DiscoveryItemDuxo3 extends ContinuationImpl7 implements Function2<DiscoveryItemDataState, Continuation<? super DiscoveryItemDataState>, Object> {
    final /* synthetic */ Quote $quote;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DiscoveryItemDuxo3(Quote quote, Continuation<? super DiscoveryItemDuxo3> continuation) {
        super(2, continuation);
        this.$quote = quote;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DiscoveryItemDuxo3 discoveryItemDuxo3 = new DiscoveryItemDuxo3(this.$quote, continuation);
        discoveryItemDuxo3.L$0 = obj;
        return discoveryItemDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(DiscoveryItemDataState discoveryItemDataState, Continuation<? super DiscoveryItemDataState> continuation) {
        return ((DiscoveryItemDuxo3) create(discoveryItemDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return DiscoveryItemDataState.copy$default((DiscoveryItemDataState) this.L$0, null, null, this.$quote, false, 11, null);
    }
}
