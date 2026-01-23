package com.twilio.conversations.media;

import com.robinhood.android.util.notification.RhGcmListenerService;
import com.twilio.conversations.MediaCategory;
import com.twilio.conversations.MediaUploadListener2;
import com.twilio.twilsock.util.ProxyInfo;
import com.twilio.twilsock.util.SslContext;
import com.twilio.util.InternalUtils3;
import com.twilio.util.TwilioLogger;
import com.twilio.util.TwilioLogger3;
import io.ktor.client.HttpClient;
import io.ktor.client.HttpClient4;
import io.ktor.client.HttpClientConfig;
import io.ktor.client.engine.android.Android;
import io.ktor.client.engine.android.AndroidEngineConfig;
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation;
import io.ktor.serialization.kotlinx.json.JsonSupport;
import io.ktor.utils.p478io.core.Input;
import io.ktor.utils.p478io.streams.Input4;
import java.io.InputStream;
import java.net.Authenticator;
import java.net.InetSocketAddress;
import java.net.Proxy;
import javax.net.ssl.HttpsURLConnection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json4;
import kotlinx.serialization.json.Json6;

/* compiled from: mediaFactory.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001aH\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0000\u001aI\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00032\u0019\b\u0002\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016¢\u0006\u0002\b\u0019H\u0080\bø\u0001\u0000\u001a,\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\f2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0000\u001a\u0014\u0010\u001d\u001a\u00020\u0018*\u00020\u001e2\u0006\u0010\u000b\u001a\u00020\fH\u0002\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001f"}, m3636d2 = {"createMediaClient", "Lcom/twilio/conversations/media/MediaClient;", "serviceUrl", "", "mediaSetUrl", "productId", "token", "certificates", "maxActiveUploads", "", "httpConnectionTimeout", "useProxy", "", "createMediaUploadItem", "Lcom/twilio/conversations/media/MediaUploadItem;", "inputStream", "Ljava/io/InputStream;", "contentType", RhGcmListenerService.EXTRA_CATEGORY, "Lcom/twilio/conversations/MediaCategory;", "filename", "listenerBuilder", "Lkotlin/Function1;", "Lcom/twilio/conversations/MediaUploadListenerBuilder;", "", "Lkotlin/ExtensionFunctionType;", "createHttpClient", "Lio/ktor/client/HttpClient;", "useCertificates", "setupProxy", "Lio/ktor/client/engine/android/AndroidEngineConfig;", "convo-android_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.twilio.conversations.media.MediaFactoryKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class mediaFactory {
    public static final MediaClient createMediaClient(String serviceUrl, String mediaSetUrl, String productId, String token, String certificates, int i, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(serviceUrl, "serviceUrl");
        Intrinsics.checkNotNullParameter(mediaSetUrl, "mediaSetUrl");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(certificates, "certificates");
        return new MediaClient(new MediaTransportImpl(token, serviceUrl, mediaSetUrl, productId, createHttpClient$default(i2, certificates, false, z, 4, null)), i, 0L, 4, null);
    }

    public static /* synthetic */ MediaUploadItem createMediaUploadItem$default(InputStream inputStream, String contentType, MediaCategory category, String str, Function1 listenerBuilder, int i, Object obj) {
        if ((i & 8) != 0) {
            str = "";
        }
        String filename = str;
        if ((i & 16) != 0) {
            listenerBuilder = new Function1<MediaUploadListener2, Unit>() { // from class: com.twilio.conversations.media.MediaFactoryKt.createMediaUploadItem.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(MediaUploadListener2 mediaUploadListener2) {
                    Intrinsics.checkNotNullParameter(mediaUploadListener2, "<this>");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(MediaUploadListener2 mediaUploadListener2) {
                    invoke2(mediaUploadListener2);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(filename, "filename");
        Intrinsics.checkNotNullParameter(listenerBuilder, "listenerBuilder");
        Input inputAsInput$default = Input4.asInput$default(inputStream, null, 1, null);
        MediaUploadListener2 mediaUploadListener2 = new MediaUploadListener2();
        listenerBuilder.invoke(mediaUploadListener2);
        return new MediaUploadItem(inputAsInput$default, contentType, category, filename, mediaUploadListener2.build());
    }

    public static final MediaUploadItem createMediaUploadItem(InputStream inputStream, String contentType, MediaCategory category, String filename, Function1<? super MediaUploadListener2, Unit> listenerBuilder) {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(filename, "filename");
        Intrinsics.checkNotNullParameter(listenerBuilder, "listenerBuilder");
        Input inputAsInput$default = Input4.asInput$default(inputStream, null, 1, null);
        MediaUploadListener2 mediaUploadListener2 = new MediaUploadListener2();
        listenerBuilder.invoke(mediaUploadListener2);
        return new MediaUploadItem(inputAsInput$default, contentType, category, filename, mediaUploadListener2.build());
    }

    public static /* synthetic */ HttpClient createHttpClient$default(int i, String str, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = true;
        }
        if ((i2 & 8) != 0) {
            z2 = false;
        }
        return createHttpClient(i, str, z, z2);
    }

    public static final HttpClient createHttpClient(final int i, final String certificates, final boolean z, final boolean z2) {
        Intrinsics.checkNotNullParameter(certificates, "certificates");
        return HttpClient4.HttpClient(Android.INSTANCE, new Function1() { // from class: com.twilio.conversations.media.MediaFactoryKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return mediaFactory.createHttpClient$lambda$4(i, z, z2, certificates, (HttpClientConfig) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createHttpClient$lambda$4(final int i, final boolean z, final boolean z2, final String certificates, HttpClientConfig HttpClient) {
        Intrinsics.checkNotNullParameter(certificates, "$certificates");
        Intrinsics.checkNotNullParameter(HttpClient, "$this$HttpClient");
        HttpClient.setExpectSuccess(true);
        HttpClient.engine(new Function1() { // from class: com.twilio.conversations.media.MediaFactoryKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return mediaFactory.createHttpClient$lambda$4$lambda$1(i, z, z2, certificates, (AndroidEngineConfig) obj);
            }
        });
        HttpClient.install(ContentNegotiation.INSTANCE, new Function1() { // from class: com.twilio.conversations.media.MediaFactoryKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return mediaFactory.createHttpClient$lambda$4$lambda$3((ContentNegotiation.Config) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createHttpClient$lambda$4$lambda$1(int i, boolean z, boolean z2, final String certificates, AndroidEngineConfig engine) {
        Intrinsics.checkNotNullParameter(certificates, "$certificates");
        Intrinsics.checkNotNullParameter(engine, "$this$engine");
        engine.setConnectTimeout(i);
        engine.setSocketTimeout(i);
        if (z) {
            engine.setSslManager(new Function1() { // from class: com.twilio.conversations.media.MediaFactoryKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return mediaFactory.createHttpClient$lambda$4$lambda$1$lambda$0(certificates, (HttpsURLConnection) obj);
                }
            });
        }
        setupProxy(engine, z2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createHttpClient$lambda$4$lambda$1$lambda$0(String certificates, HttpsURLConnection it) {
        Intrinsics.checkNotNullParameter(certificates, "$certificates");
        Intrinsics.checkNotNullParameter(it, "it");
        it.setSSLSocketFactory(SslContext.SslContext(InternalUtils3.splitCertificates(certificates)).getSocketFactory());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createHttpClient$lambda$4$lambda$3(ContentNegotiation.Config install) {
        Intrinsics.checkNotNullParameter(install, "$this$install");
        JsonSupport.json$default(install, Json6.Json$default(null, new Function1() { // from class: com.twilio.conversations.media.MediaFactoryKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return mediaFactory.createHttpClient$lambda$4$lambda$3$lambda$2((Json4) obj);
            }
        }, 1, null), null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createHttpClient$lambda$4$lambda$3$lambda$2(Json4 Json) {
        Intrinsics.checkNotNullParameter(Json, "$this$Json");
        Json.setIgnoreUnknownKeys(true);
        return Unit.INSTANCE;
    }

    private static final void setupProxy(AndroidEngineConfig androidEngineConfig, boolean z) {
        androidEngineConfig.setProxy(Proxy.NO_PROXY);
        if (z) {
            ProxyInfo proxyInfo = new ProxyInfo();
            if (proxyInfo.getHost() == null) {
                TwilioLogger.i$default(TwilioLogger3.getLogger(androidEngineConfig), "Proxy info is not set", (Throwable) null, 2, (Object) null);
                return;
            }
            TwilioLogger.i$default(TwilioLogger3.getLogger(androidEngineConfig), "AndroidEngineConfig: Using proxy: " + proxyInfo.getHost() + ':' + proxyInfo.getPort(), (Throwable) null, 2, (Object) null);
            if (proxyInfo.getUser() != null) {
                Authenticator.setDefault(new mediaFactory2(proxyInfo));
            }
            androidEngineConfig.setProxy(new Proxy(Proxy.Type.HTTP, new InetSocketAddress(proxyInfo.getHost(), proxyInfo.getPort())));
        }
    }
}
