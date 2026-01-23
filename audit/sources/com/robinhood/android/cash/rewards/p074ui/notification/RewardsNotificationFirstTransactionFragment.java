package com.robinhood.android.cash.rewards.p074ui.notification;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.cash.rewards.C10176R;
import com.robinhood.android.cash.rewards.databinding.FragmentRewardsNotificationFirstTransactionBinding;
import com.robinhood.android.cash.rewards.logging.RoundupRewardsLoggingUtil;
import com.robinhood.android.cash.rewards.p074ui.onboarding.content.RewardsOnboardingContent;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.util.extensions.LottieAnimationViewsKt;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.remote.assets.LottieUrl;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.util.Set;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: RewardsNotificationFirstTransactionFragment.kt */
@Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 32\u00020\u00012\u00020\u0002:\u000223B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u001a\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010%\u001a\u00020\u001dH\u0016J\b\u0010&\u001a\u00020\u001dH\u0016J\b\u0010'\u001a\u00020(H\u0016J\u0010\u0010)\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020+H\u0002J\t\u0010,\u001a\u00020(H\u0096\u0001R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00060\bj\u0002`\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0018\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.X\u0096\u0005¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00064"}, m3636d2 = {"Lcom/robinhood/android/cash/rewards/ui/notification/RewardsNotificationFirstTransactionFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "loggingScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "duxo", "Lcom/robinhood/android/cash/rewards/ui/notification/RewardsNotificationFirstTransactionDuxo;", "getDuxo", "()Lcom/robinhood/android/cash/rewards/ui/notification/RewardsNotificationFirstTransactionDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/cash/rewards/databinding/FragmentRewardsNotificationFirstTransactionBinding;", "getBinding", "()Lcom/robinhood/android/cash/rewards/databinding/FragmentRewardsNotificationFirstTransactionBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onStop", "onBackPressed", "", "bindState", "state", "Lcom/robinhood/android/cash/rewards/ui/notification/RewardsNotificationFirstTransactionViewState;", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Args", "Companion", "feature-cash-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class RewardsNotificationFirstTransactionFragment extends BaseFragment implements RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public EventLogger eventLogger;
    private final Context loggingContext;
    private final Screen loggingScreen;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RewardsNotificationFirstTransactionFragment.class, "binding", "getBinding()Lcom/robinhood/android/cash/rewards/databinding/FragmentRewardsNotificationFirstTransactionBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public RewardsNotificationFirstTransactionFragment() {
        super(C10176R.layout.fragment_rewards_notification_first_transaction);
        this.$$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);
        this.loggingScreen = new Screen(Screen.Name.ROUNDUP_FIRST_SETTLEMENT, null, null, null, 14, null);
        this.loggingContext = RoundupRewardsLoggingUtil.INSTANCE.getRoundupGeneralContext();
        this.duxo = OldDuxos.oldDuxo(this, RewardsNotificationFirstTransactionDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, RewardsNotificationFirstTransactionFragment2.INSTANCE);
    }

    private final RewardsNotificationFirstTransactionDuxo getDuxo() {
        return (RewardsNotificationFirstTransactionDuxo) this.duxo.getValue();
    }

    private final FragmentRewardsNotificationFirstTransactionBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentRewardsNotificationFirstTransactionBinding) value;
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

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        LottieUrl.ROUNDUP_REWARDS_FIRST_TRANSACTION.prefetch(context);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        LottieAnimationView rewardsNotificationFirstTransactionAnimation = getBinding().rewardsNotificationFirstTransactionAnimation;
        Intrinsics.checkNotNullExpressionValue(rewardsNotificationFirstTransactionAnimation, "rewardsNotificationFirstTransactionAnimation");
        LottieAnimationViewsKt.setRemoteUrl(rewardsNotificationFirstTransactionAnimation, LottieUrl.ROUNDUP_REWARDS_FIRST_TRANSACTION);
        RdsButton rewardsNotificationFirstTransactionCompleteButton = getBinding().rewardsNotificationFirstTransactionCompleteButton;
        Intrinsics.checkNotNullExpressionValue(rewardsNotificationFirstTransactionCompleteButton, "rewardsNotificationFirstTransactionCompleteButton");
        OnClickListeners.onClick(rewardsNotificationFirstTransactionCompleteButton, new Function0() { // from class: com.robinhood.android.cash.rewards.ui.notification.RewardsNotificationFirstTransactionFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RewardsNotificationFirstTransactionFragment.onViewCreated$lambda$0(this.f$0);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C101972(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(RewardsNotificationFirstTransactionFragment rewardsNotificationFirstTransactionFragment) {
        rewardsNotificationFirstTransactionFragment.requireActivity().finish();
        return Unit.INSTANCE;
    }

    /* compiled from: RewardsNotificationFirstTransactionFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cash.rewards.ui.notification.RewardsNotificationFirstTransactionFragment$onViewCreated$2 */
    /* synthetic */ class C101972 extends FunctionReferenceImpl implements Function1<RewardsNotificationFirstTransactionViewState, Unit> {
        C101972(Object obj) {
            super(1, obj, RewardsNotificationFirstTransactionFragment.class, "bindState", "bindState(Lcom/robinhood/android/cash/rewards/ui/notification/RewardsNotificationFirstTransactionViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RewardsNotificationFirstTransactionViewState rewardsNotificationFirstTransactionViewState) {
            invoke2(rewardsNotificationFirstTransactionViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(RewardsNotificationFirstTransactionViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((RewardsNotificationFirstTransactionFragment) this.receiver).bindState(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        getBinding().rewardsNotificationFirstTransactionAnimation.playAnimation();
        EventLogger.DefaultImpls.logScreenAppear$default(getEventLogger(), null, this.loggingScreen, null, null, this.loggingContext, 13, null);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        EventLogger.DefaultImpls.logScreenDisappear$default(getEventLogger(), null, this.loggingScreen, null, null, this.loggingContext, 13, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        requireActivity().finish();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindState(final RewardsNotificationFirstTransactionViewState state) {
        getBinding().rewardsNotificationFirstTransactionTitle.setText(state.getTitle());
        getBinding().rewardsNotificationFirstTransactionDescription.setText(state.getDescription());
        RhTextView rhTextView = getBinding().rewardsNotificationFirstTransactionDisclosure;
        rhTextView.setText(state.getDisclosureButton());
        Intrinsics.checkNotNull(rhTextView);
        OnClickListeners.onClick(rhTextView, new Function0() { // from class: com.robinhood.android.cash.rewards.ui.notification.RewardsNotificationFirstTransactionFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RewardsNotificationFirstTransactionFragment.bindState$lambda$2$lambda$1(state, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindState$lambda$2$lambda$1(RewardsNotificationFirstTransactionViewState rewardsNotificationFirstTransactionViewState, RewardsNotificationFirstTransactionFragment rewardsNotificationFirstTransactionFragment) {
        RhBottomSheetDialogFragment rhBottomSheetDialogFragment = (RhBottomSheetDialogFragment) RhBottomSheetDialogFragment.INSTANCE.newInstance((Parcelable) new RhBottomSheetDialogFragment.Args(C10176R.id.dialog_id_rewards_notification_first_transaction_disclosure, rewardsNotificationFirstTransactionViewState.getDisclosureTitle(), null, rewardsNotificationFirstTransactionViewState.getDisclosureMessage(), null, rewardsNotificationFirstTransactionFragment.getString(C11048R.string.general_label_got_it), null, null, null, false, false, null, null, null, false, false, false, false, null, null, null, 2097108, null));
        FragmentManager childFragmentManager = rewardsNotificationFirstTransactionFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        rhBottomSheetDialogFragment.show(childFragmentManager, "rewardsFirstTransactionDisclosureBottomSheet");
        return Unit.INSTANCE;
    }

    /* compiled from: RewardsNotificationFirstTransactionFragment.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/cash/rewards/ui/notification/RewardsNotificationFirstTransactionFragment$Args;", "Landroid/os/Parcelable;", "transactionId", "Ljava/util/UUID;", "rhsContent", "Lcom/robinhood/android/cash/rewards/ui/onboarding/content/RewardsOnboardingContent;", "rhcContent", "<init>", "(Ljava/util/UUID;Lcom/robinhood/android/cash/rewards/ui/onboarding/content/RewardsOnboardingContent;Lcom/robinhood/android/cash/rewards/ui/onboarding/content/RewardsOnboardingContent;)V", "getTransactionId", "()Ljava/util/UUID;", "getRhsContent", "()Lcom/robinhood/android/cash/rewards/ui/onboarding/content/RewardsOnboardingContent;", "getRhcContent", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-cash-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final RewardsOnboardingContent rhcContent;
        private final RewardsOnboardingContent rhsContent;
        private final UUID transactionId;

        /* compiled from: RewardsNotificationFirstTransactionFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                UUID uuid = (UUID) parcel.readSerializable();
                Parcelable.Creator<RewardsOnboardingContent> creator = RewardsOnboardingContent.CREATOR;
                return new Args(uuid, creator.createFromParcel(parcel), creator.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, UUID uuid, RewardsOnboardingContent rewardsOnboardingContent, RewardsOnboardingContent rewardsOnboardingContent2, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = args.transactionId;
            }
            if ((i & 2) != 0) {
                rewardsOnboardingContent = args.rhsContent;
            }
            if ((i & 4) != 0) {
                rewardsOnboardingContent2 = args.rhcContent;
            }
            return args.copy(uuid, rewardsOnboardingContent, rewardsOnboardingContent2);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getTransactionId() {
            return this.transactionId;
        }

        /* renamed from: component2, reason: from getter */
        public final RewardsOnboardingContent getRhsContent() {
            return this.rhsContent;
        }

        /* renamed from: component3, reason: from getter */
        public final RewardsOnboardingContent getRhcContent() {
            return this.rhcContent;
        }

        public final Args copy(UUID transactionId, RewardsOnboardingContent rhsContent, RewardsOnboardingContent rhcContent) {
            Intrinsics.checkNotNullParameter(transactionId, "transactionId");
            Intrinsics.checkNotNullParameter(rhsContent, "rhsContent");
            Intrinsics.checkNotNullParameter(rhcContent, "rhcContent");
            return new Args(transactionId, rhsContent, rhcContent);
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
            return Intrinsics.areEqual(this.transactionId, args.transactionId) && Intrinsics.areEqual(this.rhsContent, args.rhsContent) && Intrinsics.areEqual(this.rhcContent, args.rhcContent);
        }

        public int hashCode() {
            return (((this.transactionId.hashCode() * 31) + this.rhsContent.hashCode()) * 31) + this.rhcContent.hashCode();
        }

        public String toString() {
            return "Args(transactionId=" + this.transactionId + ", rhsContent=" + this.rhsContent + ", rhcContent=" + this.rhcContent + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.transactionId);
            this.rhsContent.writeToParcel(dest, flags);
            this.rhcContent.writeToParcel(dest, flags);
        }

        public Args(UUID transactionId, RewardsOnboardingContent rhsContent, RewardsOnboardingContent rhcContent) {
            Intrinsics.checkNotNullParameter(transactionId, "transactionId");
            Intrinsics.checkNotNullParameter(rhsContent, "rhsContent");
            Intrinsics.checkNotNullParameter(rhcContent, "rhcContent");
            this.transactionId = transactionId;
            this.rhsContent = rhsContent;
            this.rhcContent = rhcContent;
        }

        public final UUID getTransactionId() {
            return this.transactionId;
        }

        public final RewardsOnboardingContent getRhsContent() {
            return this.rhsContent;
        }

        public final RewardsOnboardingContent getRhcContent() {
            return this.rhcContent;
        }
    }

    /* compiled from: RewardsNotificationFirstTransactionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/cash/rewards/ui/notification/RewardsNotificationFirstTransactionFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/cash/rewards/ui/notification/RewardsNotificationFirstTransactionFragment;", "Lcom/robinhood/android/cash/rewards/ui/notification/RewardsNotificationFirstTransactionFragment$Args;", "<init>", "()V", "feature-cash-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<RewardsNotificationFirstTransactionFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(RewardsNotificationFirstTransactionFragment rewardsNotificationFirstTransactionFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, rewardsNotificationFirstTransactionFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RewardsNotificationFirstTransactionFragment newInstance(Args args) {
            return (RewardsNotificationFirstTransactionFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RewardsNotificationFirstTransactionFragment rewardsNotificationFirstTransactionFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, rewardsNotificationFirstTransactionFragment, args);
        }
    }
}
