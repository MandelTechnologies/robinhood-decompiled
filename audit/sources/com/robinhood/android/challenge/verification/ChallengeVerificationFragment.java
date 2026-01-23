package com.robinhood.android.challenge.verification;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.jakewharton.rxbinding3.widget.RxTextView;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.challenge.C10497R;
import com.robinhood.android.challenge.ChallengeResponseActivity;
import com.robinhood.android.challenge.ChallengeVerificationCallbacks;
import com.robinhood.android.challenge.databinding.FragmentChallengeVerificationBinding;
import com.robinhood.android.challenge.verification.ChallengeVerificationEvent;
import com.robinhood.android.challenge.verification.ChallengeVerificationHelpBottomSheetFragment;
import com.robinhood.android.challenge.verification.dialog.ChallengeDialogHelper;
import com.robinhood.android.challenge.verification.dialog.DefaultNegativeButtonClickDelegate;
import com.robinhood.android.challenge.verification.dialog.DefaultPositiveButtonClickDelegate;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p081cx.SupportEmailHandler;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.designsystem.textinput.RdsFormattedEditText;
import com.robinhood.android.designsystem.textinput.RdsTextInputContainerView;
import com.robinhood.android.lib.breadcrumbs.SupportBreadcrumbTracker;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.extensions.Navigators3;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.Challenge;
import com.robinhood.rosetta.eventlogging.ChallengeContext;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.lib.challenge.C39076R;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.shared.security.contracts.ChallengeVerificationInput;
import com.robinhood.shared.security.contracts.PhoneUpdateIntentKey;
import com.robinhood.utils.extensions.Activity;
import com.robinhood.utils.extensions.Bundles;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsAndCallbacksCompanion;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.resource.StringResource;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.NoSuchElementException;
import java.util.UUID;
import kotlin.ExceptionsH;
import kotlin.Lazy;
import kotlin.LazyKt;
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
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: ChallengeVerificationFragment.kt */
@Metadata(m3635d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 l2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002klB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020KH\u0016J\b\u0010L\u001a\u00020IH\u0016J\u001a\u0010M\u001a\u00020I2\u0006\u0010N\u001a\u00020O2\b\u0010P\u001a\u0004\u0018\u00010QH\u0016J\u001a\u0010R\u001a\u0002082\u0006\u0010S\u001a\u00020T2\b\u0010U\u001a\u0004\u0018\u00010QH\u0016J\u001a\u0010V\u001a\u0002082\u0006\u0010S\u001a\u00020T2\b\u0010U\u001a\u0004\u0018\u00010QH\u0016J\u0010\u0010W\u001a\u00020I2\u0006\u0010S\u001a\u00020TH\u0016J\u0010\u0010X\u001a\u00020I2\u0006\u0010Y\u001a\u00020ZH\u0016J \u0010[\u001a\u00020I2\u0006\u0010\\\u001a\u0002082\u0006\u0010]\u001a\u0002082\u0006\u0010^\u001a\u00020_H\u0016J\u0010\u0010`\u001a\u00020I2\u0006\u0010a\u001a\u00020bH\u0016J\u0010\u0010c\u001a\u00020I2\u0006\u0010d\u001a\u00020eH\u0002J\u0016\u0010f\u001a\u00020I2\f\u0010g\u001a\b\u0012\u0004\u0012\u00020i0hH\u0002J\b\u0010j\u001a\u000208H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\u00020\u001b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001b\u0010 \u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R\u001b\u0010&\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b(\u0010)R!\u0010,\u001a\b\u0012\u0004\u0012\u00020.0-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010%\u001a\u0004\b/\u00100R\u001b\u00102\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010+\u001a\u0004\b4\u00105R+\u00109\u001a\u0002082\u0006\u00107\u001a\u0002088B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u0014\u0010?\u001a\u00020@8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0018\u0010C\u001a\u00060Dj\u0002`E8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010G¨\u0006m"}, m3636d2 = {"Lcom/robinhood/android/challenge/verification/ChallengeVerificationFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/challenge/verification/ChallengeVerificationHelpBottomSheetFragment$Callbacks;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "dialogHelper", "Lcom/robinhood/android/challenge/verification/dialog/ChallengeDialogHelper;", "supportBreadcrumbTracker", "Lcom/robinhood/android/lib/breadcrumbs/SupportBreadcrumbTracker;", "getSupportBreadcrumbTracker", "()Lcom/robinhood/android/lib/breadcrumbs/SupportBreadcrumbTracker;", "setSupportBreadcrumbTracker", "(Lcom/robinhood/android/lib/breadcrumbs/SupportBreadcrumbTracker;)V", "supportEmailHandler", "Lcom/robinhood/android/common/cx/SupportEmailHandler;", "getSupportEmailHandler", "()Lcom/robinhood/android/common/cx/SupportEmailHandler;", "setSupportEmailHandler", "(Lcom/robinhood/android/common/cx/SupportEmailHandler;)V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "getAuthManager", "()Lcom/robinhood/shared/security/auth/AuthManager;", "setAuthManager", "(Lcom/robinhood/shared/security/auth/AuthManager;)V", "duxo", "Lcom/robinhood/android/challenge/verification/ChallengeVerificationDuxo;", "getDuxo", "()Lcom/robinhood/android/challenge/verification/ChallengeVerificationDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/challenge/databinding/FragmentChallengeVerificationBinding;", "getBinding", "()Lcom/robinhood/android/challenge/databinding/FragmentChallengeVerificationBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "errorHandler", "Lcom/robinhood/android/common/util/rx/ActivityErrorHandler;", "", "getErrorHandler", "()Lcom/robinhood/android/common/util/rx/ActivityErrorHandler;", "errorHandler$delegate", "callbacks", "Lcom/robinhood/android/challenge/ChallengeVerificationCallbacks;", "getCallbacks", "()Lcom/robinhood/android/challenge/ChallengeVerificationCallbacks;", "callbacks$delegate", "<set-?>", "", "isChallengeLoaded", "()Z", "setChallengeLoaded", "(Z)V", "isChallengeLoaded$delegate", "Lkotlin/properties/ReadWriteProperty;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenEventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "getScreenEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "onAttach", "", "context", "Landroid/content/Context;", "onDestroy", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onPositiveButtonClicked", "id", "", "passthroughArgs", "onNegativeButtonClicked", "onDialogDismissed", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onContactSupportClicked", "isLoggedIn", "logOutForUar", "appType", "Lcom/robinhood/shared/app/type/AppType;", "resendCode", ChallengeResponseActivity.EXTRA_CHALLENGE_ID, "Ljava/util/UUID;", "bind", "state", "Lcom/robinhood/android/challenge/verification/ChallengeVerificationViewState;", "handleEvent", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/challenge/verification/ChallengeVerificationEvent;", "onBackPressed", "UarPositiveButtonDelegate", "Companion", "feature-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class ChallengeVerificationFragment extends BaseFragment implements ChallengeVerificationHelpBottomSheetFragment.Callbacks, AutoLoggableFragment {
    private static final String HELP_BTN_LOGGING_ID = "help";
    public AuthManager authManager;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    private final ChallengeDialogHelper dialogHelper;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    /* renamed from: errorHandler$delegate, reason: from kotlin metadata */
    private final Lazy errorHandler;
    public EventLogger eventLogger;

    /* renamed from: isChallengeLoaded$delegate, reason: from kotlin metadata */
    private final Interfaces3 isChallengeLoaded;
    public SupportBreadcrumbTracker supportBreadcrumbTracker;
    public SupportEmailHandler supportEmailHandler;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ChallengeVerificationFragment.class, "binding", "getBinding()Lcom/robinhood/android/challenge/databinding/FragmentChallengeVerificationBinding;", 0)), Reflection.property1(new PropertyReference1Impl(ChallengeVerificationFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/challenge/ChallengeVerificationCallbacks;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(ChallengeVerificationFragment.class, "isChallengeLoaded", "isChallengeLoaded()Z", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: ChallengeVerificationFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Challenge.Type.values().length];
            try {
                iArr[Challenge.Type.SMS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Challenge.Type.AUTH_APP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Challenge.Type.EMAIL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent(final Event<ChallengeVerificationEvent> event) {
        EventConsumer<ChallengeVerificationEvent> eventConsumerInvoke;
        if (!(event.getData() instanceof ChallengeVerificationEvent) || (eventConsumerInvoke = event.getGetEventConsumer().invoke()) == null) {
            return;
        }
        eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.challenge.verification.ChallengeVerificationFragment$handleEvent$$inlined$consumeIfType$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m11790invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m11790invoke(Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                ChallengeVerificationEvent challengeVerificationEvent = (ChallengeVerificationEvent) event.getData();
                if (!(challengeVerificationEvent instanceof ChallengeVerificationEvent.ChallengeVerified)) {
                    if (challengeVerificationEvent instanceof ChallengeVerificationEvent.ContactSupport) {
                        Navigator navigator = this.getNavigator();
                        Context contextRequireContext = this.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        Navigators3.showContactSupportTriageFragment$default(navigator, contextRequireContext, null, ((ChallengeVerificationEvent.ContactSupport) challengeVerificationEvent).isLoggedIn(), 2, null);
                        return;
                    }
                    if (challengeVerificationEvent instanceof ChallengeVerificationEvent.Dialog) {
                        ChallengeVerificationEvent.Dialog dialog = (ChallengeVerificationEvent.Dialog) challengeVerificationEvent;
                        if (dialog.getInfo().getShouldClearInput()) {
                            this.getBinding().challengeVerificationInput.setText("");
                        }
                        this.dialogHelper.showDialog(this, dialog.getInfo());
                        return;
                    }
                    if (!(challengeVerificationEvent instanceof ChallengeVerificationEvent.Error)) {
                        if (!(challengeVerificationEvent instanceof ChallengeVerificationEvent.Fallback)) {
                            if (!Intrinsics.areEqual(challengeVerificationEvent, ChallengeVerificationEvent.Resend.INSTANCE)) {
                                if (challengeVerificationEvent instanceof ChallengeVerificationEvent.Submit) {
                                    ChallengeVerificationEvent.Submit submit = (ChallengeVerificationEvent.Submit) challengeVerificationEvent;
                                    this.getDuxo().submitChallenge(submit.getChallengeId(), submit.getCode());
                                    return;
                                } else {
                                    if (!(challengeVerificationEvent instanceof ChallengeVerificationEvent.UpdatePhone)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    Navigator navigator2 = this.getNavigator();
                                    Context contextRequireContext2 = this.requireContext();
                                    Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                                    Navigator.DefaultImpls.startActivity$default(navigator2, contextRequireContext2, new PhoneUpdateIntentKey(null, 1, null), null, false, null, null, 60, null);
                                    return;
                                }
                            }
                            this.getCallbacks().onResendChallenge();
                            return;
                        }
                        this.getCallbacks().onUseFallbackMfa(((ChallengeVerificationEvent.Fallback) challengeVerificationEvent).getChallengeId());
                        return;
                    }
                    AbsErrorHandler.handleError$default(this.getErrorHandler(), ((ChallengeVerificationEvent.Error) challengeVerificationEvent).getThrowable(), false, 2, null);
                    return;
                }
                this.getCallbacks().onChallengeCompleted(((ChallengeVerificationEvent.ChallengeVerified) challengeVerificationEvent).getChallengeId());
            }
        });
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
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    public ChallengeVerificationFragment() {
        super(C10497R.layout.fragment_challenge_verification);
        this.dialogHelper = new ChallengeDialogHelper();
        this.duxo = DuxosKt.duxo(this, ChallengeVerificationDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, ChallengeVerificationFragment2.INSTANCE);
        this.errorHandler = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.challenge.verification.ChallengeVerificationFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChallengeVerificationFragment.errorHandler_delegate$lambda$0(this.f$0);
            }
        });
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(ChallengeVerificationCallbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.challenge.verification.ChallengeVerificationFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof ChallengeVerificationCallbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.isChallengeLoaded = BindSavedState2.savedBoolean(this, false).provideDelegate(this, $$delegatedProperties[2]);
    }

    public final SupportBreadcrumbTracker getSupportBreadcrumbTracker() {
        SupportBreadcrumbTracker supportBreadcrumbTracker = this.supportBreadcrumbTracker;
        if (supportBreadcrumbTracker != null) {
            return supportBreadcrumbTracker;
        }
        Intrinsics.throwUninitializedPropertyAccessException("supportBreadcrumbTracker");
        return null;
    }

    public final void setSupportBreadcrumbTracker(SupportBreadcrumbTracker supportBreadcrumbTracker) {
        Intrinsics.checkNotNullParameter(supportBreadcrumbTracker, "<set-?>");
        this.supportBreadcrumbTracker = supportBreadcrumbTracker;
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

    public final AuthManager getAuthManager() {
        AuthManager authManager = this.authManager;
        if (authManager != null) {
            return authManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("authManager");
        return null;
    }

    public final void setAuthManager(AuthManager authManager) {
        Intrinsics.checkNotNullParameter(authManager, "<set-?>");
        this.authManager = authManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ChallengeVerificationDuxo getDuxo() {
        return (ChallengeVerificationDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentChallengeVerificationBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentChallengeVerificationBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ActivityErrorHandler<Object> getErrorHandler() {
        return (ActivityErrorHandler) this.errorHandler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ActivityErrorHandler errorHandler_delegate$lambda$0(ChallengeVerificationFragment challengeVerificationFragment) {
        FragmentActivity fragmentActivityRequireActivity = challengeVerificationFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        return new ActivityErrorHandler(fragmentActivityRequireActivity, true, 0, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ChallengeVerificationCallbacks getCallbacks() {
        return (ChallengeVerificationCallbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    private final boolean isChallengeLoaded() {
        return ((Boolean) this.isChallengeLoaded.getValue(this, $$delegatedProperties[2])).booleanValue();
    }

    private final void setChallengeLoaded(boolean z) {
        this.isChallengeLoaded.setValue(this, $$delegatedProperties[2], Boolean.valueOf(z));
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return new Screen(Screen.Name.IN_APP_VERIFICATION, null, ((ChallengeVerificationInput) INSTANCE.getArgs((Fragment) this)).getFlowId(), null, 10, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public com.robinhood.rosetta.eventlogging.Context getScreenEventContext() {
        ChallengeContext.ChallengeType challengeType;
        Companion companion = INSTANCE;
        Challenge challenge = ((ChallengeVerificationInput) companion.getArgs((Fragment) this)).getChallenge();
        String strValueOf = String.valueOf(challenge != null ? challenge.getId() : null);
        String strValueOf2 = String.valueOf(((ChallengeVerificationInput) companion.getArgs((Fragment) this)).getVerificationWorkflowId());
        Challenge challenge2 = ((ChallengeVerificationInput) companion.getArgs((Fragment) this)).getChallenge();
        Challenge.Type type2 = challenge2 != null ? challenge2.getType() : null;
        int i = type2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type2.ordinal()];
        if (i == 1) {
            challengeType = ChallengeContext.ChallengeType.SMS;
        } else if (i == 2) {
            challengeType = ChallengeContext.ChallengeType.APP;
        } else if (i == 3) {
            challengeType = ChallengeContext.ChallengeType.EMAIL;
        } else {
            challengeType = ChallengeContext.ChallengeType.CHALLENGE_TYPE_UNKNOWN;
        }
        String str = null;
        return new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, 0 == true ? 1 : 0, null, null, 0 == true ? 1 : 0, 0, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, str, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ChallengeContext(null, strValueOf, challengeType, null, null, strValueOf2, null, null, null, str, null, null, 4057, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -4097, -1, -1, -1, 16383, null);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(scarletContextWrapper), AchromaticOverlay.INSTANCE, null, 2, null);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        getSupportBreadcrumbTracker().removeBreadcrumb(getScreenName());
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        String string2;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        getBinding().numpad.useDefaultKeyHandler();
        RdsTextInputContainerView rdsTextInputContainerView = getBinding().challengeVerificationInputContainer;
        Companion companion = INSTANCE;
        Challenge challenge = ((ChallengeVerificationInput) companion.getArgs((Fragment) this)).getChallenge();
        Challenge.Type type2 = challenge != null ? challenge.getType() : null;
        int i = type2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type2.ordinal()];
        if (i == 1) {
            string2 = getString(C39076R.string.challenge_verification_sms_accessibility_talkback);
        } else if (i == 2) {
            string2 = getString(C39076R.string.challenge_verification_auth_app_accessibility_talkback);
        } else {
            string2 = "";
        }
        rdsTextInputContainerView.setContentDescription(string2);
        RdsFormattedEditText challengeVerificationInput = getBinding().challengeVerificationInput;
        Intrinsics.checkNotNullExpressionValue(challengeVerificationInput, "challengeVerificationInput");
        Observable observableDistinctUntilChanged = RxTextView.textChanges(challengeVerificationInput).map(new Function() { // from class: com.robinhood.android.challenge.verification.ChallengeVerificationFragment.onViewCreated.1
            @Override // io.reactivex.functions.Function
            public final String apply(CharSequence it) {
                Intrinsics.checkNotNullParameter(it, "it");
                String string3 = StringsKt.trim(it.toString()).toString();
                String strSubstring = string3.substring(0, Math.min(string3.length(), 6));
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                return strSubstring;
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C105092(getDuxo()));
        ChallengeVerificationInput.Alert initialAlert = ((ChallengeVerificationInput) companion.getArgs((Fragment) this)).getInitialAlert();
        if (initialAlert != null) {
            RhDialogFragment.Companion companion2 = RhDialogFragment.INSTANCE;
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            RhDialogFragment.Builder positiveButton = companion2.create(contextRequireContext).setTheme(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome).setTitle(initialAlert.getTitle()).setMessage(initialAlert.getDescription()).setPositiveButton(initialAlert.getDismissCtaText());
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            RhDialogFragment.Builder.show$default(positiveButton, childFragmentManager, "initial-alert", false, 4, null);
        }
        BaseFragment.collectDuxoState$default(this, null, new C105104(null), 1, null);
    }

    /* compiled from: ChallengeVerificationFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.challenge.verification.ChallengeVerificationFragment$onViewCreated$2 */
    /* synthetic */ class C105092 extends FunctionReferenceImpl implements Function1<String, Unit> {
        C105092(Object obj) {
            super(1, obj, ChallengeVerificationDuxo.class, "onInputChange", "onInputChange(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((ChallengeVerificationDuxo) this.receiver).onInputChange(p0);
        }
    }

    /* compiled from: ChallengeVerificationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.challenge.verification.ChallengeVerificationFragment$onViewCreated$4", m3645f = "ChallengeVerificationFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.challenge.verification.ChallengeVerificationFragment$onViewCreated$4 */
    static final class C105104 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C105104(Continuation<? super C105104> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C105104 c105104 = ChallengeVerificationFragment.this.new C105104(continuation);
            c105104.L$0 = obj;
            return c105104;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C105104) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: ChallengeVerificationFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.challenge.verification.ChallengeVerificationFragment$onViewCreated$4$1", m3645f = "ChallengeVerificationFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.challenge.verification.ChallengeVerificationFragment$onViewCreated$4$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ ChallengeVerificationFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ChallengeVerificationFragment challengeVerificationFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = challengeVerificationFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: ChallengeVerificationFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.challenge.verification.ChallengeVerificationFragment$onViewCreated$4$1$1, reason: invalid class name and collision with other inner class name */
            /* synthetic */ class C496481 implements FlowCollector, FunctionAdapter {
                final /* synthetic */ ChallengeVerificationFragment $tmp0;

                C496481(ChallengeVerificationFragment challengeVerificationFragment) {
                    this.$tmp0 = challengeVerificationFragment;
                }

                public final boolean equals(Object obj) {
                    if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                        return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.FunctionAdapter
                public final kotlin.Function<?> getFunctionDelegate() {
                    return new AdaptedFunctionReference(2, this.$tmp0, ChallengeVerificationFragment.class, "bind", "bind(Lcom/robinhood/android/challenge/verification/ChallengeVerificationViewState;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }

                public final Object emit(ChallengeVerificationViewState challengeVerificationViewState, Continuation<? super Unit> continuation) {
                    Object objInvokeSuspend$bind = AnonymousClass1.invokeSuspend$bind(this.$tmp0, challengeVerificationViewState, continuation);
                    return objInvokeSuspend$bind == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$bind : Unit.INSTANCE;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                    return emit((ChallengeVerificationViewState) obj, (Continuation<? super Unit>) continuation);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow<ChallengeVerificationViewState> stateFlow = this.this$0.getDuxo().getStateFlow();
                    C496481 c496481 = new C496481(this.this$0);
                    this.label = 1;
                    if (stateFlow.collect(c496481, this) == coroutine_suspended) {
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
            public static final /* synthetic */ Object invokeSuspend$bind(ChallengeVerificationFragment challengeVerificationFragment, ChallengeVerificationViewState challengeVerificationViewState, Continuation continuation) {
                challengeVerificationFragment.bind(challengeVerificationViewState);
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(ChallengeVerificationFragment.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(ChallengeVerificationFragment.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: ChallengeVerificationFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.challenge.verification.ChallengeVerificationFragment$onViewCreated$4$2", m3645f = "ChallengeVerificationFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.challenge.verification.ChallengeVerificationFragment$onViewCreated$4$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ ChallengeVerificationFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(ChallengeVerificationFragment challengeVerificationFragment, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = challengeVerificationFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: ChallengeVerificationFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.challenge.verification.ChallengeVerificationFragment$onViewCreated$4$2$1, reason: invalid class name */
            /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
                final /* synthetic */ ChallengeVerificationFragment $tmp0;

                AnonymousClass1(ChallengeVerificationFragment challengeVerificationFragment) {
                    this.$tmp0 = challengeVerificationFragment;
                }

                public final boolean equals(Object obj) {
                    if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                        return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.FunctionAdapter
                public final kotlin.Function<?> getFunctionDelegate() {
                    return new AdaptedFunctionReference(2, this.$tmp0, ChallengeVerificationFragment.class, "handleEvent", "handleEvent(Lcom/robinhood/android/udf/event/Event;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }

                public final Object emit(Event<ChallengeVerificationEvent> event, Continuation<? super Unit> continuation) {
                    Object objInvokeSuspend$handleEvent = AnonymousClass2.invokeSuspend$handleEvent(this.$tmp0, event, continuation);
                    return objInvokeSuspend$handleEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$handleEvent : Unit.INSTANCE;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                    return emit((Event<ChallengeVerificationEvent>) obj, (Continuation<? super Unit>) continuation);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowFilterNotNull = FlowKt.filterNotNull(this.this$0.getDuxo().getEventFlow());
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
                    this.label = 1;
                    if (flowFilterNotNull.collect(anonymousClass1, this) == coroutine_suspended) {
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

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ Object invokeSuspend$handleEvent(ChallengeVerificationFragment challengeVerificationFragment, Event event, Continuation continuation) {
                challengeVerificationFragment.handleEvent(event);
                return Unit.INSTANCE;
            }
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        ChallengeDialogHelper.PositiveButtonClickDelegate defaultPositiveButtonClickDelegate;
        if (((ChallengeVerificationInput) INSTANCE.getArgs((Fragment) this)).isEmbeddedInPathfinder()) {
            defaultPositiveButtonClickDelegate = new UarPositiveButtonDelegate();
        } else {
            defaultPositiveButtonClickDelegate = new DefaultPositiveButtonClickDelegate(this, getSupportEmailHandler(), getAuthManager(), getNavigator());
        }
        if (this.dialogHelper.onPositiveButtonClicked(defaultPositiveButtonClickDelegate, id, passthroughArgs)) {
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onNegativeButtonClicked(int id, Bundle passthroughArgs) {
        if (this.dialogHelper.onNegativeButtonClicked(new DefaultNegativeButtonClickDelegate(this), id)) {
            return true;
        }
        return super.onNegativeButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        if (id == C11048R.id.dialog_id_generic_error && !isChallengeLoaded()) {
            getCallbacks().onChallengeFailed();
        } else {
            super.onDialogDismissed(id);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setElevation(0.0f);
        toolbar.setTitle((CharSequence) null);
    }

    @Override // com.robinhood.android.challenge.verification.ChallengeVerificationHelpBottomSheetFragment.Callbacks
    public void onContactSupportClicked(boolean isLoggedIn, boolean logOutForUar, AppType appType) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        getDuxo().onContactSupportClicked(isLoggedIn, logOutForUar, appType);
    }

    @Override // com.robinhood.android.challenge.verification.ChallengeVerificationHelpBottomSheetFragment.Callbacks
    public void resendCode(UUID challengeId) {
        Intrinsics.checkNotNullParameter(challengeId, "challengeId");
        getDuxo().resendCode(challengeId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(final ChallengeVerificationViewState state) {
        setChallengeLoaded(state.getChallenge() != null);
        if (state.isLoading()) {
            getBinding().loadingView.show();
        } else {
            getBinding().loadingView.hide();
        }
        RhTextView rhTextView = getBinding().challengeVerificationTitleText;
        StringResource title = state.getTitle();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        rhTextView.setText(title.getText(resources));
        RhTextView rhTextView2 = getBinding().challengeVerificationSubtitleTxt;
        StringResource subtitle = state.getSubtitle();
        Resources resources2 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        rhTextView2.setText(subtitle.getText(resources2));
        RdsButton challengeVerificationHelpBtn = getBinding().challengeVerificationHelpBtn;
        Intrinsics.checkNotNullExpressionValue(challengeVerificationHelpBtn, "challengeVerificationHelpBtn");
        challengeVerificationHelpBtn.setVisibility(state.getHelpButtonVisible() ? 0 : 8);
        RdsButton challengeVerificationHelpBtn2 = getBinding().challengeVerificationHelpBtn;
        Intrinsics.checkNotNullExpressionValue(challengeVerificationHelpBtn2, "challengeVerificationHelpBtn");
        OnClickListeners.onClick(challengeVerificationHelpBtn2, new Function0() { // from class: com.robinhood.android.challenge.verification.ChallengeVerificationFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChallengeVerificationFragment.bind$lambda$3(this.f$0, state);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit bind$lambda$3(ChallengeVerificationFragment challengeVerificationFragment, ChallengeVerificationViewState challengeVerificationViewState) {
        Challenge.Type alternate_type;
        String serverValue;
        Challenge.Type type2;
        String serverValue2;
        EventLogger eventLogger = challengeVerificationFragment.getEventLogger();
        UserInteractionEventData.Action action = UserInteractionEventData.Action.NEED_HELP;
        Screen.Name name = Screen.Name.IN_APP_VERIFICATION;
        Companion companion = INSTANCE;
        String flowId = ((ChallengeVerificationInput) companion.getArgs((Fragment) challengeVerificationFragment)).getFlowId();
        Challenge challenge = ((ChallengeVerificationInput) companion.getArgs((Fragment) challengeVerificationFragment)).getChallenge();
        Screen screen = new Screen(name, (challenge == null || (type2 = challenge.getType()) == null || (serverValue2 = type2.getServerValue()) == null) ? "" : serverValue2, flowId, null, 8, null);
        Challenge challenge2 = ((ChallengeVerificationInput) companion.getArgs((Fragment) challengeVerificationFragment)).getChallenge();
        String str = (challenge2 == null || (alternate_type = challenge2.getAlternate_type()) == null || (serverValue = alternate_type.getServerValue()) == null) ? "" : serverValue;
        Object[] objArr = 0 == true ? 1 : 0;
        EventLogger.DefaultImpls.logTap$default(eventLogger, action, screen, null, null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, 0 == true ? 1 : 0, null, objArr, null, null, 0, null, null, null, new Screen(null, null, str, null, 11, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4097, -1, -1, -1, -1, -1, 16383, null), false, 44, null);
        EventLogger.DefaultImpls.logTap$default(challengeVerificationFragment.getEventLogger(), null, new Screen(name, null, 0 == true ? 1 : 0, null, 14, null), new Component(Component.ComponentType.BUTTON, HELP_BTN_LOGGING_ID, null, 4, null), null, null, false, 57, null);
        FragmentActivity fragmentActivityRequireActivity = challengeVerificationFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        Activity.hideKeyboard$default(fragmentActivityRequireActivity, false, 1, null);
        ChallengeVerificationHelpBottomSheetFragment.Companion companion2 = ChallengeVerificationHelpBottomSheetFragment.INSTANCE;
        Challenge challenge3 = challengeVerificationViewState.getChallenge();
        Intrinsics.checkNotNull(challenge3);
        ChallengeVerificationHelpBottomSheetFragment challengeVerificationHelpBottomSheetFragment = (ChallengeVerificationHelpBottomSheetFragment) FragmentWithArgsAndCallbacksCompanion.DefaultImpls.newInstance$default(companion2, new ChallengeVerificationHelpBottomSheetFragment.Args(challenge3, challengeVerificationViewState.isLoggedIn(), ((ChallengeVerificationInput) companion.getArgs((Fragment) challengeVerificationFragment)).getFlowId(), ((ChallengeVerificationInput) companion.getArgs((Fragment) challengeVerificationFragment)).isEmbeddedInPathfinder(), ((ChallengeVerificationInput) companion.getArgs((Fragment) challengeVerificationFragment)).getFallbackCtaText(), challengeVerificationViewState.getHideSmsUarFallback(), ((ChallengeVerificationInput) companion.getArgs((Fragment) challengeVerificationFragment)).getEmail(), ((ChallengeVerificationInput) companion.getArgs((Fragment) challengeVerificationFragment)).getVerificationWorkflowId()), challengeVerificationFragment, 0, 4, null);
        FragmentManager parentFragmentManager = challengeVerificationFragment.getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        challengeVerificationHelpBottomSheetFragment.show(parentFragmentManager, ChallengeVerificationHelpBottomSheetFragment.TAG);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        Companion companion = INSTANCE;
        if (((ChallengeVerificationInput) companion.getArgs((Fragment) this)).isEmbeddedInPathfinder() && !Intrinsics.areEqual(((ChallengeVerificationInput) companion.getArgs((Fragment) this)).getFlowId(), Challenge.Flow.LOGIN.getId())) {
            getDuxo().returnChallengeId();
            return true;
        }
        return super.onBackPressed();
    }

    /* compiled from: ChallengeVerificationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\b\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\t\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/challenge/verification/ChallengeVerificationFragment$UarPositiveButtonDelegate;", "Lcom/robinhood/android/challenge/verification/dialog/ChallengeDialogHelper$PositiveButtonClickDelegate;", "<init>", "(Lcom/robinhood/android/challenge/verification/ChallengeVerificationFragment;)V", "onTimeoutPositiveButtonClick", "", "passthroughArgs", "Landroid/os/Bundle;", "onAttemptsExhaustedPositiveButtonClick", "onUarLogoutConfirmationPositiveButtonClick", "feature-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private final class UarPositiveButtonDelegate implements ChallengeDialogHelper.PositiveButtonClickDelegate {
        public UarPositiveButtonDelegate() {
        }

        @Override // com.robinhood.android.challenge.verification.dialog.ChallengeDialogHelper.PositiveButtonClickDelegate
        public void onTimeoutPositiveButtonClick(Bundle passthroughArgs) {
            ChallengeVerificationFragment.this.getCallbacks().onChallengeCompleted(passthroughArgs != null ? (UUID) Bundles.getTypedSerializable(passthroughArgs, ChallengeVerificationDataState.DIALOG_PASSTHROUGH_BUNDLE) : null);
        }

        @Override // com.robinhood.android.challenge.verification.dialog.ChallengeDialogHelper.PositiveButtonClickDelegate
        public void onAttemptsExhaustedPositiveButtonClick(Bundle passthroughArgs) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalStateException("Attempts exhausted should return immediately in UAR flow."), true, null, 4, null);
        }

        @Override // com.robinhood.android.challenge.verification.dialog.ChallengeDialogHelper.PositiveButtonClickDelegate
        public void onUarLogoutConfirmationPositiveButtonClick(Bundle passthroughArgs) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalStateException("The user should already be logged out. UarPositiveButtonDelegate is only for logged out users."), true, null, 4, null);
        }
    }

    /* compiled from: ChallengeVerificationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/challenge/verification/ChallengeVerificationFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/challenge/verification/ChallengeVerificationFragment;", "Lcom/robinhood/shared/security/contracts/ChallengeVerificationInput;", "<init>", "()V", "HELP_BTN_LOGGING_ID", "", "feature-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<ChallengeVerificationFragment, ChallengeVerificationInput> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public ChallengeVerificationInput getArgs(ChallengeVerificationFragment challengeVerificationFragment) {
            return (ChallengeVerificationInput) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, challengeVerificationFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public ChallengeVerificationFragment newInstance(ChallengeVerificationInput challengeVerificationInput) {
            return (ChallengeVerificationFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, challengeVerificationInput);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(ChallengeVerificationFragment challengeVerificationFragment, ChallengeVerificationInput challengeVerificationInput) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, challengeVerificationFragment, challengeVerificationInput);
        }
    }
}
