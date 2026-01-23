package com.robinhood.librobinhood.data.store;

import com.robinhood.android.navigation.app.keys.data.ReferralLaunchMode;
import com.robinhood.librobinhood.data.store.RewardOffersStore2;
import com.robinhood.models.api.rewardoffer.ApiRewardOffer;
import com.robinhood.models.api.rewardoffer.ApiRewardOfferDetails;
import com.robinhood.prefs.Installation;
import com.robinhood.referral.api.RewardsApi;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Await2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.Deferred;

/* compiled from: RewardOffersStore.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0086@¢\u0006\u0002\u0010\u0010J \u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0086@¢\u0006\u0002\u0010\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/RewardOffersStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "rewardsApi", "Lcom/robinhood/referral/api/RewardsApi;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "installation", "Lcom/robinhood/prefs/Installation;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/referral/api/RewardsApi;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/prefs/Installation;)V", "getRewardOffersLandingScreen", "Lcom/robinhood/librobinhood/data/store/RewardOffersResponse;", "initialSource", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRewardOfferDetails", "Lcom/robinhood/librobinhood/data/store/RewardOffersResponse$RewardOfferDetails;", "rewardOfferId", "Ljava/util/UUID;", "(Ljava/util/UUID;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-store-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class RewardOffersStore extends Store {
    private final ExperimentsStore experimentsStore;
    private final Installation installation;
    private final RewardsApi rewardsApi;

    /* compiled from: RewardOffersStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.RewardOffersStore", m3645f = "RewardOffersStore.kt", m3646l = {58}, m3647m = "getRewardOfferDetails")
    /* renamed from: com.robinhood.librobinhood.data.store.RewardOffersStore$getRewardOfferDetails$1 */
    static final class C342791 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C342791(Continuation<? super C342791> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RewardOffersStore.this.getRewardOfferDetails(null, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardOffersStore(StoreBundle storeBundle, RewardsApi rewardsApi, ExperimentsStore experimentsStore, Installation installation) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(rewardsApi, "rewardsApi");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(installation, "installation");
        this.rewardsApi = rewardsApi;
        this.experimentsStore = experimentsStore;
        this.installation = installation;
    }

    /* compiled from: RewardOffersStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/librobinhood/data/store/RewardOffersResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.RewardOffersStore$getRewardOffersLandingScreen$2", m3645f = "RewardOffersStore.kt", m3646l = {31, 32, 33, 46}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.RewardOffersStore$getRewardOffersLandingScreen$2 */
    static final class C342802 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super RewardOffersStore2>, Object> {
        final /* synthetic */ String $initialSource;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ RewardOffersStore this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C342802(String str, RewardOffersStore rewardOffersStore, Continuation<? super C342802> continuation) {
            super(2, continuation);
            this.$initialSource = str;
            this.this$0 = rewardOffersStore;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C342802 c342802 = new C342802(this.$initialSource, this.this$0, continuation);
            c342802.L$0 = obj;
            return c342802;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super RewardOffersStore2> continuation) {
            return ((C342802) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x00e2, code lost:
        
            if (r15 == r0) goto L37;
         */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0091  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Deferred deferredAsync$default;
            Deferred deferred;
            Object objAwait;
            List list;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                Deferred deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new RewardOffersStore3(this.this$0, null), 3, null);
                deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new RewardOffersStore4(this.this$0, null), 3, null);
                Deferred[] deferredArr = {deferredAsync$default2, deferredAsync$default};
                this.L$0 = deferredAsync$default2;
                this.L$1 = deferredAsync$default;
                this.label = 1;
                if (Await2.awaitAll(deferredArr, this) != coroutine_suspended) {
                    deferred = deferredAsync$default2;
                }
                return coroutine_suspended;
            }
            if (i == 1) {
                deferredAsync$default = (Deferred) this.L$1;
                deferred = (Deferred) this.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i == 2) {
                    deferredAsync$default = (Deferred) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    List list2 = (List) obj;
                    this.L$0 = list2;
                    this.label = 3;
                    objAwait = deferredAsync$default.await(this);
                    if (objAwait != coroutine_suspended) {
                        list = list2;
                        obj = objAwait;
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        if (list.size() <= 1) {
                        }
                        return new RewardOffersStore2.RewardOffers(list, this.$initialSource);
                    }
                    return coroutine_suspended;
                }
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return (RewardOffersStore2) obj;
                }
                list = (List) this.L$0;
                ResultKt.throwOnFailure(obj);
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                if (list.size() <= 1 || zBooleanValue2) {
                    return new RewardOffersStore2.RewardOffers(list, this.$initialSource);
                }
                if (!list.isEmpty()) {
                    if (((ApiRewardOffer) CollectionsKt.first(list)).getDetails_v2_available()) {
                        return new RewardOffersStore2.ReferralOfferDetails(((ApiRewardOffer) CollectionsKt.first(list)).getId(), this.$initialSource, ReferralLaunchMode.LAST_KNOWN_TOUCHPOINT_OFFERS_LIST_SCREEN);
                    }
                    RewardOffersStore rewardOffersStore = this.this$0;
                    UUID id = ((ApiRewardOffer) CollectionsKt.first(list)).getId();
                    String str = this.$initialSource;
                    this.L$0 = null;
                    this.label = 4;
                    obj = rewardOffersStore.getRewardOfferDetails(id, str, this);
                } else {
                    return RewardOffersStore2.NoAccess.INSTANCE;
                }
            }
            this.L$0 = deferredAsync$default;
            this.L$1 = null;
            this.label = 2;
            obj = deferred.await(this);
            if (obj != coroutine_suspended) {
                List list22 = (List) obj;
                this.L$0 = list22;
                this.label = 3;
                objAwait = deferredAsync$default.await(this);
                if (objAwait != coroutine_suspended) {
                }
            }
            return coroutine_suspended;
        }
    }

    public final Object getRewardOffersLandingScreen(String str, Continuation<? super RewardOffersStore2> continuation) {
        return CoroutineScope2.coroutineScope(new C342802(str, this, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getRewardOfferDetails(UUID uuid, String str, Continuation<? super RewardOffersStore2.RewardOfferDetails> continuation) {
        C342791 c342791;
        if (continuation instanceof C342791) {
            c342791 = (C342791) continuation;
            int i = c342791.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c342791.label = i - Integer.MIN_VALUE;
            } else {
                c342791 = new C342791(continuation);
            }
        }
        Object rewardOfferDetails = c342791.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c342791.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(rewardOfferDetails);
            RewardsApi rewardsApi = this.rewardsApi;
            c342791.L$0 = str;
            c342791.label = 1;
            rewardOfferDetails = rewardsApi.getRewardOfferDetails(uuid, c342791);
            if (rewardOfferDetails == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) c342791.L$0;
            ResultKt.throwOnFailure(rewardOfferDetails);
        }
        return new RewardOffersStore2.RewardOfferDetails((ApiRewardOfferDetails) rewardOfferDetails, str);
    }
}
