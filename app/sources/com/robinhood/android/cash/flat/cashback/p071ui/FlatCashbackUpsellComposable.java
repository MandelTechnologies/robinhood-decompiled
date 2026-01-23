package com.robinhood.android.cash.flat.cashback.p071ui;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.Divider2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.ColorResources_androidKt;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.cash.flat.cashback.C10067R;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FlatCashbackUpsellComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a?\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"FlatCashbackUpsellComposable", "", "onPrimaryButtonClick", "Lkotlin/Function0;", "onSecondaryButtonClick", "onSeeOfferDetailsClick", "viewState", "Lcom/robinhood/android/cash/flat/cashback/ui/FlatCashbackUpsellViewState;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/robinhood/android/cash/flat/cashback/ui/FlatCashbackUpsellViewState;Landroidx/compose/runtime/Composer;I)V", "feature-cash-flat-cashback_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cash.flat.cashback.ui.FlatCashbackUpsellComposableKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class FlatCashbackUpsellComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FlatCashbackUpsellComposable$lambda$0(Function0 function0, Function0 function02, Function0 function03, FlatCashbackUpsellViewState flatCashbackUpsellViewState, int i, Composer composer, int i2) {
        FlatCashbackUpsellComposable(function0, function02, function03, flatCashbackUpsellViewState, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void FlatCashbackUpsellComposable(final Function0<Unit> onPrimaryButtonClick, final Function0<Unit> onSecondaryButtonClick, final Function0<Unit> onSeeOfferDetailsClick, final FlatCashbackUpsellViewState viewState, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(onPrimaryButtonClick, "onPrimaryButtonClick");
        Intrinsics.checkNotNullParameter(onSecondaryButtonClick, "onSecondaryButtonClick");
        Intrinsics.checkNotNullParameter(onSeeOfferDetailsClick, "onSeeOfferDetailsClick");
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Composer composerStartRestartGroup = composer.startRestartGroup(-499245132);
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
            i2 |= composerStartRestartGroup.changedInstance(viewState) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-499245132, i2, -1, "com.robinhood.android.cash.flat.cashback.ui.FlatCashbackUpsellComposable (FlatCashbackUpsellComposable.kt:31)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1069606135, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.cash.flat.cashback.ui.FlatCashbackUpsellComposableKt.FlatCashbackUpsellComposable.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    long jColorResource;
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1069606135, i3, -1, "com.robinhood.android.cash.flat.cashback.ui.FlatCashbackUpsellComposable.<anonymous> (FlatCashbackUpsellComposable.kt:32)");
                    }
                    Function0<Unit> function0 = onPrimaryButtonClick;
                    Function0<Unit> function02 = onSecondaryButtonClick;
                    FlatCashbackUpsellViewState flatCashbackUpsellViewState = viewState;
                    Function0<Unit> function03 = onSeeOfferDetailsClick;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.Vertical top = arrangement.getTop();
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer2, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, companion);
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
                    Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Column5.weight$default(Column6.INSTANCE, companion, 1.0f, false, 2, null), ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer2, 0);
                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierVerticalScroll$default);
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor2);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i4 = BentoTheme.$stable;
                    if (bentoTheme.getColors(composer2, i4).getIsDay()) {
                        composer2.startReplaceGroup(-1980325203);
                        jColorResource = ColorResources_androidKt.colorResource(C10067R.color.flatCashbackUpsellImageDayBackgroundColor, composer2, 0);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(-1980200149);
                        jColorResource = ColorResources_androidKt.colorResource(C10067R.color.flatCashbackUpsellImageNightBackgroundColor, composer2, 0);
                        composer2.endReplaceGroup();
                    }
                    Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifierFillMaxWidth$default, jColorResource, null, 2, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                    int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer2, modifierM4872backgroundbw27NRU$default);
                    Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor3);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                    ImageKt.Image(PainterResources_androidKt.painterResource(C10067R.drawable.svg_flat_cashback_upsell, composer2, 0), (String) null, PaddingKt.m5146paddingqDBjuR0$default(BoxScopeInstance.INSTANCE.align(companion, companion2.getCenter()), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer2, i4).m21596getXxlargeD9Ej5fM(), 7, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 48, 120);
                    composer2.endNode();
                    Divider2.m5581DivideroMI9zvI(PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer2, i4).m21592getMediumD9Ej5fM(), 7, null), bentoTheme.getColors(composer2, i4).m21425getFg0d7_KjU(), 0.0f, 0.0f, composer2, 0, 12);
                    BentoText2.m20747BentoText38GnDrw(flatCashbackUpsellViewState.getTitle(), com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composer2, 6, 1), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i4).getDisplayCapsuleLarge(), composer2, 0, 0, 8188);
                    BentoText2.m20747BentoText38GnDrw(flatCashbackUpsellViewState.getSubtitle(), com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, bentoTheme.getSpacing(composer2, i4).m21593getSmallD9Ej5fM(), composer2, 6, 0), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i4).getTextM(), composer2, 0, 0, 8188);
                    BentoTextButton2.m20715BentoTextButtonPIknLig(function03, StringResources_androidKt.stringResource(C10067R.string.flat_cash_back_view_offer_details, composer2, 0), PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer2, i4).m21592getMediumD9Ej5fM(), 0.0f, 2, null), null, null, false, null, composer2, 0, 120);
                    composer2.endNode();
                    BentoButtonBar2.BentoButtonBar(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composer2, 6, 1), null, null, false, null, null, function0, StringResources_androidKt.stringResource(C10067R.string.flat_cash_back_unlock_with_direct_deposit, composer2, 0), false, null, false, function02, StringResources_androidKt.stringResource(C10067R.string.flat_cash_back_unlock_with_rad, composer2, 0), false, null, false, composer2, 0, 0, 59198);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cash.flat.cashback.ui.FlatCashbackUpsellComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FlatCashbackUpsellComposable.FlatCashbackUpsellComposable$lambda$0(onPrimaryButtonClick, onSecondaryButtonClick, onSeeOfferDetailsClick, viewState, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
