package com.salesforce.android.smi.core.internal.data.remote;

import com.salesforce.android.smi.common.api.Result;
import com.salesforce.android.smi.database.ConversationStore;
import com.salesforce.android.smi.network.data.domain.conversationEntry.ConversationEntry;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ReadAcknowledger.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/salesforce/android/smi/common/api/Result;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/ConversationEntry;", "it"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.salesforce.android.smi.core.internal.data.remote.ReadAcknowledger$markAsReadThrottled$1", m3645f = "ReadAcknowledger.kt", m3646l = {28}, m3647m = "invokeSuspend")
/* renamed from: com.salesforce.android.smi.core.internal.data.remote.ReadAcknowledger$markAsReadThrottled$1, reason: use source file name */
/* loaded from: classes12.dex */
final class ReadAcknowledger2 extends ContinuationImpl7 implements Function2<ConversationEntry, Continuation<? super Result<? extends ConversationEntry>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ReadAcknowledger this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReadAcknowledger2(ReadAcknowledger readAcknowledger, Continuation<? super ReadAcknowledger2> continuation) {
        super(2, continuation);
        this.this$0 = readAcknowledger;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ReadAcknowledger2 readAcknowledger2 = new ReadAcknowledger2(this.this$0, continuation);
        readAcknowledger2.L$0 = obj;
        return readAcknowledger2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ConversationEntry conversationEntry, Continuation<? super Result<? extends ConversationEntry>> continuation) {
        return ((ReadAcknowledger2) create(conversationEntry, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ConversationEntry conversationEntry = (ConversationEntry) this.L$0;
            if (!conversationEntry.getSender().isLocal()) {
                CoroutineDispatcher coroutineDispatcher = this.this$0.ioDispatcher;
                C420791 c420791 = new C420791(this.this$0, conversationEntry, null);
                this.label = 1;
                obj = BuildersKt.withContext(coroutineDispatcher, c420791, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                return new Result.Error(new IllegalArgumentException("Sender cannot be the local participant"));
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return (Result) obj;
    }

    /* compiled from: ReadAcknowledger.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/salesforce/android/smi/common/api/Result;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/ConversationEntry;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.salesforce.android.smi.core.internal.data.remote.ReadAcknowledger$markAsReadThrottled$1$1", m3645f = "ReadAcknowledger.kt", m3646l = {29, 31}, m3647m = "invokeSuspend")
    /* renamed from: com.salesforce.android.smi.core.internal.data.remote.ReadAcknowledger$markAsReadThrottled$1$1 */
    static final class C420791 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Result<? extends ConversationEntry>>, Object> {
        final /* synthetic */ ConversationEntry $it;
        int label;
        final /* synthetic */ ReadAcknowledger this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C420791(ReadAcknowledger readAcknowledger, ConversationEntry conversationEntry, Continuation<? super C420791> continuation) {
            super(2, continuation);
            this.this$0 = readAcknowledger;
            this.$it = conversationEntry;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C420791(this.this$0, this.$it, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends ConversationEntry>> continuation) {
            return ((C420791) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
        
            if (r6 == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ConversationStore conversationStore = this.this$0.conversationStore;
                UUID conversationId = this.$it.getConversationId();
                this.label = 1;
                obj = conversationStore.readInboundHighWatermark(conversationId, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return (Result) obj;
            }
            ResultKt.throwOnFailure(obj);
            if (this.this$0.isAboveHighWatermark((Long) obj, this.$it)) {
                ReadAcknowledger readAcknowledger = this.this$0;
                ConversationEntry conversationEntry = this.$it;
                this.label = 2;
                obj = readAcknowledger.sendReadAck(conversationEntry, this);
            } else {
                return Result.Empty.INSTANCE;
            }
        }
    }
}
