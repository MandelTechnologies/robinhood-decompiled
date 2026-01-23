package com.robinhood.android.onboarding.p205ui.usercreation;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.jakewharton.rxbinding3.view.RxView;
import com.jakewharton.rxbinding3.widget.RxTextView;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.onboarding.C11287R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.HtmlCompat2;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.designsystem.textinput.RdsTextInputEditText;
import com.robinhood.android.lib.verification.C20682R;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.onboarding.C22739R;
import com.robinhood.android.onboarding.contracts.UserCreationMarketBottomSheetFragmentKey;
import com.robinhood.android.onboarding.databinding.FragmentUserCreationEmailBinding;
import com.robinhood.android.onboarding.p205ui.usercreation.UserCreationEmailEvent;
import com.robinhood.android.onboarding.p205ui.usercreation.UserCreationEmailFragment;
import com.robinhood.android.onboarding.p205ui.usercreation.UserCreationMarketOptInBottomSheetFragment;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.user.contracts.auth.Login;
import com.robinhood.shared.user.contracts.auth.UserCreation;
import com.robinhood.utils.extensions.Activity;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import io.reactivex.Observable;
import java.util.NoSuchElementException;
import kotlin.ExceptionsH;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: UserCreationEmailFragment.kt */
@Metadata(m3635d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 b2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0003`abB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u000107H\u0016J\b\u00108\u001a\u000203H\u0016J\b\u00109\u001a\u000203H\u0016J\u001a\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u000107H\u0016J\u001a\u0010?\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u000107H\u0016J\u001a\u0010@\u001a\u00020;2\u0006\u0010A\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u000107H\u0016J\u001a\u0010B\u001a\u00020;2\u0006\u0010A\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u000107H\u0016J\u0010\u0010C\u001a\u0002032\u0006\u0010D\u001a\u00020EH\u0002J\u001a\u0010F\u001a\u0002032\b\u0010G\u001a\u0004\u0018\u00010/2\u0006\u0010H\u001a\u00020;H\u0016J\u0010\u0010I\u001a\u0002032\u0006\u0010J\u001a\u00020KH\u0002J\u0010\u0010L\u001a\u0002032\u0006\u0010M\u001a\u00020NH\u0002J\b\u0010O\u001a\u000203H\u0002J\u0010\u0010P\u001a\u0002032\u0006\u0010M\u001a\u00020QH\u0002J\u0010\u0010R\u001a\u0002032\u0006\u0010M\u001a\u00020SH\u0002J\u0010\u0010T\u001a\u0002032\u0006\u0010M\u001a\u00020UH\u0002J\u0010\u0010V\u001a\u0002032\u0006\u0010M\u001a\u00020WH\u0002J\u0010\u0010X\u001a\u0002032\u0006\u0010M\u001a\u00020YH\u0002J\u0010\u0010Z\u001a\u0002032\u0006\u0010M\u001a\u00020[H\u0002J\u0010\u0010\\\u001a\u0002032\u0006\u0010M\u001a\u00020]H\u0002J\u0010\u0010^\u001a\u0002032\u0006\u0010_\u001a\u00020;H\u0002R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R\u001b\u0010#\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b%\u0010&R\u001b\u0010)\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010(\u001a\u0004\b+\u0010,R\u0016\u0010.\u001a\u0004\u0018\u00010/8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101¨\u0006c"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationEmailFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/common/ui/RhDialogFragment$OnClickListener;", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationMarketOptInBottomSheetFragment$Callbacks;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "appType", "Lcom/robinhood/shared/app/type/AppType;", "getAppType", "()Lcom/robinhood/shared/app/type/AppType;", "setAppType", "(Lcom/robinhood/shared/app/type/AppType;)V", "duxo", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationEmailDuxo;", "getDuxo", "()Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationEmailDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/onboarding/databinding/FragmentUserCreationEmailBinding;", "getBinding", "()Lcom/robinhood/android/onboarding/databinding/FragmentUserCreationEmailBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationEmailFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationEmailFragment$Callbacks;", "callbacks$delegate", "screenSource", "", "getScreenSource", "()Ljava/lang/String;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onPause", "onPositiveButtonClicked", "", "id", "", "passthroughArgs", "onNegativeButtonClicked", "onPrimaryButtonClicked", "dialogId", "onSecondaryButtonClicked", "logWaitlistBottomSheetAction", "action", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "onOptInMarketingSelected", "email", "optIn", "bindState", "state", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationEmailViewState;", "handleEvent", "event", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationEmailEvent;", "setDefaultEmail", "onSuggestedEmailEvent", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationEmailEvent$SuggestedEmail;", "onFinishEvent", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationEmailEvent$Finish;", "onPromotionalEmailRequestEvent", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationEmailEvent$PromotionEmailBottomSheet;", "onPresentGBWaitlistBottomSheet", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationEmailEvent$GBEmailWaitlistBottomSheet;", "onOpenOnboardingWaitlistEvent", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationEmailEvent$GBOnboardingWaitlist;", "onGenericErrorEvent", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationEmailEvent$GenericError;", "onDuplicateEmailErrorEvent", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationEmailEvent$DuplicateEmailError;", "onLoading", "isLoading", "Callbacks", "Args", "Companion", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class UserCreationEmailFragment extends BaseFragment implements RhDialogFragment.OnClickListener, UserCreationMarketOptInBottomSheetFragment.Callbacks, AutoLoggableFragment {
    private static final String ARG_VALIDATION_EMAIL = "validationEmail";
    private static final String DUPLICATE_EMAIL_ERROR_DIALOG_TAG = "duplicate-email-error";
    private static final String GB_ONBOARDING_WAITLIST_BOTTOM_SHEET_IDENTIFIER = "user-creation-email-waitlist-bottom-sheet";
    private static final String GB_ONBOARDING_WAITLIST_URL = "gb-onboarding-waitlist-url";
    private static final String GOOGLE_ACCOUNT_TYPE = "com.google";
    private static final String SUGGESTED_EMAIL = "rhSuggestedEmail";
    public AnalyticsLogger analytics;
    public AppType appType;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public EventLogger eventLogger;
    private final Screen eventScreen;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(UserCreationEmailFragment.class, "binding", "getBinding()Lcom/robinhood/android/onboarding/databinding/FragmentUserCreationEmailBinding;", 0)), Reflection.property1(new PropertyReference1Impl(UserCreationEmailFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationEmailFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: UserCreationEmailFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationEmailFragment$Callbacks;", "", "onAlreadyHaveAnAcctClicked", "", "email", "", "onEmailFragmentFinished", "isFromCcWaitlist", "", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onAlreadyHaveAnAcctClicked(String email);

        void onEmailFragmentFinished(String email, boolean isFromCcWaitlist);
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

    public UserCreationEmailFragment() {
        super(C22739R.layout.fragment_user_creation_email);
        this.eventScreen = new Screen(Screen.Name.USER_CREATION_EMAIL, null, "email", null, 10, null);
        this.duxo = DuxosKt.duxo(this, UserCreationEmailDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, UserCreationEmailFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.onboarding.ui.usercreation.UserCreationEmailFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (android.content.Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof UserCreationEmailFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
    }

    public final AnalyticsLogger getAnalytics() {
        AnalyticsLogger analyticsLogger = this.analytics;
        if (analyticsLogger != null) {
            return analyticsLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        return null;
    }

    public final void setAnalytics(AnalyticsLogger analyticsLogger) {
        Intrinsics.checkNotNullParameter(analyticsLogger, "<set-?>");
        this.analytics = analyticsLogger;
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

    public final AppType getAppType() {
        AppType appType = this.appType;
        if (appType != null) {
            return appType;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appType");
        return null;
    }

    public final void setAppType(AppType appType) {
        Intrinsics.checkNotNullParameter(appType, "<set-?>");
        this.appType = appType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UserCreationEmailDuxo getDuxo() {
        return (UserCreationEmailDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentUserCreationEmailBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentUserCreationEmailBinding) value;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenSource() {
        return requireBaseActivity().getScreenSource();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        int i;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        BaseFragment.collectDuxoState$default(this, null, new C229101(null), 1, null);
        if (savedInstanceState == null) {
            setDefaultEmail();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            getBinding().userCreationEmailInput.setImportantForAutofill(1);
            getBinding().userCreationEmailInput.setAutofillHints(new String[]{"emailAddress"});
        }
        getBinding().userCreationEmailDisclosure.setClickable(true);
        if (getAppType() == AppType.RHC) {
            RhTextView rhTextView = getBinding().userCreationEmailDisclosure;
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            rhTextView.setText(HtmlCompat2.fromHtml$default(resources, C22739R.string.rhc_user_creation_email_disclosure, 0, 2, null));
            getBinding().userCreationEmailTitle.setText(C22739R.string.rhc_user_creation_email_title);
            getBinding().userCreationEmailSubtitle.setText(C22739R.string.rhc_user_creation_email_subtitle);
            return;
        }
        RhTextView rhTextView2 = getBinding().userCreationEmailDisclosure;
        Resources resources2 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        if (Intrinsics.areEqual(((Args) INSTANCE.getArgs((Fragment) this)).getCountryCode(), CountryCode.Supported.UnitedKingdom.INSTANCE)) {
            i = C22739R.string.user_creation_email_disclosure_uk;
        } else {
            i = C22739R.string.user_creation_email_disclosure;
        }
        rhTextView2.setText(HtmlCompat2.fromHtml$default(resources2, i, 0, 2, null));
        getBinding().userCreationEmailTitle.setText(C11287R.string.onboarding_email_address_prompt);
        getBinding().userCreationEmailSubtitle.setText(C22739R.string.user_creation_email_subtitle);
    }

    /* compiled from: UserCreationEmailFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.onboarding.ui.usercreation.UserCreationEmailFragment$onViewCreated$1", m3645f = "UserCreationEmailFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.onboarding.ui.usercreation.UserCreationEmailFragment$onViewCreated$1 */
    static final class C229101 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C229101(Continuation<? super C229101> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C229101 c229101 = UserCreationEmailFragment.this.new C229101(continuation);
            c229101.L$0 = obj;
            return c229101;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C229101) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: UserCreationEmailFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.onboarding.ui.usercreation.UserCreationEmailFragment$onViewCreated$1$1", m3645f = "UserCreationEmailFragment.kt", m3646l = {87}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.onboarding.ui.usercreation.UserCreationEmailFragment$onViewCreated$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ UserCreationEmailFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(UserCreationEmailFragment userCreationEmailFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = userCreationEmailFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: UserCreationEmailFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.onboarding.ui.usercreation.UserCreationEmailFragment$onViewCreated$1$1$1, reason: invalid class name and collision with other inner class name */
            /* synthetic */ class C503111 implements FlowCollector, FunctionAdapter {
                final /* synthetic */ UserCreationEmailFragment $tmp0;

                C503111(UserCreationEmailFragment userCreationEmailFragment) {
                    this.$tmp0 = userCreationEmailFragment;
                }

                public final boolean equals(Object obj) {
                    if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                        return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.FunctionAdapter
                public final Function<?> getFunctionDelegate() {
                    return new AdaptedFunctionReference(2, this.$tmp0, UserCreationEmailFragment.class, "bindState", "bindState(Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationEmailViewState;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }

                public final Object emit(UserCreationEmailViewState userCreationEmailViewState, Continuation<? super Unit> continuation) {
                    Object objInvokeSuspend$bindState = AnonymousClass1.invokeSuspend$bindState(this.$tmp0, userCreationEmailViewState, continuation);
                    return objInvokeSuspend$bindState == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$bindState : Unit.INSTANCE;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                    return emit((UserCreationEmailViewState) obj, (Continuation<? super Unit>) continuation);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow<UserCreationEmailViewState> stateFlow = this.this$0.getDuxo().getStateFlow();
                    C503111 c503111 = new C503111(this.this$0);
                    this.label = 1;
                    if (stateFlow.collect(c503111, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new ExceptionsH();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ Object invokeSuspend$bindState(UserCreationEmailFragment userCreationEmailFragment, UserCreationEmailViewState userCreationEmailViewState, Continuation continuation) {
                userCreationEmailFragment.bindState(userCreationEmailViewState);
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(UserCreationEmailFragment.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(UserCreationEmailFragment.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(UserCreationEmailFragment.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: UserCreationEmailFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.onboarding.ui.usercreation.UserCreationEmailFragment$onViewCreated$1$2", m3645f = "UserCreationEmailFragment.kt", m3646l = {91}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.onboarding.ui.usercreation.UserCreationEmailFragment$onViewCreated$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ UserCreationEmailFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(UserCreationEmailFragment userCreationEmailFragment, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = userCreationEmailFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowFilterNotNull = FlowKt.filterNotNull(this.this$0.getDuxo().getEventFlow());
                    final UserCreationEmailFragment userCreationEmailFragment = this.this$0;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.onboarding.ui.usercreation.UserCreationEmailFragment.onViewCreated.1.2.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit((Event<UserCreationEmailEvent>) obj2, (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(final Event<UserCreationEmailEvent> event, Continuation<? super Unit> continuation) {
                            EventConsumer<UserCreationEmailEvent> eventConsumerInvoke;
                            final UserCreationEmailFragment userCreationEmailFragment2 = userCreationEmailFragment;
                            if ((event.getData() instanceof UserCreationEmailEvent) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.onboarding.ui.usercreation.UserCreationEmailFragment$onViewCreated$1$2$1$emit$$inlined$consumeIfType$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) throws Throwable {
                                        m16863invoke(obj2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m16863invoke(Object it) throws Throwable {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        userCreationEmailFragment2.handleEvent((UserCreationEmailEvent) event.getData());
                                    }
                                });
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (flowFilterNotNull.collect(flowCollector, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* compiled from: UserCreationEmailFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.onboarding.ui.usercreation.UserCreationEmailFragment$onViewCreated$1$3", m3645f = "UserCreationEmailFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.onboarding.ui.usercreation.UserCreationEmailFragment$onViewCreated$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ UserCreationEmailFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(UserCreationEmailFragment userCreationEmailFragment, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = userCreationEmailFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                UserCreationEmailFragment userCreationEmailFragment = this.this$0;
                RdsButton userCreationEmailPrimaryCta = userCreationEmailFragment.getBinding().userCreationEmailPrimaryCta;
                Intrinsics.checkNotNullExpressionValue(userCreationEmailPrimaryCta, "userCreationEmailPrimaryCta");
                Observable observableMerge = Observable.merge(RxView.clicks(userCreationEmailPrimaryCta), this.this$0.getBinding().userCreationEmailInput.onEnterOrDonePressed());
                Intrinsics.checkNotNullExpressionValue(observableMerge, "merge(...)");
                ScopedObservable scopedObservableBind$default = LifecycleHost.DefaultImpls.bind$default(userCreationEmailFragment, observableMerge, (LifecycleEvent) null, 1, (Object) null);
                final UserCreationEmailFragment userCreationEmailFragment2 = this.this$0;
                scopedObservableBind$default.subscribeKotlin(new Function1() { // from class: com.robinhood.android.onboarding.ui.usercreation.UserCreationEmailFragment$onViewCreated$1$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return UserCreationEmailFragment.C229101.AnonymousClass3.invokeSuspend$lambda$0(userCreationEmailFragment2, obj2);
                    }
                });
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$0(UserCreationEmailFragment userCreationEmailFragment, Object obj) {
                EventLogger.DefaultImpls.logTap$default(userCreationEmailFragment.getEventLogger(), null, userCreationEmailFragment.getEventScreen(), new Component(Component.ComponentType.BUTTON, "continue", null, 4, null), null, null, false, 57, null);
                userCreationEmailFragment.getDuxo().onContinueCtaClicked();
                return Unit.INSTANCE;
            }
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        RdsTextInputEditText userCreationEmailInput = getBinding().userCreationEmailInput;
        Intrinsics.checkNotNullExpressionValue(userCreationEmailInput, "userCreationEmailInput");
        BaseFragment.keyboardFocusOn$default(this, userCreationEmailInput, false, 2, null);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onPause() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        Activity.hideKeyboard$default(fragmentActivityRequireActivity, false, 1, null);
        super.onPause();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C11287R.id.dialog_id_email_entry_validation_error) {
            EventLogger.DefaultImpls.logTap$default(getEventLogger(), null, getEventScreen(), new Component(Component.ComponentType.BUTTON, "INVALID_EMAIL_ERROR_suggested_email", null, 4, null), null, null, false, 57, null);
            Intrinsics.checkNotNull(passthroughArgs);
            String string2 = passthroughArgs.getString(SUGGESTED_EMAIL);
            if (string2 == null) {
                string2 = String.valueOf(getBinding().userCreationEmailInput.getText());
            }
            getBinding().userCreationEmailInput.setText(string2);
            getDuxo().onEmailValidated(string2);
            return true;
        }
        if (id == C22739R.id.dialog_id_onboarding_duplicate_email) {
            EventLogger.DefaultImpls.logTap$default(getEventLogger(), null, getEventScreen(), new Component(Component.ComponentType.BUTTON, "EMAIL_EXIST_ERROR_log_in", null, 4, null), null, null, false, 57, null);
            Intrinsics.checkNotNull(passthroughArgs);
            String string3 = passthroughArgs.getString(ARG_VALIDATION_EMAIL);
            Navigator navigator = getNavigator();
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            Navigator.DefaultImpls.startActivity$default(navigator, fragmentActivityRequireActivity, new Login(string3, ((Args) INSTANCE.getArgs((Fragment) this)).getUserCreation().getLoginInsteadExitDeepLinkOverride(), false, 4, null), null, false, null, null, 60, null);
            return true;
        }
        if (id == C20682R.id.dialog_id_privacy_policy_disclosure) {
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onNegativeButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C11287R.id.dialog_id_email_entry_validation_error) {
            if ((passthroughArgs != null ? passthroughArgs.getString(SUGGESTED_EMAIL) : null) == null) {
                return true;
            }
            getDuxo().onEmailValidated(String.valueOf(getBinding().userCreationEmailInput.getText()));
            return true;
        }
        return super.onNegativeButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhBottomSheetDialogFragment.OnClickListener
    public boolean onPrimaryButtonClicked(int dialogId, Bundle passthroughArgs) {
        if (dialogId == C22739R.id.dialog_id_user_email_waitlist_bottom_sheet) {
            Intrinsics.checkNotNull(passthroughArgs);
            String string2 = passthroughArgs.getString(GB_ONBOARDING_WAITLIST_URL);
            if (string2 == null) {
                return true;
            }
            logWaitlistBottomSheetAction(UserInteractionEventData.Action.JOIN_WAITLIST);
            getDuxo().onVisitJoinWaitlistPage(string2);
            return true;
        }
        return super.onPrimaryButtonClicked(dialogId, passthroughArgs);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhBottomSheetDialogFragment.OnClickListener
    public boolean onSecondaryButtonClicked(int dialogId, Bundle passthroughArgs) {
        if (dialogId != C22739R.id.dialog_id_user_email_waitlist_bottom_sheet) {
            return false;
        }
        logWaitlistBottomSheetAction(UserInteractionEventData.Action.DISMISS);
        return false;
    }

    private final void logWaitlistBottomSheetAction(UserInteractionEventData.Action action) {
        EventLogger.DefaultImpls.logTap$default(getEventLogger(), action, new Screen(getEventScreen().getName(), null, null, null, 14, null), new Component(Component.ComponentType.BOTTOM_SHEET, GB_ONBOARDING_WAITLIST_BOTTOM_SHEET_IDENTIFIER, null, 4, null), null, null, false, 56, null);
    }

    @Override // com.robinhood.android.onboarding.ui.usercreation.UserCreationMarketOptInBottomSheetFragment.Callbacks
    public void onOptInMarketingSelected(String email, boolean optIn) {
        if (email == null) {
            email = String.valueOf(getBinding().userCreationEmailInput.getText());
        }
        getDuxo().onMarketingOptInSubmitted(optIn, email);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindState(final UserCreationEmailViewState state) {
        onLoading(state.isLoading());
        if (getAppType() == AppType.TRADER) {
            RdsTextButton userCreationAlreadyHaveAccountBtn = getBinding().userCreationAlreadyHaveAccountBtn;
            Intrinsics.checkNotNullExpressionValue(userCreationAlreadyHaveAccountBtn, "userCreationAlreadyHaveAccountBtn");
            userCreationAlreadyHaveAccountBtn.setVisibility(state.getIsAlreadyHaveAccountButtonVisible() ? 0 : 8);
        }
        getBinding().userCreationEmailPrimaryCta.setEnabled(state.isContinueEnabled());
        RdsTextButton userCreationAlreadyHaveAccountBtn2 = getBinding().userCreationAlreadyHaveAccountBtn;
        Intrinsics.checkNotNullExpressionValue(userCreationAlreadyHaveAccountBtn2, "userCreationAlreadyHaveAccountBtn");
        OnClickListeners.onClick(userCreationAlreadyHaveAccountBtn2, new Function0() { // from class: com.robinhood.android.onboarding.ui.usercreation.UserCreationEmailFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UserCreationEmailFragment.bindState$lambda$0(this.f$0, state);
            }
        });
        RdsTextInputEditText userCreationEmailInput = getBinding().userCreationEmailInput;
        Intrinsics.checkNotNullExpressionValue(userCreationEmailInput, "userCreationEmailInput");
        LifecycleHost.DefaultImpls.bind$default(this, RxTextView.textChanges(userCreationEmailInput), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.onboarding.ui.usercreation.UserCreationEmailFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UserCreationEmailFragment.bindState$lambda$1(this.f$0, (CharSequence) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindState$lambda$0(UserCreationEmailFragment userCreationEmailFragment, UserCreationEmailViewState userCreationEmailViewState) {
        userCreationEmailFragment.getCallbacks().onAlreadyHaveAnAcctClicked(userCreationEmailViewState.getTypedEmail());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindState$lambda$1(UserCreationEmailFragment userCreationEmailFragment, CharSequence emailEdt) {
        Intrinsics.checkNotNullParameter(emailEdt, "emailEdt");
        EventLogger.DefaultImpls.logType$default(userCreationEmailFragment.getEventLogger(), null, userCreationEmailFragment.getEventScreen(), new Component(Component.ComponentType.TEXT_FIELD, userCreationEmailFragment.getEventScreen().getIdentifier(), null, 4, null), null, null, 25, null);
        userCreationEmailFragment.getDuxo().setEmailEdt(emailEdt.toString());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent(UserCreationEmailEvent event) throws Throwable {
        if (event instanceof UserCreationEmailEvent.SuggestedEmail) {
            onSuggestedEmailEvent((UserCreationEmailEvent.SuggestedEmail) event);
            return;
        }
        if (event instanceof UserCreationEmailEvent.Finish) {
            onFinishEvent((UserCreationEmailEvent.Finish) event);
            return;
        }
        if (event instanceof UserCreationEmailEvent.PromotionEmailBottomSheet) {
            onPromotionalEmailRequestEvent((UserCreationEmailEvent.PromotionEmailBottomSheet) event);
            return;
        }
        if (event instanceof UserCreationEmailEvent.GBEmailWaitlistBottomSheet) {
            onPresentGBWaitlistBottomSheet((UserCreationEmailEvent.GBEmailWaitlistBottomSheet) event);
            return;
        }
        if (event instanceof UserCreationEmailEvent.GBOnboardingWaitlist) {
            onOpenOnboardingWaitlistEvent((UserCreationEmailEvent.GBOnboardingWaitlist) event);
        } else if (event instanceof UserCreationEmailEvent.DuplicateEmailError) {
            onDuplicateEmailErrorEvent((UserCreationEmailEvent.DuplicateEmailError) event);
        } else {
            if (!(event instanceof UserCreationEmailEvent.GenericError)) {
                throw new NoWhenBranchMatchedException();
            }
            onGenericErrorEvent((UserCreationEmailEvent.GenericError) event);
        }
    }

    private final void setDefaultEmail() {
        Account account;
        Account[] accounts2 = AccountManager.get(requireContext()).getAccounts();
        Intrinsics.checkNotNullExpressionValue(accounts2, "getAccounts(...)");
        int length = accounts2.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                account = null;
                break;
            }
            account = accounts2[i];
            if (Intrinsics.areEqual(GOOGLE_ACCOUNT_TYPE, account.type)) {
                break;
            } else {
                i++;
            }
        }
        getBinding().userCreationEmailInput.setText(account != null ? account.name : null);
    }

    private final void onSuggestedEmailEvent(UserCreationEmailEvent.SuggestedEmail event) {
        EventLogger.DefaultImpls.logAppear$default(getEventLogger(), null, getEventScreen(), new Component(Component.ComponentType.ALERT, "INVALID_EMAIL_ERROR", null, 4, null), null, null, 25, null);
        String suggestedEmail = event.getSuggestedEmail();
        Bundle bundle = new Bundle();
        bundle.putString(SUGGESTED_EMAIL, suggestedEmail);
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder title = companion.create(contextRequireContext).setId(C11287R.id.dialog_id_email_entry_validation_error).setPassthroughArgs(bundle).setTitle(C11287R.string.onboarding_email_validation_error_title, new Object[0]);
        if (suggestedEmail == null) {
            title.setMessage(C11287R.string.onboarding_email_validation_error, event.getEmail()).setPositiveButton(C11287R.string.onboarding_email_validation_continue_action, new Object[0]).setNegativeButton(C11287R.string.onboarding_email_validation_edit_action, new Object[0]);
        } else {
            title.setMessage(C11287R.string.onboarding_email_validation_error_with_suggestion, suggestedEmail).setPositiveButton(C11048R.string.general_label_yes, new Object[0]).setNegativeButton(C11048R.string.general_label_no, new Object[0]);
        }
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        RhDialogFragment.Builder.show$default(title, parentFragmentManager, "email-validation-err", false, 4, null);
    }

    private final void onFinishEvent(UserCreationEmailEvent.Finish event) {
        getCallbacks().onEmailFragmentFinished(event.getEmail(), event.isFromCcWaitlist());
    }

    private final void onPromotionalEmailRequestEvent(UserCreationEmailEvent.PromotionEmailBottomSheet event) {
        Navigator.DefaultImpls.createDialogFragment$default(getNavigator(), new UserCreationMarketBottomSheetFragmentKey(event.getEmail()), null, 2, null).show(getChildFragmentManager(), "user-creation-market-opt-in");
    }

    private final void onPresentGBWaitlistBottomSheet(UserCreationEmailEvent.GBEmailWaitlistBottomSheet event) {
        Bundle bundle = new Bundle();
        bundle.putString(GB_ONBOARDING_WAITLIST_URL, event.getWaitlistWebUrl());
        RhBottomSheetDialogFragment rhBottomSheetDialogFragment = (RhBottomSheetDialogFragment) RhBottomSheetDialogFragment.INSTANCE.newInstance((Parcelable) new RhBottomSheetDialogFragment.Args(C22739R.id.dialog_id_user_email_waitlist_bottom_sheet, getString(C22739R.string.user_creation_email_waitlist_bottom_sheet_title), null, getString(C22739R.string.user_creation_email_waitlist_bottom_sheet_description), null, event.getWaitlistWebUrl() != null ? getString(C22739R.string.user_creation_email_waitlist_bottom_sheet_opt_in_button) : null, null, getString(C22739R.string.user_creation_email_waitlist_bottom_sheet_opt_out_button), Integer.valueOf(C20690R.drawable.pict_mono_rds_stopwatch), false, false, null, bundle, null, false, true, false, false, null, null, GB_ONBOARDING_WAITLIST_BOTTOM_SHEET_IDENTIFIER, 1011284, null));
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        rhBottomSheetDialogFragment.show(parentFragmentManager, GB_ONBOARDING_WAITLIST_BOTTOM_SHEET_IDENTIFIER);
    }

    private final void onOpenOnboardingWaitlistEvent(UserCreationEmailEvent.GBOnboardingWaitlist event) {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(event.getWaitlistWebUrl())));
    }

    private final void onGenericErrorEvent(UserCreationEmailEvent.GenericError event) throws Throwable {
        ActivityErrorHandler.Companion companion = ActivityErrorHandler.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        ActivityErrorHandler.Companion.handle$default(companion, fragmentActivityRequireActivity, event.getThrowable(), true, false, 0, Integer.valueOf(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Negative), 24, null);
    }

    private final void onDuplicateEmailErrorEvent(UserCreationEmailEvent.DuplicateEmailError event) {
        RhDialogFragment.Builder negativeButton;
        EventLogger.DefaultImpls.logAppear$default(getEventLogger(), null, getEventScreen(), new Component(Component.ComponentType.ALERT, "EMAIL_EXIST_ERROR", null, 4, null), null, null, 25, null);
        Bundle bundle = new Bundle();
        bundle.putString(ARG_VALIDATION_EMAIL, event.getEmail());
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        RhDialogFragment.Builder id = companion.create(fragmentActivityRequireActivity).setId(C22739R.id.dialog_id_onboarding_duplicate_email);
        if (getAppType() == AppType.RHC) {
            negativeButton = id.setTitle(C22739R.string.rhc_user_creation_duplicate_email_error_title, new Object[0]).setMessage(C22739R.string.rhc_user_creation_duplicate_email_error_message, new Object[0]).setNegativeButton(C11048R.string.general_label_close, new Object[0]);
        } else {
            negativeButton = id.setTitle(C11287R.string.user_creation_duplicate_email_error_title, new Object[0]).setMessage(C11287R.string.user_creation_duplicate_email_error_message, new Object[0]).setNegativeButton(C11048R.string.general_label_dismiss, new Object[0]);
        }
        RhDialogFragment.Builder positiveButton = negativeButton.setPassthroughArgs(bundle).setPositiveButton(C11287R.string.user_creation_duplicate_email_error_positive_button, new Object[0]);
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        RhDialogFragment.Builder.show$default(positiveButton, parentFragmentManager, DUPLICATE_EMAIL_ERROR_DIALOG_TAG, false, 4, null);
    }

    private final void onLoading(boolean isLoading) {
        requireToolbar().setLoadingViewVisible(isLoading);
        getBinding().userCreationEmailInput.setEnabled(!isLoading);
        getBinding().userCreationEmailPrimaryCta.setLoading(isLoading);
    }

    /* compiled from: UserCreationEmailFragment.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationEmailFragment$Args;", "Landroid/os/Parcelable;", "userCreation", "Lcom/robinhood/shared/user/contracts/auth/UserCreation;", "countryCode", "Lcom/robinhood/iso/countrycode/CountryCode;", "<init>", "(Lcom/robinhood/shared/user/contracts/auth/UserCreation;Lcom/robinhood/iso/countrycode/CountryCode;)V", "getUserCreation", "()Lcom/robinhood/shared/user/contracts/auth/UserCreation;", "getCountryCode", "()Lcom/robinhood/iso/countrycode/CountryCode;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final CountryCode countryCode;
        private final UserCreation userCreation;

        /* compiled from: UserCreationEmailFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((UserCreation) parcel.readParcelable(Args.class.getClassLoader()), (CountryCode) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, UserCreation userCreation, CountryCode countryCode, int i, Object obj) {
            if ((i & 1) != 0) {
                userCreation = args.userCreation;
            }
            if ((i & 2) != 0) {
                countryCode = args.countryCode;
            }
            return args.copy(userCreation, countryCode);
        }

        /* renamed from: component1, reason: from getter */
        public final UserCreation getUserCreation() {
            return this.userCreation;
        }

        /* renamed from: component2, reason: from getter */
        public final CountryCode getCountryCode() {
            return this.countryCode;
        }

        public final Args copy(UserCreation userCreation, CountryCode countryCode) {
            Intrinsics.checkNotNullParameter(userCreation, "userCreation");
            return new Args(userCreation, countryCode);
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
            return Intrinsics.areEqual(this.userCreation, args.userCreation) && Intrinsics.areEqual(this.countryCode, args.countryCode);
        }

        public int hashCode() {
            int iHashCode = this.userCreation.hashCode() * 31;
            CountryCode countryCode = this.countryCode;
            return iHashCode + (countryCode == null ? 0 : countryCode.hashCode());
        }

        public String toString() {
            return "Args(userCreation=" + this.userCreation + ", countryCode=" + this.countryCode + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.userCreation, flags);
            dest.writeSerializable(this.countryCode);
        }

        public Args(UserCreation userCreation, CountryCode countryCode) {
            Intrinsics.checkNotNullParameter(userCreation, "userCreation");
            this.userCreation = userCreation;
            this.countryCode = countryCode;
        }

        public /* synthetic */ Args(UserCreation userCreation, CountryCode countryCode, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(userCreation, (i & 2) != 0 ? null : countryCode);
        }

        public final UserCreation getUserCreation() {
            return this.userCreation;
        }

        public final CountryCode getCountryCode() {
            return this.countryCode;
        }
    }

    /* compiled from: UserCreationEmailFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationEmailFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationEmailFragment;", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationEmailFragment$Args;", "<init>", "()V", "GOOGLE_ACCOUNT_TYPE", "", "SUGGESTED_EMAIL", "DUPLICATE_EMAIL_ERROR_DIALOG_TAG", "ARG_VALIDATION_EMAIL", "GB_ONBOARDING_WAITLIST_URL", "GB_ONBOARDING_WAITLIST_BOTTOM_SHEET_IDENTIFIER", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<UserCreationEmailFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(UserCreationEmailFragment userCreationEmailFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, userCreationEmailFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public UserCreationEmailFragment newInstance(Args args) {
            return (UserCreationEmailFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(UserCreationEmailFragment userCreationEmailFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, userCreationEmailFragment, args);
        }
    }
}
