package com.robinhood.shared.tradeladder.p398ui.ladder.shared.topbar;

import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Intrinsic3;
import androidx.compose.foundation.layout.Intrinsic4;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotLongState2;
import androidx.compose.runtime.SnapshotLongState3;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.ticker.TickerTextState;
import com.robinhood.android.ticker.WrappedTickerKt;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.shared.tradeladder.C40888R;
import com.robinhood.shared.tradeladder.extensions.Moneys4;
import com.robinhood.shared.tradeladder.p398ui.ladder.extensions.ModifiersKt;
import com.robinhood.shared.tradeladder.p398ui.ladder.extensions.StringResources5;
import com.robinhood.shared.tradeladder.p398ui.ladder.gestures.TapAndLongPressGestureDetector2;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.style.LadderStyleKt;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.topbar.DetailContent8;
import com.robinhood.tooltips.popup.PopupPositioning;
import com.robinhood.tooltips.popup.PopupTooltipKt;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DetailContent.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\u001a\u0089\u0001\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0007¢\u0006\u0002\u0010\u0015\u001a\u0017\u0010\u0016\u001a\u00020\u00012\b\b\u0001\u0010\u0017\u001a\u00020\u0018H\u0003¢\u0006\u0002\u0010\u0019¨\u0006\u001a²\u0006\n\u0010\u001b\u001a\u00020\u0006X\u008a\u008e\u0002²\u0006\n\u0010\u001c\u001a\u00020\u0006X\u008a\u008e\u0002²\u0006\n\u0010\u001d\u001a\u00020\u001eX\u008a\u008e\u0002"}, m3636d2 = {"DetailContent", "", "dayPL", "Ljava/math/BigDecimal;", "openPL", "hasPosition", "", "positionsDisplay", "Lcom/robinhood/utils/resource/StringResource;", "pendingOrderQuantity", "", "pendingOrderClickable", "showPnlPriceSwitcherTooltip", "dayPnlInfo", "Lcom/robinhood/shared/tradeladder/ui/ladder/shared/topbar/DayPnlInfo;", "onPnLClick", "Lkotlin/Function0;", "onOpenOrdersClicked", "showNextPostTradeFtuxTooltipState", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;ZLcom/robinhood/utils/resource/StringResource;Ljava/lang/Integer;ZZLcom/robinhood/shared/tradeladder/ui/ladder/shared/topbar/DayPnlInfo;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;III)V", "LadderTopBarPreviewNullData", "parameters", "Lcom/robinhood/shared/tradeladder/ui/ladder/shared/topbar/LadderTopBarPreviewParameterProvider$Parameters;", "(Lcom/robinhood/shared/tradeladder/ui/ladder/shared/topbar/LadderTopBarPreviewParameterProvider$Parameters;Landroidx/compose/runtime/Composer;I)V", "lib-trade-ladder_externalDebug", "pnlPriceSwitcherLongPressed", "showDayPnlTooltip", "lastClickTime", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.tradeladder.ui.ladder.shared.topbar.DetailContentKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class DetailContent6 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DetailContent$lambda$27(BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z, StringResource stringResource, Integer num, boolean z2, boolean z3, DayPnlInfo dayPnlInfo, Function0 function0, Function0 function02, Function0 function03, Modifier modifier, int i, int i2, int i3, Composer composer, int i4) {
        DetailContent(bigDecimal, bigDecimal2, z, stringResource, num, z2, z3, dayPnlInfo, function0, function02, function03, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LadderTopBarPreviewNullData$lambda$28(DetailContent8.Parameters parameters, int i, Composer composer, int i2) {
        LadderTopBarPreviewNullData(parameters, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0637  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0655  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0671  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x06e7  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x06f3  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x06f7  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0724  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0772  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0788  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x078d  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x07a7  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x07b9  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x084c  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x084e  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x085b  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0895  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x08a1  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x08a5  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x08d2  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x08ef  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x096d  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0978  */
    /* JADX WARN: Removed duplicated region for block: B:317:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DetailContent(final BigDecimal bigDecimal, final BigDecimal bigDecimal2, final boolean z, final StringResource positionsDisplay, final Integer num, final boolean z2, final boolean z3, final DayPnlInfo dayPnlInfo, final Function0<Unit> onPnLClick, final Function0<Unit> onOpenOrdersClicked, final Function0<Unit> showNextPostTradeFtuxTooltipState, Modifier modifier, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        Object objRememberedValue3;
        Object objRememberedValue4;
        final SnapshotLongState2 snapshotLongState2;
        boolean z4;
        Object objRememberedValue5;
        BentoTheme bentoTheme;
        int i8;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        long jM21456getPositive0d7_KjU;
        Modifier modifier2;
        String deltaCurrency$default;
        int currentCompositeKeyHash3;
        Composer composerM6388constructorimpl3;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3;
        long jM21425getFg0d7_KjU;
        Composer composer2;
        Object objRememberedValue6;
        Object objRememberedValue7;
        Object objRememberedValue8;
        int currentCompositeKeyHash4;
        Composer composerM6388constructorimpl4;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4;
        long jM21427getFg30d7_KjU;
        long jM21427getFg30d7_KjU2;
        boolean z5;
        Object objRememberedValue9;
        int currentCompositeKeyHash5;
        Composer composerM6388constructorimpl5;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5;
        Composer composer3;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(positionsDisplay, "positionsDisplay");
        Intrinsics.checkNotNullParameter(onPnLClick, "onPnLClick");
        Intrinsics.checkNotNullParameter(onOpenOrdersClicked, "onOpenOrdersClicked");
        Intrinsics.checkNotNullParameter(showNextPostTradeFtuxTooltipState, "showNextPostTradeFtuxTooltipState");
        Composer composerStartRestartGroup = composer.startRestartGroup(-848812404);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(bigDecimal) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(bigDecimal2) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            i4 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(positionsDisplay) : composerStartRestartGroup.changedInstance(positionsDisplay) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            i4 |= composerStartRestartGroup.changed(num) ? 16384 : 8192;
        }
        if ((i3 & 32) == 0) {
            if ((i & 196608) == 0) {
                i4 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
            }
            if ((i3 & 64) == 0) {
                i4 |= 1572864;
            } else if ((i & 1572864) == 0) {
                i4 |= composerStartRestartGroup.changed(z3) ? 1048576 : 524288;
            }
            if ((i3 & 128) == 0) {
                i4 |= 12582912;
            } else if ((i & 12582912) == 0) {
                i4 |= (16777216 & i) == 0 ? composerStartRestartGroup.changed(dayPnlInfo) : composerStartRestartGroup.changedInstance(dayPnlInfo) ? 8388608 : 4194304;
            }
            if ((i3 & 256) == 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(onPnLClick) ? 67108864 : 33554432;
            }
            if ((i3 & 512) == 0) {
                i4 |= 805306368;
            } else if ((i & 805306368) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(onOpenOrdersClicked) ? 536870912 : 268435456;
            }
            i5 = i4;
            if ((i3 & 1024) == 0) {
                i6 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                i6 = i2 | (composerStartRestartGroup.changedInstance(showNextPostTradeFtuxTooltipState) ? 4 : 2);
            } else {
                i6 = i2;
            }
            i7 = i3 & 2048;
            if (i7 == 0) {
                i6 |= 48;
            } else if ((i2 & 48) == 0) {
                i6 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            if ((i5 & 306783379) != 306783378 && (i6 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                composer3 = composerStartRestartGroup;
                modifier3 = modifier;
            } else {
                Modifier modifier4 = i7 == 0 ? Modifier.INSTANCE : modifier;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-848812404, i5, i6, "com.robinhood.shared.tradeladder.ui.ladder.shared.topbar.DetailContent (DetailContent.kt:67)");
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
                    SnapshotState snapshotStateMutableStateOf$default = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(snapshotStateMutableStateOf$default);
                    objRememberedValue2 = snapshotStateMutableStateOf$default;
                }
                final SnapshotState snapshotState = (SnapshotState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = SnapshotLongState3.mutableLongStateOf(0L);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                snapshotLongState2 = (SnapshotLongState2) objRememberedValue4;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(5004770);
                z4 = (i5 & 234881024) != 67108864;
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (!z4 || objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.topbar.DetailContentKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return DetailContent6.DetailContent$lambda$10$lambda$9(onPnLClick, snapshotLongState2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                Function0 function0 = (Function0) objRememberedValue5;
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierHeight = Intrinsic3.height(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), Intrinsic4.Max);
                bentoTheme = BentoTheme.INSTANCE;
                i8 = BentoTheme.$stable;
                Modifier modifier5 = modifier4;
                Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(modifierHeight, bentoTheme.getSpacing(composerStartRestartGroup, i8).m21592getMediumD9Ej5fM(), C2002Dp.m7995constructorimpl(12));
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Horizontal start = arrangement.getStart();
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(start, companion2.getTop(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5143paddingVpY3zN4);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor);
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                Alignment.Horizontal start2 = companion2.getStart();
                Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
                Modifier.Companion companion4 = Modifier.INSTANCE;
                float f = 0;
                Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(Row5.weight$default(row6, SizeKt.m5174width3ABfNKs(companion4, C2002Dp.m7995constructorimpl(f)), 1.0f, false, 2, null), 0.0f, 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(spaceBetween, start2, composerStartRestartGroup, 54);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxHeight$default);
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor2);
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                if (dayPnlInfo == null) {
                    composerStartRestartGroup.startReplaceGroup(-530387492);
                    jM21456getPositive0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i8).m21425getFg0d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                } else if (bigDecimal == null) {
                    composerStartRestartGroup.startReplaceGroup(-530311077);
                    jM21456getPositive0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i8).m21427getFg30d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                } else if (BigDecimals7.isPositive(bigDecimal) || BigDecimals7.isZero(bigDecimal)) {
                    composerStartRestartGroup.startReplaceGroup(-530210730);
                    jM21456getPositive0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i8).m21456getPositive0d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-530147242);
                    jM21456getPositive0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i8).m21452getNegative0d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                }
                long j = jM21456getPositive0d7_KjU;
                if (dayPnlInfo == null) {
                    deltaCurrency$default = "-";
                    modifier2 = null;
                } else {
                    modifier2 = null;
                    deltaCurrency$default = Moneys4.formatDeltaCurrency$default(bigDecimal == null ? BigDecimal.ZERO : bigDecimal, null, 1, null);
                }
                String str = deltaCurrency$default;
                TickerTextState.Style style = TickerTextState.Style.REGULAR_MEDIUM_BOLD;
                TickerTextState tickerTextState = new TickerTextState(str, j, style, null, false, 24, null);
                int i9 = TickerTextState.$stable;
                WrappedTickerKt.TickerText(tickerTextState, modifier2, composerStartRestartGroup, i9, 2);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composerStartRestartGroup, 48);
                currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion4);
                Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor3);
                }
                composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                if (dayPnlInfo == null || bigDecimal != null) {
                    composerStartRestartGroup.startReplaceGroup(-1289282000);
                    jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i8).m21425getFg0d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1289208561);
                    jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i8).m21427getFg30d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                }
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C40888R.string.ladder_day_pnl_label, composerStartRestartGroup, 0), PaddingKt.m5146paddingqDBjuR0$default(companion4, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i8).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 13, null), Color.m6701boximpl(jM21425getFg0d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i8).getTextS(), composerStartRestartGroup, 0, 0, 8184);
                composerStartRestartGroup.startReplaceGroup(-41575831);
                if (dayPnlInfo == null) {
                    BentoIcon4.Size16 size16 = new BentoIcon4.Size16(ServerToBentoAssetMapper2.INFO_16);
                    long jM21425getFg0d7_KjU2 = bentoTheme.getColors(composerStartRestartGroup, i8).m21425getFg0d7_KjU();
                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion4, bentoTheme.getSpacing(composerStartRestartGroup, i8).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue10 == companion.getEmpty()) {
                        objRememberedValue10 = new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.topbar.DetailContentKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return DetailContent6.DetailContent$lambda$26$lambda$16$lambda$15$lambda$12$lambda$11(snapshotState2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifierM5146paddingqDBjuR0$default, false, null, null, (Function0) objRememberedValue10, 7, null);
                    boolean zDetailContent$lambda$4 = DetailContent$lambda$4(snapshotState2);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue11 == companion.getEmpty()) {
                        objRememberedValue11 = new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.topbar.DetailContentKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return DetailContent6.DetailContent$lambda$26$lambda$16$lambda$15$lambda$14$lambda$13(snapshotState2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BentoIcon2.m20644BentoIconFU0evQE(size16, "", jM21425getFg0d7_KjU2, ModifiersKt.popupAutodismissTooltip$default(modifierM4893clickableXHw0xAI$default, zDetailContent$lambda$4, coroutineScope, (Function0) objRememberedValue11, 0L, ComposableLambda3.rememberComposableLambda(-1911434670, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.topbar.DetailContentKt$DetailContent$1$1$1$3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num2) {
                            invoke(composer4, num2.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer4, int i10) {
                            if ((i10 & 3) == 2 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1911434670, i10, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.topbar.DetailContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DetailContent.kt:155)");
                            }
                            String text = StringResources5.getText(dayPnlInfo.getTooltipContent(), composer4, StringResource.$stable);
                            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                            int i11 = BentoTheme.$stable;
                            BentoText2.m20747BentoText38GnDrw(text, null, Color.m6701boximpl(bentoTheme2.getColors(composer4, i11).getNova()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer4, i11).getTextS(), composer4, 0, 0, 8186);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), 8, null), null, false, composerStartRestartGroup, BentoIcon4.Size16.$stable | 48, 48);
                    composer2 = composerStartRestartGroup;
                } else {
                    composer2 = composerStartRestartGroup;
                }
                composer2.endReplaceGroup();
                composer2.endNode();
                composer2.endNode();
                Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
                Arrangement.HorizontalOrVertical spaceBetween2 = arrangement.getSpaceBetween();
                Modifier modifierFillMaxHeight$default2 = SizeKt.fillMaxHeight$default(Row5.weight$default(row6, SizeKt.m5174width3ABfNKs(companion4, C2002Dp.m7995constructorimpl(f)), 2.0f, false, 2, null), 0.0f, 1, null);
                Indication indication = (Indication) composer2.consume(IndicationKt.getLocalIndication());
                composer2.startReplaceGroup(1849434622);
                objRememberedValue6 = composer2.rememberedValue();
                if (objRememberedValue6 == companion.getEmpty()) {
                    objRememberedValue6 = InteractionSource2.MutableInteractionSource();
                    composer2.updateRememberedValue(objRememberedValue6);
                }
                InteractionSource3 interactionSource3 = (InteractionSource3) objRememberedValue6;
                composer2.endReplaceGroup();
                composer2.startReplaceGroup(5004770);
                objRememberedValue7 = composer2.rememberedValue();
                if (objRememberedValue7 == companion.getEmpty()) {
                    objRememberedValue7 = new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.topbar.DetailContentKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return DetailContent6.DetailContent$lambda$26$lambda$19$lambda$18(snapshotState);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue7);
                }
                Function0 function02 = (Function0) objRememberedValue7;
                composer2.endReplaceGroup();
                composer2.startReplaceGroup(5004770);
                objRememberedValue8 = composer2.rememberedValue();
                if (objRememberedValue8 == companion.getEmpty()) {
                    objRememberedValue8 = new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.topbar.DetailContentKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return DetailContent6.DetailContent$lambda$26$lambda$21$lambda$20(snapshotState);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue8);
                }
                composer2.endReplaceGroup();
                Modifier modifierTapAndLongPressGestureDetector = TapAndLongPressGestureDetector2.tapAndLongPressGestureDetector(modifierFillMaxHeight$default2, indication, interactionSource3, function0, function02, (Function0) objRememberedValue8);
                DetailContent2 detailContent2 = DetailContent2.INSTANCE;
                Modifier modifierM26519popupTooltipBgaGok8 = PopupTooltipKt.m26519popupTooltipBgaGok8(ModifiersKt.popupAutodismissTooltip$default(modifierTapAndLongPressGestureDetector, z3, coroutineScope, showNextPostTradeFtuxTooltipState, 0L, detailContent2.m26292getLambda$810101750$lib_trade_ladder_externalDebug(), 8, null), (16232 & 1) != 0 ? Boolean.TRUE : Boolean.valueOf(DetailContent$lambda$1(snapshotState)), (16232 & 2) != 0 ? new Function0() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda5
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
                } : null, (16232 & 16) != 0 ? PopupPositioning.FREE : null, (16232 & 32) != 0 ? null : null, (16232 & 64) != 0 ? null : null, (16232 & 128) != 0 ? C2002Dp.m7995constructorimpl(0) : 0.0f, (16232 & 256) != 0, (16232 & 512) != 0 ? C2002Dp.m7995constructorimpl(0) : 0.0f, (16232 & 1024) != 0 ? C2002Dp.m7995constructorimpl(0) : 0.0f, (16232 & 2048) != 0 ? null : null, (16232 & 4096) != 0 ? EnterTransition.INSTANCE.getNone() : null, (16232 & 8192) != 0 ? ExitTransition.INSTANCE.getNone() : null, detailContent2.getLambda$897489132$lib_trade_ladder_externalDebug());
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(spaceBetween2, centerHorizontally, composer2, 54);
                currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composer2, modifierM26519popupTooltipBgaGok8);
                Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
                if (composer2.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.useNode();
                } else {
                    composer2.createNode(constructor4);
                }
                composerM6388constructorimpl4 = Updater.m6388constructorimpl(composer2);
                Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash4 = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                }
                Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion3.getSetModifier());
                if (bigDecimal2 != null || (BigDecimals7.isZero(bigDecimal2) && !z)) {
                    composer2.startReplaceGroup(605402930);
                    jM21427getFg30d7_KjU = bentoTheme.getColors(composer2, i8).m21427getFg30d7_KjU();
                    composer2.endReplaceGroup();
                } else if (BigDecimals7.isNegative(bigDecimal2)) {
                    composer2.startReplaceGroup(605550893);
                    jM21427getFg30d7_KjU = bentoTheme.getColors(composer2, i8).m21452getNegative0d7_KjU();
                    composer2.endReplaceGroup();
                } else {
                    composer2.startReplaceGroup(605487405);
                    jM21427getFg30d7_KjU = bentoTheme.getColors(composer2, i8).m21456getPositive0d7_KjU();
                    composer2.endReplaceGroup();
                }
                WrappedTickerKt.TickerText(new TickerTextState(Moneys4.formatDeltaCurrency$default(bigDecimal2 != null ? BigDecimal.ZERO : bigDecimal2, null, 1, null), jM21427getFg30d7_KjU, style, null, false, 24, null), null, composer2, i9, 2);
                if (z) {
                    composer2.startReplaceGroup(1405021822);
                    jM21427getFg30d7_KjU2 = bentoTheme.getColors(composer2, i8).m21427getFg30d7_KjU();
                } else {
                    composer2.startReplaceGroup(1405020989);
                    jM21427getFg30d7_KjU2 = bentoTheme.getColors(composer2, i8).m21425getFg0d7_KjU();
                }
                composer2.endReplaceGroup();
                BentoText2.m20747BentoText38GnDrw(StringResources5.getText(positionsDisplay, composer2, StringResource.$stable | ((i5 >> 9) & 14)), PaddingKt.m5146paddingqDBjuR0$default(companion4, 0.0f, bentoTheme.getSpacing(composer2, i8).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 13, null), Color.m6701boximpl(jM21427getFg30d7_KjU2), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i8).getTextS(), composer2, 0, 0, 8184);
                composer2.endNode();
                Alignment.Horizontal end = companion2.getEnd();
                Arrangement.HorizontalOrVertical spaceBetween3 = arrangement.getSpaceBetween();
                Modifier modifierFillMaxHeight$default3 = SizeKt.fillMaxHeight$default(Row5.weight$default(row6, SizeKt.m5174width3ABfNKs(companion4, C2002Dp.m7995constructorimpl(f)), 1.0f, false, 2, null), 0.0f, 1, null);
                composer2.startReplaceGroup(5004770);
                z5 = (i5 & 1879048192) != 536870912;
                objRememberedValue9 = composer2.rememberedValue();
                if (!z5 || objRememberedValue9 == companion.getEmpty()) {
                    objRememberedValue9 = new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.topbar.DetailContentKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return DetailContent6.DetailContent$lambda$26$lambda$24$lambda$23(onOpenOrdersClicked);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue9);
                }
                composer2.endReplaceGroup();
                Modifier modifierM4893clickableXHw0xAI$default2 = ClickableKt.m4893clickableXHw0xAI$default(modifierFillMaxHeight$default3, z2, null, null, (Function0) objRememberedValue9, 6, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(spaceBetween3, end, composer2, 54);
                currentCompositeKeyHash5 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier5 = ComposedModifier2.materializeModifier(composer2, modifierM4893clickableXHw0xAI$default2);
                Function0<ComposeUiNode> constructor5 = companion3.getConstructor();
                if (composer2.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.useNode();
                } else {
                    composer2.createNode(constructor5);
                }
                composerM6388constructorimpl5 = Updater.m6388constructorimpl(composer2);
                Updater.m6390setimpl(composerM6388constructorimpl5, measurePolicyColumnMeasurePolicy3, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl5, currentCompositionLocalMap5, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash5 = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                    composerM6388constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                    composerM6388constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                }
                Updater.m6390setimpl(composerM6388constructorimpl5, modifierMaterializeModifier5, companion3.getSetModifier());
                composer2.startReplaceGroup(-794131389);
                if (num != null) {
                    BentoText2.m20747BentoText38GnDrw(num.toString(), null, Color.m6701boximpl(bentoTheme.getColors(composer2, i8).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, LadderStyleKt.getTextMBold(bentoTheme.getTypography(composer2, i8)), composer2, 0, 0, 8186);
                }
                composer2.endReplaceGroup();
                composer3 = composer2;
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C40888R.string.ladder_pending_orders_label, composer2, 0), null, Color.m6701boximpl(bentoTheme.getColors(composer2, i8).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i8).getTextS(), composer3, 0, 0, 8186);
                composer3.endNode();
                composer3.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.topbar.DetailContentKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return DetailContent6.DetailContent$lambda$27(bigDecimal, bigDecimal2, z, positionsDisplay, num, z2, z3, dayPnlInfo, onPnLClick, onOpenOrdersClicked, showNextPostTradeFtuxTooltipState, modifier3, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i4 |= 196608;
        if ((i3 & 64) == 0) {
        }
        if ((i3 & 128) == 0) {
        }
        if ((i3 & 256) == 0) {
        }
        if ((i3 & 512) == 0) {
        }
        i5 = i4;
        if ((i3 & 1024) == 0) {
        }
        i7 = i3 & 2048;
        if (i7 == 0) {
        }
        if ((i5 & 306783379) != 306783378) {
            if (i7 == 0) {
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
            final SnapshotState snapshotState3 = (SnapshotState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
            }
            final SnapshotState snapshotState22 = (SnapshotState) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
            }
            snapshotLongState2 = (SnapshotLongState2) objRememberedValue4;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(5004770);
            if ((i5 & 234881024) != 67108864) {
            }
            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (!z4) {
                objRememberedValue5 = new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.topbar.DetailContentKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DetailContent6.DetailContent$lambda$10$lambda$9(onPnLClick, snapshotLongState2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                Function0 function03 = (Function0) objRememberedValue5;
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierHeight2 = Intrinsic3.height(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), Intrinsic4.Max);
                bentoTheme = BentoTheme.INSTANCE;
                i8 = BentoTheme.$stable;
                Modifier modifier52 = modifier4;
                Modifier modifierM5143paddingVpY3zN42 = PaddingKt.m5143paddingVpY3zN4(modifierHeight2, bentoTheme.getSpacing(composerStartRestartGroup, i8).m21592getMediumD9Ej5fM(), C2002Dp.m7995constructorimpl(12));
                Arrangement arrangement2 = Arrangement.INSTANCE;
                Arrangement.Horizontal start3 = arrangement2.getStart();
                Alignment.Companion companion22 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy3 = Row2.rowMeasurePolicy(start3, companion22.getTop(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier6 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5143paddingVpY3zN42);
                ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor6 = companion32.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy3, companion32.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap6, companion32.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier6, companion32.getSetModifier());
                    Row6 row62 = Row6.INSTANCE;
                    Alignment.Horizontal start22 = companion22.getStart();
                    Arrangement.HorizontalOrVertical spaceBetween4 = arrangement2.getSpaceBetween();
                    Modifier.Companion companion42 = Modifier.INSTANCE;
                    float f2 = 0;
                    Modifier modifierFillMaxHeight$default4 = SizeKt.fillMaxHeight$default(Row5.weight$default(row62, SizeKt.m5174width3ABfNKs(companion42, C2002Dp.m7995constructorimpl(f2)), 1.0f, false, 2, null), 0.0f, 1, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy4 = Column2.columnMeasurePolicy(spaceBetween4, start22, composerStartRestartGroup, 54);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxHeight$default4);
                    Function0<ComposeUiNode> constructor22 = companion32.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy4, companion32.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion32.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion32.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting()) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion32.getSetModifier());
                        Column6 column62 = Column6.INSTANCE;
                        if (dayPnlInfo == null) {
                        }
                        long j2 = jM21456getPositive0d7_KjU;
                        if (dayPnlInfo == null) {
                        }
                        String str2 = deltaCurrency$default;
                        TickerTextState.Style style2 = TickerTextState.Style.REGULAR_MEDIUM_BOLD;
                        TickerTextState tickerTextState2 = new TickerTextState(str2, j2, style2, null, false, 24, null);
                        int i92 = TickerTextState.$stable;
                        WrappedTickerKt.TickerText(tickerTextState2, modifier2, composerStartRestartGroup, i92, 2);
                        MeasurePolicy measurePolicyRowMeasurePolicy22 = Row2.rowMeasurePolicy(arrangement2.getStart(), companion22.getCenterVertically(), composerStartRestartGroup, 48);
                        currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap32 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion42);
                        Function0<ComposeUiNode> constructor32 = companion32.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy22, companion32.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap32, companion32.getSetResolvedCompositionLocals());
                        setCompositeKeyHash3 = companion32.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl3.getInserting()) {
                            composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier32, companion32.getSetModifier());
                            if (dayPnlInfo == null) {
                                composerStartRestartGroup.startReplaceGroup(-1289282000);
                                jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i8).m21425getFg0d7_KjU();
                                composerStartRestartGroup.endReplaceGroup();
                                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C40888R.string.ladder_day_pnl_label, composerStartRestartGroup, 0), PaddingKt.m5146paddingqDBjuR0$default(companion42, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i8).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 13, null), Color.m6701boximpl(jM21425getFg0d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i8).getTextS(), composerStartRestartGroup, 0, 0, 8184);
                                composerStartRestartGroup.startReplaceGroup(-41575831);
                                if (dayPnlInfo == null) {
                                }
                                composer2.endReplaceGroup();
                                composer2.endNode();
                                composer2.endNode();
                                Alignment.Horizontal centerHorizontally2 = companion22.getCenterHorizontally();
                                Arrangement.HorizontalOrVertical spaceBetween22 = arrangement2.getSpaceBetween();
                                Modifier modifierFillMaxHeight$default22 = SizeKt.fillMaxHeight$default(Row5.weight$default(row62, SizeKt.m5174width3ABfNKs(companion42, C2002Dp.m7995constructorimpl(f2)), 2.0f, false, 2, null), 0.0f, 1, null);
                                Indication indication2 = (Indication) composer2.consume(IndicationKt.getLocalIndication());
                                composer2.startReplaceGroup(1849434622);
                                objRememberedValue6 = composer2.rememberedValue();
                                if (objRememberedValue6 == companion.getEmpty()) {
                                }
                                InteractionSource3 interactionSource32 = (InteractionSource3) objRememberedValue6;
                                composer2.endReplaceGroup();
                                composer2.startReplaceGroup(5004770);
                                objRememberedValue7 = composer2.rememberedValue();
                                if (objRememberedValue7 == companion.getEmpty()) {
                                }
                                Function0 function022 = (Function0) objRememberedValue7;
                                composer2.endReplaceGroup();
                                composer2.startReplaceGroup(5004770);
                                objRememberedValue8 = composer2.rememberedValue();
                                if (objRememberedValue8 == companion.getEmpty()) {
                                }
                                composer2.endReplaceGroup();
                                Modifier modifierTapAndLongPressGestureDetector2 = TapAndLongPressGestureDetector2.tapAndLongPressGestureDetector(modifierFillMaxHeight$default22, indication2, interactionSource32, function03, function022, (Function0) objRememberedValue8);
                                DetailContent2 detailContent22 = DetailContent2.INSTANCE;
                                Modifier modifierM26519popupTooltipBgaGok82 = PopupTooltipKt.m26519popupTooltipBgaGok8(ModifiersKt.popupAutodismissTooltip$default(modifierTapAndLongPressGestureDetector2, z3, coroutineScope2, showNextPostTradeFtuxTooltipState, 0L, detailContent22.m26292getLambda$810101750$lib_trade_ladder_externalDebug(), 8, null), (16232 & 1) != 0 ? Boolean.TRUE : Boolean.valueOf(DetailContent$lambda$1(snapshotState3)), (16232 & 2) != 0 ? new Function0() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda5
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
                                } : null, (16232 & 16) != 0 ? PopupPositioning.FREE : null, (16232 & 32) != 0 ? null : null, (16232 & 64) != 0 ? null : null, (16232 & 128) != 0 ? C2002Dp.m7995constructorimpl(0) : 0.0f, (16232 & 256) != 0, (16232 & 512) != 0 ? C2002Dp.m7995constructorimpl(0) : 0.0f, (16232 & 1024) != 0 ? C2002Dp.m7995constructorimpl(0) : 0.0f, (16232 & 2048) != 0 ? null : null, (16232 & 4096) != 0 ? EnterTransition.INSTANCE.getNone() : null, (16232 & 8192) != 0 ? ExitTransition.INSTANCE.getNone() : null, detailContent22.getLambda$897489132$lib_trade_ladder_externalDebug());
                                MeasurePolicy measurePolicyColumnMeasurePolicy22 = Column2.columnMeasurePolicy(spaceBetween22, centerHorizontally2, composer2, 54);
                                currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap42 = composer2.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier42 = ComposedModifier2.materializeModifier(composer2, modifierM26519popupTooltipBgaGok82);
                                Function0<ComposeUiNode> constructor42 = companion32.getConstructor();
                                if (composer2.getApplier() == null) {
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                }
                                composerM6388constructorimpl4 = Updater.m6388constructorimpl(composer2);
                                Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyColumnMeasurePolicy22, companion32.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap42, companion32.getSetResolvedCompositionLocals());
                                setCompositeKeyHash4 = companion32.getSetCompositeKeyHash();
                                if (!composerM6388constructorimpl4.getInserting()) {
                                    composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                    composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                    Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier42, companion32.getSetModifier());
                                    if (bigDecimal2 != null) {
                                        composer2.startReplaceGroup(605402930);
                                        jM21427getFg30d7_KjU = bentoTheme.getColors(composer2, i8).m21427getFg30d7_KjU();
                                        composer2.endReplaceGroup();
                                        WrappedTickerKt.TickerText(new TickerTextState(Moneys4.formatDeltaCurrency$default(bigDecimal2 != null ? BigDecimal.ZERO : bigDecimal2, null, 1, null), jM21427getFg30d7_KjU, style2, null, false, 24, null), null, composer2, i92, 2);
                                        if (z) {
                                        }
                                        composer2.endReplaceGroup();
                                        BentoText2.m20747BentoText38GnDrw(StringResources5.getText(positionsDisplay, composer2, StringResource.$stable | ((i5 >> 9) & 14)), PaddingKt.m5146paddingqDBjuR0$default(companion42, 0.0f, bentoTheme.getSpacing(composer2, i8).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 13, null), Color.m6701boximpl(jM21427getFg30d7_KjU2), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i8).getTextS(), composer2, 0, 0, 8184);
                                        composer2.endNode();
                                        Alignment.Horizontal end2 = companion22.getEnd();
                                        Arrangement.HorizontalOrVertical spaceBetween32 = arrangement2.getSpaceBetween();
                                        Modifier modifierFillMaxHeight$default32 = SizeKt.fillMaxHeight$default(Row5.weight$default(row62, SizeKt.m5174width3ABfNKs(companion42, C2002Dp.m7995constructorimpl(f2)), 1.0f, false, 2, null), 0.0f, 1, null);
                                        composer2.startReplaceGroup(5004770);
                                        if ((i5 & 1879048192) != 536870912) {
                                        }
                                        objRememberedValue9 = composer2.rememberedValue();
                                        if (!z5) {
                                            objRememberedValue9 = new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.topbar.DetailContentKt$$ExternalSyntheticLambda6
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return DetailContent6.DetailContent$lambda$26$lambda$24$lambda$23(onOpenOrdersClicked);
                                                }
                                            };
                                            composer2.updateRememberedValue(objRememberedValue9);
                                            composer2.endReplaceGroup();
                                            Modifier modifierM4893clickableXHw0xAI$default22 = ClickableKt.m4893clickableXHw0xAI$default(modifierFillMaxHeight$default32, z2, null, null, (Function0) objRememberedValue9, 6, null);
                                            MeasurePolicy measurePolicyColumnMeasurePolicy32 = Column2.columnMeasurePolicy(spaceBetween32, end2, composer2, 54);
                                            currentCompositeKeyHash5 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                            CompositionLocalMap currentCompositionLocalMap52 = composer2.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier52 = ComposedModifier2.materializeModifier(composer2, modifierM4893clickableXHw0xAI$default22);
                                            Function0<ComposeUiNode> constructor52 = companion32.getConstructor();
                                            if (composer2.getApplier() == null) {
                                            }
                                            composer2.startReusableNode();
                                            if (composer2.getInserting()) {
                                            }
                                            composerM6388constructorimpl5 = Updater.m6388constructorimpl(composer2);
                                            Updater.m6390setimpl(composerM6388constructorimpl5, measurePolicyColumnMeasurePolicy32, companion32.getSetMeasurePolicy());
                                            Updater.m6390setimpl(composerM6388constructorimpl5, currentCompositionLocalMap52, companion32.getSetResolvedCompositionLocals());
                                            setCompositeKeyHash5 = companion32.getSetCompositeKeyHash();
                                            if (!composerM6388constructorimpl5.getInserting()) {
                                                composerM6388constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                                composerM6388constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                                                Updater.m6390setimpl(composerM6388constructorimpl5, modifierMaterializeModifier52, companion32.getSetModifier());
                                                composer2.startReplaceGroup(-794131389);
                                                if (num != null) {
                                                }
                                                composer2.endReplaceGroup();
                                                composer3 = composer2;
                                                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C40888R.string.ladder_pending_orders_label, composer2, 0), null, Color.m6701boximpl(bentoTheme.getColors(composer2, i8).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i8).getTextS(), composer3, 0, 0, 8186);
                                                composer3.endNode();
                                                composer3.endNode();
                                                if (ComposerKt.isTraceInProgress()) {
                                                }
                                                modifier3 = modifier52;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void DetailContent$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    private static final void DetailContent$lambda$5(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DetailContent$lambda$10$lambda$9(Function0 function0, SnapshotLongState2 snapshotLongState2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - snapshotLongState2.getLongValue() >= 500) {
            snapshotLongState2.setLongValue(jCurrentTimeMillis);
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    private static final boolean DetailContent$lambda$1(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final boolean DetailContent$lambda$4(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DetailContent$lambda$26$lambda$16$lambda$15$lambda$12$lambda$11(SnapshotState snapshotState) {
        DetailContent$lambda$5(snapshotState, !DetailContent$lambda$4(snapshotState));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DetailContent$lambda$26$lambda$16$lambda$15$lambda$14$lambda$13(SnapshotState snapshotState) {
        DetailContent$lambda$5(snapshotState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DetailContent$lambda$26$lambda$19$lambda$18(SnapshotState snapshotState) {
        DetailContent$lambda$2(snapshotState, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DetailContent$lambda$26$lambda$21$lambda$20(SnapshotState snapshotState) {
        DetailContent$lambda$2(snapshotState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DetailContent$lambda$26$lambda$24$lambda$23(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* compiled from: DetailContent.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.tradeladder.ui.ladder.shared.topbar.DetailContentKt$LadderTopBarPreviewNullData$1 */
    static final class C410501 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ DetailContent8.Parameters $parameters;

        C410501(DetailContent8.Parameters parameters) {
            this.$parameters = parameters;
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
                ComposerKt.traceEventStart(1161050460, i, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.topbar.LadderTopBarPreviewNullData.<anonymous> (DetailContent.kt:347)");
            }
            BigDecimal dayPL = this.$parameters.getDayPL();
            BigDecimal openPL = this.$parameters.getOpenPL();
            boolean hasPosition = this.$parameters.getHasPosition();
            StringResource stringResourceInvoke = StringResource.INSTANCE.invoke("10 @ $61.01");
            DayPnlInfo dayPnlInfo = this.$parameters.getDayPnlInfo();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.topbar.DetailContentKt$LadderTopBarPreviewNullData$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.topbar.DetailContentKt$LadderTopBarPreviewNullData$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function0 function02 = (Function0) objRememberedValue2;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.topbar.DetailContentKt$LadderTopBarPreviewNullData$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            Function0 function03 = (Function0) objRememberedValue3;
            composer.endReplaceGroup();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            int i2 = StringResource.$stable;
            DetailContent6.DetailContent(dayPL, openPL, hasPosition, stringResourceInvoke, 3, true, false, dayPnlInfo, function0, function02, function03, companion2, composer, (i2 << 9) | 907763712 | (i2 << 21), 54, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    private static final void LadderTopBarPreviewNullData(final DetailContent8.Parameters parameters, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1886410260);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(parameters) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1886410260, i2, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.topbar.LadderTopBarPreviewNullData (DetailContent.kt:345)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(1161050460, true, new C410501(parameters), composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.topbar.DetailContentKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DetailContent6.LadderTopBarPreviewNullData$lambda$28(parameters, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
