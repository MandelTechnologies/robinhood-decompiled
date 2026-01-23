package com.stripe.android.core.networking;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.stripe.android.core.ApiKeyValidator;
import com.stripe.android.core.AppInfo;
import com.stripe.android.core.exception.InvalidRequestException;
import com.stripe.android.core.networking.RequestHeadersFactory;
import com.stripe.android.core.networking.StripeRequest;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* compiled from: ApiRequest.kt */
@Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001c\n\u0002\b\n\n\u0002\u0010\u0012\n\u0002\b\t\b\u0087\b\u0018\u0000 I2\u00020\u0001:\u0003IJKBa\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u0003\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u000e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u0018R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u0003\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010*R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010+R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010#R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010#R\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010,\u001a\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010#R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001a\u00104\u001a\u0002038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R \u00109\u001a\b\u0012\u0004\u0012\u00020\u0019088\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R&\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010%\u001a\u0004\b>\u0010'R0\u0010?\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b?\u0010%\u001a\u0004\b@\u0010'\"\u0004\bA\u0010BR\u0014\u0010F\u001a\u00020C8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0014\u0010H\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010\u0018¨\u0006L"}, m3636d2 = {"Lcom/stripe/android/core/networking/ApiRequest;", "Lcom/stripe/android/core/networking/StripeRequest;", "Lcom/stripe/android/core/networking/StripeRequest$Method;", "method", "", "baseUrl", "", "params", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "options", "Lcom/stripe/android/core/AppInfo;", "appInfo", "apiVersion", "sdkVersion", "", "shouldCache", "<init>", "(Lcom/stripe/android/core/networking/StripeRequest$Method;Ljava/lang/String;Ljava/util/Map;Lcom/stripe/android/core/networking/ApiRequest$Options;Lcom/stripe/android/core/AppInfo;Ljava/lang/String;Ljava/lang/String;Z)V", "Ljava/io/OutputStream;", "outputStream", "", "writePostBody", "(Ljava/io/OutputStream;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/stripe/android/core/networking/StripeRequest$Method;", "getMethod", "()Lcom/stripe/android/core/networking/StripeRequest$Method;", "Ljava/lang/String;", "getBaseUrl", "Ljava/util/Map;", "getParams", "()Ljava/util/Map;", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "getOptions", "()Lcom/stripe/android/core/networking/ApiRequest$Options;", "Lcom/stripe/android/core/AppInfo;", "Z", "getShouldCache", "()Z", "query", "Lcom/stripe/android/core/networking/RequestHeadersFactory$Api;", "headersFactory", "Lcom/stripe/android/core/networking/RequestHeadersFactory$Api;", "Lcom/stripe/android/core/networking/StripeRequest$MimeType;", "mimeType", "Lcom/stripe/android/core/networking/StripeRequest$MimeType;", "getMimeType", "()Lcom/stripe/android/core/networking/StripeRequest$MimeType;", "", "retryResponseCodes", "Ljava/lang/Iterable;", "getRetryResponseCodes", "()Ljava/lang/Iterable;", "headers", "getHeaders", "postHeaders", "getPostHeaders", "setPostHeaders", "(Ljava/util/Map;)V", "", "getPostBodyBytes", "()[B", "postBodyBytes", "getUrl", "url", "Companion", "Factory", "Options", "stripe-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final /* data */ class ApiRequest extends StripeRequest {
    private final String apiVersion;
    private final AppInfo appInfo;
    private final String baseUrl;
    private final Map<String, String> headers;
    private final RequestHeadersFactory.Api headersFactory;
    private final StripeRequest.Method method;
    private final StripeRequest.MimeType mimeType;
    private final Options options;
    private final Map<String, ?> params;
    private Map<String, String> postHeaders;
    private final String query;
    private final Iterable<Integer> retryResponseCodes;
    private final String sdkVersion;
    private final boolean shouldCache;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiRequest)) {
            return false;
        }
        ApiRequest apiRequest = (ApiRequest) other;
        return this.method == apiRequest.method && Intrinsics.areEqual(this.baseUrl, apiRequest.baseUrl) && Intrinsics.areEqual(this.params, apiRequest.params) && Intrinsics.areEqual(this.options, apiRequest.options) && Intrinsics.areEqual(this.appInfo, apiRequest.appInfo) && Intrinsics.areEqual(this.apiVersion, apiRequest.apiVersion) && Intrinsics.areEqual(this.sdkVersion, apiRequest.sdkVersion) && this.shouldCache == apiRequest.shouldCache;
    }

    public int hashCode() {
        int iHashCode = ((this.method.hashCode() * 31) + this.baseUrl.hashCode()) * 31;
        Map<String, ?> map = this.params;
        int iHashCode2 = (((iHashCode + (map == null ? 0 : map.hashCode())) * 31) + this.options.hashCode()) * 31;
        AppInfo appInfo = this.appInfo;
        return ((((((iHashCode2 + (appInfo != null ? appInfo.hashCode() : 0)) * 31) + this.apiVersion.hashCode()) * 31) + this.sdkVersion.hashCode()) * 31) + Boolean.hashCode(this.shouldCache);
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public StripeRequest.Method getMethod() {
        return this.method;
    }

    public final String getBaseUrl() {
        return this.baseUrl;
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public boolean getShouldCache() {
        return this.shouldCache;
    }

    public ApiRequest(StripeRequest.Method method, String baseUrl, Map<String, ?> map, Options options, AppInfo appInfo, String apiVersion, String sdkVersion, boolean z) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(apiVersion, "apiVersion");
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        this.method = method;
        this.baseUrl = baseUrl;
        this.params = map;
        this.options = options;
        this.appInfo = appInfo;
        this.apiVersion = apiVersion;
        this.sdkVersion = sdkVersion;
        this.shouldCache = z;
        this.query = QueryStringFactory.INSTANCE.createFromParamsWithEmptyValues(map);
        RequestHeadersFactory.Api api = new RequestHeadersFactory.Api(options, appInfo, null, apiVersion, sdkVersion, 4, null);
        this.headersFactory = api;
        this.mimeType = StripeRequest.MimeType.Form;
        this.retryResponseCodes = NetworkConstants2.getDEFAULT_RETRY_CODES();
        this.headers = api.create();
        this.postHeaders = api.createPostHeader();
    }

    private final byte[] getPostBodyBytes() throws InvalidRequestException, UnsupportedEncodingException {
        try {
            byte[] bytes = this.query.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            return bytes;
        } catch (UnsupportedEncodingException e) {
            throw new InvalidRequestException(null, null, 0, "Unable to encode parameters to " + Charsets.UTF_8.name() + ". Please contact support@stripe.com for assistance.", e, 7, null);
        }
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public Iterable<Integer> getRetryResponseCodes() {
        return this.retryResponseCodes;
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public String getUrl() {
        if (StripeRequest.Method.GET == getMethod() || StripeRequest.Method.DELETE == getMethod()) {
            String str = this.baseUrl;
            String str2 = this.query;
            if (str2.length() <= 0) {
                str2 = null;
            }
            return CollectionsKt.joinToString$default(CollectionsKt.listOfNotNull((Object[]) new String[]{str, str2}), StringsKt.contains$default((CharSequence) this.baseUrl, (CharSequence) "?", false, 2, (Object) null) ? "&" : "?", null, null, 0, null, null, 62, null);
        }
        return this.baseUrl;
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public Map<String, String> getHeaders() {
        return this.headers;
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public Map<String, String> getPostHeaders() {
        return this.postHeaders;
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public void writePostBody(OutputStream outputStream) throws IOException {
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        outputStream.write(getPostBodyBytes());
        outputStream.flush();
    }

    public String toString() {
        return getMethod().getCode() + PlaceholderUtils.XXShortPlaceholderText + this.baseUrl;
    }

    /* compiled from: ApiRequest.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0001&B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B+\b\u0017\u0012\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b\u0012\u0010\b\u0001\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b¢\u0006\u0004\b\u0006\u0010\u000bJ2\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0012J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u000fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b!\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b\"\u0010\u000fR\u0011\u0010%\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006'"}, m3636d2 = {"Lcom/stripe/android/core/networking/ApiRequest$Options;", "Landroid/os/Parcelable;", "", "apiKey", "stripeAccount", "idempotencyKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lkotlin/Function0;", "publishableKeyProvider", "stripeAccountIdProvider", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/core/networking/ApiRequest$Options;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getApiKey", "getStripeAccount", "getIdempotencyKey", "getApiKeyIsUserKey", "()Z", "apiKeyIsUserKey", "Companion", "stripe-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class Options implements Parcelable {
        private final String apiKey;
        private final String idempotencyKey;
        private final String stripeAccount;
        public static final Parcelable.Creator<Options> CREATOR = new Creator();

        /* compiled from: ApiRequest.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Options> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Options createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Options(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Options[] newArray(int i) {
                return new Options[i];
            }
        }

        public static /* synthetic */ Options copy$default(Options options, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = options.apiKey;
            }
            if ((i & 2) != 0) {
                str2 = options.stripeAccount;
            }
            if ((i & 4) != 0) {
                str3 = options.idempotencyKey;
            }
            return options.copy(str, str2, str3);
        }

        public final Options copy(String apiKey, String stripeAccount, String idempotencyKey) {
            Intrinsics.checkNotNullParameter(apiKey, "apiKey");
            return new Options(apiKey, stripeAccount, idempotencyKey);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Options)) {
                return false;
            }
            Options options = (Options) other;
            return Intrinsics.areEqual(this.apiKey, options.apiKey) && Intrinsics.areEqual(this.stripeAccount, options.stripeAccount) && Intrinsics.areEqual(this.idempotencyKey, options.idempotencyKey);
        }

        public int hashCode() {
            int iHashCode = this.apiKey.hashCode() * 31;
            String str = this.stripeAccount;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.idempotencyKey;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Options(apiKey=" + this.apiKey + ", stripeAccount=" + this.stripeAccount + ", idempotencyKey=" + this.idempotencyKey + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.apiKey);
            parcel.writeString(this.stripeAccount);
            parcel.writeString(this.idempotencyKey);
        }

        public Options(String apiKey, String str, String str2) {
            Intrinsics.checkNotNullParameter(apiKey, "apiKey");
            this.apiKey = apiKey;
            this.stripeAccount = str;
            this.idempotencyKey = str2;
            new ApiKeyValidator().requireValid(apiKey);
        }

        public /* synthetic */ Options(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
        }

        public final String getApiKey() {
            return this.apiKey;
        }

        public final String getStripeAccount() {
            return this.stripeAccount;
        }

        public final String getIdempotencyKey() {
            return this.idempotencyKey;
        }

        public final boolean getApiKeyIsUserKey() {
            return StringsKt.startsWith$default(this.apiKey, "uk_", false, 2, (Object) null);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Options(Function0<String> publishableKeyProvider, Function0<String> stripeAccountIdProvider) {
            this(publishableKeyProvider.invoke(), stripeAccountIdProvider.invoke(), null, 4, null);
            Intrinsics.checkNotNullParameter(publishableKeyProvider, "publishableKeyProvider");
            Intrinsics.checkNotNullParameter(stripeAccountIdProvider, "stripeAccountIdProvider");
        }
    }

    /* compiled from: ApiRequest.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ=\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u0003\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J=\u0010\u0013\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u0003\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015¨\u0006\u0016"}, m3636d2 = {"Lcom/stripe/android/core/networking/ApiRequest$Factory;", "", "Lcom/stripe/android/core/AppInfo;", "appInfo", "", "apiVersion", "sdkVersion", "<init>", "(Lcom/stripe/android/core/AppInfo;Ljava/lang/String;Ljava/lang/String;)V", "url", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "options", "", "params", "", "shouldCache", "Lcom/stripe/android/core/networking/ApiRequest;", "createGet", "(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;Z)Lcom/stripe/android/core/networking/ApiRequest;", "createPost", "Lcom/stripe/android/core/AppInfo;", "Ljava/lang/String;", "stripe-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Factory {
        private final String apiVersion;
        private final AppInfo appInfo;
        private final String sdkVersion;

        public Factory(AppInfo appInfo, String apiVersion, String sdkVersion) {
            Intrinsics.checkNotNullParameter(apiVersion, "apiVersion");
            Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
            this.appInfo = appInfo;
            this.apiVersion = apiVersion;
            this.sdkVersion = sdkVersion;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ApiRequest createGet$default(Factory factory, String str, Options options, Map map, boolean z, int i, Object obj) {
            if ((i & 4) != 0) {
                map = null;
            }
            if ((i & 8) != 0) {
                z = false;
            }
            return factory.createGet(str, options, map, z);
        }

        public final ApiRequest createGet(String url, Options options, Map<String, ?> params, boolean shouldCache) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(options, "options");
            return new ApiRequest(StripeRequest.Method.GET, url, params, options, this.appInfo, this.apiVersion, this.sdkVersion, shouldCache);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ApiRequest createPost$default(Factory factory, String str, Options options, Map map, boolean z, int i, Object obj) {
            if ((i & 4) != 0) {
                map = null;
            }
            if ((i & 8) != 0) {
                z = false;
            }
            return factory.createPost(str, options, map, z);
        }

        public final ApiRequest createPost(String url, Options options, Map<String, ?> params, boolean shouldCache) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(options, "options");
            return new ApiRequest(StripeRequest.Method.POST, url, params, options, this.appInfo, this.apiVersion, this.sdkVersion, shouldCache);
        }
    }
}
