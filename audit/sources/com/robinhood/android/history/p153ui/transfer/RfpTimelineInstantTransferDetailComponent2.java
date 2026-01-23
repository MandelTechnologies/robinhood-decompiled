package com.robinhood.android.history.p153ui.transfer;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoTimelineRowKt;
import com.robinhood.compose.bento.component.rows.Timeline;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RfpTimelineInstantTransferDetailComponent.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"RfpTimelineInstantTransferDetailComponent", "", "displayData", "Lcom/robinhood/android/history/ui/transfer/RfpTimelineInstantTransferDetailComponentDisplayData;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/history/ui/transfer/RfpTimelineInstantTransferDetailComponentDisplayData;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-history_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.history.ui.transfer.RfpTimelineInstantTransferDetailComponentKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class RfpTimelineInstantTransferDetailComponent2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RfpTimelineInstantTransferDetailComponent$lambda$2(RfpTimelineInstantTransferDetailComponentDisplayData rfpTimelineInstantTransferDetailComponentDisplayData, Modifier modifier, int i, int i2, Composer composer, int i3) {
        RfpTimelineInstantTransferDetailComponent(rfpTimelineInstantTransferDetailComponentDisplayData, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01bd A[LOOP:0: B:49:0x01b7->B:51:0x01bd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RfpTimelineInstantTransferDetailComponent(final RfpTimelineInstantTransferDetailComponentDisplayData displayData, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        Composer composer3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(displayData, "displayData");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1271748331);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (composerStartRestartGroup.changedInstance(displayData) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1271748331, i3, -1, "com.robinhood.android.history.ui.transfer.RfpTimelineInstantTransferDetailComponent (RfpTimelineInstantTransferDetailComponent.kt:18)");
                }
                Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(modifier3, 0.0f, 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxHeight$default);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                String title = displayData.getTitle();
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                TextStyle displayCapsuleMedium = bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleMedium();
                Modifier.Companion companion2 = Modifier.INSTANCE;
                Modifier modifier4 = modifier3;
                BentoText2.m20747BentoText38GnDrw(title, PaddingKt.m5146paddingqDBjuR0$default(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM(), 4, null), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, displayCapsuleMedium, composerStartRestartGroup, 0, 0, 8184);
                BentoText2.m20747BentoText38GnDrw(displayData.getSubtitle(), PaddingKt.m5146paddingqDBjuR0$default(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextM(), composerStartRestartGroup, 0, 0, 8184);
                composer2 = composerStartRestartGroup;
                composer2.startReplaceGroup(1785264824);
                for (RfpTimelineRowDisplayItem rfpTimelineRowDisplayItem : displayData.getTimelineItems()) {
                    Composer composer4 = composer2;
                    BentoTimelineRowKt.m20996BentoTimelineRowcZKY2IM(rfpTimelineRowDisplayItem.getStatus(), rfpTimelineRowDisplayItem.getPosition(), rfpTimelineRowDisplayItem.getTitle(), null, null, rfpTimelineRowDisplayItem.getMetadata(), null, null, rfpTimelineRowDisplayItem.getColorOverrides(), null, false, null, null, false, false, 2, false, 0, false, false, false, composer4, Timeline.ColorOverrides.$stable << 24, 196608, 0, 2064088);
                    composer2 = composer4;
                }
                composer2.endReplaceGroup();
                Arrangement.Vertical bottom = Arrangement.INSTANCE.getBottom();
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Modifier modifierFillMaxHeight$default2 = SizeKt.fillMaxHeight$default(companion3, 0.0f, 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(bottom, Alignment.INSTANCE.getStart(), composer2, 6);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierFillMaxHeight$default2);
                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                if (composer2.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.useNode();
                } else {
                    composer2.createNode(constructor2);
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                String disclaimerText = displayData.getDisclaimerText();
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                composer3 = composer2;
                BentoText2.m20747BentoText38GnDrw(disclaimerText, PaddingKt.m5146paddingqDBjuR0$default(companion3, bentoTheme2.getSpacing(composer2, i6).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme2.getSpacing(composer2, i6).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composer2, i6).m21591getLargeD9Ej5fM(), 2, null), Color.m6701boximpl(bentoTheme2.getColors(composer2, i6).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer2, i6).getTextS(), composer3, 0, 0, 8120);
                composer3.endNode();
                composer3.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer3 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.history.ui.transfer.RfpTimelineInstantTransferDetailComponentKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return RfpTimelineInstantTransferDetailComponent2.RfpTimelineInstantTransferDetailComponent$lambda$2(displayData, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierFillMaxHeight$default3 = SizeKt.fillMaxHeight$default(modifier3, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxHeight$default3);
            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy3, companion5.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion5.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion5.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion5.getSetModifier());
                Column6 column63 = Column6.INSTANCE;
                String title2 = displayData.getTitle();
                BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                int i52 = BentoTheme.$stable;
                TextStyle displayCapsuleMedium2 = bentoTheme3.getTypography(composerStartRestartGroup, i52).getDisplayCapsuleMedium();
                Modifier.Companion companion22 = Modifier.INSTANCE;
                Modifier modifier42 = modifier3;
                BentoText2.m20747BentoText38GnDrw(title2, PaddingKt.m5146paddingqDBjuR0$default(companion22, bentoTheme3.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), bentoTheme3.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme3.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM(), 4, null), Color.m6701boximpl(bentoTheme3.getColors(composerStartRestartGroup, i52).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, displayCapsuleMedium2, composerStartRestartGroup, 0, 0, 8184);
                BentoText2.m20747BentoText38GnDrw(displayData.getSubtitle(), PaddingKt.m5146paddingqDBjuR0$default(companion22, bentoTheme3.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), Color.m6701boximpl(bentoTheme3.getColors(composerStartRestartGroup, i52).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme3.getTypography(composerStartRestartGroup, i52).getTextM(), composerStartRestartGroup, 0, 0, 8184);
                composer2 = composerStartRestartGroup;
                composer2.startReplaceGroup(1785264824);
                while (r0.hasNext()) {
                }
                composer2.endReplaceGroup();
                Arrangement.Vertical bottom2 = Arrangement.INSTANCE.getBottom();
                Modifier.Companion companion32 = Modifier.INSTANCE;
                Modifier modifierFillMaxHeight$default22 = SizeKt.fillMaxHeight$default(companion32, 0.0f, 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy22 = Column2.columnMeasurePolicy(bottom2, Alignment.INSTANCE.getStart(), composer2, 6);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composer2, modifierFillMaxHeight$default22);
                ComposeUiNode.Companion companion42 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor22 = companion42.getConstructor();
                if (composer2.getApplier() == null) {
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy22, companion42.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion42.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion42.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting()) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion42.getSetModifier());
                    Column6 column622 = Column6.INSTANCE;
                    String disclaimerText2 = displayData.getDisclaimerText();
                    BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                    int i62 = BentoTheme.$stable;
                    composer3 = composer2;
                    BentoText2.m20747BentoText38GnDrw(disclaimerText2, PaddingKt.m5146paddingqDBjuR0$default(companion32, bentoTheme22.getSpacing(composer2, i62).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme22.getSpacing(composer2, i62).m21592getMediumD9Ej5fM(), bentoTheme22.getSpacing(composer2, i62).m21591getLargeD9Ej5fM(), 2, null), Color.m6701boximpl(bentoTheme22.getColors(composer2, i62).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme22.getTypography(composer2, i62).getTextS(), composer3, 0, 0, 8120);
                    composer3.endNode();
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = modifier42;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
