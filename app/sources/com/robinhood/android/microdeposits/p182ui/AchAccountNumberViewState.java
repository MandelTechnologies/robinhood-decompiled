package com.robinhood.android.microdeposits.p182ui;

import android.content.res.Resources;
import com.robinhood.android.common.util.Validation;
import com.robinhood.android.microdeposits.C21805R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AchAccountNumberViewState.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÂ\u0003J-\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\rHÖ\u0001J\t\u0010 \u001a\u00020\u0012HÖ\u0001R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\nR\u0012\u0010\u000b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\nR\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0015\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\u0017\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/microdeposits/ui/AchAccountNumberViewState;", "", "accountNumber", "", "bankName", "verifyAccountNumber", "<init>", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V", "isAccountNumberValid", "", "Ljava/lang/Boolean;", "isVerifyAccountNumberValid", "accountNumberLayoutErrorTextRes", "", "getAccountNumberLayoutErrorTextRes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAdditionalNumberLayoutHint", "", "resources", "Landroid/content/res/Resources;", "verifyAccountNumberLayoutErrorTextRes", "getVerifyAccountNumberLayoutErrorTextRes", "isFabVisible", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "feature-microdeposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final /* data */ class AchAccountNumberViewState {
    public static final int $stable = 8;
    private final CharSequence accountNumber;
    private final Integer accountNumberLayoutErrorTextRes;
    private final CharSequence bankName;
    private final Boolean isAccountNumberValid;
    private final boolean isFabVisible;
    private final Boolean isVerifyAccountNumberValid;
    private final CharSequence verifyAccountNumber;
    private final Integer verifyAccountNumberLayoutErrorTextRes;

    public AchAccountNumberViewState() {
        this(null, null, null, 7, null);
    }

    /* renamed from: component1, reason: from getter */
    private final CharSequence getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component2, reason: from getter */
    private final CharSequence getBankName() {
        return this.bankName;
    }

    /* renamed from: component3, reason: from getter */
    private final CharSequence getVerifyAccountNumber() {
        return this.verifyAccountNumber;
    }

    public static /* synthetic */ AchAccountNumberViewState copy$default(AchAccountNumberViewState achAccountNumberViewState, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, Object obj) {
        if ((i & 1) != 0) {
            charSequence = achAccountNumberViewState.accountNumber;
        }
        if ((i & 2) != 0) {
            charSequence2 = achAccountNumberViewState.bankName;
        }
        if ((i & 4) != 0) {
            charSequence3 = achAccountNumberViewState.verifyAccountNumber;
        }
        return achAccountNumberViewState.copy(charSequence, charSequence2, charSequence3);
    }

    public final AchAccountNumberViewState copy(CharSequence accountNumber, CharSequence bankName, CharSequence verifyAccountNumber) {
        return new AchAccountNumberViewState(accountNumber, bankName, verifyAccountNumber);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AchAccountNumberViewState)) {
            return false;
        }
        AchAccountNumberViewState achAccountNumberViewState = (AchAccountNumberViewState) other;
        return Intrinsics.areEqual(this.accountNumber, achAccountNumberViewState.accountNumber) && Intrinsics.areEqual(this.bankName, achAccountNumberViewState.bankName) && Intrinsics.areEqual(this.verifyAccountNumber, achAccountNumberViewState.verifyAccountNumber);
    }

    public int hashCode() {
        CharSequence charSequence = this.accountNumber;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.bankName;
        int iHashCode2 = (iHashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.verifyAccountNumber;
        return iHashCode2 + (charSequence3 != null ? charSequence3.hashCode() : 0);
    }

    public String toString() {
        return "AchAccountNumberViewState(accountNumber=" + ((Object) this.accountNumber) + ", bankName=" + ((Object) this.bankName) + ", verifyAccountNumber=" + ((Object) this.verifyAccountNumber) + ")";
    }

    public AchAccountNumberViewState(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        Boolean boolValueOf;
        this.accountNumber = charSequence;
        this.bankName = charSequence2;
        this.verifyAccountNumber = charSequence3;
        Boolean boolValueOf2 = charSequence != null ? Boolean.valueOf(Validation.INSTANCE.isAchAccountNumberValid(charSequence)) : null;
        this.isAccountNumberValid = boolValueOf2;
        if (charSequence3 != null) {
            boolValueOf = Boolean.valueOf(Intrinsics.areEqual(charSequence != null ? charSequence.toString() : null, charSequence3.toString()));
        } else {
            boolValueOf = null;
        }
        this.isVerifyAccountNumberValid = boolValueOf;
        Boolean bool = Boolean.FALSE;
        this.accountNumberLayoutErrorTextRes = Intrinsics.areEqual(boolValueOf2, bool) ? Integer.valueOf(C21805R.string.ach_create_account_number_invalid) : null;
        this.verifyAccountNumberLayoutErrorTextRes = Intrinsics.areEqual(boolValueOf, bool) ? Integer.valueOf(C21805R.string.ach_create_account_number_mismatch) : null;
        Boolean bool2 = Boolean.TRUE;
        this.isFabVisible = Intrinsics.areEqual(boolValueOf2, bool2) && Intrinsics.areEqual(boolValueOf, bool2);
    }

    public /* synthetic */ AchAccountNumberViewState(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : charSequence, (i & 2) != 0 ? null : charSequence2, (i & 4) != 0 ? null : charSequence3);
    }

    public final Integer getAccountNumberLayoutErrorTextRes() {
        return this.accountNumberLayoutErrorTextRes;
    }

    public final String getAdditionalNumberLayoutHint(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        CharSequence charSequence = this.bankName;
        if (charSequence != null) {
            return resources.getString(C21805R.string.ach_create_account_number_hint_with_bank, charSequence);
        }
        return null;
    }

    public final Integer getVerifyAccountNumberLayoutErrorTextRes() {
        return this.verifyAccountNumberLayoutErrorTextRes;
    }

    /* renamed from: isFabVisible, reason: from getter */
    public final boolean getIsFabVisible() {
        return this.isFabVisible;
    }
}
