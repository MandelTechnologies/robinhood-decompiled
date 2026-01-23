package com.robinhood.android.futures.eventbrackets.p141ui;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import com.robinhood.android.futures.eventbrackets.p141ui.EventsList5;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.math.MathKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: EventsList.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.futures.eventbrackets.ui.EventsListKt$AllEventsList$1$1", m3645f = "EventsList.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.futures.eventbrackets.ui.EventsListKt$AllEventsList$1$1, reason: use source file name */
/* loaded from: classes3.dex */
final class EventsList5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LazyListState $listState;
    final /* synthetic */ BracketNavigationInfo3 $navigationState;
    final /* synthetic */ SnapshotState4<Function1<Integer, Integer>> $numberOfCardsInRound$delegate;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    EventsList5(BracketNavigationInfo3 bracketNavigationInfo3, SnapshotState4<? extends Function1<? super Integer, Integer>> snapshotState4, LazyListState lazyListState, Continuation<? super EventsList5> continuation) {
        super(2, continuation);
        this.$navigationState = bracketNavigationInfo3;
        this.$numberOfCardsInRound$delegate = snapshotState4;
        this.$listState = lazyListState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EventsList5 eventsList5 = new EventsList5(this.$navigationState, this.$numberOfCardsInRound$delegate, this.$listState, continuation);
        eventsList5.L$0 = obj;
        return eventsList5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EventsList5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: EventsList.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.eventbrackets.ui.EventsListKt$AllEventsList$1$1$1", m3645f = "EventsList.kt", m3646l = {61}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.eventbrackets.ui.EventsListKt$AllEventsList$1$1$1 */
    static final class C172271 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ LazyListState $listState;
        final /* synthetic */ BracketNavigationInfo3 $navigationState;
        final /* synthetic */ SnapshotState4<Function1<Integer, Integer>> $numberOfCardsInRound$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C172271(BracketNavigationInfo3 bracketNavigationInfo3, SnapshotState4<? extends Function1<? super Integer, Integer>> snapshotState4, LazyListState lazyListState, Continuation<? super C172271> continuation) {
            super(2, continuation);
            this.$navigationState = bracketNavigationInfo3;
            this.$numberOfCardsInRound$delegate = snapshotState4;
            this.$listState = lazyListState;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C172271(this.$navigationState, this.$numberOfCardsInRound$delegate, this.$listState, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C172271) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowMapLatest = FlowKt.mapLatest(FlowKt.filterNotNull(this.$navigationState.streamLocationChangeRequests()), new AnonymousClass1(this.$numberOfCardsInRound$delegate, this.$listState, null));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$listState, this.$navigationState, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowMapLatest, anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: EventsList.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.eventbrackets.ui.EventsListKt$AllEventsList$1$1$1$1", m3645f = "EventsList.kt", m3646l = {58}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.futures.eventbrackets.ui.EventsListKt$AllEventsList$1$1$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Tuples2<? extends Integer, ? extends Float>, Continuation<? super Integer>, Object> {
            final /* synthetic */ LazyListState $listState;
            final /* synthetic */ SnapshotState4<Function1<Integer, Integer>> $numberOfCardsInRound$delegate;
            int I$0;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(SnapshotState4<? extends Function1<? super Integer, Integer>> snapshotState4, LazyListState lazyListState, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$numberOfCardsInRound$delegate = snapshotState4;
                this.$listState = lazyListState;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$numberOfCardsInRound$delegate, this.$listState, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends Integer, ? extends Float> tuples2, Continuation<? super Integer> continuation) {
                return invoke2((Tuples2<Integer, Float>) tuples2, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Tuples2<Integer, Float> tuples2, Continuation<? super Integer> continuation) {
                return ((AnonymousClass1) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                int i;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.label;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Tuples2 tuples2 = (Tuples2) this.L$0;
                    int iIntValue = ((Number) tuples2.component1()).intValue();
                    float fFloatValue = ((Number) tuples2.component2()).floatValue();
                    final int iIntValue2 = ((Number) EventsList4.AllEventsList_jIwJxvA$lambda$2(this.$numberOfCardsInRound$delegate).invoke(boxing.boxInt(iIntValue))).intValue();
                    int iRoundToInt = MathKt.roundToInt(iIntValue2 * fFloatValue);
                    final LazyListState lazyListState = this.$listState;
                    Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(new Function0() { // from class: com.robinhood.android.futures.eventbrackets.ui.EventsListKt$AllEventsList$1$1$1$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Boolean.valueOf(EventsList5.C172271.AnonymousClass1.invokeSuspend$lambda$0(lazyListState, iIntValue2));
                        }
                    });
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(null);
                    this.I$0 = iRoundToInt;
                    this.label = 1;
                    if (FlowKt.first(flowSnapshotFlow, anonymousClass2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    i = iRoundToInt;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = this.I$0;
                    ResultKt.throwOnFailure(obj);
                }
                return boxing.boxInt(i);
            }

            /* compiled from: EventsList.kt */
            @Metadata(m3635d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "", "it"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.eventbrackets.ui.EventsListKt$AllEventsList$1$1$1$1$2", m3645f = "EventsList.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.futures.eventbrackets.ui.EventsListKt$AllEventsList$1$1$1$1$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Boolean>, Object> {
                /* synthetic */ boolean Z$0;
                int label;

                AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
                    anonymousClass2.Z$0 = ((Boolean) obj).booleanValue();
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Boolean> continuation) {
                    return invoke(bool.booleanValue(), continuation);
                }

                public final Object invoke(boolean z, Continuation<? super Boolean> continuation) {
                    return ((AnonymousClass2) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return boxing.boxBoolean(this.Z$0);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final boolean invokeSuspend$lambda$0(LazyListState lazyListState, int i) {
                return lazyListState.getLayoutInfo().getTotalItemsCount() == i;
            }
        }

        /* compiled from: EventsList.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "toIndex", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.eventbrackets.ui.EventsListKt$AllEventsList$1$1$1$2", m3645f = "EventsList.kt", m3646l = {62}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.futures.eventbrackets.ui.EventsListKt$AllEventsList$1$1$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Integer, Continuation<? super Unit>, Object> {
            final /* synthetic */ LazyListState $listState;
            final /* synthetic */ BracketNavigationInfo3 $navigationState;
            /* synthetic */ int I$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(LazyListState lazyListState, BracketNavigationInfo3 bracketNavigationInfo3, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$listState = lazyListState;
                this.$navigationState = bracketNavigationInfo3;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$listState, this.$navigationState, continuation);
                anonymousClass2.I$0 = ((Number) obj).intValue();
                return anonymousClass2;
            }

            public final Object invoke(int i, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(Integer.valueOf(i), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Integer num, Continuation<? super Unit> continuation) {
                return invoke(num.intValue(), continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                AnonymousClass2 anonymousClass2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    int i2 = this.I$0;
                    LazyListState lazyListState = this.$listState;
                    this.label = 1;
                    anonymousClass2 = this;
                    if (LazyListState.animateScrollToItem$default(lazyListState, i2, 0, anonymousClass2, 2, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    anonymousClass2 = this;
                }
                anonymousClass2.$navigationState.onNewLocationMoved();
                return Unit.INSTANCE;
            }
        }
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C172271(this.$navigationState, this.$numberOfCardsInRound$delegate, this.$listState, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C172282(this.$listState, this.$navigationState, null), 3, null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* compiled from: EventsList.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.eventbrackets.ui.EventsListKt$AllEventsList$1$1$2", m3645f = "EventsList.kt", m3646l = {75}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.eventbrackets.ui.EventsListKt$AllEventsList$1$1$2 */
    static final class C172282 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ LazyListState $listState;
        final /* synthetic */ BracketNavigationInfo3 $navigationState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C172282(LazyListState lazyListState, BracketNavigationInfo3 bracketNavigationInfo3, Continuation<? super C172282> continuation) {
            super(2, continuation);
            this.$listState = lazyListState;
            this.$navigationState = bracketNavigationInfo3;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C172282(this.$listState, this.$navigationState, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C172282) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final LazyListState lazyListState = this.$listState;
                Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(new Function0() { // from class: com.robinhood.android.futures.eventbrackets.ui.EventsListKt$AllEventsList$1$1$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(EventsList5.C172282.invokeSuspend$lambda$0(lazyListState));
                    }
                });
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$navigationState, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowSnapshotFlow, anonymousClass2, this) == coroutine_suspended) {
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

        /* JADX INFO: Access modifiers changed from: private */
        public static final float invokeSuspend$lambda$0(LazyListState lazyListState) {
            int totalItemsCount = lazyListState.getLayoutInfo().getTotalItemsCount();
            if (totalItemsCount == 0) {
                return 0.0f;
            }
            return lazyListState.getFirstVisibleItemIndex() / totalItemsCount;
        }

        /* compiled from: EventsList.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.eventbrackets.ui.EventsListKt$AllEventsList$1$1$2$2", m3645f = "EventsList.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.futures.eventbrackets.ui.EventsListKt$AllEventsList$1$1$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Float, Continuation<? super Unit>, Object> {
            final /* synthetic */ BracketNavigationInfo3 $navigationState;
            /* synthetic */ float F$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(BracketNavigationInfo3 bracketNavigationInfo3, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$navigationState = bracketNavigationInfo3;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$navigationState, continuation);
                anonymousClass2.F$0 = ((Number) obj).floatValue();
                return anonymousClass2;
            }

            public final Object invoke(float f, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(Float.valueOf(f), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Float f, Continuation<? super Unit> continuation) {
                return invoke(f.floatValue(), continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.$navigationState.onCurrentRegionChange(this.F$0);
                return Unit.INSTANCE;
            }
        }
    }
}
