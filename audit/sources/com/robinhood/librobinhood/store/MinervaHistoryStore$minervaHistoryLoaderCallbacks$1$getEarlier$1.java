package com.robinhood.librobinhood.store;

import com.plaid.internal.EnumC7081g;
import com.robinhood.librobinhood.store.MinervaHistoryStore;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import p479j$.time.Instant;

/* compiled from: MinervaHistoryStore.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.store.MinervaHistoryStore$minervaHistoryLoaderCallbacks$1$getEarlier$1", m3645f = "MinervaHistoryStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_VALUE}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class MinervaHistoryStore$minervaHistoryLoaderCallbacks$1$getEarlier$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Instant $timestamp;
    int label;
    final /* synthetic */ MinervaHistoryStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MinervaHistoryStore$minervaHistoryLoaderCallbacks$1$getEarlier$1(MinervaHistoryStore minervaHistoryStore, Instant instant, Continuation<? super MinervaHistoryStore$minervaHistoryLoaderCallbacks$1$getEarlier$1> continuation) {
        super(2, continuation);
        this.this$0 = minervaHistoryStore;
        this.$timestamp = instant;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MinervaHistoryStore$minervaHistoryLoaderCallbacks$1$getEarlier$1(this.this$0, this.$timestamp, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MinervaHistoryStore$minervaHistoryLoaderCallbacks$1$getEarlier$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            MinervaHistoryStore minervaHistoryStore = this.this$0;
            MinervaHistoryStore.Anchor anchor = new MinervaHistoryStore.Anchor(this.$timestamp, MinervaHistoryStore.AnchorSide.OLDER);
            this.label = 1;
            if (minervaHistoryStore.refreshSettledHistoryItems(anchor, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
