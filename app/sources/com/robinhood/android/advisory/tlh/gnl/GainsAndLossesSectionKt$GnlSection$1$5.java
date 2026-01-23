package com.robinhood.android.advisory.tlh.gnl;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.advisory.p304db.tlh.TaxGainsAndLossesResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: GainsAndLossesSection.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
final class GainsAndLossesSectionKt$GnlSection$1$5 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
    final /* synthetic */ SnapshotState<Boolean> $expanded$delegate;
    final /* synthetic */ TaxGainsAndLossesResponse.Section $section;

    GainsAndLossesSectionKt$GnlSection$1$5(TaxGainsAndLossesResponse.Section section, SnapshotState<Boolean> snapshotState) {
        this.$section = section;
        this.$expanded$delegate = snapshotState;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
        invoke(animatedVisibilityScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
        Composer composer2 = composer;
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1265557961, i, -1, "com.robinhood.android.advisory.tlh.gnl.GnlSection.<anonymous>.<anonymous> (GainsAndLossesSection.kt:96)");
        }
        TaxGainsAndLossesResponse.Section section = this.$section;
        final SnapshotState<Boolean> snapshotState = this.$expanded$delegate;
        Modifier.Companion companion = Modifier.INSTANCE;
        boolean z = false;
        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, companion);
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
        if (composer2.getApplier() == null) {
            Composables.invalidApplier();
        }
        composer2.startReusableNode();
        if (composer2.getInserting()) {
            composer2.createNode(constructor);
        } else {
            composer2.useNode();
        }
        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
        Column6 column6 = Column6.INSTANCE;
        composer2.startReplaceGroup(-796228126);
        int i2 = 0;
        for (Object obj : section.getRows()) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            final TaxGainsAndLossesResponse.Row row = (TaxGainsAndLossesResponse.Row) obj;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            composer2.startReplaceGroup(5004770);
            Object objRememberedValue = composer2.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.tlh.gnl.GainsAndLossesSectionKt$GnlSection$1$5$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GainsAndLossesSectionKt$GnlSection$1$5.invoke$lambda$3$lambda$2$lambda$1$lambda$0(snapshotState);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceGroup();
            BentoBaseRowLayout.BentoBaseRowLayout(ClickableKt.m4893clickableXHw0xAI$default(companion3, false, null, null, (Function0) objRememberedValue, 7, null), null, null, ComposableLambda3.rememberComposableLambda(-1159231171, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.tlh.gnl.GainsAndLossesSectionKt$GnlSection$1$5$1$1$2
                public final void invoke(Composer composer3, int i4) {
                    if ((i4 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1159231171, i4, -1, "com.robinhood.android.advisory.tlh.gnl.GnlSection.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GainsAndLossesSection.kt:103)");
                    }
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i5 = BentoTheme.$stable;
                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion4, bentoTheme.getSpacing(composer3, i5).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
                    TaxGainsAndLossesResponse.Row row2 = row;
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierM5146paddingqDBjuR0$default);
                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                    if (composer3.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor2);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion5.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion5.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    BentoText2.m20747BentoText38GnDrw(row2.getTitle(), null, Color.m6701boximpl(bentoTheme.getColors(composer3, i5).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, null, composer3, 0, 0, 16378);
                    String subtitle = row2.getSubtitle();
                    composer3.startReplaceGroup(263160412);
                    if (subtitle != null) {
                        BentoText2.m20747BentoText38GnDrw(subtitle, null, Color.m6701boximpl(bentoTheme.getColors(composer3, i5).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i5).getTextS(), composer3, 0, 0, 8186);
                    }
                    composer3.endReplaceGroup();
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composer2, 54), null, ComposableLambda3.rememberComposableLambda(2100700539, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.tlh.gnl.GainsAndLossesSectionKt$GnlSection$1$5$1$1$3
                public final void invoke(Composer composer3, int i4) {
                    if ((i4 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2100700539, i4, -1, "com.robinhood.android.advisory.tlh.gnl.GnlSection.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GainsAndLossesSection.kt:122)");
                    }
                    Alignment.Horizontal end = Alignment.INSTANCE.getEnd();
                    TaxGainsAndLossesResponse.Row row2 = row;
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), end, composer3, 48);
                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, companion4);
                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                    if (composer3.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor2);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion5.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion5.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    String amount = row2.getAmount();
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i5 = BentoTheme.$stable;
                    Color colorM6701boximpl = Color.m6701boximpl(bentoTheme.getColors(composer3, i5).m21426getFg20d7_KjU());
                    TextAlign.Companion companion6 = TextAlign.INSTANCE;
                    BentoText2.m20747BentoText38GnDrw(amount, null, colorM6701boximpl, null, null, null, TextAlign.m7912boximpl(companion6.m7920getEnde0LSkKk()), 0, false, 0, 0, null, 0, null, composer3, 0, 0, 16314);
                    String subtitleAmount = row2.getSubtitleAmount();
                    composer3.startReplaceGroup(2026377245);
                    if (subtitleAmount != null) {
                        long jM21426getFg20d7_KjU = bentoTheme.getColors(composer3, i5).m21426getFg20d7_KjU();
                        BentoText2.m20747BentoText38GnDrw(subtitleAmount, null, Color.m6701boximpl(jM21426getFg20d7_KjU), null, null, null, TextAlign.m7912boximpl(companion6.m7920getEnde0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i5).getTextS(), composer3, 0, 0, 8122);
                    }
                    composer3.endReplaceGroup();
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composer2, 54), null, i2 == section.getRows().size() - 1 ? true : z, false, false, null, composer2, 199680, 0, 1878);
            composer2 = composer;
            i2 = i3;
            section = section;
            z = z;
            snapshotState = snapshotState;
        }
        composer.endReplaceGroup();
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2$lambda$1$lambda$0(SnapshotState snapshotState) {
        GainsAndLossesSectionKt.GnlSection$lambda$2(snapshotState, !GainsAndLossesSectionKt.GnlSection$lambda$1(snapshotState));
        return Unit.INSTANCE;
    }
}
