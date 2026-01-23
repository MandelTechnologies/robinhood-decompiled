package com.robinhood.android.equitytradeladder.settingsbottomsheet.quantityselector;

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
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.equitytradeladder.settingsbottomsheet.quantityselector.QuantityNumPadSelector4;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.numpad.BentoNumpadScopeV22;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.shared.tradeladder.p398ui.ladder.extensions.StringResources5;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.style.PreviewLadderBentoTheme2;
import com.robinhood.shared.trading.tradecomponentscompose.input.TradeQuantity;
import com.robinhood.shared.trading.tradecomponentscompose.input.TradeQuantity2;
import com.robinhood.utils.compose.keyboard.DisableKeyboard;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.pqc.crypto.newhope.NewHope;

/* compiled from: QuantityNumPadSelector.kt */
@Metadata(m3635d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001as\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\tH\u0007¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u0012\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0013\u001a\r\u0010\u0014\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0013¨\u0006\u0015²\u0006\n\u0010\u0016\u001a\u00020\u0003X\u008a\u008e\u0002"}, m3636d2 = {"QuantityNumPadSelector", "", "quantity", "Ljava/math/BigDecimal;", "buyingPowerDisplay", "Lcom/robinhood/utils/resource/StringResource;", "allowFractional", "", "onQuantityUpdated", "Lkotlin/Function1;", "onDismiss", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "inputMode", "Lcom/robinhood/shared/trading/tradecomponentscompose/input/TradeQuantityInputMode;", "onInputModeChanged", "(Ljava/math/BigDecimal;Lcom/robinhood/utils/resource/StringResource;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/robinhood/shared/trading/tradecomponentscompose/input/TradeQuantityInputMode;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "QuantitySelectorPreview", "(Landroidx/compose/runtime/Composer;I)V", "QuantitySelectorShortBuyingPowerPreview", "feature-equity-trade-ladder_externalDebug", "internalQuantity"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equitytradeladder.settingsbottomsheet.quantityselector.QuantityNumPadSelectorKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class QuantityNumPadSelector4 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuantityNumPadSelector$lambda$9(BigDecimal bigDecimal, StringResource stringResource, boolean z, Function1 function1, Function0 function0, Modifier modifier, TradeQuantity tradeQuantity, Function1 function12, int i, int i2, Composer composer, int i3) {
        QuantityNumPadSelector(bigDecimal, stringResource, z, function1, function0, modifier, tradeQuantity, function12, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuantitySelectorPreview$lambda$10(int i, Composer composer, int i2) {
        QuantitySelectorPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuantitySelectorShortBuyingPowerPreview$lambda$11(int i, Composer composer, int i2) {
        QuantitySelectorShortBuyingPowerPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuantityNumPadSelector$lambda$1$lambda$0(TradeQuantity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void QuantityNumPadSelector(final BigDecimal quantity, final StringResource stringResource, final boolean z, final Function1<? super BigDecimal, Unit> onQuantityUpdated, Function0<Unit> function0, Modifier modifier, TradeQuantity tradeQuantity, Function1<? super TradeQuantity, Unit> function1, Composer composer, final int i, final int i2) {
        int i3;
        boolean z2;
        Modifier modifier2;
        int i4;
        int i5;
        Function1<? super TradeQuantity, Unit> function12;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        Object objRememberedValue3;
        boolean z3;
        Object objRememberedValue4;
        final Modifier modifier3;
        final TradeQuantity tradeQuantity2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final Function0<Unit> onDismiss = function0;
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(onQuantityUpdated, "onQuantityUpdated");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer composerStartRestartGroup = composer.startRestartGroup(978385779);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(quantity) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(stringResource) : composerStartRestartGroup.changedInstance(stringResource) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
            z2 = z;
        } else {
            z2 = z;
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
            }
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onQuantityUpdated) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDismiss) ? 16384 : 8192;
        }
        int i6 = i2 & 32;
        if (i6 == 0) {
            if ((196608 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
            i4 = i2 & 64;
            if (i4 == 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                i3 |= composerStartRestartGroup.changed(tradeQuantity == null ? -1 : tradeQuantity.ordinal()) ? 1048576 : 524288;
            }
            i5 = i2 & 128;
            if (i5 == 0) {
                i3 |= 12582912;
                function12 = function1;
            } else {
                function12 = function1;
                if ((i & 12582912) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(function12) ? 8388608 : 4194304;
                }
            }
            if ((i3 & 4793491) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                if (i6 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                TradeQuantity tradeQuantity3 = i4 == 0 ? TradeQuantity.REPLACE : tradeQuantity;
                if (i5 != 0) {
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue5 = new Function1() { // from class: com.robinhood.android.equitytradeladder.settingsbottomsheet.quantityselector.QuantityNumPadSelectorKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return QuantityNumPadSelector4.QuantityNumPadSelector$lambda$1$lambda$0((TradeQuantity) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    function12 = (Function1) objRememberedValue5;
                    composerStartRestartGroup.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(978385779, i3, -1, "com.robinhood.android.equitytradeladder.settingsbottomsheet.quantityselector.QuantityNumPadSelector (QuantityNumPadSelector.kt:47)");
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
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new BentoNumpadScopeV22(coroutineScope);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                BentoNumpadScopeV22 bentoNumpadScopeV22 = (BentoNumpadScopeV22) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                FocusManager focusManager = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                HapticFeedback hapticFeedback = (HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback());
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                int i7 = i3;
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = SnapshotState3.mutableStateOf$default(quantity, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier4 = modifier2;
                Function1<? super TradeQuantity, Unit> function13 = function12;
                C160022 c160022 = new C160022(modifier4, quantity, bentoNumpadScopeV22, tradeQuantity3, function13, z2, onQuantityUpdated, focusManager, hapticFeedback, onDismiss, stringResource, (SnapshotState) objRememberedValue3);
                function12 = function13;
                onDismiss = onDismiss;
                DisableKeyboard.DisableSoftKeyboard(false, ComposableLambda3.rememberComposableLambda(1749560480, true, c160022, composerStartRestartGroup, 54), composerStartRestartGroup, 48, 1);
                Unit unit = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(5004770);
                z3 = (i7 & 57344) == 16384;
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (!z3 || objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new Function1() { // from class: com.robinhood.android.equitytradeladder.settingsbottomsheet.quantityselector.QuantityNumPadSelectorKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return QuantityNumPadSelector4.QuantityNumPadSelector$lambda$8$lambda$7(onDismiss, (DisposableEffectScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue4, composerStartRestartGroup, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
                tradeQuantity2 = tradeQuantity3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                tradeQuantity2 = tradeQuantity;
                modifier3 = modifier2;
            }
            final Function1<? super TradeQuantity, Unit> function14 = function12;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitytradeladder.settingsbottomsheet.quantityselector.QuantityNumPadSelectorKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return QuantityNumPadSelector4.QuantityNumPadSelector$lambda$9(quantity, stringResource, z, onQuantityUpdated, onDismiss, modifier3, tradeQuantity2, function14, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 196608;
        modifier2 = modifier;
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        i5 = i2 & 128;
        if (i5 == 0) {
        }
        if ((i3 & 4793491) == 4793490) {
            if (i6 != 0) {
            }
            if (i4 == 0) {
            }
            if (i5 != 0) {
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
            if (objRememberedValue2 == companion.getEmpty()) {
            }
            BentoNumpadScopeV22 bentoNumpadScopeV222 = (BentoNumpadScopeV22) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            FocusManager focusManager2 = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
            HapticFeedback hapticFeedback2 = (HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback());
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            int i72 = i3;
            if (objRememberedValue3 == companion.getEmpty()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifier42 = modifier2;
            Function1<? super TradeQuantity, Unit> function132 = function12;
            C160022 c1600222 = new C160022(modifier42, quantity, bentoNumpadScopeV222, tradeQuantity3, function132, z2, onQuantityUpdated, focusManager2, hapticFeedback2, onDismiss, stringResource, (SnapshotState) objRememberedValue3);
            function12 = function132;
            onDismiss = onDismiss;
            DisableKeyboard.DisableSoftKeyboard(false, ComposableLambda3.rememberComposableLambda(1749560480, true, c1600222, composerStartRestartGroup, 54), composerStartRestartGroup, 48, 1);
            Unit unit2 = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(5004770);
            if ((i72 & 57344) == 16384) {
            }
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (!z3) {
                objRememberedValue4 = new Function1() { // from class: com.robinhood.android.equitytradeladder.settingsbottomsheet.quantityselector.QuantityNumPadSelectorKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return QuantityNumPadSelector4.QuantityNumPadSelector$lambda$8$lambda$7(onDismiss, (DisposableEffectScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.DisposableEffect(unit2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue4, composerStartRestartGroup, 6);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier42;
                tradeQuantity2 = tradeQuantity3;
            }
        }
        final Function1 function142 = function12;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: QuantityNumPadSelector.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equitytradeladder.settingsbottomsheet.quantityselector.QuantityNumPadSelectorKt$QuantityNumPadSelector$2 */
    static final class C160022 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ boolean $allowFractional;
        final /* synthetic */ StringResource $buyingPowerDisplay;
        final /* synthetic */ FocusManager $focusManager;
        final /* synthetic */ HapticFeedback $hapticFeedback;
        final /* synthetic */ TradeQuantity $inputMode;
        final /* synthetic */ SnapshotState<BigDecimal> $internalQuantity$delegate;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ BentoNumpadScopeV22 $numpadScope;
        final /* synthetic */ Function0<Unit> $onDismiss;
        final /* synthetic */ Function1<TradeQuantity, Unit> $onInputModeChanged;
        final /* synthetic */ Function1<BigDecimal, Unit> $onQuantityUpdated;
        final /* synthetic */ BigDecimal $quantity;

        /* JADX WARN: Multi-variable type inference failed */
        C160022(Modifier modifier, BigDecimal bigDecimal, BentoNumpadScopeV22 bentoNumpadScopeV22, TradeQuantity tradeQuantity, Function1<? super TradeQuantity, Unit> function1, boolean z, Function1<? super BigDecimal, Unit> function12, FocusManager focusManager, HapticFeedback hapticFeedback, Function0<Unit> function0, StringResource stringResource, SnapshotState<BigDecimal> snapshotState) {
            this.$modifier = modifier;
            this.$quantity = bigDecimal;
            this.$numpadScope = bentoNumpadScopeV22;
            this.$inputMode = tradeQuantity;
            this.$onInputModeChanged = function1;
            this.$allowFractional = z;
            this.$onQuantityUpdated = function12;
            this.$focusManager = focusManager;
            this.$hapticFeedback = hapticFeedback;
            this.$onDismiss = function0;
            this.$buyingPowerDisplay = stringResource;
            this.$internalQuantity$delegate = snapshotState;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4$lambda$1$lambda$0(SnapshotState snapshotState, BigDecimal it) {
            Intrinsics.checkNotNullParameter(it, "it");
            QuantityNumPadSelector4.QuantityNumPadSelector$lambda$5(snapshotState, it);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4$lambda$3$lambda$2(Function1 function1, FocusManager focusManager, HapticFeedback hapticFeedback, Function0 function0, SnapshotState snapshotState) {
            function1.invoke(QuantityNumPadSelector4.QuantityNumPadSelector$lambda$4(snapshotState));
            focusManager.clearFocus(true);
            hapticFeedback.mo7039performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m7046getLongPress5zf0vsI());
            function0.invoke();
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1749560480, i, -1, "com.robinhood.android.equitytradeladder.settingsbottomsheet.quantityselector.QuantityNumPadSelector.<anonymous> (QuantityNumPadSelector.kt:54)");
            }
            Modifier modifier = this.$modifier;
            BigDecimal bigDecimal = this.$quantity;
            BentoNumpadScopeV22 bentoNumpadScopeV22 = this.$numpadScope;
            TradeQuantity tradeQuantity = this.$inputMode;
            Function1<TradeQuantity, Unit> function1 = this.$onInputModeChanged;
            boolean z = this.$allowFractional;
            final Function1<BigDecimal, Unit> function12 = this.$onQuantityUpdated;
            final FocusManager focusManager = this.$focusManager;
            final HapticFeedback hapticFeedback = this.$hapticFeedback;
            final Function0<Unit> function0 = this.$onDismiss;
            final StringResource stringResource = this.$buyingPowerDisplay;
            final SnapshotState<BigDecimal> snapshotState = this.$internalQuantity$delegate;
            Modifier.Companion companion = Modifier.INSTANCE;
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, companion);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(modifierFillMaxWidth$default, bentoTheme.getColors(composer, i2).m21373getBg30d7_KjU(), 0.0f, composer, 6, 4);
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getCenterHorizontally(), composer, 48);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierM5146paddingqDBjuR0$default);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1147498542, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equitytradeladder.settingsbottomsheet.quantityselector.QuantityNumPadSelectorKt$QuantityNumPadSelector$2$1$1$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1147498542, i3, -1, "com.robinhood.android.equitytradeladder.settingsbottomsheet.quantityselector.QuantityNumPadSelector.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuantityNumPadSelector.kt:68)");
                    }
                    StringResource stringResource2 = stringResource;
                    if (stringResource2 != null) {
                        AccountBuyingPowerDisplay.AccountBuyingPowerDisplay(StringResources5.getText(stringResource2, composer2, StringResource.$stable), null, composer2, 0, 2);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, 54);
            composer.startReplaceGroup(5004770);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion4 = Composer.INSTANCE;
            if (objRememberedValue == companion4.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.equitytradeladder.settingsbottomsheet.quantityselector.QuantityNumPadSelectorKt$QuantityNumPadSelector$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return QuantityNumPadSelector4.C160022.invoke$lambda$5$lambda$4$lambda$1$lambda$0(snapshotState, (BigDecimal) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            int i3 = BentoNumpadScopeV22.$stable;
            TradeQuantity2.TradeQuantity(bigDecimal, false, composableLambdaRememberComposableLambda, bentoNumpadScopeV22, (Function1) objRememberedValue, null, tradeQuantity, function1, null, null, null, composer, (i3 << 9) | 25008, 0, NewHope.SENDA_BYTES);
            bentoNumpadScopeV22.BentoNumpadOnly(null, false, z, false, null, composer, i3 << 15, 27);
            composer.startReplaceGroup(-1224400529);
            boolean zChanged = composer.changed(function12) | composer.changedInstance(focusManager) | composer.changedInstance(hapticFeedback) | composer.changed(function0);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged || objRememberedValue2 == companion4.getEmpty()) {
                Object obj = new Function0() { // from class: com.robinhood.android.equitytradeladder.settingsbottomsheet.quantityselector.QuantityNumPadSelectorKt$QuantityNumPadSelector$2$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return QuantityNumPadSelector4.C160022.invoke$lambda$5$lambda$4$lambda$3$lambda$2(function12, focusManager, hapticFeedback, function0, snapshotState);
                    }
                };
                composer.updateRememberedValue(obj);
                objRememberedValue2 = obj;
            }
            composer.endReplaceGroup();
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C11048R.string.general_label_done, composer, 0), PaddingKt.m5143paddingVpY3zN4(BorderKt.m4876borderxT4_qwU(PaddingKt.m5144paddingVpY3zN4$default(ClickableKt.m4893clickableXHw0xAI$default(companion, false, null, null, (Function0) objRememberedValue2, 7, null), 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 1, null), C2002Dp.m7995constructorimpl(1), bentoTheme.getColors(composer, i2).m21427getFg30d7_KjU(), RoundedCornerShape2.getCircleShape()), bentoTheme.getSpacing(composer, i2).m21591getLargeD9Ej5fM(), C2002Dp.m7995constructorimpl(10)), null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, null, composer, 24576, 0, 16364);
            composer.endNode();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult QuantityNumPadSelector$lambda$8$lambda$7(final Function0 function0, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        return new DisposableEffectResult() { // from class: com.robinhood.android.equitytradeladder.settingsbottomsheet.quantityselector.QuantityNumPadSelectorKt$QuantityNumPadSelector$lambda$8$lambda$7$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                function0.invoke();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BigDecimal QuantityNumPadSelector$lambda$4(SnapshotState<BigDecimal> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void QuantityNumPadSelector$lambda$5(SnapshotState<BigDecimal> snapshotState, BigDecimal bigDecimal) {
        snapshotState.setValue(bigDecimal);
    }

    public static final void QuantitySelectorPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(2044384955);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2044384955, i, -1, "com.robinhood.android.equitytradeladder.settingsbottomsheet.quantityselector.QuantitySelectorPreview (QuantityNumPadSelector.kt:117)");
            }
            PreviewLadderBentoTheme2.PreviewLadderBentoTheme(false, QuantityNumPadSelector.INSTANCE.getLambda$853261244$feature_equity_trade_ladder_externalDebug(), composerStartRestartGroup, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitytradeladder.settingsbottomsheet.quantityselector.QuantityNumPadSelectorKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return QuantityNumPadSelector4.QuantitySelectorPreview$lambda$10(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void QuantitySelectorShortBuyingPowerPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1814780174);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1814780174, i, -1, "com.robinhood.android.equitytradeladder.settingsbottomsheet.quantityselector.QuantitySelectorShortBuyingPowerPreview (QuantityNumPadSelector.kt:132)");
            }
            PreviewLadderBentoTheme2.PreviewLadderBentoTheme(false, QuantityNumPadSelector.INSTANCE.getLambda$1768692751$feature_equity_trade_ladder_externalDebug(), composerStartRestartGroup, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitytradeladder.settingsbottomsheet.quantityselector.QuantityNumPadSelectorKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return QuantityNumPadSelector4.QuantitySelectorShortBuyingPowerPreview$lambda$11(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
