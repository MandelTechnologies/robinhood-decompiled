package com.stripe.android.core.networking;

import android.os.Build;
import android.system.Os;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.utils.http.Headers;
import com.stripe.android.core.ApiVersion;
import com.stripe.android.core.AppInfo;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.StripeRequest;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* compiled from: RequestHeadersFactory.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00172\u00020\u0001:\u0005\u0018\u0019\u001a\u0017\u001bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\u0007J\u001d\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\tH\u0004¢\u0006\u0004\b\n\u0010\u0007R.\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0014@\u0014X\u0094\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u0007\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00058$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0007R\u0014\u0010\u0016\u001a\u00020\u00058$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011\u0082\u0001\u0003\u001c\u001d\u001e¨\u0006\u001f"}, m3636d2 = {"Lcom/stripe/android/core/networking/RequestHeadersFactory;", "", "<init>", "()V", "", "", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "()Ljava/util/Map;", "createPostHeader", "", "defaultXStripeUserAgentMap", "postHeaders", "Ljava/util/Map;", "getPostHeaders", "setPostHeaders", "(Ljava/util/Map;)V", "getUserAgent", "()Ljava/lang/String;", "userAgent", "getExtraHeaders", "extraHeaders", "getXStripeUserAgent", "xStripeUserAgent", "Companion", "Analytics", "Api", "BaseApiHeadersFactory", "FraudDetection", "Lcom/stripe/android/core/networking/RequestHeadersFactory$Analytics;", "Lcom/stripe/android/core/networking/RequestHeadersFactory$BaseApiHeadersFactory;", "Lcom/stripe/android/core/networking/RequestHeadersFactory$FraudDetection;", "stripe-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public abstract class RequestHeadersFactory {
    private static final String CHARSET;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private Map<String, String> postHeaders;

    public /* synthetic */ RequestHeadersFactory(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    protected abstract Map<String, String> getExtraHeaders();

    protected abstract String getUserAgent();

    protected abstract String getXStripeUserAgent();

    private RequestHeadersFactory() {
        this.postHeaders = MapsKt.emptyMap();
    }

    public final Map<String, String> create() {
        return MapsKt.plus(getExtraHeaders(), MapsKt.mapOf(Tuples4.m3642to(Headers.USER_AGENT, getUserAgent()), Tuples4.m3642to("Accept-Charset", CHARSET), Tuples4.m3642to("X-Stripe-User-Agent", getXStripeUserAgent())));
    }

    public final Map<String, String> createPostHeader() {
        return getPostHeaders();
    }

    protected Map<String, String> getPostHeaders() {
        return this.postHeaders;
    }

    protected final Map<String, String> defaultXStripeUserAgentMap() {
        Tuples2 tuples2M3642to = Tuples4.m3642to("lang", "kotlin");
        Tuples2 tuples2M3642to2 = Tuples4.m3642to("bindings_version", "20.50.0");
        Tuples2 tuples2M3642to3 = Tuples4.m3642to("os_version", String.valueOf(Build.VERSION.SDK_INT));
        String str = Build.MANUFACTURER;
        String str2 = Build.BRAND;
        String str3 = Build.MODEL;
        return MapsKt.mutableMapOf(tuples2M3642to, tuples2M3642to2, tuples2M3642to3, Tuples4.m3642to("type", str + "_" + str2 + "_" + str3), Tuples4.m3642to("model", str3));
    }

    /* compiled from: RequestHeadersFactory.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B=\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0002\u0010\fR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u000e8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\n8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\n8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0013¨\u0006\u001a"}, m3636d2 = {"Lcom/stripe/android/core/networking/RequestHeadersFactory$BaseApiHeadersFactory;", "Lcom/stripe/android/core/networking/RequestHeadersFactory;", "optionsProvider", "Lkotlin/Function0;", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "appInfo", "Lcom/stripe/android/core/AppInfo;", "locale", "Ljava/util/Locale;", "apiVersion", "", "sdkVersion", "(Lkotlin/jvm/functions/Function0;Lcom/stripe/android/core/AppInfo;Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;)V", "extraHeaders", "", "getExtraHeaders", "()Ljava/util/Map;", "languageTag", "getLanguageTag", "()Ljava/lang/String;", "stripeClientUserAgentHeaderFactory", "Lcom/stripe/android/core/networking/StripeClientUserAgentHeaderFactory;", "userAgent", "getUserAgent", "xStripeUserAgent", "getXStripeUserAgent", "stripe-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static class BaseApiHeadersFactory extends RequestHeadersFactory {
        private final String apiVersion;
        private final AppInfo appInfo;
        private final Locale locale;
        private final Function0<ApiRequest.Options> optionsProvider;
        private final String sdkVersion;
        private final StripeClientUserAgentHeaderFactory stripeClientUserAgentHeaderFactory;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public BaseApiHeadersFactory(Function0<ApiRequest.Options> optionsProvider, AppInfo appInfo, Locale locale, String apiVersion, String sdkVersion) {
            super(null);
            Intrinsics.checkNotNullParameter(optionsProvider, "optionsProvider");
            Intrinsics.checkNotNullParameter(locale, "locale");
            Intrinsics.checkNotNullParameter(apiVersion, "apiVersion");
            Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
            this.optionsProvider = optionsProvider;
            this.appInfo = appInfo;
            this.locale = locale;
            this.apiVersion = apiVersion;
            this.sdkVersion = sdkVersion;
            this.stripeClientUserAgentHeaderFactory = new StripeClientUserAgentHeaderFactory(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
        }

        private final String getLanguageTag() {
            String languageTag = this.locale.toLanguageTag();
            Intrinsics.checkNotNull(languageTag);
            if (StringsKt.isBlank(languageTag) || Intrinsics.areEqual(languageTag, "und")) {
                return null;
            }
            return languageTag;
        }

        @Override // com.stripe.android.core.networking.RequestHeadersFactory
        protected String getUserAgent() {
            String userAgent = RequestHeadersFactory.INSTANCE.getUserAgent(this.sdkVersion);
            AppInfo appInfo = this.appInfo;
            return CollectionsKt.joinToString$default(CollectionsKt.listOfNotNull((Object[]) new String[]{userAgent, appInfo != null ? appInfo.toUserAgent$stripe_core_release() : null}), PlaceholderUtils.XXShortPlaceholderText, null, null, 0, null, null, 62, null);
        }

        @Override // com.stripe.android.core.networking.RequestHeadersFactory
        protected String getXStripeUserAgent() {
            Map<String, String> mapDefaultXStripeUserAgentMap = defaultXStripeUserAgentMap();
            AppInfo appInfo = this.appInfo;
            if (appInfo != null) {
                mapDefaultXStripeUserAgentMap.putAll(appInfo.toParamMap$stripe_core_release());
            }
            ArrayList arrayList = new ArrayList(mapDefaultXStripeUserAgentMap.size());
            for (Map.Entry<String, String> entry : mapDefaultXStripeUserAgentMap.entrySet()) {
                arrayList.add("\"" + entry.getKey() + "\":\"" + entry.getValue() + "\"");
            }
            return "{" + CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null) + "}";
        }

        @Override // com.stripe.android.core.networking.RequestHeadersFactory
        protected Map<String, String> getExtraHeaders() {
            Map mapEmptyMap;
            ApiRequest.Options optionsInvoke = this.optionsProvider.invoke();
            Map mapPlus = MapsKt.plus(MapsKt.mapOf(Tuples4.m3642to("Accept", "application/json"), Tuples4.m3642to("Stripe-Version", this.apiVersion), Tuples4.m3642to("Authorization", "Bearer " + optionsInvoke.getApiKey())), this.stripeClientUserAgentHeaderFactory.create(this.appInfo));
            if (optionsInvoke.getApiKeyIsUserKey()) {
                mapEmptyMap = MapsKt.mapOf(Tuples4.m3642to("Stripe-Livemode", String.valueOf(!Intrinsics.areEqual(Os.getenv("Stripe-Livemode"), "false"))));
            } else {
                mapEmptyMap = MapsKt.emptyMap();
            }
            Map mapPlus2 = MapsKt.plus(mapPlus, mapEmptyMap);
            String stripeAccount = optionsInvoke.getStripeAccount();
            Map mapMapOf = stripeAccount != null ? MapsKt.mapOf(Tuples4.m3642to("Stripe-Account", stripeAccount)) : null;
            if (mapMapOf == null) {
                mapMapOf = MapsKt.emptyMap();
            }
            Map mapPlus3 = MapsKt.plus(mapPlus2, mapMapOf);
            String idempotencyKey = optionsInvoke.getIdempotencyKey();
            Map mapMapOf2 = idempotencyKey != null ? MapsKt.mapOf(Tuples4.m3642to("Idempotency-Key", idempotencyKey)) : null;
            if (mapMapOf2 == null) {
                mapMapOf2 = MapsKt.emptyMap();
            }
            Map mapPlus4 = MapsKt.plus(mapPlus3, mapMapOf2);
            String languageTag = getLanguageTag();
            Map mapMapOf3 = languageTag != null ? MapsKt.mapOf(Tuples4.m3642to(Headers.LANGUAGE, languageTag)) : null;
            if (mapMapOf3 == null) {
                mapMapOf3 = MapsKt.emptyMap();
            }
            return MapsKt.plus(mapPlus4, mapMapOf3);
        }
    }

    /* compiled from: RequestHeadersFactory.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR.\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\r8\u0014@\u0014X\u0094\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/stripe/android/core/networking/RequestHeadersFactory$Api;", "Lcom/stripe/android/core/networking/RequestHeadersFactory$BaseApiHeadersFactory;", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "options", "Lcom/stripe/android/core/AppInfo;", "appInfo", "Ljava/util/Locale;", "locale", "", "apiVersion", "sdkVersion", "<init>", "(Lcom/stripe/android/core/networking/ApiRequest$Options;Lcom/stripe/android/core/AppInfo;Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;)V", "", "postHeaders", "Ljava/util/Map;", "getPostHeaders", "()Ljava/util/Map;", "setPostHeaders", "(Ljava/util/Map;)V", "stripe-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Api extends BaseApiHeadersFactory {
        private Map<String, String> postHeaders;

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Api(ApiRequest.Options options, AppInfo appInfo, Locale locale, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            AppInfo appInfo2 = (i & 2) != 0 ? null : appInfo;
            if ((i & 4) != 0) {
                locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
            }
            this(options, appInfo2, locale, (i & 8) != 0 ? ApiVersion.INSTANCE.get().getCode() : str, (i & 16) != 0 ? "AndroidBindings/20.50.0" : str2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Api(final ApiRequest.Options options, AppInfo appInfo, Locale locale, String apiVersion, String sdkVersion) {
            super(new Function0<ApiRequest.Options>() { // from class: com.stripe.android.core.networking.RequestHeadersFactory.Api.1
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final ApiRequest.Options invoke() {
                    return options;
                }
            }, appInfo, locale, apiVersion, sdkVersion);
            Intrinsics.checkNotNullParameter(options, "options");
            Intrinsics.checkNotNullParameter(locale, "locale");
            Intrinsics.checkNotNullParameter(apiVersion, "apiVersion");
            Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
            this.postHeaders = MapsKt.mapOf(Tuples4.m3642to("Content-Type", StripeRequest.MimeType.Form.getCode() + "; charset=" + RequestHeadersFactory.INSTANCE.getCHARSET()));
        }

        @Override // com.stripe.android.core.networking.RequestHeadersFactory
        protected Map<String, String> getPostHeaders() {
            return this.postHeaders;
        }
    }

    /* compiled from: RequestHeadersFactory.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0010\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00068\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR.\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00068\u0014@\u0014X\u0094\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\b\u001a\u0004\b\u0010\u0010\n\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000e¨\u0006\u0016"}, m3636d2 = {"Lcom/stripe/android/core/networking/RequestHeadersFactory$FraudDetection;", "Lcom/stripe/android/core/networking/RequestHeadersFactory;", "", "guid", "<init>", "(Ljava/lang/String;)V", "", "extraHeaders", "Ljava/util/Map;", "getExtraHeaders", "()Ljava/util/Map;", "userAgent", "Ljava/lang/String;", "getUserAgent", "()Ljava/lang/String;", "postHeaders", "getPostHeaders", "setPostHeaders", "(Ljava/util/Map;)V", "getXStripeUserAgent", "xStripeUserAgent", "Companion", "stripe-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class FraudDetection extends RequestHeadersFactory {
        private final Map<String, String> extraHeaders;
        private Map<String, String> postHeaders;
        private final String userAgent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FraudDetection(String guid) {
            super(null);
            Intrinsics.checkNotNullParameter(guid, "guid");
            this.extraHeaders = MapsKt.mapOf(Tuples4.m3642to("Cookie", "m=" + guid));
            Companion companion = RequestHeadersFactory.INSTANCE;
            this.userAgent = companion.getUserAgent("AndroidBindings/20.50.0");
            this.postHeaders = MapsKt.mapOf(Tuples4.m3642to("Content-Type", StripeRequest.MimeType.Json.getCode() + "; charset=" + companion.getCHARSET()));
        }

        @Override // com.stripe.android.core.networking.RequestHeadersFactory
        protected Map<String, String> getExtraHeaders() {
            return this.extraHeaders;
        }

        @Override // com.stripe.android.core.networking.RequestHeadersFactory
        protected String getUserAgent() {
            return this.userAgent;
        }

        @Override // com.stripe.android.core.networking.RequestHeadersFactory
        protected Map<String, String> getPostHeaders() {
            return this.postHeaders;
        }

        @Override // com.stripe.android.core.networking.RequestHeadersFactory
        protected String getXStripeUserAgent() {
            Map<String, String> mapDefaultXStripeUserAgentMap = defaultXStripeUserAgentMap();
            ArrayList arrayList = new ArrayList(mapDefaultXStripeUserAgentMap.size());
            for (Map.Entry<String, String> entry : mapDefaultXStripeUserAgentMap.entrySet()) {
                arrayList.add("\"" + entry.getKey() + "\":\"" + entry.getValue() + "\"");
            }
            return "{" + CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null) + "}";
        }
    }

    /* compiled from: RequestHeadersFactory.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R \u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\n¨\u0006\u0014"}, m3636d2 = {"Lcom/stripe/android/core/networking/RequestHeadersFactory$Analytics;", "Lcom/stripe/android/core/networking/RequestHeadersFactory;", "()V", "extraHeaders", "", "", "getExtraHeaders", "()Ljava/util/Map;", "userAgent", "getUserAgent", "()Ljava/lang/String;", "xStripeUserAgent", "getXStripeUserAgent", "equals", "", "other", "", "hashCode", "", "toString", "stripe-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class Analytics extends RequestHeadersFactory {
        public static final Analytics INSTANCE = new Analytics();
        private static final String userAgent = RequestHeadersFactory.INSTANCE.getUserAgent("AndroidBindings/20.50.0");
        private static final Map<String, String> extraHeaders = MapsKt.emptyMap();

        public boolean equals(Object other) {
            return this == other || (other instanceof Analytics);
        }

        public int hashCode() {
            return -334358835;
        }

        public String toString() {
            return "Analytics";
        }

        private Analytics() {
            super(null);
        }

        @Override // com.stripe.android.core.networking.RequestHeadersFactory
        protected String getUserAgent() {
            return userAgent;
        }

        @Override // com.stripe.android.core.networking.RequestHeadersFactory
        protected Map<String, String> getExtraHeaders() {
            return extraHeaders;
        }

        @Override // com.stripe.android.core.networking.RequestHeadersFactory
        protected String getXStripeUserAgent() {
            Map<String, String> mapDefaultXStripeUserAgentMap = defaultXStripeUserAgentMap();
            ArrayList arrayList = new ArrayList(mapDefaultXStripeUserAgentMap.size());
            for (Map.Entry<String, String> entry : mapDefaultXStripeUserAgentMap.entrySet()) {
                arrayList.add("\"" + entry.getKey() + "\":\"" + entry.getValue() + "\"");
            }
            return "{" + CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null) + "}";
        }
    }

    /* compiled from: RequestHeadersFactory.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u0004R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/stripe/android/core/networking/RequestHeadersFactory$Companion;", "", "()V", "CHARSET", "", "getCHARSET", "()Ljava/lang/String;", "KOTLIN", "LANG", "MODEL", CredentialProviderBaseController.TYPE_TAG, "UNDETERMINED_LANGUAGE", "getUserAgent", "sdkVersion", "stripe-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ String getUserAgent$default(Companion companion, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = "AndroidBindings/20.50.0";
            }
            return companion.getUserAgent(str);
        }

        public final String getUserAgent(String sdkVersion) {
            Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
            return "Stripe/v1 " + sdkVersion;
        }

        public final String getCHARSET() {
            return RequestHeadersFactory.CHARSET;
        }
    }

    static {
        String strName = Charsets.UTF_8.name();
        Intrinsics.checkNotNullExpressionValue(strName, "name(...)");
        CHARSET = strName;
    }
}
