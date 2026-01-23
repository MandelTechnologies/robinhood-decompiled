package com.robinhood.store.data.store.chatbot;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.idl.common.polling.IdlBackendPolling;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.chatbot.proto.p285v1.GetConversationMessagesRequestDto;
import com.robinhood.idl.Request;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Duration;

/* compiled from: Merge.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0015\u0010\u0006\u001a\u00118\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005H\n"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/ParameterName;", "name", "value", "it", "", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "com.robinhood.store.data.store.chatbot.ChatbotStore$pollSession$$inlined$flatMapLatest$1", m3645f = "ChatbotStore.kt", m3646l = {192, EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class ChatbotStore$pollSession$$inlined$flatMapLatest$1 extends ContinuationImpl7 implements Function3<FlowCollector<? super Unit>, Map<UUID, ? extends Long>, Continuation<? super Unit>, Object> {
    final /* synthetic */ UUID $conversationId$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ ChatbotStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatbotStore$pollSession$$inlined$flatMapLatest$1(Continuation continuation, UUID uuid, ChatbotStore chatbotStore) {
        super(3, continuation);
        this.$conversationId$inlined = uuid;
        this.this$0 = chatbotStore;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super Unit> flowCollector, Map<UUID, ? extends Long> map, Continuation<? super Unit> continuation) {
        ChatbotStore$pollSession$$inlined$flatMapLatest$1 chatbotStore$pollSession$$inlined$flatMapLatest$1 = new ChatbotStore$pollSession$$inlined$flatMapLatest$1(continuation, this.$conversationId$inlined, this.this$0);
        chatbotStore$pollSession$$inlined$flatMapLatest$1.L$0 = flowCollector;
        chatbotStore$pollSession$$inlined$flatMapLatest$1.L$1 = map;
        return chatbotStore$pollSession$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b2, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.emitAll(r2, r3, r18) != r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006f  */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        Long l;
        FlowCollector flowCollector2;
        Long l2;
        long jLongValue;
        Flow<Unit> flowEmptyFlow;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            flowCollector = (FlowCollector) this.L$0;
            l = (Long) ((Map) this.L$1).get(this.$conversationId$inlined);
            if (l != null && l.longValue() > 0) {
                long jLongValue2 = l.longValue();
                this.L$0 = flowCollector;
                this.L$1 = l;
                this.label = 1;
                if (DelayKt.delay(jLongValue2, this) != coroutine_suspended) {
                    flowCollector2 = flowCollector;
                    l2 = l;
                }
            } else {
                jLongValue = l == null ? l.longValue() : 0L;
                if (jLongValue <= 0) {
                    Endpoint endpoint = this.this$0.getMessagesEndpoint;
                    String string2 = this.$conversationId$inlined.toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                    Request request = new Request(new GetConversationMessagesRequestDto(string2, -1, 0, null, 8, null), null, 2, null);
                    Duration durationOfMillis = Duration.ofMillis(jLongValue);
                    Intrinsics.checkNotNullExpressionValue(durationOfMillis, "ofMillis(...)");
                    final Flow flowBackendPoll$default = IdlBackendPolling.backendPoll$default(endpoint, request, durationOfMillis, null, 4, null);
                    flowEmptyFlow = new Flow<Unit>() { // from class: com.robinhood.store.data.store.chatbot.ChatbotStore$pollSession$lambda$7$$inlined$map$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super Unit> flowCollector3, Continuation continuation) {
                            Object objCollect = flowBackendPoll$default.collect(new C413322(flowCollector3), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.store.data.store.chatbot.ChatbotStore$pollSession$lambda$7$$inlined$map$1$2 */
                        public static final class C413322<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.store.data.store.chatbot.ChatbotStore$pollSession$lambda$7$$inlined$map$1$2", m3645f = "ChatbotStore.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.store.data.store.chatbot.ChatbotStore$pollSession$lambda$7$$inlined$map$1$2$1, reason: invalid class name */
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
                                    return C413322.this.emit(null, this);
                                }
                            }

                            public C413322(FlowCollector flowCollector) {
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
                                    Unit unit = Unit.INSTANCE;
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(unit, anonymousClass1) == coroutine_suspended) {
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
                    };
                } else {
                    flowEmptyFlow = FlowKt.emptyFlow();
                }
                this.L$0 = null;
                this.L$1 = null;
                this.label = 2;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        l2 = (Long) this.L$1;
        flowCollector2 = (FlowCollector) this.L$0;
        ResultKt.throwOnFailure(obj);
        l = l2;
        flowCollector = flowCollector2;
        if (l == null) {
        }
        if (jLongValue <= 0) {
        }
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
    }
}
