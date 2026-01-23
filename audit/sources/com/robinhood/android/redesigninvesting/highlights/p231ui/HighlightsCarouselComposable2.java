package com.robinhood.android.redesigninvesting.highlights.p231ui;

import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.SnapshotState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: HighlightsCarouselComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.highlights.ui.HighlightsCarouselComposableKt$HighlightsCarouselComposable$3$1", m3645f = "HighlightsCarouselComposable.kt", m3646l = {82}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.redesigninvesting.highlights.ui.HighlightsCarouselComposableKt$HighlightsCarouselComposable$3$1, reason: use source file name */
/* loaded from: classes5.dex */
final class HighlightsCarouselComposable2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState<Boolean> $isUserInteracting$delegate;
    final /* synthetic */ LazyListState $listState;
    final /* synthetic */ CoroutineScope $scope;
    final /* synthetic */ SnapshotState<Boolean> $userInteractedOnce$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HighlightsCarouselComposable2(LazyListState lazyListState, CoroutineScope coroutineScope, SnapshotState<Boolean> snapshotState, SnapshotState<Boolean> snapshotState2, Continuation<? super HighlightsCarouselComposable2> continuation) {
        super(2, continuation);
        this.$listState = lazyListState;
        this.$scope = coroutineScope;
        this.$isUserInteracting$delegate = snapshotState;
        this.$userInteractedOnce$delegate = snapshotState2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HighlightsCarouselComposable2(this.$listState, this.$scope, this.$isUserInteracting$delegate, this.$userInteractedOnce$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HighlightsCarouselComposable2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            final Flow<Interaction> interactions = this.$listState.getInteractionSource().getInteractions();
            Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<Interaction>() { // from class: com.robinhood.android.redesigninvesting.highlights.ui.HighlightsCarouselComposableKt$HighlightsCarouselComposable$3$1$invokeSuspend$$inlined$filter$1

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.redesigninvesting.highlights.ui.HighlightsCarouselComposableKt$HighlightsCarouselComposable$3$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.highlights.ui.HighlightsCarouselComposableKt$HighlightsCarouselComposable$3$1$invokeSuspend$$inlined$filter$1$2", m3645f = "HighlightsCarouselComposable.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.redesigninvesting.highlights.ui.HighlightsCarouselComposableKt$HighlightsCarouselComposable$3$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
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
                            Interaction interaction = (Interaction) obj;
                            if ((interaction instanceof DragInteraction.Stop) || (interaction instanceof DragInteraction.Cancel) || (interaction instanceof PressInteraction.Release)) {
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

                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super Interaction> flowCollector, Continuation continuation) {
                    Object objCollect = interactions.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            });
            final CoroutineScope coroutineScope = this.$scope;
            final SnapshotState<Boolean> snapshotState = this.$isUserInteracting$delegate;
            final SnapshotState<Boolean> snapshotState2 = this.$userInteractedOnce$delegate;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.redesigninvesting.highlights.ui.HighlightsCarouselComposableKt$HighlightsCarouselComposable$3$1.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((Interaction) obj2, (Continuation<? super Unit>) continuation);
                }

                public final Object emit(Interaction interaction, Continuation<? super Unit> continuation) {
                    Job job = objectRef.element;
                    if (job != null) {
                        Job.DefaultImpls.cancel$default(job, null, 1, null);
                    }
                    HighlightsCarouselComposable.HighlightsCarouselComposable$lambda$11(snapshotState, true);
                    HighlightsCarouselComposable.HighlightsCarouselComposable$lambda$8(snapshotState2, true);
                    objectRef.element = (T) BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getDefault(), null, new AnonymousClass1(snapshotState, null), 2, null);
                    return Unit.INSTANCE;
                }

                /* compiled from: HighlightsCarouselComposable.kt */
                @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.highlights.ui.HighlightsCarouselComposableKt$HighlightsCarouselComposable$3$1$2$1", m3645f = "HighlightsCarouselComposable.kt", m3646l = {90}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.redesigninvesting.highlights.ui.HighlightsCarouselComposableKt$HighlightsCarouselComposable$3$1$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ SnapshotState<Boolean> $isUserInteracting$delegate;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(SnapshotState<Boolean> snapshotState, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$isUserInteracting$delegate = snapshotState;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new AnonymousClass1(this.$isUserInteracting$delegate, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            this.label = 1;
                            if (DelayKt.delay(5000L, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        HighlightsCarouselComposable.HighlightsCarouselComposable$lambda$11(this.$isUserInteracting$delegate, false);
                        return Unit.INSTANCE;
                    }
                }
            };
            this.label = 1;
            if (flowDistinctUntilChanged.collect(flowCollector, this) == coroutine_suspended) {
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
