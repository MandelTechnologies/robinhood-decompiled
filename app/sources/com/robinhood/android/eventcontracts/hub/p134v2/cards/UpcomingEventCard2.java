package com.robinhood.android.eventcontracts.hub.p134v2.cards;

import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.p011ui.tooling.preview.PreviewParameterProvider;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.eventcontracts.hub.p134v2.cards.UpcomingEventCardViewState;
import com.robinhood.android.eventcontracts.hub.p134v2.p135ui.CardPills7;
import com.robinhood.android.eventcontracts.sharedeventui.DayNightColor;
import com.robinhood.rosetta.eventlogging.EventContractHubCardContext;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlinx.collections.immutable.extensions2;

/* compiled from: UpcomingEventCard.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/hub/v2/cards/UpcomingEventCardPreviewStateProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lcom/robinhood/android/eventcontracts/hub/v2/cards/UpcomingEventCardViewState;", "<init>", "()V", "contract1", "Lcom/robinhood/android/eventcontracts/hub/v2/cards/UpcomingEventCardViewState$ContractViewState;", "getContract1", "()Lcom/robinhood/android/eventcontracts/hub/v2/cards/UpcomingEventCardViewState$ContractViewState;", "contract2", "getContract2", "cardViewState", "getCardViewState", "()Lcom/robinhood/android/eventcontracts/hub/v2/cards/UpcomingEventCardViewState;", "values", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", "feature-hub-v2_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.eventcontracts.hub.v2.cards.UpcomingEventCardPreviewStateProvider, reason: use source file name */
/* loaded from: classes3.dex */
final class UpcomingEventCard2 implements PreviewParameterProvider<UpcomingEventCardViewState> {
    private final UpcomingEventCardViewState cardViewState;
    private final UpcomingEventCardViewState.ContractViewState contract1;
    private final UpcomingEventCardViewState.ContractViewState contract2;

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public /* bridge */ /* synthetic */ int getCount() {
        return super.getCount();
    }

    public UpcomingEventCard2() {
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
        UpcomingEventCardViewState.ContractViewState contractViewState = new UpcomingEventCardViewState.ContractViewState(uuidRandomUUID, new DayNightColor(Color2.Color(4278220470L), Color2.Color(4278220470L), null), "https://cdn.robinhood.com/app_assets/futures/events_images/football/helmet/helmet_hydro_light_small.png", "DET", "6-7", "9", new CardPills7.QuoteWithNoPositionPillState("90¢"), true);
        this.contract1 = contractViewState;
        UUID uuidRandomUUID2 = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID2, "randomUUID(...)");
        UpcomingEventCardViewState.ContractViewState contractViewState2 = new UpcomingEventCardViewState.ContractViewState(uuidRandomUUID2, new DayNightColor(Color2.Color(4283701760L), Color2.Color(4283701760L), null), "https://cdn.robinhood.com/app_assets/futures/events_images/football/helmet/helmet_burgundy_small.png", "WAS", "3-10", "25", new CardPills7.QuoteWithNoPositionPillState("10¢"), true);
        this.contract2 = contractViewState2;
        UUID uuidRandomUUID3 = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID3, "randomUUID(...)");
        this.cardViewState = new UpcomingEventCardViewState(new EventContractHubCardContext(null, null, null, null, 15, null), "", uuidRandomUUID3, StringResource.INSTANCE.invoke("SEPT 14 @ 7 PM"), null, extensions2.persistentListOf(contractViewState, contractViewState2), true, false, false);
    }

    public final UpcomingEventCardViewState.ContractViewState getContract1() {
        return this.contract1;
    }

    public final UpcomingEventCardViewState.ContractViewState getContract2() {
        return this.contract2;
    }

    public final UpcomingEventCardViewState getCardViewState() {
        return this.cardViewState;
    }

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public Sequence<UpcomingEventCardViewState> getValues() {
        UpcomingEventCardViewState upcomingEventCardViewState = this.cardViewState;
        UpcomingEventCardViewState upcomingEventCardViewStateCopy$default = UpcomingEventCardViewState.copy$default(upcomingEventCardViewState, null, null, null, null, null, extensions2.persistentListOf(UpcomingEventCardViewState.ContractViewState.copy$default(this.contract1, null, null, null, null, null, null, null, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, null), UpcomingEventCardViewState.ContractViewState.copy$default(this.contract2, null, null, null, null, null, null, null, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, null)), false, false, false, 479, null);
        UpcomingEventCardViewState upcomingEventCardViewStateCopy$default2 = UpcomingEventCardViewState.copy$default(this.cardViewState, null, null, null, null, null, extensions2.persistentListOf(UpcomingEventCardViewState.ContractViewState.copy$default(this.contract1, null, null, null, null, null, null, null, false, 239, null), UpcomingEventCardViewState.ContractViewState.copy$default(this.contract2, null, null, null, null, null, null, null, false, 239, null)), false, false, false, 479, null);
        UpcomingEventCardViewState upcomingEventCardViewStateCopy$default3 = UpcomingEventCardViewState.copy$default(this.cardViewState, null, null, null, null, null, extensions2.persistentListOf(UpcomingEventCardViewState.ContractViewState.copy$default(this.contract1, null, null, null, null, null, null, null, false, EnumC7081g.SDK_ASSET_ICON_COMMENT_VALUE, null), UpcomingEventCardViewState.ContractViewState.copy$default(this.contract2, null, null, null, null, null, null, null, false, EnumC7081g.SDK_ASSET_ICON_COMMENT_VALUE, null)), false, false, false, 479, null);
        UpcomingEventCardViewState upcomingEventCardViewState2 = this.cardViewState;
        StringResource.Companion companion = StringResource.INSTANCE;
        return SequencesKt.sequenceOf(upcomingEventCardViewState, upcomingEventCardViewStateCopy$default, upcomingEventCardViewStateCopy$default2, upcomingEventCardViewStateCopy$default3, UpcomingEventCardViewState.copy$default(upcomingEventCardViewState2, null, null, null, companion.invoke("Jun 3"), "What will the Fed funds rate be in June 2025?", extensions2.persistentListOf(UpcomingEventCardViewState.ContractViewState.copy$default(this.contract1, null, null, null, "Above 2.75%", null, null, null, false, EnumC7081g.SDK_ASSET_ICON_CANCEL_VALUE, null), UpcomingEventCardViewState.ContractViewState.copy$default(this.contract1, null, null, null, "Above 3.00%", null, null, null, false, EnumC7081g.SDK_ASSET_ICON_CANCEL_VALUE, null), UpcomingEventCardViewState.ContractViewState.copy$default(this.contract1, null, null, null, "Above 3.50%", null, null, null, false, EnumC7081g.SDK_ASSET_ICON_CANCEL_VALUE, null)), false, false, false, 455, null), UpcomingEventCardViewState.copy$default(this.cardViewState, null, null, null, null, "US gas price in June", extensions2.persistentListOf(UpcomingEventCardViewState.ContractViewState.copy$default(this.contract1, null, null, null, "Above $2.90", null, null, null, false, EnumC7081g.SDK_ASSET_ICON_CANCEL_VALUE, null), UpcomingEventCardViewState.ContractViewState.copy$default(this.contract1, null, null, null, "Above $2.95", null, null, null, false, EnumC7081g.SDK_ASSET_ICON_CANCEL_VALUE, null), UpcomingEventCardViewState.ContractViewState.copy$default(this.contract1, null, null, null, "Above $3.00", null, null, null, false, EnumC7081g.SDK_ASSET_ICON_CANCEL_VALUE, null)), false, false, false, 455, null), UpcomingEventCardViewState.copy$default(this.cardViewState, null, null, null, null, null, extensions2.persistentListOf(UpcomingEventCardViewState.ContractViewState.copy$default(this.contract1, null, null, null, null, null, null, new CardPills7.QuoteWithPositionPillState("90¢", companion.invoke("20"), new DayNightColor(Color2.Color(4278220470L), Color2.Color(4278220470L), null)), false, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, null), this.contract2), false, false, false, 479, null), UpcomingEventCardViewState.copy$default(this.cardViewState, null, null, null, null, null, extensions2.persistentListOf(UpcomingEventCardViewState.ContractViewState.copy$default(this.contract1, null, null, null, null, null, null, new CardPills7.QuoteWithPositionPillState("90¢", companion.invoke("20"), new DayNightColor(Color2.Color(4278220470L), Color2.Color(4278220470L), null)), false, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, null), UpcomingEventCardViewState.ContractViewState.copy$default(this.contract2, null, null, null, null, null, null, new CardPills7.QuoteWithPositionPillState("90¢", companion.invoke("20"), new DayNightColor(Color2.Color(4278220470L), Color2.Color(4278220470L), null)), false, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, null)), false, false, false, 479, null), UpcomingEventCardViewState.copy$default(this.cardViewState, null, null, null, companion.invoke("Canceled"), null, extensions2.persistentListOf(UpcomingEventCardViewState.ContractViewState.copy$default(this.contract1, null, null, null, null, null, null, null, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, null), UpcomingEventCardViewState.ContractViewState.copy$default(this.contract2, null, null, null, null, null, null, null, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, null)), false, false, false, 471, null), UpcomingEventCardViewState.copy$default(this.cardViewState, null, null, null, null, null, extensions2.persistentListOf(UpcomingEventCardViewState.ContractViewState.copy$default(this.contract1, null, null, null, null, null, null, null, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE, null), UpcomingEventCardViewState.ContractViewState.copy$default(this.contract2, null, null, null, null, null, null, null, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE, null)), false, false, false, 479, null));
    }
}
