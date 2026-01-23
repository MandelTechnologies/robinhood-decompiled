package com.robinhood.shared.crypto.transfer.enrollment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.navigation.DeepLinkOrigin;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.CryptoRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.librobinhood.data.store.CryptoExperimentsStore;
import com.robinhood.models.api.transfer.ApiCryptoTransferConfig;
import com.robinhood.models.api.transfer.CryptoTransferAction;
import com.robinhood.shared.crypto.transfer.enrollment.EnrollmentParentV2Fragment;
import com.robinhood.shared.crypto.transfer.enrollment.agreement.EnrollmentAgreementFragment;
import com.robinhood.shared.crypto.transfer.enrollment.checklist.EnrollmentChecklistV2Fragment;
import com.robinhood.shared.crypto.transfer.enrollment.mfa.CryptoEnrollmentMfaParentFragment;
import com.robinhood.shared.crypto.transfer.enrollment.navigation.EnrollmentDestination;
import com.robinhood.shared.crypto.transfer.enrollment.navigation.EnrollmentEvent;
import com.robinhood.shared.crypto.transfer.enrollment.navigation.EnrollmentEventReceiver;
import com.robinhood.shared.crypto.transfer.enrollment.navigation.EnrollmentEventReducer;
import com.robinhood.shared.crypto.transfer.enrollment.protect.EnrollmentProtectFragment;
import com.robinhood.shared.crypto.transfer.enrollment.resolution.EnrollmentCompletedFragment;
import com.robinhood.shared.crypto.transfer.enrollment.resolution.EnrollmentErrorFragment;
import com.robinhood.shared.crypto.transfer.enrollment.resolution.EnrollmentPendingApprovalFragment;
import com.robinhood.shared.crypto.transfer.enrollment.valueProps.WalletEnrollmentValuePropsFragment;
import com.robinhood.shared.crypto.transfer.enrollment.valueProps.loading.WalletEnrollmentLoadingFragment;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: EnrollmentParentV2Fragment.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 /2\u00020\u00012\u00020\u00022\u00020\u0003:\u0003-./B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0012\u0010!\u001a\u00020\u00192\b\u0010\"\u001a\u0004\u0018\u00010#H\u0002J\u0010\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020&H\u0002J\t\u0010'\u001a\u00020\u001dH\u0096\u0001R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0018\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)X\u0096\u0005¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u00060"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/EnrollmentParentV2Fragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentEventReceiver;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "callbacks", "Lcom/robinhood/shared/crypto/transfer/enrollment/EnrollmentParentV2Fragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/shared/crypto/transfer/enrollment/EnrollmentParentV2Fragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "getCryptoExperimentsStore", "()Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "setCryptoExperimentsStore", "(Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;)V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onBackPressed", "", "onEvent", "event", "Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentEvent;", "navigate", "destination", "Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentDestination;", "setOrReplaceFragment", "fragment", "Landroidx/fragment/app/Fragment;", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Args", "Companion", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class EnrollmentParentV2Fragment extends BaseFragment implements EnrollmentEventReceiver, RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    public CryptoExperimentsStore cryptoExperimentsStore;
    public EventLogger eventLogger;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(EnrollmentParentV2Fragment.class, "callbacks", "getCallbacks()Lcom/robinhood/shared/crypto/transfer/enrollment/EnrollmentParentV2Fragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: EnrollmentParentV2Fragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0012\u0010\u0005\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/EnrollmentParentV2Fragment$Callbacks;", "", "navigateToReceive", "", "navigateToSend", "exitTransfers", "exitDeeplink", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void exitTransfers(String exitDeeplink);

        void navigateToReceive();

        void navigateToSend();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public EnrollmentParentV2Fragment() {
        super(C11048R.layout.parent_fragment_container);
        this.$$delegate_0 = new RegionGated2(CryptoRegionGate.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.shared.crypto.transfer.enrollment.EnrollmentParentV2Fragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof EnrollmentParentV2Fragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    public final CryptoExperimentsStore getCryptoExperimentsStore() {
        CryptoExperimentsStore cryptoExperimentsStore = this.cryptoExperimentsStore;
        if (cryptoExperimentsStore != null) {
            return cryptoExperimentsStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("cryptoExperimentsStore");
        return null;
    }

    public final void setCryptoExperimentsStore(CryptoExperimentsStore cryptoExperimentsStore) {
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "<set-?>");
        this.cryptoExperimentsStore = cryptoExperimentsStore;
    }

    public final EventLogger getEventLogger() {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            return eventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<set-?>");
        this.eventLogger = eventLogger;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            onEvent(new EnrollmentEvent.Start(((Args) INSTANCE.getArgs((Fragment) this)).getEnrollmentState()));
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        Fragment currentFragment = getCurrentFragment();
        if ((currentFragment instanceof WalletEnrollmentValuePropsFragment) || (currentFragment instanceof EnrollmentChecklistV2Fragment) || (currentFragment instanceof EnrollmentAgreementFragment) || (currentFragment instanceof EnrollmentPendingApprovalFragment) || (currentFragment instanceof EnrollmentErrorFragment)) {
            getCallbacks().exitTransfers(null);
            return true;
        }
        if (currentFragment instanceof EnrollmentCompletedFragment) {
            getCallbacks().exitTransfers(((EnrollmentCompletedFragment.Args) EnrollmentCompletedFragment.INSTANCE.getArgs(currentFragment)).getExitDeeplink());
            return true;
        }
        return super.onBackPressed();
    }

    @Override // com.robinhood.shared.crypto.transfer.enrollment.navigation.EnrollmentEventReceiver
    public void onEvent(EnrollmentEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        navigate(new EnrollmentEventReducer(getEventLogger()).reduce(((Args) INSTANCE.getArgs((Fragment) this)).getAction(), event));
    }

    private final void navigate(EnrollmentDestination destination) {
        if (Intrinsics.areEqual(destination, EnrollmentDestination.IntroLoading.INSTANCE)) {
            setFragment(C11048R.id.fragment_container, WalletEnrollmentLoadingFragment.INSTANCE.newInstance());
            return;
        }
        if (destination instanceof EnrollmentDestination.Intro) {
            setFragment(C11048R.id.fragment_container, WalletEnrollmentValuePropsFragment.INSTANCE.newInstance((Parcelable) new WalletEnrollmentValuePropsFragment.Args(((EnrollmentDestination.Intro) destination).getFiles())));
            return;
        }
        if (Intrinsics.areEqual(destination, EnrollmentDestination.Protection.INSTANCE)) {
            setOrReplaceFragment(EnrollmentProtectFragment.INSTANCE.newInstance());
            return;
        }
        if (destination instanceof EnrollmentDestination.Agreement) {
            setOrReplaceFragment(EnrollmentAgreementFragment.INSTANCE.newInstance((Parcelable) new EnrollmentAgreementFragment.Args(((Args) INSTANCE.getArgs((Fragment) this)).getAction())));
            return;
        }
        if (destination instanceof EnrollmentDestination.Checklist) {
            setOrReplaceFragment(EnrollmentChecklistV2Fragment.INSTANCE.newInstance());
            return;
        }
        if (destination instanceof EnrollmentDestination.DocumentUpload) {
            Navigator navigator = getNavigator();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            startActivity((Intent) ArraysKt.last(Navigator.DefaultImpls.resolveDeepLink$default(navigator, contextRequireContext, ((EnrollmentDestination.DocumentUpload) destination).getDeeplinkUri(), Boolean.TRUE, DeepLinkOrigin.Internal.INSTANCE, false, 16, null)));
            return;
        }
        if (destination instanceof EnrollmentDestination.TwoFactorAuth) {
            setOrReplaceFragment(CryptoEnrollmentMfaParentFragment.INSTANCE.newInstance((Parcelable) new CryptoEnrollmentMfaParentFragment.Args(((Args) INSTANCE.getArgs((Fragment) this)).getAction())));
            return;
        }
        if (Intrinsics.areEqual(destination, EnrollmentDestination.NavigateToReceive.INSTANCE)) {
            getCallbacks().navigateToReceive();
            return;
        }
        if (Intrinsics.areEqual(destination, EnrollmentDestination.NavigateToSend.INSTANCE)) {
            getCallbacks().navigateToSend();
            return;
        }
        if (Intrinsics.areEqual(destination, EnrollmentDestination.PopBack.INSTANCE)) {
            popLastFragment();
            return;
        }
        if (Intrinsics.areEqual(destination, EnrollmentDestination.Completed.INSTANCE)) {
            setOrReplaceFragment(EnrollmentCompletedFragment.INSTANCE.newInstance((Parcelable) new EnrollmentCompletedFragment.Args(((Args) INSTANCE.getArgs((Fragment) this)).getExitDeeplinkEnrollmentCompleted())));
            return;
        }
        if (Intrinsics.areEqual(destination, EnrollmentDestination.Pending.INSTANCE)) {
            setOrReplaceFragment(EnrollmentPendingApprovalFragment.INSTANCE.newInstance());
            return;
        }
        if (Intrinsics.areEqual(destination, EnrollmentDestination.Error.INSTANCE)) {
            setOrReplaceFragment(EnrollmentErrorFragment.INSTANCE.newInstance());
        } else if (destination instanceof EnrollmentDestination.Exit) {
            getCallbacks().exitTransfers(((EnrollmentDestination.Exit) destination).getExitDeeplink());
        } else if (destination != null) {
            throw new NoWhenBranchMatchedException();
        }
    }

    private final void setOrReplaceFragment(Fragment fragment) {
        setOrReplaceFragment(C11048R.id.fragment_container, fragment);
    }

    /* compiled from: EnrollmentParentV2Fragment.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/EnrollmentParentV2Fragment$Args;", "Landroid/os/Parcelable;", "enrollmentState", "Lcom/robinhood/models/api/transfer/ApiCryptoTransferConfig$TransferStates$EnrollmentState;", "action", "Lcom/robinhood/models/api/transfer/CryptoTransferAction;", "exitDeeplinkEnrollmentCompleted", "", "<init>", "(Lcom/robinhood/models/api/transfer/ApiCryptoTransferConfig$TransferStates$EnrollmentState;Lcom/robinhood/models/api/transfer/CryptoTransferAction;Ljava/lang/String;)V", "getEnrollmentState", "()Lcom/robinhood/models/api/transfer/ApiCryptoTransferConfig$TransferStates$EnrollmentState;", "getAction", "()Lcom/robinhood/models/api/transfer/CryptoTransferAction;", "getExitDeeplinkEnrollmentCompleted", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final CryptoTransferAction action;
        private final ApiCryptoTransferConfig.TransferStates.EnrollmentState enrollmentState;
        private final String exitDeeplinkEnrollmentCompleted;

        /* compiled from: EnrollmentParentV2Fragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(ApiCryptoTransferConfig.TransferStates.EnrollmentState.valueOf(parcel.readString()), CryptoTransferAction.valueOf(parcel.readString()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, ApiCryptoTransferConfig.TransferStates.EnrollmentState enrollmentState, CryptoTransferAction cryptoTransferAction, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                enrollmentState = args.enrollmentState;
            }
            if ((i & 2) != 0) {
                cryptoTransferAction = args.action;
            }
            if ((i & 4) != 0) {
                str = args.exitDeeplinkEnrollmentCompleted;
            }
            return args.copy(enrollmentState, cryptoTransferAction, str);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiCryptoTransferConfig.TransferStates.EnrollmentState getEnrollmentState() {
            return this.enrollmentState;
        }

        /* renamed from: component2, reason: from getter */
        public final CryptoTransferAction getAction() {
            return this.action;
        }

        /* renamed from: component3, reason: from getter */
        public final String getExitDeeplinkEnrollmentCompleted() {
            return this.exitDeeplinkEnrollmentCompleted;
        }

        public final Args copy(ApiCryptoTransferConfig.TransferStates.EnrollmentState enrollmentState, CryptoTransferAction action, String exitDeeplinkEnrollmentCompleted) {
            Intrinsics.checkNotNullParameter(enrollmentState, "enrollmentState");
            Intrinsics.checkNotNullParameter(action, "action");
            return new Args(enrollmentState, action, exitDeeplinkEnrollmentCompleted);
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
            return this.enrollmentState == args.enrollmentState && this.action == args.action && Intrinsics.areEqual(this.exitDeeplinkEnrollmentCompleted, args.exitDeeplinkEnrollmentCompleted);
        }

        public int hashCode() {
            int iHashCode = ((this.enrollmentState.hashCode() * 31) + this.action.hashCode()) * 31;
            String str = this.exitDeeplinkEnrollmentCompleted;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Args(enrollmentState=" + this.enrollmentState + ", action=" + this.action + ", exitDeeplinkEnrollmentCompleted=" + this.exitDeeplinkEnrollmentCompleted + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.enrollmentState.name());
            dest.writeString(this.action.name());
            dest.writeString(this.exitDeeplinkEnrollmentCompleted);
        }

        public Args(ApiCryptoTransferConfig.TransferStates.EnrollmentState enrollmentState, CryptoTransferAction action, String str) {
            Intrinsics.checkNotNullParameter(enrollmentState, "enrollmentState");
            Intrinsics.checkNotNullParameter(action, "action");
            this.enrollmentState = enrollmentState;
            this.action = action;
            this.exitDeeplinkEnrollmentCompleted = str;
        }

        public final ApiCryptoTransferConfig.TransferStates.EnrollmentState getEnrollmentState() {
            return this.enrollmentState;
        }

        public final CryptoTransferAction getAction() {
            return this.action;
        }

        public final String getExitDeeplinkEnrollmentCompleted() {
            return this.exitDeeplinkEnrollmentCompleted;
        }
    }

    /* compiled from: EnrollmentParentV2Fragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/EnrollmentParentV2Fragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/shared/crypto/transfer/enrollment/EnrollmentParentV2Fragment;", "Lcom/robinhood/shared/crypto/transfer/enrollment/EnrollmentParentV2Fragment$Args;", "<init>", "()V", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<EnrollmentParentV2Fragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(EnrollmentParentV2Fragment enrollmentParentV2Fragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, enrollmentParentV2Fragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public EnrollmentParentV2Fragment newInstance(Args args) {
            return (EnrollmentParentV2Fragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(EnrollmentParentV2Fragment enrollmentParentV2Fragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, enrollmentParentV2Fragment, args);
        }
    }
}
