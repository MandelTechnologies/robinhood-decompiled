package com.robinhood.android.supportchat.thread;

import kotlin.Metadata;

/* compiled from: CxChatEvent.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/CxChatEvent;", "", "ClearInput", "OpenBottomSheet", "DismissBottomSheet", "ShowImageProcessingIndicator", "HideImageProcessingIndicator", "OpenDialog", "DismissDialog", "UploadError", "GenericError", "Lcom/robinhood/android/supportchat/thread/CxChatEvent$ClearInput;", "Lcom/robinhood/android/supportchat/thread/CxChatEvent$DismissBottomSheet;", "Lcom/robinhood/android/supportchat/thread/CxChatEvent$DismissDialog;", "Lcom/robinhood/android/supportchat/thread/CxChatEvent$GenericError;", "Lcom/robinhood/android/supportchat/thread/CxChatEvent$HideImageProcessingIndicator;", "Lcom/robinhood/android/supportchat/thread/CxChatEvent$OpenBottomSheet;", "Lcom/robinhood/android/supportchat/thread/CxChatEvent$OpenDialog;", "Lcom/robinhood/android/supportchat/thread/CxChatEvent$ShowImageProcessingIndicator;", "Lcom/robinhood/android/supportchat/thread/CxChatEvent$UploadError;", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public interface CxChatEvent {

    /* compiled from: CxChatEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/CxChatEvent$ClearInput;", "Lcom/robinhood/android/supportchat/thread/CxChatEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ClearInput implements CxChatEvent {
        public static final int $stable = 0;
        public static final ClearInput INSTANCE = new ClearInput();

        public boolean equals(Object other) {
            return this == other || (other instanceof ClearInput);
        }

        public int hashCode() {
            return 1498844071;
        }

        public String toString() {
            return "ClearInput";
        }

        private ClearInput() {
        }
    }

    /* compiled from: CxChatEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/CxChatEvent$OpenBottomSheet;", "Lcom/robinhood/android/supportchat/thread/CxChatEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class OpenBottomSheet implements CxChatEvent {
        public static final int $stable = 0;
        public static final OpenBottomSheet INSTANCE = new OpenBottomSheet();

        public boolean equals(Object other) {
            return this == other || (other instanceof OpenBottomSheet);
        }

        public int hashCode() {
            return -1453925024;
        }

        public String toString() {
            return "OpenBottomSheet";
        }

        private OpenBottomSheet() {
        }
    }

    /* compiled from: CxChatEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/CxChatEvent$DismissBottomSheet;", "Lcom/robinhood/android/supportchat/thread/CxChatEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class DismissBottomSheet implements CxChatEvent {
        public static final int $stable = 0;
        public static final DismissBottomSheet INSTANCE = new DismissBottomSheet();

        public boolean equals(Object other) {
            return this == other || (other instanceof DismissBottomSheet);
        }

        public int hashCode() {
            return -2146404044;
        }

        public String toString() {
            return "DismissBottomSheet";
        }

        private DismissBottomSheet() {
        }
    }

    /* compiled from: CxChatEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/CxChatEvent$ShowImageProcessingIndicator;", "Lcom/robinhood/android/supportchat/thread/CxChatEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowImageProcessingIndicator implements CxChatEvent {
        public static final int $stable = 0;
        public static final ShowImageProcessingIndicator INSTANCE = new ShowImageProcessingIndicator();

        public boolean equals(Object other) {
            return this == other || (other instanceof ShowImageProcessingIndicator);
        }

        public int hashCode() {
            return 532691624;
        }

        public String toString() {
            return "ShowImageProcessingIndicator";
        }

        private ShowImageProcessingIndicator() {
        }
    }

    /* compiled from: CxChatEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/CxChatEvent$HideImageProcessingIndicator;", "Lcom/robinhood/android/supportchat/thread/CxChatEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class HideImageProcessingIndicator implements CxChatEvent {
        public static final int $stable = 0;
        public static final HideImageProcessingIndicator INSTANCE = new HideImageProcessingIndicator();

        public boolean equals(Object other) {
            return this == other || (other instanceof HideImageProcessingIndicator);
        }

        public int hashCode() {
            return -1604715027;
        }

        public String toString() {
            return "HideImageProcessingIndicator";
        }

        private HideImageProcessingIndicator() {
        }
    }

    /* compiled from: CxChatEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/CxChatEvent$OpenDialog;", "Lcom/robinhood/android/supportchat/thread/CxChatEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class OpenDialog implements CxChatEvent {
        public static final int $stable = 0;
        public static final OpenDialog INSTANCE = new OpenDialog();

        public boolean equals(Object other) {
            return this == other || (other instanceof OpenDialog);
        }

        public int hashCode() {
            return -2134334884;
        }

        public String toString() {
            return "OpenDialog";
        }

        private OpenDialog() {
        }
    }

    /* compiled from: CxChatEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/CxChatEvent$DismissDialog;", "Lcom/robinhood/android/supportchat/thread/CxChatEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class DismissDialog implements CxChatEvent {
        public static final int $stable = 0;
        public static final DismissDialog INSTANCE = new DismissDialog();

        public boolean equals(Object other) {
            return this == other || (other instanceof DismissDialog);
        }

        public int hashCode() {
            return 1594487304;
        }

        public String toString() {
            return "DismissDialog";
        }

        private DismissDialog() {
        }
    }

    /* compiled from: CxChatEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/CxChatEvent$UploadError;", "Lcom/robinhood/android/supportchat/thread/CxChatEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class UploadError implements CxChatEvent {
        public static final int $stable = 0;
        public static final UploadError INSTANCE = new UploadError();

        public boolean equals(Object other) {
            return this == other || (other instanceof UploadError);
        }

        public int hashCode() {
            return 2137833373;
        }

        public String toString() {
            return "UploadError";
        }

        private UploadError() {
        }
    }

    /* compiled from: CxChatEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/CxChatEvent$GenericError;", "Lcom/robinhood/android/supportchat/thread/CxChatEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class GenericError implements CxChatEvent {
        public static final int $stable = 0;
        public static final GenericError INSTANCE = new GenericError();

        public boolean equals(Object other) {
            return this == other || (other instanceof GenericError);
        }

        public int hashCode() {
            return -642681317;
        }

        public String toString() {
            return "GenericError";
        }

        private GenericError() {
        }
    }
}
