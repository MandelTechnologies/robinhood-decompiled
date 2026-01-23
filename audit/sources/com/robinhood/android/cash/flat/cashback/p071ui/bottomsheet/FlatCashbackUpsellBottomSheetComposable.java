package com.robinhood.android.cash.flat.cashback.p071ui.bottomsheet;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.PrimitiveResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.cash.flat.cashback.C10067R;
import com.robinhood.android.common.C11048R;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.PaddingKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FlatCashbackUpsellBottomSheetComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aM\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"FlatCashbackUpsellBottomSheetComposable", "", "onPrimaryButtonClick", "Lkotlin/Function0;", "onSecondaryButtonClick", "onSeeOfferDetailsClick", "onDismiss", "viewState", "Lcom/robinhood/android/cash/flat/cashback/ui/bottomsheet/FlatCashbackUpsellBottomSheetViewState;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/robinhood/android/cash/flat/cashback/ui/bottomsheet/FlatCashbackUpsellBottomSheetViewState;Landroidx/compose/runtime/Composer;I)V", "feature-cash-flat-cashback_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cash.flat.cashback.ui.bottomsheet.FlatCashbackUpsellBottomSheetComposableKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class FlatCashbackUpsellBottomSheetComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FlatCashbackUpsellBottomSheetComposable$lambda$0(Function0 function0, Function0 function02, Function0 function03, Function0 function04, FlatCashbackUpsellBottomSheetViewState flatCashbackUpsellBottomSheetViewState, int i, Composer composer, int i2) {
        FlatCashbackUpsellBottomSheetComposable(function0, function02, function03, function04, flatCashbackUpsellBottomSheetViewState, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void FlatCashbackUpsellBottomSheetComposable(final Function0<Unit> onPrimaryButtonClick, final Function0<Unit> onSecondaryButtonClick, final Function0<Unit> onSeeOfferDetailsClick, final Function0<Unit> onDismiss, final FlatCashbackUpsellBottomSheetViewState viewState, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(onPrimaryButtonClick, "onPrimaryButtonClick");
        Intrinsics.checkNotNullParameter(onSecondaryButtonClick, "onSecondaryButtonClick");
        Intrinsics.checkNotNullParameter(onSeeOfferDetailsClick, "onSeeOfferDetailsClick");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Composer composerStartRestartGroup = composer.startRestartGroup(-46142376);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(onPrimaryButtonClick) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onSecondaryButtonClick) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onSeeOfferDetailsClick) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onDismiss) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(viewState) ? 16384 : 8192;
        }
        if ((i2 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-46142376, i2, -1, "com.robinhood.android.cash.flat.cashback.ui.bottomsheet.FlatCashbackUpsellBottomSheetComposable (FlatCashbackUpsellBottomSheetComposable.kt:31)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(160044387, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.cash.flat.cashback.ui.bottomsheet.FlatCashbackUpsellBottomSheetComposableKt.FlatCashbackUpsellBottomSheetComposable.1
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
                        ComposerKt.traceEventStart(160044387, i3, -1, "com.robinhood.android.cash.flat.cashback.ui.bottomsheet.FlatCashbackUpsellBottomSheetComposable.<anonymous> (FlatCashbackUpsellBottomSheetComposable.kt:32)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i4 = BentoTheme.$stable;
                    Modifier modifierM21622defaultHorizontalPaddingWMci_g0 = PaddingKt.m21622defaultHorizontalPaddingWMci_g0(modifierFillMaxWidth$default, bentoTheme.getSpacing(composer2, i4).m21592getMediumD9Ej5fM(), 0.0f, composer2, 6, 2);
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = Arrangement.INSTANCE.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer2, i4).m21593getSmallD9Ej5fM());
                    FlatCashbackUpsellBottomSheetViewState flatCashbackUpsellBottomSheetViewState = viewState;
                    Function0<Unit> function0 = onSeeOfferDetailsClick;
                    Function0<Unit> function02 = onPrimaryButtonClick;
                    Function0<Unit> function03 = onSecondaryButtonClick;
                    Function0<Unit> function04 = onDismiss;
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, companion2.getStart(), composer2, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM21622defaultHorizontalPaddingWMci_g0);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    ImageKt.Image(PainterResources_androidKt.painterResource(C10067R.drawable.svg_flat_cashback_upsell, composer2, 0), (String) null, androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(SizeKt.m5174width3ABfNKs(column6.align(companion, companion2.getCenterHorizontally()), PrimitiveResources_androidKt.dimensionResource(C10067R.dimen.half_sheet_image_width, composer2, 0)), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer2, i4).m21594getXlargeD9Ej5fM(), 7, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 48, 120);
                    BentoText2.m20747BentoText38GnDrw(flatCashbackUpsellBottomSheetViewState.getTitle(), null, null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i4).getDisplayCapsuleMedium(), composer2, 0, 0, 8126);
                    BentoTextButton2.m20715BentoTextButtonPIknLig(function0, StringResources_androidKt.stringResource(C10067R.string.flat_cash_back_view_offer_details, composer2, 0), androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(column6.align(companion, companion2.getCenterHorizontally()), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer2, i4).m21591getLargeD9Ej5fM(), 7, null), null, null, false, null, composer2, 0, 120);
                    if (flatCashbackUpsellBottomSheetViewState.isPromoLocked()) {
                        composer2.startReplaceGroup(894064175);
                        BentoButtonBar2.BentoButtonBar(null, null, null, false, null, null, function02, StringResources_androidKt.stringResource(C10067R.string.flat_cash_back_unlock_with_direct_deposit, composer2, 0), false, null, false, function03, StringResources_androidKt.stringResource(C10067R.string.flat_cash_back_unlock_with_rad, composer2, 0), false, null, false, composer2, 0, 0, 59199);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(894439275);
                        BentoButtonBar2.BentoButtonBar(null, null, null, false, null, null, function04, StringResources_androidKt.stringResource(C11048R.string.general_label_done, composer2, 0), false, null, false, null, null, false, null, false, composer2, 0, 0, 65343);
                        composer2.endReplaceGroup();
                    }
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cash.flat.cashback.ui.bottomsheet.FlatCashbackUpsellBottomSheetComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FlatCashbackUpsellBottomSheetComposable.FlatCashbackUpsellBottomSheetComposable$lambda$0(onPrimaryButtonClick, onSecondaryButtonClick, onSeeOfferDetailsClick, onDismiss, viewState, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
