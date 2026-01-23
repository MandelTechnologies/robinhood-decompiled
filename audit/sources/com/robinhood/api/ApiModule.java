package com.robinhood.api;

import com.robinhood.api.utils.RealAuthTokenManager;
import com.robinhood.shared.security.auth.token.AuthTokenManager;
import com.robinhood.targetbackend.TargetBackend;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.CipherSuite;
import okhttp3.ConnectionSpec;
import okhttp3.TlsVersion;

/* compiled from: ApiModule.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u001b\u0010\b\u001a\r\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u000b0\t2\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/api/ApiModule;", "", "<init>", "()V", "provideAuthTokenManager", "Lcom/robinhood/shared/security/auth/token/AuthTokenManager;", "authTokenManager", "Lcom/robinhood/api/utils/RealAuthTokenManager;", "provideConnectionSpecs", "", "Lokhttp3/ConnectionSpec;", "Lkotlin/jvm/JvmSuppressWildcards;", "targetBackend", "Lcom/robinhood/targetbackend/TargetBackend;", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class ApiModule {
    public static final ApiModule INSTANCE = new ApiModule();

    public final AuthTokenManager provideAuthTokenManager(RealAuthTokenManager authTokenManager) {
        Intrinsics.checkNotNullParameter(authTokenManager, "authTokenManager");
        return authTokenManager;
    }

    private ApiModule() {
    }

    public final List<ConnectionSpec> provideConnectionSpecs(TargetBackend targetBackend) {
        Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
        ConnectionSpec connectionSpecBuild = new ConnectionSpec.Builder(ConnectionSpec.MODERN_TLS).tlsVersions(TlsVersion.TLS_1_2).cipherSuites((CipherSuite[]) Arrays.copyOf(new CipherSuite[]{CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256}, 3)).build();
        if (Intrinsics.areEqual(targetBackend, TargetBackend.INSTANCE.getPROD())) {
            return CollectionsKt.listOf(connectionSpecBuild);
        }
        return CollectionsKt.listOf((Object[]) new ConnectionSpec[]{connectionSpecBuild, ConnectionSpec.CLEARTEXT});
    }
}
