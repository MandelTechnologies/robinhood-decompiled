package com.robinhood.librobinhood.data.store;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.android.util.notification.RhGcmListenerService;
import com.robinhood.api.retrofit.Minerva;
import com.robinhood.models.api.minerva.ApiAggregateMerchant;
import com.robinhood.models.api.minerva.ApiMerchant;
import com.robinhood.models.api.minerva.ApiMerchantUserCategory;
import com.robinhood.models.dao.AggregateMerchantDao;
import com.robinhood.models.dao.MerchantDao;
import com.robinhood.models.p320db.mcduckling.p321ui.UiMerchant;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.LogoutKillswitch;
import io.reactivex.Observable;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Clock;
import p479j$.time.Duration;

/* compiled from: MerchantStore.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000e2\b\b\u0002\u0010\u0015\u001a\u00020\u0016J\u001a\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000e2\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0002J\u001e\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u001bH\u0086@¢\u0006\u0002\u0010\u001cJ\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010\u0014\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00110\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/MerchantStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "merchantDao", "Lcom/robinhood/models/dao/MerchantDao;", "aggregateMerchantDao", "Lcom/robinhood/models/dao/AggregateMerchantDao;", "minerva", "Lcom/robinhood/api/retrofit/Minerva;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/MerchantDao;Lcom/robinhood/models/dao/AggregateMerchantDao;Lcom/robinhood/api/retrofit/Minerva;)V", "getMerchantEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Ljava/util/UUID;", "Lcom/robinhood/models/api/minerva/ApiMerchant;", "getAggregateMerchantEndpoint", "Lcom/robinhood/models/api/minerva/ApiAggregateMerchant;", "refreshMerchant", "", "id", "force", "", "refreshAggregateMerchant", "setMerchantUserCategory", "merchantId", RhGcmListenerService.EXTRA_CATEGORY, "", "(Ljava/util/UUID;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "streamMerchant", "Lio/reactivex/Observable;", "Lcom/robinhood/models/db/mcduckling/ui/UiMerchant;", "lib-store-cash_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class MerchantStore extends Store {
    private final AggregateMerchantDao aggregateMerchantDao;
    private final Endpoint<UUID, ApiAggregateMerchant> getAggregateMerchantEndpoint;
    private final Endpoint<UUID, ApiMerchant> getMerchantEndpoint;
    private final MerchantDao merchantDao;
    private final Minerva minerva;

    /* compiled from: MerchantStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.MerchantStore", m3645f = "MerchantStore.kt", m3646l = {63}, m3647m = "setMerchantUserCategory")
    /* renamed from: com.robinhood.librobinhood.data.store.MerchantStore$setMerchantUserCategory$1 */
    static final class C339501 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C339501(Continuation<? super C339501> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MerchantStore.this.setMerchantUserCategory(null, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MerchantStore(StoreBundle storeBundle, MerchantDao merchantDao, AggregateMerchantDao aggregateMerchantDao, Minerva minerva) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(merchantDao, "merchantDao");
        Intrinsics.checkNotNullParameter(aggregateMerchantDao, "aggregateMerchantDao");
        Intrinsics.checkNotNullParameter(minerva, "minerva");
        this.merchantDao = merchantDao;
        this.aggregateMerchantDao = aggregateMerchantDao;
        this.minerva = minerva;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        MerchantStore4 merchantStore4 = new MerchantStore4(minerva);
        LogoutKillswitch logoutKillswitch = getLogoutKillswitch();
        MerchantStore5 merchantStore5 = new MerchantStore5(merchantDao);
        Clock clock = storeBundle.getClock();
        Duration durationOfDays = Duration.ofDays(1L);
        Intrinsics.checkNotNullExpressionValue(durationOfDays, "ofDays(...)");
        this.getMerchantEndpoint = companion.create(merchantStore4, logoutKillswitch, merchantStore5, clock, new DefaultStaleDecider(durationOfDays, storeBundle.getClock()));
        MerchantStore2 merchantStore2 = new MerchantStore2(minerva);
        LogoutKillswitch logoutKillswitch2 = getLogoutKillswitch();
        MerchantStore3 merchantStore3 = new MerchantStore3(aggregateMerchantDao);
        Clock clock2 = storeBundle.getClock();
        Duration durationOfDays2 = Duration.ofDays(1L);
        Intrinsics.checkNotNullExpressionValue(durationOfDays2, "ofDays(...)");
        this.getAggregateMerchantEndpoint = companion.create(merchantStore2, logoutKillswitch2, merchantStore3, clock2, new DefaultStaleDecider(durationOfDays2, storeBundle.getClock()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object getMerchantEndpoint$insert(MerchantDao merchantDao, ApiMerchant apiMerchant, Continuation continuation) {
        merchantDao.insert(apiMerchant);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object getAggregateMerchantEndpoint$insert$0(AggregateMerchantDao aggregateMerchantDao, ApiAggregateMerchant apiAggregateMerchant, Continuation continuation) {
        aggregateMerchantDao.insert(apiAggregateMerchant);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void refreshMerchant$default(MerchantStore merchantStore, UUID uuid, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        merchantStore.refreshMerchant(uuid, z);
    }

    public final void refreshMerchant(UUID id, boolean force) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.getMerchantEndpoint.refresh(id, force, new C339491(force, null));
    }

    /* compiled from: MerchantStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "", "<unused var>", "Ljava/util/UUID;", "merchant", "Lcom/robinhood/models/api/minerva/ApiMerchant;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.MerchantStore$refreshMerchant$1", m3645f = "MerchantStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.MerchantStore$refreshMerchant$1 */
    static final class C339491 extends ContinuationImpl7 implements Function3<UUID, ApiMerchant, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $force;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C339491(boolean z, Continuation<? super C339491> continuation) {
            super(3, continuation);
            this.$force = z;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(UUID uuid, ApiMerchant apiMerchant, Continuation<? super Unit> continuation) {
            C339491 c339491 = MerchantStore.this.new C339491(this.$force, continuation);
            c339491.L$0 = apiMerchant;
            return c339491.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                ApiMerchant apiMerchant = (ApiMerchant) this.L$0;
                MerchantStore.this.merchantDao.insert(apiMerchant);
                MerchantStore.this.refreshAggregateMerchant(apiMerchant.getAggregate_merchant_id(), this.$force);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static /* synthetic */ void refreshAggregateMerchant$default(MerchantStore merchantStore, UUID uuid, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        merchantStore.refreshAggregateMerchant(uuid, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshAggregateMerchant(UUID id, boolean force) {
        Endpoint.DefaultImpls.refresh$default(this.getAggregateMerchantEndpoint, id, force, null, 4, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object setMerchantUserCategory(UUID uuid, String str, Continuation<? super Unit> continuation) {
        C339501 c339501;
        if (continuation instanceof C339501) {
            c339501 = (C339501) continuation;
            int i = c339501.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c339501.label = i - Integer.MIN_VALUE;
            } else {
                c339501 = new C339501(continuation);
            }
        }
        Object obj = c339501.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c339501.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Minerva minerva = this.minerva;
            ApiMerchantUserCategory.Request request = new ApiMerchantUserCategory.Request(uuid, str);
            c339501.L$0 = uuid;
            c339501.label = 1;
            if (minerva.setMerchantUserCategory(uuid, request, c339501) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uuid = (UUID) c339501.L$0;
            ResultKt.throwOnFailure(obj);
        }
        refreshMerchant(uuid, true);
        return Unit.INSTANCE;
    }

    public final Observable<UiMerchant> streamMerchant(UUID id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return asObservable(takeWhileLoggedIn(FlowKt.filterNotNull(this.merchantDao.get(id))));
    }
}
