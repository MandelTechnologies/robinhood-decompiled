package com.robinhood.shared.trade.crypto.p397ui.quickTrade.views;

import android.content.res.Configuration;
import androidx.compose.animation.core.AnimateAsState;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.Easing3;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransition4;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Alpha;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextMeasurer;
import androidx.compose.p011ui.text.TextMeasurerHelper;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Constraints2;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.TextUnit;
import androidx.compose.p011ui.unit.TextUnit2;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.common.AnimateShake;
import com.robinhood.shared.trade.crypto.C40095R;
import com.robinhood.shared.trade.crypto.p397ui.quickTrade.sheet.CryptoQuickTradeSheetEvent;
import com.robinhood.shared.trade.crypto.p397ui.quickTrade.views.CryptoInputRowCurrencyToggle4;
import com.robinhood.shared.trade.crypto.p397ui.quickTrade.views.CryptoQuickTradeAmountInputRow4;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* compiled from: CryptoQuickTradeAmountInputRow.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\u001a?\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0007¢\u0006\u0002\u0010\u000b\u001a7\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001d\u0010\u0015\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0018H\u0003¢\u0006\u0002\u0010\u0019\u001a\r\u0010\u001a\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001b\u001a\r\u0010\u001c\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001b¨\u0006\u001d²\u0006\n\u0010\u001e\u001a\u00020\u001fX\u008a\u008e\u0002²\u0006\n\u0010 \u001a\u00020\u001fX\u008a\u008e\u0002²\u0006\n\u0010!\u001a\u00020\u001fX\u008a\u008e\u0002²\u0006\n\u0010\"\u001a\u00020\u0016X\u008a\u0084\u0002²\u0006\n\u0010#\u001a\u00020\u0016X\u008a\u0084\u0002"}, m3636d2 = {"CryptoQuickTradeAmountInputRow", "", "state", "Lcom/robinhood/shared/trade/crypto/ui/quickTrade/views/CryptoQuickTradeAmountInputRowState;", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/shared/trade/crypto/ui/quickTrade/sheet/CryptoQuickTradeSheetEvent;", "modifier", "Landroidx/compose/ui/Modifier;", "onCurrencySwitcherClicked", "Lkotlin/Function0;", "(Lcom/robinhood/shared/trade/crypto/ui/quickTrade/views/CryptoQuickTradeAmountInputRowState;Lcom/robinhood/android/udf/event/Event;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "AmountInput", "text", "", "currencySwitcherState", "Lcom/robinhood/shared/trade/crypto/ui/quickTrade/views/CurrencySwitcherState;", "leftSidePadding", "Landroidx/compose/ui/unit/Dp;", "AmountInput-6a0pyJM", "(Ljava/lang/String;Lcom/robinhood/shared/trade/crypto/ui/quickTrade/views/CurrencySwitcherState;FLcom/robinhood/android/udf/event/Event;Landroidx/compose/runtime/Composer;I)V", "rememberTextWidthPx", "", ResourceTypes.STYLE, "Landroidx/compose/ui/text/TextStyle;", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;I)F", "CryptoQuickTradeAmountInputRowPreview", "(Landroidx/compose/runtime/Composer;I)V", "CryptoQuickTradeAmountInputRowPreviewAnimation", "feature-trade-crypto_externalDebug", "primaryRowWidth", "", "secondaryRowWidth", "shakeKey", "phase", "animatedScale"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.trade.crypto.ui.quickTrade.views.CryptoQuickTradeAmountInputRowKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class CryptoQuickTradeAmountInputRow4 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AmountInput_6a0pyJM$lambda$16(String str, CryptoInputRowCurrencyToggle4 cryptoInputRowCurrencyToggle4, float f, Event event, int i, Composer composer, int i2) {
        m25967AmountInput6a0pyJM(str, cryptoInputRowCurrencyToggle4, f, event, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoQuickTradeAmountInputRow$lambda$8(CryptoQuickTradeAmountInputRowState cryptoQuickTradeAmountInputRowState, Event event, Modifier modifier, Function0 function0, int i, int i2, Composer composer, int i3) {
        CryptoQuickTradeAmountInputRow(cryptoQuickTradeAmountInputRowState, event, modifier, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoQuickTradeAmountInputRowPreview$lambda$17(int i, Composer composer, int i2) {
        CryptoQuickTradeAmountInputRowPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoQuickTradeAmountInputRowPreviewAnimation$lambda$18(int i, Composer composer, int i2) {
        CryptoQuickTradeAmountInputRowPreviewAnimation(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoQuickTradeAmountInputRow(final CryptoQuickTradeAmountInputRowState state, final Event<CryptoQuickTradeSheetEvent> event, Modifier modifier, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function0<Unit> function02;
        Function0<Unit> function03;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        Composer composer2;
        final Modifier modifier3;
        final Function0<Unit> function04;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1397398784);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(event) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    function02 = function0;
                    i3 |= composerStartRestartGroup.changedInstance(function02) ? 2048 : 1024;
                }
                if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if (i4 == 0) {
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.quickTrade.views.CryptoQuickTradeAmountInputRowKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        function03 = (Function0) objRememberedValue3;
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        function03 = function02;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1397398784, i3, -1, "com.robinhood.shared.trade.crypto.ui.quickTrade.views.CryptoQuickTradeAmountInputRow (CryptoQuickTradeAmountInputRow.kt:54)");
                    }
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotIntState3.mutableIntStateOf(0);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    final SnapshotIntState2 snapshotIntState2 = (SnapshotIntState2) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotIntState3.mutableIntStateOf(0);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    final SnapshotIntState2 snapshotIntState22 = (SnapshotIntState2) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifier5 = modifier4;
                    Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifier5, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null);
                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-848510979, true, new C405822(snapshotIntState2, state, function03), composerStartRestartGroup, 54);
                    ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(623767614, true, new C405833(state, snapshotIntState22), composerStartRestartGroup, 54);
                    ComposableLambda composableLambdaRememberComposableLambda3 = ComposableLambda3.rememberComposableLambda(2096046207, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.quickTrade.views.CryptoQuickTradeAmountInputRowKt.CryptoQuickTradeAmountInputRow.4
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i6) {
                            if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2096046207, i6, -1, "com.robinhood.shared.trade.crypto.ui.quickTrade.views.CryptoQuickTradeAmountInputRow.<anonymous> (CryptoQuickTradeAmountInputRow.kt:104)");
                            }
                            CryptoQuickTradeAmountInputRow4.m25967AmountInput6a0pyJM(state.getInputAmountText(), state.getCurrencySwitcherState(), ((Density) composer3.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM(RangesKt.coerceAtLeast(CryptoQuickTradeAmountInputRow4.CryptoQuickTradeAmountInputRow$lambda$3(snapshotIntState2), CryptoQuickTradeAmountInputRow4.CryptoQuickTradeAmountInputRow$lambda$6(snapshotIntState22))), event, composer3, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54);
                    Function0<Unit> function05 = function03;
                    composer2 = composerStartRestartGroup;
                    BentoBaseRowLayout.BentoBaseRowLayout(modifierM4872backgroundbw27NRU$default, null, null, composableLambdaRememberComposableLambda, composableLambdaRememberComposableLambda2, composableLambdaRememberComposableLambda3, null, false, false, false, null, composer2, 224256, 0, 1990);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                    function04 = function05;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier2;
                    function04 = function02;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.quickTrade.views.CryptoQuickTradeAmountInputRowKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return CryptoQuickTradeAmountInputRow4.CryptoQuickTradeAmountInputRow$lambda$8(state, event, modifier3, function04, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            function02 = function0;
            if ((i3 & 1171) != 1170) {
                if (i5 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                final SnapshotIntState2 snapshotIntState23 = (SnapshotIntState2) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                }
                final SnapshotIntState2 snapshotIntState222 = (SnapshotIntState2) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier52 = modifier4;
                Modifier modifierM4872backgroundbw27NRU$default2 = Background3.m4872backgroundbw27NRU$default(modifier52, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null);
                ComposableLambda composableLambdaRememberComposableLambda4 = ComposableLambda3.rememberComposableLambda(-848510979, true, new C405822(snapshotIntState23, state, function03), composerStartRestartGroup, 54);
                ComposableLambda composableLambdaRememberComposableLambda22 = ComposableLambda3.rememberComposableLambda(623767614, true, new C405833(state, snapshotIntState222), composerStartRestartGroup, 54);
                ComposableLambda composableLambdaRememberComposableLambda32 = ComposableLambda3.rememberComposableLambda(2096046207, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.quickTrade.views.CryptoQuickTradeAmountInputRowKt.CryptoQuickTradeAmountInputRow.4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i6) {
                        if ((i6 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2096046207, i6, -1, "com.robinhood.shared.trade.crypto.ui.quickTrade.views.CryptoQuickTradeAmountInputRow.<anonymous> (CryptoQuickTradeAmountInputRow.kt:104)");
                        }
                        CryptoQuickTradeAmountInputRow4.m25967AmountInput6a0pyJM(state.getInputAmountText(), state.getCurrencySwitcherState(), ((Density) composer3.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM(RangesKt.coerceAtLeast(CryptoQuickTradeAmountInputRow4.CryptoQuickTradeAmountInputRow$lambda$3(snapshotIntState23), CryptoQuickTradeAmountInputRow4.CryptoQuickTradeAmountInputRow$lambda$6(snapshotIntState222))), event, composer3, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54);
                Function0<Unit> function052 = function03;
                composer2 = composerStartRestartGroup;
                BentoBaseRowLayout.BentoBaseRowLayout(modifierM4872backgroundbw27NRU$default2, null, null, composableLambdaRememberComposableLambda4, composableLambdaRememberComposableLambda22, composableLambdaRememberComposableLambda32, null, false, false, false, null, composer2, 224256, 0, 1990);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
                function04 = function052;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        function02 = function0;
        if ((i3 & 1171) != 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* compiled from: CryptoQuickTradeAmountInputRow.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.trade.crypto.ui.quickTrade.views.CryptoQuickTradeAmountInputRowKt$CryptoQuickTradeAmountInputRow$2 */
    static final class C405822 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Function0<Unit> $onCurrencySwitcherClicked;
        final /* synthetic */ SnapshotIntState2 $primaryRowWidth$delegate;
        final /* synthetic */ CryptoQuickTradeAmountInputRowState $state;

        C405822(SnapshotIntState2 snapshotIntState2, CryptoQuickTradeAmountInputRowState cryptoQuickTradeAmountInputRowState, Function0<Unit> function0) {
            this.$primaryRowWidth$delegate = snapshotIntState2;
            this.$state = cryptoQuickTradeAmountInputRowState;
            this.$onCurrencySwitcherClicked = function0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(SnapshotIntState2 snapshotIntState2, LayoutCoordinates coords) {
            Intrinsics.checkNotNullParameter(coords, "coords");
            CryptoQuickTradeAmountInputRow4.CryptoQuickTradeAmountInputRow$lambda$4(snapshotIntState2, (int) (coords.mo7241getSizeYbymL2g() >> 32));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4$lambda$3(Function0 function0) {
            function0.invoke();
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-848510979, i, -1, "com.robinhood.shared.trade.crypto.ui.quickTrade.views.CryptoQuickTradeAmountInputRow.<anonymous> (CryptoQuickTradeAmountInputRow.kt:65)");
            }
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            Modifier.Companion companion = Modifier.INSTANCE;
            composer.startReplaceGroup(5004770);
            final SnapshotIntState2 snapshotIntState2 = this.$primaryRowWidth$delegate;
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objRememberedValue == companion2.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.quickTrade.views.CryptoQuickTradeAmountInputRowKt$CryptoQuickTradeAmountInputRow$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CryptoQuickTradeAmountInputRow4.C405822.invoke$lambda$1$lambda$0(snapshotIntState2, (LayoutCoordinates) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifier3.onGloballyPositioned(companion, (Function1) objRememberedValue);
            CryptoQuickTradeAmountInputRowState cryptoQuickTradeAmountInputRowState = this.$state;
            final Function0<Unit> function0 = this.$onCurrencySwitcherClicked;
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierOnGloballyPositioned);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            String strStringResource = StringResources_androidKt.stringResource(C40095R.string.crypto_quick_trade_amount_in_label, composer, 0);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw(strStringResource, PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i2).m21595getXsmallD9Ej5fM(), 0.0f, 11, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextM(), composer, 0, 0, 8188);
            CryptoInputRowCurrencyToggle4 currencySwitcherState = cryptoQuickTradeAmountInputRowState.getCurrencySwitcherState();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion2.getEmpty()) {
                objRememberedValue2 = InteractionSource2.MutableInteractionSource();
                composer.updateRememberedValue(objRememberedValue2);
            }
            InteractionSource3 interactionSource3 = (InteractionSource3) objRememberedValue2;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChanged = composer.changed(function0);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChanged || objRememberedValue3 == companion2.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.quickTrade.views.CryptoQuickTradeAmountInputRowKt$CryptoQuickTradeAmountInputRow$2$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoQuickTradeAmountInputRow4.C405822.invoke$lambda$5$lambda$4$lambda$3(function0);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            CryptoInputRowCurrencyToggle3.CryptoInputRowCurrencyToggle(currencySwitcherState, ClickableKt.m4891clickableO2vRcR0$default(companion, interactionSource3, null, false, null, null, (Function0) objRememberedValue3, 28, null), composer, 0, 0);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int CryptoQuickTradeAmountInputRow$lambda$3(SnapshotIntState2 snapshotIntState2) {
        return snapshotIntState2.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int CryptoQuickTradeAmountInputRow$lambda$6(SnapshotIntState2 snapshotIntState2) {
        return snapshotIntState2.getIntValue();
    }

    private static final float AmountInput_6a0pyJM$lambda$13(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float AmountInput_6a0pyJM$lambda$15(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    /* compiled from: CryptoQuickTradeAmountInputRow.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.trade.crypto.ui.quickTrade.views.CryptoQuickTradeAmountInputRowKt$CryptoQuickTradeAmountInputRow$3 */
    static final class C405833 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SnapshotIntState2 $secondaryRowWidth$delegate;
        final /* synthetic */ CryptoQuickTradeAmountInputRowState $state;

        C405833(CryptoQuickTradeAmountInputRowState cryptoQuickTradeAmountInputRowState, SnapshotIntState2 snapshotIntState2) {
            this.$state = cryptoQuickTradeAmountInputRowState;
            this.$secondaryRowWidth$delegate = snapshotIntState2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(623767614, i, -1, "com.robinhood.shared.trade.crypto.ui.quickTrade.views.CryptoQuickTradeAmountInputRow.<anonymous> (CryptoQuickTradeAmountInputRow.kt:88)");
            }
            String secondaryText = this.$state.getSecondaryText();
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            TextStyle textS = bentoTheme.getTypography(composer, i2).getTextS();
            long jM21426getFg20d7_KjU = bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU();
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i2).m21595getXsmallD9Ej5fM(), 0.0f, 11, null);
            composer.startReplaceGroup(5004770);
            final SnapshotIntState2 snapshotIntState2 = this.$secondaryRowWidth$delegate;
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.quickTrade.views.CryptoQuickTradeAmountInputRowKt$CryptoQuickTradeAmountInputRow$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CryptoQuickTradeAmountInputRow4.C405833.invoke$lambda$1$lambda$0(snapshotIntState2, (LayoutCoordinates) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoText2.m20747BentoText38GnDrw(secondaryText, OnGloballyPositionedModifier3.onGloballyPositioned(modifierM5146paddingqDBjuR0$default, (Function1) objRememberedValue), Color.m6701boximpl(jM21426getFg20d7_KjU), null, null, null, null, TextOverflow.INSTANCE.m7962getVisiblegIe3tQ8(), false, 1, 0, null, 0, textS, composer, 918552576, 0, 7288);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(SnapshotIntState2 snapshotIntState2, LayoutCoordinates coords) {
            Intrinsics.checkNotNullParameter(coords, "coords");
            CryptoQuickTradeAmountInputRow4.CryptoQuickTradeAmountInputRow$lambda$7(snapshotIntState2, (int) (coords.mo7241getSizeYbymL2g() >> 32));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CryptoQuickTradeAmountInputRow$lambda$4(SnapshotIntState2 snapshotIntState2, int i) {
        snapshotIntState2.setIntValue(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CryptoQuickTradeAmountInputRow$lambda$7(SnapshotIntState2 snapshotIntState2, int i) {
        snapshotIntState2.setIntValue(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0169 A[PHI: r10
      0x0169: PHI (r10v17 float) = (r10v15 float), (r10v16 float) binds: [B:63:0x0167, B:69:0x0178] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: AmountInput-6a0pyJM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m25967AmountInput6a0pyJM(final String str, final CryptoInputRowCurrencyToggle4 cryptoInputRowCurrencyToggle4, final float f, final Event<CryptoQuickTradeSheetEvent> event, Composer composer, final int i) {
        int i2;
        CryptoInputRowCurrencyToggle4 cryptoInputRowCurrencyToggle42;
        EventConsumer<CryptoQuickTradeSheetEvent> eventConsumerInvoke;
        Composer composerStartRestartGroup = composer.startRestartGroup(973875124);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            cryptoInputRowCurrencyToggle42 = cryptoInputRowCurrencyToggle4;
            i2 |= composerStartRestartGroup.changed(cryptoInputRowCurrencyToggle42) ? 32 : 16;
        } else {
            cryptoInputRowCurrencyToggle42 = cryptoInputRowCurrencyToggle4;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(event) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(973875124, i2, -1, "com.robinhood.shared.trade.crypto.ui.quickTrade.views.AmountInput (CryptoQuickTradeAmountInputRow.kt:128)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotIntState3.mutableIntStateOf(0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SnapshotIntState2 snapshotIntState2 = (SnapshotIntState2) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            if (event != null && (event.getData() instanceof CryptoQuickTradeSheetEvent.ShakeInput) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.quickTrade.views.CryptoQuickTradeAmountInputRowKt$AmountInput-6a0pyJM$$inlined$consumeIfType$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m25969invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m25969invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        snapshotIntState2.setIntValue(snapshotIntState2.getIntValue() + 1);
                    }
                });
            }
            float f2 = 0.5f;
            float f3 = 1.0f;
            float f4 = AmountInput_6a0pyJM$lambda$13(InfiniteTransition4.animateFloat(InfiniteTransition4.rememberInfiniteTransition("cursor", composerStartRestartGroup, 6, 0), 0.0f, 1.0f, AnimationSpecKt.m4815infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(600, 0, Easing3.getLinearEasing(), 2, null), RepeatMode.Reverse, 0L, 4, null), "cursorPhase", composerStartRestartGroup, (InfiniteTransition.$stable | 25008) | (InfiniteRepeatableSpec.$stable << 9), 0)) > 0.5f ? 1.0f : 0.0f;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            float fRememberTextWidthPx = rememberTextWidthPx(str + "W", bentoTheme.getTypography(composerStartRestartGroup, i3).getDisplayCapsuleLarge(), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(-408841118);
            int iMo5010roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5010roundToPx0680j_4(C2002Dp.m7995constructorimpl(C2002Dp.m7995constructorimpl(C2002Dp.m7995constructorimpl(((Configuration) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).screenWidthDp) - C2002Dp.m7995constructorimpl(48)) - f));
            composerStartRestartGroup.endReplaceGroup();
            float fCoerceAtMost = RangesKt.coerceAtMost(iMo5010roundToPx0680j_4 / fRememberTextWidthPx, 1.0f);
            if (fCoerceAtMost < 1.0f) {
                float f5 = 0.4f;
                if (fCoerceAtMost < 0.4f) {
                    f2 = 0.33f;
                } else if (fCoerceAtMost < 0.5f) {
                    f3 = f5;
                } else {
                    f5 = 0.6f;
                    if (fCoerceAtMost >= 0.6f) {
                        f2 = 0.8f;
                        if (fCoerceAtMost >= 0.8f) {
                            if (fCoerceAtMost < 1.0f) {
                            }
                        }
                    }
                }
                f3 = f2;
            }
            final SnapshotState4<Float> snapshotState4AnimateFloatAsState = AnimateAsState.animateFloatAsState(f3, null, 0.0f, "scale", null, composerStartRestartGroup, 3072, 22);
            final float fM8074getValueimpl = TextUnit.m8074getValueimpl(bentoTheme.getTypography(composerStartRestartGroup, i3).getDisplayCapsuleLarge().m7662getFontSizeXSAIIZE()) * AmountInput_6a0pyJM$lambda$15(snapshotState4AnimateFloatAsState);
            final CryptoInputRowCurrencyToggle4 cryptoInputRowCurrencyToggle43 = cryptoInputRowCurrencyToggle42;
            final float f6 = f4;
            AnimateShake.AnimateShake(null, snapshotIntState2.getIntValue(), ComposableLambda3.rememberComposableLambda(-1212386456, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.quickTrade.views.CryptoQuickTradeAmountInputRowKt$AmountInput$2
                public final void invoke(Composer composer2, int i4) {
                    Modifier.Companion companion;
                    float f7;
                    SnapshotState4<Float> snapshotState4;
                    if ((i4 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1212386456, i4, -1, "com.robinhood.shared.trade.crypto.ui.quickTrade.views.AmountInput.<anonymous> (CryptoQuickTradeAmountInputRow.kt:192)");
                    }
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth = SizeKt.fillMaxWidth(companion2, 0.9f);
                    Alignment centerEnd = Alignment.INSTANCE.getCenterEnd();
                    String str2 = str;
                    CryptoInputRowCurrencyToggle4 cryptoInputRowCurrencyToggle44 = cryptoInputRowCurrencyToggle43;
                    float f8 = fM8074getValueimpl;
                    float f9 = f6;
                    SnapshotState4<Float> snapshotState42 = snapshotState4AnimateFloatAsState;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(centerEnd, false);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierFillMaxWidth);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    if (StringsKt.isBlank(str2)) {
                        composer2.startReplaceGroup(-1284899403);
                        if (cryptoInputRowCurrencyToggle44 instanceof CryptoInputRowCurrencyToggle4.Asset) {
                            composer2.startReplaceGroup(-1284783680);
                            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                            int i5 = BentoTheme.$stable;
                            snapshotState4 = snapshotState42;
                            companion = companion2;
                            f7 = f9;
                            BentoText2.m20747BentoText38GnDrw("0", null, Color.m6701boximpl(bentoTheme2.getColors(composer2, i5).m21427getFg30d7_KjU()), null, null, null, null, 0, false, 1, 0, null, 0, bentoTheme2.getTypography(composer2, i5).getDisplayCapsuleLarge(), composer2, 805306374, 0, 7674);
                            composer2.endReplaceGroup();
                        } else {
                            companion = companion2;
                            f7 = f9;
                            snapshotState4 = snapshotState42;
                            composer2.startReplaceGroup(-1284503905);
                            BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                            int i6 = BentoTheme.$stable;
                            BentoText2.m20747BentoText38GnDrw("$0", null, Color.m6701boximpl(bentoTheme3.getColors(composer2, i6).m21427getFg30d7_KjU()), null, null, null, null, 0, false, 1, 0, null, 0, bentoTheme3.getTypography(composer2, i6).getDisplayCapsuleLarge(), composer2, 805306374, 0, 7674);
                            composer2.endReplaceGroup();
                        }
                        composer2.endReplaceGroup();
                    } else {
                        companion = companion2;
                        f7 = f9;
                        snapshotState4 = snapshotState42;
                        composer2.startReplaceGroup(-1284207824);
                        BentoTheme bentoTheme4 = BentoTheme.INSTANCE;
                        int i7 = BentoTheme.$stable;
                        BentoText2.m20747BentoText38GnDrw(str2, null, Color.m6701boximpl(bentoTheme4.getColors(composer2, i7).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 1, 0, null, 0, TextStyle.m7655copyp1EtxEg$default(bentoTheme4.getTypography(composer2, i7).getDisplayCapsuleLarge(), 0L, TextUnit2.getSp(f8), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777213, null), composer2, 805306368, 0, 7674);
                        composer2.endReplaceGroup();
                    }
                    BoxKt.Box(Background3.m4871backgroundbw27NRU(Alpha.alpha(SizeKt.m5174width3ABfNKs(SizeKt.m5156height3ABfNKs(companion, C2002Dp.m7995constructorimpl(C2002Dp.m7995constructorimpl(40) * CryptoQuickTradeAmountInputRow4.AmountInput_6a0pyJM$lambda$15(snapshotState4))), C2002Dp.m7995constructorimpl(C2002Dp.m7995constructorimpl(2) * CryptoQuickTradeAmountInputRow4.AmountInput_6a0pyJM$lambda$15(snapshotState4))), f7), BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21425getFg0d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(99))), composer2, 0);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 384, 1);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.quickTrade.views.CryptoQuickTradeAmountInputRowKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoQuickTradeAmountInputRow4.AmountInput_6a0pyJM$lambda$16(str, cryptoInputRowCurrencyToggle4, f, event, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final float rememberTextWidthPx(String str, TextStyle textStyle, Composer composer, int i) {
        composer.startReplaceGroup(-2017087899);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2017087899, i, -1, "com.robinhood.shared.trade.crypto.ui.quickTrade.views.rememberTextWidthPx (CryptoQuickTradeAmountInputRow.kt:246)");
        }
        float size = (int) (TextMeasurer.m7623measurewNUYSr0$default(TextMeasurerHelper.rememberTextMeasurer(0, composer, 0, 1), str, textStyle, 0, false, 0, Constraints2.Constraints$default(0, 0, 0, 0, 15, null), null, null, null, false, 988, null).getSize() >> 32);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return size;
    }

    private static final void CryptoQuickTradeAmountInputRowPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1159816156);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1159816156, i, -1, "com.robinhood.shared.trade.crypto.ui.quickTrade.views.CryptoQuickTradeAmountInputRowPreview (CryptoQuickTradeAmountInputRow.kt:261)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, CryptoQuickTradeAmountInputRow.INSTANCE.getLambda$1397694828$feature_trade_crypto_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.quickTrade.views.CryptoQuickTradeAmountInputRowKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoQuickTradeAmountInputRow4.CryptoQuickTradeAmountInputRowPreview$lambda$17(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void CryptoQuickTradeAmountInputRowPreviewAnimation(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1741512140);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1741512140, i, -1, "com.robinhood.shared.trade.crypto.ui.quickTrade.views.CryptoQuickTradeAmountInputRowPreviewAnimation (CryptoQuickTradeAmountInputRow.kt:300)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, CryptoQuickTradeAmountInputRow.INSTANCE.getLambda$1513065964$feature_trade_crypto_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.quickTrade.views.CryptoQuickTradeAmountInputRowKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoQuickTradeAmountInputRow4.CryptoQuickTradeAmountInputRowPreviewAnimation$lambda$18(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
