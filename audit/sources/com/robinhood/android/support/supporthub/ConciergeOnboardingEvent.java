package com.robinhood.android.support.supporthub;

import kotlin.Metadata;

/* compiled from: ConciergeOnboardingEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/support/supporthub/ConciergeOnboardingEvent;", "", "ShowSupportHub", "ShowErrorDialog", "Lcom/robinhood/android/support/supporthub/ConciergeOnboardingEvent$ShowErrorDialog;", "Lcom/robinhood/android/support/supporthub/ConciergeOnboardingEvent$ShowSupportHub;", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public interface ConciergeOnboardingEvent {

    /* compiled from: ConciergeOnboardingEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/support/supporthub/ConciergeOnboardingEvent$ShowSupportHub;", "Lcom/robinhood/android/support/supporthub/ConciergeOnboardingEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowSupportHub implements ConciergeOnboardingEvent {
        public static final int $stable = 0;
        public static final ShowSupportHub INSTANCE = new ShowSupportHub();

        public boolean equals(Object other) {
            return this == other || (other instanceof ShowSupportHub);
        }

        public int hashCode() {
            return -1703185584;
        }

        public String toString() {
            return "ShowSupportHub";
        }

        private ShowSupportHub() {
        }
    }

    /* compiled from: ConciergeOnboardingEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/support/supporthub/ConciergeOnboardingEvent$ShowErrorDialog;", "Lcom/robinhood/android/support/supporthub/ConciergeOnboardingEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowErrorDialog implements ConciergeOnboardingEvent {
        public static final int $stable = 0;
        public static final ShowErrorDialog INSTANCE = new ShowErrorDialog();

        public boolean equals(Object other) {
            return this == other || (other instanceof ShowErrorDialog);
        }

        public int hashCode() {
            return -1008693754;
        }

        public String toString() {
            return "ShowErrorDialog";
        }

        private ShowErrorDialog() {
        }
    }
}
