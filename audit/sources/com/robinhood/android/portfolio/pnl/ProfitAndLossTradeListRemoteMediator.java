package com.robinhood.android.portfolio.pnl;

import androidx.paging.LoadType;
import androidx.paging.PagingState;
import androidx.paging.RemoteMediator;
import androidx.room.RoomDatabaseKt;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.portfolio.pnl.dao.ProfitAndLossTradeItemDao;
import com.robinhood.android.portfolio.pnl.dao.ProfitAndLossTradeItemRemoteKeyDao;
import com.robinhood.android.portfolio.pnl.database.ProfitAndLossHubDatabase;
import com.robinhood.android.portfolio.pnl.p214db.ProfitAndLossTradeItem;
import com.robinhood.android.portfolio.pnl.p214db.ProfitAndLossTradeItem2;
import com.robinhood.android.portfolio.pnl.p214db.ProfitAndLossTradeItemRemoteKey;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.HttpException;
import wormhole.service.p554v1.GetRealizedGainLossItemsRequestDto;
import wormhole.service.p554v1.GetRealizedGainLossItemsResponseDto;
import wormhole.service.p554v1.PNLService;

/* compiled from: ProfitAndLossTradeListRemoteMediator.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ*\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0013H\u0096@¢\u0006\u0002\u0010\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnl/ProfitAndLossTradeListRemoteMediator;", "Landroidx/paging/RemoteMediator;", "", "Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossTradeItem;", "profitAndLossHubDatabase", "Lcom/robinhood/android/portfolio/pnl/database/ProfitAndLossHubDatabase;", "pnlService", "Lwormhole/service/v1/PNLService;", "requestDto", "Lwormhole/service/v1/GetRealizedGainLossItemsRequestDto;", "<init>", "(Lcom/robinhood/android/portfolio/pnl/database/ProfitAndLossHubDatabase;Lwormhole/service/v1/PNLService;Lwormhole/service/v1/GetRealizedGainLossItemsRequestDto;)V", "remoteKeyDao", "Lcom/robinhood/android/portfolio/pnl/dao/ProfitAndLossTradeItemRemoteKeyDao;", AnalyticsStrings.NOTIF_STACK_EVENT_LOAD, "Landroidx/paging/RemoteMediator$MediatorResult;", "loadType", "Landroidx/paging/LoadType;", "state", "Landroidx/paging/PagingState;", "(Landroidx/paging/LoadType;Landroidx/paging/PagingState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-store-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class ProfitAndLossTradeListRemoteMediator extends RemoteMediator<Integer, ProfitAndLossTradeItem> {
    public static final int $stable = 8;
    private final PNLService pnlService;
    private final ProfitAndLossHubDatabase profitAndLossHubDatabase;
    private final ProfitAndLossTradeItemRemoteKeyDao remoteKeyDao;
    private final GetRealizedGainLossItemsRequestDto requestDto;

    /* compiled from: ProfitAndLossTradeListRemoteMediator.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoadType.values().length];
            try {
                iArr[LoadType.REFRESH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoadType.PREPEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LoadType.APPEND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: ProfitAndLossTradeListRemoteMediator.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnl.ProfitAndLossTradeListRemoteMediator", m3645f = "ProfitAndLossTradeListRemoteMediator.kt", m3646l = {43, 52, 57}, m3647m = AnalyticsStrings.NOTIF_STACK_EVENT_LOAD)
    /* renamed from: com.robinhood.android.portfolio.pnl.ProfitAndLossTradeListRemoteMediator$load$1 */
    static final class C256701 extends ContinuationImpl {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C256701(Continuation<? super C256701> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ProfitAndLossTradeListRemoteMediator.this.load(null, null, this);
        }
    }

    public ProfitAndLossTradeListRemoteMediator(ProfitAndLossHubDatabase profitAndLossHubDatabase, PNLService pnlService, GetRealizedGainLossItemsRequestDto requestDto) {
        Intrinsics.checkNotNullParameter(profitAndLossHubDatabase, "profitAndLossHubDatabase");
        Intrinsics.checkNotNullParameter(pnlService, "pnlService");
        Intrinsics.checkNotNullParameter(requestDto, "requestDto");
        this.profitAndLossHubDatabase = profitAndLossHubDatabase;
        this.pnlService = pnlService;
        this.requestDto = requestDto;
        this.remoteKeyDao = profitAndLossHubDatabase.profitAndLossTradeItemRemoteKeyDao();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ba A[Catch: HttpException -> 0x0038, IOException -> 0x003b, PHI: r0 r4
      0x00ba: PHI (r0v15 java.lang.Object) = (r0v11 java.lang.Object), (r0v1 java.lang.Object) binds: [B:45:0x00b7, B:23:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x00ba: PHI (r4v7 androidx.paging.LoadType) = (r4v5 androidx.paging.LoadType), (r4v11 androidx.paging.LoadType) binds: [B:45:0x00b7, B:23:0x004a] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {IOException -> 0x003b, HttpException -> 0x0038, blocks: (B:14:0x0033, B:58:0x00e5, B:61:0x00ea, B:23:0x004a, B:47:0x00ba, B:49:0x00c6, B:54:0x00d0, B:44:0x009c), top: B:67:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // androidx.paging.RemoteMediator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object load(LoadType loadType, PagingState<Integer, ProfitAndLossTradeItem> pagingState, Continuation<? super RemoteMediator.MediatorResult> continuation) {
        C256701 c256701;
        String str;
        LoadType loadType2;
        ProfitAndLossHubDatabase profitAndLossHubDatabase;
        C256712 c256712;
        int i;
        if (continuation instanceof C256701) {
            c256701 = (C256701) continuation;
            int i2 = c256701.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c256701.label = i2 - Integer.MIN_VALUE;
            } else {
                c256701 = new C256701(continuation);
            }
        }
        Object objWithTransaction = c256701.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c256701.label;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(objWithTransaction);
                int i4 = WhenMappings.$EnumSwitchMapping$0[loadType.ordinal()];
                if (i4 != 1) {
                    if (i4 == 2) {
                        return new RemoteMediator.MediatorResult.Success(true);
                    }
                    if (i4 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ProfitAndLossHubDatabase profitAndLossHubDatabase2 = this.profitAndLossHubDatabase;
                    ProfitAndLossTradeListRemoteMediator2 profitAndLossTradeListRemoteMediator2 = new ProfitAndLossTradeListRemoteMediator2(this, null);
                    c256701.L$0 = loadType;
                    c256701.label = 1;
                    objWithTransaction = RoomDatabaseKt.withTransaction(profitAndLossHubDatabase2, profitAndLossTradeListRemoteMediator2, c256701);
                    if (objWithTransaction != coroutine_suspended) {
                        loadType2 = loadType;
                    }
                    return coroutine_suspended;
                }
                str = null;
                loadType2 = loadType;
                PNLService pNLService = this.pnlService;
                GetRealizedGainLossItemsRequestDto getRealizedGainLossItemsRequestDtoCopy$default = GetRealizedGainLossItemsRequestDto.copy$default(this.requestDto, null, null, null, null, null, null, str, 63, null);
                c256701.L$0 = loadType2;
                c256701.label = 2;
                objWithTransaction = pNLService.GetRealizedGainLossItems(getRealizedGainLossItemsRequestDtoCopy$default, c256701);
                if (objWithTransaction == coroutine_suspended) {
                    GetRealizedGainLossItemsResponseDto getRealizedGainLossItemsResponseDto = (GetRealizedGainLossItemsResponseDto) objWithTransaction;
                    if (getRealizedGainLossItemsResponseDto.getResults().isEmpty()) {
                    }
                    profitAndLossHubDatabase = this.profitAndLossHubDatabase;
                    c256712 = new C256712(loadType2, this, getRealizedGainLossItemsResponseDto, null);
                    c256701.L$0 = null;
                    c256701.I$0 = i;
                    c256701.label = 3;
                    if (RoomDatabaseKt.withTransaction(profitAndLossHubDatabase, c256712, c256701) != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = c256701.I$0;
                    ResultKt.throwOnFailure(objWithTransaction);
                    return new RemoteMediator.MediatorResult.Success(i != 0);
                }
                loadType2 = (LoadType) c256701.L$0;
                ResultKt.throwOnFailure(objWithTransaction);
                GetRealizedGainLossItemsResponseDto getRealizedGainLossItemsResponseDto2 = (GetRealizedGainLossItemsResponseDto) objWithTransaction;
                int i5 = (!getRealizedGainLossItemsResponseDto2.getResults().isEmpty() || getRealizedGainLossItemsResponseDto2.getNext_cursor() == null) ? 1 : 0;
                profitAndLossHubDatabase = this.profitAndLossHubDatabase;
                c256712 = new C256712(loadType2, this, getRealizedGainLossItemsResponseDto2, null);
                c256701.L$0 = null;
                c256701.I$0 = i5;
                c256701.label = 3;
                if (RoomDatabaseKt.withTransaction(profitAndLossHubDatabase, c256712, c256701) != coroutine_suspended) {
                    i = i5;
                    return new RemoteMediator.MediatorResult.Success(i != 0);
                }
                return coroutine_suspended;
            }
            loadType2 = (LoadType) c256701.L$0;
            ResultKt.throwOnFailure(objWithTransaction);
            String str2 = (String) objWithTransaction;
            if (str2 == null) {
                return new RemoteMediator.MediatorResult.Success(true);
            }
            str = str2;
            PNLService pNLService2 = this.pnlService;
            GetRealizedGainLossItemsRequestDto getRealizedGainLossItemsRequestDtoCopy$default2 = GetRealizedGainLossItemsRequestDto.copy$default(this.requestDto, null, null, null, null, null, null, str, 63, null);
            c256701.L$0 = loadType2;
            c256701.label = 2;
            objWithTransaction = pNLService2.GetRealizedGainLossItems(getRealizedGainLossItemsRequestDtoCopy$default2, c256701);
            if (objWithTransaction == coroutine_suspended) {
            }
            return coroutine_suspended;
        } catch (IOException e) {
            return new RemoteMediator.MediatorResult.Error(e);
        } catch (HttpException e2) {
            return new RemoteMediator.MediatorResult.Error(e2);
        }
    }

    /* compiled from: ProfitAndLossTradeListRemoteMediator.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnl.ProfitAndLossTradeListRemoteMediator$load$2", m3645f = "ProfitAndLossTradeListRemoteMediator.kt", m3646l = {60, 61, 63, 69}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.portfolio.pnl.ProfitAndLossTradeListRemoteMediator$load$2 */
    static final class C256712 extends ContinuationImpl7 implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ GetRealizedGainLossItemsResponseDto $apiResponse;
        final /* synthetic */ LoadType $loadType;
        int label;
        final /* synthetic */ ProfitAndLossTradeListRemoteMediator this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C256712(LoadType loadType, ProfitAndLossTradeListRemoteMediator profitAndLossTradeListRemoteMediator, GetRealizedGainLossItemsResponseDto getRealizedGainLossItemsResponseDto, Continuation<? super C256712> continuation) {
            super(1, continuation);
            this.$loadType = loadType;
            this.this$0 = profitAndLossTradeListRemoteMediator;
            this.$apiResponse = getRealizedGainLossItemsResponseDto;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C256712(this.$loadType, this.this$0, this.$apiResponse, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C256712) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x009c, code lost:
        
            if (r7.insertAll(r1, r6) != r0) goto L28;
         */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x007c  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            ProfitAndLossTradeItemDao profitAndLossTradeItemDao;
            ProfitAndLossTradeItemRemoteKeyDao profitAndLossTradeItemRemoteKeyDao;
            ProfitAndLossTradeItemRemoteKey profitAndLossTradeItemRemoteKey;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.$loadType == LoadType.REFRESH) {
                    ProfitAndLossTradeItemRemoteKeyDao profitAndLossTradeItemRemoteKeyDao2 = this.this$0.remoteKeyDao;
                    this.label = 1;
                    if (profitAndLossTradeItemRemoteKeyDao2.clearAll(this) != coroutine_suspended) {
                        profitAndLossTradeItemDao = this.this$0.profitAndLossHubDatabase.profitAndLossTradeItemDao();
                        this.label = 2;
                        if (profitAndLossTradeItemDao.clearAll(this) != coroutine_suspended) {
                        }
                    }
                }
                return coroutine_suspended;
            }
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
                profitAndLossTradeItemDao = this.this$0.profitAndLossHubDatabase.profitAndLossTradeItemDao();
                this.label = 2;
                if (profitAndLossTradeItemDao.clearAll(this) != coroutine_suspended) {
                    profitAndLossTradeItemRemoteKeyDao = this.this$0.remoteKeyDao;
                    profitAndLossTradeItemRemoteKey = new ProfitAndLossTradeItemRemoteKey(this.this$0.requestDto.toString(), this.$apiResponse.getNext_cursor());
                    this.label = 3;
                    if (profitAndLossTradeItemRemoteKeyDao.insert(profitAndLossTradeItemRemoteKey, this) != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
            if (i == 2) {
                ResultKt.throwOnFailure(obj);
                profitAndLossTradeItemRemoteKeyDao = this.this$0.remoteKeyDao;
                profitAndLossTradeItemRemoteKey = new ProfitAndLossTradeItemRemoteKey(this.this$0.requestDto.toString(), this.$apiResponse.getNext_cursor());
                this.label = 3;
                if (profitAndLossTradeItemRemoteKeyDao.insert(profitAndLossTradeItemRemoteKey, this) != coroutine_suspended) {
                    ProfitAndLossTradeItemDao profitAndLossTradeItemDao2 = this.this$0.profitAndLossHubDatabase.profitAndLossTradeItemDao();
                    List<ProfitAndLossTradeItem> tradeItemDbModels = ProfitAndLossTradeItem2.getTradeItemDbModels(this.$apiResponse, this.this$0.requestDto.getSymbol());
                    this.label = 4;
                }
                return coroutine_suspended;
            }
            if (i != 3) {
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            ProfitAndLossTradeItemDao profitAndLossTradeItemDao22 = this.this$0.profitAndLossHubDatabase.profitAndLossTradeItemDao();
            List<ProfitAndLossTradeItem> tradeItemDbModels2 = ProfitAndLossTradeItem2.getTradeItemDbModels(this.$apiResponse, this.this$0.requestDto.getSymbol());
            this.label = 4;
        }
    }
}
