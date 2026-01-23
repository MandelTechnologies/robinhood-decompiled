package com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar;

import android.view.View;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotStateKt;
import black_widow.contracts.mobile_app_chart.proto.p024v1.IntervalDto;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.chart.blackwidowadvancedchart.IntervalSelectorState;
import com.robinhood.android.chart.blackwidowadvancedchart.utils.HapticEvents;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: ScrollingIntervalSelector.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.ScrollingIntervalSelectorKt$ScrollingIntervalSelector$5$1", m3645f = "ScrollingIntervalSelector.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.ScrollingIntervalSelectorKt$ScrollingIntervalSelector$5$1, reason: use source file name */
/* loaded from: classes7.dex */
final class ScrollingIntervalSelector8 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LazyListState $columnState;
    final /* synthetic */ SnapshotState<IntervalDto> $internalInterval$delegate;
    final /* synthetic */ SnapshotIntState2 $itemHeightPixels$delegate;
    final /* synthetic */ IntervalSelectorState $state;
    final /* synthetic */ View $view;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScrollingIntervalSelector8(LazyListState lazyListState, IntervalSelectorState intervalSelectorState, SnapshotIntState2 snapshotIntState2, View view, SnapshotState<IntervalDto> snapshotState, Continuation<? super ScrollingIntervalSelector8> continuation) {
        super(2, continuation);
        this.$columnState = lazyListState;
        this.$state = intervalSelectorState;
        this.$itemHeightPixels$delegate = snapshotIntState2;
        this.$view = view;
        this.$internalInterval$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ScrollingIntervalSelector8(this.$columnState, this.$state, this.$itemHeightPixels$delegate, this.$view, this.$internalInterval$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ScrollingIntervalSelector8) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final LazyListState lazyListState = this.$columnState;
            final Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.ScrollingIntervalSelectorKt$ScrollingIntervalSelector$5$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ScrollingIntervalSelector8.invokeSuspend$lambda$0(lazyListState);
                }
            });
            final IntervalSelectorState intervalSelectorState = this.$state;
            final SnapshotIntState2 snapshotIntState2 = this.$itemHeightPixels$delegate;
            Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<IntervalDto>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.ScrollingIntervalSelectorKt$ScrollingIntervalSelector$5$1$invokeSuspend$$inlined$mapNotNull$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super IntervalDto> flowCollector, Continuation continuation) {
                    Object objCollect = flowSnapshotFlow.collect(new AnonymousClass2(flowCollector, intervalSelectorState, snapshotIntState2), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.ScrollingIntervalSelectorKt$ScrollingIntervalSelector$5$1$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ SnapshotIntState2 $itemHeightPixels$delegate$inlined;
                    final /* synthetic */ IntervalSelectorState $state$inlined;
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.ScrollingIntervalSelectorKt$ScrollingIntervalSelector$5$1$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "ScrollingIntervalSelector.kt", m3646l = {58}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.ScrollingIntervalSelectorKt$ScrollingIntervalSelector$5$1$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
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

                    public AnonymousClass2(FlowCollector flowCollector, IntervalSelectorState intervalSelectorState, SnapshotIntState2 snapshotIntState2) {
                        this.$this_unsafeFlow = flowCollector;
                        this.$state$inlined = intervalSelectorState;
                        this.$itemHeightPixels$delegate$inlined = snapshotIntState2;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        IntervalDto intervalDto;
                        ImmutableList<IntervalDto> intervals;
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
                            Tuples2 tuples2 = (Tuples2) obj;
                            int iIntValue = ((Number) tuples2.component1()).intValue();
                            int iIntValue2 = ((Number) tuples2.component2()).intValue();
                            IntervalSelectorState intervalSelectorState = this.$state$inlined;
                            if (intervalSelectorState == null || (intervals = intervalSelectorState.getIntervals()) == null) {
                                intervalDto = null;
                            } else {
                                if (iIntValue2 >= ScrollingIntervalSelector3.ScrollingIntervalSelector$lambda$4(this.$itemHeightPixels$delegate$inlined) / 2) {
                                    iIntValue++;
                                }
                                intervalDto = (IntervalDto) CollectionsKt.getOrNull(intervals, iIntValue);
                            }
                            if (intervalDto != null) {
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(intervalDto, anonymousClass1) == coroutine_suspended) {
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
            final View view = this.$view;
            final SnapshotState<IntervalDto> snapshotState = this.$internalInterval$delegate;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.ScrollingIntervalSelectorKt$ScrollingIntervalSelector$5$1.3
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((IntervalDto) obj2, (Continuation<? super Unit>) continuation);
                }

                public final Object emit(IntervalDto intervalDto, Continuation<? super Unit> continuation) {
                    snapshotState.setValue(intervalDto);
                    HapticEvents.clockTickEvent(view);
                    return Unit.INSTANCE;
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Tuples2 invokeSuspend$lambda$0(LazyListState lazyListState) {
        return Tuples4.m3642to(Integer.valueOf(lazyListState.getFirstVisibleItemIndex()), Integer.valueOf(lazyListState.getFirstVisibleItemScrollOffset()));
    }
}
