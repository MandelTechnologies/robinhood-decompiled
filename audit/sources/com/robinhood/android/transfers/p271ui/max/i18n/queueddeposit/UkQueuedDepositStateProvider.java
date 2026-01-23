package com.robinhood.android.transfers.p271ui.max.i18n.queueddeposit;

import android.content.res.Resources;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.p273ui.transfers.ekiben.p274uk.SwitchableTickerInputViewData;
import com.robinhood.android.transfers.p271ui.max.i18n.TransferMode;
import com.robinhood.android.transfers.p271ui.max.i18n.queueddeposit.UkQueuedDepositViewState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.api.bonfire.transfer.ApiDisclosureUIResponse;
import com.robinhood.models.util.Money;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UkQueuedDepositStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositDataState;", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositViewState;", "resources", "Landroid/content/res/Resources;", "<init>", "(Landroid/content/res/Resources;)V", "reduce", "dataState", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class UkQueuedDepositStateProvider implements StateProvider<UkQueuedDepositDataState, UkQueuedDepositViewState> {
    public static final int $stable = 8;
    private final Resources resources;

    /* compiled from: UkQueuedDepositStateProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TransferMode.values().length];
            try {
                iArr[TransferMode.EDIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransferMode.REVIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public UkQueuedDepositStateProvider(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.resources = resources;
    }

    @Override // com.robinhood.android.udf.StateProvider
    public UkQueuedDepositViewState reduce(UkQueuedDepositDataState dataState) {
        UkQueuedDepositViewState.EditModeData editModeData;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        UserInteractionEventDescriptor userInteractionEventDescriptor = dataState.getUserInteractionEventDescriptor();
        SwitchableTickerInputViewData switchableTickerInputViewData = new SwitchableTickerInputViewData(dataState.getInputChars(), UkQueuedDepositStateProvider2.getConversionText(dataState, this.resources), dataState.getAnimateInput(), dataState.getMode() == TransferMode.EDIT);
        TransferMode mode = dataState.getMode();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i = iArr[mode.ordinal()];
        UkQueuedDepositViewState.ReviewModeData reviewModeData = null;
        if (i == 1) {
            editModeData = UkQueuedDepositStateProvider2.getEditModeData(dataState);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            editModeData = null;
        }
        int i2 = iArr[dataState.getMode().ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            StringResource expectedExchangeRate = dataState.getExpectedExchangeRate();
            Money expectedValue = dataState.getExpectedValue();
            String formattedLastUpdatedFxQuote = dataState.getFormattedLastUpdatedFxQuote();
            ApiDisclosureUIResponse disclosureResponse = dataState.getDisclosureResponse();
            reviewModeData = new UkQueuedDepositViewState.ReviewModeData(expectedExchangeRate, expectedValue, formattedLastUpdatedFxQuote, disclosureResponse != null ? disclosureResponse.getDisclosure_text() : null, dataState.isCreatingTransferOrFetchingMandateStatus(), !dataState.isCreatingTransferOrFetchingMandateStatus(), !dataState.isCreatingTransferOrFetchingMandateStatus());
        }
        return new UkQueuedDepositViewState(userInteractionEventDescriptor, switchableTickerInputViewData, editModeData, reviewModeData);
    }
}
