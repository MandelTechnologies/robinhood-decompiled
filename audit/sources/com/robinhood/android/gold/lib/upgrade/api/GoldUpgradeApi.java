package com.robinhood.android.gold.lib.upgrade.api;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* compiled from: GoldUpgradeApi.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0002\u0010\u0007J\u001a\u0010\b\u001a\u00020\t2\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/gold/lib/upgrade/api/GoldUpgradeApi;", "", "getGoldUpgradeFlow", "Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow;", "source", "", "exitDeeplink", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGoldSweepAgreements", "Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldSweepAgreementsFlow;", "feature", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-gold-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public interface GoldUpgradeApi {
    @GET("sweep_agreements/")
    Object getGoldSweepAgreements(@Query("feature") String str, Continuation<? super ApiGoldSweepAgreementsFlow> continuation);

    @GET("gold_upgrade_flow/")
    Object getGoldUpgradeFlow(@Query("source") String str, @Query("exit_deeplink") String str2, Continuation<? super ApiGoldUpgradeFlow> continuation);

    /* compiled from: GoldUpgradeApi.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object getGoldUpgradeFlow$default(GoldUpgradeApi goldUpgradeApi, String str, String str2, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getGoldUpgradeFlow");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            return goldUpgradeApi.getGoldUpgradeFlow(str, str2, continuation);
        }
    }
}
