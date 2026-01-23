package com.robinhood.prediction_markets.proto.p361v1.idl;

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
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RestLayoutService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\nJ\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0010H\u0096@¢\u0006\u0002\u0010\u0011J\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00100\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u0014H\u0096@¢\u0006\u0002\u0010\u0015J\"\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00140\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\u0018H\u0096@¢\u0006\u0002\u0010\u0019J\"\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00180\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u001cH\u0096@¢\u0006\u0002\u0010\u001dJ\"\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u001c0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\b\u001a\u00020 H\u0096@¢\u0006\u0002\u0010!J\"\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020 0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\"\u001a\u00020#2\u0006\u0010\b\u001a\u00020$H\u0096@¢\u0006\u0002\u0010%J\"\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020$0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010&\u001a\u00020'2\u0006\u0010\b\u001a\u00020(H\u0096@¢\u0006\u0002\u0010)J\"\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020(0\fH\u0096@¢\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/RestLayoutService;", "Lcom/robinhood/prediction_markets/proto/v1/idl/LayoutService;", "retrofit", "Lcom/robinhood/prediction_markets/proto/v1/idl/LayoutServiceRetrofit;", "<init>", "(Lcom/robinhood/prediction_markets/proto/v1/idl/LayoutServiceRetrofit;)V", "ListChildNavigationNodes", "Lcom/robinhood/prediction_markets/proto/v1/idl/ListChildNavigationNodesResponseDto;", "request", "Lcom/robinhood/prediction_markets/proto/v1/idl/ListChildNavigationNodesRequestDto;", "(Lcom/robinhood/prediction_markets/proto/v1/idl/ListChildNavigationNodesRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/idl/Request;", "(Lcom/robinhood/idl/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetLayout", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetLayoutResponseDto;", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetLayoutRequestDto;", "(Lcom/robinhood/prediction_markets/proto/v1/idl/GetLayoutRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetEventState", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetEventStateResponseDto;", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetEventStateRequestDto;", "(Lcom/robinhood/prediction_markets/proto/v1/idl/GetEventStateRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetHighlights", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetHighlightsResponseDto;", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetHighlightsRequestDto;", "(Lcom/robinhood/prediction_markets/proto/v1/idl/GetHighlightsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ListStrikes", "Lcom/robinhood/prediction_markets/proto/v1/idl/ListStrikesResponseDto;", "Lcom/robinhood/prediction_markets/proto/v1/idl/ListStrikesRequestDto;", "(Lcom/robinhood/prediction_markets/proto/v1/idl/ListStrikesRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetSearchLayout", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetSearchLayoutResponseDto;", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetSearchLayoutRequestDto;", "(Lcom/robinhood/prediction_markets/proto/v1/idl/GetSearchLayoutRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetMarqueeEventsByNavId", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetMarqueeEventsByNavIdResponseDto;", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetMarqueeEventsByNavIdRequestDto;", "(Lcom/robinhood/prediction_markets/proto/v1/idl/GetMarqueeEventsByNavIdRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ListMarqueeEvents", "Lcom/robinhood/prediction_markets/proto/v1/idl/ListMarqueeEventsResponseDto;", "Lcom/robinhood/prediction_markets/proto/v1/idl/ListMarqueeEventsRequestDto;", "(Lcom/robinhood/prediction_markets/proto/v1/idl/ListMarqueeEventsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class RestLayoutService implements LayoutService {
    private final LayoutServiceRetrofit retrofit;

    /* compiled from: RestLayoutService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.prediction_markets.proto.v1.idl.RestLayoutService", m3645f = "RestLayoutService.kt", m3646l = {46}, m3647m = "GetEventState")
    /* renamed from: com.robinhood.prediction_markets.proto.v1.idl.RestLayoutService$GetEventState$1 */
    static final class C360931 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C360931(Continuation<? super C360931> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestLayoutService.this.GetEventState((GetEventStateRequestDto) null, this);
        }
    }

    /* compiled from: RestLayoutService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.prediction_markets.proto.v1.idl.RestLayoutService", m3645f = "RestLayoutService.kt", m3646l = {49}, m3647m = "GetEventState")
    /* renamed from: com.robinhood.prediction_markets.proto.v1.idl.RestLayoutService$GetEventState$2 */
    static final class C360942 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C360942(Continuation<? super C360942> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestLayoutService.this.GetEventState((Request<GetEventStateRequestDto>) null, this);
        }
    }

    /* compiled from: RestLayoutService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.prediction_markets.proto.v1.idl.RestLayoutService", m3645f = "RestLayoutService.kt", m3646l = {56}, m3647m = "GetHighlights")
    /* renamed from: com.robinhood.prediction_markets.proto.v1.idl.RestLayoutService$GetHighlights$1 */
    static final class C360951 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C360951(Continuation<? super C360951> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestLayoutService.this.GetHighlights((GetHighlightsRequestDto) null, this);
        }
    }

    /* compiled from: RestLayoutService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.prediction_markets.proto.v1.idl.RestLayoutService", m3645f = "RestLayoutService.kt", m3646l = {59}, m3647m = "GetHighlights")
    /* renamed from: com.robinhood.prediction_markets.proto.v1.idl.RestLayoutService$GetHighlights$2 */
    static final class C360962 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C360962(Continuation<? super C360962> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestLayoutService.this.GetHighlights((Request<GetHighlightsRequestDto>) null, this);
        }
    }

    /* compiled from: RestLayoutService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.prediction_markets.proto.v1.idl.RestLayoutService", m3645f = "RestLayoutService.kt", m3646l = {30}, m3647m = "GetLayout")
    /* renamed from: com.robinhood.prediction_markets.proto.v1.idl.RestLayoutService$GetLayout$1 */
    static final class C360971 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C360971(Continuation<? super C360971> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestLayoutService.this.GetLayout((GetLayoutRequestDto) null, this);
        }
    }

    /* compiled from: RestLayoutService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.prediction_markets.proto.v1.idl.RestLayoutService", m3645f = "RestLayoutService.kt", m3646l = {36}, m3647m = "GetLayout")
    /* renamed from: com.robinhood.prediction_markets.proto.v1.idl.RestLayoutService$GetLayout$2 */
    static final class C360982 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C360982(Continuation<? super C360982> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestLayoutService.this.GetLayout((Request<GetLayoutRequestDto>) null, this);
        }
    }

    /* compiled from: RestLayoutService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.prediction_markets.proto.v1.idl.RestLayoutService", m3645f = "RestLayoutService.kt", m3646l = {86}, m3647m = "GetMarqueeEventsByNavId")
    /* renamed from: com.robinhood.prediction_markets.proto.v1.idl.RestLayoutService$GetMarqueeEventsByNavId$1 */
    static final class C360991 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C360991(Continuation<? super C360991> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestLayoutService.this.GetMarqueeEventsByNavId((GetMarqueeEventsByNavIdRequestDto) null, this);
        }
    }

    /* compiled from: RestLayoutService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.prediction_markets.proto.v1.idl.RestLayoutService", m3645f = "RestLayoutService.kt", m3646l = {89}, m3647m = "GetMarqueeEventsByNavId")
    /* renamed from: com.robinhood.prediction_markets.proto.v1.idl.RestLayoutService$GetMarqueeEventsByNavId$2 */
    static final class C361002 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C361002(Continuation<? super C361002> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestLayoutService.this.GetMarqueeEventsByNavId((Request<GetMarqueeEventsByNavIdRequestDto>) null, this);
        }
    }

    /* compiled from: RestLayoutService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.prediction_markets.proto.v1.idl.RestLayoutService", m3645f = "RestLayoutService.kt", m3646l = {77}, m3647m = "GetSearchLayout")
    /* renamed from: com.robinhood.prediction_markets.proto.v1.idl.RestLayoutService$GetSearchLayout$1 */
    static final class C361011 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C361011(Continuation<? super C361011> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestLayoutService.this.GetSearchLayout((GetSearchLayoutRequestDto) null, this);
        }
    }

    /* compiled from: RestLayoutService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.prediction_markets.proto.v1.idl.RestLayoutService", m3645f = "RestLayoutService.kt", m3646l = {80}, m3647m = "GetSearchLayout")
    /* renamed from: com.robinhood.prediction_markets.proto.v1.idl.RestLayoutService$GetSearchLayout$2 */
    static final class C361022 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C361022(Continuation<? super C361022> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestLayoutService.this.GetSearchLayout((Request<GetSearchLayoutRequestDto>) null, this);
        }
    }

    /* compiled from: RestLayoutService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.prediction_markets.proto.v1.idl.RestLayoutService", m3645f = "RestLayoutService.kt", m3646l = {17}, m3647m = "ListChildNavigationNodes")
    /* renamed from: com.robinhood.prediction_markets.proto.v1.idl.RestLayoutService$ListChildNavigationNodes$1 */
    static final class C361031 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C361031(Continuation<? super C361031> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestLayoutService.this.ListChildNavigationNodes((ListChildNavigationNodesRequestDto) null, this);
        }
    }

    /* compiled from: RestLayoutService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.prediction_markets.proto.v1.idl.RestLayoutService", m3645f = "RestLayoutService.kt", m3646l = {20}, m3647m = "ListChildNavigationNodes")
    /* renamed from: com.robinhood.prediction_markets.proto.v1.idl.RestLayoutService$ListChildNavigationNodes$2 */
    static final class C361042 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C361042(Continuation<? super C361042> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestLayoutService.this.ListChildNavigationNodes((Request<ListChildNavigationNodesRequestDto>) null, this);
        }
    }

    /* compiled from: RestLayoutService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.prediction_markets.proto.v1.idl.RestLayoutService", m3645f = "RestLayoutService.kt", m3646l = {96}, m3647m = "ListMarqueeEvents")
    /* renamed from: com.robinhood.prediction_markets.proto.v1.idl.RestLayoutService$ListMarqueeEvents$1 */
    static final class C361051 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C361051(Continuation<? super C361051> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestLayoutService.this.ListMarqueeEvents((ListMarqueeEventsRequestDto) null, this);
        }
    }

    /* compiled from: RestLayoutService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.prediction_markets.proto.v1.idl.RestLayoutService", m3645f = "RestLayoutService.kt", m3646l = {99}, m3647m = "ListMarqueeEvents")
    /* renamed from: com.robinhood.prediction_markets.proto.v1.idl.RestLayoutService$ListMarqueeEvents$2 */
    static final class C361062 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C361062(Continuation<? super C361062> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestLayoutService.this.ListMarqueeEvents((Request<ListMarqueeEventsRequestDto>) null, this);
        }
    }

    /* compiled from: RestLayoutService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.prediction_markets.proto.v1.idl.RestLayoutService", m3645f = "RestLayoutService.kt", m3646l = {66}, m3647m = "ListStrikes")
    /* renamed from: com.robinhood.prediction_markets.proto.v1.idl.RestLayoutService$ListStrikes$1 */
    static final class C361071 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C361071(Continuation<? super C361071> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestLayoutService.this.ListStrikes((ListStrikesRequestDto) null, this);
        }
    }

    /* compiled from: RestLayoutService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.prediction_markets.proto.v1.idl.RestLayoutService", m3645f = "RestLayoutService.kt", m3646l = {69}, m3647m = "ListStrikes")
    /* renamed from: com.robinhood.prediction_markets.proto.v1.idl.RestLayoutService$ListStrikes$2 */
    static final class C361082 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C361082(Continuation<? super C361082> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestLayoutService.this.ListStrikes((Request<ListStrikesRequestDto>) null, this);
        }
    }

    public RestLayoutService(LayoutServiceRetrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        this.retrofit = retrofit;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.prediction_markets.proto.p361v1.idl.LayoutService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object ListChildNavigationNodes(ListChildNavigationNodesRequestDto listChildNavigationNodesRequestDto, Continuation<? super ListChildNavigationNodesResponseDto> continuation) {
        C361031 c361031;
        if (continuation instanceof C361031) {
            c361031 = (C361031) continuation;
            int i = c361031.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c361031.label = i - Integer.MIN_VALUE;
            } else {
                c361031 = new C361031(continuation);
            }
        }
        Object objListChildNavigationNodes = c361031.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c361031.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objListChildNavigationNodes);
            Request<ListChildNavigationNodesRequestDto> request = new Request<>(listChildNavigationNodesRequestDto, null, 2, null);
            c361031.label = 1;
            objListChildNavigationNodes = ListChildNavigationNodes(request, c361031);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.prediction_markets.proto.p361v1.idl.LayoutService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object ListChildNavigationNodes(Request<ListChildNavigationNodesRequestDto> request, Continuation<? super Response<ListChildNavigationNodesResponseDto>> continuation) {
        C361042 c361042;
        if (continuation instanceof C361042) {
            c361042 = (C361042) continuation;
            int i = c361042.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c361042.label = i - Integer.MIN_VALUE;
            } else {
                c361042 = new C361042(continuation);
            }
        }
        Object objListChildNavigationNodes = c361042.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c361042.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objListChildNavigationNodes);
            LayoutServiceRetrofit layoutServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String node_id = request.getData().getNode_id();
            c361042.label = 1;
            objListChildNavigationNodes = layoutServiceRetrofit.ListChildNavigationNodes(metadata, node_id, c361042);
            if (objListChildNavigationNodes == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objListChildNavigationNodes);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objListChildNavigationNodes);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.prediction_markets.proto.p361v1.idl.LayoutService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetLayout(GetLayoutRequestDto getLayoutRequestDto, Continuation<? super GetLayoutResponseDto> continuation) {
        C360971 c360971;
        if (continuation instanceof C360971) {
            c360971 = (C360971) continuation;
            int i = c360971.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c360971.label = i - Integer.MIN_VALUE;
            } else {
                c360971 = new C360971(continuation);
            }
        }
        Object objGetLayout = c360971.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c360971.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetLayout);
            Request<GetLayoutRequestDto> request = new Request<>(getLayoutRequestDto, null, 2, null);
            c360971.label = 1;
            objGetLayout = GetLayout(request, c360971);
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

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.robinhood.prediction_markets.proto.p361v1.idl.LayoutService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetLayout(Request<GetLayoutRequestDto> request, Continuation<? super Response<GetLayoutResponseDto>> continuation) {
        C360982 c360982;
        if (continuation instanceof C360982) {
            c360982 = (C360982) continuation;
            int i = c360982.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c360982.label = i - Integer.MIN_VALUE;
            } else {
                c360982 = new C360982(continuation);
            }
        }
        C360982 c3609822 = c360982;
        Object objGetLayout = c3609822.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3609822.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetLayout);
            LayoutServiceRetrofit layoutServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String node_id = !Intrinsics.areEqual(request.getData().getNode_id(), "") ? request.getData().getNode_id() : null;
            String cursor = !Intrinsics.areEqual(request.getData().getCursor(), "") ? request.getData().getCursor() : null;
            Integer numBoxInt = request.getData().getPage_size() != 0 ? boxing.boxInt(request.getData().getPage_size()) : null;
            Integer numBoxInt2 = request.getData().getPreview_size() != 0 ? boxing.boxInt(request.getData().getPreview_size()) : null;
            c3609822.label = 1;
            objGetLayout = layoutServiceRetrofit.GetLayout(metadata, node_id, cursor, numBoxInt, numBoxInt2, c3609822);
            if (objGetLayout == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetLayout);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetLayout);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.prediction_markets.proto.p361v1.idl.LayoutService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetEventState(GetEventStateRequestDto getEventStateRequestDto, Continuation<? super GetEventStateResponseDto> continuation) {
        C360931 c360931;
        if (continuation instanceof C360931) {
            c360931 = (C360931) continuation;
            int i = c360931.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c360931.label = i - Integer.MIN_VALUE;
            } else {
                c360931 = new C360931(continuation);
            }
        }
        Object objGetEventState = c360931.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c360931.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetEventState);
            Request<GetEventStateRequestDto> request = new Request<>(getEventStateRequestDto, null, 2, null);
            c360931.label = 1;
            objGetEventState = GetEventState(request, c360931);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.prediction_markets.proto.p361v1.idl.LayoutService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetEventState(Request<GetEventStateRequestDto> request, Continuation<? super Response<GetEventStateResponseDto>> continuation) {
        C360942 c360942;
        if (continuation instanceof C360942) {
            c360942 = (C360942) continuation;
            int i = c360942.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c360942.label = i - Integer.MIN_VALUE;
            } else {
                c360942 = new C360942(continuation);
            }
        }
        Object objGetEventState = c360942.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c360942.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetEventState);
            LayoutServiceRetrofit layoutServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            List<String> event_ids = request.getData().getEvent_ids();
            c360942.label = 1;
            objGetEventState = layoutServiceRetrofit.GetEventState(metadata, event_ids, c360942);
            if (objGetEventState == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetEventState);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetEventState);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.prediction_markets.proto.p361v1.idl.LayoutService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetHighlights(GetHighlightsRequestDto getHighlightsRequestDto, Continuation<? super GetHighlightsResponseDto> continuation) {
        C360951 c360951;
        if (continuation instanceof C360951) {
            c360951 = (C360951) continuation;
            int i = c360951.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c360951.label = i - Integer.MIN_VALUE;
            } else {
                c360951 = new C360951(continuation);
            }
        }
        Object objGetHighlights = c360951.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c360951.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetHighlights);
            Request<GetHighlightsRequestDto> request = new Request<>(getHighlightsRequestDto, null, 2, null);
            c360951.label = 1;
            objGetHighlights = GetHighlights(request, c360951);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.prediction_markets.proto.p361v1.idl.LayoutService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetHighlights(Request<GetHighlightsRequestDto> request, Continuation<? super Response<GetHighlightsResponseDto>> continuation) {
        C360962 c360962;
        if (continuation instanceof C360962) {
            c360962 = (C360962) continuation;
            int i = c360962.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c360962.label = i - Integer.MIN_VALUE;
            } else {
                c360962 = new C360962(continuation);
            }
        }
        Object objGetHighlights = c360962.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c360962.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetHighlights);
            LayoutServiceRetrofit layoutServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            List<String> contract_ids = request.getData().getContract_ids();
            c360962.label = 1;
            objGetHighlights = layoutServiceRetrofit.GetHighlights(metadata, contract_ids, c360962);
            if (objGetHighlights == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetHighlights);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetHighlights);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.prediction_markets.proto.p361v1.idl.LayoutService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object ListStrikes(ListStrikesRequestDto listStrikesRequestDto, Continuation<? super ListStrikesResponseDto> continuation) {
        C361071 c361071;
        if (continuation instanceof C361071) {
            c361071 = (C361071) continuation;
            int i = c361071.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c361071.label = i - Integer.MIN_VALUE;
            } else {
                c361071 = new C361071(continuation);
            }
        }
        Object objListStrikes = c361071.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c361071.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objListStrikes);
            Request<ListStrikesRequestDto> request = new Request<>(listStrikesRequestDto, null, 2, null);
            c361071.label = 1;
            objListStrikes = ListStrikes(request, c361071);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.prediction_markets.proto.p361v1.idl.LayoutService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object ListStrikes(Request<ListStrikesRequestDto> request, Continuation<? super Response<ListStrikesResponseDto>> continuation) {
        C361082 c361082;
        if (continuation instanceof C361082) {
            c361082 = (C361082) continuation;
            int i = c361082.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c361082.label = i - Integer.MIN_VALUE;
            } else {
                c361082 = new C361082(continuation);
            }
        }
        Object objListStrikes = c361082.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c361082.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objListStrikes);
            LayoutServiceRetrofit layoutServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            YesNoDto yes_no = request.getData().getYes_no() != YesNoDto.INSTANCE.getZeroValue() ? request.getData().getYes_no() : null;
            String contract_id = Intrinsics.areEqual(request.getData().getContract_id(), "") ? null : request.getData().getContract_id();
            c361082.label = 1;
            objListStrikes = layoutServiceRetrofit.ListStrikes(metadata, yes_no, contract_id, c361082);
            if (objListStrikes == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objListStrikes);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objListStrikes);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.prediction_markets.proto.p361v1.idl.LayoutService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetSearchLayout(GetSearchLayoutRequestDto getSearchLayoutRequestDto, Continuation<? super GetSearchLayoutResponseDto> continuation) {
        C361011 c361011;
        if (continuation instanceof C361011) {
            c361011 = (C361011) continuation;
            int i = c361011.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c361011.label = i - Integer.MIN_VALUE;
            } else {
                c361011 = new C361011(continuation);
            }
        }
        Object objGetSearchLayout = c361011.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c361011.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetSearchLayout);
            Request<GetSearchLayoutRequestDto> request = new Request<>(getSearchLayoutRequestDto, null, 2, null);
            c361011.label = 1;
            objGetSearchLayout = GetSearchLayout(request, c361011);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.prediction_markets.proto.p361v1.idl.LayoutService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetSearchLayout(Request<GetSearchLayoutRequestDto> request, Continuation<? super Response<GetSearchLayoutResponseDto>> continuation) {
        C361022 c361022;
        if (continuation instanceof C361022) {
            c361022 = (C361022) continuation;
            int i = c361022.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c361022.label = i - Integer.MIN_VALUE;
            } else {
                c361022 = new C361022(continuation);
            }
        }
        Object objGetSearchLayout = c361022.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c361022.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetSearchLayout);
            LayoutServiceRetrofit layoutServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            c361022.label = 1;
            objGetSearchLayout = layoutServiceRetrofit.GetSearchLayout(metadata, c361022);
            if (objGetSearchLayout == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetSearchLayout);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetSearchLayout);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.prediction_markets.proto.p361v1.idl.LayoutService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetMarqueeEventsByNavId(GetMarqueeEventsByNavIdRequestDto getMarqueeEventsByNavIdRequestDto, Continuation<? super GetMarqueeEventsByNavIdResponseDto> continuation) {
        C360991 c360991;
        if (continuation instanceof C360991) {
            c360991 = (C360991) continuation;
            int i = c360991.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c360991.label = i - Integer.MIN_VALUE;
            } else {
                c360991 = new C360991(continuation);
            }
        }
        Object objGetMarqueeEventsByNavId = c360991.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c360991.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetMarqueeEventsByNavId);
            Request<GetMarqueeEventsByNavIdRequestDto> request = new Request<>(getMarqueeEventsByNavIdRequestDto, null, 2, null);
            c360991.label = 1;
            objGetMarqueeEventsByNavId = GetMarqueeEventsByNavId(request, c360991);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.prediction_markets.proto.p361v1.idl.LayoutService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetMarqueeEventsByNavId(Request<GetMarqueeEventsByNavIdRequestDto> request, Continuation<? super Response<GetMarqueeEventsByNavIdResponseDto>> continuation) {
        C361002 c361002;
        if (continuation instanceof C361002) {
            c361002 = (C361002) continuation;
            int i = c361002.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c361002.label = i - Integer.MIN_VALUE;
            } else {
                c361002 = new C361002(continuation);
            }
        }
        Object objGetMarqueeEventsByNavId = c361002.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c361002.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetMarqueeEventsByNavId);
            LayoutServiceRetrofit layoutServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String nav_id = request.getData().getNav_id();
            c361002.label = 1;
            objGetMarqueeEventsByNavId = layoutServiceRetrofit.GetMarqueeEventsByNavId(metadata, nav_id, c361002);
            if (objGetMarqueeEventsByNavId == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetMarqueeEventsByNavId);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetMarqueeEventsByNavId);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.prediction_markets.proto.p361v1.idl.LayoutService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object ListMarqueeEvents(ListMarqueeEventsRequestDto listMarqueeEventsRequestDto, Continuation<? super ListMarqueeEventsResponseDto> continuation) {
        C361051 c361051;
        if (continuation instanceof C361051) {
            c361051 = (C361051) continuation;
            int i = c361051.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c361051.label = i - Integer.MIN_VALUE;
            } else {
                c361051 = new C361051(continuation);
            }
        }
        Object objListMarqueeEvents = c361051.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c361051.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objListMarqueeEvents);
            Request<ListMarqueeEventsRequestDto> request = new Request<>(listMarqueeEventsRequestDto, null, 2, null);
            c361051.label = 1;
            objListMarqueeEvents = ListMarqueeEvents(request, c361051);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.prediction_markets.proto.p361v1.idl.LayoutService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object ListMarqueeEvents(Request<ListMarqueeEventsRequestDto> request, Continuation<? super Response<ListMarqueeEventsResponseDto>> continuation) {
        C361062 c361062;
        if (continuation instanceof C361062) {
            c361062 = (C361062) continuation;
            int i = c361062.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c361062.label = i - Integer.MIN_VALUE;
            } else {
                c361062 = new C361062(continuation);
            }
        }
        Object objListMarqueeEvents = c361062.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c361062.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objListMarqueeEvents);
            LayoutServiceRetrofit layoutServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            c361062.label = 1;
            objListMarqueeEvents = layoutServiceRetrofit.ListMarqueeEvents(metadata, c361062);
            if (objListMarqueeEvents == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objListMarqueeEvents);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objListMarqueeEvents);
    }
}
