package com.robinhood.prediction_markets.proto.p361v1.idl;

import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.idl.RhGenerated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: LayoutService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\u0096@¢\u0006\u0002\u0010\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\fH¦@¢\u0006\u0002\u0010\rJ\"\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\f0\bH\u0096@¢\u0006\u0002\u0010\tJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u0010H¦@¢\u0006\u0002\u0010\u0011J\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00100\bH\u0096@¢\u0006\u0002\u0010\tJ\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0014H¦@¢\u0006\u0002\u0010\u0015J\"\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00140\bH\u0096@¢\u0006\u0002\u0010\tJ\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0004\u001a\u00020\u0018H¦@¢\u0006\u0002\u0010\u0019J\"\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00180\bH\u0096@¢\u0006\u0002\u0010\tJ\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0004\u001a\u00020\u001cH¦@¢\u0006\u0002\u0010\u001dJ\"\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u001c0\bH\u0096@¢\u0006\u0002\u0010\tJ\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0004\u001a\u00020 H¦@¢\u0006\u0002\u0010!J\"\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020 0\bH\u0096@¢\u0006\u0002\u0010\tJ\u0016\u0010\"\u001a\u00020#2\u0006\u0010\u0004\u001a\u00020$H¦@¢\u0006\u0002\u0010%J\"\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020$0\bH\u0096@¢\u0006\u0002\u0010\t¨\u0006&"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/LayoutService;", "", "ListChildNavigationNodes", "Lcom/robinhood/prediction_markets/proto/v1/idl/ListChildNavigationNodesResponseDto;", "request", "Lcom/robinhood/prediction_markets/proto/v1/idl/ListChildNavigationNodesRequestDto;", "(Lcom/robinhood/prediction_markets/proto/v1/idl/ListChildNavigationNodesRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/idl/Request;", "(Lcom/robinhood/idl/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetLayout", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetLayoutResponseDto;", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetLayoutRequestDto;", "(Lcom/robinhood/prediction_markets/proto/v1/idl/GetLayoutRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetEventState", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetEventStateResponseDto;", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetEventStateRequestDto;", "(Lcom/robinhood/prediction_markets/proto/v1/idl/GetEventStateRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetHighlights", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetHighlightsResponseDto;", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetHighlightsRequestDto;", "(Lcom/robinhood/prediction_markets/proto/v1/idl/GetHighlightsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ListStrikes", "Lcom/robinhood/prediction_markets/proto/v1/idl/ListStrikesResponseDto;", "Lcom/robinhood/prediction_markets/proto/v1/idl/ListStrikesRequestDto;", "(Lcom/robinhood/prediction_markets/proto/v1/idl/ListStrikesRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetSearchLayout", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetSearchLayoutResponseDto;", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetSearchLayoutRequestDto;", "(Lcom/robinhood/prediction_markets/proto/v1/idl/GetSearchLayoutRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetMarqueeEventsByNavId", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetMarqueeEventsByNavIdResponseDto;", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetMarqueeEventsByNavIdRequestDto;", "(Lcom/robinhood/prediction_markets/proto/v1/idl/GetMarqueeEventsByNavIdRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ListMarqueeEvents", "Lcom/robinhood/prediction_markets/proto/v1/idl/ListMarqueeEventsResponseDto;", "Lcom/robinhood/prediction_markets/proto/v1/idl/ListMarqueeEventsRequestDto;", "(Lcom/robinhood/prediction_markets/proto/v1/idl/ListMarqueeEventsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public interface LayoutService {

    /* compiled from: LayoutService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.prediction_markets.proto.v1.idl.LayoutService$DefaultImpls", m3645f = "LayoutService.kt", m3646l = {30}, m3647m = "GetEventState")
    /* renamed from: com.robinhood.prediction_markets.proto.v1.idl.LayoutService$GetEventState$1 */
    static final class C360491 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C360491(Continuation<? super C360491> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.GetEventState(null, null, this);
        }
    }

    /* compiled from: LayoutService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.prediction_markets.proto.v1.idl.LayoutService$DefaultImpls", m3645f = "LayoutService.kt", m3646l = {34}, m3647m = "GetHighlights")
    /* renamed from: com.robinhood.prediction_markets.proto.v1.idl.LayoutService$GetHighlights$1 */
    static final class C360501 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C360501(Continuation<? super C360501> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.GetHighlights(null, null, this);
        }
    }

    /* compiled from: LayoutService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.prediction_markets.proto.v1.idl.LayoutService$DefaultImpls", m3645f = "LayoutService.kt", m3646l = {26}, m3647m = "GetLayout")
    /* renamed from: com.robinhood.prediction_markets.proto.v1.idl.LayoutService$GetLayout$1 */
    static final class C360511 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C360511(Continuation<? super C360511> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.GetLayout(null, null, this);
        }
    }

    /* compiled from: LayoutService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.prediction_markets.proto.v1.idl.LayoutService$DefaultImpls", m3645f = "LayoutService.kt", m3646l = {46}, m3647m = "GetMarqueeEventsByNavId")
    /* renamed from: com.robinhood.prediction_markets.proto.v1.idl.LayoutService$GetMarqueeEventsByNavId$1 */
    static final class C360521 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C360521(Continuation<? super C360521> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.GetMarqueeEventsByNavId(null, null, this);
        }
    }

    /* compiled from: LayoutService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.prediction_markets.proto.v1.idl.LayoutService$DefaultImpls", m3645f = "LayoutService.kt", m3646l = {42}, m3647m = "GetSearchLayout")
    /* renamed from: com.robinhood.prediction_markets.proto.v1.idl.LayoutService$GetSearchLayout$1 */
    static final class C360531 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C360531(Continuation<? super C360531> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.GetSearchLayout(null, null, this);
        }
    }

    /* compiled from: LayoutService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.prediction_markets.proto.v1.idl.LayoutService$DefaultImpls", m3645f = "LayoutService.kt", m3646l = {16}, m3647m = "ListChildNavigationNodes")
    /* renamed from: com.robinhood.prediction_markets.proto.v1.idl.LayoutService$ListChildNavigationNodes$1 */
    static final class C360541 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C360541(Continuation<? super C360541> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.ListChildNavigationNodes(null, null, this);
        }
    }

    /* compiled from: LayoutService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.prediction_markets.proto.v1.idl.LayoutService$DefaultImpls", m3645f = "LayoutService.kt", m3646l = {50}, m3647m = "ListMarqueeEvents")
    /* renamed from: com.robinhood.prediction_markets.proto.v1.idl.LayoutService$ListMarqueeEvents$1 */
    static final class C360551 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C360551(Continuation<? super C360551> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.ListMarqueeEvents(null, null, this);
        }
    }

    /* compiled from: LayoutService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.prediction_markets.proto.v1.idl.LayoutService$DefaultImpls", m3645f = "LayoutService.kt", m3646l = {38}, m3647m = "ListStrikes")
    /* renamed from: com.robinhood.prediction_markets.proto.v1.idl.LayoutService$ListStrikes$1 */
    static final class C360561 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C360561(Continuation<? super C360561> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.ListStrikes(null, null, this);
        }
    }

    Object GetEventState(Request<GetEventStateRequestDto> request, Continuation<? super Response<GetEventStateResponseDto>> continuation);

    Object GetEventState(GetEventStateRequestDto getEventStateRequestDto, Continuation<? super GetEventStateResponseDto> continuation);

    Object GetHighlights(Request<GetHighlightsRequestDto> request, Continuation<? super Response<GetHighlightsResponseDto>> continuation);

    Object GetHighlights(GetHighlightsRequestDto getHighlightsRequestDto, Continuation<? super GetHighlightsResponseDto> continuation);

    Object GetLayout(Request<GetLayoutRequestDto> request, Continuation<? super Response<GetLayoutResponseDto>> continuation);

    Object GetLayout(GetLayoutRequestDto getLayoutRequestDto, Continuation<? super GetLayoutResponseDto> continuation);

    Object GetMarqueeEventsByNavId(Request<GetMarqueeEventsByNavIdRequestDto> request, Continuation<? super Response<GetMarqueeEventsByNavIdResponseDto>> continuation);

    Object GetMarqueeEventsByNavId(GetMarqueeEventsByNavIdRequestDto getMarqueeEventsByNavIdRequestDto, Continuation<? super GetMarqueeEventsByNavIdResponseDto> continuation);

    Object GetSearchLayout(Request<GetSearchLayoutRequestDto> request, Continuation<? super Response<GetSearchLayoutResponseDto>> continuation);

    Object GetSearchLayout(GetSearchLayoutRequestDto getSearchLayoutRequestDto, Continuation<? super GetSearchLayoutResponseDto> continuation);

    Object ListChildNavigationNodes(Request<ListChildNavigationNodesRequestDto> request, Continuation<? super Response<ListChildNavigationNodesResponseDto>> continuation);

    Object ListChildNavigationNodes(ListChildNavigationNodesRequestDto listChildNavigationNodesRequestDto, Continuation<? super ListChildNavigationNodesResponseDto> continuation);

    Object ListMarqueeEvents(Request<ListMarqueeEventsRequestDto> request, Continuation<? super Response<ListMarqueeEventsResponseDto>> continuation);

    Object ListMarqueeEvents(ListMarqueeEventsRequestDto listMarqueeEventsRequestDto, Continuation<? super ListMarqueeEventsResponseDto> continuation);

    Object ListStrikes(Request<ListStrikesRequestDto> request, Continuation<? super Response<ListStrikesResponseDto>> continuation);

    Object ListStrikes(ListStrikesRequestDto listStrikesRequestDto, Continuation<? super ListStrikesResponseDto> continuation);

    /* compiled from: LayoutService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object ListChildNavigationNodes(LayoutService layoutService, Request<ListChildNavigationNodesRequestDto> request, Continuation<? super Response<ListChildNavigationNodesResponseDto>> continuation) {
            C360541 c360541;
            if (continuation instanceof C360541) {
                c360541 = (C360541) continuation;
                int i = c360541.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c360541.label = i - Integer.MIN_VALUE;
                } else {
                    c360541 = new C360541(continuation);
                }
            }
            Object objListChildNavigationNodes = c360541.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c360541.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objListChildNavigationNodes);
                ListChildNavigationNodesRequestDto data = request.getData();
                c360541.label = 1;
                objListChildNavigationNodes = layoutService.ListChildNavigationNodes(data, c360541);
                if (objListChildNavigationNodes == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objListChildNavigationNodes);
            }
            return new Response(objListChildNavigationNodes, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object GetLayout(LayoutService layoutService, Request<GetLayoutRequestDto> request, Continuation<? super Response<GetLayoutResponseDto>> continuation) {
            C360511 c360511;
            if (continuation instanceof C360511) {
                c360511 = (C360511) continuation;
                int i = c360511.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c360511.label = i - Integer.MIN_VALUE;
                } else {
                    c360511 = new C360511(continuation);
                }
            }
            Object objGetLayout = c360511.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c360511.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objGetLayout);
                GetLayoutRequestDto data = request.getData();
                c360511.label = 1;
                objGetLayout = layoutService.GetLayout(data, c360511);
                if (objGetLayout == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objGetLayout);
            }
            return new Response(objGetLayout, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object GetEventState(LayoutService layoutService, Request<GetEventStateRequestDto> request, Continuation<? super Response<GetEventStateResponseDto>> continuation) {
            C360491 c360491;
            if (continuation instanceof C360491) {
                c360491 = (C360491) continuation;
                int i = c360491.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c360491.label = i - Integer.MIN_VALUE;
                } else {
                    c360491 = new C360491(continuation);
                }
            }
            Object objGetEventState = c360491.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c360491.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objGetEventState);
                GetEventStateRequestDto data = request.getData();
                c360491.label = 1;
                objGetEventState = layoutService.GetEventState(data, c360491);
                if (objGetEventState == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objGetEventState);
            }
            return new Response(objGetEventState, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object GetHighlights(LayoutService layoutService, Request<GetHighlightsRequestDto> request, Continuation<? super Response<GetHighlightsResponseDto>> continuation) {
            C360501 c360501;
            if (continuation instanceof C360501) {
                c360501 = (C360501) continuation;
                int i = c360501.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c360501.label = i - Integer.MIN_VALUE;
                } else {
                    c360501 = new C360501(continuation);
                }
            }
            Object objGetHighlights = c360501.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c360501.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objGetHighlights);
                GetHighlightsRequestDto data = request.getData();
                c360501.label = 1;
                objGetHighlights = layoutService.GetHighlights(data, c360501);
                if (objGetHighlights == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objGetHighlights);
            }
            return new Response(objGetHighlights, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object ListStrikes(LayoutService layoutService, Request<ListStrikesRequestDto> request, Continuation<? super Response<ListStrikesResponseDto>> continuation) {
            C360561 c360561;
            if (continuation instanceof C360561) {
                c360561 = (C360561) continuation;
                int i = c360561.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c360561.label = i - Integer.MIN_VALUE;
                } else {
                    c360561 = new C360561(continuation);
                }
            }
            Object objListStrikes = c360561.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c360561.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objListStrikes);
                ListStrikesRequestDto data = request.getData();
                c360561.label = 1;
                objListStrikes = layoutService.ListStrikes(data, c360561);
                if (objListStrikes == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objListStrikes);
            }
            return new Response(objListStrikes, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object GetSearchLayout(LayoutService layoutService, Request<GetSearchLayoutRequestDto> request, Continuation<? super Response<GetSearchLayoutResponseDto>> continuation) {
            C360531 c360531;
            if (continuation instanceof C360531) {
                c360531 = (C360531) continuation;
                int i = c360531.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c360531.label = i - Integer.MIN_VALUE;
                } else {
                    c360531 = new C360531(continuation);
                }
            }
            Object objGetSearchLayout = c360531.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c360531.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objGetSearchLayout);
                GetSearchLayoutRequestDto data = request.getData();
                c360531.label = 1;
                objGetSearchLayout = layoutService.GetSearchLayout(data, c360531);
                if (objGetSearchLayout == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objGetSearchLayout);
            }
            return new Response(objGetSearchLayout, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object GetMarqueeEventsByNavId(LayoutService layoutService, Request<GetMarqueeEventsByNavIdRequestDto> request, Continuation<? super Response<GetMarqueeEventsByNavIdResponseDto>> continuation) {
            C360521 c360521;
            if (continuation instanceof C360521) {
                c360521 = (C360521) continuation;
                int i = c360521.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c360521.label = i - Integer.MIN_VALUE;
                } else {
                    c360521 = new C360521(continuation);
                }
            }
            Object objGetMarqueeEventsByNavId = c360521.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c360521.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objGetMarqueeEventsByNavId);
                GetMarqueeEventsByNavIdRequestDto data = request.getData();
                c360521.label = 1;
                objGetMarqueeEventsByNavId = layoutService.GetMarqueeEventsByNavId(data, c360521);
                if (objGetMarqueeEventsByNavId == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objGetMarqueeEventsByNavId);
            }
            return new Response(objGetMarqueeEventsByNavId, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object ListMarqueeEvents(LayoutService layoutService, Request<ListMarqueeEventsRequestDto> request, Continuation<? super Response<ListMarqueeEventsResponseDto>> continuation) {
            C360551 c360551;
            if (continuation instanceof C360551) {
                c360551 = (C360551) continuation;
                int i = c360551.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c360551.label = i - Integer.MIN_VALUE;
                } else {
                    c360551 = new C360551(continuation);
                }
            }
            Object objListMarqueeEvents = c360551.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c360551.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objListMarqueeEvents);
                ListMarqueeEventsRequestDto data = request.getData();
                c360551.label = 1;
                objListMarqueeEvents = layoutService.ListMarqueeEvents(data, c360551);
                if (objListMarqueeEvents == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objListMarqueeEvents);
            }
            return new Response(objListMarqueeEvents, null, 2, null);
        }
    }
}
