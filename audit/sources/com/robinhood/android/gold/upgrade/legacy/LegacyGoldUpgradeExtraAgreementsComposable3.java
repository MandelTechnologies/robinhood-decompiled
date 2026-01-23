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
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.gold.lib.upgrade.api.ApiGoldUpgradeFlow;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.compose.bento.component.BentoCheckbox2;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout;
import com.robinhood.compose.bento.component.text.BentoSpannedText;
import com.robinhood.compose.bento.component.text.Markdown3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.api.bonfire.ApiGoldSweepAgreement;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LegacyGoldUpgradeExtraAgreementsComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeExtraAgreementsComposableKt$GoldUpgradeExtraAgreementsComposable$1$2, reason: use source file name */
/* loaded from: classes10.dex */
final class LegacyGoldUpgradeExtraAgreementsComposable3 implements Function3<BoxScope, Composer, Integer, Unit> {
    final /* synthetic */ SnapshotState<Boolean> $isSlipChecked$delegate;
    final /* synthetic */ SnapshotState<Boolean> $isSweepChecked$delegate;
    final /* synthetic */ Function1<ApiGoldSweepAgreement, Unit> $onClickFullAgreement;
    final /* synthetic */ Spanned $rememberGoldDescription;
    final /* synthetic */ ApiGoldUpgradeFlow.ApiGoldExtraAgreements $this_with;

    /* JADX WARN: Multi-variable type inference failed */
    LegacyGoldUpgradeExtraAgreementsComposable3(ApiGoldUpgradeFlow.ApiGoldExtraAgreements apiGoldExtraAgreements, Spanned spanned, Function1<? super ApiGoldSweepAgreement, Unit> function1, SnapshotState<Boolean> snapshotState, SnapshotState<Boolean> snapshotState2) {
        this.$this_with = apiGoldExtraAgreements;
        this.$rememberGoldDescription = spanned;
        this.$onClickFullAgreement = function1;
        this.$isSweepChecked$delegate = snapshotState;
        this.$isSlipChecked$delegate = snapshotState2;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
        invoke(boxScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x022d A[PHI: r10
      0x022d: PHI (r10v12 androidx.compose.runtime.Composer) = (r10v6 androidx.compose.runtime.Composer), (r10v3 androidx.compose.runtime.Composer) binds: [B:57:0x0347, B:39:0x022a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer, int i) {
        BentoTheme bentoTheme;
        int i2;
        String str;
        float f;
        int i3;
        Composer composer2;
        Modifier.Companion companion;
        ApiGoldUpgradeFlow.ApiGoldExtraAgreements.ApiGoldSlipConfig apiGoldSlipConfig;
        int i4;
        BentoTheme bentoTheme2;
        Composer composer3;
        Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(94618043, i, -1, "com.robinhood.android.gold.upgrade.legacy.GoldUpgradeExtraAgreementsComposable.<anonymous>.<anonymous> (LegacyGoldUpgradeExtraAgreementsComposable.kt:75)");
        }
        Modifier.Companion companion2 = Modifier.INSTANCE;
        Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(companion2, ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null);
        BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
        int i5 = BentoTheme.$stable;
        Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(modifierVerticalScroll$default, 0.0f, bentoTheme3.getSpacing(composer, i5).m21590getDefaultD9Ej5fM(), 1, null);
        ApiGoldUpgradeFlow.ApiGoldExtraAgreements apiGoldExtraAgreements = this.$this_with;
        Spanned spanned = this.$rememberGoldDescription;
        final Function1<ApiGoldSweepAgreement, Unit> function1 = this.$onClickFullAgreement;
        final SnapshotState<Boolean> snapshotState = this.$isSweepChecked$delegate;
        final SnapshotState<Boolean> snapshotState2 = this.$isSlipChecked$delegate;
        Arrangement arrangement = Arrangement.INSTANCE;
        Arrangement.Vertical top = arrangement.getTop();
        Alignment.Companion companion3 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion3.getStart(), composer, 0);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5144paddingVpY3zN4$default);
        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
        Column6 column6 = Column6.INSTANCE;
        Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion2, 0.0f, composer, 6, 1);
        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composer, 0);
        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierM21623defaultHorizontalPaddingrAjV9yQ);
        Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
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
        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
        BentoText2.m20747BentoText38GnDrw(apiGoldExtraAgreements.getTitle(), null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme3.getTypography(composer, i5).getDisplayCapsuleMedium(), composer, 0, 0, 8190);
        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme3.getSpacing(composer, i5).m21593getSmallD9Ej5fM()), composer, 0);
        BentoText2.m20747BentoText38GnDrw(apiGoldExtraAgreements.getDescription(), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 0, 0, 16382);
        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme3.getSpacing(composer, i5).m21592getMediumD9Ej5fM()), composer, 0);
        String goldTitle = apiGoldExtraAgreements.getGoldTitle();
        FontWeight.Companion companion5 = FontWeight.INSTANCE;
        BentoText2.m20747BentoText38GnDrw(goldTitle, null, null, null, companion5.getBold(), null, null, 0, false, 0, 0, null, 0, null, composer, 24576, 0, 16366);
        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, C2002Dp.m7995constructorimpl(12)), composer, 6);
        Composer composer4 = composer;
        BentoSpannedText.m21106BentoSpannedTextTHkziT8(spanned, SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), null, null, C20690R.attr.textAppearanceRegularSmall, null, 0, 0, null, composer4, 48, 492);
        composer4.endNode();
        composer4.startReplaceGroup(-598315473);
        if (apiGoldExtraAgreements.getGoldSweepConfig() != null || apiGoldExtraAgreements.getGoldSlipConfig() != null) {
            final ApiGoldUpgradeFlow.ApiGoldExtraAgreements.ApiGoldSweepConfig goldSweepConfig = apiGoldExtraAgreements.getGoldSweepConfig();
            composer4.startReplaceGroup(-598315829);
            if (goldSweepConfig == null) {
                str = null;
                f = 0.0f;
                bentoTheme = bentoTheme3;
                i2 = i5;
                i3 = 6;
            } else {
                Spanned spannedRememberMarkdown = Markdown3.rememberMarkdown(goldSweepConfig.getSweepDescriptionMarkdown(), composer4, 0);
                String sweepDescriptionCta = goldSweepConfig.getSweepDescriptionCta();
                composer4.startReplaceGroup(-1633490746);
                boolean zChanged = composer4.changed(function1) | composer4.changedInstance(goldSweepConfig);
                Object objRememberedValue = composer4.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeExtraAgreementsComposableKt$GoldUpgradeExtraAgreementsComposable$1$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LegacyGoldUpgradeExtraAgreementsComposable3.invoke$lambda$13$lambda$5$lambda$2$lambda$1(function1, goldSweepConfig);
                        }
                    };
                    composer4.updateRememberedValue(objRememberedValue);
                }
                composer4.endReplaceGroup();
                Spanned spannedRememberDescription = LegacyGoldUpgradeAgreementsComposable.rememberDescription(spannedRememberMarkdown, sweepDescriptionCta, (Function0) objRememberedValue, composer4, 0);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme3.getSpacing(composer4, i5).m21593getSmallD9Ej5fM()), composer4, 0);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                boolean zGoldUpgradeExtraAgreementsComposable$lambda$11$lambda$3 = LegacyGoldUpgradeExtraAgreementsComposable.GoldUpgradeExtraAgreementsComposable$lambda$11$lambda$3(snapshotState);
                Role roleM7472boximpl = Role.m7472boximpl(Role.INSTANCE.m7481getCheckboxo7Vup1c());
                composer4.startReplaceGroup(5004770);
                boolean zChanged2 = composer4.changed(snapshotState);
                Object objRememberedValue2 = composer4.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeExtraAgreementsComposableKt$GoldUpgradeExtraAgreementsComposable$1$2$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LegacyGoldUpgradeExtraAgreementsComposable3.invoke$lambda$13$lambda$5$lambda$4$lambda$3(snapshotState, ((Boolean) obj).booleanValue());
                        }
                    };
                    composer4.updateRememberedValue(objRememberedValue2);
                }
                composer4.endReplaceGroup();
                bentoTheme = bentoTheme3;
                i2 = i5;
                BentoBaseRowLayout.BentoBaseRowLayout(Toggleable2.m5320toggleableXHw0xAI$default(modifierFillMaxWidth$default, zGoldUpgradeExtraAgreementsComposable$lambda$11$lambda$3, false, roleM7472boximpl, (Function1) objRememberedValue2, 2, null), null, null, ComposableLambda3.rememberComposableLambda(1984589428, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeExtraAgreementsComposableKt$GoldUpgradeExtraAgreementsComposable$1$2$1$2$2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                        invoke(composer5, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer5, int i6) {
                        if ((i6 & 3) == 2 && composer5.getSkipping()) {
                            composer5.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1984589428, i6, -1, "com.robinhood.android.gold.upgrade.legacy.GoldUpgradeExtraAgreementsComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LegacyGoldUpgradeExtraAgreementsComposable.kt:123)");
                        }
                        BentoText2.m20747BentoText38GnDrw(goldSweepConfig.getSweepTitle(), null, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, null, composer5, 24576, 0, 16366);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer4, 54), null, null, ComposableLambda3.rememberComposableLambda(1438592721, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeExtraAgreementsComposableKt$GoldUpgradeExtraAgreementsComposable$1$2$1$2$3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                        invoke(composer5, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer5, int i6) {
                        if ((i6 & 3) == 2 && composer5.getSkipping()) {
                            composer5.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1438592721, i6, -1, "com.robinhood.android.gold.upgrade.legacy.GoldUpgradeExtraAgreementsComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LegacyGoldUpgradeExtraAgreementsComposable.kt:129)");
                        }
                        BentoCheckbox2.m20599BentoCheckboxSj8uqqQ(null, LegacyGoldUpgradeExtraAgreementsComposable.GoldUpgradeExtraAgreementsComposable$lambda$11$lambda$3(snapshotState), false, null, null, composer5, 24576, 13);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer4, 54), false, false, false, null, composer, 14158848, 0, 1846);
                str = null;
                f = 0.0f;
                composer4 = composer;
                i3 = 6;
                BentoSpannedText.m21106BentoSpannedTextTHkziT8(spannedRememberDescription, com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0.0f, composer, 6, 1), null, null, C20690R.attr.textAppearanceRegularSmall, null, 0, 0, null, composer4, 0, 492);
                Unit unit = Unit.INSTANCE;
            }
            composer4.endReplaceGroup();
            ApiGoldUpgradeFlow.ApiGoldExtraAgreements.ApiGoldSlipConfig goldSlipConfig = apiGoldExtraAgreements.getGoldSlipConfig();
            if (goldSlipConfig == null) {
                composer3 = composer4;
            } else {
                Spanned spannedRememberMarkdown2 = Markdown3.rememberMarkdown(goldSlipConfig.getSlipDescriptionMarkdown() + PlaceholderUtils.XXShortPlaceholderText + goldSlipConfig.getSlipDescriptionCtaMarkdown(), composer4, 0);
                composer4.startReplaceGroup(1849434622);
                Object objRememberedValue3 = composer4.rememberedValue();
                Composer.Companion companion6 = Composer.INSTANCE;
                if (objRememberedValue3 == companion6.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeExtraAgreementsComposableKt$GoldUpgradeExtraAgreementsComposable$1$2$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composer4.updateRememberedValue(objRememberedValue3);
                }
                composer4.endReplaceGroup();
                Spanned spannedRememberDescription2 = LegacyGoldUpgradeAgreementsComposable.rememberDescription(spannedRememberMarkdown2, str, (Function0) objRememberedValue3, composer4, 432);
                BentoTheme bentoTheme4 = bentoTheme;
                int i6 = i2;
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme4.getSpacing(composer4, i6).m21592getMediumD9Ej5fM()), composer4, 0);
                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ2 = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion2, f, composer4, i3, 1);
                MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composer4, 0);
                int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer4, modifierM21623defaultHorizontalPaddingrAjV9yQ2);
                Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                if (composer4.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer4.startReusableNode();
                if (composer4.getInserting()) {
                    composer4.createNode(constructor3);
                } else {
                    composer4.useNode();
                }
                Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer4);
                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy3, companion4.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
                if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion4.getSetModifier());
                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(SizeKt.fillMaxWidth$default(companion2, f, 1, str), bentoTheme4.getColors(composer4, i6).m21373getBg30d7_KjU(), 0.0f, composer4, 6, 4);
                String moreFeaturesTitle = apiGoldExtraAgreements.getMoreFeaturesTitle();
                composer4.startReplaceGroup(601702585);
                if (moreFeaturesTitle == null) {
                    companion = companion2;
                    apiGoldSlipConfig = goldSlipConfig;
                    composer2 = composer4;
                    bentoTheme2 = bentoTheme4;
                    i4 = i6;
                } else {
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme4.getSpacing(composer4, i6).m21592getMediumD9Ej5fM()), composer4, 0);
                    composer2 = composer;
                    companion = companion2;
                    apiGoldSlipConfig = goldSlipConfig;
                    i4 = i6;
                    bentoTheme2 = bentoTheme4;
                    BentoText2.m20747BentoText38GnDrw(moreFeaturesTitle, null, null, null, companion5.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme4.getTypography(composer4, i6).getTextL(), composer2, 24576, 0, 8174);
                    Unit unit2 = Unit.INSTANCE;
                }
                composer2.endReplaceGroup();
                composer2.endNode();
                int i7 = i4;
                Modifier.Companion companion7 = companion;
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion7, bentoTheme2.getSpacing(composer2, i7).m21593getSmallD9Ej5fM()), composer2, 0);
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion7, 0.0f, 1, null);
                boolean zGoldUpgradeExtraAgreementsComposable$lambda$11$lambda$7 = LegacyGoldUpgradeExtraAgreementsComposable.GoldUpgradeExtraAgreementsComposable$lambda$11$lambda$7(snapshotState2);
                Role roleM7472boximpl2 = Role.m7472boximpl(Role.INSTANCE.m7481getCheckboxo7Vup1c());
                composer2.startReplaceGroup(5004770);
                boolean zChanged3 = composer2.changed(snapshotState2);
                Object objRememberedValue4 = composer2.rememberedValue();
                if (zChanged3 || objRememberedValue4 == companion6.getEmpty()) {
                    objRememberedValue4 = new Function1() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeExtraAgreementsComposableKt$GoldUpgradeExtraAgreementsComposable$1$2$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LegacyGoldUpgradeExtraAgreementsComposable3.invoke$lambda$13$lambda$12$lambda$11$lambda$10(snapshotState2, ((Boolean) obj).booleanValue());
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue4);
                }
                composer2.endReplaceGroup();
                final ApiGoldUpgradeFlow.ApiGoldExtraAgreements.ApiGoldSlipConfig apiGoldSlipConfig2 = apiGoldSlipConfig;
                BentoBaseRowLayout.BentoBaseRowLayout(Toggleable2.m5320toggleableXHw0xAI$default(modifierFillMaxWidth$default2, zGoldUpgradeExtraAgreementsComposable$lambda$11$lambda$7, false, roleM7472boximpl2, (Function1) objRememberedValue4, 2, null), null, null, ComposableLambda3.rememberComposableLambda(-115474569, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeExtraAgreementsComposableKt$GoldUpgradeExtraAgreementsComposable$1$2$1$3$3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                        invoke(composer5, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer5, int i8) {
                        if ((i8 & 3) == 2 && composer5.getSkipping()) {
                            composer5.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-115474569, i8, -1, "com.robinhood.android.gold.upgrade.legacy.GoldUpgradeExtraAgreementsComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LegacyGoldUpgradeExtraAgreementsComposable.kt:185)");
                        }
                        BentoText2.m20747BentoText38GnDrw(apiGoldSlipConfig2.getSlipTitle(), null, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, null, composer5, 24576, 0, 16366);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer2, 54), null, null, ComposableLambda3.rememberComposableLambda(138496698, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeExtraAgreementsComposableKt$GoldUpgradeExtraAgreementsComposable$1$2$1$3$4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                        invoke(composer5, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer5, int i8) {
                        if ((i8 & 3) == 2 && composer5.getSkipping()) {
                            composer5.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(138496698, i8, -1, "com.robinhood.android.gold.upgrade.legacy.GoldUpgradeExtraAgreementsComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LegacyGoldUpgradeExtraAgreementsComposable.kt:191)");
                        }
                        BentoCheckbox2.m20599BentoCheckboxSj8uqqQ(null, LegacyGoldUpgradeExtraAgreementsComposable.GoldUpgradeExtraAgreementsComposable$lambda$11$lambda$7(snapshotState2), false, null, null, composer5, 24576, 13);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer2, 54), false, false, false, null, composer, 14158848, 0, 1846);
                composer3 = composer;
                BentoSpannedText.m21106BentoSpannedTextTHkziT8(spannedRememberDescription2, com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(companion7, 0.0f, 1, null), 0.0f, composer3, 6, 1), null, null, C20690R.attr.textAppearanceRegularSmall, null, 0, 0, null, composer3, 0, 492);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion7, bentoTheme2.getSpacing(composer3, i7).m21592getMediumD9Ej5fM()), composer3, 0);
                Unit unit3 = Unit.INSTANCE;
            }
        }
        composer3.endReplaceGroup();
        composer3.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$13$lambda$5$lambda$2$lambda$1(Function1 function1, ApiGoldUpgradeFlow.ApiGoldExtraAgreements.ApiGoldSweepConfig apiGoldSweepConfig) {
        function1.invoke(apiGoldSweepConfig.getSweepFullAgreement());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$13$lambda$5$lambda$4$lambda$3(SnapshotState snapshotState, boolean z) {
        LegacyGoldUpgradeExtraAgreementsComposable.GoldUpgradeExtraAgreementsComposable$lambda$11$lambda$4(snapshotState, z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$13$lambda$12$lambda$11$lambda$10(SnapshotState snapshotState, boolean z) {
        LegacyGoldUpgradeExtraAgreementsComposable.GoldUpgradeExtraAgreementsComposable$lambda$11$lambda$8(snapshotState, z);
        return Unit.INSTANCE;
    }
}
