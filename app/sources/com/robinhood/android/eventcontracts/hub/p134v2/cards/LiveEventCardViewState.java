package com.robinhood.android.eventcontracts.hub.p134v2.cards;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.eventcontracts.hub.p134v2.home.HubDefaultCategoryContentViewState2;
import com.robinhood.android.eventcontracts.hub.p134v2.p135ui.CardPills7;
import com.robinhood.android.eventcontracts.sharedeventui.DayNightColor;
import com.robinhood.android.markdown.compose.MarkdownText4;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.EventContractHubCardContext;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LiveEventCard.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001>BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\t\u00100\u001a\u00020\u0007HÆ\u0003J\t\u00101\u001a\u00020\tHÆ\u0003J\t\u00102\u001a\u00020\u000bHÆ\u0003J\t\u00103\u001a\u00020\u000bHÆ\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010\u001fJ\t\u00105\u001a\u00020\u0010HÆ\u0003J`\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001¢\u0006\u0002\u00107J\u0013\u00108\u001a\u00020\u00102\b\u00109\u001a\u0004\u0018\u00010:HÖ\u0003J\t\u0010;\u001a\u00020<HÖ\u0001J\t\u0010=\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010!R\u0011\u0010\"\u001a\u00020#8G¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0011\u0010&\u001a\u00020#8G¢\u0006\u0006\u001a\u0004\b'\u0010%R\u001a\u0010(\u001a\u00020)8FX\u0087\u0004¢\u0006\f\u0012\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u0006?"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/hub/v2/cards/LiveEventCardViewState;", "Lcom/robinhood/android/eventcontracts/hub/v2/home/HubCardComponent;", "hubCardContext", "Lcom/robinhood/rosetta/eventlogging/EventContractHubCardContext;", "sectionIdentifier", "", "eventId", "Ljava/util/UUID;", "primaryText", "Lcom/robinhood/utils/resource/StringResource;", "leftContractViewState", "Lcom/robinhood/android/eventcontracts/hub/v2/cards/LiveEventCardViewState$ContractViewState;", "rightContractViewState", "progress", "", "isInAcqStreamlinedTradeFlowExperiment", "", "<init>", "(Lcom/robinhood/rosetta/eventlogging/EventContractHubCardContext;Ljava/lang/String;Ljava/util/UUID;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/android/eventcontracts/hub/v2/cards/LiveEventCardViewState$ContractViewState;Lcom/robinhood/android/eventcontracts/hub/v2/cards/LiveEventCardViewState$ContractViewState;Ljava/lang/Float;Z)V", "getHubCardContext", "()Lcom/robinhood/rosetta/eventlogging/EventContractHubCardContext;", "getSectionIdentifier", "()Ljava/lang/String;", "getEventId", "()Ljava/util/UUID;", "getPrimaryText", "()Lcom/robinhood/utils/resource/StringResource;", "getLeftContractViewState", "()Lcom/robinhood/android/eventcontracts/hub/v2/cards/LiveEventCardViewState$ContractViewState;", "getRightContractViewState", "getProgress", "()Ljava/lang/Float;", "Ljava/lang/Float;", "()Z", "progressBarActiveColor", "Landroidx/compose/ui/graphics/Color;", "getProgressBarActiveColor", "(Landroidx/compose/runtime/Composer;I)J", "progressBarBackgroundColor", "getProgressBarBackgroundColor", "pillTopPadding", "Landroidx/compose/ui/unit/Dp;", "getPillTopPadding-D9Ej5fM$annotations", "()V", "getPillTopPadding-D9Ej5fM", "()F", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Lcom/robinhood/rosetta/eventlogging/EventContractHubCardContext;Ljava/lang/String;Ljava/util/UUID;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/android/eventcontracts/hub/v2/cards/LiveEventCardViewState$ContractViewState;Lcom/robinhood/android/eventcontracts/hub/v2/cards/LiveEventCardViewState$ContractViewState;Ljava/lang/Float;Z)Lcom/robinhood/android/eventcontracts/hub/v2/cards/LiveEventCardViewState;", "equals", "other", "", "hashCode", "", "toString", "ContractViewState", "feature-hub-v2_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final /* data */ class LiveEventCardViewState extends HubDefaultCategoryContentViewState2 {
    public static final int $stable = 0;
    private final UUID eventId;
    private final EventContractHubCardContext hubCardContext;
    private final boolean isInAcqStreamlinedTradeFlowExperiment;
    private final ContractViewState leftContractViewState;
    private final StringResource primaryText;
    private final Float progress;
    private final ContractViewState rightContractViewState;
    private final String sectionIdentifier;

    public static /* synthetic */ LiveEventCardViewState copy$default(LiveEventCardViewState liveEventCardViewState, EventContractHubCardContext eventContractHubCardContext, String str, UUID uuid, StringResource stringResource, ContractViewState contractViewState, ContractViewState contractViewState2, Float f, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            eventContractHubCardContext = liveEventCardViewState.hubCardContext;
        }
        if ((i & 2) != 0) {
            str = liveEventCardViewState.sectionIdentifier;
        }
        if ((i & 4) != 0) {
            uuid = liveEventCardViewState.eventId;
        }
        if ((i & 8) != 0) {
            stringResource = liveEventCardViewState.primaryText;
        }
        if ((i & 16) != 0) {
            contractViewState = liveEventCardViewState.leftContractViewState;
        }
        if ((i & 32) != 0) {
            contractViewState2 = liveEventCardViewState.rightContractViewState;
        }
        if ((i & 64) != 0) {
            f = liveEventCardViewState.progress;
        }
        if ((i & 128) != 0) {
            z = liveEventCardViewState.isInAcqStreamlinedTradeFlowExperiment;
        }
        Float f2 = f;
        boolean z2 = z;
        ContractViewState contractViewState3 = contractViewState;
        ContractViewState contractViewState4 = contractViewState2;
        return liveEventCardViewState.copy(eventContractHubCardContext, str, uuid, stringResource, contractViewState3, contractViewState4, f2, z2);
    }

    /* renamed from: getPillTopPadding-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m14322getPillTopPaddingD9Ej5fM$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final EventContractHubCardContext getHubCardContext() {
        return this.hubCardContext;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSectionIdentifier() {
        return this.sectionIdentifier;
    }

    /* renamed from: component3, reason: from getter */
    public final UUID getEventId() {
        return this.eventId;
    }

    /* renamed from: component4, reason: from getter */
    public final StringResource getPrimaryText() {
        return this.primaryText;
    }

    /* renamed from: component5, reason: from getter */
    public final ContractViewState getLeftContractViewState() {
        return this.leftContractViewState;
    }

    /* renamed from: component6, reason: from getter */
    public final ContractViewState getRightContractViewState() {
        return this.rightContractViewState;
    }

    /* renamed from: component7, reason: from getter */
    public final Float getProgress() {
        return this.progress;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsInAcqStreamlinedTradeFlowExperiment() {
        return this.isInAcqStreamlinedTradeFlowExperiment;
    }

    public final LiveEventCardViewState copy(EventContractHubCardContext hubCardContext, String sectionIdentifier, UUID eventId, StringResource primaryText, ContractViewState leftContractViewState, ContractViewState rightContractViewState, Float progress, boolean isInAcqStreamlinedTradeFlowExperiment) {
        Intrinsics.checkNotNullParameter(hubCardContext, "hubCardContext");
        Intrinsics.checkNotNullParameter(sectionIdentifier, "sectionIdentifier");
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        Intrinsics.checkNotNullParameter(leftContractViewState, "leftContractViewState");
        Intrinsics.checkNotNullParameter(rightContractViewState, "rightContractViewState");
        return new LiveEventCardViewState(hubCardContext, sectionIdentifier, eventId, primaryText, leftContractViewState, rightContractViewState, progress, isInAcqStreamlinedTradeFlowExperiment);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LiveEventCardViewState)) {
            return false;
        }
        LiveEventCardViewState liveEventCardViewState = (LiveEventCardViewState) other;
        return Intrinsics.areEqual(this.hubCardContext, liveEventCardViewState.hubCardContext) && Intrinsics.areEqual(this.sectionIdentifier, liveEventCardViewState.sectionIdentifier) && Intrinsics.areEqual(this.eventId, liveEventCardViewState.eventId) && Intrinsics.areEqual(this.primaryText, liveEventCardViewState.primaryText) && Intrinsics.areEqual(this.leftContractViewState, liveEventCardViewState.leftContractViewState) && Intrinsics.areEqual(this.rightContractViewState, liveEventCardViewState.rightContractViewState) && Intrinsics.areEqual((Object) this.progress, (Object) liveEventCardViewState.progress) && this.isInAcqStreamlinedTradeFlowExperiment == liveEventCardViewState.isInAcqStreamlinedTradeFlowExperiment;
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.hubCardContext.hashCode() * 31) + this.sectionIdentifier.hashCode()) * 31) + this.eventId.hashCode()) * 31) + this.primaryText.hashCode()) * 31) + this.leftContractViewState.hashCode()) * 31) + this.rightContractViewState.hashCode()) * 31;
        Float f = this.progress;
        return ((iHashCode + (f == null ? 0 : f.hashCode())) * 31) + Boolean.hashCode(this.isInAcqStreamlinedTradeFlowExperiment);
    }

    public String toString() {
        return "LiveEventCardViewState(hubCardContext=" + this.hubCardContext + ", sectionIdentifier=" + this.sectionIdentifier + ", eventId=" + this.eventId + ", primaryText=" + this.primaryText + ", leftContractViewState=" + this.leftContractViewState + ", rightContractViewState=" + this.rightContractViewState + ", progress=" + this.progress + ", isInAcqStreamlinedTradeFlowExperiment=" + this.isInAcqStreamlinedTradeFlowExperiment + ")";
    }

    public /* synthetic */ LiveEventCardViewState(EventContractHubCardContext eventContractHubCardContext, String str, UUID uuid, StringResource stringResource, ContractViewState contractViewState, ContractViewState contractViewState2, Float f, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(eventContractHubCardContext, str, uuid, stringResource, contractViewState, contractViewState2, f, (i & 128) != 0 ? false : z);
    }

    @Override // com.robinhood.android.eventcontracts.hub.p134v2.home.HubDefaultCategoryContentViewState2
    public EventContractHubCardContext getHubCardContext() {
        return this.hubCardContext;
    }

    @Override // com.robinhood.android.eventcontracts.hub.p134v2.home.HubDefaultCategoryContentViewState2, com.robinhood.android.eventcontracts.hub.p134v2.home.HubDefaultCategoryContentViewState4
    public String getSectionIdentifier() {
        return this.sectionIdentifier;
    }

    public final UUID getEventId() {
        return this.eventId;
    }

    public final StringResource getPrimaryText() {
        return this.primaryText;
    }

    public final ContractViewState getLeftContractViewState() {
        return this.leftContractViewState;
    }

    public final ContractViewState getRightContractViewState() {
        return this.rightContractViewState;
    }

    public final Float getProgress() {
        return this.progress;
    }

    public final boolean isInAcqStreamlinedTradeFlowExperiment() {
        return this.isInAcqStreamlinedTradeFlowExperiment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveEventCardViewState(EventContractHubCardContext hubCardContext, String sectionIdentifier, UUID eventId, StringResource primaryText, ContractViewState leftContractViewState, ContractViewState rightContractViewState, Float f, boolean z) {
        super(eventId, sectionIdentifier);
        Intrinsics.checkNotNullParameter(hubCardContext, "hubCardContext");
        Intrinsics.checkNotNullParameter(sectionIdentifier, "sectionIdentifier");
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        Intrinsics.checkNotNullParameter(leftContractViewState, "leftContractViewState");
        Intrinsics.checkNotNullParameter(rightContractViewState, "rightContractViewState");
        this.hubCardContext = hubCardContext;
        this.sectionIdentifier = sectionIdentifier;
        this.eventId = eventId;
        this.primaryText = primaryText;
        this.leftContractViewState = leftContractViewState;
        this.rightContractViewState = rightContractViewState;
        this.progress = f;
        this.isInAcqStreamlinedTradeFlowExperiment = z;
    }

    /* compiled from: LiveEventCard.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010%\u001a\u00020\fHÆ\u0003J\t\u0010&\u001a\u00020\u000eHÆ\u0003J\t\u0010'\u001a\u00020\u000eHÆ\u0003Ji\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001J\u0013\u0010)\u001a\u00020\u000e2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u001dR\u0011\u0010\u000f\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001d¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/hub/v2/cards/LiveEventCardViewState$ContractViewState;", "", "contractId", "Ljava/util/UUID;", MarkdownText4.TagImageUrl, "", "contractColor", "Lcom/robinhood/android/eventcontracts/sharedeventui/DayNightColor;", "primaryText", "secondaryText", "metadata", "pillState", "Lcom/robinhood/android/eventcontracts/hub/v2/ui/ContractPillState;", "isActive", "", "showGradientBackground", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Lcom/robinhood/android/eventcontracts/sharedeventui/DayNightColor;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/eventcontracts/hub/v2/ui/ContractPillState;ZZ)V", "getContractId", "()Ljava/util/UUID;", "getImageUrl", "()Ljava/lang/String;", "getContractColor", "()Lcom/robinhood/android/eventcontracts/sharedeventui/DayNightColor;", "getPrimaryText", "getSecondaryText", "getMetadata", "getPillState", "()Lcom/robinhood/android/eventcontracts/hub/v2/ui/ContractPillState;", "()Z", "getShowGradientBackground", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "feature-hub-v2_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ContractViewState {
        public static final int $stable = 8;
        private final DayNightColor contractColor;
        private final UUID contractId;
        private final String imageUrl;
        private final boolean isActive;
        private final String metadata;
        private final CardPills7 pillState;
        private final String primaryText;
        private final String secondaryText;
        private final boolean showGradientBackground;

        public static /* synthetic */ ContractViewState copy$default(ContractViewState contractViewState, UUID uuid, String str, DayNightColor dayNightColor, String str2, String str3, String str4, CardPills7 cardPills7, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = contractViewState.contractId;
            }
            if ((i & 2) != 0) {
                str = contractViewState.imageUrl;
            }
            if ((i & 4) != 0) {
                dayNightColor = contractViewState.contractColor;
            }
            if ((i & 8) != 0) {
                str2 = contractViewState.primaryText;
            }
            if ((i & 16) != 0) {
                str3 = contractViewState.secondaryText;
            }
            if ((i & 32) != 0) {
                str4 = contractViewState.metadata;
            }
            if ((i & 64) != 0) {
                cardPills7 = contractViewState.pillState;
            }
            if ((i & 128) != 0) {
                z = contractViewState.isActive;
            }
            if ((i & 256) != 0) {
                z2 = contractViewState.showGradientBackground;
            }
            boolean z3 = z;
            boolean z4 = z2;
            String str5 = str4;
            CardPills7 cardPills72 = cardPills7;
            String str6 = str3;
            DayNightColor dayNightColor2 = dayNightColor;
            return contractViewState.copy(uuid, str, dayNightColor2, str2, str6, str5, cardPills72, z3, z4);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getContractId() {
            return this.contractId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getImageUrl() {
            return this.imageUrl;
        }

        /* renamed from: component3, reason: from getter */
        public final DayNightColor getContractColor() {
            return this.contractColor;
        }

        /* renamed from: component4, reason: from getter */
        public final String getPrimaryText() {
            return this.primaryText;
        }

        /* renamed from: component5, reason: from getter */
        public final String getSecondaryText() {
            return this.secondaryText;
        }

        /* renamed from: component6, reason: from getter */
        public final String getMetadata() {
            return this.metadata;
        }

        /* renamed from: component7, reason: from getter */
        public final CardPills7 getPillState() {
            return this.pillState;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getIsActive() {
            return this.isActive;
        }

        /* renamed from: component9, reason: from getter */
        public final boolean getShowGradientBackground() {
            return this.showGradientBackground;
        }

        public final ContractViewState copy(UUID contractId, String imageUrl, DayNightColor contractColor, String primaryText, String secondaryText, String metadata, CardPills7 pillState, boolean isActive, boolean showGradientBackground) {
            Intrinsics.checkNotNullParameter(contractId, "contractId");
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            Intrinsics.checkNotNullParameter(primaryText, "primaryText");
            Intrinsics.checkNotNullParameter(pillState, "pillState");
            return new ContractViewState(contractId, imageUrl, contractColor, primaryText, secondaryText, metadata, pillState, isActive, showGradientBackground);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ContractViewState)) {
                return false;
            }
            ContractViewState contractViewState = (ContractViewState) other;
            return Intrinsics.areEqual(this.contractId, contractViewState.contractId) && Intrinsics.areEqual(this.imageUrl, contractViewState.imageUrl) && Intrinsics.areEqual(this.contractColor, contractViewState.contractColor) && Intrinsics.areEqual(this.primaryText, contractViewState.primaryText) && Intrinsics.areEqual(this.secondaryText, contractViewState.secondaryText) && Intrinsics.areEqual(this.metadata, contractViewState.metadata) && Intrinsics.areEqual(this.pillState, contractViewState.pillState) && this.isActive == contractViewState.isActive && this.showGradientBackground == contractViewState.showGradientBackground;
        }

        public int hashCode() {
            int iHashCode = ((this.contractId.hashCode() * 31) + this.imageUrl.hashCode()) * 31;
            DayNightColor dayNightColor = this.contractColor;
            int iHashCode2 = (((iHashCode + (dayNightColor == null ? 0 : dayNightColor.hashCode())) * 31) + this.primaryText.hashCode()) * 31;
            String str = this.secondaryText;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.metadata;
            return ((((((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.pillState.hashCode()) * 31) + Boolean.hashCode(this.isActive)) * 31) + Boolean.hashCode(this.showGradientBackground);
        }

        public String toString() {
            return "ContractViewState(contractId=" + this.contractId + ", imageUrl=" + this.imageUrl + ", contractColor=" + this.contractColor + ", primaryText=" + this.primaryText + ", secondaryText=" + this.secondaryText + ", metadata=" + this.metadata + ", pillState=" + this.pillState + ", isActive=" + this.isActive + ", showGradientBackground=" + this.showGradientBackground + ")";
        }

        public ContractViewState(UUID contractId, String imageUrl, DayNightColor dayNightColor, String primaryText, String str, String str2, CardPills7 pillState, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(contractId, "contractId");
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            Intrinsics.checkNotNullParameter(primaryText, "primaryText");
            Intrinsics.checkNotNullParameter(pillState, "pillState");
            this.contractId = contractId;
            this.imageUrl = imageUrl;
            this.contractColor = dayNightColor;
            this.primaryText = primaryText;
            this.secondaryText = str;
            this.metadata = str2;
            this.pillState = pillState;
            this.isActive = z;
            this.showGradientBackground = z2;
        }

        public final UUID getContractId() {
            return this.contractId;
        }

        public final String getImageUrl() {
            return this.imageUrl;
        }

        public final DayNightColor getContractColor() {
            return this.contractColor;
        }

        public final String getPrimaryText() {
            return this.primaryText;
        }

        public final String getSecondaryText() {
            return this.secondaryText;
        }

        public final String getMetadata() {
            return this.metadata;
        }

        public final CardPills7 getPillState() {
            return this.pillState;
        }

        public final boolean isActive() {
            return this.isActive;
        }

        public final boolean getShowGradientBackground() {
            return this.showGradientBackground;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @JvmName
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long getProgressBarActiveColor(Composer composer, int i) {
        boolean z;
        long color;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1659483505, i, -1, "com.robinhood.android.eventcontracts.hub.v2.cards.LiveEventCardViewState.<get-progressBarActiveColor> (LiveEventCard.kt:96)");
        }
        composer.startReplaceGroup(1330783895);
        if (this.progress == null) {
            z = true;
        } else {
            DayNightColor contractColor = this.leftContractViewState.getContractColor();
            if ((contractColor == null ? null : Color.m6701boximpl(contractColor.getColor(composer, 0))) != null) {
                z = false;
            }
        }
        composer.endReplaceGroup();
        if (z) {
            composer.startReplaceGroup(-1695292636);
            color = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21427getFg30d7_KjU();
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1695241424);
            color = this.leftContractViewState.getContractColor().getColor(composer, 0);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return color;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @JvmName
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long getProgressBarBackgroundColor(Composer composer, int i) {
        boolean z;
        long color;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(198035185, i, -1, "com.robinhood.android.eventcontracts.hub.v2.cards.LiveEventCardViewState.<get-progressBarBackgroundColor> (LiveEventCard.kt:107)");
        }
        composer.startReplaceGroup(1333254168);
        if (this.progress == null) {
            z = true;
        } else {
            DayNightColor contractColor = this.rightContractViewState.getContractColor();
            if ((contractColor == null ? null : Color.m6701boximpl(contractColor.getColor(composer, 0))) != null) {
                z = false;
            }
        }
        composer.endReplaceGroup();
        if (z) {
            composer.startReplaceGroup(-1618713212);
            color = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21426getFg20d7_KjU();
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1618661969);
            color = this.rightContractViewState.getContractColor().getColor(composer, 0);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return color;
    }

    /* renamed from: getPillTopPadding-D9Ej5fM, reason: not valid java name */
    public final float m14323getPillTopPaddingD9Ej5fM() {
        return ((this.leftContractViewState.getPillState() instanceof CardPills7.QuoteWithPositionPillState) || (this.rightContractViewState.getPillState() instanceof CardPills7.QuoteWithPositionPillState)) ? C2002Dp.m7995constructorimpl(4) : C2002Dp.m7995constructorimpl(12);
    }
}
