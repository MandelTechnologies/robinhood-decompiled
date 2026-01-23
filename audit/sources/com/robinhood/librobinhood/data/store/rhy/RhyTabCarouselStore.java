package com.robinhood.librobinhood.data.store.rhy;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.api.rhy.RhyBonfireApi;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.api.bonfire.rhy.ApiRhyTabCarouselItem;
import com.robinhood.models.dao.RhyTabCarouselItemDao;
import com.robinhood.models.p320db.rhy.RhyTabCarouselDismissedItem;
import com.robinhood.models.p320db.rhy.RhyTabCarouselItem;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.schedulers.Schedulers;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;

/* compiled from: RhyTabCarouselStore.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u0012\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\f0\f0\u00132\u0006\u0010\u0015\u001a\u00020\u0011J\u0012\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\r0\u0017J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\r0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/rhy/RhyTabCarouselStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/RhyTabCarouselItemDao;", "bonfire", "Lcom/robinhood/api/rhy/RhyBonfireApi;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/RhyTabCarouselItemDao;Lcom/robinhood/api/rhy/RhyBonfireApi;)V", "rhyTabCarouselEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "", "Lcom/robinhood/models/api/bonfire/rhy/ApiRhyTabCarouselItem;", "queryRhyTabCarousel", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/models/db/rhy/RhyTabCarouselItem;", "dismissItem", "Lio/reactivex/Single;", "kotlin.jvm.PlatformType", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "streamRhyTabCarousel", "Lio/reactivex/Observable;", "refresh", "Lkotlinx/coroutines/Job;", "force", "", "lib-store-rhy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class RhyTabCarouselStore extends Store {
    private final RhyBonfireApi bonfire;
    private final RhyTabCarouselItemDao dao;
    private final Query<Unit, List<RhyTabCarouselItem>> queryRhyTabCarousel;
    private final Endpoint<Unit, List<ApiRhyTabCarouselItem>> rhyTabCarouselEndpoint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RhyTabCarouselStore(StoreBundle storeBundle, RhyTabCarouselItemDao dao, RhyBonfireApi bonfire2) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(bonfire2, "bonfire");
        this.dao = dao;
        this.bonfire = bonfire2;
        this.rhyTabCarouselEndpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new RhyTabCarouselStore2(this, null), getLogoutKillswitch(), new RhyTabCarouselStore3(this, null), storeBundle.getClock(), null, 16, null);
        this.queryRhyTabCarousel = Store.create$default(this, Query.INSTANCE, "streamRhyTabCarousel", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.rhy.RhyTabCarouselStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyTabCarouselStore.queryRhyTabCarousel$lambda$0(this.f$0, (Unit) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.rhy.RhyTabCarouselStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyTabCarouselStore.queryRhyTabCarousel$lambda$1(this.f$0, (Unit) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow queryRhyTabCarousel$lambda$0(RhyTabCarouselStore rhyTabCarouselStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Endpoint.DefaultImpls.poll$default(rhyTabCarouselStore.rhyTabCarouselEndpoint, Unit.INSTANCE, RhyTabCarouselItem.INSTANCE.getNormalStaleTimeout(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow queryRhyTabCarousel$lambda$1(RhyTabCarouselStore rhyTabCarouselStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return rhyTabCarouselStore.dao.getRhyTabCarouselItems(System.currentTimeMillis());
    }

    /* compiled from: RhyTabCarouselStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.rhy.RhyTabCarouselStore$dismissItem$1", m3645f = "RhyTabCarouselStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.rhy.RhyTabCarouselStore$dismissItem$1 */
    static final class C348741 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ RhyTabCarouselItem $item;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C348741(RhyTabCarouselItem rhyTabCarouselItem, Continuation<? super C348741> continuation) {
            super(2, continuation);
            this.$item = rhyTabCarouselItem;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RhyTabCarouselStore.this.new C348741(this.$item, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C348741) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            long jLongValue;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            long jCurrentTimeMillis = System.currentTimeMillis();
            RhyTabCarouselItemDao rhyTabCarouselItemDao = RhyTabCarouselStore.this.dao;
            String bannerId = this.$item.getBannerId();
            if (this.$item.getShowAfter() != null) {
                Long showAfter = this.$item.getShowAfter();
                Intrinsics.checkNotNull(showAfter);
                jLongValue = showAfter.longValue() + jCurrentTimeMillis;
            } else {
                jLongValue = Long.MAX_VALUE;
            }
            rhyTabCarouselItemDao.insertDismissedItem(new RhyTabCarouselDismissedItem(bannerId, jCurrentTimeMillis, jLongValue));
            return Unit.INSTANCE;
        }
    }

    public final Single<Unit> dismissItem(RhyTabCarouselItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        Single<Unit> singleSubscribeOn = RxFactory.DefaultImpls.rxSingle$default(this, null, new C348741(item, null), 1, null).subscribeOn(Schedulers.m3346io());
        Intrinsics.checkNotNullExpressionValue(singleSubscribeOn, "subscribeOn(...)");
        return singleSubscribeOn;
    }

    public final Observable<List<RhyTabCarouselItem>> streamRhyTabCarousel() {
        return this.queryRhyTabCarousel.asObservable(Unit.INSTANCE);
    }

    public final Job refresh(boolean force) {
        return Endpoint.DefaultImpls.refresh$default(this.rhyTabCarouselEndpoint, Unit.INSTANCE, force, null, 4, null);
    }
}
