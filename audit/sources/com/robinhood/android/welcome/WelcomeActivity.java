package com.robinhood.android.welcome;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.robinhood.analytics.performance.startup.StartupActivity;
import com.robinhood.android.authlock.biometric.BiometricAuthManager;
import com.robinhood.android.authlock.pin.PinManager;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.home.contracts.MainActivityIntentKey;
import com.robinhood.android.navigation.IntentResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.welcome.WelcomeDuxo3;
import com.robinhood.android.welcome.WelcomeFragment;
import com.robinhood.android.welcome.p276gb.WelcomeFragmentGb;
import com.robinhood.android.welcome.rebrand.WelcomeRebrandFragment;
import com.robinhood.referral.AttributionManager;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.shared.home.contracts.BlockedExternalLoggedOutDeeplinkIntentKey;
import com.robinhood.shared.home.deeplink.prompt.BlockedExternalDeeplinkPrompt;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.shared.user.contracts.WelcomeIntentKey;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: WelcomeActivity.kt */
@Metadata(m3635d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 O2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0002NOB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010B\u001a\u00020C2\b\u0010D\u001a\u0004\u0018\u00010EH\u0014J\b\u0010F\u001a\u00020CH\u0014J\u0010\u0010G\u001a\u00020C2\u0006\u0010H\u001a\u00020IH\u0014J\u0010\u0010J\u001a\u00020C2\u0006\u0010H\u001a\u00020IH\u0015J\u0010\u0010K\u001a\u00020C2\u0006\u0010L\u001a\u00020:H\u0016J\u0010\u0010M\u001a\u00020C2\u0006\u0010L\u001a\u00020:H\u0016R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\u00020\u001b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010 \u001a\u00020!8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001b\u0010&\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b(\u0010)R+\u0010.\u001a\u00020-2\u0006\u0010,\u001a\u00020-8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0014\u00105\u001a\u0002068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u00109\u001a\u00020:8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020?0>8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010A¨\u0006P"}, m3636d2 = {"Lcom/robinhood/android/welcome/WelcomeActivity;", "Lcom/robinhood/android/welcome/BaseWelcomeActivity;", "Lcom/robinhood/analytics/performance/startup/StartupActivity;", "Lcom/robinhood/android/welcome/WelcomeFragment$Callbacks;", "Lcom/robinhood/android/welcome/rebrand/WelcomeRebrandFragment$Callbacks;", "Lcom/robinhood/android/welcome/gb/WelcomeFragmentGb$Callbacks;", "<init>", "()V", "attributionManager", "Lcom/robinhood/referral/AttributionManager;", "getAttributionManager", "()Lcom/robinhood/referral/AttributionManager;", "setAttributionManager", "(Lcom/robinhood/referral/AttributionManager;)V", "pinManager", "Lcom/robinhood/android/authlock/pin/PinManager;", "getPinManager", "()Lcom/robinhood/android/authlock/pin/PinManager;", "setPinManager", "(Lcom/robinhood/android/authlock/pin/PinManager;)V", "biometricAuthManager", "Lcom/robinhood/android/authlock/biometric/BiometricAuthManager;", "getBiometricAuthManager", "()Lcom/robinhood/android/authlock/biometric/BiometricAuthManager;", "setBiometricAuthManager", "(Lcom/robinhood/android/authlock/biometric/BiometricAuthManager;)V", "blockedDeeplinkPrompt", "Lcom/robinhood/shared/home/deeplink/prompt/BlockedExternalDeeplinkPrompt;", "getBlockedDeeplinkPrompt", "()Lcom/robinhood/shared/home/deeplink/prompt/BlockedExternalDeeplinkPrompt;", "setBlockedDeeplinkPrompt", "(Lcom/robinhood/shared/home/deeplink/prompt/BlockedExternalDeeplinkPrompt;)V", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "getAuthManager", "()Lcom/robinhood/shared/security/auth/AuthManager;", "setAuthManager", "(Lcom/robinhood/shared/security/auth/AuthManager;)V", "duxo", "Lcom/robinhood/android/welcome/WelcomeDuxo;", "getDuxo", "()Lcom/robinhood/android/welcome/WelcomeDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "<set-?>", "", "handledAttribution", "getHandledAttribution", "()Z", "setHandledAttribution", "(Z)V", "handledAttribution$delegate", "Lkotlin/properties/ReadWriteProperty;", "screen", "Lcom/robinhood/analytics/performance/startup/StartupActivity$Screen;", "getScreen", "()Lcom/robinhood/analytics/performance/startup/StartupActivity$Screen;", "screenTag", "", "getScreenTag", "()Ljava/lang/String;", "stateChanges", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/welcome/WelcomeState;", "getStateChanges", "()Lkotlinx/coroutines/flow/Flow;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "handleCustomIntent", "intent", "Landroid/content/Intent;", "onNewIntent", "onSignInClicked", "loggingTag", "onSignUpClicked", "BlockedExternalDeeplinkIntentResolver", "Companion", "feature-welcome_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes20.dex */
public final class WelcomeActivity extends BaseWelcomeActivity implements StartupActivity, WelcomeFragment.Callbacks, WelcomeRebrandFragment.Callbacks, WelcomeFragmentGb.Callbacks {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(WelcomeActivity.class, "handledAttribution", "getHandledAttribution()Z", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String EXTRA_BLOCKED_DEEPLINK_URL = "blockedDeeplinkUrl";
    public AttributionManager attributionManager;
    public AuthManager authManager;
    public BiometricAuthManager biometricAuthManager;
    public BlockedExternalDeeplinkPrompt blockedDeeplinkPrompt;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, WelcomeDuxo.class);

    /* renamed from: handledAttribution$delegate, reason: from kotlin metadata */
    private final Interfaces3 handledAttribution = BindSavedState2.savedBoolean(this, false).provideDelegate(this, $$delegatedProperties[0]);
    public PinManager pinManager;

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

    public final PinManager getPinManager() {
        PinManager pinManager = this.pinManager;
        if (pinManager != null) {
            return pinManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pinManager");
        return null;
    }

    public final void setPinManager(PinManager pinManager) {
        Intrinsics.checkNotNullParameter(pinManager, "<set-?>");
        this.pinManager = pinManager;
    }

    public final BiometricAuthManager getBiometricAuthManager() {
        BiometricAuthManager biometricAuthManager = this.biometricAuthManager;
        if (biometricAuthManager != null) {
            return biometricAuthManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("biometricAuthManager");
        return null;
    }

    public final void setBiometricAuthManager(BiometricAuthManager biometricAuthManager) {
        Intrinsics.checkNotNullParameter(biometricAuthManager, "<set-?>");
        this.biometricAuthManager = biometricAuthManager;
    }

    public final BlockedExternalDeeplinkPrompt getBlockedDeeplinkPrompt() {
        BlockedExternalDeeplinkPrompt blockedExternalDeeplinkPrompt = this.blockedDeeplinkPrompt;
        if (blockedExternalDeeplinkPrompt != null) {
            return blockedExternalDeeplinkPrompt;
        }
        Intrinsics.throwUninitializedPropertyAccessException("blockedDeeplinkPrompt");
        return null;
    }

    public final void setBlockedDeeplinkPrompt(BlockedExternalDeeplinkPrompt blockedExternalDeeplinkPrompt) {
        Intrinsics.checkNotNullParameter(blockedExternalDeeplinkPrompt, "<set-?>");
        this.blockedDeeplinkPrompt = blockedExternalDeeplinkPrompt;
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
    public final WelcomeDuxo getDuxo() {
        return (WelcomeDuxo) this.duxo.getValue();
    }

    private final boolean getHandledAttribution() {
        return ((Boolean) this.handledAttribution.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    private final void setHandledAttribution(boolean z) {
        this.handledAttribution.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z));
    }

    @Override // com.robinhood.analytics.performance.startup.StartupActivity
    public StartupActivity.Screen getScreen() {
        return StartupActivity.Screen.WELCOME;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenTag() {
        return AnalyticsStrings.MAX_WELCOME_TAG;
    }

    @Override // com.robinhood.android.welcome.WelcomeFragment.Callbacks
    public Flow<WelcomeState> getStateChanges() {
        return getDuxo().getStateFlow();
    }

    @Override // com.robinhood.android.welcome.BaseWelcomeActivity, com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (!getAuthManager().isLoggedIn()) {
            IdlingResourceCounters2.setBusy(IdlingResourceType.WELCOME_REGION_LOADING, true);
        }
        BaseActivity.collectDuxoState$default(this, null, new C314571(null), 1, null);
        if (getAuthManager().isLoggedIn()) {
            if (getBiometricAuthManager().isBiometricsAuthEnabled() || getPinManager().isPinEnabled()) {
                return;
            }
            getDuxo().logNoDeviceSecurityEvent();
            return;
        }
        preloadAnimation();
        WelcomeDuxo duxo = getDuxo();
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        duxo.fetchAttribution(intent);
        setContentView(C11048R.layout.activity_fragment_container);
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, WelcomeLoadingFragment.INSTANCE.newInstance());
        }
    }

    /* compiled from: WelcomeActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.welcome.WelcomeActivity$onCreate$1", m3645f = "WelcomeActivity.kt", m3646l = {77}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.welcome.WelcomeActivity$onCreate$1 */
    static final class C314571 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C314571(Continuation<? super C314571> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WelcomeActivity.this.new C314571(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C314571) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(WelcomeActivity.this.getDuxo().getEventFlow());
                final WelcomeActivity welcomeActivity = WelcomeActivity.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.welcome.WelcomeActivity.onCreate.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Event<WelcomeDuxo3>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(final Event<WelcomeDuxo3> event, Continuation<? super Unit> continuation) {
                        EventConsumer<WelcomeDuxo3> eventConsumerInvoke;
                        EventConsumer<WelcomeDuxo3> eventConsumerInvoke2;
                        EventConsumer<WelcomeDuxo3> eventConsumerInvoke3;
                        final WelcomeActivity welcomeActivity2 = welcomeActivity;
                        if ((event.getData() instanceof WelcomeDuxo3.NavigateTo) && (eventConsumerInvoke3 = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke3.consume(event, new Function1() { // from class: com.robinhood.android.welcome.WelcomeActivity$onCreate$1$1$emit$$inlined$consumeIfType$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m20062invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m20062invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    Navigator.DefaultImpls.startActivity$default(welcomeActivity2.getNavigator(), welcomeActivity2, ((WelcomeDuxo3.NavigateTo) event.getData()).getKey(), null, false, null, null, 60, null);
                                }
                            });
                        }
                        final WelcomeActivity welcomeActivity3 = welcomeActivity;
                        if ((event.getData() instanceof WelcomeDuxo3.NavigateTo) && (eventConsumerInvoke2 = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke2.consume(event, new Function1() { // from class: com.robinhood.android.welcome.WelcomeActivity$onCreate$1$1$emit$$inlined$consumeIfType$2
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m20063invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m20063invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    Navigator.DefaultImpls.startActivity$default(welcomeActivity3.getNavigator(), welcomeActivity3, ((WelcomeDuxo3.NavigateTo) event.getData()).getKey(), null, false, null, null, 60, null);
                                }
                            });
                        }
                        final WelcomeActivity welcomeActivity4 = welcomeActivity;
                        if ((event.getData() instanceof WelcomeDuxo3.RegionLoadingCompleted) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.welcome.WelcomeActivity$onCreate$1$1$emit$$inlined$consumeIfType$3
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m20064invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m20064invoke(Object it) {
                                    Fragment fragmentNewInstance;
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    WelcomeDuxo3.RegionLoadingCompleted regionLoadingCompleted = (WelcomeDuxo3.RegionLoadingCompleted) event.getData();
                                    if (regionLoadingCompleted.isRebrand()) {
                                        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(welcomeActivity4), DayNightOverlay.NIGHT, null, 2, null);
                                    }
                                    WelcomeActivity welcomeActivity5 = welcomeActivity4;
                                    int i2 = C11048R.id.fragment_container;
                                    if (regionLoadingCompleted.isGb()) {
                                        fragmentNewInstance = WelcomeFragmentGb.INSTANCE.newInstance((Parcelable) new WelcomeFragmentGb.Args(regionLoadingCompleted.getSwipeyContent()));
                                    } else if (regionLoadingCompleted.isRebrand()) {
                                        fragmentNewInstance = WelcomeRebrandFragment.INSTANCE.newInstance();
                                    } else {
                                        fragmentNewInstance = WelcomeFragment.INSTANCE.newInstance((Parcelable) new WelcomeFragment.Args(regionLoadingCompleted.getHideSwipey()));
                                    }
                                    welcomeActivity5.setFragment(i2, fragmentNewInstance);
                                    IdlingResourceCounters2.setBusy(IdlingResourceType.WELCOME_REGION_LOADING, false);
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

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStart() {
        super.onStart();
        if (!getHandledAttribution()) {
            setHandledAttribution(true);
            AttributionManager attributionManager = getAttributionManager();
            Intent intent = getIntent();
            Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
            attributionManager.handleAttribution(this, intent);
        }
        if (getAuthManager().isLoggedIn()) {
            Navigator.DefaultImpls.startActivity$default(getNavigator(), this, MainActivityIntentKey.INSTANCE, null, true, null, null, 52, null);
            finish();
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    protected void handleCustomIntent(Intent intent) {
        String string2;
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.handleCustomIntent(intent);
        Bundle extras = intent.getExtras();
        if (extras == null || (string2 = extras.getString(EXTRA_BLOCKED_DEEPLINK_URL)) == null) {
            return;
        }
        getBlockedDeeplinkPrompt().show(this, string2);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, androidx.view.ComponentActivity, android.app.Activity
    @SuppressLint({"MissingSuperCall"})
    protected void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        setIntent(intent);
    }

    @Override // com.robinhood.android.welcome.WelcomeFragment.Callbacks, com.robinhood.android.welcome.rebrand.WelcomeRebrandFragment.Callbacks, com.robinhood.android.welcome.gb.WelcomeFragmentGb.Callbacks
    public void onSignInClicked(String loggingTag) {
        Intrinsics.checkNotNullParameter(loggingTag, "loggingTag");
        getDuxo().onSignInClicked(loggingTag);
    }

    @Override // com.robinhood.android.welcome.WelcomeFragment.Callbacks, com.robinhood.android.welcome.rebrand.WelcomeRebrandFragment.Callbacks, com.robinhood.android.welcome.gb.WelcomeFragmentGb.Callbacks
    public void onSignUpClicked(String loggingTag) {
        Intrinsics.checkNotNullParameter(loggingTag, "loggingTag");
        getDuxo().onSignUpClicked(loggingTag);
    }

    /* compiled from: WelcomeActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/welcome/WelcomeActivity$BlockedExternalDeeplinkIntentResolver;", "Lcom/robinhood/android/navigation/IntentResolver;", "Lcom/robinhood/shared/home/contracts/BlockedExternalLoggedOutDeeplinkIntentKey;", "<init>", "()V", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "key", "feature-welcome_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes9.dex */
    public static final class BlockedExternalDeeplinkIntentResolver implements IntentResolver<BlockedExternalLoggedOutDeeplinkIntentKey> {
        public static final BlockedExternalDeeplinkIntentResolver INSTANCE = new BlockedExternalDeeplinkIntentResolver();

        private BlockedExternalDeeplinkIntentResolver() {
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, BlockedExternalLoggedOutDeeplinkIntentKey key) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(key, "key");
            Intent intent = new Intent(context, (Class<?>) WelcomeActivity.class);
            intent.putExtra(WelcomeActivity.EXTRA_BLOCKED_DEEPLINK_URL, key.getUrl());
            return intent;
        }
    }

    /* compiled from: WelcomeActivity.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/welcome/WelcomeActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolver;", "Lcom/robinhood/shared/user/contracts/WelcomeIntentKey;", "<init>", "()V", "EXTRA_BLOCKED_DEEPLINK_URL", "", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "key", "feature-welcome_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolver<WelcomeIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, WelcomeIntentKey key) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(key, "key");
            Intent intent = new Intent(context, (Class<?>) WelcomeActivity.class);
            intent.addFlags(67108864);
            return intent;
        }
    }
}
