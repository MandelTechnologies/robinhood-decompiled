package com.robinhood.networking;

import com.robinhood.android.lib.utils.NoopInterceptor;
import com.robinhood.networking.annotation.FlipperOkhttp;
import com.robinhood.networking.annotation.NetworkInterceptors;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import okhttp3.Interceptor;

/* compiled from: ExternalReleaseNetworkingModule.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007J\b\u0010\u0007\u001a\u00020\u0006H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/networking/ExternalReleaseNetworkingModule;", "", "<init>", "()V", "provideNetworkInterceptors", "", "Lokhttp3/Interceptor;", "provideFlipperOkHttpInterceptor", "lib-networking_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes22.dex */
public final class ExternalReleaseNetworkingModule {
    public static final ExternalReleaseNetworkingModule INSTANCE = new ExternalReleaseNetworkingModule();

    private ExternalReleaseNetworkingModule() {
    }

    @NetworkInterceptors
    public final List<Interceptor> provideNetworkInterceptors() {
        return CollectionsKt.emptyList();
    }

    @FlipperOkhttp
    public final Interceptor provideFlipperOkHttpInterceptor() {
        return NoopInterceptor.INSTANCE;
    }
}
