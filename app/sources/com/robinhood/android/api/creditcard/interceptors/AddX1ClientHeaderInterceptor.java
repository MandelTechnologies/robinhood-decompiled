package com.robinhood.android.api.creditcard.interceptors;

import com.robinhood.android.common.util.TransitionReason;
import com.robinhood.utils.ReleaseVersion;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Response;

/* compiled from: AddX1ClientHeaderInterceptor.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/api/creditcard/interceptors/AddX1ClientHeaderInterceptor;", "Lokhttp3/Interceptor;", "releaseVersion", "Lcom/robinhood/utils/ReleaseVersion;", "<init>", "(Lcom/robinhood/utils/ReleaseVersion;)V", "versionName", "", "intercept", "Lokhttp3/Response;", TransitionReason.OPTION_TRADE_CHAIN, "Lokhttp3/Interceptor$Chain;", "lib-api-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class AddX1ClientHeaderInterceptor implements Interceptor {
    private final String versionName;

    public AddX1ClientHeaderInterceptor(ReleaseVersion releaseVersion) {
        Intrinsics.checkNotNullParameter(releaseVersion, "releaseVersion");
        this.versionName = releaseVersion.getVersionName();
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        return chain.proceed(chain.request().newBuilder().addHeader("X-X1-Client", "mobile-app-rh-brokerage@" + this.versionName).build());
    }
}
