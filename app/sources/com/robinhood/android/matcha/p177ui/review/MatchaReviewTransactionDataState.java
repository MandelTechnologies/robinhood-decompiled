package com.robinhood.android.matcha.p177ui.review;

import androidx.lifecycle.SavedStateHandle;
import com.adjust.sdk.network.ErrorCodes;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.matcha.C21284R;
import com.robinhood.android.matcha.models.p176ui.Transactor;
import com.robinhood.android.matcha.p177ui.memo.MemoInputActivity;
import com.robinhood.android.matcha.p177ui.models.Direction;
import com.robinhood.android.matcha.p177ui.models.UtilsKt;
import com.robinhood.android.matcha.p177ui.review.MatchaReviewTransactionDuxo;
import com.robinhood.android.matcha.p177ui.review.MatchaReviewTransactionFragment;
import com.robinhood.android.matcha.p177ui.review.MatchaReviewTransactionViewState2;
import com.robinhood.android.matcha.p177ui.review.MatchaReviewTransactionViewState3;
import com.robinhood.android.models.matcha.api.SourceOfFunds;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.models.p320db.matcha.MatchaIncentivesSummary;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.money.Currencies;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: MatchaReviewTransactionDataState.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 U2\u00020\u0001:\u0001UBy\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\r¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010+\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010F\u001a\u00020\u0007HÆ\u0003J\t\u0010G\u001a\u00020\tHÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010I\u001a\u00020\rHÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\t\u0010N\u001a\u00020\rHÆ\u0003J\u0083\u0001\u0010O\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\rHÆ\u0001J\u0013\u0010P\u001a\u00020\r2\b\u0010Q\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010R\u001a\u00020SHÖ\u0001J\t\u0010T\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b(\u0010%R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u0015\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010#R\u0011\u0010,\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b-\u0010!R\u0011\u0010.\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b/\u0010!R\u0011\u00100\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b1\u0010!R\u0011\u00102\u001a\u0002038F¢\u0006\u0006\u001a\u0004\b4\u00105R\u0013\u00106\u001a\u0004\u0018\u000103¢\u0006\b\n\u0000\u001a\u0004\b7\u00105R\u0011\u00108\u001a\u000203¢\u0006\b\n\u0000\u001a\u0004\b9\u00105R\u0013\u0010:\u001a\u0004\u0018\u000103¢\u0006\b\n\u0000\u001a\u0004\b;\u00105R\u0011\u0010<\u001a\u00020=¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0011\u0010@\u001a\u00020A¢\u0006\b\n\u0000\u001a\u0004\bB\u0010C¨\u0006V"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/review/MatchaReviewTransactionDataState;", "", "amount", "Lcom/robinhood/models/util/Money;", "sourceOfFunds", "Lcom/robinhood/android/models/matcha/api/SourceOfFunds;", "direction", "Lcom/robinhood/android/matcha/ui/models/Direction;", "transactor", "Lcom/robinhood/android/matcha/models/ui/Transactor;", MemoInputActivity.EXTRA_MEMO, "", "showLoading", "", "transferId", "Ljava/util/UUID;", "selectedTransferAccount", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "requestId", "incentivesSummary", "Lcom/robinhood/models/db/matcha/MatchaIncentivesSummary;", "isMatchaIncentivesExperimentMember", "<init>", "(Lcom/robinhood/models/util/Money;Lcom/robinhood/android/models/matcha/api/SourceOfFunds;Lcom/robinhood/android/matcha/ui/models/Direction;Lcom/robinhood/android/matcha/models/ui/Transactor;Ljava/lang/String;ZLjava/util/UUID;Lcom/robinhood/models/db/bonfire/TransferAccount;Ljava/util/UUID;Lcom/robinhood/models/db/matcha/MatchaIncentivesSummary;Z)V", "getAmount", "()Lcom/robinhood/models/util/Money;", "getSourceOfFunds", "()Lcom/robinhood/android/models/matcha/api/SourceOfFunds;", "getDirection", "()Lcom/robinhood/android/matcha/ui/models/Direction;", "getTransactor", "()Lcom/robinhood/android/matcha/models/ui/Transactor;", "getMemo", "()Ljava/lang/String;", "getShowLoading", "()Z", "getTransferId", "()Ljava/util/UUID;", "getSelectedTransferAccount", "()Lcom/robinhood/models/db/bonfire/TransferAccount;", "getRequestId", "getIncentivesSummary", "()Lcom/robinhood/models/db/matcha/MatchaIncentivesSummary;", "hasInsufficientFunds", "transactorName", "getTransactorName", "transactorDisplayId", "getTransactorDisplayId", "amountText", "getAmountText", "primaryText", "Lcom/robinhood/utils/resource/StringResource;", "getPrimaryText", "()Lcom/robinhood/utils/resource/StringResource;", "secondaryText", "getSecondaryText", ErrorBundle.SUMMARY_ENTRY, "getSummary", "summarySourceOfFundsSuffix", "getSummarySourceOfFundsSuffix", "bannerViewState", "Lcom/robinhood/android/matcha/ui/review/MatchaReviewTransactionBannerViewState;", "getBannerViewState", "()Lcom/robinhood/android/matcha/ui/review/MatchaReviewTransactionBannerViewState;", "memoState", "Lcom/robinhood/android/matcha/ui/review/MemoState;", "getMemoState", "()Lcom/robinhood/android/matcha/ui/review/MemoState;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class MatchaReviewTransactionDataState {
    private final Money amount;
    private final String amountText;
    private final MatchaReviewTransactionViewState2 bannerViewState;
    private final Direction direction;
    private final MatchaIncentivesSummary incentivesSummary;
    private final boolean isMatchaIncentivesExperimentMember;
    private final String memo;
    private final MatchaReviewTransactionViewState3 memoState;
    private final UUID requestId;
    private final StringResource secondaryText;
    private final TransferAccount selectedTransferAccount;
    private final boolean showLoading;
    private final SourceOfFunds sourceOfFunds;
    private final StringResource summary;
    private final StringResource summarySourceOfFundsSuffix;
    private final Transactor transactor;
    private final String transactorDisplayId;
    private final String transactorName;
    private final UUID transferId;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: MatchaReviewTransactionDataState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Direction.values().length];
            try {
                iArr[Direction.SEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Direction.REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ApiTransferAccount.TransferAccountType.values().length];
            try {
                iArr2[ApiTransferAccount.TransferAccountType.RHY.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ApiTransferAccount.TransferAccountType.RHS.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ApiTransferAccount.TransferAccountType.DEBIT_CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ApiTransferAccount.TransferAccountType.ACH.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ApiTransferAccount.TransferAccountType.IRA_ROTH.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ApiTransferAccount.TransferAccountType.IRA_TRADITIONAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[ApiTransferAccount.TransferAccountType.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[ApiTransferAccount.TransferAccountType.RHCE.ordinal()] = 8;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[ApiTransferAccount.TransferAccountType.SEPA.ordinal()] = 9;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[ApiTransferAccount.TransferAccountType.UK_BANK_ACCOUNT.ordinal()] = 10;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[ApiTransferAccount.TransferAccountType.I18N_BANK_ACCOUNT.ordinal()] = 11;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[ApiTransferAccount.TransferAccountType.OUTGOING_WIRE_ACCOUNT.ordinal()] = 12;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[ApiTransferAccount.TransferAccountType.JOINT_TENANCY_WITH_ROS.ordinal()] = 13;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[ApiTransferAccount.TransferAccountType.RHY_BANKING.ordinal()] = 14;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[ApiTransferAccount.TransferAccountType.RHUK_ISA_STOCKS_AND_SHARES.ordinal()] = 15;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[ApiTransferAccount.TransferAccountType.CUSTODIAL_UGMA.ordinal()] = 16;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[ApiTransferAccount.TransferAccountType.CUSTODIAL_UTMA.ordinal()] = 17;
            } catch (NoSuchFieldError unused19) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static /* synthetic */ MatchaReviewTransactionDataState copy$default(MatchaReviewTransactionDataState matchaReviewTransactionDataState, Money money, SourceOfFunds sourceOfFunds, Direction direction, Transactor transactor, String str, boolean z, UUID uuid, TransferAccount transferAccount, UUID uuid2, MatchaIncentivesSummary matchaIncentivesSummary, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            money = matchaReviewTransactionDataState.amount;
        }
        if ((i & 2) != 0) {
            sourceOfFunds = matchaReviewTransactionDataState.sourceOfFunds;
        }
        if ((i & 4) != 0) {
            direction = matchaReviewTransactionDataState.direction;
        }
        if ((i & 8) != 0) {
            transactor = matchaReviewTransactionDataState.transactor;
        }
        if ((i & 16) != 0) {
            str = matchaReviewTransactionDataState.memo;
        }
        if ((i & 32) != 0) {
            z = matchaReviewTransactionDataState.showLoading;
        }
        if ((i & 64) != 0) {
            uuid = matchaReviewTransactionDataState.transferId;
        }
        if ((i & 128) != 0) {
            transferAccount = matchaReviewTransactionDataState.selectedTransferAccount;
        }
        if ((i & 256) != 0) {
            uuid2 = matchaReviewTransactionDataState.requestId;
        }
        if ((i & 512) != 0) {
            matchaIncentivesSummary = matchaReviewTransactionDataState.incentivesSummary;
        }
        if ((i & 1024) != 0) {
            z2 = matchaReviewTransactionDataState.isMatchaIncentivesExperimentMember;
        }
        MatchaIncentivesSummary matchaIncentivesSummary2 = matchaIncentivesSummary;
        boolean z3 = z2;
        TransferAccount transferAccount2 = transferAccount;
        UUID uuid3 = uuid2;
        boolean z4 = z;
        UUID uuid4 = uuid;
        String str2 = str;
        Direction direction2 = direction;
        return matchaReviewTransactionDataState.copy(money, sourceOfFunds, direction2, transactor, str2, z4, uuid4, transferAccount2, uuid3, matchaIncentivesSummary2, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final Money getAmount() {
        return this.amount;
    }

    /* renamed from: component10, reason: from getter */
    public final MatchaIncentivesSummary getIncentivesSummary() {
        return this.incentivesSummary;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getIsMatchaIncentivesExperimentMember() {
        return this.isMatchaIncentivesExperimentMember;
    }

    /* renamed from: component2, reason: from getter */
    public final SourceOfFunds getSourceOfFunds() {
        return this.sourceOfFunds;
    }

    /* renamed from: component3, reason: from getter */
    public final Direction getDirection() {
        return this.direction;
    }

    /* renamed from: component4, reason: from getter */
    public final Transactor getTransactor() {
        return this.transactor;
    }

    /* renamed from: component5, reason: from getter */
    public final String getMemo() {
        return this.memo;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getShowLoading() {
        return this.showLoading;
    }

    /* renamed from: component7, reason: from getter */
    public final UUID getTransferId() {
        return this.transferId;
    }

    /* renamed from: component8, reason: from getter */
    public final TransferAccount getSelectedTransferAccount() {
        return this.selectedTransferAccount;
    }

    /* renamed from: component9, reason: from getter */
    public final UUID getRequestId() {
        return this.requestId;
    }

    public final MatchaReviewTransactionDataState copy(Money amount, SourceOfFunds sourceOfFunds, Direction direction, Transactor transactor, String memo, boolean showLoading, UUID transferId, TransferAccount selectedTransferAccount, UUID requestId, MatchaIncentivesSummary incentivesSummary, boolean isMatchaIncentivesExperimentMember) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(transactor, "transactor");
        return new MatchaReviewTransactionDataState(amount, sourceOfFunds, direction, transactor, memo, showLoading, transferId, selectedTransferAccount, requestId, incentivesSummary, isMatchaIncentivesExperimentMember);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MatchaReviewTransactionDataState)) {
            return false;
        }
        MatchaReviewTransactionDataState matchaReviewTransactionDataState = (MatchaReviewTransactionDataState) other;
        return Intrinsics.areEqual(this.amount, matchaReviewTransactionDataState.amount) && Intrinsics.areEqual(this.sourceOfFunds, matchaReviewTransactionDataState.sourceOfFunds) && this.direction == matchaReviewTransactionDataState.direction && Intrinsics.areEqual(this.transactor, matchaReviewTransactionDataState.transactor) && Intrinsics.areEqual(this.memo, matchaReviewTransactionDataState.memo) && this.showLoading == matchaReviewTransactionDataState.showLoading && Intrinsics.areEqual(this.transferId, matchaReviewTransactionDataState.transferId) && Intrinsics.areEqual(this.selectedTransferAccount, matchaReviewTransactionDataState.selectedTransferAccount) && Intrinsics.areEqual(this.requestId, matchaReviewTransactionDataState.requestId) && Intrinsics.areEqual(this.incentivesSummary, matchaReviewTransactionDataState.incentivesSummary) && this.isMatchaIncentivesExperimentMember == matchaReviewTransactionDataState.isMatchaIncentivesExperimentMember;
    }

    public int hashCode() {
        int iHashCode = this.amount.hashCode() * 31;
        SourceOfFunds sourceOfFunds = this.sourceOfFunds;
        int iHashCode2 = (((((iHashCode + (sourceOfFunds == null ? 0 : sourceOfFunds.hashCode())) * 31) + this.direction.hashCode()) * 31) + this.transactor.hashCode()) * 31;
        String str = this.memo;
        int iHashCode3 = (((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.showLoading)) * 31;
        UUID uuid = this.transferId;
        int iHashCode4 = (iHashCode3 + (uuid == null ? 0 : uuid.hashCode())) * 31;
        TransferAccount transferAccount = this.selectedTransferAccount;
        int iHashCode5 = (iHashCode4 + (transferAccount == null ? 0 : transferAccount.hashCode())) * 31;
        UUID uuid2 = this.requestId;
        int iHashCode6 = (iHashCode5 + (uuid2 == null ? 0 : uuid2.hashCode())) * 31;
        MatchaIncentivesSummary matchaIncentivesSummary = this.incentivesSummary;
        return ((iHashCode6 + (matchaIncentivesSummary != null ? matchaIncentivesSummary.hashCode() : 0)) * 31) + Boolean.hashCode(this.isMatchaIncentivesExperimentMember);
    }

    public String toString() {
        return "MatchaReviewTransactionDataState(amount=" + this.amount + ", sourceOfFunds=" + this.sourceOfFunds + ", direction=" + this.direction + ", transactor=" + this.transactor + ", memo=" + this.memo + ", showLoading=" + this.showLoading + ", transferId=" + this.transferId + ", selectedTransferAccount=" + this.selectedTransferAccount + ", requestId=" + this.requestId + ", incentivesSummary=" + this.incentivesSummary + ", isMatchaIncentivesExperimentMember=" + this.isMatchaIncentivesExperimentMember + ")";
    }

    public MatchaReviewTransactionDataState(Money amount, SourceOfFunds sourceOfFunds, Direction direction, Transactor transactor, String str, boolean z, UUID uuid, TransferAccount transferAccount, UUID uuid2, MatchaIncentivesSummary matchaIncentivesSummary, boolean z2) {
        NumberFormatter amountFormat;
        StringResource stringResourceInvoke;
        StringResource stringResourceInvoke2;
        MatchaReviewTransactionViewState2 visible;
        int i;
        MatchaReviewTransactionViewState3 memo;
        String str2 = str;
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(transactor, "transactor");
        this.amount = amount;
        this.sourceOfFunds = sourceOfFunds;
        this.direction = direction;
        this.transactor = transactor;
        this.memo = str2;
        this.showLoading = z;
        this.transferId = uuid;
        this.selectedTransferAccount = transferAccount;
        this.requestId = uuid2;
        this.incentivesSummary = matchaIncentivesSummary;
        this.isMatchaIncentivesExperimentMember = z2;
        String displayName = transactor.getDisplayName();
        this.transactorName = displayName;
        if (transactor instanceof Transactor.Email) {
            displayName = ((Transactor.Email) transactor).getEmail();
        } else if (transactor instanceof Transactor.Phone) {
            displayName = UtilsKt.formatPhoneNumber(((Transactor.Phone) transactor).getPhoneNumber());
        } else if (!(transactor instanceof Transactor.User)) {
            throw new NoWhenBranchMatchedException();
        }
        this.transactorDisplayId = displayName;
        BigDecimal decimalValue = amount.getDecimalValue();
        if (BigDecimals7.isInteger(decimalValue)) {
            amountFormat = Formats.getWholeNumberAmountFormat();
        } else {
            amountFormat = Formats.getAmountFormat();
        }
        String str3 = amountFormat.format(decimalValue);
        this.amountText = str3;
        StringResource stringResourceInvoke3 = null;
        if (transactor instanceof Transactor.User) {
            StringResource.Companion companion = StringResource.INSTANCE;
            String username = ((Transactor.User) transactor).getUser().getUsername();
            stringResourceInvoke = companion.invoke(username == null ? transactor.getDisplayName() : username);
        } else {
            if (!(transactor instanceof Transactor.Email) && !(transactor instanceof Transactor.Phone)) {
                throw new NoWhenBranchMatchedException();
            }
            stringResourceInvoke = null;
        }
        this.secondaryText = stringResourceInvoke;
        if (transactor instanceof Transactor.User) {
            stringResourceInvoke2 = StringResource.INSTANCE.invoke(C21284R.string.matcha_transfer_review_user_summary, displayName, str3);
        } else {
            if (!(transactor instanceof Transactor.Email) && !(transactor instanceof Transactor.Phone)) {
                throw new NoWhenBranchMatchedException();
            }
            stringResourceInvoke2 = StringResource.INSTANCE.invoke(C21284R.string.matcha_transfer_review_non_user_summary, str3, displayName);
        }
        this.summary = stringResourceInvoke2;
        ApiTransferAccount.TransferAccountType type2 = sourceOfFunds != null ? sourceOfFunds.getType() : null;
        switch (type2 == null ? -1 : WhenMappings.$EnumSwitchMapping$1[type2.ordinal()]) {
            case -1:
            case 1:
                break;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 2:
                stringResourceInvoke3 = StringResource.INSTANCE.invoke(C21284R.string.matcha_transfer_brokerage_source_suffix, new Object[0]);
                break;
            case 3:
                stringResourceInvoke3 = StringResource.INSTANCE.invoke(C21284R.string.matcha_transfer_debit_card_source_suffix, new Object[0]);
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                Preconditions.INSTANCE.failUnexpectedItemKotlin(type2);
                throw new ExceptionsH();
        }
        this.summarySourceOfFundsSuffix = stringResourceInvoke3;
        if (matchaIncentivesSummary == null || !z2 || matchaIncentivesSummary.getInvitedUserIncentiveIsAtMax() || BigDecimals7.isZero(matchaIncentivesSummary.getInvitedUserIncentiveAmount()) || (transactor instanceof Transactor.User)) {
            visible = MatchaReviewTransactionViewState2.Hidden.INSTANCE;
        } else {
            StringResource.Companion companion2 = StringResource.INSTANCE;
            int i2 = WhenMappings.$EnumSwitchMapping$0[direction.ordinal()];
            if (i2 == 1) {
                i = C21284R.string.matcha_transaction_review_send_incentives_banner_text;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = C21284R.string.matcha_transaction_review_request_incentives_banner_text;
            }
            visible = new MatchaReviewTransactionViewState2.Visible(companion2.invoke(i, Money.format$default(Money3.toMoney(matchaIncentivesSummary.getInvitedUserIncentiveAmount(), Currencies.USD), null, false, null, false, 0, null, false, null, false, false, ErrorCodes.IO_EXCEPTION, null)), companion2.invoke(C21284R.string.matcha_transaction_review_incentives_banner_cta, new Object[0]));
        }
        this.bannerViewState = visible;
        if (uuid2 == null) {
            if (str2 == null || StringsKt.isBlank(str2)) {
                memo = MatchaReviewTransactionViewState3.AddMemo.INSTANCE;
            } else {
                memo = new MatchaReviewTransactionViewState3.Memo(str2, true);
            }
        } else {
            memo = new MatchaReviewTransactionViewState3.Memo(str2 == null ? "" : str2, false);
        }
        this.memoState = memo;
    }

    public /* synthetic */ MatchaReviewTransactionDataState(Money money, SourceOfFunds sourceOfFunds, Direction direction, Transactor transactor, String str, boolean z, UUID uuid, TransferAccount transferAccount, UUID uuid2, MatchaIncentivesSummary matchaIncentivesSummary, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(money, sourceOfFunds, direction, transactor, (i & 16) != 0 ? null : str, (i & 32) != 0 ? false : z, (i & 64) != 0 ? null : uuid, (i & 128) != 0 ? null : transferAccount, (i & 256) != 0 ? null : uuid2, (i & 512) != 0 ? null : matchaIncentivesSummary, (i & 1024) != 0 ? false : z2);
    }

    public final Money getAmount() {
        return this.amount;
    }

    public final SourceOfFunds getSourceOfFunds() {
        return this.sourceOfFunds;
    }

    public final Direction getDirection() {
        return this.direction;
    }

    public final Transactor getTransactor() {
        return this.transactor;
    }

    public final String getMemo() {
        return this.memo;
    }

    public final boolean getShowLoading() {
        return this.showLoading;
    }

    public final UUID getTransferId() {
        return this.transferId;
    }

    public final TransferAccount getSelectedTransferAccount() {
        return this.selectedTransferAccount;
    }

    public final UUID getRequestId() {
        return this.requestId;
    }

    public final MatchaIncentivesSummary getIncentivesSummary() {
        return this.incentivesSummary;
    }

    public final boolean isMatchaIncentivesExperimentMember() {
        return this.isMatchaIncentivesExperimentMember;
    }

    public final boolean hasInsufficientFunds(TransferAccount selectedTransferAccount) {
        return this.direction == Direction.SEND && selectedTransferAccount != null && selectedTransferAccount.getWithdrawableCash() != null && this.amount.getDecimalValue().compareTo(selectedTransferAccount.getWithdrawableCash()) > 0;
    }

    public final String getTransactorName() {
        return this.transactorName;
    }

    public final String getTransactorDisplayId() {
        return this.transactorDisplayId;
    }

    public final String getAmountText() {
        return this.amountText;
    }

    public final StringResource getPrimaryText() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.direction.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return StringResource.INSTANCE.invoke(C21284R.string.matcha_request_review_title, this.amountText, this.transactorName);
        }
        Transactor transactor = this.transactor;
        if (transactor instanceof Transactor.User) {
            return StringResource.INSTANCE.invoke(C21284R.string.matcha_transfer_review_user_title, this.transactorName, this.amountText);
        }
        if (!(transactor instanceof Transactor.Email) && !(transactor instanceof Transactor.Phone)) {
            throw new NoWhenBranchMatchedException();
        }
        if (transactor.getIsContact()) {
            return StringResource.INSTANCE.invoke(C21284R.string.matcha_transfer_review_user_title, this.transactorName, this.amountText);
        }
        return StringResource.INSTANCE.invoke(C21284R.string.matcha_transfer_review_non_user_title, this.amountText, this.transactorName);
    }

    public final StringResource getSecondaryText() {
        return this.secondaryText;
    }

    public final StringResource getSummary() {
        return this.summary;
    }

    public final StringResource getSummarySourceOfFundsSuffix() {
        return this.summarySourceOfFundsSuffix;
    }

    public final MatchaReviewTransactionViewState2 getBannerViewState() {
        return this.bannerViewState;
    }

    public final MatchaReviewTransactionViewState3 getMemoState() {
        return this.memoState;
    }

    /* compiled from: MatchaReviewTransactionDataState.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/review/MatchaReviewTransactionDataState$Companion;", "", "<init>", "()V", "initial", "Lcom/robinhood/android/matcha/ui/review/MatchaReviewTransactionDataState;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final MatchaReviewTransactionDataState initial(SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            MatchaReviewTransactionDuxo.Companion companion = MatchaReviewTransactionDuxo.Companion;
            Money amount = ((MatchaReviewTransactionFragment.Args) companion.getArgs(savedStateHandle)).getAmount();
            Direction direction = ((MatchaReviewTransactionFragment.Args) companion.getArgs(savedStateHandle)).getDirection();
            Transactor transactor = ((MatchaReviewTransactionFragment.Args) companion.getArgs(savedStateHandle)).getTransactor();
            return new MatchaReviewTransactionDataState(amount, ((MatchaReviewTransactionFragment.Args) companion.getArgs(savedStateHandle)).getSourceOfFunds(), direction, transactor, ((MatchaReviewTransactionFragment.Args) companion.getArgs(savedStateHandle)).getMemo(), false, (UUID) savedStateHandle.get("transferId"), null, ((MatchaReviewTransactionFragment.Args) companion.getArgs(savedStateHandle)).getRequestId(), null, false, 1696, null);
        }
    }
}
