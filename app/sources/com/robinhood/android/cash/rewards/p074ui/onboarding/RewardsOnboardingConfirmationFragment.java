package com.robinhood.android.cash.rewards.p074ui.onboarding;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.cash.rewards.C10176R;
import com.robinhood.android.cash.rewards.databinding.FragmentRewardsOnboardingConfirmationBinding;
import com.robinhood.android.cash.rewards.logging.RoundupRewardsLoggingUtil;
import com.robinhood.android.cash.rewards.p074ui.onboarding.content.RewardsOnboardingContent;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;

/* compiled from: RewardsOnboardingConfirmationFragment.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 (2\u00020\u00012\u00020\u0002:\u0002'(B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0017H\u0016J\b\u0010\u001d\u001a\u00020\u0017H\u0016J\b\u0010\u001e\u001a\u00020\u0017H\u0016J\b\u0010\u001f\u001a\u00020 H\u0016J\t\u0010!\u001a\u00020 H\u0096\u0001R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00060\u000ej\u0002`\u000fX\u0082.¢\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0018\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#X\u0096\u0005¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingConfirmationFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "binding", "Lcom/robinhood/android/cash/rewards/databinding/FragmentRewardsOnboardingConfirmationBinding;", "getBinding", "()Lcom/robinhood/android/cash/rewards/databinding/FragmentRewardsOnboardingConfirmationBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "loggingScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onStop", "onDestroyView", "onBackPressed", "", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Args", "Companion", "feature-cash-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class RewardsOnboardingConfirmationFragment extends BaseFragment implements RegionGated {
    private static final String ANIMATION_URL = "https://cdn.robinhood.com/assets/roundup/roundup-complete-v2.json";
    private static final String SYMBOL_PLACEHOLDER = "{{ .SYMBOL }}";
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    public EventLogger eventLogger;
    private Context loggingContext;
    private final Screen loggingScreen;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RewardsOnboardingConfirmationFragment.class, "binding", "getBinding()Lcom/robinhood/android/cash/rewards/databinding/FragmentRewardsOnboardingConfirmationBinding;", 0))};

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

    public RewardsOnboardingConfirmationFragment() {
        super(C10176R.layout.fragment_rewards_onboarding_confirmation);
        this.$$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);
        this.binding = ViewBinding5.viewBinding(this, RewardsOnboardingConfirmationFragment2.INSTANCE);
        this.loggingScreen = new Screen(Screen.Name.ROUNDUP_ENROLL_COMPLETE, null, null, null, 14, null);
    }

    private final FragmentRewardsOnboardingConfirmationBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentRewardsOnboardingConfirmationBinding) value;
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
    public void onViewCreated(View view, Bundle savedInstanceState) {
        String title;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        RoundupRewardsLoggingUtil roundupRewardsLoggingUtil = RoundupRewardsLoggingUtil.INSTANCE;
        Companion companion = INSTANCE;
        this.loggingContext = roundupRewardsLoggingUtil.getOnboardingContext(((Args) companion.getArgs((Fragment) this)).getAction());
        RhTextView rhTextView = getBinding().rewardsOnboardingConfirmationTitle;
        RewardsOnboardingContent content = ((Args) companion.getArgs((Fragment) this)).getContent();
        rhTextView.setText((content == null || (title = content.getTitle()) == null) ? null : StringsKt.replace$default(title, SYMBOL_PLACEHOLDER, ((Args) companion.getArgs((Fragment) this)).getAssetSymbol(), false, 4, (Object) null));
        RhTextView rhTextView2 = getBinding().rewardsOnboardingConfirmationDescription;
        RewardsOnboardingContent content2 = ((Args) companion.getArgs((Fragment) this)).getContent();
        rhTextView2.setText(content2 != null ? content2.getContent() : null);
        LottieAnimationView lottieAnimationView = getBinding().rewardsOnboardingConfirmationAnimation;
        lottieAnimationView.setAnimationFromUrl(ANIMATION_URL);
        lottieAnimationView.playAnimation();
        RdsButton dismissButton = getBinding().dismissButton;
        Intrinsics.checkNotNullExpressionValue(dismissButton, "dismissButton");
        OnClickListeners.onClick(dismissButton, new Function0() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingConfirmationFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RewardsOnboardingConfirmationFragment.onViewCreated$lambda$2(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2(RewardsOnboardingConfirmationFragment rewardsOnboardingConfirmationFragment) {
        FragmentActivity fragmentActivityRequireActivity = rewardsOnboardingConfirmationFragment.requireActivity();
        fragmentActivityRequireActivity.setResult(-1);
        fragmentActivityRequireActivity.finish();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        EventLogger eventLogger = getEventLogger();
        Screen screen = this.loggingScreen;
        Context context = this.loggingContext;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException(RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT);
            context = null;
        }
        EventLogger.DefaultImpls.logScreenAppear$default(eventLogger, null, screen, null, null, context, 13, null);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        EventLogger eventLogger = getEventLogger();
        Screen screen = this.loggingScreen;
        Context context = this.loggingContext;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException(RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT);
            context = null;
        }
        EventLogger.DefaultImpls.logScreenDisappear$default(eventLogger, null, screen, null, null, context, 13, null);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        RhToolbar rhToolbar = getRhToolbar();
        if (rhToolbar != null) {
            rhToolbar.setColorControlNormalOverride(new ThemedResourceReference(ResourceType.COLOR_STATE_LIST.INSTANCE, C20690R.attr.colorForeground1));
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        fragmentActivityRequireActivity.setResult(-1);
        fragmentActivityRequireActivity.finish();
        return true;
    }

    /* compiled from: RewardsOnboardingConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingConfirmationFragment$Args;", "Landroid/os/Parcelable;", "action", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$RewardsOnboarding$Action;", "content", "Lcom/robinhood/android/cash/rewards/ui/onboarding/content/RewardsOnboardingContent;", "assetSymbol", "", "<init>", "(Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$RewardsOnboarding$Action;Lcom/robinhood/android/cash/rewards/ui/onboarding/content/RewardsOnboardingContent;Ljava/lang/String;)V", "getAction", "()Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$RewardsOnboarding$Action;", "getContent", "()Lcom/robinhood/android/cash/rewards/ui/onboarding/content/RewardsOnboardingContent;", "getAssetSymbol", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-cash-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final LegacyIntentKey.RewardsOnboarding.Action action;
        private final String assetSymbol;
        private final RewardsOnboardingContent content;

        /* compiled from: RewardsOnboardingConfirmationFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(LegacyIntentKey.RewardsOnboarding.Action.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : RewardsOnboardingContent.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, LegacyIntentKey.RewardsOnboarding.Action action, RewardsOnboardingContent rewardsOnboardingContent, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                action = args.action;
            }
            if ((i & 2) != 0) {
                rewardsOnboardingContent = args.content;
            }
            if ((i & 4) != 0) {
                str = args.assetSymbol;
            }
            return args.copy(action, rewardsOnboardingContent, str);
        }

        /* renamed from: component1, reason: from getter */
        public final LegacyIntentKey.RewardsOnboarding.Action getAction() {
            return this.action;
        }

        /* renamed from: component2, reason: from getter */
        public final RewardsOnboardingContent getContent() {
            return this.content;
        }

        /* renamed from: component3, reason: from getter */
        public final String getAssetSymbol() {
            return this.assetSymbol;
        }

        public final Args copy(LegacyIntentKey.RewardsOnboarding.Action action, RewardsOnboardingContent content, String assetSymbol) {
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(assetSymbol, "assetSymbol");
            return new Args(action, content, assetSymbol);
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
            return this.action == args.action && Intrinsics.areEqual(this.content, args.content) && Intrinsics.areEqual(this.assetSymbol, args.assetSymbol);
        }

        public int hashCode() {
            int iHashCode = this.action.hashCode() * 31;
            RewardsOnboardingContent rewardsOnboardingContent = this.content;
            return ((iHashCode + (rewardsOnboardingContent == null ? 0 : rewardsOnboardingContent.hashCode())) * 31) + this.assetSymbol.hashCode();
        }

        public String toString() {
            return "Args(action=" + this.action + ", content=" + this.content + ", assetSymbol=" + this.assetSymbol + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.action.name());
            RewardsOnboardingContent rewardsOnboardingContent = this.content;
            if (rewardsOnboardingContent == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                rewardsOnboardingContent.writeToParcel(dest, flags);
            }
            dest.writeString(this.assetSymbol);
        }

        public Args(LegacyIntentKey.RewardsOnboarding.Action action, RewardsOnboardingContent rewardsOnboardingContent, String assetSymbol) {
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(assetSymbol, "assetSymbol");
            this.action = action;
            this.content = rewardsOnboardingContent;
            this.assetSymbol = assetSymbol;
        }

        public final LegacyIntentKey.RewardsOnboarding.Action getAction() {
            return this.action;
        }

        public final RewardsOnboardingContent getContent() {
            return this.content;
        }

        public final String getAssetSymbol() {
            return this.assetSymbol;
        }
    }

    /* compiled from: RewardsOnboardingConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingConfirmationFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingConfirmationFragment;", "Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingConfirmationFragment$Args;", "<init>", "()V", "SYMBOL_PLACEHOLDER", "", "ANIMATION_URL", "feature-cash-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<RewardsOnboardingConfirmationFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(RewardsOnboardingConfirmationFragment rewardsOnboardingConfirmationFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, rewardsOnboardingConfirmationFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RewardsOnboardingConfirmationFragment newInstance(Args args) {
            return (RewardsOnboardingConfirmationFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RewardsOnboardingConfirmationFragment rewardsOnboardingConfirmationFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, rewardsOnboardingConfirmationFragment, args);
        }
    }
}
