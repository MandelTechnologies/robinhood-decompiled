package com.robinhood.android.rhymigration.p245ui.intro;

import android.content.Context;
import android.net.Uri;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.rhymigration.model.UiRhyMigrationCmShutdownUpsell;
import com.robinhood.android.rhymigration.p245ui.intro.RhyIntroFragmentV2;
import com.robinhood.librobinhood.CmSunsetExperiment4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RhyIntroFragmentV2.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.rhymigration.ui.intro.RhyIntroFragmentV2$ComposeContent$1$1, reason: use source file name */
/* loaded from: classes5.dex */
final class RhyIntroFragmentV22 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ UiRhyMigrationCmShutdownUpsell $it;
    final /* synthetic */ RhyIntroFragmentV2 this$0;

    RhyIntroFragmentV22(UiRhyMigrationCmShutdownUpsell uiRhyMigrationCmShutdownUpsell, RhyIntroFragmentV2 rhyIntroFragmentV2) {
        this.$it = uiRhyMigrationCmShutdownUpsell;
        this.this$0 = rhyIntroFragmentV2;
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
            ComposerKt.traceEventStart(1859272094, i, -1, "com.robinhood.android.rhymigration.ui.intro.RhyIntroFragmentV2.ComposeContent.<anonymous>.<anonymous> (RhyIntroFragmentV2.kt:52)");
        }
        Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, null, true, false, false, false, false, null, 125, null);
        UiRhyMigrationCmShutdownUpsell uiRhyMigrationCmShutdownUpsell = this.$it;
        composer.startReplaceGroup(5004770);
        boolean zChangedInstance = composer.changedInstance(this.this$0);
        final RhyIntroFragmentV2 rhyIntroFragmentV2 = this.this$0;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.rhymigration.ui.intro.RhyIntroFragmentV2$ComposeContent$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RhyIntroFragmentV22.invoke$lambda$1$lambda$0(rhyIntroFragmentV2);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function0 function0 = (Function0) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean zChangedInstance2 = composer.changedInstance(this.this$0);
        final RhyIntroFragmentV2 rhyIntroFragmentV22 = this.this$0;
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.rhymigration.ui.intro.RhyIntroFragmentV2$ComposeContent$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RhyIntroFragmentV22.invoke$lambda$3$lambda$2(rhyIntroFragmentV22);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        Function0 function02 = (Function0) objRememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean zChangedInstance3 = composer.changedInstance(this.this$0);
        final RhyIntroFragmentV2 rhyIntroFragmentV23 = this.this$0;
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue3 = new Function1() { // from class: com.robinhood.android.rhymigration.ui.intro.RhyIntroFragmentV2$ComposeContent$1$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RhyIntroFragmentV22.invoke$lambda$5$lambda$4(rhyIntroFragmentV23, (Uri) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        Function1 function1 = (Function1) objRememberedValue3;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean zChangedInstance4 = composer.changedInstance(this.this$0);
        final RhyIntroFragmentV2 rhyIntroFragmentV24 = this.this$0;
        Object objRememberedValue4 = composer.rememberedValue();
        if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue4 = new Function1() { // from class: com.robinhood.android.rhymigration.ui.intro.RhyIntroFragmentV2$ComposeContent$1$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RhyIntroFragmentV22.invoke$lambda$7$lambda$6(rhyIntroFragmentV24, (String) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue4);
        }
        Function1 function12 = (Function1) objRememberedValue4;
        composer.endReplaceGroup();
        RhyIntroFragmentV2.Companion companion = RhyIntroFragmentV2.INSTANCE;
        CmSunsetExperiment4 treatmentGroup = ((RhyIntroFragmentV2.Args) companion.getArgs((Fragment) this.this$0)).getTreatmentGroup();
        if (treatmentGroup == null) {
            treatmentGroup = CmSunsetExperiment4.CONTROL;
        }
        CmSunsetV2Composable.CmSunsetV2Composable(modifierAutoLogEvents$default, uiRhyMigrationCmShutdownUpsell, function0, function02, function1, function12, treatmentGroup, ((RhyIntroFragmentV2.Args) companion.getArgs((Fragment) this.this$0)).getShutdownDate(), composer, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(RhyIntroFragmentV2 rhyIntroFragmentV2) {
        RhyIntroFragmentV2.Companion companion = RhyIntroFragmentV2.INSTANCE;
        if (((RhyIntroFragmentV2.Args) companion.getArgs((Fragment) rhyIntroFragmentV2)).getMigrationBlockReason() == null) {
            rhyIntroFragmentV2.getReviewChangesCallbacks().onReviewChangesContinueClicked();
        } else {
            RhDialogFragment.Companion companion2 = RhDialogFragment.INSTANCE;
            Context contextRequireContext = rhyIntroFragmentV2.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            RhDialogFragment.Builder positiveButton = companion2.create(contextRequireContext).setTheme(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome).setMessage(((RhyIntroFragmentV2.Args) companion.getArgs((Fragment) rhyIntroFragmentV2)).getMigrationBlockReason()).setPositiveButton(rhyIntroFragmentV2.getString(C11048R.string.general_label_okay));
            FragmentManager childFragmentManager = rhyIntroFragmentV2.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            RhDialogFragment.Builder.show$default(positiveButton, childFragmentManager, "", false, 4, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(RhyIntroFragmentV2 rhyIntroFragmentV2) {
        rhyIntroFragmentV2.getCallbacks().onOptOutClicked();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$4(RhyIntroFragmentV2 rhyIntroFragmentV2, Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Navigator navigator = rhyIntroFragmentV2.getNavigator();
        Context contextRequireContext = rhyIntroFragmentV2.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, uri, null, null, false, null, 60, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$7$lambda$6(RhyIntroFragmentV2 rhyIntroFragmentV2, String valPropRowId) {
        Intrinsics.checkNotNullParameter(valPropRowId, "valPropRowId");
        rhyIntroFragmentV2.getCallbacks().onValuePropClicked(rhyIntroFragmentV2.valPropIdToIndex(valPropRowId));
        return Unit.INSTANCE;
    }
}
