package com.robinhood.android.cash.flat.cashback.p071ui.rad;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
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
import com.robinhood.android.cash.flat.cashback.p071ui.common.FlatCashbackLoadableComposable;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.extensions2;

/* compiled from: RadOnboardingComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"RadOnboardingComposable", "", "onClick", "Lkotlin/Function0;", "viewState", "Lcom/robinhood/android/cash/flat/cashback/ui/rad/FlatCashbackRadOnboardingViewState;", "(Lkotlin/jvm/functions/Function0;Lcom/robinhood/android/cash/flat/cashback/ui/rad/FlatCashbackRadOnboardingViewState;Landroidx/compose/runtime/Composer;I)V", "feature-cash-flat-cashback_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cash.flat.cashback.ui.rad.RadOnboardingComposableKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class RadOnboardingComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RadOnboardingComposable$lambda$0(Function0 function0, FlatCashbackRadOnboardingViewState flatCashbackRadOnboardingViewState, int i, Composer composer, int i2) {
        RadOnboardingComposable(function0, flatCashbackRadOnboardingViewState, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void RadOnboardingComposable(final Function0<Unit> onClick, final FlatCashbackRadOnboardingViewState viewState, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Composer composerStartRestartGroup = composer.startRestartGroup(48105214);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(onClick) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(viewState) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(48105214, i2, -1, "com.robinhood.android.cash.flat.cashback.ui.rad.RadOnboardingComposable (RadOnboardingComposable.kt:27)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(833014217, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.cash.flat.cashback.ui.rad.RadOnboardingComposableKt.RadOnboardingComposable.1
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
                        ComposerKt.traceEventStart(833014217, i3, -1, "com.robinhood.android.cash.flat.cashback.ui.rad.RadOnboardingComposable.<anonymous> (RadOnboardingComposable.kt:28)");
                    }
                    Function0<Unit> function0 = onClick;
                    FlatCashbackRadOnboardingViewState flatCashbackRadOnboardingViewState = viewState;
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
                    Column6 column6 = Column6.INSTANCE;
                    Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Column5.weight$default(column6, companion, 1.0f, false, 2, null), ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null);
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
                    Modifier modifierAlign = column6.align(companion, companion2.getCenterHorizontally());
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i4 = BentoTheme.$stable;
                    ImageKt.Image(PainterResources_androidKt.painterResource(C10067R.drawable.svg_rad_splash_title, composer2, 0), (String) null, PaddingKt.m5144paddingVpY3zN4$default(modifierAlign, 0.0f, bentoTheme.getSpacing(composer2, i4).m21590getDefaultD9Ej5fM(), 1, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 48, 120);
                    BentoText2.m20747BentoText38GnDrw(flatCashbackRadOnboardingViewState.getTitle(), com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, bentoTheme.getSpacing(composer2, i4).m21590getDefaultD9Ej5fM(), composer2, 6, 0), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i4).getDisplayCapsuleLarge(), composer2, 0, 0, 8188);
                    BentoText2.m20747BentoText38GnDrw(flatCashbackRadOnboardingViewState.getSubtitle(), com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(column6.align(companion, companion2.getCenterHorizontally()), 0.0f, composer2, 0, 1), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i4).getTextM(), composer2, 0, 0, 8188);
                    FlatCashbackLoadableComposable.ValuePropRows(extensions2.toImmutableList(flatCashbackRadOnboardingViewState.getBullets()), null, null, null, composer2, 0, 14);
                    Spacer2.Spacer(Column5.weight$default(column6, companion, 1.0f, false, 2, null), composer2, 0);
                    composer2.endNode();
                    BentoButtonKt.m20586BentoButtonEikTQX8(function0, StringResources_androidKt.stringResource(C10067R.string.flat_cash_back_schedule_rad, composer2, 0), PaddingKt.m5143paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), bentoTheme.getSpacing(composer2, i4).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i4).m21590getDefaultD9Ej5fM()), null, null, false, false, null, null, null, null, false, null, composer2, 0, 0, 8184);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cash.flat.cashback.ui.rad.RadOnboardingComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RadOnboardingComposable.RadOnboardingComposable$lambda$0(onClick, viewState, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
