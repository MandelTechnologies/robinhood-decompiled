package com.robinhood.android.support.call;

import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import com.robinhood.models.serverdriven.p347db.RichText;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReviewCallDetailsViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/support/call/ReviewCallDetailsViewState;", "", "Loading", "Loaded", "Failed", "Lcom/robinhood/android/support/call/ReviewCallDetailsViewState$Failed;", "Lcom/robinhood/android/support/call/ReviewCallDetailsViewState$Loaded;", "Lcom/robinhood/android/support/call/ReviewCallDetailsViewState$Loading;", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public interface ReviewCallDetailsViewState {

    /* compiled from: ReviewCallDetailsViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/support/call/ReviewCallDetailsViewState$Loading;", "Lcom/robinhood/android/support/call/ReviewCallDetailsViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements ReviewCallDetailsViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return 278535083;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }

    /* compiled from: ReviewCallDetailsViewState.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J[\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\tHÆ\u0001J\u0013\u0010!\u001a\u00020\t2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0015R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/support/call/ReviewCallDetailsViewState$Loaded;", "Lcom/robinhood/android/support/call/ReviewCallDetailsViewState;", "title", "", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "Lcom/robinhood/models/serverdriven/db/RichText;", "description", "displayPhoneNumber", "isLoggedIn", "", "isRequestingSupport", "canEditPhoneNumber", "canRequestPhoneCall", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/serverdriven/db/RichText;Lcom/robinhood/models/serverdriven/db/RichText;Ljava/lang/String;ZZZZ)V", "getTitle", "()Ljava/lang/String;", "getDisclosure", "()Lcom/robinhood/models/serverdriven/db/RichText;", "getDescription", "getDisplayPhoneNumber", "()Z", "getCanEditPhoneNumber", "getCanRequestPhoneCall", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements ReviewCallDetailsViewState {
        public static final int $stable = 8;
        private final boolean canEditPhoneNumber;
        private final boolean canRequestPhoneCall;
        private final RichText description;
        private final RichText disclosure;
        private final String displayPhoneNumber;
        private final boolean isLoggedIn;
        private final boolean isRequestingSupport;
        private final String title;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, String str, RichText richText, RichText richText2, String str2, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = loaded.title;
            }
            if ((i & 2) != 0) {
                richText = loaded.disclosure;
            }
            if ((i & 4) != 0) {
                richText2 = loaded.description;
            }
            if ((i & 8) != 0) {
                str2 = loaded.displayPhoneNumber;
            }
            if ((i & 16) != 0) {
                z = loaded.isLoggedIn;
            }
            if ((i & 32) != 0) {
                z2 = loaded.isRequestingSupport;
            }
            if ((i & 64) != 0) {
                z3 = loaded.canEditPhoneNumber;
            }
            if ((i & 128) != 0) {
                z4 = loaded.canRequestPhoneCall;
            }
            boolean z5 = z3;
            boolean z6 = z4;
            boolean z7 = z;
            boolean z8 = z2;
            return loaded.copy(str, richText, richText2, str2, z7, z8, z5, z6);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final RichText getDisclosure() {
            return this.disclosure;
        }

        /* renamed from: component3, reason: from getter */
        public final RichText getDescription() {
            return this.description;
        }

        /* renamed from: component4, reason: from getter */
        public final String getDisplayPhoneNumber() {
            return this.displayPhoneNumber;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsLoggedIn() {
            return this.isLoggedIn;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getIsRequestingSupport() {
            return this.isRequestingSupport;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getCanEditPhoneNumber() {
            return this.canEditPhoneNumber;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getCanRequestPhoneCall() {
            return this.canRequestPhoneCall;
        }

        public final Loaded copy(String title, RichText disclosure, RichText description, String displayPhoneNumber, boolean isLoggedIn, boolean isRequestingSupport, boolean canEditPhoneNumber, boolean canRequestPhoneCall) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(disclosure, "disclosure");
            Intrinsics.checkNotNullParameter(description, "description");
            return new Loaded(title, disclosure, description, displayPhoneNumber, isLoggedIn, isRequestingSupport, canEditPhoneNumber, canRequestPhoneCall);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.title, loaded.title) && Intrinsics.areEqual(this.disclosure, loaded.disclosure) && Intrinsics.areEqual(this.description, loaded.description) && Intrinsics.areEqual(this.displayPhoneNumber, loaded.displayPhoneNumber) && this.isLoggedIn == loaded.isLoggedIn && this.isRequestingSupport == loaded.isRequestingSupport && this.canEditPhoneNumber == loaded.canEditPhoneNumber && this.canRequestPhoneCall == loaded.canRequestPhoneCall;
        }

        public int hashCode() {
            int iHashCode = ((((this.title.hashCode() * 31) + this.disclosure.hashCode()) * 31) + this.description.hashCode()) * 31;
            String str = this.displayPhoneNumber;
            return ((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isLoggedIn)) * 31) + Boolean.hashCode(this.isRequestingSupport)) * 31) + Boolean.hashCode(this.canEditPhoneNumber)) * 31) + Boolean.hashCode(this.canRequestPhoneCall);
        }

        public String toString() {
            return "Loaded(title=" + this.title + ", disclosure=" + this.disclosure + ", description=" + this.description + ", displayPhoneNumber=" + this.displayPhoneNumber + ", isLoggedIn=" + this.isLoggedIn + ", isRequestingSupport=" + this.isRequestingSupport + ", canEditPhoneNumber=" + this.canEditPhoneNumber + ", canRequestPhoneCall=" + this.canRequestPhoneCall + ")";
        }

        public Loaded(String title, RichText disclosure, RichText description, String str, boolean z, boolean z2, boolean z3, boolean z4) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(disclosure, "disclosure");
            Intrinsics.checkNotNullParameter(description, "description");
            this.title = title;
            this.disclosure = disclosure;
            this.description = description;
            this.displayPhoneNumber = str;
            this.isLoggedIn = z;
            this.isRequestingSupport = z2;
            this.canEditPhoneNumber = z3;
            this.canRequestPhoneCall = z4;
        }

        public final String getTitle() {
            return this.title;
        }

        public final RichText getDisclosure() {
            return this.disclosure;
        }

        public final RichText getDescription() {
            return this.description;
        }

        public final String getDisplayPhoneNumber() {
            return this.displayPhoneNumber;
        }

        public final boolean isLoggedIn() {
            return this.isLoggedIn;
        }

        public final boolean isRequestingSupport() {
            return this.isRequestingSupport;
        }

        public final boolean getCanEditPhoneNumber() {
            return this.canEditPhoneNumber;
        }

        public final boolean getCanRequestPhoneCall() {
            return this.canRequestPhoneCall;
        }
    }

    /* compiled from: ReviewCallDetailsViewState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/support/call/ReviewCallDetailsViewState$Failed;", "Lcom/robinhood/android/support/call/ReviewCallDetailsViewState;", "errorMessage", "", "<init>", "(Ljava/lang/String;)V", "getErrorMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Failed implements ReviewCallDetailsViewState {
        public static final int $stable = 0;
        private final String errorMessage;

        /* JADX WARN: Multi-variable type inference failed */
        public Failed() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Failed copy$default(Failed failed, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = failed.errorMessage;
            }
            return failed.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public final Failed copy(String errorMessage) {
            return new Failed(errorMessage);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Failed) && Intrinsics.areEqual(this.errorMessage, ((Failed) other).errorMessage);
        }

        public int hashCode() {
            String str = this.errorMessage;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Failed(errorMessage=" + this.errorMessage + ")";
        }

        public Failed(String str) {
            this.errorMessage = str;
        }

        public /* synthetic */ Failed(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        public final String getErrorMessage() {
            return this.errorMessage;
        }
    }
}
