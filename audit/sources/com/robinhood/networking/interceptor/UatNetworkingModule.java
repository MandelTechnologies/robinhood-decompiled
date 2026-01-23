package com.robinhood.networking.interceptor;

import com.robinhood.android.lib.utils.NoopInterceptor;
import com.robinhood.networking.annotation.Uat;
import kotlin.Metadata;
import okhttp3.Interceptor;

/* compiled from: UatNetworkingModule.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/networking/interceptor/UatNetworkingModule;", "", "<init>", "()V", "provideUatInterceptor", "Lokhttp3/Interceptor;", "lib-networking_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class UatNetworkingModule {
    public static final UatNetworkingModule INSTANCE = new UatNetworkingModule();

    private UatNetworkingModule() {
    }

    @Uat
    public final Interceptor provideUatInterceptor() {
        return NoopInterceptor.INSTANCE;
    }
}
