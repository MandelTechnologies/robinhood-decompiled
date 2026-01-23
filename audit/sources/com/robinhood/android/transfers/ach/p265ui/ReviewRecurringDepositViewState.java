package com.robinhood.android.transfers.ach.p265ui;

import android.content.res.Resources;
import com.robinhood.android.ach.format.AchRelationships;
import com.robinhood.android.banking.lib.C9631R;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.transfers.lib.C30383R;
import com.robinhood.models.api.ApiAutomaticDeposit;
import com.robinhood.models.crypto.p314db.UnifiedBalances;
import com.robinhood.models.p320db.AchRelationship;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ReviewRecurringDepositViewState.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0006HÂ\u0003JO\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0018HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/ReviewRecurringDepositViewState;", "", "maxEarlyAccessAmount", "Ljava/math/BigDecimal;", "unclearedDeposits", "frequency", "Lcom/robinhood/models/api/ApiAutomaticDeposit$Frequency;", "achRelationship", "Lcom/robinhood/models/db/AchRelationship;", "balances", "Lcom/robinhood/models/crypto/db/UnifiedBalances;", "depositFrequency", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lcom/robinhood/models/api/ApiAutomaticDeposit$Frequency;Lcom/robinhood/models/db/AchRelationship;Lcom/robinhood/models/crypto/db/UnifiedBalances;Lcom/robinhood/models/api/ApiAutomaticDeposit$Frequency;)V", "getMaxEarlyAccessAmount", "()Ljava/math/BigDecimal;", "getUnclearedDeposits", "getFrequency", "()Lcom/robinhood/models/api/ApiAutomaticDeposit$Frequency;", "getAchRelationship", "()Lcom/robinhood/models/db/AchRelationship;", "getBalances", "()Lcom/robinhood/models/crypto/db/UnifiedBalances;", "getRecurringDepositReviewFrequencyDisclosure", "", "resources", "Landroid/content/res/Resources;", "getAchRelationshipDisplayText", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final /* data */ class ReviewRecurringDepositViewState {
    public static final int $stable = 8;
    private final AchRelationship achRelationship;
    private final UnifiedBalances balances;
    private final ApiAutomaticDeposit.Frequency depositFrequency;
    private final ApiAutomaticDeposit.Frequency frequency;
    private final BigDecimal maxEarlyAccessAmount;
    private final BigDecimal unclearedDeposits;

    /* compiled from: ReviewRecurringDepositViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiAutomaticDeposit.Frequency.values().length];
            try {
                iArr[ApiAutomaticDeposit.Frequency.ONCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiAutomaticDeposit.Frequency.WEEKLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiAutomaticDeposit.Frequency.BIWEEKLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApiAutomaticDeposit.Frequency.MONTHLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ApiAutomaticDeposit.Frequency.QUARTERLY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: component6, reason: from getter */
    private final ApiAutomaticDeposit.Frequency getDepositFrequency() {
        return this.depositFrequency;
    }

    public static /* synthetic */ ReviewRecurringDepositViewState copy$default(ReviewRecurringDepositViewState reviewRecurringDepositViewState, BigDecimal bigDecimal, BigDecimal bigDecimal2, ApiAutomaticDeposit.Frequency frequency, AchRelationship achRelationship, UnifiedBalances unifiedBalances, ApiAutomaticDeposit.Frequency frequency2, int i, Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = reviewRecurringDepositViewState.maxEarlyAccessAmount;
        }
        if ((i & 2) != 0) {
            bigDecimal2 = reviewRecurringDepositViewState.unclearedDeposits;
        }
        if ((i & 4) != 0) {
            frequency = reviewRecurringDepositViewState.frequency;
        }
        if ((i & 8) != 0) {
            achRelationship = reviewRecurringDepositViewState.achRelationship;
        }
        if ((i & 16) != 0) {
            unifiedBalances = reviewRecurringDepositViewState.balances;
        }
        if ((i & 32) != 0) {
            frequency2 = reviewRecurringDepositViewState.depositFrequency;
        }
        UnifiedBalances unifiedBalances2 = unifiedBalances;
        ApiAutomaticDeposit.Frequency frequency3 = frequency2;
        return reviewRecurringDepositViewState.copy(bigDecimal, bigDecimal2, frequency, achRelationship, unifiedBalances2, frequency3);
    }

    /* renamed from: component1, reason: from getter */
    public final BigDecimal getMaxEarlyAccessAmount() {
        return this.maxEarlyAccessAmount;
    }

    /* renamed from: component2, reason: from getter */
    public final BigDecimal getUnclearedDeposits() {
        return this.unclearedDeposits;
    }

    /* renamed from: component3, reason: from getter */
    public final ApiAutomaticDeposit.Frequency getFrequency() {
        return this.frequency;
    }

    /* renamed from: component4, reason: from getter */
    public final AchRelationship getAchRelationship() {
        return this.achRelationship;
    }

    /* renamed from: component5, reason: from getter */
    public final UnifiedBalances getBalances() {
        return this.balances;
    }

    public final ReviewRecurringDepositViewState copy(BigDecimal maxEarlyAccessAmount, BigDecimal unclearedDeposits, ApiAutomaticDeposit.Frequency frequency, AchRelationship achRelationship, UnifiedBalances balances, ApiAutomaticDeposit.Frequency depositFrequency) {
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        return new ReviewRecurringDepositViewState(maxEarlyAccessAmount, unclearedDeposits, frequency, achRelationship, balances, depositFrequency);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewRecurringDepositViewState)) {
            return false;
        }
        ReviewRecurringDepositViewState reviewRecurringDepositViewState = (ReviewRecurringDepositViewState) other;
        return Intrinsics.areEqual(this.maxEarlyAccessAmount, reviewRecurringDepositViewState.maxEarlyAccessAmount) && Intrinsics.areEqual(this.unclearedDeposits, reviewRecurringDepositViewState.unclearedDeposits) && this.frequency == reviewRecurringDepositViewState.frequency && Intrinsics.areEqual(this.achRelationship, reviewRecurringDepositViewState.achRelationship) && Intrinsics.areEqual(this.balances, reviewRecurringDepositViewState.balances) && this.depositFrequency == reviewRecurringDepositViewState.depositFrequency;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.maxEarlyAccessAmount;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        BigDecimal bigDecimal2 = this.unclearedDeposits;
        int iHashCode2 = (((iHashCode + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31) + this.frequency.hashCode()) * 31;
        AchRelationship achRelationship = this.achRelationship;
        int iHashCode3 = (iHashCode2 + (achRelationship == null ? 0 : achRelationship.hashCode())) * 31;
        UnifiedBalances unifiedBalances = this.balances;
        int iHashCode4 = (iHashCode3 + (unifiedBalances == null ? 0 : unifiedBalances.hashCode())) * 31;
        ApiAutomaticDeposit.Frequency frequency = this.depositFrequency;
        return iHashCode4 + (frequency != null ? frequency.hashCode() : 0);
    }

    public String toString() {
        return "ReviewRecurringDepositViewState(maxEarlyAccessAmount=" + this.maxEarlyAccessAmount + ", unclearedDeposits=" + this.unclearedDeposits + ", frequency=" + this.frequency + ", achRelationship=" + this.achRelationship + ", balances=" + this.balances + ", depositFrequency=" + this.depositFrequency + ")";
    }

    public ReviewRecurringDepositViewState(BigDecimal bigDecimal, BigDecimal bigDecimal2, ApiAutomaticDeposit.Frequency frequency, AchRelationship achRelationship, UnifiedBalances unifiedBalances, ApiAutomaticDeposit.Frequency frequency2) {
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        this.maxEarlyAccessAmount = bigDecimal;
        this.unclearedDeposits = bigDecimal2;
        this.frequency = frequency;
        this.achRelationship = achRelationship;
        this.balances = unifiedBalances;
        this.depositFrequency = frequency2;
    }

    public /* synthetic */ ReviewRecurringDepositViewState(BigDecimal bigDecimal, BigDecimal bigDecimal2, ApiAutomaticDeposit.Frequency frequency, AchRelationship achRelationship, UnifiedBalances unifiedBalances, ApiAutomaticDeposit.Frequency frequency2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bigDecimal, bigDecimal2, frequency, (i & 8) != 0 ? null : achRelationship, (i & 16) != 0 ? null : unifiedBalances, (i & 32) != 0 ? null : frequency2);
    }

    public final BigDecimal getMaxEarlyAccessAmount() {
        return this.maxEarlyAccessAmount;
    }

    public final BigDecimal getUnclearedDeposits() {
        return this.unclearedDeposits;
    }

    public final ApiAutomaticDeposit.Frequency getFrequency() {
        return this.frequency;
    }

    public final AchRelationship getAchRelationship() {
        return this.achRelationship;
    }

    public final UnifiedBalances getBalances() {
        return this.balances;
    }

    public final String getRecurringDepositReviewFrequencyDisclosure(Resources resources) throws Resources.NotFoundException {
        String string2;
        BigDecimal bigDecimal;
        String string3;
        Intrinsics.checkNotNullParameter(resources, "resources");
        int i = WhenMappings.$EnumSwitchMapping$0[this.frequency.ordinal()];
        if (i == 1) {
            string2 = resources.getString(C30383R.string.ach_transfer_automatic_deposit_description_once);
        } else if (i == 2) {
            string2 = resources.getString(C30383R.string.ach_transfer_automatic_deposit_description_week);
        } else if (i == 3) {
            string2 = resources.getString(C30383R.string.ach_transfer_automatic_deposit_description_two_weeks);
        } else if (i == 4) {
            string2 = resources.getString(C30383R.string.ach_transfer_automatic_deposit_description_month);
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            string2 = resources.getString(C30383R.string.ach_transfer_automatic_deposit_description_quarter);
        }
        Intrinsics.checkNotNull(string2);
        BigDecimal bigDecimal2 = this.maxEarlyAccessAmount;
        if (bigDecimal2 == null || (bigDecimal = this.unclearedDeposits) == null) {
            return string2;
        }
        BigDecimal bigDecimalSubtract = bigDecimal2.subtract(bigDecimal);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        if (bigDecimalSubtract.compareTo(BigDecimal.ZERO) > 0) {
            string3 = resources.getString(C9631R.string.ach_review_recurring_deposit_instant_disclaimer, Formats.getCurrencyFormat().format(bigDecimalSubtract));
        } else {
            string3 = resources.getString(C9631R.string.ach_review_recurring_deposit_no_instance_disclaimer);
        }
        Intrinsics.checkNotNull(string3);
        return string2 + PlaceholderUtils.XXShortPlaceholderText + string3;
    }

    public final String getAchRelationshipDisplayText(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        AchRelationship achRelationship = this.achRelationship;
        if (achRelationship != null) {
            return AchRelationships.getAchRelationshipDisplayName(achRelationship, resources);
        }
        return null;
    }
}
