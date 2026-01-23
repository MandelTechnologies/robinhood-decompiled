package com.robinhood.android.history.p153ui;

import android.content.res.Resources;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.history.C18359R;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.util.Money;
import com.robinhood.transfers.models.p406db.AchTransfer;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.LocalDate;

/* compiled from: AchTransferDetailStringsHelper.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/history/ui/AchTransferDetailStringsHelper;", "", "<init>", "()V", "getReversedTransferDetail", "", "resources", "Landroid/content/res/Resources;", "achTransfer", "Lcom/robinhood/transfers/models/db/AchTransfer;", "account", "Lcom/robinhood/models/db/Account;", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class AchTransferDetailStringsHelper {
    public static final int $stable = 0;
    public static final AchTransferDetailStringsHelper INSTANCE = new AchTransferDetailStringsHelper();

    /* compiled from: AchTransferDetailStringsHelper.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Account.InstantEligibility.State.values().length];
            try {
                iArr[Account.InstantEligibility.State.f5666OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Account.InstantEligibility.State.IN_REVIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Account.InstantEligibility.State.PENDING_DEPOSIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Account.InstantEligibility.State.SUSPENDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Account.InstantEligibility.State.REVOKED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private AchTransferDetailStringsHelper() {
    }

    public final CharSequence getReversedTransferDetail(Resources resources, AchTransfer achTransfer, Account account) throws Resources.NotFoundException {
        String string2;
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(achTransfer, "achTransfer");
        String string3 = resources.getString(C18359R.string.ach_transfer_detail_reversal_message, Formats.getCurrencyFormat().format(achTransfer.getFees()));
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        String statusDescription = achTransfer.getStatusDescription();
        if (statusDescription != null && (string2 = resources.getString(C11048R.string.sentences_joiner, string3, resources.getString(C18359R.string.ach_transfer_detail_reversal_reason_suffix, statusDescription))) != null) {
            string3 = string2;
        }
        if (account != null && account.isMargin() && Intrinsics.areEqual(account.getInstantEligibility().getReversal(), achTransfer.getId())) {
            int i = WhenMappings.$EnumSwitchMapping$0[account.getInstantEligibility().getState().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return string3 + "\n\n" + resources.getString(C18359R.string.ach_transfer_detail_reversal_in_review_summary);
                }
                if (i == 3) {
                    return string3 + "\n\n" + resources.getString(C18359R.string.ach_transfer_detail_reversal_pending_deposit_summary, Money.format$default(achTransfer.getAmount(), null, false, null, false, 0, null, false, null, false, false, 1023, null));
                }
                if (i != 4) {
                    if (i != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return string3 + "\n\n" + resources.getString(C18359R.string.ach_transfer_detail_reversal_revoked_summary);
                }
                int i2 = C18359R.string.ach_transfer_detail_reversal_suspended_summary;
                LocalDate reinstatementDate = account.getInstantEligibility().getReinstatementDate();
                return string3 + "\n\n" + resources.getString(i2, reinstatementDate != null ? LocalDateFormatter.MEDIUM.format(reinstatementDate) : null);
            }
        }
        return string3;
    }
}
