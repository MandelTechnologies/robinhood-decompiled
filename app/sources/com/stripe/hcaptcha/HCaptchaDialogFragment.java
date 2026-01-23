package com.stripe.hcaptcha;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.InflateException;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.stripe.hcaptcha.config.HCaptchaConfig;
import com.stripe.hcaptcha.config.HCaptchaInternalConfig;
import com.stripe.hcaptcha.config.HCaptchaSize;
import com.stripe.hcaptcha.webview.HCaptchaWebView;
import com.stripe.hcaptcha.webview.HCaptchaWebViewHelper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: HCaptchaDialogFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000 :2\u00020\u00012\u00020\u0002:\u0001:B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J)\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u0018\u001a\u0004\u0018\u00010\r2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001a\u0010\u0004J\u000f\u0010\u001b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001b\u0010\u0004J\u0017\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0005H\u0016¢\u0006\u0004\b \u0010\u0004J\u000f\u0010!\u001a\u00020\u0005H\u0016¢\u0006\u0004\b!\u0010\u0004J\u0017\u0010$\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u00052\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\u00052\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-R\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00105\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00108\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109¨\u0006;"}, m3636d2 = {"Lcom/stripe/hcaptcha/HCaptchaDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "Lcom/stripe/hcaptcha/IHCaptchaVerifier;", "<init>", "()V", "", "hideLoadingContainer", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Lcom/stripe/hcaptcha/config/HCaptchaConfig;", "config", "Landroid/view/View;", "prepareRootView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lcom/stripe/hcaptcha/config/HCaptchaConfig;)Landroid/view/View;", "rootView", "Lcom/stripe/hcaptcha/webview/HCaptchaWebView;", "prepareWebView", "(Landroid/view/View;Lcom/stripe/hcaptcha/config/HCaptchaConfig;)Lcom/stripe/hcaptcha/webview/HCaptchaWebView;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onDestroy", "onStart", "Landroid/content/DialogInterface;", "dialogInterface", "onCancel", "(Landroid/content/DialogInterface;)V", "onLoaded", "onOpen", "Lcom/stripe/hcaptcha/HCaptchaException;", "exception", "onFailure", "(Lcom/stripe/hcaptcha/HCaptchaException;)V", "", "result", "onSuccess", "(Ljava/lang/String;)V", "Landroidx/fragment/app/FragmentActivity;", "activity", "startVerification", "(Landroidx/fragment/app/FragmentActivity;)V", "Lcom/stripe/hcaptcha/webview/HCaptchaWebViewHelper;", "webViewHelper", "Lcom/stripe/hcaptcha/webview/HCaptchaWebViewHelper;", "Landroid/widget/LinearLayout;", "loadingContainer", "Landroid/widget/LinearLayout;", "", "defaultDimAmount", "F", "", "readyForInteraction", "Z", "Companion", "hcaptcha_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class HCaptchaDialogFragment extends DialogFragment implements IHCaptchaVerifier {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = HCaptchaDialogFragment.class.getSimpleName();
    private float defaultDimAmount = 0.6f;
    private LinearLayout loadingContainer;
    private boolean readyForInteraction;
    private HCaptchaWebViewHelper webViewHelper;

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(2, R$style.StripeHCaptchaDialogTheme);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        HCaptchaStateListener stateListener;
        Function1<HCaptchaException, Unit> onFailure;
        Function1<HCaptchaException, Unit> onFailure2;
        Function1<HCaptchaException, Unit> onFailure3;
        Function1<HCaptchaException, Unit> onFailure4;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        try {
            Bundle arguments = getArguments();
            if (arguments == null) {
                dismiss();
                return null;
            }
            HCaptchaCompat hCaptchaCompat = HCaptchaCompat.INSTANCE;
            stateListener = hCaptchaCompat.getStateListener(arguments);
            try {
                if (stateListener == null) {
                    dismiss();
                    return null;
                }
                HCaptchaConfig config = hCaptchaCompat.getConfig(arguments);
                if (config == null) {
                    dismiss();
                    stateListener.getOnFailure().invoke(new HCaptchaException(HCaptchaError.ERROR, null, 2, null));
                    return null;
                }
                HCaptchaInternalConfig internalConfig = hCaptchaCompat.getInternalConfig(arguments);
                if (internalConfig == null) {
                    dismiss();
                    stateListener.getOnFailure().invoke(new HCaptchaException(HCaptchaError.ERROR, null, 2, null));
                    return null;
                }
                View viewPrepareRootView = prepareRootView(inflater, container, config);
                HCaptchaWebView hCaptchaWebViewPrepareWebView = prepareWebView(viewPrepareRootView, config);
                View viewFindViewById = viewPrepareRootView.findViewById(R$id.loadingContainer);
                ((LinearLayout) viewFindViewById).setVisibility(config.getLoading() ? 0 : 8);
                this.loadingContainer = (LinearLayout) viewFindViewById;
                Handler handler = new Handler(Looper.getMainLooper());
                Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                try {
                    this.webViewHelper = new HCaptchaWebViewHelper(handler, contextRequireContext, config, internalConfig, this, stateListener, hCaptchaWebViewPrepareWebView);
                    this.readyForInteraction = false;
                    return viewPrepareRootView;
                } catch (BadParcelableException unused) {
                    dismiss();
                    if (stateListener != null && (onFailure4 = stateListener.getOnFailure()) != null) {
                        onFailure4.invoke(new HCaptchaException(HCaptchaError.ERROR, null, 2, null));
                    }
                    return null;
                } catch (InflateException unused2) {
                    dismiss();
                    if (stateListener != null && (onFailure3 = stateListener.getOnFailure()) != null) {
                        onFailure3.invoke(new HCaptchaException(HCaptchaError.ERROR, null, 2, null));
                    }
                    return null;
                } catch (AssertionError unused3) {
                    dismiss();
                    if (stateListener != null && (onFailure2 = stateListener.getOnFailure()) != null) {
                        onFailure2.invoke(new HCaptchaException(HCaptchaError.ERROR, null, 2, null));
                    }
                    return null;
                } catch (ClassCastException unused4) {
                    dismiss();
                    if (stateListener != null && (onFailure = stateListener.getOnFailure()) != null) {
                        onFailure.invoke(new HCaptchaException(HCaptchaError.ERROR, null, 2, null));
                    }
                    return null;
                }
            } catch (BadParcelableException unused5) {
            } catch (InflateException unused6) {
            } catch (AssertionError unused7) {
            } catch (ClassCastException unused8) {
            }
        } catch (BadParcelableException unused9) {
            stateListener = null;
        } catch (InflateException unused10) {
            stateListener = null;
        } catch (AssertionError unused11) {
            stateListener = null;
        } catch (ClassCastException unused12) {
            stateListener = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        HCaptchaWebViewHelper hCaptchaWebViewHelper = this.webViewHelper;
        if (hCaptchaWebViewHelper != null) {
            hCaptchaWebViewHelper.destroy();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        Window window = dialog != null ? dialog.getWindow() : null;
        HCaptchaWebViewHelper hCaptchaWebViewHelper = this.webViewHelper;
        if (dialog == null || window == null || hCaptchaWebViewHelper == null) {
            return;
        }
        window.setBackgroundDrawable(new ColorDrawable(0));
        this.defaultDimAmount = window.getAttributes().dimAmount;
        if (hCaptchaWebViewHelper.getConfig().getLoading()) {
            return;
        }
        window.clearFlags(2);
        window.setDimAmount(0.0f);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "dialogInterface");
        super.onCancel(dialogInterface);
        onFailure(new HCaptchaException(HCaptchaError.CHALLENGE_CLOSED, null, 2, null));
    }

    private final void hideLoadingContainer() {
        Window window;
        HCaptchaConfig config;
        HCaptchaWebViewHelper hCaptchaWebViewHelper = this.webViewHelper;
        if (hCaptchaWebViewHelper != null && (config = hCaptchaWebViewHelper.getConfig()) != null && config.getLoading()) {
            final LinearLayout linearLayout = this.loadingContainer;
            if (linearLayout != null) {
                linearLayout.animate().alpha(0.0f).setDuration(200L).setListener(new AnimatorListenerAdapter() { // from class: com.stripe.hcaptcha.HCaptchaDialogFragment$hideLoadingContainer$1$1
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animation) {
                        Intrinsics.checkNotNullParameter(animation, "animation");
                        linearLayout.setVisibility(8);
                    }
                });
                return;
            }
            return;
        }
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.addFlags(2);
        window.setDimAmount(this.defaultDimAmount);
    }

    @Override // com.stripe.hcaptcha.task.OnLoadedListener
    public void onLoaded() {
        HCaptchaConfig config;
        HCaptchaWebViewHelper hCaptchaWebViewHelper = this.webViewHelper;
        if (((hCaptchaWebViewHelper == null || (config = hCaptchaWebViewHelper.getConfig()) == null) ? null : config.getSize()) != HCaptchaSize.INVISIBLE) {
            this.readyForInteraction = true;
            hideLoadingContainer();
        }
    }

    @Override // com.stripe.hcaptcha.task.OnOpenListener
    public void onOpen() {
        HCaptchaStateListener listener;
        HCaptchaConfig config;
        HCaptchaWebViewHelper hCaptchaWebViewHelper = this.webViewHelper;
        if (((hCaptchaWebViewHelper == null || (config = hCaptchaWebViewHelper.getConfig()) == null) ? null : config.getSize()) == HCaptchaSize.INVISIBLE) {
            hideLoadingContainer();
        }
        this.readyForInteraction = true;
        HCaptchaWebViewHelper hCaptchaWebViewHelper2 = this.webViewHelper;
        if (hCaptchaWebViewHelper2 == null || (listener = hCaptchaWebViewHelper2.getListener()) == null) {
            return;
        }
        listener.getOnOpen();
    }

    @Override // com.stripe.hcaptcha.task.OnFailureListener
    public void onFailure(HCaptchaException exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        HCaptchaWebViewHelper hCaptchaWebViewHelper = this.webViewHelper;
        boolean z = false;
        if (hCaptchaWebViewHelper != null && hCaptchaWebViewHelper.shouldRetry(exception)) {
            z = true;
        }
        if (isAdded() && !z) {
            dismissAllowingStateLoss();
        }
        HCaptchaWebViewHelper hCaptchaWebViewHelper2 = this.webViewHelper;
        if (hCaptchaWebViewHelper2 != null) {
            if (z) {
                hCaptchaWebViewHelper2.resetAndExecute();
            } else {
                hCaptchaWebViewHelper2.getListener().getOnFailure().invoke(exception);
            }
        }
    }

    @Override // com.stripe.hcaptcha.task.OnSuccessListener
    public void onSuccess(String result) {
        HCaptchaStateListener listener;
        Function1<String, Unit> onSuccess;
        Intrinsics.checkNotNullParameter(result, "result");
        if (isAdded()) {
            dismissAllowingStateLoss();
        }
        HCaptchaWebViewHelper hCaptchaWebViewHelper = this.webViewHelper;
        if (hCaptchaWebViewHelper == null || (listener = hCaptchaWebViewHelper.getListener()) == null || (onSuccess = listener.getOnSuccess()) == null) {
            return;
        }
        onSuccess.invoke(result);
    }

    @Override // com.stripe.hcaptcha.IHCaptchaVerifier
    public void startVerification(FragmentActivity activity) {
        HCaptchaStateListener listener;
        Function1<HCaptchaException, Unit> onFailure;
        Intrinsics.checkNotNullParameter(activity, "activity");
        FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        String str = TAG;
        Fragment fragmentFindFragmentByTag = supportFragmentManager.findFragmentByTag(str);
        if (fragmentFindFragmentByTag == null || !fragmentFindFragmentByTag.isAdded()) {
            try {
                show(supportFragmentManager, str);
            } catch (IllegalStateException unused) {
                HCaptchaWebViewHelper hCaptchaWebViewHelper = this.webViewHelper;
                if (hCaptchaWebViewHelper == null || (listener = hCaptchaWebViewHelper.getListener()) == null || (onFailure = listener.getOnFailure()) == null) {
                    return;
                }
                onFailure.invoke(new HCaptchaException(HCaptchaError.ERROR, null, 2, null));
            }
        }
    }

    private final View prepareRootView(LayoutInflater inflater, ViewGroup container, final HCaptchaConfig config) {
        View viewInflate = inflater.inflate(R$layout.stripe_hcaptcha_fragment, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        viewInflate.setFocusableInTouchMode(true);
        viewInflate.requestFocus();
        viewInflate.setOnKeyListener(new View.OnKeyListener() { // from class: com.stripe.hcaptcha.HCaptchaDialogFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                return HCaptchaDialogFragment.prepareRootView$lambda$10(this.f$0, config, view, i, keyEvent);
            }
        });
        return viewInflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean prepareRootView$lambda$10(HCaptchaDialogFragment this$0, HCaptchaConfig config, View view, int i, KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(config, "$config");
        if (i == 4 && keyEvent.getAction() == 0) {
            if (!this$0.readyForInteraction && !config.getLoading()) {
                return true;
            }
            HCaptchaWebViewHelper hCaptchaWebViewHelper = this$0.webViewHelper;
            if (hCaptchaWebViewHelper != null) {
                return hCaptchaWebViewHelper.shouldRetry(new HCaptchaException(HCaptchaError.CHALLENGE_CLOSED, null, 2, null));
            }
        }
        return false;
    }

    private final HCaptchaWebView prepareWebView(View rootView, HCaptchaConfig config) {
        HCaptchaWebView hCaptchaWebView = (HCaptchaWebView) rootView.findViewById(R$id.webView);
        if (!config.getLoading()) {
            hCaptchaWebView.setOnTouchListener(new View.OnTouchListener() { // from class: com.stripe.hcaptcha.HCaptchaDialogFragment$$ExternalSyntheticLambda1
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return HCaptchaDialogFragment.prepareWebView$lambda$12(this.f$0, view, motionEvent);
                }
            });
        }
        Intrinsics.checkNotNull(hCaptchaWebView);
        return hCaptchaWebView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean prepareWebView$lambda$12(HCaptchaDialogFragment this$0, View view, MotionEvent motionEvent) {
        FragmentActivity activity;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(view, "view");
        if (!this$0.readyForInteraction && this$0.isAdded() && (activity = this$0.getActivity()) != null) {
            activity.dispatchTouchEvent(motionEvent);
            return true;
        }
        return view.performClick();
    }

    /* compiled from: HCaptchaDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/stripe/hcaptcha/HCaptchaDialogFragment$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "newInstance", "Lcom/stripe/hcaptcha/HCaptchaDialogFragment;", "config", "Lcom/stripe/hcaptcha/config/HCaptchaConfig;", "internalConfig", "Lcom/stripe/hcaptcha/config/HCaptchaInternalConfig;", "listener", "Lcom/stripe/hcaptcha/HCaptchaStateListener;", "hcaptcha_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final HCaptchaDialogFragment newInstance(HCaptchaConfig config, HCaptchaInternalConfig internalConfig, HCaptchaStateListener listener) {
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(internalConfig, "internalConfig");
            Intrinsics.checkNotNullParameter(listener, "listener");
            HCaptchaDialogFragment hCaptchaDialogFragment = new HCaptchaDialogFragment();
            hCaptchaDialogFragment.setArguments(HCaptchaCompat.INSTANCE.storeValues(config, internalConfig, listener));
            return hCaptchaDialogFragment;
        }
    }
}
