package com.robinhood.android.jointaccounts.onboarding.confirmation.submit;

import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.isa.isatransferdetail.IsaTransferDetailComposable3;
import com.robinhood.android.jointaccounts.onboarding.UtilsKt;
import com.robinhood.android.jointaccounts.onboarding.confirmation.submit.JointAccountSubmitConfirmationFragment;
import com.robinhood.android.jointaccounts.onboarding.creation.AccountCreationScreen;
import com.robinhood.android.jointaccounts.onboarding.creation.AccountCreationScreen2;
import com.robinhood.android.jointaccounts.onboarding.creation.InvitationState;
import com.robinhood.android.jointaccounts.onboarding.creation.JointAccountCreatedViewState;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.JointAccountsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: JointAccountSubmitConfirmationFragment.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\b\u0007\u0018\u0000 *2\u00020\u00012\u00020\u00022\u00020\u0003:\u0003()*B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0016\u001a\u00020\u0017H\u0017¢\u0006\u0002\u0010\u0018J\b\u0010\u0019\u001a\u00020\u0017H\u0016J\b\u0010\u001a\u001a\u00020\u0017H\u0016J\u001a\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010 \u001a\u00020\u0017H\u0016J\b\u0010!\u001a\u00020\u0017H\u0016J\t\u0010\"\u001a\u00020\u0013H\u0096\u0001R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u0013X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$X\u0096\u0005¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006+²\u0006\n\u0010,\u001a\u00020-X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/confirmation/submit/JointAccountSubmitConfirmationFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/jointaccounts/onboarding/creation/AccountCreationScreenCallbacks;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/jointaccounts/onboarding/confirmation/submit/JointAccountSubmitConfirmationFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/jointaccounts/onboarding/confirmation/submit/JointAccountSubmitConfirmationFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/jointaccounts/onboarding/confirmation/submit/JointAccountSubmitConfirmationDuxo;", "getDuxo", "()Lcom/robinhood/android/jointaccounts/onboarding/confirmation/submit/JointAccountSubmitConfirmationDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "toolbarVisible", "", "getToolbarVisible", "()Z", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "onCloseClicked", "onContactSupportClicked", "onContinueClicked", "invitationState", "Lcom/robinhood/android/jointaccounts/onboarding/creation/InvitationState;", "deeplinkTemplate", "", "onRetryFetchingAccountClicked", "onRetryInitializationClicked", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Args", "Companion", "feature-joint-account-onboarding_externalDebug", "viewState", "Lcom/robinhood/android/jointaccounts/onboarding/creation/JointAccountCreatedViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class JointAccountSubmitConfirmationFragment extends GenericComposeFragment implements RegionGated, AccountCreationScreen {
    public static final int $stable = 0;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(JointAccountsRegionGate.INSTANCE);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.jointaccounts.onboarding.confirmation.submit.JointAccountSubmitConfirmationFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof JointAccountSubmitConfirmationFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, JointAccountSubmitConfirmationDuxo.class);
    private final boolean toolbarVisible;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(JointAccountSubmitConfirmationFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/jointaccounts/onboarding/confirmation/submit/JointAccountSubmitConfirmationFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: JointAccountSubmitConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/confirmation/submit/JointAccountSubmitConfirmationFragment$Callbacks;", "", "onAccountCreated", "", "accountNumber", "", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onAccountCreated(String accountNumber);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(JointAccountSubmitConfirmationFragment jointAccountSubmitConfirmationFragment, int i, Composer composer, int i2) {
        jointAccountSubmitConfirmationFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final JointAccountSubmitConfirmationDuxo getDuxo() {
        return (JointAccountSubmitConfirmationDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-417333633);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-417333633, i2, -1, "com.robinhood.android.jointaccounts.onboarding.confirmation.submit.JointAccountSubmitConfirmationFragment.ComposeContent (JointAccountSubmitConfirmationFragment.kt:37)");
            }
            AccountCreationScreen2.AccountCreationScreen(ComposeContent$lambda$0(FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7)), this, null, composerStartRestartGroup, (i2 << 3) & 112, 4);
            composer2 = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.jointaccounts.onboarding.confirmation.submit.JointAccountSubmitConfirmationFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return JointAccountSubmitConfirmationFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.android.jointaccounts.onboarding.creation.AccountCreationScreen
    public void onCloseClicked() {
        requireBaseActivity().finish();
    }

    @Override // com.robinhood.android.jointaccounts.onboarding.creation.AccountCreationScreen
    public void onContactSupportClicked() {
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, Uri.parse(IsaTransferDetailComposable3.CONTACT_SUPPORT_DEEPLINK), null, null, false, null, 60, null);
    }

    @Override // com.robinhood.android.jointaccounts.onboarding.creation.AccountCreationScreen
    public void onContinueClicked(InvitationState invitationState, String deeplinkTemplate) {
        Intrinsics.checkNotNullParameter(invitationState, "invitationState");
        if (invitationState instanceof InvitationState.Complete) {
            String strApplyAccountNumberTemplate = deeplinkTemplate != null ? UtilsKt.applyAccountNumberTemplate(deeplinkTemplate, ((InvitationState.Complete) invitationState).getAccountNumber()) : null;
            if (strApplyAccountNumberTemplate != null) {
                Navigator navigator = getNavigator();
                Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, Uri.parse(strApplyAccountNumberTemplate), null, null, false, null, 60, null);
            }
            requireBaseActivity().finish();
            return;
        }
        if (!(invitationState instanceof InvitationState.Incomplete)) {
            throw new NoWhenBranchMatchedException();
        }
        requireBaseActivity().finish();
    }

    @Override // com.robinhood.android.jointaccounts.onboarding.creation.AccountCreationScreen
    public void onRetryFetchingAccountClicked() {
        getDuxo().retryFetchAccount();
    }

    @Override // com.robinhood.android.jointaccounts.onboarding.creation.AccountCreationScreen
    public void onRetryInitializationClicked() {
        getDuxo().retryInitialization();
    }

    /* compiled from: JointAccountSubmitConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/confirmation/submit/JointAccountSubmitConfirmationFragment$Args;", "Landroid/os/Parcelable;", "invitationId", "", "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getInvitationId", "()Ljava/lang/String;", "getSource", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String invitationId;
        private final String source;

        /* compiled from: JointAccountSubmitConfirmationFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.invitationId;
            }
            if ((i & 2) != 0) {
                str2 = args.source;
            }
            return args.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getInvitationId() {
            return this.invitationId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public final Args copy(String invitationId, String source) {
            Intrinsics.checkNotNullParameter(invitationId, "invitationId");
            Intrinsics.checkNotNullParameter(source, "source");
            return new Args(invitationId, source);
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
            return Intrinsics.areEqual(this.invitationId, args.invitationId) && Intrinsics.areEqual(this.source, args.source);
        }

        public int hashCode() {
            return (this.invitationId.hashCode() * 31) + this.source.hashCode();
        }

        public String toString() {
            return "Args(invitationId=" + this.invitationId + ", source=" + this.source + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.invitationId);
            dest.writeString(this.source);
        }

        public Args(String invitationId, String source) {
            Intrinsics.checkNotNullParameter(invitationId, "invitationId");
            Intrinsics.checkNotNullParameter(source, "source");
            this.invitationId = invitationId;
            this.source = source;
        }

        public final String getInvitationId() {
            return this.invitationId;
        }

        public final String getSource() {
            return this.source;
        }
    }

    private static final JointAccountCreatedViewState ComposeContent$lambda$0(SnapshotState4<? extends JointAccountCreatedViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* compiled from: JointAccountSubmitConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/confirmation/submit/JointAccountSubmitConfirmationFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/jointaccounts/onboarding/confirmation/submit/JointAccountSubmitConfirmationFragment;", "Lcom/robinhood/android/jointaccounts/onboarding/confirmation/submit/JointAccountSubmitConfirmationFragment$Args;", "<init>", "()V", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<JointAccountSubmitConfirmationFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(JointAccountSubmitConfirmationFragment jointAccountSubmitConfirmationFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, jointAccountSubmitConfirmationFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public JointAccountSubmitConfirmationFragment newInstance(Args args) {
            return (JointAccountSubmitConfirmationFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(JointAccountSubmitConfirmationFragment jointAccountSubmitConfirmationFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, jointAccountSubmitConfirmationFragment, args);
        }
    }
}
