package com.robinhood.android.common.gold.api;

import com.robinhood.models.p355ui.bonfire.UiPostTransferPage;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* compiled from: GoldCommonApi.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/common/gold/api/GoldCommonApi;", "", "getPostUpgradeCelebration", "Lcom/robinhood/models/ui/bonfire/UiPostTransferPage$PostTransferGoldCelebration;", "source", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-lib-gold_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public interface GoldCommonApi {
    @GET("post_onboarding/celebration/")
    Object getPostUpgradeCelebration(@Query("source") String str, Continuation<? super UiPostTransferPage.PostTransferGoldCelebration> continuation);
}
