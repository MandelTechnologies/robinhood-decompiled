package com.robinhood.shared.login.lockscreen;

import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.jakewharton.rxbinding3.widget.RxTextView;
import com.robinhood.android.authlock.pin.PinManager;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.DotIndicators;
import com.robinhood.android.common.util.AnimationUtils;
import com.robinhood.android.designsystem.style.p099di.LockscreenScarletOverlay;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.plt.contract.PltZeroLoadingScreen;
import com.robinhood.android.util.LockscreenManager;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletOverlay;
import com.robinhood.shared.login.C39089R;
import com.robinhood.shared.login.databinding.FragmentSetPinBinding;
import com.robinhood.shared.login.lockscreen.SetPinFragment;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import io.reactivex.Observable;
import io.reactivex.functions.Predicate;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: SetPinFragment.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 02\u00020\u00012\u00020\u0002:\u0002/0B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016J\u001a\u0010&\u001a\u00020#2\u0006\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u0010+\u001a\u00020#H\u0016J\b\u0010,\u001a\u00020#H\u0016J\b\u0010-\u001a\u00020#H\u0016J\b\u0010.\u001a\u00020#H\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\n\u001a\u0004\b\u001f\u0010 ¨\u00061"}, m3636d2 = {"Lcom/robinhood/shared/login/lockscreen/SetPinFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/plt/contract/PltZeroLoadingScreen;", "<init>", "()V", "binding", "Lcom/robinhood/shared/login/databinding/FragmentSetPinBinding;", "getBinding", "()Lcom/robinhood/shared/login/databinding/FragmentSetPinBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "pinManager", "Lcom/robinhood/android/authlock/pin/PinManager;", "getPinManager", "()Lcom/robinhood/android/authlock/pin/PinManager;", "setPinManager", "(Lcom/robinhood/android/authlock/pin/PinManager;)V", "lockscreenManager", "Lcom/robinhood/android/util/LockscreenManager;", "getLockscreenManager", "()Lcom/robinhood/android/util/LockscreenManager;", "setLockscreenManager", "(Lcom/robinhood/android/util/LockscreenManager;)V", "lockscreenOverlay", "Lcom/robinhood/scarlet/ScarletOverlay;", "getLockscreenOverlay", "()Lcom/robinhood/scarlet/ScarletOverlay;", "setLockscreenOverlay", "(Lcom/robinhood/scarlet/ScarletOverlay;)V", "callbacks", "Lcom/robinhood/shared/login/lockscreen/SetPinFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/shared/login/lockscreen/SetPinFragment$Callbacks;", "callbacks$delegate", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onResume", "onStop", "refreshHeader", "Callbacks", "Companion", "feature-login_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class SetPinFragment extends BaseFragment implements PltZeroLoadingScreen {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    public LockscreenManager lockscreenManager;

    @LockscreenScarletOverlay
    public ScarletOverlay lockscreenOverlay;
    public PinManager pinManager;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SetPinFragment.class, "binding", "getBinding()Lcom/robinhood/shared/login/databinding/FragmentSetPinBinding;", 0)), Reflection.property1(new PropertyReference1Impl(SetPinFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/shared/login/lockscreen/SetPinFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: SetPinFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/shared/login/lockscreen/SetPinFragment$Callbacks;", "", "onAuthenticated", "", "feature-login_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onAuthenticated();
    }

    @JvmStatic
    public static final SetPinFragment newInstance() {
        return INSTANCE.newInstance();
    }

    public SetPinFragment() {
        super(C39089R.layout.fragment_set_pin);
        this.binding = ViewBinding5.viewBinding(this, SetPinFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.shared.login.lockscreen.SetPinFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof SetPinFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentSetPinBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentSetPinBinding) value;
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

    public final LockscreenManager getLockscreenManager() {
        LockscreenManager lockscreenManager = this.lockscreenManager;
        if (lockscreenManager != null) {
            return lockscreenManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("lockscreenManager");
        return null;
    }

    public final void setLockscreenManager(LockscreenManager lockscreenManager) {
        Intrinsics.checkNotNullParameter(lockscreenManager, "<set-?>");
        this.lockscreenManager = lockscreenManager;
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

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        if (!(context instanceof Callbacks)) {
            throw new IllegalArgumentException((context + " must implement " + Callbacks.class.getName()).toString());
        }
        setScarletContextWrapper(new ScarletContextWrapper(context, null, getLockscreenOverlay().getStyleReference(), 2, null));
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26684getVerticalXedK2Rk());
        LifecycleHost.DefaultImpls.bind$default(this, getBinding().numpad.getKeyEvents(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.login.lockscreen.SetPinFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SetPinFragment.onViewCreated$lambda$0(this.f$0, (KeyEvent) obj);
            }
        });
        EditText inputEdt = getBinding().inputEdt;
        Intrinsics.checkNotNullExpressionValue(inputEdt, "inputEdt");
        Observable<CharSequence> observableFilter = RxTextView.textChanges(inputEdt).skip(1L).filter(new Predicate() { // from class: com.robinhood.shared.login.lockscreen.SetPinFragment.onViewCreated.2
            @Override // io.reactivex.functions.Predicate
            public final boolean test(CharSequence t) {
                Intrinsics.checkNotNullParameter(t, "t");
                int length = t.length();
                SetPinFragment.this.getBinding().pinbar.setNumActivated(length);
                return length == 4;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFilter, "filter(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableFilter, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.login.lockscreen.SetPinFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SetPinFragment.onViewCreated$lambda$3(this.f$0, (CharSequence) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(SetPinFragment setPinFragment, KeyEvent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        setPinFragment.getBinding().inputEdt.dispatchKeyEvent(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3(final SetPinFragment setPinFragment, CharSequence charSequence) {
        String string2 = charSequence.toString();
        if (!setPinFragment.getPinManager().isTentativePinSet()) {
            setPinFragment.getPinManager().setTentativePin(string2);
            EditText inputEdt = setPinFragment.getBinding().inputEdt;
            Intrinsics.checkNotNullExpressionValue(inputEdt, "inputEdt");
            inputEdt.postDelayed(new Runnable() { // from class: com.robinhood.shared.login.lockscreen.SetPinFragment$onViewCreated$lambda$3$$inlined$postDelayed$1
                @Override // java.lang.Runnable
                public final void run() {
                    this.this$0.getBinding().inputEdt.setText("");
                }
            }, 100L);
        } else if (!setPinFragment.getPinManager().verifyTentativePin(string2)) {
            AnimationUtils animationUtils = AnimationUtils.INSTANCE;
            DotIndicators pinbar = setPinFragment.getBinding().pinbar;
            Intrinsics.checkNotNullExpressionValue(pinbar, "pinbar");
            AnimationUtils.animateErrorShake$default(animationUtils, pinbar, 0L, 0.0f, 3, null);
            EditText inputEdt2 = setPinFragment.getBinding().inputEdt;
            Intrinsics.checkNotNullExpressionValue(inputEdt2, "inputEdt");
            inputEdt2.postDelayed(new Runnable() { // from class: com.robinhood.shared.login.lockscreen.SetPinFragment$onViewCreated$lambda$3$$inlined$postDelayed$2
                @Override // java.lang.Runnable
                public final void run() {
                    this.this$0.getBinding().inputEdt.setText("");
                }
            }, 100L);
        } else {
            setPinFragment.getLockscreenManager().unlock();
            setPinFragment.getCallbacks().onAuthenticated();
            setPinFragment.getBinding().pinMainHeader.setVisibility(4);
        }
        setPinFragment.refreshHeader();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        getScarletManager().putOverlay(getLockscreenOverlay(), Boolean.FALSE);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        refreshHeader();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        getScarletManager().removeOverlay(getLockscreenOverlay().getPriority(), Boolean.FALSE);
    }

    private final void refreshHeader() {
        int i;
        RhTextView rhTextView = getBinding().pinMainHeader;
        if (getPinManager().isTentativePinSet()) {
            i = C39089R.string.auth_pin_verify_pin_prompt;
        } else {
            i = C39089R.string.auth_pin_set_pin_prompt;
        }
        rhTextView.setText(i);
    }

    /* compiled from: SetPinFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/login/lockscreen/SetPinFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/robinhood/shared/login/lockscreen/SetPinFragment;", "feature-login_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final SetPinFragment newInstance() {
            return new SetPinFragment();
        }
    }
}
