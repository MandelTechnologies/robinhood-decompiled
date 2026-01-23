package com.robinhood.contentful.api;

import com.robinhood.contentful.model.AssetResource;
import com.robinhood.contentful.model.ContentTypeResource;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.model.SpaceResource;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Url;

/* compiled from: S3ContentfulApi.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J0\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000b2\b\b\u0001\u0010\f\u001a\u00020\u00052\b\b\u0001\u0010\r\u001a\u00020\u00052\b\b\u0001\u0010\u000e\u001a\u00020\u000fH§@¢\u0006\u0002\u0010\u0010J,\u0010\u0011\u001a\u00020\u00122\b\b\u0001\u0010\f\u001a\u00020\u00052\b\b\u0001\u0010\u0013\u001a\u00020\u00052\b\b\u0001\u0010\u000e\u001a\u00020\u000fH§@¢\u0006\u0002\u0010\u0010J0\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00152\b\b\u0001\u0010\f\u001a\u00020\u00052\b\b\u0001\u0010\u0016\u001a\u00020\u00052\b\b\u0001\u0010\u000e\u001a\u00020\u000fH§@¢\u0006\u0002\u0010\u0010¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/contentful/api/S3ContentfulApi;", "", "getRaw", "Lokhttp3/ResponseBody;", "url", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSpace", "Lcom/robinhood/contentful/model/SpaceResource;", "id", "getAsset", "Lcom/robinhood/contentful/model/AssetResource;", "spaceId", "assetId", "locale", "Ljava/util/Locale;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Locale;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getContentType", "Lcom/robinhood/contentful/model/ContentTypeResource;", "contentTypeId", "getEntry", "Lcom/robinhood/contentful/model/EntryResource;", "entryId", "lib-contentful_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public interface S3ContentfulApi {
    @GET("{spaceId}/{locale}/assets/{assetId}.json")
    Object getAsset(@Path("spaceId") String str, @Path("assetId") String str2, @Path("locale") Locale locale, Continuation<? super AssetResource<?>> continuation);

    @GET("{spaceId}/{locale}/content_types/{contentTypeId}.json")
    Object getContentType(@Path("spaceId") String str, @Path("contentTypeId") String str2, @Path("locale") Locale locale, Continuation<? super ContentTypeResource> continuation);

    @GET("{spaceId}/{locale}/entries/{entryId}.json")
    Object getEntry(@Path("spaceId") String str, @Path("entryId") String str2, @Path("locale") Locale locale, Continuation<? super EntryResource<?>> continuation);

    @GET
    Object getRaw(@Url String str, Continuation<? super ResponseBody> continuation);

    @GET("{id}/space.json")
    Object getSpace(@Path("id") String str, Continuation<? super SpaceResource> continuation);
}
