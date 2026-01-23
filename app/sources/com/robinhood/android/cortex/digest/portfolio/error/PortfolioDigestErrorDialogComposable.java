package com.robinhood.android.cortex.digest.portfolio.error;

import android.content.Context;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.cortex.digest.portfolio.PortfolioDigestDestinations5;
import com.robinhood.android.cortex.digest.portfolio.error.PortfolioDigestErrorDialogComposable;
import com.robinhood.android.navigation.compose.LifecycleAwareNavigator;
import com.robinhood.android.navigation.compose.LocalLifecycleAwareNavigator;
import com.robinhood.android.navigation.compose.result.ObserveResult;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.compose.bento.component.alerts.BentoAlerts2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PortfolioDigestErrorDialogComposable.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006\u001a!\u0010\u0007\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\tH\u0007¢\u0006\u0002\u0010\u000b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"RESULT_KEY_ERROR", "", "PortfolioDigestErrorDialogComposable", "", "args", "Lcom/robinhood/android/cortex/digest/portfolio/PortfolioDigestErrorDest$Args;", "(Lcom/robinhood/android/cortex/digest/portfolio/PortfolioDigestErrorDest$Args;Landroidx/compose/runtime/Composer;I)V", "ObserveErrorResult", "onErrorResult", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "feature-cortex-digest-portfolio_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.cortex.digest.portfolio.error.PortfolioDigestErrorDialogComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class PortfolioDigestErrorDialogComposable {
    private static final String RESULT_KEY_ERROR = "error";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ObserveErrorResult$lambda$5(Function1 function1, int i, Composer composer, int i2) {
        ObserveErrorResult(function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PortfolioDigestErrorDialogComposable$lambda$2(PortfolioDigestDestinations5.Args args, int i, Composer composer, int i2) {
        PortfolioDigestErrorDialogComposable(args, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void PortfolioDigestErrorDialogComposable(final PortfolioDigestDestinations5.Args args, Composer composer, final int i) {
        int i2;
        String message;
        Intrinsics.checkNotNullParameter(args, "args");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2096012324);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(args) : composerStartRestartGroup.changedInstance(args) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2096012324, i2, -1, "com.robinhood.android.cortex.digest.portfolio.error.PortfolioDigestErrorDialogComposable (PortfolioDigestErrorDialogComposable.kt:30)");
            }
            LifecycleAwareNavigator lifecycleAwareNavigator = (LifecycleAwareNavigator) composerStartRestartGroup.consume(LocalLifecycleAwareNavigator.getLocalLifecycleAwareNavigator());
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            composerStartRestartGroup.startReplaceGroup(71826334);
            if (!(args instanceof PortfolioDigestDestinations5.Args.Error)) {
                if (!(args instanceof PortfolioDigestDestinations5.Args.Message)) {
                    throw new NoWhenBranchMatchedException();
                }
                message = ((PortfolioDigestDestinations5.Args.Message) args).getMessage();
            } else {
                PortfolioDigestDestinations5.Args.Error error = (PortfolioDigestDestinations5.Args.Error) args;
                Throwable throwable = error.getThrowable();
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChanged = composerStartRestartGroup.changed(throwable);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    Throwable throwable2 = error.getThrowable();
                    if (!AbsErrorHandler.handleError$default(new PortfolioDigestErrorHandler(new Function1() { // from class: com.robinhood.android.cortex.digest.portfolio.error.PortfolioDigestErrorDialogComposableKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return PortfolioDigestErrorDialogComposable.PortfolioDigestErrorDialogComposable$lambda$1$lambda$0(objectRef, (String) obj);
                        }
                    }, context), throwable2, false, 2, null)) {
                        throw throwable2;
                    }
                    Object obj = objectRef.element;
                    if (obj == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    objRememberedValue = (String) obj;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                message = (String) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(50206823, true, new C121371(lifecycleAwareNavigator, args, message), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cortex.digest.portfolio.error.PortfolioDigestErrorDialogComposableKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return PortfolioDigestErrorDialogComposable.PortfolioDigestErrorDialogComposable$lambda$2(args, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit PortfolioDigestErrorDialogComposable$lambda$1$lambda$0(Ref.ObjectRef objectRef, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        objectRef.element = it;
        return Unit.INSTANCE;
    }

    /* compiled from: PortfolioDigestErrorDialogComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.cortex.digest.portfolio.error.PortfolioDigestErrorDialogComposableKt$PortfolioDigestErrorDialogComposable$1 */
    static final class C121371 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ PortfolioDigestDestinations5.Args $args;
        final /* synthetic */ String $errorMessage;
        final /* synthetic */ LifecycleAwareNavigator $navigator;

        C121371(LifecycleAwareNavigator lifecycleAwareNavigator, PortfolioDigestDestinations5.Args args, String str) {
            this.$navigator = lifecycleAwareNavigator;
            this.$args = args;
            this.$errorMessage = str;
        }

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
                ComposerKt.traceEventStart(50206823, i, -1, "com.robinhood.android.cortex.digest.portfolio.error.PortfolioDigestErrorDialogComposable.<anonymous> (PortfolioDigestErrorDialogComposable.kt:55)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoAlertDialog2 bentoAlertDialog2 = BentoAlertDialog2.INSTANCE;
            Modifier modifierClip = Clip.clip(PaddingKt.m5144paddingVpY3zN4$default(companion, bentoAlertDialog2.m20851getHorizontalPaddingD9Ej5fM(), 0.0f, 2, null), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoAlertDialog2.m20850getCornerRadiusD9Ej5fM()));
            String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_error_title, composer, 0);
            String strStringResource2 = StringResources_androidKt.stringResource(C11048R.string.general_label_dismiss, composer, 0);
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(this.$navigator) | composer.changedInstance(this.$args);
            final LifecycleAwareNavigator lifecycleAwareNavigator = this.$navigator;
            final PortfolioDigestDestinations5.Args args = this.$args;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.cortex.digest.portfolio.error.PortfolioDigestErrorDialogComposableKt$PortfolioDigestErrorDialogComposable$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PortfolioDigestErrorDialogComposable.C121371.invoke$lambda$1$lambda$0(lifecycleAwareNavigator, args);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            List listListOf = CollectionsKt.listOf(new BentoAlertButton(strStringResource2, (Function0) objRememberedValue));
            final String str = this.$errorMessage;
            BentoAlerts2.AlertContent(modifierClip, null, strStringResource, null, listListOf, true, ComposableLambda3.rememberComposableLambda(1898828791, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.portfolio.error.PortfolioDigestErrorDialogComposableKt.PortfolioDigestErrorDialogComposable.1.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    if ((i2 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1898828791, i2, -1, "com.robinhood.android.cortex.digest.portfolio.error.PortfolioDigestErrorDialogComposable.<anonymous>.<anonymous> (PortfolioDigestErrorDialogComposable.kt:70)");
                    }
                    BentoText2.m20747BentoText38GnDrw(str, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, null, composer2, 48, 0, 16316);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, 54), composer, (BentoAlertButton.$stable << 12) | 1769472, 10);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(LifecycleAwareNavigator lifecycleAwareNavigator, PortfolioDigestDestinations5.Args args) {
            LifecycleAwareNavigator.setResultAndPop$default(lifecycleAwareNavigator, new Result(args.getId()), "error", false, 4, null);
            return Unit.INSTANCE;
        }
    }

    public static final void ObserveErrorResult(final Function1<? super Integer, Unit> onErrorResult, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(onErrorResult, "onErrorResult");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1485440674);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(onErrorResult) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1485440674, i2, -1, "com.robinhood.android.cortex.digest.portfolio.error.ObserveErrorResult (PortfolioDigestErrorDialogComposable.kt:87)");
            }
            SavedStateHandle savedStateHandle = ((LifecycleAwareNavigator) composerStartRestartGroup.consume(LocalLifecycleAwareNavigator.getLocalLifecycleAwareNavigator())).getEntry().getSavedStateHandle();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z = (i2 & 14) == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.cortex.digest.portfolio.error.PortfolioDigestErrorDialogComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PortfolioDigestErrorDialogComposable.ObserveErrorResult$lambda$4$lambda$3(onErrorResult, (Result) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            ObserveResult.ObserveResult(savedStateHandle, "error", (Function1) objRememberedValue, composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cortex.digest.portfolio.error.PortfolioDigestErrorDialogComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PortfolioDigestErrorDialogComposable.ObserveErrorResult$lambda$5(onErrorResult, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ObserveErrorResult$lambda$4$lambda$3(Function1 function1, Result it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function1.invoke(Integer.valueOf(it.getId()));
        return Unit.INSTANCE;
    }
}
