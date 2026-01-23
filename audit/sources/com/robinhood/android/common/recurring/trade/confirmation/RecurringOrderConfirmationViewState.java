package com.robinhood.android.common.recurring.trade.confirmation;

import android.content.res.Resources;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.common.recurring.C11595R;
import com.robinhood.android.common.recurring.StringsKt;
import com.robinhood.android.lib.trade.view.OrderConfirmationRowItem;
import com.robinhood.android.recurring.contracts.RecurringGenericCreationFragmentKey;
import com.robinhood.android.recurring.contracts.RecurringOrderConfiguration;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.models.p320db.bonfire.DirectDepositRelationship;
import com.robinhood.recurring.models.InvestmentScheduleAmount;
import com.robinhood.recurring.models.api.ApiAssetType;
import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import com.robinhood.recurring.models.p365db.InvestmentSchedule;
import com.robinhood.recurring.models.p365db.InvestmentTarget;
import com.robinhood.utils.datetime.LocalDates4;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.LocalDate;

/* compiled from: RecurringOrderConfirmationViewState.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001:\u0002/0BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u0018\u001a\u00020\u0019J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÂ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0007HÂ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\tHÂ\u0003J\t\u0010(\u001a\u00020\u000bHÂ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\rHÂ\u0003JO\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010+\u001a\u00020\u000b2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\u0011HÖ\u0001J\t\u0010.\u001a\u00020\u0017HÖ\u0001R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010 \u001a\u0004\u0018\u00010!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u00061"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/trade/confirmation/RecurringOrderConfirmationViewState;", "", Card.Icon.ORDER, "Lcom/robinhood/recurring/models/db/InvestmentSchedule;", "achRelationship", "Lcom/robinhood/models/db/AchRelationship;", "directDepositRelationship", "Lcom/robinhood/models/db/bonfire/DirectDepositRelationship;", "paycheckRecurringBrokerageCashStatus", "Lcom/robinhood/android/recurring/contracts/RecurringOrderConfiguration$PaycheckRecurringBrokerageCashStatus;", "isCryptoRecurringOrdersVTExperimentEnabled", "", "cryptoMibSelectedAccount", "Lcom/robinhood/models/db/Account;", "<init>", "(Lcom/robinhood/recurring/models/db/InvestmentSchedule;Lcom/robinhood/models/db/AchRelationship;Lcom/robinhood/models/db/bonfire/DirectDepositRelationship;Lcom/robinhood/android/recurring/contracts/RecurringOrderConfiguration$PaycheckRecurringBrokerageCashStatus;ZLcom/robinhood/models/db/Account;)V", "viewOrderRes", "", "getViewOrderRes", "()I", "recurringAmountLabel", "getRecurringAmountLabel", "getOrderTitle", "", "resources", "Landroid/content/res/Resources;", "getOrderDescription", "getOrderConfirmationRowItems", "", "Lcom/robinhood/android/lib/trade/view/OrderConfirmationRowItem;", "investmentScheduleState", "Lcom/robinhood/android/common/recurring/trade/confirmation/RecurringOrderConfirmationViewState$InvestmentScheduleState;", "secondaryButtonState", "Lcom/robinhood/android/common/recurring/trade/confirmation/RecurringOrderConfirmationViewState$SecondaryButtonState;", "getSecondaryButtonState", "()Lcom/robinhood/android/common/recurring/trade/confirmation/RecurringOrderConfirmationViewState$SecondaryButtonState;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "SecondaryButtonState", "InvestmentScheduleState", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class RecurringOrderConfirmationViewState {
    public static final int $stable = 8;
    private final AchRelationship achRelationship;
    private final Account cryptoMibSelectedAccount;
    private final DirectDepositRelationship directDepositRelationship;
    private final InvestmentScheduleState investmentScheduleState;
    private final boolean isCryptoRecurringOrdersVTExperimentEnabled;
    private final InvestmentSchedule order;
    private final RecurringOrderConfiguration.PaycheckRecurringBrokerageCashStatus paycheckRecurringBrokerageCashStatus;
    private final int viewOrderRes;

    /* compiled from: RecurringOrderConfirmationViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[InvestmentScheduleState.values().length];
            try {
                iArr[InvestmentScheduleState.STANDARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InvestmentScheduleState.PAYCHECK_WITH_DIRECT_DEPOSIT_RELATIONSHIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InvestmentScheduleState.PAYCHECK_WITHOUT_DIRECT_DEPOSIT_RELATIONSHIP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ApiInvestmentSchedule.SourceOfFunds.values().length];
            try {
                iArr2[ApiInvestmentSchedule.SourceOfFunds.ACH_RELATIONSHIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ApiInvestmentSchedule.SourceOfFunds.BUYING_POWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ApiInvestmentSchedule.SourceOfFunds.DIRECT_DEPOSIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[ApiInvestmentSchedule.Frequency.values().length];
            try {
                iArr3[ApiInvestmentSchedule.Frequency.DAILY.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[ApiInvestmentSchedule.Frequency.WEEKLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[ApiInvestmentSchedule.Frequency.BIWEEKLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[ApiInvestmentSchedule.Frequency.MONTHLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[ApiInvestmentSchedule.Frequency.EVERY_PAYCHECK.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public RecurringOrderConfirmationViewState() {
        this(null, null, null, null, false, null, 63, null);
    }

    /* renamed from: component1, reason: from getter */
    private final InvestmentSchedule getOrder() {
        return this.order;
    }

    /* renamed from: component2, reason: from getter */
    private final AchRelationship getAchRelationship() {
        return this.achRelationship;
    }

    /* renamed from: component3, reason: from getter */
    private final DirectDepositRelationship getDirectDepositRelationship() {
        return this.directDepositRelationship;
    }

    /* renamed from: component4, reason: from getter */
    private final RecurringOrderConfiguration.PaycheckRecurringBrokerageCashStatus getPaycheckRecurringBrokerageCashStatus() {
        return this.paycheckRecurringBrokerageCashStatus;
    }

    /* renamed from: component5, reason: from getter */
    private final boolean getIsCryptoRecurringOrdersVTExperimentEnabled() {
        return this.isCryptoRecurringOrdersVTExperimentEnabled;
    }

    /* renamed from: component6, reason: from getter */
    private final Account getCryptoMibSelectedAccount() {
        return this.cryptoMibSelectedAccount;
    }

    public static /* synthetic */ RecurringOrderConfirmationViewState copy$default(RecurringOrderConfirmationViewState recurringOrderConfirmationViewState, InvestmentSchedule investmentSchedule, AchRelationship achRelationship, DirectDepositRelationship directDepositRelationship, RecurringOrderConfiguration.PaycheckRecurringBrokerageCashStatus paycheckRecurringBrokerageCashStatus, boolean z, Account account, int i, Object obj) {
        if ((i & 1) != 0) {
            investmentSchedule = recurringOrderConfirmationViewState.order;
        }
        if ((i & 2) != 0) {
            achRelationship = recurringOrderConfirmationViewState.achRelationship;
        }
        if ((i & 4) != 0) {
            directDepositRelationship = recurringOrderConfirmationViewState.directDepositRelationship;
        }
        if ((i & 8) != 0) {
            paycheckRecurringBrokerageCashStatus = recurringOrderConfirmationViewState.paycheckRecurringBrokerageCashStatus;
        }
        if ((i & 16) != 0) {
            z = recurringOrderConfirmationViewState.isCryptoRecurringOrdersVTExperimentEnabled;
        }
        if ((i & 32) != 0) {
            account = recurringOrderConfirmationViewState.cryptoMibSelectedAccount;
        }
        boolean z2 = z;
        Account account2 = account;
        return recurringOrderConfirmationViewState.copy(investmentSchedule, achRelationship, directDepositRelationship, paycheckRecurringBrokerageCashStatus, z2, account2);
    }

    public final RecurringOrderConfirmationViewState copy(InvestmentSchedule order, AchRelationship achRelationship, DirectDepositRelationship directDepositRelationship, RecurringOrderConfiguration.PaycheckRecurringBrokerageCashStatus paycheckRecurringBrokerageCashStatus, boolean isCryptoRecurringOrdersVTExperimentEnabled, Account cryptoMibSelectedAccount) {
        return new RecurringOrderConfirmationViewState(order, achRelationship, directDepositRelationship, paycheckRecurringBrokerageCashStatus, isCryptoRecurringOrdersVTExperimentEnabled, cryptoMibSelectedAccount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecurringOrderConfirmationViewState)) {
            return false;
        }
        RecurringOrderConfirmationViewState recurringOrderConfirmationViewState = (RecurringOrderConfirmationViewState) other;
        return Intrinsics.areEqual(this.order, recurringOrderConfirmationViewState.order) && Intrinsics.areEqual(this.achRelationship, recurringOrderConfirmationViewState.achRelationship) && Intrinsics.areEqual(this.directDepositRelationship, recurringOrderConfirmationViewState.directDepositRelationship) && Intrinsics.areEqual(this.paycheckRecurringBrokerageCashStatus, recurringOrderConfirmationViewState.paycheckRecurringBrokerageCashStatus) && this.isCryptoRecurringOrdersVTExperimentEnabled == recurringOrderConfirmationViewState.isCryptoRecurringOrdersVTExperimentEnabled && Intrinsics.areEqual(this.cryptoMibSelectedAccount, recurringOrderConfirmationViewState.cryptoMibSelectedAccount);
    }

    public int hashCode() {
        InvestmentSchedule investmentSchedule = this.order;
        int iHashCode = (investmentSchedule == null ? 0 : investmentSchedule.hashCode()) * 31;
        AchRelationship achRelationship = this.achRelationship;
        int iHashCode2 = (iHashCode + (achRelationship == null ? 0 : achRelationship.hashCode())) * 31;
        DirectDepositRelationship directDepositRelationship = this.directDepositRelationship;
        int iHashCode3 = (iHashCode2 + (directDepositRelationship == null ? 0 : directDepositRelationship.hashCode())) * 31;
        RecurringOrderConfiguration.PaycheckRecurringBrokerageCashStatus paycheckRecurringBrokerageCashStatus = this.paycheckRecurringBrokerageCashStatus;
        int iHashCode4 = (((iHashCode3 + (paycheckRecurringBrokerageCashStatus == null ? 0 : paycheckRecurringBrokerageCashStatus.hashCode())) * 31) + Boolean.hashCode(this.isCryptoRecurringOrdersVTExperimentEnabled)) * 31;
        Account account = this.cryptoMibSelectedAccount;
        return iHashCode4 + (account != null ? account.hashCode() : 0);
    }

    public String toString() {
        return "RecurringOrderConfirmationViewState(order=" + this.order + ", achRelationship=" + this.achRelationship + ", directDepositRelationship=" + this.directDepositRelationship + ", paycheckRecurringBrokerageCashStatus=" + this.paycheckRecurringBrokerageCashStatus + ", isCryptoRecurringOrdersVTExperimentEnabled=" + this.isCryptoRecurringOrdersVTExperimentEnabled + ", cryptoMibSelectedAccount=" + this.cryptoMibSelectedAccount + ")";
    }

    public RecurringOrderConfirmationViewState(InvestmentSchedule investmentSchedule, AchRelationship achRelationship, DirectDepositRelationship directDepositRelationship, RecurringOrderConfiguration.PaycheckRecurringBrokerageCashStatus paycheckRecurringBrokerageCashStatus, boolean z, Account account) {
        InvestmentScheduleState investmentScheduleState;
        this.order = investmentSchedule;
        this.achRelationship = achRelationship;
        this.directDepositRelationship = directDepositRelationship;
        this.paycheckRecurringBrokerageCashStatus = paycheckRecurringBrokerageCashStatus;
        this.isCryptoRecurringOrdersVTExperimentEnabled = z;
        this.cryptoMibSelectedAccount = account;
        this.viewOrderRes = C11595R.string.order_confirmation_investment_schedule_view_order;
        if (investmentSchedule == null) {
            investmentScheduleState = null;
        } else {
            int i = WhenMappings.$EnumSwitchMapping$2[investmentSchedule.getFrequency().ordinal()];
            if (i == 1 || i == 2 || i == 3 || i == 4) {
                investmentScheduleState = InvestmentScheduleState.STANDARD;
            } else {
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                if (investmentSchedule.getDirectDepositRelationshipId() == null) {
                    investmentScheduleState = InvestmentScheduleState.PAYCHECK_WITHOUT_DIRECT_DEPOSIT_RELATIONSHIP;
                } else {
                    investmentScheduleState = InvestmentScheduleState.PAYCHECK_WITH_DIRECT_DEPOSIT_RELATIONSHIP;
                }
            }
        }
        this.investmentScheduleState = investmentScheduleState;
    }

    public /* synthetic */ RecurringOrderConfirmationViewState(InvestmentSchedule investmentSchedule, AchRelationship achRelationship, DirectDepositRelationship directDepositRelationship, RecurringOrderConfiguration.PaycheckRecurringBrokerageCashStatus paycheckRecurringBrokerageCashStatus, boolean z, Account account, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : investmentSchedule, (i & 2) != 0 ? null : achRelationship, (i & 4) != 0 ? null : directDepositRelationship, (i & 8) != 0 ? null : paycheckRecurringBrokerageCashStatus, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : account);
    }

    public final int getViewOrderRes() {
        return this.viewOrderRes;
    }

    private final int getRecurringAmountLabel() {
        InvestmentTarget investmentTarget;
        InvestmentSchedule investmentSchedule = this.order;
        if (investmentSchedule != null && (investmentTarget = investmentSchedule.getInvestmentTarget()) != null && investmentTarget.isCrypto()) {
            InvestmentScheduleAmount investmentScheduleAmount = this.order.getInvestmentScheduleAmount();
            if (investmentScheduleAmount instanceof InvestmentScheduleAmount.Dollar) {
                return C11595R.string.order_create_recurring_amount_label_crypto;
            }
            if (investmentScheduleAmount instanceof InvestmentScheduleAmount.Percentage) {
                return C11595R.string.order_create_recurring_amount_label;
            }
            throw new NoWhenBranchMatchedException();
        }
        return C11595R.string.order_create_recurring_amount_label;
    }

    public final String getOrderTitle(Resources resources) {
        InvestmentTarget investmentTarget;
        String instrumentSymbol;
        Intrinsics.checkNotNullParameter(resources, "resources");
        InvestmentScheduleState investmentScheduleState = this.investmentScheduleState;
        int i = investmentScheduleState == null ? -1 : WhenMappings.$EnumSwitchMapping$0[investmentScheduleState.ordinal()];
        if (i != -1) {
            if (i != 1 && i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return resources.getString(C11595R.string.order_confirmation_status_submitted);
            }
            InvestmentSchedule investmentSchedule = this.order;
            if (investmentSchedule != null && (investmentTarget = investmentSchedule.getInvestmentTarget()) != null && (instrumentSymbol = investmentTarget.getInstrumentSymbol()) != null) {
                return resources.getString(C11595R.string.order_confirmation_status_scheduled, instrumentSymbol);
            }
        }
        return null;
    }

    public final String getOrderDescription(Resources resources) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(resources, "resources");
        InvestmentSchedule investmentSchedule = this.order;
        if (investmentSchedule == null) {
            return null;
        }
        LocalDate nextInvestmentDate = investmentSchedule.getNextInvestmentDate();
        if (nextInvestmentDate != null) {
            if (this.isCryptoRecurringOrdersVTExperimentEnabled && this.order.getInvestmentTarget().isCrypto()) {
                i2 = C11595R.string.order_confirmation_recurring_vt_description_with_date;
            } else {
                i2 = C11595R.string.order_confirmation_investment_schedule_description_with_date;
            }
            int i3 = i2;
            int i4 = WhenMappings.$EnumSwitchMapping$1[this.order.getSourceOfFunds().ordinal()];
            if (i4 == 1 || i4 == 2) {
                return resources.getString(i3, this.order.getInvestmentScheduleAmount().format(), this.order.getInvestmentTarget().getInstrumentSymbol(), resources.getString(StringsKt.getDescriptionResId(this.order.getFrequency())), LocalDates4.formatRecent(nextInvestmentDate, resources, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 2) != 0 ? LocalDateFormatter.MEDIUM : null, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 4) != 0 ? null : Integer.valueOf(C11595R.string.order_create_recurring_start_date_prefix), (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 8) != 0, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 16) != 0, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 32) != 0, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 64) == 0 ? false : true, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 128) != 0 ? false : false));
            }
            if (i4 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            throw new IllegalStateException("Paycheck investments should not have a next investment date.");
        }
        if (this.isCryptoRecurringOrdersVTExperimentEnabled && this.order.getInvestmentTarget().isCrypto()) {
            i = C11595R.string.order_confirmation_recurring_vt_description;
        } else {
            i = C11595R.string.order_confirmation_investment_schedule_description;
        }
        int i5 = WhenMappings.$EnumSwitchMapping$1[this.order.getSourceOfFunds().ordinal()];
        if (i5 != 1 && i5 != 2) {
            if (i5 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            InvestmentScheduleAmount investmentScheduleAmount = this.order.getInvestmentScheduleAmount();
            if (investmentScheduleAmount instanceof InvestmentScheduleAmount.Dollar) {
                i = C11595R.string.f4030xd9a532ee;
            } else {
                if (!(investmentScheduleAmount instanceof InvestmentScheduleAmount.Percentage)) {
                    throw new NoWhenBranchMatchedException();
                }
                i = C11595R.string.f4031xf20d19a1;
            }
        }
        return resources.getString(i, this.order.getInvestmentScheduleAmount().format(), this.order.getInvestmentTarget().getInstrumentSymbol());
    }

    public final List<OrderConfirmationRowItem> getOrderConfirmationRowItems(Resources resources) throws Resources.NotFoundException {
        String str;
        String string2;
        String string3;
        Intrinsics.checkNotNullParameter(resources, "resources");
        if (this.order == null) {
            return CollectionsKt.emptyList();
        }
        String string4 = resources.getString(getRecurringAmountLabel());
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        OrderConfirmationRowItem orderConfirmationRowItem = new OrderConfirmationRowItem(string4, null, this.order.getInvestmentScheduleAmount().format(), null, 10, null);
        String string5 = resources.getString(C11595R.string.order_confirmation_investment_schedule_frequency_label);
        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
        String string6 = resources.getString(StringsKt.labelResId(this.order.getFrequency(), this.order.isCrypto()));
        Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
        List<OrderConfirmationRowItem> listMutableListOf = CollectionsKt.mutableListOf(orderConfirmationRowItem, new OrderConfirmationRowItem(string5, null, string6, null, 10, null));
        boolean z = this.order.getFrequency() == ApiInvestmentSchedule.Frequency.EVERY_PAYCHECK && this.order.getDirectDepositRelationshipId() == null;
        if (!z) {
            List<OrderConfirmationRowItem> list = listMutableListOf;
            String string7 = resources.getString(C11595R.string.order_confirmation_investment_schedule_payment_label);
            Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
            CharSequence charSequenceLabel = StringsKt.label(this.order.getSourceOfFunds(), this.achRelationship, this.directDepositRelationship, this.order.isCrypto(), resources);
            if (charSequenceLabel == null) {
                charSequenceLabel = resources.getString(C11595R.string.order_confirmation_investment_schedule_na_value);
                Intrinsics.checkNotNullExpressionValue(charSequenceLabel, "getString(...)");
            }
            list.add(new OrderConfirmationRowItem(string7, null, charSequenceLabel, null, 10, null));
        }
        if (this.order.isBackupAchEnabled()) {
            List<OrderConfirmationRowItem> list2 = listMutableListOf;
            String string8 = resources.getString(C11595R.string.order_confirmation_investment_schedule_backup_payment_label);
            Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
            AchRelationship achRelationship = this.achRelationship;
            if (achRelationship == null || (string3 = achRelationship.getBankAccountNickname()) == null) {
                string3 = resources.getString(C11595R.string.order_confirmation_investment_schedule_na_value);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            }
            list2.add(new OrderConfirmationRowItem(string8, null, string3, null, 10, null));
        }
        if (!z) {
            List<OrderConfirmationRowItem> list3 = listMutableListOf;
            String string9 = resources.getString(C11595R.string.f4028x757483fb);
            Intrinsics.checkNotNullExpressionValue(string9, "getString(...)");
            int i = WhenMappings.$EnumSwitchMapping$1[this.order.getSourceOfFunds().ordinal()];
            if (i == 1 || i == 2) {
                LocalDate nextInvestmentDate = this.order.getNextInvestmentDate();
                if (nextInvestmentDate != null) {
                    str = string9;
                    string2 = LocalDates4.formatRecent(nextInvestmentDate, resources, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 2) != 0 ? LocalDateFormatter.MEDIUM : null, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 4) != 0 ? null : null, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 8) != 0, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 16) != 0, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 32) != 0, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 64) == 0 ? false : true, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 128) != 0 ? false : false);
                    if (string2 == null) {
                    }
                } else {
                    str = string9;
                }
                string2 = resources.getString(C11595R.string.order_confirmation_investment_schedule_na_value);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                string2 = resources.getString(C11595R.string.f4029x33867cab);
                Intrinsics.checkNotNull(string2);
                str = string9;
            }
            list3.add(new OrderConfirmationRowItem(str, null, string2, null, 10, null));
        }
        if (this.cryptoMibSelectedAccount != null && this.order.isCrypto()) {
            String string10 = resources.getString(C11595R.string.recurring_order_account_label);
            Intrinsics.checkNotNullExpressionValue(string10, "getString(...)");
            listMutableListOf.add(new OrderConfirmationRowItem(string10, null, AccountDisplayNames.getDisplayName(this.cryptoMibSelectedAccount).getShort().getTitle().getText(resources), null, 10, null));
        }
        return listMutableListOf;
    }

    public final SecondaryButtonState getSecondaryButtonState() {
        InvestmentScheduleState investmentScheduleState = this.investmentScheduleState;
        int i = investmentScheduleState == null ? -1 : WhenMappings.$EnumSwitchMapping$0[investmentScheduleState.ordinal()];
        if (i == -1) {
            return null;
        }
        if (i == 1 || i == 2) {
            InvestmentSchedule investmentSchedule = this.order;
            Intrinsics.checkNotNull(investmentSchedule);
            return new SecondaryButtonState.ViewRecurringInvestment(investmentSchedule.getInvestmentTarget().getTargetType(), this.order.getId());
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return new SecondaryButtonState.SetUpAnotherPaycheckRecurringInvestment(this.paycheckRecurringBrokerageCashStatus);
    }

    /* compiled from: RecurringOrderConfirmationViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\b\tB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/trade/confirmation/RecurringOrderConfirmationViewState$SecondaryButtonState;", "", "textResource", "", "<init>", "(I)V", "getTextResource", "()I", "SetUpAnotherPaycheckRecurringInvestment", "ViewRecurringInvestment", "Lcom/robinhood/android/common/recurring/trade/confirmation/RecurringOrderConfirmationViewState$SecondaryButtonState$SetUpAnotherPaycheckRecurringInvestment;", "Lcom/robinhood/android/common/recurring/trade/confirmation/RecurringOrderConfirmationViewState$SecondaryButtonState$ViewRecurringInvestment;", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class SecondaryButtonState {
        public static final int $stable = 0;
        private final int textResource;

        public /* synthetic */ SecondaryButtonState(int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(i);
        }

        private SecondaryButtonState(int i) {
            this.textResource = i;
        }

        public final int getTextResource() {
            return this.textResource;
        }

        /* compiled from: RecurringOrderConfirmationViewState.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/trade/confirmation/RecurringOrderConfirmationViewState$SecondaryButtonState$SetUpAnotherPaycheckRecurringInvestment;", "Lcom/robinhood/android/common/recurring/trade/confirmation/RecurringOrderConfirmationViewState$SecondaryButtonState;", "paycheckRecurringBrokerageCashStatus", "Lcom/robinhood/android/recurring/contracts/RecurringOrderConfiguration$PaycheckRecurringBrokerageCashStatus;", "<init>", "(Lcom/robinhood/android/recurring/contracts/RecurringOrderConfiguration$PaycheckRecurringBrokerageCashStatus;)V", "getPaycheckRecurringBrokerageCashStatus", "()Lcom/robinhood/android/recurring/contracts/RecurringOrderConfiguration$PaycheckRecurringBrokerageCashStatus;", "fragmentKey", "Lcom/robinhood/android/recurring/contracts/RecurringGenericCreationFragmentKey;", "getFragmentKey", "()Lcom/robinhood/android/recurring/contracts/RecurringGenericCreationFragmentKey;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class SetUpAnotherPaycheckRecurringInvestment extends SecondaryButtonState {
            public static final int $stable = 8;
            private final RecurringOrderConfiguration.PaycheckRecurringBrokerageCashStatus paycheckRecurringBrokerageCashStatus;

            public static /* synthetic */ SetUpAnotherPaycheckRecurringInvestment copy$default(SetUpAnotherPaycheckRecurringInvestment setUpAnotherPaycheckRecurringInvestment, RecurringOrderConfiguration.PaycheckRecurringBrokerageCashStatus paycheckRecurringBrokerageCashStatus, int i, Object obj) {
                if ((i & 1) != 0) {
                    paycheckRecurringBrokerageCashStatus = setUpAnotherPaycheckRecurringInvestment.paycheckRecurringBrokerageCashStatus;
                }
                return setUpAnotherPaycheckRecurringInvestment.copy(paycheckRecurringBrokerageCashStatus);
            }

            /* renamed from: component1, reason: from getter */
            public final RecurringOrderConfiguration.PaycheckRecurringBrokerageCashStatus getPaycheckRecurringBrokerageCashStatus() {
                return this.paycheckRecurringBrokerageCashStatus;
            }

            public final SetUpAnotherPaycheckRecurringInvestment copy(RecurringOrderConfiguration.PaycheckRecurringBrokerageCashStatus paycheckRecurringBrokerageCashStatus) {
                return new SetUpAnotherPaycheckRecurringInvestment(paycheckRecurringBrokerageCashStatus);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SetUpAnotherPaycheckRecurringInvestment) && Intrinsics.areEqual(this.paycheckRecurringBrokerageCashStatus, ((SetUpAnotherPaycheckRecurringInvestment) other).paycheckRecurringBrokerageCashStatus);
            }

            public int hashCode() {
                RecurringOrderConfiguration.PaycheckRecurringBrokerageCashStatus paycheckRecurringBrokerageCashStatus = this.paycheckRecurringBrokerageCashStatus;
                if (paycheckRecurringBrokerageCashStatus == null) {
                    return 0;
                }
                return paycheckRecurringBrokerageCashStatus.hashCode();
            }

            public String toString() {
                return "SetUpAnotherPaycheckRecurringInvestment(paycheckRecurringBrokerageCashStatus=" + this.paycheckRecurringBrokerageCashStatus + ")";
            }

            public final RecurringOrderConfiguration.PaycheckRecurringBrokerageCashStatus getPaycheckRecurringBrokerageCashStatus() {
                return this.paycheckRecurringBrokerageCashStatus;
            }

            public SetUpAnotherPaycheckRecurringInvestment(RecurringOrderConfiguration.PaycheckRecurringBrokerageCashStatus paycheckRecurringBrokerageCashStatus) {
                super(C11595R.string.order_confirmation_set_up_another_paycheck_recurring_investment, null);
                this.paycheckRecurringBrokerageCashStatus = paycheckRecurringBrokerageCashStatus;
            }

            public final RecurringGenericCreationFragmentKey getFragmentKey() {
                RecurringOrderConfiguration.PaycheckRecurringBrokerageCashStatus paycheckRecurringBrokerageCashStatus = this.paycheckRecurringBrokerageCashStatus;
                boolean z = paycheckRecurringBrokerageCashStatus != null && paycheckRecurringBrokerageCashStatus.getSweepEligible();
                RecurringOrderConfiguration.PaycheckRecurringBrokerageCashStatus paycheckRecurringBrokerageCashStatus2 = this.paycheckRecurringBrokerageCashStatus;
                return RecurringGenericCreationFragmentKey.INSTANCE.getPaycheckRecurringInvestmentsWithDirectDepositsOnboardingKey(true, true, true, true, z, paycheckRecurringBrokerageCashStatus2 != null && paycheckRecurringBrokerageCashStatus2.getSweepEnabled());
            }
        }

        /* compiled from: RecurringOrderConfirmationViewState.kt */
        @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/trade/confirmation/RecurringOrderConfirmationViewState$SecondaryButtonState$ViewRecurringInvestment;", "Lcom/robinhood/android/common/recurring/trade/confirmation/RecurringOrderConfirmationViewState$SecondaryButtonState;", "assetType", "Lcom/robinhood/recurring/models/api/ApiAssetType;", "paycheckRecurringInvestmentId", "Ljava/util/UUID;", "<init>", "(Lcom/robinhood/recurring/models/api/ApiAssetType;Ljava/util/UUID;)V", "getAssetType", "()Lcom/robinhood/recurring/models/api/ApiAssetType;", "getPaycheckRecurringInvestmentId", "()Ljava/util/UUID;", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class ViewRecurringInvestment extends SecondaryButtonState {
            public static final int $stable = 8;
            private final ApiAssetType assetType;
            private final UUID paycheckRecurringInvestmentId;

            /* compiled from: RecurringOrderConfirmationViewState.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[ApiAssetType.values().length];
                    try {
                        iArr[ApiAssetType.EQUITY.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[ApiAssetType.CRYPTO.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[ApiAssetType.BROKERAGE_CASH.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[ApiAssetType.TOKENIZED_STOCK.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public final ApiAssetType getAssetType() {
                return this.assetType;
            }

            public final UUID getPaycheckRecurringInvestmentId() {
                return this.paycheckRecurringInvestmentId;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public ViewRecurringInvestment(ApiAssetType assetType, UUID paycheckRecurringInvestmentId) {
                int i;
                Intrinsics.checkNotNullParameter(assetType, "assetType");
                Intrinsics.checkNotNullParameter(paycheckRecurringInvestmentId, "paycheckRecurringInvestmentId");
                int i2 = WhenMappings.$EnumSwitchMapping$0[assetType.ordinal()];
                if (i2 == 1 || i2 == 2) {
                    i = C11595R.string.order_confirmation_investment_schedule_view_order;
                } else {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            throw new IllegalStateException("This flow doesn't support tokenized stocks");
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    i = C11595R.string.order_confirmation_transfer_schedule_view_order;
                }
                super(i, null);
                this.assetType = assetType;
                this.paycheckRecurringInvestmentId = paycheckRecurringInvestmentId;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RecurringOrderConfirmationViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/trade/confirmation/RecurringOrderConfirmationViewState$InvestmentScheduleState;", "", "<init>", "(Ljava/lang/String;I)V", "STANDARD", "PAYCHECK_WITH_DIRECT_DEPOSIT_RELATIONSHIP", "PAYCHECK_WITHOUT_DIRECT_DEPOSIT_RELATIONSHIP", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class InvestmentScheduleState {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ InvestmentScheduleState[] $VALUES;
        public static final InvestmentScheduleState STANDARD = new InvestmentScheduleState("STANDARD", 0);
        public static final InvestmentScheduleState PAYCHECK_WITH_DIRECT_DEPOSIT_RELATIONSHIP = new InvestmentScheduleState("PAYCHECK_WITH_DIRECT_DEPOSIT_RELATIONSHIP", 1);
        public static final InvestmentScheduleState PAYCHECK_WITHOUT_DIRECT_DEPOSIT_RELATIONSHIP = new InvestmentScheduleState("PAYCHECK_WITHOUT_DIRECT_DEPOSIT_RELATIONSHIP", 2);

        private static final /* synthetic */ InvestmentScheduleState[] $values() {
            return new InvestmentScheduleState[]{STANDARD, PAYCHECK_WITH_DIRECT_DEPOSIT_RELATIONSHIP, PAYCHECK_WITHOUT_DIRECT_DEPOSIT_RELATIONSHIP};
        }

        public static EnumEntries<InvestmentScheduleState> getEntries() {
            return $ENTRIES;
        }

        private InvestmentScheduleState(String str, int i) {
        }

        static {
            InvestmentScheduleState[] investmentScheduleStateArr$values = $values();
            $VALUES = investmentScheduleStateArr$values;
            $ENTRIES = EnumEntries2.enumEntries(investmentScheduleStateArr$values);
        }

        public static InvestmentScheduleState valueOf(String str) {
            return (InvestmentScheduleState) Enum.valueOf(InvestmentScheduleState.class, str);
        }

        public static InvestmentScheduleState[] values() {
            return (InvestmentScheduleState[]) $VALUES.clone();
        }
    }
}
