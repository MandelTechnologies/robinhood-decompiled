package com.withpersona.sdk2.inquiry.network.core;

import android.content.Context;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.withpersona.sdk2.inquiry.device.DeviceInfoProvider;
import com.withpersona.sdk2.inquiry.device.DeviceVendorIDProvider;
import com.withpersona.sdk2.inquiry.logger.Logger;
import com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule;
import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

/* loaded from: classes18.dex */
public final class NetworkCoreModule {
    public static final Companion Companion = new Companion(null);
    private String environmentId;
    private final String locale;
    private String organizationId;
    private final boolean useServerStyle;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final Set<JsonAdapter.Factory> provideMoshiJsonAdapterFactory() {
            return SetsKt.setOf((Object[]) new JsonAdapter.Factory[]{ErrorResponse.Companion.getAdapter(), InternalErrorInfo.Companion.createAdapter()});
        }

        private Companion() {
        }
    }

    public static final class NetworkConstants {
        public static final String HEADER_KEY_PERSONA_ENVIRONMENT_ID = "Persona-Organization-Id";
        public static final String HEADER_KEY_PERSONA_ORGANIZATION_ID = "Persona-Environment-Id";
        public static final NetworkConstants INSTANCE = new NetworkConstants();

        private NetworkConstants() {
        }
    }

    public NetworkCoreModule(boolean z, String str, String str2) {
        this.useServerStyle = z;
        this.environmentId = str;
        this.locale = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Response interceptor$lambda$8(Moshi moshi, Interceptor.Chain chain) {
        try {
            return chain.proceed(chain.request());
        } catch (ConnectException e) {
            Response.Builder builderCode = new Response.Builder().request(chain.request()).protocol(Protocol.HTTP_2).code(0);
            String localizedMessage = e.getLocalizedMessage();
            return builderCode.message(localizedMessage != null ? localizedMessage : "").body(ResponseBody.INSTANCE.create(moshi.adapter(ErrorResponse.class).toJson(ErrorResponse.Companion.create(e.getLocalizedMessage())), MediaType.INSTANCE.get("application/json"))).build();
        } catch (SocketTimeoutException e2) {
            Response.Builder builderCode2 = new Response.Builder().request(chain.request()).protocol(Protocol.HTTP_2).code(0);
            String localizedMessage2 = e2.getLocalizedMessage();
            return builderCode2.message(localizedMessage2 != null ? localizedMessage2 : "").body(ResponseBody.INSTANCE.create(moshi.adapter(ErrorResponse.class).toJson(ErrorResponse.Companion.create(e2.getLocalizedMessage())), MediaType.INSTANCE.get("application/json"))).build();
        } catch (UnknownHostException e3) {
            Response.Builder builderCode3 = new Response.Builder().request(chain.request()).protocol(Protocol.HTTP_2).code(0);
            String localizedMessage3 = e3.getLocalizedMessage();
            return builderCode3.message(localizedMessage3 != null ? localizedMessage3 : "").body(ResponseBody.INSTANCE.create(moshi.adapter(ErrorResponse.class).toJson(ErrorResponse.Companion.create(e3.getLocalizedMessage())), MediaType.INSTANCE.get("application/json"))).build();
        } catch (IOException e4) {
            Response.Builder builderCode4 = new Response.Builder().request(chain.request()).protocol(Protocol.HTTP_2).code(0);
            String localizedMessage4 = e4.getLocalizedMessage();
            return builderCode4.message(localizedMessage4 != null ? localizedMessage4 : "").body(ResponseBody.INSTANCE.create(moshi.adapter(ErrorResponse.class).toJson(ErrorResponse.Companion.create(e4.getLocalizedMessage())), MediaType.INSTANCE.get("application/json"))).build();
        }
    }

    @JvmStatic
    public static final Set<JsonAdapter.Factory> provideMoshiJsonAdapterFactory() {
        return Companion.provideMoshiJsonAdapterFactory();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Response responseInterceptor$lambda$7(NetworkCoreModule networkCoreModule, Interceptor.Chain chain) throws IOException {
        Response responseProceed = chain.proceed(chain.request());
        String str = responseProceed.getHeaders().get(NetworkConstants.HEADER_KEY_PERSONA_ORGANIZATION_ID);
        if (str != null) {
            networkCoreModule.organizationId = str;
        }
        String str2 = responseProceed.getHeaders().get(NetworkConstants.HEADER_KEY_PERSONA_ENVIRONMENT_ID);
        if (str2 != null) {
            networkCoreModule.environmentId = str2;
        }
        return responseProceed;
    }

    public final Interceptor interceptor(final Moshi moshi) {
        return new Interceptor() { // from class: com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule$$ExternalSyntheticLambda1
            @Override // okhttp3.Interceptor
            public final Response intercept(Interceptor.Chain chain) {
                return NetworkCoreModule.interceptor$lambda$8(moshi, chain);
            }
        };
    }

    public final String keyInflection() {
        return "camel";
    }

    public final Moshi moshi(Set<Object> set, Set<JsonAdapterBinding<?>> set2, Set<JsonAdapter.Factory> set3) {
        Moshi.Builder builder = new Moshi.Builder();
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            builder.add(it.next());
        }
        Iterator<T> it2 = set2.iterator();
        while (it2.hasNext()) {
            JsonAdapterBinding jsonAdapterBinding = (JsonAdapterBinding) it2.next();
            builder.add(jsonAdapterBinding.getClazz(), jsonAdapterBinding.getJsonAdapter());
        }
        Iterator<T> it3 = set3.iterator();
        while (it3.hasNext()) {
            builder.add((JsonAdapter.Factory) it3.next());
        }
        return builder.build();
    }

    public final OkHttpClient okhttpClient(Set<Interceptor> set, final Map<String, String> map, final Context context, final DeviceVendorIDProvider deviceVendorIDProvider, final DeviceInfoProvider deviceInfoProvider, final Logger logger) {
        OkHttpClient.Builder builderAddNetworkInterceptor = new OkHttpClient.Builder().addNetworkInterceptor(new Interceptor() { // from class: com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule$okhttpClient$$inlined$-addNetworkInterceptor$1
            @Override // okhttp3.Interceptor
            public final Response intercept(Interceptor.Chain chain) {
                Request.Builder builderNewBuilder = chain.request().newBuilder();
                if (!chain.request().getHeaders().names().contains("Accept")) {
                    builderNewBuilder = builderNewBuilder.header("Accept", "application/json");
                }
                Request.Builder builderHeader = builderNewBuilder.header("Persona-Version", "2023-08-08").header("Persona-Device-Manufacturer", deviceInfoProvider.getManufacturer()).header("Persona-Device-Model", deviceInfoProvider.getModel()).header("Persona-Device-OS", "Android").header("Persona-Device-OS-Version", deviceInfoProvider.getVersionRelease()).header("Persona-Device-Vendor-Id", deviceVendorIDProvider.deviceVendorId()).header("VTDGJLGG", String.valueOf(deviceInfoProvider.isDebuggerAttached())).header("Persona-Style-Variant", (context.getResources().getConfiguration().uiMode & 48) == 32 ? "dark" : "light");
                String string2 = this.locale;
                if (string2 == null) {
                    string2 = Locale.getDefault().toString();
                }
                Request.Builder builderHeader2 = builderHeader.header("Persona-Device-Locale", string2).header("Persona-App-Bundle", context.getPackageName());
                String str = this.organizationId;
                if (str != null) {
                    builderHeader2.header(NetworkCoreModule.NetworkConstants.HEADER_KEY_PERSONA_ORGANIZATION_ID, str);
                }
                String str2 = this.environmentId;
                if (str2 != null) {
                    builderHeader2.header(NetworkCoreModule.NetworkConstants.HEADER_KEY_PERSONA_ENVIRONMENT_ID, str2);
                }
                for (Map.Entry entry : map.entrySet()) {
                    builderHeader2.header((String) entry.getKey(), (String) entry.getValue());
                }
                return chain.proceed(C43682a.m3234a(C43682a.f6505a, builderHeader2.build(), logger, 0L, 2, (Object) null));
            }
        });
        TimeUnit timeUnit = TimeUnit.MINUTES;
        OkHttpClient.Builder builderConnectTimeout = builderAddNetworkInterceptor.readTimeout(1L, timeUnit).writeTimeout(1L, timeUnit).connectTimeout(1L, timeUnit);
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            builderConnectTimeout.addInterceptor((Interceptor) it.next());
        }
        return builderConnectTimeout.build();
    }

    public final Interceptor responseInterceptor() {
        return new Interceptor() { // from class: com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule$$ExternalSyntheticLambda0
            @Override // okhttp3.Interceptor
            public final Response intercept(Interceptor.Chain chain) {
                return NetworkCoreModule.responseInterceptor$lambda$7(this.f$0, chain);
            }
        };
    }

    public final Retrofit retrofit(String str, OkHttpClient okHttpClient, Moshi moshi) {
        return new Retrofit.Builder().client(okHttpClient).baseUrl(str).addConverterFactory(MoshiConverterFactory.create(moshi)).build();
    }

    public final String useServerStyles() {
        return String.valueOf(this.useServerStyle);
    }

    public /* synthetic */ NetworkCoreModule(boolean z, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : str, str2);
    }
}
