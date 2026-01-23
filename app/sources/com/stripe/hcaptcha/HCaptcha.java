package com.stripe.hcaptcha;

import android.util.AndroidRuntimeException;
import androidx.fragment.app.FragmentActivity;
import com.stripe.hcaptcha.config.HCaptchaConfig;
import com.stripe.hcaptcha.config.HCaptchaInternalConfig;
import com.stripe.hcaptcha.config.HCaptchaSize;
import com.stripe.hcaptcha.task.Task;
import com.stripe.hcaptcha.webview.HCaptchaHeadlessWebView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HCaptcha.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0015B\u0019\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m3636d2 = {"Lcom/stripe/hcaptcha/HCaptcha;", "Lcom/stripe/hcaptcha/task/Task;", "Lcom/stripe/hcaptcha/HCaptchaTokenResponse;", "", "Landroidx/fragment/app/FragmentActivity;", "activity", "Lcom/stripe/hcaptcha/config/HCaptchaInternalConfig;", "internalConfig", "<init>", "(Landroidx/fragment/app/FragmentActivity;Lcom/stripe/hcaptcha/config/HCaptchaInternalConfig;)V", "Lcom/stripe/hcaptcha/config/HCaptchaConfig;", "config", "setup", "(Lcom/stripe/hcaptcha/config/HCaptchaConfig;)Lcom/stripe/hcaptcha/HCaptcha;", "verifyWithHCaptcha", "()Lcom/stripe/hcaptcha/HCaptcha;", "Landroidx/fragment/app/FragmentActivity;", "Lcom/stripe/hcaptcha/config/HCaptchaInternalConfig;", "Lcom/stripe/hcaptcha/IHCaptchaVerifier;", "captchaVerifier", "Lcom/stripe/hcaptcha/IHCaptchaVerifier;", "Companion", "hcaptcha_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class HCaptcha extends Task<HCaptchaTokenResponse> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final FragmentActivity activity;
    private IHCaptchaVerifier captchaVerifier;
    private final HCaptchaInternalConfig internalConfig;

    public /* synthetic */ HCaptcha(FragmentActivity fragmentActivity, HCaptchaInternalConfig hCaptchaInternalConfig, DefaultConstructorMarker defaultConstructorMarker) {
        this(fragmentActivity, hCaptchaInternalConfig);
    }

    private HCaptcha(FragmentActivity fragmentActivity, HCaptchaInternalConfig hCaptchaInternalConfig) {
        this.activity = fragmentActivity;
        this.internalConfig = hCaptchaInternalConfig;
    }

    public HCaptcha setup(final HCaptchaConfig config) {
        HCaptchaStateListener hCaptchaStateListener;
        IHCaptchaVerifier iHCaptchaVerifierNewInstance;
        Intrinsics.checkNotNullParameter(config, "config");
        HCaptchaStateListener hCaptchaStateListener2 = new HCaptchaStateListener(new Function0<Unit>() { // from class: com.stripe.hcaptcha.HCaptcha$setup$listener$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.captchaOpened();
            }
        }, new Function1<String, Unit>() { // from class: com.stripe.hcaptcha.HCaptcha$setup$listener$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke2(str);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(String token) {
                Intrinsics.checkNotNullParameter(token, "token");
                this.this$0.m26983scheduleCaptchaExpiredLRDsOJo(config.getTokenExpiration());
                HCaptcha hCaptcha = this.this$0;
                hCaptcha.setResult(new HCaptchaTokenResponse(token, hCaptcha.getHandler()));
            }
        }, new Function1<HCaptchaException, Unit>() { // from class: com.stripe.hcaptcha.HCaptcha$setup$listener$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(HCaptchaException hCaptchaException) {
                invoke2(hCaptchaException);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(HCaptchaException exception) {
                Intrinsics.checkNotNullParameter(exception, "exception");
                this.this$0.setException(exception);
            }
        });
        try {
            try {
                if (config.getHideDialog()) {
                    try {
                        hCaptchaStateListener = hCaptchaStateListener2;
                        iHCaptchaVerifierNewInstance = new HCaptchaHeadlessWebView(this.activity, HCaptchaConfig.m26978copyZIzw2bI$default(config, null, false, false, false, null, null, null, null, null, null, null, HCaptchaSize.INVISIBLE, null, null, null, null, null, 0L, false, 522235, null), this.internalConfig, hCaptchaStateListener);
                    } catch (AndroidRuntimeException unused) {
                        hCaptchaStateListener = hCaptchaStateListener2;
                        hCaptchaStateListener.getOnFailure().invoke(new HCaptchaException(HCaptchaError.ERROR, null, 2, null));
                        return this;
                    }
                } else {
                    hCaptchaStateListener = hCaptchaStateListener2;
                    iHCaptchaVerifierNewInstance = HCaptchaDialogFragment.INSTANCE.newInstance(config, this.internalConfig, hCaptchaStateListener);
                }
                this.captchaVerifier = iHCaptchaVerifierNewInstance;
                return this;
            } catch (AndroidRuntimeException unused2) {
            }
        } catch (AndroidRuntimeException unused3) {
            hCaptchaStateListener = hCaptchaStateListener2;
        }
    }

    public HCaptcha verifyWithHCaptcha() {
        IHCaptchaVerifier iHCaptchaVerifier = this.captchaVerifier;
        if (iHCaptchaVerifier == null) {
            throw new IllegalStateException("verifyWithHCaptcha must not be called before setup.");
        }
        getHandler().removeCallbacksAndMessages(null);
        iHCaptchaVerifier.startVerification(this.activity);
        return this;
    }

    /* compiled from: HCaptcha.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b¨\u0006\t"}, m3636d2 = {"Lcom/stripe/hcaptcha/HCaptcha$Companion;", "", "()V", "getClient", "Lcom/stripe/hcaptcha/HCaptcha;", "activity", "Landroidx/fragment/app/FragmentActivity;", "internalConfig", "Lcom/stripe/hcaptcha/config/HCaptchaInternalConfig;", "hcaptcha_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ HCaptcha getClient$default(Companion companion, FragmentActivity fragmentActivity, HCaptchaInternalConfig hCaptchaInternalConfig, int i, Object obj) {
            if ((i & 2) != 0) {
                hCaptchaInternalConfig = new HCaptchaInternalConfig(null, 1, null);
            }
            return companion.getClient(fragmentActivity, hCaptchaInternalConfig);
        }

        public final HCaptcha getClient(FragmentActivity activity, HCaptchaInternalConfig internalConfig) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(internalConfig, "internalConfig");
            return new HCaptcha(activity, internalConfig, null);
        }
    }
}
