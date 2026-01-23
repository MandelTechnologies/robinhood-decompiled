package com.robinhood.android.prompts;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.prompts.databinding.FragmentPromptsEnrollmentBinding;
import com.robinhood.android.security.contracts.PromptsMfaEnrollment;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.extensions.ContextSystemServices;
import com.robinhood.utils.notification.NotificationUtils;
import com.robinhood.utils.notifications.Channels;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: PromptsEnrollmentFragment.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u001a\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0019H\u0016J\u001a\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0019H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/prompts/PromptsEnrollmentFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "binding", "Lcom/robinhood/android/prompts/databinding/FragmentPromptsEnrollmentBinding;", "getBinding", "()Lcom/robinhood/android/prompts/databinding/FragmentPromptsEnrollmentBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "toolbarVisible", "", "getToolbarVisible", "()Z", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onPositiveButtonClicked", "id", "", "passthroughArgs", "onNegativeButtonClicked", "Companion", "feature-prompts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class PromptsEnrollmentFragment extends BaseFragment {
    private static final String TAG_ENROLLMENT_ALLOW_NOTIFICATIONS = "promptsEnrollmentAllowNotifications";

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    public EventLogger eventLogger;
    private final boolean toolbarVisible;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(PromptsEnrollmentFragment.class, "binding", "getBinding()Lcom/robinhood/android/prompts/databinding/FragmentPromptsEnrollmentBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public PromptsEnrollmentFragment() {
        super(C25942R.layout.fragment_prompts_enrollment);
        this.binding = ViewBinding5.viewBinding(this, PromptsEnrollmentFragment2.INSTANCE);
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

    private final FragmentPromptsEnrollmentBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentPromptsEnrollmentBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        int i;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        EventLogger eventLogger = getEventLogger();
        Screen.Name name = Screen.Name.DEVICE_APPROVAL_ENROLL;
        Companion companion = INSTANCE;
        EventLogger.DefaultImpls.logScreenAppear$default(eventLogger, null, new Screen(name, null, ((PromptsMfaEnrollment) companion.getArgs((Fragment) this)).getLoggingIdentifier(), null, 10, null), null, null, null, 29, null);
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        if (NotificationUtils.isSystemNotificationOrChannelSettingsEnabled(ContextSystemServices.getNotificationManager(contextRequireContext), Channels.DEFAULT.getId())) {
            getBinding().promptsEnableNotificationsBtn.setVisibility(8);
            getBinding().promptsSkipNotificationsBtn.setVisibility(8);
            getBinding().promptsConfirmBtn.setVisibility(0);
            RhTextView rhTextView = getBinding().promptsEnrollmentBody;
            if (((PromptsMfaEnrollment) companion.getArgs((Fragment) this)).isFromCryptoTransfersEnrollment()) {
                i = C25942R.string.prompts_enrollment_crypto_body;
            } else {
                i = C25942R.string.prompts_enrollment_body;
            }
            rhTextView.setText(getString(i));
            RdsButton promptsConfirmBtn = getBinding().promptsConfirmBtn;
            Intrinsics.checkNotNullExpressionValue(promptsConfirmBtn, "promptsConfirmBtn");
            OnClickListeners.onClick(promptsConfirmBtn, new Function0() { // from class: com.robinhood.android.prompts.PromptsEnrollmentFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PromptsEnrollmentFragment.onViewCreated$lambda$0(this.f$0);
                }
            });
            return;
        }
        getBinding().promptsEnableNotificationsBtn.setVisibility(0);
        getBinding().promptsSkipNotificationsBtn.setVisibility(0);
        getBinding().promptsConfirmBtn.setVisibility(8);
        RdsButton promptsEnableNotificationsBtn = getBinding().promptsEnableNotificationsBtn;
        Intrinsics.checkNotNullExpressionValue(promptsEnableNotificationsBtn, "promptsEnableNotificationsBtn");
        OnClickListeners.onClick(promptsEnableNotificationsBtn, new Function0() { // from class: com.robinhood.android.prompts.PromptsEnrollmentFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PromptsEnrollmentFragment.onViewCreated$lambda$1(this.f$0);
            }
        });
        RdsButton promptsSkipNotificationsBtn = getBinding().promptsSkipNotificationsBtn;
        Intrinsics.checkNotNullExpressionValue(promptsSkipNotificationsBtn, "promptsSkipNotificationsBtn");
        OnClickListeners.onClick(promptsSkipNotificationsBtn, new Function0() { // from class: com.robinhood.android.prompts.PromptsEnrollmentFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PromptsEnrollmentFragment.onViewCreated$lambda$2(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(PromptsEnrollmentFragment promptsEnrollmentFragment) {
        EventLogger.DefaultImpls.logTap$default(promptsEnrollmentFragment.getEventLogger(), UserInteractionEventData.Action.DONE, new Screen(Screen.Name.DEVICE_APPROVAL_ENROLL, null, ((PromptsMfaEnrollment) INSTANCE.getArgs((Fragment) promptsEnrollmentFragment)).getLoggingIdentifier(), null, 10, null), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, null, false, 56, null);
        promptsEnrollmentFragment.requireActivity().finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(PromptsEnrollmentFragment promptsEnrollmentFragment) {
        EventLogger.DefaultImpls.logTap$default(promptsEnrollmentFragment.getEventLogger(), UserInteractionEventData.Action.TURN_ON_NOTIFICATION, new Screen(Screen.Name.DEVICE_APPROVAL_ENROLL, null, null, null, 14, null), null, null, null, false, 60, null);
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        Context contextRequireContext = promptsEnrollmentFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder negativeButton = companion.create(contextRequireContext).setId(C25942R.id.dialog_id_enrollment_notifications).setTheme(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome).setTitle(C25942R.string.prompts_notifications_dialog_title, new Object[0]).setMessage(C25942R.string.prompts_notifications_dialog_message, new Object[0]).setPositiveButton(C25942R.string.prompts_notifications_dialog_allow, new Object[0]).setNegativeButton(C25942R.string.prompts_notifications_dialog_dismiss, new Object[0]);
        FragmentManager parentFragmentManager = promptsEnrollmentFragment.getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        RhDialogFragment.Builder.show$default(negativeButton, parentFragmentManager, TAG_ENROLLMENT_ALLOW_NOTIFICATIONS, false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2(PromptsEnrollmentFragment promptsEnrollmentFragment) {
        promptsEnrollmentFragment.requireActivity().finish();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C25942R.id.dialog_id_enrollment_notifications) {
            EventLogger.DefaultImpls.logTap$default(getEventLogger(), UserInteractionEventData.Action.VIEW_SETTINGS, new Screen(Screen.Name.DEVICE_APPROVAL_ENROLL, null, null, null, 14, null), new Component(Component.ComponentType.ENABLE_PUSH_NOTIFICATIONS_ALERT, null, null, 6, null), null, null, false, 56, null);
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Intent disabledSystemNotificationOrChannelSettingsIntent = NotificationUtils.getDisabledSystemNotificationOrChannelSettingsIntent(contextRequireContext, Channels.DEFAULT.getId());
            disabledSystemNotificationOrChannelSettingsIntent.addFlags(268435456);
            startActivity(disabledSystemNotificationOrChannelSettingsIntent);
            requireActivity().finish();
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onNegativeButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C25942R.id.dialog_id_enrollment_notifications) {
            requireActivity().finish();
            return true;
        }
        return super.onNegativeButtonClicked(id, passthroughArgs);
    }

    /* compiled from: PromptsEnrollmentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/prompts/PromptsEnrollmentFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/prompts/PromptsEnrollmentFragment;", "Lcom/robinhood/android/security/contracts/PromptsMfaEnrollment;", "<init>", "()V", "TAG_ENROLLMENT_ALLOW_NOTIFICATIONS", "", "feature-prompts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<PromptsEnrollmentFragment, PromptsMfaEnrollment> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(PromptsMfaEnrollment promptsMfaEnrollment) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, promptsMfaEnrollment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public PromptsMfaEnrollment getArgs(PromptsEnrollmentFragment promptsEnrollmentFragment) {
            return (PromptsMfaEnrollment) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, promptsEnrollmentFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public PromptsEnrollmentFragment newInstance(PromptsMfaEnrollment promptsMfaEnrollment) {
            return (PromptsEnrollmentFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, promptsMfaEnrollment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(PromptsEnrollmentFragment promptsEnrollmentFragment, PromptsMfaEnrollment promptsMfaEnrollment) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, promptsEnrollmentFragment, promptsMfaEnrollment);
        }
    }
}
