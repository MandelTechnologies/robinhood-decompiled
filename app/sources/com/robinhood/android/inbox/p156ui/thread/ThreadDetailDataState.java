package com.robinhood.android.inbox.p156ui.thread;

import android.graphics.Bitmap;
import com.robinhood.models.api.ApiNotificationThreadSettingsItem;
import com.robinhood.models.p320db.InboxMessageType;
import com.robinhood.models.p320db.InboxThread;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ThreadDetailDataState.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0005¢\u0006\u0004\b\u0016\u0010\u0017J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J\t\u0010*\u001a\u00020\nHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010,\u001a\u00020\nHÆ\u0003J\t\u0010-\u001a\u00020\nHÆ\u0003J\t\u0010.\u001a\u00020\nHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\t\u00100\u001a\u00020\u0013HÆ\u0003J\u000f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00150\u0005HÆ\u0003J\u008f\u0001\u00102\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0005HÆ\u0001J\u0013\u00103\u001a\u00020\n2\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u000206HÖ\u0001J\t\u00107\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001eR\u0011\u0010\u000e\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u001eR\u0011\u0010\u000f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u001eR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001b¨\u00068"}, m3636d2 = {"Lcom/robinhood/android/inbox/ui/thread/ThreadDetailDataState;", "", "userId", "Ljava/util/UUID;", "inboxMessages", "", "Lcom/robinhood/models/db/InboxMessageType$Message;", "localInboxMessages", "Lcom/robinhood/models/db/InboxMessageType$LocalMessage;", "uploadMediaEnabled", "", "thread", "Lcom/robinhood/models/db/InboxThread;", "hasFetchedAllPreviousMessages", "isLoadingPreviousMessages", "isUploadingMedia", "apiNotificationThreadSettingsItem", "Lcom/robinhood/models/api/ApiNotificationThreadSettingsItem;", "savedUserInput", "", "imagesToSend", "Landroid/graphics/Bitmap;", "<init>", "(Ljava/util/UUID;Ljava/util/List;Ljava/util/List;ZLcom/robinhood/models/db/InboxThread;ZZZLcom/robinhood/models/api/ApiNotificationThreadSettingsItem;Ljava/lang/String;Ljava/util/List;)V", "getUserId", "()Ljava/util/UUID;", "getInboxMessages", "()Ljava/util/List;", "getLocalInboxMessages", "getUploadMediaEnabled", "()Z", "getThread", "()Lcom/robinhood/models/db/InboxThread;", "getHasFetchedAllPreviousMessages", "getApiNotificationThreadSettingsItem", "()Lcom/robinhood/models/api/ApiNotificationThreadSettingsItem;", "getSavedUserInput", "()Ljava/lang/String;", "getImagesToSend", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "hashCode", "", "toString", "feature-inbox_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ThreadDetailDataState {
    private final ApiNotificationThreadSettingsItem apiNotificationThreadSettingsItem;
    private final boolean hasFetchedAllPreviousMessages;
    private final List<Bitmap> imagesToSend;
    private final List<InboxMessageType.Message> inboxMessages;
    private final boolean isLoadingPreviousMessages;
    private final boolean isUploadingMedia;
    private final List<InboxMessageType.LocalMessage> localInboxMessages;
    private final String savedUserInput;
    private final InboxThread thread;
    private final boolean uploadMediaEnabled;
    private final UUID userId;

    public ThreadDetailDataState() {
        this(null, null, null, false, null, false, false, false, null, null, null, 2047, null);
    }

    public static /* synthetic */ ThreadDetailDataState copy$default(ThreadDetailDataState threadDetailDataState, UUID uuid, List list, List list2, boolean z, InboxThread inboxThread, boolean z2, boolean z3, boolean z4, ApiNotificationThreadSettingsItem apiNotificationThreadSettingsItem, String str, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = threadDetailDataState.userId;
        }
        if ((i & 2) != 0) {
            list = threadDetailDataState.inboxMessages;
        }
        if ((i & 4) != 0) {
            list2 = threadDetailDataState.localInboxMessages;
        }
        if ((i & 8) != 0) {
            z = threadDetailDataState.uploadMediaEnabled;
        }
        if ((i & 16) != 0) {
            inboxThread = threadDetailDataState.thread;
        }
        if ((i & 32) != 0) {
            z2 = threadDetailDataState.hasFetchedAllPreviousMessages;
        }
        if ((i & 64) != 0) {
            z3 = threadDetailDataState.isLoadingPreviousMessages;
        }
        if ((i & 128) != 0) {
            z4 = threadDetailDataState.isUploadingMedia;
        }
        if ((i & 256) != 0) {
            apiNotificationThreadSettingsItem = threadDetailDataState.apiNotificationThreadSettingsItem;
        }
        if ((i & 512) != 0) {
            str = threadDetailDataState.savedUserInput;
        }
        if ((i & 1024) != 0) {
            list3 = threadDetailDataState.imagesToSend;
        }
        String str2 = str;
        List list4 = list3;
        boolean z5 = z4;
        ApiNotificationThreadSettingsItem apiNotificationThreadSettingsItem2 = apiNotificationThreadSettingsItem;
        boolean z6 = z2;
        boolean z7 = z3;
        InboxThread inboxThread2 = inboxThread;
        List list5 = list2;
        return threadDetailDataState.copy(uuid, list, list5, z, inboxThread2, z6, z7, z5, apiNotificationThreadSettingsItem2, str2, list4);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getUserId() {
        return this.userId;
    }

    /* renamed from: component10, reason: from getter */
    public final String getSavedUserInput() {
        return this.savedUserInput;
    }

    public final List<Bitmap> component11() {
        return this.imagesToSend;
    }

    public final List<InboxMessageType.Message> component2() {
        return this.inboxMessages;
    }

    public final List<InboxMessageType.LocalMessage> component3() {
        return this.localInboxMessages;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getUploadMediaEnabled() {
        return this.uploadMediaEnabled;
    }

    /* renamed from: component5, reason: from getter */
    public final InboxThread getThread() {
        return this.thread;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getHasFetchedAllPreviousMessages() {
        return this.hasFetchedAllPreviousMessages;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsLoadingPreviousMessages() {
        return this.isLoadingPreviousMessages;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsUploadingMedia() {
        return this.isUploadingMedia;
    }

    /* renamed from: component9, reason: from getter */
    public final ApiNotificationThreadSettingsItem getApiNotificationThreadSettingsItem() {
        return this.apiNotificationThreadSettingsItem;
    }

    public final ThreadDetailDataState copy(UUID userId, List<InboxMessageType.Message> inboxMessages, List<InboxMessageType.LocalMessage> localInboxMessages, boolean uploadMediaEnabled, InboxThread thread, boolean hasFetchedAllPreviousMessages, boolean isLoadingPreviousMessages, boolean isUploadingMedia, ApiNotificationThreadSettingsItem apiNotificationThreadSettingsItem, String savedUserInput, List<Bitmap> imagesToSend) {
        Intrinsics.checkNotNullParameter(inboxMessages, "inboxMessages");
        Intrinsics.checkNotNullParameter(localInboxMessages, "localInboxMessages");
        Intrinsics.checkNotNullParameter(savedUserInput, "savedUserInput");
        Intrinsics.checkNotNullParameter(imagesToSend, "imagesToSend");
        return new ThreadDetailDataState(userId, inboxMessages, localInboxMessages, uploadMediaEnabled, thread, hasFetchedAllPreviousMessages, isLoadingPreviousMessages, isUploadingMedia, apiNotificationThreadSettingsItem, savedUserInput, imagesToSend);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ThreadDetailDataState)) {
            return false;
        }
        ThreadDetailDataState threadDetailDataState = (ThreadDetailDataState) other;
        return Intrinsics.areEqual(this.userId, threadDetailDataState.userId) && Intrinsics.areEqual(this.inboxMessages, threadDetailDataState.inboxMessages) && Intrinsics.areEqual(this.localInboxMessages, threadDetailDataState.localInboxMessages) && this.uploadMediaEnabled == threadDetailDataState.uploadMediaEnabled && Intrinsics.areEqual(this.thread, threadDetailDataState.thread) && this.hasFetchedAllPreviousMessages == threadDetailDataState.hasFetchedAllPreviousMessages && this.isLoadingPreviousMessages == threadDetailDataState.isLoadingPreviousMessages && this.isUploadingMedia == threadDetailDataState.isUploadingMedia && Intrinsics.areEqual(this.apiNotificationThreadSettingsItem, threadDetailDataState.apiNotificationThreadSettingsItem) && Intrinsics.areEqual(this.savedUserInput, threadDetailDataState.savedUserInput) && Intrinsics.areEqual(this.imagesToSend, threadDetailDataState.imagesToSend);
    }

    public int hashCode() {
        UUID uuid = this.userId;
        int iHashCode = (((((((uuid == null ? 0 : uuid.hashCode()) * 31) + this.inboxMessages.hashCode()) * 31) + this.localInboxMessages.hashCode()) * 31) + Boolean.hashCode(this.uploadMediaEnabled)) * 31;
        InboxThread inboxThread = this.thread;
        int iHashCode2 = (((((((iHashCode + (inboxThread == null ? 0 : inboxThread.hashCode())) * 31) + Boolean.hashCode(this.hasFetchedAllPreviousMessages)) * 31) + Boolean.hashCode(this.isLoadingPreviousMessages)) * 31) + Boolean.hashCode(this.isUploadingMedia)) * 31;
        ApiNotificationThreadSettingsItem apiNotificationThreadSettingsItem = this.apiNotificationThreadSettingsItem;
        return ((((iHashCode2 + (apiNotificationThreadSettingsItem != null ? apiNotificationThreadSettingsItem.hashCode() : 0)) * 31) + this.savedUserInput.hashCode()) * 31) + this.imagesToSend.hashCode();
    }

    public String toString() {
        return "ThreadDetailDataState(userId=" + this.userId + ", inboxMessages=" + this.inboxMessages + ", localInboxMessages=" + this.localInboxMessages + ", uploadMediaEnabled=" + this.uploadMediaEnabled + ", thread=" + this.thread + ", hasFetchedAllPreviousMessages=" + this.hasFetchedAllPreviousMessages + ", isLoadingPreviousMessages=" + this.isLoadingPreviousMessages + ", isUploadingMedia=" + this.isUploadingMedia + ", apiNotificationThreadSettingsItem=" + this.apiNotificationThreadSettingsItem + ", savedUserInput=" + this.savedUserInput + ", imagesToSend=" + this.imagesToSend + ")";
    }

    public ThreadDetailDataState(UUID uuid, List<InboxMessageType.Message> inboxMessages, List<InboxMessageType.LocalMessage> localInboxMessages, boolean z, InboxThread inboxThread, boolean z2, boolean z3, boolean z4, ApiNotificationThreadSettingsItem apiNotificationThreadSettingsItem, String savedUserInput, List<Bitmap> imagesToSend) {
        Intrinsics.checkNotNullParameter(inboxMessages, "inboxMessages");
        Intrinsics.checkNotNullParameter(localInboxMessages, "localInboxMessages");
        Intrinsics.checkNotNullParameter(savedUserInput, "savedUserInput");
        Intrinsics.checkNotNullParameter(imagesToSend, "imagesToSend");
        this.userId = uuid;
        this.inboxMessages = inboxMessages;
        this.localInboxMessages = localInboxMessages;
        this.uploadMediaEnabled = z;
        this.thread = inboxThread;
        this.hasFetchedAllPreviousMessages = z2;
        this.isLoadingPreviousMessages = z3;
        this.isUploadingMedia = z4;
        this.apiNotificationThreadSettingsItem = apiNotificationThreadSettingsItem;
        this.savedUserInput = savedUserInput;
        this.imagesToSend = imagesToSend;
    }

    public final UUID getUserId() {
        return this.userId;
    }

    public /* synthetic */ ThreadDetailDataState(UUID uuid, List list, List list2, boolean z, InboxThread inboxThread, boolean z2, boolean z3, boolean z4, ApiNotificationThreadSettingsItem apiNotificationThreadSettingsItem, String str, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uuid, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? CollectionsKt.emptyList() : list2, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : inboxThread, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? false : z3, (i & 128) != 0 ? false : z4, (i & 256) != 0 ? null : apiNotificationThreadSettingsItem, (i & 512) != 0 ? "" : str, (i & 1024) != 0 ? CollectionsKt.emptyList() : list3);
    }

    public final List<InboxMessageType.Message> getInboxMessages() {
        return this.inboxMessages;
    }

    public final List<InboxMessageType.LocalMessage> getLocalInboxMessages() {
        return this.localInboxMessages;
    }

    public final boolean getUploadMediaEnabled() {
        return this.uploadMediaEnabled;
    }

    public final InboxThread getThread() {
        return this.thread;
    }

    public final boolean getHasFetchedAllPreviousMessages() {
        return this.hasFetchedAllPreviousMessages;
    }

    public final boolean isLoadingPreviousMessages() {
        return this.isLoadingPreviousMessages;
    }

    public final boolean isUploadingMedia() {
        return this.isUploadingMedia;
    }

    public final ApiNotificationThreadSettingsItem getApiNotificationThreadSettingsItem() {
        return this.apiNotificationThreadSettingsItem;
    }

    public final String getSavedUserInput() {
        return this.savedUserInput;
    }

    public final List<Bitmap> getImagesToSend() {
        return this.imagesToSend;
    }
}
