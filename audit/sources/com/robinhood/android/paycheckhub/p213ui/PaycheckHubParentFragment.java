package com.robinhood.android.paycheckhub.p213ui;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.paycheckhub.p213ui.PaycheckHubFragment;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaycheckHubParentFragment.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001c2\u00020\u00012\u00020\u0002:\u0001\u001cB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0010H\u0016J\u0010\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u001bH\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/paycheckhub/ui/PaycheckHubParentFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/paycheckhub/ui/PaycheckHubFragment$Callbacks;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onSettingsClicked", "onPaycheckClicked", "receivedAchTransferId", "Ljava/util/UUID;", "onManagedPaycheckRecurringInvestmentsClicked", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "Companion", "feature-paycheck-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class PaycheckHubParentFragment extends BaseFragment implements PaycheckHubFragment.Callbacks {
    public EventLogger eventLogger;
    private final boolean useDesignSystemToolbar;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public PaycheckHubParentFragment() {
        super(C11048R.layout.parent_fragment_container);
        this.useDesignSystemToolbar = true;
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

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, PaycheckHubFragment.INSTANCE.newInstance());
        }
    }

    @Override // com.robinhood.android.paycheckhub.ui.PaycheckHubFragment.Callbacks
    public void onSettingsClicked() {
        replaceFragment(ManageDirectDepositFragment.INSTANCE.newInstance((Parcelable) LegacyFragmentKey.ManageDirectDeposit.INSTANCE));
    }

    @Override // com.robinhood.android.paycheckhub.ui.PaycheckHubFragment.Callbacks
    public void onPaycheckClicked(UUID receivedAchTransferId) {
        Intrinsics.checkNotNullParameter(receivedAchTransferId, "receivedAchTransferId");
        replaceFragment(Navigator.DefaultImpls.createFragment$default(getNavigator(), new LegacyFragmentKey.PaycheckDetail(receivedAchTransferId), null, 2, null));
    }

    @Override // com.robinhood.android.paycheckhub.ui.PaycheckHubFragment.Callbacks
    public void onManagedPaycheckRecurringInvestmentsClicked(Screen screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        EventLogger.DefaultImpls.logTap$default(getEventLogger(), UserInteractionEventData.Action.MANAGE_PAYCHECK_INVESTMENTS, screen, null, null, null, false, 60, null);
        replaceFragment(Navigator.DefaultImpls.createFragment$default(getNavigator(), LegacyFragmentKey.PaycheckRecurringInvestmentsHub.INSTANCE, null, 2, null));
    }

    /* compiled from: PaycheckHubParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u0003B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/paycheckhub/ui/PaycheckHubParentFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolver;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$PaycheckHub;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/paycheckhub/ui/PaycheckHubParentFragment;", "<init>", "()V", "createFragment", "key", "feature-paycheck-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolver<LegacyFragmentKey.PaycheckHub>, FragmentWithArgsCompanion<PaycheckHubParentFragment, LegacyFragmentKey.PaycheckHub> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyFragmentKey.PaycheckHub getArgs(PaycheckHubParentFragment paycheckHubParentFragment) {
            return (LegacyFragmentKey.PaycheckHub) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, paycheckHubParentFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public PaycheckHubParentFragment newInstance(LegacyFragmentKey.PaycheckHub paycheckHub) {
            return (PaycheckHubParentFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, paycheckHub);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(PaycheckHubParentFragment paycheckHubParentFragment, LegacyFragmentKey.PaycheckHub paycheckHub) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, paycheckHubParentFragment, paycheckHub);
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public PaycheckHubParentFragment createFragment(LegacyFragmentKey.PaycheckHub key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return (PaycheckHubParentFragment) PaycheckHubParentFragment.INSTANCE.newInstance((Parcelable) key);
        }
    }
}
