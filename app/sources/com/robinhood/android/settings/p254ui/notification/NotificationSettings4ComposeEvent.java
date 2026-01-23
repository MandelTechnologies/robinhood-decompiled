package com.robinhood.android.settings.p254ui.notification;

import com.robinhood.shared.settings.contracts.NotificationSettings4FragmentKey3;
import com.robinhood.shared.settings.contracts.NotificationSettings4FragmentKey4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NotificationSettings4ComposeEvent.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/notification/NotificationSettings4ComposeEvent;", "", "NotificationSettingsError", "OpenMultipleChoiceBottomSheet", "PresentSurveyIfNecessary", "OpenSubPageEntry", "Lcom/robinhood/android/settings/ui/notification/NotificationSettings4ComposeEvent$NotificationSettingsError;", "Lcom/robinhood/android/settings/ui/notification/NotificationSettings4ComposeEvent$OpenMultipleChoiceBottomSheet;", "Lcom/robinhood/android/settings/ui/notification/NotificationSettings4ComposeEvent$OpenSubPageEntry;", "Lcom/robinhood/android/settings/ui/notification/NotificationSettings4ComposeEvent$PresentSurveyIfNecessary;", "feature-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public interface NotificationSettings4ComposeEvent {

    /* compiled from: NotificationSettings4ComposeEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/notification/NotificationSettings4ComposeEvent$NotificationSettingsError;", "Lcom/robinhood/android/settings/ui/notification/NotificationSettings4ComposeEvent;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class NotificationSettingsError implements NotificationSettings4ComposeEvent {
        public static final int $stable = 8;
        private final Throwable throwable;

        public static /* synthetic */ NotificationSettingsError copy$default(NotificationSettingsError notificationSettingsError, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = notificationSettingsError.throwable;
            }
            return notificationSettingsError.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        public final NotificationSettingsError copy(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return new NotificationSettingsError(throwable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NotificationSettingsError) && Intrinsics.areEqual(this.throwable, ((NotificationSettingsError) other).throwable);
        }

        public int hashCode() {
            return this.throwable.hashCode();
        }

        public String toString() {
            return "NotificationSettingsError(throwable=" + this.throwable + ")";
        }

        public NotificationSettingsError(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }
    }

    /* compiled from: NotificationSettings4ComposeEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/notification/NotificationSettings4ComposeEvent$OpenMultipleChoiceBottomSheet;", "Lcom/robinhood/android/settings/ui/notification/NotificationSettings4ComposeEvent;", "bottomSheetRow", "Lcom/robinhood/shared/settings/contracts/ViewType$BottomSheetEntryPointRow;", "<init>", "(Lcom/robinhood/shared/settings/contracts/ViewType$BottomSheetEntryPointRow;)V", "getBottomSheetRow", "()Lcom/robinhood/shared/settings/contracts/ViewType$BottomSheetEntryPointRow;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class OpenMultipleChoiceBottomSheet implements NotificationSettings4ComposeEvent {
        public static final int $stable = 8;
        private final NotificationSettings4FragmentKey4.BottomSheetEntryPointRow bottomSheetRow;

        public static /* synthetic */ OpenMultipleChoiceBottomSheet copy$default(OpenMultipleChoiceBottomSheet openMultipleChoiceBottomSheet, NotificationSettings4FragmentKey4.BottomSheetEntryPointRow bottomSheetEntryPointRow, int i, Object obj) {
            if ((i & 1) != 0) {
                bottomSheetEntryPointRow = openMultipleChoiceBottomSheet.bottomSheetRow;
            }
            return openMultipleChoiceBottomSheet.copy(bottomSheetEntryPointRow);
        }

        /* renamed from: component1, reason: from getter */
        public final NotificationSettings4FragmentKey4.BottomSheetEntryPointRow getBottomSheetRow() {
            return this.bottomSheetRow;
        }

        public final OpenMultipleChoiceBottomSheet copy(NotificationSettings4FragmentKey4.BottomSheetEntryPointRow bottomSheetRow) {
            Intrinsics.checkNotNullParameter(bottomSheetRow, "bottomSheetRow");
            return new OpenMultipleChoiceBottomSheet(bottomSheetRow);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OpenMultipleChoiceBottomSheet) && Intrinsics.areEqual(this.bottomSheetRow, ((OpenMultipleChoiceBottomSheet) other).bottomSheetRow);
        }

        public int hashCode() {
            return this.bottomSheetRow.hashCode();
        }

        public String toString() {
            return "OpenMultipleChoiceBottomSheet(bottomSheetRow=" + this.bottomSheetRow + ")";
        }

        public OpenMultipleChoiceBottomSheet(NotificationSettings4FragmentKey4.BottomSheetEntryPointRow bottomSheetRow) {
            Intrinsics.checkNotNullParameter(bottomSheetRow, "bottomSheetRow");
            this.bottomSheetRow = bottomSheetRow;
        }

        public final NotificationSettings4FragmentKey4.BottomSheetEntryPointRow getBottomSheetRow() {
            return this.bottomSheetRow;
        }
    }

    /* compiled from: NotificationSettings4ComposeEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/notification/NotificationSettings4ComposeEvent$PresentSurveyIfNecessary;", "Lcom/robinhood/android/settings/ui/notification/NotificationSettings4ComposeEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PresentSurveyIfNecessary implements NotificationSettings4ComposeEvent {
        public static final int $stable = 0;
        public static final PresentSurveyIfNecessary INSTANCE = new PresentSurveyIfNecessary();

        public boolean equals(Object other) {
            return this == other || (other instanceof PresentSurveyIfNecessary);
        }

        public int hashCode() {
            return -307589635;
        }

        public String toString() {
            return "PresentSurveyIfNecessary";
        }

        private PresentSurveyIfNecessary() {
        }
    }

    /* compiled from: NotificationSettings4ComposeEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/notification/NotificationSettings4ComposeEvent$OpenSubPageEntry;", "Lcom/robinhood/android/settings/ui/notification/NotificationSettings4ComposeEvent;", "reference", "Lcom/robinhood/shared/settings/contracts/SubPageReference;", "<init>", "(Lcom/robinhood/shared/settings/contracts/SubPageReference;)V", "getReference", "()Lcom/robinhood/shared/settings/contracts/SubPageReference;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class OpenSubPageEntry implements NotificationSettings4ComposeEvent {
        public static final int $stable = 8;
        private final NotificationSettings4FragmentKey3 reference;

        public static /* synthetic */ OpenSubPageEntry copy$default(OpenSubPageEntry openSubPageEntry, NotificationSettings4FragmentKey3 notificationSettings4FragmentKey3, int i, Object obj) {
            if ((i & 1) != 0) {
                notificationSettings4FragmentKey3 = openSubPageEntry.reference;
            }
            return openSubPageEntry.copy(notificationSettings4FragmentKey3);
        }

        /* renamed from: component1, reason: from getter */
        public final NotificationSettings4FragmentKey3 getReference() {
            return this.reference;
        }

        public final OpenSubPageEntry copy(NotificationSettings4FragmentKey3 reference) {
            Intrinsics.checkNotNullParameter(reference, "reference");
            return new OpenSubPageEntry(reference);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OpenSubPageEntry) && Intrinsics.areEqual(this.reference, ((OpenSubPageEntry) other).reference);
        }

        public int hashCode() {
            return this.reference.hashCode();
        }

        public String toString() {
            return "OpenSubPageEntry(reference=" + this.reference + ")";
        }

        public OpenSubPageEntry(NotificationSettings4FragmentKey3 reference) {
            Intrinsics.checkNotNullParameter(reference, "reference");
            this.reference = reference;
        }

        public final NotificationSettings4FragmentKey3 getReference() {
            return this.reference;
        }
    }
}
