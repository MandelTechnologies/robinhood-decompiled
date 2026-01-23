package com.robinhood.store.event;

import com.robinhood.prediction_markets.proto.p361v1.combo.CreateComboRFQResponseDto;
import com.robinhood.prediction_markets.proto.p361v1.combo.GetComboProposalsResponseDto;
import com.robinhood.prediction_markets.proto.p361v1.idl.ComboProposalDto;
import com.robinhood.store.event.ProposalData;
import com.robinhood.store.event.RfqResult;
import com.robinhood.utils.extensions.StringsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventComboStore.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0003*\u00020\u0004\u001a\n\u0010\u0000\u001a\u00020\u0005*\u00020\u0006¨\u0006\u0007"}, m3636d2 = {"toUiModel", "Lcom/robinhood/store/event/RfqResult$RfqData;", "Lcom/robinhood/prediction_markets/proto/v1/combo/CreateComboRFQResponseDto;", "Lcom/robinhood/store/event/ProposalData;", "Lcom/robinhood/prediction_markets/proto/v1/combo/GetComboProposalsResponseDto;", "Lcom/robinhood/store/event/ProposalData$Proposal;", "Lcom/robinhood/prediction_markets/proto/v1/idl/ComboProposalDto;", "lib-store-event_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class EventComboStoreKt {
    public static final RfqResult.RfqData toUiModel(CreateComboRFQResponseDto createComboRFQResponseDto) {
        Intrinsics.checkNotNullParameter(createComboRFQResponseDto, "<this>");
        return new RfqResult.RfqData(createComboRFQResponseDto.getRfq_id(), StringsKt.toUuid(createComboRFQResponseDto.getCombo_instrument_id()), createComboRFQResponseDto.getProposal_polling_duration_ms());
    }

    public static final ProposalData toUiModel(GetComboProposalsResponseDto getComboProposalsResponseDto) {
        Intrinsics.checkNotNullParameter(getComboProposalsResponseDto, "<this>");
        if (getComboProposalsResponseDto.getBest_yes_bid() == null && getComboProposalsResponseDto.getBest_no_bid() == null) {
            return null;
        }
        ComboProposalDto best_yes_bid = getComboProposalsResponseDto.getBest_yes_bid();
        ProposalData.Proposal uiModel = best_yes_bid != null ? toUiModel(best_yes_bid) : null;
        ComboProposalDto best_no_bid = getComboProposalsResponseDto.getBest_no_bid();
        return new ProposalData(uiModel, best_no_bid != null ? toUiModel(best_no_bid) : null);
    }

    public static final ProposalData.Proposal toUiModel(ComboProposalDto comboProposalDto) {
        Intrinsics.checkNotNullParameter(comboProposalDto, "<this>");
        return new ProposalData.Proposal(comboProposalDto.getQuote_id(), comboProposalDto.getPrice().toBigDecimalOrThrow(), comboProposalDto.getQuantity().toBigDecimalOrThrow());
    }
}
