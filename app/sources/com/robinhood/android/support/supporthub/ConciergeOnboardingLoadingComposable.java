package com.robinhood.android.support.supporthub;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.ModifiersKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ConciergeOnboardingLoadingComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"ConciergeOnboardingLoadingComposable", "", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)V", "feature-support_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.support.supporthub.ConciergeOnboardingLoadingComposableKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class ConciergeOnboardingLoadingComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConciergeOnboardingLoadingComposable$lambda$1(PaddingValues paddingValues, int i, Composer composer, int i2) {
        ConciergeOnboardingLoadingComposable(paddingValues, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void ConciergeOnboardingLoadingComposable(final PaddingValues paddingValues, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        Composer composerStartRestartGroup = composer.startRestartGroup(-49893238);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(paddingValues) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-49893238, i2, -1, "com.robinhood.android.support.supporthub.ConciergeOnboardingLoadingComposable (ConciergeOnboardingLoadingComposable.kt:21)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierTestTag = TestTag3.testTag(companion, "LoadingScreen");
            float top = paddingValues.getTop();
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(PaddingKt.m5146paddingqDBjuR0$default(modifierTestTag, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), top, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 0.0f, 8, null), 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getBottom(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 54);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            composer2 = composerStartRestartGroup;
            BentoText2.m20747BentoText38GnDrw("...", ModifiersKt.bentoPillPlaceholder(SizeKt.fillMaxWidth(PaddingKt.m5143paddingVpY3zN4(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i3).m21593getSmallD9Ej5fM()), 0.7f), true), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getDisplayCapsuleLarge(), composer2, 6, 0, 8188);
            BentoText2.m20747BentoText38GnDrw("...", ModifiersKt.bentoPillPlaceholder(SizeKt.fillMaxWidth$default(PaddingKt.m5143paddingVpY3zN4(companion, bentoTheme.getSpacing(composer2, i3).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i3).m21593getSmallD9Ej5fM()), 0.0f, 1, null), true), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i3).getDisplayCapsuleLarge(), composer2, 6, 0, 8188);
            BentoText2.m20747BentoText38GnDrw("...", ModifiersKt.bentoPillPlaceholder(SizeKt.fillMaxWidth(PaddingKt.m5143paddingVpY3zN4(companion, bentoTheme.getSpacing(composer2, i3).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i3).m21593getSmallD9Ej5fM()), 0.9f), true), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i3).getTextM(), composer2, 6, 0, 8188);
            BentoText2.m20747BentoText38GnDrw("...", ModifiersKt.bentoPillPlaceholder(SizeKt.fillMaxWidth(PaddingKt.m5143paddingVpY3zN4(companion, bentoTheme.getSpacing(composer2, i3).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i3).m21593getSmallD9Ej5fM()), 0.9f), true), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i3).getTextM(), composer2, 6, 0, 8188);
            BentoText2.m20747BentoText38GnDrw("...", ModifiersKt.bentoPillPlaceholder(SizeKt.fillMaxWidth(PaddingKt.m5143paddingVpY3zN4(companion, bentoTheme.getSpacing(composer2, i3).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i3).m21593getSmallD9Ej5fM()), 0.5f), true), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i3).getTextS(), composer2, 6, 0, 8188);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer2, i3).m21596getXxlargeD9Ej5fM()), composer2, 0);
            BentoText2.m20747BentoText38GnDrw("...", ModifiersKt.bentoPillPlaceholder(SizeKt.fillMaxWidth$default(PaddingKt.m5143paddingVpY3zN4(companion, bentoTheme.getSpacing(composer2, i3).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i3).m21593getSmallD9Ej5fM()), 0.0f, 1, null), true), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i3).getDisplayCapsuleLarge(), composer2, 6, 0, 8188);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.support.supporthub.ConciergeOnboardingLoadingComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ConciergeOnboardingLoadingComposable.ConciergeOnboardingLoadingComposable$lambda$1(paddingValues, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
