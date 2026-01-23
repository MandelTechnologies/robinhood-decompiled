package com.robinhood.android.transfers.contracts.transfercontext;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.iav.p154ui.PlaidExchangeTokenFragment;
import com.robinhood.enums.RhEnum;
import com.robinhood.models.api.ApiAutomaticDeposit;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.TransferDirection;
import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import com.robinhood.rosetta.eventlogging.TransferContext;
import com.robinhood.shared.transfers.contracts.context.IavSource;
import com.robinhood.shared.transfers.contracts.context.PlaidIavMetadata;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TransferContext.kt */
@Metadata(m3635d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u000e;<=>?@ABCDEFGHB£\u0001\b\u0004\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\f\b\u0002\u0010\u0013\u001a\u00060\u0014j\u0002`\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010:\u001a\u00020\u001bH\u0016R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010\n\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0016\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0014\u0010\u0011\u001a\u00020\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0018\u0010\u0013\u001a\u00060\u0014j\u0002`\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0014\u0010\u0016\u001a\u00020\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010.R\u0014\u0010\u0017\u001a\u00020\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010.R\u0014\u0010\u0018\u001a\u00020\u0019X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0011\u0010\u001a\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0011\u00105\u001a\u00020\u00128G¢\u0006\u0006\u001a\u0004\b5\u0010.R\u0011\u00106\u001a\u00020\u00128G¢\u0006\u0006\u001a\u0004\b6\u0010.R\u0011\u00107\u001a\u00020\u00128G¢\u0006\u0006\u001a\u0004\b7\u0010.R\u0011\u00108\u001a\u00020\u00128G¢\u0006\u0006\u001a\u0004\b8\u0010.R\u0011\u00109\u001a\u00020\u00128G¢\u0006\u0006\u001a\u0004\b9\u0010.\u0082\u0001\rIJKLMNOPQRSTU¨\u0006V"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext;", "Landroid/os/Parcelable;", "accountData", "Lcom/robinhood/android/transfers/contracts/transfercontext/CreateIavAccountData;", "direction", "Lcom/robinhood/models/db/TransferDirection;", "iavSource", "Lcom/robinhood/shared/transfers/contracts/context/IavSource;", "minAmount", "Ljava/math/BigDecimal;", "recommendedAmount", "recommendedFrequency", "Lcom/robinhood/models/api/ApiAutomaticDeposit$Frequency;", PlaidExchangeTokenFragment.ARG_PLAID_IAV_METADATA, "Lcom/robinhood/shared/transfers/contracts/context/PlaidIavMetadata;", "investmentScheduleFrequency", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "skipAutomaticDepositSplashScreen", "", "entryPoint", "Lcom/robinhood/rosetta/eventlogging/TransferContext$EntryPoint;", "Lcom/robinhood/android/transfers/contracts/transfercontext/TransferEntryPoint;", "isDepositFrequencyButtonClickable", "isFromOnboardingRadExp", "accountType", "Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext$RobinhoodAccountType;", "description", "", "<init>", "(Lcom/robinhood/android/transfers/contracts/transfercontext/CreateIavAccountData;Lcom/robinhood/models/db/TransferDirection;Lcom/robinhood/shared/transfers/contracts/context/IavSource;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lcom/robinhood/models/api/ApiAutomaticDeposit$Frequency;Lcom/robinhood/shared/transfers/contracts/context/PlaidIavMetadata;Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;ZLcom/robinhood/rosetta/eventlogging/TransferContext$EntryPoint;ZZLcom/robinhood/android/transfers/contracts/transfercontext/TransferContext$RobinhoodAccountType;Ljava/lang/String;)V", "getAccountData", "()Lcom/robinhood/android/transfers/contracts/transfercontext/CreateIavAccountData;", "getDirection", "()Lcom/robinhood/models/db/TransferDirection;", "getIavSource", "()Lcom/robinhood/shared/transfers/contracts/context/IavSource;", "getMinAmount", "()Ljava/math/BigDecimal;", "getRecommendedAmount", "getRecommendedFrequency", "()Lcom/robinhood/models/api/ApiAutomaticDeposit$Frequency;", "getPlaidIavMetadata", "()Lcom/robinhood/shared/transfers/contracts/context/PlaidIavMetadata;", "getInvestmentScheduleFrequency", "()Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "getSkipAutomaticDepositSplashScreen", "()Z", "getEntryPoint", "()Lcom/robinhood/rosetta/eventlogging/TransferContext$EntryPoint;", "getAccountType", "()Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext$RobinhoodAccountType;", "getDescription", "()Ljava/lang/String;", "showSuggestedAmounts", "showDepositFrequencyButton", "showConfirmationScreen", "shouldRefreshCardStackUponCompletion", "shouldShowWithdrawalLearnMoreButton", "toString", "Normal", "NormalIav", "RecommendedDeposit", "AutomaticDeposit", "QueuedDeposit", "MarginCallPrevention", "MarginResolution", "DayTradeCall", "MarginDeposit", "RecurringInsufficientBuyingPower", "RecurringDepositFromOnboarding", "DepositDeepLink", "RecommendationsOrderDeposit", "RobinhoodAccountType", "Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext$AutomaticDeposit;", "Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext$DayTradeCall;", "Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext$DepositDeepLink;", "Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext$MarginCallPrevention;", "Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext$MarginDeposit;", "Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext$MarginResolution;", "Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext$Normal;", "Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext$NormalIav;", "Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext$QueuedDeposit;", "Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext$RecommendationsOrderDeposit;", "Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext$RecommendedDeposit;", "Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext$RecurringDepositFromOnboarding;", "Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext$RecurringInsufficientBuyingPower;", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public abstract class TransferContext implements Parcelable {
    private final CreateIavAccountData accountData;
    private final RobinhoodAccountType accountType;
    private final String description;
    private final TransferDirection direction;
    private final TransferContext.EntryPoint entryPoint;
    private final IavSource iavSource;
    private final ApiInvestmentSchedule.Frequency investmentScheduleFrequency;
    private final boolean isDepositFrequencyButtonClickable;
    private final boolean isFromOnboardingRadExp;
    private final BigDecimal minAmount;
    private final PlaidIavMetadata plaidIavMetadata;
    private final BigDecimal recommendedAmount;
    private final ApiAutomaticDeposit.Frequency recommendedFrequency;
    private final boolean skipAutomaticDepositSplashScreen;

    /* compiled from: TransferContext.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

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
        }
    }

    public /* synthetic */ TransferContext(CreateIavAccountData createIavAccountData, TransferDirection transferDirection, IavSource iavSource, BigDecimal bigDecimal, BigDecimal bigDecimal2, ApiAutomaticDeposit.Frequency frequency, PlaidIavMetadata plaidIavMetadata, ApiInvestmentSchedule.Frequency frequency2, boolean z, TransferContext.EntryPoint entryPoint, boolean z2, boolean z3, RobinhoodAccountType robinhoodAccountType, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(createIavAccountData, transferDirection, iavSource, bigDecimal, bigDecimal2, frequency, plaidIavMetadata, frequency2, z, entryPoint, z2, z3, robinhoodAccountType, str);
    }

    private TransferContext(CreateIavAccountData createIavAccountData, TransferDirection transferDirection, IavSource iavSource, BigDecimal bigDecimal, BigDecimal bigDecimal2, ApiAutomaticDeposit.Frequency frequency, PlaidIavMetadata plaidIavMetadata, ApiInvestmentSchedule.Frequency frequency2, boolean z, TransferContext.EntryPoint entryPoint, boolean z2, boolean z3, RobinhoodAccountType robinhoodAccountType, String str) {
        this.accountData = createIavAccountData;
        this.direction = transferDirection;
        this.iavSource = iavSource;
        this.minAmount = bigDecimal;
        this.recommendedAmount = bigDecimal2;
        this.recommendedFrequency = frequency;
        this.plaidIavMetadata = plaidIavMetadata;
        this.investmentScheduleFrequency = frequency2;
        this.skipAutomaticDepositSplashScreen = z;
        this.entryPoint = entryPoint;
        this.isDepositFrequencyButtonClickable = z2;
        this.isFromOnboardingRadExp = z3;
        this.accountType = robinhoodAccountType;
        this.description = str;
    }

    public CreateIavAccountData getAccountData() {
        return this.accountData;
    }

    public /* synthetic */ TransferContext(CreateIavAccountData createIavAccountData, TransferDirection transferDirection, IavSource iavSource, BigDecimal bigDecimal, BigDecimal bigDecimal2, ApiAutomaticDeposit.Frequency frequency, PlaidIavMetadata plaidIavMetadata, ApiInvestmentSchedule.Frequency frequency2, boolean z, TransferContext.EntryPoint entryPoint, boolean z2, boolean z3, RobinhoodAccountType robinhoodAccountType, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : createIavAccountData, (i & 2) != 0 ? TransferDirection.DEPOSIT : transferDirection, (i & 4) != 0 ? null : iavSource, (i & 8) != 0 ? null : bigDecimal, (i & 16) != 0 ? null : bigDecimal2, (i & 32) != 0 ? ApiAutomaticDeposit.Frequency.ONCE : frequency, (i & 64) != 0 ? null : plaidIavMetadata, (i & 128) != 0 ? null : frequency2, (i & 256) != 0 ? false : z, (i & 512) != 0 ? TransferContext.EntryPoint.ENTRY_POINT_TYPE_UNKNOWN : entryPoint, (i & 1024) != 0 ? true : z2, (i & 2048) != 0 ? false : z3, (i & 4096) != 0 ? RobinhoodAccountType.BROKERAGE : robinhoodAccountType, str, null);
    }

    public TransferDirection getDirection() {
        return this.direction;
    }

    public IavSource getIavSource() {
        return this.iavSource;
    }

    public BigDecimal getMinAmount() {
        return this.minAmount;
    }

    public BigDecimal getRecommendedAmount() {
        return this.recommendedAmount;
    }

    public ApiAutomaticDeposit.Frequency getRecommendedFrequency() {
        return this.recommendedFrequency;
    }

    public PlaidIavMetadata getPlaidIavMetadata() {
        return this.plaidIavMetadata;
    }

    public ApiInvestmentSchedule.Frequency getInvestmentScheduleFrequency() {
        return this.investmentScheduleFrequency;
    }

    public boolean getSkipAutomaticDepositSplashScreen() {
        return this.skipAutomaticDepositSplashScreen;
    }

    public TransferContext.EntryPoint getEntryPoint() {
        return this.entryPoint;
    }

    /* renamed from: isDepositFrequencyButtonClickable, reason: from getter */
    public boolean getIsDepositFrequencyButtonClickable() {
        return this.isDepositFrequencyButtonClickable;
    }

    /* renamed from: isFromOnboardingRadExp, reason: from getter */
    public boolean getIsFromOnboardingRadExp() {
        return this.isFromOnboardingRadExp;
    }

    public RobinhoodAccountType getAccountType() {
        return this.accountType;
    }

    public final String getDescription() {
        return this.description;
    }

    @JvmName
    public final boolean showSuggestedAmounts() {
        if ((this instanceof Normal) || (this instanceof NormalIav) || (this instanceof RecommendedDeposit) || (this instanceof DepositDeepLink) || (this instanceof AutomaticDeposit) || (this instanceof RecurringDepositFromOnboarding) || (this instanceof QueuedDeposit) || (this instanceof RecurringInsufficientBuyingPower)) {
            return true;
        }
        if ((this instanceof MarginCallPrevention) || (this instanceof MarginResolution) || (this instanceof DayTradeCall) || (this instanceof MarginDeposit) || (this instanceof RecommendationsOrderDeposit)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    @JvmName
    public final boolean showDepositFrequencyButton() {
        if ((this instanceof Normal) || (this instanceof NormalIav) || (this instanceof RecommendedDeposit) || (this instanceof DepositDeepLink) || (this instanceof RecurringInsufficientBuyingPower) || (this instanceof RecurringDepositFromOnboarding) || (this instanceof AutomaticDeposit)) {
            int i = WhenMappings.$EnumSwitchMapping$0[getDirection().ordinal()];
            if (i == 1) {
                return true;
            }
            if (i == 2) {
                return false;
            }
            throw new NoWhenBranchMatchedException();
        }
        if ((this instanceof QueuedDeposit) || (this instanceof MarginCallPrevention) || (this instanceof MarginResolution) || (this instanceof DayTradeCall) || (this instanceof MarginDeposit) || (this instanceof RecommendationsOrderDeposit)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    @JvmName
    public final boolean showConfirmationScreen() {
        if ((this instanceof Normal) || (this instanceof NormalIav) || (this instanceof RecommendedDeposit) || (this instanceof DepositDeepLink) || (this instanceof AutomaticDeposit) || (this instanceof RecurringDepositFromOnboarding) || (this instanceof QueuedDeposit) || (this instanceof RecurringInsufficientBuyingPower) || (this instanceof RecommendationsOrderDeposit)) {
            return true;
        }
        if ((this instanceof MarginCallPrevention) || (this instanceof MarginResolution) || (this instanceof DayTradeCall) || (this instanceof MarginDeposit)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    @JvmName
    public final boolean shouldRefreshCardStackUponCompletion() {
        if (getDirection() == TransferDirection.DEPOSIT) {
            return true;
        }
        if ((this instanceof Normal) || (this instanceof NormalIav) || (this instanceof RecommendedDeposit) || (this instanceof DepositDeepLink) || (this instanceof AutomaticDeposit) || (this instanceof RecurringDepositFromOnboarding) || (this instanceof MarginDeposit) || (this instanceof RecurringInsufficientBuyingPower) || (this instanceof RecommendationsOrderDeposit)) {
            return false;
        }
        if ((this instanceof QueuedDeposit) || (this instanceof MarginCallPrevention) || (this instanceof MarginResolution) || (this instanceof DayTradeCall)) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }

    @JvmName
    public final boolean shouldShowWithdrawalLearnMoreButton() {
        int i = WhenMappings.$EnumSwitchMapping$0[getDirection().ordinal()];
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }

    public String toString() {
        String str = this.description;
        TransferDirection direction = getDirection();
        IavSource iavSource = getIavSource();
        return "TransferContext: " + str + PlaceholderUtils.XXShortPlaceholderText + direction + PlaceholderUtils.XXShortPlaceholderText + ((iavSource == null || !iavSource.isFromOnboarding()) ? "" : "fromOnboarding");
    }

    /* compiled from: TransferContext.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext$Normal;", "Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext;", "direction", "Lcom/robinhood/models/db/TransferDirection;", "accountType", "Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext$RobinhoodAccountType;", "recommendedAmount", "Ljava/math/BigDecimal;", "<init>", "(Lcom/robinhood/models/db/TransferDirection;Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext$RobinhoodAccountType;Ljava/math/BigDecimal;)V", "getDirection", "()Lcom/robinhood/models/db/TransferDirection;", "getAccountType", "()Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext$RobinhoodAccountType;", "getRecommendedAmount", "()Ljava/math/BigDecimal;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Normal extends TransferContext {
        public static final Parcelable.Creator<Normal> CREATOR = new Creator();
        private final RobinhoodAccountType accountType;
        private final TransferDirection direction;
        private final BigDecimal recommendedAmount;

        /* compiled from: TransferContext.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Normal> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Normal createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Normal(TransferDirection.valueOf(parcel.readString()), RobinhoodAccountType.valueOf(parcel.readString()), (BigDecimal) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Normal[] newArray(int i) {
                return new Normal[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.direction.name());
            dest.writeString(this.accountType.name());
            dest.writeSerializable(this.recommendedAmount);
        }

        @Override // com.robinhood.android.transfers.contracts.transfercontext.TransferContext
        public TransferDirection getDirection() {
            return this.direction;
        }

        public /* synthetic */ Normal(TransferDirection transferDirection, RobinhoodAccountType robinhoodAccountType, BigDecimal bigDecimal, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(transferDirection, (i & 2) != 0 ? RobinhoodAccountType.BROKERAGE : robinhoodAccountType, (i & 4) != 0 ? null : bigDecimal);
        }

        @Override // com.robinhood.android.transfers.contracts.transfercontext.TransferContext
        public RobinhoodAccountType getAccountType() {
            return this.accountType;
        }

        @Override // com.robinhood.android.transfers.contracts.transfercontext.TransferContext
        public BigDecimal getRecommendedAmount() {
            return this.recommendedAmount;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Normal(TransferDirection direction, RobinhoodAccountType accountType, BigDecimal bigDecimal) {
            super(null, direction, null, null, null, null, null, null, false, null, false, false, null, TransferContext3.NORMAL, 8189, null);
            Intrinsics.checkNotNullParameter(direction, "direction");
            Intrinsics.checkNotNullParameter(accountType, "accountType");
            this.direction = direction;
            this.accountType = accountType;
            this.recommendedAmount = bigDecimal;
        }
    }

    /* compiled from: TransferContext.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0015R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext$NormalIav;", "Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext;", "direction", "Lcom/robinhood/models/db/TransferDirection;", "accountData", "Lcom/robinhood/android/transfers/contracts/transfercontext/CreateIavAccountData;", "iavSource", "Lcom/robinhood/shared/transfers/contracts/context/IavSource;", "recommendedAmount", "Ljava/math/BigDecimal;", "<init>", "(Lcom/robinhood/models/db/TransferDirection;Lcom/robinhood/android/transfers/contracts/transfercontext/CreateIavAccountData;Lcom/robinhood/shared/transfers/contracts/context/IavSource;Ljava/math/BigDecimal;)V", "getDirection", "()Lcom/robinhood/models/db/TransferDirection;", "getAccountData", "()Lcom/robinhood/android/transfers/contracts/transfercontext/CreateIavAccountData;", "getIavSource", "()Lcom/robinhood/shared/transfers/contracts/context/IavSource;", "getRecommendedAmount", "()Ljava/math/BigDecimal;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class NormalIav extends TransferContext {
        public static final Parcelable.Creator<NormalIav> CREATOR = new Creator();
        private final CreateIavAccountData accountData;
        private final TransferDirection direction;
        private final IavSource iavSource;
        private final BigDecimal recommendedAmount;

        /* compiled from: TransferContext.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<NormalIav> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NormalIav createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NormalIav(TransferDirection.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : CreateIavAccountData.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? IavSource.valueOf(parcel.readString()) : null, (BigDecimal) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NormalIav[] newArray(int i) {
                return new NormalIav[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.direction.name());
            CreateIavAccountData createIavAccountData = this.accountData;
            if (createIavAccountData == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                createIavAccountData.writeToParcel(dest, flags);
            }
            IavSource iavSource = this.iavSource;
            if (iavSource == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(iavSource.name());
            }
            dest.writeSerializable(this.recommendedAmount);
        }

        public /* synthetic */ NormalIav(TransferDirection transferDirection, CreateIavAccountData createIavAccountData, IavSource iavSource, BigDecimal bigDecimal, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(transferDirection, (i & 2) != 0 ? null : createIavAccountData, (i & 4) != 0 ? null : iavSource, (i & 8) != 0 ? null : bigDecimal);
        }

        @Override // com.robinhood.android.transfers.contracts.transfercontext.TransferContext
        public TransferDirection getDirection() {
            return this.direction;
        }

        @Override // com.robinhood.android.transfers.contracts.transfercontext.TransferContext
        public CreateIavAccountData getAccountData() {
            return this.accountData;
        }

        @Override // com.robinhood.android.transfers.contracts.transfercontext.TransferContext
        public IavSource getIavSource() {
            return this.iavSource;
        }

        @Override // com.robinhood.android.transfers.contracts.transfercontext.TransferContext
        public BigDecimal getRecommendedAmount() {
            return this.recommendedAmount;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NormalIav(TransferDirection direction, CreateIavAccountData createIavAccountData, IavSource iavSource, BigDecimal bigDecimal) {
            super(createIavAccountData, direction, iavSource, null, bigDecimal != null ? TransferContext2.roundedUp(bigDecimal) : null, null, null, null, false, null, false, false, null, TransferContext3.NORMAL, 8168, null);
            Intrinsics.checkNotNullParameter(direction, "direction");
            this.direction = direction;
            this.accountData = createIavAccountData;
            this.iavSource = iavSource;
            this.recommendedAmount = bigDecimal;
        }
    }

    /* compiled from: TransferContext.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext$RecommendedDeposit;", "Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext;", "recommendedAmount", "Ljava/math/BigDecimal;", "accountType", "Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext$RobinhoodAccountType;", "<init>", "(Ljava/math/BigDecimal;Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext$RobinhoodAccountType;)V", "getRecommendedAmount", "()Ljava/math/BigDecimal;", "getAccountType", "()Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext$RobinhoodAccountType;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class RecommendedDeposit extends TransferContext {
        public static final Parcelable.Creator<RecommendedDeposit> CREATOR = new Creator();
        private final RobinhoodAccountType accountType;
        private final BigDecimal recommendedAmount;

        /* compiled from: TransferContext.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<RecommendedDeposit> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RecommendedDeposit createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RecommendedDeposit((BigDecimal) parcel.readSerializable(), RobinhoodAccountType.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RecommendedDeposit[] newArray(int i) {
                return new RecommendedDeposit[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public RecommendedDeposit() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.recommendedAmount);
            dest.writeString(this.accountType.name());
        }

        @Override // com.robinhood.android.transfers.contracts.transfercontext.TransferContext
        public BigDecimal getRecommendedAmount() {
            return this.recommendedAmount;
        }

        public /* synthetic */ RecommendedDeposit(BigDecimal bigDecimal, RobinhoodAccountType robinhoodAccountType, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : bigDecimal, (i & 2) != 0 ? RobinhoodAccountType.BROKERAGE : robinhoodAccountType);
        }

        @Override // com.robinhood.android.transfers.contracts.transfercontext.TransferContext
        public RobinhoodAccountType getAccountType() {
            return this.accountType;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RecommendedDeposit(BigDecimal bigDecimal, RobinhoodAccountType accountType) {
            super(null, TransferDirection.DEPOSIT, null, null, bigDecimal != null ? TransferContext2.roundedUp(bigDecimal) : null, null, null, null, false, null, false, false, accountType, TransferContext3.NORMAL, 4077, null);
            Intrinsics.checkNotNullParameter(accountType, "accountType");
            this.recommendedAmount = bigDecimal;
            this.accountType = accountType;
        }
    }

    /* compiled from: TransferContext.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext$AutomaticDeposit;", "Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext;", "skipAutomaticDepositSplashScreen", "", "<init>", "(Z)V", "getSkipAutomaticDepositSplashScreen", "()Z", "component1", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class AutomaticDeposit extends TransferContext {
        public static final Parcelable.Creator<AutomaticDeposit> CREATOR = new Creator();
        private final boolean skipAutomaticDepositSplashScreen;

        /* compiled from: TransferContext.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<AutomaticDeposit> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AutomaticDeposit createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AutomaticDeposit(parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AutomaticDeposit[] newArray(int i) {
                return new AutomaticDeposit[i];
            }
        }

        public AutomaticDeposit() {
            this(false, 1, null);
        }

        public static /* synthetic */ AutomaticDeposit copy$default(AutomaticDeposit automaticDeposit, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = automaticDeposit.skipAutomaticDepositSplashScreen;
            }
            return automaticDeposit.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getSkipAutomaticDepositSplashScreen() {
            return this.skipAutomaticDepositSplashScreen;
        }

        public final AutomaticDeposit copy(boolean skipAutomaticDepositSplashScreen) {
            return new AutomaticDeposit(skipAutomaticDepositSplashScreen);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AutomaticDeposit) && this.skipAutomaticDepositSplashScreen == ((AutomaticDeposit) other).skipAutomaticDepositSplashScreen;
        }

        public int hashCode() {
            return Boolean.hashCode(this.skipAutomaticDepositSplashScreen);
        }

        @Override // com.robinhood.android.transfers.contracts.transfercontext.TransferContext
        public String toString() {
            return "AutomaticDeposit(skipAutomaticDepositSplashScreen=" + this.skipAutomaticDepositSplashScreen + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.skipAutomaticDepositSplashScreen ? 1 : 0);
        }

        public /* synthetic */ AutomaticDeposit(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }

        @Override // com.robinhood.android.transfers.contracts.transfercontext.TransferContext
        public boolean getSkipAutomaticDepositSplashScreen() {
            return this.skipAutomaticDepositSplashScreen;
        }

        public AutomaticDeposit(boolean z) {
            super(null, TransferDirection.DEPOSIT, null, null, null, null, null, null, z, null, false, false, null, TransferContext3.AUTOMATIC_DEPOSIT, 7933, null);
            this.skipAutomaticDepositSplashScreen = z;
        }
    }

    /* compiled from: TransferContext.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0018\u001a\u00020\u0019J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0019R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext$QueuedDeposit;", "Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext;", "accountData", "Lcom/robinhood/android/transfers/contracts/transfercontext/CreateIavAccountData;", "iavSource", "Lcom/robinhood/shared/transfers/contracts/context/IavSource;", PlaidExchangeTokenFragment.ARG_PLAID_IAV_METADATA, "Lcom/robinhood/shared/transfers/contracts/context/PlaidIavMetadata;", "recommendedAmount", "Ljava/math/BigDecimal;", "accountType", "Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext$RobinhoodAccountType;", "<init>", "(Lcom/robinhood/android/transfers/contracts/transfercontext/CreateIavAccountData;Lcom/robinhood/shared/transfers/contracts/context/IavSource;Lcom/robinhood/shared/transfers/contracts/context/PlaidIavMetadata;Ljava/math/BigDecimal;Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext$RobinhoodAccountType;)V", "getAccountData", "()Lcom/robinhood/android/transfers/contracts/transfercontext/CreateIavAccountData;", "getIavSource", "()Lcom/robinhood/shared/transfers/contracts/context/IavSource;", "getPlaidIavMetadata", "()Lcom/robinhood/shared/transfers/contracts/context/PlaidIavMetadata;", "getRecommendedAmount", "()Ljava/math/BigDecimal;", "getAccountType", "()Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext$RobinhoodAccountType;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class QueuedDeposit extends TransferContext {
        public static final Parcelable.Creator<QueuedDeposit> CREATOR = new Creator();
        private final CreateIavAccountData accountData;
        private final RobinhoodAccountType accountType;
        private final IavSource iavSource;
        private final PlaidIavMetadata plaidIavMetadata;
        private final BigDecimal recommendedAmount;

        /* compiled from: TransferContext.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<QueuedDeposit> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final QueuedDeposit createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new QueuedDeposit(CreateIavAccountData.CREATOR.createFromParcel(parcel), IavSource.valueOf(parcel.readString()), (PlaidIavMetadata) parcel.readParcelable(QueuedDeposit.class.getClassLoader()), (BigDecimal) parcel.readSerializable(), RobinhoodAccountType.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final QueuedDeposit[] newArray(int i) {
                return new QueuedDeposit[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.accountData.writeToParcel(dest, flags);
            dest.writeString(this.iavSource.name());
            dest.writeParcelable(this.plaidIavMetadata, flags);
            dest.writeSerializable(this.recommendedAmount);
            dest.writeString(this.accountType.name());
        }

        @Override // com.robinhood.android.transfers.contracts.transfercontext.TransferContext
        public CreateIavAccountData getAccountData() {
            return this.accountData;
        }

        @Override // com.robinhood.android.transfers.contracts.transfercontext.TransferContext
        public IavSource getIavSource() {
            return this.iavSource;
        }

        @Override // com.robinhood.android.transfers.contracts.transfercontext.TransferContext
        public PlaidIavMetadata getPlaidIavMetadata() {
            return this.plaidIavMetadata;
        }

        @Override // com.robinhood.android.transfers.contracts.transfercontext.TransferContext
        public BigDecimal getRecommendedAmount() {
            return this.recommendedAmount;
        }

        public /* synthetic */ QueuedDeposit(CreateIavAccountData createIavAccountData, IavSource iavSource, PlaidIavMetadata plaidIavMetadata, BigDecimal bigDecimal, RobinhoodAccountType robinhoodAccountType, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(createIavAccountData, iavSource, (i & 4) != 0 ? null : plaidIavMetadata, (i & 8) != 0 ? null : bigDecimal, (i & 16) != 0 ? RobinhoodAccountType.BROKERAGE : robinhoodAccountType);
        }

        @Override // com.robinhood.android.transfers.contracts.transfercontext.TransferContext
        public RobinhoodAccountType getAccountType() {
            return this.accountType;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QueuedDeposit(CreateIavAccountData accountData, IavSource iavSource, PlaidIavMetadata plaidIavMetadata, BigDecimal bigDecimal, RobinhoodAccountType accountType) {
            super(accountData, TransferDirection.DEPOSIT, iavSource, null, bigDecimal != null ? TransferContext2.roundedUp(bigDecimal) : null, null, plaidIavMetadata, null, false, null, false, false, null, TransferContext3.QUEUED_DEPOSIT, 8104, null);
            Intrinsics.checkNotNullParameter(accountData, "accountData");
            Intrinsics.checkNotNullParameter(iavSource, "iavSource");
            Intrinsics.checkNotNullParameter(accountType, "accountType");
            this.accountData = accountData;
            this.iavSource = iavSource;
            this.plaidIavMetadata = plaidIavMetadata;
            this.recommendedAmount = bigDecimal;
            this.accountType = accountType;
        }
    }

    /* compiled from: TransferContext.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext$MarginCallPrevention;", "Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext;", "recommendedAmount", "Ljava/math/BigDecimal;", "<init>", "(Ljava/math/BigDecimal;)V", "getRecommendedAmount", "()Ljava/math/BigDecimal;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MarginCallPrevention extends TransferContext {
        public static final Parcelable.Creator<MarginCallPrevention> CREATOR = new Creator();
        private final BigDecimal recommendedAmount;

        /* compiled from: TransferContext.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<MarginCallPrevention> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MarginCallPrevention createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MarginCallPrevention((BigDecimal) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MarginCallPrevention[] newArray(int i) {
                return new MarginCallPrevention[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.recommendedAmount);
        }

        @Override // com.robinhood.android.transfers.contracts.transfercontext.TransferContext
        public BigDecimal getRecommendedAmount() {
            return this.recommendedAmount;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MarginCallPrevention(BigDecimal recommendedAmount) {
            super(null, TransferDirection.DEPOSIT, null, null, TransferContext2.roundedUp(recommendedAmount), null, null, null, false, null, false, false, null, TransferContext3.MARGIN_CALL_PREVENTION, 8173, null);
            Intrinsics.checkNotNullParameter(recommendedAmount, "recommendedAmount");
            this.recommendedAmount = recommendedAmount;
        }
    }

    /* compiled from: TransferContext.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext$MarginResolution;", "Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext;", "recommendedAmount", "Ljava/math/BigDecimal;", "minAmount", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getRecommendedAmount", "()Ljava/math/BigDecimal;", "getMinAmount", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MarginResolution extends TransferContext {
        public static final Parcelable.Creator<MarginResolution> CREATOR = new Creator();
        private final BigDecimal minAmount;
        private final BigDecimal recommendedAmount;

        /* compiled from: TransferContext.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<MarginResolution> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MarginResolution createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MarginResolution((BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MarginResolution[] newArray(int i) {
                return new MarginResolution[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.recommendedAmount);
            dest.writeSerializable(this.minAmount);
        }

        @Override // com.robinhood.android.transfers.contracts.transfercontext.TransferContext
        public BigDecimal getRecommendedAmount() {
            return this.recommendedAmount;
        }

        @Override // com.robinhood.android.transfers.contracts.transfercontext.TransferContext
        public BigDecimal getMinAmount() {
            return this.minAmount;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MarginResolution(BigDecimal recommendedAmount, BigDecimal minAmount) {
            super(null, TransferDirection.DEPOSIT, null, TransferContext2.roundedUp(minAmount), TransferContext2.roundedUp(recommendedAmount), null, null, null, false, null, false, false, null, TransferContext3.MARGIN_RESOLUTION, 8165, null);
            Intrinsics.checkNotNullParameter(recommendedAmount, "recommendedAmount");
            Intrinsics.checkNotNullParameter(minAmount, "minAmount");
            this.recommendedAmount = recommendedAmount;
            this.minAmount = minAmount;
        }
    }

    /* compiled from: TransferContext.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext$DayTradeCall;", "Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext;", "recommendedAmount", "Ljava/math/BigDecimal;", "<init>", "(Ljava/math/BigDecimal;)V", "getRecommendedAmount", "()Ljava/math/BigDecimal;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DayTradeCall extends TransferContext {
        public static final Parcelable.Creator<DayTradeCall> CREATOR = new Creator();
        private final BigDecimal recommendedAmount;

        /* compiled from: TransferContext.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<DayTradeCall> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DayTradeCall createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DayTradeCall((BigDecimal) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DayTradeCall[] newArray(int i) {
                return new DayTradeCall[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.recommendedAmount);
        }

        @Override // com.robinhood.android.transfers.contracts.transfercontext.TransferContext
        public BigDecimal getRecommendedAmount() {
            return this.recommendedAmount;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DayTradeCall(BigDecimal recommendedAmount) {
            super(null, TransferDirection.DEPOSIT, null, null, TransferContext2.roundedUp(recommendedAmount), null, null, null, false, null, false, false, null, TransferContext3.DAY_TRADE_CALL_RESOLUTION, 8173, null);
            Intrinsics.checkNotNullParameter(recommendedAmount, "recommendedAmount");
            this.recommendedAmount = recommendedAmount;
        }
    }

    /* compiled from: TransferContext.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext$MarginDeposit;", "Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext;", "recommendedAmount", "Ljava/math/BigDecimal;", "minAmount", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getRecommendedAmount", "()Ljava/math/BigDecimal;", "getMinAmount", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MarginDeposit extends TransferContext {
        public static final Parcelable.Creator<MarginDeposit> CREATOR = new Creator();
        private final BigDecimal minAmount;
        private final BigDecimal recommendedAmount;

        /* compiled from: TransferContext.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<MarginDeposit> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MarginDeposit createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MarginDeposit((BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MarginDeposit[] newArray(int i) {
                return new MarginDeposit[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.recommendedAmount);
            dest.writeSerializable(this.minAmount);
        }

        @Override // com.robinhood.android.transfers.contracts.transfercontext.TransferContext
        public BigDecimal getRecommendedAmount() {
            return this.recommendedAmount;
        }

        @Override // com.robinhood.android.transfers.contracts.transfercontext.TransferContext
        public BigDecimal getMinAmount() {
            return this.minAmount;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MarginDeposit(BigDecimal recommendedAmount, BigDecimal bigDecimal) {
            super(null, TransferDirection.DEPOSIT, null, bigDecimal != null ? TransferContext2.roundedUp(bigDecimal) : null, TransferContext2.roundedUp(recommendedAmount), null, null, null, false, null, false, false, null, TransferContext3.GOLD_DEPOSIT, 8165, null);
            Intrinsics.checkNotNullParameter(recommendedAmount, "recommendedAmount");
            this.recommendedAmount = recommendedAmount;
            this.minAmount = bigDecimal;
        }
    }

    /* compiled from: TransferContext.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext$RecurringInsufficientBuyingPower;", "Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext;", "recommendedAmount", "Ljava/math/BigDecimal;", "investmentScheduleFrequency", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "<init>", "(Ljava/math/BigDecimal;Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;)V", "getRecommendedAmount", "()Ljava/math/BigDecimal;", "getInvestmentScheduleFrequency", "()Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class RecurringInsufficientBuyingPower extends TransferContext {
        public static final Parcelable.Creator<RecurringInsufficientBuyingPower> CREATOR = new Creator();
        private final ApiInvestmentSchedule.Frequency investmentScheduleFrequency;
        private final BigDecimal recommendedAmount;

        /* compiled from: TransferContext.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<RecurringInsufficientBuyingPower> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RecurringInsufficientBuyingPower createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RecurringInsufficientBuyingPower((BigDecimal) parcel.readSerializable(), ApiInvestmentSchedule.Frequency.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RecurringInsufficientBuyingPower[] newArray(int i) {
                return new RecurringInsufficientBuyingPower[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.recommendedAmount);
            dest.writeString(this.investmentScheduleFrequency.name());
        }

        @Override // com.robinhood.android.transfers.contracts.transfercontext.TransferContext
        public BigDecimal getRecommendedAmount() {
            return this.recommendedAmount;
        }

        @Override // com.robinhood.android.transfers.contracts.transfercontext.TransferContext
        public ApiInvestmentSchedule.Frequency getInvestmentScheduleFrequency() {
            return this.investmentScheduleFrequency;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RecurringInsufficientBuyingPower(BigDecimal recommendedAmount, ApiInvestmentSchedule.Frequency investmentScheduleFrequency) {
            super(null, TransferDirection.DEPOSIT, null, null, TransferContext2.roundedUp(recommendedAmount), null, null, investmentScheduleFrequency, false, null, false, false, null, TransferContext3.RECURRING_INSUFFICIENT_BUYING_POWER, 8045, null);
            Intrinsics.checkNotNullParameter(recommendedAmount, "recommendedAmount");
            Intrinsics.checkNotNullParameter(investmentScheduleFrequency, "investmentScheduleFrequency");
            this.recommendedAmount = recommendedAmount;
            this.investmentScheduleFrequency = investmentScheduleFrequency;
        }
    }

    /* compiled from: TransferContext.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext$RecurringDepositFromOnboarding;", "Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext;", "recommendedAmount", "Ljava/math/BigDecimal;", "<init>", "(Ljava/math/BigDecimal;)V", "getRecommendedAmount", "()Ljava/math/BigDecimal;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class RecurringDepositFromOnboarding extends TransferContext {
        public static final Parcelable.Creator<RecurringDepositFromOnboarding> CREATOR = new Creator();
        private final BigDecimal recommendedAmount;

        /* compiled from: TransferContext.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<RecurringDepositFromOnboarding> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RecurringDepositFromOnboarding createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RecurringDepositFromOnboarding((BigDecimal) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RecurringDepositFromOnboarding[] newArray(int i) {
                return new RecurringDepositFromOnboarding[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.recommendedAmount);
        }

        @Override // com.robinhood.android.transfers.contracts.transfercontext.TransferContext
        public BigDecimal getRecommendedAmount() {
            return this.recommendedAmount;
        }

        public RecurringDepositFromOnboarding(BigDecimal bigDecimal) {
            super(null, TransferDirection.DEPOSIT, null, null, bigDecimal != null ? TransferContext2.roundedUp(bigDecimal) : null, null, null, null, true, null, false, true, null, TransferContext3.AUTOMATIC_DEPOSIT, 4845, null);
            this.recommendedAmount = bigDecimal;
        }
    }

    /* compiled from: TransferContext.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0015R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext$DepositDeepLink;", "Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext;", "recommendedAmount", "Ljava/math/BigDecimal;", "recommendedFrequency", "Lcom/robinhood/models/api/ApiAutomaticDeposit$Frequency;", "accountType", "Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext$RobinhoodAccountType;", "<init>", "(Ljava/math/BigDecimal;Lcom/robinhood/models/api/ApiAutomaticDeposit$Frequency;Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext$RobinhoodAccountType;)V", "getRecommendedAmount", "()Ljava/math/BigDecimal;", "getRecommendedFrequency", "()Lcom/robinhood/models/api/ApiAutomaticDeposit$Frequency;", "getAccountType", "()Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext$RobinhoodAccountType;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class DepositDeepLink extends TransferContext {
        public static final Parcelable.Creator<DepositDeepLink> CREATOR = new Creator();
        private final RobinhoodAccountType accountType;
        private final BigDecimal recommendedAmount;
        private final ApiAutomaticDeposit.Frequency recommendedFrequency;

        /* compiled from: TransferContext.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<DepositDeepLink> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DepositDeepLink createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DepositDeepLink((BigDecimal) parcel.readSerializable(), ApiAutomaticDeposit.Frequency.valueOf(parcel.readString()), RobinhoodAccountType.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DepositDeepLink[] newArray(int i) {
                return new DepositDeepLink[i];
            }
        }

        public static /* synthetic */ DepositDeepLink copy$default(DepositDeepLink depositDeepLink, BigDecimal bigDecimal, ApiAutomaticDeposit.Frequency frequency, RobinhoodAccountType robinhoodAccountType, int i, Object obj) {
            if ((i & 1) != 0) {
                bigDecimal = depositDeepLink.recommendedAmount;
            }
            if ((i & 2) != 0) {
                frequency = depositDeepLink.recommendedFrequency;
            }
            if ((i & 4) != 0) {
                robinhoodAccountType = depositDeepLink.accountType;
            }
            return depositDeepLink.copy(bigDecimal, frequency, robinhoodAccountType);
        }

        /* renamed from: component1, reason: from getter */
        public final BigDecimal getRecommendedAmount() {
            return this.recommendedAmount;
        }

        /* renamed from: component2, reason: from getter */
        public final ApiAutomaticDeposit.Frequency getRecommendedFrequency() {
            return this.recommendedFrequency;
        }

        /* renamed from: component3, reason: from getter */
        public final RobinhoodAccountType getAccountType() {
            return this.accountType;
        }

        public final DepositDeepLink copy(BigDecimal recommendedAmount, ApiAutomaticDeposit.Frequency recommendedFrequency, RobinhoodAccountType accountType) {
            Intrinsics.checkNotNullParameter(recommendedFrequency, "recommendedFrequency");
            Intrinsics.checkNotNullParameter(accountType, "accountType");
            return new DepositDeepLink(recommendedAmount, recommendedFrequency, accountType);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DepositDeepLink)) {
                return false;
            }
            DepositDeepLink depositDeepLink = (DepositDeepLink) other;
            return Intrinsics.areEqual(this.recommendedAmount, depositDeepLink.recommendedAmount) && this.recommendedFrequency == depositDeepLink.recommendedFrequency && this.accountType == depositDeepLink.accountType;
        }

        public int hashCode() {
            BigDecimal bigDecimal = this.recommendedAmount;
            return ((((bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31) + this.recommendedFrequency.hashCode()) * 31) + this.accountType.hashCode();
        }

        @Override // com.robinhood.android.transfers.contracts.transfercontext.TransferContext
        public String toString() {
            return "DepositDeepLink(recommendedAmount=" + this.recommendedAmount + ", recommendedFrequency=" + this.recommendedFrequency + ", accountType=" + this.accountType + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.recommendedAmount);
            dest.writeString(this.recommendedFrequency.name());
            dest.writeString(this.accountType.name());
        }

        @Override // com.robinhood.android.transfers.contracts.transfercontext.TransferContext
        public BigDecimal getRecommendedAmount() {
            return this.recommendedAmount;
        }

        @Override // com.robinhood.android.transfers.contracts.transfercontext.TransferContext
        public ApiAutomaticDeposit.Frequency getRecommendedFrequency() {
            return this.recommendedFrequency;
        }

        @Override // com.robinhood.android.transfers.contracts.transfercontext.TransferContext
        public RobinhoodAccountType getAccountType() {
            return this.accountType;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DepositDeepLink(BigDecimal bigDecimal, ApiAutomaticDeposit.Frequency recommendedFrequency, RobinhoodAccountType accountType) {
            super(null, TransferDirection.DEPOSIT, null, null, bigDecimal != null ? TransferContext2.roundedUp(bigDecimal) : null, recommendedFrequency, null, null, false, null, false, false, null, TransferContext3.NORMAL, 8141, null);
            Intrinsics.checkNotNullParameter(recommendedFrequency, "recommendedFrequency");
            Intrinsics.checkNotNullParameter(accountType, "accountType");
            this.recommendedAmount = bigDecimal;
            this.recommendedFrequency = recommendedFrequency;
            this.accountType = accountType;
        }
    }

    /* compiled from: TransferContext.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext$RecommendationsOrderDeposit;", "Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext;", "recommendedAmount", "Ljava/math/BigDecimal;", "minAmount", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getRecommendedAmount", "()Ljava/math/BigDecimal;", "getMinAmount", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class RecommendationsOrderDeposit extends TransferContext {
        public static final Parcelable.Creator<RecommendationsOrderDeposit> CREATOR = new Creator();
        private final BigDecimal minAmount;
        private final BigDecimal recommendedAmount;

        /* compiled from: TransferContext.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<RecommendationsOrderDeposit> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RecommendationsOrderDeposit createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RecommendationsOrderDeposit((BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RecommendationsOrderDeposit[] newArray(int i) {
                return new RecommendationsOrderDeposit[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.recommendedAmount);
            dest.writeSerializable(this.minAmount);
        }

        @Override // com.robinhood.android.transfers.contracts.transfercontext.TransferContext
        public BigDecimal getRecommendedAmount() {
            return this.recommendedAmount;
        }

        @Override // com.robinhood.android.transfers.contracts.transfercontext.TransferContext
        public BigDecimal getMinAmount() {
            return this.minAmount;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public RecommendationsOrderDeposit(BigDecimal recommendedAmount, BigDecimal minAmount) {
            Intrinsics.checkNotNullParameter(recommendedAmount, "recommendedAmount");
            Intrinsics.checkNotNullParameter(minAmount, "minAmount");
            CreateIavAccountData createIavAccountData = null;
            IavSource iavSource = null;
            super(createIavAccountData, TransferDirection.DEPOSIT, iavSource, TransferContext2.roundedUp(minAmount), TransferContext2.roundedUp(recommendedAmount), null, null, null, true, TransferContext.EntryPoint.FIRST_TRADE_RECOMMENDATION, false, false, null, TransferContext3.NORMAL, 7397, null);
            this.recommendedAmount = recommendedAmount;
            this.minAmount = minAmount;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TransferContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext$RobinhoodAccountType;", "Lcom/robinhood/enums/RhEnum;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "BROKERAGE", "SPENDING", "RHS_ROTH_IRA", "RHS_TRADITIONAL_IRA", "JOINT_TENANCY_WITH_ROS", "Companion", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class RobinhoodAccountType implements RhEnum<RobinhoodAccountType> {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ RobinhoodAccountType[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String serverValue;
        public static final RobinhoodAccountType BROKERAGE = new RobinhoodAccountType("BROKERAGE", 0, "brokerage");
        public static final RobinhoodAccountType SPENDING = new RobinhoodAccountType("SPENDING", 1, "spending");
        public static final RobinhoodAccountType RHS_ROTH_IRA = new RobinhoodAccountType("RHS_ROTH_IRA", 2, "rhs_roth_ira");
        public static final RobinhoodAccountType RHS_TRADITIONAL_IRA = new RobinhoodAccountType("RHS_TRADITIONAL_IRA", 3, "rhs_traditional_ira");
        public static final RobinhoodAccountType JOINT_TENANCY_WITH_ROS = new RobinhoodAccountType("JOINT_TENANCY_WITH_ROS", 4, "joint_tenancy_with_ros");

        private static final /* synthetic */ RobinhoodAccountType[] $values() {
            return new RobinhoodAccountType[]{BROKERAGE, SPENDING, RHS_ROTH_IRA, RHS_TRADITIONAL_IRA, JOINT_TENANCY_WITH_ROS};
        }

        public static EnumEntries<RobinhoodAccountType> getEntries() {
            return $ENTRIES;
        }

        private RobinhoodAccountType(String str, int i, String str2) {
            this.serverValue = str2;
        }

        @Override // com.robinhood.enums.RhEnum
        public String getServerValue() {
            return this.serverValue;
        }

        static {
            RobinhoodAccountType[] robinhoodAccountTypeArr$values = $values();
            $VALUES = robinhoodAccountTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(robinhoodAccountTypeArr$values);
            INSTANCE = new Companion(null);
        }

        /* compiled from: TransferContext.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext$RobinhoodAccountType$Companion;", "Lcom/robinhood/enums/RhEnum$Converter$Optional;", "Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext$RobinhoodAccountType;", "<init>", "()V", "from", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion extends RhEnum.Converter.Optional<RobinhoodAccountType> {

            /* compiled from: TransferContext.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[BrokerageAccountType.values().length];
                    try {
                        iArr[BrokerageAccountType.INDIVIDUAL.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[BrokerageAccountType.IRA_ROTH.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[BrokerageAccountType.IRA_TRADITIONAL.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[BrokerageAccountType.JOINT_TENANCY_WITH_ROS.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[BrokerageAccountType.CUSTODIAL_UGMA.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[BrokerageAccountType.CUSTODIAL_UTMA.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[BrokerageAccountType.UNKNOWN.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr[BrokerageAccountType.ISA_STOCKS_AND_SHARES.ordinal()] = 8;
                    } catch (NoSuchFieldError unused8) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
                super((Enum[]) RobinhoodAccountType.getEntries().toArray(new RobinhoodAccountType[0]), false, 2, null);
            }

            public final RobinhoodAccountType from(BrokerageAccountType brokerageAccountType) {
                Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
                switch (WhenMappings.$EnumSwitchMapping$0[brokerageAccountType.ordinal()]) {
                    case 1:
                        return RobinhoodAccountType.BROKERAGE;
                    case 2:
                        return RobinhoodAccountType.RHS_ROTH_IRA;
                    case 3:
                        return RobinhoodAccountType.RHS_TRADITIONAL_IRA;
                    case 4:
                        return RobinhoodAccountType.JOINT_TENANCY_WITH_ROS;
                    case 5:
                    case 6:
                    case 7:
                        throw new IllegalStateException("Cannot convert UNKNOWN brokerage account type to Robinhood account type");
                    case 8:
                        throw new IllegalStateException("ISA stocks and share brokerage type not supported");
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        public static RobinhoodAccountType valueOf(String str) {
            return (RobinhoodAccountType) Enum.valueOf(RobinhoodAccountType.class, str);
        }

        public static RobinhoodAccountType[] values() {
            return (RobinhoodAccountType[]) $VALUES.clone();
        }
    }
}
