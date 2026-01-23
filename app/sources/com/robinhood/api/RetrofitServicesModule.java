package com.robinhood.api;

import com.robinhood.api.annotation.AtlasRetrofit;
import com.robinhood.api.annotation.BonfireRetrofit;
import com.robinhood.api.annotation.BrokebackRetrofit;
import com.robinhood.api.annotation.ContentfulRetrofit;
import com.robinhood.api.annotation.DoraRetrofit;
import com.robinhood.api.annotation.GalileoRetrofit;
import com.robinhood.api.annotation.GenericRetrofit;
import com.robinhood.api.annotation.IavRetrofit;
import com.robinhood.api.annotation.IdentiRetrofit;
import com.robinhood.api.annotation.MediaRetrofit;
import com.robinhood.api.annotation.MidlandsRetrofit;
import com.robinhood.api.annotation.MinervaRetrofit;
import com.robinhood.api.annotation.NummusRetrofit;
import com.robinhood.api.annotation.PimsRetrofit;
import com.robinhood.api.retrofit.Ach;
import com.robinhood.api.retrofit.Atlas;
import com.robinhood.api.retrofit.BonfireApi;
import com.robinhood.api.retrofit.Brokeback;
import com.robinhood.api.retrofit.DoraApi;
import com.robinhood.api.retrofit.Galileo;
import com.robinhood.api.retrofit.GenericService;
import com.robinhood.api.retrofit.Iav;
import com.robinhood.api.retrofit.Identi;
import com.robinhood.api.retrofit.MediaApi;
import com.robinhood.api.retrofit.Midlands;
import com.robinhood.api.retrofit.Minerva;
import com.robinhood.api.retrofit.Nummus;
import com.robinhood.api.retrofit.Pims;
import com.robinhood.contentful.api.S3ContentfulApi;
import com.robinhood.utils.retrofit.lazy.LazyRetrofit3;
import dagger.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import retrofit2.Retrofit;

/* compiled from: RetrofitServicesModule.kt */
@Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0018\u0010\t\u001a\u00020\n2\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0018\u0010\r\u001a\u00020\u000e2\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0018\u0010\u000f\u001a\u00020\u00102\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0018\u0010\u0011\u001a\u00020\u00122\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0018\u0010\u0013\u001a\u00020\u00142\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0018\u0010\u0015\u001a\u00020\u00162\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0018\u0010\u0017\u001a\u00020\u00182\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0018\u0010\u0019\u001a\u00020\u001a2\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0018\u0010\u001b\u001a\u00020\u001c2\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0018\u0010\u001d\u001a\u00020\u001e2\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0018\u0010\u001f\u001a\u00020 2\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0018\u0010!\u001a\u00020\"2\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0018\u0010#\u001a\u00020$2\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¨\u0006%"}, m3636d2 = {"Lcom/robinhood/api/RetrofitServicesModule;", "", "<init>", "()V", "provideAch", "Lcom/robinhood/api/retrofit/Ach;", "retrofit", "Ldagger/Lazy;", "Lretrofit2/Retrofit;", "provideAtlas", "Lcom/robinhood/api/retrofit/Atlas;", "provideBonfireApi", "Lcom/robinhood/api/retrofit/BonfireApi;", "provideBrokeback", "Lcom/robinhood/api/retrofit/Brokeback;", "provideDoraApi", "Lcom/robinhood/api/retrofit/DoraApi;", "provideIav", "Lcom/robinhood/api/retrofit/Iav;", "provideIdenti", "Lcom/robinhood/api/retrofit/Identi;", "provideMediaApi", "Lcom/robinhood/api/retrofit/MediaApi;", "provideMidlands", "Lcom/robinhood/api/retrofit/Midlands;", "provideMinerva", "Lcom/robinhood/api/retrofit/Minerva;", "provideNummus", "Lcom/robinhood/api/retrofit/Nummus;", "providePims", "Lcom/robinhood/api/retrofit/Pims;", "provideGalileo", "Lcom/robinhood/api/retrofit/Galileo;", "provideGenericService", "Lcom/robinhood/api/retrofit/GenericService;", "provideS3ContentfulApi", "Lcom/robinhood/contentful/api/S3ContentfulApi;", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes20.dex */
public final class RetrofitServicesModule {
    public static final RetrofitServicesModule INSTANCE = new RetrofitServicesModule();

    private RetrofitServicesModule() {
    }

    public final Ach provideAch(@BrokebackRetrofit Lazy<Retrofit> retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        return (Ach) LazyRetrofit3.create(retrofit, Ach.class);
    }

    public final Atlas provideAtlas(@AtlasRetrofit Lazy<Retrofit> retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        return (Atlas) LazyRetrofit3.create(retrofit, Atlas.class);
    }

    public final BonfireApi provideBonfireApi(@BonfireRetrofit Lazy<Retrofit> retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        return (BonfireApi) LazyRetrofit3.create(retrofit, BonfireApi.class);
    }

    public final Brokeback provideBrokeback(@BrokebackRetrofit Lazy<Retrofit> retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        return (Brokeback) LazyRetrofit3.create(retrofit, Brokeback.class);
    }

    public final DoraApi provideDoraApi(@DoraRetrofit Lazy<Retrofit> retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        return (DoraApi) LazyRetrofit3.create(retrofit, DoraApi.class);
    }

    public final Galileo provideGalileo(@GalileoRetrofit Lazy<Retrofit> retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        return (Galileo) LazyRetrofit3.create(retrofit, Galileo.class);
    }

    public final GenericService provideGenericService(@GenericRetrofit Lazy<Retrofit> retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        return (GenericService) LazyRetrofit3.create(retrofit, GenericService.class);
    }

    public final Iav provideIav(@IavRetrofit Lazy<Retrofit> retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        return (Iav) LazyRetrofit3.create(retrofit, Iav.class);
    }

    public final Identi provideIdenti(@IdentiRetrofit Lazy<Retrofit> retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        return (Identi) LazyRetrofit3.create(retrofit, Identi.class);
    }

    public final MediaApi provideMediaApi(@MediaRetrofit Lazy<Retrofit> retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        return (MediaApi) LazyRetrofit3.create(retrofit, MediaApi.class);
    }

    public final Midlands provideMidlands(@MidlandsRetrofit Lazy<Retrofit> retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        return (Midlands) LazyRetrofit3.create(retrofit, Midlands.class);
    }

    public final Minerva provideMinerva(@MinervaRetrofit Lazy<Retrofit> retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        return (Minerva) LazyRetrofit3.create(retrofit, Minerva.class);
    }

    public final Nummus provideNummus(@NummusRetrofit Lazy<Retrofit> retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        return (Nummus) LazyRetrofit3.create(retrofit, Nummus.class);
    }

    public final Pims providePims(@PimsRetrofit Lazy<Retrofit> retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        return (Pims) LazyRetrofit3.create(retrofit, Pims.class);
    }

    public final S3ContentfulApi provideS3ContentfulApi(@ContentfulRetrofit Lazy<Retrofit> retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        return (S3ContentfulApi) LazyRetrofit3.create(retrofit, S3ContentfulApi.class);
    }
}
