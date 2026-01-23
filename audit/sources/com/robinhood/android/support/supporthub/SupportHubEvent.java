package com.robinhood.android.support.supporthub;

import kotlin.Metadata;

/* compiled from: SupportHubEvent.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/support/supporthub/SupportHubEvent;", "", "OpenBottomSheet", "CloseBottomSheet", "OpenDialog", "CloseDialog", "ShowConciergeOnboarding", "Lcom/robinhood/android/support/supporthub/SupportHubEvent$CloseBottomSheet;", "Lcom/robinhood/android/support/supporthub/SupportHubEvent$CloseDialog;", "Lcom/robinhood/android/support/supporthub/SupportHubEvent$OpenBottomSheet;", "Lcom/robinhood/android/support/supporthub/SupportHubEvent$OpenDialog;", "Lcom/robinhood/android/support/supporthub/SupportHubEvent$ShowConciergeOnboarding;", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public interface SupportHubEvent {

    /* compiled from: SupportHubEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/support/supporthub/SupportHubEvent$OpenBottomSheet;", "Lcom/robinhood/android/support/supporthub/SupportHubEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class OpenBottomSheet implements SupportHubEvent {
        public static final int $stable = 0;
        public static final OpenBottomSheet INSTANCE = new OpenBottomSheet();

        public boolean equals(Object other) {
            return this == other || (other instanceof OpenBottomSheet);
        }

        public int hashCode() {
            return 1147478619;
        }

        public String toString() {
            return "OpenBottomSheet";
        }

        private OpenBottomSheet() {
        }
    }

    /* compiled from: SupportHubEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/support/supporthub/SupportHubEvent$CloseBottomSheet;", "Lcom/robinhood/android/support/supporthub/SupportHubEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class CloseBottomSheet implements SupportHubEvent {
        public static final int $stable = 0;
        public static final CloseBottomSheet INSTANCE = new CloseBottomSheet();

        public boolean equals(Object other) {
            return this == other || (other instanceof CloseBottomSheet);
        }

        public int hashCode() {
            return -2126194197;
        }

        public String toString() {
            return "CloseBottomSheet";
        }

        private CloseBottomSheet() {
        }
    }

    /* compiled from: SupportHubEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/support/supporthub/SupportHubEvent$OpenDialog;", "Lcom/robinhood/android/support/supporthub/SupportHubEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class OpenDialog implements SupportHubEvent {
        public static final int $stable = 0;
        public static final OpenDialog INSTANCE = new OpenDialog();

        public boolean equals(Object other) {
            return this == other || (other instanceof OpenDialog);
        }

        public int hashCode() {
            return -1889801087;
        }

        public String toString() {
            return "OpenDialog";
        }

        private OpenDialog() {
        }
    }

    /* compiled from: SupportHubEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/support/supporthub/SupportHubEvent$CloseDialog;", "Lcom/robinhood/android/support/supporthub/SupportHubEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class CloseDialog implements SupportHubEvent {
        public static final int $stable = 0;
        public static final CloseDialog INSTANCE = new CloseDialog();

        public boolean equals(Object other) {
            return this == other || (other instanceof CloseDialog);
        }

        public int hashCode() {
            return -179586319;
        }

        public String toString() {
            return "CloseDialog";
        }

        private CloseDialog() {
        }
    }

    /* compiled from: SupportHubEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/support/supporthub/SupportHubEvent$ShowConciergeOnboarding;", "Lcom/robinhood/android/support/supporthub/SupportHubEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowConciergeOnboarding implements SupportHubEvent {
        public static final int $stable = 0;
        public static final ShowConciergeOnboarding INSTANCE = new ShowConciergeOnboarding();

        public boolean equals(Object other) {
            return this == other || (other instanceof ShowConciergeOnboarding);
        }

        public int hashCode() {
            return -118867966;
        }

        public String toString() {
            return "ShowConciergeOnboarding";
        }

        private ShowConciergeOnboarding() {
        }
    }
}
