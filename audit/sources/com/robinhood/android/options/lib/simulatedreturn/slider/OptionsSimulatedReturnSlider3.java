package com.robinhood.android.options.lib.simulatedreturn.slider;

import android.view.View;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderEvent;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: OptionsSimulatedReturnSlider.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderKt$OptionsSimulatedReturnBaseSlider$2$1", m3645f = "OptionsSimulatedReturnSlider.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderKt$OptionsSimulatedReturnBaseSlider$2$1, reason: use source file name */
/* loaded from: classes11.dex */
final class OptionsSimulatedReturnSlider3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ OptionsSimulatedReturnSliderDuxo<DS> $duxo;
    final /* synthetic */ View $view;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionsSimulatedReturnSlider3(OptionsSimulatedReturnSliderDuxo<DS> optionsSimulatedReturnSliderDuxo, View view, Continuation<? super OptionsSimulatedReturnSlider3> continuation) {
        super(2, continuation);
        this.$duxo = optionsSimulatedReturnSliderDuxo;
        this.$view = view;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OptionsSimulatedReturnSlider3(this.$duxo, this.$view, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OptionsSimulatedReturnSlider3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final StateFlow eventFlow = this.$duxo.getEventFlow();
            Flow flowFilterNotNull = FlowKt.filterNotNull(new Flow<Event<?>>() { // from class: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderKt$OptionsSimulatedReturnBaseSlider$2$1$invokeSuspend$$inlined$filterIsEventInstance$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super Event<?>> flowCollector, Continuation continuation) {
                    Object objCollect = eventFlow.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderKt$OptionsSimulatedReturnBaseSlider$2$1$invokeSuspend$$inlined$filterIsEventInstance$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderKt$OptionsSimulatedReturnBaseSlider$2$1$invokeSuspend$$inlined$filterIsEventInstance$1$2", m3645f = "OptionsSimulatedReturnSlider.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderKt$OptionsSimulatedReturnBaseSlider$2$1$invokeSuspend$$inlined$filterIsEventInstance$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        Object L$1;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector) {
                        this.$this_unsafeFlow = flowCollector;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i = anonymousClass1.label;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        }
                        Object obj2 = anonymousClass1.result;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = anonymousClass1.label;
                        if (i2 == 0) {
                            ResultKt.throwOnFailure(obj2);
                            FlowCollector flowCollector = this.$this_unsafeFlow;
                            Event event = (Event) obj;
                            if ((event != null ? event.getData() : null) instanceof OptionsSimulatedReturnSliderEvent.SliderHapticFeedback) {
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }
            });
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$view, null);
            this.label = 1;
            if (FlowKt.collectLatest(flowFilterNotNull, anonymousClass1, this) == coroutine_suspended) {
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

    /* compiled from: OptionsSimulatedReturnSlider.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderEvent$SliderHapticFeedback;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderKt$OptionsSimulatedReturnBaseSlider$2$1$1", m3645f = "OptionsSimulatedReturnSlider.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderKt$OptionsSimulatedReturnBaseSlider$2$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Event<OptionsSimulatedReturnSliderEvent.SliderHapticFeedback>, Continuation<? super Unit>, Object> {
        final /* synthetic */ View $view;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(View view, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$view = view;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$view, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Event<OptionsSimulatedReturnSliderEvent.SliderHapticFeedback> event, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(event, continuation)).invokeSuspend(Unit.INSTANCE);
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
            final View view = this.$view;
            if ((event.getData() instanceof OptionsSimulatedReturnSliderEvent.SliderHapticFeedback) && (eventConsumer = (EventConsumer) event.getGetEventConsumer().invoke()) != null) {
                eventConsumer.consume(event, new Function1() { // from class: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderKt$OptionsSimulatedReturnBaseSlider$2$1$1$invokeSuspend$$inlined$consumeIfType$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        m16969invoke(obj2);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m16969invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        view.performHapticFeedback(((OptionsSimulatedReturnSliderEvent.SliderHapticFeedback) event.getData()).isStrong() ? 1 : 4);
                    }
                });
            }
            return Unit.INSTANCE;
        }
    }
}
