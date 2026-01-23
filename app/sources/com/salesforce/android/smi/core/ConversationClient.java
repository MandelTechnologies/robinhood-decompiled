package com.salesforce.android.smi.core;

import com.salesforce.android.smi.common.api.Result;
import com.salesforce.android.smi.core.events.CoreEvent;
import com.salesforce.android.smi.network.api.rest.QueryDirection;
import com.salesforce.android.smi.network.data.domain.conversationEntry.ConversationEntry;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* compiled from: ConversationClient.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001JK\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b0\n2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H¦@¢\u0006\u0004\b\u0012\u0010\u0013J*\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H¦@¢\u0006\u0004\b\u0016\u0010\u0017J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u0018\u001a\u00020\rH¦@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000bH¦@¢\u0006\u0004\b\u001c\u0010\u001dJ\u001e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u0018\u001a\u00020\rH¦@¢\u0006\u0004\b\u001e\u0010\u001aR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, m3636d2 = {"Lcom/salesforce/android/smi/core/ConversationClient;", "", "", "limit", "", "timestamp", "Lcom/salesforce/android/smi/network/api/rest/QueryDirection;", "direction", "", "forceRefresh", "Lkotlinx/coroutines/flow/Flow;", "Lcom/salesforce/android/smi/common/api/Result;", "", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/ConversationEntry;", "conversationEntriesFlow", "(ILjava/lang/Long;Lcom/salesforce/android/smi/network/api/rest/QueryDirection;Z)Lkotlinx/coroutines/flow/Flow;", "", "message", "sendMessage", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/io/File;", "file", "sendFile", "(Ljava/io/File;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "conversationEntry", "retryEntry", "(Lcom/salesforce/android/smi/network/data/domain/conversationEntry/ConversationEntry;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "sendTypingEvent", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "markAsRead", "Lcom/salesforce/android/smi/core/events/CoreEvent$ConversationEvent;", "getEvents", "()Lkotlinx/coroutines/flow/Flow;", "events", "core_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface ConversationClient {
    Flow<Result<List<ConversationEntry>>> conversationEntriesFlow(int limit, Long timestamp, QueryDirection direction, boolean forceRefresh);

    Flow<CoreEvent.ConversationEvent> getEvents();

    Object markAsRead(ConversationEntry conversationEntry, Continuation<? super Result<? extends ConversationEntry>> continuation);

    Object retryEntry(ConversationEntry conversationEntry, Continuation<? super Result<? extends ConversationEntry>> continuation);

    Object sendFile(File file, String str, Continuation<? super Result<? extends ConversationEntry>> continuation);

    Object sendMessage(String str, Continuation<? super Result<? extends ConversationEntry>> continuation);

    Object sendTypingEvent(Continuation<? super Result<Unit>> continuation);

    /* compiled from: ConversationClient.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Flow conversationEntriesFlow$default(ConversationClient conversationClient, int i, Long l, QueryDirection queryDirection, boolean z, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: conversationEntriesFlow");
            }
            if ((i2 & 1) != 0) {
                i = 100;
            }
            if ((i2 & 2) != 0) {
                l = null;
            }
            if ((i2 & 4) != 0) {
                queryDirection = QueryDirection.Descending;
            }
            if ((i2 & 8) != 0) {
                z = false;
            }
            return conversationClient.conversationEntriesFlow(i, l, queryDirection, z);
        }

        public static /* synthetic */ Object sendFile$default(ConversationClient conversationClient, File file, String str, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendFile");
            }
            if ((i & 2) != 0) {
                str = null;
            }
            return conversationClient.sendFile(file, str, continuation);
        }
    }
}
