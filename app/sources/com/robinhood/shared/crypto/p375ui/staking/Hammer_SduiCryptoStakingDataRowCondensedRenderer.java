package com.robinhood.shared.crypto.p375ui.staking;

import android.os.Parcelable;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiIcon2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiText2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.UtilKt;
import com.robinhood.android.sdui.annotations.SduiComponentRenderer;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.hammer.core.internal.RhGenerated;
import com.robinhood.models.serverdriven.experimental.api.CryptoDemeterDataRowCondensed;
import com.robinhood.models.serverdriven.experimental.api.Icon;
import com.robinhood.models.serverdriven.experimental.api.RenderableText;
import com.robinhood.models.serverdriven.experimental.api.TextStyle;
import com.robinhood.models.serverdriven.experimental.api.ThemedColor;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Hammer_SduiCryptoStakingDataRowCondensedRenderer.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u0004\u001a\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0017¢\u0006\u0002\u0010\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/staking/Hammer_SduiCryptoStakingDataRowCondensedRenderer;", "Lcom/robinhood/android/sdui/annotations/SduiComponentRenderer;", "<init>", "()V", "Component", "", "component", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "modifier", "Landroidx/compose/ui/Modifier;", "horizontalPadding", "Lcom/robinhood/models/serverdriven/experimental/ui/HorizontalPadding;", "(Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;Landroidx/compose/ui/Modifier;Lcom/robinhood/models/serverdriven/experimental/ui/HorizontalPadding;Landroidx/compose/runtime/Composer;I)V", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class Hammer_SduiCryptoStakingDataRowCondensedRenderer implements SduiComponentRenderer {
    public static final int $stable = 0;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Component$lambda$0(Hammer_SduiCryptoStakingDataRowCondensedRenderer hammer_SduiCryptoStakingDataRowCondensedRenderer, UIComponent uIComponent, Modifier modifier, HorizontalPadding horizontalPadding, int i, Composer composer, int i2) {
        hammer_SduiCryptoStakingDataRowCondensedRenderer.Component(uIComponent, modifier, horizontalPadding, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.sdui.annotations.SduiComponentRenderer
    public void Component(final UIComponent<?> component, final Modifier modifier, final HorizontalPadding horizontalPadding, Composer composer, final int i) {
        int i2;
        float fM7995constructorimpl;
        float fM7995constructorimpl2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(horizontalPadding, "horizontalPadding");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1122064070);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changedInstance(component) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1122064070, i2, -1, "com.robinhood.shared.crypto.ui.staking.Hammer_SduiCryptoStakingDataRowCondensedRenderer.Component (Hammer_SduiCryptoStakingDataRowCondensedRenderer.kt:28)");
            }
            final CryptoDemeterDataRowCondensed cryptoDemeterDataRowCondensed = (CryptoDemeterDataRowCondensed) component;
            composerStartRestartGroup.startReplaceGroup(1148721117);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(cryptoDemeterDataRowCondensed);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new C38618xe7cbbf8f(cryptoDemeterDataRowCondensed);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierSemantics$default = SemanticsModifier6.semantics$default(modifier, false, (Function1) objRememberedValue, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierSemantics$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            CryptoStakingDataRowCondensedDefaults cryptoStakingDataRowCondensedDefaults = CryptoStakingDataRowCondensedDefaults.INSTANCE;
            Modifier modifierM5155defaultMinSizeVpY3zN4$default = SizeKt.m5155defaultMinSizeVpY3zN4$default(companion2, 0.0f, cryptoStakingDataRowCondensedDefaults.m25236getCondensedMinHeightD9Ej5fM(), 1, null);
            float f = 2;
            float fM7995constructorimpl3 = C2002Dp.m7995constructorimpl(cryptoStakingDataRowCondensedDefaults.m25237getCondensedVerticalPaddingD9Ej5fM() / f);
            Float top_inset = cryptoDemeterDataRowCondensed.getTop_inset();
            if (top_inset == null) {
                fM7995constructorimpl = C2002Dp.m7995constructorimpl(0);
            } else {
                fM7995constructorimpl = C2002Dp.m7995constructorimpl(top_inset.floatValue());
            }
            float fM7995constructorimpl4 = C2002Dp.m7995constructorimpl(fM7995constructorimpl3 + fM7995constructorimpl);
            float fM7995constructorimpl5 = C2002Dp.m7995constructorimpl(cryptoStakingDataRowCondensedDefaults.m25237getCondensedVerticalPaddingD9Ej5fM() / f);
            Float bottom_inset = cryptoDemeterDataRowCondensed.getBottom_inset();
            if (bottom_inset == null) {
                fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(0);
            } else {
                fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(bottom_inset.floatValue());
            }
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierM5155defaultMinSizeVpY3zN4$default, 0.0f, fM7995constructorimpl4, 0.0f, C2002Dp.m7995constructorimpl(fM7995constructorimpl5 + fM7995constructorimpl2), 5, null);
            UIComponent leading_accessory = cryptoDemeterDataRowCondensed.getLeading_accessory();
            composerStartRestartGroup.startReplaceGroup(1764102048);
            ComposableLambda composableLambdaRememberComposableLambda = leading_accessory == null ? null : ComposableLambda3.rememberComposableLambda(2001938987, true, new C38619x23e833dd(leading_accessory), composerStartRestartGroup, 54);
            composerStartRestartGroup.endReplaceGroup();
            RenderableText subtitle = cryptoDemeterDataRowCondensed.getSubtitle();
            composerStartRestartGroup.startReplaceGroup(1764125185);
            ComposableLambda composableLambdaRememberComposableLambda2 = subtitle == null ? null : ComposableLambda3.rememberComposableLambda(-1687310603, true, new C38620x23e8379e(cryptoDemeterDataRowCondensed, subtitle), composerStartRestartGroup, 54);
            composerStartRestartGroup.endReplaceGroup();
            final RenderableText value = cryptoDemeterDataRowCondensed.getValue();
            composerStartRestartGroup.startReplaceGroup(1764149441);
            ComposableLambda composableLambdaRememberComposableLambda3 = value == null ? null : ComposableLambda3.rememberComposableLambda(918007447, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.ui.staking.Hammer_SduiCryptoStakingDataRowCondensedRenderer$Component$$inlined$SduiCryptoStakingDataRowCondensed$1
                public final void invoke(Composer composer3, int i3) {
                    int i4;
                    Alignment.Companion companion3;
                    BentoTheme bentoTheme;
                    int i5;
                    if ((i3 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(918007447, i3, -1, "com.robinhood.shared.crypto.ui.staking.SduiCryptoStakingDataRowCondensed.<anonymous>.<anonymous>.<anonymous> (SduiCryptoStakingDataRowCondensed.kt:95)");
                    }
                    Alignment.Companion companion4 = Alignment.INSTANCE;
                    Alignment.Horizontal end = companion4.getEnd();
                    CryptoDemeterDataRowCondensed cryptoDemeterDataRowCondensed2 = cryptoDemeterDataRowCondensed;
                    RenderableText renderableText = value;
                    Modifier.Companion companion5 = Modifier.INSTANCE;
                    Arrangement arrangement = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), end, composer3, 48);
                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, companion5);
                    ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion6.getConstructor();
                    if (composer3.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor2);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion6.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion6.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion6.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion6.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    Parcelable value_tap_action = cryptoDemeterDataRowCondensed2.getValue_tap_action();
                    Float value_trailing_icon_spacing = cryptoDemeterDataRowCondensed2.getValue_trailing_icon_spacing();
                    C2002Dp c2002DpM7993boximpl = value_trailing_icon_spacing != null ? C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(value_trailing_icon_spacing.floatValue())) : null;
                    TextStyle value_text_style = cryptoDemeterDataRowCondensed2.getValue_text_style();
                    ThemedColor value_text_color = cryptoDemeterDataRowCondensed2.getValue_text_color();
                    Icon value_trailing_icon = cryptoDemeterDataRowCondensed2.getValue_trailing_icon();
                    ThemedColor value_trailing_icon_color = cryptoDemeterDataRowCondensed2.getValue_trailing_icon_color();
                    C2002Dp c2002Dp = c2002DpM7993boximpl;
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    long jM21425getFg0d7_KjU = bentoTheme2.getColors(composer3, i6).m21425getFg0d7_KjU();
                    composer3.startReplaceGroup(1386949870);
                    Modifier modifierThen = UtilKt.onClickModifierWithNoIndication(value_tap_action, composer3, 0).then(companion5);
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.m5089spacedBy0680j_4(c2002Dp != null ? c2002Dp.getValue() : C2002Dp.m7995constructorimpl(0)), companion4.getCenterVertically(), composer3, 48);
                    int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer3, modifierThen);
                    Function0<ComposeUiNode> constructor3 = companion6.getConstructor();
                    if (composer3.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor3);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer3);
                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy, companion6.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion6.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion6.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion6.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    SduiText2.SduiText(SduiCryptoStakingDataRowCondensedKt.generateText(renderableText, value_text_style, value_text_color), (Modifier) null, composer3, 0, 2);
                    BentoIcon4 bentoIcon = value_trailing_icon != null ? SduiIcon2.toBentoIcon(value_trailing_icon) : null;
                    composer3.startReplaceGroup(938164764);
                    if (bentoIcon == null) {
                        i4 = i6;
                        companion3 = companion4;
                        bentoTheme = bentoTheme2;
                        i5 = 1386949870;
                    } else {
                        composer3.startReplaceGroup(938169090);
                        Color composeColor = value_trailing_icon_color == null ? null : SduiColors2.toComposeColor(value_trailing_icon_color, composer3, 0);
                        composer3.endReplaceGroup();
                        if (composeColor != null) {
                            jM21425getFg0d7_KjU = composeColor.getValue();
                        }
                        BentoIcon4 bentoIcon4 = bentoIcon;
                        i4 = i6;
                        companion3 = companion4;
                        bentoTheme = bentoTheme2;
                        i5 = 1386949870;
                        BentoIcon2.m20644BentoIconFU0evQE(bentoIcon4, null, jM21425getFg0d7_KjU, null, null, false, composer3, BentoIcon4.$stable | 48, 56);
                        Unit unit = Unit.INSTANCE;
                    }
                    composer3.endReplaceGroup();
                    composer3.endNode();
                    composer3.endReplaceGroup();
                    RenderableText secondary_value = cryptoDemeterDataRowCondensed2.getSecondary_value();
                    composer3.startReplaceGroup(80953817);
                    if (secondary_value != null) {
                        Parcelable secondary_value_tap_action = cryptoDemeterDataRowCondensed2.getSecondary_value_tap_action();
                        Float secondary_value_trailing_icon_spacing = cryptoDemeterDataRowCondensed2.getSecondary_value_trailing_icon_spacing();
                        C2002Dp c2002DpM7993boximpl2 = secondary_value_trailing_icon_spacing != null ? C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(secondary_value_trailing_icon_spacing.floatValue())) : null;
                        TextStyle secondary_value_text_style = cryptoDemeterDataRowCondensed2.getSecondary_value_text_style();
                        ThemedColor secondary_value_text_color = cryptoDemeterDataRowCondensed2.getSecondary_value_text_color();
                        Icon secondary_value_trailing_icon = cryptoDemeterDataRowCondensed2.getSecondary_value_trailing_icon();
                        ThemedColor secondary_value_trailing_icon_color = cryptoDemeterDataRowCondensed2.getSecondary_value_trailing_icon_color();
                        long jM21426getFg20d7_KjU = bentoTheme.getColors(composer3, i4).m21426getFg20d7_KjU();
                        composer3.startReplaceGroup(i5);
                        Modifier modifierThen2 = UtilKt.onClickModifierWithNoIndication(secondary_value_tap_action, composer3, 0).then(companion5);
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement.m5089spacedBy0680j_4(c2002DpM7993boximpl2 != null ? c2002DpM7993boximpl2.getValue() : C2002Dp.m7995constructorimpl(0)), companion3.getCenterVertically(), composer3, 48);
                        int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composer3, modifierThen2);
                        Function0<ComposeUiNode> constructor4 = companion6.getConstructor();
                        if (composer3.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor4);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composer3);
                        Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyRowMeasurePolicy2, companion6.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion6.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion6.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                            composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                            composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion6.getSetModifier());
                        SduiText2.SduiText(SduiCryptoStakingDataRowCondensedKt.generateText(secondary_value, secondary_value_text_style, secondary_value_text_color), (Modifier) null, composer3, 0, 2);
                        BentoIcon4 bentoIcon2 = secondary_value_trailing_icon != null ? SduiIcon2.toBentoIcon(secondary_value_trailing_icon) : null;
                        composer3.startReplaceGroup(938164764);
                        if (bentoIcon2 != null) {
                            composer3.startReplaceGroup(938169090);
                            Color composeColor2 = secondary_value_trailing_icon_color == null ? null : SduiColors2.toComposeColor(secondary_value_trailing_icon_color, composer3, 0);
                            composer3.endReplaceGroup();
                            if (composeColor2 != null) {
                                jM21426getFg20d7_KjU = composeColor2.getValue();
                            }
                            BentoIcon2.m20644BentoIconFU0evQE(bentoIcon2, null, jM21426getFg20d7_KjU, null, null, false, composer3, BentoIcon4.$stable | 48, 56);
                            Unit unit2 = Unit.INSTANCE;
                        }
                        composer3.endReplaceGroup();
                        composer3.endNode();
                        composer3.endReplaceGroup();
                        Unit unit3 = Unit.INSTANCE;
                    }
                    composer3.endReplaceGroup();
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54);
            composerStartRestartGroup.endReplaceGroup();
            UIComponent trailing_accessory = cryptoDemeterDataRowCondensed.getTrailing_accessory();
            composerStartRestartGroup.startReplaceGroup(1764203200);
            ComposableLambda composableLambdaRememberComposableLambda4 = trailing_accessory != null ? ComposableLambda3.rememberComposableLambda(-1355735006, true, new C38622x23e83f20(trailing_accessory), composerStartRestartGroup, 54) : null;
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            BentoBaseRowLayout.BentoBaseRowLayout(modifierM5146paddingqDBjuR0$default, null, composableLambdaRememberComposableLambda, ComposableLambda3.rememberComposableLambda(-1190523398, true, new C38623xe7cbc354(cryptoDemeterDataRowCondensed), composerStartRestartGroup, 54), composableLambdaRememberComposableLambda2, composableLambdaRememberComposableLambda3, composableLambdaRememberComposableLambda4, false, true, true, null, composer2, 918555648, 0, 1026);
            composer2.endNode();
            composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.ui.staking.Hammer_SduiCryptoStakingDataRowCondensedRenderer$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Hammer_SduiCryptoStakingDataRowCondensedRenderer.Component$lambda$0(this.f$0, component, modifier, horizontalPadding, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
