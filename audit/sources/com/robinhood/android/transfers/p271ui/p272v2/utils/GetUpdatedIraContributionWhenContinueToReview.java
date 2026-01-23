package com.robinhood.android.transfers.p271ui.p272v2.utils;

import com.robinhood.android.lib.transfers.util.TransferAccounts2;
import com.robinhood.android.transfers.contracts.IraContributionQuestionnaireResult;
import com.robinhood.models.api.bonfire.IraContributionType;
import com.robinhood.models.api.bonfire.transfer.TransferDirectionV2;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Year;

/* compiled from: GetUpdatedIraContributionWhenContinueToReview.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0005\u001a=\u0010\n\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireResult$IraContribution;", "currentIraContribution", "Lcom/robinhood/models/api/bonfire/transfer/TransferDirectionV2;", "direction", "Lcom/robinhood/models/api/bonfire/IraContributionType;", "iraContributionTypeFromTransferConfig", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "updatedToAccount", "j$/time/Year", "systemCalendarYear", "getUpdatedIraContributionWhenContinueToReview", "(Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireResult$IraContribution;Lcom/robinhood/models/api/bonfire/transfer/TransferDirectionV2;Lcom/robinhood/models/api/bonfire/IraContributionType;Lcom/robinhood/models/db/bonfire/TransferAccount;Lj$/time/Year;)Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireResult$IraContribution;", "feature-transfers_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ui.v2.utils.GetUpdatedIraContributionWhenContinueToReviewKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class GetUpdatedIraContributionWhenContinueToReview {
    public static final IraContributionQuestionnaireResult.IraContribution getUpdatedIraContributionWhenContinueToReview(IraContributionQuestionnaireResult.IraContribution iraContribution, TransferDirectionV2 direction, IraContributionType iraContributionType, TransferAccount transferAccount, Year systemCalendarYear) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(systemCalendarYear, "systemCalendarYear");
        return (direction == TransferDirectionV2.DEPOSIT && transferAccount != null && transferAccount.isIra() && iraContribution == null) ? TransferAccounts2.getDefaultContributionInfo(transferAccount, iraContributionType, systemCalendarYear) : iraContribution;
    }
}
