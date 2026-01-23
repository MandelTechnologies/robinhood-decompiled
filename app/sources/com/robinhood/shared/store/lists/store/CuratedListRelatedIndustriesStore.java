package com.robinhood.shared.store.lists.store;

import com.robinhood.android.api.discovery.DiscoveryApi;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.ApiCuratedList;
import com.robinhood.models.dao.CuratedListDao;
import com.robinhood.models.dao.CuratedListRelatedIndustriesDao;
import com.robinhood.models.p320db.CuratedListItems;
import com.robinhood.models.p320db.CuratedListRelatedIndustries;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: CuratedListRelatedIndustriesStore.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/shared/store/lists/store/CuratedListRelatedIndustriesStore;", "Lcom/robinhood/store/Store;", "discoveryApi", "Lcom/robinhood/android/api/discovery/DiscoveryApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/CuratedListRelatedIndustriesDao;", "curatedListDao", "Lcom/robinhood/models/dao/CuratedListDao;", "<init>", "(Lcom/robinhood/android/api/discovery/DiscoveryApi;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/CuratedListRelatedIndustriesDao;Lcom/robinhood/models/dao/CuratedListDao;)V", "streamCuratedListRelatedIndustries", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/models/db/CuratedListRelatedIndustries;", "uuid", "Ljava/util/UUID;", "refreshListItems", "", "lib-store-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class CuratedListRelatedIndustriesStore extends Store {
    private final CuratedListDao curatedListDao;
    private final CuratedListRelatedIndustriesDao dao;
    private final DiscoveryApi discoveryApi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CuratedListRelatedIndustriesStore(DiscoveryApi discoveryApi, StoreBundle storeBundle, CuratedListRelatedIndustriesDao dao, CuratedListDao curatedListDao) {
        super(storeBundle, CuratedListItems.INSTANCE);
        Intrinsics.checkNotNullParameter(discoveryApi, "discoveryApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(curatedListDao, "curatedListDao");
        this.discoveryApi = discoveryApi;
        this.dao = dao;
        this.curatedListDao = curatedListDao;
    }

    public final Flow<CuratedListRelatedIndustries> streamCuratedListRelatedIndustries(UUID uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        CuratedListRelatedIndustriesDao curatedListRelatedIndustriesDao = this.dao;
        String string2 = uuid.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return takeWhileLoggedIn(FlowKt.filterNotNull(curatedListRelatedIndustriesDao.get(string2)));
    }

    /* compiled from: CuratedListRelatedIndustriesStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.store.lists.store.CuratedListRelatedIndustriesStore$refreshListItems$1", m3645f = "CuratedListRelatedIndustriesStore.kt", m3646l = {33}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.store.lists.store.CuratedListRelatedIndustriesStore$refreshListItems$1 */
    static final class C399651 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $uuid;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C399651(UUID uuid, Continuation<? super C399651> continuation) {
            super(2, continuation);
            this.$uuid = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CuratedListRelatedIndustriesStore.this.new C399651(this.$uuid, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C399651) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            C399651 c399651;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                DiscoveryApi discoveryApi = CuratedListRelatedIndustriesStore.this.discoveryApi;
                String serverValue = ApiCuratedList.OwnerType.ROBINHOOD.getServerValue();
                UUID uuid = this.$uuid;
                this.label = 1;
                c399651 = this;
                obj = DiscoveryApi.DefaultImpls.getLists$default(discoveryApi, serverValue, null, uuid, c399651, 2, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                c399651 = this;
            }
            PaginatedResult<ApiCuratedList> paginatedResult = (PaginatedResult) obj;
            CuratedListRelatedIndustriesStore.this.curatedListDao.insert(paginatedResult, false);
            CuratedListRelatedIndustriesDao curatedListRelatedIndustriesDao = CuratedListRelatedIndustriesStore.this.dao;
            UUID uuid2 = c399651.$uuid;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(paginatedResult, 10));
            Iterator<ApiCuratedList> it = paginatedResult.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getId());
            }
            curatedListRelatedIndustriesDao.insert((CuratedListRelatedIndustriesDao) new CuratedListRelatedIndustries(uuid2, arrayList));
            return Unit.INSTANCE;
        }
    }

    public final void refreshListItems(UUID uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        BuildersKt__Builders_commonKt.launch$default(getStoreScope(), null, null, new C399651(uuid, null), 3, null);
    }
}
