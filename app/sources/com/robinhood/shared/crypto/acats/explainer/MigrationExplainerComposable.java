package com.robinhood.shared.crypto.acats.explainer;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow2;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.shared.crypto.acats.C37511R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MigrationExplainerComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.acats.explainer.ComposableSingletons$MigrationExplainerComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class MigrationExplainerComposable {
    public static final MigrationExplainerComposable INSTANCE = new MigrationExplainerComposable();
    private static Function3<BoxScope, Composer, Integer, Unit> lambda$1661947472 = ComposableLambda3.composableLambdaInstance(1661947472, false, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.acats.explainer.ComposableSingletons$MigrationExplainerComposableKt$lambda$1661947472$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
            invoke(boxScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1661947472, i, -1, "com.robinhood.shared.crypto.acats.explainer.ComposableSingletons$MigrationExplainerComposableKt.lambda$1661947472.<anonymous> (MigrationExplainerComposable.kt:91)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(ScrollKt.verticalScroll$default(companion, ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null), 0.0f, 1, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(modifierFillMaxWidth$default, 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composer, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5144paddingVpY3zN4$default);
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
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C37511R.string.crypto_acats_migration_explainer_title, composer, 0), com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composer, 6, 1), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleSmall(), composer, 0, 0, 8188);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM()), composer, 0);
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C37511R.string.crypto_acats_migration_explainer_subtitle, composer, 0), com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composer, 6, 1), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 0, 0, 16380);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM()), composer, 0);
            String strStringResource = StringResources_androidKt.stringResource(C37511R.string.crypto_acats_migration_explainer_step1_title, composer, 0);
            String strStringResource2 = StringResources_androidKt.stringResource(C37511R.string.crypto_acats_migration_explainer_step1_body, composer, 0);
            BentoValuePropRow2.Number number = new BentoValuePropRow2.Number(1);
            BentoValuePropRow bentoValuePropRow = BentoValuePropRow.Top;
            int i3 = BentoValuePropRow2.Number.$stable;
            BentoValuePropRow3.BentoValuePropRow(strStringResource, strStringResource2, number, bentoValuePropRow, (Modifier) null, composer, (i3 << 6) | 3072, 16);
            BentoValuePropRow3.BentoValuePropRow(StringResources_androidKt.stringResource(C37511R.string.crypto_acats_migration_explainer_step2_title, composer, 0), StringResources_androidKt.stringResource(C37511R.string.crypto_acats_migration_explainer_step2_body, composer, 0), new BentoValuePropRow2.Number(2), bentoValuePropRow, (Modifier) null, composer, (i3 << 6) | 3072, 16);
            BentoValuePropRow3.BentoValuePropRow(StringResources_androidKt.stringResource(C37511R.string.crypto_acats_migration_explainer_step3_title, composer, 0), StringResources_androidKt.stringResource(C37511R.string.crypto_acats_migration_explainer_step3_body, composer, 0), new BentoValuePropRow2.Number(3), bentoValuePropRow, (Modifier) null, composer, (i3 << 6) | 3072, 16);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM()), composer, 0);
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C37511R.string.crypto_acats_migration_explainer_footer, composer, 0), com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion, 0.0f, 1, null), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 0, 0, 16380);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function3<BoxScope, Composer, Integer, Unit> getLambda$1661947472$feature_acats_externalRelease() {
        return lambda$1661947472;
    }
}
