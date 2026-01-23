package com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.p011ui.hapticfeedback.HapticFeedback;
import androidx.compose.p011ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotStateKt;
import black_widow.contracts.mobile_app_chart.proto.p024v1.IntervalDto;
import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: ScrollingIntervalSelector.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.ScrollingIntervalSelectorKt$ScrollingIntervalSelector$6$1", m3645f = "ScrollingIntervalSelector.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_EXIT_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.ScrollingIntervalSelectorKt$ScrollingIntervalSelector$6$1, reason: use source file name */
/* loaded from: classes7.dex */
final class ScrollingIntervalSelector9 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LazyListState $columnState;
    final /* synthetic */ HapticFeedback $hapticFeedback;
    final /* synthetic */ SnapshotState<IntervalDto> $internalInterval$delegate;
    final /* synthetic */ Function1<IntervalDto, Unit> $onIntervalSelected;
    final /* synthetic */ SnapshotState<Boolean> $showIntervalSelector$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ScrollingIntervalSelector9(LazyListState lazyListState, HapticFeedback hapticFeedback, SnapshotState<IntervalDto> snapshotState, Function1<? super IntervalDto, Unit> function1, SnapshotState<Boolean> snapshotState2, Continuation<? super ScrollingIntervalSelector9> continuation) {
        super(2, continuation);
        this.$columnState = lazyListState;
        this.$hapticFeedback = hapticFeedback;
        this.$internalInterval$delegate = snapshotState;
        this.$onIntervalSelected = function1;
        this.$showIntervalSelector$delegate = snapshotState2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ScrollingIntervalSelector9(this.$columnState, this.$hapticFeedback, this.$internalInterval$delegate, this.$onIntervalSelected, this.$showIntervalSelector$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ScrollingIntervalSelector9) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final LazyListState lazyListState = this.$columnState;
            Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(SnapshotStateKt.snapshotFlow(new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.ScrollingIntervalSelectorKt$ScrollingIntervalSelector$6$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(lazyListState.isScrollInProgress());
                }
            }));
            C106812 c106812 = new C106812(this.$hapticFeedback, this.$internalInterval$delegate, this.$onIntervalSelected, this.$showIntervalSelector$delegate, null);
            this.label = 1;
            if (FlowKt.collectLatest(flowDistinctUntilChanged, c106812, this) == coroutine_suspended) {
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

    /* compiled from: ScrollingIntervalSelector.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "isScrolling", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.ScrollingIntervalSelectorKt$ScrollingIntervalSelector$6$1$2", m3645f = "ScrollingIntervalSelector.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.ScrollingIntervalSelectorKt$ScrollingIntervalSelector$6$1$2 */
    static final class C106812 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
        final /* synthetic */ HapticFeedback $hapticFeedback;
        final /* synthetic */ SnapshotState<IntervalDto> $internalInterval$delegate;
        final /* synthetic */ Function1<IntervalDto, Unit> $onIntervalSelected;
        final /* synthetic */ SnapshotState<Boolean> $showIntervalSelector$delegate;
        /* synthetic */ boolean Z$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C106812(HapticFeedback hapticFeedback, SnapshotState<IntervalDto> snapshotState, Function1<? super IntervalDto, Unit> function1, SnapshotState<Boolean> snapshotState2, Continuation<? super C106812> continuation) {
            super(2, continuation);
            this.$hapticFeedback = hapticFeedback;
            this.$internalInterval$delegate = snapshotState;
            this.$onIntervalSelected = function1;
            this.$showIntervalSelector$delegate = snapshotState2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C106812 c106812 = new C106812(this.$hapticFeedback, this.$internalInterval$delegate, this.$onIntervalSelected, this.$showIntervalSelector$delegate, continuation);
            c106812.Z$0 = ((Boolean) obj).booleanValue();
            return c106812;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
            return ((C106812) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (!this.Z$0) {
                    IntervalDto intervalDtoScrollingIntervalSelector$lambda$1 = ScrollingIntervalSelector3.ScrollingIntervalSelector$lambda$1(this.$internalInterval$delegate);
                    if (intervalDtoScrollingIntervalSelector$lambda$1 != null) {
                        this.$onIntervalSelected.invoke(intervalDtoScrollingIntervalSelector$lambda$1);
                    }
                    this.label = 1;
                    if (DelayKt.delay(2000L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.$hapticFeedback.mo7039performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m7046getLongPress5zf0vsI());
            ScrollingIntervalSelector3.ScrollingIntervalSelector$lambda$9(this.$showIntervalSelector$delegate, false);
            return Unit.INSTANCE;
        }
    }
}
