package com.robinhood.android.mcw.mcwquickconversion;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.mcw.mcwquickconversion.models.QuickConversionEvent;
import com.robinhood.android.mcw.mcwquickconversion.models.UiEvent;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: QuickConversionComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.mcw.mcwquickconversion.QuickConversionComposableKt$QuickConversionComposable$1$1", m3645f = "QuickConversionComposable.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_GLOBE_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.mcw.mcwquickconversion.QuickConversionComposableKt$QuickConversionComposable$1$1, reason: use source file name */
/* loaded from: classes8.dex */
final class QuickConversionComposable2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ QuickConversionDuxo $duxo;
    final /* synthetic */ Function1<UiEvent, Unit> $onEvent;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    QuickConversionComposable2(QuickConversionDuxo quickConversionDuxo, Function1<? super UiEvent, Unit> function1, Continuation<? super QuickConversionComposable2> continuation) {
        super(2, continuation);
        this.$duxo = quickConversionDuxo;
        this.$onEvent = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new QuickConversionComposable2(this.$duxo, this.$onEvent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((QuickConversionComposable2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: QuickConversionComposable.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/mcw/mcwquickconversion/models/QuickConversionEvent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.mcw.mcwquickconversion.QuickConversionComposableKt$QuickConversionComposable$1$1$1", m3645f = "QuickConversionComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.mcw.mcwquickconversion.QuickConversionComposableKt$QuickConversionComposable$1$1$1 */
    static final class C217841 extends ContinuationImpl7 implements Function2<Event<QuickConversionEvent>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<UiEvent, Unit> $onEvent;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C217841(Function1<? super UiEvent, Unit> function1, Continuation<? super C217841> continuation) {
            super(2, continuation);
            this.$onEvent = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C217841 c217841 = new C217841(this.$onEvent, continuation);
            c217841.L$0 = obj;
            return c217841;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Event<QuickConversionEvent> event, Continuation<? super Unit> continuation) {
            return ((C217841) create(event, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            EventConsumer eventConsumer;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            final Event event = (Event) this.L$0;
            if (event != null) {
                final Function1<UiEvent, Unit> function1 = this.$onEvent;
                if ((event.getData() instanceof QuickConversionEvent) && (eventConsumer = (EventConsumer) event.getGetEventConsumer().invoke()) != null) {
                    eventConsumer.consume(event, new Function1() { // from class: com.robinhood.android.mcw.mcwquickconversion.QuickConversionComposableKt$QuickConversionComposable$1$1$1$invokeSuspend$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                            m16527invoke(obj2);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m16527invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            QuickConversionEvent quickConversionEvent = (QuickConversionEvent) event.getData();
                            if (quickConversionEvent instanceof QuickConversionEvent.Completed) {
                                function1.invoke(new UiEvent.ConversionComplete(((QuickConversionEvent.Completed) quickConversionEvent).getUpdatedBalance()));
                            } else if (quickConversionEvent instanceof QuickConversionEvent.Error) {
                                function1.invoke(new UiEvent.ConversionError(((QuickConversionEvent.Error) quickConversionEvent).getT()));
                            } else {
                                if (!(quickConversionEvent instanceof QuickConversionEvent.RegionGateFailed)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                function1.invoke(UiEvent.RegionGateFailed.INSTANCE);
                            }
                        }
                    });
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            StateFlow<Event<QuickConversionEvent>> eventFlow = this.$duxo.getEventFlow();
            C217841 c217841 = new C217841(this.$onEvent, null);
            this.label = 1;
            if (FlowKt.collectLatest(eventFlow, c217841, this) == coroutine_suspended) {
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
