package com.robinhood.android.options.portfolioriskanalyzer.components.search;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.p011ui.focus.FocusManager;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.compose.bento.component.BentoTextButton2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionsPortfolioRiskAnalyzerSearchPageComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchPageComposableKt$SearchBarComposable$4$1$4, reason: use source file name */
/* loaded from: classes11.dex */
final class OptionsPortfolioRiskAnalyzerSearchPageComposable6 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
    final /* synthetic */ FocusManager $focusManager;
    final /* synthetic */ SnapshotState<String> $input$delegate;
    final /* synthetic */ Function0<Unit> $onQueryCleared;

    OptionsPortfolioRiskAnalyzerSearchPageComposable6(SnapshotState<String> snapshotState, FocusManager focusManager, Function0<Unit> function0) {
        this.$input$delegate = snapshotState;
        this.$focusManager = focusManager;
        this.$onQueryCleared = function0;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
        invoke(animatedVisibilityScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-493621694, i, -1, "com.robinhood.android.options.portfolioriskanalyzer.components.search.SearchBarComposable.<anonymous>.<anonymous>.<anonymous> (OptionsPortfolioRiskAnalyzerSearchPageComposable.kt:184)");
        }
        composer.startReplaceGroup(-1746271574);
        boolean zChanged = composer.changed(this.$input$delegate) | composer.changedInstance(this.$focusManager) | composer.changed(this.$onQueryCleared);
        final FocusManager focusManager = this.$focusManager;
        final Function0<Unit> function0 = this.$onQueryCleared;
        final SnapshotState<String> snapshotState = this.$input$delegate;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchPageComposableKt$SearchBarComposable$4$1$4$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OptionsPortfolioRiskAnalyzerSearchPageComposable6.invoke$lambda$1$lambda$0(focusManager, function0, snapshotState);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoTextButton2.m20715BentoTextButtonPIknLig((Function0) objRememberedValue, StringResources_androidKt.stringResource(C11048R.string.general_label_cancel, composer, 0), null, null, null, false, null, composer, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(FocusManager focusManager, Function0 function0, SnapshotState snapshotState) {
        snapshotState.setValue("");
        focusManager.clearFocus(true);
        function0.invoke();
        return Unit.INSTANCE;
    }
}
