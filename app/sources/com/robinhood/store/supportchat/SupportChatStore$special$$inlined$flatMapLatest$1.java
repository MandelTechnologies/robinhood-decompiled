package com.robinhood.store.supportchat;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.Endpoint8;
import com.robinhood.models.api.pathfinder.messaging.ApiSupportChat;
import com.robinhood.models.api.pathfinder.messaging.ApiSupportChatList;
import com.robinhood.models.p355ui.pathfinder.messaging.SupportChat;
import com.robinhood.models.p355ui.pathfinder.messaging.SupportChat2;
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
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import p479j$.time.Duration;
import retrofit2.Response;

/* compiled from: Merge.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0015\u0010\u0006\u001a\u00118\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005H\n"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/ParameterName;", "name", "value", "it", "", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "com.robinhood.store.supportchat.SupportChatStore$special$$inlined$flatMapLatest$1", m3645f = "SupportChatStore.kt", m3646l = {192, EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class SupportChatStore$special$$inlined$flatMapLatest$1 extends ContinuationImpl7 implements Function3<FlowCollector<? super List<? extends SupportChat>>, Long, Continuation<? super Unit>, Object> {
    long J$0;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ SupportChatStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportChatStore$special$$inlined$flatMapLatest$1(Continuation continuation, SupportChatStore supportChatStore) {
        super(3, continuation);
        this.this$0 = supportChatStore;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super List<? extends SupportChat>> flowCollector, Long l, Continuation<? super Unit> continuation) {
        SupportChatStore$special$$inlined$flatMapLatest$1 supportChatStore$special$$inlined$flatMapLatest$1 = new SupportChatStore$special$$inlined$flatMapLatest$1(continuation, this.this$0);
        supportChatStore$special$$inlined$flatMapLatest$1.L$0 = flowCollector;
        supportChatStore$special$$inlined$flatMapLatest$1.L$1 = l;
        return supportChatStore$special$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007c, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.emitAll(r1, r3, r12) != r0) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        long jLongValue;
        long j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            flowCollector = (FlowCollector) this.L$0;
            Long l = (Long) this.L$1;
            jLongValue = l != null ? l.longValue() : Duration.ofSeconds(30L).toMillis();
            if (l == null) {
                Endpoint endpoint = this.this$0.getSupportChatListEndpoint;
                Unit unit = Unit.INSTANCE;
                Duration durationOfMillis = Duration.ofMillis(jLongValue);
                Intrinsics.checkNotNullExpressionValue(durationOfMillis, "ofMillis(...)");
                final Flow flowBackendPoll$default = Endpoint8.backendPoll$default(endpoint, unit, durationOfMillis, null, 4, null);
                Flow<List<? extends SupportChat>> flow = new Flow<List<? extends SupportChat>>() { // from class: com.robinhood.store.supportchat.SupportChatStore$pollSupportChatListStream$lambda$17$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super List<? extends SupportChat>> flowCollector2, Continuation continuation) {
                        Object objCollect = flowBackendPoll$default.collect(new AnonymousClass2(flowCollector2), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.store.supportchat.SupportChatStore$pollSupportChatListStream$lambda$17$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.store.supportchat.SupportChatStore$pollSupportChatListStream$lambda$17$$inlined$mapNotNull$1$2", m3645f = "SupportChatStore.kt", m3646l = {56}, m3647m = "emit")
                        /* renamed from: com.robinhood.store.supportchat.SupportChatStore$pollSupportChatListStream$lambda$17$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            ArrayList arrayList;
                            List<ApiSupportChat> chats;
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
                                ApiSupportChatList apiSupportChatList = (ApiSupportChatList) ((Response) obj).body();
                                if (apiSupportChatList == null || (chats = apiSupportChatList.getChats()) == null) {
                                    arrayList = null;
                                } else {
                                    List<ApiSupportChat> list = chats;
                                    arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                                    Iterator<T> it = list.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(SupportChat2.toUiModel((ApiSupportChat) it.next()));
                                    }
                                }
                                if (arrayList != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(arrayList, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
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
                this.L$0 = null;
                this.label = 2;
            } else {
                long jLongValue2 = l.longValue();
                this.L$0 = flowCollector;
                this.J$0 = jLongValue;
                this.label = 1;
                if (DelayKt.delay(jLongValue2, this) != coroutine_suspended) {
                    j = jLongValue;
                }
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
        j = this.J$0;
        flowCollector = (FlowCollector) this.L$0;
        ResultKt.throwOnFailure(obj);
        jLongValue = j;
        Endpoint endpoint2 = this.this$0.getSupportChatListEndpoint;
        Unit unit2 = Unit.INSTANCE;
        Duration durationOfMillis2 = Duration.ofMillis(jLongValue);
        Intrinsics.checkNotNullExpressionValue(durationOfMillis2, "ofMillis(...)");
        final Flow flowBackendPoll$default2 = Endpoint8.backendPoll$default(endpoint2, unit2, durationOfMillis2, null, 4, null);
        Flow<List<? extends SupportChat>> flow2 = new Flow<List<? extends SupportChat>>() { // from class: com.robinhood.store.supportchat.SupportChatStore$pollSupportChatListStream$lambda$17$$inlined$mapNotNull$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super List<? extends SupportChat>> flowCollector2, Continuation continuation) {
                Object objCollect = flowBackendPoll$default2.collect(new AnonymousClass2(flowCollector2), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.store.supportchat.SupportChatStore$pollSupportChatListStream$lambda$17$$inlined$mapNotNull$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.store.supportchat.SupportChatStore$pollSupportChatListStream$lambda$17$$inlined$mapNotNull$1$2", m3645f = "SupportChatStore.kt", m3646l = {56}, m3647m = "emit")
                /* renamed from: com.robinhood.store.supportchat.SupportChatStore$pollSupportChatListStream$lambda$17$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    ArrayList arrayList;
                    List<ApiSupportChat> chats;
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
                        ApiSupportChatList apiSupportChatList = (ApiSupportChatList) ((Response) obj).body();
                        if (apiSupportChatList == null || (chats = apiSupportChatList.getChats()) == null) {
                            arrayList = null;
                        } else {
                            List<ApiSupportChat> list = chats;
                            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add(SupportChat2.toUiModel((ApiSupportChat) it.next()));
                            }
                        }
                        if (arrayList != null) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(arrayList, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
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
        this.L$0 = null;
        this.label = 2;
    }
}
