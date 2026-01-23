package com.robinhood.shared.store.lists.dagger;

import com.robinhood.api.annotation.BonfireRetrofit;
import com.robinhood.shared.store.lists.ListsApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import retrofit2.Retrofit;

/* compiled from: StoreListsModule.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/store/lists/dagger/StoreListsModule;", "", "<init>", "()V", "provideWatchlistApi", "Lcom/robinhood/shared/store/lists/ListsApi;", "retrofit", "Lretrofit2/Retrofit;", "lib-store-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class StoreListsModule {
    public static final StoreListsModule INSTANCE = new StoreListsModule();

    private StoreListsModule() {
    }

    public final ListsApi provideWatchlistApi(@BonfireRetrofit Retrofit retrofit) throws SecurityException {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(ListsApi.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        return (ListsApi) objCreate;
    }
}
