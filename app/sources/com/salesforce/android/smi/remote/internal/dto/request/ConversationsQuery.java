package com.salesforce.android.smi.remote.internal.dto.request;

import com.salesforce.android.smi.remote.internal.dto.response.InternalCoreConversation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConversationsQuery.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/salesforce/android/smi/remote/internal/dto/request/ConversationsQuery;", "", "numOpenConversationsFound", "", "numClosedConversationsFound", "conversations", "", "Lcom/salesforce/android/smi/remote/internal/dto/response/InternalCoreConversation;", "<init>", "(IILjava/util/List;)V", "getNumOpenConversationsFound", "()I", "getNumClosedConversationsFound", "getConversations", "()Ljava/util/List;", "remote_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class ConversationsQuery {
    private final List<InternalCoreConversation> conversations;
    private final int numClosedConversationsFound;
    private final int numOpenConversationsFound;

    public ConversationsQuery(int i, int i2, List<InternalCoreConversation> conversations) {
        Intrinsics.checkNotNullParameter(conversations, "conversations");
        this.numOpenConversationsFound = i;
        this.numClosedConversationsFound = i2;
        this.conversations = conversations;
    }

    public final int getNumOpenConversationsFound() {
        return this.numOpenConversationsFound;
    }

    public final int getNumClosedConversationsFound() {
        return this.numClosedConversationsFound;
    }

    public final List<InternalCoreConversation> getConversations() {
        return this.conversations;
    }
}
