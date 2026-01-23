package com.robinhood.android.advisory.tlh.strategy.review;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.PlatformSpanStyle;
import androidx.compose.p011ui.text.SpanStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.advisory.tlh.Components2;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.models.advisory.p304db.tlh.TaxLossHarvestStrategyReview;
import com.robinhood.models.advisory.p304db.tlh.TaxLossHarvestStrategyReviewRow;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HarvestStrategyReviewScreen.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a\r\u0010\t\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m3636d2 = {"HarvestStrategyReviewScreen", "", "reviewData", "Lcom/robinhood/models/advisory/db/tlh/TaxLossHarvestStrategyReview;", "onConfirmClicked", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/models/advisory/db/tlh/TaxLossHarvestStrategyReview;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "HarvestStrategyReviewScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "feature-tax-loss-harvesting_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.tlh.strategy.review.HarvestStrategyReviewScreenKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class HarvestStrategyReviewScreen4 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HarvestStrategyReviewScreen$lambda$0(TaxLossHarvestStrategyReview taxLossHarvestStrategyReview, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        HarvestStrategyReviewScreen(taxLossHarvestStrategyReview, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HarvestStrategyReviewScreenPreview$lambda$1(int i, Composer composer, int i2) {
        HarvestStrategyReviewScreenPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HarvestStrategyReviewScreen(final TaxLossHarvestStrategyReview reviewData, final Function0<Unit> onConfirmClicked, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(reviewData, "reviewData");
        Intrinsics.checkNotNullParameter(onConfirmClicked, "onConfirmClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-706132981);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(reviewData) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onConfirmClicked) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-706132981, i3, -1, "com.robinhood.android.advisory.tlh.strategy.review.HarvestStrategyReviewScreen (HarvestStrategyReviewScreen.kt:40)");
                }
                final ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(Screen.Name.TAX_LOSS_HARVEST_CUSTOMIZE_REVIEW, null, null, null, 14, null), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(-178202506, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.tlh.strategy.review.HarvestStrategyReviewScreenKt.HarvestStrategyReviewScreen.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i5) {
                        FontWeight.Companion companion;
                        AnnotatedString annotatedString;
                        Modifier.Companion companion2;
                        BentoTheme bentoTheme;
                        int i6;
                        Composer composer3 = composer2;
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-178202506, i5, -1, "com.robinhood.android.advisory.tlh.strategy.review.HarvestStrategyReviewScreen.<anonymous> (HarvestStrategyReviewScreen.kt:50)");
                        }
                        float f = 0.0f;
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(ModifiersKt.logScreenTransitions$default(modifier3, null, 1, null), 0.0f, 1, null);
                        Alignment.Companion companion3 = Alignment.INSTANCE;
                        Alignment.Horizontal centerHorizontally = companion3.getCenterHorizontally();
                        ScrollState scrollState = scrollStateRememberScrollState;
                        TaxLossHarvestStrategyReview taxLossHarvestStrategyReview = reviewData;
                        Function0<Unit> function0 = onConfirmClicked;
                        Arrangement arrangement = Arrangement.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer3, 48);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierFillMaxSize$default);
                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion4.getConstructor();
                        if (composer3.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        Modifier.Companion companion5 = Modifier.INSTANCE;
                        Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Column5.weight$default(column6, companion5, 1.0f, false, 2, null), scrollState, false, null, false, 14, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion3.getCenterHorizontally(), composer3, 48);
                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierVerticalScroll$default);
                        Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
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
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                        Components2.TaxLossHarvestingScreenHeader(taxLossHarvestStrategyReview.getTitle(), taxLossHarvestStrategyReview.getSubtitle(), PaddingKt.m5146paddingqDBjuR0$default(companion5, 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 7, null), false, composer3, 0, 8);
                        composer3.startReplaceGroup(219748695);
                        for (TaxLossHarvestStrategyReviewRow taxLossHarvestStrategyReviewRow : taxLossHarvestStrategyReview.getCalculationRows()) {
                            BentoBaseRowKt.m20916BentoBaseRowygcbOzY(null, null, taxLossHarvestStrategyReviewRow.getTitle(), taxLossHarvestStrategyReviewRow.getSubtitle(), null, new BentoBaseRowState.Meta.SingleLine(taxLossHarvestStrategyReviewRow.getAmount()), null, false, false, false, 0L, null, composer3, (BentoBaseRowState.Meta.SingleLine.$stable << 15) | 12582912, 0, 3923);
                            f = f;
                            taxLossHarvestStrategyReview = taxLossHarvestStrategyReview;
                            function0 = function0;
                        }
                        float f2 = f;
                        TaxLossHarvestStrategyReview taxLossHarvestStrategyReview2 = taxLossHarvestStrategyReview;
                        Function0<Unit> function02 = function0;
                        composer3.endReplaceGroup();
                        Modifier.Companion companion6 = Modifier.INSTANCE;
                        Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion6, f2, 1, null);
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i7 = BentoTheme.$stable;
                        BentoDivider.m20635BentoHorizontalDivideraMcp0Q(modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, bentoTheme2.getColors(composer3, i7).m21373getBg30d7_KjU(), 0.0f, composer3, 0, 4);
                        TaxLossHarvestStrategyReviewRow resultRow = taxLossHarvestStrategyReview2.getResultRow();
                        composer3.startReplaceGroup(219767604);
                        if (resultRow == null) {
                            companion2 = companion6;
                            bentoTheme = bentoTheme2;
                            i6 = i7;
                        } else {
                            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                            FontWeight.Companion companion7 = FontWeight.INSTANCE;
                            int iPushStyle = builder.pushStyle(new SpanStyle(0L, 0L, companion7.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65531, (DefaultConstructorMarker) null));
                            try {
                                builder.append(resultRow.getTitle());
                                Unit unit = Unit.INSTANCE;
                                builder.pop(iPushStyle);
                                AnnotatedString annotatedString2 = builder.toAnnotatedString();
                                String subtitle = resultRow.getSubtitle();
                                if (subtitle != null) {
                                    AnnotatedString annotatedString3 = new AnnotatedString(subtitle, null, 2, null);
                                    companion = companion7;
                                    annotatedString = annotatedString3;
                                } else {
                                    companion = companion7;
                                    annotatedString = null;
                                }
                                builder = new AnnotatedString.Builder(0, 1, null);
                                iPushStyle = builder.pushStyle(new SpanStyle(0L, 0L, companion.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65531, (DefaultConstructorMarker) null));
                                try {
                                    builder.append(resultRow.getAmount());
                                    builder.pop(iPushStyle);
                                    companion2 = companion6;
                                    bentoTheme = bentoTheme2;
                                    i6 = i7;
                                    BentoBaseRowKt.m20914BentoBaseRowbcLT7KE(null, null, annotatedString2, annotatedString, null, new BentoBaseRowState.Meta.SingleLine(builder.toAnnotatedString()), null, false, false, false, false, false, 0L, null, composer2, (BentoBaseRowState.Meta.SingleLine.$stable << 15) | 12582912, 0, 16211);
                                    composer3 = composer2;
                                } finally {
                                }
                            } finally {
                            }
                        }
                        composer3.endReplaceGroup();
                        composer3.endNode();
                        BentoTheme bentoTheme3 = bentoTheme;
                        int i8 = i6;
                        BentoMarkdownText2.BentoMarkdownText(taxLossHarvestStrategyReview2.getDisclosureMarkdown(), com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion2, f2, composer3, 6, 1), BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme3.getTypography(composer3, i8).getTextS(), TextAlign.INSTANCE.m7919getCentere0LSkKk(), bentoTheme3.getColors(composer3, i8).m21426getFg20d7_KjU(), bentoTheme3.getColors(composer3, i8).m21426getFg20d7_KjU(), false, composer3, BentoMarkdownText.$stable << 15, 16), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer2, MarkdownStyle.$stable << 6, 24);
                        BentoButtonKt.m20586BentoButtonEikTQX8(function02, taxLossHarvestStrategyReview2.getConfirmCtaTitle(), com.robinhood.compose.bento.util.PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion2, bentoTheme3.getSpacing(composer2, i8).m21590getDefaultD9Ej5fM()), null, null, false, false, null, null, null, null, false, null, composer2, 0, 0, 8184);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Modifier modifier4 = modifier3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.tlh.strategy.review.HarvestStrategyReviewScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return HarvestStrategyReviewScreen4.HarvestStrategyReviewScreen$lambda$0(reviewData, onConfirmClicked, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            final ScrollState scrollStateRememberScrollState2 = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(Screen.Name.TAX_LOSS_HARVEST_CUSTOMIZE_REVIEW, null, null, null, 14, null), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(-178202506, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.tlh.strategy.review.HarvestStrategyReviewScreenKt.HarvestStrategyReviewScreen.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    FontWeight.Companion companion;
                    AnnotatedString annotatedString;
                    Modifier.Companion companion2;
                    BentoTheme bentoTheme;
                    int i6;
                    Composer composer3 = composer2;
                    if ((i5 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-178202506, i5, -1, "com.robinhood.android.advisory.tlh.strategy.review.HarvestStrategyReviewScreen.<anonymous> (HarvestStrategyReviewScreen.kt:50)");
                    }
                    float f = 0.0f;
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(ModifiersKt.logScreenTransitions$default(modifier3, null, 1, null), 0.0f, 1, null);
                    Alignment.Companion companion3 = Alignment.INSTANCE;
                    Alignment.Horizontal centerHorizontally = companion3.getCenterHorizontally();
                    ScrollState scrollState = scrollStateRememberScrollState2;
                    TaxLossHarvestStrategyReview taxLossHarvestStrategyReview = reviewData;
                    Function0<Unit> function0 = onConfirmClicked;
                    Arrangement arrangement = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer3, 48);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierFillMaxSize$default);
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion4.getConstructor();
                    if (composer3.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    Modifier.Companion companion5 = Modifier.INSTANCE;
                    Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Column5.weight$default(column6, companion5, 1.0f, false, 2, null), scrollState, false, null, false, 14, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion3.getCenterHorizontally(), composer3, 48);
                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierVerticalScroll$default);
                    Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                    Components2.TaxLossHarvestingScreenHeader(taxLossHarvestStrategyReview.getTitle(), taxLossHarvestStrategyReview.getSubtitle(), PaddingKt.m5146paddingqDBjuR0$default(companion5, 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 7, null), false, composer3, 0, 8);
                    composer3.startReplaceGroup(219748695);
                    for (TaxLossHarvestStrategyReviewRow taxLossHarvestStrategyReviewRow : taxLossHarvestStrategyReview.getCalculationRows()) {
                        BentoBaseRowKt.m20916BentoBaseRowygcbOzY(null, null, taxLossHarvestStrategyReviewRow.getTitle(), taxLossHarvestStrategyReviewRow.getSubtitle(), null, new BentoBaseRowState.Meta.SingleLine(taxLossHarvestStrategyReviewRow.getAmount()), null, false, false, false, 0L, null, composer3, (BentoBaseRowState.Meta.SingleLine.$stable << 15) | 12582912, 0, 3923);
                        f = f;
                        taxLossHarvestStrategyReview = taxLossHarvestStrategyReview;
                        function0 = function0;
                    }
                    float f2 = f;
                    TaxLossHarvestStrategyReview taxLossHarvestStrategyReview2 = taxLossHarvestStrategyReview;
                    Function0<Unit> function02 = function0;
                    composer3.endReplaceGroup();
                    Modifier.Companion companion6 = Modifier.INSTANCE;
                    Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion6, f2, 1, null);
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i7 = BentoTheme.$stable;
                    BentoDivider.m20635BentoHorizontalDivideraMcp0Q(modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, bentoTheme2.getColors(composer3, i7).m21373getBg30d7_KjU(), 0.0f, composer3, 0, 4);
                    TaxLossHarvestStrategyReviewRow resultRow = taxLossHarvestStrategyReview2.getResultRow();
                    composer3.startReplaceGroup(219767604);
                    if (resultRow == null) {
                        companion2 = companion6;
                        bentoTheme = bentoTheme2;
                        i6 = i7;
                    } else {
                        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                        FontWeight.Companion companion7 = FontWeight.INSTANCE;
                        int iPushStyle = builder.pushStyle(new SpanStyle(0L, 0L, companion7.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65531, (DefaultConstructorMarker) null));
                        try {
                            builder.append(resultRow.getTitle());
                            Unit unit = Unit.INSTANCE;
                            builder.pop(iPushStyle);
                            AnnotatedString annotatedString2 = builder.toAnnotatedString();
                            String subtitle = resultRow.getSubtitle();
                            if (subtitle != null) {
                                AnnotatedString annotatedString3 = new AnnotatedString(subtitle, null, 2, null);
                                companion = companion7;
                                annotatedString = annotatedString3;
                            } else {
                                companion = companion7;
                                annotatedString = null;
                            }
                            builder = new AnnotatedString.Builder(0, 1, null);
                            iPushStyle = builder.pushStyle(new SpanStyle(0L, 0L, companion.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65531, (DefaultConstructorMarker) null));
                            try {
                                builder.append(resultRow.getAmount());
                                builder.pop(iPushStyle);
                                companion2 = companion6;
                                bentoTheme = bentoTheme2;
                                i6 = i7;
                                BentoBaseRowKt.m20914BentoBaseRowbcLT7KE(null, null, annotatedString2, annotatedString, null, new BentoBaseRowState.Meta.SingleLine(builder.toAnnotatedString()), null, false, false, false, false, false, 0L, null, composer2, (BentoBaseRowState.Meta.SingleLine.$stable << 15) | 12582912, 0, 16211);
                                composer3 = composer2;
                            } finally {
                            }
                        } finally {
                        }
                    }
                    composer3.endReplaceGroup();
                    composer3.endNode();
                    BentoTheme bentoTheme3 = bentoTheme;
                    int i8 = i6;
                    BentoMarkdownText2.BentoMarkdownText(taxLossHarvestStrategyReview2.getDisclosureMarkdown(), com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion2, f2, composer3, 6, 1), BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme3.getTypography(composer3, i8).getTextS(), TextAlign.INSTANCE.m7919getCentere0LSkKk(), bentoTheme3.getColors(composer3, i8).m21426getFg20d7_KjU(), bentoTheme3.getColors(composer3, i8).m21426getFg20d7_KjU(), false, composer3, BentoMarkdownText.$stable << 15, 16), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer2, MarkdownStyle.$stable << 6, 24);
                    BentoButtonKt.m20586BentoButtonEikTQX8(function02, taxLossHarvestStrategyReview2.getConfirmCtaTitle(), com.robinhood.compose.bento.util.PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion2, bentoTheme3.getSpacing(composer2, i8).m21590getDefaultD9Ej5fM()), null, null, false, false, null, null, null, null, false, null, composer2, 0, 0, 8184);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void HarvestStrategyReviewScreenPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1912389086);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1912389086, i, -1, "com.robinhood.android.advisory.tlh.strategy.review.HarvestStrategyReviewScreenPreview (HarvestStrategyReviewScreen.kt:118)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, Boolean.TRUE, null, null, HarvestStrategyReviewScreen.INSTANCE.getLambda$303180762$feature_tax_loss_harvesting_externalDebug(), composerStartRestartGroup, 100859904, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.tlh.strategy.review.HarvestStrategyReviewScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HarvestStrategyReviewScreen4.HarvestStrategyReviewScreenPreview$lambda$1(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
