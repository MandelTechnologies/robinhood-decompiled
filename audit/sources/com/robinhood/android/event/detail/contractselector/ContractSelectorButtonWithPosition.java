package com.robinhood.android.event.detail.contractselector;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.event.detail.contractselector.ContractSelectorButtonViewState;
import com.robinhood.android.eventcontracts.sharedeventui.StringUtil2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ContractSelectorButtonWithPosition.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a5\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a5\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0004\b\u000f\u0010\f\u001a\u0017\u0010\u0010\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u0011\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"ContractSelectorButtonShape", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "ContractSelectorQuotePill", "", "state", "Lcom/robinhood/android/event/detail/contractselector/ContractSelectorButtonViewState;", "width", "Landroidx/compose/ui/unit/Dp;", "height", "modifier", "Landroidx/compose/ui/Modifier;", "ContractSelectorQuotePill-UmHF5L4", "(Lcom/robinhood/android/event/detail/contractselector/ContractSelectorButtonViewState;Landroidx/compose/ui/unit/Dp;Landroidx/compose/ui/unit/Dp;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PositionPillShape", "ContractSelectorButtonWithPosition", "ContractSelectorButtonWithPosition-UmHF5L4", "ContractSelectorButtonWithPositionPreview", "(Lcom/robinhood/android/event/detail/contractselector/ContractSelectorButtonViewState;Landroidx/compose/runtime/Composer;I)V", "feature-event-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.event.detail.contractselector.ContractSelectorButtonWithPositionKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class ContractSelectorButtonWithPosition {
    private static final RoundedCornerShape ContractSelectorButtonShape = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(40));
    private static final RoundedCornerShape PositionPillShape = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(25));

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContractSelectorButtonWithPositionPreview$lambda$9(ContractSelectorButtonViewState contractSelectorButtonViewState, int i, Composer composer, int i2) {
        ContractSelectorButtonWithPositionPreview(contractSelectorButtonViewState, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContractSelectorButtonWithPosition_UmHF5L4$lambda$8(ContractSelectorButtonViewState contractSelectorButtonViewState, C2002Dp c2002Dp, C2002Dp c2002Dp2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m14139ContractSelectorButtonWithPositionUmHF5L4(contractSelectorButtonViewState, c2002Dp, c2002Dp2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContractSelectorQuotePill_UmHF5L4$lambda$4(ContractSelectorButtonViewState contractSelectorButtonViewState, C2002Dp c2002Dp, C2002Dp c2002Dp2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m14140ContractSelectorQuotePillUmHF5L4(contractSelectorButtonViewState, c2002Dp, c2002Dp2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x015e  */
    /* renamed from: ContractSelectorQuotePill-UmHF5L4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m14140ContractSelectorQuotePillUmHF5L4(final ContractSelectorButtonViewState state, final C2002Dp c2002Dp, final C2002Dp c2002Dp2, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Modifier modifierClip;
        Modifier modifier3;
        Color quoteBackgroundColor;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        float f;
        Composer composer2;
        final Modifier modifier4;
        Modifier modifierM4872backgroundbw27NRU$default;
        Modifier modifierM5161requiredHeightInVpY3zN4$default;
        Modifier modifierM5168requiredWidthInVpY3zN4$default;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(918613772);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(c2002Dp) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(c2002Dp2) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier5 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(918613772, i3, -1, "com.robinhood.android.event.detail.contractselector.ContractSelectorQuotePill (ContractSelectorButtonWithPosition.kt:41)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                RoundedCornerShape roundedCornerShape = ContractSelectorButtonShape;
                modifierClip = Clip.clip(companion, roundedCornerShape);
                if (c2002Dp != null && (modifierM5168requiredWidthInVpY3zN4$default = SizeKt.m5168requiredWidthInVpY3zN4$default(modifierClip, c2002Dp.getValue(), 0.0f, 2, null)) != null) {
                    modifierClip = modifierM5168requiredWidthInVpY3zN4$default;
                }
                modifier3 = (c2002Dp2 != null || (modifierM5161requiredHeightInVpY3zN4$default = SizeKt.m5161requiredHeightInVpY3zN4$default(modifierClip, c2002Dp2.getValue(), 0.0f, 2, null)) == null) ? modifierClip : modifierM5161requiredHeightInVpY3zN4$default;
                int i5 = StringResource.$stable;
                int i6 = i3 & 14;
                quoteBackgroundColor = state.getQuoteBackgroundColor(composerStartRestartGroup, i5 | i6);
                if (quoteBackgroundColor != null && (modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifier3, quoteBackgroundColor.getValue(), null, 2, null)) != null) {
                    modifier3 = modifierM4872backgroundbw27NRU$default;
                }
                Modifier modifierThen = BorderKt.m4876borderxT4_qwU(modifier3, C2002Dp.m7995constructorimpl(1), state.getQuoteBorderColor(composerStartRestartGroup, i5 | i6), roundedCornerShape).then(modifier5);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierThen);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                f = 1.0f;
                if ((!state.isEnabled() || state.getSide() != ContractSelectorButton2.YES || !state.getShouldUseAchromaticTheme()) && !state.isEnabled()) {
                    f = 0.3f;
                }
                float f2 = f;
                String text = StringUtil2.getText(state.getQuoteText(), composerStartRestartGroup, i5);
                long jM6705copywmQWz5c$default = Color.m6705copywmQWz5c$default(state.getQuoteTextColor(composerStartRestartGroup, i5 | i6), f2, 0.0f, 0.0f, 0.0f, 14, null);
                TextStyle textS = BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getTextS();
                int iM7919getCentere0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
                FontWeight bold = FontWeight.INSTANCE.getBold();
                int iM7959getEllipsisgIe3tQ8 = TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8();
                Color colorM6701boximpl = Color.m6701boximpl(jM6705copywmQWz5c$default);
                TextAlign textAlignM7912boximpl = TextAlign.m7912boximpl(iM7919getCentere0LSkKk);
                Modifier modifier6 = modifier5;
                composer2 = composerStartRestartGroup;
                BentoText2.m20747BentoText38GnDrw(text, null, colorM6701boximpl, null, bold, null, textAlignM7912boximpl, iM7959getEllipsisgIe3tQ8, false, 1, 0, null, 0, textS, composer2, 817913856, 0, 7466);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier6;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier4 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.detail.contractselector.ContractSelectorButtonWithPositionKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ContractSelectorButtonWithPosition.ContractSelectorQuotePill_UmHF5L4$lambda$4(state, c2002Dp, c2002Dp2, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            Modifier.Companion companion3 = Modifier.INSTANCE;
            RoundedCornerShape roundedCornerShape2 = ContractSelectorButtonShape;
            modifierClip = Clip.clip(companion3, roundedCornerShape2);
            if (c2002Dp != null) {
                modifierClip = modifierM5168requiredWidthInVpY3zN4$default;
            }
            if (c2002Dp2 != null) {
                int i52 = StringResource.$stable;
                int i62 = i3 & 14;
                quoteBackgroundColor = state.getQuoteBackgroundColor(composerStartRestartGroup, i52 | i62);
                if (quoteBackgroundColor != null) {
                    modifier3 = modifierM4872backgroundbw27NRU$default;
                }
                Modifier modifierThen2 = BorderKt.m4876borderxT4_qwU(modifier3, C2002Dp.m7995constructorimpl(1), state.getQuoteBorderColor(composerStartRestartGroup, i52 | i62), roundedCornerShape2).then(modifier5);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierThen2);
                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    f = 1.0f;
                    if (!state.isEnabled()) {
                        f = 0.3f;
                        float f22 = f;
                        String text2 = StringUtil2.getText(state.getQuoteText(), composerStartRestartGroup, i52);
                        long jM6705copywmQWz5c$default2 = Color.m6705copywmQWz5c$default(state.getQuoteTextColor(composerStartRestartGroup, i52 | i62), f22, 0.0f, 0.0f, 0.0f, 14, null);
                        TextStyle textS2 = BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getTextS();
                        int iM7919getCentere0LSkKk2 = TextAlign.INSTANCE.m7919getCentere0LSkKk();
                        FontWeight bold2 = FontWeight.INSTANCE.getBold();
                        int iM7959getEllipsisgIe3tQ82 = TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8();
                        Color colorM6701boximpl2 = Color.m6701boximpl(jM6705copywmQWz5c$default2);
                        TextAlign textAlignM7912boximpl2 = TextAlign.m7912boximpl(iM7919getCentere0LSkKk2);
                        Modifier modifier62 = modifier5;
                        composer2 = composerStartRestartGroup;
                        BentoText2.m20747BentoText38GnDrw(text2, null, colorM6701boximpl2, null, bold2, null, textAlignM7912boximpl2, iM7959getEllipsisgIe3tQ82, false, 1, 0, null, 0, textS2, composer2, 817913856, 0, 7466);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier4 = modifier62;
                    } else {
                        f = 0.3f;
                        float f222 = f;
                        String text22 = StringUtil2.getText(state.getQuoteText(), composerStartRestartGroup, i52);
                        long jM6705copywmQWz5c$default22 = Color.m6705copywmQWz5c$default(state.getQuoteTextColor(composerStartRestartGroup, i52 | i62), f222, 0.0f, 0.0f, 0.0f, 14, null);
                        TextStyle textS22 = BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getTextS();
                        int iM7919getCentere0LSkKk22 = TextAlign.INSTANCE.m7919getCentere0LSkKk();
                        FontWeight bold22 = FontWeight.INSTANCE.getBold();
                        int iM7959getEllipsisgIe3tQ822 = TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8();
                        Color colorM6701boximpl22 = Color.m6701boximpl(jM6705copywmQWz5c$default22);
                        TextAlign textAlignM7912boximpl22 = TextAlign.m7912boximpl(iM7919getCentere0LSkKk22);
                        Modifier modifier622 = modifier5;
                        composer2 = composerStartRestartGroup;
                        BentoText2.m20747BentoText38GnDrw(text22, null, colorM6701boximpl22, null, bold22, null, textAlignM7912boximpl22, iM7959getEllipsisgIe3tQ822, false, 1, 0, null, 0, textS22, composer2, 817913856, 0, 7466);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier4 = modifier622;
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /* renamed from: ContractSelectorButtonWithPosition-UmHF5L4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m14139ContractSelectorButtonWithPositionUmHF5L4(final ContractSelectorButtonViewState state, final C2002Dp c2002Dp, final C2002Dp c2002Dp2, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1036659166);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(c2002Dp) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(c2002Dp2) ? 256 : 128;
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
                        ComposerKt.traceEventStart(-1036659166, i3, -1, "com.robinhood.android.event.detail.contractselector.ContractSelectorButtonWithPosition (ContractSelectorButtonWithPosition.kt:94)");
                    }
                    if (state.getPositionState() instanceof ContractSelectorButtonViewState.PositionState.WithPosition) {
                        throw new IllegalArgumentException("positionState has to be of type PositionState.WithPosition in ContractSelectorButtonWithPosition");
                    }
                    int i5 = StringResource.$stable;
                    int i6 = i3 & 14;
                    Color positionBorderColor = state.getPositionBorderColor(composerStartRestartGroup, i5 | i6);
                    Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    int i7 = i3 & 112;
                    boolean zChanged = (i7 == 32) | composerStartRestartGroup.changed(density);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new ContractSelectorButtonWithPosition2(c2002Dp, density);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    Modifier modifierM5176widthInVpY3zN4$default = SizeKt.m5176widthInVpY3zN4$default(PaddingKt.m5144paddingVpY3zN4$default(Background3.m4872backgroundbw27NRU$default(Clip.clip(companion2.then(positionBorderColor != null ? BorderKt.m4876borderxT4_qwU(companion2, C2002Dp.m7995constructorimpl(1), positionBorderColor.getValue(), PositionPillShape) : companion2), PositionPillShape), state.getPositionBackgroundColor(composerStartRestartGroup, i5 | i6), null, 2, null), C2002Dp.m7995constructorimpl(4), 0.0f, 2, null), C2002Dp.m7995constructorimpl(32), 0.0f, 2, null);
                    Modifier modifier5 = modifier4;
                    composer2 = composerStartRestartGroup;
                    BentoText2.m20747BentoText38GnDrw(StringUtil2.getText(((ContractSelectorButtonViewState.PositionState.WithPosition) state.getPositionState()).getPositionText(), composerStartRestartGroup, i5), modifierM5176widthInVpY3zN4$default, Color.m6701boximpl(state.getPositionTextColor(composerStartRestartGroup, i6 | i5)), null, FontWeight.INSTANCE.getBold(), null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getTextAnnotation(), composer2, 24576, 0, 8104);
                    m14140ContractSelectorQuotePillUmHF5L4(new ContractSelectorButtonViewState(state.getSide(), state.getQuoteText(), (ContractSelectorButtonViewState.PositionState.WithPosition) state.getPositionState(), state.getIdentifier(), state.getShouldUseAchromaticTheme(), state.isTradeEnabled()), c2002Dp, c2002Dp2, null, composer2, i5 | i7 | (i3 & 896), 8);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.detail.contractselector.ContractSelectorButtonWithPositionKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ContractSelectorButtonWithPosition.ContractSelectorButtonWithPosition_UmHF5L4$lambda$8(state, c2002Dp, c2002Dp2, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
                if (state.getPositionState() instanceof ContractSelectorButtonViewState.PositionState.WithPosition) {
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

    private static final void ContractSelectorButtonWithPositionPreview(final ContractSelectorButtonViewState contractSelectorButtonViewState, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(480360777);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(contractSelectorButtonViewState) : composerStartRestartGroup.changedInstance(contractSelectorButtonViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(480360777, i2, -1, "com.robinhood.android.event.detail.contractselector.ContractSelectorButtonWithPositionPreview (ContractSelectorButtonWithPosition.kt:222)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(1422680321, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.event.detail.contractselector.ContractSelectorButtonWithPositionKt.ContractSelectorButtonWithPositionPreview.1
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
                        ComposerKt.traceEventStart(1422680321, i3, -1, "com.robinhood.android.event.detail.contractselector.ContractSelectorButtonWithPositionPreview.<anonymous> (ContractSelectorButtonWithPosition.kt:224)");
                    }
                    ContractSelectorButtonWithPosition.m14139ContractSelectorButtonWithPositionUmHF5L4(contractSelectorButtonViewState, C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(72)), C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(36)), null, composer2, StringResource.$stable | 432, 8);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.detail.contractselector.ContractSelectorButtonWithPositionKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ContractSelectorButtonWithPosition.ContractSelectorButtonWithPositionPreview$lambda$9(contractSelectorButtonViewState, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
