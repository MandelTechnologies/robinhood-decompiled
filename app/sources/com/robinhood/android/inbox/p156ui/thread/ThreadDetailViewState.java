package com.robinhood.android.inbox.p156ui.thread;

import android.graphics.Bitmap;
import com.robinhood.models.api.ApiNotificationThreadSettingsItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ThreadDetailViewState.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\t\u0010(\u001a\u00020\bHÆ\u0003J\t\u0010)\u001a\u00020\bHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010,\u001a\u00020\bHÆ\u0003J\t\u0010-\u001a\u00020\bHÆ\u0003J\t\u0010.\u001a\u00020\u000bHÆ\u0003J\t\u0010/\u001a\u00020\bHÆ\u0003J\t\u00100\u001a\u00020\bHÆ\u0003J\t\u00101\u001a\u00020\bHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u009d\u0001\u00103\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÆ\u0001J\u0013\u00104\u001a\u00020\b2\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u000207HÖ\u0001J\t\u00108\u001a\u00020\u000bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0011\u0010\u000e\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0011\u0010\u000f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001eR\u0011\u0010\u0010\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001bR\u0011\u0010\u0011\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u001bR\u0011\u0010\u0012\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u001bR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%¨\u00069"}, m3636d2 = {"Lcom/robinhood/android/inbox/ui/thread/ThreadDetailViewState;", "", "viewTypes", "", "Lcom/robinhood/android/inbox/ui/thread/ViewType;", "imagesToSend", "Landroid/graphics/Bitmap;", "allowInput", "", "showNotificationSettings", "threadTitle", "", "earliestMessageId", "showImagesToSendView", "showMediaUploadButton", "savedUserInput", "hasFetchedAllPreviousMessages", "isLoadingPreviousMessages", "isUploadingMedia", "apiNotificationThreadSettingsItem", "Lcom/robinhood/models/api/ApiNotificationThreadSettingsItem;", "<init>", "(Ljava/util/List;Ljava/util/List;ZZLjava/lang/String;Ljava/lang/String;ZZLjava/lang/String;ZZZLcom/robinhood/models/api/ApiNotificationThreadSettingsItem;)V", "getViewTypes", "()Ljava/util/List;", "getImagesToSend", "getAllowInput", "()Z", "getShowNotificationSettings", "getThreadTitle", "()Ljava/lang/String;", "getEarliestMessageId", "getShowImagesToSendView", "getShowMediaUploadButton", "getSavedUserInput", "getHasFetchedAllPreviousMessages", "getApiNotificationThreadSettingsItem", "()Lcom/robinhood/models/api/ApiNotificationThreadSettingsItem;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "other", "hashCode", "", "toString", "feature-inbox_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ThreadDetailViewState {
    private final boolean allowInput;
    private final ApiNotificationThreadSettingsItem apiNotificationThreadSettingsItem;
    private final String earliestMessageId;
    private final boolean hasFetchedAllPreviousMessages;
    private final List<Bitmap> imagesToSend;
    private final boolean isLoadingPreviousMessages;
    private final boolean isUploadingMedia;
    private final String savedUserInput;
    private final boolean showImagesToSendView;
    private final boolean showMediaUploadButton;
    private final boolean showNotificationSettings;
    private final String threadTitle;
    private final List<ThreadDetailViewState4> viewTypes;

    public ThreadDetailViewState() {
        this(null, null, false, false, null, null, false, false, null, false, false, false, null, 8191, null);
    }

    public static /* synthetic */ ThreadDetailViewState copy$default(ThreadDetailViewState threadDetailViewState, List list, List list2, boolean z, boolean z2, String str, String str2, boolean z3, boolean z4, String str3, boolean z5, boolean z6, boolean z7, ApiNotificationThreadSettingsItem apiNotificationThreadSettingsItem, int i, Object obj) {
        if ((i & 1) != 0) {
            list = threadDetailViewState.viewTypes;
        }
        return threadDetailViewState.copy(list, (i & 2) != 0 ? threadDetailViewState.imagesToSend : list2, (i & 4) != 0 ? threadDetailViewState.allowInput : z, (i & 8) != 0 ? threadDetailViewState.showNotificationSettings : z2, (i & 16) != 0 ? threadDetailViewState.threadTitle : str, (i & 32) != 0 ? threadDetailViewState.earliestMessageId : str2, (i & 64) != 0 ? threadDetailViewState.showImagesToSendView : z3, (i & 128) != 0 ? threadDetailViewState.showMediaUploadButton : z4, (i & 256) != 0 ? threadDetailViewState.savedUserInput : str3, (i & 512) != 0 ? threadDetailViewState.hasFetchedAllPreviousMessages : z5, (i & 1024) != 0 ? threadDetailViewState.isLoadingPreviousMessages : z6, (i & 2048) != 0 ? threadDetailViewState.isUploadingMedia : z7, (i & 4096) != 0 ? threadDetailViewState.apiNotificationThreadSettingsItem : apiNotificationThreadSettingsItem);
    }

    public final List<ThreadDetailViewState4> component1() {
        return this.viewTypes;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getHasFetchedAllPreviousMessages() {
        return this.hasFetchedAllPreviousMessages;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getIsLoadingPreviousMessages() {
        return this.isLoadingPreviousMessages;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getIsUploadingMedia() {
        return this.isUploadingMedia;
    }

    /* renamed from: component13, reason: from getter */
    public final ApiNotificationThreadSettingsItem getApiNotificationThreadSettingsItem() {
        return this.apiNotificationThreadSettingsItem;
    }

    public final List<Bitmap> component2() {
        return this.imagesToSend;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getAllowInput() {
        return this.allowInput;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShowNotificationSettings() {
        return this.showNotificationSettings;
    }

    /* renamed from: component5, reason: from getter */
    public final String getThreadTitle() {
        return this.threadTitle;
    }

    /* renamed from: component6, reason: from getter */
    public final String getEarliestMessageId() {
        return this.earliestMessageId;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getShowImagesToSendView() {
        return this.showImagesToSendView;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getShowMediaUploadButton() {
        return this.showMediaUploadButton;
    }

    /* renamed from: component9, reason: from getter */
    public final String getSavedUserInput() {
        return this.savedUserInput;
    }

    public final ThreadDetailViewState copy(List<? extends ThreadDetailViewState4> viewTypes, List<Bitmap> imagesToSend, boolean allowInput, boolean showNotificationSettings, String threadTitle, String earliestMessageId, boolean showImagesToSendView, boolean showMediaUploadButton, String savedUserInput, boolean hasFetchedAllPreviousMessages, boolean isLoadingPreviousMessages, boolean isUploadingMedia, ApiNotificationThreadSettingsItem apiNotificationThreadSettingsItem) {
        Intrinsics.checkNotNullParameter(viewTypes, "viewTypes");
        Intrinsics.checkNotNullParameter(imagesToSend, "imagesToSend");
        Intrinsics.checkNotNullParameter(savedUserInput, "savedUserInput");
        return new ThreadDetailViewState(viewTypes, imagesToSend, allowInput, showNotificationSettings, threadTitle, earliestMessageId, showImagesToSendView, showMediaUploadButton, savedUserInput, hasFetchedAllPreviousMessages, isLoadingPreviousMessages, isUploadingMedia, apiNotificationThreadSettingsItem);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ThreadDetailViewState)) {
            return false;
        }
        ThreadDetailViewState threadDetailViewState = (ThreadDetailViewState) other;
        return Intrinsics.areEqual(this.viewTypes, threadDetailViewState.viewTypes) && Intrinsics.areEqual(this.imagesToSend, threadDetailViewState.imagesToSend) && this.allowInput == threadDetailViewState.allowInput && this.showNotificationSettings == threadDetailViewState.showNotificationSettings && Intrinsics.areEqual(this.threadTitle, threadDetailViewState.threadTitle) && Intrinsics.areEqual(this.earliestMessageId, threadDetailViewState.earliestMessageId) && this.showImagesToSendView == threadDetailViewState.showImagesToSendView && this.showMediaUploadButton == threadDetailViewState.showMediaUploadButton && Intrinsics.areEqual(this.savedUserInput, threadDetailViewState.savedUserInput) && this.hasFetchedAllPreviousMessages == threadDetailViewState.hasFetchedAllPreviousMessages && this.isLoadingPreviousMessages == threadDetailViewState.isLoadingPreviousMessages && this.isUploadingMedia == threadDetailViewState.isUploadingMedia && Intrinsics.areEqual(this.apiNotificationThreadSettingsItem, threadDetailViewState.apiNotificationThreadSettingsItem);
    }

    public int hashCode() {
        int iHashCode = ((((((this.viewTypes.hashCode() * 31) + this.imagesToSend.hashCode()) * 31) + Boolean.hashCode(this.allowInput)) * 31) + Boolean.hashCode(this.showNotificationSettings)) * 31;
        String str = this.threadTitle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.earliestMessageId;
        int iHashCode3 = (((((((((((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.showImagesToSendView)) * 31) + Boolean.hashCode(this.showMediaUploadButton)) * 31) + this.savedUserInput.hashCode()) * 31) + Boolean.hashCode(this.hasFetchedAllPreviousMessages)) * 31) + Boolean.hashCode(this.isLoadingPreviousMessages)) * 31) + Boolean.hashCode(this.isUploadingMedia)) * 31;
        ApiNotificationThreadSettingsItem apiNotificationThreadSettingsItem = this.apiNotificationThreadSettingsItem;
        return iHashCode3 + (apiNotificationThreadSettingsItem != null ? apiNotificationThreadSettingsItem.hashCode() : 0);
    }

    public String toString() {
        return "ThreadDetailViewState(viewTypes=" + this.viewTypes + ", imagesToSend=" + this.imagesToSend + ", allowInput=" + this.allowInput + ", showNotificationSettings=" + this.showNotificationSettings + ", threadTitle=" + this.threadTitle + ", earliestMessageId=" + this.earliestMessageId + ", showImagesToSendView=" + this.showImagesToSendView + ", showMediaUploadButton=" + this.showMediaUploadButton + ", savedUserInput=" + this.savedUserInput + ", hasFetchedAllPreviousMessages=" + this.hasFetchedAllPreviousMessages + ", isLoadingPreviousMessages=" + this.isLoadingPreviousMessages + ", isUploadingMedia=" + this.isUploadingMedia + ", apiNotificationThreadSettingsItem=" + this.apiNotificationThreadSettingsItem + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ThreadDetailViewState(List<? extends ThreadDetailViewState4> viewTypes, List<Bitmap> imagesToSend, boolean z, boolean z2, String str, String str2, boolean z3, boolean z4, String savedUserInput, boolean z5, boolean z6, boolean z7, ApiNotificationThreadSettingsItem apiNotificationThreadSettingsItem) {
        Intrinsics.checkNotNullParameter(viewTypes, "viewTypes");
        Intrinsics.checkNotNullParameter(imagesToSend, "imagesToSend");
        Intrinsics.checkNotNullParameter(savedUserInput, "savedUserInput");
        this.viewTypes = viewTypes;
        this.imagesToSend = imagesToSend;
        this.allowInput = z;
        this.showNotificationSettings = z2;
        this.threadTitle = str;
        this.earliestMessageId = str2;
        this.showImagesToSendView = z3;
        this.showMediaUploadButton = z4;
        this.savedUserInput = savedUserInput;
        this.hasFetchedAllPreviousMessages = z5;
        this.isLoadingPreviousMessages = z6;
        this.isUploadingMedia = z7;
        this.apiNotificationThreadSettingsItem = apiNotificationThreadSettingsItem;
    }

    public /* synthetic */ ThreadDetailViewState(List list, List list2, boolean z, boolean z2, String str, String str2, boolean z3, boolean z4, String str3, boolean z5, boolean z6, boolean z7, ApiNotificationThreadSettingsItem apiNotificationThreadSettingsItem, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? CollectionsKt.emptyList() : list2, (i & 4) != 0 ? true : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? false : z3, (i & 128) != 0 ? false : z4, (i & 256) != 0 ? "" : str3, (i & 512) != 0 ? false : z5, (i & 1024) != 0 ? false : z6, (i & 2048) == 0 ? z7 : false, (i & 4096) != 0 ? null : apiNotificationThreadSettingsItem);
    }

    public final List<ThreadDetailViewState4> getViewTypes() {
        return this.viewTypes;
    }

    public final List<Bitmap> getImagesToSend() {
        return this.imagesToSend;
    }

    public final boolean getAllowInput() {
        return this.allowInput;
    }

    public final boolean getShowNotificationSettings() {
        return this.showNotificationSettings;
    }

    public final String getThreadTitle() {
        return this.threadTitle;
    }

    public final String getEarliestMessageId() {
        return this.earliestMessageId;
    }

    public final boolean getShowImagesToSendView() {
        return this.showImagesToSendView;
    }

    public final boolean getShowMediaUploadButton() {
        return this.showMediaUploadButton;
    }

    public final String getSavedUserInput() {
        return this.savedUserInput;
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
}
