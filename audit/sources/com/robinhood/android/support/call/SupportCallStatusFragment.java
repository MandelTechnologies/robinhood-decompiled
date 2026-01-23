package com.robinhood.android.support.call;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableString;
import android.transition.Transition;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationChannelCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.app.SharedElementCallback;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieOnCompositionLoadedListener;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.RhMultiButtonDialogFragment;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.Compat;
import com.robinhood.android.common.util.extensions.Contexts7;
import com.robinhood.android.common.util.extensions.RichTexts;
import com.robinhood.android.designsystem.banner.RdsInfoBannerView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.snackbar.RdsSnackbar;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.home.contracts.MainActivityIntentKey;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.settings.extensions.NotificationManagers;
import com.robinhood.android.support.call.ButtonState;
import com.robinhood.android.support.call.SupportCallStatusViewState3;
import com.robinhood.android.support.call.channelavailability.ChannelAvailabilityActionData;
import com.robinhood.android.support.call.channelavailability.UnavailableChannelData;
import com.robinhood.android.support.call.extensions.BannerStyleDatas;
import com.robinhood.android.support.call.extensions.UnavailableChannelDatas;
import com.robinhood.android.support.call.textanimator.AnimationType;
import com.robinhood.android.support.call.textanimator.TextAnimatorKt;
import com.robinhood.android.util.extensions.LottieAnimationViewsKt;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.models.api.PhoneChannelStatus;
import com.robinhood.models.p355ui.AlertButtonAction;
import com.robinhood.models.p355ui.AlertDetails;
import com.robinhood.models.p355ui.Banner;
import com.robinhood.models.p355ui.BannerStyle;
import com.robinhood.models.p355ui.BannerStyleData;
import com.robinhood.models.p355ui.Issue;
import com.robinhood.models.serverdriven.p347db.RichText;
import com.robinhood.rosetta.converters.supportx.Channels3;
import com.robinhood.rosetta.eventlogging.CXIssue;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.remote.assets.LottieUrl;
import com.robinhood.shared.support.C39996R;
import com.robinhood.shared.support.contracts.ContactSupportFragmentKey;
import com.robinhood.shared.support.databinding.FragmentSupportCallStatusBinding;
import com.robinhood.shared.user.contracts.WelcomeIntentKey;
import com.robinhood.shared.user.contracts.auth.Login;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.time.android.format.DurationFormatter;
import com.robinhood.udf.UiEvent;
import com.robinhood.userleap.SurveyManager3;
import com.robinhood.userleap.survey.Survey;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.datetime.Durations;
import com.robinhood.utils.extensions.ContextSystemServices;
import com.robinhood.utils.extensions.Contexts8;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.extensions.ResourceTypes;
import com.robinhood.utils.p409ui.color.ThemeColors;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.transition.TransitionEvent;
import com.robinhood.utils.transition.TransitionEventObservable2;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.Observables;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.ExceptionsH;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: SupportCallStatusFragment.kt */
@Metadata(m3635d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u0000 p2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001pB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0016J\b\u00102\u001a\u00020/H\u0016J\u001a\u00103\u001a\u00020/2\u0006\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u000107H\u0016J\b\u00108\u001a\u000209H\u0016J\u001a\u0010:\u001a\u0002092\u0006\u0010;\u001a\u00020<2\b\u0010=\u001a\u0004\u0018\u000107H\u0016J\u001a\u0010>\u001a\u0002092\u0006\u0010;\u001a\u00020<2\b\u0010=\u001a\u0004\u0018\u000107H\u0016J\u0018\u0010?\u001a\u00020/2\u0006\u0010;\u001a\u00020<2\u0006\u0010@\u001a\u00020AH\u0016J\"\u0010B\u001a\u00020/2\u0006\u0010C\u001a\u00020<2\u0006\u0010D\u001a\u00020<2\b\u0010E\u001a\u0004\u0018\u00010FH\u0016J\b\u0010G\u001a\u00020/H\u0003J\b\u0010H\u001a\u00020/H\u0003J\b\u0010I\u001a\u00020/H\u0003J\b\u0010J\u001a\u00020/H\u0003J\b\u0010K\u001a\u00020/H\u0002J\u0010\u0010L\u001a\u00020/2\u0006\u0010M\u001a\u00020NH\u0003J\b\u0010O\u001a\u00020/H\u0003J\u0010\u0010P\u001a\u00020/2\u0006\u0010Q\u001a\u00020RH\u0002J\b\u0010S\u001a\u00020/H\u0002J\f\u0010T\u001a\u00020/*\u00020UH\u0002J\b\u0010V\u001a\u00020/H\u0002J \u0010W\u001a\u00020/2\b\b\u0002\u0010Q\u001a\u00020R2\f\b\u0002\u0010X\u001a\u00060Yj\u0002`ZH\u0002J\u0014\u0010[\u001a\u00020/2\n\u0010X\u001a\u00060Yj\u0002`ZH\u0002J\u0018\u0010\\\u001a\u00020/2\u0006\u0010Q\u001a\u00020R2\u0006\u0010]\u001a\u00020^H\u0002J\u0010\u0010_\u001a\u00020/2\u0006\u0010]\u001a\u00020^H\u0002J\u0010\u0010`\u001a\u00020/2\u0006\u0010a\u001a\u00020bH\u0002J\u0016\u0010c\u001a\u00020/*\u00020U2\b\u0010d\u001a\u0004\u0018\u00010eH\u0002R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\u000e\u0010$\u001a\u00020%X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010)X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010*\u001a\u00020+X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u001a\u0010f\u001a\u0004\u0018\u00010<*\u00020g8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bh\u0010iR\u0014\u0010j\u001a\u00020kX\u0096D¢\u0006\b\n\u0000\u001a\u0004\bl\u0010mR\u0016\u0010n\u001a\u0004\u0018\u00010k8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bo\u0010m¨\u0006q"}, m3636d2 = {"Lcom/robinhood/android/support/call/SupportCallStatusFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/common/ui/RhMultiButtonDialogFragment$OnClickListener;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "callAssignedSnackbarManager", "Lcom/robinhood/android/support/call/CallAssignedSnackbarManager;", "getCallAssignedSnackbarManager", "()Lcom/robinhood/android/support/call/CallAssignedSnackbarManager;", "setCallAssignedSnackbarManager", "(Lcom/robinhood/android/support/call/CallAssignedSnackbarManager;)V", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "getUserLeapManager", "()Lcom/robinhood/userleap/UserLeapManager;", "setUserLeapManager", "(Lcom/robinhood/userleap/UserLeapManager;)V", "duxo", "Lcom/robinhood/android/support/call/SupportCallStatusDuxo;", "getDuxo", "()Lcom/robinhood/android/support/call/SupportCallStatusDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/shared/support/databinding/FragmentSupportCallStatusBinding;", "getBinding", "()Lcom/robinhood/shared/support/databinding/FragmentSupportCallStatusBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "gestureDetector", "Landroid/view/GestureDetector;", "inquiryId", "Ljava/util/UUID;", "waitingStatusAnimationController", "Lcom/robinhood/android/support/call/WaitingStatusAnimationController;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "onAttach", "", "context", "Landroid/content/Context;", "onResume", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onBackPressed", "", "onPositiveButtonClicked", "id", "", "passthroughArgs", "onNegativeButtonClicked", "onButtonClicked", "buttonData", "Lcom/robinhood/android/common/ui/RhMultiButtonDialogFragment$ButtonData;", "onActivityResult", "requestCode", "resultCode", WebsocketGatewayConstants.DATA_KEY, "Landroid/content/Intent;", "handleNotificationSettingResult", "handleNotificationChannelSettingResult", "showNotificationSettings", "showNotificationChannelSettingsIfNeeded", "showPushEnabledSnackbar", "showEnablePushDialogIfNeeded", "viewState", "Lcom/robinhood/android/support/call/SupportCallStatusViewState;", "initSwipeUpToDismissGesture", "logPushPromptTap", "action", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "handleTransition", "handleOnClick", "Lcom/robinhood/android/designsystem/button/RdsButton;", "exitScreen", "logTapAction", "componentType", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "Lcom/robinhood/rosetta/eventlogging/ComponentType;", "logAppearAction", "logAlertTap", "reason", "Lcom/robinhood/rosetta/eventlogging/CXIssue$PhoneUnavailableReason;", "logAlertAppear", "presentSurvey", "survey", "Lcom/robinhood/userleap/survey/Survey;", "bindButtonState", "buttonState", "Lcom/robinhood/android/support/call/ButtonState;", ResourceTypes.COLOR, "Lcom/robinhood/models/ui/BannerStyle;", "getColor", "(Lcom/robinhood/models/ui/BannerStyle;)Ljava/lang/Integer;", "screenName", "", "getScreenName", "()Ljava/lang/String;", "screenDescription", "getScreenDescription", "Companion", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class SupportCallStatusFragment extends BaseFragment implements RhMultiButtonDialogFragment.OnClickListener, AutoLoggableFragment {
    private static final int REQUEST_CODE_NOTIFICATION_CHANNEL_SETTINGS = 2;
    private static final int REQUEST_CODE_NOTIFICATION_SETTINGS = 1;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    public CallAssignedSnackbarManager callAssignedSnackbarManager;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public EventLogger eventLogger;
    private final Screen eventScreen;
    private GestureDetector gestureDetector;
    private UUID inquiryId;
    private final String screenName;
    public SurveyManager3 userLeapManager;
    private WaitingStatusAnimationController waitingStatusAnimationController;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SupportCallStatusFragment.class, "binding", "getBinding()Lcom/robinhood/shared/support/databinding/FragmentSupportCallStatusBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: SupportCallStatusFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ButtonState.Action.values().length];
            try {
                iArr[ButtonState.Action.CANCEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonState.Action.RETURN_TO_ROBINHOOD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ButtonState.Action.REQUEUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ButtonState.Action.EMAIL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
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

    public SupportCallStatusFragment() {
        super(C39996R.layout.fragment_support_call_status);
        this.duxo = OldDuxos.oldDuxo(this, SupportCallStatusDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, SupportCallStatusFragment2.INSTANCE);
        this.eventScreen = new Screen(Screen.Name.CX_CALL_STATUS, null, null, null, 14, null);
        this.screenName = "CX_CALL_STATUS";
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

    public final CallAssignedSnackbarManager getCallAssignedSnackbarManager() {
        CallAssignedSnackbarManager callAssignedSnackbarManager = this.callAssignedSnackbarManager;
        if (callAssignedSnackbarManager != null) {
            return callAssignedSnackbarManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("callAssignedSnackbarManager");
        return null;
    }

    public final void setCallAssignedSnackbarManager(CallAssignedSnackbarManager callAssignedSnackbarManager) {
        Intrinsics.checkNotNullParameter(callAssignedSnackbarManager, "<set-?>");
        this.callAssignedSnackbarManager = callAssignedSnackbarManager;
    }

    public final SurveyManager3 getUserLeapManager() {
        SurveyManager3 surveyManager3 = this.userLeapManager;
        if (surveyManager3 != null) {
            return surveyManager3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userLeapManager");
        return null;
    }

    public final void setUserLeapManager(SurveyManager3 surveyManager3) {
        Intrinsics.checkNotNullParameter(surveyManager3, "<set-?>");
        this.userLeapManager = surveyManager3;
    }

    private final SupportCallStatusDuxo getDuxo() {
        return (SupportCallStatusDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentSupportCallStatusBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentSupportCallStatusBinding) value;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        LottieUrl.SUPPORT_CALL_WAITING.prefetch(context);
        LottieUrl.SUPPORT_CALL_ASSIGNED.prefetch(context);
        LottieUrl.SUPPORT_CALL_CANCELLED.prefetch(context);
        LottieUrl.SUPPORT_CALL_MISSED.prefetch(context);
        LottieUrl.SUPPORT_CALL_COMPLETED.prefetch(context);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ScopedObservable.subscribe$default(LifecycleHost.DefaultImpls.bind$default(this, getCallAssignedSnackbarManager().start(), (LifecycleEvent) null, 1, (Object) null), null, null, null, 7, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(final View view, Bundle savedInstanceState) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ConstraintLayout root = getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        ViewCompat.setOnApplyWindowInsetsListener(root, new OnApplyWindowInsetsListener() { // from class: com.robinhood.android.support.call.SupportCallStatusFragment.onViewCreated.1
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View v, WindowInsetsCompat insets) {
                Intrinsics.checkNotNullParameter(v, "v");
                Intrinsics.checkNotNullParameter(insets, "insets");
                v.setPadding(v.getPaddingLeft(), v.getPaddingTop(), v.getPaddingRight(), Math.max(insets.getInsets(WindowInsetsCompat.Type.systemBars()).bottom, insets.getInsets(WindowInsetsCompat.Type.ime()).bottom));
                return insets;
            }
        });
        RdsButton supportCallStatusPrimaryBtn = getBinding().supportCallStatusPrimaryBtn;
        Intrinsics.checkNotNullExpressionValue(supportCallStatusPrimaryBtn, "supportCallStatusPrimaryBtn");
        OnClickListeners.onClick(supportCallStatusPrimaryBtn, new Function0() { // from class: com.robinhood.android.support.call.SupportCallStatusFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SupportCallStatusFragment.onViewCreated$lambda$0(this.f$0);
            }
        });
        RdsButton supportCallStatusSecondaryBtn = getBinding().supportCallStatusSecondaryBtn;
        Intrinsics.checkNotNullExpressionValue(supportCallStatusSecondaryBtn, "supportCallStatusSecondaryBtn");
        OnClickListeners.onClick(supportCallStatusSecondaryBtn, new Function0() { // from class: com.robinhood.android.support.call.SupportCallStatusFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SupportCallStatusFragment.onViewCreated$lambda$1(this.f$0);
            }
        });
        getBinding().supportCallStatusBanner.setDisplayOnly(true);
        Observable<Long> observableInterval = Observable.interval(0L, 1L, TimeUnit.MINUTES);
        Observable<R> map = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.support.call.SupportCallStatusFragment$onViewCreated$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((SupportCallStatusViewState) it).getIssue());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((SupportCallStatusFragment$onViewCreated$$inlined$mapNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableTake = ObservablesKt.filterIsPresent(map).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        Observable map2 = observableTake.map(new Function() { // from class: com.robinhood.android.support.call.SupportCallStatusFragment$onViewCreated$$inlined$mapNotNull$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((Issue.Phone) it).getRedirectUrl());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((SupportCallStatusFragment$onViewCreated$$inlined$mapNotNull$2<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(ObservablesKt.filterIsPresent(map2)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.support.call.SupportCallStatusFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SupportCallStatusFragment.onViewCreated$lambda$4(this.f$0, (Uri) obj);
            }
        });
        Observables observables = Observables.INSTANCE;
        Observable observableWithPrevious = ObservablesKt.withPrevious(getDuxo().getStates());
        Intrinsics.checkNotNull(observableInterval);
        Observable observableDoFinally = observables.combineLatest(observableWithPrevious, observableInterval).debounce(10L, TimeUnit.MILLISECONDS).map(new Function() { // from class: com.robinhood.android.support.call.SupportCallStatusFragment.onViewCreated.7
            @Override // io.reactivex.functions.Function
            public final Tuples2<Optional<SupportCallStatusViewState>, SupportCallStatusViewState> apply(Tuples2<? extends Tuples2<? extends Optional<SupportCallStatusViewState>, SupportCallStatusViewState>, Long> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (Tuples2) it.getFirst();
            }
        }).doOnSubscribe(new Consumer() { // from class: com.robinhood.android.support.call.SupportCallStatusFragment.onViewCreated.8
            @Override // io.reactivex.functions.Consumer
            public final void accept(Disposable disposable) {
                IdlingResourceCounters2.setBusy(IdlingResourceType.SUPPORT_CALL_STATUS, true);
            }
        }).doOnNext(new Consumer() { // from class: com.robinhood.android.support.call.SupportCallStatusFragment.onViewCreated.9
            @Override // io.reactivex.functions.Consumer
            public final void accept(Tuples2<? extends Optional<SupportCallStatusViewState>, SupportCallStatusViewState> tuples2) {
                IdlingResourceCounters2.setBusy(IdlingResourceType.SUPPORT_CALL_STATUS, tuples2.component2().getIssue() == null);
            }
        }).doFinally(new Action() { // from class: com.robinhood.android.support.call.SupportCallStatusFragment.onViewCreated.10
            @Override // io.reactivex.functions.Action
            public final void run() {
                IdlingResourceCounters2.setBusy(IdlingResourceType.SUPPORT_CALL_STATUS, false);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableDoFinally, "doFinally(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDoFinally), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.support.call.SupportCallStatusFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SupportCallStatusFragment.onViewCreated$lambda$7(this.f$0, view, (Tuples2) obj);
            }
        });
        final LottieAnimationView supportCallStatusLottieView = getBinding().supportCallStatusLottieView;
        Intrinsics.checkNotNullExpressionValue(supportCallStatusLottieView, "supportCallStatusLottieView");
        supportCallStatusLottieView.addLottieOnCompositionLoadedListener(new LottieOnCompositionLoadedListener() { // from class: com.robinhood.android.support.call.SupportCallStatusFragment.onViewCreated.12
            @Override // com.airbnb.lottie.LottieOnCompositionLoadedListener
            public final void onCompositionLoaded(LottieComposition lottieComposition) {
                supportCallStatusLottieView.playAnimation();
            }
        });
        Observable observableDistinctUntilChanged = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.support.call.SupportCallStatusFragment.onViewCreated.13
            @Override // io.reactivex.functions.Function
            public final SupportCallStatusViewState3 apply(SupportCallStatusViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getIllustration();
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.support.call.SupportCallStatusFragment$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SupportCallStatusFragment.onViewCreated$lambda$8(this.f$0, supportCallStatusLottieView, (SupportCallStatusViewState3) obj);
            }
        });
        if (savedInstanceState == null) {
            Observable<SupportCallStatusViewState> observableTake2 = getDuxo().getStates().filter(new Predicate() { // from class: com.robinhood.android.support.call.SupportCallStatusFragment.onViewCreated.15
                @Override // io.reactivex.functions.Predicate
                public final boolean test(SupportCallStatusViewState it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return it.getInquiryId() != null;
                }
            }).take(1L);
            Intrinsics.checkNotNullExpressionValue(observableTake2, "take(...)");
            LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableTake2), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.support.call.SupportCallStatusFragment$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SupportCallStatusFragment.onViewCreated$lambda$9(this.f$0, (SupportCallStatusViewState) obj);
                }
            });
        }
        initSwipeUpToDismissGesture();
        handleTransition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(SupportCallStatusFragment supportCallStatusFragment) {
        RdsButton supportCallStatusPrimaryBtn = supportCallStatusFragment.getBinding().supportCallStatusPrimaryBtn;
        Intrinsics.checkNotNullExpressionValue(supportCallStatusPrimaryBtn, "supportCallStatusPrimaryBtn");
        supportCallStatusFragment.handleOnClick(supportCallStatusPrimaryBtn);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(SupportCallStatusFragment supportCallStatusFragment) {
        RdsButton supportCallStatusSecondaryBtn = supportCallStatusFragment.getBinding().supportCallStatusSecondaryBtn;
        Intrinsics.checkNotNullExpressionValue(supportCallStatusSecondaryBtn, "supportCallStatusSecondaryBtn");
        supportCallStatusFragment.handleOnClick(supportCallStatusSecondaryBtn);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$4(SupportCallStatusFragment supportCallStatusFragment, Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        FragmentActivity fragmentActivityRequireActivity = supportCallStatusFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        Navigator.DefaultImpls.handleDeepLink$default(supportCallStatusFragment.getNavigator(), fragmentActivityRequireActivity, uri, null, null, false, null, 60, null);
        fragmentActivityRequireActivity.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$7(final SupportCallStatusFragment supportCallStatusFragment, View view, Tuples2 tuples2) {
        SpannableString spannableString$default;
        UnavailableChannelData unavailableChannelDataConsume;
        Banner banner;
        BannerStyle styles;
        Issue.Phone issue;
        Optional optional = (Optional) tuples2.component1();
        SupportCallStatusViewState supportCallStatusViewState = (SupportCallStatusViewState) tuples2.component2();
        supportCallStatusFragment.inquiryId = supportCallStatusViewState.getInquiryId();
        if (supportCallStatusViewState.getCanShowStaleStatusBanner() && (issue = supportCallStatusViewState.getIssue()) != null && issue.isStaleForUi()) {
            RdsInfoBannerView supportCallStatusStaleBannerView = supportCallStatusFragment.getBinding().supportCallStatusStaleBannerView;
            Intrinsics.checkNotNullExpressionValue(supportCallStatusStaleBannerView, "supportCallStatusStaleBannerView");
            supportCallStatusStaleBannerView.setVisibility(0);
            supportCallStatusFragment.getBinding().supportCallStatusStaleBannerView.setText(supportCallStatusFragment.getString(C39996R.string.support_call_status_stale_message, DurationFormatter.formatWide(Durations.since(supportCallStatusViewState.getIssue().getReceivedAt()))));
        } else {
            RdsInfoBannerView supportCallStatusStaleBannerView2 = supportCallStatusFragment.getBinding().supportCallStatusStaleBannerView;
            Intrinsics.checkNotNullExpressionValue(supportCallStatusStaleBannerView2, "supportCallStatusStaleBannerView");
            supportCallStatusStaleBannerView2.setVisibility(8);
        }
        SupportCallStatusViewState supportCallStatusViewState2 = (SupportCallStatusViewState) optional.component1();
        SpannableString spannableString$default2 = null;
        if (supportCallStatusViewState2 == null) {
            supportCallStatusFragment.getBinding().supportCallStatusTitleTxt.setText(supportCallStatusViewState.getTitle());
        } else {
            Issue.Phone issue2 = supportCallStatusViewState.getIssue();
            PhoneChannelStatus channelStatus = issue2 != null ? issue2.getChannelStatus() : null;
            Issue.Phone issue3 = supportCallStatusViewState2.getIssue();
            AnimationType partialReplace = (channelStatus == (issue3 != null ? issue3.getChannelStatus() : null) && channelStatus == PhoneChannelStatus.WAITING) ? new AnimationType.PartialReplace(0L, 1, null) : new AnimationType.FullReplace(0L, true, 1, null);
            RhTextView supportCallStatusTitleTxt = supportCallStatusFragment.getBinding().supportCallStatusTitleTxt;
            Intrinsics.checkNotNullExpressionValue(supportCallStatusTitleTxt, "supportCallStatusTitleTxt");
            String title = supportCallStatusViewState.getTitle();
            if (title == null) {
                title = "";
            }
            TextAnimatorKt.setAnimatedText$default(supportCallStatusTitleTxt, title, partialReplace, null, null, 12, null);
        }
        RhTextView rhTextView = supportCallStatusFragment.getBinding().supportCallStatusSubtitleTxt;
        RichText subtitle = supportCallStatusViewState.getSubtitle();
        if (subtitle != null) {
            android.content.Context contextRequireContext = supportCallStatusFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            spannableString$default = RichTexts.toSpannableString$default(subtitle, contextRequireContext, null, false, null, 14, null);
        } else {
            spannableString$default = null;
        }
        rhTextView.setText(spannableString$default);
        ShimmerLoadingView supportCallStatusLoadingView = supportCallStatusFragment.getBinding().supportCallStatusLoadingView;
        Intrinsics.checkNotNullExpressionValue(supportCallStatusLoadingView, "supportCallStatusLoadingView");
        supportCallStatusLoadingView.setVisibility(supportCallStatusViewState.getShowLoading() ? 0 : 8);
        RdsButton supportCallStatusPrimaryBtn = supportCallStatusFragment.getBinding().supportCallStatusPrimaryBtn;
        Intrinsics.checkNotNullExpressionValue(supportCallStatusPrimaryBtn, "supportCallStatusPrimaryBtn");
        supportCallStatusFragment.bindButtonState(supportCallStatusPrimaryBtn, supportCallStatusViewState.getPrimaryButtonState());
        RdsButton supportCallStatusSecondaryBtn = supportCallStatusFragment.getBinding().supportCallStatusSecondaryBtn;
        Intrinsics.checkNotNullExpressionValue(supportCallStatusSecondaryBtn, "supportCallStatusSecondaryBtn");
        supportCallStatusFragment.bindButtonState(supportCallStatusSecondaryBtn, supportCallStatusViewState.getSecondaryButtonState());
        Issue.Phone issue4 = supportCallStatusViewState.getIssue();
        if ((issue4 != null ? issue4.getId() : null) != null) {
            supportCallStatusFragment.getBinding().supportCallStatusBanner.setIssueId(supportCallStatusViewState.getIssue().getId());
        }
        Issue.Phone issue5 = supportCallStatusViewState.getIssue();
        Integer color = (issue5 == null || (banner = issue5.getBanner()) == null || (styles = banner.getStyles()) == null) ? null : supportCallStatusFragment.getColor(styles);
        if (color != null) {
            supportCallStatusFragment.getBinding().supportCallStatusBannerBackground.setBackgroundColor(color.intValue());
        }
        UiEvent<Optional<Survey>> cancelSuccessEvent = supportCallStatusViewState.getCancelSuccessEvent();
        final Optional<Survey> optionalConsume = cancelSuccessEvent != null ? cancelSuccessEvent.consume() : null;
        if (optionalConsume != null) {
            android.content.Context contextRequireContext2 = supportCallStatusFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
            RdsSnackbar.INSTANCE.make(view, C39996R.string.support_call_status_cancel_success_text, -1).setLeadingIcon(Contexts7.getThemeDrawable(contextRequireContext2, C20690R.attr.iconCheckmark16dp)).addDismissCallback(new Function2() { // from class: com.robinhood.android.support.call.SupportCallStatusFragment$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SupportCallStatusFragment.onViewCreated$lambda$7$lambda$5(optionalConsume, supportCallStatusFragment, (RdsSnackbar) obj, ((Integer) obj2).intValue());
                }
            }).show();
        }
        UiEvent<Unit> cancelFailedEvent = supportCallStatusViewState.getCancelFailedEvent();
        if ((cancelFailedEvent != null ? cancelFailedEvent.consume() : null) != null) {
            Issue.Phone issue6 = supportCallStatusViewState.getIssue();
            if (issue6 == null || !issue6.isCancellable()) {
                RdsSnackbar.INSTANCE.make(view, C39996R.string.support_call_status_cancel_fail_dialog_title, -1).show();
            } else {
                supportCallStatusFragment.logAppearAction(Component.ComponentType.CANCEL_ERROR_ALERT);
                android.content.Context contextRequireContext3 = supportCallStatusFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "requireContext(...)");
                RhDialogFragment.Builder negativeButton = new RhDialogFragment.Builder(contextRequireContext3).setId(C39996R.id.dialog_id_support_call_status_cancel_fail).setTitle(C39996R.string.support_call_status_cancel_fail_dialog_title, new Object[0]).setMessage(C39996R.string.support_call_status_cancel_fail_dialog_message, new Object[0]).setPositiveButton(C39996R.string.support_call_status_cancel_fail_dialog_positive_text, new Object[0]).setNegativeButton(C39996R.string.support_call_status_cancel_fail_dialog_negative_text, new Object[0]);
                FragmentManager parentFragmentManager = supportCallStatusFragment.getParentFragmentManager();
                Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
                RhDialogFragment.Builder.show$default(negativeButton, parentFragmentManager, "support-call-status-cancel-fail", false, 4, null);
            }
        }
        UiEvent<Unit> requeueSuccessEvent = supportCallStatusViewState.getRequeueSuccessEvent();
        if ((requeueSuccessEvent != null ? requeueSuccessEvent.consume() : null) != null) {
            supportCallStatusFragment.presentSurvey(Survey.CX_MISSED_CALL_STATUS_SCREEN_REQUEUE);
        }
        UiEvent<Unit> requeueFailedEvent = supportCallStatusViewState.getRequeueFailedEvent();
        if ((requeueFailedEvent != null ? requeueFailedEvent.consume() : null) != null) {
            android.content.Context contextRequireContext4 = supportCallStatusFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext4, "requireContext(...)");
            RhDialogFragment.Builder negativeButton2 = new RhDialogFragment.Builder(contextRequireContext4).setId(C39996R.id.dialog_id_support_call_status_requeue_fail).setTitle(C39996R.string.support_call_status_requeue_fail_dialog_title, new Object[0]).setMessage(C39996R.string.support_call_status_requeue_fail_dialog_message, new Object[0]).setPositiveButton(C39996R.string.support_call_status_requeue_fail_dialog_positive_text, new Object[0]).setNegativeButton(C11048R.string.general_label_dismiss, new Object[0]);
            FragmentManager parentFragmentManager2 = supportCallStatusFragment.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager2, "getParentFragmentManager(...)");
            RhDialogFragment.Builder.show$default(negativeButton2, parentFragmentManager2, "support-call-status-requeue-fail", false, 4, null);
        }
        UiEvent<UnavailableChannelData> channelUnavailableEvent = supportCallStatusViewState.getChannelUnavailableEvent();
        if (channelUnavailableEvent != null && (unavailableChannelDataConsume = channelUnavailableEvent.consume()) != null) {
            AlertDetails alertDetails = unavailableChannelDataConsume.getAlertDetails();
            RichText description = alertDetails.getDescription();
            if (description != null) {
                android.content.Context contextRequireContext5 = supportCallStatusFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext5, "requireContext(...)");
                spannableString$default2 = RichTexts.toSpannableString$default(description, contextRequireContext5, null, false, null, 14, null);
            }
            List<ChannelAvailabilityActionData> buttonDataList = UnavailableChannelDatas.toButtonDataList(unavailableChannelDataConsume);
            RhMultiButtonDialogFragment.Companion companion = RhMultiButtonDialogFragment.INSTANCE;
            android.content.Context contextRequireContext6 = supportCallStatusFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext6, "requireContext(...)");
            RhDialogFragment.Builder message = companion.create(contextRequireContext6, buttonDataList).setUseDesignSystemOverlay(true).setTitle(alertDetails.getTitle()).setMessage(spannableString$default2);
            FragmentManager childFragmentManager = supportCallStatusFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            RhDialogFragment.Builder.show$default(message, childFragmentManager, "channelUnavailableAlert", false, 4, null);
            supportCallStatusFragment.logAlertAppear(Channels3.toProtobuf(unavailableChannelDataConsume.getReason()));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$7$lambda$5(Optional optional, SupportCallStatusFragment supportCallStatusFragment, RdsSnackbar rdsSnackbar, int i) {
        Survey survey = (Survey) optional.component1();
        if (RdsSnackbar.Callback.INSTANCE.dismissedNormally(i) && survey != null) {
            supportCallStatusFragment.presentSurvey(survey);
        }
        return Unit.INSTANCE;
    }

    private final void bindButtonState(RdsButton rdsButton, final ButtonState buttonState) {
        rdsButton.setVisibility(buttonState != null ? 0 : 8);
        if (buttonState != null) {
            rdsButton.setLoading(buttonState.isLoading());
            rdsButton.setText(buttonState.getButtonText());
            rdsButton.setTag(buttonState.getAction());
            ViewsKt.eventData$default(rdsButton, false, new Function0() { // from class: com.robinhood.android.support.call.SupportCallStatusFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SupportCallStatusFragment.bindButtonState$lambda$14(buttonState, this);
                }
            }, 1, null);
            return;
        }
        rdsButton.setLoading(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$8(SupportCallStatusFragment supportCallStatusFragment, LottieAnimationView lottieAnimationView, SupportCallStatusViewState3 supportCallStatusViewState3) {
        boolean z = supportCallStatusViewState3 instanceof SupportCallStatusViewState3.Lottie;
        if (z) {
            ImageView supportCallStatusIllustrationImg = supportCallStatusFragment.getBinding().supportCallStatusIllustrationImg;
            Intrinsics.checkNotNullExpressionValue(supportCallStatusIllustrationImg, "supportCallStatusIllustrationImg");
            supportCallStatusIllustrationImg.setVisibility(8);
            lottieAnimationView.setVisibility(0);
            SupportCallStatusViewState3.Lottie lottie = (SupportCallStatusViewState3.Lottie) supportCallStatusViewState3;
            LottieAnimationViewsKt.setRemoteUrl(lottieAnimationView, lottie.getLottieUrl());
            lottieAnimationView.setRepeatCount(lottie.getLoopAnimation() ? -1 : 0);
        } else {
            if (!(supportCallStatusViewState3 instanceof SupportCallStatusViewState3.Drawable)) {
                throw new NoWhenBranchMatchedException();
            }
            ImageView supportCallStatusIllustrationImg2 = supportCallStatusFragment.getBinding().supportCallStatusIllustrationImg;
            Intrinsics.checkNotNullExpressionValue(supportCallStatusIllustrationImg2, "supportCallStatusIllustrationImg");
            supportCallStatusIllustrationImg2.setVisibility(0);
            lottieAnimationView.setVisibility(8);
            supportCallStatusFragment.getBinding().supportCallStatusIllustrationImg.setImageResource(((SupportCallStatusViewState3.Drawable) supportCallStatusViewState3).getDrawableRes());
        }
        SupportCallStatusViewState3.Lottie lottie2 = z ? (SupportCallStatusViewState3.Lottie) supportCallStatusViewState3 : null;
        if ((lottie2 != null ? lottie2.getLottieUrl() : null) != LottieUrl.SUPPORT_CALL_WAITING) {
            WaitingStatusAnimationController waitingStatusAnimationController = supportCallStatusFragment.waitingStatusAnimationController;
            if (waitingStatusAnimationController != null) {
                waitingStatusAnimationController.setEnabled(false);
            }
            supportCallStatusFragment.waitingStatusAnimationController = null;
        } else {
            if (supportCallStatusFragment.waitingStatusAnimationController != null) {
                throw new IllegalStateException("Check failed.");
            }
            supportCallStatusFragment.waitingStatusAnimationController = new WaitingStatusAnimationController(lottieAnimationView);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$9(SupportCallStatusFragment supportCallStatusFragment, SupportCallStatusViewState supportCallStatusViewState) {
        Intrinsics.checkNotNull(supportCallStatusViewState);
        supportCallStatusFragment.showEnablePushDialogIfNeeded(supportCallStatusViewState);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        logTapAction$default(this, UserInteractionEventData.Action.DISMISS, null, 2, null);
        exitScreen();
        return true;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C39996R.id.dialog_id_support_call_status_cancel) {
            logTapAction(UserInteractionEventData.Action.APPROVE, Component.ComponentType.CANCEL_CONFIRMATION_ALERT);
            getDuxo().cancelIssue();
            return true;
        }
        if (id == C39996R.id.dialog_id_support_call_status_cancel_fail) {
            logTapAction(UserInteractionEventData.Action.RETRY, Component.ComponentType.CANCEL_ERROR_ALERT);
            getDuxo().cancelIssue();
            return true;
        }
        if (id == C39996R.id.dialog_id_support_call_status_requeue_fail) {
            getDuxo().forceRequeueIssue();
            return true;
        }
        if (id == C39996R.id.dialog_id_support_call_status_push_prompt) {
            logPushPromptTap(UserInteractionEventData.Action.APPROVE);
            showNotificationSettings();
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onNegativeButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C39996R.id.dialog_id_support_call_status_cancel) {
            logTapAction(UserInteractionEventData.Action.DISMISS, Component.ComponentType.CANCEL_CONFIRMATION_ALERT);
            return true;
        }
        if (id == C39996R.id.dialog_id_support_call_status_cancel_fail) {
            logTapAction(UserInteractionEventData.Action.DISMISS, Component.ComponentType.CANCEL_ERROR_ALERT);
            return true;
        }
        if (id == C39996R.id.dialog_id_support_call_status_push_prompt) {
            logPushPromptTap(UserInteractionEventData.Action.DISMISS);
            return true;
        }
        return super.onNegativeButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.common.ui.RhMultiButtonDialogFragment.OnClickListener
    public void onButtonClicked(int id, RhMultiButtonDialogFragment.ButtonData buttonData) {
        Intrinsics.checkNotNullParameter(buttonData, "buttonData");
        if (!(buttonData instanceof ChannelAvailabilityActionData)) {
            throw new IllegalStateException("Check failed.");
        }
        ChannelAvailabilityActionData channelAvailabilityActionData = (ChannelAvailabilityActionData) buttonData;
        CXIssue.PhoneUnavailableReason protobuf = Channels3.toProtobuf(channelAvailabilityActionData.getUnavailableReason());
        AlertButtonAction buttonAction = channelAvailabilityActionData.getButtonAction();
        if (buttonAction instanceof AlertButtonAction.Requeue) {
            logAlertTap(UserInteractionEventData.Action.REQUEUE_CX_CALL, protobuf);
            getDuxo().forceRequeueIssue();
            return;
        }
        if (buttonAction instanceof AlertButtonAction.Dismiss) {
            logAlertTap(UserInteractionEventData.Action.DISMISS, protobuf);
            return;
        }
        if ((buttonAction instanceof AlertButtonAction.Create) || (buttonAction instanceof AlertButtonAction.Cancel) || (buttonAction instanceof AlertButtonAction.GoToHome) || (buttonAction instanceof AlertButtonAction.Unknown)) {
            Preconditions.INSTANCE.failUnexpectedItemKotlin(buttonAction);
            throw new ExceptionsH();
        }
        if (!(buttonAction instanceof AlertButtonAction.End) && !(buttonAction instanceof AlertButtonAction.View)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1) {
            handleNotificationSettingResult();
        } else {
            if (requestCode != 2) {
                return;
            }
            handleNotificationChannelSettingResult();
        }
    }

    @SuppressLint({"NewApi"})
    private final void handleNotificationSettingResult() {
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        NotificationManagerCompat notificationManager = ContextSystemServices.getNotificationManager(contextRequireContext);
        if (notificationManager.areNotificationsEnabled()) {
            if (NotificationManagers.getContactChannelOrDefault(notificationManager).getImportance() == 0) {
                showNotificationChannelSettingsIfNeeded();
            } else {
                showPushEnabledSnackbar();
            }
        }
    }

    @SuppressLint({"NewApi"})
    private final void handleNotificationChannelSettingResult() {
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        NotificationManagerCompat notificationManager = ContextSystemServices.getNotificationManager(contextRequireContext);
        if (!notificationManager.areNotificationsEnabled() || NotificationManagers.getContactChannelOrDefault(notificationManager).getImportance() == 0) {
            return;
        }
        showPushEnabledSnackbar();
    }

    @SuppressLint({"InlinedApi", "NewApi"})
    private final void showNotificationSettings() {
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        if (!ContextSystemServices.getNotificationManager(contextRequireContext).areNotificationsEnabled()) {
            Intent intentPutExtra = new Intent("android.settings.APP_NOTIFICATION_SETTINGS").putExtra("android.provider.extra.APP_PACKAGE", Contexts8.getPackageInfo$default(contextRequireContext, 0, 1, null).packageName);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
            startActivityForResult(intentPutExtra, 1);
            return;
        }
        showNotificationChannelSettingsIfNeeded();
    }

    private final void showNotificationChannelSettingsIfNeeded() {
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        NotificationChannelCompat contactChannelOrDefault = NotificationManagers.getContactChannelOrDefault(ContextSystemServices.getNotificationManager(contextRequireContext));
        if (contactChannelOrDefault.getImportance() == 0) {
            Intent intent = new Intent("android.settings.CHANNEL_NOTIFICATION_SETTINGS");
            intent.putExtra("android.provider.extra.APP_PACKAGE", Contexts8.getPackageInfo$default(contextRequireContext, 0, 1, null).packageName);
            intent.putExtra("android.provider.extra.CHANNEL_ID", contactChannelOrDefault.getId());
            startActivityForResult(intent, 2);
        }
    }

    private final void showPushEnabledSnackbar() {
        RdsSnackbar.Companion companion = RdsSnackbar.INSTANCE;
        ConstraintLayout root = getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        String string2 = getString(C39996R.string.support_call_status_push_notifications_enabled);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        companion.make(root, string2, -1).setLeadingIcon(C20690R.drawable.ic_rds_checkmark_16dp).show();
    }

    @SuppressLint({"NewApi"})
    private final void showEnablePushDialogIfNeeded(SupportCallStatusViewState viewState) {
        if (((LegacyFragmentKey.SupportCallStatus) INSTANCE.getArgs((Fragment) this)).getShowPushPrompt() && Compat.INSTANCE.isApiSupported(26) && viewState.isLoggedIn()) {
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            NotificationManagerCompat notificationManager = ContextSystemServices.getNotificationManager(contextRequireContext);
            NotificationChannelCompat contactChannelOrDefault = NotificationManagers.getContactChannelOrDefault(notificationManager);
            if (!notificationManager.areNotificationsEnabled() || contactChannelOrDefault.getImportance() == 0) {
                EventLogger.DefaultImpls.logAppear$default(getEventLogger(), UserInteractionEventData.Action.ACTION_UNSPECIFIED, new Screen(Screen.Name.CX_CALL_STATUS, null, null, null, 14, null), new Component(Component.ComponentType.ENABLE_PUSH_NOTIFICATIONS_ALERT, null, null, 6, null), null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, new CXIssue(String.valueOf(viewState.getInquiryId()), null, null, CXIssue.EnablePushNotificationReason.CX_CALL_REMINDER, null, null, null, null, null, 0, null, null, null, null, null, null, null, 0, null, false, null, false, null, 8388598, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -262145, -1, -1, -1, -1, -1, 16383, null), 8, null);
                RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
                android.content.Context contextRequireContext2 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                RhDialogFragment.Builder negativeButton = companion.create(contextRequireContext2).setId(C39996R.id.dialog_id_support_call_status_push_prompt).setTitle(C39996R.string.support_call_status_push_prompt_dialog_title, new Object[0]).setMessage(C39996R.string.support_call_status_push_prompt_dialog_message, new Object[0]).setPositiveButton(C39996R.string.support_call_status_push_prompt_dialog_positive_text, new Object[0]).setNegativeButton(C39996R.string.support_call_status_push_prompt_dialog_negative_text, new Object[0]);
                FragmentManager parentFragmentManager = getParentFragmentManager();
                Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
                RhDialogFragment.Builder.show$default(negativeButton, parentFragmentManager, "support-call-status-push-prompt", false, 4, null);
            }
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final void initSwipeUpToDismissGesture() throws Resources.NotFoundException {
        if (((LegacyFragmentKey.SupportCallStatus) INSTANCE.getArgs((Fragment) this)).getClearTask()) {
            return;
        }
        final int dimensionPixelSize = getResources().getDimensionPixelSize(C39996R.dimen.support_call_minimum_dismiss_velocity);
        this.gestureDetector = new GestureDetector(requireContext(), new GestureDetector.SimpleOnGestureListener() { // from class: com.robinhood.android.support.call.SupportCallStatusFragment.initSwipeUpToDismissGesture.1
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onDown(MotionEvent e) {
                Intrinsics.checkNotNullParameter(e, "e");
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
                Intrinsics.checkNotNullParameter(e2, "e2");
                if (velocityY >= dimensionPixelSize) {
                    return true;
                }
                this.onBackPressed();
                return true;
            }
        });
        requireView().setOnTouchListener(new View.OnTouchListener() { // from class: com.robinhood.android.support.call.SupportCallStatusFragment.initSwipeUpToDismissGesture.2
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                GestureDetector gestureDetector = SupportCallStatusFragment.this.gestureDetector;
                if (gestureDetector == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("gestureDetector");
                    gestureDetector = null;
                }
                return gestureDetector.onTouchEvent(motionEvent);
            }
        });
    }

    private final void logPushPromptTap(UserInteractionEventData.Action action) {
        EventLogger eventLogger = getEventLogger();
        Screen screen = new Screen(Screen.Name.CX_CALL_STATUS, null, null, null, 14, null);
        UUID uuid = this.inquiryId;
        String string2 = uuid != null ? uuid.toString() : null;
        if (string2 == null) {
            string2 = "";
        }
        EventLogger.DefaultImpls.logTap$default(eventLogger, action, screen, new Component(Component.ComponentType.ENABLE_PUSH_NOTIFICATIONS_ALERT, null, null, 6, null), null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, new CXIssue(string2, null, null, CXIssue.EnablePushNotificationReason.CX_CALL_REMINDER, null, null, null, null, null, 0, null, null, null, null, null, null, null, 0, null, false, null, false, null, 8388598, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -262145, -1, -1, -1, -1, -1, 16383, null), false, 40, null);
    }

    private final void handleTransition() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        fragmentActivityRequireActivity.setEnterSharedElementCallback(new SharedElementCallback() { // from class: com.robinhood.android.support.call.SupportCallStatusFragment.handleTransition.1
            @Override // androidx.core.app.SharedElementCallback
            public void onSharedElementEnd(List<String> sharedElementNames, List<View> sharedElements, List<View> sharedElementSnapshots) {
                Intrinsics.checkNotNullParameter(sharedElementNames, "sharedElementNames");
                Intrinsics.checkNotNullParameter(sharedElements, "sharedElements");
                Intrinsics.checkNotNullParameter(sharedElementSnapshots, "sharedElementSnapshots");
                SupportCallStatusFragment.this.getBinding().supportCallStatusBanner.setAlpha(1.0f);
                SupportCallStatusFragment.this.getBinding().supportCallStatusBannerBackground.setAlpha(1.0f);
                SupportCallStatusFragment.this.getBinding().supportCallStatusBanner.animate().alpha(0.0f).start();
                SupportCallStatusFragment.this.getBinding().supportCallStatusBannerBackground.animate().alpha(0.0f).start();
            }
        });
        Transition sharedElementReturnTransition = fragmentActivityRequireActivity.getWindow().getSharedElementReturnTransition();
        Intrinsics.checkNotNullExpressionValue(sharedElementReturnTransition, "getSharedElementReturnTransition(...)");
        Observable<TransitionEvent> observableTake = TransitionEventObservable2.transitionEvents(sharedElementReturnTransition).filter(new Predicate() { // from class: com.robinhood.android.support.call.SupportCallStatusFragment.handleTransition.2
            @Override // io.reactivex.functions.Predicate
            public final boolean test(TransitionEvent it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it == TransitionEvent.END;
            }
        }).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableTake), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.support.call.SupportCallStatusFragment$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SupportCallStatusFragment.handleTransition$lambda$12(this.f$0, (TransitionEvent) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleTransition$lambda$12(SupportCallStatusFragment supportCallStatusFragment, TransitionEvent transitionEvent) {
        LottieAnimationView lottieAnimationView = supportCallStatusFragment.getBinding().supportCallStatusLottieView;
        Intrinsics.checkNotNull(lottieAnimationView);
        boolean z = lottieAnimationView.getVisibility() == 0;
        lottieAnimationView.setVisibility(!z ? 0 : 8);
        lottieAnimationView.setVisibility(z ? 0 : 8);
        lottieAnimationView.resumeAnimation();
        return Unit.INSTANCE;
    }

    private final void handleOnClick(RdsButton rdsButton) {
        Object tag = rdsButton.getTag();
        ButtonState.Action action = tag instanceof ButtonState.Action ? (ButtonState.Action) tag : null;
        int i = action == null ? -1 : WhenMappings.$EnumSwitchMapping$0[action.ordinal()];
        if (i != -1) {
            if (i == 1) {
                logAppearAction(Component.ComponentType.CANCEL_CONFIRMATION_ALERT);
                android.content.Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                RhDialogFragment.Builder negativeButton = new RhDialogFragment.Builder(contextRequireContext).setId(C39996R.id.dialog_id_support_call_status_cancel).setTitle(C39996R.string.support_call_status_cancel_dialog_title, new Object[0]).setMessage(C39996R.string.support_call_status_cancel_dialog_message, new Object[0]).setPositiveButton(C39996R.string.support_call_status_cancel_dialog_positive_text, new Object[0]).setNegativeButton(C39996R.string.support_call_status_cancel_dialog_negative_text, new Object[0]);
                FragmentManager parentFragmentManager = getParentFragmentManager();
                Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
                RhDialogFragment.Builder.show$default(negativeButton, parentFragmentManager, "support-call-status-cancel", false, 4, null);
                return;
            }
            if (i == 2) {
                exitScreen();
                return;
            }
            if (i == 3) {
                getDuxo().requeueIssue();
                return;
            }
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            if (this.inquiryId != null) {
                Navigator navigator = getNavigator();
                android.content.Context contextRequireContext2 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                UUID uuid = this.inquiryId;
                Intrinsics.checkNotNull(uuid);
                Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, contextRequireContext2, new ContactSupportFragmentKey.Email(uuid), false, false, true, false, null, false, null, null, 996, null);
            }
        }
    }

    private final void exitScreen() {
        Observable<SupportCallStatusViewState> observableTake = getDuxo().getStates().take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableTake), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.support.call.SupportCallStatusFragment$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SupportCallStatusFragment.exitScreen$lambda$13(this.f$0, (SupportCallStatusViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit exitScreen$lambda$13(final SupportCallStatusFragment supportCallStatusFragment, SupportCallStatusViewState supportCallStatusViewState) {
        Issue.Phone issue = supportCallStatusViewState.getIssue();
        PhoneChannelStatus channelStatus = issue != null ? issue.getChannelStatus() : null;
        if (channelStatus == PhoneChannelStatus.WAITING || channelStatus == PhoneChannelStatus.SCHEDULED) {
            supportCallStatusFragment.getUserLeapManager().setPendingSurvey(Survey.CX_CALL_STATUS_SCREEN_DISMISS);
        }
        FragmentActivity fragmentActivityRequireActivity = supportCallStatusFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        if (((LegacyFragmentKey.SupportCallStatus) INSTANCE.getArgs((Fragment) supportCallStatusFragment)).getClearTask()) {
            if (supportCallStatusViewState.isLoggedIn()) {
                Navigator navigator = supportCallStatusFragment.getNavigator();
                android.content.Context contextRequireContext = supportCallStatusFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                Intent intentCreateIntent$default = Navigator.DefaultImpls.createIntent$default(navigator, contextRequireContext, MainActivityIntentKey.INSTANCE, null, false, 12, null);
                intentCreateIntent$default.addFlags(268468224);
                fragmentActivityRequireActivity.startActivity(intentCreateIntent$default);
                fragmentActivityRequireActivity.overridePendingTransition(0, C11048R.anim.activity_exit_top);
            } else {
                Navigator navigator2 = supportCallStatusFragment.getNavigator();
                android.content.Context contextRequireContext2 = supportCallStatusFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                Intent intentCreateIntent$default2 = Navigator.DefaultImpls.createIntent$default(navigator2, contextRequireContext2, WelcomeIntentKey.INSTANCE, null, false, 12, null);
                Navigator navigator3 = supportCallStatusFragment.getNavigator();
                android.content.Context contextRequireContext3 = supportCallStatusFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "requireContext(...)");
                Intent intentCreateIntent$default3 = Navigator.DefaultImpls.createIntent$default(navigator3, contextRequireContext3, new Login(null, null, false, 7, null), null, false, 12, null);
                intentCreateIntent$default2.addFlags(268468224);
                fragmentActivityRequireActivity.startActivities(new Intent[]{intentCreateIntent$default2, intentCreateIntent$default3});
                fragmentActivityRequireActivity.overridePendingTransition(0, C11048R.anim.activity_exit_top);
            }
        } else {
            fragmentActivityRequireActivity.setEnterSharedElementCallback(new SharedElementCallback() { // from class: com.robinhood.android.support.call.SupportCallStatusFragment$exitScreen$1$1
                @Override // androidx.core.app.SharedElementCallback
                public void onSharedElementEnd(List<String> sharedElementNames, List<View> sharedElements, List<View> sharedElementSnapshots) {
                    Intrinsics.checkNotNullParameter(sharedElementNames, "sharedElementNames");
                    Intrinsics.checkNotNullParameter(sharedElements, "sharedElements");
                    Intrinsics.checkNotNullParameter(sharedElementSnapshots, "sharedElementSnapshots");
                    this.this$0.getBinding().supportCallStatusBanner.animate().alpha(1.0f).start();
                    this.this$0.getBinding().supportCallStatusBannerBackground.animate().alpha(1.0f).start();
                }
            });
            fragmentActivityRequireActivity.finishAfterTransition();
        }
        return Unit.INSTANCE;
    }

    static /* synthetic */ void logTapAction$default(SupportCallStatusFragment supportCallStatusFragment, UserInteractionEventData.Action action, Component.ComponentType componentType, int i, Object obj) {
        if ((i & 1) != 0) {
            action = UserInteractionEventData.Action.ACTION_UNSPECIFIED;
        }
        if ((i & 2) != 0) {
            componentType = Component.ComponentType.COMPONENT_TYPE_UNSPECIFIED;
        }
        supportCallStatusFragment.logTapAction(action, componentType);
    }

    private final void logTapAction(UserInteractionEventData.Action action, Component.ComponentType componentType) {
        EventLogger eventLogger = getEventLogger();
        Screen screen = new Screen(Screen.Name.CX_CALL_STATUS, null, null, null, 14, null);
        Component component = new Component(componentType, null, null, 6, null);
        UUID uuid = this.inquiryId;
        String string2 = uuid != null ? uuid.toString() : null;
        if (string2 == null) {
            string2 = "";
        }
        EventLogger.DefaultImpls.logTap$default(eventLogger, action, screen, component, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, new CXIssue(string2, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, 0, null, false, null, false, null, 8388606, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -262145, -1, -1, -1, -1, -1, 16383, null), false, 40, null);
    }

    private final void logAppearAction(Component.ComponentType componentType) {
        EventLogger eventLogger = getEventLogger();
        UserInteractionEventData.Action action = UserInteractionEventData.Action.ACTION_UNSPECIFIED;
        Screen screen = new Screen(Screen.Name.CX_CALL_STATUS, null, null, null, 14, null);
        Component component = new Component(componentType, null, null, 6, null);
        UUID uuid = this.inquiryId;
        String string2 = uuid != null ? uuid.toString() : null;
        if (string2 == null) {
            string2 = "";
        }
        EventLogger.DefaultImpls.logAppear$default(eventLogger, action, screen, component, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, new CXIssue(string2, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, 0, null, false, null, false, null, 8388606, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -262145, -1, -1, -1, -1, -1, 16383, null), 8, null);
    }

    private final void logAlertTap(UserInteractionEventData.Action action, CXIssue.PhoneUnavailableReason reason) {
        EventLogger eventLogger = getEventLogger();
        Screen screen = new Screen(Screen.Name.CX_CALL_STATUS, null, null, null, 14, null);
        Component component = new Component(Component.ComponentType.CX_PHONE_UNAVAILABLE_ALERT, null, null, 6, null);
        UUID uuid = this.inquiryId;
        String string2 = uuid != null ? uuid.toString() : null;
        if (string2 == null) {
            string2 = "";
        }
        EventLogger.DefaultImpls.logTap$default(eventLogger, action, screen, component, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, new CXIssue(string2, null, reason, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, 0, null, false, null, false, null, 8388602, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -262145, -1, -1, -1, -1, -1, 16383, null), false, 40, null);
    }

    private final void logAlertAppear(CXIssue.PhoneUnavailableReason reason) {
        EventLogger eventLogger = getEventLogger();
        Screen screen = new Screen(Screen.Name.CX_CALL_STATUS, null, null, null, 14, null);
        UserInteractionEventData.Action action = UserInteractionEventData.Action.ACTION_UNSPECIFIED;
        Component component = new Component(Component.ComponentType.CX_PHONE_UNAVAILABLE_ALERT, null, null, 6, null);
        UUID uuid = this.inquiryId;
        String string2 = uuid != null ? uuid.toString() : null;
        if (string2 == null) {
            string2 = "";
        }
        EventLogger.DefaultImpls.logAppear$default(eventLogger, action, screen, component, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, new CXIssue(string2, null, reason, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, 0, null, false, null, false, null, 8388602, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -262145, -1, -1, -1, -1, -1, 16383, null), 8, null);
    }

    private final void presentSurvey(Survey survey) {
        getUserLeapManager().presentSurveyIfNecessary(this, survey);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor bindButtonState$lambda$14(ButtonState buttonState, SupportCallStatusFragment supportCallStatusFragment) {
        UserInteractionEventData.Action eventAction = buttonState.getAction().getEventAction();
        UUID uuid = supportCallStatusFragment.inquiryId;
        String string2 = uuid != null ? uuid.toString() : null;
        if (string2 == null) {
            string2 = "";
        }
        return new UserInteractionEventDescriptor(null, null, eventAction, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, new CXIssue(string2, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, 0, null, false, null, false, null, 8388606, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -262145, -1, -1, -1, -1, -1, 16383, null), null, null, 51, null);
    }

    private final Integer getColor(BannerStyle bannerStyle) {
        BannerStyleData light;
        if (getScarletManager().contains(DayNightOverlay.NIGHT)) {
            light = bannerStyle.getDark();
        } else {
            light = bannerStyle.getLight();
        }
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Integer colorAttr = BannerStyleDatas.getColorAttr(light, contextRequireContext);
        if (colorAttr == null) {
            return null;
        }
        int iIntValue = colorAttr.intValue();
        android.content.Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
        return Integer.valueOf(ThemeColors.getThemeColor(contextRequireContext2, iIntValue));
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenName() {
        return this.screenName;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    /* renamed from: getScreenDescription */
    public String getProfileId() {
        UUID uuid = this.inquiryId;
        if (uuid != null) {
            return String.valueOf(uuid);
        }
        return null;
    }

    /* compiled from: SupportCallStatusFragment.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u0003B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/support/call/SupportCallStatusFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolver;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$SupportCallStatus;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/support/call/SupportCallStatusFragment;", "<init>", "()V", "REQUEST_CODE_NOTIFICATION_SETTINGS", "", "REQUEST_CODE_NOTIFICATION_CHANNEL_SETTINGS", "createFragment", "Landroidx/fragment/app/Fragment;", "key", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolver<LegacyFragmentKey.SupportCallStatus>, FragmentWithArgsCompanion<SupportCallStatusFragment, LegacyFragmentKey.SupportCallStatus> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyFragmentKey.SupportCallStatus getArgs(SupportCallStatusFragment supportCallStatusFragment) {
            return (LegacyFragmentKey.SupportCallStatus) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, supportCallStatusFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public SupportCallStatusFragment newInstance(LegacyFragmentKey.SupportCallStatus supportCallStatus) {
            return (SupportCallStatusFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, supportCallStatus);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(SupportCallStatusFragment supportCallStatusFragment, LegacyFragmentKey.SupportCallStatus supportCallStatus) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, supportCallStatusFragment, supportCallStatus);
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.SupportCallStatus key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return SupportCallStatusFragment.INSTANCE.newInstance((Parcelable) key);
        }
    }
}
