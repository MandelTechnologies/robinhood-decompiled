package com.robinhood.android.transfers.p271ui.max.i18n.mcw;

import com.robinhood.android.transfers.p271ui.common.TransferAmountEntryLayout;
import com.robinhood.android.transfers.p271ui.max.i18n.mcw.InternationalTransferV2ViewState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.api.bonfire.transfer.ApiTransferSummaryRequest;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.utils.resource.StringResource;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.extensions2;

/* compiled from: InternationalTransferV2StateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/mcw/InternationalTransferV2StateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/transfers/ui/max/i18n/mcw/InternationalTransferV2DataState;", "Lcom/robinhood/android/transfers/ui/max/i18n/mcw/InternationalTransferV2ViewState;", "<init>", "()V", "reduce", "dataState", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class InternationalTransferV2StateProvider implements StateProvider<InternationalTransferV2DataState, InternationalTransferV2ViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public InternationalTransferV2ViewState reduce(InternationalTransferV2DataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        StringResource toolbarTitle = InternationalTransferV2StateProvider2.getToolbarTitle(dataState);
        String amountInput = dataState.getAmountInput();
        TransferAmountEntryLayout amountEntryState = dataState.getAmountEntryState();
        InternationalTransferV2ViewState.AccountRowState sourceAccountRowState = InternationalTransferV2StateProvider2.getSourceAccountRowState(dataState);
        InternationalTransferV2ViewState.AccountRowState sinkAccountRowState = InternationalTransferV2StateProvider2.getSinkAccountRowState(dataState);
        StringResource sourceDropdownChipText = InternationalTransferV2StateProvider2.getSourceDropdownChipText(dataState);
        InternationalTransferV2ViewState.AmountInputPrimaryAction amountInputPrimaryAction = InternationalTransferV2StateProvider2.getAmountInputPrimaryAction(dataState);
        StringResource primaryButtonText = InternationalTransferV2StateProvider2.getPrimaryButtonText(dataState);
        boolean zIsPrimaryButtonEnabled = InternationalTransferV2StateProvider2.isPrimaryButtonEnabled(dataState);
        boolean zIsPrimaryButtonLoading = InternationalTransferV2StateProvider2.isPrimaryButtonLoading(dataState);
        ApiTransferSummaryRequest transferSummaryRequest = InternationalTransferV2StateProvider2.getTransferSummaryRequest(dataState);
        List<UIComponent<GenericAction>> transferSummaryContent = dataState.getTransferSummaryContent();
        return new InternationalTransferV2ViewState(toolbarTitle, amountInput, amountEntryState, sourceAccountRowState, sinkAccountRowState, sourceDropdownChipText, amountInputPrimaryAction, primaryButtonText, zIsPrimaryButtonEnabled, zIsPrimaryButtonLoading, transferSummaryRequest, transferSummaryContent != null ? extensions2.toImmutableList(transferSummaryContent) : null, InternationalTransferV2StateProvider2.getPromotionInfoTagText(dataState));
    }
}
