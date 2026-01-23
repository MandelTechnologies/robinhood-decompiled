package com.robinhood.android.engagement.lib.infolandingpage;

import com.robinhood.android.engagement.lib.infolandingpage.api.InfoLandingPageApi;
import com.robinhood.models.api.rewardoffer.ApiRewardOfferDetails;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InfoLandingPageStore.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/engagement/lib/infolandingpage/InfoLandingPageStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "infoLandingPageApi", "Lcom/robinhood/android/engagement/lib/infolandingpage/api/InfoLandingPageApi;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/android/engagement/lib/infolandingpage/api/InfoLandingPageApi;)V", "getInfoLandingPage", "Lcom/robinhood/models/api/rewardoffer/ApiRewardOfferDetails;", "pageId", "Ljava/util/UUID;", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-info-landing-page_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class InfoLandingPageStore extends Store {
    private final InfoLandingPageApi infoLandingPageApi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfoLandingPageStore(StoreBundle storeBundle, InfoLandingPageApi infoLandingPageApi) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(infoLandingPageApi, "infoLandingPageApi");
        this.infoLandingPageApi = infoLandingPageApi;
    }

    public final Object getInfoLandingPage(UUID uuid, Continuation<? super ApiRewardOfferDetails> continuation) {
        return this.infoLandingPageApi.getInfoLandingPage(uuid, continuation);
    }
}
