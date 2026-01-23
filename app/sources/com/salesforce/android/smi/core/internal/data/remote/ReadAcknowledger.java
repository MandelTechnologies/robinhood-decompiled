package com.salesforce.android.smi.core.internal.data.remote;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.salesforce.android.smi.common.api.Result;
import com.salesforce.android.smi.common.internal.util.Throttle;
import com.salesforce.android.smi.database.ConversationStore;
import com.salesforce.android.smi.network.data.domain.conversationEntry.ConversationEntry;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.ConversationEntryType;
import com.salesforce.android.smi.remote.internal.api.rest.RestService;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;

/* compiled from: ReadAcknowledger.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B#\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0002\u0010\u0015J\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\fH\u0082@¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/salesforce/android/smi/core/internal/data/remote/ReadAcknowledger;", "", "conversationStore", "Lcom/salesforce/android/smi/database/ConversationStore;", "restService", "Lcom/salesforce/android/smi/remote/internal/api/rest/RestService;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "(Lcom/salesforce/android/smi/database/ConversationStore;Lcom/salesforce/android/smi/remote/internal/api/rest/RestService;Lkotlinx/coroutines/CoroutineDispatcher;)V", "markAsRead", "Lcom/salesforce/android/smi/common/api/Result;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/ConversationEntry;", "conversationEntry", "(Lcom/salesforce/android/smi/network/data/domain/conversationEntry/ConversationEntry;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "markAsReadThrottled", "Lcom/salesforce/android/smi/common/internal/util/Throttle;", "isAboveHighWatermark", "", "inboundHighWatermark", "", "(Ljava/lang/Long;Lcom/salesforce/android/smi/network/data/domain/conversationEntry/ConversationEntry;)Z", "sendReadAck", "Companion", "core_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class ReadAcknowledger {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final ConversationStore conversationStore;
    private final CoroutineDispatcher ioDispatcher;
    private final Throttle<ConversationEntry, ConversationEntry> markAsReadThrottled;
    private final RestService restService;

    /* compiled from: ReadAcknowledger.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.salesforce.android.smi.core.internal.data.remote.ReadAcknowledger", m3645f = "ReadAcknowledger.kt", m3646l = {54}, m3647m = "sendReadAck")
    /* renamed from: com.salesforce.android.smi.core.internal.data.remote.ReadAcknowledger$sendReadAck$1 */
    static final class C420801 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C420801(Continuation<? super C420801> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ReadAcknowledger.this.sendReadAck(null, this);
        }
    }

    public /* synthetic */ ReadAcknowledger(ConversationStore conversationStore, RestService restService, CoroutineDispatcher coroutineDispatcher, DefaultConstructorMarker defaultConstructorMarker) {
        this(conversationStore, restService, coroutineDispatcher);
    }

    private ReadAcknowledger(ConversationStore conversationStore, RestService restService, CoroutineDispatcher coroutineDispatcher) {
        this.conversationStore = conversationStore;
        this.restService = restService;
        this.ioDispatcher = coroutineDispatcher;
        this.markAsReadThrottled = Throttle.Companion.latest$default(Throttle.INSTANCE, 0L, new ReadAcknowledger2(this, null), 1, null);
    }

    public final Object markAsRead(ConversationEntry conversationEntry, Continuation<? super Result<? extends ConversationEntry>> continuation) {
        if (conversationEntry.getEntryType() != ConversationEntryType.StreamingToken) {
            return this.markAsReadThrottled.async(conversationEntry, continuation);
        }
        return Result.Empty.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isAboveHighWatermark(Long inboundHighWatermark, ConversationEntry conversationEntry) {
        return inboundHighWatermark == null || conversationEntry.getTimestamp() >= inboundHighWatermark.longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendReadAck(ConversationEntry conversationEntry, Continuation<? super Result<? extends ConversationEntry>> continuation) {
        C420801 c420801;
        if (continuation instanceof C420801) {
            c420801 = (C420801) continuation;
            int i = c420801.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c420801.label = i - Integer.MIN_VALUE;
            } else {
                c420801 = new C420801(continuation);
            }
        }
        Object obj = c420801.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c420801.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                RestService restService = this.restService;
                UUID conversationId = conversationEntry.getConversationId();
                String identifier = conversationEntry.getIdentifier();
                c420801.L$0 = conversationEntry;
                c420801.label = 1;
                if (restService.sendReadAck(conversationId, identifier, c420801) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                conversationEntry = (ConversationEntry) c420801.L$0;
                ResultKt.throwOnFailure(obj);
            }
            return new Result.Success(conversationEntry);
        } catch (Exception e) {
            return new Result.Error(e);
        }
    }

    /* compiled from: ReadAcknowledger.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/salesforce/android/smi/core/internal/data/remote/ReadAcknowledger$Companion;", "", "<init>", "()V", "READ_THROTTLE_INTERVAL", "", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/salesforce/android/smi/core/internal/data/remote/ReadAcknowledger;", "conversationStore", "Lcom/salesforce/android/smi/database/ConversationStore;", "restService", "Lcom/salesforce/android/smi/remote/internal/api/rest/RestService;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "core_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ ReadAcknowledger create$default(Companion companion, ConversationStore conversationStore, RestService restService, CoroutineDispatcher coroutineDispatcher, int i, Object obj) {
            if ((i & 4) != 0) {
                coroutineDispatcher = Dispatchers.getIO();
            }
            return companion.create(conversationStore, restService, coroutineDispatcher);
        }

        public final ReadAcknowledger create(ConversationStore conversationStore, RestService restService, CoroutineDispatcher ioDispatcher) {
            Intrinsics.checkNotNullParameter(conversationStore, "conversationStore");
            Intrinsics.checkNotNullParameter(restService, "restService");
            Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
            return new ReadAcknowledger(conversationStore, restService, ioDispatcher, null);
        }
    }
}
