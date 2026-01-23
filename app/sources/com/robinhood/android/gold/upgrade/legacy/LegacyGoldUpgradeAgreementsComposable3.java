package com.robinhood.android.gold.upgrade.legacy;

import android.text.Spanned;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.selection.Toggleable2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.semantics.Role;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.gold.lib.upgrade.api.ApiGoldUpgradeFlow;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.compose.bento.component.BentoCheckbox2;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout;
import com.robinhood.compose.bento.component.text.BentoSpannedText;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LegacyGoldUpgradeAgreementsComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeAgreementsComposableKt$GoldUpgradeAgreementsComposable$1$2, reason: use source file name */
/* loaded from: classes10.dex */
final class LegacyGoldUpgradeAgreementsComposable3 implements Function3<BoxScope, Composer, Integer, Unit> {
    final /* synthetic */ SnapshotState<Boolean> $isSweepChecked$delegate;
    final /* synthetic */ boolean $isTitleCenterAlignment;
    final /* synthetic */ Spanned $rememberGoldDescription;
    final /* synthetic */ Spanned $rememberSweepDescription;
    final /* synthetic */ ApiGoldUpgradeFlow.ApiGoldSweepAgreements $this_with;

    LegacyGoldUpgradeAgreementsComposable3(SnapshotState<Boolean> snapshotState, Spanned spanned, boolean z, ApiGoldUpgradeFlow.ApiGoldSweepAgreements apiGoldSweepAgreements, Spanned spanned2) {
        this.$isSweepChecked$delegate = snapshotState;
        this.$rememberSweepDescription = spanned;
        this.$isTitleCenterAlignment = z;
        this.$this_with = apiGoldSweepAgreements;
        this.$rememberGoldDescription = spanned2;
    }

    public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-891897283, i, -1, "com.robinhood.android.gold.upgrade.legacy.GoldUpgradeAgreementsComposable.<anonymous>.<anonymous> (LegacyGoldUpgradeAgreementsComposable.kt:104)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(companion, ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null);
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(modifierVerticalScroll$default, 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 1, null);
        final SnapshotState<Boolean> snapshotState = this.$isSweepChecked$delegate;
        Spanned spanned = this.$rememberSweepDescription;
        boolean z = this.$isTitleCenterAlignment;
        final ApiGoldUpgradeFlow.ApiGoldSweepAgreements apiGoldSweepAgreements = this.$this_with;
        Spanned spanned2 = this.$rememberGoldDescription;
        Arrangement arrangement = Arrangement.INSTANCE;
        Arrangement.Vertical top = arrangement.getTop();
        Alignment.Companion companion2 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5144paddingVpY3zN4$default);
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
        Column6 column6 = Column6.INSTANCE;
        Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composer, 6, 1);
        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer, 0);
        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierM21623defaultHorizontalPaddingrAjV9yQ);
        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
        Alignment.Horizontal centerHorizontally = z ? companion2.getCenterHorizontally() : companion2.getStart();
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
        MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer, 0);
        int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer, modifierFillMaxWidth$default);
        Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
        if (composer.getApplier() == null) {
            Composables.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor3);
        } else {
            composer.useNode();
        }
        Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer);
        Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy3, companion3.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
        if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
        }
        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
        BentoText2.m20747BentoText38GnDrw(apiGoldSweepAgreements.getTitle(), null, null, null, null, null, TextAlign.m7912boximpl(z ? TextAlign.INSTANCE.m7919getCentere0LSkKk() : TextAlign.INSTANCE.m7924getStarte0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleMedium(), composer, 0, 0, 8126);
        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM()), composer, 0);
        BentoText2.m20747BentoText38GnDrw(apiGoldSweepAgreements.getDescription(), null, null, null, null, null, TextAlign.m7912boximpl(z ? TextAlign.INSTANCE.m7919getCentere0LSkKk() : TextAlign.INSTANCE.m7924getStarte0LSkKk()), 0, false, 0, 0, null, 0, null, composer, 0, 0, 16318);
        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21591getLargeD9Ej5fM()), composer, 0);
        composer.endNode();
        BentoText2.m20747BentoText38GnDrw(apiGoldSweepAgreements.getGoldTitle(), null, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, null, composer, 24576, 0, 16366);
        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, C2002Dp.m7995constructorimpl(12)), composer, 6);
        BentoSpannedText.m21106BentoSpannedTextTHkziT8(spanned2, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, null, C20690R.attr.textAppearanceRegularSmall, null, 0, 0, null, composer, 48, 492);
        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM()), composer, 0);
        BentoDivider.m20635BentoHorizontalDivideraMcp0Q(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), bentoTheme.getColors(composer, i2).m21373getBg30d7_KjU(), 0.0f, composer, 6, 4);
        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM()), composer, 0);
        composer.endNode();
        Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
        boolean zGoldUpgradeAgreementsComposable$lambda$6 = LegacyGoldUpgradeAgreementsComposable.GoldUpgradeAgreementsComposable$lambda$6(snapshotState);
        Role roleM7472boximpl = Role.m7472boximpl(Role.INSTANCE.m7481getCheckboxo7Vup1c());
        composer.startReplaceGroup(5004770);
        boolean zChanged = composer.changed(snapshotState);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeAgreementsComposableKt$GoldUpgradeAgreementsComposable$1$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return LegacyGoldUpgradeAgreementsComposable3.invoke$lambda$4$lambda$3$lambda$2(snapshotState, ((Boolean) obj).booleanValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoBaseRowLayout.BentoBaseRowLayout(Toggleable2.m5320toggleableXHw0xAI$default(modifierFillMaxWidth$default2, zGoldUpgradeAgreementsComposable$lambda$6, false, roleM7472boximpl, (Function1) objRememberedValue, 2, null), null, null, ComposableLambda3.rememberComposableLambda(-889702224, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeAgreementsComposableKt$GoldUpgradeAgreementsComposable$1$2$1$3
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
                    ComposerKt.traceEventStart(-889702224, i3, -1, "com.robinhood.android.gold.upgrade.legacy.GoldUpgradeAgreementsComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LegacyGoldUpgradeAgreementsComposable.kt:164)");
                }
                BentoText2.m20747BentoText38GnDrw(apiGoldSweepAgreements.getSweepTitle(), null, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, null, composer2, 24576, 0, 16366);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer, 54), null, null, ComposableLambda3.rememberComposableLambda(2019105651, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeAgreementsComposableKt$GoldUpgradeAgreementsComposable$1$2$1$4
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
                    ComposerKt.traceEventStart(2019105651, i3, -1, "com.robinhood.android.gold.upgrade.legacy.GoldUpgradeAgreementsComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LegacyGoldUpgradeAgreementsComposable.kt:170)");
                }
                BentoCheckbox2.m20599BentoCheckboxSj8uqqQ(null, LegacyGoldUpgradeAgreementsComposable.GoldUpgradeAgreementsComposable$lambda$6(snapshotState), false, null, null, composer2, 24576, 13);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer, 54), false, false, false, null, composer, 14158848, 0, 1846);
        BentoSpannedText.m21106BentoSpannedTextTHkziT8(spanned, com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, composer, 6, 1), null, null, C20690R.attr.textAppearanceRegularSmall, null, 0, 0, null, composer, 0, 492);
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
    public static final Unit invoke$lambda$4$lambda$3$lambda$2(SnapshotState snapshotState, boolean z) {
        LegacyGoldUpgradeAgreementsComposable.GoldUpgradeAgreementsComposable$lambda$7(snapshotState, z);
        return Unit.INSTANCE;
    }
}
