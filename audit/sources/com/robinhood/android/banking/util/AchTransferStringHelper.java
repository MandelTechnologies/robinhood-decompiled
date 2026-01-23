package com.robinhood.android.banking.util;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import com.robinhood.android.ach.format.AchRelationships;
import com.robinhood.android.banking.lib.C9631R;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.recurring.StringsKt;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.transfers.contracts.transfercontext.TransferContext;
import com.robinhood.android.transfers.lib.C30383R;
import com.robinhood.common.strings.C32428R;
import com.robinhood.models.api.ApiAutomaticDeposit;
import com.robinhood.models.api.ApiDepositSchedule;
import com.robinhood.models.crypto.p314db.UnifiedBalances;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.models.p320db.TransferDirection;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.LocalDate;

/* compiled from: AchTransferStringHelper.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\nJ'\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0014\u0010\nJI\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJA\u0010\"\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\"\u0010#J9\u0010\"\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\"\u0010$J)\u0010'\u001a\b\u0012\u0004\u0012\u00020\b0%2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00170%¢\u0006\u0004\b'\u0010(J\u001d\u0010)\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b)\u0010*J\u001d\u0010/\u001a\u00020.2\u0006\u0010\u0018\u001a\u00020+2\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b/\u00100J\u001d\u00101\u001a\u00020.2\u0006\u0010\u0018\u001a\u00020+2\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b1\u00100¨\u00062"}, m3636d2 = {"Lcom/robinhood/android/banking/util/AchTransferStringHelper;", "", "<init>", "()V", "Landroid/content/res/Resources;", "res", "Lcom/robinhood/models/db/TransferDirection;", "direction", "", "getTransferAccountLabel", "(Landroid/content/res/Resources;Lcom/robinhood/models/db/TransferDirection;)Ljava/lang/String;", "Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext;", "transferContext", "getDisclaimerText", "(Landroid/content/res/Resources;Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext;)Ljava/lang/String;", "getReviewTransferHeader", "Lcom/robinhood/models/db/AchRelationship;", "relationship", "getReviewTransferBankHeader", "(Landroid/content/res/Resources;Lcom/robinhood/models/db/TransferDirection;Lcom/robinhood/models/db/AchRelationship;)Ljava/lang/String;", "getReviewTransferButton", "Lcom/robinhood/models/crypto/db/UnifiedBalances;", "balances", "Lcom/robinhood/models/api/ApiAutomaticDeposit$Frequency;", "frequency", "Ljava/math/BigDecimal;", "transferAmount", "", "isFromOnboardingRadExp", "getReviewTransferSummary", "(Landroid/content/res/Resources;Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext;Lcom/robinhood/models/crypto/db/UnifiedBalances;Lcom/robinhood/models/db/TransferDirection;Lcom/robinhood/models/api/ApiAutomaticDeposit$Frequency;Ljava/math/BigDecimal;Z)Ljava/lang/String;", "availableInstantDeposit", "isRecurring", "explanation", "getReviewDepositSummary", "(Landroid/content/res/Resources;Ljava/math/BigDecimal;ZLjava/lang/String;Ljava/math/BigDecimal;Z)Ljava/lang/String;", "(Landroid/content/res/Resources;Ljava/math/BigDecimal;Lcom/robinhood/models/api/ApiAutomaticDeposit$Frequency;Ljava/math/BigDecimal;Z)Ljava/lang/String;", "", "frequencies", "getAutomaticDepositOptions", "(Landroid/content/res/Resources;Ljava/util/List;)Ljava/util/List;", "getAutomaticDepositExplanation", "(Landroid/content/res/Resources;Lcom/robinhood/models/api/ApiAutomaticDeposit$Frequency;)Ljava/lang/String;", "Lcom/robinhood/models/api/ApiDepositSchedule$Frequency;", "j$/time/LocalDate", "startDate", "Lcom/robinhood/utils/resource/StringResource;", "getDepositScheduleLongDescription", "(Lcom/robinhood/models/api/ApiDepositSchedule$Frequency;Lj$/time/LocalDate;)Lcom/robinhood/utils/resource/StringResource;", "getDepositScheduleDescription", "feature-lib-banking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class AchTransferStringHelper {
    public static final AchTransferStringHelper INSTANCE = new AchTransferStringHelper();

    /* compiled from: AchTransferStringHelper.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

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
            int[] iArr3 = new int[ApiDepositSchedule.Frequency.values().length];
            try {
                iArr3[ApiDepositSchedule.Frequency.DAILY.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[ApiDepositSchedule.Frequency.WEEKLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[ApiDepositSchedule.Frequency.BIWEEKLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[ApiDepositSchedule.Frequency.BIMONTHLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[ApiDepositSchedule.Frequency.MONTHLY.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[ApiDepositSchedule.Frequency.QUARTERLY.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    private AchTransferStringHelper() {
    }

    @JvmStatic
    public static final String getTransferAccountLabel(Resources res, TransferDirection direction) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(res, "res");
        Intrinsics.checkNotNullParameter(direction, "direction");
        int i = WhenMappings.$EnumSwitchMapping$0[direction.ordinal()];
        if (i == 1) {
            String string2 = res.getString(C11048R.string.general_label_from);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        String string3 = res.getString(C11048R.string.general_label_to);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        return string3;
    }

    @JvmStatic
    public static final String getDisclaimerText(Resources res, TransferContext transferContext) {
        Intrinsics.checkNotNullParameter(res, "res");
        Intrinsics.checkNotNullParameter(transferContext, "transferContext");
        if ((transferContext instanceof TransferContext.Normal) || (transferContext instanceof TransferContext.NormalIav) || (transferContext instanceof TransferContext.RecommendedDeposit) || (transferContext instanceof TransferContext.DepositDeepLink) || (transferContext instanceof TransferContext.AutomaticDeposit) || (transferContext instanceof TransferContext.RecurringDepositFromOnboarding) || (transferContext instanceof TransferContext.QueuedDeposit) || (transferContext instanceof TransferContext.DayTradeCall)) {
            return null;
        }
        if (transferContext instanceof TransferContext.RecommendationsOrderDeposit) {
            return res.getString(C9631R.string.ach_transfer_recommendations_disclaimer_text);
        }
        if (transferContext instanceof TransferContext.MarginCallPrevention) {
            return res.getString(C9631R.string.margin_resolution_warning_deposit_funds_disclaimer);
        }
        if (transferContext instanceof TransferContext.MarginResolution) {
            TransferContext.MarginResolution marginResolution = (TransferContext.MarginResolution) transferContext;
            return res.getString(C9631R.string.margin_resolution_deposit_funds_disclaimer_format, Formats.getCurrencyFormat().format(marginResolution.getRecommendedAmount()), Formats.getCurrencyFormat().format(marginResolution.getMinAmount()));
        }
        if (transferContext instanceof TransferContext.MarginDeposit) {
            int i = C9631R.string.margin_upgrade_deposit_funds_disclaimer;
            NumberFormatter currencyFormat = Formats.getCurrencyFormat();
            BigDecimal minAmount = ((TransferContext.MarginDeposit) transferContext).getMinAmount();
            if (minAmount == null) {
                return null;
            }
            return res.getString(i, currencyFormat.format(minAmount));
        }
        if (!(transferContext instanceof TransferContext.RecurringInsufficientBuyingPower)) {
            throw new NoWhenBranchMatchedException();
        }
        TransferContext.RecurringInsufficientBuyingPower recurringInsufficientBuyingPower = (TransferContext.RecurringInsufficientBuyingPower) transferContext;
        return res.getString(StringsKt.getAchDisclaimerText(recurringInsufficientBuyingPower.getInvestmentScheduleFrequency()), Formats.getCurrencyFormat().format(recurringInsufficientBuyingPower.getRecommendedAmount()));
    }

    @JvmStatic
    public static final String getReviewTransferHeader(Resources res, TransferDirection direction) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(res, "res");
        Intrinsics.checkNotNullParameter(direction, "direction");
        int i = WhenMappings.$EnumSwitchMapping$0[direction.ordinal()];
        if (i == 1) {
            String string2 = res.getString(C9631R.string.ach_transfer_review_deposit_header);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        String string3 = res.getString(C9631R.string.ach_transfer_review_withdrawal_header);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        return string3;
    }

    @JvmStatic
    public static final String getReviewTransferBankHeader(Resources res, TransferDirection direction, AchRelationship relationship) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(res, "res");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(relationship, "relationship");
        String achRelationshipDisplayName = AchRelationships.getAchRelationshipDisplayName(relationship, res);
        int i = WhenMappings.$EnumSwitchMapping$0[direction.ordinal()];
        if (i == 1) {
            String string2 = res.getString(C9631R.string.ach_transfer_review_deposit_secondary_header, achRelationshipDisplayName);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        String string3 = res.getString(C9631R.string.ach_transfer_review_withdrawal_secondary_header, achRelationshipDisplayName);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        return string3;
    }

    @JvmStatic
    public static final String getReviewTransferButton(Resources res, TransferDirection direction) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(res, "res");
        Intrinsics.checkNotNullParameter(direction, "direction");
        int i = WhenMappings.$EnumSwitchMapping$0[direction.ordinal()];
        if (i == 1) {
            String string2 = res.getString(C32428R.string.ach_transfer_deposit_action);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        String string3 = res.getString(C32428R.string.ach_transfer_withdraw_action);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        return string3;
    }

    public static /* synthetic */ String getReviewTransferSummary$default(Resources resources, TransferContext transferContext, UnifiedBalances unifiedBalances, TransferDirection transferDirection, ApiAutomaticDeposit.Frequency frequency, BigDecimal bigDecimal, boolean z, int i, Object obj) {
        if ((i & 64) != 0) {
            z = false;
        }
        return getReviewTransferSummary(resources, transferContext, unifiedBalances, transferDirection, frequency, bigDecimal, z);
    }

    @JvmStatic
    public static final String getReviewTransferSummary(Resources res, TransferContext transferContext, UnifiedBalances balances, TransferDirection direction, ApiAutomaticDeposit.Frequency frequency, BigDecimal transferAmount, boolean isFromOnboardingRadExp) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(res, "res");
        Intrinsics.checkNotNullParameter(transferContext, "transferContext");
        Intrinsics.checkNotNullParameter(balances, "balances");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Intrinsics.checkNotNullParameter(transferAmount, "transferAmount");
        if (transferContext instanceof TransferContext.MarginCallPrevention) {
            String string2 = res.getString(C9631R.string.margin_resolution_warning_deposit_funds_disclaimer);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        if (transferContext instanceof TransferContext.MarginResolution) {
            if (BigDecimals7.gte(transferAmount, ((TransferContext.MarginResolution) transferContext).getRecommendedAmount())) {
                String string3 = res.getString(C9631R.string.margin_resolution_deposit_funds_covered_review_summary);
                Intrinsics.checkNotNull(string3);
                return string3;
            }
            String string4 = res.getString(C9631R.string.margin_resolution_deposit_funds_not_covered_review_summary);
            Intrinsics.checkNotNull(string4);
            return string4;
        }
        if (transferContext instanceof TransferContext.DayTradeCall) {
            if (BigDecimals7.gte(transferAmount, ((TransferContext.DayTradeCall) transferContext).getRecommendedAmount())) {
                String string5 = res.getString(C9631R.string.margin_day_trade_call_deposit_funds_covered_summary);
                Intrinsics.checkNotNull(string5);
                return string5;
            }
            String string6 = res.getString(C9631R.string.margin_day_trade_call_deposit_funds_partial_summary);
            Intrinsics.checkNotNull(string6);
            return string6;
        }
        if (transferContext instanceof TransferContext.MarginDeposit) {
            String string7 = res.getString(C9631R.string.gold_upgrade_deposit_funds_review_transfer_disclaimer);
            Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
            return string7;
        }
        if (!(transferContext instanceof TransferContext.Normal) && !(transferContext instanceof TransferContext.NormalIav) && !(transferContext instanceof TransferContext.RecommendedDeposit) && !(transferContext instanceof TransferContext.DepositDeepLink) && !(transferContext instanceof TransferContext.AutomaticDeposit) && !(transferContext instanceof TransferContext.RecurringDepositFromOnboarding) && !(transferContext instanceof TransferContext.QueuedDeposit) && !(transferContext instanceof TransferContext.RecurringInsufficientBuyingPower) && !(transferContext instanceof TransferContext.RecommendationsOrderDeposit)) {
            throw new NoWhenBranchMatchedException();
        }
        int i = WhenMappings.$EnumSwitchMapping$0[direction.ordinal()];
        if (i == 1) {
            return getReviewDepositSummary(res, balances.getAvailableInstantDeposits(), frequency, transferAmount, isFromOnboardingRadExp);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        String string8 = res.getString(C9631R.string.ach_transfer_review_withdrawal_one_time_disclaimer);
        Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
        return string8;
    }

    public final List<String> getAutomaticDepositOptions(Resources res, List<? extends ApiAutomaticDeposit.Frequency> frequencies) {
        Intrinsics.checkNotNullParameter(res, "res");
        Intrinsics.checkNotNullParameter(frequencies, "frequencies");
        List<? extends ApiAutomaticDeposit.Frequency> list = frequencies;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(AutomaticDepositFrequencies.getAutomaticDepositOption((ApiAutomaticDeposit.Frequency) it.next(), res));
        }
        return arrayList;
    }

    public final String getAutomaticDepositExplanation(Resources res, ApiAutomaticDeposit.Frequency frequency) throws Resources.NotFoundException {
        int i;
        Intrinsics.checkNotNullParameter(res, "res");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        int i2 = WhenMappings.$EnumSwitchMapping$1[frequency.ordinal()];
        if (i2 == 1) {
            i = C30383R.string.ach_transfer_automatic_deposit_description_once;
        } else if (i2 == 2) {
            i = C30383R.string.ach_transfer_automatic_deposit_description_week;
        } else if (i2 == 3) {
            i = C30383R.string.ach_transfer_automatic_deposit_description_two_weeks;
        } else if (i2 == 4) {
            i = C30383R.string.ach_transfer_automatic_deposit_description_month;
        } else {
            if (i2 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            i = C30383R.string.ach_transfer_automatic_deposit_description_quarter;
        }
        String string2 = res.getString(i);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    public static /* synthetic */ String getReviewDepositSummary$default(Resources resources, BigDecimal bigDecimal, boolean z, String str, BigDecimal bigDecimal2, boolean z2, int i, Object obj) {
        if ((i & 32) != 0) {
            z2 = false;
        }
        return getReviewDepositSummary(resources, bigDecimal, z, str, bigDecimal2, z2);
    }

    @JvmStatic
    public static final String getReviewDepositSummary(Resources res, BigDecimal availableInstantDeposit, boolean isRecurring, String explanation, BigDecimal transferAmount, boolean isFromOnboardingRadExp) throws Resources.NotFoundException {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(res, "res");
        Intrinsics.checkNotNullParameter(availableInstantDeposit, "availableInstantDeposit");
        Intrinsics.checkNotNullParameter(explanation, "explanation");
        Intrinsics.checkNotNullParameter(transferAmount, "transferAmount");
        if (!isRecurring) {
            if (availableInstantDeposit.compareTo(BigDecimal.ZERO) <= 0) {
                String string2 = res.getString(C9631R.string.ach_transfer_review_deposit_one_time_disclaimer);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return string2;
            }
            if (availableInstantDeposit.compareTo(transferAmount) >= 0) {
                String string3 = res.getString(C9631R.string.ach_transfer_review_deposit_one_time_fully_instant_disclaimer);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                return string3;
            }
            int i3 = C9631R.string.f3930xf38b0cb6;
            String str = Formats.getCurrencyFormat().format(availableInstantDeposit);
            NumberFormatter currencyFormat = Formats.getCurrencyFormat();
            BigDecimal bigDecimalSubtract = transferAmount.subtract(availableInstantDeposit);
            Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
            String string4 = res.getString(i3, str, currencyFormat.format(bigDecimalSubtract));
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            return string4;
        }
        if (availableInstantDeposit.compareTo(BigDecimal.ZERO) <= 0) {
            if (isFromOnboardingRadExp) {
                i2 = C9631R.string.ach_transfer_review_deposit_automatic_disclaimer_v2;
            } else {
                i2 = C9631R.string.ach_transfer_review_deposit_automatic_disclaimer;
            }
            String string5 = res.getString(i2, explanation);
            Intrinsics.checkNotNull(string5);
            return string5;
        }
        if (availableInstantDeposit.compareTo(transferAmount) >= 0) {
            if (isFromOnboardingRadExp) {
                String string6 = res.getString(C9631R.string.f3927x630ff74c, explanation, Formats.getCurrencyFormat().format(availableInstantDeposit));
                Intrinsics.checkNotNull(string6);
                return string6;
            }
            String string7 = res.getString(C9631R.string.ach_transfer_review_deposit_automatic_fully_instant_disclaimer, explanation);
            Intrinsics.checkNotNull(string7);
            return string7;
        }
        if (isFromOnboardingRadExp) {
            i = C9631R.string.f3929x153a2fd0;
        } else {
            i = C9631R.string.f3928x5896876b;
        }
        String str2 = Formats.getCurrencyFormat().format(availableInstantDeposit);
        NumberFormatter currencyFormat2 = Formats.getCurrencyFormat();
        BigDecimal bigDecimalSubtract2 = transferAmount.subtract(availableInstantDeposit);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract2, "subtract(...)");
        String string8 = res.getString(i, explanation, str2, currencyFormat2.format(bigDecimalSubtract2));
        Intrinsics.checkNotNull(string8);
        return string8;
    }

    public static /* synthetic */ String getReviewDepositSummary$default(Resources resources, BigDecimal bigDecimal, ApiAutomaticDeposit.Frequency frequency, BigDecimal bigDecimal2, boolean z, int i, Object obj) {
        if ((i & 16) != 0) {
            z = false;
        }
        return getReviewDepositSummary(resources, bigDecimal, frequency, bigDecimal2, z);
    }

    @JvmStatic
    public static final String getReviewDepositSummary(Resources res, BigDecimal availableInstantDeposit, ApiAutomaticDeposit.Frequency frequency, BigDecimal transferAmount, boolean isFromOnboardingRadExp) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(res, "res");
        Intrinsics.checkNotNullParameter(availableInstantDeposit, "availableInstantDeposit");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Intrinsics.checkNotNullParameter(transferAmount, "transferAmount");
        return getReviewDepositSummary(res, availableInstantDeposit, frequency.getIsRecurring(), INSTANCE.getAutomaticDepositExplanation(res, frequency), transferAmount, isFromOnboardingRadExp);
    }

    public final StringResource getDepositScheduleLongDescription(ApiDepositSchedule.Frequency frequency, LocalDate startDate) {
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        String str = LocalDateFormatter.WEEKDAY_ONLY.format((LocalDateFormatter) startDate);
        switch (WhenMappings.$EnumSwitchMapping$2[frequency.ordinal()]) {
            case 1:
                return StringResource.INSTANCE.invoke(C9631R.string.deposit_schedule_long_description_once, new Object[0]);
            case 2:
                return StringResource.INSTANCE.invoke(C9631R.string.deposit_schedule_long_description_week, str);
            case 3:
                return StringResource.INSTANCE.invoke(C9631R.string.deposit_schedule_long_description_two_weeks, str);
            case 4:
                return StringResource.INSTANCE.invoke(C9631R.string.deposit_schedule_long_description_two_month, new Object[0]);
            case 5:
                return StringResource.INSTANCE.invoke(C9631R.string.deposit_schedule_long_description_month, MessageFormat.format("{0, ordinal}", Integer.valueOf(startDate.getDayOfMonth())));
            case 6:
                return StringResource.INSTANCE.invoke(C9631R.string.deposit_schedule_description_quarter, new Object[0]);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final StringResource getDepositScheduleDescription(ApiDepositSchedule.Frequency frequency, LocalDate startDate) {
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        String str = LocalDateFormatter.WEEKDAY_ONLY.format((LocalDateFormatter) startDate);
        switch (WhenMappings.$EnumSwitchMapping$2[frequency.ordinal()]) {
            case 1:
                return StringResource.INSTANCE.invoke(C9631R.string.deposit_schedule_description_daily, new Object[0]);
            case 2:
                return StringResource.INSTANCE.invoke(C9631R.string.deposit_schedule_description_week, str);
            case 3:
                return StringResource.INSTANCE.invoke(C9631R.string.deposit_schedule_description_two_weeks, str);
            case 4:
                return StringResource.INSTANCE.invoke(C9631R.string.deposit_schedule_description_two_month, new Object[0]);
            case 5:
                return StringResource.INSTANCE.invoke(C9631R.string.deposit_schedule_description_month, MessageFormat.format("{0, ordinal}", Integer.valueOf(startDate.getDayOfMonth())));
            case 6:
                return StringResource.INSTANCE.invoke(C9631R.string.deposit_schedule_description_quarter, new Object[0]);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
