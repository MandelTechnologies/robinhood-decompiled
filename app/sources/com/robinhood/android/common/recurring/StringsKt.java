package com.robinhood.android.common.recurring;

import android.content.res.Resources;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.models.p320db.bonfire.DirectDepositRelationship;
import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: Strings.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a*\u0010\u000e\u001a\u0004\u0018\u00010\u000f*\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0003\u001a\u00020\u0004\u001a2\u0010\u0015\u001a\u0004\u0018\u00010\u0016*\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0018\"\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u0015\u0010\b\u001a\u00020\u0001*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007\"\u0015\u0010\n\u001a\u00020\u0001*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007\"\u0015\u0010\f\u001a\u00020\u0001*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007¨\u0006\u0019"}, m3636d2 = {"labelResId", "", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "isCrypto", "", "labelResIdLowercase", "getLabelResIdLowercase", "(Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;)I", "descriptionResIdCrypto", "getDescriptionResIdCrypto", "descriptionResId", "getDescriptionResId", "achDisclaimerText", "getAchDisclaimerText", "stringResource", "Lcom/robinhood/utils/resource/StringResource;", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$SourceOfFunds;", "achRelationship", "Lcom/robinhood/models/db/AchRelationship;", "directDepositRelationship", "Lcom/robinhood/models/db/bonfire/DirectDepositRelationship;", AnnotatedPrivateKey.LABEL, "", "resources", "Landroid/content/res/Resources;", "feature-lib-recurring_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class StringsKt {

    /* compiled from: Strings.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ApiInvestmentSchedule.Frequency.values().length];
            try {
                iArr[ApiInvestmentSchedule.Frequency.EVERY_PAYCHECK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiInvestmentSchedule.Frequency.BIWEEKLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiInvestmentSchedule.Frequency.DAILY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApiInvestmentSchedule.Frequency.MONTHLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ApiInvestmentSchedule.Frequency.WEEKLY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ApiInvestmentSchedule.SourceOfFunds.values().length];
            try {
                iArr2[ApiInvestmentSchedule.SourceOfFunds.BUYING_POWER.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ApiInvestmentSchedule.SourceOfFunds.ACH_RELATIONSHIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ApiInvestmentSchedule.SourceOfFunds.DIRECT_DEPOSIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final int labelResId(ApiInvestmentSchedule.Frequency frequency, boolean z) {
        Intrinsics.checkNotNullParameter(frequency, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[frequency.ordinal()];
        if (i == 1) {
            return C11595R.string.investment_schedule_frequency_paycheck;
        }
        if (i == 2) {
            return C11595R.string.investment_schedule_frequency_biweekly;
        }
        if (i == 3) {
            if (z) {
                return C11595R.string.investment_schedule_frequency_daily_crypto;
            }
            return C11595R.string.investment_schedule_frequency_daily;
        }
        if (i == 4) {
            return C11595R.string.investment_schedule_frequency_monthly;
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return C11595R.string.investment_schedule_frequency_weekly;
    }

    public static final int getLabelResIdLowercase(ApiInvestmentSchedule.Frequency frequency) {
        Intrinsics.checkNotNullParameter(frequency, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[frequency.ordinal()];
        if (i == 1) {
            return C11595R.string.investment_schedule_frequency_paycheck_lowercase;
        }
        if (i == 2) {
            return C11595R.string.investment_schedule_frequency_biweekly_lowercase;
        }
        if (i == 3) {
            return C11595R.string.investment_schedule_frequency_daily_lowercase;
        }
        if (i == 4) {
            return C11595R.string.investment_schedule_frequency_monthly_lowercase;
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return C11595R.string.investment_schedule_frequency_weekly_lowercase;
    }

    public static final int getDescriptionResIdCrypto(ApiInvestmentSchedule.Frequency frequency) {
        Intrinsics.checkNotNullParameter(frequency, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[frequency.ordinal()];
        if (i == 1) {
            return C11595R.string.investment_schedule_frequency_description_paycheck;
        }
        if (i == 2) {
            return C11595R.string.investment_schedule_frequency_description_biweekly;
        }
        if (i == 3) {
            return C11595R.string.investment_schedule_frequency_description_daily_crypto;
        }
        if (i == 4) {
            return C11595R.string.investment_schedule_frequency_description_monthly;
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return C11595R.string.investment_schedule_frequency_description_weekly;
    }

    public static final int getDescriptionResId(ApiInvestmentSchedule.Frequency frequency) {
        Intrinsics.checkNotNullParameter(frequency, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[frequency.ordinal()];
        if (i == 1) {
            return C11595R.string.investment_schedule_frequency_description_paycheck;
        }
        if (i == 2) {
            return C11595R.string.investment_schedule_frequency_description_biweekly;
        }
        if (i == 3) {
            return C11595R.string.investment_schedule_frequency_description_daily;
        }
        if (i == 4) {
            return C11595R.string.investment_schedule_frequency_description_monthly;
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return C11595R.string.investment_schedule_frequency_description_weekly;
    }

    public static final int getAchDisclaimerText(ApiInvestmentSchedule.Frequency frequency) {
        Intrinsics.checkNotNullParameter(frequency, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[frequency.ordinal()];
        if (i == 1) {
            throw new IllegalStateException("Paycheck frequency should never be paused due to insufficient funds");
        }
        if (i == 2) {
            return C11595R.string.f4048x77f9371e;
        }
        if (i == 3) {
            return C11595R.string.f4049xc6608277;
        }
        if (i == 4) {
            return C11595R.string.f4050xbd6c2ac3;
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return C11595R.string.f4051xa2f28445;
    }

    public static /* synthetic */ StringResource stringResource$default(ApiInvestmentSchedule.SourceOfFunds sourceOfFunds, AchRelationship achRelationship, DirectDepositRelationship directDepositRelationship, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            achRelationship = null;
        }
        return stringResource(sourceOfFunds, achRelationship, directDepositRelationship, z);
    }

    public static final StringResource stringResource(ApiInvestmentSchedule.SourceOfFunds sourceOfFunds, AchRelationship achRelationship, DirectDepositRelationship directDepositRelationship, boolean z) {
        int i;
        String bankAccountNickname;
        String originatorName;
        Intrinsics.checkNotNullParameter(sourceOfFunds, "<this>");
        int i2 = WhenMappings.$EnumSwitchMapping$1[sourceOfFunds.ordinal()];
        if (i2 == 1) {
            StringResource.Companion companion = StringResource.INSTANCE;
            if (z) {
                i = C11595R.string.investment_schedule_source_of_funds_crypto_buying_power;
            } else {
                i = C11595R.string.investment_schedule_source_of_funds_buying_power;
            }
            return companion.invoke(i, new Object[0]);
        }
        if (i2 == 2) {
            if (achRelationship == null || (bankAccountNickname = achRelationship.getBankAccountNickname()) == null) {
                return null;
            }
            return StringResource.INSTANCE.invoke(bankAccountNickname);
        }
        if (i2 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        if (directDepositRelationship == null || (originatorName = directDepositRelationship.getOriginatorName()) == null) {
            return null;
        }
        return StringResource.INSTANCE.invoke(C11595R.string.investment_schedule_source_of_funds_paycheck, originatorName);
    }

    public static /* synthetic */ CharSequence label$default(ApiInvestmentSchedule.SourceOfFunds sourceOfFunds, AchRelationship achRelationship, DirectDepositRelationship directDepositRelationship, boolean z, Resources resources, int i, Object obj) {
        if ((i & 1) != 0) {
            achRelationship = null;
        }
        return label(sourceOfFunds, achRelationship, directDepositRelationship, z, resources);
    }

    public static final CharSequence label(ApiInvestmentSchedule.SourceOfFunds sourceOfFunds, AchRelationship achRelationship, DirectDepositRelationship directDepositRelationship, boolean z, Resources resources) {
        Intrinsics.checkNotNullParameter(sourceOfFunds, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        StringResource stringResource = stringResource(sourceOfFunds, achRelationship, directDepositRelationship, z);
        if (stringResource != null) {
            return stringResource.getText(resources);
        }
        return null;
    }
}
