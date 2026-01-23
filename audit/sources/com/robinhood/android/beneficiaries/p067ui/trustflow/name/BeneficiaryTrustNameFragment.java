package com.robinhood.android.beneficiaries.p067ui.trustflow.name;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryFlowTrustNameViewModel;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.beneficiaries.C9637R;
import com.robinhood.android.beneficiaries.p067ui.trustflow.BeneficiaryTrustFlowToolbarViewState;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlingFragment;
import com.robinhood.android.regiongate.BeneficiariesRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;

/* compiled from: BeneficiaryTrustNameFragment.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\b\u0007\u0018\u0000 %2\u00020\u00012\u00020\u00022\u00020\u0003:\u0003#$%B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\r\u0010\u001a\u001a\u00020\u0017H\u0017¢\u0006\u0002\u0010\u001bJ\t\u0010\u001c\u001a\u00020\u001dH\u0096\u0001R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fX\u0096\u0005¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006&²\u0006\n\u0010'\u001a\u00020(X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/trustflow/name/BeneficiaryTrustNameFragment;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/action/GenericActionHandlingFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/android/beneficiaries/ui/trustflow/name/BeneficiaryTrustNameDuxo;", "getDuxo", "()Lcom/robinhood/android/beneficiaries/ui/trustflow/name/BeneficiaryTrustNameDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/android/beneficiaries/ui/trustflow/name/BeneficiaryTrustNameFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/beneficiaries/ui/trustflow/name/BeneficiaryTrustNameFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Args", "Companion", "feature-beneficiaries_externalDebug", "viewState", "Lcom/robinhood/android/beneficiaries/ui/trustflow/name/BeneficiaryTrustNameViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class BeneficiaryTrustNameFragment extends GenericActionHandlingFragment implements RegionGated, AutoLoggableFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(BeneficiaryTrustNameFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/beneficiaries/ui/trustflow/name/BeneficiaryTrustNameFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(BeneficiariesRegionGate.INSTANCE);

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, BeneficiaryTrustNameDuxo.class);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.beneficiaries.ui.trustflow.name.BeneficiaryTrustNameFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });

    /* compiled from: BeneficiaryTrustNameFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/trustflow/name/BeneficiaryTrustNameFragment$Callbacks;", "", "beneficiaryTrustNameConfirmed", "", "name", "", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void beneficiaryTrustNameConfirmed(String name);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(BeneficiaryTrustNameFragment beneficiaryTrustNameFragment, int i, Composer composer, int i2) {
        beneficiaryTrustNameFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenAppearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenDisappearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenSourceEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenSourceEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Component getScreenEventComponent() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventComponent(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BeneficiaryTrustNameDuxo getDuxo() {
        return (BeneficiaryTrustNameDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return new Screen(Screen.Name.BENEFICIARY_TRUST_NAME_INPUT, null, String.valueOf(((Args) INSTANCE.getArgs((Fragment) this)).getTrustNameViewModel().getLogging_identifier().getValue()), null, 10, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        Companion companion = INSTANCE;
        if (((Args) companion.getArgs((Fragment) this)).getTrustNameViewModel().getTrust_name_value() == null) {
            toolbar.setTitle(C9637R.string.beneficiary_create_steps_title_create);
        } else {
            toolbar.setTitle(C9637R.string.beneficiary_create_steps_title_edit);
        }
        toolbar.getProgressBar().setVisibility(0);
        toolbar.getProgressBar().setNumSegments(((Args) companion.getArgs((Fragment) this)).getToolbarViewState().getStepCount());
        toolbar.getProgressBar().setProgress(((Args) companion.getArgs((Fragment) this)).getToolbarViewState().getStepIndex(), ((Args) companion.getArgs((Fragment) this)).getToolbarViewState().getStepProgress(), true);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1119672943);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1119672943, i2, -1, "com.robinhood.android.beneficiaries.ui.trustflow.name.BeneficiaryTrustNameFragment.ComposeContent (BeneficiaryTrustNameFragment.kt:60)");
            }
            final SnapshotState4 snapshotState4CollectAsState = SnapshotStateKt.collectAsState(getDuxo().getStateFlow(), null, composerStartRestartGroup, 0, 1);
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(2011767078, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.beneficiaries.ui.trustflow.name.BeneficiaryTrustNameFragment.ComposeContent.1
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
                        ComposerKt.traceEventStart(2011767078, i3, -1, "com.robinhood.android.beneficiaries.ui.trustflow.name.BeneficiaryTrustNameFragment.ComposeContent.<anonymous> (BeneficiaryTrustNameFragment.kt:64)");
                    }
                    BeneficiaryTrustNameViewState beneficiaryTrustNameViewStateComposeContent$lambda$0 = BeneficiaryTrustNameFragment.ComposeContent$lambda$0(snapshotState4CollectAsState);
                    final BeneficiaryTrustNameFragment beneficiaryTrustNameFragment = this;
                    final SnapshotState4<BeneficiaryTrustNameViewState> snapshotState4 = snapshotState4CollectAsState;
                    BeneficiaryTrustNameCompose.BeneficiaryTrustNameScaffold(beneficiaryTrustNameViewStateComposeContent$lambda$0, new BeneficiaryTrustNameCallbacks() { // from class: com.robinhood.android.beneficiaries.ui.trustflow.name.BeneficiaryTrustNameFragment.ComposeContent.1.1
                        @Override // com.robinhood.android.beneficiaries.p067ui.trustflow.name.BeneficiaryTrustNameCallbacks
                        public void onTrustNameConfirmed() {
                            beneficiaryTrustNameFragment.getCallbacks().beneficiaryTrustNameConfirmed(StringsKt.trim(BeneficiaryTrustNameFragment.ComposeContent$lambda$0(snapshotState4).getTrustNameInputString()).toString());
                        }

                        @Override // com.robinhood.android.beneficiaries.p067ui.trustflow.name.BeneficiaryTrustNameCallbacks
                        public void onTrustNameInput(String input) {
                            Intrinsics.checkNotNullParameter(input, "input");
                            beneficiaryTrustNameFragment.getDuxo().onTrustNameInput(input);
                        }
                    }, null, composer2, 0, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.beneficiaries.ui.trustflow.name.BeneficiaryTrustNameFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BeneficiaryTrustNameFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: BeneficiaryTrustNameFragment.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/trustflow/name/BeneficiaryTrustNameFragment$Args;", "Landroid/os/Parcelable;", "trustNameViewModel", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustNameViewModel;", "toolbarViewState", "Lcom/robinhood/android/beneficiaries/ui/trustflow/BeneficiaryTrustFlowToolbarViewState;", "<init>", "(Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustNameViewModel;Lcom/robinhood/android/beneficiaries/ui/trustflow/BeneficiaryTrustFlowToolbarViewState;)V", "getTrustNameViewModel", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustNameViewModel;", "getToolbarViewState", "()Lcom/robinhood/android/beneficiaries/ui/trustflow/BeneficiaryTrustFlowToolbarViewState;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final BeneficiaryTrustFlowToolbarViewState toolbarViewState;
        private final BeneficiaryFlowTrustNameViewModel trustNameViewModel;

        /* compiled from: BeneficiaryTrustNameFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((BeneficiaryFlowTrustNameViewModel) parcel.readSerializable(), BeneficiaryTrustFlowToolbarViewState.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, BeneficiaryFlowTrustNameViewModel beneficiaryFlowTrustNameViewModel, BeneficiaryTrustFlowToolbarViewState beneficiaryTrustFlowToolbarViewState, int i, Object obj) {
            if ((i & 1) != 0) {
                beneficiaryFlowTrustNameViewModel = args.trustNameViewModel;
            }
            if ((i & 2) != 0) {
                beneficiaryTrustFlowToolbarViewState = args.toolbarViewState;
            }
            return args.copy(beneficiaryFlowTrustNameViewModel, beneficiaryTrustFlowToolbarViewState);
        }

        /* renamed from: component1, reason: from getter */
        public final BeneficiaryFlowTrustNameViewModel getTrustNameViewModel() {
            return this.trustNameViewModel;
        }

        /* renamed from: component2, reason: from getter */
        public final BeneficiaryTrustFlowToolbarViewState getToolbarViewState() {
            return this.toolbarViewState;
        }

        public final Args copy(BeneficiaryFlowTrustNameViewModel trustNameViewModel, BeneficiaryTrustFlowToolbarViewState toolbarViewState) {
            Intrinsics.checkNotNullParameter(trustNameViewModel, "trustNameViewModel");
            Intrinsics.checkNotNullParameter(toolbarViewState, "toolbarViewState");
            return new Args(trustNameViewModel, toolbarViewState);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return Intrinsics.areEqual(this.trustNameViewModel, args.trustNameViewModel) && Intrinsics.areEqual(this.toolbarViewState, args.toolbarViewState);
        }

        public int hashCode() {
            return (this.trustNameViewModel.hashCode() * 31) + this.toolbarViewState.hashCode();
        }

        public String toString() {
            return "Args(trustNameViewModel=" + this.trustNameViewModel + ", toolbarViewState=" + this.toolbarViewState + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.trustNameViewModel);
            this.toolbarViewState.writeToParcel(dest, flags);
        }

        public Args(BeneficiaryFlowTrustNameViewModel trustNameViewModel, BeneficiaryTrustFlowToolbarViewState toolbarViewState) {
            Intrinsics.checkNotNullParameter(trustNameViewModel, "trustNameViewModel");
            Intrinsics.checkNotNullParameter(toolbarViewState, "toolbarViewState");
            this.trustNameViewModel = trustNameViewModel;
            this.toolbarViewState = toolbarViewState;
        }

        public final BeneficiaryFlowTrustNameViewModel getTrustNameViewModel() {
            return this.trustNameViewModel;
        }

        public final BeneficiaryTrustFlowToolbarViewState getToolbarViewState() {
            return this.toolbarViewState;
        }
    }

    /* compiled from: BeneficiaryTrustNameFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/trustflow/name/BeneficiaryTrustNameFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/beneficiaries/ui/trustflow/name/BeneficiaryTrustNameFragment;", "Lcom/robinhood/android/beneficiaries/ui/trustflow/name/BeneficiaryTrustNameFragment$Args;", "<init>", "()V", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<BeneficiaryTrustNameFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(BeneficiaryTrustNameFragment beneficiaryTrustNameFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, beneficiaryTrustNameFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public BeneficiaryTrustNameFragment newInstance(Args args) {
            return (BeneficiaryTrustNameFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(BeneficiaryTrustNameFragment beneficiaryTrustNameFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, beneficiaryTrustNameFragment, args);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BeneficiaryTrustNameViewState ComposeContent$lambda$0(SnapshotState4<BeneficiaryTrustNameViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
