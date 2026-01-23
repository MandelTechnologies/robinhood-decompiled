package com.robinhood.android.retirement.p239ui.uninvested;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.view.result.ActivityResultCaller;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.util.extensions.BaseBottomSheetDialogFragments;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.models.retirement.shared.RetirementUninvestedViewModel;
import com.robinhood.android.navigation.DialogFragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.RetirementRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.retirement.contracts.RetirementUninvestedModal;
import com.robinhood.android.retirement.lib.UninvestedSection;
import com.robinhood.android.retirement.lib.UninvestedSection3;
import com.robinhood.android.retirement.p239ui.uninvested.UninvestedBottomSheetFragment;
import com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.rosetta.converters.retirement.RecommendationsState2;
import com.robinhood.rosetta.converters.retirement.RetirementAccountState2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.RecsRetirementContext;
import com.robinhood.rosetta.eventlogging.RetirementContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.scarlet.ScarletContextWrapper;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: UninvestedBottomSheetFragment.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00172\u00020\u00012\u00020\u0002:\u0001\u0017B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u001a\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\r\u0010\u000e\u001a\u00020\u0006H\u0017¢\u0006\u0002\u0010\u000fJ\t\u0010\u0010\u001a\u00020\u0011H\u0096\u0001R\u0018\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/retirement/ui/uninvested/UninvestedBottomSheetFragment;", "Lcom/robinhood/compose/app/GenericComposeBottomSheetDialogFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-retirement-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class UninvestedBottomSheetFragment extends GenericComposeBottomSheetDialogFragment implements RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(RetirementRegionGate.INSTANCE);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$2(UninvestedBottomSheetFragment uninvestedBottomSheetFragment, int i, Composer composer, int i2) {
        uninvestedBottomSheetFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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
        com.robinhood.rosetta.eventlogging.Context context;
        String serverValue;
        String serverValue2;
        String identifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1774200757);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1774200757, i2, -1, "com.robinhood.android.retirement.ui.uninvested.UninvestedBottomSheetFragment.ComposeContent (UninvestedBottomSheetFragment.kt:45)");
            }
            Companion companion = INSTANCE;
            Screen eventScreen = ((RetirementUninvestedModal) companion.getArgs((Fragment) this)).getEventScreen();
            RetirementUninvestedModal.UninvestedLoggingInfo loggingInfo = ((RetirementUninvestedModal) companion.getArgs((Fragment) this)).getLoggingInfo();
            String identifier2 = loggingInfo != null ? loggingInfo.getIdentifier() : null;
            Component.ComponentType componentType = Component.ComponentType.BOTTOM_SHEET;
            RetirementUninvestedModal.UninvestedLoggingInfo loggingInfo2 = ((RetirementUninvestedModal) companion.getArgs((Fragment) this)).getLoggingInfo();
            Component component = new Component(componentType, (loggingInfo2 == null || (identifier = loggingInfo2.getIdentifier()) == null) ? "" : identifier, null, 4, null);
            RetirementUninvestedModal.UninvestedLoggingInfo loggingInfo3 = ((RetirementUninvestedModal) companion.getArgs((Fragment) this)).getLoggingInfo();
            if (loggingInfo3 != null) {
                BrokerageAccountType accountType = loggingInfo3.getAccountType();
                RetirementContext retirementContext = new RetirementContext((accountType == null || (serverValue2 = accountType.getServerValue()) == null) ? "" : serverValue2, RetirementAccountState2.toProtoBuf(loggingInfo3.getAccountState()), null, 4, null);
                BrokerageAccountType accountType2 = loggingInfo3.getAccountType();
                context = new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new RecsRetirementContext("organic", null, (accountType2 == null || (serverValue = accountType2.getServerValue()) == null) ? "" : serverValue, RecommendationsState2.toProtoBuf(loggingInfo3.getRecsState()), null, 18, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, retirementContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -134217729, -32769, -1, -1, 16383, null);
            } else {
                context = null;
            }
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(identifier2, eventScreen, null, context, component, null, 36, null), ComposableLambda3.rememberComposableLambda(2143722614, true, new C272952(), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.ui.uninvested.UninvestedBottomSheetFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UninvestedBottomSheetFragment.ComposeContent$lambda$2(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: UninvestedBottomSheetFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.retirement.ui.uninvested.UninvestedBottomSheetFragment$ComposeContent$2 */
    static final class C272952 implements Function2<Composer, Integer, Unit> {
        C272952() {
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
                ComposerKt.traceEventStart(2143722614, i, -1, "com.robinhood.android.retirement.ui.uninvested.UninvestedBottomSheetFragment.ComposeContent.<anonymous> (UninvestedBottomSheetFragment.kt:69)");
            }
            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, null, true, false, false, false, false, null, 125, null);
            RetirementUninvestedViewModel.Modal modalState = ((RetirementUninvestedModal) UninvestedBottomSheetFragment.INSTANCE.getArgs((Fragment) UninvestedBottomSheetFragment.this)).getModalState();
            UninvestedSection uninvestedSection = UninvestedSection.BottomSheet;
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(UninvestedBottomSheetFragment.this);
            final UninvestedBottomSheetFragment uninvestedBottomSheetFragment = UninvestedBottomSheetFragment.this;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.retirement.ui.uninvested.UninvestedBottomSheetFragment$ComposeContent$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return UninvestedBottomSheetFragment.C272952.invoke$lambda$1$lambda$0(uninvestedBottomSheetFragment, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            UninvestedSection3.UninvestedContent(modifierAutoLogEvents$default, modalState, uninvestedSection, (Function1) objRememberedValue, composer, 384, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(UninvestedBottomSheetFragment uninvestedBottomSheetFragment, String deeplink) {
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            Navigator navigator = uninvestedBottomSheetFragment.getNavigator();
            Context contextRequireContext = uninvestedBottomSheetFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, Uri.parse(deeplink), null, null, false, null, 60, null);
            ActivityResultCaller parentFragment = uninvestedBottomSheetFragment.getParentFragment();
            RetirementUninvestedModal.Callbacks callbacks = parentFragment instanceof RetirementUninvestedModal.Callbacks ? (RetirementUninvestedModal.Callbacks) parentFragment : null;
            if (callbacks != null) {
                callbacks.onUninvestedBottomSheetDeeplinkHandled(deeplink);
            }
            uninvestedBottomSheetFragment.dismiss();
            return Unit.INSTANCE;
        }
    }

    /* compiled from: UninvestedBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/retirement/ui/uninvested/UninvestedBottomSheetFragment$Companion;", "Lcom/robinhood/android/navigation/DialogFragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/retirement/ui/uninvested/UninvestedBottomSheetFragment;", "Lcom/robinhood/android/retirement/contracts/RetirementUninvestedModal;", "<init>", "()V", "feature-retirement-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DialogFragmentResolverWithArgsCompanion<UninvestedBottomSheetFragment, RetirementUninvestedModal> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.DialogFragmentResolverWithArgsCompanion, com.robinhood.android.navigation.DialogFragmentResolver
        public UninvestedBottomSheetFragment createDialogFragment(RetirementUninvestedModal retirementUninvestedModal) {
            return (UninvestedBottomSheetFragment) DialogFragmentResolverWithArgsCompanion.DefaultImpls.createDialogFragment(this, retirementUninvestedModal);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public RetirementUninvestedModal getArgs(UninvestedBottomSheetFragment uninvestedBottomSheetFragment) {
            return (RetirementUninvestedModal) DialogFragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, uninvestedBottomSheetFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public UninvestedBottomSheetFragment newInstance(RetirementUninvestedModal retirementUninvestedModal) {
            return (UninvestedBottomSheetFragment) DialogFragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, retirementUninvestedModal);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(UninvestedBottomSheetFragment uninvestedBottomSheetFragment, RetirementUninvestedModal retirementUninvestedModal) {
            DialogFragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, uninvestedBottomSheetFragment, retirementUninvestedModal);
        }
    }
}
