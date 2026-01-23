package com.robinhood.store.supportchat;

import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.logging.CrashReporter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: ChatMessageBadgeStore.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/store/supportchat/ChatMessageBadgeStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "supportChatStore", "Lcom/robinhood/store/supportchat/SupportChatStore;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/store/supportchat/SupportChatStore;)V", "streamHasUnreadMessage", "Lkotlinx/coroutines/flow/Flow;", "", "Companion", "lib-store-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class ChatMessageBadgeStore extends Store {
    public static final int UNREAD_MESSAGE_STREAM_RETRY_COUNT = 2;
    private static final long UNREAD_MESSAGE_STREAM_RETRY_DELAY = 3000;
    private final SupportChatStore supportChatStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatMessageBadgeStore(StoreBundle storeBundle, SupportChatStore supportChatStore) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(supportChatStore, "supportChatStore");
        this.supportChatStore = supportChatStore;
    }

    /* compiled from: ChatMessageBadgeStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", "<unused var>", "", "retryAttempt"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.supportchat.ChatMessageBadgeStore$streamHasUnreadMessage$1", m3645f = "ChatMessageBadgeStore.kt", m3646l = {27}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.store.supportchat.ChatMessageBadgeStore$streamHasUnreadMessage$1 */
    static final class C415781 extends ContinuationImpl7 implements Function4<FlowCollector<? super Long>, Throwable, Long, Continuation<? super Boolean>, Object> {
        /* synthetic */ long J$0;
        int label;

        C415781(Continuation<? super C415781> continuation) {
            super(4, continuation);
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super Long> flowCollector, Throwable th, Long l, Continuation<? super Boolean> continuation) {
            return invoke(flowCollector, th, l.longValue(), continuation);
        }

        public final Object invoke(FlowCollector<? super Long> flowCollector, Throwable th, long j, Continuation<? super Boolean> continuation) {
            C415781 c415781 = new C415781(continuation);
            c415781.J$0 = j;
            return c415781.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            long j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                long j2 = this.J$0;
                this.J$0 = j2;
                this.label = 1;
                if (DelayKt.delay(3000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                j = j2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = this.J$0;
                ResultKt.throwOnFailure(obj);
            }
            return boxing.boxBoolean(j < 2);
        }
    }

    public final Flow<Boolean> streamHasUnreadMessage() {
        final Flow flowRetryWhen = FlowKt.retryWhen(this.supportChatStore.streamUnreadMessageCount(), new C415781(null));
        return FlowKt.onStart(FlowKt.m28818catch(new Flow<Boolean>() { // from class: com.robinhood.store.supportchat.ChatMessageBadgeStore$streamHasUnreadMessage$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.store.supportchat.ChatMessageBadgeStore$streamHasUnreadMessage$$inlined$map$1$2 */
            public static final class C415772<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.store.supportchat.ChatMessageBadgeStore$streamHasUnreadMessage$$inlined$map$1$2", m3645f = "ChatMessageBadgeStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.store.supportchat.ChatMessageBadgeStore$streamHasUnreadMessage$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C415772.this.emit(null, this);
                    }
                }

                public C415772(FlowCollector flowCollector) {
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
                        Boolean boolBoxBoolean = boxing.boxBoolean(((Number) obj).longValue() > 0);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(boolBoxBoolean, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                Object objCollect = flowRetryWhen.collect(new C415772(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, new C415793(null)), new C415804(null));
    }

    /* compiled from: ChatMessageBadgeStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", "t", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.supportchat.ChatMessageBadgeStore$streamHasUnreadMessage$3", m3645f = "ChatMessageBadgeStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.store.supportchat.ChatMessageBadgeStore$streamHasUnreadMessage$3 */
    static final class C415793 extends ContinuationImpl7 implements Function3<FlowCollector<? super Boolean>, Throwable, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C415793(Continuation<? super C415793> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(FlowCollector<? super Boolean> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            C415793 c415793 = new C415793(continuation);
            c415793.L$0 = th;
            return c415793.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Throwable th = (Throwable) this.L$0;
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new Throwable("Unable to stream unread messages in ChatMessageBadgeManager\n" + th), false, null, 6, null);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: ChatMessageBadgeStore.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.supportchat.ChatMessageBadgeStore$streamHasUnreadMessage$4", m3645f = "ChatMessageBadgeStore.kt", m3646l = {36}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.store.supportchat.ChatMessageBadgeStore$streamHasUnreadMessage$4 */
    static final class C415804 extends ContinuationImpl7 implements Function2<FlowCollector<? super Boolean>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C415804(Continuation<? super C415804> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C415804 c415804 = new C415804(continuation);
            c415804.L$0 = obj;
            return c415804;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super Boolean> flowCollector, Continuation<? super Unit> continuation) {
            return ((C415804) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                Boolean boolBoxBoolean = boxing.boxBoolean(false);
                this.label = 1;
                if (flowCollector.emit(boolBoxBoolean, this) == coroutine_suspended) {
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
}
