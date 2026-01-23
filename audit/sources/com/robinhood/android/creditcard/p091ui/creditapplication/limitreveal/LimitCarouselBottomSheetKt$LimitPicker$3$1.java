package com.robinhood.android.creditcard.p091ui.creditapplication.limitreveal;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotStateKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: LimitCarouselBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.limitreveal.LimitCarouselBottomSheetKt$LimitPicker$3$1", m3645f = "LimitCarouselBottomSheet.kt", m3646l = {450}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes2.dex */
final class LimitCarouselBottomSheetKt$LimitPicker$3$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isDepositsDragging;
    final /* synthetic */ SnapshotIntState2 $itemHeightPixels$delegate;
    final /* synthetic */ LazyListState $lazyListState;
    final /* synthetic */ Function1<Integer, Unit> $onSelected;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    LimitCarouselBottomSheetKt$LimitPicker$3$1(LazyListState lazyListState, SnapshotIntState2 snapshotIntState2, boolean z, Function1<? super Integer, Unit> function1, Continuation<? super LimitCarouselBottomSheetKt$LimitPicker$3$1> continuation) {
        super(2, continuation);
        this.$lazyListState = lazyListState;
        this.$itemHeightPixels$delegate = snapshotIntState2;
        this.$isDepositsDragging = z;
        this.$onSelected = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LimitCarouselBottomSheetKt$LimitPicker$3$1(this.$lazyListState, this.$itemHeightPixels$delegate, this.$isDepositsDragging, this.$onSelected, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LimitCarouselBottomSheetKt$LimitPicker$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final LazyListState lazyListState = this.$lazyListState;
            final Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.limitreveal.LimitCarouselBottomSheetKt$LimitPicker$3$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LimitCarouselBottomSheetKt$LimitPicker$3$1.invokeSuspend$lambda$0(lazyListState);
                }
            });
            final SnapshotIntState2 snapshotIntState2 = this.$itemHeightPixels$delegate;
            Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<Integer>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.limitreveal.LimitCarouselBottomSheetKt$LimitPicker$3$1$invokeSuspend$$inlined$mapNotNull$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super Integer> flowCollector, Continuation continuation) {
                    Object objCollect = flowSnapshotFlow.collect(new AnonymousClass2(flowCollector, snapshotIntState2), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.limitreveal.LimitCarouselBottomSheetKt$LimitPicker$3$1$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ SnapshotIntState2 $itemHeightPixels$delegate$inlined;
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.limitreveal.LimitCarouselBottomSheetKt$LimitPicker$3$1$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "LimitCarouselBottomSheet.kt", m3646l = {56}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.limitreveal.LimitCarouselBottomSheetKt$LimitPicker$3$1$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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

                    public AnonymousClass2(FlowCollector flowCollector, SnapshotIntState2 snapshotIntState2) {
                        this.$this_unsafeFlow = flowCollector;
                        this.$itemHeightPixels$delegate$inlined = snapshotIntState2;
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
                            Tuples2 tuples2 = (Tuples2) obj;
                            int iIntValue = ((Number) tuples2.component1()).intValue();
                            if (((Number) tuples2.component2()).intValue() >= this.$itemHeightPixels$delegate$inlined.getIntValue() / 2) {
                                iIntValue++;
                            }
                            Integer numBoxInt = boxing.boxInt(iIntValue);
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(numBoxInt, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
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
            final boolean z = this.$isDepositsDragging;
            final Function1<Integer, Unit> function1 = this.$onSelected;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.creditcard.ui.creditapplication.limitreveal.LimitCarouselBottomSheetKt$LimitPicker$3$1.3
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
                }

                public final Object emit(int i2, Continuation<? super Unit> continuation) {
                    if (!z) {
                        function1.invoke(boxing.boxInt(i2));
                    }
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
