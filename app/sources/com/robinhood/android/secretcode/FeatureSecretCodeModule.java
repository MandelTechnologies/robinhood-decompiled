package com.robinhood.android.secretcode;

import com.robinhood.android.common.util.lifecycle.MainTabActivityListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FeatureSecretCodeModule.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/secretcode/FeatureSecretCodeModule;", "", "<init>", "()V", "provideSecretCodeManagerMainTabActivityListener", "Lcom/robinhood/android/common/util/lifecycle/MainTabActivityListener;", "secretCodeManager", "Lcom/robinhood/android/secretcode/SecretCodeManager;", "feature-secret-code_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class FeatureSecretCodeModule {
    public static final int $stable = 0;
    public static final FeatureSecretCodeModule INSTANCE = new FeatureSecretCodeModule();

    public final MainTabActivityListener provideSecretCodeManagerMainTabActivityListener(SecretCodeManager secretCodeManager) {
        Intrinsics.checkNotNullParameter(secretCodeManager, "secretCodeManager");
        return secretCodeManager;
    }

    private FeatureSecretCodeModule() {
    }
}
