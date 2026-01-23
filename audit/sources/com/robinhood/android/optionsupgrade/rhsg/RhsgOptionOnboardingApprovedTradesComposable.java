package com.robinhood.android.optionsupgrade.rhsg;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.optionsupgrade.C25121R;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RhsgOptionOnboardingApprovedTradesComposable.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"ValueProp1TestTag", "", "ValueProp2TestTag", "ValueProp3TestTag", "ValueProp4TestTag", "ValueProp5TestTag", "ApacOptionOnboardingApprovedTradesComposable", "", "isL3", "", "modifier", "Landroidx/compose/ui/Modifier;", "(ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-options-upgrade_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.optionsupgrade.rhsg.RhsgOptionOnboardingApprovedTradesComposableKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class RhsgOptionOnboardingApprovedTradesComposable {
    public static final String ValueProp1TestTag = "VALUE_PROP_1_TEST_TAG";
    public static final String ValueProp2TestTag = "VALUE_PROP_2_TEST_TAG";
    public static final String ValueProp3TestTag = "VALUE_PROP_3_TEST_TAG";
    public static final String ValueProp4TestTag = "VALUE_PROP_4_TEST_TAG";
    public static final String ValueProp5TestTag = "VALUE_PROP_5_TEST_TAG";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ApacOptionOnboardingApprovedTradesComposable$lambda$1(boolean z, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ApacOptionOnboardingApprovedTradesComposable(z, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ApacOptionOnboardingApprovedTradesComposable(final boolean z, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        BentoBaseRowState.Start.Icon icon;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(312529126);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (composerStartRestartGroup.changed(z) ? 4 : 2);
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
                    ComposerKt.traceEventStart(312529126, i3, -1, "com.robinhood.android.optionsupgrade.rhsg.ApacOptionOnboardingApprovedTradesComposable (RhsgOptionOnboardingApprovedTradesComposable.kt:25)");
                }
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
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
                Modifier.Companion companion2 = Modifier.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifier4 = modifier3;
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C25121R.string.option_upgrade_confirmation_title_success, composerStartRestartGroup, 0), PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), 0.0f, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8188);
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C25121R.string.apac_approved_trades_description, composerStartRestartGroup, 0), PaddingKt.m21620defaultFillMaxWidthPaddingVpY3zN4(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM()), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, 0, 0, 16380);
                Modifier modifierTestTag = TestTag3.testTag(companion2, ValueProp1TestTag);
                String strStringResource = StringResources_androidKt.stringResource(C25121R.string.options_upgrade_review_long_single_leg_label, composerStartRestartGroup, 0);
                ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.CHECKMARK_24;
                BentoBaseRowState.Start.Icon icon2 = new BentoBaseRowState.Start.Icon(serverToBentoAssetMapper2, null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21456getPositive0d7_KjU()), 2, null);
                int i6 = BentoBaseRowState.Start.Icon.$stable;
                BentoBaseRowKt.m20916BentoBaseRowygcbOzY(modifierTestTag, icon2, strStringResource, null, null, null, null, false, false, false, 0L, null, composerStartRestartGroup, (i6 << 3) | 6, 0, 4088);
                BentoBaseRowKt.m20916BentoBaseRowygcbOzY(TestTag3.testTag(companion2, ValueProp2TestTag), new BentoBaseRowState.Start.Icon(serverToBentoAssetMapper2, null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21456getPositive0d7_KjU()), 2, null), StringResources_androidKt.stringResource(C25121R.string.options_upgrade_review_short_covered_call_label, composerStartRestartGroup, 0), null, null, null, null, false, false, false, 0L, null, composerStartRestartGroup, (i6 << 3) | 6, 0, 4088);
                BentoBaseRowKt.m20916BentoBaseRowygcbOzY(TestTag3.testTag(companion2, ValueProp3TestTag), new BentoBaseRowState.Start.Icon(serverToBentoAssetMapper2, null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21456getPositive0d7_KjU()), 2, null), StringResources_androidKt.stringResource(C25121R.string.options_upgrade_review_short_covered_put_label, composerStartRestartGroup, 0), null, null, null, null, false, false, false, 0L, null, composerStartRestartGroup, (i6 << 3) | 6, 0, 4088);
                BentoBaseRowKt.m20916BentoBaseRowygcbOzY(TestTag3.testTag(companion2, ValueProp4TestTag), new BentoBaseRowState.Start.Icon(serverToBentoAssetMapper2, null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21456getPositive0d7_KjU()), 2, null), StringResources_androidKt.stringResource(C25121R.string.options_upgrade_review_exercise_label, composerStartRestartGroup, 0), null, null, null, null, false, false, false, 0L, null, composerStartRestartGroup, (i6 << 3) | 6, 0, 4088);
                Modifier modifierTestTag2 = TestTag3.testTag(companion2, ValueProp5TestTag);
                String strStringResource2 = StringResources_androidKt.stringResource(C25121R.string.options_upgrade_review_spreads_label, composerStartRestartGroup, 0);
                if (!z) {
                    composerStartRestartGroup.startReplaceGroup(-106938872);
                    BentoBaseRowState.Start.Icon icon3 = new BentoBaseRowState.Start.Icon(serverToBentoAssetMapper2, null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21456getPositive0d7_KjU()), 2, null);
                    composerStartRestartGroup.endReplaceGroup();
                    icon = icon3;
                } else {
                    composerStartRestartGroup.startReplaceGroup(-106744564);
                    BentoBaseRowState.Start.Icon icon4 = new BentoBaseRowState.Start.Icon(ServerToBentoAssetMapper2.CLOSE_24, null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21452getNegative0d7_KjU()), 2, null);
                    composerStartRestartGroup.endReplaceGroup();
                    icon = icon4;
                }
                composer2 = composerStartRestartGroup;
                BentoBaseRowKt.m20916BentoBaseRowygcbOzY(modifierTestTag2, icon, strStringResource2, null, null, null, null, false, false, false, 0L, null, composer2, (i6 << 3) | 6, 0, 4088);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionsupgrade.rhsg.RhsgOptionOnboardingApprovedTradesComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return RhsgOptionOnboardingApprovedTradesComposable.ApacOptionOnboardingApprovedTradesComposable$lambda$1(z, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion3.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                Modifier.Companion companion22 = Modifier.INSTANCE;
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i52 = BentoTheme.$stable;
                Modifier modifier42 = modifier3;
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C25121R.string.option_upgrade_confirmation_title_success, composerStartRestartGroup, 0), PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion22, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM(), 0.0f, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8188);
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C25121R.string.apac_approved_trades_description, composerStartRestartGroup, 0), PaddingKt.m21620defaultFillMaxWidthPaddingVpY3zN4(companion22, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM()), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, 0, 0, 16380);
                Modifier modifierTestTag3 = TestTag3.testTag(companion22, ValueProp1TestTag);
                String strStringResource3 = StringResources_androidKt.stringResource(C25121R.string.options_upgrade_review_long_single_leg_label, composerStartRestartGroup, 0);
                ServerToBentoAssetMapper2 serverToBentoAssetMapper22 = ServerToBentoAssetMapper2.CHECKMARK_24;
                BentoBaseRowState.Start.Icon icon22 = new BentoBaseRowState.Start.Icon(serverToBentoAssetMapper22, null, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i52).m21456getPositive0d7_KjU()), 2, null);
                int i62 = BentoBaseRowState.Start.Icon.$stable;
                BentoBaseRowKt.m20916BentoBaseRowygcbOzY(modifierTestTag3, icon22, strStringResource3, null, null, null, null, false, false, false, 0L, null, composerStartRestartGroup, (i62 << 3) | 6, 0, 4088);
                BentoBaseRowKt.m20916BentoBaseRowygcbOzY(TestTag3.testTag(companion22, ValueProp2TestTag), new BentoBaseRowState.Start.Icon(serverToBentoAssetMapper22, null, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i52).m21456getPositive0d7_KjU()), 2, null), StringResources_androidKt.stringResource(C25121R.string.options_upgrade_review_short_covered_call_label, composerStartRestartGroup, 0), null, null, null, null, false, false, false, 0L, null, composerStartRestartGroup, (i62 << 3) | 6, 0, 4088);
                BentoBaseRowKt.m20916BentoBaseRowygcbOzY(TestTag3.testTag(companion22, ValueProp3TestTag), new BentoBaseRowState.Start.Icon(serverToBentoAssetMapper22, null, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i52).m21456getPositive0d7_KjU()), 2, null), StringResources_androidKt.stringResource(C25121R.string.options_upgrade_review_short_covered_put_label, composerStartRestartGroup, 0), null, null, null, null, false, false, false, 0L, null, composerStartRestartGroup, (i62 << 3) | 6, 0, 4088);
                BentoBaseRowKt.m20916BentoBaseRowygcbOzY(TestTag3.testTag(companion22, ValueProp4TestTag), new BentoBaseRowState.Start.Icon(serverToBentoAssetMapper22, null, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i52).m21456getPositive0d7_KjU()), 2, null), StringResources_androidKt.stringResource(C25121R.string.options_upgrade_review_exercise_label, composerStartRestartGroup, 0), null, null, null, null, false, false, false, 0L, null, composerStartRestartGroup, (i62 << 3) | 6, 0, 4088);
                Modifier modifierTestTag22 = TestTag3.testTag(companion22, ValueProp5TestTag);
                String strStringResource22 = StringResources_androidKt.stringResource(C25121R.string.options_upgrade_review_spreads_label, composerStartRestartGroup, 0);
                if (!z) {
                }
                composer2 = composerStartRestartGroup;
                BentoBaseRowKt.m20916BentoBaseRowygcbOzY(modifierTestTag22, icon, strStringResource22, null, null, null, null, false, false, false, 0L, null, composer2, (i62 << 3) | 6, 0, 4088);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier42;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
