package com.salesforce.android.smi.remote.internal.api.authorization;

import com.robinhood.android.common.util.TransitionReason;
import com.salesforce.android.smi.common.api.Result;
import com.salesforce.android.smi.network.data.domain.auth.Auth;
import com.salesforce.android.smi.remote.internal.api.AbstractInterceptor;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* compiled from: AuthorizationInterceptor.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\t¨\u0006\u0014"}, m3636d2 = {"Lcom/salesforce/android/smi/remote/internal/api/authorization/AuthorizationInterceptor;", "Lcom/salesforce/android/smi/remote/internal/api/AbstractInterceptor;", "authorizationService", "Lcom/salesforce/android/smi/remote/internal/api/authorization/AuthorizationService;", "<init>", "(Lcom/salesforce/android/smi/remote/internal/api/authorization/AuthorizationService;)V", "logger", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "Ljava/util/logging/Logger;", "intercept", "Lokhttp3/Response;", TransitionReason.OPTION_TRADE_CHAIN, "Lokhttp3/Interceptor$Chain;", "addAuthorizationHeader", "Lokhttp3/Request;", "originalRequest", "auth", "Lcom/salesforce/android/smi/network/data/domain/auth/Auth;", "Companion", "remote_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class AuthorizationInterceptor extends AbstractInterceptor {
    private static final String TAG = AuthorizationInterceptor.class.getName();
    private final AuthorizationService authorizationService;
    private final Logger logger;

    public AuthorizationInterceptor(AuthorizationService authorizationService) {
        Intrinsics.checkNotNullParameter(authorizationService, "authorizationService");
        this.authorizationService = authorizationService;
        this.logger = Logger.getLogger(TAG);
    }

    @Override // com.salesforce.android.smi.remote.internal.api.AbstractInterceptor, okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Result<?> result;
        Result result2;
        Intrinsics.checkNotNullParameter(chain, "chain");
        Request request = chain.request();
        synchronized (this) {
            result = (Result) BuildersKt__BuildersKt.runBlocking$default(null, new AuthorizationInterceptor2(this, null), 1, null);
        }
        if (!(result instanceof Result.Success)) {
            return createSynthetic400Response(result, request);
        }
        Response responseProceed = chain.proceed(addAuthorizationHeader(request, (Auth) ((Result.Success) result).getData()));
        if (responseProceed.getCode() != 401 && responseProceed.getCode() != 423) {
            return responseProceed;
        }
        responseProceed.close();
        this.logger.log(Level.INFO, "Re-authorization: statusCode " + responseProceed.getCode());
        synchronized (this) {
            result2 = (Result) BuildersKt__BuildersKt.runBlocking$default(null, new AuthorizationInterceptor3(this, null), 1, null);
        }
        if (!(result2 instanceof Result.Success)) {
            return createSynthetic400Response(result, request);
        }
        return chain.proceed(addAuthorizationHeader(request, (Auth) ((Result.Success) result2).getData()));
    }

    private final Request addAuthorizationHeader(Request originalRequest, Auth auth) {
        return originalRequest.newBuilder().header("Authorization", "Bearer " + auth.getRawJwt()).build();
    }
}
