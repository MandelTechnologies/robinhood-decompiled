package com.robinhood.android.eventcontracts.hub.p134v2.cards;

import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.p011ui.tooling.preview.PreviewParameterProvider;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.eventcontracts.hub.p134v2.cards.FinalEventCardViewState;
import com.robinhood.android.eventcontracts.sharedeventui.DayNightColor;
import com.robinhood.rosetta.eventlogging.EventContractHubCardContext;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlinx.collections.immutable.extensions2;

/* compiled from: FinalEventCard.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/hub/v2/cards/FinalEventCardPreviewParameterProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lcom/robinhood/android/eventcontracts/hub/v2/cards/FinalEventCardViewState;", "<init>", "()V", "seed1", "Lcom/robinhood/android/eventcontracts/hub/v2/cards/FinalEventCardViewState$ContractViewState;", "seed2", "state", "getState", "()Lcom/robinhood/android/eventcontracts/hub/v2/cards/FinalEventCardViewState;", "values", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", "feature-hub-v2_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.eventcontracts.hub.v2.cards.FinalEventCardPreviewParameterProvider, reason: use source file name */
/* loaded from: classes3.dex */
final class FinalEventCard2 implements PreviewParameterProvider<FinalEventCardViewState> {
    private final FinalEventCardViewState.ContractViewState seed1;
    private final FinalEventCardViewState.ContractViewState seed2;
    private final FinalEventCardViewState state;

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public /* bridge */ /* synthetic */ int getCount() {
        return super.getCount();
    }

    public FinalEventCard2() {
        FinalEventCardViewState.ContractViewState contractViewState = new FinalEventCardViewState.ContractViewState(true, new DayNightColor(Color2.Color(4278220470L), Color2.Color(4278220470L), null), "", "DET", null, "28", "99¢", true);
        this.seed1 = contractViewState;
        FinalEventCardViewState.ContractViewState contractViewState2 = new FinalEventCardViewState.ContractViewState(false, new DayNightColor(Color2.Color(4283701760L), Color2.Color(4283701760L), null), "", "WAS", null, "14", "1¢", false);
        this.seed2 = contractViewState2;
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
        this.state = new FinalEventCardViewState("", new EventContractHubCardContext(null, null, null, null, 15, null), uuidRandomUUID, "Final", extensions2.persistentListOf(contractViewState, contractViewState2));
    }

    public final FinalEventCardViewState getState() {
        return this.state;
    }

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public Sequence<FinalEventCardViewState> getValues() {
        FinalEventCardViewState finalEventCardViewState = this.state;
        return SequencesKt.sequenceOf(finalEventCardViewState, FinalEventCardViewState.copy$default(finalEventCardViewState, null, null, null, null, extensions2.persistentListOf(FinalEventCardViewState.ContractViewState.copy$default(this.seed1, false, null, null, null, null, null, null, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null), FinalEventCardViewState.ContractViewState.copy$default(this.seed2, true, null, null, null, null, null, null, true, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null)), 15, null), FinalEventCardViewState.copy$default(this.state, null, null, null, null, extensions2.persistentListOf(FinalEventCardViewState.ContractViewState.copy$default(this.seed1, false, null, null, null, null, null, null, true, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null), FinalEventCardViewState.ContractViewState.copy$default(this.seed2, false, null, null, null, null, null, null, true, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null)), 15, null), FinalEventCardViewState.copy$default(this.state, null, null, null, null, extensions2.persistentListOf(FinalEventCardViewState.ContractViewState.copy$default(this.seed1, false, null, null, null, "24", null, "9999¢", true, 46, null), FinalEventCardViewState.ContractViewState.copy$default(this.seed2, false, null, null, "Random team name to test out overflow", "14", "162837", "1¢", true, 6, null)), 15, null));
    }
}
