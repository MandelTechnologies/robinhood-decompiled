package com.robinhood.networking;

import com.robinhood.android.lib.utils.NoopInterceptor;
import com.robinhood.networking.annotation.NetworkFixtures;
import com.robinhood.networking.annotation.ReadOnlyTokenEnforcement;
import kotlin.Metadata;
import okhttp3.Interceptor;
import okhttp3.logging.HttpLoggingInterceptor;

/* compiled from: ReleaseNetworkingModule.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\b\u0010\u0006\u001a\u00020\u0007H\u0007J\b\u0010\b\u001a\u00020\u0007H\u0007¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/networking/ReleaseNetworkingModule;", "", "<init>", "()V", "provideLogLevel", "Lokhttp3/logging/HttpLoggingInterceptor$Level;", "provideNetworkFixturesInterceptor", "Lokhttp3/Interceptor;", "provideReadOnlyTokenEnforcementInterceptor", "lib-networking_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class ReleaseNetworkingModule {
    public static final ReleaseNetworkingModule INSTANCE = new ReleaseNetworkingModule();

    private ReleaseNetworkingModule() {
    }

    public final HttpLoggingInterceptor.Level provideLogLevel() {
        return HttpLoggingInterceptor.Level.NONE;
    }

    @NetworkFixtures
    public final Interceptor provideNetworkFixturesInterceptor() {
        return NoopInterceptor.INSTANCE;
    }

    @ReadOnlyTokenEnforcement
    public final Interceptor provideReadOnlyTokenEnforcementInterceptor() {
        return NoopInterceptor.INSTANCE;
    }
}
