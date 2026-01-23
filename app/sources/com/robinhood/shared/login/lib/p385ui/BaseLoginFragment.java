package com.robinhood.shared.login.lib.p385ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocal6;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.credentials.Credential;
import androidx.credentials.CredentialManager;
import androidx.credentials.GetCredentialRequest;
import androidx.credentials.GetCredentialResponse;
import androidx.credentials.GetPublicKeyCredentialOption;
import androidx.credentials.PublicKeyCredential;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialInterruptedException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.exceptions.NoCredentialException;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.analytics.SharedEventLogger;
import com.robinhood.android.challenge.ChallengeResponseActivity;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.login.LoginStatus;
import com.robinhood.referral.AttributionManager;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.gdpr.contracts.PrivacySettingsBottomSheetActivityKey;
import com.robinhood.shared.login.lib.p385ui.BaseLoginEvent;
import com.robinhood.shared.login.lib.p385ui.LoginErrorHandler;
import com.robinhood.shared.login.lib.p385ui.LoginSuvHelpBottomSheetFragment;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.shared.support.contracts.ContactSupportFragmentKey;
import com.robinhood.shared.user.contracts.auth.LoginFragmentKey;
import com.robinhood.utils.compose.LocalActivity3;
import com.robinhood.utils.extensions.Activity;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
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

/* compiled from: BaseLoginFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u0000 W2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001WB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\r\u00103\u001a\u000204H\u0017¢\u0006\u0002\u00105J\r\u00106\u001a\u000204H\u0003¢\u0006\u0002\u00105J\u0010\u00107\u001a\u0002042\u0006\u00108\u001a\u000209H\u0016J\u0012\u0010:\u001a\u0002042\b\u0010;\u001a\u0004\u0018\u00010<H\u0016J\u001a\u0010=\u001a\u0002042\u0006\u0010>\u001a\u00020?2\b\u0010;\u001a\u0004\u0018\u00010<H\u0016J\u0016\u0010@\u001a\u0002042\f\u0010A\u001a\b\u0012\u0004\u0012\u00020C0BH\u0002J \u0010D\u001a\u0002042\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020\"2\u0006\u0010H\u001a\u00020\"H\u0002J\u001e\u0010I\u001a\u0002042\u0006\u0010J\u001a\u00020\"2\u0006\u0010K\u001a\u00020LH\u0082@¢\u0006\u0002\u0010MJ\u0010\u0010N\u001a\u0002042\u0006\u0010O\u001a\u00020PH\u0016J\b\u0010Q\u001a\u000204H\u0016J\b\u0010R\u001a\u000204H\u0016J\b\u0010S\u001a\u000204H\u0016J\b\u0010T\u001a\u000204H\u0016J\b\u0010U\u001a\u000204H\u0016J\b\u0010V\u001a\u000204H\u0016R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0012\u0010\u001e\u001a\u00020\u001fX¤\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010 R\u0014\u0010!\u001a\u0004\u0018\u00010\"X¤\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u001fX\u0094D¢\u0006\b\n\u0000\u001a\u0004\b&\u0010 R\u001b\u0010'\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b)\u0010*R\u001b\u0010-\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b/\u00100¨\u0006X"}, m3636d2 = {"Lcom/robinhood/shared/login/lib/ui/BaseLoginFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/shared/login/lib/ui/LoginHelpBottomSheetFragmentCallbacks;", "Lcom/robinhood/shared/login/lib/ui/LoginSuvHelpBottomSheetFragment$Callbacks;", "<init>", "()V", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "getAuthManager", "()Lcom/robinhood/shared/security/auth/AuthManager;", "setAuthManager", "(Lcom/robinhood/shared/security/auth/AuthManager;)V", "attributionManager", "Lcom/robinhood/referral/AttributionManager;", "getAttributionManager", "()Lcom/robinhood/referral/AttributionManager;", "setAttributionManager", "(Lcom/robinhood/referral/AttributionManager;)V", "eventLogger", "Lcom/robinhood/analytics/SharedEventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/SharedEventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/SharedEventLogger;)V", "credentialManager", "Landroidx/credentials/CredentialManager;", "getCredentialManager", "()Landroidx/credentials/CredentialManager;", "setCredentialManager", "(Landroidx/credentials/CredentialManager;)V", "isAchromatic", "", "()Z", "emailPrefill", "", "getEmailPrefill", "()Ljava/lang/String;", "launchForgotEmail", "getLaunchForgotEmail", "duxo", "Lcom/robinhood/shared/login/lib/ui/BaseLoginDuxo;", "getDuxo", "()Lcom/robinhood/shared/login/lib/ui/BaseLoginDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/shared/user/contracts/auth/LoginFragmentKey$Callbacks;", "getCallbacks", "()Lcom/robinhood/shared/user/contracts/auth/LoginFragmentKey$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "MainContent", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "processEvent", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/shared/login/lib/ui/BaseLoginEvent;", "onAuthenticated", "loginStatus", "Lcom/robinhood/login/LoginStatus;", "email", "password", "showPasskeyBottomSheet", "webauthnOptions", ChallengeResponseActivity.EXTRA_CHALLENGE_ID, "Ljava/util/UUID;", "(Ljava/lang/String;Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onForgotPasswordClicked", "onForgotEmailClicked", "onSomethingElseClicked", "onForgotPassword", "onForgotEmail", "onNeedAccessToOtherAccount", "Companion", "feature-lib-login_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes21.dex */
public abstract class BaseLoginFragment extends GenericComposeFragment implements LoginHelpBottomSheetFragmentCallbacks, LoginSuvHelpBottomSheetFragment.Callbacks {
    private static final String HELP_BOTTOM_SHEET_TAG = "login-help";
    public AttributionManager attributionManager;
    public AuthManager authManager;
    public CredentialManager credentialManager;
    public SharedEventLogger eventLogger;
    private final boolean launchForgotEmail;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(BaseLoginFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/shared/user/contracts/auth/LoginFragmentKey$Callbacks;", 0))};
    public static final int $stable = 8;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, BaseLoginDuxo.class);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(LoginFragmentKey.Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.shared.login.lib.ui.BaseLoginFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof LoginFragmentKey.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* compiled from: BaseLoginFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.login.lib.ui.BaseLoginFragment", m3645f = "BaseLoginFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_COMMENT_VALUE}, m3647m = "showPasskeyBottomSheet")
    /* renamed from: com.robinhood.shared.login.lib.ui.BaseLoginFragment$showPasskeyBottomSheet$1 */
    /* loaded from: classes6.dex */
    static final class C391121 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C391121(Continuation<? super C391121> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BaseLoginFragment.this.showPasskeyBottomSheet(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainContent$lambda$2(BaseLoginFragment baseLoginFragment, int i, Composer composer, int i2) {
        baseLoginFragment.MainContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    protected abstract String getEmailPrefill();

    /* renamed from: isAchromatic */
    protected abstract boolean getIsAchromatic();

    /* JADX INFO: Access modifiers changed from: private */
    public final void processEvent(final Event<BaseLoginEvent> event) {
        EventConsumer<BaseLoginEvent> eventConsumerInvoke;
        EventConsumer<BaseLoginEvent> eventConsumerInvoke2;
        EventConsumer<BaseLoginEvent> eventConsumerInvoke3;
        EventConsumer<BaseLoginEvent> eventConsumerInvoke4;
        EventConsumer<BaseLoginEvent> eventConsumerInvoke5;
        EventConsumer<BaseLoginEvent> eventConsumerInvoke6;
        if ((event.getData() instanceof BaseLoginEvent.LoginSuccess) && (eventConsumerInvoke6 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke6.consume(event, new Function1() { // from class: com.robinhood.shared.login.lib.ui.BaseLoginFragment$processEvent$$inlined$consumeIfType$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m25494invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m25494invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    BaseLoginEvent.LoginSuccess loginSuccess = (BaseLoginEvent.LoginSuccess) event.getData();
                    this.onAuthenticated(loginSuccess.getLoginStatus(), loginSuccess.getEmail(), loginSuccess.getPassword());
                }
            });
        }
        if ((event.getData() instanceof BaseLoginEvent.SaveCredentials) && (eventConsumerInvoke5 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke5.consume(event, new Function1() { // from class: com.robinhood.shared.login.lib.ui.BaseLoginFragment$processEvent$$inlined$consumeIfType$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m25495invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m25495invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    BuildersKt__Builders_commonKt.launch$default(this.getLifecycleScope(), null, null, new BaseLoginFragment2((BaseLoginEvent.SaveCredentials) event.getData(), this, null), 3, null);
                }
            });
        }
        if ((event.getData() instanceof BaseLoginEvent.PasskeyLoginSuccess) && (eventConsumerInvoke4 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke4.consume(event, new Function1() { // from class: com.robinhood.shared.login.lib.ui.BaseLoginFragment$processEvent$$inlined$consumeIfType$3
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m25496invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m25496invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    BaseLoginEvent.PasskeyLoginSuccess passkeyLoginSuccess = (BaseLoginEvent.PasskeyLoginSuccess) event.getData();
                    this.getAttributionManager().completeAttribution();
                    this.getCallbacks().onAuthenticated(passkeyLoginSuccess.getLoginStatus(), null, null);
                }
            });
        }
        if ((event.getData() instanceof BaseLoginEvent.PasskeyLoginFailure) && (eventConsumerInvoke3 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke3.consume(event, new Function1() { // from class: com.robinhood.shared.login.lib.ui.BaseLoginFragment$processEvent$$inlined$consumeIfType$4
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m25497invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m25497invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    BaseLoginEvent.PasskeyLoginFailure passkeyLoginFailure = (BaseLoginEvent.PasskeyLoginFailure) event.getData();
                    LoginErrorHandler.Companion companion = LoginErrorHandler.INSTANCE;
                    FragmentActivity fragmentActivityRequireActivity = this.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                    LoginErrorHandler.Companion.handleError$default(companion, fragmentActivityRequireActivity, passkeyLoginFailure.getError(), this.getIsAchromatic(), null, null, 24, null);
                }
            });
        }
        if ((event.getData() instanceof BaseLoginEvent.ShowPasskeyBottomSheet) && (eventConsumerInvoke2 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke2.consume(event, new Function1() { // from class: com.robinhood.shared.login.lib.ui.BaseLoginFragment$processEvent$$inlined$consumeIfType$5
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m25498invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m25498invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    BaseLoginEvent.ShowPasskeyBottomSheet showPasskeyBottomSheet = (BaseLoginEvent.ShowPasskeyBottomSheet) event.getData();
                    String webauthn_options = showPasskeyBottomSheet.getChallenge().getWebauthn_options();
                    if (webauthn_options != null) {
                        BuildersKt__Builders_commonKt.launch$default(this.getLifecycleScope(), null, null, new BaseLoginFragment3(this, webauthn_options, showPasskeyBottomSheet, null), 3, null);
                    }
                }
            });
        }
        if (!(event.getData() instanceof BaseLoginEvent.PromptForPrivacy) || (eventConsumerInvoke = event.getGetEventConsumer().invoke()) == null) {
            return;
        }
        eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.shared.login.lib.ui.BaseLoginFragment$processEvent$$inlined$consumeIfType$6
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m25499invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m25499invoke(Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                Navigator navigator = this.getNavigator();
                Context contextRequireContext = this.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, PrivacySettingsBottomSheetActivityKey.INSTANCE, null, false, null, null, 60, null);
            }
        });
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

    public final AttributionManager getAttributionManager() {
        AttributionManager attributionManager = this.attributionManager;
        if (attributionManager != null) {
            return attributionManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("attributionManager");
        return null;
    }

    public final void setAttributionManager(AttributionManager attributionManager) {
        Intrinsics.checkNotNullParameter(attributionManager, "<set-?>");
        this.attributionManager = attributionManager;
    }

    public final SharedEventLogger getEventLogger() {
        SharedEventLogger sharedEventLogger = this.eventLogger;
        if (sharedEventLogger != null) {
            return sharedEventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(SharedEventLogger sharedEventLogger) {
        Intrinsics.checkNotNullParameter(sharedEventLogger, "<set-?>");
        this.eventLogger = sharedEventLogger;
    }

    public final CredentialManager getCredentialManager() {
        CredentialManager credentialManager = this.credentialManager;
        if (credentialManager != null) {
            return credentialManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("credentialManager");
        return null;
    }

    public final void setCredentialManager(CredentialManager credentialManager) {
        Intrinsics.checkNotNullParameter(credentialManager, "<set-?>");
        this.credentialManager = credentialManager;
    }

    protected boolean getLaunchForgotEmail() {
        return this.launchForgotEmail;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BaseLoginDuxo getDuxo() {
        return (BaseLoginDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LoginFragmentKey.Callbacks getCallbacks() {
        return (LoginFragmentKey.Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, int i) {
        composer.startReplaceGroup(-1938409419);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1938409419, i, -1, "com.robinhood.shared.login.lib.ui.BaseLoginFragment.ComposeContent (BaseLoginFragment.kt:64)");
        }
        CompositionLocal6<FragmentActivity> localActivity = LocalActivity3.getLocalActivity();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        CompositionLocal3.CompositionLocalProvider(localActivity.provides(fragmentActivityRequireActivity), ComposableLambda3.rememberComposableLambda(-667227275, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.login.lib.ui.BaseLoginFragment.ComposeContent.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i2) {
                if ((i2 & 3) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-667227275, i2, -1, "com.robinhood.shared.login.lib.ui.BaseLoginFragment.ComposeContent.<anonymous> (BaseLoginFragment.kt:66)");
                }
                if (BaseLoginFragment.this.getIsAchromatic()) {
                    composer2.startReplaceGroup(-259068543);
                    final BaseLoginFragment baseLoginFragment = BaseLoginFragment.this;
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(2007583055, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.login.lib.ui.BaseLoginFragment.ComposeContent.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i3) {
                            if ((i3 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2007583055, i3, -1, "com.robinhood.shared.login.lib.ui.BaseLoginFragment.ComposeContent.<anonymous>.<anonymous> (BaseLoginFragment.kt:68)");
                            }
                            baseLoginFragment.MainContent(composer3, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 6);
                    composer2.endReplaceGroup();
                } else {
                    composer2.startReplaceGroup(-258957408);
                    BaseLoginFragment.this.MainContent(composer2, 0);
                    composer2.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer, 54), composer, ProvidedValue.$stable | 48);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MainContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1561981906);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1561981906, i2, -1, "com.robinhood.shared.login.lib.ui.BaseLoginFragment.MainContent (BaseLoginFragment.kt:77)");
            }
            boolean zIsAchromatic = getIsAchromatic();
            String emailPrefill = getEmailPrefill();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.shared.login.lib.ui.BaseLoginFragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return BaseLoginFragment.MainContent$lambda$1$lambda$0(this.f$0, ((Boolean) obj).booleanValue());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            BaseLoginComposable.BaseLoginComposable(zIsAchromatic, emailPrefill, (Function1) objRememberedValue, getCredentialManager(), getEventLogger(), getDuxo(), null, composerStartRestartGroup, 0, 64);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.login.lib.ui.BaseLoginFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BaseLoginFragment.MainContent$lambda$2(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainContent$lambda$1$lambda$0(BaseLoginFragment baseLoginFragment, boolean z) {
        EventLogger.DefaultImpls.logTap$default(baseLoginFragment.getEventLogger(), UserInteractionEventData.Action.NEED_HELP, new Screen(Screen.Name.LOGIN, null, null, null, 14, null), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, null, false, 56, null);
        FragmentActivity fragmentActivityRequireActivity = baseLoginFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        Activity.hideKeyboard$default(fragmentActivityRequireActivity, false, 1, null);
        if (z) {
            LoginSuvHelpBottomSheetFragment loginSuvHelpBottomSheetFragment = (LoginSuvHelpBottomSheetFragment) LoginSuvHelpBottomSheetFragment.INSTANCE.newInstance();
            FragmentManager childFragmentManager = baseLoginFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            loginSuvHelpBottomSheetFragment.show(childFragmentManager, HELP_BOTTOM_SHEET_TAG);
        } else {
            LoginHelpBottomSheetFragment loginHelpBottomSheetFragmentNewInstance = LoginHelpBottomSheetFragment.INSTANCE.newInstance(!baseLoginFragment.getAuthManager().isLoggedIn());
            FragmentManager childFragmentManager2 = baseLoginFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "getChildFragmentManager(...)");
            loginHelpBottomSheetFragmentNewInstance.show(childFragmentManager2, HELP_BOTTOM_SHEET_TAG);
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        BaseActivity baseActivity = getBaseActivity();
        if (baseActivity instanceof LoginFragmentKey.Callbacks) {
            return;
        }
        throw new IllegalArgumentException((baseActivity + " must implement " + LoginFragmentKey.Callbacks.class.getName()).toString());
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getAuthManager().isLoggedIn()) {
            getCallbacks().onAuthenticated(new LoginStatus.Success(null, 1, null), null, null);
        } else if (getLaunchForgotEmail()) {
            getDuxo().onForgotEmail(true);
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C391111(null), 1, null);
    }

    /* compiled from: BaseLoginFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.login.lib.ui.BaseLoginFragment$onViewCreated$1", m3645f = "BaseLoginFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.login.lib.ui.BaseLoginFragment$onViewCreated$1 */
    /* loaded from: classes6.dex */
    static final class C391111 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C391111(Continuation<? super C391111> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BaseLoginFragment.this.new C391111(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C391111) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: BaseLoginFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.shared.login.lib.ui.BaseLoginFragment$onViewCreated$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ BaseLoginFragment $tmp0;

            AnonymousClass1(BaseLoginFragment baseLoginFragment) {
                this.$tmp0 = baseLoginFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, BaseLoginFragment.class, "processEvent", "processEvent(Lcom/robinhood/android/udf/event/Event;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(Event<BaseLoginEvent> event, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$processEvent = C391111.invokeSuspend$processEvent(this.$tmp0, event, continuation);
                return objInvokeSuspend$processEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$processEvent : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((Event<BaseLoginEvent>) obj, (Continuation<? super Unit>) continuation);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(BaseLoginFragment.this.getDuxo().getEventFlow());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(BaseLoginFragment.this);
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
        public static final /* synthetic */ Object invokeSuspend$processEvent(BaseLoginFragment baseLoginFragment, Event event, Continuation continuation) {
            baseLoginFragment.processEvent(event);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAuthenticated(LoginStatus loginStatus, String email, String password) {
        getAttributionManager().completeAttribution();
        getCallbacks().onAuthenticated(loginStatus, email, password);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object showPasskeyBottomSheet(String str, UUID uuid, Continuation<? super Unit> continuation) throws Exception {
        C391121 c391121;
        BaseLoginFragment baseLoginFragment;
        UUID uuid2;
        if (continuation instanceof C391121) {
            c391121 = (C391121) continuation;
            int i = c391121.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c391121.label = i - Integer.MIN_VALUE;
                baseLoginFragment = this;
            } else {
                baseLoginFragment = this;
                c391121 = baseLoginFragment.new C391121(continuation);
            }
        }
        Object credential = c391121.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c391121.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(credential);
                GetPublicKeyCredentialOption getPublicKeyCredentialOption = new GetPublicKeyCredentialOption(str, (byte[]) null, (Set) null, 6, (DefaultConstructorMarker) null);
                CredentialManager credentialManager = baseLoginFragment.getCredentialManager();
                FragmentActivity fragmentActivityRequireActivity = baseLoginFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                GetCredentialRequest getCredentialRequest = new GetCredentialRequest(CollectionsKt.listOf(getPublicKeyCredentialOption), null, false, null, false, 30, null);
                c391121.L$0 = uuid;
                c391121.label = 1;
                credential = credentialManager.getCredential(fragmentActivityRequireActivity, getCredentialRequest, c391121);
                if (credential == coroutine_suspended) {
                    return coroutine_suspended;
                }
                uuid2 = uuid;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                uuid2 = (UUID) c391121.L$0;
                ResultKt.throwOnFailure(credential);
            }
            GetCredentialResponse getCredentialResponse = (GetCredentialResponse) credential;
            if (getCredentialResponse.getCredential() instanceof PublicKeyCredential) {
                Credential credential2 = getCredentialResponse.getCredential();
                Intrinsics.checkNotNull(credential2, "null cannot be cast to non-null type androidx.credentials.PublicKeyCredential");
                baseLoginFragment.getDuxo().validatePasskeyChallenge(uuid2, ((PublicKeyCredential) credential2).getAuthenticationResponseJson());
            }
            return Unit.INSTANCE;
        } catch (Exception e) {
            if ((e instanceof NoCredentialException) || (e instanceof GetCredentialCancellationException) || (e instanceof GetCredentialInterruptedException) || (e instanceof GetCredentialUnknownException)) {
                baseLoginFragment.getDuxo().handlePasskeyException(e);
                CrashReporter.Companion companion = CrashReporter.INSTANCE;
                companion.log("Auth: getCredential failed with exception");
                CrashReporter.DefaultImpls.reportNonFatal$default(companion, e, false, null, 4, null);
                return Unit.INSTANCE;
            }
            throw e;
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setUseDesignSystemTheme(true);
        toolbar.setElevation(0.0f);
    }

    @Override // com.robinhood.shared.login.lib.p385ui.LoginHelpBottomSheetFragmentCallbacks
    public void onForgotPasswordClicked() {
        getCallbacks().onForgotPasswordClicked();
    }

    @Override // com.robinhood.shared.login.lib.p385ui.LoginHelpBottomSheetFragmentCallbacks
    public void onForgotEmailClicked() {
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, contextRequireContext, new ContactSupportFragmentKey.TriageFlow(null, null, null, null, null, 31, null), false, false, false, false, null, false, null, null, 988, null);
    }

    @Override // com.robinhood.shared.login.lib.p385ui.LoginHelpBottomSheetFragmentCallbacks
    public void onSomethingElseClicked() {
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, contextRequireContext, new ContactSupportFragmentKey.TriageFlow(null, "2024", null, null, null, 29, null), false, false, false, false, null, false, null, null, 988, null);
    }

    @Override // com.robinhood.shared.login.lib.ui.LoginSuvHelpBottomSheetFragment.Callbacks
    public void onForgotPassword() {
        getCallbacks().onForgotPasswordClicked();
    }

    @Override // com.robinhood.shared.login.lib.ui.LoginSuvHelpBottomSheetFragment.Callbacks
    public void onForgotEmail() {
        getDuxo().onForgotEmail(true);
    }

    @Override // com.robinhood.shared.login.lib.ui.LoginSuvHelpBottomSheetFragment.Callbacks
    public void onNeedAccessToOtherAccount() {
        onSomethingElseClicked();
    }
}
