package com.robinhood.android.gold.switchplans;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.selection.SelectableGroup;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.Updater;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import midas.service.p509v1.GoldPlanSelectionOption;
import midas.service.p509v1.PlanSelectionPageContent;

/* compiled from: GoldSwitchPlansSelectComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.gold.switchplans.GoldSwitchPlansSelectComposableKt$GoldPlanSelection$2$2, reason: use source file name */
/* loaded from: classes10.dex */
final class GoldSwitchPlansSelectComposable3 implements Function3<BoxScope, Composer, Integer, Unit> {
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ SnapshotState<String> $selectedPlanId$delegate;
    final /* synthetic */ PlanSelectionPageContent $this_with;

    GoldSwitchPlansSelectComposable3(Modifier modifier, PlanSelectionPageContent planSelectionPageContent, SnapshotState<String> snapshotState) {
        this.$modifier = modifier;
        this.$this_with = planSelectionPageContent;
        this.$selectedPlanId$delegate = snapshotState;
    }

    public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer, int i) {
        final SnapshotState<String> snapshotState;
        Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1548377080, i, -1, "com.robinhood.android.gold.switchplans.GoldPlanSelection.<anonymous>.<anonymous> (GoldSwitchPlansSelectComposable.kt:120)");
        }
        Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(this.$modifier, 0.0f, composer, 0, 1);
        PlanSelectionPageContent planSelectionPageContent = this.$this_with;
        SnapshotState<String> snapshotState2 = this.$selectedPlanId$delegate;
        Arrangement arrangement = Arrangement.INSTANCE;
        Arrangement.Vertical top = arrangement.getTop();
        Alignment.Companion companion = Alignment.INSTANCE;
        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composer, 0);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM21623defaultHorizontalPaddingrAjV9yQ);
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
        String title = planSelectionPageContent.getTitle();
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        TextStyle displayCapsuleMedium = bentoTheme.getTypography(composer, i2).getDisplayCapsuleMedium();
        Modifier.Companion companion3 = Modifier.INSTANCE;
        SnapshotState<String> snapshotState3 = snapshotState2;
        BentoText2.m20747BentoText38GnDrw(title, androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(companion3, 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 1, null), null, null, null, null, null, 0, false, 0, 0, null, 0, displayCapsuleMedium, composer, 0, 0, 8188);
        Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(ScrollKt.verticalScroll$default(SelectableGroup.selectableGroup(companion3), ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null), 0.0f, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composer, 0);
        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierM5146paddingqDBjuR0$default);
        Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
        if (composer.getApplier() == null) {
            Composables.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor2);
        } else {
            composer.useNode();
        }
        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer);
        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
        composer.startReplaceGroup(-1423548594);
        for (final GoldPlanSelectionOption goldPlanSelectionOption : planSelectionPageContent.getPlans()) {
            boolean z = GoldSwitchPlansSelectComposable.GoldPlanSelection$lambda$5$lambda$3(snapshotState3).length() > 0 && Intrinsics.areEqual(GoldSwitchPlansSelectComposable.GoldPlanSelection$lambda$5$lambda$3(snapshotState3), goldPlanSelectionOption.getPlan_id());
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composer.changedInstance(goldPlanSelectionOption);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                snapshotState = snapshotState3;
                objRememberedValue = new Function0() { // from class: com.robinhood.android.gold.switchplans.GoldSwitchPlansSelectComposableKt$GoldPlanSelection$2$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GoldSwitchPlansSelectComposable3.invoke$lambda$4$lambda$3$lambda$2$lambda$1$lambda$0(goldPlanSelectionOption, snapshotState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            } else {
                snapshotState = snapshotState3;
            }
            composer.endReplaceGroup();
            GoldSwitchPlansSelectComposable.PricingPlan(goldPlanSelectionOption, z, (Function0) objRememberedValue, composer, 0);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM()), composer, 0);
            snapshotState3 = snapshotState;
        }
        composer.endReplaceGroup();
        composer.endNode();
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
        invoke(boxScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$3$lambda$2$lambda$1$lambda$0(GoldPlanSelectionOption goldPlanSelectionOption, SnapshotState snapshotState) {
        snapshotState.setValue(goldPlanSelectionOption.getPlan_id());
        return Unit.INSTANCE;
    }
}
