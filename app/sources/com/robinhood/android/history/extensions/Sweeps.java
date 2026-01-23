package com.robinhood.android.history.extensions;

import android.content.Context;
import com.robinhood.android.history.C18359R;
import com.robinhood.models.api.ApiSweep;
import com.robinhood.models.p320db.mcduckling.Sweep;
import com.robinhood.models.util.Money;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Sweeps.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m3636d2 = {"getPaymentReason", "", "Lcom/robinhood/models/db/mcduckling/Sweep;", "context", "Landroid/content/Context;", "feature-history_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.history.extensions.SweepsKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class Sweeps {

    /* compiled from: Sweeps.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.history.extensions.SweepsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Money.Direction.values().length];
            try {
                iArr[Money.Direction.CREDIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Money.Direction.DEBIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ApiSweep.PayoutType.values().length];
            try {
                iArr2[ApiSweep.PayoutType.UNIDENTIFIED_EARLY_INTEREST_PAYMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ApiSweep.PayoutType.SWEEP_PROGRAM_OPT_OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ApiSweep.PayoutType.PROGRAM_BANK_OPT_OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ApiSweep.PayoutType.END_OF_MONTH_PAYMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ApiSweep.PayoutType.PAYMENT_REVERSAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final String getPaymentReason(Sweep sweep, Context context) {
        Intrinsics.checkNotNullParameter(sweep, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        int i = WhenMappings.$EnumSwitchMapping$1[sweep.getPayoutType().ordinal()];
        if (i == 1) {
            String string2 = context.getString(C18359R.string.sweep_payment_reason_unidentified_early_interest_payment);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        if (i == 2) {
            String string3 = context.getString(C18359R.string.sweep_payment_reason_sweep_program_opt_out);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            return string3;
        }
        if (i == 3) {
            String string4 = context.getString(C18359R.string.sweep_payment_reason_program_bank_opt_out);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            return string4;
        }
        if (i == 4) {
            String string5 = context.getString(C18359R.string.sweep_payment_reason_end_of_month_payment);
            Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
            return string5;
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[sweep.getDirection().ordinal()];
        if (i2 == 1) {
            String string6 = context.getString(C18359R.string.sweep_payment_reason_payment_reversal_credit);
            Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
            return string6;
        }
        if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        String string7 = context.getString(C18359R.string.sweep_payment_reason_payment_reversal_debit);
        Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
        return string7;
    }
}
