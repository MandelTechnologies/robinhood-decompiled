package com.robinhood.android.onboarding.p205ui.usercreation;

import com.robinhood.iso.countrycode.CountryCode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UserCreationState.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\b\tB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationEvent;", "", "countryCode", "Lcom/robinhood/iso/countrycode/CountryCode;", "<init>", "(Lcom/robinhood/iso/countrycode/CountryCode;)V", "getCountryCode", "()Lcom/robinhood/iso/countrycode/CountryCode;", "ShowEmailInput", "ShowEmailInputWithRewardsTakeover", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationEvent$ShowEmailInput;", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationEvent$ShowEmailInputWithRewardsTakeover;", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.onboarding.ui.usercreation.UserCreationEvent, reason: use source file name */
/* loaded from: classes10.dex */
public abstract class UserCreationState {
    public static final int $stable = 8;
    private final CountryCode countryCode;

    public /* synthetic */ UserCreationState(CountryCode countryCode, DefaultConstructorMarker defaultConstructorMarker) {
        this(countryCode);
    }

    private UserCreationState(CountryCode countryCode) {
        this.countryCode = countryCode;
    }

    public CountryCode getCountryCode() {
        return this.countryCode;
    }

    /* compiled from: UserCreationState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationEvent$ShowEmailInput;", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationEvent;", "countryCode", "Lcom/robinhood/iso/countrycode/CountryCode;", "<init>", "(Lcom/robinhood/iso/countrycode/CountryCode;)V", "getCountryCode", "()Lcom/robinhood/iso/countrycode/CountryCode;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.onboarding.ui.usercreation.UserCreationEvent$ShowEmailInput, reason: from toString */
    public static final /* data */ class ShowEmailInput extends UserCreationState {
        public static final int $stable = 8;
        private final CountryCode countryCode;

        public static /* synthetic */ ShowEmailInput copy$default(ShowEmailInput showEmailInput, CountryCode countryCode, int i, Object obj) {
            if ((i & 1) != 0) {
                countryCode = showEmailInput.countryCode;
            }
            return showEmailInput.copy(countryCode);
        }

        /* renamed from: component1, reason: from getter */
        public final CountryCode getCountryCode() {
            return this.countryCode;
        }

        public final ShowEmailInput copy(CountryCode countryCode) {
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            return new ShowEmailInput(countryCode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowEmailInput) && Intrinsics.areEqual(this.countryCode, ((ShowEmailInput) other).countryCode);
        }

        public int hashCode() {
            return this.countryCode.hashCode();
        }

        public String toString() {
            return "ShowEmailInput(countryCode=" + this.countryCode + ")";
        }

        @Override // com.robinhood.android.onboarding.p205ui.usercreation.UserCreationState
        public CountryCode getCountryCode() {
            return this.countryCode;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowEmailInput(CountryCode countryCode) {
            super(countryCode, null);
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            this.countryCode = countryCode;
        }
    }

    /* compiled from: UserCreationState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationEvent$ShowEmailInputWithRewardsTakeover;", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationEvent;", "countryCode", "Lcom/robinhood/iso/countrycode/CountryCode;", "<init>", "(Lcom/robinhood/iso/countrycode/CountryCode;)V", "getCountryCode", "()Lcom/robinhood/iso/countrycode/CountryCode;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.onboarding.ui.usercreation.UserCreationEvent$ShowEmailInputWithRewardsTakeover, reason: from toString */
    public static final /* data */ class ShowEmailInputWithRewardsTakeover extends UserCreationState {
        public static final int $stable = 8;
        private final CountryCode countryCode;

        public static /* synthetic */ ShowEmailInputWithRewardsTakeover copy$default(ShowEmailInputWithRewardsTakeover showEmailInputWithRewardsTakeover, CountryCode countryCode, int i, Object obj) {
            if ((i & 1) != 0) {
                countryCode = showEmailInputWithRewardsTakeover.countryCode;
            }
            return showEmailInputWithRewardsTakeover.copy(countryCode);
        }

        /* renamed from: component1, reason: from getter */
        public final CountryCode getCountryCode() {
            return this.countryCode;
        }

        public final ShowEmailInputWithRewardsTakeover copy(CountryCode countryCode) {
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            return new ShowEmailInputWithRewardsTakeover(countryCode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowEmailInputWithRewardsTakeover) && Intrinsics.areEqual(this.countryCode, ((ShowEmailInputWithRewardsTakeover) other).countryCode);
        }

        public int hashCode() {
            return this.countryCode.hashCode();
        }

        public String toString() {
            return "ShowEmailInputWithRewardsTakeover(countryCode=" + this.countryCode + ")";
        }

        @Override // com.robinhood.android.onboarding.p205ui.usercreation.UserCreationState
        public CountryCode getCountryCode() {
            return this.countryCode;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowEmailInputWithRewardsTakeover(CountryCode countryCode) {
            super(countryCode, null);
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            this.countryCode = countryCode;
        }
    }
}
