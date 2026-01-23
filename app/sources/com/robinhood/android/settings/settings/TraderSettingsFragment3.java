package com.robinhood.android.settings.settings;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.advisory.featureunavailable.AdvisoryFeatureUnavailableContent;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.designsystem.compose.ThemesFromScarlet;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TraderSettingsFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.settings.settings.TraderSettingsFragment$onResume$1$2, reason: use source file name */
/* loaded from: classes5.dex */
final class TraderSettingsFragment3 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ TraderSettingsFragment this$0;

    TraderSettingsFragment3(TraderSettingsFragment traderSettingsFragment) {
        this.this$0 = traderSettingsFragment;
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
            ComposerKt.traceEventStart(-916547274, i, -1, "com.robinhood.android.settings.settings.TraderSettingsFragment.onResume.<anonymous>.<anonymous> (TraderSettingsFragment.kt:89)");
        }
        Observable<ThemesFromScarlet> observableThemeChangesForCompose = ScarletComposeInterop.themeChangesForCompose(this.this$0.getScarletManager());
        composer.startReplaceGroup(5004770);
        boolean zChangedInstance = composer.changedInstance(this.this$0);
        final TraderSettingsFragment traderSettingsFragment = this.this$0;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.settings.settings.TraderSettingsFragment$onResume$1$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TraderSettingsFragment3.invoke$lambda$1$lambda$0(traderSettingsFragment);
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
    public static final Unit invoke$lambda$1$lambda$0(TraderSettingsFragment traderSettingsFragment) {
        traderSettingsFragment.requireActivity().onBackPressed();
        return Unit.INSTANCE;
    }
}
