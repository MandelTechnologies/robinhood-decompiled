package com.robinhood.android.challenge;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.jakewharton.rxbinding3.widget.RxTextView;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.challenge.EmailSmsChallengeBottomSheetFragment;
import com.robinhood.android.challenge.EmailSmsChallengeFragment;
import com.robinhood.android.challenge.databinding.FragmentEmailSmsChallengeBinding;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p081cx.SupportEmailHandler;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.designsystem.textinput.RdsFormattedEditText;
import com.robinhood.android.util.play.GooglePlay;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.Challenge;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.lib.challenge.C39076R;
import com.robinhood.shared.security.contracts.ChallengeSource;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.Activity;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.NoSuchElementException;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
import kotlin.text.StringsKt;

/* compiled from: EmailSmsChallengeFragment.kt */
@Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u0000 B2\u00020\u00012\u00020\u0002:\u0003@ABB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\b\u0010.\u001a\u00020)H\u0016J\u0010\u0010/\u001a\u00020)2\u0006\u00100\u001a\u000201H\u0002J\b\u00102\u001a\u00020)H\u0002J\b\u00103\u001a\u00020)H\u0002J\b\u00104\u001a\u00020)H\u0002J\u001a\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010-H\u0016J\u001a\u0010:\u001a\u0002062\u0006\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010-H\u0016J\b\u0010;\u001a\u00020)H\u0002J\u0012\u0010<\u001a\u00020)2\b\u0010=\u001a\u0004\u0018\u00010>H\u0016J\b\u0010?\u001a\u00020)H\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R\u001b\u0010#\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b%\u0010&¨\u0006C"}, m3636d2 = {"Lcom/robinhood/android/challenge/EmailSmsChallengeFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/challenge/EmailSmsChallengeBottomSheetFragment$Callbacks;", "<init>", "()V", "supportEmailHandler", "Lcom/robinhood/android/common/cx/SupportEmailHandler;", "getSupportEmailHandler", "()Lcom/robinhood/android/common/cx/SupportEmailHandler;", "setSupportEmailHandler", "(Lcom/robinhood/android/common/cx/SupportEmailHandler;)V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "appType", "Lcom/robinhood/shared/app/type/AppType;", "getAppType", "()Lcom/robinhood/shared/app/type/AppType;", "setAppType", "(Lcom/robinhood/shared/app/type/AppType;)V", "duxo", "Lcom/robinhood/android/challenge/EmailSmsChallengeDuxo;", "getDuxo", "()Lcom/robinhood/android/challenge/EmailSmsChallengeDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/challenge/databinding/FragmentEmailSmsChallengeBinding;", "getBinding", "()Lcom/robinhood/android/challenge/databinding/FragmentEmailSmsChallengeBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/challenge/EmailSmsChallengeFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/challenge/EmailSmsChallengeFragment$Callbacks;", "callbacks$delegate", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "setViewState", "state", "Lcom/robinhood/android/challenge/EmailSmsChallengeViewState;", "showTimeoutDialog", "showWrongCodeEnteredDialog", "showAttemptsExhaustedDialog", "onPositiveButtonClicked", "", "id", "", "passthroughArgs", "onNegativeButtonClicked", "sendEmail", "resendCode", "message", "", "useAlternateChallenge", "Callbacks", "Args", "Companion", "feature-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class EmailSmsChallengeFragment extends BaseFragment implements EmailSmsChallengeBottomSheetFragment.Callbacks {
    private static final String DIALOG_ATTEMPTS_EXHAUSTED = "attempts-exhausted";
    private static final String DIALOG_RETRY = "retry";
    private static final String DIALOG_TIMEOUT = "timeout";
    private static final String DIALOG_WRONG_CODE = "wrong-code";
    public AppType appType;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public EventLogger eventLogger;
    public SupportEmailHandler supportEmailHandler;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(EmailSmsChallengeFragment.class, "binding", "getBinding()Lcom/robinhood/android/challenge/databinding/FragmentEmailSmsChallengeBinding;", 0)), Reflection.property1(new PropertyReference1Impl(EmailSmsChallengeFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/challenge/EmailSmsChallengeFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: EmailSmsChallengeFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/challenge/EmailSmsChallengeFragment$Callbacks;", "", "onChallengeReplaced", "", "newChallenge", "Lcom/robinhood/models/api/Challenge;", "onChallengeSuccess", ChallengeResponseActivity.EXTRA_CHALLENGE_ID, "Ljava/util/UUID;", "feature-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onChallengeReplaced(Challenge newChallenge);

        void onChallengeSuccess(UUID challengeId);
    }

    /* compiled from: EmailSmsChallengeFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EmailSmsChallengeResult.values().length];
            try {
                iArr[EmailSmsChallengeResult.FAILED_TIMEOUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EmailSmsChallengeResult.FAILED_WRONG_CODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EmailSmsChallengeResult.FAILED_WRONG_CODE_ATTEMPTS_EXHAUSTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EmailSmsChallengeResult.SUCCESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public EmailSmsChallengeFragment() {
        super(C10497R.layout.fragment_email_sms_challenge);
        this.duxo = OldDuxos.oldDuxo(this, EmailSmsChallengeDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, EmailSmsChallengeFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.challenge.EmailSmsChallengeFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof EmailSmsChallengeFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
    }

    public final SupportEmailHandler getSupportEmailHandler() {
        SupportEmailHandler supportEmailHandler = this.supportEmailHandler;
        if (supportEmailHandler != null) {
            return supportEmailHandler;
        }
        Intrinsics.throwUninitializedPropertyAccessException("supportEmailHandler");
        return null;
    }

    public final void setSupportEmailHandler(SupportEmailHandler supportEmailHandler) {
        Intrinsics.checkNotNullParameter(supportEmailHandler, "<set-?>");
        this.supportEmailHandler = supportEmailHandler;
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

    private final EmailSmsChallengeDuxo getDuxo() {
        return (EmailSmsChallengeDuxo) this.duxo.getValue();
    }

    private final FragmentEmailSmsChallengeBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentEmailSmsChallengeBinding) value;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        getBinding().numpad.useDefaultKeyHandler();
        RdsFormattedEditText emailSmsChallengeInput = getBinding().emailSmsChallengeInput;
        Intrinsics.checkNotNullExpressionValue(emailSmsChallengeInput, "emailSmsChallengeInput");
        Observable observableDistinctUntilChanged = RxTextView.textChanges(emailSmsChallengeInput).map(new Function() { // from class: com.robinhood.android.challenge.EmailSmsChallengeFragment.onViewCreated.1
            @Override // io.reactivex.functions.Function
            public final String apply(CharSequence it) {
                Intrinsics.checkNotNullParameter(it, "it");
                String string2 = StringsKt.trim(it.toString()).toString();
                String strSubstring = string2.substring(0, Math.min(string2.length(), 6));
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                return strSubstring;
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C104942(getDuxo()));
    }

    /* compiled from: EmailSmsChallengeFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.challenge.EmailSmsChallengeFragment$onViewCreated$2 */
    /* synthetic */ class C104942 extends FunctionReferenceImpl implements Function1<String, Unit> {
        C104942(Object obj) {
            super(1, obj, EmailSmsChallengeDuxo.class, "onInputChange", "onInputChange(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((EmailSmsChallengeDuxo) this.receiver).onInputChange(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C104921(this));
    }

    /* compiled from: EmailSmsChallengeFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.challenge.EmailSmsChallengeFragment$onStart$1 */
    /* synthetic */ class C104921 extends FunctionReferenceImpl implements Function1<EmailSmsChallengeViewState, Unit> {
        C104921(Object obj) {
            super(1, obj, EmailSmsChallengeFragment.class, "setViewState", "setViewState(Lcom/robinhood/android/challenge/EmailSmsChallengeViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(EmailSmsChallengeViewState emailSmsChallengeViewState) {
            invoke2(emailSmsChallengeViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(EmailSmsChallengeViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((EmailSmsChallengeFragment) this.receiver).setViewState(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setViewState(final EmailSmsChallengeViewState state) {
        Throwable thConsume;
        EmailSmsChallengeResult emailSmsChallengeResultConsume;
        Challenge challengeConsume;
        UiEvent<Challenge> replacedChallenge = state.getReplacedChallenge();
        if (replacedChallenge != null && (challengeConsume = replacedChallenge.consume()) != null) {
            getCallbacks().onChallengeReplaced(challengeConsume);
            return;
        }
        getBinding().emailSmsChallengeHelpBtn.setText(getString(C39076R.string.challenge_response_need_help));
        RhTextView rhTextView = getBinding().emailSmsChallengeTitleText;
        Companion companion = INSTANCE;
        String title = ((Args) companion.getArgs((Fragment) this)).getChallenge().getTitle();
        if (title == null) {
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            title = state.getTitleText(resources);
        }
        rhTextView.setText(title);
        RhTextView rhTextView2 = getBinding().emailSmsChallengeSummaryTxt;
        String subtitle = ((Args) companion.getArgs((Fragment) this)).getChallenge().getSubtitle();
        if (subtitle == null) {
            Resources resources2 = getResources();
            Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
            subtitle = state.getSummaryText(resources2);
        }
        rhTextView2.setText(subtitle);
        RdsButton emailSmsChallengeHelpBtn = getBinding().emailSmsChallengeHelpBtn;
        Intrinsics.checkNotNullExpressionValue(emailSmsChallengeHelpBtn, "emailSmsChallengeHelpBtn");
        OnClickListeners.onClick(emailSmsChallengeHelpBtn, new Function0() { // from class: com.robinhood.android.challenge.EmailSmsChallengeFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EmailSmsChallengeFragment.setViewState$lambda$1(this.f$0, state);
            }
        });
        getBinding().emailSmsChallengeInput.setEnabled(!state.getPending());
        UiEvent<EmailSmsChallengeResult> result = state.getResult();
        if (result != null && (emailSmsChallengeResultConsume = result.consume()) != null) {
            if (emailSmsChallengeResultConsume != EmailSmsChallengeResult.SUCCESS) {
                getBinding().emailSmsChallengeInput.setText("");
            }
            int i = WhenMappings.$EnumSwitchMapping$0[emailSmsChallengeResultConsume.ordinal()];
            if (i == 1) {
                showTimeoutDialog();
            } else if (i == 2) {
                showWrongCodeEnteredDialog();
            } else if (i == 3) {
                showAttemptsExhaustedDialog();
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                getCallbacks().onChallengeSuccess(((Args) companion.getArgs((Fragment) this)).getChallenge().getId());
            }
        }
        UiEvent<Throwable> error = state.getError();
        if (error != null && (thConsume = error.consume()) != null) {
            getActivityErrorHandler().invoke((ActivityErrorHandler) thConsume);
        }
        if (state.getPending()) {
            getBinding().loadingView.show();
        } else {
            getBinding().loadingView.hide();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setViewState$lambda$1(EmailSmsChallengeFragment emailSmsChallengeFragment, EmailSmsChallengeViewState emailSmsChallengeViewState) {
        EventLogger.DefaultImpls.logTap$default(emailSmsChallengeFragment.getEventLogger(), UserInteractionEventData.Action.NEED_HELP, new Screen(Screen.Name.IN_APP_VERIFICATION, null, null, null, 14, null), null, null, null, false, 60, null);
        FragmentActivity fragmentActivityRequireActivity = emailSmsChallengeFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        Activity.hideKeyboard$default(fragmentActivityRequireActivity, false, 1, null);
        Challenge challenge = ((Args) INSTANCE.getArgs((Fragment) emailSmsChallengeFragment)).getChallenge();
        Resources resources = emailSmsChallengeFragment.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        EmailSmsChallengeBottomSheetFragment emailSmsChallengeBottomSheetFragment = (EmailSmsChallengeBottomSheetFragment) EmailSmsChallengeBottomSheetFragment.INSTANCE.newInstance((Parcelable) new EmailSmsChallengeBottomSheetFragment.Args(challenge, emailSmsChallengeViewState.getResendDialogMessage(resources)));
        FragmentManager childFragmentManager = emailSmsChallengeFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        emailSmsChallengeBottomSheetFragment.show(childFragmentManager, EmailSmsChallengeBottomSheetFragment.TAG);
        return Unit.INSTANCE;
    }

    private final void showTimeoutDialog() {
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        RhDialogFragment.Builder useDesignSystemOverlay = companion.create(fragmentActivityRequireActivity).setId(C10497R.id.dialog_id_challenge_response_timeout).setTitle(C39076R.string.challenge_response_dialog_timeout_title, new Object[0]).setMessage(C39076R.string.challenge_response_dialog_timeout_message, new Object[0]).setUseDesignSystemOverlay(true);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        RhDialogFragment.Builder.show$default(useDesignSystemOverlay, childFragmentManager, DIALOG_TIMEOUT, false, 4, null);
    }

    private final void showWrongCodeEnteredDialog() {
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        RhDialogFragment.Builder useDesignSystemOverlay = companion.create(fragmentActivityRequireActivity).setTitle(C39076R.string.challenge_response_dialog_wrong_code_title, new Object[0]).setMessage(C39076R.string.challenge_response_dialog_wrong_code_message, new Object[0]).setUseDesignSystemOverlay(true);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        RhDialogFragment.Builder.show$default(useDesignSystemOverlay, childFragmentManager, DIALOG_WRONG_CODE, false, 4, null);
    }

    private final void showAttemptsExhaustedDialog() {
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        RhDialogFragment.Builder useDesignSystemOverlay = companion.create(fragmentActivityRequireActivity).setId(C10497R.id.dialog_id_challenge_response_attempts_exhausted).setTitle(C39076R.string.challenge_response_dialog_attempts_exhausted_title, new Object[0]).setMessage(C39076R.string.challenge_response_dialog_attempts_exhausted_message, new Object[0]).setPositiveButton(C39076R.string.challenge_response_dialog_attempts_exhausted_contact_support, new Object[0]).setNegativeButton(C11048R.string.general_label_dismiss, new Object[0]).setUseDesignSystemOverlay(true);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        RhDialogFragment.Builder.show$default(useDesignSystemOverlay, childFragmentManager, DIALOG_ATTEMPTS_EXHAUSTED, false, 4, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        if (id == C10497R.id.dialog_id_challenge_response_unknown_challenge_type) {
            if (!GooglePlay.INSTANCE.launchStore(fragmentActivityRequireActivity)) {
                Resources resources = getResources();
                int i = C11048R.string.force_update_error_no_play_store;
                AppType appType = getAppType();
                Resources resources2 = getResources();
                Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                Toast.makeText(fragmentActivityRequireActivity, resources.getString(i, appType.toAppName(resources2)), 1).show();
            }
            fragmentActivityRequireActivity.finish();
            return true;
        }
        if (id == C10497R.id.dialog_id_challenge_response_attempts_exhausted) {
            sendEmail();
            fragmentActivityRequireActivity.finish();
            return true;
        }
        if (id == C10497R.id.dialog_id_challenge_response_timeout) {
            fragmentActivityRequireActivity.finish();
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onNegativeButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C10497R.id.dialog_id_challenge_response_unknown_challenge_type || id == C10497R.id.dialog_id_challenge_response_attempts_exhausted) {
            requireActivity().finish();
            return true;
        }
        return super.onNegativeButtonClicked(id, passthroughArgs);
    }

    private final void sendEmail() {
        if (((Args) INSTANCE.getArgs((Fragment) this)).getChallengeSource().getRequiresAuth()) {
            SupportEmailHandler supportEmailHandler = getSupportEmailHandler();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            startActivity(SupportEmailHandler.getPathfinderEmailIntent$default(supportEmailHandler, contextRequireContext, null, 2, null));
            return;
        }
        SupportEmailHandler supportEmailHandler2 = getSupportEmailHandler();
        Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
        SupportEmailHandler.handleExternalSupportLink$default(supportEmailHandler2, contextRequireContext2, null, 2, null);
    }

    @Override // com.robinhood.android.challenge.EmailSmsChallengeBottomSheetFragment.Callbacks
    public void resendCode(String message) {
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        RhDialogFragment.Builder useDesignSystemOverlay = companion.create(fragmentActivityRequireActivity).setTitle(C39076R.string.challenge_response_dialog_resend_title, new Object[0]).setMessage(message).setUseDesignSystemOverlay(true);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        RhDialogFragment.Builder.show$default(useDesignSystemOverlay, childFragmentManager, "retry", false, 4, null);
        getDuxo().resendCode();
    }

    @Override // com.robinhood.android.challenge.EmailSmsChallengeBottomSheetFragment.Callbacks
    public void useAlternateChallenge() {
        getDuxo().replaceChallenge();
    }

    /* compiled from: EmailSmsChallengeFragment.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/challenge/EmailSmsChallengeFragment$Args;", "Landroid/os/Parcelable;", "username", "", ErrorResponse.CHALLENGE, "Lcom/robinhood/models/api/Challenge;", "challengeSource", "Lcom/robinhood/shared/security/contracts/ChallengeSource;", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/api/Challenge;Lcom/robinhood/shared/security/contracts/ChallengeSource;)V", "getUsername", "()Ljava/lang/String;", "getChallenge", "()Lcom/robinhood/models/api/Challenge;", "getChallengeSource", "()Lcom/robinhood/shared/security/contracts/ChallengeSource;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final Challenge challenge;
        private final ChallengeSource challengeSource;
        private final String username;

        /* compiled from: EmailSmsChallengeFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readString(), (Challenge) parcel.readParcelable(Args.class.getClassLoader()), ChallengeSource.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, String str, Challenge challenge, ChallengeSource challengeSource, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.username;
            }
            if ((i & 2) != 0) {
                challenge = args.challenge;
            }
            if ((i & 4) != 0) {
                challengeSource = args.challengeSource;
            }
            return args.copy(str, challenge, challengeSource);
        }

        /* renamed from: component1, reason: from getter */
        public final String getUsername() {
            return this.username;
        }

        /* renamed from: component2, reason: from getter */
        public final Challenge getChallenge() {
            return this.challenge;
        }

        /* renamed from: component3, reason: from getter */
        public final ChallengeSource getChallengeSource() {
            return this.challengeSource;
        }

        public final Args copy(String username, Challenge challenge, ChallengeSource challengeSource) {
            Intrinsics.checkNotNullParameter(challenge, "challenge");
            Intrinsics.checkNotNullParameter(challengeSource, "challengeSource");
            return new Args(username, challenge, challengeSource);
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
            return Intrinsics.areEqual(this.username, args.username) && Intrinsics.areEqual(this.challenge, args.challenge) && this.challengeSource == args.challengeSource;
        }

        public int hashCode() {
            String str = this.username;
            return ((((str == null ? 0 : str.hashCode()) * 31) + this.challenge.hashCode()) * 31) + this.challengeSource.hashCode();
        }

        public String toString() {
            return "Args(username=" + this.username + ", challenge=" + this.challenge + ", challengeSource=" + this.challengeSource + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.username);
            dest.writeParcelable(this.challenge, flags);
            dest.writeString(this.challengeSource.name());
        }

        public Args(String str, Challenge challenge, ChallengeSource challengeSource) {
            Intrinsics.checkNotNullParameter(challenge, "challenge");
            Intrinsics.checkNotNullParameter(challengeSource, "challengeSource");
            this.username = str;
            this.challenge = challenge;
            this.challengeSource = challengeSource;
        }

        public /* synthetic */ Args(String str, Challenge challenge, ChallengeSource challengeSource, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, challenge, challengeSource);
        }

        public final String getUsername() {
            return this.username;
        }

        public final Challenge getChallenge() {
            return this.challenge;
        }

        public final ChallengeSource getChallengeSource() {
            return this.challengeSource;
        }
    }

    /* compiled from: EmailSmsChallengeFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0003H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/challenge/EmailSmsChallengeFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/challenge/EmailSmsChallengeFragment;", "Lcom/robinhood/android/challenge/EmailSmsChallengeFragment$Args;", "<init>", "()V", "DIALOG_RETRY", "", "DIALOG_WRONG_CODE", "DIALOG_ATTEMPTS_EXHAUSTED", "DIALOG_TIMEOUT", "newInstance", "args", "feature-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<EmailSmsChallengeFragment, Args> {

        /* compiled from: EmailSmsChallengeFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Challenge.Type.values().length];
                try {
                    iArr[Challenge.Type.EMAIL.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Challenge.Type.SMS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Challenge.Type.AUTH_APP.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Challenge.Type.BACKUP_CODE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Challenge.Type.UNKNOWN.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[Challenge.Type.PROMPTS.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[Challenge.Type.WEBAUTHN.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(EmailSmsChallengeFragment emailSmsChallengeFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, emailSmsChallengeFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(EmailSmsChallengeFragment emailSmsChallengeFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, emailSmsChallengeFragment, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public EmailSmsChallengeFragment newInstance(Args args) {
            Intrinsics.checkNotNullParameter(args, "args");
            switch (WhenMappings.$EnumSwitchMapping$0[args.getChallenge().getType().ordinal()]) {
                case 1:
                case 2:
                    return (EmailSmsChallengeFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    throw new IllegalArgumentException(("Can't handle " + args.getChallenge().getType()).toString());
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }
}
