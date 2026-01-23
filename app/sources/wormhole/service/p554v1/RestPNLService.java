package wormhole.service.p554v1;

import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.idl.Response2;
import com.robinhood.idl.RhGenerated;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RestPNLService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\nJ\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0010H\u0096@¢\u0006\u0002\u0010\u0011J\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00100\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u0014H\u0096@¢\u0006\u0002\u0010\u0015J\"\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00140\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\u0018H\u0096@¢\u0006\u0002\u0010\u0019J\"\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00180\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u001cH\u0096@¢\u0006\u0002\u0010\u001dJ\"\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u001c0\fH\u0096@¢\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m3636d2 = {"Lwormhole/service/v1/RestPNLService;", "Lwormhole/service/v1/PNLService;", "retrofit", "Lwormhole/service/v1/PNLServiceRetrofit;", "<init>", "(Lwormhole/service/v1/PNLServiceRetrofit;)V", "GetSupportedAssetClasses", "Lwormhole/service/v1/GetSupportedAssetClassesResponseDto;", "request", "Lwormhole/service/v1/GetSupportedAssetClassesRequestDto;", "(Lwormhole/service/v1/GetSupportedAssetClassesRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/idl/Request;", "(Lcom/robinhood/idl/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetRealizedGainLossItems", "Lwormhole/service/v1/GetRealizedGainLossItemsResponseDto;", "Lwormhole/service/v1/GetRealizedGainLossItemsRequestDto;", "(Lwormhole/service/v1/GetRealizedGainLossItemsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetRealizedGainLossItem", "Lwormhole/service/v1/GetRealizedGainLossItemResponseDto;", "Lwormhole/service/v1/GetRealizedGainLossItemRequestDto;", "(Lwormhole/service/v1/GetRealizedGainLossItemRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetRealizedGainLossGroups", "Lwormhole/service/v1/GetRealizedGainLossGroupsResponseDto;", "Lwormhole/service/v1/GetRealizedGainLossGroupsRequestDto;", "(Lwormhole/service/v1/GetRealizedGainLossGroupsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetRealizedPerformanceSummary", "Lwormhole/service/v1/GetRealizedPerformanceSummaryResponseDto;", "Lwormhole/service/v1/GetRealizedPerformanceSummaryRequestDto;", "(Lwormhole/service/v1/GetRealizedPerformanceSummaryRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes28.dex */
public final class RestPNLService implements PNLService {
    private final PNLServiceRetrofit retrofit;

    /* compiled from: RestPNLService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "wormhole.service.v1.RestPNLService", m3645f = "RestPNLService.kt", m3646l = {55}, m3647m = "GetRealizedGainLossGroups")
    /* renamed from: wormhole.service.v1.RestPNLService$GetRealizedGainLossGroups$1 */
    static final class C491941 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C491941(Continuation<? super C491941> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestPNLService.this.GetRealizedGainLossGroups((GetRealizedGainLossGroupsRequestDto) null, this);
        }
    }

    /* compiled from: RestPNLService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "wormhole.service.v1.RestPNLService", m3645f = "RestPNLService.kt", m3646l = {58}, m3647m = "GetRealizedGainLossGroups")
    /* renamed from: wormhole.service.v1.RestPNLService$GetRealizedGainLossGroups$2 */
    static final class C491952 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C491952(Continuation<? super C491952> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestPNLService.this.GetRealizedGainLossGroups((Request<GetRealizedGainLossGroupsRequestDto>) null, this);
        }
    }

    /* compiled from: RestPNLService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "wormhole.service.v1.RestPNLService", m3645f = "RestPNLService.kt", m3646l = {43}, m3647m = "GetRealizedGainLossItem")
    /* renamed from: wormhole.service.v1.RestPNLService$GetRealizedGainLossItem$1 */
    static final class C491961 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C491961(Continuation<? super C491961> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestPNLService.this.GetRealizedGainLossItem((GetRealizedGainLossItemRequestDto) null, this);
        }
    }

    /* compiled from: RestPNLService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "wormhole.service.v1.RestPNLService", m3645f = "RestPNLService.kt", m3646l = {46}, m3647m = "GetRealizedGainLossItem")
    /* renamed from: wormhole.service.v1.RestPNLService$GetRealizedGainLossItem$2 */
    static final class C491972 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C491972(Continuation<? super C491972> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestPNLService.this.GetRealizedGainLossItem((Request<GetRealizedGainLossItemRequestDto>) null, this);
        }
    }

    /* compiled from: RestPNLService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "wormhole.service.v1.RestPNLService", m3645f = "RestPNLService.kt", m3646l = {27}, m3647m = "GetRealizedGainLossItems")
    /* renamed from: wormhole.service.v1.RestPNLService$GetRealizedGainLossItems$1 */
    static final class C491981 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C491981(Continuation<? super C491981> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestPNLService.this.GetRealizedGainLossItems((GetRealizedGainLossItemsRequestDto) null, this);
        }
    }

    /* compiled from: RestPNLService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "wormhole.service.v1.RestPNLService", m3645f = "RestPNLService.kt", m3646l = {30}, m3647m = "GetRealizedGainLossItems")
    /* renamed from: wormhole.service.v1.RestPNLService$GetRealizedGainLossItems$2 */
    static final class C491992 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C491992(Continuation<? super C491992> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestPNLService.this.GetRealizedGainLossItems((Request<GetRealizedGainLossItemsRequestDto>) null, this);
        }
    }

    /* compiled from: RestPNLService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "wormhole.service.v1.RestPNLService", m3645f = "RestPNLService.kt", m3646l = {70}, m3647m = "GetRealizedPerformanceSummary")
    /* renamed from: wormhole.service.v1.RestPNLService$GetRealizedPerformanceSummary$1 */
    static final class C492001 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C492001(Continuation<? super C492001> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestPNLService.this.GetRealizedPerformanceSummary((GetRealizedPerformanceSummaryRequestDto) null, this);
        }
    }

    /* compiled from: RestPNLService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "wormhole.service.v1.RestPNLService", m3645f = "RestPNLService.kt", m3646l = {73}, m3647m = "GetRealizedPerformanceSummary")
    /* renamed from: wormhole.service.v1.RestPNLService$GetRealizedPerformanceSummary$2 */
    static final class C492012 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C492012(Continuation<? super C492012> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestPNLService.this.GetRealizedPerformanceSummary((Request<GetRealizedPerformanceSummaryRequestDto>) null, this);
        }
    }

    /* compiled from: RestPNLService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "wormhole.service.v1.RestPNLService", m3645f = "RestPNLService.kt", m3646l = {17}, m3647m = "GetSupportedAssetClasses")
    /* renamed from: wormhole.service.v1.RestPNLService$GetSupportedAssetClasses$1 */
    static final class C492021 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C492021(Continuation<? super C492021> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestPNLService.this.GetSupportedAssetClasses((GetSupportedAssetClassesRequestDto) null, this);
        }
    }

    /* compiled from: RestPNLService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "wormhole.service.v1.RestPNLService", m3645f = "RestPNLService.kt", m3646l = {20}, m3647m = "GetSupportedAssetClasses")
    /* renamed from: wormhole.service.v1.RestPNLService$GetSupportedAssetClasses$2 */
    static final class C492032 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C492032(Continuation<? super C492032> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestPNLService.this.GetSupportedAssetClasses((Request<GetSupportedAssetClassesRequestDto>) null, this);
        }
    }

    public RestPNLService(PNLServiceRetrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        this.retrofit = retrofit;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // wormhole.service.p554v1.PNLService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetSupportedAssetClasses(GetSupportedAssetClassesRequestDto getSupportedAssetClassesRequestDto, Continuation<? super GetSupportedAssetClassesResponseDto> continuation) {
        C492021 c492021;
        if (continuation instanceof C492021) {
            c492021 = (C492021) continuation;
            int i = c492021.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c492021.label = i - Integer.MIN_VALUE;
            } else {
                c492021 = new C492021(continuation);
            }
        }
        Object objGetSupportedAssetClasses = c492021.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c492021.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetSupportedAssetClasses);
            Request<GetSupportedAssetClassesRequestDto> request = new Request<>(getSupportedAssetClassesRequestDto, null, 2, null);
            c492021.label = 1;
            objGetSupportedAssetClasses = GetSupportedAssetClasses(request, c492021);
            if (objGetSupportedAssetClasses == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetSupportedAssetClasses);
        }
        return ((Response) objGetSupportedAssetClasses).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetSupportedAssetClasses(Request<GetSupportedAssetClassesRequestDto> request, Continuation<? super Response<GetSupportedAssetClassesResponseDto>> continuation) {
        C492032 c492032;
        if (continuation instanceof C492032) {
            c492032 = (C492032) continuation;
            int i = c492032.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c492032.label = i - Integer.MIN_VALUE;
            } else {
                c492032 = new C492032(continuation);
            }
        }
        Object objGetSupportedAssetClasses = c492032.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c492032.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetSupportedAssetClasses);
            PNLServiceRetrofit pNLServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String account_number = request.getData().getAccount_number();
            c492032.label = 1;
            objGetSupportedAssetClasses = pNLServiceRetrofit.GetSupportedAssetClasses(metadata, account_number, c492032);
            if (objGetSupportedAssetClasses == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetSupportedAssetClasses);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetSupportedAssetClasses);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // wormhole.service.p554v1.PNLService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetRealizedGainLossItems(GetRealizedGainLossItemsRequestDto getRealizedGainLossItemsRequestDto, Continuation<? super GetRealizedGainLossItemsResponseDto> continuation) {
        C491981 c491981;
        if (continuation instanceof C491981) {
            c491981 = (C491981) continuation;
            int i = c491981.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c491981.label = i - Integer.MIN_VALUE;
            } else {
                c491981 = new C491981(continuation);
            }
        }
        Object objGetRealizedGainLossItems = c491981.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c491981.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetRealizedGainLossItems);
            Request<GetRealizedGainLossItemsRequestDto> request = new Request<>(getRealizedGainLossItemsRequestDto, null, 2, null);
            c491981.label = 1;
            objGetRealizedGainLossItems = GetRealizedGainLossItems(request, c491981);
            if (objGetRealizedGainLossItems == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetRealizedGainLossItems);
        }
        return ((Response) objGetRealizedGainLossItems).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetRealizedGainLossItems(Request<GetRealizedGainLossItemsRequestDto> request, Continuation<? super Response<GetRealizedGainLossItemsResponseDto>> continuation) {
        C491992 c491992;
        if (continuation instanceof C491992) {
            c491992 = (C491992) continuation;
            int i = c491992.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c491992.label = i - Integer.MIN_VALUE;
            } else {
                c491992 = new C491992(continuation);
            }
        }
        C491992 c4919922 = c491992;
        Object objGetRealizedGainLossItems = c4919922.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c4919922.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetRealizedGainLossItems);
            PNLServiceRetrofit pNLServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String account_number = !Intrinsics.areEqual(request.getData().getAccount_number(), "") ? request.getData().getAccount_number() : null;
            SpanDto span = request.getData().getSpan() != SpanDto.INSTANCE.getZeroValue() ? request.getData().getSpan() : null;
            List<AssetClassDto> asset_classes = request.getData().getAsset_classes();
            SortTypeDto sort_type = request.getData().getSort_type();
            SortDirectionDto sort_direction = request.getData().getSort_direction();
            String symbol = request.getData().getSymbol();
            String next_cursor = request.getData().getNext_cursor();
            c4919922.label = 1;
            objGetRealizedGainLossItems = pNLServiceRetrofit.GetRealizedGainLossItems(metadata, account_number, span, asset_classes, sort_type, sort_direction, symbol, next_cursor, c4919922);
            if (objGetRealizedGainLossItems == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetRealizedGainLossItems);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetRealizedGainLossItems);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // wormhole.service.p554v1.PNLService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetRealizedGainLossItem(GetRealizedGainLossItemRequestDto getRealizedGainLossItemRequestDto, Continuation<? super GetRealizedGainLossItemResponseDto> continuation) {
        C491961 c491961;
        if (continuation instanceof C491961) {
            c491961 = (C491961) continuation;
            int i = c491961.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c491961.label = i - Integer.MIN_VALUE;
            } else {
                c491961 = new C491961(continuation);
            }
        }
        Object objGetRealizedGainLossItem = c491961.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c491961.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetRealizedGainLossItem);
            Request<GetRealizedGainLossItemRequestDto> request = new Request<>(getRealizedGainLossItemRequestDto, null, 2, null);
            c491961.label = 1;
            objGetRealizedGainLossItem = GetRealizedGainLossItem(request, c491961);
            if (objGetRealizedGainLossItem == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetRealizedGainLossItem);
        }
        return ((Response) objGetRealizedGainLossItem).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetRealizedGainLossItem(Request<GetRealizedGainLossItemRequestDto> request, Continuation<? super Response<GetRealizedGainLossItemResponseDto>> continuation) {
        C491972 c491972;
        if (continuation instanceof C491972) {
            c491972 = (C491972) continuation;
            int i = c491972.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c491972.label = i - Integer.MIN_VALUE;
            } else {
                c491972 = new C491972(continuation);
            }
        }
        C491972 c4919722 = c491972;
        Object objGetRealizedGainLossItem = c4919722.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c4919722.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetRealizedGainLossItem);
            PNLServiceRetrofit pNLServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            AssetClassDto asset_class = request.getData().getAsset_class();
            String id = request.getData().getId();
            String account_number = !Intrinsics.areEqual(request.getData().getAccount_number(), "") ? request.getData().getAccount_number() : null;
            c4919722.label = 1;
            objGetRealizedGainLossItem = pNLServiceRetrofit.GetRealizedGainLossItem(metadata, asset_class, id, account_number, c4919722);
            if (objGetRealizedGainLossItem == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetRealizedGainLossItem);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetRealizedGainLossItem);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // wormhole.service.p554v1.PNLService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetRealizedGainLossGroups(GetRealizedGainLossGroupsRequestDto getRealizedGainLossGroupsRequestDto, Continuation<? super GetRealizedGainLossGroupsResponseDto> continuation) {
        C491941 c491941;
        if (continuation instanceof C491941) {
            c491941 = (C491941) continuation;
            int i = c491941.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c491941.label = i - Integer.MIN_VALUE;
            } else {
                c491941 = new C491941(continuation);
            }
        }
        Object objGetRealizedGainLossGroups = c491941.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c491941.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetRealizedGainLossGroups);
            Request<GetRealizedGainLossGroupsRequestDto> request = new Request<>(getRealizedGainLossGroupsRequestDto, null, 2, null);
            c491941.label = 1;
            objGetRealizedGainLossGroups = GetRealizedGainLossGroups(request, c491941);
            if (objGetRealizedGainLossGroups == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetRealizedGainLossGroups);
        }
        return ((Response) objGetRealizedGainLossGroups).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetRealizedGainLossGroups(Request<GetRealizedGainLossGroupsRequestDto> request, Continuation<? super Response<GetRealizedGainLossGroupsResponseDto>> continuation) {
        C491952 c491952;
        if (continuation instanceof C491952) {
            c491952 = (C491952) continuation;
            int i = c491952.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c491952.label = i - Integer.MIN_VALUE;
            } else {
                c491952 = new C491952(continuation);
            }
        }
        C491952 c4919522 = c491952;
        Object objGetRealizedGainLossGroups = c4919522.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c4919522.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetRealizedGainLossGroups);
            PNLServiceRetrofit pNLServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            GroupTypeDto group_type = request.getData().getGroup_type();
            String account_number = !Intrinsics.areEqual(request.getData().getAccount_number(), "") ? request.getData().getAccount_number() : null;
            SpanDto span = request.getData().getSpan() != SpanDto.INSTANCE.getZeroValue() ? request.getData().getSpan() : null;
            List<AssetClassDto> asset_classes = request.getData().getAsset_classes();
            SortTypeDto sort_type = request.getData().getSort_type();
            SortDirectionDto sort_direction = request.getData().getSort_direction();
            c4919522.label = 1;
            objGetRealizedGainLossGroups = pNLServiceRetrofit.GetRealizedGainLossGroups(metadata, group_type, account_number, span, asset_classes, sort_type, sort_direction, c4919522);
            if (objGetRealizedGainLossGroups == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetRealizedGainLossGroups);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetRealizedGainLossGroups);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // wormhole.service.p554v1.PNLService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetRealizedPerformanceSummary(GetRealizedPerformanceSummaryRequestDto getRealizedPerformanceSummaryRequestDto, Continuation<? super GetRealizedPerformanceSummaryResponseDto> continuation) {
        C492001 c492001;
        if (continuation instanceof C492001) {
            c492001 = (C492001) continuation;
            int i = c492001.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c492001.label = i - Integer.MIN_VALUE;
            } else {
                c492001 = new C492001(continuation);
            }
        }
        Object objGetRealizedPerformanceSummary = c492001.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c492001.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetRealizedPerformanceSummary);
            Request<GetRealizedPerformanceSummaryRequestDto> request = new Request<>(getRealizedPerformanceSummaryRequestDto, null, 2, null);
            c492001.label = 1;
            objGetRealizedPerformanceSummary = GetRealizedPerformanceSummary(request, c492001);
            if (objGetRealizedPerformanceSummary == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetRealizedPerformanceSummary);
        }
        return ((Response) objGetRealizedPerformanceSummary).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetRealizedPerformanceSummary(Request<GetRealizedPerformanceSummaryRequestDto> request, Continuation<? super Response<GetRealizedPerformanceSummaryResponseDto>> continuation) {
        C492012 c492012;
        if (continuation instanceof C492012) {
            c492012 = (C492012) continuation;
            int i = c492012.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c492012.label = i - Integer.MIN_VALUE;
            } else {
                c492012 = new C492012(continuation);
            }
        }
        Object objGetRealizedPerformanceSummary = c492012.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c492012.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetRealizedPerformanceSummary);
            PNLServiceRetrofit pNLServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String instrument_id = request.getData().getInstrument_id();
            String account_number = !Intrinsics.areEqual(request.getData().getAccount_number(), "") ? request.getData().getAccount_number() : null;
            c492012.label = 1;
            objGetRealizedPerformanceSummary = pNLServiceRetrofit.GetRealizedPerformanceSummary(metadata, instrument_id, account_number, c492012);
            if (objGetRealizedPerformanceSummary == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetRealizedPerformanceSummary);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetRealizedPerformanceSummary);
    }
}
