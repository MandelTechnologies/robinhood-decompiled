package com.robinhood.android.transfers.p271ui.p272v2;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.transfers.contracts.TransferConfiguration;
import com.robinhood.android.transfers.contracts.TransferV2;
import com.robinhood.android.transfers.international.p266ui.common.DisclosureComposable3;
import com.robinhood.android.transfers.p271ui.max.CreateTransferViewState;
import com.robinhood.android.transfers.p271ui.max.TransferConfigurations;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest2;
import com.robinhood.models.api.bonfire.transfer.TransferDirectionV2;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import java.math.BigDecimal;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import microgram.android.RemoteMicrogramApplication;

/* compiled from: SavedStateHandles.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0000\u001a \u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0000¨\u0006\u0007"}, m3636d2 = {"getSavedDataStateOrCreateInitialState", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2DataState;", "Landroidx/lifecycle/SavedStateHandle;", "paymentMethodLastUsagesMap", "", "", "", "feature-transfers_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ui.v2.SavedStateHandlesKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class SavedStateHandles {
    public static final CreateTransferV2DataState getSavedDataStateOrCreateInitialState(SavedStateHandle savedStateHandle, Map<String, Long> paymentMethodLastUsagesMap) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "<this>");
        Intrinsics.checkNotNullParameter(paymentMethodLastUsagesMap, "paymentMethodLastUsagesMap");
        CreateTransferV2DataState createTransferV2DataState = (CreateTransferV2DataState) savedStateHandle.get(CreateTransferV2Duxo.LatestStateKey);
        if (createTransferV2DataState != null) {
            return createTransferV2DataState;
        }
        TransferV2 transferV2 = (TransferV2) CreateTransferV2Duxo.INSTANCE.getArgs(savedStateHandle);
        BigDecimal amount = transferV2.getTransferConfiguration().getAmount();
        if (amount == null) {
            amount = BigDecimal.ZERO;
        }
        BigDecimal bigDecimal = amount;
        TransferDirectionV2 direction = transferV2.getDirection();
        MAXTransferContext.EntryPoint entryPoint = transferV2.getTransferConfiguration().getEntryPoint();
        Intrinsics.checkNotNull(bigDecimal);
        CreateTransferViewState.Mode initialModeByPromotion = TransferConfigurations.getInitialModeByPromotion(transferV2.getTransferConfiguration());
        String strInputStringFormat = BigDecimals5.inputStringFormat(bigDecimal);
        boolean z = transferV2.getTransferConfiguration() instanceof TransferConfiguration.OutgoingWire;
        RemoteMicrogramApplication remoteMicrogramApplication = new RemoteMicrogramApplication(DisclosureComposable3.DISCLOSURES_APP_ID, null, 2, null);
        boolean hideFrequency = transferV2.getTransferConfiguration().getHideFrequency();
        boolean showFrequencyBottomSheetOnLaunch = transferV2.getTransferConfiguration().getShowFrequencyBottomSheetOnLaunch();
        TransferConfiguration.TransferAccountSelection from = transferV2.getTransferConfiguration().getFrom();
        String id = from != null ? from.getId() : null;
        TransferConfiguration.TransferAccountSelection to = transferV2.getTransferConfiguration().getTo();
        String id2 = to != null ? to.getId() : null;
        TransferConfiguration.TransferAccountSelection from2 = transferV2.getTransferConfiguration().getFrom();
        boolean z2 = from2 != null && from2.isFixed();
        TransferConfiguration.TransferAccountSelection to2 = transferV2.getTransferConfiguration().getTo();
        boolean z3 = to2 != null && to2.isFixed();
        ApiCreateTransferRequest2 frequency = transferV2.getTransferConfiguration().getFrequency();
        if (frequency == null) {
            frequency = ApiCreateTransferRequest2.ONCE;
        }
        return new CreateTransferV2DataState(null, direction, entryPoint, bigDecimal, strInputStringFormat, false, null, id, z2, id2, z3, frequency, hideFrequency, showFrequencyBottomSheetOnLaunch, false, initialModeByPromotion, null, false, false, remoteMicrogramApplication, null, null, null, null, false, null, false, paymentMethodLastUsagesMap, false, z, null, null, false, null, null, null, null, null, null, null, false, false, false, false, null, null, transferV2.getTransferConfiguration().getPromotionName(), transferV2.getTransferConfiguration().getPromotionType(), false, null, false, null, false, transferV2.getTransferConfiguration() instanceof TransferConfiguration.RothConversion, false, false, -671661983, 14630911, null);
    }
}
