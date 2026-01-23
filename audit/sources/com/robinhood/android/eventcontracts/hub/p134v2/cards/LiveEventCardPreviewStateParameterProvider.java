package com.robinhood.android.eventcontracts.hub.p134v2.cards;

import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.p011ui.tooling.preview.PreviewParameterProvider;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.eventcontracts.hub.p134v2.cards.LiveEventCardViewState;
import com.robinhood.android.eventcontracts.hub.p134v2.p135ui.CardPills7;
import com.robinhood.android.eventcontracts.sharedeventui.DayNightColor;
import com.robinhood.rosetta.eventlogging.EventContractHubCardContext;
import com.robinhood.utils.resource.StringResource;
import com.singular.sdk.internal.Constants;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* compiled from: LiveEventCard.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/hub/v2/cards/LiveEventCardPreviewStateParameterProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lcom/robinhood/android/eventcontracts/hub/v2/cards/LiveEventCardViewState;", "<init>", "()V", "leftContractState", "Lcom/robinhood/android/eventcontracts/hub/v2/cards/LiveEventCardViewState$ContractViewState;", "getLeftContractState", "()Lcom/robinhood/android/eventcontracts/hub/v2/cards/LiveEventCardViewState$ContractViewState;", "rightContractState", "getRightContractState", "state", "getState", "()Lcom/robinhood/android/eventcontracts/hub/v2/cards/LiveEventCardViewState;", "values", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", "feature-hub-v2_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
final class LiveEventCardPreviewStateParameterProvider implements PreviewParameterProvider<LiveEventCardViewState> {
    private final LiveEventCardViewState.ContractViewState leftContractState;
    private final LiveEventCardViewState.ContractViewState rightContractState;
    private final LiveEventCardViewState state;

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public /* bridge */ /* synthetic */ int getCount() {
        return super.getCount();
    }

    public LiveEventCardPreviewStateParameterProvider() {
        DayNightColor dayNightColor = new DayNightColor(Color2.Color(4278211009L), Color2.Color(4278211009L), null);
        CardPills7.QuoteWithNoPositionPillState quoteWithNoPositionPillState = new CardPills7.QuoteWithNoPositionPillState("30¢");
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
        LiveEventCardViewState.ContractViewState contractViewState = new LiveEventCardViewState.ContractViewState(uuidRandomUUID, "", dayNightColor, "BAL", "12", "28", quoteWithNoPositionPillState, true, true);
        this.leftContractState = contractViewState;
        DayNightColor dayNightColor2 = new DayNightColor(Color2.Color(4292227890L), Color2.Color(4292227890L), null);
        CardPills7.QuoteWithNoPositionPillState quoteWithNoPositionPillState2 = new CardPills7.QuoteWithNoPositionPillState("70¢");
        UUID uuidRandomUUID2 = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID2, "randomUUID(...)");
        LiveEventCardViewState.ContractViewState contractViewState2 = new LiveEventCardViewState.ContractViewState(uuidRandomUUID2, "", dayNightColor2, "OKST", "9", "14", quoteWithNoPositionPillState2, false, true);
        this.rightContractState = contractViewState2;
        StringResource stringResourceInvoke = StringResource.INSTANCE.invoke("Halftime");
        EventContractHubCardContext eventContractHubCardContext = new EventContractHubCardContext(null, null, null, null, 15, null);
        UUID uuidRandomUUID3 = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID3, "randomUUID(...)");
        this.state = new LiveEventCardViewState(eventContractHubCardContext, "", uuidRandomUUID3, stringResourceInvoke, contractViewState, contractViewState2, Float.valueOf(0.3f), false);
    }

    public final LiveEventCardViewState.ContractViewState getLeftContractState() {
        return this.leftContractState;
    }

    public final LiveEventCardViewState.ContractViewState getRightContractState() {
        return this.rightContractState;
    }

    public final LiveEventCardViewState getState() {
        return this.state;
    }

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public Sequence<LiveEventCardViewState> getValues() {
        LiveEventCardViewState liveEventCardViewState = this.state;
        StringResource.Companion companion = StringResource.INSTANCE;
        return SequencesKt.sequenceOf(liveEventCardViewState, LiveEventCardViewState.copy$default(liveEventCardViewState, null, null, null, companion.invoke("Q2 8:45 · 1st & 10 · PIT 20"), LiveEventCardViewState.ContractViewState.copy$default(this.leftContractState, null, null, null, null, null, null, null, false, false, 383, null), LiveEventCardViewState.ContractViewState.copy$default(this.rightContractState, null, null, null, null, null, null, new CardPills7.QuoteWithPositionPillState("70¢", companion.invoke(Constants.SdidMigrationStatusCodes.ALREADY_SDID), new DayNightColor(Color2.Color(4292227890L), Color2.Color(4292227890L), null)), true, false, 63, null), null, false, EnumC7081g.SDK_ASSET_ICON_CANCEL_VALUE, null), LiveEventCardViewState.copy$default(this.state, null, null, null, companion.invoke("Q2 8:45 · 1st & 10 · PIT 20"), LiveEventCardViewState.ContractViewState.copy$default(this.leftContractState, null, null, null, null, null, null, new CardPills7.QuoteWithPositionPillState("30¢", companion.invoke(Constants.SdidMigrationStatusCodes.ALREADY_SDID), new DayNightColor(Color2.Color(4278211009L), Color2.Color(4278211009L), null)), false, false, 47, null), LiveEventCardViewState.ContractViewState.copy$default(this.rightContractState, null, null, null, null, null, null, new CardPills7.QuoteWithPositionPillState("70¢", companion.invoke(Constants.SdidMigrationStatusCodes.ALREADY_SDID), new DayNightColor(Color2.Color(4292227890L), Color2.Color(4292227890L), null)), true, false, EnumC7081g.SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_DARK_APPEARANCE_VALUE, null), null, false, EnumC7081g.SDK_ASSET_ICON_CANCEL_VALUE, null), LiveEventCardViewState.copy$default(this.state, null, null, null, null, LiveEventCardViewState.ContractViewState.copy$default(this.leftContractState, null, null, null, "This is to test", null, null, null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE, null), LiveEventCardViewState.ContractViewState.copy$default(this.rightContractState, null, null, null, "if text will overflow", null, null, null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE, null), null, false, EnumC7081g.SDK_ASSET_ICON_COMMENT_VALUE, null), LiveEventCardViewState.copy$default(this.state, null, null, null, null, LiveEventCardViewState.ContractViewState.copy$default(this.leftContractState, null, null, null, null, null, null, null, false, false, 507, null), LiveEventCardViewState.ContractViewState.copy$default(this.rightContractState, null, null, null, null, null, null, null, false, false, 507, null), null, false, EnumC7081g.SDK_ASSET_ICON_COMMENT_VALUE, null), LiveEventCardViewState.copy$default(this.state, null, null, null, null, null, null, null, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, null));
    }
}
