package com.robinhood.android.tradingtrends.microgram;

import com.robinhood.coroutines.flow.BuildersKt;
import com.robinhood.coroutines.job.CachedJobManager5;
import com.robinhood.coroutines.job.CachedJobManager7;
import com.robinhood.libtradingtrends.contracts.TradingTrendsSection;
import com.robinhood.libtradingtrends.contracts.TradingTrendsService;
import com.robinhood.libtradingtrends.contracts.TradingTrendsTable;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import microgram.android.ConnectToMicrogramState;
import microgram.android.inject.MicrogramCachedComponentManager;
import microgram.android.inject.MicrogramComponent;

/* compiled from: TradingTrendsCachedService.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0001\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J.\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J:\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u000e0\r2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u0011H\u0016J\u000e\u0010\u0019\u001a\u00020\u0011H\u0096@¢\u0006\u0002\u0010\u001aJ\u001a\u0010\u001b\u001a\u00020\u001c2\n\u0010\u001d\u001a\u00060\u0011j\u0002`\u001eH\u0096@¢\u0006\u0002\u0010\u001fJ\"\u0010 \u001a\u00020\u001c2\b\u0010!\u001a\u0004\u0018\u00010\u00112\b\u0010\"\u001a\u0004\u0018\u00010\u0011H\u0096@¢\u0006\u0002\u0010#J\u000e\u0010$\u001a\u00020%H\u0096A¢\u0006\u0002\u0010\u001aR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\u00020\b*\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/tradingtrends/microgram/RealTradingTrendsCachedService;", "Lcom/robinhood/android/tradingtrends/microgram/TradingTrendsCachedService;", "Lcom/robinhood/coroutines/job/RetainableCachedJob;", "componentManager", "Lmicrogram/android/inject/MicrogramCachedComponentManager;", "<init>", "(Lmicrogram/android/inject/MicrogramCachedComponentManager;)V", "tradingTrendsService", "Lcom/robinhood/libtradingtrends/contracts/TradingTrendsService;", "Lmicrogram/android/inject/MicrogramComponent;", "getTradingTrendsService", "(Lmicrogram/android/inject/MicrogramComponent;)Lcom/robinhood/libtradingtrends/contracts/TradingTrendsService;", "getSection", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Result;", "Lcom/robinhood/libtradingtrends/contracts/TradingTrendsSection;", "instrumentId", "", "initialSelectedType", "isDetailPage", "", "getTable", "Lcom/robinhood/libtradingtrends/contracts/TradingTrendsTable;", "initialSortKey", "initialSortDirection", "getMoreInfo", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "selectType", "", "type", "Lcom/robinhood/libtradingtrends/contracts/TradingTrendsType;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sortTable", "sortKey", "sortDirection", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retainUntilCanceled", "", "lib-trading-trends-microgram_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.tradingtrends.microgram.RealTradingTrendsCachedService, reason: use source file name */
/* loaded from: classes9.dex */
public final class TradingTrendsCachedService2 implements TradingTrendsCachedService, CachedJobManager7 {
    private final MicrogramCachedComponentManager componentManager;

    @Override // com.robinhood.coroutines.job.CachedJobManager7
    public Object retainUntilCanceled(Continuation<?> continuation) {
        return this.componentManager.retainUntilCanceled(continuation);
    }

    public TradingTrendsCachedService2(MicrogramCachedComponentManager componentManager) {
        Intrinsics.checkNotNullParameter(componentManager, "componentManager");
        this.componentManager = componentManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TradingTrendsService getTradingTrendsService(MicrogramComponent microgramComponent) {
        return (TradingTrendsService) microgramComponent.getServiceLocator().getClient(TradingTrendsService.class);
    }

    /* compiled from: TradingTrendsCachedService.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/libtradingtrends/contracts/TradingTrendsSection;", "Lkotlinx/coroutines/CoroutineScope;", "it", "Lmicrogram/android/inject/MicrogramComponent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.tradingtrends.microgram.RealTradingTrendsCachedService$getSection$1", m3645f = "TradingTrendsCachedService.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.tradingtrends.microgram.RealTradingTrendsCachedService$getSection$1 */
    static final class C299691 extends ContinuationImpl7 implements Function3<CoroutineScope, MicrogramComponent, Continuation<? super Flow<? extends TradingTrendsSection>>, Object> {
        final /* synthetic */ String $initialSelectedType;
        final /* synthetic */ String $instrumentId;
        final /* synthetic */ boolean $isDetailPage;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C299691(String str, String str2, boolean z, Continuation<? super C299691> continuation) {
            super(3, continuation);
            this.$instrumentId = str;
            this.$initialSelectedType = str2;
            this.$isDetailPage = z;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, MicrogramComponent microgramComponent, Continuation<? super Flow<? extends TradingTrendsSection>> continuation) {
            return invoke2(coroutineScope, microgramComponent, (Continuation<? super Flow<TradingTrendsSection>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, MicrogramComponent microgramComponent, Continuation<? super Flow<TradingTrendsSection>> continuation) {
            C299691 c299691 = TradingTrendsCachedService2.this.new C299691(this.$instrumentId, this.$initialSelectedType, this.$isDetailPage, continuation);
            c299691.L$0 = microgramComponent;
            return c299691.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return TradingTrendsCachedService2.this.getTradingTrendsService((MicrogramComponent) this.L$0).getSection(this.$instrumentId, this.$initialSelectedType, this.$isDetailPage);
        }
    }

    @Override // com.robinhood.android.tradingtrends.microgram.TradingTrendsCachedService
    public Flow<Result<TradingTrendsSection>> getSection(String instrumentId, String initialSelectedType, boolean isDetailPage) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        return ConnectToMicrogramState.connectToMicrogramState$default(BuildersKt.mapCatchingResult(CachedJobManager5.flowFrom(this.componentManager, new C299691(instrumentId, initialSelectedType, isDetailPage, null))), this.componentManager.getMicrogramStateFlow(), null, 2, null);
    }

    /* compiled from: TradingTrendsCachedService.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/libtradingtrends/contracts/TradingTrendsTable;", "Lkotlinx/coroutines/CoroutineScope;", "it", "Lmicrogram/android/inject/MicrogramComponent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.tradingtrends.microgram.RealTradingTrendsCachedService$getTable$1", m3645f = "TradingTrendsCachedService.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.tradingtrends.microgram.RealTradingTrendsCachedService$getTable$1 */
    static final class C299701 extends ContinuationImpl7 implements Function3<CoroutineScope, MicrogramComponent, Continuation<? super Flow<? extends TradingTrendsTable>>, Object> {
        final /* synthetic */ String $initialSelectedType;
        final /* synthetic */ String $initialSortDirection;
        final /* synthetic */ String $initialSortKey;
        final /* synthetic */ String $instrumentId;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C299701(String str, String str2, String str3, String str4, Continuation<? super C299701> continuation) {
            super(3, continuation);
            this.$instrumentId = str;
            this.$initialSelectedType = str2;
            this.$initialSortKey = str3;
            this.$initialSortDirection = str4;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, MicrogramComponent microgramComponent, Continuation<? super Flow<? extends TradingTrendsTable>> continuation) {
            return invoke2(coroutineScope, microgramComponent, (Continuation<? super Flow<TradingTrendsTable>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, MicrogramComponent microgramComponent, Continuation<? super Flow<TradingTrendsTable>> continuation) {
            C299701 c299701 = TradingTrendsCachedService2.this.new C299701(this.$instrumentId, this.$initialSelectedType, this.$initialSortKey, this.$initialSortDirection, continuation);
            c299701.L$0 = microgramComponent;
            return c299701.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return TradingTrendsCachedService2.this.getTradingTrendsService((MicrogramComponent) this.L$0).getTable(this.$instrumentId, this.$initialSelectedType, this.$initialSortKey, this.$initialSortDirection);
        }
    }

    @Override // com.robinhood.android.tradingtrends.microgram.TradingTrendsCachedService
    public Flow<Result<TradingTrendsTable>> getTable(String instrumentId, String initialSelectedType, String initialSortKey, String initialSortDirection) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        return ConnectToMicrogramState.connectToMicrogramState$default(BuildersKt.mapCatchingResult(CachedJobManager5.flowFrom(this.componentManager, new C299701(instrumentId, initialSelectedType, initialSortKey, initialSortDirection, null))), this.componentManager.getMicrogramStateFlow(), null, 2, null);
    }

    /* compiled from: TradingTrendsCachedService.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "it", "Lmicrogram/android/inject/MicrogramComponent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.tradingtrends.microgram.RealTradingTrendsCachedService$getMoreInfo$2", m3645f = "TradingTrendsCachedService.kt", m3646l = {102}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.tradingtrends.microgram.RealTradingTrendsCachedService$getMoreInfo$2 */
    static final class C299682 extends ContinuationImpl7 implements Function3<CoroutineScope, MicrogramComponent, Continuation<? super String>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C299682(Continuation<? super C299682> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(CoroutineScope coroutineScope, MicrogramComponent microgramComponent, Continuation<? super String> continuation) {
            C299682 c299682 = TradingTrendsCachedService2.this.new C299682(continuation);
            c299682.L$0 = microgramComponent;
            return c299682.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            TradingTrendsService tradingTrendsService = TradingTrendsCachedService2.this.getTradingTrendsService((MicrogramComponent) this.L$0);
            this.label = 1;
            Object moreInfo = tradingTrendsService.getMoreInfo(this);
            return moreInfo == coroutine_suspended ? coroutine_suspended : moreInfo;
        }
    }

    @Override // com.robinhood.android.tradingtrends.microgram.TradingTrendsCachedService
    public Object getMoreInfo(Continuation<? super String> continuation) {
        return this.componentManager.execute(new C299682(null), continuation);
    }

    /* compiled from: TradingTrendsCachedService.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "it", "Lmicrogram/android/inject/MicrogramComponent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.tradingtrends.microgram.RealTradingTrendsCachedService$selectType$2", m3645f = "TradingTrendsCachedService.kt", m3646l = {105}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.tradingtrends.microgram.RealTradingTrendsCachedService$selectType$2 */
    static final class C299712 extends ContinuationImpl7 implements Function3<CoroutineScope, MicrogramComponent, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $type;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C299712(String str, Continuation<? super C299712> continuation) {
            super(3, continuation);
            this.$type = str;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(CoroutineScope coroutineScope, MicrogramComponent microgramComponent, Continuation<? super Unit> continuation) {
            C299712 c299712 = TradingTrendsCachedService2.this.new C299712(this.$type, continuation);
            c299712.L$0 = microgramComponent;
            return c299712.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                TradingTrendsService tradingTrendsService = TradingTrendsCachedService2.this.getTradingTrendsService((MicrogramComponent) this.L$0);
                String str = this.$type;
                this.label = 1;
                if (tradingTrendsService.selectType(str, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.tradingtrends.microgram.TradingTrendsCachedService
    public Object selectType(String str, Continuation<? super Unit> continuation) {
        Object objExecute = this.componentManager.execute(new C299712(str, null), continuation);
        return objExecute == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objExecute : Unit.INSTANCE;
    }

    /* compiled from: TradingTrendsCachedService.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "it", "Lmicrogram/android/inject/MicrogramComponent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.tradingtrends.microgram.RealTradingTrendsCachedService$sortTable$2", m3645f = "TradingTrendsCachedService.kt", m3646l = {108}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.tradingtrends.microgram.RealTradingTrendsCachedService$sortTable$2 */
    static final class C299722 extends ContinuationImpl7 implements Function3<CoroutineScope, MicrogramComponent, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $sortDirection;
        final /* synthetic */ String $sortKey;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C299722(String str, String str2, Continuation<? super C299722> continuation) {
            super(3, continuation);
            this.$sortKey = str;
            this.$sortDirection = str2;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(CoroutineScope coroutineScope, MicrogramComponent microgramComponent, Continuation<? super Unit> continuation) {
            C299722 c299722 = TradingTrendsCachedService2.this.new C299722(this.$sortKey, this.$sortDirection, continuation);
            c299722.L$0 = microgramComponent;
            return c299722.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                TradingTrendsService tradingTrendsService = TradingTrendsCachedService2.this.getTradingTrendsService((MicrogramComponent) this.L$0);
                String str = this.$sortKey;
                String str2 = this.$sortDirection;
                this.label = 1;
                if (tradingTrendsService.sortTable(str, str2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.tradingtrends.microgram.TradingTrendsCachedService
    public Object sortTable(String str, String str2, Continuation<? super Unit> continuation) {
        Object objExecute = this.componentManager.execute(new C299722(str, str2, null), continuation);
        return objExecute == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objExecute : Unit.INSTANCE;
    }
}
