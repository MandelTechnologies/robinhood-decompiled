package com.robinhood.librobinhood.data.store.bonfire.beneficiaries;

import com.robinhood.android.beneficiaries.api.BeneficiariesApi;
import com.robinhood.android.beneficiaries.models.api.ApiBeneficiaryListsForAllAccounts;
import com.robinhood.android.beneficiaries.models.api.ApiBeneficiarySplashViewModel;
import com.robinhood.android.beneficiaries.models.api.ApiSplashValuePropsResponse;
import com.robinhood.android.beneficiaries.models.dao.BeneficiaryListDao;
import com.robinhood.android.beneficiaries.models.p066db.BeneficiaryList;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;

/* compiled from: BeneficiaryListStore.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u00112\u0006\u0010\u0012\u001a\u00020\fJ\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\fJ\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010\u0017J\u000e\u0010\u0018\u001a\u00020\u0019H\u0086@¢\u0006\u0002\u0010\u001aR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/BeneficiaryListStore;", "Lcom/robinhood/store/Store;", "beneficiariesApi", "Lcom/robinhood/android/beneficiaries/api/BeneficiariesApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/android/beneficiaries/models/dao/BeneficiaryListDao;", "<init>", "(Lcom/robinhood/android/beneficiaries/api/BeneficiariesApi;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/android/beneficiaries/models/dao/BeneficiaryListDao;)V", "beneficiaryListEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "Lcom/robinhood/android/beneficiaries/models/db/BeneficiaryList;", "query", "Lcom/robinhood/android/moria/db/Query;", "stream", "Lio/reactivex/Observable;", "accountNumber", "forceRefresh", "Lkotlinx/coroutines/Job;", "getBeneficiaryValueProps", "Lcom/robinhood/android/beneficiaries/models/api/ApiBeneficiarySplashViewModel;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBeneficiaryListForAllAccounts", "Lcom/robinhood/android/beneficiaries/models/api/ApiBeneficiaryListsForAllAccounts;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-store-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class BeneficiaryListStore extends Store {
    private final BeneficiariesApi beneficiariesApi;
    private final Endpoint<String, BeneficiaryList> beneficiaryListEndpoint;
    private final BeneficiaryListDao dao;
    private final Query<String, BeneficiaryList> query;

    /* compiled from: BeneficiaryListStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.beneficiaries.BeneficiaryListStore", m3645f = "BeneficiaryListStore.kt", m3646l = {51}, m3647m = "getBeneficiaryValueProps")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.beneficiaries.BeneficiaryListStore$getBeneficiaryValueProps$1 */
    static final class C346291 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C346291(Continuation<? super C346291> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BeneficiaryListStore.this.getBeneficiaryValueProps(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BeneficiaryListStore(BeneficiariesApi beneficiariesApi, StoreBundle storeBundle, BeneficiaryListDao dao) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(beneficiariesApi, "beneficiariesApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.beneficiariesApi = beneficiariesApi;
        this.dao = dao;
        this.beneficiaryListEndpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new BeneficiaryListStore2(this, null), getLogoutKillswitch(), new BeneficiaryListStore3(this, null), storeBundle.getClock(), null, 16, null);
        this.query = Store.create$default(this, Query.INSTANCE, "queryBeneficiaryList", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.beneficiaries.BeneficiaryListStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BeneficiaryListStore.query$lambda$0(this.f$0, (String) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.beneficiaries.BeneficiaryListStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BeneficiaryListStore.query$lambda$1(this.f$0, (String) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow query$lambda$0(BeneficiaryListStore beneficiaryListStore, String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return Endpoint.DefaultImpls.poll$default(beneficiaryListStore.beneficiaryListEndpoint, accountNumber, null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow query$lambda$1(BeneficiaryListStore beneficiaryListStore, String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return beneficiaryListStore.dao.getBeneficiaryList(accountNumber);
    }

    public final Observable<BeneficiaryList> stream(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return this.query.asObservable(accountNumber);
    }

    public final Job forceRefresh(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return Endpoint.DefaultImpls.refresh$default(this.beneficiaryListEndpoint, accountNumber, true, null, 4, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getBeneficiaryValueProps(String str, Continuation<? super ApiBeneficiarySplashViewModel> continuation) {
        C346291 c346291;
        if (continuation instanceof C346291) {
            c346291 = (C346291) continuation;
            int i = c346291.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c346291.label = i - Integer.MIN_VALUE;
            } else {
                c346291 = new C346291(continuation);
            }
        }
        Object beneficiaryValueProps = c346291.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c346291.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(beneficiaryValueProps);
            BeneficiariesApi beneficiariesApi = this.beneficiariesApi;
            c346291.label = 1;
            beneficiaryValueProps = beneficiariesApi.getBeneficiaryValueProps(str, c346291);
            if (beneficiaryValueProps == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(beneficiaryValueProps);
        }
        return ((ApiSplashValuePropsResponse) beneficiaryValueProps).getView_model();
    }

    public final Object getBeneficiaryListForAllAccounts(Continuation<? super ApiBeneficiaryListsForAllAccounts> continuation) {
        return this.beneficiariesApi.getBeneficiaryListsForAllAccounts(continuation);
    }
}
