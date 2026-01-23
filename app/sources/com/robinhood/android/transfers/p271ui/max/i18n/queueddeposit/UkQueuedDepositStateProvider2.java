package com.robinhood.android.transfers.p271ui.max.i18n.queueddeposit;

import android.content.res.Resources;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.transfers.p271ui.max.i18n.InternationalTransferStateProvider2;
import com.robinhood.android.transfers.p271ui.max.i18n.TransferMode;
import com.robinhood.android.transfers.p271ui.max.i18n.queueddeposit.UkQueuedDepositViewState;
import com.robinhood.models.p320db.TransferDirection;
import com.robinhood.models.p325fx.api.ApiFxQuote;
import com.robinhood.utils.money.Currencies;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UkQueuedDepositStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0001\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0002H\u0001¨\u0006\u0007"}, m3636d2 = {"getConversionText", "", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositDataState;", "resources", "Landroid/content/res/Resources;", "getEditModeData", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositViewState$EditModeData;", "feature-transfers_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositStateProviderKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class UkQueuedDepositStateProvider2 {
    public static final String getConversionText(UkQueuedDepositDataState ukQueuedDepositDataState, Resources resources) {
        ApiFxQuote fxQuote;
        Intrinsics.checkNotNullParameter(ukQueuedDepositDataState, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        if (ukQueuedDepositDataState.isMcwEnabled() || ukQueuedDepositDataState.getMode() != TransferMode.EDIT || (fxQuote = ukQueuedDepositDataState.getFxQuote()) == null) {
            return null;
        }
        return InternationalTransferStateProvider2.convertCurrency(Currencies.GBP, TransferDirection.DEPOSIT, ukQueuedDepositDataState.getAmount(), fxQuote, resources);
    }

    public static final UkQueuedDepositViewState.EditModeData getEditModeData(UkQueuedDepositDataState ukQueuedDepositDataState) {
        int i;
        UkQueuedDepositViewState.EditModeData.PrimaryButtonAction primaryButtonAction;
        Intrinsics.checkNotNullParameter(ukQueuedDepositDataState, "<this>");
        StringResource.Companion companion = StringResource.INSTANCE;
        if (ukQueuedDepositDataState.isMcwEnabled()) {
            i = C11048R.string.general_action_submit;
        } else {
            i = C11048R.string.general_action_review;
        }
        StringResource stringResourceInvoke = companion.invoke(i, new Object[0]);
        boolean zIsPositive = ukQueuedDepositDataState.getAmount().isPositive();
        boolean zIsCreatingTransferOrFetchingMandateStatus = ukQueuedDepositDataState.isMcwEnabled() ? ukQueuedDepositDataState.isCreatingTransferOrFetchingMandateStatus() : false;
        if (ukQueuedDepositDataState.isMcwEnabled()) {
            primaryButtonAction = UkQueuedDepositViewState.EditModeData.PrimaryButtonAction.SUBMIT;
        } else {
            primaryButtonAction = UkQueuedDepositViewState.EditModeData.PrimaryButtonAction.REVIEW;
        }
        return new UkQueuedDepositViewState.EditModeData(stringResourceInvoke, zIsPositive, zIsCreatingTransferOrFetchingMandateStatus, primaryButtonAction);
    }
}
