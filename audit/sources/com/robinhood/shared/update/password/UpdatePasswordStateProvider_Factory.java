package com.robinhood.shared.update.password;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.internal.Factory;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

/* compiled from: UpdatePasswordStateProvider_Factory.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0000H\u0007J\b\u0010\u0007\u001a\u00020\u0002H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/update/password/UpdatePasswordStateProvider_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/update/password/UpdatePasswordStateProvider;", "<init>", "()V", "get", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "newInstance", "feature-update-password_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class UpdatePasswordStateProvider_Factory implements Factory<UpdatePasswordStateProvider> {
    public static final int $stable = 0;
    public static final UpdatePasswordStateProvider_Factory INSTANCE = new UpdatePasswordStateProvider_Factory();

    private UpdatePasswordStateProvider_Factory() {
    }

    @Override // javax.inject.Provider
    public UpdatePasswordStateProvider get() {
        return newInstance();
    }

    @JvmStatic
    public static final UpdatePasswordStateProvider_Factory create() {
        return INSTANCE;
    }

    @JvmStatic
    public static final UpdatePasswordStateProvider newInstance() {
        return new UpdatePasswordStateProvider();
    }
}
