package com.robinhood.android.portfolio.pnl;

import androidx.paging.Pager;
import androidx.paging.PagingConfig;
import androidx.paging.PagingData;
import androidx.paging.PagingSource;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.portfolio.pnl.dao.ProfitAndLossTradeItemDao;
import com.robinhood.android.portfolio.pnl.database.ProfitAndLossHubDatabase;
import com.robinhood.android.portfolio.pnl.p214db.ProfitAndLossTradeItem;
import com.robinhood.android.portfolio.pnl.p214db.ProfitAndLossTradeItem2;
import com.robinhood.android.portfolio.pnl.p215ui.UiProfitAndLossTradeGroup;
import com.robinhood.android.portfolio.pnl.p215ui.UiProfitAndLossTradeGroup2;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import p479j$.time.Duration;
import wormhole.service.p554v1.AssetClassDto;
import wormhole.service.p554v1.GetRealizedGainLossGroupsRequestDto;
import wormhole.service.p554v1.GetRealizedGainLossGroupsResponseDto;
import wormhole.service.p554v1.GetRealizedGainLossItemsRequestDto;
import wormhole.service.p554v1.PNLService;

/* compiled from: ProfitAndLossTradeListStore.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\"\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u001a\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\r2\u0006\u0010\u0010\u001a\u00020\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnl/ProfitAndLossTradeListStore;", "Lcom/robinhood/store/Store;", "profitAndLossTradeItemDao", "Lcom/robinhood/android/portfolio/pnl/dao/ProfitAndLossTradeItemDao;", "profitAndLossHubDatabase", "Lcom/robinhood/android/portfolio/pnl/database/ProfitAndLossHubDatabase;", "pnlService", "Lwormhole/service/v1/PNLService;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/portfolio/pnl/dao/ProfitAndLossTradeItemDao;Lcom/robinhood/android/portfolio/pnl/database/ProfitAndLossHubDatabase;Lwormhole/service/v1/PNLService;Lcom/robinhood/store/StoreBundle;)V", "getProfitAndLossTradeItems", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossTradeItem;", "requestDto", "Lwormhole/service/v1/GetRealizedGainLossItemsRequestDto;", "isCryptoPnlHubEnabled", "", "tradeSymbolListEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lwormhole/service/v1/GetRealizedGainLossGroupsRequestDto;", "Lwormhole/service/v1/GetRealizedGainLossGroupsResponseDto;", "pollTradeGroupList", "", "Lcom/robinhood/android/portfolio/pnl/ui/UiProfitAndLossTradeGroup;", "Companion", "lib-store-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class ProfitAndLossTradeListStore extends Store {
    private static final int PNL_TRADE_ITEMS_PAGE_SIZE = 200;
    private final PNLService pnlService;
    private final ProfitAndLossHubDatabase profitAndLossHubDatabase;
    private final ProfitAndLossTradeItemDao profitAndLossTradeItemDao;
    private final Endpoint<GetRealizedGainLossGroupsRequestDto, GetRealizedGainLossGroupsResponseDto> tradeSymbolListEndpoint;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfitAndLossTradeListStore(ProfitAndLossTradeItemDao profitAndLossTradeItemDao, ProfitAndLossHubDatabase profitAndLossHubDatabase, PNLService pnlService, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(profitAndLossTradeItemDao, "profitAndLossTradeItemDao");
        Intrinsics.checkNotNullParameter(profitAndLossHubDatabase, "profitAndLossHubDatabase");
        Intrinsics.checkNotNullParameter(pnlService, "pnlService");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.profitAndLossTradeItemDao = profitAndLossTradeItemDao;
        this.profitAndLossHubDatabase = profitAndLossHubDatabase;
        this.pnlService = pnlService;
        this.tradeSymbolListEndpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new ProfitAndLossTradeListStore2(this, null), getLogoutKillswitch(), new ProfitAndLossTradeListStore3(null), storeBundle.getClock(), null, 16, null);
    }

    public final Flow<PagingData<ProfitAndLossTradeItem>> getProfitAndLossTradeItems(final GetRealizedGainLossItemsRequestDto requestDto, final boolean isCryptoPnlHubEnabled) {
        Intrinsics.checkNotNullParameter(requestDto, "requestDto");
        return new Pager(new PagingConfig(200, 0, true, 200, 0, 0, 50, null), null, new ProfitAndLossTradeListRemoteMediator(this.profitAndLossHubDatabase, this.pnlService, requestDto), new Function0() { // from class: com.robinhood.android.portfolio.pnl.ProfitAndLossTradeListStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProfitAndLossTradeListStore.getProfitAndLossTradeItems$lambda$1(requestDto, isCryptoPnlHubEnabled, this);
            }
        }, 2, null).getFlow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PagingSource getProfitAndLossTradeItems$lambda$1(GetRealizedGainLossItemsRequestDto getRealizedGainLossItemsRequestDto, boolean z, ProfitAndLossTradeListStore profitAndLossTradeListStore) {
        String symbol = getRealizedGainLossItemsRequestDto.getSymbol();
        if (symbol == null) {
            return profitAndLossTradeListStore.profitAndLossTradeItemDao.getTradeItemsPagingSource();
        }
        if (z) {
            ProfitAndLossTradeItemDao profitAndLossTradeItemDao = profitAndLossTradeListStore.profitAndLossTradeItemDao;
            List<AssetClassDto> asset_classes = getRealizedGainLossItemsRequestDto.getAsset_classes();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(asset_classes, 10));
            Iterator<T> it = asset_classes.iterator();
            while (it.hasNext()) {
                arrayList.add(ProfitAndLossTradeItem2.toDbModel((AssetClassDto) it.next()));
            }
            return profitAndLossTradeItemDao.getTradeItemsPagingSourceWithSymbolAndAssetClasses(symbol, arrayList);
        }
        return profitAndLossTradeListStore.profitAndLossTradeItemDao.getTradeItemsPagingSourceWithSymbol(symbol);
    }

    public final Flow<List<UiProfitAndLossTradeGroup>> pollTradeGroupList(GetRealizedGainLossGroupsRequestDto requestDto) {
        Intrinsics.checkNotNullParameter(requestDto, "requestDto");
        Endpoint<GetRealizedGainLossGroupsRequestDto, GetRealizedGainLossGroupsResponseDto> endpoint = this.tradeSymbolListEndpoint;
        Duration durationOfMinutes = Duration.ofMinutes(1L);
        Intrinsics.checkNotNullExpressionValue(durationOfMinutes, "ofMinutes(...)");
        final Flow flowPoll$default = Endpoint.DefaultImpls.poll$default(endpoint, requestDto, durationOfMinutes, null, 4, null);
        return new Flow<List<? extends UiProfitAndLossTradeGroup>>() { // from class: com.robinhood.android.portfolio.pnl.ProfitAndLossTradeListStore$pollTradeGroupList$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.portfolio.pnl.ProfitAndLossTradeListStore$pollTradeGroupList$$inlined$map$1$2 */
            public static final class C256722<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnl.ProfitAndLossTradeListStore$pollTradeGroupList$$inlined$map$1$2", m3645f = "ProfitAndLossTradeListStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.portfolio.pnl.ProfitAndLossTradeListStore$pollTradeGroupList$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C256722.this.emit(null, this);
                    }
                }

                public C256722(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        List<UiProfitAndLossTradeGroup> tradeGroupUiModels = UiProfitAndLossTradeGroup2.getTradeGroupUiModels((GetRealizedGainLossGroupsResponseDto) obj);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(tradeGroupUiModels, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super List<? extends UiProfitAndLossTradeGroup>> flowCollector, Continuation continuation) {
                Object objCollect = flowPoll$default.collect(new C256722(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }
}
