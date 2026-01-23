package com.robinhood.android.futures.trade.p147ui.ladder;

import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Intrinsic3;
import androidx.compose.foundation.layout.Intrinsic4;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.material.RippleKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.ZIndexModifier2;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.futures.analytics.FuturesAnalyticsStrings;
import com.robinhood.android.futures.ladder.C17286R;
import com.robinhood.android.futures.trade.C17462R;
import com.robinhood.android.futures.trade.extensions.ModifiersKt;
import com.robinhood.android.futures.trade.extensions.Moneys;
import com.robinhood.android.futures.trade.extensions.StringResources4;
import com.robinhood.android.futures.trade.p147ui.ladder.FuturesLadderViewState;
import com.robinhood.android.futures.trade.p147ui.ladder.LadderTopBar7;
import com.robinhood.android.futures.trade.p147ui.ladder.gestures.TapAndLongPressGestureDetector;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.linking.LinkingGroupColors2;
import com.robinhood.android.linking.MobileLinkingColorComposable3;
import com.robinhood.android.linking.MobileLinkingData;
import com.robinhood.android.ticker.TickerTextState;
import com.robinhood.android.ticker.WrappedTickerKt;
import com.robinhood.compose.bento.component.AppBarType;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoIconButton2;
import com.robinhood.compose.bento.component.BentoIconButton4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.tooltips.popup.PopupPositioning;
import com.robinhood.tooltips.popup.PopupTooltipKt;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LadderTopBar.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0095\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0001¢\u0006\u0002\u0010\u0012\u001a\u0087\u0001\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0003¢\u0006\u0002\u0010\u001a\u001au\u0010\u001b\u001a\u00020\u00012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u00152\b\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0003¢\u0006\u0002\u0010%\u001a/\u0010&\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0003¢\u0006\u0002\u0010'\u001a'\u0010(\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0003¢\u0006\u0002\u0010*\u001a\u001c\u0010+\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\"0,2\u0006\u0010)\u001a\u00020\u0005H\u0002¨\u0006.²\u0006\n\u0010/\u001a\u00020\u0005X\u008a\u008e\u0002²\u0006\n\u00100\u001a\u00020\u0005X\u008a\u008e\u0002²\u0006\n\u00101\u001a\u00020\u0005X\u008a\u008e\u0002"}, m3636d2 = {"LadderTopBar", "", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$TopBarData;", "showFtuxTooltip", "", "onFlattenClicked", "Lkotlin/Function0;", "onCloseClick", "onSettingsClick", "onPnLClick", "onOpenOrdersClicked", "dismissFtuxTooltip", "showNextPostTradeFtuxTooltipState", "modifier", "Landroidx/compose/ui/Modifier;", "mobileLinkingData", "Lcom/robinhood/android/linking/MobileLinkingData;", "(Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$TopBarData;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/linking/MobileLinkingData;Landroidx/compose/runtime/Composer;III)V", "TitleContent", "titleStr", "Lcom/robinhood/utils/resource/StringResource;", "flattenButtonData", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$TopBarData$FlattenButtonData;", "dayDeltaDisplay", "isDayDeltaUp", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$TopBarData$FlattenButtonData;Lcom/robinhood/utils/resource/StringResource;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/robinhood/android/linking/MobileLinkingData;Landroidx/compose/runtime/Composer;III)V", "DetailContent", "dayPL", "Ljava/math/BigDecimal;", "openPL", "hasPosition", "positionsDisplay", "pendingOrderQuantity", "", "pendingOrderClickable", "showPnlPriceSwitcherTooltip", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;ZLcom/robinhood/utils/resource/StringResource;Ljava/lang/Integer;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "TopBarTitleCenterContent", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "TopBarDayDeltaContent", "isUp", "(Lcom/robinhood/utils/resource/StringResource;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "getIconForDirection", "Lkotlin/Pair;", "Lcom/robinhood/compose/bento/component/BentoIcons$Size16;", "feature-futures-trade_externalDebug", "showingFlattenConfirmation", "flattenOrdersButtonLongPressed", "pnlPriceSwitcherLongPressed"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.futures.trade.ui.ladder.LadderTopBarKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class LadderTopBar7 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DetailContent$lambda$27(BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z, StringResource stringResource, Integer num, boolean z2, boolean z3, Function0 function0, Function0 function02, Function0 function03, int i, Composer composer, int i2) {
        DetailContent(bigDecimal, bigDecimal2, z, stringResource, num, z2, z3, function0, function02, function03, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LadderTopBar$lambda$0(FuturesLadderViewState.TopBarData topBarData, boolean z, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Function0 function06, Function0 function07, Modifier modifier, MobileLinkingData mobileLinkingData, int i, int i2, int i3, Composer composer, int i4) {
        LadderTopBar(topBarData, z, function0, function02, function03, function04, function05, function06, function07, modifier, mobileLinkingData, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TitleContent$lambda$10(StringResource stringResource, FuturesLadderViewState.TopBarData.FlattenButtonData flattenButtonData, StringResource stringResource2, boolean z, boolean z2, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, MobileLinkingData mobileLinkingData, int i, int i2, int i3, Composer composer, int i4) {
        TitleContent(stringResource, flattenButtonData, stringResource2, z, z2, function0, function02, function03, function04, function05, mobileLinkingData, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TopBarDayDeltaContent$lambda$31(StringResource stringResource, boolean z, Modifier modifier, int i, int i2, Composer composer, int i3) {
        TopBarDayDeltaContent(stringResource, z, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TopBarTitleCenterContent$lambda$29(StringResource stringResource, StringResource stringResource2, boolean z, Modifier modifier, int i, int i2, Composer composer, int i3) {
        TopBarTitleCenterContent(stringResource, stringResource2, z, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* compiled from: LadderTopBar.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.futures.trade.ui.ladder.LadderTopBarKt$TitleContent$3 */
    static final class C175733 implements Function3<Row5, Composer, Integer, Unit> {
        final /* synthetic */ CoroutineScope $coroutineScope;
        final /* synthetic */ Function0<Unit> $dismissFtuxTooltip;
        final /* synthetic */ FuturesLadderViewState.TopBarData.FlattenButtonData $flattenButtonData;
        final /* synthetic */ Function0<Unit> $onSettingsClick;
        final /* synthetic */ boolean $showFtuxTooltip;
        final /* synthetic */ Function0<Unit> $showNextPostTradeFtuxTooltipState;
        final /* synthetic */ SnapshotState<Boolean> $showingFlattenConfirmation$delegate;

        C175733(FuturesLadderViewState.TopBarData.FlattenButtonData flattenButtonData, CoroutineScope coroutineScope, Function0<Unit> function0, boolean z, Function0<Unit> function02, Function0<Unit> function03, SnapshotState<Boolean> snapshotState) {
            this.$flattenButtonData = flattenButtonData;
            this.$coroutineScope = coroutineScope;
            this.$showNextPostTradeFtuxTooltipState = function0;
            this.$showFtuxTooltip = z;
            this.$dismissFtuxTooltip = function02;
            this.$onSettingsClick = function03;
            this.$showingFlattenConfirmation$delegate = snapshotState;
        }

        private static final boolean invoke$lambda$1(SnapshotState<Boolean> snapshotState) {
            return snapshotState.getValue().booleanValue();
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) {
            invoke(row5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        private static final void invoke$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
            snapshotState.setValue(Boolean.valueOf(z));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$11$lambda$10$lambda$5$lambda$4(SnapshotState snapshotState) {
            LadderTopBar7.TitleContent$lambda$3(snapshotState, true);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$11$lambda$10$lambda$7$lambda$6(SnapshotState snapshotState) {
            invoke$lambda$2(snapshotState, true);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$11$lambda$10$lambda$9$lambda$8(SnapshotState snapshotState) {
            invoke$lambda$2(snapshotState, false);
            return Unit.INSTANCE;
        }

        public final void invoke(Row5 BentoAppBar, Composer composer, int i) {
            long jM21427getFg30d7_KjU;
            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1705424173, i, -1, "com.robinhood.android.futures.trade.ui.ladder.TitleContent.<anonymous> (LadderTopBar.kt:168)");
            }
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1764870278);
            if (this.$flattenButtonData.isFlattenButtonVisible()) {
                Modifier.Companion companion2 = Modifier.INSTANCE;
                boolean showFlattenOrdersTooltip = this.$flattenButtonData.getShowFlattenOrdersTooltip();
                CoroutineScope coroutineScope = this.$coroutineScope;
                Function0<Unit> function0 = this.$showNextPostTradeFtuxTooltipState;
                LadderTopBar ladderTopBar = LadderTopBar.INSTANCE;
                Modifier modifierM26519popupTooltipBgaGok8 = PopupTooltipKt.m26519popupTooltipBgaGok8(ModifiersKt.popupAutodismissTooltip$default(companion2, showFlattenOrdersTooltip, coroutineScope, function0, 0L, ladderTopBar.getLambda$1802874608$feature_futures_trade_externalDebug(), 8, null), (16232 & 1) != 0 ? Boolean.TRUE : Boolean.valueOf(invoke$lambda$1(snapshotState)), (16232 & 2) != 0 ? new Function0() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                } : null, (16232 & 4) != 0 ? new Function0() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                } : null, (16232 & 8) != 0 ? new Function0() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                } : null, (16232 & 16) != 0 ? PopupPositioning.FREE : null, (16232 & 32) != 0 ? null : null, (16232 & 64) != 0 ? null : null, (16232 & 128) != 0 ? C2002Dp.m7995constructorimpl(0) : 0.0f, (16232 & 256) != 0, (16232 & 512) != 0 ? C2002Dp.m7995constructorimpl(0) : 0.0f, (16232 & 1024) != 0 ? C2002Dp.m7995constructorimpl(0) : 0.0f, (16232 & 2048) != 0 ? null : null, (16232 & 4096) != 0 ? EnterTransition.INSTANCE.getNone() : null, (16232 & 8192) != 0 ? ExitTransition.INSTANCE.getNone() : null, ladderTopBar.m14770getLambda$280057138$feature_futures_trade_externalDebug());
                FuturesLadderViewState.TopBarData.FlattenButtonData flattenButtonData = this.$flattenButtonData;
                final SnapshotState<Boolean> snapshotState2 = this.$showingFlattenConfirmation$delegate;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM26519popupTooltipBgaGok8);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                if (composer.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor);
                } else {
                    composer.useNode();
                }
                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.NO_VALUE_24);
                String strStringResource = StringResources_androidKt.stringResource(C17462R.string.futures_flatten_label, composer, 0);
                if (flattenButtonData.isFlattenButtonEnabled()) {
                    composer.startReplaceGroup(-180689366);
                    jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU();
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(-180607991);
                    jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21427getFg30d7_KjU();
                    composer.endReplaceGroup();
                }
                composer.startReplaceGroup(1379678129);
                Modifier modifierAutoLogEvents$default = com.robinhood.android.compose.autoeventlogging.ModifiersKt.autoLogEvents$default(PaddingKt.m5142padding3ABfNKs(companion2, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21593getSmallD9Ej5fM()), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), FuturesAnalyticsStrings.LADDER_FLATTEN_BUTTON, null, null, null, new Component(Component.ComponentType.BUTTON, FuturesAnalyticsStrings.LADDER_FLATTEN_BUTTON, null, 4, null), null, 46, null), true, false, false, flattenButtonData.isFlattenButtonEnabled(), false, null, 108, null);
                if (flattenButtonData.isFlattenButtonEnabled()) {
                    IndicationNodeFactory indicationNodeFactoryM5624rippleH2RKhps$default = RippleKt.m5624rippleH2RKhps$default(false, C2002Dp.m7995constructorimpl(20), 0L, 4, null);
                    composer.startReplaceGroup(1849434622);
                    Object objRememberedValue2 = composer.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = InteractionSource2.MutableInteractionSource();
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    InteractionSource3 interactionSource3 = (InteractionSource3) objRememberedValue2;
                    composer.endReplaceGroup();
                    composer.startReplaceGroup(5004770);
                    Object objRememberedValue3 = composer.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new Function0() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderTopBarKt$TitleContent$3$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return LadderTopBar7.C175733.invoke$lambda$11$lambda$10$lambda$5$lambda$4(snapshotState2);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue3);
                    }
                    Function0 function02 = (Function0) objRememberedValue3;
                    composer.endReplaceGroup();
                    composer.startReplaceGroup(5004770);
                    Object objRememberedValue4 = composer.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new Function0() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderTopBarKt$TitleContent$3$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return LadderTopBar7.C175733.invoke$lambda$11$lambda$10$lambda$7$lambda$6(snapshotState);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue4);
                    }
                    Function0 function03 = (Function0) objRememberedValue4;
                    composer.endReplaceGroup();
                    composer.startReplaceGroup(5004770);
                    Object objRememberedValue5 = composer.rememberedValue();
                    if (objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = new Function0() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderTopBarKt$TitleContent$3$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return LadderTopBar7.C175733.invoke$lambda$11$lambda$10$lambda$9$lambda$8(snapshotState);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue5);
                    }
                    composer.endReplaceGroup();
                    modifierAutoLogEvents$default = TapAndLongPressGestureDetector.tapAndLongPressGestureDetector(modifierAutoLogEvents$default, indicationNodeFactoryM5624rippleH2RKhps$default, interactionSource3, function02, function03, (Function0) objRememberedValue5);
                }
                composer.endReplaceGroup();
                BentoIcon2.m20644BentoIconFU0evQE(size24, strStringResource, jM21427getFg30d7_KjU, modifierAutoLogEvents$default, null, false, composer, BentoIcon4.Size24.$stable, 48);
                composer.endNode();
            }
            composer.endReplaceGroup();
            BentoIconButton2.m20641BentoIconButtoncqYvz4g(this.$onSettingsClick, new BentoIconButton4.Icon.HeroSize24(ServerToBentoAssetMapper2.CONTROLS_24), StringResources_androidKt.stringResource(C17462R.string.futures_settings_label, composer, 0), ModifiersKt.popupAutodismissTooltip$default(Modifier.INSTANCE, this.$showFtuxTooltip, this.$coroutineScope, this.$dismissFtuxTooltip, 0L, LadderTopBar.INSTANCE.getLambda$1211588395$feature_futures_trade_externalDebug(), 8, null), BentoIconButton4.Type.Secondary, false, null, null, Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU()), C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(40)), false, composer, (BentoIconButton4.Icon.HeroSize24.$stable << 3) | 805330944, 0, 1248);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LadderTopBar(final FuturesLadderViewState.TopBarData data, final boolean z, final Function0<Unit> onFlattenClicked, final Function0<Unit> onCloseClick, final Function0<Unit> onSettingsClick, final Function0<Unit> onPnLClick, final Function0<Unit> onOpenOrdersClicked, final Function0<Unit> dismissFtuxTooltip, final Function0<Unit> showNextPostTradeFtuxTooltipState, Modifier modifier, MobileLinkingData mobileLinkingData, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        boolean z2;
        Modifier modifier2;
        int i5;
        int i6;
        MobileLinkingData mobileLinkingData2;
        Composer composer2;
        final Modifier modifier3;
        final MobileLinkingData mobileLinkingData3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(onFlattenClicked, "onFlattenClicked");
        Intrinsics.checkNotNullParameter(onCloseClick, "onCloseClick");
        Intrinsics.checkNotNullParameter(onSettingsClick, "onSettingsClick");
        Intrinsics.checkNotNullParameter(onPnLClick, "onPnLClick");
        Intrinsics.checkNotNullParameter(onOpenOrdersClicked, "onOpenOrdersClicked");
        Intrinsics.checkNotNullParameter(dismissFtuxTooltip, "dismissFtuxTooltip");
        Intrinsics.checkNotNullParameter(showNextPostTradeFtuxTooltipState, "showNextPostTradeFtuxTooltipState");
        Composer composerStartRestartGroup = composer.startRestartGroup(208730733);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(data) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
            z2 = z;
        } else {
            z2 = z;
            if ((i & 48) == 0) {
                i4 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
            }
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onFlattenClicked) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onCloseClick) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onSettingsClick) ? 16384 : 8192;
        }
        if ((i3 & 32) != 0) {
            i4 |= 196608;
        } else if ((i & 196608) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onPnLClick) ? 131072 : 65536;
        }
        if ((i3 & 64) != 0) {
            i4 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onOpenOrdersClicked) ? 1048576 : 524288;
        }
        if ((i3 & 128) != 0) {
            i4 |= 12582912;
        } else if ((i & 12582912) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(dismissFtuxTooltip) ? 8388608 : 4194304;
        }
        if ((i3 & 256) != 0) {
            i4 |= 100663296;
        } else if ((i & 100663296) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(showNextPostTradeFtuxTooltipState) ? 67108864 : 33554432;
        }
        int i7 = i3 & 512;
        if (i7 != 0) {
            i4 |= 805306368;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            if ((i & 805306368) == 0) {
                i4 |= composerStartRestartGroup.changed(modifier2) ? 536870912 : 268435456;
            }
        }
        int i8 = i3 & 1024;
        if (i8 != 0) {
            i6 = i2 | 6;
        } else {
            if ((i2 & 6) != 0) {
                i5 = i2;
                if ((i4 & 306783379) == 306783378 || (i5 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
                    if (i7 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    MobileLinkingData mobileLinkingData4 = i8 == 0 ? null : mobileLinkingData;
                    if (ComposerKt.isTraceInProgress()) {
                        mobileLinkingData2 = mobileLinkingData4;
                    } else {
                        mobileLinkingData2 = mobileLinkingData4;
                        ComposerKt.traceEventStart(208730733, i4, i5, "com.robinhood.android.futures.trade.ui.ladder.LadderTopBar (LadderTopBar.kt:83)");
                    }
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i9 = BentoTheme.$stable;
                    final boolean z3 = z2;
                    final MobileLinkingData mobileLinkingData5 = mobileLinkingData2;
                    Modifier modifier4 = modifier2;
                    composer2 = composerStartRestartGroup;
                    SurfaceKt.m5967SurfaceT9BRK9s(ZIndexModifier2.zIndex(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), 1.0f), null, bentoTheme.getColors(composerStartRestartGroup, i9).m21371getBg0d7_KjU(), bentoTheme.getColors(composerStartRestartGroup, i9).m21425getFg0d7_KjU(), 0.0f, C2002Dp.m7995constructorimpl(2), null, ComposableLambda3.rememberComposableLambda(2132748018, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderTopBarKt.LadderTopBar.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i10) {
                            if ((i10 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2132748018, i10, -1, "com.robinhood.android.futures.trade.ui.ladder.LadderTopBar.<anonymous> (LadderTopBar.kt:92)");
                            }
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                            FuturesLadderViewState.TopBarData topBarData = data;
                            boolean z4 = z3;
                            Function0<Unit> function0 = dismissFtuxTooltip;
                            Function0<Unit> function02 = showNextPostTradeFtuxTooltipState;
                            Function0<Unit> function03 = onFlattenClicked;
                            Function0<Unit> function04 = onCloseClick;
                            Function0<Unit> function05 = onSettingsClick;
                            MobileLinkingData mobileLinkingData6 = mobileLinkingData5;
                            Function0<Unit> function06 = onPnLClick;
                            Function0<Unit> function07 = onOpenOrdersClicked;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierFillMaxWidth$default);
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            if (composer3.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            StringResource title = topBarData.getTitle();
                            FuturesLadderViewState.TopBarData.FlattenButtonData flattenData = topBarData.getFlattenData();
                            StringResource dayDeltaDisplay = topBarData.getDayDeltaDisplay();
                            boolean zIsDayDeltaUp = topBarData.isDayDeltaUp();
                            int i11 = StringResource.$stable;
                            LadderTopBar7.TitleContent(title, flattenData, dayDeltaDisplay, zIsDayDeltaUp, z4, function0, function02, function03, function04, function05, mobileLinkingData6, composer3, i11 | (i11 << 6), MobileLinkingData.$stable, 0);
                            LadderTopBar7.DetailContent(topBarData.getDayPL(), topBarData.getOpenPL(), topBarData.getHasPosition(), topBarData.getPositionsDisplay(), topBarData.getPendingOrderQuantity(), topBarData.getCanClickOnPendingOrders(), topBarData.getShowPnlPriceSwitcherTooltip(), function06, function07, function02, composer3, i11 << 9);
                            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21373getBg30d7_KjU(), 0.0f, composer3, 0, 5);
                            composer3.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composer2, 12779520, 82);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                    mobileLinkingData3 = mobileLinkingData5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier2;
                    mobileLinkingData3 = mobileLinkingData;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderTopBarKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return LadderTopBar7.LadderTopBar$lambda$0(data, z, onFlattenClicked, onCloseClick, onSettingsClick, onPnLClick, onOpenOrdersClicked, dismissFtuxTooltip, showNextPostTradeFtuxTooltipState, modifier3, mobileLinkingData3, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i6 = i2 | ((i2 & 8) == 0 ? composerStartRestartGroup.changed(mobileLinkingData) : composerStartRestartGroup.changedInstance(mobileLinkingData) ? 4 : 2);
        }
        i5 = i6;
        if ((i4 & 306783379) == 306783378) {
            if (i7 != 0) {
            }
            if (i8 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i92 = BentoTheme.$stable;
            final boolean z32 = z2;
            final MobileLinkingData mobileLinkingData52 = mobileLinkingData2;
            Modifier modifier42 = modifier2;
            composer2 = composerStartRestartGroup;
            SurfaceKt.m5967SurfaceT9BRK9s(ZIndexModifier2.zIndex(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), 1.0f), null, bentoTheme2.getColors(composerStartRestartGroup, i92).m21371getBg0d7_KjU(), bentoTheme2.getColors(composerStartRestartGroup, i92).m21425getFg0d7_KjU(), 0.0f, C2002Dp.m7995constructorimpl(2), null, ComposableLambda3.rememberComposableLambda(2132748018, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderTopBarKt.LadderTopBar.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i10) {
                    if ((i10 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2132748018, i10, -1, "com.robinhood.android.futures.trade.ui.ladder.LadderTopBar.<anonymous> (LadderTopBar.kt:92)");
                    }
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    FuturesLadderViewState.TopBarData topBarData = data;
                    boolean z4 = z32;
                    Function0<Unit> function0 = dismissFtuxTooltip;
                    Function0<Unit> function02 = showNextPostTradeFtuxTooltipState;
                    Function0<Unit> function03 = onFlattenClicked;
                    Function0<Unit> function04 = onCloseClick;
                    Function0<Unit> function05 = onSettingsClick;
                    MobileLinkingData mobileLinkingData6 = mobileLinkingData52;
                    Function0<Unit> function06 = onPnLClick;
                    Function0<Unit> function07 = onOpenOrdersClicked;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierFillMaxWidth$default);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                    if (composer3.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    StringResource title = topBarData.getTitle();
                    FuturesLadderViewState.TopBarData.FlattenButtonData flattenData = topBarData.getFlattenData();
                    StringResource dayDeltaDisplay = topBarData.getDayDeltaDisplay();
                    boolean zIsDayDeltaUp = topBarData.isDayDeltaUp();
                    int i11 = StringResource.$stable;
                    LadderTopBar7.TitleContent(title, flattenData, dayDeltaDisplay, zIsDayDeltaUp, z4, function0, function02, function03, function04, function05, mobileLinkingData6, composer3, i11 | (i11 << 6), MobileLinkingData.$stable, 0);
                    LadderTopBar7.DetailContent(topBarData.getDayPL(), topBarData.getOpenPL(), topBarData.getHasPosition(), topBarData.getPositionsDisplay(), topBarData.getPendingOrderQuantity(), topBarData.getCanClickOnPendingOrders(), topBarData.getShowPnlPriceSwitcherTooltip(), function06, function07, function02, composer3, i11 << 9);
                    BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21373getBg30d7_KjU(), 0.0f, composer3, 0, 5);
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composer2, 12779520, 82);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier42;
            mobileLinkingData3 = mobileLinkingData52;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final boolean DetailContent$lambda$26$lambda$13(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final boolean TitleContent$lambda$2(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* compiled from: LadderTopBar.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.futures.trade.ui.ladder.LadderTopBarKt$TitleContent$2 */
    static final class C175722 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
        final /* synthetic */ MobileLinkingData $mobileLinkingData;
        final /* synthetic */ Function0<Unit> $onCloseClick;

        C175722(Function0<Unit> function0, MobileLinkingData mobileLinkingData) {
            this.$onCloseClick = function0;
            this.$mobileLinkingData = mobileLinkingData;
        }

        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
            if ((i & 6) == 0) {
                i2 = i | ((i & 8) == 0 ? composer.changed(BentoAppBar) : composer.changedInstance(BentoAppBar) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1491478162, i2, -1, "com.robinhood.android.futures.trade.ui.ladder.TitleContent.<anonymous> (LadderTopBar.kt:146)");
            }
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            Function0<Unit> function0 = this.$onCloseClick;
            final MobileLinkingData mobileLinkingData = this.$mobileLinkingData;
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, 0L, function0, composer, (BentoAppBarScope.$stable << 12) | ((i2 << 12) & 57344), 7);
            composer.startReplaceGroup(-1976097445);
            if (mobileLinkingData != null) {
                Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion, C2002Dp.m7995constructorimpl(10)), composer, 6);
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance = composer.changedInstance(mobileLinkingData);
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderTopBarKt$TitleContent$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LadderTopBar7.C175722.invoke$lambda$2$lambda$1$lambda$0(mobileLinkingData);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                MobileLinkingColorComposable3.m16071MobileLinkingColorComposableKTwxG1Y(LinkingGroupColors2.toComposeColor(mobileLinkingData.getLinkingGroup().getColor(), composer, 0), ClickableKt.m4893clickableXHw0xAI$default(companion, false, null, null, (Function0) objRememberedValue, 7, null), null, composer, 0, 4);
            }
            composer.endReplaceGroup();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
            invoke(bentoAppBarScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1$lambda$0(MobileLinkingData mobileLinkingData) {
            mobileLinkingData.getCallbacks().openSelectGroupSheet();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:175:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TitleContent(final StringResource stringResource, final FuturesLadderViewState.TopBarData.FlattenButtonData flattenButtonData, final StringResource stringResource2, final boolean z, final boolean z2, final Function0<Unit> function0, final Function0<Unit> function02, final Function0<Unit> function03, final Function0<Unit> function04, final Function0<Unit> function05, MobileLinkingData mobileLinkingData, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        boolean z3;
        int i5;
        int i6;
        int i7;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        Composer.Companion companion2;
        final SnapshotState snapshotState;
        Composer composer2;
        final MobileLinkingData mobileLinkingData2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(322101647);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = ((i & 8) == 0 ? composerStartRestartGroup.changed(stringResource) : composerStartRestartGroup.changedInstance(stringResource) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else {
            if ((i & 48) == 0) {
                i4 |= composerStartRestartGroup.changed(flattenButtonData) ? 32 : 16;
            }
            if ((i3 & 4) == 0) {
                i4 |= 384;
            } else if ((i & 384) == 0) {
                i4 |= (i & 512) == 0 ? composerStartRestartGroup.changed(stringResource2) : composerStartRestartGroup.changedInstance(stringResource2) ? 256 : 128;
            }
            if ((i3 & 8) == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                i4 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
            }
            if ((i3 & 16) == 0) {
                i4 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    z3 = z2;
                    i4 |= composerStartRestartGroup.changed(z3) ? 16384 : 8192;
                }
                if ((i3 & 32) != 0) {
                    i4 |= 196608;
                } else {
                    if ((i & 196608) == 0) {
                        i4 |= composerStartRestartGroup.changedInstance(function0) ? 131072 : 65536;
                    }
                    if ((i3 & 64) == 0) {
                        i4 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i4 |= composerStartRestartGroup.changedInstance(function02) ? 1048576 : 524288;
                    }
                    if ((i3 & 128) != 0) {
                        i8 = (12582912 & i) == 0 ? composerStartRestartGroup.changedInstance(function03) ? 8388608 : 4194304 : 12582912;
                        if ((i3 & 256) != 0) {
                            i4 |= 100663296;
                        } else if ((i & 100663296) == 0) {
                            i4 |= composerStartRestartGroup.changedInstance(function04) ? 67108864 : 33554432;
                        }
                        if ((i3 & 512) != 0) {
                            i4 |= 805306368;
                        } else {
                            if ((805306368 & i) == 0) {
                                i4 |= composerStartRestartGroup.changedInstance(function05) ? 536870912 : 268435456;
                            }
                            i5 = i3 & 1024;
                            if (i5 == 0) {
                                i7 = i2 | 6;
                            } else {
                                if ((i2 & 6) != 0) {
                                    i6 = i2;
                                    if ((i4 & 306783379) == 306783378 && (i6 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        mobileLinkingData2 = mobileLinkingData;
                                        composer2 = composerStartRestartGroup;
                                    } else {
                                        MobileLinkingData mobileLinkingData3 = i5 == 0 ? null : mobileLinkingData;
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(322101647, i4, i6, "com.robinhood.android.futures.trade.ui.ladder.TitleContent (LadderTopBar.kt:138)");
                                        }
                                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                                        companion = Composer.INSTANCE;
                                        if (objRememberedValue == companion.getEmpty()) {
                                            objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                        }
                                        CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
                                        composerStartRestartGroup.startReplaceGroup(1849434622);
                                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                        if (objRememberedValue2 != companion.getEmpty()) {
                                            companion2 = companion;
                                            SnapshotState snapshotStateMutableStateOf$default = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                            composerStartRestartGroup.updateRememberedValue(snapshotStateMutableStateOf$default);
                                            objRememberedValue2 = snapshotStateMutableStateOf$default;
                                        } else {
                                            companion2 = companion;
                                        }
                                        snapshotState = (SnapshotState) objRememberedValue2;
                                        composerStartRestartGroup.endReplaceGroup();
                                        Modifier.Companion companion3 = Modifier.INSTANCE;
                                        int i9 = i4;
                                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(782557762, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderTopBarKt.TitleContent.1
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                invoke(composer3, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer3, int i10) {
                                                if ((i10 & 3) == 2 && composer3.getSkipping()) {
                                                    composer3.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(782557762, i10, -1, "com.robinhood.android.futures.trade.ui.ladder.TitleContent.<anonymous> (LadderTopBar.kt:160)");
                                                }
                                                StringResource stringResource3 = stringResource;
                                                StringResource stringResource4 = stringResource2;
                                                boolean z4 = z;
                                                int i11 = StringResource.$stable;
                                                LadderTopBar7.TopBarTitleCenterContent(stringResource3, stringResource4, z4, null, composer3, i11 | (i11 << 3), 8);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composerStartRestartGroup, 54), PaddingKt.m5144paddingVpY3zN4$default(companion3, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 0.0f, 2, null), ComposableLambda3.rememberComposableLambda(-1491478162, true, new C175722(function04, mobileLinkingData3), composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(1705424173, true, new C175733(flattenButtonData, coroutineScope, function02, z3, function0, function05, snapshotState), composerStartRestartGroup, 54), null, false, false, AppBarType.CENTER_ALIGNED, null, 0L, null, composerStartRestartGroup, 12586374, 0, 1904);
                                        composer2 = composerStartRestartGroup;
                                        if (TitleContent$lambda$2(snapshotState)) {
                                            String strStringResource = StringResources_androidKt.stringResource(C17286R.string.futures_ladder_flatten_dialog_title, composer2, 0);
                                            BentoAlertDialog2.Body.Text text = new BentoAlertDialog2.Body.Text(StringResources_androidKt.stringResource(C17286R.string.futures_ladder_flatten_dialog_desc, composer2, 0));
                                            String strStringResource2 = StringResources_androidKt.stringResource(C17286R.string.futures_ladder_flatten_yes_label, composer2, 0);
                                            composer2.startReplaceGroup(-1633490746);
                                            boolean z4 = (i9 & 29360128) == 8388608;
                                            Object objRememberedValue3 = composer2.rememberedValue();
                                            if (z4 || objRememberedValue3 == companion2.getEmpty()) {
                                                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderTopBarKt$$ExternalSyntheticLambda3
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        return LadderTopBar7.TitleContent$lambda$5$lambda$4(function03, snapshotState);
                                                    }
                                                };
                                                composer2.updateRememberedValue(objRememberedValue3);
                                            }
                                            composer2.endReplaceGroup();
                                            UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                                            Component.ComponentType componentType = Component.ComponentType.BUTTON;
                                            BentoAlertButton bentoAlertButton = new BentoAlertButton(strStringResource2, (Function0) objRememberedValue3, com.robinhood.android.compose.autoeventlogging.ModifiersKt.autoLogEvents$default(companion3, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, null, null, new Component(componentType, FuturesAnalyticsStrings.FUTURES_LADDER_FLATTEN_CONFIRM, null, 4, null), null, 47, null), true, false, false, true, false, null, 108, null), null, null, false, 56, null);
                                            String strStringResource3 = StringResources_androidKt.stringResource(C17286R.string.futures_ladder_flatten_no_label, composer2, 0);
                                            composer2.startReplaceGroup(5004770);
                                            Object objRememberedValue4 = composer2.rememberedValue();
                                            if (objRememberedValue4 == companion2.getEmpty()) {
                                                objRememberedValue4 = new Function0() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderTopBarKt$$ExternalSyntheticLambda4
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        return LadderTopBar7.TitleContent$lambda$7$lambda$6(snapshotState);
                                                    }
                                                };
                                                composer2.updateRememberedValue(objRememberedValue4);
                                            }
                                            composer2.endReplaceGroup();
                                            BentoAlertButton bentoAlertButton2 = new BentoAlertButton(strStringResource3, (Function0) objRememberedValue4, com.robinhood.android.compose.autoeventlogging.ModifiersKt.autoLogEvents$default(companion3, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(componentType, FuturesAnalyticsStrings.FUTURES_LADDER_FLATTEN_CANCEL, null, 4, null), null, 47, null), true, false, false, true, false, null, 108, null), null, null, false, 56, null);
                                            composer2.startReplaceGroup(5004770);
                                            Object objRememberedValue5 = composer2.rememberedValue();
                                            if (objRememberedValue5 == companion2.getEmpty()) {
                                                objRememberedValue5 = new Function0() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderTopBarKt$$ExternalSyntheticLambda5
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        return LadderTopBar7.TitleContent$lambda$9$lambda$8(snapshotState);
                                                    }
                                                };
                                                composer2.updateRememberedValue(objRememberedValue5);
                                            }
                                            Function0 function06 = (Function0) objRememberedValue5;
                                            composer2.endReplaceGroup();
                                            int i10 = (BentoAlertDialog2.Body.Text.$stable << 3) | 100663296;
                                            int i11 = BentoAlertButton.$stable;
                                            BentoAlertDialog.BentoAlertDialog(strStringResource, text, bentoAlertButton, null, bentoAlertButton2, null, false, null, function06, composer2, i10 | (i11 << 6) | (i11 << 12), EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        mobileLinkingData2 = mobileLinkingData3;
                                    }
                                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                    if (scopeUpdateScopeEndRestartGroup != null) {
                                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderTopBarKt$$ExternalSyntheticLambda6
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                return LadderTopBar7.TitleContent$lambda$10(stringResource, flattenButtonData, stringResource2, z, z2, function0, function02, function03, function04, function05, mobileLinkingData2, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                i7 = i2 | ((i2 & 8) == 0 ? composerStartRestartGroup.changed(mobileLinkingData) : composerStartRestartGroup.changedInstance(mobileLinkingData) ? 4 : 2);
                            }
                            i6 = i7;
                            if ((i4 & 306783379) == 306783378) {
                                if (i5 == 0) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                companion = Composer.INSTANCE;
                                if (objRememberedValue == companion.getEmpty()) {
                                }
                                CoroutineScope coroutineScope2 = (CoroutineScope) objRememberedValue;
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue2 != companion.getEmpty()) {
                                }
                                snapshotState = (SnapshotState) objRememberedValue2;
                                composerStartRestartGroup.endReplaceGroup();
                                Modifier.Companion companion32 = Modifier.INSTANCE;
                                int i92 = i4;
                                BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(782557762, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderTopBarKt.TitleContent.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i102) {
                                        if ((i102 & 3) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(782557762, i102, -1, "com.robinhood.android.futures.trade.ui.ladder.TitleContent.<anonymous> (LadderTopBar.kt:160)");
                                        }
                                        StringResource stringResource3 = stringResource;
                                        StringResource stringResource4 = stringResource2;
                                        boolean z42 = z;
                                        int i112 = StringResource.$stable;
                                        LadderTopBar7.TopBarTitleCenterContent(stringResource3, stringResource4, z42, null, composer3, i112 | (i112 << 3), 8);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composerStartRestartGroup, 54), PaddingKt.m5144paddingVpY3zN4$default(companion32, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 0.0f, 2, null), ComposableLambda3.rememberComposableLambda(-1491478162, true, new C175722(function04, mobileLinkingData3), composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(1705424173, true, new C175733(flattenButtonData, coroutineScope2, function02, z3, function0, function05, snapshotState), composerStartRestartGroup, 54), null, false, false, AppBarType.CENTER_ALIGNED, null, 0L, null, composerStartRestartGroup, 12586374, 0, 1904);
                                composer2 = composerStartRestartGroup;
                                if (TitleContent$lambda$2(snapshotState)) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                mobileLinkingData2 = mobileLinkingData3;
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        i5 = i3 & 1024;
                        if (i5 == 0) {
                        }
                        i6 = i7;
                        if ((i4 & 306783379) == 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    i4 |= i8;
                    if ((i3 & 256) != 0) {
                    }
                    if ((i3 & 512) != 0) {
                    }
                    i5 = i3 & 1024;
                    if (i5 == 0) {
                    }
                    i6 = i7;
                    if ((i4 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                if ((i3 & 64) == 0) {
                }
                if ((i3 & 128) != 0) {
                }
                i4 |= i8;
                if ((i3 & 256) != 0) {
                }
                if ((i3 & 512) != 0) {
                }
                i5 = i3 & 1024;
                if (i5 == 0) {
                }
                i6 = i7;
                if ((i4 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            z3 = z2;
            if ((i3 & 32) != 0) {
            }
            if ((i3 & 64) == 0) {
            }
            if ((i3 & 128) != 0) {
            }
            i4 |= i8;
            if ((i3 & 256) != 0) {
            }
            if ((i3 & 512) != 0) {
            }
            i5 = i3 & 1024;
            if (i5 == 0) {
            }
            i6 = i7;
            if ((i4 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i3 & 4) == 0) {
        }
        if ((i3 & 8) == 0) {
        }
        if ((i3 & 16) == 0) {
        }
        z3 = z2;
        if ((i3 & 32) != 0) {
        }
        if ((i3 & 64) == 0) {
        }
        if ((i3 & 128) != 0) {
        }
        i4 |= i8;
        if ((i3 & 256) != 0) {
        }
        if ((i3 & 512) != 0) {
        }
        i5 = i3 & 1024;
        if (i5 == 0) {
        }
        i6 = i7;
        if ((i4 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TitleContent$lambda$3(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TitleContent$lambda$5$lambda$4(Function0 function0, SnapshotState snapshotState) {
        TitleContent$lambda$3(snapshotState, false);
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TitleContent$lambda$7$lambda$6(SnapshotState snapshotState) {
        TitleContent$lambda$3(snapshotState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TitleContent$lambda$9$lambda$8(SnapshotState snapshotState) {
        TitleContent$lambda$3(snapshotState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DetailContent(final BigDecimal bigDecimal, final BigDecimal bigDecimal2, final boolean z, final StringResource stringResource, final Integer num, final boolean z2, final boolean z3, final Function0<Unit> function0, final Function0<Unit> function02, final Function0<Unit> function03, Composer composer, final int i) {
        int i2;
        boolean z4;
        long jM21427getFg30d7_KjU;
        long jM21427getFg30d7_KjU2;
        long jM21427getFg30d7_KjU3;
        Composer composer2;
        long jM21452getNegative0d7_KjU;
        long jM21452getNegative0d7_KjU2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-371168568);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(bigDecimal) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(bigDecimal2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(stringResource) : composerStartRestartGroup.changedInstance(stringResource) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(num) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(z3) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function02) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function03) ? 536870912 : 268435456;
        }
        if ((i2 & 306783379) == 306783378 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-371168568, i2, -1, "com.robinhood.android.futures.trade.ui.ladder.DetailContent (LadderTopBar.kt:312)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierHeight = Intrinsic3.height(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Intrinsic4.Max);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = i2;
            int i4 = BentoTheme.$stable;
            Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(modifierHeight, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM(), C2002Dp.m7995constructorimpl(12));
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Horizontal start = arrangement.getStart();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(start, companion2.getTop(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5143paddingVpY3zN4);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            Alignment.Horizontal start2 = companion2.getStart();
            Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
            float f = 0;
            Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(Row5.weight$default(row6, SizeKt.m5174width3ABfNKs(companion, C2002Dp.m7995constructorimpl(f)), 1.0f, false, 2, null), 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(spaceBetween, start2, composerStartRestartGroup, 54);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxHeight$default);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-19912234);
            if (bigDecimal != null) {
                if (BigDecimals7.m2977eq(bigDecimal, BigDecimal.ZERO)) {
                    composerStartRestartGroup.startReplaceGroup(-617217097);
                    jM21452getNegative0d7_KjU2 = bentoTheme.getColors(composerStartRestartGroup, i4).m21427getFg30d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                } else if (BigDecimals7.isPositive(bigDecimal)) {
                    composerStartRestartGroup.startReplaceGroup(-617126670);
                    jM21452getNegative0d7_KjU2 = bentoTheme.getColors(composerStartRestartGroup, i4).m21456getPositive0d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-617055246);
                    jM21452getNegative0d7_KjU2 = bentoTheme.getColors(composerStartRestartGroup, i4).m21452getNegative0d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                }
                z4 = true;
                WrappedTickerKt.TickerText(new TickerTextState(Moneys.formatDeltaCurrency$default(bigDecimal, null, 1, null), jM21452getNegative0d7_KjU2, TickerTextState.Style.REGULAR_MEDIUM_BOLD, null, false, 24, null), null, composerStartRestartGroup, TickerTextState.$stable, 2);
            } else {
                z4 = true;
            }
            composerStartRestartGroup.endReplaceGroup();
            if ((bigDecimal == null || BigDecimals7.isZero(bigDecimal)) ? false : z4) {
                composerStartRestartGroup.startReplaceGroup(-19890032);
                jM21427getFg30d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i4).m21425getFg0d7_KjU();
            } else {
                composerStartRestartGroup.startReplaceGroup(-19889199);
                jM21427getFg30d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i4).m21427getFg30d7_KjU();
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C17286R.string.futures_ladder_day_pnl_label, composerStartRestartGroup, 0), PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 13, null), Color.m6701boximpl(jM21427getFg30d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i4).getTextS(), composerStartRestartGroup, 0, 0, 8184);
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion4 = Composer.INSTANCE;
            if (objRememberedValue == companion4.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion4.getEmpty()) {
                objRememberedValue2 = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue2;
            final EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            final Context context = ((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor())).getContext();
            Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
            Arrangement.HorizontalOrVertical spaceBetween2 = arrangement.getSpaceBetween();
            Modifier modifierFillMaxHeight$default2 = SizeKt.fillMaxHeight$default(Row5.weight$default(row6, SizeKt.m5174width3ABfNKs(companion, C2002Dp.m7995constructorimpl(f)), 1.0f, false, 2, null), 0.0f, 1, null);
            Indication indication = (Indication) composerStartRestartGroup.consume(IndicationKt.getLocalIndication());
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion4.getEmpty()) {
                objRememberedValue3 = InteractionSource2.MutableInteractionSource();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            InteractionSource3 interactionSource3 = (InteractionSource3) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(context) | ((i3 & 29360128) == 8388608);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue4 == companion4.getEmpty()) {
                objRememberedValue4 = new Function0() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderTopBarKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LadderTopBar7.DetailContent$lambda$26$lambda$17$lambda$16(current, context, function0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            Function0 function04 = (Function0) objRememberedValue4;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(5004770);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion4.getEmpty()) {
                objRememberedValue5 = new Function0() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderTopBarKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LadderTopBar7.DetailContent$lambda$26$lambda$19$lambda$18(snapshotState);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            Function0 function05 = (Function0) objRememberedValue5;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(5004770);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == companion4.getEmpty()) {
                objRememberedValue6 = new Function0() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderTopBarKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LadderTopBar7.DetailContent$lambda$26$lambda$21$lambda$20(snapshotState);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierTapAndLongPressGestureDetector = TapAndLongPressGestureDetector.tapAndLongPressGestureDetector(modifierFillMaxHeight$default2, indication, interactionSource3, function04, function05, (Function0) objRememberedValue6);
            LadderTopBar ladderTopBar = LadderTopBar.INSTANCE;
            Modifier modifierM26519popupTooltipBgaGok8 = PopupTooltipKt.m26519popupTooltipBgaGok8(ModifiersKt.popupAutodismissTooltip$default(modifierTapAndLongPressGestureDetector, z3, coroutineScope, function03, 0L, ladderTopBar.m14769getLambda$1647013818$feature_futures_trade_externalDebug(), 8, null), (16232 & 1) != 0 ? Boolean.TRUE : Boolean.valueOf(DetailContent$lambda$26$lambda$13(snapshotState)), (16232 & 2) != 0 ? new Function0() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            } : null, (16232 & 4) != 0 ? new Function0() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            } : null, (16232 & 8) != 0 ? new Function0() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            } : null, (16232 & 16) != 0 ? PopupPositioning.FREE : null, (16232 & 32) != 0 ? null : null, (16232 & 64) != 0 ? null : null, (16232 & 128) != 0 ? C2002Dp.m7995constructorimpl(0) : 0.0f, (16232 & 256) != 0, (16232 & 512) != 0 ? C2002Dp.m7995constructorimpl(0) : 0.0f, (16232 & 1024) != 0 ? C2002Dp.m7995constructorimpl(0) : 0.0f, (16232 & 2048) != 0 ? null : null, (16232 & 4096) != 0 ? EnterTransition.INSTANCE.getNone() : null, (16232 & 8192) != 0 ? ExitTransition.INSTANCE.getNone() : null, ladderTopBar.m14771getLambda$849847000$feature_futures_trade_externalDebug());
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(spaceBetween2, centerHorizontally, composerStartRestartGroup, 54);
            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM26519popupTooltipBgaGok8);
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
            composerStartRestartGroup.startReplaceGroup(-517751459);
            if (bigDecimal2 != null) {
                if (BigDecimals7.isZero(bigDecimal2) && !z) {
                    composerStartRestartGroup.startReplaceGroup(1129645102);
                    jM21452getNegative0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i4).m21427getFg30d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                } else if (BigDecimals7.isNegative(bigDecimal2)) {
                    composerStartRestartGroup.startReplaceGroup(1129808937);
                    jM21452getNegative0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i4).m21452getNegative0d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(1129737513);
                    jM21452getNegative0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i4).m21456getPositive0d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                }
                WrappedTickerKt.TickerText(new TickerTextState(Formats.getCurrencyDeltaFormat().format(bigDecimal2), jM21452getNegative0d7_KjU, TickerTextState.Style.REGULAR_MEDIUM_BOLD, null, false, 24, null), null, composerStartRestartGroup, TickerTextState.$stable, 2);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (z) {
                composerStartRestartGroup.startReplaceGroup(-517728743);
                jM21427getFg30d7_KjU2 = bentoTheme.getColors(composerStartRestartGroup, i4).m21425getFg0d7_KjU();
            } else {
                composerStartRestartGroup.startReplaceGroup(-517727910);
                jM21427getFg30d7_KjU2 = bentoTheme.getColors(composerStartRestartGroup, i4).m21427getFg30d7_KjU();
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoText2.m20747BentoText38GnDrw(StringResources4.getText(stringResource, composerStartRestartGroup, StringResource.$stable | ((i3 >> 9) & 14)), PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 13, null), Color.m6701boximpl(jM21427getFg30d7_KjU2), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i4).getTextS(), composerStartRestartGroup, 0, 0, 8184);
            composerStartRestartGroup.endNode();
            Alignment.Horizontal end = companion2.getEnd();
            Arrangement.HorizontalOrVertical spaceBetween3 = arrangement.getSpaceBetween();
            Modifier modifierFillMaxHeight$default3 = SizeKt.fillMaxHeight$default(Row5.weight$default(row6, SizeKt.m5174width3ABfNKs(companion, C2002Dp.m7995constructorimpl(f)), 1.0f, false, 2, null), 0.0f, 1, null);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z5 = (i3 & 234881024) == 67108864;
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (z5 || objRememberedValue7 == companion4.getEmpty()) {
                objRememberedValue7 = new Function0() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderTopBarKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LadderTopBar7.DetailContent$lambda$26$lambda$24$lambda$23(function02);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifierFillMaxHeight$default3, z2, null, null, (Function0) objRememberedValue7, 6, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(spaceBetween3, end, composerStartRestartGroup, 54);
            int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4893clickableXHw0xAI$default);
            Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor4);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyColumnMeasurePolicy3, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion3.getSetModifier());
            if (z2) {
                composerStartRestartGroup.startReplaceGroup(1305922488);
                jM21427getFg30d7_KjU3 = bentoTheme.getColors(composerStartRestartGroup, i4).m21425getFg0d7_KjU();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1305980055);
                jM21427getFg30d7_KjU3 = bentoTheme.getColors(composerStartRestartGroup, i4).m21427getFg30d7_KjU();
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.startReplaceGroup(-1897531920);
            if (num != null) {
                BentoText2.m20747BentoText38GnDrw(num.toString(), null, Color.m6701boximpl(jM21427getFg30d7_KjU3), null, null, null, null, 0, false, 0, 0, null, 0, LadderStyleKt.getTextMBold(bentoTheme.getTypography(composerStartRestartGroup, i4)), composerStartRestartGroup, 0, 0, 8186);
            }
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C17286R.string.futures_ladder_pending_orders_label, composerStartRestartGroup, 0), null, Color.m6701boximpl(jM21427getFg30d7_KjU3), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i4).getTextS(), composer2, 0, 0, 8186);
            composer2.endNode();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderTopBarKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LadderTopBar7.DetailContent$lambda$27(bigDecimal, bigDecimal2, z, stringResource, num, z2, z3, function0, function02, function03, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void DetailContent$lambda$26$lambda$14(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DetailContent$lambda$26$lambda$17$lambda$16(EventLogger eventLogger, Context context, Function0 function0) {
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, new Screen(Screen.Name.FUTURES_LADDER_SCREEN, null, null, null, 14, null), new Component(Component.ComponentType.BUTTON, FuturesAnalyticsStrings.FUTURES_PNL_SWITCHER, null, 4, null), null, context, false, 41, null);
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DetailContent$lambda$26$lambda$19$lambda$18(SnapshotState snapshotState) {
        DetailContent$lambda$26$lambda$14(snapshotState, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DetailContent$lambda$26$lambda$21$lambda$20(SnapshotState snapshotState) {
        DetailContent$lambda$26$lambda$14(snapshotState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DetailContent$lambda$26$lambda$24$lambda$23(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TopBarTitleCenterContent(final StringResource stringResource, final StringResource stringResource2, final boolean z, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-632624861);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(stringResource) : composerStartRestartGroup.changedInstance(stringResource) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(stringResource2) : composerStartRestartGroup.changedInstance(stringResource2) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
                }
                if ((i3 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier2;
                } else {
                    Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-632624861, i3, -1, "com.robinhood.android.futures.trade.ui.ladder.TopBarTitleCenterContent (LadderTopBar.kt:477)");
                    }
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 54);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    int i5 = StringResource.$stable;
                    String text = StringResources4.getText(stringResource, composerStartRestartGroup, (i3 & 14) | i5);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    TextStyle textM = bentoTheme.getTypography(composerStartRestartGroup, i6).getTextM();
                    long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i6).m21425getFg0d7_KjU();
                    composer2 = composerStartRestartGroup;
                    Modifier modifier5 = modifier4;
                    BentoText2.m20747BentoText38GnDrw(text, Modifier.INSTANCE, Color.m6701boximpl(jM21425getFg0d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, textM, composer2, 48, 0, 8184);
                    int i7 = i3 >> 3;
                    TopBarDayDeltaContent(stringResource2, z, null, composer2, i5 | (i7 & 14) | (i7 & 112), 4);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderTopBarKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return LadderTopBar7.TopBarTitleCenterContent$lambda$29(stringResource, stringResource2, z, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            modifier2 = modifier;
            if ((i3 & 1171) == 1170) {
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 54);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    int i52 = StringResource.$stable;
                    String text2 = StringResources4.getText(stringResource, composerStartRestartGroup, (i3 & 14) | i52);
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i62 = BentoTheme.$stable;
                    TextStyle textM2 = bentoTheme2.getTypography(composerStartRestartGroup, i62).getTextM();
                    long jM21425getFg0d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i62).m21425getFg0d7_KjU();
                    composer2 = composerStartRestartGroup;
                    Modifier modifier52 = modifier4;
                    BentoText2.m20747BentoText38GnDrw(text2, Modifier.INSTANCE, Color.m6701boximpl(jM21425getFg0d7_KjU2), null, null, null, null, 0, false, 0, 0, null, 0, textM2, composer2, 48, 0, 8184);
                    int i72 = i3 >> 3;
                    TopBarDayDeltaContent(stringResource2, z, null, composer2, i52 | (i72 & 14) | (i72 & 112), 4);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier52;
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void TopBarDayDeltaContent(final StringResource stringResource, final boolean z, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        long jM21452getNegative0d7_KjU;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-893229079);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(stringResource) : composerStartRestartGroup.changedInstance(stringResource) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) != 146 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-893229079, i3, -1, "com.robinhood.android.futures.trade.ui.ladder.TopBarDayDeltaContent (LadderTopBar.kt:501)");
                }
                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                Arrangement arrangement = Arrangement.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i5).m21595getXsmallD9Ej5fM()), centerVertically, composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                if (!z) {
                    composerStartRestartGroup.startReplaceGroup(-958993405);
                    jM21452getNegative0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21456getPositive0d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-958937853);
                    jM21452getNegative0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21452getNegative0d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                }
                long jM6705copywmQWz5c$default = Color.m6705copywmQWz5c$default(jM21452getNegative0d7_KjU, !bentoTheme.getColors(composerStartRestartGroup, i5).getIsDay() ? 0.8f : 0.6f, 0.0f, 0.0f, 0.0f, 14, null);
                Tuples2<BentoIcon4.Size16, Integer> iconForDirection = getIconForDirection(z);
                BentoIcon4.Size16 size16Component1 = iconForDirection.component1();
                int iIntValue = iconForDirection.component2().intValue();
                Modifier modifier5 = modifier4;
                BentoIcon2.m20644BentoIconFU0evQE(size16Component1, StringResources_androidKt.stringResource(iIntValue, composerStartRestartGroup, 0), Color.m6705copywmQWz5c$default(jM6705copywmQWz5c$default, 0.6f, 0.0f, 0.0f, 0.0f, 14, null), Modifier.INSTANCE, null, false, composerStartRestartGroup, BentoIcon4.Size16.$stable | 3072, 48);
                WrappedTickerKt.TickerText(new TickerTextState(StringResources4.getText(stringResource, composerStartRestartGroup, (i3 & 14) | StringResource.$stable), jM6705copywmQWz5c$default, TickerTextState.Style.REGULAR_SMALL, null, false, 24, null), null, composerStartRestartGroup, TickerTextState.$stable, 2);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderTopBarKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return LadderTopBar7.TopBarDayDeltaContent$lambda$31(stringResource, z, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) != 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
            Arrangement arrangement2 = Arrangement.INSTANCE;
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement2.m5089spacedBy0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21595getXsmallD9Ej5fM()), centerVertically2, composerStartRestartGroup, 48);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                Row6 row62 = Row6.INSTANCE;
                if (!z) {
                }
                long jM6705copywmQWz5c$default2 = Color.m6705copywmQWz5c$default(jM21452getNegative0d7_KjU, !bentoTheme2.getColors(composerStartRestartGroup, i52).getIsDay() ? 0.8f : 0.6f, 0.0f, 0.0f, 0.0f, 14, null);
                Tuples2<BentoIcon4.Size16, Integer> iconForDirection2 = getIconForDirection(z);
                BentoIcon4.Size16 size16Component12 = iconForDirection2.component1();
                int iIntValue2 = iconForDirection2.component2().intValue();
                Modifier modifier52 = modifier4;
                BentoIcon2.m20644BentoIconFU0evQE(size16Component12, StringResources_androidKt.stringResource(iIntValue2, composerStartRestartGroup, 0), Color.m6705copywmQWz5c$default(jM6705copywmQWz5c$default2, 0.6f, 0.0f, 0.0f, 0.0f, 14, null), Modifier.INSTANCE, null, false, composerStartRestartGroup, BentoIcon4.Size16.$stable | 3072, 48);
                WrappedTickerKt.TickerText(new TickerTextState(StringResources4.getText(stringResource, composerStartRestartGroup, (i3 & 14) | StringResource.$stable), jM6705copywmQWz5c$default2, TickerTextState.Style.REGULAR_SMALL, null, false, 24, null), null, composerStartRestartGroup, TickerTextState.$stable, 2);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final Tuples2<BentoIcon4.Size16, Integer> getIconForDirection(boolean z) {
        if (z) {
            return Tuples4.m3642to(new BentoIcon4.Size16(ServerToBentoAssetMapper2.STOCK_UP_16), Integer.valueOf(C11048R.string.general_label_delta_up));
        }
        return Tuples4.m3642to(new BentoIcon4.Size16(ServerToBentoAssetMapper2.STOCK_DOWN_16), Integer.valueOf(C11048R.string.general_label_delta_down));
    }
}
