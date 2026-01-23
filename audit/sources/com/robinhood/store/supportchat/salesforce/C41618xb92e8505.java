package com.robinhood.store.supportchat.salesforce;

import com.plaid.internal.EnumC7081g;
import com.robinhood.models.supportchat.p353db.SocketChatMessage;
import com.salesforce.android.smi.core.ConversationClient;
import com.salesforce.android.smi.network.data.domain.conversationEntry.ConversationEntry;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: Merge.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0015\u0010\u0006\u001a\u00118\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005H\n"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/ParameterName;", "name", "value", "it", "", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "com.robinhood.store.supportchat.salesforce.SalesforceChatStore$streamPreviewMessage$$inlined$flatMapLatest$1", m3645f = "SalesforceChatStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.store.supportchat.salesforce.SalesforceChatStore$streamPreviewMessage$$inlined$flatMapLatest$1 */
/* loaded from: classes12.dex */
public final class C41618xb92e8505 extends ContinuationImpl7 implements Function3<FlowCollector<? super SocketChatMessage>, ConversationClient, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ SalesforceChatStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41618xb92e8505(Continuation continuation, SalesforceChatStore salesforceChatStore) {
        super(3, continuation);
        this.this$0 = salesforceChatStore;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super SocketChatMessage> flowCollector, ConversationClient conversationClient, Continuation<? super Unit> continuation) {
        C41618xb92e8505 c41618xb92e8505 = new C41618xb92e8505(continuation, this.this$0);
        c41618xb92e8505.L$0 = flowCollector;
        c41618xb92e8505.L$1 = conversationClient;
        return c41618xb92e8505.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            final Flow flowStreamMessageEntries = this.this$0.streamMessageEntries((ConversationClient) this.L$1);
            final SalesforceChatStore salesforceChatStore = this.this$0;
            Flow<SocketChatMessage> flow = new Flow<SocketChatMessage>() { // from class: com.robinhood.store.supportchat.salesforce.SalesforceChatStore$streamPreviewMessage$lambda$9$$inlined$mapNotNull$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super SocketChatMessage> flowCollector2, Continuation continuation) {
                    Object objCollect = flowStreamMessageEntries.collect(new AnonymousClass2(flowCollector2, salesforceChatStore), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.store.supportchat.salesforce.SalesforceChatStore$streamPreviewMessage$lambda$9$$inlined$mapNotNull$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;
                    final /* synthetic */ SalesforceChatStore this$0;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.store.supportchat.salesforce.SalesforceChatStore$streamPreviewMessage$lambda$9$$inlined$mapNotNull$1$2", m3645f = "SalesforceChatStore.kt", m3646l = {65}, m3647m = "emit")
                    /* renamed from: com.robinhood.store.supportchat.salesforce.SalesforceChatStore$streamPreviewMessage$lambda$9$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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

                    public AnonymousClass2(FlowCollector flowCollector, SalesforceChatStore salesforceChatStore) {
                        this.$this_unsafeFlow = flowCollector;
                        this.this$0 = salesforceChatStore;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        Object objPrevious;
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
                            List list = (List) obj;
                            ListIterator listIterator = list.listIterator(list.size());
                            while (true) {
                                if (!listIterator.hasPrevious()) {
                                    objPrevious = null;
                                    break;
                                }
                                objPrevious = listIterator.previous();
                                if (this.this$0.isSent(((ConversationEntry) objPrevious).getStatus())) {
                                    break;
                                }
                            }
                            ConversationEntry conversationEntry = (ConversationEntry) objPrevious;
                            SocketChatMessage uiModel = conversationEntry != null ? SalesforceMessages.toUiModel(conversationEntry, this.this$0.appContext, this.this$0.bitmapStore) : null;
                            if (uiModel != null) {
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(uiModel, anonymousClass1) == coroutine_suspended) {
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
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, flow, this) == coroutine_suspended) {
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
