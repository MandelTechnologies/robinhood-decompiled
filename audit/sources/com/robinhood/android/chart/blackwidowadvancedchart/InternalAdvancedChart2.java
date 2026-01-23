package com.robinhood.android.chart.blackwidowadvancedchart;

import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.chart.blackwidowadvancedchart.duxo.AdvanceChartOrderDuxo4;
import com.robinhood.android.chart.blackwidowadvancedchart.duxo.AdvanceChartOrderViewState;
import com.robinhood.android.chart.blackwidowadvancedchart.models.BwTradeSide;
import com.robinhood.android.chart.blackwidowadvancedchart.utils.Logging4;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.trading.orderstate.InstrumentOrderState;
import com.robinhood.utils.extensions.Uuids;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InternalAdvancedChart.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/chart/blackwidowadvancedchart/models/BwTradeSide;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.InternalAdvancedChartKt$InternalAdvancedChart$2$3$1", m3645f = "InternalAdvancedChart.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_NOTE_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.InternalAdvancedChartKt$InternalAdvancedChart$2$3$1, reason: use source file name */
/* loaded from: classes7.dex */
final class InternalAdvancedChart2 extends ContinuationImpl7 implements Function2<BwTradeSide, Continuation<? super Unit>, Object> {
    final /* synthetic */ UserInteractionEventDescriptor $eventDescriptor;
    final /* synthetic */ EventLogger $eventLogger;
    final /* synthetic */ AdvanceChartOrderDuxo4 $orderCallbacks;
    final /* synthetic */ AdvanceChartOrderViewState $orderViewState;
    /* synthetic */ Object L$0;
    int label;

    /* compiled from: InternalAdvancedChart.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.InternalAdvancedChartKt$InternalAdvancedChart$2$3$1$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BwTradeSide.values().length];
            try {
                iArr[BwTradeSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BwTradeSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InternalAdvancedChart2(AdvanceChartOrderViewState advanceChartOrderViewState, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, AdvanceChartOrderDuxo4 advanceChartOrderDuxo4, Continuation<? super InternalAdvancedChart2> continuation) {
        super(2, continuation);
        this.$orderViewState = advanceChartOrderViewState;
        this.$eventLogger = eventLogger;
        this.$eventDescriptor = userInteractionEventDescriptor;
        this.$orderCallbacks = advanceChartOrderDuxo4;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InternalAdvancedChart2 internalAdvancedChart2 = new InternalAdvancedChart2(this.$orderViewState, this.$eventLogger, this.$eventDescriptor, this.$orderCallbacks, continuation);
        internalAdvancedChart2.L$0 = obj;
        return internalAdvancedChart2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(BwTradeSide bwTradeSide, Continuation<? super Unit> continuation) {
        return ((InternalAdvancedChart2) create(bwTradeSide, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            BwTradeSide bwTradeSide = (BwTradeSide) this.L$0;
            InstrumentOrderState instrumentOrderState = this.$orderViewState.getInstrumentOrderState();
            if (instrumentOrderState != null) {
                EventLogger eventLogger = this.$eventLogger;
                UserInteractionEventDescriptor userInteractionEventDescriptor = this.$eventDescriptor;
                AdvanceChartOrderDuxo4 advanceChartOrderDuxo4 = this.$orderCallbacks;
                UUID uuidRandomUUID = UUID.randomUUID();
                Screen screen = userInteractionEventDescriptor.getScreen();
                Component.ComponentType componentType = Component.ComponentType.PILL;
                int i2 = WhenMappings.$EnumSwitchMapping$0[bwTradeSide.ordinal()];
                if (i2 == 1) {
                    str = "Buy";
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "Sell";
                }
                Component component = new Component(componentType, str, null, 4, null);
                Intrinsics.checkNotNull(uuidRandomUUID);
                EventLogger.DefaultImpls.logTap$default(eventLogger, null, screen, component, null, Logging4.updateEventDescriptor$default(userInteractionEventDescriptor, null, null, null, null, null, null, 0.0d, false, null, null, null, null, 0.0d, Uuids.safeToString(uuidRandomUUID), null, 24575, null).getContext(), false, 41, null);
                this.label = 1;
                if (advanceChartOrderDuxo4.onTrade(bwTradeSide, instrumentOrderState, uuidRandomUUID, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
