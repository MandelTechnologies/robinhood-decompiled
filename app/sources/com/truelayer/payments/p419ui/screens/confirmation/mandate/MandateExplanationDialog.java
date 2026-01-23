package com.truelayer.payments.p419ui.screens.confirmation.mandate;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPadding6;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.Icons3;
import androidx.compose.material.icons.automirrored.outlined.Help;
import androidx.compose.material.icons.outlined.Lock2;
import androidx.compose.material.icons.outlined.Security2;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.LayoutKt;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.truelayer.payments.p419ui.C42830R;
import com.truelayer.payments.p419ui.screens.confirmation.components.ExplanationDialogHeader;
import com.truelayer.payments.p419ui.theme.ModifiersKt;
import com.truelayer.payments.p419ui.theme.Spacing;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MandateExplanationDialog.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.truelayer.payments.ui.screens.confirmation.mandate.ComposableSingletons$MandateExplanationDialogKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class MandateExplanationDialog {
    public static final MandateExplanationDialog INSTANCE = new MandateExplanationDialog();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f9590lambda1 = ComposableLambda3.composableLambdaInstance(1567588242, false, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.confirmation.mandate.ComposableSingletons$MandateExplanationDialogKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1567588242, i, -1, "com.truelayer.payments.ui.screens.confirmation.mandate.ComposableSingletons$MandateExplanationDialogKt.lambda-1.<anonymous> (MandateExplanationDialog.kt:38)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierWindowInsetsPadding = WindowInsetsPadding6.windowInsetsPadding(ModifiersKt.verticalScroll$default(companion, null, false, null, false, 15, null), WindowInsets_androidKt.getNavigationBars(WindowInsets.INSTANCE, composer, 8));
                Spacing spacing = Spacing.INSTANCE;
                Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(modifierWindowInsetsPadding, spacing.m27174getLARGED9Ej5fM(), 0.0f, 2, null);
                composer.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM5144paddingVpY3zN4$default);
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
                function3ModifierMaterializerOf.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                Column6 column6 = Column6.INSTANCE;
                TextStyle bodyMedium = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodyMedium();
                String strStringResource = StringResources_androidKt.stringResource(C42830R.string.heading_secure, composer, 0);
                Icons.Outlined outlined = Icons.Outlined.INSTANCE;
                ExplanationDialogHeader.ExplanationDialogHeader(strStringResource, Lock2.getLock(outlined), composer, 0);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, spacing.m27175getMEDIUMD9Ej5fM()), composer, 6);
                TextKt.m6028Text4IGK_g(StringResources_androidKt.stringResource(C42830R.string.mandate_details_security_info, composer, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, bodyMedium, composer, 0, 0, 65534);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, spacing.m27174getLARGED9Ej5fM()), composer, 6);
                ExplanationDialogHeader.ExplanationDialogHeader(StringResources_androidKt.stringResource(C42830R.string.heading_fca_authorised, composer, 0), Security2.getSecurity(outlined), composer, 0);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, spacing.m27175getMEDIUMD9Ej5fM()), composer, 6);
                TextKt.m6028Text4IGK_g(StringResources_androidKt.stringResource(C42830R.string.mandate_details_fca_info, composer, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, bodyMedium, composer, 0, 0, 65534);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, spacing.m27174getLARGED9Ej5fM()), composer, 6);
                ExplanationDialogHeader.ExplanationDialogHeader(StringResources_androidKt.stringResource(C42830R.string.heading_how_does_this_work, composer, 0), Help.getHelp(Icons3.INSTANCE), composer, 0);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, spacing.m27175getMEDIUMD9Ej5fM()), composer, 6);
                TextKt.m6028Text4IGK_g(StringResources_androidKt.stringResource(C42830R.string.mandate_details_how_does_it_work_info, composer, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, bodyMedium, composer, 0, 0, 65534);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, spacing.m27180getXXLARGED9Ej5fM()), composer, 6);
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: getLambda-1$payments_ui_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m27099getLambda1$payments_ui_release() {
        return f9590lambda1;
    }
}
