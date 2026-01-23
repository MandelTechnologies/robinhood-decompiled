package com.robinhood.android.investmentstracker.composables;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import bff_money_movement.service.p019v1.InvestmentsTrackerOnboardingCarouselItemDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerOnboardingDataDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerOnboardingFirstPageDto;
import com.robinhood.android.investmentstracker.viewmodels.OnboardingViewModel;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OnboardingScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.investmentstracker.composables.ComposableSingletons$OnboardingScreenKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class OnboardingScreen2 {
    public static final OnboardingScreen2 INSTANCE = new OnboardingScreen2();
    private static Function2<Composer, Integer, Unit> lambda$931090165 = ComposableLambda3.composableLambdaInstance(931090165, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.investmentstracker.composables.ComposableSingletons$OnboardingScreenKt$lambda$931090165$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(931090165, i, -1, "com.robinhood.android.investmentstracker.composables.ComposableSingletons$OnboardingScreenKt.lambda$931090165.<anonymous> (OnboardingScreen.kt:50)");
            }
            Modifier modifierM5171sizeVpY3zN4 = SizeKt.m5171sizeVpY3zN4(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(200), C2002Dp.m7995constructorimpl(400));
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5171sizeVpY3zN4);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            OnboardingScreen5.OnboardingScreen(new OnboardingViewModel(new InvestmentsTrackerOnboardingDataDto(new InvestmentsTrackerOnboardingFirstPageDto((List<InvestmentsTrackerOnboardingCarouselItemDto>) CollectionsKt.listOf(new InvestmentsTrackerOnboardingCarouselItemDto("", null, "Title", "Description", 2, null)), "Continue"), null, 2, null), 0), null, false, null, null, null, composer, 199680, 22);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1000450710, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9063lambda$1000450710 = ComposableLambda3.composableLambdaInstance(-1000450710, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.investmentstracker.composables.ComposableSingletons$OnboardingScreenKt$lambda$-1000450710$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1000450710, i, -1, "com.robinhood.android.investmentstracker.composables.ComposableSingletons$OnboardingScreenKt.lambda$-1000450710.<anonymous> (OnboardingScreen.kt:49)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(OnboardingScreen2.INSTANCE.getLambda$931090165$feature_investments_tracker_externalDebug(), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1000450710$feature_investments_tracker_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m15562getLambda$1000450710$feature_investments_tracker_externalDebug() {
        return f9063lambda$1000450710;
    }

    public final Function2<Composer, Integer, Unit> getLambda$931090165$feature_investments_tracker_externalDebug() {
        return lambda$931090165;
    }
}
