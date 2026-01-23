package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import android.os.Parcelable;
import androidx.paging.PagingSource;
import androidx.paging.PagingState;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.libdesignsystem.serverui.experimental.api.PaginatedListPageApi;
import com.robinhood.models.serverdriven.experimental.api.PaginatedListPage;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.http.HttpUrls2;
import com.squareup.moshi.JsonAdapter;
import dispatch.core.Suspend;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p481io.Closeable;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.HttpUrl;
import okhttp3.ResponseBody;
import okio.BufferedSource;

/* compiled from: SduiPaginatedList.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00050\u0003B1\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\f\u0010\rJ$\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0010H\u0016J.\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0014H\u0096@¢\u0006\u0002\u0010\u0015J\u001a\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0017H\u0002J(\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u00122\u0006\u0010\u0019\u001a\u00020\u0004H\u0082@¢\u0006\u0002\u0010\u001aR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/PaginatedListPagingSource;", "ActionT", "Landroid/os/Parcelable;", "Landroidx/paging/PagingSource;", "", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "paginatedListPageApi", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/api/PaginatedListPageApi;", "jsonAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/robinhood/models/serverdriven/experimental/api/PaginatedListPage;", "initialPage", "<init>", "(Lcom/robinhood/android/libdesignsystem/serverui/experimental/api/PaginatedListPageApi;Lcom/squareup/moshi/JsonAdapter;Lcom/robinhood/models/serverdriven/experimental/api/PaginatedListPage;)V", "getRefreshKey", "state", "Landroidx/paging/PagingState;", AnalyticsStrings.NOTIF_STACK_EVENT_LOAD, "Landroidx/paging/PagingSource$LoadResult;", "params", "Landroidx/paging/PagingSource$LoadParams;", "(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadInitialPage", "Landroidx/paging/PagingSource$LoadResult$Page;", "loadNextPage", "nextUrl", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-sdui_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.PaginatedListPagingSource, reason: use source file name */
/* loaded from: classes8.dex */
final class SduiPaginatedList4<ActionT extends Parcelable> extends PagingSource<String, UIComponent<? extends ActionT>> {
    private final PaginatedListPage<ActionT> initialPage;
    private final JsonAdapter<PaginatedListPage<ActionT>> jsonAdapter;
    private final PaginatedListPageApi paginatedListPageApi;

    /* JADX WARN: Multi-variable type inference failed */
    public SduiPaginatedList4(PaginatedListPageApi paginatedListPageApi, JsonAdapter<PaginatedListPage<ActionT>> jsonAdapter, PaginatedListPage<? extends ActionT> initialPage) {
        Intrinsics.checkNotNullParameter(paginatedListPageApi, "paginatedListPageApi");
        Intrinsics.checkNotNullParameter(jsonAdapter, "jsonAdapter");
        Intrinsics.checkNotNullParameter(initialPage, "initialPage");
        this.paginatedListPageApi = paginatedListPageApi;
        this.jsonAdapter = jsonAdapter;
        this.initialPage = initialPage;
    }

    @Override // androidx.paging.PagingSource
    public String getRefreshKey(PagingState<String, UIComponent<ActionT>> state) {
        PagingSource.LoadResult.Page<String, UIComponent<ActionT>> pageClosestPageToPosition;
        Intrinsics.checkNotNullParameter(state, "state");
        Integer anchorPosition = state.getAnchorPosition();
        if (anchorPosition == null || (pageClosestPageToPosition = state.closestPageToPosition(anchorPosition.intValue())) == null) {
            return null;
        }
        return pageClosestPageToPosition.getNextKey();
    }

    @Override // androidx.paging.PagingSource
    public Object load(PagingSource.LoadParams<String> loadParams, Continuation<? super PagingSource.LoadResult<String, UIComponent<ActionT>>> continuation) {
        String key = loadParams.getKey();
        if (key == null) {
            return loadInitialPage();
        }
        return loadNextPage(key, continuation);
    }

    private final PagingSource.LoadResult.Page<String, UIComponent<ActionT>> loadInitialPage() {
        return new PagingSource.LoadResult.Page<>(this.initialPage.getContent(), null, this.initialPage.getNext_url());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object loadNextPage(String str, Continuation<? super PagingSource.LoadResult<String, UIComponent<ActionT>>> continuation) {
        if (!HttpUrls2.isRobinhoodDomain(HttpUrl.INSTANCE.get(str))) {
            return new PagingSource.LoadResult.Page(CollectionsKt.emptyList(), null, null);
        }
        Object objWithIO$default = Suspend.withIO$default(null, new C207092(this, str, null), continuation, 1, null);
        return objWithIO$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithIO$default : (PagingSource.LoadResult) objWithIO$default;
    }

    /* compiled from: SduiPaginatedList.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u00030\u0001\"\b\b\u0000\u0010\u0004*\u00020\u0005*\u00020\u0006H\n"}, m3636d2 = {"<anonymous>", "Landroidx/paging/PagingSource$LoadResult;", "", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "ActionT", "Landroid/os/Parcelable;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.libdesignsystem.serverui.experimental.compose.PaginatedListPagingSource$loadNextPage$2", m3645f = "SduiPaginatedList.kt", m3646l = {136}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.PaginatedListPagingSource$loadNextPage$2 */
    static final class C207092 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super PagingSource.LoadResult<String, UIComponent<? extends ActionT>>>, Object> {
        final /* synthetic */ String $nextUrl;
        int label;
        final /* synthetic */ SduiPaginatedList4<ActionT> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C207092(SduiPaginatedList4<ActionT> sduiPaginatedList4, String str, Continuation<? super C207092> continuation) {
            super(2, continuation);
            this.this$0 = sduiPaginatedList4;
            this.$nextUrl = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C207092(this.this$0, this.$nextUrl, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super PagingSource.LoadResult<String, UIComponent<ActionT>>> continuation) {
            return ((C207092) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    PaginatedListPageApi paginatedListPageApi = ((SduiPaginatedList4) this.this$0).paginatedListPageApi;
                    String str = this.$nextUrl;
                    this.label = 1;
                    obj = paginatedListPageApi.getPaginatedListPage(str, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                BufferedSource source = ((ResponseBody) obj).getSource();
                try {
                    Object objFromJson = ((SduiPaginatedList4) this.this$0).jsonAdapter.fromJson(source);
                    Intrinsics.checkNotNull(objFromJson);
                    PaginatedListPage paginatedListPage = (PaginatedListPage) objFromJson;
                    PagingSource.LoadResult.Page page = new PagingSource.LoadResult.Page(paginatedListPage.getContent(), null, paginatedListPage.getNext_url());
                    Closeable.closeFinally(source, null);
                    return page;
                } finally {
                }
            } catch (Throwable th) {
                if (Throwables.isNetworkRelated(th)) {
                    return new PagingSource.LoadResult.Error(th);
                }
                throw th;
            }
        }
    }
}
