package com.robinhood.android.internalassettransfers.typeselection;

import bonfire.proto.idl.margin.p036v1.GetMultiAccountEligibilityResponseDto;
import bonfire.proto.idl.margin.p036v1.MarginInvestingStateDto;
import bonfire.proto.idl.margin.p036v1.MultiAccountIneligibilityContentModelDto;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: InternalAssetTransferTypeSelectionStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/typeselection/InternalAssetTransferTypeSelectionStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/internalassettransfers/typeselection/InternalAssetTransferTypeSelectionDataState;", "Lcom/robinhood/android/internalassettransfers/typeselection/InternalAssetTransferTypeSelectionViewState;", "<init>", "()V", "reduce", "dataState", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class InternalAssetTransferTypeSelectionStateProvider implements StateProvider<InternalAssetTransferTypeSelectionDataState, InternalAssetTransferTypeSelectionViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public InternalAssetTransferTypeSelectionViewState reduce(InternalAssetTransferTypeSelectionDataState dataState) {
        GetMultiAccountEligibilityResponseDto sinkEligibility;
        MultiAccountIneligibilityContentModelDto ineligibility_content;
        String body_markdown;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        boolean z = dataState.getSinkEligibility() == null && dataState.isInMibExperiment();
        GetMultiAccountEligibilityResponseDto sourceEligibility = dataState.getSourceEligibility();
        StringResource stringResourceInvoke = null;
        MarginInvestingStateDto margin_investing_state = sourceEligibility != null ? sourceEligibility.getMargin_investing_state() : null;
        MarginInvestingStateDto marginInvestingStateDto = MarginInvestingStateDto.MARGIN_INVESTING_STATE_ENABLED;
        boolean z2 = margin_investing_state == marginInvestingStateDto;
        boolean z3 = dataState.getEligibleAssets().getAvailableCash().compareTo(BigDecimal.ZERO) < 0;
        GetMultiAccountEligibilityResponseDto sinkEligibility2 = dataState.getSinkEligibility();
        boolean z4 = (sinkEligibility2 == null || sinkEligibility2.is_eligible()) ? false : true;
        GetMultiAccountEligibilityResponseDto sinkEligibility3 = dataState.getSinkEligibility();
        boolean z5 = z2 && z3 && z4 && !((sinkEligibility3 != null ? sinkEligibility3.getMargin_investing_state() : null) == marginInvestingStateDto);
        if (z5 && (sinkEligibility = dataState.getSinkEligibility()) != null && (ineligibility_content = sinkEligibility.getIneligibility_content()) != null && (body_markdown = ineligibility_content.getBody_markdown()) != null) {
            if (StringsKt.isBlank(body_markdown)) {
                body_markdown = null;
            }
            if (body_markdown != null) {
                stringResourceInvoke = StringResource.INSTANCE.invoke(body_markdown);
            }
        }
        return new InternalAssetTransferTypeSelectionViewState(dataState.getEligibleAssets(), dataState.getSinkAccount(), dataState.getSourceAccount(), z5, stringResourceInvoke, z, dataState.getEnableMarginDialogData());
    }
}
