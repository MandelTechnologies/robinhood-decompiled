package com.robinhood.android.transfers.ach.p265ui.posttransfer;

import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.StyleSpan;
import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.account.strings.DisplayName;
import com.robinhood.android.ach.format.C8331R;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.util.TransitionReason;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.transfers.ach.C30082R;
import com.robinhood.enums.RhEnum;
import com.robinhood.models.api.ApiAutomaticDeposit;
import com.robinhood.models.api.IavAccount;
import com.robinhood.models.crypto.p314db.BrokerageBalances;
import com.robinhood.models.crypto.p314db.UnifiedBalances;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.models.p320db.AutomaticDeposit;
import com.robinhood.models.p320db.TransferDirection;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.transfers.models.p406db.AchTransfer;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import java.math.BigDecimal;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.LocalDate;

/* compiled from: AchTransferConfirmationViewState.kt */
@Metadata(m3635d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 a2\u00020\u0001:\u0005]^_`aB\u0093\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\t\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\t\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u00101\u001a\u0004\u0018\u0001022\u0006\u00103\u001a\u000204J \u00105\u001a\u0002022\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u00103\u001a\u000204H\u0002J\u0010\u00106\u001a\u00020#2\u0006\u00107\u001a\u00020\u0007H\u0002J\u0018\u00108\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00107\u001a\u00020\u0007H\u0002J\u0018\u00109\u001a\u0002022\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u00103\u001a\u000204H\u0002J\b\u0010:\u001a\u0004\u0018\u00010;J\b\u0010<\u001a\u0004\u0018\u00010;J\b\u0010=\u001a\u0004\u0018\u00010;J\b\u0010>\u001a\u0004\u0018\u00010;J\u0010\u0010?\u001a\u00020#2\u0006\u0010@\u001a\u00020AH\u0002J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u0010\u0010G\u001a\u0004\u0018\u00010\u0005HÀ\u0003¢\u0006\u0002\bHJ\u000b\u0010I\u001a\u0004\u0018\u00010\u0007HÂ\u0003J\t\u0010J\u001a\u00020\tHÂ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u000bHÂ\u0003J\t\u0010L\u001a\u00020\tHÂ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u000eHÂ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0010HÂ\u0003J\u0010\u0010O\u001a\u0004\u0018\u00010\u0012HÀ\u0003¢\u0006\u0002\bPJ\u000e\u0010Q\u001a\u00020\tHÀ\u0003¢\u0006\u0002\bRJ\u0010\u0010S\u001a\u0004\u0018\u00010\u0015HÀ\u0003¢\u0006\u0002\bTJ\t\u0010U\u001a\u00020\tHÂ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u000bHÂ\u0003J\u009d\u0001\u0010W\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\t2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\t2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010X\u001a\u00020\t2\b\u0010Y\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010Z\u001a\u00020#HÖ\u0001J\t\u0010[\u001a\u00020\\HÖ\u0001R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0013\u001a\u00020\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u000e\u0010\u0016\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010%\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001fR\u0010\u0010&\u001a\u0004\u0018\u00010'X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010(\u001a\u00020#¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010+\u001a\u00020,¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010/\u001a\u0004\u0018\u00010,¢\u0006\b\n\u0000\u001a\u0004\b0\u0010.R\u0013\u0010B\u001a\u0004\u0018\u00010C¢\u0006\b\n\u0000\u001a\u0004\bD\u0010E¨\u0006b"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/posttransfer/AchTransferConfirmationViewState;", "", "achTransfer", "Lcom/robinhood/transfers/models/db/AchTransfer;", "achRelationship", "Lcom/robinhood/models/db/AchRelationship;", TransitionReason.ACH_TRANSFER_AUTOMATIC_DEPOSIT, "Lcom/robinhood/models/db/AutomaticDeposit;", "isQueuedDeposit", "", "maxEarlyAccessAmount", "Ljava/math/BigDecimal;", "isFromOnboardingRadExp", "amountMoney", "Lcom/robinhood/models/util/Money;", "account", "Lcom/robinhood/models/api/IavAccount;", "destAutomaticDepositAccount", "Lcom/robinhood/models/db/Account;", "isApplicationApproved", "balances", "Lcom/robinhood/models/crypto/db/UnifiedBalances;", "shouldCleanupOnboardingRecurringContent", "unclearedDeposits", "<init>", "(Lcom/robinhood/transfers/models/db/AchTransfer;Lcom/robinhood/models/db/AchRelationship;Lcom/robinhood/models/db/AutomaticDeposit;ZLjava/math/BigDecimal;ZLcom/robinhood/models/util/Money;Lcom/robinhood/models/api/IavAccount;Lcom/robinhood/models/db/Account;ZLcom/robinhood/models/crypto/db/UnifiedBalances;ZLjava/math/BigDecimal;)V", "getAchRelationship$feature_legacy_ach_transfers_externalDebug", "()Lcom/robinhood/models/db/AchRelationship;", "getDestAutomaticDepositAccount$feature_legacy_ach_transfers_externalDebug", "()Lcom/robinhood/models/db/Account;", "isApplicationApproved$feature_legacy_ach_transfers_externalDebug", "()Z", "getBalances$feature_legacy_ach_transfers_externalDebug", "()Lcom/robinhood/models/crypto/db/UnifiedBalances;", "numTrueConditions", "", "isInstantDeposit", "isInputValid", "queuedDepositContentCleanup", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/QueuedDepositConfirmationContent;", "titleText", "getTitleText", "()I", "doneButton", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/AchTransferConfirmationViewState$Button;", "getDoneButton", "()Lcom/robinhood/android/transfers/ach/ui/posttransfer/AchTransferConfirmationViewState$Button;", "detailButton", "getDetailButton", "getDetailText", "", "res", "Landroid/content/res/Resources;", "getSingleTransferMessage", "getFrequencyExplanationResId", "currentAutomaticDeposit", "getRecurringDepositRevampMessage", "getRecurringTransferMessage", "getAmountText", "Lcom/robinhood/utils/resource/StringResource;", "getAccountNameText", "getCurrentBalanceText", "getDisclaimerConfirmationText", "getRecurringAutomaticDepositFrequencyNameRes", "frequency", "Lcom/robinhood/models/api/ApiAutomaticDeposit$Frequency;", "messageDialog", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/AchTransferConfirmationViewState$Dialog;", "getMessageDialog", "()Lcom/robinhood/android/transfers/ach/ui/posttransfer/AchTransferConfirmationViewState$Dialog;", "component1", "component2", "component2$feature_legacy_ach_transfers_externalDebug", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component9$feature_legacy_ach_transfers_externalDebug", "component10", "component10$feature_legacy_ach_transfers_externalDebug", "component11", "component11$feature_legacy_ach_transfers_externalDebug", "component12", "component13", "copy", "equals", "other", "hashCode", "toString", "", "Dialog", "DialogButton", "Button", "Action", "Companion", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final /* data */ class AchTransferConfirmationViewState {
    private static final String INSTANT_ELIGIBILITY_TAG = "instant-eligibility-dialog";
    private final IavAccount account;
    private final AchRelationship achRelationship;
    private final AchTransfer achTransfer;
    private final Money amountMoney;
    private final AutomaticDeposit automaticDeposit;
    private final UnifiedBalances balances;
    private final Account destAutomaticDepositAccount;
    private final Button detailButton;
    private final Button doneButton;
    private final boolean isApplicationApproved;
    private final boolean isFromOnboardingRadExp;
    private final boolean isInputValid;
    private final boolean isInstantDeposit;
    private final boolean isQueuedDeposit;
    private final BigDecimal maxEarlyAccessAmount;
    private final Dialog messageDialog;
    private int numTrueConditions;
    private final OnboardingDepositConfirmationContent queuedDepositContentCleanup;
    private final boolean shouldCleanupOnboardingRecurringContent;
    private final int titleText;
    private final BigDecimal unclearedDeposits;
    public static final int $stable = 8;

    /* compiled from: AchTransferConfirmationViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[TransferDirection.values().length];
            try {
                iArr[TransferDirection.DEPOSIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransferDirection.WITHDRAW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ApiAutomaticDeposit.Frequency.values().length];
            try {
                iArr2[ApiAutomaticDeposit.Frequency.ONCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ApiAutomaticDeposit.Frequency.WEEKLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ApiAutomaticDeposit.Frequency.BIWEEKLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ApiAutomaticDeposit.Frequency.MONTHLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ApiAutomaticDeposit.Frequency.QUARTERLY.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[OnboardingDepositConfirmationContent.values().length];
            try {
                iArr3[OnboardingDepositConfirmationContent.APPROVED_WITH_ALL_INSTANT_DEPOSIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[OnboardingDepositConfirmationContent.NOT_APPROVED_DEPOSIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[OnboardingDepositConfirmationContent.APPROVED_WITH_PARTIAL_INSTANT_DEPOSIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[Account.InstantEligibility.State.values().length];
            try {
                iArr4[Account.InstantEligibility.State.IN_REVIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[Account.InstantEligibility.State.PENDING_DEPOSIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[Account.InstantEligibility.State.SUSPENDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[Account.InstantEligibility.State.f5666OK.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[Account.InstantEligibility.State.REVOKED.ordinal()] = 5;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    /* renamed from: component1, reason: from getter */
    private final AchTransfer getAchTransfer() {
        return this.achTransfer;
    }

    /* renamed from: component12, reason: from getter */
    private final boolean getShouldCleanupOnboardingRecurringContent() {
        return this.shouldCleanupOnboardingRecurringContent;
    }

    /* renamed from: component13, reason: from getter */
    private final BigDecimal getUnclearedDeposits() {
        return this.unclearedDeposits;
    }

    /* renamed from: component3, reason: from getter */
    private final AutomaticDeposit getAutomaticDeposit() {
        return this.automaticDeposit;
    }

    /* renamed from: component4, reason: from getter */
    private final boolean getIsQueuedDeposit() {
        return this.isQueuedDeposit;
    }

    /* renamed from: component5, reason: from getter */
    private final BigDecimal getMaxEarlyAccessAmount() {
        return this.maxEarlyAccessAmount;
    }

    /* renamed from: component6, reason: from getter */
    private final boolean getIsFromOnboardingRadExp() {
        return this.isFromOnboardingRadExp;
    }

    /* renamed from: component7, reason: from getter */
    private final Money getAmountMoney() {
        return this.amountMoney;
    }

    /* renamed from: component8, reason: from getter */
    private final IavAccount getAccount() {
        return this.account;
    }

    public static /* synthetic */ AchTransferConfirmationViewState copy$default(AchTransferConfirmationViewState achTransferConfirmationViewState, AchTransfer achTransfer, AchRelationship achRelationship, AutomaticDeposit automaticDeposit, boolean z, BigDecimal bigDecimal, boolean z2, Money money, IavAccount iavAccount, Account account, boolean z3, UnifiedBalances unifiedBalances, boolean z4, BigDecimal bigDecimal2, int i, Object obj) {
        if ((i & 1) != 0) {
            achTransfer = achTransferConfirmationViewState.achTransfer;
        }
        return achTransferConfirmationViewState.copy(achTransfer, (i & 2) != 0 ? achTransferConfirmationViewState.achRelationship : achRelationship, (i & 4) != 0 ? achTransferConfirmationViewState.automaticDeposit : automaticDeposit, (i & 8) != 0 ? achTransferConfirmationViewState.isQueuedDeposit : z, (i & 16) != 0 ? achTransferConfirmationViewState.maxEarlyAccessAmount : bigDecimal, (i & 32) != 0 ? achTransferConfirmationViewState.isFromOnboardingRadExp : z2, (i & 64) != 0 ? achTransferConfirmationViewState.amountMoney : money, (i & 128) != 0 ? achTransferConfirmationViewState.account : iavAccount, (i & 256) != 0 ? achTransferConfirmationViewState.destAutomaticDepositAccount : account, (i & 512) != 0 ? achTransferConfirmationViewState.isApplicationApproved : z3, (i & 1024) != 0 ? achTransferConfirmationViewState.balances : unifiedBalances, (i & 2048) != 0 ? achTransferConfirmationViewState.shouldCleanupOnboardingRecurringContent : z4, (i & 4096) != 0 ? achTransferConfirmationViewState.unclearedDeposits : bigDecimal2);
    }

    /* renamed from: component10$feature_legacy_ach_transfers_externalDebug, reason: from getter */
    public final boolean getIsApplicationApproved() {
        return this.isApplicationApproved;
    }

    /* renamed from: component11$feature_legacy_ach_transfers_externalDebug, reason: from getter */
    public final UnifiedBalances getBalances() {
        return this.balances;
    }

    /* renamed from: component2$feature_legacy_ach_transfers_externalDebug, reason: from getter */
    public final AchRelationship getAchRelationship() {
        return this.achRelationship;
    }

    /* renamed from: component9$feature_legacy_ach_transfers_externalDebug, reason: from getter */
    public final Account getDestAutomaticDepositAccount() {
        return this.destAutomaticDepositAccount;
    }

    public final AchTransferConfirmationViewState copy(AchTransfer achTransfer, AchRelationship achRelationship, AutomaticDeposit automaticDeposit, boolean isQueuedDeposit, BigDecimal maxEarlyAccessAmount, boolean isFromOnboardingRadExp, Money amountMoney, IavAccount account, Account destAutomaticDepositAccount, boolean isApplicationApproved, UnifiedBalances balances, boolean shouldCleanupOnboardingRecurringContent, BigDecimal unclearedDeposits) {
        return new AchTransferConfirmationViewState(achTransfer, achRelationship, automaticDeposit, isQueuedDeposit, maxEarlyAccessAmount, isFromOnboardingRadExp, amountMoney, account, destAutomaticDepositAccount, isApplicationApproved, balances, shouldCleanupOnboardingRecurringContent, unclearedDeposits);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AchTransferConfirmationViewState)) {
            return false;
        }
        AchTransferConfirmationViewState achTransferConfirmationViewState = (AchTransferConfirmationViewState) other;
        return Intrinsics.areEqual(this.achTransfer, achTransferConfirmationViewState.achTransfer) && Intrinsics.areEqual(this.achRelationship, achTransferConfirmationViewState.achRelationship) && Intrinsics.areEqual(this.automaticDeposit, achTransferConfirmationViewState.automaticDeposit) && this.isQueuedDeposit == achTransferConfirmationViewState.isQueuedDeposit && Intrinsics.areEqual(this.maxEarlyAccessAmount, achTransferConfirmationViewState.maxEarlyAccessAmount) && this.isFromOnboardingRadExp == achTransferConfirmationViewState.isFromOnboardingRadExp && Intrinsics.areEqual(this.amountMoney, achTransferConfirmationViewState.amountMoney) && Intrinsics.areEqual(this.account, achTransferConfirmationViewState.account) && Intrinsics.areEqual(this.destAutomaticDepositAccount, achTransferConfirmationViewState.destAutomaticDepositAccount) && this.isApplicationApproved == achTransferConfirmationViewState.isApplicationApproved && Intrinsics.areEqual(this.balances, achTransferConfirmationViewState.balances) && this.shouldCleanupOnboardingRecurringContent == achTransferConfirmationViewState.shouldCleanupOnboardingRecurringContent && Intrinsics.areEqual(this.unclearedDeposits, achTransferConfirmationViewState.unclearedDeposits);
    }

    public int hashCode() {
        AchTransfer achTransfer = this.achTransfer;
        int iHashCode = (achTransfer == null ? 0 : achTransfer.hashCode()) * 31;
        AchRelationship achRelationship = this.achRelationship;
        int iHashCode2 = (iHashCode + (achRelationship == null ? 0 : achRelationship.hashCode())) * 31;
        AutomaticDeposit automaticDeposit = this.automaticDeposit;
        int iHashCode3 = (((iHashCode2 + (automaticDeposit == null ? 0 : automaticDeposit.hashCode())) * 31) + Boolean.hashCode(this.isQueuedDeposit)) * 31;
        BigDecimal bigDecimal = this.maxEarlyAccessAmount;
        int iHashCode4 = (((iHashCode3 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31) + Boolean.hashCode(this.isFromOnboardingRadExp)) * 31;
        Money money = this.amountMoney;
        int iHashCode5 = (iHashCode4 + (money == null ? 0 : money.hashCode())) * 31;
        IavAccount iavAccount = this.account;
        int iHashCode6 = (iHashCode5 + (iavAccount == null ? 0 : iavAccount.hashCode())) * 31;
        Account account = this.destAutomaticDepositAccount;
        int iHashCode7 = (((iHashCode6 + (account == null ? 0 : account.hashCode())) * 31) + Boolean.hashCode(this.isApplicationApproved)) * 31;
        UnifiedBalances unifiedBalances = this.balances;
        int iHashCode8 = (((iHashCode7 + (unifiedBalances == null ? 0 : unifiedBalances.hashCode())) * 31) + Boolean.hashCode(this.shouldCleanupOnboardingRecurringContent)) * 31;
        BigDecimal bigDecimal2 = this.unclearedDeposits;
        return iHashCode8 + (bigDecimal2 != null ? bigDecimal2.hashCode() : 0);
    }

    public String toString() {
        return "AchTransferConfirmationViewState(achTransfer=" + this.achTransfer + ", achRelationship=" + this.achRelationship + ", automaticDeposit=" + this.automaticDeposit + ", isQueuedDeposit=" + this.isQueuedDeposit + ", maxEarlyAccessAmount=" + this.maxEarlyAccessAmount + ", isFromOnboardingRadExp=" + this.isFromOnboardingRadExp + ", amountMoney=" + this.amountMoney + ", account=" + this.account + ", destAutomaticDepositAccount=" + this.destAutomaticDepositAccount + ", isApplicationApproved=" + this.isApplicationApproved + ", balances=" + this.balances + ", shouldCleanupOnboardingRecurringContent=" + this.shouldCleanupOnboardingRecurringContent + ", unclearedDeposits=" + this.unclearedDeposits + ")";
    }

    public AchTransferConfirmationViewState(AchTransfer achTransfer, AchRelationship achRelationship, AutomaticDeposit automaticDeposit, boolean z, BigDecimal bigDecimal, boolean z2, Money money, IavAccount iavAccount, Account account, boolean z3, UnifiedBalances unifiedBalances, boolean z4, BigDecimal bigDecimal2) {
        OnboardingDepositConfirmationContent onboardingDepositConfirmationContent;
        int titleText;
        Button button;
        Button button2;
        BrokerageBalances brokerageBalances;
        Account account2;
        StringResource stringResourceInvoke;
        StringResource stringResourceInvoke2;
        this.achTransfer = achTransfer;
        this.achRelationship = achRelationship;
        this.automaticDeposit = automaticDeposit;
        this.isQueuedDeposit = z;
        this.maxEarlyAccessAmount = bigDecimal;
        this.isFromOnboardingRadExp = z2;
        this.amountMoney = money;
        this.account = iavAccount;
        this.destAutomaticDepositAccount = account;
        this.isApplicationApproved = z3;
        this.balances = unifiedBalances;
        this.shouldCleanupOnboardingRecurringContent = z4;
        this.unclearedDeposits = bigDecimal2;
        if (achTransfer != null) {
            this.numTrueConditions++;
        }
        if (automaticDeposit != null) {
            this.numTrueConditions++;
        }
        if (z) {
            this.numTrueConditions++;
        }
        Dialog dialog = null;
        boolean z5 = (achTransfer != null ? achTransfer.getDirection() : null) == TransferDirection.DEPOSIT && BigDecimals7.isPositive(bigDecimal);
        this.isInstantDeposit = z5;
        this.isInputValid = this.numTrueConditions == 1;
        if (!z || money == null) {
            onboardingDepositConfirmationContent = null;
        } else if (!z3) {
            onboardingDepositConfirmationContent = OnboardingDepositConfirmationContent.NOT_APPROVED_DEPOSIT;
        } else if (bigDecimal != null && money.getDecimalValue().compareTo(bigDecimal) <= 0) {
            onboardingDepositConfirmationContent = OnboardingDepositConfirmationContent.APPROVED_WITH_ALL_INSTANT_DEPOSIT;
        } else {
            onboardingDepositConfirmationContent = OnboardingDepositConfirmationContent.APPROVED_WITH_PARTIAL_INSTANT_DEPOSIT;
        }
        this.queuedDepositContentCleanup = onboardingDepositConfirmationContent;
        if (onboardingDepositConfirmationContent != null) {
            titleText = onboardingDepositConfirmationContent.getTitleText();
        } else if (achTransfer != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[achTransfer.getDirection().ordinal()];
            if (i == 1) {
                titleText = C30082R.string.ach_transfer_confirmation_deposit_title;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                titleText = C30082R.string.ach_transfer_confirmation_withdraw_title;
            }
        } else if (automaticDeposit != null) {
            if (!z2) {
                titleText = C30082R.string.ach_transfer_confirmation_auto_deposit_title;
            } else if (z4) {
                titleText = C30082R.string.ach_transfer_confirmation_auto_deposit_title_revamp;
            } else {
                titleText = C30082R.string.ach_transfer_confirmation_auto_deposit_title_v2;
            }
        } else if (z3) {
            titleText = C30082R.string.ach_transfer_confirmation_queued_deposit_title_approved;
        } else {
            titleText = C30082R.string.ach_transfer_confirmation_queued_deposit_title_not_approved;
        }
        this.titleText = titleText;
        if (onboardingDepositConfirmationContent != null) {
            button = new Button(StringResource.INSTANCE.invoke(onboardingDepositConfirmationContent.getDoneButton(), new Object[0]), Action.FINISH);
        } else if (z5) {
            button = new Button(StringResource.INSTANCE.invoke(C11048R.string.general_label_continue, new Object[0]), Action.SHOW_INSTANT_DEPOSIT_PAGE);
        } else if (z2 && z4) {
            button = new Button(StringResource.INSTANCE.invoke(C11048R.string.general_label_continue, new Object[0]), Action.FINISH);
        } else {
            button = new Button(StringResource.INSTANCE.invoke(C11048R.string.general_label_got_it, new Object[0]), Action.FINISH);
        }
        this.doneButton = button;
        if (z5 || achTransfer == null) {
            button2 = null;
        } else {
            int i2 = WhenMappings.$EnumSwitchMapping$0[achTransfer.getDirection().ordinal()];
            if (i2 == 1) {
                stringResourceInvoke2 = StringResource.INSTANCE.invoke(C30082R.string.ach_transfer_confirmation_view_deposit_transfer_detail_label, new Object[0]);
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                stringResourceInvoke2 = StringResource.INSTANCE.invoke(C30082R.string.ach_transfer_confirmation_view_withdraw_transfer_detail_label, new Object[0]);
            }
            button2 = new Button(stringResourceInvoke2, Action.ON_VIEW_TRANSFER);
        }
        this.detailButton = button2;
        if (unifiedBalances != null && (brokerageBalances = unifiedBalances.getBrokerageBalances()) != null && (account2 = brokerageBalances.getAccount()) != null) {
            int i3 = WhenMappings.$EnumSwitchMapping$3[account2.getInstantEligibility().getState().ordinal()];
            if (i3 == 1) {
                stringResourceInvoke = StringResource.INSTANCE.invoke(C30082R.string.ach_transfer_confirmation_instant_in_review_explanation, new Object[0]);
            } else if (i3 == 2) {
                stringResourceInvoke = StringResource.INSTANCE.invoke(C30082R.string.ach_transfer_confirmation_instant_pending_deposit_explanation, new Object[0]);
            } else if (i3 == 3) {
                LocalDate reinstatementDate = account2.getInstantEligibility().getReinstatementDate();
                String str = reinstatementDate != null ? LocalDateFormatter.MEDIUM.format(reinstatementDate) : null;
                StringResource.Companion companion = StringResource.INSTANCE;
                int i4 = C30082R.string.ach_transfer_confirmation_instant_suspended_explanation;
                Intrinsics.checkNotNull(str);
                stringResourceInvoke = companion.invoke(i4, str);
            } else {
                if (i3 != 4 && i3 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                stringResourceInvoke = null;
            }
            DialogButton dialogButton = account2.getInstantEligibility().getReversal() != null ? new DialogButton(StringResource.INSTANCE.invoke(C30082R.string.ach_transfer_confirmation_instant_view_reversal_action, new Object[0]), C30082R.id.dialog_id_ach_transfer_instant_deposits_with_reversal) : null;
            if (stringResourceInvoke != null) {
                dialog = new Dialog(StringResource.INSTANCE.invoke(C30082R.string.ach_transfer_confirmation_instant_title, new Object[0]), stringResourceInvoke, INSTANT_ELIGIBILITY_TAG, dialogButton);
            }
        }
        this.messageDialog = dialog;
    }

    public /* synthetic */ AchTransferConfirmationViewState(AchTransfer achTransfer, AchRelationship achRelationship, AutomaticDeposit automaticDeposit, boolean z, BigDecimal bigDecimal, boolean z2, Money money, IavAccount iavAccount, Account account, boolean z3, UnifiedBalances unifiedBalances, boolean z4, BigDecimal bigDecimal2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(achTransfer, (i & 2) != 0 ? null : achRelationship, automaticDeposit, z, bigDecimal, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? null : money, (i & 128) != 0 ? null : iavAccount, (i & 256) != 0 ? null : account, (i & 512) != 0 ? false : z3, (i & 1024) != 0 ? null : unifiedBalances, (i & 2048) != 0 ? false : z4, (i & 4096) != 0 ? null : bigDecimal2);
    }

    public final AchRelationship getAchRelationship$feature_legacy_ach_transfers_externalDebug() {
        return this.achRelationship;
    }

    /* renamed from: getDestAutomaticDepositAccount$feature_legacy_ach_transfers_externalDebug */
    public final Account m2520x79ef144d() {
        return this.destAutomaticDepositAccount;
    }

    public final boolean isApplicationApproved$feature_legacy_ach_transfers_externalDebug() {
        return this.isApplicationApproved;
    }

    public final UnifiedBalances getBalances$feature_legacy_ach_transfers_externalDebug() {
        return this.balances;
    }

    /* renamed from: isInputValid, reason: from getter */
    public final boolean getIsInputValid() {
        return this.isInputValid;
    }

    public final int getTitleText() {
        return this.titleText;
    }

    public final Button getDoneButton() {
        return this.doneButton;
    }

    public final Button getDetailButton() {
        return this.detailButton;
    }

    public final CharSequence getDetailText(Resources res) {
        Intrinsics.checkNotNullParameter(res, "res");
        OnboardingDepositConfirmationContent onboardingDepositConfirmationContent = this.queuedDepositContentCleanup;
        if (onboardingDepositConfirmationContent != null) {
            Integer detailText = onboardingDepositConfirmationContent.getDetailText();
            if (detailText != null) {
                return res.getString(detailText.intValue());
            }
            return null;
        }
        if (this.isQueuedDeposit) {
            if (this.isApplicationApproved) {
                return res.getString(C30082R.string.ach_transfer_confirmation_queued_approved);
            }
            return res.getString(C30082R.string.ach_transfer_confirmation_queued_not_approved);
        }
        UnifiedBalances unifiedBalances = this.balances;
        if (unifiedBalances == null) {
            return null;
        }
        AchTransfer achTransfer = this.achTransfer;
        if (achTransfer != null) {
            return getSingleTransferMessage(achTransfer, unifiedBalances, res);
        }
        return getRecurringTransferMessage(unifiedBalances, res);
    }

    private final CharSequence getSingleTransferMessage(AchTransfer achTransfer, UnifiedBalances balances, Resources res) throws Resources.NotFoundException {
        boolean zIsMargin = balances.getBrokerageBalances().isMargin();
        boolean zIsPositive = BigDecimals7.isPositive(this.maxEarlyAccessAmount);
        boolean z = Money3.getBigDecimalCompat(achTransfer.getAmount()).compareTo(this.maxEarlyAccessAmount) == 0;
        String str = Money.format$default(achTransfer.getAmount(), null, false, null, false, 0, null, false, null, false, false, 1023, null);
        String str2 = Money.format$default(achTransfer.getEarlyAccessAmount(), null, false, null, false, 0, null, false, null, false, false, 1023, null);
        String str3 = Money.format$default(achTransfer.getAmount().minus(achTransfer.getEarlyAccessAmount()), null, false, null, false, 0, null, false, null, false, false, 1023, null);
        if (achTransfer.getDirection() == TransferDirection.WITHDRAW) {
            String string2 = res.getString(C30082R.string.ach_transfer_confirmation_withdrawal, str);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        if (!zIsMargin) {
            String string3 = res.getString(C30082R.string.ach_transfer_confirmation_single_cash, str);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            return string3;
        }
        if (!zIsPositive) {
            String string4 = res.getString(C30082R.string.ach_transfer_confirmation_single_instant_restricted, str);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            return string4;
        }
        if (z) {
            String string5 = res.getString(C30082R.string.ach_transfer_confirmation_single_instant_whole, str);
            Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
            return string5;
        }
        String string6 = res.getString(C30082R.string.ach_transfer_confirmation_single_instant_partial, str, str2, str3);
        Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
        return string6;
    }

    private final int getFrequencyExplanationResId(AutomaticDeposit currentAutomaticDeposit) {
        int i = WhenMappings.$EnumSwitchMapping$1[currentAutomaticDeposit.getFrequency().ordinal()];
        if (i == 1) {
            return C30082R.string.ach_transfer_confirmation_automatic_deposit_once;
        }
        if (i == 2) {
            if (this.isFromOnboardingRadExp) {
                return C30082R.string.ach_transfer_confirmation_recurring_frequency_explanation_weekly;
            }
            return C30082R.string.ach_transfer_confirmation_automatic_deposit_week;
        }
        if (i == 3) {
            if (this.isFromOnboardingRadExp) {
                return C30082R.string.f5002xb1abf9e2;
            }
            return C30082R.string.ach_transfer_confirmation_automatic_deposit_two_weeks;
        }
        if (i == 4) {
            if (this.isFromOnboardingRadExp) {
                return C30082R.string.f5003x13545e73;
            }
            return C30082R.string.ach_transfer_confirmation_automatic_deposit_month;
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        if (this.isFromOnboardingRadExp) {
            return C30082R.string.f5004x9d9a821f;
        }
        return C30082R.string.ach_transfer_confirmation_automatic_deposit_quarter;
    }

    private final CharSequence getRecurringDepositRevampMessage(Resources res, AutomaticDeposit currentAutomaticDeposit) {
        String strValueOf;
        DisplayName displayName;
        DisplayName.Variants withAccount;
        String str = Money.format$default(currentAutomaticDeposit.getAmount(), null, false, null, false, 0, null, false, null, false, false, 1023, null);
        AchRelationship achRelationship = this.achRelationship;
        StringResource inSentence = null;
        String bankAccountNickname = achRelationship != null ? achRelationship.getBankAccountNickname() : null;
        int frequencyExplanationResId = getFrequencyExplanationResId(currentAutomaticDeposit);
        Account account = this.destAutomaticDepositAccount;
        if (account != null && (displayName = AccountDisplayNames.getDisplayName(account)) != null && (withAccount = displayName.getWithAccount()) != null) {
            inSentence = withAccount.getInSentence();
        }
        CharSequence text = StringResources6.getText(res, inSentence);
        if (text != null) {
            strValueOf = String.valueOf(text);
        } else {
            strValueOf = "account";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) res.getString(C30082R.string.gated_instant_ach_transfer_confirmation_recurring_revamp_initial));
        StyleSpan styleSpan = new StyleSpan(1);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) PlaceholderUtils.XXShortPlaceholderText);
        spannableStringBuilder.append((CharSequence) str);
        spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
        spannableStringBuilder.append((CharSequence) PlaceholderUtils.XXShortPlaceholderText);
        if (bankAccountNickname != null) {
            spannableStringBuilder.append((CharSequence) res.getString(C30082R.string.f5005x9ae2b1c9));
            spannableStringBuilder.append((CharSequence) PlaceholderUtils.XXShortPlaceholderText);
            StyleSpan styleSpan2 = new StyleSpan(1);
            int length2 = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) bankAccountNickname);
            spannableStringBuilder.setSpan(styleSpan2, length2, spannableStringBuilder.length(), 17);
            spannableStringBuilder.append((CharSequence) PlaceholderUtils.XXShortPlaceholderText);
        }
        spannableStringBuilder.append((CharSequence) res.getString(C30082R.string.f5006x662516b0, strValueOf, res.getString(frequencyExplanationResId)));
        return new SpannedString(spannableStringBuilder);
    }

    private final CharSequence getRecurringTransferMessage(UnifiedBalances balances, Resources res) throws Resources.NotFoundException {
        String string2;
        AutomaticDeposit automaticDeposit = this.automaticDeposit;
        if (automaticDeposit == null) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalStateException("automaticDeposit in recurring confirmation should not be null"), true, null, 4, null);
            return "";
        }
        if (this.shouldCleanupOnboardingRecurringContent) {
            return getRecurringDepositRevampMessage(res, automaticDeposit);
        }
        boolean zIsMargin = balances.getBrokerageBalances().isMargin();
        boolean zIsPositive = BigDecimals7.isPositive(this.maxEarlyAccessAmount);
        String string3 = res.getString(getFrequencyExplanationResId(this.automaticDeposit));
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        String str = Money.format$default(this.automaticDeposit.getAmount(), null, false, null, false, 0, null, false, null, false, false, 1023, null);
        String string4 = this.isFromOnboardingRadExp ? res.getString(getRecurringAutomaticDepositFrequencyNameRes(this.automaticDeposit.getFrequency())) : null;
        if (!zIsMargin) {
            String string5 = res.getString(C30082R.string.ach_transfer_confirmation_recurring_cash, str, string3);
            Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
            return string5;
        }
        if (!zIsPositive) {
            if (this.isFromOnboardingRadExp) {
                int i = C30082R.string.ach_transfer_confirmation_recurring_instant_restricted_v2;
                Intrinsics.checkNotNull(string4);
                string2 = res.getString(i, string4, str, string3);
            } else {
                string2 = res.getString(C30082R.string.ach_transfer_confirmation_recurring_instant_restricted, str, string3);
            }
            Intrinsics.checkNotNull(string2);
            return string2;
        }
        if (this.isFromOnboardingRadExp) {
            int i2 = C30082R.string.ach_transfer_confirmation_recurring_instant_whole_v2;
            Intrinsics.checkNotNull(string4);
            String string6 = res.getString(i2, string4, str, string3);
            Intrinsics.checkNotNull(string6);
            return string6;
        }
        String string7 = res.getString(C30082R.string.ach_transfer_confirmation_recurring_instant_whole, str, string3);
        Intrinsics.checkNotNull(string7);
        return string7;
    }

    public final StringResource getAmountText() {
        Money money = this.amountMoney;
        if (money != null) {
            return StringResource.INSTANCE.invoke(Money.format$default(money, null, false, null, false, 0, null, false, null, false, false, 1023, null));
        }
        return null;
    }

    public final StringResource getAccountNameText() {
        IavAccount iavAccount = this.account;
        if (iavAccount != null) {
            return StringResource.INSTANCE.invoke(C8331R.string.ach_relationship_account_summary, iavAccount.getName(), iavAccount.getLast_four_account_number());
        }
        return null;
    }

    public final StringResource getCurrentBalanceText() {
        BigDecimal balance_available;
        int i;
        IavAccount iavAccount = this.account;
        if (iavAccount == null || (balance_available = iavAccount.getBalance_available()) == null) {
            return null;
        }
        StringResource.Companion companion = StringResource.INSTANCE;
        if (this.isQueuedDeposit) {
            i = C30082R.string.ach_transfer_robinhood_account_balance_content_cleanup;
        } else {
            i = C30082R.string.ach_transfer_robinhood_account_balance;
        }
        return companion.invoke(i, Formats.getCurrencyFormat().format(balance_available));
    }

    public final StringResource getDisclaimerConfirmationText() {
        int i;
        BigDecimal bigDecimal;
        if (this.isFromOnboardingRadExp && this.shouldCleanupOnboardingRecurringContent) {
            BigDecimal bigDecimal2 = this.maxEarlyAccessAmount;
            if (bigDecimal2 == null || (bigDecimal = this.unclearedDeposits) == null || bigDecimal2.compareTo(bigDecimal) > 0) {
                return null;
            }
            return StringResource.INSTANCE.invoke(C30082R.string.f5001x71c9b348, new Object[0]);
        }
        Money money = this.amountMoney;
        if (money == null || this.queuedDepositContentCleanup == null) {
            if (money != null) {
                return StringResource.INSTANCE.invoke(C30082R.string.ach_transfer_confirmation_disclaimer_text, Formats.getCurrencyFormat().format(money.getDecimalValue()));
            }
            return null;
        }
        String str = Formats.getStrikePriceFormat().format(this.amountMoney.getDecimalValue());
        if (this.maxEarlyAccessAmount == null) {
            StringResource.Companion companion = StringResource.INSTANCE;
            if (this.isApplicationApproved) {
                i = C30082R.string.f4999x94d05c2b;
            } else {
                i = C30082R.string.ach_transfer_confirmation_disclaimer_cleanup_unapproved_text;
            }
            return companion.invoke(i, str);
        }
        String str2 = Formats.getStrikePriceFormat().format(this.maxEarlyAccessAmount);
        NumberFormatter strikePriceFormat = Formats.getStrikePriceFormat();
        BigDecimal bigDecimalSubtract = this.amountMoney.getDecimalValue().subtract(this.maxEarlyAccessAmount);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        String str3 = strikePriceFormat.format(bigDecimalSubtract);
        OnboardingDepositConfirmationContent onboardingDepositConfirmationContent = this.queuedDepositContentCleanup;
        int i2 = onboardingDepositConfirmationContent == null ? -1 : WhenMappings.$EnumSwitchMapping$2[onboardingDepositConfirmationContent.ordinal()];
        if (i2 == 1 || i2 == 2) {
            return StringResource.INSTANCE.invoke(this.queuedDepositContentCleanup.getDisclaimerText(), str);
        }
        if (i2 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return StringResource.INSTANCE.invoke(this.queuedDepositContentCleanup.getDisclaimerText(), str2, str3, str);
    }

    private final int getRecurringAutomaticDepositFrequencyNameRes(ApiAutomaticDeposit.Frequency frequency) {
        int i = WhenMappings.$EnumSwitchMapping$1[frequency.ordinal()];
        if (i == 1) {
            Preconditions.INSTANCE.failUnknownEnumKotlin(frequency);
            throw new ExceptionsH();
        }
        if (i == 2) {
            return C30082R.string.recurring_automatic_deposit_frequency_weekly;
        }
        if (i == 3) {
            return C30082R.string.recurring_automatic_deposit_frequency_biweekly;
        }
        if (i == 4) {
            return C30082R.string.recurring_automatic_deposit_frequency_monthly;
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return C30082R.string.recurring_automatic_deposit_frequency_quarterly;
    }

    public final Dialog getMessageDialog() {
        return this.messageDialog;
    }

    /* compiled from: AchTransferConfirmationViewState.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/posttransfer/AchTransferConfirmationViewState$Dialog;", "", "title", "Lcom/robinhood/utils/resource/StringResource;", "message", "tag", "", "negativeButton", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/AchTransferConfirmationViewState$DialogButton;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Ljava/lang/String;Lcom/robinhood/android/transfers/ach/ui/posttransfer/AchTransferConfirmationViewState$DialogButton;)V", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getMessage", "getTag", "()Ljava/lang/String;", "getNegativeButton", "()Lcom/robinhood/android/transfers/ach/ui/posttransfer/AchTransferConfirmationViewState$DialogButton;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Dialog {
        public static final int $stable = StringResource.$stable;
        private final StringResource message;
        private final DialogButton negativeButton;
        private final String tag;
        private final StringResource title;

        public static /* synthetic */ Dialog copy$default(Dialog dialog, StringResource stringResource, StringResource stringResource2, String str, DialogButton dialogButton, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = dialog.title;
            }
            if ((i & 2) != 0) {
                stringResource2 = dialog.message;
            }
            if ((i & 4) != 0) {
                str = dialog.tag;
            }
            if ((i & 8) != 0) {
                dialogButton = dialog.negativeButton;
            }
            return dialog.copy(stringResource, stringResource2, str, dialogButton);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final StringResource getMessage() {
            return this.message;
        }

        /* renamed from: component3, reason: from getter */
        public final String getTag() {
            return this.tag;
        }

        /* renamed from: component4, reason: from getter */
        public final DialogButton getNegativeButton() {
            return this.negativeButton;
        }

        public final Dialog copy(StringResource title, StringResource message, String tag, DialogButton negativeButton) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(tag, "tag");
            return new Dialog(title, message, tag, negativeButton);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Dialog)) {
                return false;
            }
            Dialog dialog = (Dialog) other;
            return Intrinsics.areEqual(this.title, dialog.title) && Intrinsics.areEqual(this.message, dialog.message) && Intrinsics.areEqual(this.tag, dialog.tag) && Intrinsics.areEqual(this.negativeButton, dialog.negativeButton);
        }

        public int hashCode() {
            int iHashCode = ((((this.title.hashCode() * 31) + this.message.hashCode()) * 31) + this.tag.hashCode()) * 31;
            DialogButton dialogButton = this.negativeButton;
            return iHashCode + (dialogButton == null ? 0 : dialogButton.hashCode());
        }

        public String toString() {
            return "Dialog(title=" + this.title + ", message=" + this.message + ", tag=" + this.tag + ", negativeButton=" + this.negativeButton + ")";
        }

        public Dialog(StringResource title, StringResource message, String tag, DialogButton dialogButton) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(tag, "tag");
            this.title = title;
            this.message = message;
            this.tag = tag;
            this.negativeButton = dialogButton;
        }

        public final StringResource getTitle() {
            return this.title;
        }

        public final StringResource getMessage() {
            return this.message;
        }

        public final String getTag() {
            return this.tag;
        }

        public final DialogButton getNegativeButton() {
            return this.negativeButton;
        }
    }

    /* compiled from: AchTransferConfirmationViewState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/posttransfer/AchTransferConfirmationViewState$DialogButton;", "", "text", "Lcom/robinhood/utils/resource/StringResource;", "id", "", "<init>", "(Lcom/robinhood/utils/resource/StringResource;I)V", "getText", "()Lcom/robinhood/utils/resource/StringResource;", "getId", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class DialogButton {
        public static final int $stable = StringResource.$stable;
        private final int id;
        private final StringResource text;

        public static /* synthetic */ DialogButton copy$default(DialogButton dialogButton, StringResource stringResource, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                stringResource = dialogButton.text;
            }
            if ((i2 & 2) != 0) {
                i = dialogButton.id;
            }
            return dialogButton.copy(stringResource, i);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final int getId() {
            return this.id;
        }

        public final DialogButton copy(StringResource text, int id) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new DialogButton(text, id);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DialogButton)) {
                return false;
            }
            DialogButton dialogButton = (DialogButton) other;
            return Intrinsics.areEqual(this.text, dialogButton.text) && this.id == dialogButton.id;
        }

        public int hashCode() {
            return (this.text.hashCode() * 31) + Integer.hashCode(this.id);
        }

        public String toString() {
            return "DialogButton(text=" + this.text + ", id=" + this.id + ")";
        }

        public DialogButton(StringResource text, int i) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.id = i;
        }

        public final StringResource getText() {
            return this.text;
        }

        public final int getId() {
            return this.id;
        }
    }

    /* compiled from: AchTransferConfirmationViewState.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/posttransfer/AchTransferConfirmationViewState$Button;", "", "text", "Lcom/robinhood/utils/resource/StringResource;", "action", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/AchTransferConfirmationViewState$Action;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/android/transfers/ach/ui/posttransfer/AchTransferConfirmationViewState$Action;)V", "getText", "()Lcom/robinhood/utils/resource/StringResource;", "getAction", "()Lcom/robinhood/android/transfers/ach/ui/posttransfer/AchTransferConfirmationViewState$Action;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Button {
        public static final int $stable = StringResource.$stable;
        private final Action action;
        private final StringResource text;

        public static /* synthetic */ Button copy$default(Button button, StringResource stringResource, Action action, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = button.text;
            }
            if ((i & 2) != 0) {
                action = button.action;
            }
            return button.copy(stringResource, action);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final Action getAction() {
            return this.action;
        }

        public final Button copy(StringResource text, Action action) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(action, "action");
            return new Button(text, action);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Button)) {
                return false;
            }
            Button button = (Button) other;
            return Intrinsics.areEqual(this.text, button.text) && this.action == button.action;
        }

        public int hashCode() {
            return (this.text.hashCode() * 31) + this.action.hashCode();
        }

        public String toString() {
            return "Button(text=" + this.text + ", action=" + this.action + ")";
        }

        public Button(StringResource text, Action action) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(action, "action");
            this.text = text;
            this.action = action;
        }

        public final StringResource getText() {
            return this.text;
        }

        public final Action getAction() {
            return this.action;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AchTransferConfirmationViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/posttransfer/AchTransferConfirmationViewState$Action;", "Lcom/robinhood/enums/RhEnum;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "SHOW_INSTANT_DEPOSIT_PAGE", "ON_VIEW_TRANSFER", "FINISH", "Companion", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Action implements RhEnum<Action> {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Action[] $VALUES;
        private final String serverValue;
        public static final Action SHOW_INSTANT_DEPOSIT_PAGE = new Action("SHOW_INSTANT_DEPOSIT_PAGE", 0, "show_instant_deposit_page");
        public static final Action ON_VIEW_TRANSFER = new Action("ON_VIEW_TRANSFER", 1, "on_view_transfer");
        public static final Action FINISH = new Action("FINISH", 2, "finish");

        private static final /* synthetic */ Action[] $values() {
            return new Action[]{SHOW_INSTANT_DEPOSIT_PAGE, ON_VIEW_TRANSFER, FINISH};
        }

        public static EnumEntries<Action> getEntries() {
            return $ENTRIES;
        }

        private Action(String str, int i, String str2) {
            this.serverValue = str2;
        }

        @Override // com.robinhood.enums.RhEnum
        public String getServerValue() {
            return this.serverValue;
        }

        static {
            Action[] actionArr$values = $values();
            $VALUES = actionArr$values;
            $ENTRIES = EnumEntries2.enumEntries(actionArr$values);
            INSTANCE = new Companion(null);
        }

        public static Action valueOf(String str) {
            return (Action) Enum.valueOf(Action.class, str);
        }

        public static Action[] values() {
            return (Action[]) $VALUES.clone();
        }
    }
}
