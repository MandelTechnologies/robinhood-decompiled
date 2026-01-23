package com.robinhood.compose.common.checklist;

import android.text.Spanned;
import com.robinhood.android.wires.p278ui.WiresInvalidAccountContentComposable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChecklistItem.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\b\t\n\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0004\f\r\u000e\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/compose/common/checklist/ChecklistItem;", "", "title", "", "<init>", "(Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "NotStarted", "Loading", "Success", "Error", "Lcom/robinhood/compose/common/checklist/ChecklistItem$Error;", "Lcom/robinhood/compose/common/checklist/ChecklistItem$Loading;", "Lcom/robinhood/compose/common/checklist/ChecklistItem$NotStarted;", "Lcom/robinhood/compose/common/checklist/ChecklistItem$Success;", "lib-compose-common_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public abstract class ChecklistItem {
    public static final int $stable = 0;
    private final String title;

    public /* synthetic */ ChecklistItem(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private ChecklistItem(String str) {
        this.title = str;
    }

    public String getTitle() {
        return this.title;
    }

    /* compiled from: ChecklistItem.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/compose/common/checklist/ChecklistItem$NotStarted;", "Lcom/robinhood/compose/common/checklist/ChecklistItem;", "title", "", "<init>", "(Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-compose-common_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class NotStarted extends ChecklistItem {
        public static final int $stable = 0;
        private final String title;

        public static /* synthetic */ NotStarted copy$default(NotStarted notStarted, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = notStarted.title;
            }
            return notStarted.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final NotStarted copy(String title) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new NotStarted(title);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NotStarted) && Intrinsics.areEqual(this.title, ((NotStarted) other).title);
        }

        public int hashCode() {
            return this.title.hashCode();
        }

        public String toString() {
            return "NotStarted(title=" + this.title + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotStarted(String title) {
            super(title, null);
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
        }

        @Override // com.robinhood.compose.common.checklist.ChecklistItem
        public String getTitle() {
            return this.title;
        }
    }

    /* compiled from: ChecklistItem.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/compose/common/checklist/ChecklistItem$Loading;", "Lcom/robinhood/compose/common/checklist/ChecklistItem;", "title", "", "<init>", "(Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-compose-common_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading extends ChecklistItem {
        public static final int $stable = 0;
        private final String title;

        public static /* synthetic */ Loading copy$default(Loading loading, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = loading.title;
            }
            return loading.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final Loading copy(String title) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new Loading(title);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loading) && Intrinsics.areEqual(this.title, ((Loading) other).title);
        }

        public int hashCode() {
            return this.title.hashCode();
        }

        public String toString() {
            return "Loading(title=" + this.title + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loading(String title) {
            super(title, null);
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
        }

        @Override // com.robinhood.compose.common.checklist.ChecklistItem
        public String getTitle() {
            return this.title;
        }
    }

    /* compiled from: ChecklistItem.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/compose/common/checklist/ChecklistItem$Success;", "Lcom/robinhood/compose/common/checklist/ChecklistItem;", "title", "", "<init>", "(Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-compose-common_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Success extends ChecklistItem {
        public static final int $stable = 0;
        private final String title;

        public static /* synthetic */ Success copy$default(Success success, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = success.title;
            }
            return success.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final Success copy(String title) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new Success(title);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Intrinsics.areEqual(this.title, ((Success) other).title);
        }

        public int hashCode() {
            return this.title.hashCode();
        }

        public String toString() {
            return "Success(title=" + this.title + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(String title) {
            super(title, null);
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
        }

        @Override // com.robinhood.compose.common.checklist.ChecklistItem
        public String getTitle() {
            return this.title;
        }
    }

    /* compiled from: ChecklistItem.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J5\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/compose/common/checklist/ChecklistItem$Error;", "Lcom/robinhood/compose/common/checklist/ChecklistItem;", "title", "", "errorMessage", "Landroid/text/Spanned;", WiresInvalidAccountContentComposable.PrimaryButtonTag, "Lcom/robinhood/compose/common/checklist/ChecklistButton;", WiresInvalidAccountContentComposable.SecondaryButtonTag, "<init>", "(Ljava/lang/String;Landroid/text/Spanned;Lcom/robinhood/compose/common/checklist/ChecklistButton;Lcom/robinhood/compose/common/checklist/ChecklistButton;)V", "getTitle", "()Ljava/lang/String;", "getErrorMessage", "()Landroid/text/Spanned;", "getPrimaryButton", "()Lcom/robinhood/compose/common/checklist/ChecklistButton;", "getSecondaryButton", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-compose-common_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error extends ChecklistItem {
        public static final int $stable = 8;
        private final Spanned errorMessage;
        private final ChecklistButton primaryButton;
        private final ChecklistButton secondaryButton;
        private final String title;

        public static /* synthetic */ Error copy$default(Error error, String str, Spanned spanned, ChecklistButton checklistButton, ChecklistButton checklistButton2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = error.title;
            }
            if ((i & 2) != 0) {
                spanned = error.errorMessage;
            }
            if ((i & 4) != 0) {
                checklistButton = error.primaryButton;
            }
            if ((i & 8) != 0) {
                checklistButton2 = error.secondaryButton;
            }
            return error.copy(str, spanned, checklistButton, checklistButton2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final Spanned getErrorMessage() {
            return this.errorMessage;
        }

        /* renamed from: component3, reason: from getter */
        public final ChecklistButton getPrimaryButton() {
            return this.primaryButton;
        }

        /* renamed from: component4, reason: from getter */
        public final ChecklistButton getSecondaryButton() {
            return this.secondaryButton;
        }

        public final Error copy(String title, Spanned errorMessage, ChecklistButton primaryButton, ChecklistButton secondaryButton) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
            return new Error(title, errorMessage, primaryButton, secondaryButton);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return Intrinsics.areEqual(this.title, error.title) && Intrinsics.areEqual(this.errorMessage, error.errorMessage) && Intrinsics.areEqual(this.primaryButton, error.primaryButton) && Intrinsics.areEqual(this.secondaryButton, error.secondaryButton);
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            Spanned spanned = this.errorMessage;
            int iHashCode2 = (((iHashCode + (spanned == null ? 0 : spanned.hashCode())) * 31) + this.primaryButton.hashCode()) * 31;
            ChecklistButton checklistButton = this.secondaryButton;
            return iHashCode2 + (checklistButton != null ? checklistButton.hashCode() : 0);
        }

        public String toString() {
            String str = this.title;
            Spanned spanned = this.errorMessage;
            return "Error(title=" + str + ", errorMessage=" + ((Object) spanned) + ", primaryButton=" + this.primaryButton + ", secondaryButton=" + this.secondaryButton + ")";
        }

        @Override // com.robinhood.compose.common.checklist.ChecklistItem
        public String getTitle() {
            return this.title;
        }

        public final Spanned getErrorMessage() {
            return this.errorMessage;
        }

        public final ChecklistButton getPrimaryButton() {
            return this.primaryButton;
        }

        public final ChecklistButton getSecondaryButton() {
            return this.secondaryButton;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(String title, Spanned spanned, ChecklistButton primaryButton, ChecklistButton checklistButton) {
            super(title, null);
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
            this.title = title;
            this.errorMessage = spanned;
            this.primaryButton = primaryButton;
            this.secondaryButton = checklistButton;
        }
    }
}
