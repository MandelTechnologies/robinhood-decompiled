package com.robinhood.librobinhood.data.store;

import com.robinhood.analytics.SharedEventLogger;
import com.robinhood.librobinhood.data.store.PathfinderStores;
import com.robinhood.models.api.pathfinder.userview.ApiUserViewState;
import com.robinhood.models.p355ui.pathfinder.UserViewState;
import com.robinhood.models.p355ui.pathfinder.UserViewState2;
import com.robinhood.rosetta.eventlogging.PathfinderFallbackToWebViewEventData;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import java.io.IOException;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;

/* compiled from: PathfinderStores.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a8\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0000¨\u0006\f"}, m3636d2 = {"toUiModel", "Lcom/robinhood/models/ui/pathfinder/UserViewState;", "Lokhttp3/ResponseBody;", "inquiryId", "Ljava/util/UUID;", "userViewStateAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/robinhood/models/api/pathfinder/userview/ApiUserViewState;", "partialUserViewStateAdapter", "Lcom/robinhood/librobinhood/data/store/PartialUserViewState;", "eventLogger", "Lcom/robinhood/analytics/SharedEventLogger;", "lib-store-pathfinder_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.PathfinderStoresKt, reason: use source file name */
/* loaded from: classes13.dex */
public final class PathfinderStores2 {
    public static final UserViewState toUiModel(ResponseBody responseBody, UUID inquiryId, JsonAdapter<ApiUserViewState> userViewStateAdapter, JsonAdapter<PathfinderStores> partialUserViewStateAdapter, SharedEventLogger eventLogger) throws IOException {
        String page;
        PathfinderStores.TypeContext type_context;
        Intrinsics.checkNotNullParameter(responseBody, "<this>");
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Intrinsics.checkNotNullParameter(userViewStateAdapter, "userViewStateAdapter");
        Intrinsics.checkNotNullParameter(partialUserViewStateAdapter, "partialUserViewStateAdapter");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        String strString = responseBody.string();
        try {
            ApiUserViewState apiUserViewStateFromJson = userViewStateAdapter.fromJson(strString);
            Intrinsics.checkNotNull(apiUserViewStateFromJson);
            return UserViewState2.toUiModel(apiUserViewStateFromJson);
        } catch (JsonDataException e) {
            PathfinderStores pathfinderStoresFromJson = partialUserViewStateAdapter.fromJson(strString);
            if (pathfinderStoresFromJson == null || (type_context = pathfinderStoresFromJson.getType_context()) == null || (page = type_context.getPage()) == null) {
                page = "unknown";
            }
            int sequence = pathfinderStoresFromJson != null ? pathfinderStoresFromJson.getSequence() : -1;
            PathfinderFallbackToWebViewEventData.Reason reason = PathfinderFallbackToWebViewEventData.Reason.DESERIALIZATION_ERROR;
            String string2 = inquiryId.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            eventLogger.logPathfinderFallbackToWebViewEvent(page, reason, string2, sequence);
            throw e;
        }
    }
}
