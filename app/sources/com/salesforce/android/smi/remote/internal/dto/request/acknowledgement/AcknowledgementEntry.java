package com.salesforce.android.smi.remote.internal.dto.request.acknowledgement;

import com.squareup.moshi.JsonClass;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcknowledgementEntry.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/salesforce/android/smi/remote/internal/dto/request/acknowledgement/AcknowledgementEntry;", "", "conversationEntryId", "", "conversationId", "Ljava/util/UUID;", "<init>", "(Ljava/lang/String;Ljava/util/UUID;)V", "getConversationEntryId", "()Ljava/lang/String;", "getConversationId", "()Ljava/util/UUID;", "remote_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public class AcknowledgementEntry {
    private final String conversationEntryId;
    private final transient UUID conversationId;

    public AcknowledgementEntry(String conversationEntryId, UUID uuid) {
        Intrinsics.checkNotNullParameter(conversationEntryId, "conversationEntryId");
        this.conversationEntryId = conversationEntryId;
        this.conversationId = uuid;
    }

    public /* synthetic */ AcknowledgementEntry(String str, UUID uuid, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : uuid);
    }

    public final String getConversationEntryId() {
        return this.conversationEntryId;
    }

    public final UUID getConversationId() {
        return this.conversationId;
    }
}
