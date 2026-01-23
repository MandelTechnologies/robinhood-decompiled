package com.robinhood.android.creditcard.p091ui.post.signup;

import com.robinhood.android.retirement.contracts.RetirementSignUp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PostSignUpAddToWaitlistActivityDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/post/signup/PostSignUpAddToWaitlistActivityEvent;", "", "Error", "AddToWaitlist", "Lcom/robinhood/android/creditcard/ui/post/signup/PostSignUpAddToWaitlistActivityEvent$AddToWaitlist;", "Lcom/robinhood/android/creditcard/ui/post/signup/PostSignUpAddToWaitlistActivityEvent$Error;", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.creditcard.ui.post.signup.PostSignUpAddToWaitlistActivityEvent, reason: use source file name */
/* loaded from: classes2.dex */
public interface PostSignUpAddToWaitlistActivityDuxo2 {

    /* compiled from: PostSignUpAddToWaitlistActivityDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/post/signup/PostSignUpAddToWaitlistActivityEvent$Error;", "Lcom/robinhood/android/creditcard/ui/post/signup/PostSignUpAddToWaitlistActivityEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.creditcard.ui.post.signup.PostSignUpAddToWaitlistActivityEvent$Error */
    public static final /* data */ class Error implements PostSignUpAddToWaitlistActivityDuxo2 {
        public static final int $stable = 0;
        public static final Error INSTANCE = new Error();

        public boolean equals(Object other) {
            return this == other || (other instanceof Error);
        }

        public int hashCode() {
            return 115529119;
        }

        public String toString() {
            return "Error";
        }

        private Error() {
        }
    }

    /* compiled from: PostSignUpAddToWaitlistActivityDuxo.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/post/signup/PostSignUpAddToWaitlistActivityEvent$AddToWaitlist;", "Lcom/robinhood/android/creditcard/ui/post/signup/PostSignUpAddToWaitlistActivityEvent;", "redirectKey", "Lcom/robinhood/android/retirement/contracts/RetirementSignUp;", "shouldLaunchTaxMatchPromoForResurrectedUser", "", "<init>", "(Lcom/robinhood/android/retirement/contracts/RetirementSignUp;Z)V", "getRedirectKey", "()Lcom/robinhood/android/retirement/contracts/RetirementSignUp;", "getShouldLaunchTaxMatchPromoForResurrectedUser", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.creditcard.ui.post.signup.PostSignUpAddToWaitlistActivityEvent$AddToWaitlist, reason: from toString */
    public static final /* data */ class AddToWaitlist implements PostSignUpAddToWaitlistActivityDuxo2 {
        public static final int $stable = 8;
        private final RetirementSignUp redirectKey;
        private final boolean shouldLaunchTaxMatchPromoForResurrectedUser;

        public static /* synthetic */ AddToWaitlist copy$default(AddToWaitlist addToWaitlist, RetirementSignUp retirementSignUp, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                retirementSignUp = addToWaitlist.redirectKey;
            }
            if ((i & 2) != 0) {
                z = addToWaitlist.shouldLaunchTaxMatchPromoForResurrectedUser;
            }
            return addToWaitlist.copy(retirementSignUp, z);
        }

        /* renamed from: component1, reason: from getter */
        public final RetirementSignUp getRedirectKey() {
            return this.redirectKey;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getShouldLaunchTaxMatchPromoForResurrectedUser() {
            return this.shouldLaunchTaxMatchPromoForResurrectedUser;
        }

        public final AddToWaitlist copy(RetirementSignUp redirectKey, boolean shouldLaunchTaxMatchPromoForResurrectedUser) {
            Intrinsics.checkNotNullParameter(redirectKey, "redirectKey");
            return new AddToWaitlist(redirectKey, shouldLaunchTaxMatchPromoForResurrectedUser);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AddToWaitlist)) {
                return false;
            }
            AddToWaitlist addToWaitlist = (AddToWaitlist) other;
            return Intrinsics.areEqual(this.redirectKey, addToWaitlist.redirectKey) && this.shouldLaunchTaxMatchPromoForResurrectedUser == addToWaitlist.shouldLaunchTaxMatchPromoForResurrectedUser;
        }

        public int hashCode() {
            return (this.redirectKey.hashCode() * 31) + Boolean.hashCode(this.shouldLaunchTaxMatchPromoForResurrectedUser);
        }

        public String toString() {
            return "AddToWaitlist(redirectKey=" + this.redirectKey + ", shouldLaunchTaxMatchPromoForResurrectedUser=" + this.shouldLaunchTaxMatchPromoForResurrectedUser + ")";
        }

        public AddToWaitlist(RetirementSignUp redirectKey, boolean z) {
            Intrinsics.checkNotNullParameter(redirectKey, "redirectKey");
            this.redirectKey = redirectKey;
            this.shouldLaunchTaxMatchPromoForResurrectedUser = z;
        }

        public final RetirementSignUp getRedirectKey() {
            return this.redirectKey;
        }

        public final boolean getShouldLaunchTaxMatchPromoForResurrectedUser() {
            return this.shouldLaunchTaxMatchPromoForResurrectedUser;
        }
    }
}
