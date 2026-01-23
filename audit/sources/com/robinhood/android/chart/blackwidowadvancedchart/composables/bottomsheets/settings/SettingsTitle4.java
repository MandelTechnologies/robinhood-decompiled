package com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings;

import android.content.Context;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.hapticfeedback.HapticFeedback;
import androidx.compose.p011ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.Updater;
import com.robinhood.android.chart.libblackwidowadvancedchart.C10963R;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.shared.common.contracts.RemoteDisclosureKey;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SettingsTitle.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.SettingsTitleKt$SettingsTitle$1$2, reason: use source file name */
/* loaded from: classes7.dex */
final class SettingsTitle4 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Context $context;
    final /* synthetic */ HapticFeedback $hapticFeedback;
    final /* synthetic */ Navigator $navigator;
    final /* synthetic */ SnapshotState<Boolean> $showDisclosureTooltip$delegate;

    SettingsTitle4(HapticFeedback hapticFeedback, Navigator navigator, Context context, SnapshotState<Boolean> snapshotState) {
        this.$hapticFeedback = hapticFeedback;
        this.$navigator = navigator;
        this.$context = context;
        this.$showDisclosureTooltip$delegate = snapshotState;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1$lambda$0(HapticFeedback hapticFeedback, Navigator navigator, Context context, SnapshotState snapshotState) {
        hapticFeedback.mo7039performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m7050getTextHandleMove5zf0vsI());
        String string2 = context.getString(C10963R.string.chart_settings_full_disclosure_contentful_id);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, context, new RemoteDisclosureKey(string2, null, false, false, null, null, null, false, 250, null), null, false, null, null, 60, null);
        SettingsTitle3.SettingsTitle$lambda$2(snapshotState, false);
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-287888070, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.SettingsTitle.<anonymous>.<anonymous> (SettingsTitle.kt:56)");
        }
        final HapticFeedback hapticFeedback = this.$hapticFeedback;
        final Navigator navigator = this.$navigator;
        final Context context = this.$context;
        final SnapshotState<Boolean> snapshotState = this.$showDisclosureTooltip$delegate;
        Modifier.Companion companion = Modifier.INSTANCE;
        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, companion);
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
        Column6 column6 = Column6.INSTANCE;
        String strStringResource = StringResources_androidKt.stringResource(C10963R.string.gated_rhf_chart_settings_disclosure_summary_body, composer, 0);
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        BentoText2.m20747BentoText38GnDrw(strStringResource, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextM(), composer, 0, 0, 8190);
        composer.startReplaceGroup(-1224400529);
        boolean zChangedInstance = composer.changedInstance(hapticFeedback) | composer.changedInstance(navigator) | composer.changedInstance(context);
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.SettingsTitleKt$SettingsTitle$1$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SettingsTitle4.invoke$lambda$2$lambda$1$lambda$0(hapticFeedback, navigator, context, snapshotState);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(companion, false, null, null, (Function0) objRememberedValue, 7, null);
        String strStringResource2 = StringResources_androidKt.stringResource(C10963R.string.chart_settings_full_disclosure_link, composer, 0);
        TextStyle textM = bentoTheme.getTypography(composer, i2).getTextM();
        BentoText2.m20747BentoText38GnDrw(strStringResource2, modifierM4893clickableXHw0xAI$default, Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21456getPositive0d7_KjU()), null, FontWeight.INSTANCE.getBold(), TextDecoration.INSTANCE.getUnderline(), null, 0, false, 0, 0, null, 0, textM, composer, 221184, 0, 8136);
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
