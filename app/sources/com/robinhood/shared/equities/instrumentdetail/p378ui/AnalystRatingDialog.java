package com.robinhood.shared.equities.instrumentdetail.p378ui;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.CardColors;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.window.AndroidDialog_androidKt;
import androidx.compose.p011ui.window.DialogProperties;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.shared.equities.instrumentdetail.p378ui.AnalystRatingsComposableState;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AnalystRatingDialog.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007¢\u0006\u0002\u0010\b\u001a\r\u0010\t\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m3636d2 = {"AnalystRatingDialog", "", "analystRating", "Lcom/robinhood/shared/equities/instrumentdetail/ui/AnalystRatingsComposableState$AnalystRating;", "closeButtonText", "Lcom/robinhood/utils/resource/StringResource;", "onCloseClick", "Lkotlin/Function0;", "(Lcom/robinhood/shared/equities/instrumentdetail/ui/AnalystRatingsComposableState$AnalystRating;Lcom/robinhood/utils/resource/StringResource;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "AnalystRatingDialogPreview", "(Landroidx/compose/runtime/Composer;I)V", "lib-instrument-detail-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.equities.instrumentdetail.ui.AnalystRatingDialogKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class AnalystRatingDialog {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AnalystRatingDialog$lambda$0(AnalystRatingsComposableState.AnalystRating analystRating, StringResource stringResource, Function0 function0, int i, Composer composer, int i2) {
        AnalystRatingDialog(analystRating, stringResource, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AnalystRatingDialogPreview$lambda$1(int i, Composer composer, int i2) {
        AnalystRatingDialogPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void AnalystRatingDialog(final AnalystRatingsComposableState.AnalystRating analystRating, final StringResource closeButtonText, final Function0<Unit> onCloseClick, Composer composer, final int i) {
        int i2;
        final Function0<Unit> function0;
        Intrinsics.checkNotNullParameter(analystRating, "analystRating");
        Intrinsics.checkNotNullParameter(closeButtonText, "closeButtonText");
        Intrinsics.checkNotNullParameter(onCloseClick, "onCloseClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-298513701);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(analystRating) : composerStartRestartGroup.changedInstance(analystRating) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(closeButtonText) : composerStartRestartGroup.changedInstance(closeButtonText) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onCloseClick) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-298513701, i2, -1, "com.robinhood.shared.equities.instrumentdetail.ui.AnalystRatingDialog (AnalystRatingDialog.kt:37)");
            }
            function0 = onCloseClick;
            AndroidDialog_androidKt.Dialog(function0, new DialogProperties(false, false, false, 3, (DefaultConstructorMarker) null), ComposableLambda3.rememberComposableLambda(-599520142, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.equities.instrumentdetail.ui.AnalystRatingDialogKt.AnalystRatingDialog.1
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
                        ComposerKt.traceEventStart(-599520142, i3, -1, "com.robinhood.shared.equities.instrumentdetail.ui.AnalystRatingDialog.<anonymous> (AnalystRatingDialog.kt:42)");
                    }
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i4 = BentoTheme.$stable;
                    Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(modifierFillMaxWidth$default, bentoTheme.getSpacing(composer2, i4).m21592getMediumD9Ej5fM());
                    CardColors cardColorsM5729cardColorsro_MJ88 = CardDefaults.INSTANCE.m5729cardColorsro_MJ88(bentoTheme.getColors(composer2, i4).m21372getBg20d7_KjU(), 0L, 0L, 0L, composer2, CardDefaults.$stable << 12, 14);
                    RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_4 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme.getSpacing(composer2, i4).m21593getSmallD9Ej5fM());
                    final AnalystRatingsComposableState.AnalystRating analystRating2 = analystRating;
                    final StringResource stringResource = closeButtonText;
                    final Function0<Unit> function02 = onCloseClick;
                    CardKt.Card(modifierM5142padding3ABfNKs, roundedCornerShapeM5327RoundedCornerShape0680j_4, cardColorsM5729cardColorsro_MJ88, null, null, ComposableLambda3.rememberComposableLambda(-1883603228, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.robinhood.shared.equities.instrumentdetail.ui.AnalystRatingDialogKt.AnalystRatingDialog.1.1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer3, Integer num) {
                            invoke(column5, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Column5 Card, Composer composer3, int i5) {
                            Modifier.Companion companion;
                            int i6;
                            int i7;
                            Intrinsics.checkNotNullParameter(Card, "$this$Card");
                            if ((i5 & 17) == 16 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1883603228, i5, -1, "com.robinhood.shared.equities.instrumentdetail.ui.AnalystRatingDialog.<anonymous>.<anonymous> (AnalystRatingDialog.kt:51)");
                            }
                            AnalystRatingsComposableState.AnalystRating analystRating3 = analystRating2;
                            StringResource stringResource2 = stringResource;
                            Function0<Unit> function03 = function02;
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            Arrangement arrangement = Arrangement.INSTANCE;
                            Arrangement.Vertical top = arrangement.getTop();
                            Alignment.Companion companion3 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion3.getStart(), composer3, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, companion2);
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
                            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                            int i8 = BentoTheme.$stable;
                            Modifier modifierM21622defaultHorizontalPaddingWMci_g0 = com.robinhood.compose.bento.util.PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion2, bentoTheme2.getSpacing(composer3, i8).m21590getDefaultD9Ej5fM(), 0.0f, composer3, 6, 2);
                            long jM21425getFg0d7_KjU = bentoTheme2.getColors(composer3, i8).m21425getFg0d7_KjU();
                            TextStyle textL = bentoTheme2.getTypography(composer3, i8).getTextL();
                            StringResource title = analystRating3.getTitle();
                            int i9 = StringResource.$stable;
                            BentoText2.m20747BentoText38GnDrw(StringResource2.getString(title, composer3, i9), modifierM21622defaultHorizontalPaddingWMci_g0, Color.m6701boximpl(jM21425getFg0d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, textL, composer3, 0, 0, 8184);
                            BentoText2.m20747BentoText38GnDrw(StringResource2.getString(analystRating3.getSource(), composer3, i9), column6.align(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion2, bentoTheme2.getSpacing(composer3, i8).m21593getSmallD9Ej5fM(), composer3, 6, 0), companion3.getEnd()), Color.m6701boximpl(bentoTheme2.getColors(composer3, i8).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, null, composer3, 0, 0, 16376);
                            Modifier modifierWeight = column6.weight(ScrollKt.verticalScroll$default(companion2, ScrollKt.rememberScrollState(0, composer3, 0, 1), false, null, false, 14, null), 1.0f, false);
                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composer3, 0);
                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierWeight);
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
                            Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs = com.robinhood.compose.bento.util.PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion2, bentoTheme2.getSpacing(composer3, i8).m21593getSmallD9Ej5fM());
                            long jM21425getFg0d7_KjU2 = bentoTheme2.getColors(composer3, i8).m21425getFg0d7_KjU();
                            BentoText2.m20747BentoText38GnDrw(StringResource2.getString(analystRating3.getText(), composer3, i9), modifierM21618defaultFillMaxWidthPadding3ABfNKs, Color.m6701boximpl(jM21425getFg0d7_KjU2), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer3, i8).getTextM(), composer3, 0, 0, 8184);
                            composer3.startReplaceGroup(-1243600818);
                            if (analystRating3.getPublishedDateText() != null) {
                                i6 = i8;
                                companion = companion2;
                                i7 = i9;
                                BentoText2.m20747BentoText38GnDrw(StringResource2.getString(analystRating3.getPublishedDateText(), composer3, i9), com.robinhood.compose.bento.util.PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion2, bentoTheme2.getSpacing(composer3, i8).m21593getSmallD9Ej5fM()), Color.m6701boximpl(bentoTheme2.getColors(composer3, i8).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, null, composer3, 0, 0, 16376);
                            } else {
                                companion = companion2;
                                i6 = i8;
                                i7 = i9;
                            }
                            composer3.endReplaceGroup();
                            composer3.endNode();
                            int i10 = i6;
                            Modifier.Companion companion5 = companion;
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion5, bentoTheme2.getSpacing(composer3, i10).m21592getMediumD9Ej5fM()), composer3, 0);
                            Modifier modifierAlign = column6.align(companion5, companion3.getEnd());
                            long jM21456getPositive0d7_KjU = bentoTheme2.getColors(composer3, i10).m21456getPositive0d7_KjU();
                            BentoButtonKt.m20586BentoButtonEikTQX8(function03, StringResource2.getString(stringResource2, composer3, i7), modifierAlign, null, null, false, false, Color.m6701boximpl(Color.INSTANCE.m6725getTransparent0d7_KjU()), Color.m6701boximpl(jM21456getPositive0d7_KjU), null, null, false, null, composer3, 12582912, 0, 7800);
                            composer3.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 196608, 24);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i2 >> 6) & 14) | 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            function0 = onCloseClick;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.equities.instrumentdetail.ui.AnalystRatingDialogKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AnalystRatingDialog.AnalystRatingDialog$lambda$0(analystRating, closeButtonText, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void AnalystRatingDialogPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1778934583);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1778934583, i, -1, "com.robinhood.shared.equities.instrumentdetail.ui.AnalystRatingDialogPreview (AnalystRatingDialog.kt:104)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, AnalystRatingDialog2.INSTANCE.m25417getLambda$784323567$lib_instrument_detail_ui_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.equities.instrumentdetail.ui.AnalystRatingDialogKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AnalystRatingDialog.AnalystRatingDialogPreview$lambda$1(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
