package com.robinhood.android.inbox.p156ui.thread;

import android.net.Uri;
import com.robinhood.models.p320db.MediaMetadata;
import com.robinhood.utils.extensions.ResourceTypes;
import java.util.List;
import java.util.UUID;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* compiled from: ThreadDetailViewState.kt */
@kotlin.Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\f\r\u000e\u000f\u0010\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0000H\u0016J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0004\u0082\u0001\u0006\u0012\u0013\u0014\t\u000b\u0015¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/inbox/ui/thread/ViewType;", "", "<init>", "()V", "isTheSameAs", "", "other", "areTheSame", "response", "Lcom/robinhood/android/inbox/ui/thread/ViewType$Response;", "text", "Lcom/robinhood/android/inbox/ui/thread/ViewType$Text;", "Text", "Response", "Timestamp", "Date", "Metadata", "ProgressBar", "Lcom/robinhood/android/inbox/ui/thread/ViewType$Date;", "Lcom/robinhood/android/inbox/ui/thread/ViewType$Metadata;", "Lcom/robinhood/android/inbox/ui/thread/ViewType$ProgressBar;", "Lcom/robinhood/android/inbox/ui/thread/ViewType$Timestamp;", "feature-inbox_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.inbox.ui.thread.ViewType, reason: use source file name */
/* loaded from: classes10.dex */
public abstract class ThreadDetailViewState4 {
    public /* synthetic */ ThreadDetailViewState4(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ThreadDetailViewState4() {
    }

    public boolean isTheSameAs(ThreadDetailViewState4 other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return Intrinsics.areEqual(this, other);
    }

    /* compiled from: ThreadDetailViewState.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b<\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0003YZ[BÅ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u0019\u001a\u00020\t\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u001b\u001a\u00020\t\u0012\u0006\u0010\u001c\u001a\u00020\t\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010=\u001a\u00020\t2\u0006\u0010>\u001a\u00020\u0001H\u0016J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010D\u001a\u00020\tHÆ\u0003J\t\u0010E\u001a\u00020\tHÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0011\u0010G\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\t\u0010M\u001a\u00020\tHÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010O\u001a\u00020\tHÆ\u0003J\t\u0010P\u001a\u00020\tHÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0003HÆ\u0003JÙ\u0001\u0010S\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u0019\u001a\u00020\t2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001b\u001a\u00020\t2\b\b\u0002\u0010\u001c\u001a\u00020\t2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010T\u001a\u00020\t2\b\u0010>\u001a\u0004\u0018\u00010UHÖ\u0003J\t\u0010V\u001a\u00020WHÖ\u0001J\t\u0010X\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b)\u0010(R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\"R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0011\u0010\u0019\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b7\u0010(R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u0010\"R\u0011\u0010\u001b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b9\u0010(R\u0011\u0010\u001c\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b:\u0010(R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b;\u0010\"R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b<\u0010\"R\u0011\u0010?\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b@\u0010(¨\u0006\\"}, m3636d2 = {"Lcom/robinhood/android/inbox/ui/thread/ViewType$Text;", "Lcom/robinhood/android/inbox/ui/thread/ViewType;", "messageId", "", "localMessageId", "Ljava/util/UUID;", "localMessageStatus", "Lcom/robinhood/android/inbox/ui/thread/ViewType$Text$LocalMessageStatus;", "fromUser", "", "latest", "text", "", "textAttributes", "", "Lcom/robinhood/android/inbox/ui/thread/ViewType$Text$Attribute;", "mediaMetadata", "Lcom/robinhood/models/db/MediaMetadata;", "internalAction", "Lcom/robinhood/android/inbox/ui/thread/InternalAction;", "externalAction", "Lcom/robinhood/android/inbox/ui/thread/ExternalAction;", "avatarText", "avatarUrl", "Lokhttp3/HttpUrl;", "showAvatar", "entityUrl", "showStatusMessage", "showRetry", "messageConfigId", "messageTypeConfigId", "<init>", "(Ljava/lang/String;Ljava/util/UUID;Lcom/robinhood/android/inbox/ui/thread/ViewType$Text$LocalMessageStatus;ZZLjava/lang/CharSequence;Ljava/util/List;Lcom/robinhood/models/db/MediaMetadata;Lcom/robinhood/android/inbox/ui/thread/InternalAction;Lcom/robinhood/android/inbox/ui/thread/ExternalAction;Ljava/lang/String;Lokhttp3/HttpUrl;ZLjava/lang/String;ZZLjava/lang/String;Ljava/lang/String;)V", "getMessageId", "()Ljava/lang/String;", "getLocalMessageId", "()Ljava/util/UUID;", "getLocalMessageStatus", "()Lcom/robinhood/android/inbox/ui/thread/ViewType$Text$LocalMessageStatus;", "getFromUser", "()Z", "getLatest", "getText", "()Ljava/lang/CharSequence;", "getTextAttributes", "()Ljava/util/List;", "getMediaMetadata", "()Lcom/robinhood/models/db/MediaMetadata;", "getInternalAction", "()Lcom/robinhood/android/inbox/ui/thread/InternalAction;", "getExternalAction", "()Lcom/robinhood/android/inbox/ui/thread/ExternalAction;", "getAvatarText", "getAvatarUrl", "()Lokhttp3/HttpUrl;", "getShowAvatar", "getEntityUrl", "getShowStatusMessage", "getShowRetry", "getMessageConfigId", "getMessageTypeConfigId", "isTheSameAs", "other", "showResending", "getShowResending", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "equals", "", "hashCode", "", "toString", "LocalMessageStatus", "Attribute", "TextStyle", "feature-inbox_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.inbox.ui.thread.ViewType$Text, reason: from toString */
    public static final /* data */ class Text extends ThreadDetailViewState4 {
        private final String avatarText;
        private final HttpUrl avatarUrl;
        private final String entityUrl;
        private final ExternalAction externalAction;
        private final boolean fromUser;
        private final InternalAction internalAction;
        private final boolean latest;
        private final UUID localMessageId;
        private final LocalMessageStatus localMessageStatus;
        private final MediaMetadata mediaMetadata;
        private final String messageConfigId;
        private final String messageId;
        private final String messageTypeConfigId;
        private final boolean showAvatar;
        private final boolean showResending;
        private final boolean showRetry;
        private final boolean showStatusMessage;
        private final CharSequence text;
        private final List<Attribute> textAttributes;

        public static /* synthetic */ Text copy$default(Text text, String str, UUID uuid, LocalMessageStatus localMessageStatus, boolean z, boolean z2, CharSequence charSequence, List list, MediaMetadata mediaMetadata, InternalAction internalAction, ExternalAction threadDetailViewState2, String str2, HttpUrl httpUrl, boolean z3, String str3, boolean z4, boolean z5, String str4, String str5, int i, Object obj) {
            String str6;
            String str7;
            String str8 = (i & 1) != 0 ? text.messageId : str;
            UUID uuid2 = (i & 2) != 0 ? text.localMessageId : uuid;
            LocalMessageStatus localMessageStatus2 = (i & 4) != 0 ? text.localMessageStatus : localMessageStatus;
            boolean z6 = (i & 8) != 0 ? text.fromUser : z;
            boolean z7 = (i & 16) != 0 ? text.latest : z2;
            CharSequence charSequence2 = (i & 32) != 0 ? text.text : charSequence;
            List list2 = (i & 64) != 0 ? text.textAttributes : list;
            MediaMetadata mediaMetadata2 = (i & 128) != 0 ? text.mediaMetadata : mediaMetadata;
            InternalAction internalAction2 = (i & 256) != 0 ? text.internalAction : internalAction;
            ExternalAction threadDetailViewState22 = (i & 512) != 0 ? text.externalAction : threadDetailViewState2;
            String str9 = (i & 1024) != 0 ? text.avatarText : str2;
            HttpUrl httpUrl2 = (i & 2048) != 0 ? text.avatarUrl : httpUrl;
            boolean z8 = (i & 4096) != 0 ? text.showAvatar : z3;
            String str10 = (i & 8192) != 0 ? text.entityUrl : str3;
            String str11 = str8;
            boolean z9 = (i & 16384) != 0 ? text.showStatusMessage : z4;
            boolean z10 = (i & 32768) != 0 ? text.showRetry : z5;
            String str12 = (i & 65536) != 0 ? text.messageConfigId : str4;
            if ((i & 131072) != 0) {
                str7 = str12;
                str6 = text.messageTypeConfigId;
            } else {
                str6 = str5;
                str7 = str12;
            }
            return text.copy(str11, uuid2, localMessageStatus2, z6, z7, charSequence2, list2, mediaMetadata2, internalAction2, threadDetailViewState22, str9, httpUrl2, z8, str10, z9, z10, str7, str6);
        }

        /* renamed from: component1, reason: from getter */
        public final String getMessageId() {
            return this.messageId;
        }

        /* renamed from: component10, reason: from getter */
        public final ExternalAction getExternalAction() {
            return this.externalAction;
        }

        /* renamed from: component11, reason: from getter */
        public final String getAvatarText() {
            return this.avatarText;
        }

        /* renamed from: component12, reason: from getter */
        public final HttpUrl getAvatarUrl() {
            return this.avatarUrl;
        }

        /* renamed from: component13, reason: from getter */
        public final boolean getShowAvatar() {
            return this.showAvatar;
        }

        /* renamed from: component14, reason: from getter */
        public final String getEntityUrl() {
            return this.entityUrl;
        }

        /* renamed from: component15, reason: from getter */
        public final boolean getShowStatusMessage() {
            return this.showStatusMessage;
        }

        /* renamed from: component16, reason: from getter */
        public final boolean getShowRetry() {
            return this.showRetry;
        }

        /* renamed from: component17, reason: from getter */
        public final String getMessageConfigId() {
            return this.messageConfigId;
        }

        /* renamed from: component18, reason: from getter */
        public final String getMessageTypeConfigId() {
            return this.messageTypeConfigId;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getLocalMessageId() {
            return this.localMessageId;
        }

        /* renamed from: component3, reason: from getter */
        public final LocalMessageStatus getLocalMessageStatus() {
            return this.localMessageStatus;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getFromUser() {
            return this.fromUser;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getLatest() {
            return this.latest;
        }

        /* renamed from: component6, reason: from getter */
        public final CharSequence getText() {
            return this.text;
        }

        public final List<Attribute> component7() {
            return this.textAttributes;
        }

        /* renamed from: component8, reason: from getter */
        public final MediaMetadata getMediaMetadata() {
            return this.mediaMetadata;
        }

        /* renamed from: component9, reason: from getter */
        public final InternalAction getInternalAction() {
            return this.internalAction;
        }

        public final Text copy(String messageId, UUID localMessageId, LocalMessageStatus localMessageStatus, boolean fromUser, boolean latest, CharSequence text, List<Attribute> textAttributes, MediaMetadata mediaMetadata, InternalAction internalAction, ExternalAction externalAction, String avatarText, HttpUrl avatarUrl, boolean showAvatar, String entityUrl, boolean showStatusMessage, boolean showRetry, String messageConfigId, String messageTypeConfigId) {
            Intrinsics.checkNotNullParameter(messageId, "messageId");
            Intrinsics.checkNotNullParameter(avatarText, "avatarText");
            return new Text(messageId, localMessageId, localMessageStatus, fromUser, latest, text, textAttributes, mediaMetadata, internalAction, externalAction, avatarText, avatarUrl, showAvatar, entityUrl, showStatusMessage, showRetry, messageConfigId, messageTypeConfigId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Text)) {
                return false;
            }
            Text text = (Text) other;
            return Intrinsics.areEqual(this.messageId, text.messageId) && Intrinsics.areEqual(this.localMessageId, text.localMessageId) && this.localMessageStatus == text.localMessageStatus && this.fromUser == text.fromUser && this.latest == text.latest && Intrinsics.areEqual(this.text, text.text) && Intrinsics.areEqual(this.textAttributes, text.textAttributes) && Intrinsics.areEqual(this.mediaMetadata, text.mediaMetadata) && Intrinsics.areEqual(this.internalAction, text.internalAction) && Intrinsics.areEqual(this.externalAction, text.externalAction) && Intrinsics.areEqual(this.avatarText, text.avatarText) && Intrinsics.areEqual(this.avatarUrl, text.avatarUrl) && this.showAvatar == text.showAvatar && Intrinsics.areEqual(this.entityUrl, text.entityUrl) && this.showStatusMessage == text.showStatusMessage && this.showRetry == text.showRetry && Intrinsics.areEqual(this.messageConfigId, text.messageConfigId) && Intrinsics.areEqual(this.messageTypeConfigId, text.messageTypeConfigId);
        }

        public int hashCode() {
            int iHashCode = this.messageId.hashCode() * 31;
            UUID uuid = this.localMessageId;
            int iHashCode2 = (iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31;
            LocalMessageStatus localMessageStatus = this.localMessageStatus;
            int iHashCode3 = (((((iHashCode2 + (localMessageStatus == null ? 0 : localMessageStatus.hashCode())) * 31) + Boolean.hashCode(this.fromUser)) * 31) + Boolean.hashCode(this.latest)) * 31;
            CharSequence charSequence = this.text;
            int iHashCode4 = (iHashCode3 + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
            List<Attribute> list = this.textAttributes;
            int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
            MediaMetadata mediaMetadata = this.mediaMetadata;
            int iHashCode6 = (iHashCode5 + (mediaMetadata == null ? 0 : mediaMetadata.hashCode())) * 31;
            InternalAction internalAction = this.internalAction;
            int iHashCode7 = (iHashCode6 + (internalAction == null ? 0 : internalAction.hashCode())) * 31;
            ExternalAction threadDetailViewState2 = this.externalAction;
            int iHashCode8 = (((iHashCode7 + (threadDetailViewState2 == null ? 0 : threadDetailViewState2.hashCode())) * 31) + this.avatarText.hashCode()) * 31;
            HttpUrl httpUrl = this.avatarUrl;
            int iHashCode9 = (((iHashCode8 + (httpUrl == null ? 0 : httpUrl.hashCode())) * 31) + Boolean.hashCode(this.showAvatar)) * 31;
            String str = this.entityUrl;
            int iHashCode10 = (((((iHashCode9 + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.showStatusMessage)) * 31) + Boolean.hashCode(this.showRetry)) * 31;
            String str2 = this.messageConfigId;
            int iHashCode11 = (iHashCode10 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.messageTypeConfigId;
            return iHashCode11 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            String str = this.messageId;
            UUID uuid = this.localMessageId;
            LocalMessageStatus localMessageStatus = this.localMessageStatus;
            boolean z = this.fromUser;
            boolean z2 = this.latest;
            CharSequence charSequence = this.text;
            return "Text(messageId=" + str + ", localMessageId=" + uuid + ", localMessageStatus=" + localMessageStatus + ", fromUser=" + z + ", latest=" + z2 + ", text=" + ((Object) charSequence) + ", textAttributes=" + this.textAttributes + ", mediaMetadata=" + this.mediaMetadata + ", internalAction=" + this.internalAction + ", externalAction=" + this.externalAction + ", avatarText=" + this.avatarText + ", avatarUrl=" + this.avatarUrl + ", showAvatar=" + this.showAvatar + ", entityUrl=" + this.entityUrl + ", showStatusMessage=" + this.showStatusMessage + ", showRetry=" + this.showRetry + ", messageConfigId=" + this.messageConfigId + ", messageTypeConfigId=" + this.messageTypeConfigId + ")";
        }

        public /* synthetic */ Text(String str, UUID uuid, LocalMessageStatus localMessageStatus, boolean z, boolean z2, CharSequence charSequence, List list, MediaMetadata mediaMetadata, InternalAction internalAction, ExternalAction threadDetailViewState2, String str2, HttpUrl httpUrl, boolean z3, String str3, boolean z4, boolean z5, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, uuid, localMessageStatus, z, z2, (i & 32) != 0 ? null : charSequence, (i & 64) != 0 ? null : list, (i & 128) != 0 ? null : mediaMetadata, (i & 256) != 0 ? null : internalAction, (i & 512) != 0 ? null : threadDetailViewState2, str2, (i & 2048) != 0 ? null : httpUrl, z3, (i & 8192) != 0 ? null : str3, z4, z5, (65536 & i) != 0 ? null : str4, (i & 131072) != 0 ? null : str5);
        }

        public final String getMessageId() {
            return this.messageId;
        }

        public final UUID getLocalMessageId() {
            return this.localMessageId;
        }

        public final LocalMessageStatus getLocalMessageStatus() {
            return this.localMessageStatus;
        }

        public final boolean getFromUser() {
            return this.fromUser;
        }

        public final boolean getLatest() {
            return this.latest;
        }

        public final CharSequence getText() {
            return this.text;
        }

        public final List<Attribute> getTextAttributes() {
            return this.textAttributes;
        }

        public final MediaMetadata getMediaMetadata() {
            return this.mediaMetadata;
        }

        public final InternalAction getInternalAction() {
            return this.internalAction;
        }

        public final ExternalAction getExternalAction() {
            return this.externalAction;
        }

        public final String getAvatarText() {
            return this.avatarText;
        }

        public final HttpUrl getAvatarUrl() {
            return this.avatarUrl;
        }

        public final boolean getShowAvatar() {
            return this.showAvatar;
        }

        public final String getEntityUrl() {
            return this.entityUrl;
        }

        public final boolean getShowStatusMessage() {
            return this.showStatusMessage;
        }

        public final boolean getShowRetry() {
            return this.showRetry;
        }

        public final String getMessageConfigId() {
            return this.messageConfigId;
        }

        public final String getMessageTypeConfigId() {
            return this.messageTypeConfigId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Text(String messageId, UUID uuid, LocalMessageStatus localMessageStatus, boolean z, boolean z2, CharSequence charSequence, List<Attribute> list, MediaMetadata mediaMetadata, InternalAction internalAction, ExternalAction threadDetailViewState2, String avatarText, HttpUrl httpUrl, boolean z3, String str, boolean z4, boolean z5, String str2, String str3) {
            super(null);
            Intrinsics.checkNotNullParameter(messageId, "messageId");
            Intrinsics.checkNotNullParameter(avatarText, "avatarText");
            this.messageId = messageId;
            this.localMessageId = uuid;
            this.localMessageStatus = localMessageStatus;
            this.fromUser = z;
            this.latest = z2;
            this.text = charSequence;
            this.textAttributes = list;
            this.mediaMetadata = mediaMetadata;
            this.internalAction = internalAction;
            this.externalAction = threadDetailViewState2;
            this.avatarText = avatarText;
            this.avatarUrl = httpUrl;
            this.showAvatar = z3;
            this.entityUrl = str;
            this.showStatusMessage = z4;
            this.showRetry = z5;
            this.messageConfigId = str2;
            this.messageTypeConfigId = str3;
            this.showResending = localMessageStatus == LocalMessageStatus.RESENDING;
        }

        @Override // com.robinhood.android.inbox.p156ui.thread.ThreadDetailViewState4
        public boolean isTheSameAs(ThreadDetailViewState4 other) {
            Intrinsics.checkNotNullParameter(other, "other");
            if (other instanceof Response) {
                return areTheSame((Response) other, this);
            }
            Text text = other instanceof Text ? (Text) other : null;
            if (text == null) {
                return false;
            }
            UUID uuid = this.localMessageId;
            if (uuid == null && ((Text) other).localMessageId == null) {
                return Intrinsics.areEqual(text.messageId, this.messageId) && Intrinsics.areEqual(text.externalAction, this.externalAction);
            }
            return Intrinsics.areEqual(uuid, ((Text) other).localMessageId);
        }

        public final boolean getShowResending() {
            return this.showResending;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ThreadDetailViewState.kt */
        @kotlin.Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/inbox/ui/thread/ViewType$Text$LocalMessageStatus;", "", "<init>", "(Ljava/lang/String;I)V", "SENDING", "FAILED", "RESENDING", "feature-inbox_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.inbox.ui.thread.ViewType$Text$LocalMessageStatus */
        public static final class LocalMessageStatus {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ LocalMessageStatus[] $VALUES;
            public static final LocalMessageStatus SENDING = new LocalMessageStatus("SENDING", 0);
            public static final LocalMessageStatus FAILED = new LocalMessageStatus("FAILED", 1);
            public static final LocalMessageStatus RESENDING = new LocalMessageStatus("RESENDING", 2);

            private static final /* synthetic */ LocalMessageStatus[] $values() {
                return new LocalMessageStatus[]{SENDING, FAILED, RESENDING};
            }

            public static EnumEntries<LocalMessageStatus> getEntries() {
                return $ENTRIES;
            }

            private LocalMessageStatus(String str, int i) {
            }

            static {
                LocalMessageStatus[] localMessageStatusArr$values = $values();
                $VALUES = localMessageStatusArr$values;
                $ENTRIES = EnumEntries2.enumEntries(localMessageStatusArr$values);
            }

            public static LocalMessageStatus valueOf(String str) {
                return (LocalMessageStatus) Enum.valueOf(LocalMessageStatus.class, str);
            }

            public static LocalMessageStatus[] values() {
                return (LocalMessageStatus[]) $VALUES.clone();
            }
        }

        /* compiled from: ThreadDetailViewState.kt */
        @kotlin.Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J5\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/inbox/ui/thread/ViewType$Text$Attribute;", "", "location", "", "length", "link", "Landroid/net/Uri;", ResourceTypes.STYLE, "Lcom/robinhood/android/inbox/ui/thread/ViewType$Text$TextStyle;", "<init>", "(IILandroid/net/Uri;Lcom/robinhood/android/inbox/ui/thread/ViewType$Text$TextStyle;)V", "getLocation", "()I", "getLength", "getLink", "()Landroid/net/Uri;", "getStyle", "()Lcom/robinhood/android/inbox/ui/thread/ViewType$Text$TextStyle;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "feature-inbox_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.inbox.ui.thread.ViewType$Text$Attribute, reason: from toString */
        public static final /* data */ class Attribute {
            private final int length;
            private final Uri link;
            private final int location;
            private final TextStyle style;

            public static /* synthetic */ Attribute copy$default(Attribute attribute, int i, int i2, Uri uri, TextStyle textStyle, int i3, Object obj) {
                if ((i3 & 1) != 0) {
                    i = attribute.location;
                }
                if ((i3 & 2) != 0) {
                    i2 = attribute.length;
                }
                if ((i3 & 4) != 0) {
                    uri = attribute.link;
                }
                if ((i3 & 8) != 0) {
                    textStyle = attribute.style;
                }
                return attribute.copy(i, i2, uri, textStyle);
            }

            /* renamed from: component1, reason: from getter */
            public final int getLocation() {
                return this.location;
            }

            /* renamed from: component2, reason: from getter */
            public final int getLength() {
                return this.length;
            }

            /* renamed from: component3, reason: from getter */
            public final Uri getLink() {
                return this.link;
            }

            /* renamed from: component4, reason: from getter */
            public final TextStyle getStyle() {
                return this.style;
            }

            public final Attribute copy(int location, int length, Uri link, TextStyle style) {
                return new Attribute(location, length, link, style);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Attribute)) {
                    return false;
                }
                Attribute attribute = (Attribute) other;
                return this.location == attribute.location && this.length == attribute.length && Intrinsics.areEqual(this.link, attribute.link) && this.style == attribute.style;
            }

            public int hashCode() {
                int iHashCode = ((Integer.hashCode(this.location) * 31) + Integer.hashCode(this.length)) * 31;
                Uri uri = this.link;
                int iHashCode2 = (iHashCode + (uri == null ? 0 : uri.hashCode())) * 31;
                TextStyle textStyle = this.style;
                return iHashCode2 + (textStyle != null ? textStyle.hashCode() : 0);
            }

            public String toString() {
                return "Attribute(location=" + this.location + ", length=" + this.length + ", link=" + this.link + ", style=" + this.style + ")";
            }

            public Attribute(int i, int i2, Uri uri, TextStyle textStyle) {
                this.location = i;
                this.length = i2;
                this.link = uri;
                this.style = textStyle;
            }

            public final int getLocation() {
                return this.location;
            }

            public final int getLength() {
                return this.length;
            }

            public final Uri getLink() {
                return this.link;
            }

            public final TextStyle getStyle() {
                return this.style;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ThreadDetailViewState.kt */
        @kotlin.Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/inbox/ui/thread/ViewType$Text$TextStyle;", "", "<init>", "(Ljava/lang/String;I)V", "BOLD", "ITALIC", "UNDERLINE", "HIGHLIGHT", "feature-inbox_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.inbox.ui.thread.ViewType$Text$TextStyle */
        public static final class TextStyle {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ TextStyle[] $VALUES;
            public static final TextStyle BOLD = new TextStyle("BOLD", 0);
            public static final TextStyle ITALIC = new TextStyle("ITALIC", 1);
            public static final TextStyle UNDERLINE = new TextStyle("UNDERLINE", 2);
            public static final TextStyle HIGHLIGHT = new TextStyle("HIGHLIGHT", 3);

            private static final /* synthetic */ TextStyle[] $values() {
                return new TextStyle[]{BOLD, ITALIC, UNDERLINE, HIGHLIGHT};
            }

            public static EnumEntries<TextStyle> getEntries() {
                return $ENTRIES;
            }

            private TextStyle(String str, int i) {
            }

            static {
                TextStyle[] textStyleArr$values = $values();
                $VALUES = textStyleArr$values;
                $ENTRIES = EnumEntries2.enumEntries(textStyleArr$values);
            }

            public static TextStyle valueOf(String str) {
                return (TextStyle) Enum.valueOf(TextStyle.class, str);
            }

            public static TextStyle[] values() {
                return (TextStyle[]) $VALUES.clone();
            }
        }
    }

    /* compiled from: ThreadDetailViewState.kt */
    @kotlin.Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0001H\u0016J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003JI\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010 \u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/inbox/ui/thread/ViewType$Response;", "Lcom/robinhood/android/inbox/ui/thread/ViewType;", "messageId", "", "answer", "text", "", "localId", "Ljava/util/UUID;", "messageConfigId", "messageTypeConfigId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/CharSequence;Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;)V", "getMessageId", "()Ljava/lang/String;", "getAnswer", "getText", "()Ljava/lang/CharSequence;", "getLocalId", "()Ljava/util/UUID;", "getMessageConfigId", "getMessageTypeConfigId", "isTheSameAs", "", "other", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "hashCode", "", "toString", "feature-inbox_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.inbox.ui.thread.ViewType$Response, reason: from toString */
    public static final /* data */ class Response extends ThreadDetailViewState4 {
        private final String answer;
        private final UUID localId;
        private final String messageConfigId;
        private final String messageId;
        private final String messageTypeConfigId;
        private final CharSequence text;

        public static /* synthetic */ Response copy$default(Response response, String str, String str2, CharSequence charSequence, UUID uuid, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = response.messageId;
            }
            if ((i & 2) != 0) {
                str2 = response.answer;
            }
            if ((i & 4) != 0) {
                charSequence = response.text;
            }
            if ((i & 8) != 0) {
                uuid = response.localId;
            }
            if ((i & 16) != 0) {
                str3 = response.messageConfigId;
            }
            if ((i & 32) != 0) {
                str4 = response.messageTypeConfigId;
            }
            String str5 = str3;
            String str6 = str4;
            return response.copy(str, str2, charSequence, uuid, str5, str6);
        }

        /* renamed from: component1, reason: from getter */
        public final String getMessageId() {
            return this.messageId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAnswer() {
            return this.answer;
        }

        /* renamed from: component3, reason: from getter */
        public final CharSequence getText() {
            return this.text;
        }

        /* renamed from: component4, reason: from getter */
        public final UUID getLocalId() {
            return this.localId;
        }

        /* renamed from: component5, reason: from getter */
        public final String getMessageConfigId() {
            return this.messageConfigId;
        }

        /* renamed from: component6, reason: from getter */
        public final String getMessageTypeConfigId() {
            return this.messageTypeConfigId;
        }

        public final Response copy(String messageId, String answer, CharSequence text, UUID localId, String messageConfigId, String messageTypeConfigId) {
            Intrinsics.checkNotNullParameter(messageId, "messageId");
            Intrinsics.checkNotNullParameter(answer, "answer");
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(localId, "localId");
            return new Response(messageId, answer, text, localId, messageConfigId, messageTypeConfigId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Response)) {
                return false;
            }
            Response response = (Response) other;
            return Intrinsics.areEqual(this.messageId, response.messageId) && Intrinsics.areEqual(this.answer, response.answer) && Intrinsics.areEqual(this.text, response.text) && Intrinsics.areEqual(this.localId, response.localId) && Intrinsics.areEqual(this.messageConfigId, response.messageConfigId) && Intrinsics.areEqual(this.messageTypeConfigId, response.messageTypeConfigId);
        }

        public int hashCode() {
            int iHashCode = ((((((this.messageId.hashCode() * 31) + this.answer.hashCode()) * 31) + this.text.hashCode()) * 31) + this.localId.hashCode()) * 31;
            String str = this.messageConfigId;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.messageTypeConfigId;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            String str = this.messageId;
            String str2 = this.answer;
            CharSequence charSequence = this.text;
            return "Response(messageId=" + str + ", answer=" + str2 + ", text=" + ((Object) charSequence) + ", localId=" + this.localId + ", messageConfigId=" + this.messageConfigId + ", messageTypeConfigId=" + this.messageTypeConfigId + ")";
        }

        public /* synthetic */ Response(String str, String str2, CharSequence charSequence, UUID uuid, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, charSequence, uuid, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4);
        }

        public final String getMessageId() {
            return this.messageId;
        }

        public final String getAnswer() {
            return this.answer;
        }

        public final CharSequence getText() {
            return this.text;
        }

        public final UUID getLocalId() {
            return this.localId;
        }

        public final String getMessageConfigId() {
            return this.messageConfigId;
        }

        public final String getMessageTypeConfigId() {
            return this.messageTypeConfigId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Response(String messageId, String answer, CharSequence text, UUID localId, String str, String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(messageId, "messageId");
            Intrinsics.checkNotNullParameter(answer, "answer");
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(localId, "localId");
            this.messageId = messageId;
            this.answer = answer;
            this.text = text;
            this.localId = localId;
            this.messageConfigId = str;
            this.messageTypeConfigId = str2;
        }

        @Override // com.robinhood.android.inbox.p156ui.thread.ThreadDetailViewState4
        public boolean isTheSameAs(ThreadDetailViewState4 other) {
            Intrinsics.checkNotNullParameter(other, "other");
            if (other instanceof Text) {
                return areTheSame(this, (Text) other);
            }
            return super.isTheSameAs(other);
        }
    }

    /* compiled from: ThreadDetailViewState.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/inbox/ui/thread/ViewType$Timestamp;", "Lcom/robinhood/android/inbox/ui/thread/ViewType;", "fromUser", "", "text", "", "<init>", "(ZLjava/lang/CharSequence;)V", "getFromUser", "()Z", "getText", "()Ljava/lang/CharSequence;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-inbox_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.inbox.ui.thread.ViewType$Timestamp, reason: from toString */
    public static final /* data */ class Timestamp extends ThreadDetailViewState4 {
        private final boolean fromUser;
        private final CharSequence text;

        public static /* synthetic */ Timestamp copy$default(Timestamp timestamp, boolean z, CharSequence charSequence, int i, Object obj) {
            if ((i & 1) != 0) {
                z = timestamp.fromUser;
            }
            if ((i & 2) != 0) {
                charSequence = timestamp.text;
            }
            return timestamp.copy(z, charSequence);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getFromUser() {
            return this.fromUser;
        }

        /* renamed from: component2, reason: from getter */
        public final CharSequence getText() {
            return this.text;
        }

        public final Timestamp copy(boolean fromUser, CharSequence text) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new Timestamp(fromUser, text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Timestamp)) {
                return false;
            }
            Timestamp timestamp = (Timestamp) other;
            return this.fromUser == timestamp.fromUser && Intrinsics.areEqual(this.text, timestamp.text);
        }

        public int hashCode() {
            return (Boolean.hashCode(this.fromUser) * 31) + this.text.hashCode();
        }

        public String toString() {
            return "Timestamp(fromUser=" + this.fromUser + ", text=" + ((Object) this.text) + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Timestamp(boolean z, CharSequence text) {
            super(null);
            Intrinsics.checkNotNullParameter(text, "text");
            this.fromUser = z;
            this.text = text;
        }

        public final boolean getFromUser() {
            return this.fromUser;
        }

        public final CharSequence getText() {
            return this.text;
        }
    }

    /* compiled from: ThreadDetailViewState.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/inbox/ui/thread/ViewType$Date;", "Lcom/robinhood/android/inbox/ui/thread/ViewType;", "text", "", "<init>", "(Ljava/lang/CharSequence;)V", "getText", "()Ljava/lang/CharSequence;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-inbox_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.inbox.ui.thread.ViewType$Date, reason: from toString */
    public static final /* data */ class Date extends ThreadDetailViewState4 {
        private final CharSequence text;

        public static /* synthetic */ Date copy$default(Date date, CharSequence charSequence, int i, Object obj) {
            if ((i & 1) != 0) {
                charSequence = date.text;
            }
            return date.copy(charSequence);
        }

        /* renamed from: component1, reason: from getter */
        public final CharSequence getText() {
            return this.text;
        }

        public final Date copy(CharSequence text) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new Date(text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Date) && Intrinsics.areEqual(this.text, ((Date) other).text);
        }

        public int hashCode() {
            return this.text.hashCode();
        }

        public String toString() {
            return "Date(text=" + ((Object) this.text) + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Date(CharSequence text) {
            super(null);
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
        }

        public final CharSequence getText() {
            return this.text;
        }
    }

    /* compiled from: ThreadDetailViewState.kt */
    @kotlin.Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003JA\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/inbox/ui/thread/ViewType$Metadata;", "Lcom/robinhood/android/inbox/ui/thread/ViewType;", "messageId", "", "text", "", "internalAction", "Lcom/robinhood/android/inbox/ui/thread/InternalAction;", "externalAction", "Lcom/robinhood/android/inbox/ui/thread/ExternalAction;", "messageConfigId", "<init>", "(Ljava/lang/String;Ljava/lang/CharSequence;Lcom/robinhood/android/inbox/ui/thread/InternalAction;Lcom/robinhood/android/inbox/ui/thread/ExternalAction;Ljava/lang/String;)V", "getMessageId", "()Ljava/lang/String;", "getText", "()Ljava/lang/CharSequence;", "getInternalAction", "()Lcom/robinhood/android/inbox/ui/thread/InternalAction;", "getExternalAction", "()Lcom/robinhood/android/inbox/ui/thread/ExternalAction;", "getMessageConfigId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-inbox_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.inbox.ui.thread.ViewType$Metadata, reason: from toString */
    public static final /* data */ class Metadata extends ThreadDetailViewState4 {
        private final ExternalAction externalAction;
        private final InternalAction internalAction;
        private final String messageConfigId;
        private final String messageId;
        private final CharSequence text;

        public static /* synthetic */ Metadata copy$default(Metadata metadata, String str, CharSequence charSequence, InternalAction internalAction, ExternalAction threadDetailViewState2, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = metadata.messageId;
            }
            if ((i & 2) != 0) {
                charSequence = metadata.text;
            }
            if ((i & 4) != 0) {
                internalAction = metadata.internalAction;
            }
            if ((i & 8) != 0) {
                threadDetailViewState2 = metadata.externalAction;
            }
            if ((i & 16) != 0) {
                str2 = metadata.messageConfigId;
            }
            String str3 = str2;
            InternalAction internalAction2 = internalAction;
            return metadata.copy(str, charSequence, internalAction2, threadDetailViewState2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getMessageId() {
            return this.messageId;
        }

        /* renamed from: component2, reason: from getter */
        public final CharSequence getText() {
            return this.text;
        }

        /* renamed from: component3, reason: from getter */
        public final InternalAction getInternalAction() {
            return this.internalAction;
        }

        /* renamed from: component4, reason: from getter */
        public final ExternalAction getExternalAction() {
            return this.externalAction;
        }

        /* renamed from: component5, reason: from getter */
        public final String getMessageConfigId() {
            return this.messageConfigId;
        }

        public final Metadata copy(String messageId, CharSequence text, InternalAction internalAction, ExternalAction externalAction, String messageConfigId) {
            Intrinsics.checkNotNullParameter(messageId, "messageId");
            Intrinsics.checkNotNullParameter(text, "text");
            return new Metadata(messageId, text, internalAction, externalAction, messageConfigId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Metadata)) {
                return false;
            }
            Metadata metadata = (Metadata) other;
            return Intrinsics.areEqual(this.messageId, metadata.messageId) && Intrinsics.areEqual(this.text, metadata.text) && Intrinsics.areEqual(this.internalAction, metadata.internalAction) && Intrinsics.areEqual(this.externalAction, metadata.externalAction) && Intrinsics.areEqual(this.messageConfigId, metadata.messageConfigId);
        }

        public int hashCode() {
            int iHashCode = ((this.messageId.hashCode() * 31) + this.text.hashCode()) * 31;
            InternalAction internalAction = this.internalAction;
            int iHashCode2 = (iHashCode + (internalAction == null ? 0 : internalAction.hashCode())) * 31;
            ExternalAction threadDetailViewState2 = this.externalAction;
            int iHashCode3 = (iHashCode2 + (threadDetailViewState2 == null ? 0 : threadDetailViewState2.hashCode())) * 31;
            String str = this.messageConfigId;
            return iHashCode3 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            String str = this.messageId;
            CharSequence charSequence = this.text;
            return "Metadata(messageId=" + str + ", text=" + ((Object) charSequence) + ", internalAction=" + this.internalAction + ", externalAction=" + this.externalAction + ", messageConfigId=" + this.messageConfigId + ")";
        }

        public final String getMessageId() {
            return this.messageId;
        }

        public final CharSequence getText() {
            return this.text;
        }

        public final InternalAction getInternalAction() {
            return this.internalAction;
        }

        public final ExternalAction getExternalAction() {
            return this.externalAction;
        }

        public final String getMessageConfigId() {
            return this.messageConfigId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Metadata(String messageId, CharSequence text, InternalAction internalAction, ExternalAction threadDetailViewState2, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(messageId, "messageId");
            Intrinsics.checkNotNullParameter(text, "text");
            this.messageId = messageId;
            this.text = text;
            this.internalAction = internalAction;
            this.externalAction = threadDetailViewState2;
            this.messageConfigId = str;
        }
    }

    /* compiled from: ThreadDetailViewState.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/inbox/ui/thread/ViewType$ProgressBar;", "Lcom/robinhood/android/inbox/ui/thread/ViewType;", "<init>", "()V", "feature-inbox_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.inbox.ui.thread.ViewType$ProgressBar */
    public static final class ProgressBar extends ThreadDetailViewState4 {
        public ProgressBar() {
            super(null);
        }
    }

    protected final boolean areTheSame(Response response, Text text) {
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(text, "text");
        return Intrinsics.areEqual(response.getLocalId(), text.getLocalMessageId());
    }
}
