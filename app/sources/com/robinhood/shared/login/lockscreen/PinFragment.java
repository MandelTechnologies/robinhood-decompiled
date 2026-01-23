package com.robinhood.shared.login.lockscreen;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.jakewharton.rxbinding3.widget.RxTextView;
import com.robinhood.android.authlock.pin.PinManager;
import com.robinhood.android.authlock.prefs.BiometricsChangedPref;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.DotIndicators;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.AnimationUtils;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.designsystem.style.p099di.BrandLogo;
import com.robinhood.android.designsystem.style.p099di.LockscreenScarletOverlay;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.plt.contract.PltZeroLoadingScreen;
import com.robinhood.android.util.LockscreenManager;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.prefs.StringPreference;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletOverlay;
import com.robinhood.scarlet.util.resource.DirectResourceReference;
import com.robinhood.shared.login.C39089R;
import com.robinhood.shared.login.databinding.FragmentPinBinding;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.shared.user.contracts.auth.AuthenticationCallbacks;
import com.robinhood.shared.user.contracts.auth.AuthenticationCallbacks2;
import com.robinhood.shared.user.contracts.auth.PinFragmentKey;
import com.robinhood.utils.data.LogoutType;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import dagger.Lazy;
import io.reactivex.Observable;
import io.reactivex.functions.Predicate;
import java.util.NoSuchElementException;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: PinFragment.kt */
@Metadata(m3635d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 E2\u00020\u00012\u00020\u0002:\u0001EB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=H\u0016J\u001a\u0010>\u001a\u00020;2\u0006\u0010?\u001a\u00020@2\b\u0010A\u001a\u0004\u0018\u00010BH\u0016J\b\u0010C\u001a\u00020;H\u0016J\b\u0010D\u001a\u00020;H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001e\u001a\u00020\u001f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001e\u0010+\u001a\u00020,8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001b\u00101\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u0010\n\u001a\u0004\b3\u00104R\u0014\u00106\u001a\u000207X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b8\u00109¨\u0006F"}, m3636d2 = {"Lcom/robinhood/shared/login/lockscreen/PinFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/plt/contract/PltZeroLoadingScreen;", "<init>", "()V", "binding", "Lcom/robinhood/shared/login/databinding/FragmentPinBinding;", "getBinding", "()Lcom/robinhood/shared/login/databinding/FragmentPinBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/shared/login/lockscreen/PinDuxo;", "getDuxo", "()Lcom/robinhood/shared/login/lockscreen/PinDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "pinManager", "Lcom/robinhood/android/authlock/pin/PinManager;", "getPinManager", "()Lcom/robinhood/android/authlock/pin/PinManager;", "setPinManager", "(Lcom/robinhood/android/authlock/pin/PinManager;)V", "authManagerLazy", "Ldagger/Lazy;", "Lcom/robinhood/shared/security/auth/AuthManager;", "getAuthManagerLazy", "()Ldagger/Lazy;", "setAuthManagerLazy", "(Ldagger/Lazy;)V", "lockscreenOverlay", "Lcom/robinhood/scarlet/ScarletOverlay;", "getLockscreenOverlay", "()Lcom/robinhood/scarlet/ScarletOverlay;", "setLockscreenOverlay", "(Lcom/robinhood/scarlet/ScarletOverlay;)V", "brandLogo", "Lcom/robinhood/scarlet/util/resource/DirectResourceReference;", "Landroid/graphics/drawable/Drawable;", "getBrandLogo", "()Lcom/robinhood/scarlet/util/resource/DirectResourceReference;", "setBrandLogo", "(Lcom/robinhood/scarlet/util/resource/DirectResourceReference;)V", "biometricsChangedPref", "Lcom/robinhood/prefs/StringPreference;", "getBiometricsChangedPref", "()Lcom/robinhood/prefs/StringPreference;", "setBiometricsChangedPref", "(Lcom/robinhood/prefs/StringPreference;)V", "callbacks", "Lcom/robinhood/shared/user/contracts/auth/AuthenticationCallbacks;", "getCallbacks", "()Lcom/robinhood/shared/user/contracts/auth/AuthenticationCallbacks;", "callbacks$delegate", "toolbarVisible", "", "getToolbarVisible", "()Z", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onStop", "Companion", "feature-login_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class PinFragment extends BaseFragment implements PltZeroLoadingScreen {
    public Lazy<AuthManager> authManagerLazy;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    @BiometricsChangedPref
    public StringPreference biometricsChangedPref;

    @BrandLogo
    public DirectResourceReference<Drawable> brandLogo;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy duxo;

    @LockscreenScarletOverlay
    public ScarletOverlay lockscreenOverlay;
    public PinManager pinManager;
    private final boolean toolbarVisible;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(PinFragment.class, "binding", "getBinding()Lcom/robinhood/shared/login/databinding/FragmentPinBinding;", 0)), Reflection.property1(new PropertyReference1Impl(PinFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/shared/user/contracts/auth/AuthenticationCallbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public PinFragment() {
        super(C39089R.layout.fragment_pin);
        this.binding = ViewBinding5.viewBinding(this, PinFragment2.INSTANCE);
        this.duxo = DuxosKt.duxo(this, PinDuxo.class);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(AuthenticationCallbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.shared.login.lockscreen.PinFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof AuthenticationCallbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentPinBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentPinBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PinDuxo getDuxo() {
        return (PinDuxo) this.duxo.getValue();
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

    public final Lazy<AuthManager> getAuthManagerLazy() {
        Lazy<AuthManager> lazy = this.authManagerLazy;
        if (lazy != null) {
            return lazy;
        }
        Intrinsics.throwUninitializedPropertyAccessException("authManagerLazy");
        return null;
    }

    public final void setAuthManagerLazy(Lazy<AuthManager> lazy) {
        Intrinsics.checkNotNullParameter(lazy, "<set-?>");
        this.authManagerLazy = lazy;
    }

    public final ScarletOverlay getLockscreenOverlay() {
        ScarletOverlay scarletOverlay = this.lockscreenOverlay;
        if (scarletOverlay != null) {
            return scarletOverlay;
        }
        Intrinsics.throwUninitializedPropertyAccessException("lockscreenOverlay");
        return null;
    }

    public final void setLockscreenOverlay(ScarletOverlay scarletOverlay) {
        Intrinsics.checkNotNullParameter(scarletOverlay, "<set-?>");
        this.lockscreenOverlay = scarletOverlay;
    }

    public final DirectResourceReference<Drawable> getBrandLogo() {
        DirectResourceReference<Drawable> directResourceReference = this.brandLogo;
        if (directResourceReference != null) {
            return directResourceReference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("brandLogo");
        return null;
    }

    public final void setBrandLogo(DirectResourceReference<Drawable> directResourceReference) {
        Intrinsics.checkNotNullParameter(directResourceReference, "<set-?>");
        this.brandLogo = directResourceReference;
    }

    public final StringPreference getBiometricsChangedPref() {
        StringPreference stringPreference = this.biometricsChangedPref;
        if (stringPreference != null) {
            return stringPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("biometricsChangedPref");
        return null;
    }

    public final void setBiometricsChangedPref(StringPreference stringPreference) {
        Intrinsics.checkNotNullParameter(stringPreference, "<set-?>");
        this.biometricsChangedPref = stringPreference;
    }

    private final AuthenticationCallbacks getCallbacks() {
        return (AuthenticationCallbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        if (!(context instanceof LockscreenActivity)) {
            throw new IllegalArgumentException((context + " must implement " + LockscreenActivity.class.getName()).toString());
        }
        setScarletContextWrapper(new ScarletContextWrapper(context, null, getLockscreenOverlay().getStyleReference(), 2, null));
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26684getVerticalXedK2Rk());
        BaseFragment.collectDuxoState$default(this, null, new C391331(null), 1, null);
        getBinding().robinhoodLogo.setImageResource(getBrandLogo().getResId());
        LifecycleHost.DefaultImpls.bind$default(this, getBinding().numpad.getKeyEvents(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.login.lockscreen.PinFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PinFragment.onViewCreated$lambda$0(this.f$0, (KeyEvent) obj);
            }
        });
        EditText inputEdt = getBinding().inputEdt;
        Intrinsics.checkNotNullExpressionValue(inputEdt, "inputEdt");
        Observable<CharSequence> observableFilter = RxTextView.textChanges(inputEdt).skip(1L).filter(new Predicate() { // from class: com.robinhood.shared.login.lockscreen.PinFragment.onViewCreated.3
            @Override // io.reactivex.functions.Predicate
            public final boolean test(CharSequence t) {
                Intrinsics.checkNotNullParameter(t, "t");
                PinFragment.this.getBinding().pinbar.setNumActivated(t.length());
                return t.length() == 4;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFilter, "filter(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableFilter, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.login.lockscreen.PinFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PinFragment.onViewCreated$lambda$2(this.f$0, (CharSequence) obj);
            }
        });
        RdsTextButton forgotPinCta = getBinding().forgotPinCta;
        Intrinsics.checkNotNullExpressionValue(forgotPinCta, "forgotPinCta");
        OnClickListeners.onClick(forgotPinCta, new Function0() { // from class: com.robinhood.shared.login.lockscreen.PinFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PinFragment.onViewCreated$lambda$3(this.f$0);
            }
        });
    }

    /* compiled from: PinFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.login.lockscreen.PinFragment$onViewCreated$1", m3645f = "PinFragment.kt", m3646l = {69}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.login.lockscreen.PinFragment$onViewCreated$1 */
    static final class C391331 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C391331(Continuation<? super C391331> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PinFragment.this.new C391331(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C391331) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<PinViewState> stateFlow = PinFragment.this.getDuxo().getStateFlow();
                final PinFragment pinFragment = PinFragment.this;
                FlowCollector<? super PinViewState> flowCollector = new FlowCollector() { // from class: com.robinhood.shared.login.lockscreen.PinFragment.onViewCreated.1.1
                    public final Object emit(PinViewState pinViewState, Continuation<? super Unit> continuation) {
                        RdsTextButton forgotPinCta = pinFragment.getBinding().forgotPinCta;
                        Intrinsics.checkNotNullExpressionValue(forgotPinCta, "forgotPinCta");
                        forgotPinCta.setVisibility(pinViewState.getShowForgotPin() ? 0 : 8);
                        return Unit.INSTANCE;
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((PinViewState) obj2, (Continuation<? super Unit>) continuation);
                    }
                };
                this.label = 1;
                if (stateFlow.collect(flowCollector, this) == coroutine_suspended) {
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
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(PinFragment pinFragment, KeyEvent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        pinFragment.getBinding().inputEdt.dispatchKeyEvent(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2(final PinFragment pinFragment, CharSequence charSequence) {
        if (pinFragment.getPinManager().unlock(charSequence.toString())) {
            pinFragment.getCallbacks().onAuthenticated(AuthenticationCallbacks2.PIN);
        } else {
            pinFragment.getCallbacks().onAuthenticationFailed(AuthenticationCallbacks2.PIN);
            if (pinFragment.getPinManager().canTryAgain()) {
                AnimationUtils animationUtils = AnimationUtils.INSTANCE;
                DotIndicators pinbar = pinFragment.getBinding().pinbar;
                Intrinsics.checkNotNullExpressionValue(pinbar, "pinbar");
                AnimationUtils.animateErrorShake$default(animationUtils, pinbar, 0L, 0.0f, 3, null);
                EditText inputEdt = pinFragment.getBinding().inputEdt;
                Intrinsics.checkNotNullExpressionValue(inputEdt, "inputEdt");
                inputEdt.postDelayed(new Runnable() { // from class: com.robinhood.shared.login.lockscreen.PinFragment$onViewCreated$lambda$2$$inlined$postDelayed$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.this$0.getBinding().inputEdt.setText("");
                    }
                }, 100L);
            } else {
                pinFragment.getBiometricsChangedPref().set(LockscreenManager.SECURITY_CONFIG_BIOMETRICS);
                Toast.makeText(pinFragment.getActivity(), C39089R.string.auth_pin_error_limit_exceeded, 1).show();
                AuthManager authManager = pinFragment.getAuthManagerLazy().get();
                Context contextRequireContext = pinFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                AuthManager.DefaultImpls.initiateLogout$default(authManager, contextRequireContext, LogoutType.OTHER, null, false, null, "pin_too_many_attempts", 28, null);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3(PinFragment pinFragment) {
        ForgotPinDialogFragment forgotPinDialogFragment = (ForgotPinDialogFragment) ForgotPinDialogFragment.INSTANCE.newInstance();
        FragmentManager childFragmentManager = pinFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        forgotPinDialogFragment.show(childFragmentManager, "forgot-pin-dialog");
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        getScarletManager().putOverlay(getLockscreenOverlay(), Boolean.FALSE);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        getScarletManager().removeOverlay(getLockscreenOverlay().getPriority(), Boolean.FALSE);
    }

    /* compiled from: PinFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/login/lockscreen/PinFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolver;", "Lcom/robinhood/shared/user/contracts/auth/PinFragmentKey;", "<init>", "()V", "createFragment", "Lcom/robinhood/shared/login/lockscreen/PinFragment;", "key", "feature-login_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolver<PinFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public PinFragment createFragment(PinFragmentKey key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return new PinFragment();
        }
    }
}
