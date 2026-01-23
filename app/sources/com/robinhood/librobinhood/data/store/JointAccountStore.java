package com.robinhood.librobinhood.data.store;

import bonfire.proto.idl.joint_accounts_onboarding.p035v1.GetGoldFeaturesResponseDto;
import bonfire.proto.idl.joint_accounts_onboarding.p035v1.JointAccountsOnboardingService;
import com.robinhood.accounts.p056db.dao.JointAccountFeaturesDao;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.models.jointaccounts.p330db.JointAccountFeatures;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.datetime.Durations;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: JointAccountStore.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u00112\u0006\u0010\u0012\u001a\u00020\fJ\f\u0010\u0013\u001a\u00020\r*\u00020\u0014H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/JointAccountStore;", "Lcom/robinhood/store/Store;", "service", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/JointAccountsOnboardingService;", "featuresDao", "Lcom/robinhood/accounts/db/dao/JointAccountFeaturesDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lbonfire/proto/idl/joint_accounts_onboarding/v1/JointAccountsOnboardingService;Lcom/robinhood/accounts/db/dao/JointAccountFeaturesDao;Lcom/robinhood/store/StoreBundle;)V", "featuresEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "Lcom/robinhood/models/jointaccounts/db/JointAccountFeatures;", "featuresQuery", "Lcom/robinhood/android/moria/db/Query;", "streamFeatures", "Lkotlinx/coroutines/flow/Flow;", "accountNumber", "toDbModel", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/GetGoldFeaturesResponseDto;", "lib-store-account_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class JointAccountStore extends Store {
    private final JointAccountFeaturesDao featuresDao;
    private final Endpoint<String, JointAccountFeatures> featuresEndpoint;
    private final Query<String, JointAccountFeatures> featuresQuery;
    private final JointAccountsOnboardingService service;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JointAccountStore(JointAccountsOnboardingService service, JointAccountFeaturesDao featuresDao, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(featuresDao, "featuresDao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.service = service;
        this.featuresDao = featuresDao;
        Endpoint<String, JointAccountFeatures> endpointCreate = Endpoint.INSTANCE.create(new JointAccountStore2(this, null), getLogoutKillswitch(), new JointAccountStore3(featuresDao), storeBundle.getClock(), new DefaultStaleDecider(Durations.INSTANCE.getONE_MINUTE(), storeBundle.getClock()));
        this.featuresEndpoint = endpointCreate;
        this.featuresQuery = Store.create$default(this, Query.INSTANCE, "jointAccountFeaturesQuery", CollectionsKt.listOf(new RefreshEach(new JointAccountStore4(endpointCreate))), new JointAccountStore5(featuresDao), false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object featuresEndpoint$insert(JointAccountFeaturesDao jointAccountFeaturesDao, JointAccountFeatures jointAccountFeatures, Continuation continuation) {
        jointAccountFeaturesDao.insert(jointAccountFeatures);
        return Unit.INSTANCE;
    }

    public final Flow<JointAccountFeatures> streamFeatures(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return this.featuresQuery.asFlow(accountNumber);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JointAccountFeatures toDbModel(GetGoldFeaturesResponseDto getGoldFeaturesResponseDto) {
        return new JointAccountFeatures(getGoldFeaturesResponseDto.getAccount_number(), getGoldFeaturesResponseDto.getHas_gold_subscription());
    }
}
