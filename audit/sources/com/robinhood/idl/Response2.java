package com.robinhood.idl;

import com.robinhood.idl.Dto;
import com.robinhood.idl.Dto3;
import com.squareup.wire.GrpcCall;
import com.squareup.wire.GrpcStreamingCall;
import com.squareup.wire.Message;
import com.squareup.wire.MessageSink;
import com.squareup.wire.MessageSource;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import retrofit2.HttpException;

/* compiled from: Response.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004\u001a\u0096\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0001\"\u0014\b\u0000\u0010\u0007*\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\t0\b\"\u0014\b\u0001\u0010\n*\u000e\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u00020\t0\b\"\u000e\b\u0002\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u00070\f\"\u000e\b\u0003\u0010\u0006*\b\u0012\u0004\u0012\u0002H\n0\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\n0\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\n0\u0012H\u0086@¢\u0006\u0002\u0010\u0013\u001a\\\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00140\u0001\"\u0014\b\u0000\u0010\u0007*\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\t0\b\"\u000e\b\u0001\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u00070\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u000e2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u00140\u0012H\u0086@¢\u0006\u0002\u0010\u0015\u001ap\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0001\"\u0014\b\u0000\u0010\n*\u000e\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u00020\t0\b\"\u000e\b\u0001\u0010\u0006*\b\u0012\u0004\u0012\u0002H\n0\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00140\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\n0\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u0002H\n0\u0012H\u0086@¢\u0006\u0002\u0010\u0013\u001a\u0090\u0001\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u00010\u0018\"\u0012\b\u0000\u0010\u0007*\f\u0012\u0004\u0012\u0002H\u0007\u0012\u0002\b\u00030\b\"\u0012\b\u0001\u0010\n*\f\u0012\u0004\u0012\u0002H\n\u0012\u0002\b\u00030\b\"\u000e\b\u0002\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u00070\f\"\u000e\b\u0003\u0010\u0006*\b\u0012\u0004\u0012\u0002H\n0\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\n0\u00192\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\n0\u001b\u001a\"\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0018\"\b\b\u0000\u0010\u0002*\u00020\u001d*\b\u0012\u0004\u0012\u0002H\u00020\u001eH\u0002¨\u0006\u001f"}, m3636d2 = {"handleRetrofitResponse", "Lcom/robinhood/idl/Response;", "T", "retrofitResponse", "Lretrofit2/Response;", "handleGrpcCall", "R_DTO", "S", "Lcom/squareup/wire/Message;", "", "R", "S_DTO", "Lcom/robinhood/idl/MessageDto;", "request", "Lcom/robinhood/idl/Request;", "dtoCreator", "Lcom/robinhood/idl/MessageDto$Creator;", "grpcCall", "Lcom/squareup/wire/GrpcCall;", "(Lcom/robinhood/idl/Request;Lcom/robinhood/idl/MessageDto$Creator;Lcom/squareup/wire/GrpcCall;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "(Lcom/robinhood/idl/Request;Lcom/squareup/wire/GrpcCall;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleGrpcCallEmptyRequest", "handleGrpcStreamingCall", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/idl/Dto$Creator;", "grpcStreamingCall", "Lcom/squareup/wire/GrpcStreamingCall;", "toFlow", "", "Lcom/squareup/wire/MessageSource;", "lib-api_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.idl.ResponseKt, reason: use source file name */
/* loaded from: classes20.dex */
public final class Response2 {

    /* compiled from: Response.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.idl.ResponseKt", m3645f = "Response.kt", m3646l = {47}, m3647m = "handleGrpcCall")
    /* renamed from: com.robinhood.idl.ResponseKt$handleGrpcCall$1 */
    /* loaded from: classes15.dex */
    static final class C333621<S extends Message, R extends Message, S_DTO extends Dto3<? extends S>, R_DTO extends Dto3<? extends R>> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C333621(Continuation<? super C333621> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Response2.handleGrpcCall(null, null, null, this);
        }
    }

    /* compiled from: Response.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.idl.ResponseKt", m3645f = "Response.kt", m3646l = {56}, m3647m = "handleGrpcCall")
    /* renamed from: com.robinhood.idl.ResponseKt$handleGrpcCall$2 */
    /* loaded from: classes15.dex */
    static final class C333632<S extends Message, S_DTO extends Dto3<? extends S>> extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C333632(Continuation<? super C333632> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Response2.handleGrpcCall(null, null, this);
        }
    }

    /* compiled from: Response.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.idl.ResponseKt", m3645f = "Response.kt", m3646l = {67}, m3647m = "handleGrpcCallEmptyRequest")
    /* renamed from: com.robinhood.idl.ResponseKt$handleGrpcCallEmptyRequest$1 */
    /* loaded from: classes15.dex */
    static final class C333641<R extends Message, R_DTO extends Dto3<? extends R>> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C333641(Continuation<? super C333641> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Response2.handleGrpcCallEmptyRequest(null, null, null, this);
        }
    }

    public static final <T> Response<T> handleRetrofitResponse(retrofit2.Response<T> retrofitResponse) {
        String strJoinToString$default;
        Intrinsics.checkNotNullParameter(retrofitResponse, "retrofitResponse");
        if (retrofitResponse.isSuccessful()) {
            Map<String, List<String>> multimap = retrofitResponse.headers().toMultimap();
            LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(multimap.size()));
            Iterator<T> it = multimap.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                if (CollectionsKt.distinct((Iterable) entry.getValue()).size() == 1) {
                    strJoinToString$default = (String) CollectionsKt.first((List) entry.getValue());
                } else {
                    strJoinToString$default = CollectionsKt.joinToString$default((Iterable) entry.getValue(), ",", null, null, 0, null, null, 62, null);
                }
                linkedHashMap.put(key, strJoinToString$default);
            }
            T tBody = retrofitResponse.body();
            if (tBody != null) {
                return new Response<>(tBody, linkedHashMap);
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new HttpException(retrofitResponse);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <S extends Message, R extends Message, S_DTO extends Dto3<? extends S>, R_DTO extends Dto3<? extends R>> Object handleGrpcCall(Request<? extends S_DTO> request, Dto3.Creator<R_DTO, R> creator, GrpcCall<S, R> grpcCall, Continuation<? super Response<? extends R_DTO>> continuation) throws CancellationException, IOException {
        C333621 c333621;
        GrpcCall grpcCall2;
        Dto.Creator creator2;
        if (continuation instanceof C333621) {
            c333621 = (C333621) continuation;
            int i = c333621.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c333621.label = i - Integer.MIN_VALUE;
            } else {
                c333621 = new C333621(continuation);
            }
        }
        Object objExecute = c333621.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c333621.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objExecute);
            grpcCall.setRequestMetadata(request.getMetadata());
            Object proto = request.getData().toProto();
            c333621.L$0 = creator;
            c333621.L$1 = grpcCall;
            c333621.label = 1;
            objExecute = grpcCall.execute(proto, c333621);
            creator2 = creator;
            grpcCall2 = grpcCall;
            if (objExecute == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            GrpcCall grpcCall3 = (GrpcCall<S, R>) ((GrpcCall) c333621.L$1);
            Dto.Creator creator3 = (Dto3.Creator<R_DTO, R>) ((Dto3.Creator) c333621.L$0);
            ResultKt.throwOnFailure(objExecute);
            creator2 = creator3;
            grpcCall2 = grpcCall3;
        }
        Object objFromProto = creator2.fromProto((Message) objExecute);
        Map<String, String> responseMetadata = grpcCall2.getResponseMetadata();
        if (responseMetadata == null) {
            responseMetadata = MapsKt.emptyMap();
        }
        return new Response(objFromProto, responseMetadata);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <S extends Message, S_DTO extends Dto3<? extends S>> Object handleGrpcCall(Request<? extends S_DTO> request, GrpcCall<S, Unit> grpcCall, Continuation<? super Response<Unit>> continuation) throws CancellationException, IOException {
        C333632 c333632;
        GrpcCall grpcCall2;
        if (continuation instanceof C333632) {
            c333632 = (C333632) continuation;
            int i = c333632.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c333632.label = i - Integer.MIN_VALUE;
            } else {
                c333632 = new C333632(continuation);
            }
        }
        Object obj = c333632.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c333632.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            grpcCall.setRequestMetadata(request.getMetadata());
            Object proto = request.getData().toProto();
            c333632.L$0 = grpcCall;
            c333632.label = 1;
            Object objExecute = grpcCall.execute(proto, c333632);
            grpcCall2 = grpcCall;
            if (objExecute == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            GrpcCall grpcCall3 = (GrpcCall<S, Unit>) ((GrpcCall) c333632.L$0);
            ResultKt.throwOnFailure(obj);
            grpcCall2 = grpcCall3;
        }
        Unit unit = Unit.INSTANCE;
        Map<String, String> responseMetadata = grpcCall2.getResponseMetadata();
        if (responseMetadata == null) {
            responseMetadata = MapsKt.emptyMap();
        }
        return new Response(unit, responseMetadata);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <R extends Message, R_DTO extends Dto3<? extends R>> Object handleGrpcCallEmptyRequest(Request<Unit> request, Dto3.Creator<R_DTO, R> creator, GrpcCall<Unit, R> grpcCall, Continuation<? super Response<? extends R_DTO>> continuation) throws CancellationException, IOException {
        C333641 c333641;
        Dto.Creator creator2;
        if (continuation instanceof C333641) {
            c333641 = (C333641) continuation;
            int i = c333641.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c333641.label = i - Integer.MIN_VALUE;
            } else {
                c333641 = new C333641(continuation);
            }
        }
        Object objExecute = c333641.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c333641.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objExecute);
            grpcCall.setRequestMetadata(request.getMetadata());
            Unit unit = Unit.INSTANCE;
            c333641.L$0 = creator;
            c333641.L$1 = grpcCall;
            c333641.label = 1;
            objExecute = grpcCall.execute(unit, c333641);
            creator2 = creator;
            if (objExecute == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            grpcCall = (GrpcCall) c333641.L$1;
            Dto.Creator creator3 = (Dto3.Creator<R_DTO, R>) ((Dto3.Creator) c333641.L$0);
            ResultKt.throwOnFailure(objExecute);
            creator2 = creator3;
        }
        Object objFromProto = creator2.fromProto((Message) objExecute);
        Map<String, String> responseMetadata = grpcCall.getResponseMetadata();
        if (responseMetadata == null) {
            responseMetadata = MapsKt.emptyMap();
        }
        return new Response(objFromProto, responseMetadata);
    }

    public static final <S extends Message<S, ?>, R extends Message<R, ?>, S_DTO extends Dto3<? extends S>, R_DTO extends Dto3<? extends R>> Flow<Response<R_DTO>> handleGrpcStreamingCall(Request<? extends S_DTO> request, final Dto.Creator<? extends R_DTO, R> dtoCreator, final GrpcStreamingCall<S, R> grpcStreamingCall) throws IOException {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(dtoCreator, "dtoCreator");
        Intrinsics.checkNotNullParameter(grpcStreamingCall, "grpcStreamingCall");
        grpcStreamingCall.setRequestMetadata(request.getMetadata());
        Tuples2<MessageSink<S>, MessageSource<R>> tuples2ExecuteBlocking = grpcStreamingCall.executeBlocking();
        MessageSink messageSinkComponent1 = tuples2ExecuteBlocking.component1();
        MessageSource<R> messageSourceComponent2 = tuples2ExecuteBlocking.component2();
        try {
            messageSinkComponent1.write(request.getData().toProto());
            final Flow flow = toFlow(messageSourceComponent2);
            return (Flow<Response<R_DTO>>) new Flow<Response<? extends R_DTO>>() { // from class: com.robinhood.idl.ResponseKt$handleGrpcStreamingCall$$inlined$map$1

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.idl.ResponseKt$handleGrpcStreamingCall$$inlined$map$1$2 */
                public static final class C333612<T> implements FlowCollector {
                    final /* synthetic */ Dto.Creator $dtoCreator$inlined;
                    final /* synthetic */ GrpcStreamingCall $grpcStreamingCall$inlined;
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.idl.ResponseKt$handleGrpcStreamingCall$$inlined$map$1$2", m3645f = "Response.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.idl.ResponseKt$handleGrpcStreamingCall$$inlined$map$1$2$1, reason: invalid class name */
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
                            return C333612.this.emit(null, this);
                        }
                    }

                    public C333612(FlowCollector flowCollector, GrpcStreamingCall grpcStreamingCall, Dto.Creator creator) {
                        this.$this_unsafeFlow = flowCollector;
                        this.$grpcStreamingCall$inlined = grpcStreamingCall;
                        this.$dtoCreator$inlined = creator;
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
                            Message message = (Message) obj;
                            Map<String, String> responseMetadata = this.$grpcStreamingCall$inlined.getResponseMetadata();
                            if (responseMetadata == null) {
                                responseMetadata = MapsKt.emptyMap();
                            }
                            Response response = new Response((Dto3) this.$dtoCreator$inlined.fromProto(message), responseMetadata);
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(response, anonymousClass1) == coroutine_suspended) {
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
                public Object collect(FlowCollector flowCollector, Continuation continuation) {
                    Object objCollect = flow.collect(new C333612(flowCollector, grpcStreamingCall, dtoCreator), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            };
        } finally {
            messageSinkComponent1.close();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Response.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "", "T", "", "Lkotlinx/coroutines/flow/FlowCollector;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.idl.ResponseKt$toFlow$1", m3645f = "Response.kt", m3646l = {104}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.idl.ResponseKt$toFlow$1 */
    /* loaded from: classes15.dex */
    static final class C333651<T> extends ContinuationImpl7 implements Function2<FlowCollector<? super T>, Continuation<? super Unit>, Object> {
        final /* synthetic */ MessageSource<T> $this_toFlow;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C333651(MessageSource<? extends T> messageSource, Continuation<? super C333651> continuation) {
            super(2, continuation);
            this.$this_toFlow = messageSource;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C333651 c333651 = new C333651(this.$this_toFlow, continuation);
            c333651.L$0 = obj;
            return c333651;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super T> flowCollector, Continuation<? super Unit> continuation) {
            return ((C333651) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws IOException {
            FlowCollector flowCollector;
            T t;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                flowCollector = (FlowCollector) this.L$0;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                flowCollector = (FlowCollector) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (Throwable th) {
                    this.$this_toFlow.close();
                    throw th;
                }
            }
            do {
                t = this.$this_toFlow.read();
                if (t != null) {
                    this.L$0 = flowCollector;
                    this.label = 1;
                } else {
                    this.$this_toFlow.close();
                    return Unit.INSTANCE;
                }
            } while (flowCollector.emit(t, this) != coroutine_suspended);
            return coroutine_suspended;
        }
    }

    private static final <T> Flow<T> toFlow(MessageSource<? extends T> messageSource) {
        return FlowKt.flow(new C333651(messageSource, null));
    }
}
