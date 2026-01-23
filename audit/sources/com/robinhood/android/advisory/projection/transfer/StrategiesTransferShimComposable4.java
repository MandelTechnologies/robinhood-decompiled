package com.robinhood.android.advisory.projection.transfer;

import androidx.compose.runtime.SnapshotState4;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: StrategiesTransferShimComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.advisory.projection.transfer.StrategiesTransferShimComposableKt$StrategiesTransferShimComposable$3$1", m3645f = "StrategiesTransferShimComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.projection.transfer.StrategiesTransferShimComposableKt$StrategiesTransferShimComposable$3$1, reason: use source file name */
/* loaded from: classes7.dex */
final class StrategiesTransferShimComposable4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState4<Event<StrategiesTransferShimEvent>> $event$delegate;
    final /* synthetic */ Function1<StrategiesTransferShimEvent, Unit> $onEvent;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    StrategiesTransferShimComposable4(Function1<? super StrategiesTransferShimEvent, Unit> function1, SnapshotState4<Event<StrategiesTransferShimEvent>> snapshotState4, Continuation<? super StrategiesTransferShimComposable4> continuation) {
        super(2, continuation);
        this.$onEvent = function1;
        this.$event$delegate = snapshotState4;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new StrategiesTransferShimComposable4(this.$onEvent, this.$event$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((StrategiesTransferShimComposable4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        EventConsumer eventConsumer;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            final Event eventStrategiesTransferShimComposable$lambda$0 = StrategiesTransferShimComposable3.StrategiesTransferShimComposable$lambda$0(this.$event$delegate);
            if (eventStrategiesTransferShimComposable$lambda$0 != null) {
                final Function1<StrategiesTransferShimEvent, Unit> function1 = this.$onEvent;
                if ((eventStrategiesTransferShimComposable$lambda$0.getData() instanceof StrategiesTransferShimEvent) && (eventConsumer = (EventConsumer) eventStrategiesTransferShimComposable$lambda$0.getGetEventConsumer().invoke()) != null) {
                    eventConsumer.consume(eventStrategiesTransferShimComposable$lambda$0, new Function1() { // from class: com.robinhood.android.advisory.projection.transfer.StrategiesTransferShimComposableKt$StrategiesTransferShimComposable$3$1$invokeSuspend$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                            m11240invoke(obj2);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m11240invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            function1.invoke(eventStrategiesTransferShimComposable$lambda$0.getData());
                        }
                    });
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
