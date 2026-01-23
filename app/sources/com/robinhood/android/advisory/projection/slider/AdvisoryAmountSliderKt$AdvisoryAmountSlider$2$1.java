package com.robinhood.android.advisory.projection.slider;

import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotStateKt;
import com.robinhood.models.util.Money;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
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

/* compiled from: AdvisoryAmountSlider.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.advisory.projection.slider.AdvisoryAmountSliderKt$AdvisoryAmountSlider$2$1", m3645f = "AdvisoryAmountSlider.kt", m3646l = {96}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes7.dex */
final class AdvisoryAmountSliderKt$AdvisoryAmountSlider$2$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState<Boolean> $alreadyAligned$delegate;
    final /* synthetic */ ImmutableList<Money> $amountList;
    final /* synthetic */ LazyListState $listState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdvisoryAmountSliderKt$AdvisoryAmountSlider$2$1(LazyListState lazyListState, ImmutableList<Money> immutableList, SnapshotState<Boolean> snapshotState, Continuation<? super AdvisoryAmountSliderKt$AdvisoryAmountSlider$2$1> continuation) {
        super(2, continuation);
        this.$listState = lazyListState;
        this.$amountList = immutableList;
        this.$alreadyAligned$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvisoryAmountSliderKt$AdvisoryAmountSlider$2$1(this.$listState, this.$amountList, this.$alreadyAligned$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AdvisoryAmountSliderKt$AdvisoryAmountSlider$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final LazyListState lazyListState = this.$listState;
            final Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(new Function0() { // from class: com.robinhood.android.advisory.projection.slider.AdvisoryAmountSliderKt$AdvisoryAmountSlider$2$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AdvisoryAmountSliderKt$AdvisoryAmountSlider$2$1.invokeSuspend$lambda$0(lazyListState);
                }
            });
            Flow flowTake = FlowKt.take(new Flow<List<? extends LazyListItemInfo>>() { // from class: com.robinhood.android.advisory.projection.slider.AdvisoryAmountSliderKt$AdvisoryAmountSlider$2$1$invokeSuspend$$inlined$filter$1

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.advisory.projection.slider.AdvisoryAmountSliderKt$AdvisoryAmountSlider$2$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.advisory.projection.slider.AdvisoryAmountSliderKt$AdvisoryAmountSlider$2$1$invokeSuspend$$inlined$filter$1$2", m3645f = "AdvisoryAmountSlider.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.advisory.projection.slider.AdvisoryAmountSliderKt$AdvisoryAmountSlider$2$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
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
                            if (!((List) obj).isEmpty()) {
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
                public Object collect(FlowCollector<? super List<? extends LazyListItemInfo>> flowCollector, Continuation continuation) {
                    Object objCollect = flowSnapshotFlow.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            }, 1);
            C92923 c92923 = new C92923(this.$listState, this.$amountList, this.$alreadyAligned$delegate);
            this.label = 1;
            if (flowTake.collect(c92923, this) == coroutine_suspended) {
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
    public static final List invokeSuspend$lambda$0(LazyListState lazyListState) {
        return lazyListState.getLayoutInfo().getVisibleItemsInfo();
    }

    /* compiled from: AdvisoryAmountSlider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.advisory.projection.slider.AdvisoryAmountSliderKt$AdvisoryAmountSlider$2$1$3 */
    static final class C92923<T> implements FlowCollector {
        final /* synthetic */ SnapshotState<Boolean> $alreadyAligned$delegate;
        final /* synthetic */ ImmutableList<Money> $amountList;
        final /* synthetic */ LazyListState $listState;

        C92923(LazyListState lazyListState, ImmutableList<Money> immutableList, SnapshotState<Boolean> snapshotState) {
            this.$listState = lazyListState;
            this.$amountList = immutableList;
            this.$alreadyAligned$delegate = snapshotState;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return emit((List<? extends LazyListItemInfo>) obj, (Continuation<? super Unit>) continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(List<? extends LazyListItemInfo> list, Continuation<? super Unit> continuation) {
            AdvisoryAmountSliderKt$AdvisoryAmountSlider$2$1$3$emit$1 advisoryAmountSliderKt$AdvisoryAmountSlider$2$1$3$emit$1;
            if (continuation instanceof AdvisoryAmountSliderKt$AdvisoryAmountSlider$2$1$3$emit$1) {
                advisoryAmountSliderKt$AdvisoryAmountSlider$2$1$3$emit$1 = (AdvisoryAmountSliderKt$AdvisoryAmountSlider$2$1$3$emit$1) continuation;
                int i = advisoryAmountSliderKt$AdvisoryAmountSlider$2$1$3$emit$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    advisoryAmountSliderKt$AdvisoryAmountSlider$2$1$3$emit$1.label = i - Integer.MIN_VALUE;
                } else {
                    advisoryAmountSliderKt$AdvisoryAmountSlider$2$1$3$emit$1 = new AdvisoryAmountSliderKt$AdvisoryAmountSlider$2$1$3$emit$1(this, continuation);
                }
            }
            Object obj = advisoryAmountSliderKt$AdvisoryAmountSlider$2$1$3$emit$1.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = advisoryAmountSliderKt$AdvisoryAmountSlider$2$1$3$emit$1.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                LazyListState lazyListState = this.$listState;
                ImmutableList<Money> immutableList = this.$amountList;
                advisoryAmountSliderKt$AdvisoryAmountSlider$2$1$3$emit$1.label = 1;
                if (AdvisoryAmountSliderKt.autoAlignToNearestTick(lazyListState, immutableList, advisoryAmountSliderKt$AdvisoryAmountSlider$2$1$3$emit$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            AdvisoryAmountSliderKt.AdvisoryAmountSlider_TN_CM5M$lambda$3(this.$alreadyAligned$delegate, true);
            return Unit.INSTANCE;
        }
    }
}
