package com.robinhood.store.isa;

import bonfire.proto.idl.windsor.p041v1.GetContributionAllowanceV2RequestDto;
import bonfire.proto.idl.windsor.p041v1.GetContributionAllowanceV2ResponseDto;
import bonfire.proto.idl.windsor.p041v1.WindsorService;
import com.robinhood.android.isa.models.isa.p163db.dao.IsaContributionDao;
import com.robinhood.android.isa.models.isa.p163db.entity.IsaContributions;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;
import windsor.transactions.p552v1.TransactionTypeDto;

/* compiled from: IsaContributionStore.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/store/isa/IsaContributionStore;", "Lcom/robinhood/store/Store;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "contributionDao", "Lcom/robinhood/android/isa/models/isa/db/dao/IsaContributionDao;", "windsorService", "Lbonfire/proto/idl/windsor/v1/WindsorService;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/android/isa/models/isa/db/dao/IsaContributionDao;Lbonfire/proto/idl/windsor/v1/WindsorService;Lcom/robinhood/store/StoreBundle;)V", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lbonfire/proto/idl/windsor/v1/GetContributionAllowanceV2RequestDto;", "Lbonfire/proto/idl/windsor/v1/GetContributionAllowanceV2ResponseDto;", "query", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/android/isa/models/isa/db/entity/IsaContributions;", "streamContributions", "Lkotlinx/coroutines/flow/Flow;", "accountNumber", "", "transactionType", "Lwindsor/transactions/v1/TransactionTypeDto;", "lib-store-isa_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class IsaContributionStore extends Store {
    private final AccountProvider accountProvider;
    private final IsaContributionDao contributionDao;
    private final Endpoint<GetContributionAllowanceV2RequestDto, GetContributionAllowanceV2ResponseDto> endpoint;
    private final Query<GetContributionAllowanceV2RequestDto, IsaContributions> query;
    private final WindsorService windsorService;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IsaContributionStore(AccountProvider accountProvider, IsaContributionDao contributionDao, WindsorService windsorService, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(contributionDao, "contributionDao");
        Intrinsics.checkNotNullParameter(windsorService, "windsorService");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.accountProvider = accountProvider;
        this.contributionDao = contributionDao;
        this.windsorService = windsorService;
        this.endpoint = Endpoint.Companion.createWithParams$default(Endpoint.INSTANCE, new IsaContributionStore2(windsorService), getLogoutKillswitch(), new IsaContributionStore3(this, null), storeBundle.getClock(), null, 16, null);
        this.query = Store.create$default(this, Query.INSTANCE, "streamIsaContributions", CollectionsKt.listOf(new RefreshEach(new Function1() { // from class: com.robinhood.store.isa.IsaContributionStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IsaContributionStore.query$lambda$0(this.f$0, (GetContributionAllowanceV2RequestDto) obj);
            }
        })), new Function1() { // from class: com.robinhood.store.isa.IsaContributionStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IsaContributionStore.query$lambda$1(this.f$0, (GetContributionAllowanceV2RequestDto) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job query$lambda$0(IsaContributionStore isaContributionStore, GetContributionAllowanceV2RequestDto it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Endpoint.DefaultImpls.refresh$default(isaContributionStore.endpoint, it, false, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow query$lambda$1(IsaContributionStore isaContributionStore, GetContributionAllowanceV2RequestDto it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return isaContributionStore.contributionDao.streamContributions(it.getAccount_number());
    }

    public final Flow<IsaContributions> streamContributions(String accountNumber, TransactionTypeDto transactionType) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(transactionType, "transactionType");
        return FlowKt.transformLatest(Context7.buffer$default(RxConvert.asFlow(this.accountProvider.streamAccount(accountNumber)), Integer.MAX_VALUE, null, 2, null), new C41528x3a3aa045(null, this, transactionType));
    }
}
