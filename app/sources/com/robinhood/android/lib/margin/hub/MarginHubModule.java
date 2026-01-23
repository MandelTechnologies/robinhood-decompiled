package com.robinhood.android.lib.margin.hub;

import com.robinhood.android.lib.margin.hub.api.MarginHubApi;
import com.robinhood.android.lib.margin.hub.api.models.margin.requirements.MarginRequirementTableApi;
import com.robinhood.android.lib.margin.hub.api.models.margin.requirements.MarginRequirementTableHeaderStore;
import com.robinhood.android.lib.margin.hub.api.models.margin.requirements.MarginRequirementTableRowDataStore;
import com.robinhood.android.lib.margin.hub.store.MarginRequirementPollableHeaderDataProvider;
import com.robinhood.android.lib.margin.hub.store.MarginRequirementPollableLabelDataProvider;
import com.robinhood.api.annotation.BonfireRetrofit;
import com.robinhood.utils.retrofit.lazy.LazyRetrofit3;
import dagger.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import retrofit2.Retrofit;

/* compiled from: MarginHubModule.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0018\u0010\t\u001a\u00020\n2\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/lib/margin/hub/MarginHubModule;", "", "<init>", "()V", "provideMarginHubApi", "Lcom/robinhood/android/lib/margin/hub/api/MarginHubApi;", "retrofit", "Ldagger/Lazy;", "Lretrofit2/Retrofit;", "provideMarginRequirementTableHubApi", "Lcom/robinhood/android/lib/margin/hub/api/models/margin/requirements/MarginRequirementTableApi;", "provideMarginRequirementPollableLabelDataProvider", "Lcom/robinhood/android/lib/margin/hub/store/MarginRequirementPollableLabelDataProvider;", "pollableLabelStore", "Lcom/robinhood/android/lib/margin/hub/api/models/margin/requirements/MarginRequirementTableRowDataStore;", "provideMarginRequirementPollableHeaderDataProvider", "Lcom/robinhood/android/lib/margin/hub/store/MarginRequirementPollableHeaderDataProvider;", "pollableHeaderStore", "Lcom/robinhood/android/lib/margin/hub/api/models/margin/requirements/MarginRequirementTableHeaderStore;", "lib-margin-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class MarginHubModule {
    public static final MarginHubModule INSTANCE = new MarginHubModule();

    public final MarginRequirementPollableHeaderDataProvider provideMarginRequirementPollableHeaderDataProvider(MarginRequirementTableHeaderStore pollableHeaderStore) {
        Intrinsics.checkNotNullParameter(pollableHeaderStore, "pollableHeaderStore");
        return pollableHeaderStore;
    }

    public final MarginRequirementPollableLabelDataProvider provideMarginRequirementPollableLabelDataProvider(MarginRequirementTableRowDataStore pollableLabelStore) {
        Intrinsics.checkNotNullParameter(pollableLabelStore, "pollableLabelStore");
        return pollableLabelStore;
    }

    private MarginHubModule() {
    }

    public final MarginHubApi provideMarginHubApi(@BonfireRetrofit Lazy<Retrofit> retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        return (MarginHubApi) LazyRetrofit3.create(retrofit, MarginHubApi.class);
    }

    public final MarginRequirementTableApi provideMarginRequirementTableHubApi(@BonfireRetrofit Lazy<Retrofit> retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        return (MarginRequirementTableApi) LazyRetrofit3.create(retrofit, MarginRequirementTableApi.class);
    }
}
