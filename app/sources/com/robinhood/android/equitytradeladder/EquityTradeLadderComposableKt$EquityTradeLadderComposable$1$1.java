package com.robinhood.android.equitytradeladder;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotStateKt;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.LadderState;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.LastPriceVisibilityData;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.LastPriceVisibilityData2;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: EquityTradeLadderComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderComposableKt$EquityTradeLadderComposable$1$1", m3645f = "EquityTradeLadderComposable.kt", m3646l = {79}, m3647m = "invokeSuspend")
/* loaded from: classes3.dex */
final class EquityTradeLadderComposableKt$EquityTradeLadderComposable$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState<Boolean> $isFloatingLastPriceOnTop$delegate;
    final /* synthetic */ SnapshotState<Boolean> $isFloatingLastPriceVisible$delegate;
    final /* synthetic */ LadderState.LadderData $ladderData;
    final /* synthetic */ LazyListState $listState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EquityTradeLadderComposableKt$EquityTradeLadderComposable$1$1(LazyListState lazyListState, LadderState.LadderData ladderData, SnapshotState<Boolean> snapshotState, SnapshotState<Boolean> snapshotState2, Continuation<? super EquityTradeLadderComposableKt$EquityTradeLadderComposable$1$1> continuation) {
        super(2, continuation);
        this.$listState = lazyListState;
        this.$ladderData = ladderData;
        this.$isFloatingLastPriceVisible$delegate = snapshotState;
        this.$isFloatingLastPriceOnTop$delegate = snapshotState2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EquityTradeLadderComposableKt$EquityTradeLadderComposable$1$1(this.$listState, this.$ladderData, this.$isFloatingLastPriceVisible$delegate, this.$isFloatingLastPriceOnTop$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EquityTradeLadderComposableKt$EquityTradeLadderComposable$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final LazyListState lazyListState = this.$listState;
            final LadderState.LadderData ladderData = this.$ladderData;
            Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(new Function0() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderComposableKt$EquityTradeLadderComposable$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EquityTradeLadderComposableKt$EquityTradeLadderComposable$1$1.invokeSuspend$lambda$0(lazyListState, ladderData);
                }
            });
            final SnapshotState<Boolean> snapshotState = this.$isFloatingLastPriceVisible$delegate;
            final SnapshotState<Boolean> snapshotState2 = this.$isFloatingLastPriceOnTop$delegate;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderComposableKt$EquityTradeLadderComposable$1$1.2

                /* compiled from: EquityTradeLadderComposable.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderComposableKt$EquityTradeLadderComposable$1$1$2$WhenMappings */
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[LastPriceVisibilityData2.values().length];
                        try {
                            iArr[LastPriceVisibilityData2.ONSCREEN.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[LastPriceVisibilityData2.OFFSCREEN_TOP.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[LastPriceVisibilityData2.OFFSCREEN_BOTTOM.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((LastPriceVisibilityData) obj2, (Continuation<? super Unit>) continuation);
                }

                public final Object emit(LastPriceVisibilityData lastPriceVisibilityData, Continuation<? super Unit> continuation) {
                    int i2 = WhenMappings.$EnumSwitchMapping$0[lastPriceVisibilityData.getVisibility().ordinal()];
                    if (i2 == 1) {
                        EquityTradeLadderComposableKt.EquityTradeLadderComposable$lambda$8(snapshotState, false);
                    } else if (i2 == 2) {
                        EquityTradeLadderComposableKt.EquityTradeLadderComposable$lambda$5(snapshotState2, true);
                        EquityTradeLadderComposableKt.EquityTradeLadderComposable$lambda$8(snapshotState, true);
                    } else if (i2 == 3) {
                        EquityTradeLadderComposableKt.EquityTradeLadderComposable$lambda$5(snapshotState2, false);
                        EquityTradeLadderComposableKt.EquityTradeLadderComposable$lambda$8(snapshotState, true);
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (flowSnapshotFlow.collect(flowCollector, this) == coroutine_suspended) {
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
    public static final LastPriceVisibilityData invokeSuspend$lambda$0(LazyListState lazyListState, LadderState.LadderData ladderData) {
        return LastPriceVisibilityData.INSTANCE.create(lazyListState, ladderData.getLastPriceIndex());
    }
}
