package com.robinhood.android.optionschain.sbschain.table;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVectors2;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState4;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.options.contracts.OptionChainLaunchMode;
import com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDataState2;
import com.robinhood.android.optionschain.sbschain.disclosure.OptionSideBySideChainDisclosure;
import com.robinhood.android.optionschain.sbschain.table.TableRowState;
import com.robinhood.android.optionschain.sbschain.table.gestures.DragTarget;
import com.robinhood.models.p355ui.OptionLegBundle;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionSideBySideChainTable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableKt$OptionSideBySideChainTable$16$1$2$2$9$1$1 */
/* loaded from: classes11.dex */
final class C24604xcef359e6 implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {
    final /* synthetic */ OptionSideBySideChainDataState2 $callPutSwitcherState;
    final /* synthetic */ float $cellWidth;
    final /* synthetic */ boolean $isSideBySide;
    final /* synthetic */ OptionChainLaunchMode $launchMode;
    final /* synthetic */ SnapshotState4<C2002Dp> $leftScrollableRowOffset$delegate;
    final /* synthetic */ SnapshotState4<C2002Dp> $leftScrollableRowWidth$delegate;
    final /* synthetic */ Function3<Boolean, OptionLegBundle, BidAskCellDisableType, Unit> $onBidAskCellDoubleTap;
    final /* synthetic */ Function3<Boolean, OptionLegBundle, BidAskCellDisableType, Unit> $onBidAskCellLongPress;
    final /* synthetic */ Function3<Boolean, OptionLegBundle, BidAskCellDisableType, Unit> $onBidAskCellSingleTap;
    final /* synthetic */ Function0<Unit> $onHighlightAnimationPlayed;
    final /* synthetic */ SnapshotState4<C2002Dp> $rightScrollableRowOffset$delegate;
    final /* synthetic */ SnapshotState4<C2002Dp> $rightScrollableRowWidth$delegate;
    final /* synthetic */ SnapshotState4<Boolean> $scrollPastBidAsk$delegate;
    final /* synthetic */ Function0<Unit> $scrollToQuote;
    final /* synthetic */ Animatable<Float, AnimationVectors2> $sharedScrollValue;
    final /* synthetic */ SnapshotState4<C2002Dp> $stickCellOffset$delegate;
    final /* synthetic */ Brush $stickyCellBackgroundBrush;
    final /* synthetic */ OptionChainGestureAwareLazyColumn7 $this_OptionChainGestureAwareLazyColumn;
    final /* synthetic */ SnapshotState4<OptionSideBySideChainTableViewState> $viewState$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    C24604xcef359e6(boolean z, Function0<Unit> function0, Animatable<Float, AnimationVectors2> animatable, OptionSideBySideChainDataState2 optionSideBySideChainDataState2, Brush brush, float f, Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function3, Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function32, Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function33, OptionChainGestureAwareLazyColumn7 optionChainGestureAwareLazyColumn7, Function0<Unit> function02, OptionChainLaunchMode optionChainLaunchMode, SnapshotState4<OptionSideBySideChainTableViewState> snapshotState4, SnapshotState4<C2002Dp> snapshotState42, SnapshotState4<C2002Dp> snapshotState43, SnapshotState4<C2002Dp> snapshotState44, SnapshotState4<C2002Dp> snapshotState45, SnapshotState4<C2002Dp> snapshotState46, SnapshotState4<Boolean> snapshotState47) {
        this.$isSideBySide = z;
        this.$scrollToQuote = function0;
        this.$sharedScrollValue = animatable;
        this.$callPutSwitcherState = optionSideBySideChainDataState2;
        this.$stickyCellBackgroundBrush = brush;
        this.$cellWidth = f;
        this.$onBidAskCellSingleTap = function3;
        this.$onBidAskCellDoubleTap = function32;
        this.$onBidAskCellLongPress = function33;
        this.$this_OptionChainGestureAwareLazyColumn = optionChainGestureAwareLazyColumn7;
        this.$onHighlightAnimationPlayed = function02;
        this.$launchMode = optionChainLaunchMode;
        this.$viewState$delegate = snapshotState4;
        this.$leftScrollableRowOffset$delegate = snapshotState42;
        this.$leftScrollableRowWidth$delegate = snapshotState43;
        this.$rightScrollableRowOffset$delegate = snapshotState44;
        this.$rightScrollableRowWidth$delegate = snapshotState45;
        this.$stickCellOffset$delegate = snapshotState46;
        this.$scrollPastBidAsk$delegate = snapshotState47;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
        invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(LazyItemScope items, int i, Composer composer, int i2) {
        int i3;
        OptionSideBySideChainDataState2 optionSideBySideChainDataState2;
        Intrinsics.checkNotNullParameter(items, "$this$items");
        if ((i2 & 48) == 0) {
            i3 = i2 | (composer.changed(i) ? 32 : 16);
        } else {
            i3 = i2;
        }
        if ((i3 & EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) == 144 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(97515943, i3, -1, "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OptionSideBySideChainTable.kt:490)");
        }
        Object obj = (TableRowState) OptionSideBySideChainTableKt.OptionSideBySideChainTable$lambda$8(this.$viewState$delegate).getTableRowStates().get(i).getValue();
        if (obj instanceof TableRowState.Header) {
            composer.startReplaceGroup(-776454165);
            composer.endReplaceGroup();
        } else if (obj instanceof TableRowState.UnderlyingQuoteRow) {
            composer.startReplaceGroup(-776450511);
            OptionSideBySideChainUnderlyingQuoteRow.OptionSideBySideChainUnderlyingQuoteRow(((TableRowState.UnderlyingQuoteRow) obj).getUnderlyingQuoteStr(), LoadingStyle.NONE, this.$isSideBySide, this.$scrollToQuote, composer, 48);
            composer.endReplaceGroup();
        } else if (obj instanceof TableRowState.InstrumentRow) {
            composer.startReplaceGroup(-776435411);
            float fFloatValue = this.$sharedScrollValue.getValue().floatValue();
            TwoSidedScrollableRow twoSidedScrollableRow = (TwoSidedScrollableRow) obj;
            OptionSideBySideChainDataState2 optionSideBySideChainDataState22 = this.$callPutSwitcherState;
            float fOptionSideBySideChainTable$lambda$28 = OptionSideBySideChainTableKt.OptionSideBySideChainTable$lambda$28(this.$leftScrollableRowOffset$delegate);
            float fOptionSideBySideChainTable$lambda$29 = OptionSideBySideChainTableKt.OptionSideBySideChainTable$lambda$29(this.$leftScrollableRowWidth$delegate);
            float fOptionSideBySideChainTable$lambda$30 = OptionSideBySideChainTableKt.OptionSideBySideChainTable$lambda$30(this.$rightScrollableRowOffset$delegate);
            float fOptionSideBySideChainTable$lambda$31 = OptionSideBySideChainTableKt.OptionSideBySideChainTable$lambda$31(this.$rightScrollableRowWidth$delegate);
            float fOptionSideBySideChainTable$lambda$32 = OptionSideBySideChainTableKt.OptionSideBySideChainTable$lambda$32(this.$stickCellOffset$delegate);
            Brush brush = this.$stickyCellBackgroundBrush;
            float f = this.$cellWidth;
            boolean zOptionSideBySideChainTable$lambda$36 = OptionSideBySideChainTableKt.OptionSideBySideChainTable$lambda$36(this.$scrollPastBidAsk$delegate);
            SpreadSelectionState spreadSelectionState = OptionSideBySideChainTableKt.OptionSideBySideChainTable$lambda$8(this.$viewState$delegate).getSpreadSelectionState();
            DragTarget dragTarget = OptionSideBySideChainTableKt.OptionSideBySideChainTable$lambda$8(this.$viewState$delegate).getDragTarget();
            Function3<Boolean, OptionLegBundle, BidAskCellDisableType, Unit> function3 = this.$onBidAskCellSingleTap;
            Function3<Boolean, OptionLegBundle, BidAskCellDisableType, Unit> function32 = this.$onBidAskCellDoubleTap;
            Function3<Boolean, OptionLegBundle, BidAskCellDisableType, Unit> function33 = this.$onBidAskCellLongPress;
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(this.$this_OptionChainGestureAwareLazyColumn);
            final OptionChainGestureAwareLazyColumn7 optionChainGestureAwareLazyColumn7 = this.$this_OptionChainGestureAwareLazyColumn;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance) {
                optionSideBySideChainDataState2 = optionSideBySideChainDataState22;
            } else {
                optionSideBySideChainDataState2 = optionSideBySideChainDataState22;
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                composer.endReplaceGroup();
                OptionSideBySideChainTableKt.m17267OptionSideBySideChainTableRowirZm130(fFloatValue, twoSidedScrollableRow, optionSideBySideChainDataState2, fOptionSideBySideChainTable$lambda$28, fOptionSideBySideChainTable$lambda$29, fOptionSideBySideChainTable$lambda$30, fOptionSideBySideChainTable$lambda$31, fOptionSideBySideChainTable$lambda$32, brush, f, zOptionSideBySideChainTable$lambda$36, spreadSelectionState, dragTarget, null, null, function3, function32, function33, (Function1) objRememberedValue, this.$onHighlightAnimationPlayed, composer, 0, 0, 24576);
                composer.endReplaceGroup();
            }
            objRememberedValue = new Function1() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableKt$OptionSideBySideChainTable$16$1$2$2$9$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return C24604xcef359e6.invoke$lambda$1$lambda$0(optionChainGestureAwareLazyColumn7, (DragTarget) obj2);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
            composer.endReplaceGroup();
            OptionSideBySideChainTableKt.m17267OptionSideBySideChainTableRowirZm130(fFloatValue, twoSidedScrollableRow, optionSideBySideChainDataState2, fOptionSideBySideChainTable$lambda$28, fOptionSideBySideChainTable$lambda$29, fOptionSideBySideChainTable$lambda$30, fOptionSideBySideChainTable$lambda$31, fOptionSideBySideChainTable$lambda$32, brush, f, zOptionSideBySideChainTable$lambda$36, spreadSelectionState, dragTarget, null, null, function3, function32, function33, (Function1) objRememberedValue, this.$onHighlightAnimationPlayed, composer, 0, 0, 24576);
            composer.endReplaceGroup();
        } else {
            if (!Intrinsics.areEqual(obj, TableRowState.DisclosureRow.INSTANCE)) {
                composer.startReplaceGroup(-776455534);
                composer.endReplaceGroup();
                throw new NoWhenBranchMatchedException();
            }
            composer.startReplaceGroup(-776380513);
            OptionSideBySideChainDisclosure.OptionSideBySideChainDisclosure(this.$launchMode, null, null, composer, 0, 6);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(OptionChainGestureAwareLazyColumn7 optionChainGestureAwareLazyColumn7, DragTarget dragTarget) {
        optionChainGestureAwareLazyColumn7.updatePotentialDragTarget(dragTarget);
        return Unit.INSTANCE;
    }
}
