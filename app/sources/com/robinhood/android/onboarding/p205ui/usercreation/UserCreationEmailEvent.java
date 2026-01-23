package com.robinhood.android.onboarding.p205ui.usercreation;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UserCreationEmailEvent.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationEmailEvent;", "", "<init>", "()V", "SuggestedEmail", "Finish", "GBEmailWaitlistBottomSheet", "GBOnboardingWaitlist", "PromotionEmailBottomSheet", "DuplicateEmailError", "GenericError", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationEmailEvent$DuplicateEmailError;", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationEmailEvent$Finish;", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationEmailEvent$GBEmailWaitlistBottomSheet;", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationEmailEvent$GBOnboardingWaitlist;", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationEmailEvent$GenericError;", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationEmailEvent$PromotionEmailBottomSheet;", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationEmailEvent$SuggestedEmail;", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public abstract class UserCreationEmailEvent {
    public static final int $stable = 0;

    public /* synthetic */ UserCreationEmailEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private UserCreationEmailEvent() {
    }

    /* compiled from: UserCreationEmailEvent.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationEmailEvent$SuggestedEmail;", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationEmailEvent;", "email", "", "suggestedEmail", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "getSuggestedEmail", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SuggestedEmail extends UserCreationEmailEvent {
        public static final int $stable = 0;
        private final String email;
        private final String suggestedEmail;

        public static /* synthetic */ SuggestedEmail copy$default(SuggestedEmail suggestedEmail, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = suggestedEmail.email;
            }
            if ((i & 2) != 0) {
                str2 = suggestedEmail.suggestedEmail;
            }
            return suggestedEmail.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSuggestedEmail() {
            return this.suggestedEmail;
        }

        public final SuggestedEmail copy(String email, String suggestedEmail) {
            Intrinsics.checkNotNullParameter(email, "email");
            return new SuggestedEmail(email, suggestedEmail);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SuggestedEmail)) {
                return false;
            }
            SuggestedEmail suggestedEmail = (SuggestedEmail) other;
            return Intrinsics.areEqual(this.email, suggestedEmail.email) && Intrinsics.areEqual(this.suggestedEmail, suggestedEmail.suggestedEmail);
        }

        public int hashCode() {
            int iHashCode = this.email.hashCode() * 31;
            String str = this.suggestedEmail;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "SuggestedEmail(email=" + this.email + ", suggestedEmail=" + this.suggestedEmail + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SuggestedEmail(String email, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(email, "email");
            this.email = email;
            this.suggestedEmail = str;
        }

        public final String getEmail() {
            return this.email;
        }

        public final String getSuggestedEmail() {
            return this.suggestedEmail;
        }
    }

    /* compiled from: UserCreationEmailEvent.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationEmailEvent$Finish;", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationEmailEvent;", "email", "", "isFromCcWaitlist", "", "<init>", "(Ljava/lang/String;Z)V", "getEmail", "()Ljava/lang/String;", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Finish extends UserCreationEmailEvent {
        public static final int $stable = 0;
        private final String email;
        private final boolean isFromCcWaitlist;

        public static /* synthetic */ Finish copy$default(Finish finish, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = finish.email;
            }
            if ((i & 2) != 0) {
                z = finish.isFromCcWaitlist;
            }
            return finish.copy(str, z);
        }

        /* renamed from: component1, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsFromCcWaitlist() {
            return this.isFromCcWaitlist;
        }

        public final Finish copy(String email, boolean isFromCcWaitlist) {
            Intrinsics.checkNotNullParameter(email, "email");
            return new Finish(email, isFromCcWaitlist);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Finish)) {
                return false;
            }
            Finish finish = (Finish) other;
            return Intrinsics.areEqual(this.email, finish.email) && this.isFromCcWaitlist == finish.isFromCcWaitlist;
        }

        public int hashCode() {
            return (this.email.hashCode() * 31) + Boolean.hashCode(this.isFromCcWaitlist);
        }

        public String toString() {
            return "Finish(email=" + this.email + ", isFromCcWaitlist=" + this.isFromCcWaitlist + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Finish(String email, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(email, "email");
            this.email = email;
            this.isFromCcWaitlist = z;
        }

        public /* synthetic */ Finish(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? false : z);
        }

        public final String getEmail() {
            return this.email;
        }

        public final boolean isFromCcWaitlist() {
            return this.isFromCcWaitlist;
        }
    }

    /* compiled from: UserCreationEmailEvent.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationEmailEvent$GBEmailWaitlistBottomSheet;", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationEmailEvent;", "email", "", "waitlistWebUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "getWaitlistWebUrl", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class GBEmailWaitlistBottomSheet extends UserCreationEmailEvent {
        public static final int $stable = 0;
        private final String email;
        private final String waitlistWebUrl;

        public static /* synthetic */ GBEmailWaitlistBottomSheet copy$default(GBEmailWaitlistBottomSheet gBEmailWaitlistBottomSheet, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = gBEmailWaitlistBottomSheet.email;
            }
            if ((i & 2) != 0) {
                str2 = gBEmailWaitlistBottomSheet.waitlistWebUrl;
            }
            return gBEmailWaitlistBottomSheet.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        /* renamed from: component2, reason: from getter */
        public final String getWaitlistWebUrl() {
            return this.waitlistWebUrl;
        }

        public final GBEmailWaitlistBottomSheet copy(String email, String waitlistWebUrl) {
            Intrinsics.checkNotNullParameter(email, "email");
            return new GBEmailWaitlistBottomSheet(email, waitlistWebUrl);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GBEmailWaitlistBottomSheet)) {
                return false;
            }
            GBEmailWaitlistBottomSheet gBEmailWaitlistBottomSheet = (GBEmailWaitlistBottomSheet) other;
            return Intrinsics.areEqual(this.email, gBEmailWaitlistBottomSheet.email) && Intrinsics.areEqual(this.waitlistWebUrl, gBEmailWaitlistBottomSheet.waitlistWebUrl);
        }

        public int hashCode() {
            int iHashCode = this.email.hashCode() * 31;
            String str = this.waitlistWebUrl;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "GBEmailWaitlistBottomSheet(email=" + this.email + ", waitlistWebUrl=" + this.waitlistWebUrl + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GBEmailWaitlistBottomSheet(String email, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(email, "email");
            this.email = email;
            this.waitlistWebUrl = str;
        }

        public final String getEmail() {
            return this.email;
        }

        public final String getWaitlistWebUrl() {
            return this.waitlistWebUrl;
        }
    }

    /* compiled from: UserCreationEmailEvent.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationEmailEvent$GBOnboardingWaitlist;", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationEmailEvent;", "waitlistWebUrl", "", "<init>", "(Ljava/lang/String;)V", "getWaitlistWebUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class GBOnboardingWaitlist extends UserCreationEmailEvent {
        public static final int $stable = 0;
        private final String waitlistWebUrl;

        public static /* synthetic */ GBOnboardingWaitlist copy$default(GBOnboardingWaitlist gBOnboardingWaitlist, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = gBOnboardingWaitlist.waitlistWebUrl;
            }
            return gBOnboardingWaitlist.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getWaitlistWebUrl() {
            return this.waitlistWebUrl;
        }

        public final GBOnboardingWaitlist copy(String waitlistWebUrl) {
            Intrinsics.checkNotNullParameter(waitlistWebUrl, "waitlistWebUrl");
            return new GBOnboardingWaitlist(waitlistWebUrl);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof GBOnboardingWaitlist) && Intrinsics.areEqual(this.waitlistWebUrl, ((GBOnboardingWaitlist) other).waitlistWebUrl);
        }

        public int hashCode() {
            return this.waitlistWebUrl.hashCode();
        }

        public String toString() {
            return "GBOnboardingWaitlist(waitlistWebUrl=" + this.waitlistWebUrl + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GBOnboardingWaitlist(String waitlistWebUrl) {
            super(null);
            Intrinsics.checkNotNullParameter(waitlistWebUrl, "waitlistWebUrl");
            this.waitlistWebUrl = waitlistWebUrl;
        }

        public final String getWaitlistWebUrl() {
            return this.waitlistWebUrl;
        }
    }

    /* compiled from: UserCreationEmailEvent.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationEmailEvent$PromotionEmailBottomSheet;", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationEmailEvent;", "email", "", "<init>", "(Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PromotionEmailBottomSheet extends UserCreationEmailEvent {
        public static final int $stable = 0;
        private final String email;

        public static /* synthetic */ PromotionEmailBottomSheet copy$default(PromotionEmailBottomSheet promotionEmailBottomSheet, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = promotionEmailBottomSheet.email;
            }
            return promotionEmailBottomSheet.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        public final PromotionEmailBottomSheet copy(String email) {
            Intrinsics.checkNotNullParameter(email, "email");
            return new PromotionEmailBottomSheet(email);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PromotionEmailBottomSheet) && Intrinsics.areEqual(this.email, ((PromotionEmailBottomSheet) other).email);
        }

        public int hashCode() {
            return this.email.hashCode();
        }

        public String toString() {
            return "PromotionEmailBottomSheet(email=" + this.email + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PromotionEmailBottomSheet(String email) {
            super(null);
            Intrinsics.checkNotNullParameter(email, "email");
            this.email = email;
        }

        public final String getEmail() {
            return this.email;
        }
    }

    /* compiled from: UserCreationEmailEvent.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationEmailEvent$DuplicateEmailError;", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationEmailEvent;", "email", "", "<init>", "(Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class DuplicateEmailError extends UserCreationEmailEvent {
        public static final int $stable = 0;
        private final String email;

        public static /* synthetic */ DuplicateEmailError copy$default(DuplicateEmailError duplicateEmailError, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = duplicateEmailError.email;
            }
            return duplicateEmailError.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        public final DuplicateEmailError copy(String email) {
            Intrinsics.checkNotNullParameter(email, "email");
            return new DuplicateEmailError(email);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DuplicateEmailError) && Intrinsics.areEqual(this.email, ((DuplicateEmailError) other).email);
        }

        public int hashCode() {
            return this.email.hashCode();
        }

        public String toString() {
            return "DuplicateEmailError(email=" + this.email + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DuplicateEmailError(String email) {
            super(null);
            Intrinsics.checkNotNullParameter(email, "email");
            this.email = email;
        }

        public final String getEmail() {
            return this.email;
        }
    }

    /* compiled from: UserCreationEmailEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationEmailEvent$GenericError;", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationEmailEvent;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class GenericError extends UserCreationEmailEvent {
        public static final int $stable = 8;
        private final Throwable throwable;

        public static /* synthetic */ GenericError copy$default(GenericError genericError, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = genericError.throwable;
            }
            return genericError.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        public final GenericError copy(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return new GenericError(throwable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof GenericError) && Intrinsics.areEqual(this.throwable, ((GenericError) other).throwable);
        }

        public int hashCode() {
            return this.throwable.hashCode();
        }

        public String toString() {
            return "GenericError(throwable=" + this.throwable + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GenericError(Throwable throwable) {
            super(null);
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }
    }
}
