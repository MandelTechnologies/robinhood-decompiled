package com.robinhood.shared.trading.tradecomponentscompose.traderow;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Alpha;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.compose.theme.style.ButtonStyle;
import com.robinhood.shared.trading.tradecomponentscompose.traderow.TradeButton3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TradeButton.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a_\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0017\u0010\u0016\u001a\u00020\u00052\b\b\u0001\u0010\u0017\u001a\u00020\u0018H\u0001¢\u0006\u0002\u0010\u0019\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u001a"}, m3636d2 = {"LadderButtonShape", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "getLadderButtonShape", "()Landroidx/compose/foundation/shape/RoundedCornerShape;", "TradeButton", "", "text", "", "textColor", "Landroidx/compose/ui/graphics/Color;", "borderColor", "backgroundColor", "isLoading", "", "enabled", "clickThrough", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "TradeButton-Pkj-vsc", "(Ljava/lang/String;JJJZZZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PreviewTradeButton", "parameters", "Lcom/robinhood/shared/trading/tradecomponentscompose/traderow/TradeRowButtonPreviewParameterProvider$Parameters;", "(Lcom/robinhood/shared/trading/tradecomponentscompose/traderow/TradeRowButtonPreviewParameterProvider$Parameters;Landroidx/compose/runtime/Composer;I)V", "lib-trade-components-compose_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.trading.tradecomponentscompose.traderow.TradeButtonKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class TradeButton2 {
    private static final RoundedCornerShape LadderButtonShape = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(24));

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewTradeButton$lambda$6(TradeButton3.Parameters parameters, int i, Composer composer, int i2) {
        PreviewTradeButton(parameters, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TradeButton_Pkj_vsc$lambda$5(String str, long j, long j2, long j3, boolean z, boolean z2, boolean z3, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m26325TradeButtonPkjvsc(str, j, j2, j3, z, z2, z3, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final RoundedCornerShape getLadderButtonShape() {
        return LadderButtonShape;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:161:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0112  */
    /* renamed from: TradeButton-Pkj-vsc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m26325TradeButtonPkjvsc(final String text, final long j, final long j2, final long j3, final boolean z, final boolean z2, final boolean z3, final Function0<Unit> onClick, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        boolean z4;
        Object objRememberedValue2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1732515810);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(text) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(j) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(j2) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    i4 = i3 | (composerStartRestartGroup.changed(j3) ? 2048 : 1024);
                }
                if ((i2 & 16) != 0) {
                    i4 |= 24576;
                } else if ((i & 24576) == 0) {
                    i4 |= composerStartRestartGroup.changed(z) ? 16384 : 8192;
                }
                if ((i2 & 32) != 0) {
                    i4 |= 196608;
                } else if ((i & 196608) == 0) {
                    i4 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
                }
                if ((i2 & 64) != 0) {
                    i4 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i4 |= composerStartRestartGroup.changed(z3) ? 1048576 : 524288;
                }
                if ((i2 & 128) != 0) {
                    i4 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(onClick) ? 8388608 : 4194304;
                }
                i5 = i2 & 256;
                if (i5 == 0) {
                    if ((100663296 & i) == 0) {
                        modifier2 = modifier;
                        i4 |= composerStartRestartGroup.changed(modifier2) ? 67108864 : 33554432;
                    }
                    if ((i4 & 38347923) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1732515810, i4, -1, "com.robinhood.shared.trading.tradecomponentscompose.traderow.TradeButton (TradeButton.kt:44)");
                        }
                        ButtonStyle.Style secondary = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getButton(composerStartRestartGroup, 0).getSecondary();
                        Modifier modifierM5155defaultMinSizeVpY3zN4$default = SizeKt.m5155defaultMinSizeVpY3zN4$default(modifier4, 0.0f, secondary.m21717getMinHeightD9Ej5fM(), 1, null);
                        RoundedCornerShape roundedCornerShape = LadderButtonShape;
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i6 = BentoTheme.$stable;
                        int i7 = i4;
                        Modifier modifier5 = modifier4;
                        Modifier modifierM4871backgroundbw27NRU = Background3.m4871backgroundbw27NRU(PillLoadingPlaceholderModifierKt.m26319pillLoadingPlaceholderknsiBA(modifierM5155defaultMinSizeVpY3zN4$default, roundedCornerShape, bentoTheme.getColors(composerStartRestartGroup, i6).m21371getBg0d7_KjU(), PillLoadingPlaceholderModifierKt.defaultPillOutlineLinearGradiant(composerStartRestartGroup, 0), z, (112 & 16) != 0 ? 1.0f : 0.0f, (112 & 32) != 0 ? PillLoadingPlaceholderModifierKt.DefaultBorderWidth : 0.0f, (112 & 64) != 0 ? 500 : 0), !z ? Color.INSTANCE.m6725getTransparent0d7_KjU() : j3, roundedCornerShape);
                        if (!z) {
                            modifierM4871backgroundbw27NRU = BorderKt.m4876borderxT4_qwU(modifierM4871backgroundbw27NRU, C2002Dp.m7995constructorimpl((float) 0.5d), j2, roundedCornerShape);
                        }
                        Modifier modifier6 = modifierM4871backgroundbw27NRU;
                        boolean z5 = (!z3 || z2) && !z;
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = InteractionSource2.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        InteractionSource3 interactionSource3 = (InteractionSource3) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        z4 = (i7 & 29360128) == 8388608;
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (z4 || objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.trading.tradecomponentscompose.traderow.TradeButtonKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return TradeButton2.TradeButton_Pkj_vsc$lambda$3$lambda$2(onClick);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierM4891clickableO2vRcR0$default = ClickableKt.m4891clickableO2vRcR0$default(modifier6, interactionSource3, null, z5, null, null, (Function0) objRememberedValue2, 24, null);
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4891clickableO2vRcR0$default);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(-1948809769);
                        long jM21427getFg30d7_KjU = !z ? bentoTheme.getColors(composerStartRestartGroup, i6).m21427getFg30d7_KjU() : j;
                        composerStartRestartGroup.endReplaceGroup();
                        composer2 = composerStartRestartGroup;
                        BentoText2.m20747BentoText38GnDrw(text, Alpha.alpha(SizeKt.wrapContentHeight$default(Modifier.INSTANCE, companion2.getCenterVertically(), false, 2, null), !z ? 0.0f : 1.0f), Color.m6701boximpl(jM21427getFg30d7_KjU), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, secondary.getTextStyle(), composer2, (i7 & 14) | 817889280, 0, 7480);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier5;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        composer2 = composerStartRestartGroup;
                        modifier3 = modifier2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trading.tradecomponentscompose.traderow.TradeButtonKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return TradeButton2.TradeButton_Pkj_vsc$lambda$5(text, j, j2, j3, z, z2, z3, onClick, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i4 |= 100663296;
                modifier2 = modifier;
                if ((i4 & 38347923) == 38347922) {
                    if (i5 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    ButtonStyle.Style secondary2 = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getButton(composerStartRestartGroup, 0).getSecondary();
                    Modifier modifierM5155defaultMinSizeVpY3zN4$default2 = SizeKt.m5155defaultMinSizeVpY3zN4$default(modifier4, 0.0f, secondary2.m21717getMinHeightD9Ej5fM(), 1, null);
                    RoundedCornerShape roundedCornerShape2 = LadderButtonShape;
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i62 = BentoTheme.$stable;
                    int i72 = i4;
                    Modifier modifier52 = modifier4;
                    Modifier modifierM4871backgroundbw27NRU2 = Background3.m4871backgroundbw27NRU(PillLoadingPlaceholderModifierKt.m26319pillLoadingPlaceholderknsiBA(modifierM5155defaultMinSizeVpY3zN4$default2, roundedCornerShape2, bentoTheme2.getColors(composerStartRestartGroup, i62).m21371getBg0d7_KjU(), PillLoadingPlaceholderModifierKt.defaultPillOutlineLinearGradiant(composerStartRestartGroup, 0), z, (112 & 16) != 0 ? 1.0f : 0.0f, (112 & 32) != 0 ? PillLoadingPlaceholderModifierKt.DefaultBorderWidth : 0.0f, (112 & 64) != 0 ? 500 : 0), !z ? Color.INSTANCE.m6725getTransparent0d7_KjU() : j3, roundedCornerShape2);
                    if (!z) {
                    }
                    Modifier modifier62 = modifierM4871backgroundbw27NRU2;
                    if (z3) {
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                        }
                        InteractionSource3 interactionSource32 = (InteractionSource3) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        if ((i72 & 29360128) == 8388608) {
                        }
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (z4) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.trading.tradecomponentscompose.traderow.TradeButtonKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return TradeButton2.TradeButton_Pkj_vsc$lambda$3$lambda$2(onClick);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifierM4891clickableO2vRcR0$default2 = ClickableKt.m4891clickableO2vRcR0$default(modifier62, interactionSource32, null, z5, null, null, (Function0) objRememberedValue2, 24, null);
                            Alignment.Companion companion22 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion22.getCenter(), false);
                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4891clickableO2vRcR0$default2);
                            ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor2 = companion32.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (!composerStartRestartGroup.getInserting()) {
                            }
                            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion32.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion32.getSetResolvedCompositionLocals());
                            setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl.getInserting()) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion32.getSetModifier());
                                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                composerStartRestartGroup.startReplaceGroup(-1948809769);
                                if (!z) {
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                composer2 = composerStartRestartGroup;
                                BentoText2.m20747BentoText38GnDrw(text, Alpha.alpha(SizeKt.wrapContentHeight$default(Modifier.INSTANCE, companion22.getCenterVertically(), false, 2, null), !z ? 0.0f : 1.0f), Color.m6701boximpl(jM21427getFg30d7_KjU), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, secondary2.getTextStyle(), composer2, (i72 & 14) | 817889280, 0, 7480);
                                composer2.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier3 = modifier52;
                            }
                        }
                    } else {
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                        }
                        InteractionSource3 interactionSource322 = (InteractionSource3) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        if ((i72 & 29360128) == 8388608) {
                        }
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (z4) {
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            i4 = i3;
            if ((i2 & 16) != 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if ((i2 & 64) != 0) {
            }
            if ((i2 & 128) != 0) {
            }
            i5 = i2 & 256;
            if (i5 == 0) {
            }
            modifier2 = modifier;
            if ((i4 & 38347923) == 38347922) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        i4 = i3;
        if ((i2 & 16) != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if ((i2 & 64) != 0) {
        }
        if ((i2 & 128) != 0) {
        }
        i5 = i2 & 256;
        if (i5 == 0) {
        }
        modifier2 = modifier;
        if ((i4 & 38347923) == 38347922) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TradeButton_Pkj_vsc$lambda$3$lambda$2(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* compiled from: TradeButton.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.trading.tradecomponentscompose.traderow.TradeButtonKt$PreviewTradeButton$1 */
    static final class C410891 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ TradeButton3.Parameters $parameters;

        C410891(TradeButton3.Parameters parameters) {
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
                ComposerKt.traceEventStart(1769406815, i, -1, "com.robinhood.shared.trading.tradecomponentscompose.traderow.PreviewTradeButton.<anonymous> (TradeButton.kt:163)");
            }
            String text = this.$parameters.getText();
            long jM26339getColor0d7_KjU = this.$parameters.m26339getColor0d7_KjU();
            boolean zIsLoading = this.$parameters.isLoading();
            Modifier modifierM5174width3ABfNKs = SizeKt.m5174width3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(150));
            long jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21427getFg30d7_KjU();
            long jM26338getBackgroundColor0d7_KjU = this.$parameters.m26338getBackgroundColor0d7_KjU();
            boolean enabled = this.$parameters.getEnabled();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.shared.trading.tradecomponentscompose.traderow.TradeButtonKt$PreviewTradeButton$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            TradeButton2.m26325TradeButtonPkjvsc(text, jM26339getColor0d7_KjU, jM21427getFg30d7_KjU, jM26338getBackgroundColor0d7_KjU, zIsLoading, enabled, false, (Function0) objRememberedValue, modifierM5174width3ABfNKs, composer, 114819072, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    public static final void PreviewTradeButton(final TradeButton3.Parameters parameters, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Composer composerStartRestartGroup = composer.startRestartGroup(1474380711);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(parameters) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1474380711, i2, -1, "com.robinhood.shared.trading.tradecomponentscompose.traderow.PreviewTradeButton (TradeButton.kt:161)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(1769406815, true, new C410891(parameters), composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trading.tradecomponentscompose.traderow.TradeButtonKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TradeButton2.PreviewTradeButton$lambda$6(parameters, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
