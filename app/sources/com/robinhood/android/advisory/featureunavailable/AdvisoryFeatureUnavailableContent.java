package com.robinhood.android.advisory.featureunavailable;

import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.designsystem.compose.ThemesFromScarlet;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.utils.logging.CrashReporter;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AdvisoryFeatureUnavailableContent.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a+\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0007¢\u0006\u0002\u0010\f\"\u0018\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\r"}, m3636d2 = {"ManagedAccountException", "Ljava/lang/Exception;", "Lkotlin/Exception;", "getManagedAccountException", "()Ljava/lang/Exception;", "AdvisoryFeatureUnavailableDialog", "", "overlayStream", "Lio/reactivex/Observable;", "Lcom/robinhood/android/designsystem/compose/ThemesFromScarlet;", "onDismiss", "Lkotlin/Function0;", "(Lio/reactivex/Observable;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "lib-advisory_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.featureunavailable.AdvisoryFeatureUnavailableContentKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class AdvisoryFeatureUnavailableContent {
    private static final Exception ManagedAccountException = new IllegalStateException("Somehow accessed a page with a managed account that should be unavailable!");

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdvisoryFeatureUnavailableDialog$lambda$4(Observable observable, Function0 function0, int i, int i2, Composer composer, int i3) {
        AdvisoryFeatureUnavailableDialog(observable, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final Exception getManagedAccountException() {
        return ManagedAccountException;
    }

    public static final void AdvisoryFeatureUnavailableDialog(Observable<ThemesFromScarlet> overlayStream, final Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        final Observable<ThemesFromScarlet> observable;
        Intrinsics.checkNotNullParameter(overlayStream, "overlayStream");
        Composer composerStartRestartGroup = composer.startRestartGroup(1748787645);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(overlayStream) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.featureunavailable.AdvisoryFeatureUnavailableContentKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                function0 = (Function0) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1748787645, i3, -1, "com.robinhood.android.advisory.featureunavailable.AdvisoryFeatureUnavailableDialog (AdvisoryFeatureUnavailableContent.kt:22)");
            }
            observable = overlayStream;
            BentoTheme2.BentoTheme(observable, null, ComposableLambda3.rememberComposableLambda(1413733835, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.featureunavailable.AdvisoryFeatureUnavailableContentKt.AdvisoryFeatureUnavailableDialog.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    if ((i5 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1413733835, i5, -1, "com.robinhood.android.advisory.featureunavailable.AdvisoryFeatureUnavailableDialog.<anonymous> (AdvisoryFeatureUnavailableContent.kt:24)");
                    }
                    final Function0<Unit> function02 = function0;
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-167871648, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.featureunavailable.AdvisoryFeatureUnavailableContentKt.AdvisoryFeatureUnavailableDialog.2.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i6) {
                            if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-167871648, i6, -1, "com.robinhood.android.advisory.featureunavailable.AdvisoryFeatureUnavailableDialog.<anonymous>.<anonymous> (AdvisoryFeatureUnavailableContent.kt:25)");
                            }
                            BentoAlertDialog.BentoAlertDialog(StringResources_androidKt.stringResource(C11048R.string.general_error_title, composer3, 0), new BentoAlertDialog2.Body.Text(StringResources_androidKt.stringResource(C11048R.string.general_error_summary, composer3, 0)), new BentoAlertButton(StringResources_androidKt.stringResource(C11048R.string.general_label_ok, composer3, 0), function02), null, null, null, false, null, function02, composer3, (BentoAlertDialog2.Body.Text.$stable << 3) | (BentoAlertButton.$stable << 6), EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i3 & 14) | 384, 2);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.advisory.featureunavailable.AdvisoryFeatureUnavailableContentKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AdvisoryFeatureUnavailableContent.AdvisoryFeatureUnavailableDialog$lambda$3$lambda$2();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.SideEffect((Function0) objRememberedValue2, composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            observable = overlayStream;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.featureunavailable.AdvisoryFeatureUnavailableContentKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AdvisoryFeatureUnavailableContent.AdvisoryFeatureUnavailableDialog$lambda$4(observable, function0, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdvisoryFeatureUnavailableDialog$lambda$3$lambda$2() {
        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, ManagedAccountException, false, null, 4, null);
        return Unit.INSTANCE;
    }
}
