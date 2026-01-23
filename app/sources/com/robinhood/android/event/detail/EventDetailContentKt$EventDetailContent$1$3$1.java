package com.robinhood.android.event.detail;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: EventDetailContent.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.event.detail.EventDetailContentKt$EventDetailContent$1$3$1", m3645f = "EventDetailContent.kt", m3646l = {352}, m3647m = "invokeSuspend")
/* loaded from: classes3.dex */
final class EventDetailContentKt$EventDetailContent$1$3$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState4<EventDetailContentCallbacks> $latestScreenCallbacks$delegate;
    final /* synthetic */ LazyListState $lazyListState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    EventDetailContentKt$EventDetailContent$1$3$1(LazyListState lazyListState, SnapshotState4<? extends EventDetailContentCallbacks> snapshotState4, Continuation<? super EventDetailContentKt$EventDetailContent$1$3$1> continuation) {
        super(2, continuation);
        this.$lazyListState = lazyListState;
        this.$latestScreenCallbacks$delegate = snapshotState4;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EventDetailContentKt$EventDetailContent$1$3$1(this.$lazyListState, this.$latestScreenCallbacks$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EventDetailContentKt$EventDetailContent$1$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final LazyListState lazyListState = this.$lazyListState;
            Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(SnapshotStateKt.snapshotFlow(new Function0() { // from class: com.robinhood.android.event.detail.EventDetailContentKt$EventDetailContent$1$3$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(EventDetailContentKt.access$getHeaderVisibility(lazyListState));
                }
            }));
            C160392 c160392 = new C160392(this.$latestScreenCallbacks$delegate, null);
            this.label = 1;
            if (FlowKt.collectLatest(flowDistinctUntilChanged, c160392, this) == coroutine_suspended) {
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

    /* compiled from: EventDetailContent.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "isVisible", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.event.detail.EventDetailContentKt$EventDetailContent$1$3$1$2", m3645f = "EventDetailContent.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.event.detail.EventDetailContentKt$EventDetailContent$1$3$1$2 */
    static final class C160392 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
        final /* synthetic */ SnapshotState4<EventDetailContentCallbacks> $latestScreenCallbacks$delegate;
        /* synthetic */ boolean Z$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C160392(SnapshotState4<? extends EventDetailContentCallbacks> snapshotState4, Continuation<? super C160392> continuation) {
            super(2, continuation);
            this.$latestScreenCallbacks$delegate = snapshotState4;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C160392 c160392 = new C160392(this.$latestScreenCallbacks$delegate, continuation);
            c160392.Z$0 = ((Boolean) obj).booleanValue();
            return c160392;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
            return ((C160392) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                EventDetailContentKt.EventDetailContent$lambda$44$lambda$29(this.$latestScreenCallbacks$delegate).onHeaderVisibilityChange(this.Z$0);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
