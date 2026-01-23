package com.robinhood.contentful.repository;

import android.net.Uri;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.contentful.model.AssetDetail;
import com.robinhood.contentful.model.AssetResource;
import com.robinhood.contentful.model.ContentResource;
import com.robinhood.contentful.model.ContentResource6;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.model.ResourceLink;
import com.robinhood.shared.i18n.locale.SupportedLocaleRepository;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okio.Source;

/* compiled from: ContentRepository.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J<\u0010\u0006\u001a\u0002H\u0007\"\b\b\u0000\u0010\u0007*\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0006\b\u0000\u0012\u0002H\u00070\n2\u0006\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH¦@¢\u0006\u0002\u0010\u000fJ2\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0011\"\b\b\u0000\u0010\u0007*\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096@¢\u0006\u0002\u0010\u0012J2\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0014\"\b\b\u0000\u0010\u0007*\u00020\u00152\u0006\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096@¢\u0006\u0002\u0010\u0012J2\u0010\u0006\u001a\u0002H\u0007\"\b\b\u0000\u0010\u0007*\u00020\b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00070\u00172\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096@¢\u0006\u0002\u0010\u0018J&\u0010\u0019\u001a\u00020\u001a2\n\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u001c2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH¦@¢\u0006\u0002\u0010\u001dJ(\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u001c2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH¦@¢\u0006\u0002\u0010\u001dR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006 "}, m3636d2 = {"Lcom/robinhood/contentful/repository/ContentRepository;", "", "supportedLocaleRepository", "Lcom/robinhood/shared/i18n/locale/SupportedLocaleRepository;", "getSupportedLocaleRepository", "()Lcom/robinhood/shared/i18n/locale/SupportedLocaleRepository;", AnalyticsStrings.NOTIF_STACK_EVENT_LOAD, "T", "Lcom/robinhood/contentful/model/IdentifiableResource;", "type", "Lcom/robinhood/contentful/model/ContentResource$Type;", "id", "", "localeOverride", "Ljava/util/Locale;", "(Lcom/robinhood/contentful/model/ContentResource$Type;Ljava/lang/String;Ljava/util/Locale;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadEntry", "Lcom/robinhood/contentful/model/EntryResource;", "(Ljava/lang/String;Ljava/util/Locale;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadAsset", "Lcom/robinhood/contentful/model/AssetResource;", "Lcom/robinhood/contentful/model/AssetDetail;", "link", "Lcom/robinhood/contentful/model/ResourceLink;", "(Lcom/robinhood/contentful/model/ResourceLink;Ljava/util/Locale;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "open", "Lokio/Source;", "file", "Lcom/robinhood/contentful/model/AssetResource$File;", "(Lcom/robinhood/contentful/model/AssetResource$File;Ljava/util/Locale;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUri", "Landroid/net/Uri;", "lib-contentful_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public interface ContentRepository {
    SupportedLocaleRepository getSupportedLocaleRepository();

    Object getUri(AssetResource.File<?> file, Locale locale, Continuation<? super Uri> continuation);

    <T extends ContentResource6> Object load(ContentResource.Type<? super T> type2, String str, Locale locale, Continuation<? super T> continuation);

    <T extends ContentResource6> Object load(ResourceLink<T> resourceLink, Locale locale, Continuation<? super T> continuation);

    <T extends AssetDetail> Object loadAsset(String str, Locale locale, Continuation<? super AssetResource<T>> continuation);

    <T> Object loadEntry(String str, Locale locale, Continuation<? super EntryResource<T>> continuation);

    Object open(AssetResource.File<?> file, Locale locale, Continuation<? super Source> continuation);

    /* compiled from: ContentRepository.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object load$default(ContentRepository contentRepository, ContentResource.Type type2, String str, Locale locale, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: load");
            }
            if ((i & 4) != 0) {
                locale = null;
            }
            return contentRepository.load(type2, str, locale, continuation);
        }

        public static /* synthetic */ Object loadEntry$default(ContentRepository contentRepository, String str, Locale locale, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadEntry");
            }
            if ((i & 2) != 0) {
                locale = null;
            }
            return contentRepository.loadEntry(str, locale, continuation);
        }

        public static <T> Object loadEntry(ContentRepository contentRepository, String str, Locale locale, Continuation<? super EntryResource<T>> continuation) {
            return contentRepository.load(ContentResource.Type.Entry.INSTANCE, str, locale, continuation);
        }

        public static /* synthetic */ Object loadAsset$default(ContentRepository contentRepository, String str, Locale locale, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadAsset");
            }
            if ((i & 2) != 0) {
                locale = null;
            }
            return contentRepository.loadAsset(str, locale, continuation);
        }

        public static <T extends AssetDetail> Object loadAsset(ContentRepository contentRepository, String str, Locale locale, Continuation<? super AssetResource<T>> continuation) {
            return contentRepository.load(ContentResource.Type.Asset.INSTANCE, str, locale, continuation);
        }

        public static /* synthetic */ Object load$default(ContentRepository contentRepository, ResourceLink resourceLink, Locale locale, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: load");
            }
            if ((i & 2) != 0) {
                locale = null;
            }
            return contentRepository.load(resourceLink, locale, continuation);
        }

        public static <T extends ContentResource6> Object load(ContentRepository contentRepository, ResourceLink<T> resourceLink, Locale locale, Continuation<? super T> continuation) {
            return contentRepository.load(resourceLink.getSys().getReferentType(), resourceLink.getSys().getId(), locale, continuation);
        }

        public static /* synthetic */ Object open$default(ContentRepository contentRepository, AssetResource.File file, Locale locale, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: open");
            }
            if ((i & 2) != 0) {
                locale = null;
            }
            return contentRepository.open(file, locale, continuation);
        }

        public static /* synthetic */ Object getUri$default(ContentRepository contentRepository, AssetResource.File file, Locale locale, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getUri");
            }
            if ((i & 2) != 0) {
                locale = null;
            }
            return contentRepository.getUri(file, locale, continuation);
        }
    }
}
