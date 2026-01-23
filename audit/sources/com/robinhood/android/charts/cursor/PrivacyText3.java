package com.robinhood.android.charts.cursor;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PrivacyText.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006\u001a\r\u0010\u0007\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"PrivacyText", "", "onPrimaryValueClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PrivacyTextPreview", "(Landroidx/compose/runtime/Composer;I)V", "lib-charts_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.charts.cursor.PrivacyTextKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class PrivacyText3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PrivacyText$lambda$5(Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        PrivacyText(function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PrivacyTextPreview$lambda$6(int i, Composer composer, int i2) {
        PrivacyTextPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014c A[LOOP:0: B:65:0x014a->B:66:0x014c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PrivacyText(final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        Object objRememberedValue;
        Composer.Companion companion;
        int i4;
        boolean z;
        Object objRememberedValue2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1649014960);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1649014960, i3, -1, "com.robinhood.android.charts.cursor.PrivacyText (PrivacyText.kt:23)");
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = InteractionSource2.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                InteractionSource3 interactionSource3 = (InteractionSource3) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                i4 = 0;
                boolean z2 = function0 == null;
                composerStartRestartGroup.startReplaceGroup(5004770);
                z = (i3 & 14) == 4;
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.charts.cursor.PrivacyTextKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PrivacyText3.PrivacyText$lambda$2$lambda$1(function0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM4891clickableO2vRcR0$default = ClickableKt.m4891clickableO2vRcR0$default(modifier3, interactionSource3, null, z2, null, null, (Function0) objRememberedValue2, 24, null);
                char c = '0';
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4891clickableO2vRcR0$default);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1811019731);
                while (i4 < 4) {
                    BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.STAR_PASSWORD_16), "Privacy enabled", BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU(), Modifier.INSTANCE, null, false, composerStartRestartGroup, BentoIcon4.Size16.$stable | 3120, 48);
                    i4++;
                    c = c;
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier.Companion companion3 = Modifier.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.EYE_16), "Privacy enabled", bentoTheme.getColors(composerStartRestartGroup, i6).m21425getFg0d7_KjU(), PaddingKt.m5143paddingVpY3zN4(Background3.m4872backgroundbw27NRU$default(Clip.clip(PaddingKt.m5146paddingqDBjuR0$default(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i6).m21593getSmallD9Ej5fM())), bentoTheme.getColors(composerStartRestartGroup, i6).m21373getBg30d7_KjU(), null, 2, null), bentoTheme.getSpacing(composerStartRestartGroup, i6).m21593getSmallD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i6).m21595getXsmallD9Ej5fM()), null, false, composerStartRestartGroup, BentoIcon4.Size16.$stable | 48, 48);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.charts.cursor.PrivacyTextKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return PrivacyText3.PrivacyText$lambda$5(function0, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            InteractionSource3 interactionSource32 = (InteractionSource3) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            i4 = 0;
            if (function0 == null) {
            }
            composerStartRestartGroup.startReplaceGroup(5004770);
            if ((i3 & 14) == 4) {
            }
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (!z) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.charts.cursor.PrivacyTextKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PrivacyText3.PrivacyText$lambda$2$lambda$1(function0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM4891clickableO2vRcR0$default2 = ClickableKt.m4891clickableO2vRcR0$default(modifier3, interactionSource32, null, z2, null, null, (Function0) objRememberedValue2, 24, null);
                char c2 = '0';
                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4891clickableO2vRcR0$default2);
                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                    Row6 row62 = Row6.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(-1811019731);
                    while (i4 < 4) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier.Companion companion32 = Modifier.INSTANCE;
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i62 = BentoTheme.$stable;
                    BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.EYE_16), "Privacy enabled", bentoTheme2.getColors(composerStartRestartGroup, i62).m21425getFg0d7_KjU(), PaddingKt.m5143paddingVpY3zN4(Background3.m4872backgroundbw27NRU$default(Clip.clip(PaddingKt.m5146paddingqDBjuR0$default(companion32, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21593getSmallD9Ej5fM())), bentoTheme2.getColors(composerStartRestartGroup, i62).m21373getBg30d7_KjU(), null, 2, null), bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21593getSmallD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21595getXsmallD9Ej5fM()), null, false, composerStartRestartGroup, BentoIcon4.Size16.$stable | 48, 48);
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PrivacyText$lambda$2$lambda$1(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    private static final void PrivacyTextPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1070094101);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1070094101, i, -1, "com.robinhood.android.charts.cursor.PrivacyTextPreview (PrivacyText.kt:68)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, PrivacyText.INSTANCE.m11994getLambda$776907683$lib_charts_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.charts.cursor.PrivacyTextKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PrivacyText3.PrivacyTextPreview$lambda$6(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
