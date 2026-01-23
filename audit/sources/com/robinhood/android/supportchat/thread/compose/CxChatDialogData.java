package com.robinhood.android.supportchat.thread.compose;

import com.robinhood.android.instant.p160ui.InstantRetirementSplashScreen;
import com.robinhood.models.p355ui.p356v2.UpdateSupportChatError;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CxChatDialogData.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\u000b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/compose/CxChatDialogData;", "", "EndChat", "EndChatError", "UpdateChatError", "CharacterLimit", "ImageSizeLimit", "CameraPermission", "ImageError", "PushPrompt", "UnrecoverableChatbotError", "None", "CxChatExistingLiveCase", "Lcom/robinhood/android/supportchat/thread/compose/CxChatDialogData$CameraPermission;", "Lcom/robinhood/android/supportchat/thread/compose/CxChatDialogData$CharacterLimit;", "Lcom/robinhood/android/supportchat/thread/compose/CxChatDialogData$CxChatExistingLiveCase;", "Lcom/robinhood/android/supportchat/thread/compose/CxChatDialogData$EndChat;", "Lcom/robinhood/android/supportchat/thread/compose/CxChatDialogData$EndChatError;", "Lcom/robinhood/android/supportchat/thread/compose/CxChatDialogData$ImageError;", "Lcom/robinhood/android/supportchat/thread/compose/CxChatDialogData$ImageSizeLimit;", "Lcom/robinhood/android/supportchat/thread/compose/CxChatDialogData$None;", "Lcom/robinhood/android/supportchat/thread/compose/CxChatDialogData$PushPrompt;", "Lcom/robinhood/android/supportchat/thread/compose/CxChatDialogData$UnrecoverableChatbotError;", "Lcom/robinhood/android/supportchat/thread/compose/CxChatDialogData$UpdateChatError;", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public interface CxChatDialogData {

    /* compiled from: CxChatDialogData.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/compose/CxChatDialogData$EndChat;", "Lcom/robinhood/android/supportchat/thread/compose/CxChatDialogData;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class EndChat implements CxChatDialogData {
        public static final int $stable = 0;
        public static final EndChat INSTANCE = new EndChat();

        public boolean equals(Object other) {
            return this == other || (other instanceof EndChat);
        }

        public int hashCode() {
            return 1118874217;
        }

        public String toString() {
            return "EndChat";
        }

        private EndChat() {
        }
    }

    /* compiled from: CxChatDialogData.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/compose/CxChatDialogData$EndChatError;", "Lcom/robinhood/android/supportchat/thread/compose/CxChatDialogData;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class EndChatError implements CxChatDialogData {
        public static final int $stable = 0;
        public static final EndChatError INSTANCE = new EndChatError();

        public boolean equals(Object other) {
            return this == other || (other instanceof EndChatError);
        }

        public int hashCode() {
            return -1168617185;
        }

        public String toString() {
            return "EndChatError";
        }

        private EndChatError() {
        }
    }

    /* compiled from: CxChatDialogData.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/compose/CxChatDialogData$UpdateChatError;", "Lcom/robinhood/android/supportchat/thread/compose/CxChatDialogData;", "errorInfo", "Lcom/robinhood/models/ui/v2/UpdateSupportChatError;", "<init>", "(Lcom/robinhood/models/ui/v2/UpdateSupportChatError;)V", "getErrorInfo", "()Lcom/robinhood/models/ui/v2/UpdateSupportChatError;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class UpdateChatError implements CxChatDialogData {
        public static final int $stable = 8;
        private final UpdateSupportChatError errorInfo;

        public static /* synthetic */ UpdateChatError copy$default(UpdateChatError updateChatError, UpdateSupportChatError updateSupportChatError, int i, Object obj) {
            if ((i & 1) != 0) {
                updateSupportChatError = updateChatError.errorInfo;
            }
            return updateChatError.copy(updateSupportChatError);
        }

        /* renamed from: component1, reason: from getter */
        public final UpdateSupportChatError getErrorInfo() {
            return this.errorInfo;
        }

        public final UpdateChatError copy(UpdateSupportChatError errorInfo) {
            Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
            return new UpdateChatError(errorInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UpdateChatError) && Intrinsics.areEqual(this.errorInfo, ((UpdateChatError) other).errorInfo);
        }

        public int hashCode() {
            return this.errorInfo.hashCode();
        }

        public String toString() {
            return "UpdateChatError(errorInfo=" + this.errorInfo + ")";
        }

        public UpdateChatError(UpdateSupportChatError errorInfo) {
            Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
            this.errorInfo = errorInfo;
        }

        public final UpdateSupportChatError getErrorInfo() {
            return this.errorInfo;
        }
    }

    /* compiled from: CxChatDialogData.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/compose/CxChatDialogData$CharacterLimit;", "Lcom/robinhood/android/supportchat/thread/compose/CxChatDialogData;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class CharacterLimit implements CxChatDialogData {
        public static final int $stable = 0;
        public static final CharacterLimit INSTANCE = new CharacterLimit();

        public boolean equals(Object other) {
            return this == other || (other instanceof CharacterLimit);
        }

        public int hashCode() {
            return 2127994300;
        }

        public String toString() {
            return "CharacterLimit";
        }

        private CharacterLimit() {
        }
    }

    /* compiled from: CxChatDialogData.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/compose/CxChatDialogData$ImageSizeLimit;", "Lcom/robinhood/android/supportchat/thread/compose/CxChatDialogData;", "source", "Lcom/robinhood/android/supportchat/thread/compose/CxChatDialogData$ImageSizeLimit$Source;", "<init>", "(Lcom/robinhood/android/supportchat/thread/compose/CxChatDialogData$ImageSizeLimit$Source;)V", "getSource", "()Lcom/robinhood/android/supportchat/thread/compose/CxChatDialogData$ImageSizeLimit$Source;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Source", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ImageSizeLimit implements CxChatDialogData {
        public static final int $stable = 0;
        private final Source source;

        public static /* synthetic */ ImageSizeLimit copy$default(ImageSizeLimit imageSizeLimit, Source source, int i, Object obj) {
            if ((i & 1) != 0) {
                source = imageSizeLimit.source;
            }
            return imageSizeLimit.copy(source);
        }

        /* renamed from: component1, reason: from getter */
        public final Source getSource() {
            return this.source;
        }

        public final ImageSizeLimit copy(Source source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new ImageSizeLimit(source);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ImageSizeLimit) && this.source == ((ImageSizeLimit) other).source;
        }

        public int hashCode() {
            return this.source.hashCode();
        }

        public String toString() {
            return "ImageSizeLimit(source=" + this.source + ")";
        }

        public ImageSizeLimit(Source source) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.source = source;
        }

        public final Source getSource() {
            return this.source;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: CxChatDialogData.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/compose/CxChatDialogData$ImageSizeLimit$Source;", "", "<init>", "(Ljava/lang/String;I)V", "IMAGE_PICKER", "CAMERA", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Source {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Source[] $VALUES;
            public static final Source IMAGE_PICKER = new Source("IMAGE_PICKER", 0);
            public static final Source CAMERA = new Source("CAMERA", 1);

            private static final /* synthetic */ Source[] $values() {
                return new Source[]{IMAGE_PICKER, CAMERA};
            }

            public static EnumEntries<Source> getEntries() {
                return $ENTRIES;
            }

            private Source(String str, int i) {
            }

            static {
                Source[] sourceArr$values = $values();
                $VALUES = sourceArr$values;
                $ENTRIES = EnumEntries2.enumEntries(sourceArr$values);
            }

            public static Source valueOf(String str) {
                return (Source) Enum.valueOf(Source.class, str);
            }

            public static Source[] values() {
                return (Source[]) $VALUES.clone();
            }
        }
    }

    /* compiled from: CxChatDialogData.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/compose/CxChatDialogData$CameraPermission;", "Lcom/robinhood/android/supportchat/thread/compose/CxChatDialogData;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class CameraPermission implements CxChatDialogData {
        public static final int $stable = 0;
        public static final CameraPermission INSTANCE = new CameraPermission();

        public boolean equals(Object other) {
            return this == other || (other instanceof CameraPermission);
        }

        public int hashCode() {
            return -115760130;
        }

        public String toString() {
            return "CameraPermission";
        }

        private CameraPermission() {
        }
    }

    /* compiled from: CxChatDialogData.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/compose/CxChatDialogData$ImageError;", "Lcom/robinhood/android/supportchat/thread/compose/CxChatDialogData;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ImageError implements CxChatDialogData {
        public static final int $stable = 0;
        public static final ImageError INSTANCE = new ImageError();

        public boolean equals(Object other) {
            return this == other || (other instanceof ImageError);
        }

        public int hashCode() {
            return 1002220055;
        }

        public String toString() {
            return "ImageError";
        }

        private ImageError() {
        }
    }

    /* compiled from: CxChatDialogData.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/compose/CxChatDialogData$PushPrompt;", "Lcom/robinhood/android/supportchat/thread/compose/CxChatDialogData;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PushPrompt implements CxChatDialogData {
        public static final int $stable = 0;
        public static final PushPrompt INSTANCE = new PushPrompt();

        public boolean equals(Object other) {
            return this == other || (other instanceof PushPrompt);
        }

        public int hashCode() {
            return -314537528;
        }

        public String toString() {
            return "PushPrompt";
        }

        private PushPrompt() {
        }
    }

    /* compiled from: CxChatDialogData.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/compose/CxChatDialogData$UnrecoverableChatbotError;", "Lcom/robinhood/android/supportchat/thread/compose/CxChatDialogData;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class UnrecoverableChatbotError implements CxChatDialogData {
        public static final int $stable = 0;
        public static final UnrecoverableChatbotError INSTANCE = new UnrecoverableChatbotError();

        public boolean equals(Object other) {
            return this == other || (other instanceof UnrecoverableChatbotError);
        }

        public int hashCode() {
            return 622679828;
        }

        public String toString() {
            return "UnrecoverableChatbotError";
        }

        private UnrecoverableChatbotError() {
        }
    }

    /* compiled from: CxChatDialogData.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/compose/CxChatDialogData$None;", "Lcom/robinhood/android/supportchat/thread/compose/CxChatDialogData;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class None implements CxChatDialogData {
        public static final int $stable = 0;
        public static final None INSTANCE = new None();

        public boolean equals(Object other) {
            return this == other || (other instanceof None);
        }

        public int hashCode() {
            return -1119172766;
        }

        public String toString() {
            return "None";
        }

        private None() {
        }
    }

    /* compiled from: CxChatDialogData.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0019B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/compose/CxChatDialogData$CxChatExistingLiveCase;", "Lcom/robinhood/android/supportchat/thread/compose/CxChatDialogData;", "title", "", "message", InstantRetirementSplashScreen.PrimaryButtonTag, "Lcom/robinhood/android/supportchat/thread/compose/CxChatDialogData$CxChatExistingLiveCase$PrimaryCta;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/supportchat/thread/compose/CxChatDialogData$CxChatExistingLiveCase$PrimaryCta;)V", "getTitle", "()Ljava/lang/String;", "getMessage", "getPrimary", "()Lcom/robinhood/android/supportchat/thread/compose/CxChatDialogData$CxChatExistingLiveCase$PrimaryCta;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "PrimaryCta", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class CxChatExistingLiveCase implements CxChatDialogData {
        public static final int $stable = 0;
        private final String message;
        private final PrimaryCta primary;
        private final String title;

        public static /* synthetic */ CxChatExistingLiveCase copy$default(CxChatExistingLiveCase cxChatExistingLiveCase, String str, String str2, PrimaryCta primaryCta, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cxChatExistingLiveCase.title;
            }
            if ((i & 2) != 0) {
                str2 = cxChatExistingLiveCase.message;
            }
            if ((i & 4) != 0) {
                primaryCta = cxChatExistingLiveCase.primary;
            }
            return cxChatExistingLiveCase.copy(str, str2, primaryCta);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* renamed from: component3, reason: from getter */
        public final PrimaryCta getPrimary() {
            return this.primary;
        }

        public final CxChatExistingLiveCase copy(String title, String message, PrimaryCta primary) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(message, "message");
            return new CxChatExistingLiveCase(title, message, primary);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CxChatExistingLiveCase)) {
                return false;
            }
            CxChatExistingLiveCase cxChatExistingLiveCase = (CxChatExistingLiveCase) other;
            return Intrinsics.areEqual(this.title, cxChatExistingLiveCase.title) && Intrinsics.areEqual(this.message, cxChatExistingLiveCase.message) && Intrinsics.areEqual(this.primary, cxChatExistingLiveCase.primary);
        }

        public int hashCode() {
            int iHashCode = ((this.title.hashCode() * 31) + this.message.hashCode()) * 31;
            PrimaryCta primaryCta = this.primary;
            return iHashCode + (primaryCta == null ? 0 : primaryCta.hashCode());
        }

        public String toString() {
            return "CxChatExistingLiveCase(title=" + this.title + ", message=" + this.message + ", primary=" + this.primary + ")";
        }

        public CxChatExistingLiveCase(String title, String message, PrimaryCta primaryCta) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(message, "message");
            this.title = title;
            this.message = message;
            this.primary = primaryCta;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getMessage() {
            return this.message;
        }

        public final PrimaryCta getPrimary() {
            return this.primary;
        }

        /* compiled from: CxChatDialogData.kt */
        @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/compose/CxChatDialogData$CxChatExistingLiveCase$PrimaryCta;", "", "title", "", "deeplink", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getDeeplink", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class PrimaryCta {
            public static final int $stable = 0;
            private final String deeplink;
            private final String title;

            public static /* synthetic */ PrimaryCta copy$default(PrimaryCta primaryCta, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = primaryCta.title;
                }
                if ((i & 2) != 0) {
                    str2 = primaryCta.deeplink;
                }
                return primaryCta.copy(str, str2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            /* renamed from: component2, reason: from getter */
            public final String getDeeplink() {
                return this.deeplink;
            }

            public final PrimaryCta copy(String title, String deeplink) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                return new PrimaryCta(title, deeplink);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PrimaryCta)) {
                    return false;
                }
                PrimaryCta primaryCta = (PrimaryCta) other;
                return Intrinsics.areEqual(this.title, primaryCta.title) && Intrinsics.areEqual(this.deeplink, primaryCta.deeplink);
            }

            public int hashCode() {
                return (this.title.hashCode() * 31) + this.deeplink.hashCode();
            }

            public String toString() {
                return "PrimaryCta(title=" + this.title + ", deeplink=" + this.deeplink + ")";
            }

            public PrimaryCta(String title, String deeplink) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                this.title = title;
                this.deeplink = deeplink;
            }

            public final String getTitle() {
                return this.title;
            }

            public final String getDeeplink() {
                return this.deeplink;
            }
        }
    }
}
