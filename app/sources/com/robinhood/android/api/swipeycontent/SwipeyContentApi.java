package com.robinhood.android.api.swipeycontent;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.GET;

/* compiled from: SwipeyContentApi.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/api/swipeycontent/SwipeyContentApi;", "", "getSwipeyContent", "Lcom/robinhood/android/api/swipeycontent/SwipeyContent;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-api-swipey-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public interface SwipeyContentApi {
    @GET("onboarding/swipey_content/")
    Object getSwipeyContent(Continuation<? super SwipeyContent> continuation);
}
