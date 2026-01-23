package com.twilio.conversations;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConversationLimits.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003JG\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u001e"}, m3636d2 = {"Lcom/twilio/conversations/ConversationLimits;", "", "mediaAttachmentsCountLimit", "", "mediaAttachmentSizeLimitInMb", "mediaAttachmentsTotalSizeLimitInMb", "emailBodiesAllowedContentTypes", "", "", "emailHistoriesAllowedContentTypes", "<init>", "(IIILjava/util/List;Ljava/util/List;)V", "getMediaAttachmentsCountLimit", "()I", "getMediaAttachmentSizeLimitInMb", "getMediaAttachmentsTotalSizeLimitInMb", "getEmailBodiesAllowedContentTypes", "()Ljava/util/List;", "getEmailHistoriesAllowedContentTypes", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "convo-android_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ConversationLimits {
    private final List<String> emailBodiesAllowedContentTypes;
    private final List<String> emailHistoriesAllowedContentTypes;
    private final int mediaAttachmentSizeLimitInMb;
    private final int mediaAttachmentsCountLimit;
    private final int mediaAttachmentsTotalSizeLimitInMb;

    public static /* synthetic */ ConversationLimits copy$default(ConversationLimits conversationLimits, int i, int i2, int i3, List list, List list2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = conversationLimits.mediaAttachmentsCountLimit;
        }
        if ((i4 & 2) != 0) {
            i2 = conversationLimits.mediaAttachmentSizeLimitInMb;
        }
        if ((i4 & 4) != 0) {
            i3 = conversationLimits.mediaAttachmentsTotalSizeLimitInMb;
        }
        if ((i4 & 8) != 0) {
            list = conversationLimits.emailBodiesAllowedContentTypes;
        }
        if ((i4 & 16) != 0) {
            list2 = conversationLimits.emailHistoriesAllowedContentTypes;
        }
        List list3 = list2;
        int i5 = i3;
        return conversationLimits.copy(i, i2, i5, list, list3);
    }

    /* renamed from: component1, reason: from getter */
    public final int getMediaAttachmentsCountLimit() {
        return this.mediaAttachmentsCountLimit;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMediaAttachmentSizeLimitInMb() {
        return this.mediaAttachmentSizeLimitInMb;
    }

    /* renamed from: component3, reason: from getter */
    public final int getMediaAttachmentsTotalSizeLimitInMb() {
        return this.mediaAttachmentsTotalSizeLimitInMb;
    }

    public final List<String> component4() {
        return this.emailBodiesAllowedContentTypes;
    }

    public final List<String> component5() {
        return this.emailHistoriesAllowedContentTypes;
    }

    public final ConversationLimits copy(int mediaAttachmentsCountLimit, int mediaAttachmentSizeLimitInMb, int mediaAttachmentsTotalSizeLimitInMb, List<String> emailBodiesAllowedContentTypes, List<String> emailHistoriesAllowedContentTypes) {
        Intrinsics.checkNotNullParameter(emailBodiesAllowedContentTypes, "emailBodiesAllowedContentTypes");
        Intrinsics.checkNotNullParameter(emailHistoriesAllowedContentTypes, "emailHistoriesAllowedContentTypes");
        return new ConversationLimits(mediaAttachmentsCountLimit, mediaAttachmentSizeLimitInMb, mediaAttachmentsTotalSizeLimitInMb, emailBodiesAllowedContentTypes, emailHistoriesAllowedContentTypes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConversationLimits)) {
            return false;
        }
        ConversationLimits conversationLimits = (ConversationLimits) other;
        return this.mediaAttachmentsCountLimit == conversationLimits.mediaAttachmentsCountLimit && this.mediaAttachmentSizeLimitInMb == conversationLimits.mediaAttachmentSizeLimitInMb && this.mediaAttachmentsTotalSizeLimitInMb == conversationLimits.mediaAttachmentsTotalSizeLimitInMb && Intrinsics.areEqual(this.emailBodiesAllowedContentTypes, conversationLimits.emailBodiesAllowedContentTypes) && Intrinsics.areEqual(this.emailHistoriesAllowedContentTypes, conversationLimits.emailHistoriesAllowedContentTypes);
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.mediaAttachmentsCountLimit) * 31) + Integer.hashCode(this.mediaAttachmentSizeLimitInMb)) * 31) + Integer.hashCode(this.mediaAttachmentsTotalSizeLimitInMb)) * 31) + this.emailBodiesAllowedContentTypes.hashCode()) * 31) + this.emailHistoriesAllowedContentTypes.hashCode();
    }

    public String toString() {
        return "ConversationLimits(mediaAttachmentsCountLimit=" + this.mediaAttachmentsCountLimit + ", mediaAttachmentSizeLimitInMb=" + this.mediaAttachmentSizeLimitInMb + ", mediaAttachmentsTotalSizeLimitInMb=" + this.mediaAttachmentsTotalSizeLimitInMb + ", emailBodiesAllowedContentTypes=" + this.emailBodiesAllowedContentTypes + ", emailHistoriesAllowedContentTypes=" + this.emailHistoriesAllowedContentTypes + ')';
    }

    public ConversationLimits(int i, int i2, int i3, List<String> emailBodiesAllowedContentTypes, List<String> emailHistoriesAllowedContentTypes) {
        Intrinsics.checkNotNullParameter(emailBodiesAllowedContentTypes, "emailBodiesAllowedContentTypes");
        Intrinsics.checkNotNullParameter(emailHistoriesAllowedContentTypes, "emailHistoriesAllowedContentTypes");
        this.mediaAttachmentsCountLimit = i;
        this.mediaAttachmentSizeLimitInMb = i2;
        this.mediaAttachmentsTotalSizeLimitInMb = i3;
        this.emailBodiesAllowedContentTypes = emailBodiesAllowedContentTypes;
        this.emailHistoriesAllowedContentTypes = emailHistoriesAllowedContentTypes;
    }

    public final int getMediaAttachmentsCountLimit() {
        return this.mediaAttachmentsCountLimit;
    }

    public final int getMediaAttachmentSizeLimitInMb() {
        return this.mediaAttachmentSizeLimitInMb;
    }

    public final int getMediaAttachmentsTotalSizeLimitInMb() {
        return this.mediaAttachmentsTotalSizeLimitInMb;
    }

    public final List<String> getEmailBodiesAllowedContentTypes() {
        return this.emailBodiesAllowedContentTypes;
    }

    public final List<String> getEmailHistoriesAllowedContentTypes() {
        return this.emailHistoriesAllowedContentTypes;
    }
}
