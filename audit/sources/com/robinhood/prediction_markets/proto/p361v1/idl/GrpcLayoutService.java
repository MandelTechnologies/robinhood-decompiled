package com.robinhood.prediction_markets.proto.p361v1.idl;

import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.idl.Response2;
import com.robinhood.idl.RhGenerated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GrpcLayoutService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\nJ\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0010H\u0096@¢\u0006\u0002\u0010\u0011J\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00100\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u0014H\u0096@¢\u0006\u0002\u0010\u0015J\"\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00140\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\u0018H\u0096@¢\u0006\u0002\u0010\u0019J\"\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00180\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u001cH\u0096@¢\u0006\u0002\u0010\u001dJ\"\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u001c0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\b\u001a\u00020 H\u0096@¢\u0006\u0002\u0010!J\"\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020 0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\"\u001a\u00020#2\u0006\u0010\b\u001a\u00020$H\u0096@¢\u0006\u0002\u0010%J\"\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020$0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010&\u001a\u00020'2\u0006\u0010\b\u001a\u00020(H\u0096@¢\u0006\u0002\u0010)J\"\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020(0\fH\u0096@¢\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/GrpcLayoutService;", "Lcom/robinhood/prediction_markets/proto/v1/idl/LayoutService;", "grpcClient", "Lcom/robinhood/prediction_markets/proto/v1/idl/LayoutServiceClient;", "<init>", "(Lcom/robinhood/prediction_markets/proto/v1/idl/LayoutServiceClient;)V", "ListChildNavigationNodes", "Lcom/robinhood/prediction_markets/proto/v1/idl/ListChildNavigationNodesResponseDto;", "request", "Lcom/robinhood/prediction_markets/proto/v1/idl/ListChildNavigationNodesRequestDto;", "(Lcom/robinhood/prediction_markets/proto/v1/idl/ListChildNavigationNodesRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/idl/Request;", "(Lcom/robinhood/idl/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetLayout", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetLayoutResponseDto;", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetLayoutRequestDto;", "(Lcom/robinhood/prediction_markets/proto/v1/idl/GetLayoutRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetEventState", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetEventStateResponseDto;", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetEventStateRequestDto;", "(Lcom/robinhood/prediction_markets/proto/v1/idl/GetEventStateRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetHighlights", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetHighlightsResponseDto;", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetHighlightsRequestDto;", "(Lcom/robinhood/prediction_markets/proto/v1/idl/GetHighlightsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ListStrikes", "Lcom/robinhood/prediction_markets/proto/v1/idl/ListStrikesResponseDto;", "Lcom/robinhood/prediction_markets/proto/v1/idl/ListStrikesRequestDto;", "(Lcom/robinhood/prediction_markets/proto/v1/idl/ListStrikesRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetSearchLayout", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetSearchLayoutResponseDto;", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetSearchLayoutRequestDto;", "(Lcom/robinhood/prediction_markets/proto/v1/idl/GetSearchLayoutRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetMarqueeEventsByNavId", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetMarqueeEventsByNavIdResponseDto;", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetMarqueeEventsByNavIdRequestDto;", "(Lcom/robinhood/prediction_markets/proto/v1/idl/GetMarqueeEventsByNavIdRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ListMarqueeEvents", "Lcom/robinhood/prediction_markets/proto/v1/idl/ListMarqueeEventsResponseDto;", "Lcom/robinhood/prediction_markets/proto/v1/idl/ListMarqueeEventsRequestDto;", "(Lcom/robinhood/prediction_markets/proto/v1/idl/ListMarqueeEventsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class GrpcLayoutService implements LayoutService {
    private final LayoutServiceClient grpcClient;

    /* compiled from: GrpcLayoutService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.prediction_markets.proto.v1.idl.GrpcLayoutService", m3645f = "GrpcLayoutService.kt", m3646l = {31}, m3647m = "GetEventState")
    /* renamed from: com.robinhood.prediction_markets.proto.v1.idl.GrpcLayoutService$GetEventState$1 */
    static final class C360311 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C360311(Continuation<? super C360311> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcLayoutService.this.GetEventState((GetEventStateRequestDto) null, this);
        }
    }

    /* compiled from: GrpcLayoutService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.prediction_markets.proto.v1.idl.GrpcLayoutService", m3645f = "GrpcLayoutService.kt", m3646l = {35}, m3647m = "GetHighlights")
    /* renamed from: com.robinhood.prediction_markets.proto.v1.idl.GrpcLayoutService$GetHighlights$1 */
    static final class C360321 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C360321(Continuation<? super C360321> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcLayoutService.this.GetHighlights((GetHighlightsRequestDto) null, this);
        }
    }

    /* compiled from: GrpcLayoutService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.prediction_markets.proto.v1.idl.GrpcLayoutService", m3645f = "GrpcLayoutService.kt", m3646l = {24}, m3647m = "GetLayout")
    /* renamed from: com.robinhood.prediction_markets.proto.v1.idl.GrpcLayoutService$GetLayout$1 */
    static final class C360331 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C360331(Continuation<? super C360331> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcLayoutService.this.GetLayout((GetLayoutRequestDto) null, this);
        }
    }

    /* compiled from: GrpcLayoutService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.prediction_markets.proto.v1.idl.GrpcLayoutService", m3645f = "GrpcLayoutService.kt", m3646l = {47}, m3647m = "GetMarqueeEventsByNavId")
    /* renamed from: com.robinhood.prediction_markets.proto.v1.idl.GrpcLayoutService$GetMarqueeEventsByNavId$1 */
    static final class C360341 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C360341(Continuation<? super C360341> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcLayoutService.this.GetMarqueeEventsByNavId((GetMarqueeEventsByNavIdRequestDto) null, this);
        }
    }

    /* compiled from: GrpcLayoutService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.prediction_markets.proto.v1.idl.GrpcLayoutService", m3645f = "GrpcLayoutService.kt", m3646l = {43}, m3647m = "GetSearchLayout")
    /* renamed from: com.robinhood.prediction_markets.proto.v1.idl.GrpcLayoutService$GetSearchLayout$1 */
    static final class C360351 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C360351(Continuation<? super C360351> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcLayoutService.this.GetSearchLayout((GetSearchLayoutRequestDto) null, this);
        }
    }

    /* compiled from: GrpcLayoutService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.prediction_markets.proto.v1.idl.GrpcLayoutService", m3645f = "GrpcLayoutService.kt", m3646l = {17}, m3647m = "ListChildNavigationNodes")
    /* renamed from: com.robinhood.prediction_markets.proto.v1.idl.GrpcLayoutService$ListChildNavigationNodes$1 */
    static final class C360361 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C360361(Continuation<? super C360361> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcLayoutService.this.ListChildNavigationNodes((ListChildNavigationNodesRequestDto) null, this);
        }
    }

    /* compiled from: GrpcLayoutService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.prediction_markets.proto.v1.idl.GrpcLayoutService", m3645f = "GrpcLayoutService.kt", m3646l = {51}, m3647m = "ListMarqueeEvents")
    /* renamed from: com.robinhood.prediction_markets.proto.v1.idl.GrpcLayoutService$ListMarqueeEvents$1 */
    static final class C360371 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C360371(Continuation<? super C360371> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcLayoutService.this.ListMarqueeEvents((ListMarqueeEventsRequestDto) null, this);
        }
    }

    /* compiled from: GrpcLayoutService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.prediction_markets.proto.v1.idl.GrpcLayoutService", m3645f = "GrpcLayoutService.kt", m3646l = {39}, m3647m = "ListStrikes")
    /* renamed from: com.robinhood.prediction_markets.proto.v1.idl.GrpcLayoutService$ListStrikes$1 */
    static final class C360381 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C360381(Continuation<? super C360381> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcLayoutService.this.ListStrikes((ListStrikesRequestDto) null, this);
        }
    }

    public GrpcLayoutService(LayoutServiceClient grpcClient) {
        Intrinsics.checkNotNullParameter(grpcClient, "grpcClient");
        this.grpcClient = grpcClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.prediction_markets.proto.p361v1.idl.LayoutService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object ListChildNavigationNodes(ListChildNavigationNodesRequestDto listChildNavigationNodesRequestDto, Continuation<? super ListChildNavigationNodesResponseDto> continuation) {
        C360361 c360361;
        if (continuation instanceof C360361) {
            c360361 = (C360361) continuation;
            int i = c360361.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c360361.label = i - Integer.MIN_VALUE;
            } else {
                c360361 = new C360361(continuation);
            }
        }
        Object objListChildNavigationNodes = c360361.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c360361.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objListChildNavigationNodes);
            Request<ListChildNavigationNodesRequestDto> request = new Request<>(listChildNavigationNodesRequestDto, null, 2, null);
            c360361.label = 1;
            objListChildNavigationNodes = ListChildNavigationNodes(request, c360361);
            if (objListChildNavigationNodes == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objListChildNavigationNodes);
        }
        return ((Response) objListChildNavigationNodes).getData();
    }

    @Override // com.robinhood.prediction_markets.proto.p361v1.idl.LayoutService
    public Object ListChildNavigationNodes(Request<ListChildNavigationNodesRequestDto> request, Continuation<? super Response<ListChildNavigationNodesResponseDto>> continuation) {
        return Response2.handleGrpcCall(request, ListChildNavigationNodesResponseDto.INSTANCE, this.grpcClient.ListChildNavigationNodes(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.prediction_markets.proto.p361v1.idl.LayoutService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetLayout(GetLayoutRequestDto getLayoutRequestDto, Continuation<? super GetLayoutResponseDto> continuation) {
        C360331 c360331;
        if (continuation instanceof C360331) {
            c360331 = (C360331) continuation;
            int i = c360331.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c360331.label = i - Integer.MIN_VALUE;
            } else {
                c360331 = new C360331(continuation);
            }
        }
        Object objGetLayout = c360331.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c360331.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetLayout);
            Request<GetLayoutRequestDto> request = new Request<>(getLayoutRequestDto, null, 2, null);
            c360331.label = 1;
            objGetLayout = GetLayout(request, c360331);
            if (objGetLayout == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetLayout);
        }
        return ((Response) objGetLayout).getData();
    }

    @Override // com.robinhood.prediction_markets.proto.p361v1.idl.LayoutService
    public Object GetLayout(Request<GetLayoutRequestDto> request, Continuation<? super Response<GetLayoutResponseDto>> continuation) {
        return Response2.handleGrpcCall(request, GetLayoutResponseDto.INSTANCE, this.grpcClient.GetLayout(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.prediction_markets.proto.p361v1.idl.LayoutService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetEventState(GetEventStateRequestDto getEventStateRequestDto, Continuation<? super GetEventStateResponseDto> continuation) {
        C360311 c360311;
        if (continuation instanceof C360311) {
            c360311 = (C360311) continuation;
            int i = c360311.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c360311.label = i - Integer.MIN_VALUE;
            } else {
                c360311 = new C360311(continuation);
            }
        }
        Object objGetEventState = c360311.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c360311.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetEventState);
            Request<GetEventStateRequestDto> request = new Request<>(getEventStateRequestDto, null, 2, null);
            c360311.label = 1;
            objGetEventState = GetEventState(request, c360311);
            if (objGetEventState == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetEventState);
        }
        return ((Response) objGetEventState).getData();
    }

    @Override // com.robinhood.prediction_markets.proto.p361v1.idl.LayoutService
    public Object GetEventState(Request<GetEventStateRequestDto> request, Continuation<? super Response<GetEventStateResponseDto>> continuation) {
        return Response2.handleGrpcCall(request, GetEventStateResponseDto.INSTANCE, this.grpcClient.GetEventState(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.prediction_markets.proto.p361v1.idl.LayoutService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetHighlights(GetHighlightsRequestDto getHighlightsRequestDto, Continuation<? super GetHighlightsResponseDto> continuation) {
        C360321 c360321;
        if (continuation instanceof C360321) {
            c360321 = (C360321) continuation;
            int i = c360321.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c360321.label = i - Integer.MIN_VALUE;
            } else {
                c360321 = new C360321(continuation);
            }
        }
        Object objGetHighlights = c360321.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c360321.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetHighlights);
            Request<GetHighlightsRequestDto> request = new Request<>(getHighlightsRequestDto, null, 2, null);
            c360321.label = 1;
            objGetHighlights = GetHighlights(request, c360321);
            if (objGetHighlights == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetHighlights);
        }
        return ((Response) objGetHighlights).getData();
    }

    @Override // com.robinhood.prediction_markets.proto.p361v1.idl.LayoutService
    public Object GetHighlights(Request<GetHighlightsRequestDto> request, Continuation<? super Response<GetHighlightsResponseDto>> continuation) {
        return Response2.handleGrpcCall(request, GetHighlightsResponseDto.INSTANCE, this.grpcClient.GetHighlights(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.prediction_markets.proto.p361v1.idl.LayoutService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object ListStrikes(ListStrikesRequestDto listStrikesRequestDto, Continuation<? super ListStrikesResponseDto> continuation) {
        C360381 c360381;
        if (continuation instanceof C360381) {
            c360381 = (C360381) continuation;
            int i = c360381.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c360381.label = i - Integer.MIN_VALUE;
            } else {
                c360381 = new C360381(continuation);
            }
        }
        Object objListStrikes = c360381.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c360381.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objListStrikes);
            Request<ListStrikesRequestDto> request = new Request<>(listStrikesRequestDto, null, 2, null);
            c360381.label = 1;
            objListStrikes = ListStrikes(request, c360381);
            if (objListStrikes == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objListStrikes);
        }
        return ((Response) objListStrikes).getData();
    }

    @Override // com.robinhood.prediction_markets.proto.p361v1.idl.LayoutService
    public Object ListStrikes(Request<ListStrikesRequestDto> request, Continuation<? super Response<ListStrikesResponseDto>> continuation) {
        return Response2.handleGrpcCall(request, ListStrikesResponseDto.INSTANCE, this.grpcClient.ListStrikes(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.prediction_markets.proto.p361v1.idl.LayoutService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetSearchLayout(GetSearchLayoutRequestDto getSearchLayoutRequestDto, Continuation<? super GetSearchLayoutResponseDto> continuation) {
        C360351 c360351;
        if (continuation instanceof C360351) {
            c360351 = (C360351) continuation;
            int i = c360351.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c360351.label = i - Integer.MIN_VALUE;
            } else {
                c360351 = new C360351(continuation);
            }
        }
        Object objGetSearchLayout = c360351.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c360351.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetSearchLayout);
            Request<GetSearchLayoutRequestDto> request = new Request<>(getSearchLayoutRequestDto, null, 2, null);
            c360351.label = 1;
            objGetSearchLayout = GetSearchLayout(request, c360351);
            if (objGetSearchLayout == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetSearchLayout);
        }
        return ((Response) objGetSearchLayout).getData();
    }

    @Override // com.robinhood.prediction_markets.proto.p361v1.idl.LayoutService
    public Object GetSearchLayout(Request<GetSearchLayoutRequestDto> request, Continuation<? super Response<GetSearchLayoutResponseDto>> continuation) {
        return Response2.handleGrpcCall(request, GetSearchLayoutResponseDto.INSTANCE, this.grpcClient.GetSearchLayout(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.prediction_markets.proto.p361v1.idl.LayoutService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetMarqueeEventsByNavId(GetMarqueeEventsByNavIdRequestDto getMarqueeEventsByNavIdRequestDto, Continuation<? super GetMarqueeEventsByNavIdResponseDto> continuation) {
        C360341 c360341;
        if (continuation instanceof C360341) {
            c360341 = (C360341) continuation;
            int i = c360341.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c360341.label = i - Integer.MIN_VALUE;
            } else {
                c360341 = new C360341(continuation);
            }
        }
        Object objGetMarqueeEventsByNavId = c360341.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c360341.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetMarqueeEventsByNavId);
            Request<GetMarqueeEventsByNavIdRequestDto> request = new Request<>(getMarqueeEventsByNavIdRequestDto, null, 2, null);
            c360341.label = 1;
            objGetMarqueeEventsByNavId = GetMarqueeEventsByNavId(request, c360341);
            if (objGetMarqueeEventsByNavId == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetMarqueeEventsByNavId);
        }
        return ((Response) objGetMarqueeEventsByNavId).getData();
    }

    @Override // com.robinhood.prediction_markets.proto.p361v1.idl.LayoutService
    public Object GetMarqueeEventsByNavId(Request<GetMarqueeEventsByNavIdRequestDto> request, Continuation<? super Response<GetMarqueeEventsByNavIdResponseDto>> continuation) {
        return Response2.handleGrpcCall(request, GetMarqueeEventsByNavIdResponseDto.INSTANCE, this.grpcClient.GetMarqueeEventsByNavId(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.prediction_markets.proto.p361v1.idl.LayoutService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object ListMarqueeEvents(ListMarqueeEventsRequestDto listMarqueeEventsRequestDto, Continuation<? super ListMarqueeEventsResponseDto> continuation) {
        C360371 c360371;
        if (continuation instanceof C360371) {
            c360371 = (C360371) continuation;
            int i = c360371.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c360371.label = i - Integer.MIN_VALUE;
            } else {
                c360371 = new C360371(continuation);
            }
        }
        Object objListMarqueeEvents = c360371.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c360371.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objListMarqueeEvents);
            Request<ListMarqueeEventsRequestDto> request = new Request<>(listMarqueeEventsRequestDto, null, 2, null);
            c360371.label = 1;
            objListMarqueeEvents = ListMarqueeEvents(request, c360371);
            if (objListMarqueeEvents == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objListMarqueeEvents);
        }
        return ((Response) objListMarqueeEvents).getData();
    }

    @Override // com.robinhood.prediction_markets.proto.p361v1.idl.LayoutService
    public Object ListMarqueeEvents(Request<ListMarqueeEventsRequestDto> request, Continuation<? super Response<ListMarqueeEventsResponseDto>> continuation) {
        return Response2.handleGrpcCall(request, ListMarqueeEventsResponseDto.INSTANCE, this.grpcClient.ListMarqueeEvents(), continuation);
    }
}
