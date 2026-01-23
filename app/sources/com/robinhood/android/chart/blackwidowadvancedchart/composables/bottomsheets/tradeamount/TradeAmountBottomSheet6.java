package com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.tradeamount;

import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.focus.FocusManager;
import androidx.compose.p011ui.hapticfeedback.HapticFeedback;
import androidx.compose.p011ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.font.FontWeight;
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
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.tradeamount.TradeAmountBottomSheet6;
import com.robinhood.android.chart.blackwidowadvancedchart.utils.Logging4;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.numpad.BentoNumpadScopeV22;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.shared.trading.orderstate.InstrumentOrderState4;
import com.robinhood.shared.trading.orderstate.Quantity;
import com.robinhood.shared.trading.tradecomponentscompose.input.TradeQuantity2;
import com.robinhood.utils.compose.keyboard.DisableKeyboard;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TradeAmountBottomSheet.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\u001aa\u0010\r\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a\u000f\u0010\u000f\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\"\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015²\u0006\u000e\u0010\u0014\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, m3636d2 = {"Lcom/robinhood/shared/trading/orderstate/InstrumentTradeAmount;", "instrumentTradeAmount", "", "showQuantityLabel", "allowFractional", "Lkotlin/Function0;", "", "onDismiss", "buyingPowerDisplay", "Lkotlin/Function1;", "onTradeAmountUpdated", "Landroidx/compose/ui/Modifier;", "modifier", TradeAmountBottomSheet6.TRADE_AMOUNT_BOTTOM_SHEET, "(Lcom/robinhood/shared/trading/orderstate/InstrumentTradeAmount;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "BwTradeAmountSheetPreview", "(Landroidx/compose/runtime/Composer;I)V", "", "TRADE_AMOUNT_BOTTOM_SHEET", "Ljava/lang/String;", "internalInstrumentTradeAmount", "feature-black-widow-advanced-chart_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.tradeamount.TradeAmountBottomSheetKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class TradeAmountBottomSheet6 {
    private static final String TRADE_AMOUNT_BOTTOM_SHEET = "TradeAmountBottomSheet";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BwTradeAmountSheetPreview$lambda$5(int i, Composer composer, int i2) {
        BwTradeAmountSheetPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TradeAmountBottomSheet$lambda$4(InstrumentOrderState4 instrumentOrderState4, boolean z, boolean z2, Function0 function0, Function2 function2, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        TradeAmountBottomSheet(instrumentOrderState4, z, z2, function0, function2, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0183  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TradeAmountBottomSheet(final InstrumentOrderState4 instrumentTradeAmount, final boolean z, final boolean z2, final Function0<Unit> onDismiss, final Function2<? super Composer, ? super Integer, Unit> buyingPowerDisplay, final Function1<? super InstrumentOrderState4, Unit> onTradeAmountUpdated, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        boolean z3;
        boolean z4;
        int i4;
        Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        Object objRememberedValue3;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(instrumentTradeAmount, "instrumentTradeAmount");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(buyingPowerDisplay, "buyingPowerDisplay");
        Intrinsics.checkNotNullParameter(onTradeAmountUpdated, "onTradeAmountUpdated");
        Composer composerStartRestartGroup = composer.startRestartGroup(1309129140);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(instrumentTradeAmount) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                z3 = z;
                i3 |= composerStartRestartGroup.changed(z3) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    z4 = z2;
                    i3 |= composerStartRestartGroup.changed(z4) ? 256 : 128;
                }
                if ((i2 & 8) != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(onDismiss) ? 2048 : 1024;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(buyingPowerDisplay) ? 16384 : 8192;
                }
                if ((i2 & 32) != 0) {
                    i3 |= 196608;
                } else if ((i & 196608) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(onTradeAmountUpdated) ? 131072 : 65536;
                }
                i4 = i2 & 64;
                if (i4 == 0) {
                    if ((1572864 & i) == 0) {
                        modifier2 = modifier;
                        i3 |= composerStartRestartGroup.changed(modifier2) ? 1048576 : 524288;
                    }
                    if ((599187 & i3) == 599186 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1309129140, i3, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.tradeamount.TradeAmountBottomSheet (TradeAmountBottomSheet.kt:52)");
                        }
                        FocusManager focusManager = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                        HapticFeedback hapticFeedback = (HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback());
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new BentoNumpadScopeV22(coroutineScope);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        BentoNumpadScopeV22 bentoNumpadScopeV22 = (BentoNumpadScopeV22) objRememberedValue2;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = SnapshotState3.mutableStateOf$default(instrumentTradeAmount, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        SnapshotState snapshotState = (SnapshotState) objRememberedValue3;
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifier5 = modifier4;
                        DisableKeyboard.DisableSoftKeyboard(false, ComposableLambda3.rememberComposableLambda(1594580327, true, new C107411(modifier5, z3, buyingPowerDisplay, bentoNumpadScopeV22, z4, onTradeAmountUpdated, focusManager, hapticFeedback, onDismiss, snapshotState), composerStartRestartGroup, 54), composerStartRestartGroup, 48, 1);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier5;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.tradeamount.TradeAmountBottomSheetKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return TradeAmountBottomSheet6.TradeAmountBottomSheet$lambda$4(instrumentTradeAmount, z, z2, onDismiss, buyingPowerDisplay, onTradeAmountUpdated, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 1572864;
                modifier2 = modifier;
                if ((599187 & i3) == 599186) {
                    if (i4 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    FocusManager focusManager2 = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                    HapticFeedback hapticFeedback2 = (HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback());
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                    }
                    CoroutineScope coroutineScope2 = (CoroutineScope) objRememberedValue;
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                    }
                    BentoNumpadScopeV22 bentoNumpadScopeV222 = (BentoNumpadScopeV22) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                    }
                    SnapshotState snapshotState2 = (SnapshotState) objRememberedValue3;
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifier52 = modifier4;
                    DisableKeyboard.DisableSoftKeyboard(false, ComposableLambda3.rememberComposableLambda(1594580327, true, new C107411(modifier52, z3, buyingPowerDisplay, bentoNumpadScopeV222, z4, onTradeAmountUpdated, focusManager2, hapticFeedback2, onDismiss, snapshotState2), composerStartRestartGroup, 54), composerStartRestartGroup, 48, 1);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier52;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z4 = z2;
            if ((i2 & 8) != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if ((i2 & 32) != 0) {
            }
            i4 = i2 & 64;
            if (i4 == 0) {
            }
            modifier2 = modifier;
            if ((599187 & i3) == 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        z3 = z;
        if ((i2 & 4) == 0) {
        }
        z4 = z2;
        if ((i2 & 8) != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        if ((599187 & i3) == 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: TradeAmountBottomSheet.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.tradeamount.TradeAmountBottomSheetKt$TradeAmountBottomSheet$1 */
    static final class C107411 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ boolean $allowFractional;
        final /* synthetic */ Function2<Composer, Integer, Unit> $buyingPowerDisplay;
        final /* synthetic */ FocusManager $focusManager;
        final /* synthetic */ HapticFeedback $hapticFeedback;
        final /* synthetic */ SnapshotState<InstrumentOrderState4> $internalInstrumentTradeAmount$delegate;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ BentoNumpadScopeV22 $numpadScope;
        final /* synthetic */ Function0<Unit> $onDismiss;
        final /* synthetic */ Function1<InstrumentOrderState4, Unit> $onTradeAmountUpdated;
        final /* synthetic */ boolean $showQuantityLabel;

        /* JADX WARN: Multi-variable type inference failed */
        C107411(Modifier modifier, boolean z, Function2<? super Composer, ? super Integer, Unit> function2, BentoNumpadScopeV22 bentoNumpadScopeV22, boolean z2, Function1<? super InstrumentOrderState4, Unit> function1, FocusManager focusManager, HapticFeedback hapticFeedback, Function0<Unit> function0, SnapshotState<InstrumentOrderState4> snapshotState) {
            this.$modifier = modifier;
            this.$showQuantityLabel = z;
            this.$buyingPowerDisplay = function2;
            this.$numpadScope = bentoNumpadScopeV22;
            this.$allowFractional = z2;
            this.$onTradeAmountUpdated = function1;
            this.$focusManager = focusManager;
            this.$hapticFeedback = hapticFeedback;
            this.$onDismiss = function0;
            this.$internalInstrumentTradeAmount$delegate = snapshotState;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$1$lambda$0(SnapshotState snapshotState, BigDecimal it) {
            Intrinsics.checkNotNullParameter(it, "it");
            TradeAmountBottomSheet6.TradeAmountBottomSheet$lambda$3(snapshotState, new Quantity(it));
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1594580327, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.tradeamount.TradeAmountBottomSheet.<anonymous> (TradeAmountBottomSheet.kt:59)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(ModifiersKt.autoLogEvents$default(this.$modifier, Logging4.updateEventDescriptor$default((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new Component(Component.ComponentType.BOTTOM_SHEET, TradeAmountBottomSheet6.TRADE_AMOUNT_BOTTOM_SHEET, null, 4, null), null, null, null, null, null, 0.0d, false, null, null, null, null, 0.0d, null, null, 32766, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null), 0.0f, 1, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default, 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            boolean z = this.$showQuantityLabel;
            Function2<Composer, Integer, Unit> function2 = this.$buyingPowerDisplay;
            BentoNumpadScopeV22 bentoNumpadScopeV22 = this.$numpadScope;
            boolean z2 = this.$allowFractional;
            final Function1<InstrumentOrderState4, Unit> function1 = this.$onTradeAmountUpdated;
            final FocusManager focusManager = this.$focusManager;
            final HapticFeedback hapticFeedback = this.$hapticFeedback;
            final Function0<Unit> function0 = this.$onDismiss;
            final SnapshotState<InstrumentOrderState4> snapshotState = this.$internalInstrumentTradeAmount$delegate;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5146paddingqDBjuR0$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            InstrumentOrderState4 instrumentOrderState4TradeAmountBottomSheet$lambda$2 = TradeAmountBottomSheet6.TradeAmountBottomSheet$lambda$2(snapshotState);
            composer.startReplaceGroup(-1883410217);
            if (!(instrumentOrderState4TradeAmountBottomSheet$lambda$2 instanceof Quantity)) {
                throw new NoWhenBranchMatchedException();
            }
            BigDecimal amount = ((Quantity) instrumentOrderState4TradeAmountBottomSheet$lambda$2).getAmount();
            composer.startReplaceGroup(5004770);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objRememberedValue == companion2.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.tradeamount.TradeAmountBottomSheetKt$TradeAmountBottomSheet$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TradeAmountBottomSheet6.C107411.invoke$lambda$4$lambda$1$lambda$0(snapshotState, (BigDecimal) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function1 function12 = (Function1) objRememberedValue;
            composer.endReplaceGroup();
            int i3 = BentoNumpadScopeV22.$stable;
            TradeQuantity2.TradeQuantity(amount, z, function2, bentoNumpadScopeV22, function12, null, null, null, null, null, null, composer, (i3 << 9) | 24576, 0, 2016);
            composer.endReplaceGroup();
            bentoNumpadScopeV22.BentoNumpadOnly(null, false, z2, false, null, composer, i3 << 15, 27);
            Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(BorderKt.m4876borderxT4_qwU(PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 1, null), C2002Dp.m7995constructorimpl(1), bentoTheme.getColors(composer, i2).m21427getFg30d7_KjU(), RoundedCornerShape2.getCircleShape()), bentoTheme.getSpacing(composer, i2).m21591getLargeD9Ej5fM(), C2002Dp.m7995constructorimpl(10));
            composer.startReplaceGroup(-1224400529);
            boolean zChanged = composer.changed(function1) | composer.changedInstance(focusManager) | composer.changedInstance(hapticFeedback) | composer.changed(function0);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged || objRememberedValue2 == companion2.getEmpty()) {
                Object obj = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.tradeamount.TradeAmountBottomSheetKt$TradeAmountBottomSheet$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TradeAmountBottomSheet6.C107411.invoke$lambda$4$lambda$3$lambda$2(function1, focusManager, hapticFeedback, function0, snapshotState);
                    }
                };
                composer.updateRememberedValue(obj);
                objRememberedValue2 = obj;
            }
            composer.endReplaceGroup();
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C11048R.string.general_label_done, composer, 0), ModifiersKt.autoLogEvents$default(ClickableKt.m4893clickableXHw0xAI$default(modifierM5143paddingVpY3zN4, false, null, null, (Function0) objRememberedValue2, 7, null), Logging4.updateEventDescriptor$default((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new Component(Component.ComponentType.BUTTON, TradeAmountBottomSheet6.TRADE_AMOUNT_BOTTOM_SHEET, null, 4, null), null, null, null, null, null, 0.0d, false, null, null, null, null, 0.0d, null, null, 32766, null), false, false, false, true, false, null, 110, null), null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, null, composer, 24576, 0, 16364);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$3$lambda$2(Function1 function1, FocusManager focusManager, HapticFeedback hapticFeedback, Function0 function0, SnapshotState snapshotState) {
            function1.invoke(TradeAmountBottomSheet6.TradeAmountBottomSheet$lambda$2(snapshotState));
            focusManager.clearFocus(true);
            hapticFeedback.mo7039performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m7046getLongPress5zf0vsI());
            function0.invoke();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InstrumentOrderState4 TradeAmountBottomSheet$lambda$2(SnapshotState<InstrumentOrderState4> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TradeAmountBottomSheet$lambda$3(SnapshotState<InstrumentOrderState4> snapshotState, InstrumentOrderState4 instrumentOrderState4) {
        snapshotState.setValue(instrumentOrderState4);
    }

    private static final void BwTradeAmountSheetPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(2005147534);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2005147534, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.tradeamount.BwTradeAmountSheetPreview (TradeAmountBottomSheet.kt:122)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, TradeAmountBottomSheet.INSTANCE.m1774x294ac3cc(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.tradeamount.TradeAmountBottomSheetKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TradeAmountBottomSheet6.BwTradeAmountSheetPreview$lambda$5(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
