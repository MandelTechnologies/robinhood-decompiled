package com.salesforce.android.smi.network.data.domain.conversationEntry;

import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.ConversationEntryType;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.EntryPayload;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.NetworkError;
import com.salesforce.android.smi.network.data.domain.participant.Participant;
import java.util.UUID;
import kotlin.Metadata;

/* compiled from: ConversationEntry.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0012\u0010\u0016\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0005R\u0012\u0010\u0018\u001a\u00020\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0012\u0010\u001c\u001a\u00020\u001dX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u0004\u0018\u00010!X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0012\u0010$\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0005¨\u0006&"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/ConversationEntry;", "", "senderDisplayName", "", "getSenderDisplayName", "()Ljava/lang/String;", "conversationId", "Ljava/util/UUID;", "getConversationId", "()Ljava/util/UUID;", "sender", "Lcom/salesforce/android/smi/network/data/domain/participant/Participant;", "getSender", "()Lcom/salesforce/android/smi/network/data/domain/participant/Participant;", "payload", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/EntryPayload;", "getPayload", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/EntryPayload;", "entryType", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/ConversationEntryType;", "getEntryType", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/ConversationEntryType;", "identifier", "getIdentifier", "timestamp", "", "getTimestamp", "()J", "status", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/ConversationEntryStatus;", "getStatus", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/ConversationEntryStatus;", "error", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/NetworkError;", "getError", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/NetworkError;", "entryId", "getEntryId", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface ConversationEntry {
    UUID getConversationId();

    String getEntryId();

    ConversationEntryType getEntryType();

    NetworkError getError();

    String getIdentifier();

    EntryPayload getPayload();

    Participant getSender();

    String getSenderDisplayName();

    ConversationEntryStatus getStatus();

    long getTimestamp();
}
