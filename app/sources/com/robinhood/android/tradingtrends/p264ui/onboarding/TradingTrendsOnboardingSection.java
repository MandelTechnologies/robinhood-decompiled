package com.robinhood.android.tradingtrends.p264ui.onboarding;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.WindowInfo;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import coil.ImageLoader;
import coil.compose.AsyncImagePainter4;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.tradingtrends.C29966R;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.CoilUtils2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TradingTrendsOnboardingSection.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"TradingTrendsOnboardingSection", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-trading-trends_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.tradingtrends.ui.onboarding.TradingTrendsOnboardingSectionKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class TradingTrendsOnboardingSection {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TradingTrendsOnboardingSection$lambda$2(Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        TradingTrendsOnboardingSection(function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TradingTrendsOnboardingSection(Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int i4;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final Function0<Unit> onClick = function0;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(173622189);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (composerStartRestartGroup.changedInstance(onClick) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i3;
            if ((i4 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(173622189, i4, -1, "com.robinhood.android.tradingtrends.ui.onboarding.TradingTrendsOnboardingSection (TradingTrendsOnboardingSection.kt:32)");
                }
                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), ScrollKt.rememberScrollState(Integer.MAX_VALUE, composerStartRestartGroup, 6, 0), false, null, false, 14, null), null, true, false, false, false, false, null, 125, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAutoLogEvents$default);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                ImageLoader imageLoaderRememberImageLoader = CoilUtils2.rememberImageLoader(0.0d, null, composerStartRestartGroup, 0, 3);
                Modifier.Companion companion2 = Modifier.INSTANCE;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                composerStartRestartGroup.startReplaceGroup(-2055340556);
                float value = C2002Dp.m7993boximpl(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM((int) (((WindowInfo) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalWindowInfo())).mo7449getContainerSizeYbymL2g() >> 32))).getValue();
                composerStartRestartGroup.endReplaceGroup();
                ImageKt.Image(AsyncImagePainter4.m9105rememberAsyncImagePainter0YpotYA(StringResources_androidKt.stringResource(C29966R.string.trading_trends_onboarding_asset, composerStartRestartGroup, 0), imageLoaderRememberImageLoader, null, null, null, 0, null, composerStartRestartGroup, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), (String) null, SizeKt.m5161requiredHeightInVpY3zN4$default(modifierFillMaxWidth$default, C2002Dp.m7995constructorimpl(value / 3), 0.0f, 2, null), (Alignment) null, ContentScale.INSTANCE.getFillWidth(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24624, 104);
                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, 0L, 0.0f, composerStartRestartGroup, 0, 7);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                Modifier modifier4 = modifier3;
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C29966R.string.onboarding_title, composerStartRestartGroup, 0), PaddingKt.m5146paddingqDBjuR0$default(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM(), C2002Dp.m7995constructorimpl(37), bentoTheme.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM(), 0.0f, 8, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i6).getBookCoverCapsuleSmall(), composerStartRestartGroup, 0, 0, 8188);
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C29966R.string.onboarding_details, composerStartRestartGroup, 0), PaddingKt.m5146paddingqDBjuR0$default(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM(), C2002Dp.m7995constructorimpl(12), bentoTheme.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM(), 0.0f, 8, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i6).getTextM(), composerStartRestartGroup, 0, 0, 8188);
                BoxKt.Box(Column5.weight$default(column6, companion2, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                onClick = function0;
                BentoButtonKt.m20586BentoButtonEikTQX8(onClick, StringResources_androidKt.stringResource(C29966R.string.onboarding_button, composerStartRestartGroup, 0), PaddingKt.m5143paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM()), null, null, false, false, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i6).m21425getFg0d7_KjU()), null, null, null, false, null, composerStartRestartGroup, i4 & 14, 0, 8056);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.tradingtrends.ui.onboarding.TradingTrendsOnboardingSectionKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return TradingTrendsOnboardingSection.TradingTrendsOnboardingSection$lambda$2(onClick, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & 19) == 18) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), ScrollKt.rememberScrollState(Integer.MAX_VALUE, composerStartRestartGroup, 6, 0), false, null, false, 14, null), null, true, false, false, false, false, null, 125, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAutoLogEvents$default2);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion3.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                ImageLoader imageLoaderRememberImageLoader2 = CoilUtils2.rememberImageLoader(0.0d, null, composerStartRestartGroup, 0, 3);
                Modifier.Companion companion22 = Modifier.INSTANCE;
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion22, 0.0f, 1, null);
                composerStartRestartGroup.startReplaceGroup(-2055340556);
                float value2 = C2002Dp.m7993boximpl(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM((int) (((WindowInfo) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalWindowInfo())).mo7449getContainerSizeYbymL2g() >> 32))).getValue();
                composerStartRestartGroup.endReplaceGroup();
                ImageKt.Image(AsyncImagePainter4.m9105rememberAsyncImagePainter0YpotYA(StringResources_androidKt.stringResource(C29966R.string.trading_trends_onboarding_asset, composerStartRestartGroup, 0), imageLoaderRememberImageLoader2, null, null, null, 0, null, composerStartRestartGroup, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), (String) null, SizeKt.m5161requiredHeightInVpY3zN4$default(modifierFillMaxWidth$default2, C2002Dp.m7995constructorimpl(value2 / 3), 0.0f, 2, null), (Alignment) null, ContentScale.INSTANCE.getFillWidth(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24624, 104);
                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, 0L, 0.0f, composerStartRestartGroup, 0, 7);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i62 = BentoTheme.$stable;
                Modifier modifier42 = modifier3;
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C29966R.string.onboarding_title, composerStartRestartGroup, 0), PaddingKt.m5146paddingqDBjuR0$default(companion22, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21592getMediumD9Ej5fM(), C2002Dp.m7995constructorimpl(37), bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21592getMediumD9Ej5fM(), 0.0f, 8, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i62).getBookCoverCapsuleSmall(), composerStartRestartGroup, 0, 0, 8188);
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C29966R.string.onboarding_details, composerStartRestartGroup, 0), PaddingKt.m5146paddingqDBjuR0$default(companion22, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21592getMediumD9Ej5fM(), C2002Dp.m7995constructorimpl(12), bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21592getMediumD9Ej5fM(), 0.0f, 8, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i62).getTextM(), composerStartRestartGroup, 0, 0, 8188);
                BoxKt.Box(Column5.weight$default(column62, companion22, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                onClick = function0;
                BentoButtonKt.m20586BentoButtonEikTQX8(onClick, StringResources_androidKt.stringResource(C29966R.string.onboarding_button, composerStartRestartGroup, 0), PaddingKt.m5143paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion22, 0.0f, 1, null), bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21590getDefaultD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21592getMediumD9Ej5fM()), null, null, false, false, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i62).m21425getFg0d7_KjU()), null, null, null, false, null, composerStartRestartGroup, i4 & 14, 0, 8056);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier42;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
