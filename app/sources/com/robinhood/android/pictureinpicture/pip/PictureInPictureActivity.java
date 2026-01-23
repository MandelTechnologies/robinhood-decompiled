package com.robinhood.android.pictureinpicture.pip;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.PictureInPictureParams;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.util.Rational;
import androidx.lifecycle.Lifecycle;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.engagement.goldevent.p115ui.C14567xc3739f91;
import com.robinhood.android.eventcontracts.contracts.EcUuidType;
import com.robinhood.android.eventcontracts.contracts.EventDetailRoutingFragmentKey;
import com.robinhood.android.futures.contracts.FuturesDetailFragmentKey;
import com.robinhood.android.indexes.contracts.IndexDetailPageFragmentKey;
import com.robinhood.android.indexes.contracts.IndexDetailPageFragmentKey2;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.app.keys.data.InstrumentDetailSource;
import com.robinhood.android.options.contracts.OptionsDetailPageFragmentKey;
import com.robinhood.android.options.contracts.OptionsDetailPageLaunchMode;
import com.robinhood.android.pictureinpicture.pip.contracts.PictureInPictureKey;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.crypto.contracts.detail.CryptoDetailFragmentKey;
import com.robinhood.shared.pictureinpicture.pipsupport.PictureInPictureStore;
import com.robinhood.shared.security.auth.AuthManager;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import timber.log.Timber;

/* compiled from: PictureInPictureActivity.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 -2\u00020\u0001:\u0001-B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\u0012\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0014J\b\u0010\u001f\u001a\u00020\u001cH\u0014J\b\u0010 \u001a\u00020\u001cH\u0014J\u0018\u0010!\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020$H\u0017J\b\u0010%\u001a\u00020\u001cH\u0002J\b\u0010&\u001a\u00020\u001cH\u0002J\b\u0010'\u001a\u00020\u001cH\u0002J\b\u0010(\u001a\u00020\u001cH\u0002J\b\u0010)\u001a\u00020\u001cH\u0002J\b\u0010*\u001a\u00020\u001cH\u0002J\b\u0010+\u001a\u00020\u001cH\u0002J\b\u0010,\u001a\u00020\u001cH\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0018\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/pictureinpicture/pip/PictureInPictureActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "<init>", "()V", "pipSupportStore", "Lcom/robinhood/shared/pictureinpicture/pipsupport/PictureInPictureStore;", "getPipSupportStore", "()Lcom/robinhood/shared/pictureinpicture/pipsupport/PictureInPictureStore;", "setPipSupportStore", "(Lcom/robinhood/shared/pictureinpicture/pipsupport/PictureInPictureStore;)V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "getAuthManager", "()Lcom/robinhood/shared/security/auth/AuthManager;", "setAuthManager", "(Lcom/robinhood/shared/security/auth/AuthManager;)V", "now", "", "initializedAt", "loggedPipExit", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onDestroy", "onPictureInPictureModeChanged", "isInPictureInPictureMode", "newConfig", "Landroid/content/res/Configuration;", "onPipWindowClosed", "onSmallPipWindowVisible", "onPipWindowMaximized", "closePipActivity", "avoidTransitionAnimations", "preparePip", "logPipEntry", "logPipExit", "Companion", "feature-pip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class PictureInPictureActivity extends BaseActivity {
    public AuthManager authManager;
    public EventLogger eventLogger;
    private long initializedAt;
    private boolean loggedPipExit;
    public PictureInPictureStore pipSupportStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public PictureInPictureActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.initializedAt = now();
    }

    public final PictureInPictureStore getPipSupportStore() {
        PictureInPictureStore pictureInPictureStore = this.pipSupportStore;
        if (pictureInPictureStore != null) {
            return pictureInPictureStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pipSupportStore");
        return null;
    }

    public final void setPipSupportStore(PictureInPictureStore pictureInPictureStore) {
        Intrinsics.checkNotNullParameter(pictureInPictureStore, "<set-?>");
        this.pipSupportStore = pictureInPictureStore;
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

    private final long now() {
        return System.currentTimeMillis();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, PictureInPictureFragment.INSTANCE.newInstance(INSTANCE.getExtras((Activity) this)));
        }
        getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C254841(null));
    }

    /* compiled from: PictureInPictureActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.pictureinpicture.pip.PictureInPictureActivity$onCreate$1", m3645f = "PictureInPictureActivity.kt", m3646l = {80}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.pictureinpicture.pip.PictureInPictureActivity$onCreate$1 */
    static final class C254841 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C254841(Continuation<? super C254841> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PictureInPictureActivity.this.new C254841(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C254841) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: PictureInPictureActivity.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "loggedIn", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.pictureinpicture.pip.PictureInPictureActivity$onCreate$1$1", m3645f = "PictureInPictureActivity.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.pictureinpicture.pip.PictureInPictureActivity$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ PictureInPictureActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(PictureInPictureActivity pictureInPictureActivity, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = pictureInPictureActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (!this.Z$0) {
                    this.this$0.closePipActivity();
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Boolean> loggedInStateFlow = PictureInPictureActivity.this.getAuthManager().getLoggedInStateFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(PictureInPictureActivity.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(loggedInStateFlow, anonymousClass1, this) == coroutine_suspended) {
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

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        try {
            preparePip();
        } catch (Exception unused) {
            closePipActivity();
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        logPipExit();
        super.onDestroy();
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    @SuppressLint({"MissingSuperCall"})
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode, Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        Timber.INSTANCE.mo3350d("onPictureInPictureModeChanged: " + isInPictureInPictureMode + ", newConfig: " + newConfig + ", lifecycle: " + getLifecycle().getState(), new Object[0]);
        if (getLifecycle().getState() == Lifecycle.State.CREATED) {
            onPipWindowClosed();
        } else if (getLifecycle().getState() == Lifecycle.State.STARTED) {
            if (!isInPictureInPictureMode) {
                onPipWindowMaximized();
            } else {
                onSmallPipWindowVisible();
            }
        }
        super.onPictureInPictureModeChanged(isInPictureInPictureMode, newConfig);
    }

    private final void onPipWindowClosed() {
        Timber.INSTANCE.mo3350d("onPipWindowClosed", new Object[0]);
        closePipActivity();
    }

    private final void onSmallPipWindowVisible() {
        Timber.INSTANCE.mo3350d("onSmallPipWindowVisible", new Object[0]);
    }

    private final void onPipWindowMaximized() {
        PictureInPictureActivity pictureInPictureActivity;
        Intent intentCreateIntentForFragment$default;
        Timber.INSTANCE.mo3350d("onPipWindowMaximized", new Object[0]);
        PictureInPictureKey pictureInPictureKey = (PictureInPictureKey) INSTANCE.getExtras((Activity) this);
        if (pictureInPictureKey instanceof PictureInPictureKey.Instrument) {
            intentCreateIntentForFragment$default = Navigator.DefaultImpls.createIntentForFragment$default(getNavigator(), this, new LegacyFragmentKey.EquityInstrumentDetail(((PictureInPictureKey.Instrument) pictureInPictureKey).getInstrumentId(), null, null, InstrumentDetailSource.NONE, false, 22, null), false, false, true, null, false, false, false, false, false, null, false, 8172, null);
            pictureInPictureActivity = this;
        } else if (pictureInPictureKey instanceof PictureInPictureKey.Crypto) {
            pictureInPictureActivity = this;
            intentCreateIntentForFragment$default = Navigator.DefaultImpls.createIntentForFragment$default(getNavigator(), pictureInPictureActivity, new CryptoDetailFragmentKey(((PictureInPictureKey.Crypto) pictureInPictureKey).getCurrencyPairId(), null, false, null, null, null, 62, null), false, false, false, null, false, false, false, false, false, null, false, 8172, null);
        } else if (pictureInPictureKey instanceof PictureInPictureKey.FuturesOutright) {
            pictureInPictureActivity = this;
            intentCreateIntentForFragment$default = Navigator.DefaultImpls.createIntentForFragment$default(getNavigator(), pictureInPictureActivity, new FuturesDetailFragmentKey.ByContractId(((PictureInPictureKey.FuturesOutright) pictureInPictureKey).getContractId(), null, null, 6, null), false, false, true, null, false, false, false, false, false, null, false, 8172, null);
        } else if (pictureInPictureKey instanceof PictureInPictureKey.Event) {
            pictureInPictureActivity = this;
            intentCreateIntentForFragment$default = Navigator.DefaultImpls.createIntentForFragment$default(getNavigator(), pictureInPictureActivity, new EventDetailRoutingFragmentKey(((PictureInPictureKey.Event) pictureInPictureKey).getEventId(), EcUuidType.EVENT_ID, "ec_pip_chart", false, 8, null), false, false, true, null, false, false, false, false, false, null, false, 8172, null);
        } else if (pictureInPictureKey instanceof PictureInPictureKey.Option) {
            PictureInPictureKey.Option option = (PictureInPictureKey.Option) pictureInPictureKey;
            pictureInPictureActivity = this;
            intentCreateIntentForFragment$default = Navigator.DefaultImpls.createIntentForFragment$default(getNavigator(), pictureInPictureActivity, new OptionsDetailPageFragmentKey(new OptionsDetailPageLaunchMode.StrategyCode(option.getStrategyCode(), option.isLegContext(), CollectionsKt.listOf(option.getStrategyCode()), option.getAccountNumber(), null, 16, null)), false, false, true, null, false, false, false, false, false, null, false, 8172, null);
        } else {
            if (!(pictureInPictureKey instanceof PictureInPictureKey.Index)) {
                throw new NoWhenBranchMatchedException();
            }
            PictureInPictureKey.Index index = (PictureInPictureKey.Index) pictureInPictureKey;
            pictureInPictureActivity = this;
            intentCreateIntentForFragment$default = Navigator.DefaultImpls.createIntentForFragment$default(getNavigator(), pictureInPictureActivity, new IndexDetailPageFragmentKey(index.getInstrumentIndexId(), index.getAccountNumber(), IndexDetailPageFragmentKey2.Pip.INSTANCE), false, false, true, null, false, false, false, false, false, null, false, 8172, null);
        }
        intentCreateIntentForFragment$default.addFlags(335544320);
        try {
            pictureInPictureActivity.startActivity(intentCreateIntentForFragment$default);
            pictureInPictureActivity.avoidTransitionAnimations();
        } catch (Exception unused) {
        } finally {
            pictureInPictureActivity.closePipActivity();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void closePipActivity() {
        Timber.INSTANCE.mo3350d("closePipActivity", new Object[0]);
        logPipExit();
        finishAffinity();
    }

    private final void avoidTransitionAnimations() {
        if (Build.VERSION.SDK_INT >= 34) {
            overrideActivityTransition(0, 0, 0);
            overrideActivityTransition(1, 0, 0);
        } else {
            overridePendingTransition(0, 0);
        }
    }

    private final void preparePip() {
        int i;
        logPipEntry();
        if (isInPictureInPictureMode()) {
            Timber.INSTANCE.mo3359v("Already in PIP mode.", new Object[0]);
        }
        if (!getPipSupportStore().deviceSupportsPip() || (i = Build.VERSION.SDK_INT) < 26 || !getLifecycle().getState().isAtLeast(Lifecycle.State.STARTED)) {
            closePipActivity();
            return;
        }
        Timber.INSTANCE.mo3350d("preparePip", new Object[0]);
        PictureInPictureParams.Builder aspectRatio = C14567xc3739f91.m1947m().setAspectRatio(new Rational(9, 16));
        if (i >= 31) {
            aspectRatio.setSeamlessResizeEnabled(false);
        }
        if (i >= 31) {
            aspectRatio.setAutoEnterEnabled(true);
        }
        PictureInPictureParams pictureInPictureParamsBuild = aspectRatio.build();
        setPictureInPictureParams(pictureInPictureParamsBuild);
        enterPictureInPictureMode(pictureInPictureParamsBuild);
    }

    private final void logPipEntry() {
        this.initializedAt = now();
        EventLogger.DefaultImpls.logUserInteractionEvent$default(getEventLogger(), new UserInteractionEventData(null, null, new Component(null, "PIP_LIVE_FOLLOWING_START", null, 5, null), null, new Context(0, 0, 0, null, null, null, null, null, 0, null, ((PictureInPictureKey) INSTANCE.getExtras((Activity) this)).getEntrypointIdentifier(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -1, -1, -1, 16383, null), null, null, 107, null), false, false, 6, null);
    }

    private final void logPipExit() {
        if (this.loggedPipExit) {
            return;
        }
        long jNow = now() - this.initializedAt;
        EventLogger.DefaultImpls.logUserInteractionEvent$default(getEventLogger(), new UserInteractionEventData(null, null, new Component(null, "PIP_LIVE_FOLLOWING_END", null, 5, null), null, new Context(0, 0, 0, null, null, null, null, null, (int) jNow, null, ((PictureInPictureKey) INSTANCE.getExtras((Activity) this)).getEntrypointIdentifier(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1281, -1, -1, -1, -1, -1, 16383, null), null, null, 107, null), false, false, 6, null);
        this.loggedPipExit = true;
    }

    /* compiled from: PictureInPictureActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/pictureinpicture/pip/PictureInPictureActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/pictureinpicture/pip/PictureInPictureActivity;", "Lcom/robinhood/android/pictureinpicture/pip/contracts/PictureInPictureKey;", "<init>", "()V", "feature-pip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<PictureInPictureActivity, PictureInPictureKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public PictureInPictureKey getExtras(PictureInPictureActivity pictureInPictureActivity) {
            return (PictureInPictureKey) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, pictureInPictureActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(android.content.Context context, PictureInPictureKey pictureInPictureKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, pictureInPictureKey);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(android.content.Context context, PictureInPictureKey pictureInPictureKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, pictureInPictureKey);
        }
    }
}
