package com.robinhood.android.onboarding.drip.p204ui;

import androidx.compose.p011ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.advisory.featureunavailable.AdvisoryFeatureUnavailableContent;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.designsystem.compose.ThemesFromScarlet;
import com.robinhood.scarlet.ScarletManager2;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DripOnboardingActivity.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.onboarding.drip.ui.DripOnboardingActivity$onCreate$2$1$1, reason: use source file name */
/* loaded from: classes10.dex */
final class DripOnboardingActivity5 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ ComposeView $this_apply;
    final /* synthetic */ DripOnboardingActivity this$0;

    DripOnboardingActivity5(ComposeView composeView, DripOnboardingActivity dripOnboardingActivity) {
        this.$this_apply = composeView;
        this.this$0 = dripOnboardingActivity;
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
            ComposerKt.traceEventStart(-438640071, i, -1, "com.robinhood.android.onboarding.drip.ui.DripOnboardingActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (DripOnboardingActivity.kt:65)");
        }
        Observable<ThemesFromScarlet> observableThemeChangesForCompose = ScarletComposeInterop.themeChangesForCompose(ScarletManager2.getScarletManager(this.$this_apply));
        composer.startReplaceGroup(5004770);
        boolean zChangedInstance = composer.changedInstance(this.this$0);
        final DripOnboardingActivity dripOnboardingActivity = this.this$0;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.onboarding.drip.ui.DripOnboardingActivity$onCreate$2$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DripOnboardingActivity5.invoke$lambda$1$lambda$0(dripOnboardingActivity);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        AdvisoryFeatureUnavailableContent.AdvisoryFeatureUnavailableDialog(observableThemeChangesForCompose, (Function0) objRememberedValue, composer, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(DripOnboardingActivity dripOnboardingActivity) {
        dripOnboardingActivity.navigateToHomeScreenAndFinish();
        return Unit.INSTANCE;
    }
}
