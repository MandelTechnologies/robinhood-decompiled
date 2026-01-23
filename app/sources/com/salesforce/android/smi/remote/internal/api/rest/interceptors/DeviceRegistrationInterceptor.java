package com.salesforce.android.smi.remote.internal.api.rest.interceptors;

import com.robinhood.android.common.util.TransitionReason;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.salesforce.android.smi.remote.internal.api.AbstractInterceptor;
import com.salesforce.android.smi.remote.internal.api.rest.RestService;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* compiled from: DeviceRegistrationInterceptor.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/salesforce/android/smi/remote/internal/api/rest/interceptors/DeviceRegistrationInterceptor;", "Lcom/salesforce/android/smi/remote/internal/api/AbstractInterceptor;", "restService", "Lcom/salesforce/android/smi/remote/internal/api/rest/RestService;", "<init>", "(Lcom/salesforce/android/smi/remote/internal/api/rest/RestService;)V", "interceptAllowedEndpoints", "Lokhttp3/Response;", TransitionReason.OPTION_TRADE_CHAIN, "Lokhttp3/Interceptor$Chain;", "shouldIntercept", "", "request", "Lokhttp3/Request;", "Companion", "remote_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class DeviceRegistrationInterceptor extends AbstractInterceptor {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final RestService restService;

    public /* synthetic */ DeviceRegistrationInterceptor(RestService restService, DefaultConstructorMarker defaultConstructorMarker) {
        this(restService);
    }

    private DeviceRegistrationInterceptor(RestService restService) {
        this.restService = restService;
    }

    @Override // com.salesforce.android.smi.remote.internal.api.AbstractInterceptor
    public Response interceptAllowedEndpoints(Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        synchronized (this) {
        }
        return chain.proceed(chain.request());
    }

    @Override // com.salesforce.android.smi.remote.internal.api.AbstractInterceptor
    public boolean shouldIntercept(Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        String str = (String) CollectionsKt.last((List) request.getUrl().pathSegments());
        int iHashCode = str.hashCode();
        return iHashCode != -1335157162 ? iHashCode != -563683565 ? (iHashCode == -360752849 && str.equals("registerDeviceCapabilities")) ? false : true : !str.equals("revokeToken") : !str.equals("device");
    }

    /* compiled from: DeviceRegistrationInterceptor.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m3636d2 = {"Lcom/salesforce/android/smi/remote/internal/api/rest/interceptors/DeviceRegistrationInterceptor$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/salesforce/android/smi/remote/internal/api/rest/interceptors/DeviceRegistrationInterceptor;", "restService", "Lcom/salesforce/android/smi/remote/internal/api/rest/RestService;", "remote_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DeviceRegistrationInterceptor create(RestService restService) {
            Intrinsics.checkNotNullParameter(restService, "restService");
            return new DeviceRegistrationInterceptor(restService, null);
        }
    }
}
