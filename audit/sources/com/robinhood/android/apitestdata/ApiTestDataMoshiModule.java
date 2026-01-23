package com.robinhood.android.apitestdata;

import com.robinhood.android.apitestdata.annotation.TestDataMoshi;
import com.robinhood.shared.debug.recipes.models.ApiExecuteRecipeRequestJsonAdapterFactory;
import com.robinhood.shared.debug.recipes.models.options.ApiStringOptionJsonAdapterFactory;
import com.robinhood.shared.debug.recipes.models.params.ApiGenericRecipeParam;
import com.robinhood.shared.debug.recipes.models.values.ApiRecipeValueJsonAdapterFactory;
import com.robinhood.utils.moshi.LazyMoshi;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import dagger.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiTestDataMoshiModule.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/apitestdata/ApiTestDataMoshiModule;", "", "<init>", "()V", "provideTestDataMoshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "moshi", "lib-api-fixtures_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class ApiTestDataMoshiModule {
    public static final ApiTestDataMoshiModule INSTANCE = new ApiTestDataMoshiModule();

    private ApiTestDataMoshiModule() {
    }

    @TestDataMoshi
    public final LazyMoshi provideTestDataMoshi(final LazyMoshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        return new LazyMoshi(new Lazy() { // from class: com.robinhood.android.apitestdata.ApiTestDataMoshiModule.provideTestDataMoshi.1
            @Override // dagger.Lazy
            public final Moshi get() {
                Moshi.Builder builderNewBuilder = moshi.get().newBuilder();
                builderNewBuilder.add((JsonAdapter.Factory) ApiStringOptionJsonAdapterFactory.INSTANCE);
                builderNewBuilder.add(ApiGenericRecipeParam.INSTANCE.getJsonAdapterFactory());
                builderNewBuilder.add((JsonAdapter.Factory) ApiRecipeValueJsonAdapterFactory.INSTANCE);
                builderNewBuilder.add((JsonAdapter.Factory) ApiExecuteRecipeRequestJsonAdapterFactory.INSTANCE);
                return builderNewBuilder.build();
            }
        });
    }
}
