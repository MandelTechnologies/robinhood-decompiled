package com.robinhood.librobinhood.data.store.bonfire;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.api.rhy.RhyBonfireApi;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.bonfire.ApiDirectDepositRelationship;
import com.robinhood.models.dao.bonfire.DirectDepositRelationshipDao;
import com.robinhood.models.entity.RhEntity;
import com.robinhood.models.p320db.bonfire.DirectDepositRelationship;
import com.robinhood.recurring.models.AmountType;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: DirectDepositRelationshipStore.kt */
@Metadata(m3635d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00160!2\u0006\u0010\"\u001a\u00020\u0015J\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001d0!2\u0006\u0010$\u001a\u00020\u0010J$\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001d0&2\u0006\u0010$\u001a\u00020\u00102\u000e\b\u0002\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u0018J\u001a\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00180!2\u0006\u0010$\u001a\u00020\u0010J\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001f0!2\u0006\u0010$\u001a\u00020\u0010J$\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00180!2\u0006\u0010$\u001a\u00020\u00102\b\u0010,\u001a\u0004\u0018\u00010\u001bJ\u001a\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110.2\u0006\u0010$\u001a\u00020\u0010J\u000e\u0010/\u001a\u0002002\u0006\u0010$\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00180\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R.\u0010\u0019\u001a\"\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00180\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u001d0\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u001f0\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00061"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/DirectDepositRelationshipStore;", "Lcom/robinhood/store/Store;", "bonfireApi", "Lcom/robinhood/api/rhy/RhyBonfireApi;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "rhyAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/bonfire/DirectDepositRelationshipDao;", "<init>", "(Lcom/robinhood/api/rhy/RhyBonfireApi;Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/bonfire/DirectDepositRelationshipDao;)V", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/models/entity/RhEntity;", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/bonfire/ApiDirectDepositRelationship;", "directDepositRelationshipQuery", "Lcom/robinhood/android/moria/db/Query;", "Ljava/util/UUID;", "Lcom/robinhood/models/db/bonfire/DirectDepositRelationship;", "directDepositRelationshipsQuery", "", "directDepositRelationshipsForAmountTypeQuery", "Lkotlin/Pair;", "Lcom/robinhood/recurring/models/AmountType;", "hasDirectDepositRelationshipsQuery", "", "directDepositRelationshipCountQuery", "", "getDirectDepositRelationship", "Lio/reactivex/Observable;", "id", "getHasDirectDepositRelationships", "entityType", "forceFetchHasDirectDepositRelationshipsIfNotCached", "Lio/reactivex/Single;", "states", "Lcom/robinhood/models/api/bonfire/ApiDirectDepositRelationship$State;", "getDirectDepositRelationships", "getDirectDepositRelationshipCount", "getDirectDepositRelationshipsForAmountType", "amountType", "poll", "Lkotlinx/coroutines/flow/Flow;", "refresh", "Lkotlinx/coroutines/Job;", "lib-store-rhy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class DirectDepositRelationshipStore extends Store {
    private final AccountProvider accountProvider;
    private final RhyBonfireApi bonfireApi;
    private final DirectDepositRelationshipDao dao;
    private final Query<RhEntity, Integer> directDepositRelationshipCountQuery;
    private final Query<UUID, DirectDepositRelationship> directDepositRelationshipQuery;
    private final Query<Tuples2<? extends RhEntity, ? extends AmountType>, List<DirectDepositRelationship>> directDepositRelationshipsForAmountTypeQuery;
    private final Query<RhEntity, List<DirectDepositRelationship>> directDepositRelationshipsQuery;
    private final Endpoint<RhEntity, PaginatedResult<ApiDirectDepositRelationship>> endpoint;
    private final Query<RhEntity, Boolean> hasDirectDepositRelationshipsQuery;
    private final RhyAccountStore rhyAccountStore;

    /* compiled from: DirectDepositRelationshipStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AmountType.values().length];
            try {
                iArr[AmountType.DOLLAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AmountType.PERCENTAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DirectDepositRelationshipStore(RhyBonfireApi bonfireApi, AccountProvider accountProvider, RhyAccountStore rhyAccountStore, StoreBundle storeBundle, DirectDepositRelationshipDao dao) {
        Intrinsics.checkNotNullParameter(bonfireApi, "bonfireApi");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        DirectDepositRelationship.Companion companion = DirectDepositRelationship.INSTANCE;
        super(storeBundle, companion);
        this.bonfireApi = bonfireApi;
        this.accountProvider = accountProvider;
        this.rhyAccountStore = rhyAccountStore;
        this.dao = dao;
        this.endpoint = Endpoint.INSTANCE.create(new DirectDepositRelationshipStore2(this, null), getLogoutKillswitch(), new DirectDepositRelationshipStore3(this, null), storeBundle.getClock(), new DefaultStaleDecider(companion.getNormalStaleTimeout(), storeBundle.getClock()));
        Query.Companion companion2 = Query.INSTANCE;
        this.directDepositRelationshipQuery = Store.create$default(this, companion2, "getDirectDepositRelationship", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.DirectDepositRelationshipStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectDepositRelationshipStore.directDepositRelationshipQuery$lambda$0(this.f$0, (UUID) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.DirectDepositRelationshipStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectDepositRelationshipStore.directDepositRelationshipQuery$lambda$1(this.f$0, (UUID) obj);
            }
        }, false, 8, null);
        this.directDepositRelationshipsQuery = Store.create$default(this, companion2, "getDirectDepositRelationships", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.DirectDepositRelationshipStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectDepositRelationshipStore.directDepositRelationshipsQuery$lambda$2(this.f$0, (RhEntity) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.DirectDepositRelationshipStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectDepositRelationshipStore.directDepositRelationshipsQuery$lambda$4(this.f$0, (RhEntity) obj);
            }
        }, false, 8, null);
        this.directDepositRelationshipsForAmountTypeQuery = Store.create$default(this, companion2, "directDepositRelationshipsForAmountType", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.DirectDepositRelationshipStore$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectDepositRelationshipStore.directDepositRelationshipsForAmountTypeQuery$lambda$5(this.f$0, (Tuples2) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.DirectDepositRelationshipStore$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectDepositRelationshipStore.directDepositRelationshipsForAmountTypeQuery$lambda$8(this.f$0, (Tuples2) obj);
            }
        }, false, 8, null);
        this.hasDirectDepositRelationshipsQuery = Store.create$default(this, companion2, "getHasDirectDepositRelationships", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.DirectDepositRelationshipStore$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectDepositRelationshipStore.hasDirectDepositRelationshipsQuery$lambda$9(this.f$0, (RhEntity) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.DirectDepositRelationshipStore$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectDepositRelationshipStore.hasDirectDepositRelationshipsQuery$lambda$10(this.f$0, (RhEntity) obj);
            }
        }, false, 8, null);
        this.directDepositRelationshipCountQuery = Store.create$default(this, companion2, "directDepositRelationshipCountQuery", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.DirectDepositRelationshipStore$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectDepositRelationshipStore.directDepositRelationshipCountQuery$lambda$11(this.f$0, (RhEntity) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.DirectDepositRelationshipStore$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectDepositRelationshipStore.directDepositRelationshipCountQuery$lambda$12(this.f$0, (RhEntity) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow directDepositRelationshipQuery$lambda$0(DirectDepositRelationshipStore directDepositRelationshipStore, UUID it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Endpoint.DefaultImpls.poll$default(directDepositRelationshipStore.endpoint, RhEntity.RHY, DirectDepositRelationship.INSTANCE.getNormalStaleTimeout(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow directDepositRelationshipQuery$lambda$1(DirectDepositRelationshipStore directDepositRelationshipStore, UUID it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return DirectDepositRelationshipStore4.filterNotExpired((Flow<DirectDepositRelationship>) FlowKt.filterNotNull(directDepositRelationshipStore.dao.getDirectDepositRelationship(it)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow directDepositRelationshipsQuery$lambda$2(DirectDepositRelationshipStore directDepositRelationshipStore, RhEntity entityType) {
        Intrinsics.checkNotNullParameter(entityType, "entityType");
        return Endpoint.DefaultImpls.poll$default(directDepositRelationshipStore.endpoint, entityType, DirectDepositRelationship.INSTANCE.getNormalStaleTimeout(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow directDepositRelationshipsQuery$lambda$4(DirectDepositRelationshipStore directDepositRelationshipStore, RhEntity entityType) {
        Intrinsics.checkNotNullParameter(entityType, "entityType");
        DirectDepositRelationshipDao directDepositRelationshipDao = directDepositRelationshipStore.dao;
        List list = ArraysKt.toList(ApiDirectDepositRelationship.State.values());
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((ApiDirectDepositRelationship.State) obj) != ApiDirectDepositRelationship.State.EXPIRED) {
                arrayList.add(obj);
            }
        }
        return DirectDepositRelationshipStore4.mapNotExpired(directDepositRelationshipDao.getDirectDepositRelationships(entityType, arrayList));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow directDepositRelationshipsForAmountTypeQuery$lambda$5(DirectDepositRelationshipStore directDepositRelationshipStore, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        return Endpoint.DefaultImpls.poll$default(directDepositRelationshipStore.endpoint, (RhEntity) tuples2.component1(), DirectDepositRelationship.INSTANCE.getNormalStaleTimeout(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow directDepositRelationshipsForAmountTypeQuery$lambda$8(DirectDepositRelationshipStore directDepositRelationshipStore, Tuples2 tuples2) {
        Flow<List<DirectDepositRelationship>> directDepositRelationships;
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        RhEntity rhEntity = (RhEntity) tuples2.component1();
        AmountType amountType = (AmountType) tuples2.component2();
        int i = amountType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[amountType.ordinal()];
        if (i == -1) {
            DirectDepositRelationshipDao directDepositRelationshipDao = directDepositRelationshipStore.dao;
            RhEntity rhEntity2 = RhEntity.RHY;
            List list = ArraysKt.toList(ApiDirectDepositRelationship.State.values());
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((ApiDirectDepositRelationship.State) obj) != ApiDirectDepositRelationship.State.EXPIRED) {
                    arrayList.add(obj);
                }
            }
            directDepositRelationships = directDepositRelationshipDao.getDirectDepositRelationships(rhEntity2, arrayList);
        } else {
            if (i != 1 && i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            DirectDepositRelationshipDao directDepositRelationshipDao2 = directDepositRelationshipStore.dao;
            List list2 = ArraysKt.toList(ApiDirectDepositRelationship.State.values());
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list2) {
                if (((ApiDirectDepositRelationship.State) obj2) != ApiDirectDepositRelationship.State.EXPIRED) {
                    arrayList2.add(obj2);
                }
            }
            directDepositRelationships = directDepositRelationshipDao2.getDirectDepositRelationshipsForAmountType(rhEntity, amountType, arrayList2);
        }
        return DirectDepositRelationshipStore4.mapNotExpired(directDepositRelationships);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow hasDirectDepositRelationshipsQuery$lambda$9(DirectDepositRelationshipStore directDepositRelationshipStore, RhEntity entityType) {
        Intrinsics.checkNotNullParameter(entityType, "entityType");
        return Endpoint.DefaultImpls.poll$default(directDepositRelationshipStore.endpoint, entityType, DirectDepositRelationship.INSTANCE.getNormalStaleTimeout(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow hasDirectDepositRelationshipsQuery$lambda$10(DirectDepositRelationshipStore directDepositRelationshipStore, RhEntity entityType) {
        Intrinsics.checkNotNullParameter(entityType, "entityType");
        return FlowKt.filterNotNull(directDepositRelationshipStore.dao.getHasDirectDepositRelationships(entityType, ArraysKt.toList(ApiDirectDepositRelationship.State.values())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow directDepositRelationshipCountQuery$lambda$11(DirectDepositRelationshipStore directDepositRelationshipStore, RhEntity entityType) {
        Intrinsics.checkNotNullParameter(entityType, "entityType");
        return Endpoint.DefaultImpls.poll$default(directDepositRelationshipStore.endpoint, entityType, DirectDepositRelationship.INSTANCE.getNormalStaleTimeout(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow directDepositRelationshipCountQuery$lambda$12(DirectDepositRelationshipStore directDepositRelationshipStore, RhEntity entityType) {
        Intrinsics.checkNotNullParameter(entityType, "entityType");
        return FlowKt.filterNotNull(directDepositRelationshipStore.dao.getDirectDepositRelationshipCount(entityType, ArraysKt.toList(ApiDirectDepositRelationship.State.values())));
    }

    public final Observable<DirectDepositRelationship> getDirectDepositRelationship(UUID id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return this.directDepositRelationshipQuery.asObservable(id);
    }

    public final Observable<Boolean> getHasDirectDepositRelationships(RhEntity entityType) {
        Intrinsics.checkNotNullParameter(entityType, "entityType");
        return this.hasDirectDepositRelationshipsQuery.asObservable(entityType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Single forceFetchHasDirectDepositRelationshipsIfNotCached$default(DirectDepositRelationshipStore directDepositRelationshipStore, RhEntity rhEntity, List list, int i, Object obj) {
        if ((i & 2) != 0) {
            list = ArraysKt.toList(ApiDirectDepositRelationship.State.values());
        }
        return directDepositRelationshipStore.forceFetchHasDirectDepositRelationshipsIfNotCached(rhEntity, list);
    }

    /* compiled from: DirectDepositRelationshipStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.DirectDepositRelationshipStore$forceFetchHasDirectDepositRelationshipsIfNotCached$1", m3645f = "DirectDepositRelationshipStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CLOCK_VALUE, EnumC7081g.SDK_ASSET_ICON_OVERRIDE_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.DirectDepositRelationshipStore$forceFetchHasDirectDepositRelationshipsIfNotCached$1 */
    static final class C344881 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        final /* synthetic */ RhEntity $entityType;
        final /* synthetic */ List<ApiDirectDepositRelationship.State> $states;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C344881(RhEntity rhEntity, List<? extends ApiDirectDepositRelationship.State> list, Continuation<? super C344881> continuation) {
            super(2, continuation);
            this.$entityType = rhEntity;
            this.$states = list;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DirectDepositRelationshipStore.this.new C344881(this.$entityType, this.$states, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((C344881) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x005e, code lost:
        
            if (r11 == r0) goto L18;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            C344881 c344881;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            boolean zBooleanValue = true;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Boolean> hasDirectDepositRelationships = DirectDepositRelationshipStore.this.dao.getHasDirectDepositRelationships(this.$entityType, this.$states);
                this.label = 1;
                obj = FlowKt.firstOrNull(hasDirectDepositRelationships, this);
                if (obj == coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                c344881 = this;
                List results = ((PaginatedResult) obj).getResults();
                List<ApiDirectDepositRelationship.State> list = c344881.$states;
                if ((results instanceof Collection) && results.isEmpty()) {
                    zBooleanValue = false;
                } else {
                    Iterator it = results.iterator();
                    while (it.hasNext()) {
                        if (CollectionsKt.contains(list, ((ApiDirectDepositRelationship) it.next()).getState())) {
                            break;
                        }
                    }
                    zBooleanValue = false;
                }
                return boxing.boxBoolean(zBooleanValue);
            }
            ResultKt.throwOnFailure(obj);
            Boolean bool = (Boolean) obj;
            if (!Intrinsics.areEqual(bool, boxing.boxBoolean(true))) {
                Endpoint endpoint = DirectDepositRelationshipStore.this.endpoint;
                RhEntity rhEntity = this.$entityType;
                this.label = 2;
                c344881 = this;
                obj = Endpoint.DefaultImpls.forceFetch$default(endpoint, rhEntity, null, c344881, 2, null);
            } else {
                zBooleanValue = bool.booleanValue();
                return boxing.boxBoolean(zBooleanValue);
            }
        }
    }

    public final Single<Boolean> forceFetchHasDirectDepositRelationshipsIfNotCached(RhEntity entityType, List<? extends ApiDirectDepositRelationship.State> states) {
        Intrinsics.checkNotNullParameter(entityType, "entityType");
        Intrinsics.checkNotNullParameter(states, "states");
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C344881(entityType, states, null), 1, null);
    }

    public final Observable<List<DirectDepositRelationship>> getDirectDepositRelationships(RhEntity entityType) {
        Intrinsics.checkNotNullParameter(entityType, "entityType");
        return this.directDepositRelationshipsQuery.asObservable(entityType);
    }

    public final Observable<Integer> getDirectDepositRelationshipCount(RhEntity entityType) {
        Intrinsics.checkNotNullParameter(entityType, "entityType");
        return this.directDepositRelationshipCountQuery.asObservable(entityType);
    }

    public final Observable<List<DirectDepositRelationship>> getDirectDepositRelationshipsForAmountType(RhEntity entityType, AmountType amountType) {
        Intrinsics.checkNotNullParameter(entityType, "entityType");
        return this.directDepositRelationshipsForAmountTypeQuery.asObservable(Tuples4.m3642to(entityType, amountType));
    }

    public final Flow<PaginatedResult<ApiDirectDepositRelationship>> poll(RhEntity entityType) {
        Intrinsics.checkNotNullParameter(entityType, "entityType");
        return Endpoint.DefaultImpls.poll$default(this.endpoint, entityType, null, null, 6, null);
    }

    public final Job refresh(RhEntity entityType) {
        Intrinsics.checkNotNullParameter(entityType, "entityType");
        return Endpoint.DefaultImpls.refresh$default(this.endpoint, entityType, false, null, 4, null);
    }
}
