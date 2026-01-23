package com.stripe.hcaptcha;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.stripe.hcaptcha.config.HCaptchaConfig;
import com.stripe.hcaptcha.config.HCaptchaInternalConfig;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HCaptchaCompat.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\f\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0005*\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0002¢\u0006\u0004\b\f\u0010\rJ;\u0010\u000f\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0005*\u0004\u0018\u00010\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m3636d2 = {"Lcom/stripe/hcaptcha/HCaptchaCompat;", "", "<init>", "()V", "Ljava/io/Serializable;", "T", "Landroid/os/Bundle;", "bundle", "", "key", "Ljava/lang/Class;", "clazz", "getSerializable", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;)Ljava/io/Serializable;", "Landroid/os/Parcelable;", "getParcelable", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;)Landroid/os/Parcelable;", "Lcom/stripe/hcaptcha/config/HCaptchaConfig;", "config", "Lcom/stripe/hcaptcha/config/HCaptchaInternalConfig;", "internalConfig", "Lcom/stripe/hcaptcha/HCaptchaStateListener;", "listener", "storeValues", "(Lcom/stripe/hcaptcha/config/HCaptchaConfig;Lcom/stripe/hcaptcha/config/HCaptchaInternalConfig;Lcom/stripe/hcaptcha/HCaptchaStateListener;)Landroid/os/Bundle;", "getConfig", "(Landroid/os/Bundle;)Lcom/stripe/hcaptcha/config/HCaptchaConfig;", "getInternalConfig", "(Landroid/os/Bundle;)Lcom/stripe/hcaptcha/config/HCaptchaInternalConfig;", "getStateListener", "(Landroid/os/Bundle;)Lcom/stripe/hcaptcha/HCaptchaStateListener;", "hcaptcha_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class HCaptchaCompat {
    public static final HCaptchaCompat INSTANCE = new HCaptchaCompat();

    private HCaptchaCompat() {
    }

    public final Bundle storeValues(HCaptchaConfig config, HCaptchaInternalConfig internalConfig, HCaptchaStateListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(internalConfig, "internalConfig");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Bundle bundle = new Bundle();
        bundle.putSerializable("hCaptchaConfig", config);
        bundle.putSerializable("hCaptchaInternalConfig", internalConfig);
        bundle.putParcelable("hCaptchaDialogListener", listener);
        return bundle;
    }

    public final HCaptchaConfig getConfig(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        return (HCaptchaConfig) getSerializable(bundle, "hCaptchaConfig", HCaptchaConfig.class);
    }

    public final HCaptchaInternalConfig getInternalConfig(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        return (HCaptchaInternalConfig) getSerializable(bundle, "hCaptchaInternalConfig", HCaptchaInternalConfig.class);
    }

    public final HCaptchaStateListener getStateListener(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        return (HCaptchaStateListener) getParcelable(bundle, "hCaptchaDialogListener", HCaptchaStateListener.class);
    }

    private final <T extends Serializable> T getSerializable(Bundle bundle, String key, Class<T> clazz) {
        if (Build.VERSION.SDK_INT >= 33) {
            return (T) bundle.getSerializable(key, clazz);
        }
        return (T) bundle.getSerializable(key);
    }

    private final <T extends Parcelable> T getParcelable(Bundle bundle, String key, Class<T> clazz) {
        if (Build.VERSION.SDK_INT >= 33) {
            return (T) bundle.getParcelable(key, clazz);
        }
        return (T) bundle.getParcelable(key);
    }
}
