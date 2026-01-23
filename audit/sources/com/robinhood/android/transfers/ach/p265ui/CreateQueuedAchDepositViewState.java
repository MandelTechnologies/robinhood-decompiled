package com.robinhood.android.transfers.ach.p265ui;

import com.robinhood.android.directdeposit.p101ui.prefilled.partial.EditDepositAmountActivity;
import com.robinhood.android.goldearningspotential.microgram.GoldEarningsCalculatorUiModel;
import com.robinhood.android.goldearningspotential.microgram.GoldEarningsDisclosureUiModel;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreateQueuedAchDepositViewState.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003JM\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010 \u001a\u00020\u00032\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0010¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/CreateQueuedAchDepositViewState;", "", "goldPotentialCalculatorEnabled", "", EditDepositAmountActivity.EXTRA_DEPOSIT_AMOUNT, "Ljava/math/BigDecimal;", "amountHint", "", "goldEarningsCalculatorUiModel", "Lcom/robinhood/android/goldearningspotential/microgram/GoldEarningsCalculatorUiModel;", "goldEarningsDisclosureUiModel", "Lcom/robinhood/android/goldearningspotential/microgram/GoldEarningsDisclosureUiModel;", "isLoading", "<init>", "(ZLjava/math/BigDecimal;Ljava/lang/String;Lcom/robinhood/android/goldearningspotential/microgram/GoldEarningsCalculatorUiModel;Lcom/robinhood/android/goldearningspotential/microgram/GoldEarningsDisclosureUiModel;Z)V", "getGoldPotentialCalculatorEnabled", "()Z", "getDepositAmount", "()Ljava/math/BigDecimal;", "getAmountHint", "()Ljava/lang/String;", "getGoldEarningsCalculatorUiModel", "()Lcom/robinhood/android/goldearningspotential/microgram/GoldEarningsCalculatorUiModel;", "getGoldEarningsDisclosureUiModel", "()Lcom/robinhood/android/goldearningspotential/microgram/GoldEarningsDisclosureUiModel;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class CreateQueuedAchDepositViewState {
    public static final int $stable = 8;
    private final String amountHint;
    private final BigDecimal depositAmount;
    private final GoldEarningsCalculatorUiModel goldEarningsCalculatorUiModel;
    private final GoldEarningsDisclosureUiModel goldEarningsDisclosureUiModel;
    private final boolean goldPotentialCalculatorEnabled;
    private final boolean isLoading;

    public CreateQueuedAchDepositViewState() {
        this(false, null, null, null, null, false, 63, null);
    }

    public static /* synthetic */ CreateQueuedAchDepositViewState copy$default(CreateQueuedAchDepositViewState createQueuedAchDepositViewState, boolean z, BigDecimal bigDecimal, String str, GoldEarningsCalculatorUiModel goldEarningsCalculatorUiModel, GoldEarningsDisclosureUiModel goldEarningsDisclosureUiModel, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = createQueuedAchDepositViewState.goldPotentialCalculatorEnabled;
        }
        if ((i & 2) != 0) {
            bigDecimal = createQueuedAchDepositViewState.depositAmount;
        }
        if ((i & 4) != 0) {
            str = createQueuedAchDepositViewState.amountHint;
        }
        if ((i & 8) != 0) {
            goldEarningsCalculatorUiModel = createQueuedAchDepositViewState.goldEarningsCalculatorUiModel;
        }
        if ((i & 16) != 0) {
            goldEarningsDisclosureUiModel = createQueuedAchDepositViewState.goldEarningsDisclosureUiModel;
        }
        if ((i & 32) != 0) {
            z2 = createQueuedAchDepositViewState.isLoading;
        }
        GoldEarningsDisclosureUiModel goldEarningsDisclosureUiModel2 = goldEarningsDisclosureUiModel;
        boolean z3 = z2;
        return createQueuedAchDepositViewState.copy(z, bigDecimal, str, goldEarningsCalculatorUiModel, goldEarningsDisclosureUiModel2, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getGoldPotentialCalculatorEnabled() {
        return this.goldPotentialCalculatorEnabled;
    }

    /* renamed from: component2, reason: from getter */
    public final BigDecimal getDepositAmount() {
        return this.depositAmount;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAmountHint() {
        return this.amountHint;
    }

    /* renamed from: component4, reason: from getter */
    public final GoldEarningsCalculatorUiModel getGoldEarningsCalculatorUiModel() {
        return this.goldEarningsCalculatorUiModel;
    }

    /* renamed from: component5, reason: from getter */
    public final GoldEarningsDisclosureUiModel getGoldEarningsDisclosureUiModel() {
        return this.goldEarningsDisclosureUiModel;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final CreateQueuedAchDepositViewState copy(boolean goldPotentialCalculatorEnabled, BigDecimal depositAmount, String amountHint, GoldEarningsCalculatorUiModel goldEarningsCalculatorUiModel, GoldEarningsDisclosureUiModel goldEarningsDisclosureUiModel, boolean isLoading) {
        return new CreateQueuedAchDepositViewState(goldPotentialCalculatorEnabled, depositAmount, amountHint, goldEarningsCalculatorUiModel, goldEarningsDisclosureUiModel, isLoading);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateQueuedAchDepositViewState)) {
            return false;
        }
        CreateQueuedAchDepositViewState createQueuedAchDepositViewState = (CreateQueuedAchDepositViewState) other;
        return this.goldPotentialCalculatorEnabled == createQueuedAchDepositViewState.goldPotentialCalculatorEnabled && Intrinsics.areEqual(this.depositAmount, createQueuedAchDepositViewState.depositAmount) && Intrinsics.areEqual(this.amountHint, createQueuedAchDepositViewState.amountHint) && Intrinsics.areEqual(this.goldEarningsCalculatorUiModel, createQueuedAchDepositViewState.goldEarningsCalculatorUiModel) && Intrinsics.areEqual(this.goldEarningsDisclosureUiModel, createQueuedAchDepositViewState.goldEarningsDisclosureUiModel) && this.isLoading == createQueuedAchDepositViewState.isLoading;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.goldPotentialCalculatorEnabled) * 31;
        BigDecimal bigDecimal = this.depositAmount;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str = this.amountHint;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        GoldEarningsCalculatorUiModel goldEarningsCalculatorUiModel = this.goldEarningsCalculatorUiModel;
        int iHashCode4 = (iHashCode3 + (goldEarningsCalculatorUiModel == null ? 0 : goldEarningsCalculatorUiModel.hashCode())) * 31;
        GoldEarningsDisclosureUiModel goldEarningsDisclosureUiModel = this.goldEarningsDisclosureUiModel;
        return ((iHashCode4 + (goldEarningsDisclosureUiModel != null ? goldEarningsDisclosureUiModel.hashCode() : 0)) * 31) + Boolean.hashCode(this.isLoading);
    }

    public String toString() {
        return "CreateQueuedAchDepositViewState(goldPotentialCalculatorEnabled=" + this.goldPotentialCalculatorEnabled + ", depositAmount=" + this.depositAmount + ", amountHint=" + this.amountHint + ", goldEarningsCalculatorUiModel=" + this.goldEarningsCalculatorUiModel + ", goldEarningsDisclosureUiModel=" + this.goldEarningsDisclosureUiModel + ", isLoading=" + this.isLoading + ")";
    }

    public CreateQueuedAchDepositViewState(boolean z, BigDecimal bigDecimal, String str, GoldEarningsCalculatorUiModel goldEarningsCalculatorUiModel, GoldEarningsDisclosureUiModel goldEarningsDisclosureUiModel, boolean z2) {
        this.goldPotentialCalculatorEnabled = z;
        this.depositAmount = bigDecimal;
        this.amountHint = str;
        this.goldEarningsCalculatorUiModel = goldEarningsCalculatorUiModel;
        this.goldEarningsDisclosureUiModel = goldEarningsDisclosureUiModel;
        this.isLoading = z2;
    }

    public /* synthetic */ CreateQueuedAchDepositViewState(boolean z, BigDecimal bigDecimal, String str, GoldEarningsCalculatorUiModel goldEarningsCalculatorUiModel, GoldEarningsDisclosureUiModel goldEarningsDisclosureUiModel, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : bigDecimal, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : goldEarningsCalculatorUiModel, (i & 16) != 0 ? null : goldEarningsDisclosureUiModel, (i & 32) != 0 ? false : z2);
    }

    public final boolean getGoldPotentialCalculatorEnabled() {
        return this.goldPotentialCalculatorEnabled;
    }

    public final BigDecimal getDepositAmount() {
        return this.depositAmount;
    }

    public final String getAmountHint() {
        return this.amountHint;
    }

    public final GoldEarningsCalculatorUiModel getGoldEarningsCalculatorUiModel() {
        return this.goldEarningsCalculatorUiModel;
    }

    public final GoldEarningsDisclosureUiModel getGoldEarningsDisclosureUiModel() {
        return this.goldEarningsDisclosureUiModel;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }
}
