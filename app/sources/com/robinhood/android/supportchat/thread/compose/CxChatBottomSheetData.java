package com.robinhood.android.supportchat.thread.compose;

import com.robinhood.shared.support.supportchat.p396ui.models.UiChatMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CxChatBottomSheetData.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/compose/CxChatBottomSheetData;", "", "None", "ImageUpload", "ResendOptions", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public interface CxChatBottomSheetData {

    /* compiled from: CxChatBottomSheetData.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/compose/CxChatBottomSheetData$None;", "Lcom/robinhood/android/supportchat/thread/compose/CxChatBottomSheetData;", "<init>", "()V", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class None implements CxChatBottomSheetData {
        public static final int $stable = 0;
        public static final None INSTANCE = new None();

        private None() {
        }
    }

    /* compiled from: CxChatBottomSheetData.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/compose/CxChatBottomSheetData$ImageUpload;", "Lcom/robinhood/android/supportchat/thread/compose/CxChatBottomSheetData;", "<init>", "()V", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ImageUpload implements CxChatBottomSheetData {
        public static final int $stable = 0;
        public static final ImageUpload INSTANCE = new ImageUpload();

        private ImageUpload() {
        }
    }

    /* compiled from: CxChatBottomSheetData.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/compose/CxChatBottomSheetData$ResendOptions;", "Lcom/robinhood/android/supportchat/thread/compose/CxChatBottomSheetData;", "conversationSid", "", "message", "Lcom/robinhood/shared/support/supportchat/ui/models/UiChatMessage$Regular;", "<init>", "(Ljava/lang/String;Lcom/robinhood/shared/support/supportchat/ui/models/UiChatMessage$Regular;)V", "getConversationSid", "()Ljava/lang/String;", "getMessage", "()Lcom/robinhood/shared/support/supportchat/ui/models/UiChatMessage$Regular;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ResendOptions implements CxChatBottomSheetData {
        public static final int $stable = UiChatMessage.Regular.$stable;
        private final String conversationSid;
        private final UiChatMessage.Regular message;

        public static /* synthetic */ ResendOptions copy$default(ResendOptions resendOptions, String str, UiChatMessage.Regular regular, int i, Object obj) {
            if ((i & 1) != 0) {
                str = resendOptions.conversationSid;
            }
            if ((i & 2) != 0) {
                regular = resendOptions.message;
            }
            return resendOptions.copy(str, regular);
        }

        /* renamed from: component1, reason: from getter */
        public final String getConversationSid() {
            return this.conversationSid;
        }

        /* renamed from: component2, reason: from getter */
        public final UiChatMessage.Regular getMessage() {
            return this.message;
        }

        public final ResendOptions copy(String conversationSid, UiChatMessage.Regular message) {
            Intrinsics.checkNotNullParameter(conversationSid, "conversationSid");
            Intrinsics.checkNotNullParameter(message, "message");
            return new ResendOptions(conversationSid, message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ResendOptions)) {
                return false;
            }
            ResendOptions resendOptions = (ResendOptions) other;
            return Intrinsics.areEqual(this.conversationSid, resendOptions.conversationSid) && Intrinsics.areEqual(this.message, resendOptions.message);
        }

        public int hashCode() {
            return (this.conversationSid.hashCode() * 31) + this.message.hashCode();
        }

        public String toString() {
            return "ResendOptions(conversationSid=" + this.conversationSid + ", message=" + this.message + ")";
        }

        public ResendOptions(String conversationSid, UiChatMessage.Regular message) {
            Intrinsics.checkNotNullParameter(conversationSid, "conversationSid");
            Intrinsics.checkNotNullParameter(message, "message");
            this.conversationSid = conversationSid;
            this.message = message;
        }

        public final String getConversationSid() {
            return this.conversationSid;
        }

        public final UiChatMessage.Regular getMessage() {
            return this.message;
        }
    }
}
