package com.robinhood.android.authlock.p064di;

import android.content.Context;
import androidx.credentials.CredentialManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CredentialManagerModule.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/authlock/di/CredentialManagerModule;", "", "<init>", "()V", "provideCredentialManager", "Landroidx/credentials/CredentialManager;", "context", "Landroid/content/Context;", "lib-auth-lock_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class CredentialManagerModule {
    public static final int $stable = 0;
    public static final CredentialManagerModule INSTANCE = new CredentialManagerModule();

    private CredentialManagerModule() {
    }

    public final CredentialManager provideCredentialManager(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return CredentialManager.INSTANCE.create(context);
    }
}
