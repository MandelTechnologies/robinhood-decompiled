package com.robinhood.android.retirement.contributions;

import com.robinhood.android.models.retirement.api.contributions.KeypadChip;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Year;

/* compiled from: ContributionEditMode.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018JH\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0010J\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0010R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b'\u0010\u0014R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b)\u0010\u0016R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b+\u0010\u0018¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/retirement/contributions/ContributionEditModeState;", "", "", "formattedMoney", "", "Lcom/robinhood/android/models/retirement/api/contributions/KeypadChip;", "keypadChips", "", "showKeypadChips", "Ljava/math/BigDecimal;", "amount", "j$/time/Year", "taxYear", "<init>", "(Ljava/lang/String;Ljava/util/List;ZLjava/math/BigDecimal;Lj$/time/Year;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Z", "component4", "()Ljava/math/BigDecimal;", "component5", "()Lj$/time/Year;", "copy", "(Ljava/lang/String;Ljava/util/List;ZLjava/math/BigDecimal;Lj$/time/Year;)Lcom/robinhood/android/retirement/contributions/ContributionEditModeState;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFormattedMoney", "Ljava/util/List;", "getKeypadChips", "Z", "getShowKeypadChips", "Ljava/math/BigDecimal;", "getAmount", "Lj$/time/Year;", "getTaxYear", "lib-retirement-contributions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ContributionEditModeState {
    public static final int $stable = 8;
    private final BigDecimal amount;
    private final String formattedMoney;
    private final List<KeypadChip> keypadChips;
    private final boolean showKeypadChips;
    private final Year taxYear;

    public static /* synthetic */ ContributionEditModeState copy$default(ContributionEditModeState contributionEditModeState, String str, List list, boolean z, BigDecimal bigDecimal, Year year, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contributionEditModeState.formattedMoney;
        }
        if ((i & 2) != 0) {
            list = contributionEditModeState.keypadChips;
        }
        if ((i & 4) != 0) {
            z = contributionEditModeState.showKeypadChips;
        }
        if ((i & 8) != 0) {
            bigDecimal = contributionEditModeState.amount;
        }
        if ((i & 16) != 0) {
            year = contributionEditModeState.taxYear;
        }
        Year year2 = year;
        boolean z2 = z;
        return contributionEditModeState.copy(str, list, z2, bigDecimal, year2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFormattedMoney() {
        return this.formattedMoney;
    }

    public final List<KeypadChip> component2() {
        return this.keypadChips;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShowKeypadChips() {
        return this.showKeypadChips;
    }

    /* renamed from: component4, reason: from getter */
    public final BigDecimal getAmount() {
        return this.amount;
    }

    /* renamed from: component5, reason: from getter */
    public final Year getTaxYear() {
        return this.taxYear;
    }

    public final ContributionEditModeState copy(String formattedMoney, List<KeypadChip> keypadChips, boolean showKeypadChips, BigDecimal amount, Year taxYear) {
        Intrinsics.checkNotNullParameter(formattedMoney, "formattedMoney");
        Intrinsics.checkNotNullParameter(keypadChips, "keypadChips");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(taxYear, "taxYear");
        return new ContributionEditModeState(formattedMoney, keypadChips, showKeypadChips, amount, taxYear);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContributionEditModeState)) {
            return false;
        }
        ContributionEditModeState contributionEditModeState = (ContributionEditModeState) other;
        return Intrinsics.areEqual(this.formattedMoney, contributionEditModeState.formattedMoney) && Intrinsics.areEqual(this.keypadChips, contributionEditModeState.keypadChips) && this.showKeypadChips == contributionEditModeState.showKeypadChips && Intrinsics.areEqual(this.amount, contributionEditModeState.amount) && Intrinsics.areEqual(this.taxYear, contributionEditModeState.taxYear);
    }

    public int hashCode() {
        return (((((((this.formattedMoney.hashCode() * 31) + this.keypadChips.hashCode()) * 31) + Boolean.hashCode(this.showKeypadChips)) * 31) + this.amount.hashCode()) * 31) + this.taxYear.hashCode();
    }

    public String toString() {
        return "ContributionEditModeState(formattedMoney=" + this.formattedMoney + ", keypadChips=" + this.keypadChips + ", showKeypadChips=" + this.showKeypadChips + ", amount=" + this.amount + ", taxYear=" + this.taxYear + ")";
    }

    public ContributionEditModeState(String formattedMoney, List<KeypadChip> keypadChips, boolean z, BigDecimal amount, Year taxYear) {
        Intrinsics.checkNotNullParameter(formattedMoney, "formattedMoney");
        Intrinsics.checkNotNullParameter(keypadChips, "keypadChips");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(taxYear, "taxYear");
        this.formattedMoney = formattedMoney;
        this.keypadChips = keypadChips;
        this.showKeypadChips = z;
        this.amount = amount;
        this.taxYear = taxYear;
    }

    public final String getFormattedMoney() {
        return this.formattedMoney;
    }

    public final List<KeypadChip> getKeypadChips() {
        return this.keypadChips;
    }

    public final boolean getShowKeypadChips() {
        return this.showKeypadChips;
    }

    public final BigDecimal getAmount() {
        return this.amount;
    }

    public final Year getTaxYear() {
        return this.taxYear;
    }
}
