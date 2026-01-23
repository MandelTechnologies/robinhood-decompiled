package com.robinhood.android.retirement.onboarding.eligibility.ineligible;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.util.extensions.BaseBottomSheetDialogFragments;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.navigation.DialogFragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.RetirementRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.retirement.contracts.RetirementIneligibleBottomSheetKey;
import com.robinhood.android.retirement.lib.C27011R;
import com.robinhood.android.retirement.lib.RetirementFlowDeeplinkExitManager;
import com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.scarlet.ScarletContextWrapper;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RetirementSignUpIneligibleBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \"2\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\"B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001a\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\r\u0010\u0014\u001a\u00020\fH\u0017¢\u0006\u0002\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0014J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0004H\u0016J\t\u0010\u001c\u001a\u00020\u001aH\u0096\u0001R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/eligibility/ineligible/RetirementSignUpIneligibleBottomSheet;", "Lcom/robinhood/compose/app/GenericComposeBottomSheetDialogFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "<init>", "()V", "dialogId", "", "getDialogId", "()I", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onDismiss", "activity", "Landroid/app/Activity;", "handle", "", "action", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class RetirementSignUpIneligibleBottomSheet extends GenericComposeBottomSheetDialogFragment implements RegionGated, SduiActionHandler<GenericAction> {
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(RetirementRegionGate.INSTANCE);
    private final int dialogId = C27011R.id.dialog_retirement_sign_up_ineligible;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(RetirementSignUpIneligibleBottomSheet retirementSignUpIneligibleBottomSheet, int i, Composer composer, int i2) {
        retirementSignUpIneligibleBottomSheet.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment
    public int getDialogId() {
        return this.dialogId;
    }

    @Override // com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, com.robinhood.hammer.android.fragment.HammerDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseBottomSheetDialogFragments.enforceMaxHeight$default(this, view, 0.0f, 2, null);
    }

    @Override // com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1664876052);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1664876052, i2, -1, "com.robinhood.android.retirement.onboarding.eligibility.ineligible.RetirementSignUpIneligibleBottomSheet.ComposeContent (RetirementSignUpIneligibleBottomSheet.kt:46)");
            }
            Companion companion = INSTANCE;
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, ((RetirementIneligibleBottomSheetKey) companion.getArgs((Fragment) this)).getHostScreen(), null, null, new Component(Component.ComponentType.BOTTOM_SHEET, ((RetirementIneligibleBottomSheetKey) companion.getArgs((Fragment) this)).getBottomSheetState().getLogging_identifier(), null, 4, null), null, 45, null), ComposableLambda3.rememberComposableLambda(1289832639, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.onboarding.eligibility.ineligible.RetirementSignUpIneligibleBottomSheet.ComposeContent.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1289832639, i3, -1, "com.robinhood.android.retirement.onboarding.eligibility.ineligible.RetirementSignUpIneligibleBottomSheet.ComposeContent.<anonymous> (RetirementSignUpIneligibleBottomSheet.kt:56)");
                    }
                    final RetirementSignUpIneligibleBottomSheet retirementSignUpIneligibleBottomSheet = RetirementSignUpIneligibleBottomSheet.this;
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1687702636, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.onboarding.eligibility.ineligible.RetirementSignUpIneligibleBottomSheet.ComposeContent.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i4) {
                            if ((i4 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1687702636, i4, -1, "com.robinhood.android.retirement.onboarding.eligibility.ineligible.RetirementSignUpIneligibleBottomSheet.ComposeContent.<anonymous>.<anonymous> (RetirementSignUpIneligibleBottomSheet.kt:57)");
                            }
                            RetirementSignUpIneligibleBottomSheetContent.RetirementSignUpIneligibleBottomSheetContent(((RetirementIneligibleBottomSheetKey) RetirementSignUpIneligibleBottomSheet.INSTANCE.getArgs((Fragment) retirementSignUpIneligibleBottomSheet)).getBottomSheetState(), retirementSignUpIneligibleBottomSheet, null, composer3, 0, 4);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.onboarding.eligibility.ineligible.RetirementSignUpIneligibleBottomSheet$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RetirementSignUpIneligibleBottomSheet.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment
    protected void onDismiss(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        super.onDismiss(activity);
        if (((RetirementIneligibleBottomSheetKey) INSTANCE.getArgs((Fragment) this)).getShouldFinishActivityOnDismiss()) {
            RetirementFlowDeeplinkExitManager.INSTANCE.setRetirementSignUpFlowExitedByDeeplink(Boolean.TRUE);
            activity.finish();
        }
    }

    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
    /* renamed from: handle, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean mo15941handle(GenericAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof GenericAction.Deeplink) {
            Uri uri = Uri.parse(((GenericAction.Deeplink) action).getValue2().getUri());
            Navigator navigator = getNavigator();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, uri, null, null, false, null, 60, null);
            dismiss();
            return true;
        }
        if (action instanceof GenericAction.Dismiss) {
            dismiss();
            return true;
        }
        if (action instanceof GenericAction.InfoAlert) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* compiled from: RetirementSignUpIneligibleBottomSheet.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/eligibility/ineligible/RetirementSignUpIneligibleBottomSheet$Companion;", "Lcom/robinhood/android/navigation/DialogFragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/retirement/onboarding/eligibility/ineligible/RetirementSignUpIneligibleBottomSheet;", "Lcom/robinhood/android/retirement/contracts/RetirementIneligibleBottomSheetKey;", "<init>", "()V", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DialogFragmentResolverWithArgsCompanion<RetirementSignUpIneligibleBottomSheet, RetirementIneligibleBottomSheetKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.DialogFragmentResolverWithArgsCompanion, com.robinhood.android.navigation.DialogFragmentResolver
        public RetirementSignUpIneligibleBottomSheet createDialogFragment(RetirementIneligibleBottomSheetKey retirementIneligibleBottomSheetKey) {
            return (RetirementSignUpIneligibleBottomSheet) DialogFragmentResolverWithArgsCompanion.DefaultImpls.createDialogFragment(this, retirementIneligibleBottomSheetKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public RetirementIneligibleBottomSheetKey getArgs(RetirementSignUpIneligibleBottomSheet retirementSignUpIneligibleBottomSheet) {
            return (RetirementIneligibleBottomSheetKey) DialogFragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, retirementSignUpIneligibleBottomSheet);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RetirementSignUpIneligibleBottomSheet newInstance(RetirementIneligibleBottomSheetKey retirementIneligibleBottomSheetKey) {
            return (RetirementSignUpIneligibleBottomSheet) DialogFragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, retirementIneligibleBottomSheetKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RetirementSignUpIneligibleBottomSheet retirementSignUpIneligibleBottomSheet, RetirementIneligibleBottomSheetKey retirementIneligibleBottomSheetKey) {
            DialogFragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, retirementSignUpIneligibleBottomSheet, retirementIneligibleBottomSheetKey);
        }
    }
}
