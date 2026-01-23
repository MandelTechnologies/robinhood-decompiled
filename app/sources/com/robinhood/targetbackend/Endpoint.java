package com.robinhood.targetbackend;

import com.adjust.sdk.Constants;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.HttpUrl;

/* compiled from: Endpoint.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\bn\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u0000 z2\u00020\u0001:\u0002yzB©\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\u0006\u0010\u0012\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\b\u0012\u0006\u0010\u0014\u001a\u00020\b\u0012\u0006\u0010\u0015\u001a\u00020\b\u0012\u0006\u0010\u0016\u001a\u00020\b\u0012\u0006\u0010\u0017\u001a\u00020\b\u0012\u0006\u0010\u0018\u001a\u00020\b\u0012\u0006\u0010\u0019\u001a\u00020\b\u0012\u0006\u0010\u001a\u001a\u00020\b\u0012\u0006\u0010\u001b\u001a\u00020\b\u0012\u0006\u0010\u001c\u001a\u00020\b\u0012\u0006\u0010\u001d\u001a\u00020\b\u0012\u0006\u0010\u001e\u001a\u00020\b\u0012\u0006\u0010\u001f\u001a\u00020\b\u0012\u0006\u0010 \u001a\u00020\b\u0012\u0006\u0010!\u001a\u00020\b\u0012\u0006\u0010\"\u001a\u00020\b\u0012\u0006\u0010#\u001a\u00020\b\u0012\u0006\u0010$\u001a\u00020\b\u0012\b\u0010%\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010&\u001a\u00020\b\u0012\u0006\u0010'\u001a\u00020\b¢\u0006\u0004\b(\u0010)J\t\u0010P\u001a\u00020\u0003HÆ\u0003J\t\u0010Q\u001a\u00020\u0003HÆ\u0003J\t\u0010R\u001a\u00020\u0006HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010U\u001a\u00020\bHÆ\u0003J\t\u0010V\u001a\u00020\bHÆ\u0003J\t\u0010W\u001a\u00020\bHÆ\u0003J\t\u0010X\u001a\u00020\bHÆ\u0003J\t\u0010Y\u001a\u00020\bHÆ\u0003J\t\u0010Z\u001a\u00020\bHÆ\u0003J\t\u0010[\u001a\u00020\bHÆ\u0003J\t\u0010\\\u001a\u00020\bHÆ\u0003J\t\u0010]\u001a\u00020\bHÆ\u0003J\t\u0010^\u001a\u00020\bHÆ\u0003J\t\u0010_\u001a\u00020\bHÆ\u0003J\t\u0010`\u001a\u00020\bHÆ\u0003J\t\u0010a\u001a\u00020\bHÆ\u0003J\t\u0010b\u001a\u00020\bHÆ\u0003J\t\u0010c\u001a\u00020\bHÆ\u0003J\t\u0010d\u001a\u00020\bHÆ\u0003J\t\u0010e\u001a\u00020\bHÆ\u0003J\t\u0010f\u001a\u00020\bHÆ\u0003J\t\u0010g\u001a\u00020\bHÆ\u0003J\t\u0010h\u001a\u00020\bHÆ\u0003J\t\u0010i\u001a\u00020\bHÆ\u0003J\t\u0010j\u001a\u00020\bHÆ\u0003J\t\u0010k\u001a\u00020\bHÆ\u0003J\t\u0010l\u001a\u00020\bHÆ\u0003J\t\u0010m\u001a\u00020\bHÆ\u0003J\t\u0010n\u001a\u00020\bHÆ\u0003J\t\u0010o\u001a\u00020\bHÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010q\u001a\u00020\bHÆ\u0003J\t\u0010r\u001a\u00020\bHÆ\u0003Jí\u0002\u0010s\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\b2\b\b\u0002\u0010\u0018\u001a\u00020\b2\b\b\u0002\u0010\u0019\u001a\u00020\b2\b\b\u0002\u0010\u001a\u001a\u00020\b2\b\b\u0002\u0010\u001b\u001a\u00020\b2\b\b\u0002\u0010\u001c\u001a\u00020\b2\b\b\u0002\u0010\u001d\u001a\u00020\b2\b\b\u0002\u0010\u001e\u001a\u00020\b2\b\b\u0002\u0010\u001f\u001a\u00020\b2\b\b\u0002\u0010 \u001a\u00020\b2\b\b\u0002\u0010!\u001a\u00020\b2\b\b\u0002\u0010\"\u001a\u00020\b2\b\b\u0002\u0010#\u001a\u00020\b2\b\b\u0002\u0010$\u001a\u00020\b2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010&\u001a\u00020\b2\b\b\u0002\u0010'\u001a\u00020\bHÆ\u0001J\u0013\u0010t\u001a\u00020\u00062\b\u0010u\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010v\u001a\u00020wHÖ\u0001J\t\u0010x\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010+R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010+R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b2\u00100R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b3\u00100R\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b4\u00100R\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b5\u00100R\u0011\u0010\u000e\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b6\u00100R\u0011\u0010\u000f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b7\u00100R\u0011\u0010\u0010\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b8\u00100R\u0011\u0010\u0011\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b9\u00100R\u0011\u0010\u0012\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b:\u00100R\u0011\u0010\u0013\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b;\u00100R\u0011\u0010\u0014\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b<\u00100R\u0011\u0010\u0015\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b=\u00100R\u0011\u0010\u0016\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b>\u00100R\u0011\u0010\u0017\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b?\u00100R\u0011\u0010\u0018\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b@\u00100R\u0011\u0010\u0019\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bA\u00100R\u0011\u0010\u001a\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bB\u00100R\u0011\u0010\u001b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bC\u00100R\u0011\u0010\u001c\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bD\u00100R\u0011\u0010\u001d\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bE\u00100R\u0011\u0010\u001e\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bF\u00100R\u0011\u0010\u001f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bG\u00100R\u0011\u0010 \u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bH\u00100R\u0011\u0010!\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bI\u00100R\u0011\u0010\"\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bJ\u00100R\u0011\u0010#\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bK\u00100R\u0011\u0010$\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bL\u00100R\u0013\u0010%\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\bM\u00100R\u0011\u0010&\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bN\u00100R\u0011\u0010'\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bO\u00100¨\u0006{"}, m3636d2 = {"Lcom/robinhood/targetbackend/Endpoint;", "", "brokebackOAuthClientId", "", "captchaSiteKey", "supportsProductionGooglePay", "", "checkoutUrlOverride", "Lokhttp3/HttpUrl;", "apolloNamespace", "analyticsUrl", "arsenalUrl", "atlasUrl", "bonfireUrl", "brokebackUrl", "cashierUrl", "ceresUrl", "chatbotUrl", "creditCardUrl", "cryptoTransfersUrl", "xsellUrl", "discoveryUrl", "doraUrl", "experimentsUrl", "identiUrl", "inboxRendererUrl", "managedMarketdataUrl", "marketdataUrl", "mediaUrl", "midlandsUrl", "minervaUrl", "nummusUrl", "optionsProductUrl", "pathfinderUrl", "pimsUrl", "plutoUrl", "scrollUrl", "testDataUrl", "websocketGatewayUrl", "portfolioUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLokhttp3/HttpUrl;Ljava/lang/String;Lokhttp3/HttpUrl;Lokhttp3/HttpUrl;Lokhttp3/HttpUrl;Lokhttp3/HttpUrl;Lokhttp3/HttpUrl;Lokhttp3/HttpUrl;Lokhttp3/HttpUrl;Lokhttp3/HttpUrl;Lokhttp3/HttpUrl;Lokhttp3/HttpUrl;Lokhttp3/HttpUrl;Lokhttp3/HttpUrl;Lokhttp3/HttpUrl;Lokhttp3/HttpUrl;Lokhttp3/HttpUrl;Lokhttp3/HttpUrl;Lokhttp3/HttpUrl;Lokhttp3/HttpUrl;Lokhttp3/HttpUrl;Lokhttp3/HttpUrl;Lokhttp3/HttpUrl;Lokhttp3/HttpUrl;Lokhttp3/HttpUrl;Lokhttp3/HttpUrl;Lokhttp3/HttpUrl;Lokhttp3/HttpUrl;Lokhttp3/HttpUrl;Lokhttp3/HttpUrl;Lokhttp3/HttpUrl;Lokhttp3/HttpUrl;)V", "getBrokebackOAuthClientId", "()Ljava/lang/String;", "getCaptchaSiteKey", "getSupportsProductionGooglePay", "()Z", "getCheckoutUrlOverride", "()Lokhttp3/HttpUrl;", "getApolloNamespace", "getAnalyticsUrl", "getArsenalUrl", "getAtlasUrl", "getBonfireUrl", "getBrokebackUrl", "getCashierUrl", "getCeresUrl", "getChatbotUrl", "getCreditCardUrl", "getCryptoTransfersUrl", "getXsellUrl", "getDiscoveryUrl", "getDoraUrl", "getExperimentsUrl", "getIdentiUrl", "getInboxRendererUrl", "getManagedMarketdataUrl", "getMarketdataUrl", "getMediaUrl", "getMidlandsUrl", "getMinervaUrl", "getNummusUrl", "getOptionsProductUrl", "getPathfinderUrl", "getPimsUrl", "getPlutoUrl", "getScrollUrl", "getTestDataUrl", "getWebsocketGatewayUrl", "getPortfolioUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "copy", "equals", "other", "hashCode", "", "toString", "BrokerageStatic", "Companion", "lib-target-backend_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final /* data */ class Endpoint {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String UAT_HOST = "10.0.2.2";
    private static final String UAT_NAMESPACE = "ec-mobile-uat";
    private final HttpUrl analyticsUrl;
    private final String apolloNamespace;
    private final HttpUrl arsenalUrl;
    private final HttpUrl atlasUrl;
    private final HttpUrl bonfireUrl;
    private final String brokebackOAuthClientId;
    private final HttpUrl brokebackUrl;
    private final String captchaSiteKey;
    private final HttpUrl cashierUrl;
    private final HttpUrl ceresUrl;
    private final HttpUrl chatbotUrl;
    private final HttpUrl checkoutUrlOverride;
    private final HttpUrl creditCardUrl;
    private final HttpUrl cryptoTransfersUrl;
    private final HttpUrl discoveryUrl;
    private final HttpUrl doraUrl;
    private final HttpUrl experimentsUrl;
    private final HttpUrl identiUrl;
    private final HttpUrl inboxRendererUrl;
    private final HttpUrl managedMarketdataUrl;
    private final HttpUrl marketdataUrl;
    private final HttpUrl mediaUrl;
    private final HttpUrl midlandsUrl;
    private final HttpUrl minervaUrl;
    private final HttpUrl nummusUrl;
    private final HttpUrl optionsProductUrl;
    private final HttpUrl pathfinderUrl;
    private final HttpUrl pimsUrl;
    private final HttpUrl plutoUrl;
    private final HttpUrl portfolioUrl;
    private final HttpUrl scrollUrl;
    private final boolean supportsProductionGooglePay;
    private final HttpUrl testDataUrl;
    private final HttpUrl websocketGatewayUrl;
    private final HttpUrl xsellUrl;

    public static /* synthetic */ Endpoint copy$default(Endpoint endpoint, String str, String str2, boolean z, HttpUrl httpUrl, String str3, HttpUrl httpUrl2, HttpUrl httpUrl3, HttpUrl httpUrl4, HttpUrl httpUrl5, HttpUrl httpUrl6, HttpUrl httpUrl7, HttpUrl httpUrl8, HttpUrl httpUrl9, HttpUrl httpUrl10, HttpUrl httpUrl11, HttpUrl httpUrl12, HttpUrl httpUrl13, HttpUrl httpUrl14, HttpUrl httpUrl15, HttpUrl httpUrl16, HttpUrl httpUrl17, HttpUrl httpUrl18, HttpUrl httpUrl19, HttpUrl httpUrl20, HttpUrl httpUrl21, HttpUrl httpUrl22, HttpUrl httpUrl23, HttpUrl httpUrl24, HttpUrl httpUrl25, HttpUrl httpUrl26, HttpUrl httpUrl27, HttpUrl httpUrl28, HttpUrl httpUrl29, HttpUrl httpUrl30, HttpUrl httpUrl31, int i, int i2, Object obj) {
        HttpUrl httpUrl32;
        HttpUrl httpUrl33;
        HttpUrl httpUrl34;
        HttpUrl httpUrl35;
        HttpUrl httpUrl36;
        HttpUrl httpUrl37;
        HttpUrl httpUrl38;
        HttpUrl httpUrl39;
        HttpUrl httpUrl40;
        HttpUrl httpUrl41;
        HttpUrl httpUrl42;
        HttpUrl httpUrl43;
        HttpUrl httpUrl44;
        HttpUrl httpUrl45;
        HttpUrl httpUrl46;
        HttpUrl httpUrl47;
        HttpUrl httpUrl48;
        HttpUrl httpUrl49;
        HttpUrl httpUrl50;
        String str4;
        HttpUrl httpUrl51;
        HttpUrl httpUrl52;
        HttpUrl httpUrl53;
        HttpUrl httpUrl54;
        HttpUrl httpUrl55;
        HttpUrl httpUrl56;
        HttpUrl httpUrl57;
        HttpUrl httpUrl58;
        HttpUrl httpUrl59;
        HttpUrl httpUrl60;
        HttpUrl httpUrl61;
        HttpUrl httpUrl62;
        String str5;
        boolean z2;
        String str6 = (i & 1) != 0 ? endpoint.brokebackOAuthClientId : str;
        String str7 = (i & 2) != 0 ? endpoint.captchaSiteKey : str2;
        boolean z3 = (i & 4) != 0 ? endpoint.supportsProductionGooglePay : z;
        HttpUrl httpUrl63 = (i & 8) != 0 ? endpoint.checkoutUrlOverride : httpUrl;
        String str8 = (i & 16) != 0 ? endpoint.apolloNamespace : str3;
        HttpUrl httpUrl64 = (i & 32) != 0 ? endpoint.analyticsUrl : httpUrl2;
        HttpUrl httpUrl65 = (i & 64) != 0 ? endpoint.arsenalUrl : httpUrl3;
        HttpUrl httpUrl66 = (i & 128) != 0 ? endpoint.atlasUrl : httpUrl4;
        HttpUrl httpUrl67 = (i & 256) != 0 ? endpoint.bonfireUrl : httpUrl5;
        HttpUrl httpUrl68 = (i & 512) != 0 ? endpoint.brokebackUrl : httpUrl6;
        HttpUrl httpUrl69 = (i & 1024) != 0 ? endpoint.cashierUrl : httpUrl7;
        HttpUrl httpUrl70 = (i & 2048) != 0 ? endpoint.ceresUrl : httpUrl8;
        HttpUrl httpUrl71 = (i & 4096) != 0 ? endpoint.chatbotUrl : httpUrl9;
        HttpUrl httpUrl72 = (i & 8192) != 0 ? endpoint.creditCardUrl : httpUrl10;
        String str9 = str6;
        HttpUrl httpUrl73 = (i & 16384) != 0 ? endpoint.cryptoTransfersUrl : httpUrl11;
        HttpUrl httpUrl74 = (i & 32768) != 0 ? endpoint.xsellUrl : httpUrl12;
        HttpUrl httpUrl75 = (i & 65536) != 0 ? endpoint.discoveryUrl : httpUrl13;
        HttpUrl httpUrl76 = (i & 131072) != 0 ? endpoint.doraUrl : httpUrl14;
        HttpUrl httpUrl77 = (i & 262144) != 0 ? endpoint.experimentsUrl : httpUrl15;
        HttpUrl httpUrl78 = (i & 524288) != 0 ? endpoint.identiUrl : httpUrl16;
        HttpUrl httpUrl79 = (i & 1048576) != 0 ? endpoint.inboxRendererUrl : httpUrl17;
        HttpUrl httpUrl80 = (i & 2097152) != 0 ? endpoint.managedMarketdataUrl : httpUrl18;
        HttpUrl httpUrl81 = (i & 4194304) != 0 ? endpoint.marketdataUrl : httpUrl19;
        HttpUrl httpUrl82 = (i & 8388608) != 0 ? endpoint.mediaUrl : httpUrl20;
        HttpUrl httpUrl83 = (i & 16777216) != 0 ? endpoint.midlandsUrl : httpUrl21;
        HttpUrl httpUrl84 = (i & 33554432) != 0 ? endpoint.minervaUrl : httpUrl22;
        HttpUrl httpUrl85 = (i & 67108864) != 0 ? endpoint.nummusUrl : httpUrl23;
        HttpUrl httpUrl86 = (i & 134217728) != 0 ? endpoint.optionsProductUrl : httpUrl24;
        HttpUrl httpUrl87 = (i & 268435456) != 0 ? endpoint.pathfinderUrl : httpUrl25;
        HttpUrl httpUrl88 = (i & 536870912) != 0 ? endpoint.pimsUrl : httpUrl26;
        HttpUrl httpUrl89 = (i & 1073741824) != 0 ? endpoint.plutoUrl : httpUrl27;
        HttpUrl httpUrl90 = (i & Integer.MIN_VALUE) != 0 ? endpoint.scrollUrl : httpUrl28;
        HttpUrl httpUrl91 = (i2 & 1) != 0 ? endpoint.testDataUrl : httpUrl29;
        HttpUrl httpUrl92 = (i2 & 2) != 0 ? endpoint.websocketGatewayUrl : httpUrl30;
        if ((i2 & 4) != 0) {
            httpUrl33 = httpUrl92;
            httpUrl32 = endpoint.portfolioUrl;
            httpUrl35 = httpUrl78;
            httpUrl36 = httpUrl79;
            httpUrl37 = httpUrl80;
            httpUrl38 = httpUrl81;
            httpUrl39 = httpUrl82;
            httpUrl40 = httpUrl83;
            httpUrl41 = httpUrl84;
            httpUrl42 = httpUrl85;
            httpUrl43 = httpUrl86;
            httpUrl44 = httpUrl87;
            httpUrl45 = httpUrl88;
            httpUrl46 = httpUrl89;
            httpUrl47 = httpUrl90;
            httpUrl48 = httpUrl91;
            httpUrl49 = httpUrl73;
            str4 = str8;
            httpUrl51 = httpUrl64;
            httpUrl52 = httpUrl65;
            httpUrl53 = httpUrl66;
            httpUrl54 = httpUrl67;
            httpUrl55 = httpUrl68;
            httpUrl56 = httpUrl69;
            httpUrl57 = httpUrl70;
            httpUrl58 = httpUrl71;
            httpUrl59 = httpUrl72;
            httpUrl60 = httpUrl74;
            httpUrl61 = httpUrl75;
            httpUrl62 = httpUrl76;
            httpUrl34 = httpUrl77;
            str5 = str7;
            z2 = z3;
            httpUrl50 = httpUrl63;
        } else {
            httpUrl32 = httpUrl31;
            httpUrl33 = httpUrl92;
            httpUrl34 = httpUrl77;
            httpUrl35 = httpUrl78;
            httpUrl36 = httpUrl79;
            httpUrl37 = httpUrl80;
            httpUrl38 = httpUrl81;
            httpUrl39 = httpUrl82;
            httpUrl40 = httpUrl83;
            httpUrl41 = httpUrl84;
            httpUrl42 = httpUrl85;
            httpUrl43 = httpUrl86;
            httpUrl44 = httpUrl87;
            httpUrl45 = httpUrl88;
            httpUrl46 = httpUrl89;
            httpUrl47 = httpUrl90;
            httpUrl48 = httpUrl91;
            httpUrl49 = httpUrl73;
            httpUrl50 = httpUrl63;
            str4 = str8;
            httpUrl51 = httpUrl64;
            httpUrl52 = httpUrl65;
            httpUrl53 = httpUrl66;
            httpUrl54 = httpUrl67;
            httpUrl55 = httpUrl68;
            httpUrl56 = httpUrl69;
            httpUrl57 = httpUrl70;
            httpUrl58 = httpUrl71;
            httpUrl59 = httpUrl72;
            httpUrl60 = httpUrl74;
            httpUrl61 = httpUrl75;
            httpUrl62 = httpUrl76;
            str5 = str7;
            z2 = z3;
        }
        return endpoint.copy(str9, str5, z2, httpUrl50, str4, httpUrl51, httpUrl52, httpUrl53, httpUrl54, httpUrl55, httpUrl56, httpUrl57, httpUrl58, httpUrl59, httpUrl49, httpUrl60, httpUrl61, httpUrl62, httpUrl34, httpUrl35, httpUrl36, httpUrl37, httpUrl38, httpUrl39, httpUrl40, httpUrl41, httpUrl42, httpUrl43, httpUrl44, httpUrl45, httpUrl46, httpUrl47, httpUrl48, httpUrl33, httpUrl32);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBrokebackOAuthClientId() {
        return this.brokebackOAuthClientId;
    }

    /* renamed from: component10, reason: from getter */
    public final HttpUrl getBrokebackUrl() {
        return this.brokebackUrl;
    }

    /* renamed from: component11, reason: from getter */
    public final HttpUrl getCashierUrl() {
        return this.cashierUrl;
    }

    /* renamed from: component12, reason: from getter */
    public final HttpUrl getCeresUrl() {
        return this.ceresUrl;
    }

    /* renamed from: component13, reason: from getter */
    public final HttpUrl getChatbotUrl() {
        return this.chatbotUrl;
    }

    /* renamed from: component14, reason: from getter */
    public final HttpUrl getCreditCardUrl() {
        return this.creditCardUrl;
    }

    /* renamed from: component15, reason: from getter */
    public final HttpUrl getCryptoTransfersUrl() {
        return this.cryptoTransfersUrl;
    }

    /* renamed from: component16, reason: from getter */
    public final HttpUrl getXsellUrl() {
        return this.xsellUrl;
    }

    /* renamed from: component17, reason: from getter */
    public final HttpUrl getDiscoveryUrl() {
        return this.discoveryUrl;
    }

    /* renamed from: component18, reason: from getter */
    public final HttpUrl getDoraUrl() {
        return this.doraUrl;
    }

    /* renamed from: component19, reason: from getter */
    public final HttpUrl getExperimentsUrl() {
        return this.experimentsUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCaptchaSiteKey() {
        return this.captchaSiteKey;
    }

    /* renamed from: component20, reason: from getter */
    public final HttpUrl getIdentiUrl() {
        return this.identiUrl;
    }

    /* renamed from: component21, reason: from getter */
    public final HttpUrl getInboxRendererUrl() {
        return this.inboxRendererUrl;
    }

    /* renamed from: component22, reason: from getter */
    public final HttpUrl getManagedMarketdataUrl() {
        return this.managedMarketdataUrl;
    }

    /* renamed from: component23, reason: from getter */
    public final HttpUrl getMarketdataUrl() {
        return this.marketdataUrl;
    }

    /* renamed from: component24, reason: from getter */
    public final HttpUrl getMediaUrl() {
        return this.mediaUrl;
    }

    /* renamed from: component25, reason: from getter */
    public final HttpUrl getMidlandsUrl() {
        return this.midlandsUrl;
    }

    /* renamed from: component26, reason: from getter */
    public final HttpUrl getMinervaUrl() {
        return this.minervaUrl;
    }

    /* renamed from: component27, reason: from getter */
    public final HttpUrl getNummusUrl() {
        return this.nummusUrl;
    }

    /* renamed from: component28, reason: from getter */
    public final HttpUrl getOptionsProductUrl() {
        return this.optionsProductUrl;
    }

    /* renamed from: component29, reason: from getter */
    public final HttpUrl getPathfinderUrl() {
        return this.pathfinderUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getSupportsProductionGooglePay() {
        return this.supportsProductionGooglePay;
    }

    /* renamed from: component30, reason: from getter */
    public final HttpUrl getPimsUrl() {
        return this.pimsUrl;
    }

    /* renamed from: component31, reason: from getter */
    public final HttpUrl getPlutoUrl() {
        return this.plutoUrl;
    }

    /* renamed from: component32, reason: from getter */
    public final HttpUrl getScrollUrl() {
        return this.scrollUrl;
    }

    /* renamed from: component33, reason: from getter */
    public final HttpUrl getTestDataUrl() {
        return this.testDataUrl;
    }

    /* renamed from: component34, reason: from getter */
    public final HttpUrl getWebsocketGatewayUrl() {
        return this.websocketGatewayUrl;
    }

    /* renamed from: component35, reason: from getter */
    public final HttpUrl getPortfolioUrl() {
        return this.portfolioUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final HttpUrl getCheckoutUrlOverride() {
        return this.checkoutUrlOverride;
    }

    /* renamed from: component5, reason: from getter */
    public final String getApolloNamespace() {
        return this.apolloNamespace;
    }

    /* renamed from: component6, reason: from getter */
    public final HttpUrl getAnalyticsUrl() {
        return this.analyticsUrl;
    }

    /* renamed from: component7, reason: from getter */
    public final HttpUrl getArsenalUrl() {
        return this.arsenalUrl;
    }

    /* renamed from: component8, reason: from getter */
    public final HttpUrl getAtlasUrl() {
        return this.atlasUrl;
    }

    /* renamed from: component9, reason: from getter */
    public final HttpUrl getBonfireUrl() {
        return this.bonfireUrl;
    }

    public final Endpoint copy(String brokebackOAuthClientId, String captchaSiteKey, boolean supportsProductionGooglePay, HttpUrl checkoutUrlOverride, String apolloNamespace, HttpUrl analyticsUrl, HttpUrl arsenalUrl, HttpUrl atlasUrl, HttpUrl bonfireUrl, HttpUrl brokebackUrl, HttpUrl cashierUrl, HttpUrl ceresUrl, HttpUrl chatbotUrl, HttpUrl creditCardUrl, HttpUrl cryptoTransfersUrl, HttpUrl xsellUrl, HttpUrl discoveryUrl, HttpUrl doraUrl, HttpUrl experimentsUrl, HttpUrl identiUrl, HttpUrl inboxRendererUrl, HttpUrl managedMarketdataUrl, HttpUrl marketdataUrl, HttpUrl mediaUrl, HttpUrl midlandsUrl, HttpUrl minervaUrl, HttpUrl nummusUrl, HttpUrl optionsProductUrl, HttpUrl pathfinderUrl, HttpUrl pimsUrl, HttpUrl plutoUrl, HttpUrl scrollUrl, HttpUrl testDataUrl, HttpUrl websocketGatewayUrl, HttpUrl portfolioUrl) {
        Intrinsics.checkNotNullParameter(brokebackOAuthClientId, "brokebackOAuthClientId");
        Intrinsics.checkNotNullParameter(captchaSiteKey, "captchaSiteKey");
        Intrinsics.checkNotNullParameter(analyticsUrl, "analyticsUrl");
        Intrinsics.checkNotNullParameter(arsenalUrl, "arsenalUrl");
        Intrinsics.checkNotNullParameter(atlasUrl, "atlasUrl");
        Intrinsics.checkNotNullParameter(bonfireUrl, "bonfireUrl");
        Intrinsics.checkNotNullParameter(brokebackUrl, "brokebackUrl");
        Intrinsics.checkNotNullParameter(cashierUrl, "cashierUrl");
        Intrinsics.checkNotNullParameter(ceresUrl, "ceresUrl");
        Intrinsics.checkNotNullParameter(chatbotUrl, "chatbotUrl");
        Intrinsics.checkNotNullParameter(creditCardUrl, "creditCardUrl");
        Intrinsics.checkNotNullParameter(cryptoTransfersUrl, "cryptoTransfersUrl");
        Intrinsics.checkNotNullParameter(xsellUrl, "xsellUrl");
        Intrinsics.checkNotNullParameter(discoveryUrl, "discoveryUrl");
        Intrinsics.checkNotNullParameter(doraUrl, "doraUrl");
        Intrinsics.checkNotNullParameter(experimentsUrl, "experimentsUrl");
        Intrinsics.checkNotNullParameter(identiUrl, "identiUrl");
        Intrinsics.checkNotNullParameter(inboxRendererUrl, "inboxRendererUrl");
        Intrinsics.checkNotNullParameter(managedMarketdataUrl, "managedMarketdataUrl");
        Intrinsics.checkNotNullParameter(marketdataUrl, "marketdataUrl");
        Intrinsics.checkNotNullParameter(mediaUrl, "mediaUrl");
        Intrinsics.checkNotNullParameter(midlandsUrl, "midlandsUrl");
        Intrinsics.checkNotNullParameter(minervaUrl, "minervaUrl");
        Intrinsics.checkNotNullParameter(nummusUrl, "nummusUrl");
        Intrinsics.checkNotNullParameter(optionsProductUrl, "optionsProductUrl");
        Intrinsics.checkNotNullParameter(pathfinderUrl, "pathfinderUrl");
        Intrinsics.checkNotNullParameter(pimsUrl, "pimsUrl");
        Intrinsics.checkNotNullParameter(plutoUrl, "plutoUrl");
        Intrinsics.checkNotNullParameter(scrollUrl, "scrollUrl");
        Intrinsics.checkNotNullParameter(websocketGatewayUrl, "websocketGatewayUrl");
        Intrinsics.checkNotNullParameter(portfolioUrl, "portfolioUrl");
        return new Endpoint(brokebackOAuthClientId, captchaSiteKey, supportsProductionGooglePay, checkoutUrlOverride, apolloNamespace, analyticsUrl, arsenalUrl, atlasUrl, bonfireUrl, brokebackUrl, cashierUrl, ceresUrl, chatbotUrl, creditCardUrl, cryptoTransfersUrl, xsellUrl, discoveryUrl, doraUrl, experimentsUrl, identiUrl, inboxRendererUrl, managedMarketdataUrl, marketdataUrl, mediaUrl, midlandsUrl, minervaUrl, nummusUrl, optionsProductUrl, pathfinderUrl, pimsUrl, plutoUrl, scrollUrl, testDataUrl, websocketGatewayUrl, portfolioUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Endpoint)) {
            return false;
        }
        Endpoint endpoint = (Endpoint) other;
        return Intrinsics.areEqual(this.brokebackOAuthClientId, endpoint.brokebackOAuthClientId) && Intrinsics.areEqual(this.captchaSiteKey, endpoint.captchaSiteKey) && this.supportsProductionGooglePay == endpoint.supportsProductionGooglePay && Intrinsics.areEqual(this.checkoutUrlOverride, endpoint.checkoutUrlOverride) && Intrinsics.areEqual(this.apolloNamespace, endpoint.apolloNamespace) && Intrinsics.areEqual(this.analyticsUrl, endpoint.analyticsUrl) && Intrinsics.areEqual(this.arsenalUrl, endpoint.arsenalUrl) && Intrinsics.areEqual(this.atlasUrl, endpoint.atlasUrl) && Intrinsics.areEqual(this.bonfireUrl, endpoint.bonfireUrl) && Intrinsics.areEqual(this.brokebackUrl, endpoint.brokebackUrl) && Intrinsics.areEqual(this.cashierUrl, endpoint.cashierUrl) && Intrinsics.areEqual(this.ceresUrl, endpoint.ceresUrl) && Intrinsics.areEqual(this.chatbotUrl, endpoint.chatbotUrl) && Intrinsics.areEqual(this.creditCardUrl, endpoint.creditCardUrl) && Intrinsics.areEqual(this.cryptoTransfersUrl, endpoint.cryptoTransfersUrl) && Intrinsics.areEqual(this.xsellUrl, endpoint.xsellUrl) && Intrinsics.areEqual(this.discoveryUrl, endpoint.discoveryUrl) && Intrinsics.areEqual(this.doraUrl, endpoint.doraUrl) && Intrinsics.areEqual(this.experimentsUrl, endpoint.experimentsUrl) && Intrinsics.areEqual(this.identiUrl, endpoint.identiUrl) && Intrinsics.areEqual(this.inboxRendererUrl, endpoint.inboxRendererUrl) && Intrinsics.areEqual(this.managedMarketdataUrl, endpoint.managedMarketdataUrl) && Intrinsics.areEqual(this.marketdataUrl, endpoint.marketdataUrl) && Intrinsics.areEqual(this.mediaUrl, endpoint.mediaUrl) && Intrinsics.areEqual(this.midlandsUrl, endpoint.midlandsUrl) && Intrinsics.areEqual(this.minervaUrl, endpoint.minervaUrl) && Intrinsics.areEqual(this.nummusUrl, endpoint.nummusUrl) && Intrinsics.areEqual(this.optionsProductUrl, endpoint.optionsProductUrl) && Intrinsics.areEqual(this.pathfinderUrl, endpoint.pathfinderUrl) && Intrinsics.areEqual(this.pimsUrl, endpoint.pimsUrl) && Intrinsics.areEqual(this.plutoUrl, endpoint.plutoUrl) && Intrinsics.areEqual(this.scrollUrl, endpoint.scrollUrl) && Intrinsics.areEqual(this.testDataUrl, endpoint.testDataUrl) && Intrinsics.areEqual(this.websocketGatewayUrl, endpoint.websocketGatewayUrl) && Intrinsics.areEqual(this.portfolioUrl, endpoint.portfolioUrl);
    }

    public int hashCode() {
        int iHashCode = ((((this.brokebackOAuthClientId.hashCode() * 31) + this.captchaSiteKey.hashCode()) * 31) + Boolean.hashCode(this.supportsProductionGooglePay)) * 31;
        HttpUrl httpUrl = this.checkoutUrlOverride;
        int iHashCode2 = (iHashCode + (httpUrl == null ? 0 : httpUrl.hashCode())) * 31;
        String str = this.apolloNamespace;
        int iHashCode3 = (((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.analyticsUrl.hashCode()) * 31) + this.arsenalUrl.hashCode()) * 31) + this.atlasUrl.hashCode()) * 31) + this.bonfireUrl.hashCode()) * 31) + this.brokebackUrl.hashCode()) * 31) + this.cashierUrl.hashCode()) * 31) + this.ceresUrl.hashCode()) * 31) + this.chatbotUrl.hashCode()) * 31) + this.creditCardUrl.hashCode()) * 31) + this.cryptoTransfersUrl.hashCode()) * 31) + this.xsellUrl.hashCode()) * 31) + this.discoveryUrl.hashCode()) * 31) + this.doraUrl.hashCode()) * 31) + this.experimentsUrl.hashCode()) * 31) + this.identiUrl.hashCode()) * 31) + this.inboxRendererUrl.hashCode()) * 31) + this.managedMarketdataUrl.hashCode()) * 31) + this.marketdataUrl.hashCode()) * 31) + this.mediaUrl.hashCode()) * 31) + this.midlandsUrl.hashCode()) * 31) + this.minervaUrl.hashCode()) * 31) + this.nummusUrl.hashCode()) * 31) + this.optionsProductUrl.hashCode()) * 31) + this.pathfinderUrl.hashCode()) * 31) + this.pimsUrl.hashCode()) * 31) + this.plutoUrl.hashCode()) * 31) + this.scrollUrl.hashCode()) * 31;
        HttpUrl httpUrl2 = this.testDataUrl;
        return ((((iHashCode3 + (httpUrl2 != null ? httpUrl2.hashCode() : 0)) * 31) + this.websocketGatewayUrl.hashCode()) * 31) + this.portfolioUrl.hashCode();
    }

    public String toString() {
        return "Endpoint(brokebackOAuthClientId=" + this.brokebackOAuthClientId + ", captchaSiteKey=" + this.captchaSiteKey + ", supportsProductionGooglePay=" + this.supportsProductionGooglePay + ", checkoutUrlOverride=" + this.checkoutUrlOverride + ", apolloNamespace=" + this.apolloNamespace + ", analyticsUrl=" + this.analyticsUrl + ", arsenalUrl=" + this.arsenalUrl + ", atlasUrl=" + this.atlasUrl + ", bonfireUrl=" + this.bonfireUrl + ", brokebackUrl=" + this.brokebackUrl + ", cashierUrl=" + this.cashierUrl + ", ceresUrl=" + this.ceresUrl + ", chatbotUrl=" + this.chatbotUrl + ", creditCardUrl=" + this.creditCardUrl + ", cryptoTransfersUrl=" + this.cryptoTransfersUrl + ", xsellUrl=" + this.xsellUrl + ", discoveryUrl=" + this.discoveryUrl + ", doraUrl=" + this.doraUrl + ", experimentsUrl=" + this.experimentsUrl + ", identiUrl=" + this.identiUrl + ", inboxRendererUrl=" + this.inboxRendererUrl + ", managedMarketdataUrl=" + this.managedMarketdataUrl + ", marketdataUrl=" + this.marketdataUrl + ", mediaUrl=" + this.mediaUrl + ", midlandsUrl=" + this.midlandsUrl + ", minervaUrl=" + this.minervaUrl + ", nummusUrl=" + this.nummusUrl + ", optionsProductUrl=" + this.optionsProductUrl + ", pathfinderUrl=" + this.pathfinderUrl + ", pimsUrl=" + this.pimsUrl + ", plutoUrl=" + this.plutoUrl + ", scrollUrl=" + this.scrollUrl + ", testDataUrl=" + this.testDataUrl + ", websocketGatewayUrl=" + this.websocketGatewayUrl + ", portfolioUrl=" + this.portfolioUrl + ")";
    }

    public Endpoint(String brokebackOAuthClientId, String captchaSiteKey, boolean z, HttpUrl httpUrl, String str, HttpUrl analyticsUrl, HttpUrl arsenalUrl, HttpUrl atlasUrl, HttpUrl bonfireUrl, HttpUrl brokebackUrl, HttpUrl cashierUrl, HttpUrl ceresUrl, HttpUrl chatbotUrl, HttpUrl creditCardUrl, HttpUrl cryptoTransfersUrl, HttpUrl xsellUrl, HttpUrl discoveryUrl, HttpUrl doraUrl, HttpUrl experimentsUrl, HttpUrl identiUrl, HttpUrl inboxRendererUrl, HttpUrl managedMarketdataUrl, HttpUrl marketdataUrl, HttpUrl mediaUrl, HttpUrl midlandsUrl, HttpUrl minervaUrl, HttpUrl nummusUrl, HttpUrl optionsProductUrl, HttpUrl pathfinderUrl, HttpUrl pimsUrl, HttpUrl plutoUrl, HttpUrl scrollUrl, HttpUrl httpUrl2, HttpUrl websocketGatewayUrl, HttpUrl portfolioUrl) {
        Intrinsics.checkNotNullParameter(brokebackOAuthClientId, "brokebackOAuthClientId");
        Intrinsics.checkNotNullParameter(captchaSiteKey, "captchaSiteKey");
        Intrinsics.checkNotNullParameter(analyticsUrl, "analyticsUrl");
        Intrinsics.checkNotNullParameter(arsenalUrl, "arsenalUrl");
        Intrinsics.checkNotNullParameter(atlasUrl, "atlasUrl");
        Intrinsics.checkNotNullParameter(bonfireUrl, "bonfireUrl");
        Intrinsics.checkNotNullParameter(brokebackUrl, "brokebackUrl");
        Intrinsics.checkNotNullParameter(cashierUrl, "cashierUrl");
        Intrinsics.checkNotNullParameter(ceresUrl, "ceresUrl");
        Intrinsics.checkNotNullParameter(chatbotUrl, "chatbotUrl");
        Intrinsics.checkNotNullParameter(creditCardUrl, "creditCardUrl");
        Intrinsics.checkNotNullParameter(cryptoTransfersUrl, "cryptoTransfersUrl");
        Intrinsics.checkNotNullParameter(xsellUrl, "xsellUrl");
        Intrinsics.checkNotNullParameter(discoveryUrl, "discoveryUrl");
        Intrinsics.checkNotNullParameter(doraUrl, "doraUrl");
        Intrinsics.checkNotNullParameter(experimentsUrl, "experimentsUrl");
        Intrinsics.checkNotNullParameter(identiUrl, "identiUrl");
        Intrinsics.checkNotNullParameter(inboxRendererUrl, "inboxRendererUrl");
        Intrinsics.checkNotNullParameter(managedMarketdataUrl, "managedMarketdataUrl");
        Intrinsics.checkNotNullParameter(marketdataUrl, "marketdataUrl");
        Intrinsics.checkNotNullParameter(mediaUrl, "mediaUrl");
        Intrinsics.checkNotNullParameter(midlandsUrl, "midlandsUrl");
        Intrinsics.checkNotNullParameter(minervaUrl, "minervaUrl");
        Intrinsics.checkNotNullParameter(nummusUrl, "nummusUrl");
        Intrinsics.checkNotNullParameter(optionsProductUrl, "optionsProductUrl");
        Intrinsics.checkNotNullParameter(pathfinderUrl, "pathfinderUrl");
        Intrinsics.checkNotNullParameter(pimsUrl, "pimsUrl");
        Intrinsics.checkNotNullParameter(plutoUrl, "plutoUrl");
        Intrinsics.checkNotNullParameter(scrollUrl, "scrollUrl");
        Intrinsics.checkNotNullParameter(websocketGatewayUrl, "websocketGatewayUrl");
        Intrinsics.checkNotNullParameter(portfolioUrl, "portfolioUrl");
        this.brokebackOAuthClientId = brokebackOAuthClientId;
        this.captchaSiteKey = captchaSiteKey;
        this.supportsProductionGooglePay = z;
        this.checkoutUrlOverride = httpUrl;
        this.apolloNamespace = str;
        this.analyticsUrl = analyticsUrl;
        this.arsenalUrl = arsenalUrl;
        this.atlasUrl = atlasUrl;
        this.bonfireUrl = bonfireUrl;
        this.brokebackUrl = brokebackUrl;
        this.cashierUrl = cashierUrl;
        this.ceresUrl = ceresUrl;
        this.chatbotUrl = chatbotUrl;
        this.creditCardUrl = creditCardUrl;
        this.cryptoTransfersUrl = cryptoTransfersUrl;
        this.xsellUrl = xsellUrl;
        this.discoveryUrl = discoveryUrl;
        this.doraUrl = doraUrl;
        this.experimentsUrl = experimentsUrl;
        this.identiUrl = identiUrl;
        this.inboxRendererUrl = inboxRendererUrl;
        this.managedMarketdataUrl = managedMarketdataUrl;
        this.marketdataUrl = marketdataUrl;
        this.mediaUrl = mediaUrl;
        this.midlandsUrl = midlandsUrl;
        this.minervaUrl = minervaUrl;
        this.nummusUrl = nummusUrl;
        this.optionsProductUrl = optionsProductUrl;
        this.pathfinderUrl = pathfinderUrl;
        this.pimsUrl = pimsUrl;
        this.plutoUrl = plutoUrl;
        this.scrollUrl = scrollUrl;
        this.testDataUrl = httpUrl2;
        this.websocketGatewayUrl = websocketGatewayUrl;
        this.portfolioUrl = portfolioUrl;
    }

    public /* synthetic */ Endpoint(String str, String str2, boolean z, HttpUrl httpUrl, String str3, HttpUrl httpUrl2, HttpUrl httpUrl3, HttpUrl httpUrl4, HttpUrl httpUrl5, HttpUrl httpUrl6, HttpUrl httpUrl7, HttpUrl httpUrl8, HttpUrl httpUrl9, HttpUrl httpUrl10, HttpUrl httpUrl11, HttpUrl httpUrl12, HttpUrl httpUrl13, HttpUrl httpUrl14, HttpUrl httpUrl15, HttpUrl httpUrl16, HttpUrl httpUrl17, HttpUrl httpUrl18, HttpUrl httpUrl19, HttpUrl httpUrl20, HttpUrl httpUrl21, HttpUrl httpUrl22, HttpUrl httpUrl23, HttpUrl httpUrl24, HttpUrl httpUrl25, HttpUrl httpUrl26, HttpUrl httpUrl27, HttpUrl httpUrl28, HttpUrl httpUrl29, HttpUrl httpUrl30, HttpUrl httpUrl31, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, z, (i & 8) != 0 ? null : httpUrl, (i & 16) != 0 ? null : str3, httpUrl2, httpUrl3, httpUrl4, httpUrl5, httpUrl6, httpUrl7, httpUrl8, httpUrl9, httpUrl10, httpUrl11, httpUrl12, httpUrl13, httpUrl14, httpUrl15, httpUrl16, httpUrl17, httpUrl18, httpUrl19, httpUrl20, httpUrl21, httpUrl22, httpUrl23, httpUrl24, httpUrl25, httpUrl26, httpUrl27, httpUrl28, httpUrl29, httpUrl30, httpUrl31);
    }

    public final String getBrokebackOAuthClientId() {
        return this.brokebackOAuthClientId;
    }

    public final String getCaptchaSiteKey() {
        return this.captchaSiteKey;
    }

    public final boolean getSupportsProductionGooglePay() {
        return this.supportsProductionGooglePay;
    }

    public final HttpUrl getCheckoutUrlOverride() {
        return this.checkoutUrlOverride;
    }

    public final String getApolloNamespace() {
        return this.apolloNamespace;
    }

    public final HttpUrl getAnalyticsUrl() {
        return this.analyticsUrl;
    }

    public final HttpUrl getArsenalUrl() {
        return this.arsenalUrl;
    }

    public final HttpUrl getAtlasUrl() {
        return this.atlasUrl;
    }

    public final HttpUrl getBonfireUrl() {
        return this.bonfireUrl;
    }

    public final HttpUrl getBrokebackUrl() {
        return this.brokebackUrl;
    }

    public final HttpUrl getCashierUrl() {
        return this.cashierUrl;
    }

    public final HttpUrl getCeresUrl() {
        return this.ceresUrl;
    }

    public final HttpUrl getChatbotUrl() {
        return this.chatbotUrl;
    }

    public final HttpUrl getCreditCardUrl() {
        return this.creditCardUrl;
    }

    public final HttpUrl getCryptoTransfersUrl() {
        return this.cryptoTransfersUrl;
    }

    public final HttpUrl getXsellUrl() {
        return this.xsellUrl;
    }

    public final HttpUrl getDiscoveryUrl() {
        return this.discoveryUrl;
    }

    public final HttpUrl getDoraUrl() {
        return this.doraUrl;
    }

    public final HttpUrl getExperimentsUrl() {
        return this.experimentsUrl;
    }

    public final HttpUrl getIdentiUrl() {
        return this.identiUrl;
    }

    public final HttpUrl getInboxRendererUrl() {
        return this.inboxRendererUrl;
    }

    public final HttpUrl getManagedMarketdataUrl() {
        return this.managedMarketdataUrl;
    }

    public final HttpUrl getMarketdataUrl() {
        return this.marketdataUrl;
    }

    public final HttpUrl getMediaUrl() {
        return this.mediaUrl;
    }

    public final HttpUrl getMidlandsUrl() {
        return this.midlandsUrl;
    }

    public final HttpUrl getMinervaUrl() {
        return this.minervaUrl;
    }

    public final HttpUrl getNummusUrl() {
        return this.nummusUrl;
    }

    public final HttpUrl getOptionsProductUrl() {
        return this.optionsProductUrl;
    }

    public final HttpUrl getPathfinderUrl() {
        return this.pathfinderUrl;
    }

    public final HttpUrl getPimsUrl() {
        return this.pimsUrl;
    }

    public final HttpUrl getPlutoUrl() {
        return this.plutoUrl;
    }

    public final HttpUrl getScrollUrl() {
        return this.scrollUrl;
    }

    public final HttpUrl getTestDataUrl() {
        return this.testDataUrl;
    }

    public final HttpUrl getWebsocketGatewayUrl() {
        return this.websocketGatewayUrl;
    }

    public final HttpUrl getPortfolioUrl() {
        return this.portfolioUrl;
    }

    /* compiled from: Endpoint.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/targetbackend/Endpoint$BrokerageStatic;", "", "<init>", "()V", "URL_CDN", "Lokhttp3/HttpUrl;", "getURL_CDN", "()Lokhttp3/HttpUrl;", "URL_APP_ASSETS", "getURL_APP_ASSETS", "URL_STATIC_CONTENT", "getURL_STATIC_CONTENT", "lib-target-backend_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes12.dex */
    public static final class BrokerageStatic {
        public static final BrokerageStatic INSTANCE = new BrokerageStatic();
        private static final HttpUrl URL_APP_ASSETS;
        private static final HttpUrl URL_CDN;
        private static final HttpUrl URL_STATIC_CONTENT;

        private BrokerageStatic() {
        }

        static {
            HttpUrl httpUrl = HttpUrl.INSTANCE.get("https://cdn.robinhood.com");
            URL_CDN = httpUrl;
            URL_APP_ASSETS = httpUrl.newBuilder().addPathSegment("app_assets").build();
            URL_STATIC_CONTENT = httpUrl.newBuilder().addPathSegment("static_content").addPathSegment("").build();
        }

        public final HttpUrl getURL_CDN() {
            return URL_CDN;
        }

        public final HttpUrl getURL_APP_ASSETS() {
            return URL_APP_ASSETS;
        }

        public final HttpUrl getURL_STATIC_CONTENT() {
            return URL_STATIC_CONTENT;
        }
    }

    /* compiled from: Endpoint.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u000b\"\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\bJ\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u0005J\u0010\u0010\u0016\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/targetbackend/Endpoint$Companion;", "", "<init>", "()V", "UAT_NAMESPACE", "", "UAT_HOST", "url", "Lokhttp3/HttpUrl;", "host", "pathSegments", "", "port", "", "plaintext", "", "(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/Integer;Z)Lokhttp3/HttpUrl;", "forDocker", "Lcom/robinhood/targetbackend/Endpoint;", "forApolloNamespace", "namespace", "brokebackOAuthClientId", "forUat", "lib-target-backend_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ HttpUrl url$default(Companion companion, String str, String[] strArr, Integer num, boolean z, int i, Object obj) {
            if ((i & 4) != 0) {
                num = null;
            }
            if ((i & 8) != 0) {
                z = false;
            }
            return companion.url(str, strArr, num, z);
        }

        public final HttpUrl url(String host, String[] pathSegments, Integer port, boolean plaintext) {
            HttpUrl.Builder builderPort;
            Intrinsics.checkNotNullParameter(host, "host");
            Intrinsics.checkNotNullParameter(pathSegments, "pathSegments");
            HttpUrl.Builder builderHost = new HttpUrl.Builder().scheme(plaintext ? "http" : Constants.SCHEME).host(host);
            if (port != null && (builderPort = builderHost.port(port.intValue())) != null) {
                builderHost = builderPort;
            }
            if (!(pathSegments.length == 0)) {
                for (String str : pathSegments) {
                    builderHost.addPathSegment(str);
                }
                builderHost.addPathSegment("");
            }
            return builderHost.build();
        }

        public final Endpoint forDocker(HttpUrl url) {
            Intrinsics.checkNotNullParameter(url, "url");
            return new Endpoint("client_id", "6LcvP5AUAAAAAG7B0_qvdJDcbHroqssFCGrtCy2a", false, Endpoint9.atPath(url, "mock-checkout"), url.getUrl(), Endpoint9.atPath(url, "analytics"), Endpoint9.atPath(url, "arsenal"), Endpoint9.atPath(url, "atlas"), Endpoint9.atPath(url, "bonfire"), url, Endpoint9.atPath(url, "cashier"), Endpoint9.atPath(url, "ceres"), Endpoint9.atPath(url, "chatbot"), Endpoint9.atPath(url, "creditcard"), Endpoint9.atPath(url, "crypto-transfers"), Endpoint9.atPath(url, "banking/cross-sell"), Endpoint9.atPath(url, "discovery"), Endpoint9.atPath(url, "dora"), Endpoint9.atPath(url, "analytics/vegeta/experiments"), Endpoint9.atPath(url, "identi"), Endpoint9.atPath(url, "inbox-renderer"), Endpoint9.atPath(url, "managed-marketdata"), Endpoint9.atPath(url, "marketdata"), Endpoint9.atPath(url, "media"), Endpoint9.atPath(url, "midlands"), Endpoint9.atPath(url, "minerva"), Endpoint9.atPath(url, "nummus"), Endpoint9.atPath(url, "options-product"), Endpoint9.atPath(url, "pathfinder"), Endpoint9.atPath(url, "privacy"), Endpoint9.atPath(url, "pluto"), Endpoint9.atPath(url, "scroll"), Endpoint9.atPath(url, "test-data-api"), Endpoint9.atPath(url, "websocket-gateway"), Endpoint9.atPath(url, AnalyticsStrings.TAB_NAV_TAB_BAR_PORTFOLIO));
        }

        public static /* synthetic */ Endpoint forApolloNamespace$default(Companion companion, String str, String str2, int i, Object obj) {
            if ((i & 2) != 0) {
                str2 = "client_id";
            }
            return companion.forApolloNamespace(str, str2);
        }

        public final Endpoint forApolloNamespace(String namespace, String brokebackOAuthClientId) {
            Intrinsics.checkNotNullParameter(namespace, "namespace");
            Intrinsics.checkNotNullParameter(brokebackOAuthClientId, "brokebackOAuthClientId");
            HttpUrl httpUrlUrl$default = url$default(this, "api--" + namespace + ".apollo.rhinternal.net", new String[0], null, false, 12, null);
            HttpUrl httpUrlUrl$default2 = url$default(this, "discovery--" + namespace + ".apollo.rhinternal.net", new String[0], null, false, 12, null);
            HttpUrl httpUrlUrl$default3 = url$default(this, "ceres--" + namespace + ".apollo.rhinternal.net", new String[0], null, false, 12, null);
            HttpUrl httpUrlUrl$default4 = url$default(this, "managed-marketdata--" + namespace + ".apollo.rhinternal.net", new String[0], null, false, 12, null);
            HttpUrl httpUrlUrl$default5 = url$default(this, "pims--" + namespace + ".apollo.rhinternal.net", new String[0], null, false, 12, null);
            HttpUrl httpUrlUrl$default6 = url$default(this, "pluto--" + namespace + ".apollo.rhinternal.net", new String[0], null, false, 12, null);
            HttpUrl httpUrlUrl$default7 = url$default(this, "inbox-renderer--" + namespace + ".apollo.rhinternal.net", new String[0], null, false, 12, null);
            HttpUrl httpUrlUrl$default8 = url$default(this, "options-product--" + namespace + ".apollo.rhinternal.net", new String[0], null, false, 12, null);
            HttpUrl httpUrlUrl$default9 = url$default(this, "portfolio--" + namespace + ".apollo.rhinternal.net", new String[0], null, false, 12, null);
            return new Endpoint(brokebackOAuthClientId, "6LcvP5AUAAAAAG7B0_qvdJDcbHroqssFCGrtCy2a", false, null, namespace, Endpoint9.atPath(httpUrlUrl$default, "analytics"), Endpoint9.atPath(httpUrlUrl$default, "arsenal"), Endpoint9.atPath(httpUrlUrl$default, "atlas"), Endpoint9.atPath(httpUrlUrl$default, "bonfire"), httpUrlUrl$default, Endpoint9.atPath(httpUrlUrl$default, "cashier"), Endpoint9.atPath(httpUrlUrl$default3, "ceres"), Endpoint9.atPath(httpUrlUrl$default, "chatbot"), url$default(this, "api-staging.x1creditcard.com", new String[]{"creditcard"}, null, false, 12, null), Endpoint9.atPath(httpUrlUrl$default, "crypto-transfers"), url$default(this, "xsell-api.staging.internal.x1.co", new String[]{"banking", "cross-sell"}, null, false, 12, null), httpUrlUrl$default2, Endpoint9.atPath(httpUrlUrl$default, "dora"), Endpoint9.atPath(httpUrlUrl$default, "analytics/vegeta/experiments"), Endpoint9.atPath(httpUrlUrl$default, "identi"), httpUrlUrl$default7, httpUrlUrl$default4, Endpoint9.atPath(httpUrlUrl$default, "marketdata"), Endpoint9.atPath(httpUrlUrl$default, "media"), Endpoint9.atPath(httpUrlUrl$default, "midlands"), Endpoint9.atPath(httpUrlUrl$default, "minerva"), Endpoint9.atPath(httpUrlUrl$default, "nummus"), Endpoint9.atPath(httpUrlUrl$default8, "options-product"), Endpoint9.atPath(httpUrlUrl$default, "pathfinder"), Endpoint9.atPath(httpUrlUrl$default5, "privacy"), httpUrlUrl$default6, Endpoint9.atPath(httpUrlUrl$default, "scroll"), Endpoint9.atPath(httpUrlUrl$default, "test-data-api"), url$default(this, "websocket-gateway--" + namespace + ".apollo.rhinternal.net", new String[0], null, false, 12, null), httpUrlUrl$default9, 8, 0, null);
        }

        public static /* synthetic */ Endpoint forUat$default(Companion companion, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = "client_id";
            }
            return companion.forUat(str);
        }

        public final Endpoint forUat(String brokebackOAuthClientId) {
            Intrinsics.checkNotNullParameter(brokebackOAuthClientId, "brokebackOAuthClientId");
            return Endpoint.copy$default(forApolloNamespace(Endpoint.UAT_NAMESPACE, brokebackOAuthClientId), null, null, false, null, null, null, url(Endpoint.UAT_HOST, new String[0], 10082, true), null, null, url(Endpoint.UAT_HOST, new String[0], 10083, true), null, url(Endpoint.UAT_HOST, new String[0], 10080, true), null, null, null, null, null, null, null, null, null, null, url(Endpoint.UAT_HOST, new String[]{"marketdata"}, 10081, true), null, null, null, null, null, null, null, null, null, null, null, url(Endpoint.UAT_HOST, new String[]{AnalyticsStrings.TAB_NAV_TAB_BAR_PORTFOLIO}, 10084, true), -4196929, 3, null);
        }
    }
}
