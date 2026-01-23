package com.robinhood.store.isa;

import bonfire.proto.idl.accounts.p028v1.GetIsaBonusPromotionRequestDto;
import bonfire.proto.idl.accounts.p028v1.GetIsaBonusPromotionResponseDto;
import bonfire.proto.idl.accounts.p028v1.RhukIsaService;
import com.robinhood.android.isa.models.isa.p163db.dao.IsaPromotionDao;
import com.robinhood.android.isa.models.isa.p163db.entity.IsaPromotion;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;

/* compiled from: IsaPromotionStore.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/store/isa/IsaPromotionStore;", "Lcom/robinhood/store/Store;", "isaService", "Lbonfire/proto/idl/accounts/v1/RhukIsaService;", "promotionDao", "Lcom/robinhood/android/isa/models/isa/db/dao/IsaPromotionDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lbonfire/proto/idl/accounts/v1/RhukIsaService;Lcom/robinhood/android/isa/models/isa/db/dao/IsaPromotionDao;Lcom/robinhood/store/StoreBundle;)V", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lbonfire/proto/idl/accounts/v1/GetIsaBonusPromotionRequestDto;", "Lbonfire/proto/idl/accounts/v1/GetIsaBonusPromotionResponseDto;", "query", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/android/isa/models/isa/db/entity/IsaPromotion;", "streamPromotion", "Lkotlinx/coroutines/flow/Flow;", "lib-store-isa_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class IsaPromotionStore extends Store {
    private final Endpoint<GetIsaBonusPromotionRequestDto, GetIsaBonusPromotionResponseDto> endpoint;
    private final RhukIsaService isaService;
    private final IsaPromotionDao promotionDao;
    private final Query<GetIsaBonusPromotionRequestDto, IsaPromotion> query;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IsaPromotionStore(RhukIsaService isaService, IsaPromotionDao promotionDao, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(isaService, "isaService");
        Intrinsics.checkNotNullParameter(promotionDao, "promotionDao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.isaService = isaService;
        this.promotionDao = promotionDao;
        this.endpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new IsaPromotionStore2(this, null), getLogoutKillswitch(), new IsaPromotionStore3(this, null), storeBundle.getClock(), null, 16, null);
        this.query = Store.create$default(this, Query.INSTANCE, "streamIsaPromotion", CollectionsKt.listOf(new RefreshEach(new Function1() { // from class: com.robinhood.store.isa.IsaPromotionStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IsaPromotionStore.query$lambda$0(this.f$0, (GetIsaBonusPromotionRequestDto) obj);
            }
        })), new Function1() { // from class: com.robinhood.store.isa.IsaPromotionStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IsaPromotionStore.query$lambda$1(this.f$0, (GetIsaBonusPromotionRequestDto) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job query$lambda$0(IsaPromotionStore isaPromotionStore, GetIsaBonusPromotionRequestDto it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Endpoint.DefaultImpls.refresh$default(isaPromotionStore.endpoint, it, false, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow query$lambda$1(IsaPromotionStore isaPromotionStore, GetIsaBonusPromotionRequestDto it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return isaPromotionStore.promotionDao.streamPromotion();
    }

    public final Flow<IsaPromotion> streamPromotion() {
        return this.query.asFlow(new GetIsaBonusPromotionRequestDto());
    }
}
