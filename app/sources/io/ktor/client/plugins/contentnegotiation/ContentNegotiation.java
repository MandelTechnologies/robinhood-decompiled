package io.ktor.client.plugins.contentnegotiation;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.shared.discovery.sdui.SduiFeatureDiscovery3;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import io.ktor.client.HttpClient;
import io.ktor.client.plugins.HttpClientPlugin;
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation;
import io.ktor.client.request.HttpRequest2;
import io.ktor.client.request.HttpRequestPipeline;
import io.ktor.client.request.UtilsKt;
import io.ktor.client.statement.HttpResponsePipeline;
import io.ktor.client.utils.Content5;
import io.ktor.http.ContentTypeMatcher;
import io.ktor.http.ContentTypes2;
import io.ktor.http.ContentTypes3;
import io.ktor.http.HttpHeaders;
import io.ktor.http.HttpMessageProperties;
import io.ktor.http.Url;
import io.ktor.http.content.OutgoingContent;
import io.ktor.http.content.OutgoingContent2;
import io.ktor.serialization.ContentConverter;
import io.ktor.serialization.ContentConverter2;
import io.ktor.serialization.ContentConverter3;
import io.ktor.util.Attributes2;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.utils.p478io.ByteReadChannelJVM;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.text.Charsets;

/* compiled from: ContentNegotiation.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 \"2\u00020\u0001:\u0002#\"B)\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0010\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0001H\u0080@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJC\u0010\u001b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00142\f\b\u0002\u0010\u0018\u001a\u00060\u0016j\u0002`\u0017H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR$\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, m3636d2 = {"Lio/ktor/client/plugins/contentnegotiation/ContentNegotiation;", "", "", "Lio/ktor/client/plugins/contentnegotiation/ContentNegotiation$Config$ConverterRegistration;", "registrations", "", "Lkotlin/reflect/KClass;", "ignoredTypes", "<init>", "(Ljava/util/List;Ljava/util/Set;)V", "Lio/ktor/client/request/HttpRequestBuilder;", "request", CarResultComposable2.BODY, "convertRequest$ktor_client_content_negotiation", "(Lio/ktor/client/request/HttpRequestBuilder;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "convertRequest", "Lio/ktor/http/Url;", "requestUrl", "Lio/ktor/util/reflect/TypeInfo;", SduiFeatureDiscovery3.INFO_TAG, "Lio/ktor/http/ContentType;", "responseContentType", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", "charset", "convertResponse$ktor_client_content_negotiation", "(Lio/ktor/http/Url;Lio/ktor/util/reflect/TypeInfo;Ljava/lang/Object;Lio/ktor/http/ContentType;Ljava/nio/charset/Charset;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "convertResponse", "Ljava/util/List;", "getRegistrations$ktor_client_content_negotiation", "()Ljava/util/List;", "Ljava/util/Set;", "getIgnoredTypes$ktor_client_content_negotiation", "()Ljava/util/Set;", "Plugin", "Config", "ktor-client-content-negotiation"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class ContentNegotiation {

    /* renamed from: Plugin, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Attributes2<ContentNegotiation> key = new Attributes2<>("ContentNegotiation");
    private final Set<KClass<?>> ignoredTypes;
    private final List<Config.ConverterRegistration> registrations;

    /* JADX WARN: Multi-variable type inference failed */
    public ContentNegotiation(List<Config.ConverterRegistration> registrations, Set<? extends KClass<?>> ignoredTypes) {
        Intrinsics.checkNotNullParameter(registrations, "registrations");
        Intrinsics.checkNotNullParameter(ignoredTypes, "ignoredTypes");
        this.registrations = registrations;
        this.ignoredTypes = ignoredTypes;
    }

    /* compiled from: ContentNegotiation.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJB\u0010\u0011\u001a\u00020\u000e\"\b\b\u0000\u0010\n*\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00028\u00002\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\b\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012JH\u0010\u0011\u001a\u00020\u000e\"\b\b\u0000\u0010\n*\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u00062\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\b\u000f¢\u0006\u0004\b\u0011\u0010\u0015R$\u0010\u0018\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00170\u00168\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, m3636d2 = {"Lio/ktor/client/plugins/contentnegotiation/ContentNegotiation$Config;", "Lio/ktor/serialization/Configuration;", "<init>", "()V", "Lio/ktor/http/ContentType;", "pattern", "Lio/ktor/http/ContentTypeMatcher;", "defaultMatcher", "(Lio/ktor/http/ContentType;)Lio/ktor/http/ContentTypeMatcher;", "Lio/ktor/serialization/ContentConverter;", "T", "contentType", "converter", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "register", "(Lio/ktor/http/ContentType;Lio/ktor/serialization/ContentConverter;Lkotlin/jvm/functions/Function1;)V", "contentTypeToSend", "contentTypeMatcher", "(Lio/ktor/http/ContentType;Lio/ktor/serialization/ContentConverter;Lio/ktor/http/ContentTypeMatcher;Lkotlin/jvm/functions/Function1;)V", "", "Lkotlin/reflect/KClass;", "ignoredTypes", "Ljava/util/Set;", "getIgnoredTypes$ktor_client_content_negotiation", "()Ljava/util/Set;", "", "Lio/ktor/client/plugins/contentnegotiation/ContentNegotiation$Config$ConverterRegistration;", "registrations", "Ljava/util/List;", "getRegistrations$ktor_client_content_negotiation", "()Ljava/util/List;", "ConverterRegistration", "ktor-client-content-negotiation"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    public static final class Config implements ContentConverter2 {
        private final Set<KClass<?>> ignoredTypes = CollectionsKt.toMutableSet(SetsKt.plus((Set) DefaultIgnoredTypesJvm.getDefaultIgnoredTypes(), (Iterable) ContentNegotiation9.getDefaultCommonIgnoredTypes()));
        private final List<ConverterRegistration> registrations = new ArrayList();

        /* compiled from: ContentNegotiation.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Lio/ktor/client/plugins/contentnegotiation/ContentNegotiation$Config$ConverterRegistration;", "", "converter", "Lio/ktor/serialization/ContentConverter;", "contentTypeToSend", "Lio/ktor/http/ContentType;", "contentTypeMatcher", "Lio/ktor/http/ContentTypeMatcher;", "(Lio/ktor/serialization/ContentConverter;Lio/ktor/http/ContentType;Lio/ktor/http/ContentTypeMatcher;)V", "getContentTypeMatcher", "()Lio/ktor/http/ContentTypeMatcher;", "getContentTypeToSend", "()Lio/ktor/http/ContentType;", "getConverter", "()Lio/ktor/serialization/ContentConverter;", "ktor-client-content-negotiation"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
        public static final class ConverterRegistration {
            private final ContentTypeMatcher contentTypeMatcher;
            private final ContentTypes2 contentTypeToSend;
            private final ContentConverter converter;

            public ConverterRegistration(ContentConverter converter, ContentTypes2 contentTypeToSend, ContentTypeMatcher contentTypeMatcher) {
                Intrinsics.checkNotNullParameter(converter, "converter");
                Intrinsics.checkNotNullParameter(contentTypeToSend, "contentTypeToSend");
                Intrinsics.checkNotNullParameter(contentTypeMatcher, "contentTypeMatcher");
                this.converter = converter;
                this.contentTypeToSend = contentTypeToSend;
                this.contentTypeMatcher = contentTypeMatcher;
            }

            public final ContentConverter getConverter() {
                return this.converter;
            }

            public final ContentTypes2 getContentTypeToSend() {
                return this.contentTypeToSend;
            }

            public final ContentTypeMatcher getContentTypeMatcher() {
                return this.contentTypeMatcher;
            }
        }

        public final Set<KClass<?>> getIgnoredTypes$ktor_client_content_negotiation() {
            return this.ignoredTypes;
        }

        public final List<ConverterRegistration> getRegistrations$ktor_client_content_negotiation() {
            return this.registrations;
        }

        @Override // io.ktor.serialization.ContentConverter2
        public <T extends ContentConverter> void register(ContentTypes2 contentType, T converter, Function1<? super T, Unit> configuration) {
            Intrinsics.checkNotNullParameter(contentType, "contentType");
            Intrinsics.checkNotNullParameter(converter, "converter");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            register(contentType, converter, Intrinsics.areEqual(contentType, ContentTypes2.Application.INSTANCE.getJson()) ? JsonContentTypeMatcher.INSTANCE : defaultMatcher(contentType), configuration);
        }

        public final <T extends ContentConverter> void register(ContentTypes2 contentTypeToSend, T converter, ContentTypeMatcher contentTypeMatcher, Function1<? super T, Unit> configuration) {
            Intrinsics.checkNotNullParameter(contentTypeToSend, "contentTypeToSend");
            Intrinsics.checkNotNullParameter(converter, "converter");
            Intrinsics.checkNotNullParameter(contentTypeMatcher, "contentTypeMatcher");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            configuration.invoke(converter);
            this.registrations.add(new ConverterRegistration(converter, contentTypeToSend, contentTypeMatcher));
        }

        private final ContentTypeMatcher defaultMatcher(final ContentTypes2 pattern) {
            return new ContentTypeMatcher() { // from class: io.ktor.client.plugins.contentnegotiation.ContentNegotiation$Config$defaultMatcher$1
                @Override // io.ktor.http.ContentTypeMatcher
                public boolean contains(ContentTypes2 contentType) {
                    Intrinsics.checkNotNullParameter(contentType, "contentType");
                    return contentType.match(pattern);
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0247 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0248  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x0209 -> B:72:0x020f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object convertRequest$ktor_client_content_negotiation(HttpRequest2 httpRequest2, Object obj, Continuation<Object> continuation) {
        ContentNegotiation6 contentNegotiation6;
        Object obj2;
        Iterator it;
        List list;
        ContentTypes2 contentTypes2;
        ContentNegotiation6 contentNegotiation62;
        if (continuation instanceof ContentNegotiation6) {
            contentNegotiation6 = (ContentNegotiation6) continuation;
            int i = contentNegotiation6.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                contentNegotiation6.label = i - Integer.MIN_VALUE;
            } else {
                contentNegotiation6 = new ContentNegotiation6(this, continuation);
            }
        }
        Object obj3 = contentNegotiation6.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = contentNegotiation6.label;
        OutgoingContent outgoingContent = null;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj3);
            for (Config.ConverterRegistration converterRegistration : this.registrations) {
                ContentNegotiation9.LOGGER.trace("Adding Accept=" + converterRegistration.getContentTypeToSend().getContentType() + " header for " + httpRequest2.getUrl());
                if (!httpRequest2.getHeaders().contains(HttpHeaders.INSTANCE.getAccept(), converterRegistration.getContentTypeToSend().toString())) {
                    UtilsKt.accept(httpRequest2, converterRegistration.getContentTypeToSend());
                }
            }
            if (!(obj instanceof OutgoingContent)) {
                Set<KClass<?>> set = this.ignoredTypes;
                if (!(set instanceof Collection) || !set.isEmpty()) {
                    Iterator<T> it2 = set.iterator();
                    while (it2.hasNext()) {
                        if (((KClass) it2.next()).isInstance(obj)) {
                        }
                    }
                }
                ContentTypes2 contentTypes2ContentType = HttpMessageProperties.contentType(httpRequest2);
                if (contentTypes2ContentType == null) {
                    ContentNegotiation9.LOGGER.trace("Request doesn't have Content-Type header. Skipping ContentNegotiation for " + httpRequest2.getUrl() + '.');
                    return null;
                }
                if (obj instanceof Unit) {
                    ContentNegotiation9.LOGGER.trace("Sending empty body for " + httpRequest2.getUrl());
                    httpRequest2.getHeaders().remove(HttpHeaders.INSTANCE.getContentType());
                    return Content5.INSTANCE;
                }
                List<Config.ConverterRegistration> list2 = this.registrations;
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : list2) {
                    if (((Config.ConverterRegistration) obj4).getContentTypeMatcher().contains(contentTypes2ContentType)) {
                        arrayList.add(obj4);
                    }
                }
                if (arrayList.isEmpty()) {
                    arrayList = null;
                }
                if (arrayList == null) {
                    ContentNegotiation9.LOGGER.trace("None of the registered converters match request Content-Type=" + contentTypes2ContentType + ". Skipping ContentNegotiation for " + httpRequest2.getUrl() + '.');
                    return null;
                }
                if (httpRequest2.getBodyType() == null) {
                    ContentNegotiation9.LOGGER.trace("Request has unknown body type. Skipping ContentNegotiation for " + httpRequest2.getUrl() + '.');
                    return null;
                }
                httpRequest2.getHeaders().remove(HttpHeaders.INSTANCE.getContentType());
                obj2 = obj;
                it = arrayList.iterator();
                list = arrayList;
                contentTypes2 = contentTypes2ContentType;
                contentNegotiation62 = contentNegotiation6;
                if (it.hasNext()) {
                }
                if (outgoingContent != null) {
                }
            }
            ContentNegotiation9.LOGGER.trace("Body type " + Reflection.getOrCreateKotlinClass(obj.getClass()) + " is in ignored types. Skipping ContentNegotiation for " + httpRequest2.getUrl() + '.');
            return null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Config.ConverterRegistration converterRegistration2 = (Config.ConverterRegistration) contentNegotiation6.L$5;
        it = (Iterator) contentNegotiation6.L$4;
        list = (List) contentNegotiation6.L$3;
        ContentTypes2 contentTypes22 = (ContentTypes2) contentNegotiation6.L$2;
        Object obj5 = contentNegotiation6.L$1;
        HttpRequest2 httpRequest22 = (HttpRequest2) contentNegotiation6.L$0;
        ResultKt.throwOnFailure(obj3);
        contentNegotiation62 = contentNegotiation6;
        OutgoingContent outgoingContent2 = (OutgoingContent) obj3;
        if (outgoingContent2 != null) {
            ContentNegotiation9.LOGGER.trace("Converted request body using " + converterRegistration2.getConverter() + " for " + httpRequest22.getUrl());
        }
        if (outgoingContent2 == null) {
            outgoingContent = outgoingContent2;
            obj2 = obj5;
            contentTypes2 = contentTypes22;
            if (outgoingContent != null) {
                return outgoingContent;
            }
            throw new ContentNegotiation2("Can't convert " + obj2 + " with contentType " + contentTypes2 + " using converters " + CollectionsKt.joinToString$default(list, null, null, null, 0, null, new Function1<Config.ConverterRegistration, CharSequence>() { // from class: io.ktor.client.plugins.contentnegotiation.ContentNegotiation$convertRequest$serializedContent$2
                @Override // kotlin.jvm.functions.Function1
                public final CharSequence invoke(ContentNegotiation.Config.ConverterRegistration it3) {
                    Intrinsics.checkNotNullParameter(it3, "it");
                    return it3.getConverter().toString();
                }
            }, 31, null));
        }
        obj2 = obj5;
        httpRequest2 = httpRequest22;
        contentTypes2 = contentTypes22;
        if (it.hasNext()) {
            Config.ConverterRegistration converterRegistration3 = (Config.ConverterRegistration) it.next();
            ContentConverter converter = converterRegistration3.getConverter();
            Charset charset = ContentTypes3.charset(contentTypes2);
            if (charset == null) {
                charset = Charsets.UTF_8;
            }
            TypeInfo bodyType = httpRequest2.getBodyType();
            Intrinsics.checkNotNull(bodyType);
            Object obj6 = !Intrinsics.areEqual(obj2, OutgoingContent2.INSTANCE) ? obj2 : null;
            contentNegotiation62.L$0 = httpRequest2;
            contentNegotiation62.L$1 = obj2;
            contentNegotiation62.L$2 = contentTypes2;
            contentNegotiation62.L$3 = list;
            contentNegotiation62.L$4 = it;
            contentNegotiation62.L$5 = converterRegistration3;
            contentNegotiation62.label = 1;
            Object objSerializeNullable = converter.serializeNullable(contentTypes2, charset, bodyType, obj6, contentNegotiation62);
            if (objSerializeNullable == coroutine_suspended) {
                return coroutine_suspended;
            }
            ContentTypes2 contentTypes23 = contentTypes2;
            obj5 = obj2;
            obj3 = objSerializeNullable;
            contentTypes22 = contentTypes23;
            httpRequest22 = httpRequest2;
            converterRegistration2 = converterRegistration3;
            OutgoingContent outgoingContent22 = (OutgoingContent) obj3;
            if (outgoingContent22 != null) {
            }
            if (outgoingContent22 == null) {
            }
        }
        if (outgoingContent != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object convertResponse$ktor_client_content_negotiation(Url url, TypeInfo typeInfo, Object obj, ContentTypes2 contentTypes2, Charset charset, Continuation<Object> continuation) {
        ContentNegotiation8 contentNegotiation8;
        if (continuation instanceof ContentNegotiation8) {
            contentNegotiation8 = (ContentNegotiation8) continuation;
            int i = contentNegotiation8.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                contentNegotiation8.label = i - Integer.MIN_VALUE;
            } else {
                contentNegotiation8 = new ContentNegotiation8(this, continuation);
            }
        }
        Object objDeserialize = contentNegotiation8.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = contentNegotiation8.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objDeserialize);
            if (!(obj instanceof ByteReadChannelJVM)) {
                ContentNegotiation9.LOGGER.trace("Response body is already transformed. Skipping ContentNegotiation for " + url + '.');
                return null;
            }
            if (this.ignoredTypes.contains(typeInfo.getType())) {
                ContentNegotiation9.LOGGER.trace("Response body type " + typeInfo.getType() + " is in ignored types. Skipping ContentNegotiation for " + url + '.');
                return null;
            }
            List<Config.ConverterRegistration> list = this.registrations;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (((Config.ConverterRegistration) obj2).getContentTypeMatcher().contains(contentTypes2)) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((Config.ConverterRegistration) it.next()).getConverter());
            }
            if (arrayList2.isEmpty()) {
                arrayList2 = null;
            }
            if (arrayList2 == null) {
                ContentNegotiation9.LOGGER.trace("None of the registered converters match response with Content-Type=" + contentTypes2 + ". Skipping ContentNegotiation for " + url + '.');
                return null;
            }
            contentNegotiation8.L$0 = url;
            contentNegotiation8.label = 1;
            objDeserialize = ContentConverter3.deserialize(arrayList2, (ByteReadChannelJVM) obj, typeInfo, charset, contentNegotiation8);
            if (objDeserialize == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            url = (Url) contentNegotiation8.L$0;
            ResultKt.throwOnFailure(objDeserialize);
        }
        if (!(objDeserialize instanceof ByteReadChannelJVM)) {
            ContentNegotiation9.LOGGER.trace("Response body was converted to " + Reflection.getOrCreateKotlinClass(objDeserialize.getClass()) + " for " + url + '.');
        }
        return objDeserialize;
    }

    /* compiled from: ContentNegotiation.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0016J!\u0010\u000e\u001a\u00020\u00032\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\u0010¢\u0006\u0002\b\u0011H\u0016R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, m3636d2 = {"Lio/ktor/client/plugins/contentnegotiation/ContentNegotiation$Plugin;", "Lio/ktor/client/plugins/HttpClientPlugin;", "Lio/ktor/client/plugins/contentnegotiation/ContentNegotiation$Config;", "Lio/ktor/client/plugins/contentnegotiation/ContentNegotiation;", "()V", "key", "Lio/ktor/util/AttributeKey;", "getKey", "()Lio/ktor/util/AttributeKey;", "install", "", "plugin", "scope", "Lio/ktor/client/HttpClient;", "prepare", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "ktor-client-content-negotiation"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    /* renamed from: io.ktor.client.plugins.contentnegotiation.ContentNegotiation$Plugin, reason: from kotlin metadata */
    public static final class Companion implements HttpClientPlugin<Config, ContentNegotiation> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public Attributes2<ContentNegotiation> getKey() {
            return ContentNegotiation.key;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.ktor.client.plugins.HttpClientPlugin
        public ContentNegotiation prepare(Function1<? super Config, Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            Config config = new Config();
            block.invoke(config);
            return new ContentNegotiation(config.getRegistrations$ktor_client_content_negotiation(), config.getIgnoredTypes$ktor_client_content_negotiation());
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public void install(ContentNegotiation plugin, HttpClient scope) {
            Intrinsics.checkNotNullParameter(plugin, "plugin");
            Intrinsics.checkNotNullParameter(scope, "scope");
            scope.getRequestPipeline().intercept(HttpRequestPipeline.INSTANCE.getTransform(), new ContentNegotiation4(plugin, null));
            scope.getResponsePipeline().intercept(HttpResponsePipeline.INSTANCE.getTransform(), new ContentNegotiation5(plugin, null));
        }
    }
}
