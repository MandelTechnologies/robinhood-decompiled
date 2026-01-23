package com.robinhood.android.creditcard.p091ui.creditapplication.finalterms;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import com.robinhood.analytics.EventLogger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FinalTermsComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsComposableKt$FinalTerms$4$1$4$3$2, reason: use source file name */
/* loaded from: classes2.dex */
final class FinalTermsComposable4 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ SnapshotState<Boolean> $animateOut$delegate;
    final /* synthetic */ EventLogger $eventLogger;
    final /* synthetic */ Function0<Unit> $onDownsellCtaClick;
    final /* synthetic */ SnapshotState<SelectedPlan> $selectedPlan$delegate;
    final /* synthetic */ boolean $shouldShowGoldBasicDownsellCta;
    final /* synthetic */ boolean $shouldShowPlanSelector;

    FinalTermsComposable4(EventLogger eventLogger, boolean z, Function0<Unit> function0, SnapshotState<Boolean> snapshotState, boolean z2, SnapshotState<SelectedPlan> snapshotState2) {
        this.$eventLogger = eventLogger;
        this.$shouldShowGoldBasicDownsellCta = z;
        this.$onDownsellCtaClick = function0;
        this.$animateOut$delegate = snapshotState;
        this.$shouldShowPlanSelector = z2;
        this.$selectedPlan$delegate = snapshotState2;
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
            ComposerKt.traceEventStart(1686362328, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTerms.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FinalTermsComposable.kt:268)");
        }
        EventLogger eventLogger = this.$eventLogger;
        boolean z = this.$shouldShowGoldBasicDownsellCta;
        Function0<Unit> function0 = this.$onDownsellCtaClick;
        composer.startReplaceGroup(5004770);
        boolean zChanged = composer.changed(this.$animateOut$delegate);
        final SnapshotState<Boolean> snapshotState = this.$animateOut$delegate;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsComposableKt$FinalTerms$4$1$4$3$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FinalTermsComposable4.invoke$lambda$1$lambda$0(snapshotState);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        FinalTermsComposable.FinalTermsAgreeButton(eventLogger, z, function0, (Function0) objRememberedValue, this.$shouldShowPlanSelector, FinalTermsComposable.FinalTerms$lambda$34(this.$selectedPlan$delegate), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(SnapshotState snapshotState) {
        FinalTermsComposable.FinalTerms$lambda$11(snapshotState, true);
        return Unit.INSTANCE;
    }
}
