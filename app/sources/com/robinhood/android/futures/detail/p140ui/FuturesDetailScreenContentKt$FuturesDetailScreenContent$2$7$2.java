package com.robinhood.android.futures.detail.p140ui;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotState;
import com.robinhood.android.futures.detail.p140ui.duxo.FuturesDetailViewState;
import com.robinhood.android.models.futures.api.order.FuturesOrderSide;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;

/* compiled from: FuturesDetailScreenContent.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
final class FuturesDetailScreenContentKt$FuturesDetailScreenContent$2$7$2 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
    final /* synthetic */ FuturesDetailScreenCallbacks $fdpCallbacks;
    final /* synthetic */ boolean $isTradeBarVisible;
    final /* synthetic */ FuturesDetailViewState $state;
    final /* synthetic */ SnapshotState<Boolean> $tradeBarExpanded$delegate;
    final /* synthetic */ SnapshotIntState2 $tradeBarHeight$delegate;

    FuturesDetailScreenContentKt$FuturesDetailScreenContent$2$7$2(boolean z, FuturesDetailViewState futuresDetailViewState, FuturesDetailScreenCallbacks futuresDetailScreenCallbacks, SnapshotState<Boolean> snapshotState, SnapshotIntState2 snapshotIntState2) {
        this.$isTradeBarVisible = z;
        this.$state = futuresDetailViewState;
        this.$fdpCallbacks = futuresDetailScreenCallbacks;
        this.$tradeBarExpanded$delegate = snapshotState;
        this.$tradeBarHeight$delegate = snapshotIntState2;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
        invoke(animatedVisibilityScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1282741022, i, -1, "com.robinhood.android.futures.detail.ui.FuturesDetailScreenContent.<anonymous>.<anonymous>.<anonymous> (FuturesDetailScreenContent.kt:134)");
        }
        if (this.$isTradeBarVisible) {
            boolean zFuturesDetailScreenContent$lambda$21$lambda$6 = FuturesDetailScreenContentKt.FuturesDetailScreenContent$lambda$21$lambda$6(this.$tradeBarExpanded$delegate);
            FuturesDetailViewState.TradeBarData tradeBarData = this.$state.getTradeBarData();
            boolean zIsTradeBarInteractive = this.$state.isTradeBarInteractive();
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composer.changedInstance(this.$fdpCallbacks);
            final FuturesDetailScreenCallbacks futuresDetailScreenCallbacks = this.$fdpCallbacks;
            final SnapshotState<Boolean> snapshotState = this.$tradeBarExpanded$delegate;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.futures.detail.ui.FuturesDetailScreenContentKt$FuturesDetailScreenContent$2$7$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return FuturesDetailScreenContentKt$FuturesDetailScreenContent$2$7$2.invoke$lambda$1$lambda$0(futuresDetailScreenCallbacks, snapshotState, ((Boolean) obj).booleanValue());
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance2 = composer.changedInstance(this.$fdpCallbacks) | composer.changedInstance(this.$state);
            final FuturesDetailScreenCallbacks futuresDetailScreenCallbacks2 = this.$fdpCallbacks;
            final FuturesDetailViewState futuresDetailViewState = this.$state;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.futures.detail.ui.FuturesDetailScreenContentKt$FuturesDetailScreenContent$2$7$2$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return FuturesDetailScreenContentKt$FuturesDetailScreenContent$2$7$2.invoke$lambda$3$lambda$2(futuresDetailScreenCallbacks2, futuresDetailViewState, (FuturesOrderSide) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function1 function12 = (Function1) objRememberedValue2;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1746271574);
            boolean zChangedInstance3 = composer.changedInstance(this.$fdpCallbacks) | composer.changedInstance(this.$state);
            final FuturesDetailScreenCallbacks futuresDetailScreenCallbacks3 = this.$fdpCallbacks;
            final FuturesDetailViewState futuresDetailViewState2 = this.$state;
            final SnapshotState<Boolean> snapshotState2 = this.$tradeBarExpanded$delegate;
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.futures.detail.ui.FuturesDetailScreenContentKt$FuturesDetailScreenContent$2$7$2$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FuturesDetailScreenContentKt$FuturesDetailScreenContent$2$7$2.invoke$lambda$5$lambda$4(futuresDetailScreenCallbacks3, futuresDetailViewState2, snapshotState2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            Function0 function0 = (Function0) objRememberedValue3;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1746271574);
            boolean zChangedInstance4 = composer.changedInstance(this.$fdpCallbacks) | composer.changedInstance(this.$state);
            final FuturesDetailScreenCallbacks futuresDetailScreenCallbacks4 = this.$fdpCallbacks;
            final FuturesDetailViewState futuresDetailViewState3 = this.$state;
            final SnapshotState<Boolean> snapshotState3 = this.$tradeBarExpanded$delegate;
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new Function1() { // from class: com.robinhood.android.futures.detail.ui.FuturesDetailScreenContentKt$FuturesDetailScreenContent$2$7$2$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return FuturesDetailScreenContentKt$FuturesDetailScreenContent$2$7$2.invoke$lambda$8$lambda$7(futuresDetailScreenCallbacks4, futuresDetailViewState3, snapshotState3, (FuturesOrderSide) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            }
            Function1 function13 = (Function1) objRememberedValue4;
            composer.endReplaceGroup();
            FuturesDetailScreenCallbacks futuresDetailScreenCallbacks5 = this.$fdpCallbacks;
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance5 = composer.changedInstance(futuresDetailScreenCallbacks5);
            Object objRememberedValue5 = composer.rememberedValue();
            if (zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = new C17066xa44af908(futuresDetailScreenCallbacks5);
                composer.updateRememberedValue(objRememberedValue5);
            }
            composer.endReplaceGroup();
            Function0 function02 = (Function0) ((KFunction) objRememberedValue5);
            Modifier.Companion companion = Modifier.INSTANCE;
            composer.startReplaceGroup(-1633490746);
            final SnapshotState<Boolean> snapshotState4 = this.$tradeBarExpanded$delegate;
            final SnapshotIntState2 snapshotIntState2 = this.$tradeBarHeight$delegate;
            Object objRememberedValue6 = composer.rememberedValue();
            if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue6 = new Function1() { // from class: com.robinhood.android.futures.detail.ui.FuturesDetailScreenContentKt$FuturesDetailScreenContent$2$7$2$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return FuturesDetailScreenContentKt$FuturesDetailScreenContent$2$7$2.invoke$lambda$11$lambda$10(snapshotState4, snapshotIntState2, (LayoutCoordinates) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue6);
            }
            composer.endReplaceGroup();
            TradeBar4.TradeBar(zFuturesDetailScreenContent$lambda$21$lambda$6, tradeBarData, zIsTradeBarInteractive, function1, function12, function0, function13, function02, OnGloballyPositionedModifier3.onGloballyPositioned(companion, (Function1) objRememberedValue6), composer, 100663296, 0);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(FuturesDetailScreenCallbacks futuresDetailScreenCallbacks, SnapshotState snapshotState, boolean z) {
        FuturesDetailScreenContentKt.FuturesDetailScreenContent$lambda$21$lambda$7(snapshotState, z);
        futuresDetailScreenCallbacks.onTradeBarExpanded(z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(FuturesDetailScreenCallbacks futuresDetailScreenCallbacks, FuturesDetailViewState futuresDetailViewState, FuturesOrderSide side) {
        Intrinsics.checkNotNullParameter(side, "side");
        futuresDetailScreenCallbacks.navigateToOnboarding(futuresDetailViewState.getSelectedContractId(), side);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$4(FuturesDetailScreenCallbacks futuresDetailScreenCallbacks, FuturesDetailViewState futuresDetailViewState, SnapshotState snapshotState) {
        FuturesDetailScreenContentKt.FuturesDetailScreenContent$lambda$21$lambda$7(snapshotState, false);
        futuresDetailScreenCallbacks.onTradeBarExpanded(false);
        UUID selectedContractId = futuresDetailViewState.getSelectedContractId();
        if (selectedContractId != null) {
            futuresDetailScreenCallbacks.onContractTradeLadderClicked(selectedContractId);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$8$lambda$7(FuturesDetailScreenCallbacks futuresDetailScreenCallbacks, FuturesDetailViewState futuresDetailViewState, SnapshotState snapshotState, FuturesOrderSide side) {
        Intrinsics.checkNotNullParameter(side, "side");
        FuturesDetailScreenContentKt.FuturesDetailScreenContent$lambda$21$lambda$7(snapshotState, false);
        futuresDetailScreenCallbacks.onTradeBarExpanded(false);
        UUID selectedContractId = futuresDetailViewState.getSelectedContractId();
        if (selectedContractId != null) {
            futuresDetailScreenCallbacks.onContractTradeOrderFormClicked(selectedContractId, side);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$11$lambda$10(SnapshotState snapshotState, SnapshotIntState2 snapshotIntState2, LayoutCoordinates coords) {
        Intrinsics.checkNotNullParameter(coords, "coords");
        if (!FuturesDetailScreenContentKt.FuturesDetailScreenContent$lambda$21$lambda$6(snapshotState) && snapshotIntState2.getIntValue() == 0) {
            snapshotIntState2.setIntValue((int) (coords.mo7241getSizeYbymL2g() & 4294967295L));
        }
        return Unit.INSTANCE;
    }
}
