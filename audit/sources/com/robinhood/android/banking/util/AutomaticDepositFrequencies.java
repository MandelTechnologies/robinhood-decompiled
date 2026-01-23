package com.robinhood.android.banking.util;

import android.content.res.Resources;
import com.robinhood.android.banking.lib.C9631R;
import com.robinhood.models.api.ApiAutomaticDeposit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AutomaticDepositFrequencies.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\f\u0010\u0000\u001a\u00020\u0005*\u00020\u0002H\u0007¨\u0006\u0006"}, m3636d2 = {"getAutomaticDepositOption", "", "Lcom/robinhood/models/api/ApiAutomaticDeposit$Frequency;", "res", "Landroid/content/res/Resources;", "", "feature-lib-banking_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.banking.util.AutomaticDepositFrequenciesKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class AutomaticDepositFrequencies {

    /* compiled from: AutomaticDepositFrequencies.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.banking.util.AutomaticDepositFrequenciesKt$WhenMappings */
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

    public static final String getAutomaticDepositOption(ApiAutomaticDeposit.Frequency frequency, Resources res) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(frequency, "<this>");
        Intrinsics.checkNotNullParameter(res, "res");
        String string2 = res.getString(getAutomaticDepositOption(frequency));
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    public static final int getAutomaticDepositOption(ApiAutomaticDeposit.Frequency frequency) {
        Intrinsics.checkNotNullParameter(frequency, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[frequency.ordinal()];
        if (i == 1) {
            return C9631R.string.ach_transfer_automatic_deposit_once;
        }
        if (i == 2) {
            return C9631R.string.ach_transfer_automatic_deposit_week;
        }
        if (i == 3) {
            return C9631R.string.ach_transfer_automatic_deposit_two_weeks;
        }
        if (i == 4) {
            return C9631R.string.ach_transfer_automatic_deposit_month;
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return C9631R.string.ach_transfer_automatic_deposit_quarter;
    }
}
