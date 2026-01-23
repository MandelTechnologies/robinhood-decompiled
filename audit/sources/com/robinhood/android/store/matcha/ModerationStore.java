package com.robinhood.android.store.matcha;

import com.robinhood.android.models.matcha.api.ApiCreateAbuseReportRequest;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.api.matcha.MatchaApi;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ModerationStore.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J6\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000eH\u0086@¢\u0006\u0002\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/store/matcha/ModerationStore;", "Lcom/robinhood/store/Store;", "matchaApi", "Lcom/robinhood/api/matcha/MatchaApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/api/matcha/MatchaApi;Lcom/robinhood/store/StoreBundle;)V", "createAbuseReport", "Lcom/robinhood/android/moria/network/PostEndpoint;", "Lcom/robinhood/android/models/matcha/api/ApiCreateAbuseReportRequest;", "", "reportUser", "reporteeId", "", "objectId", "objectType", "Lcom/robinhood/android/models/matcha/api/ApiCreateAbuseReportRequest$ObjectType;", "reportCategory", "Lcom/robinhood/android/models/matcha/api/ApiCreateAbuseReportRequest$ReportCategory;", "reportReason", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/models/matcha/api/ApiCreateAbuseReportRequest$ObjectType;Lcom/robinhood/android/models/matcha/api/ApiCreateAbuseReportRequest$ReportCategory;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "lib-store-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class ModerationStore extends Store {
    private static final String REPORT_DOMAIN = "p2p";
    private final PostEndpoint<ApiCreateAbuseReportRequest, Unit> createAbuseReport;
    private final MatchaApi matchaApi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModerationStore(MatchaApi matchaApi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(matchaApi, "matchaApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.matchaApi = matchaApi;
        this.createAbuseReport = PostEndpoint.INSTANCE.create(new ModerationStore2(matchaApi), new ModerationStore3(null));
    }

    public final Object reportUser(String str, String str2, ApiCreateAbuseReportRequest.ObjectType objectType, ApiCreateAbuseReportRequest.ReportCategory reportCategory, String str3, Continuation<? super Unit> continuation) {
        PostEndpoint<ApiCreateAbuseReportRequest, Unit> postEndpoint = this.createAbuseReport;
        String string2 = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        Object objPost$default = PostEndpoint.DefaultImpls.post$default(postEndpoint, new ApiCreateAbuseReportRequest(string2, objectType, str2, str, REPORT_DOMAIN, reportCategory, str3), null, continuation, 2, null);
        return objPost$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPost$default : Unit.INSTANCE;
    }
}
