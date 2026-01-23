package com.robinhood.android.eventcontracts.hub.p134v2.cards;

import com.robinhood.android.eventcontracts.hub.p134v2.home.HubDefaultCategoryContentViewState2;
import com.robinhood.android.eventcontracts.hub.p134v2.p135ui.CardPills7;
import com.robinhood.android.eventcontracts.sharedeventui.DayNightColor;
import com.robinhood.android.markdown.compose.MarkdownText4;
import com.robinhood.rosetta.eventlogging.EventContractHubCardContext;
import com.robinhood.utils.resource.StringResource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: UpcomingEventCard.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u00013B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003J\t\u0010)\u001a\u00020\u000fHÆ\u0003J\t\u0010*\u001a\u00020\u000fHÆ\u0003J\t\u0010+\u001a\u00020\u000fHÆ\u0003Jm\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000fHÆ\u0001J\u0013\u0010-\u001a\u00020\u000f2\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\t\u00102\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u001fR\u0011\u0010\u0010\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0011\u0010\u0011\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u001fR\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050\f8F¢\u0006\u0006\u001a\u0004\b\"\u0010\u001e¨\u00064"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/hub/v2/cards/UpcomingEventCardViewState;", "Lcom/robinhood/android/eventcontracts/hub/v2/home/HubCardComponent;", "hubCardContext", "Lcom/robinhood/rosetta/eventlogging/EventContractHubCardContext;", "sectionIdentifier", "", "eventId", "Ljava/util/UUID;", "title", "Lcom/robinhood/utils/resource/StringResource;", "subtitle", "contractsStates", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/eventcontracts/hub/v2/cards/UpcomingEventCardViewState$ContractViewState;", "isTappable", "", "showLiveIcon", "isInAcqStreamlinedTradeFlowExperiment", "<init>", "(Lcom/robinhood/rosetta/eventlogging/EventContractHubCardContext;Ljava/lang/String;Ljava/util/UUID;Lcom/robinhood/utils/resource/StringResource;Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;ZZZ)V", "getHubCardContext", "()Lcom/robinhood/rosetta/eventlogging/EventContractHubCardContext;", "getSectionIdentifier", "()Ljava/lang/String;", "getEventId", "()Ljava/util/UUID;", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getSubtitle", "getContractsStates", "()Lkotlinx/collections/immutable/ImmutableList;", "()Z", "getShowLiveIcon", "tertiaryTextStrings", "getTertiaryTextStrings", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "", "toString", "ContractViewState", "feature-hub-v2_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final /* data */ class UpcomingEventCardViewState extends HubDefaultCategoryContentViewState2 {
    public static final int $stable = 0;
    private final ImmutableList<ContractViewState> contractsStates;
    private final UUID eventId;
    private final EventContractHubCardContext hubCardContext;
    private final boolean isInAcqStreamlinedTradeFlowExperiment;
    private final boolean isTappable;
    private final String sectionIdentifier;
    private final boolean showLiveIcon;
    private final String subtitle;
    private final StringResource title;

    public static /* synthetic */ UpcomingEventCardViewState copy$default(UpcomingEventCardViewState upcomingEventCardViewState, EventContractHubCardContext eventContractHubCardContext, String str, UUID uuid, StringResource stringResource, String str2, ImmutableList immutableList, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            eventContractHubCardContext = upcomingEventCardViewState.hubCardContext;
        }
        if ((i & 2) != 0) {
            str = upcomingEventCardViewState.sectionIdentifier;
        }
        if ((i & 4) != 0) {
            uuid = upcomingEventCardViewState.eventId;
        }
        if ((i & 8) != 0) {
            stringResource = upcomingEventCardViewState.title;
        }
        if ((i & 16) != 0) {
            str2 = upcomingEventCardViewState.subtitle;
        }
        if ((i & 32) != 0) {
            immutableList = upcomingEventCardViewState.contractsStates;
        }
        if ((i & 64) != 0) {
            z = upcomingEventCardViewState.isTappable;
        }
        if ((i & 128) != 0) {
            z2 = upcomingEventCardViewState.showLiveIcon;
        }
        if ((i & 256) != 0) {
            z3 = upcomingEventCardViewState.isInAcqStreamlinedTradeFlowExperiment;
        }
        boolean z4 = z2;
        boolean z5 = z3;
        ImmutableList immutableList2 = immutableList;
        boolean z6 = z;
        String str3 = str2;
        UUID uuid2 = uuid;
        return upcomingEventCardViewState.copy(eventContractHubCardContext, str, uuid2, stringResource, str3, immutableList2, z6, z4, z5);
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
    public final StringResource getTitle() {
        return this.title;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    public final ImmutableList<ContractViewState> component6() {
        return this.contractsStates;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsTappable() {
        return this.isTappable;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getShowLiveIcon() {
        return this.showLiveIcon;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsInAcqStreamlinedTradeFlowExperiment() {
        return this.isInAcqStreamlinedTradeFlowExperiment;
    }

    public final UpcomingEventCardViewState copy(EventContractHubCardContext hubCardContext, String sectionIdentifier, UUID eventId, StringResource title, String subtitle, ImmutableList<ContractViewState> contractsStates, boolean isTappable, boolean showLiveIcon, boolean isInAcqStreamlinedTradeFlowExperiment) {
        Intrinsics.checkNotNullParameter(hubCardContext, "hubCardContext");
        Intrinsics.checkNotNullParameter(sectionIdentifier, "sectionIdentifier");
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(contractsStates, "contractsStates");
        return new UpcomingEventCardViewState(hubCardContext, sectionIdentifier, eventId, title, subtitle, contractsStates, isTappable, showLiveIcon, isInAcqStreamlinedTradeFlowExperiment);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpcomingEventCardViewState)) {
            return false;
        }
        UpcomingEventCardViewState upcomingEventCardViewState = (UpcomingEventCardViewState) other;
        return Intrinsics.areEqual(this.hubCardContext, upcomingEventCardViewState.hubCardContext) && Intrinsics.areEqual(this.sectionIdentifier, upcomingEventCardViewState.sectionIdentifier) && Intrinsics.areEqual(this.eventId, upcomingEventCardViewState.eventId) && Intrinsics.areEqual(this.title, upcomingEventCardViewState.title) && Intrinsics.areEqual(this.subtitle, upcomingEventCardViewState.subtitle) && Intrinsics.areEqual(this.contractsStates, upcomingEventCardViewState.contractsStates) && this.isTappable == upcomingEventCardViewState.isTappable && this.showLiveIcon == upcomingEventCardViewState.showLiveIcon && this.isInAcqStreamlinedTradeFlowExperiment == upcomingEventCardViewState.isInAcqStreamlinedTradeFlowExperiment;
    }

    public int hashCode() {
        int iHashCode = ((((this.hubCardContext.hashCode() * 31) + this.sectionIdentifier.hashCode()) * 31) + this.eventId.hashCode()) * 31;
        StringResource stringResource = this.title;
        int iHashCode2 = (iHashCode + (stringResource == null ? 0 : stringResource.hashCode())) * 31;
        String str = this.subtitle;
        return ((((((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.contractsStates.hashCode()) * 31) + Boolean.hashCode(this.isTappable)) * 31) + Boolean.hashCode(this.showLiveIcon)) * 31) + Boolean.hashCode(this.isInAcqStreamlinedTradeFlowExperiment);
    }

    public String toString() {
        return "UpcomingEventCardViewState(hubCardContext=" + this.hubCardContext + ", sectionIdentifier=" + this.sectionIdentifier + ", eventId=" + this.eventId + ", title=" + this.title + ", subtitle=" + this.subtitle + ", contractsStates=" + this.contractsStates + ", isTappable=" + this.isTappable + ", showLiveIcon=" + this.showLiveIcon + ", isInAcqStreamlinedTradeFlowExperiment=" + this.isInAcqStreamlinedTradeFlowExperiment + ")";
    }

    public /* synthetic */ UpcomingEventCardViewState(EventContractHubCardContext eventContractHubCardContext, String str, UUID uuid, StringResource stringResource, String str2, ImmutableList immutableList, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(eventContractHubCardContext, str, uuid, stringResource, str2, immutableList, z, z2, (i & 256) != 0 ? false : z3);
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

    public final StringResource getTitle() {
        return this.title;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final ImmutableList<ContractViewState> getContractsStates() {
        return this.contractsStates;
    }

    public final boolean isTappable() {
        return this.isTappable;
    }

    public final boolean getShowLiveIcon() {
        return this.showLiveIcon;
    }

    public final boolean isInAcqStreamlinedTradeFlowExperiment() {
        return this.isInAcqStreamlinedTradeFlowExperiment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpcomingEventCardViewState(EventContractHubCardContext hubCardContext, String sectionIdentifier, UUID eventId, StringResource stringResource, String str, ImmutableList<ContractViewState> contractsStates, boolean z, boolean z2, boolean z3) {
        super(eventId, sectionIdentifier);
        Intrinsics.checkNotNullParameter(hubCardContext, "hubCardContext");
        Intrinsics.checkNotNullParameter(sectionIdentifier, "sectionIdentifier");
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(contractsStates, "contractsStates");
        this.hubCardContext = hubCardContext;
        this.sectionIdentifier = sectionIdentifier;
        this.eventId = eventId;
        this.title = stringResource;
        this.subtitle = str;
        this.contractsStates = contractsStates;
        this.isTappable = z;
        this.showLiveIcon = z2;
        this.isInAcqStreamlinedTradeFlowExperiment = z3;
    }

    public final ImmutableList<String> getTertiaryTextStrings() {
        ImmutableList<ContractViewState> immutableList = this.contractsStates;
        ArrayList arrayList = new ArrayList();
        Iterator<ContractViewState> it = immutableList.iterator();
        while (it.hasNext()) {
            String tertiaryText = it.next().getTertiaryText();
            if (tertiaryText != null) {
                arrayList.add(tertiaryText);
            }
        }
        return extensions2.toPersistentList(arrayList);
    }

    /* compiled from: UpcomingEventCard.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010&\u001a\u00020\u000eHÆ\u0003Jc\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010(\u001a\u00020\u000e2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001c¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/hub/v2/cards/UpcomingEventCardViewState$ContractViewState;", "", "contractId", "Ljava/util/UUID;", "contractColor", "Lcom/robinhood/android/eventcontracts/sharedeventui/DayNightColor;", MarkdownText4.TagImageUrl, "", "primaryText", "secondaryText", "tertiaryText", "pillState", "Lcom/robinhood/android/eventcontracts/hub/v2/ui/ContractPillState;", "isBold", "", "<init>", "(Ljava/util/UUID;Lcom/robinhood/android/eventcontracts/sharedeventui/DayNightColor;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/eventcontracts/hub/v2/ui/ContractPillState;Z)V", "getContractId", "()Ljava/util/UUID;", "getContractColor", "()Lcom/robinhood/android/eventcontracts/sharedeventui/DayNightColor;", "getImageUrl", "()Ljava/lang/String;", "getPrimaryText", "getSecondaryText", "getTertiaryText", "getPillState", "()Lcom/robinhood/android/eventcontracts/hub/v2/ui/ContractPillState;", "()Z", "hasPosition", "getHasPosition", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "feature-hub-v2_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ContractViewState {
        public static final int $stable = 8;
        private final DayNightColor contractColor;
        private final UUID contractId;
        private final String imageUrl;
        private final boolean isBold;
        private final CardPills7 pillState;
        private final String primaryText;
        private final String secondaryText;
        private final String tertiaryText;

        public static /* synthetic */ ContractViewState copy$default(ContractViewState contractViewState, UUID uuid, DayNightColor dayNightColor, String str, String str2, String str3, String str4, CardPills7 cardPills7, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = contractViewState.contractId;
            }
            if ((i & 2) != 0) {
                dayNightColor = contractViewState.contractColor;
            }
            if ((i & 4) != 0) {
                str = contractViewState.imageUrl;
            }
            if ((i & 8) != 0) {
                str2 = contractViewState.primaryText;
            }
            if ((i & 16) != 0) {
                str3 = contractViewState.secondaryText;
            }
            if ((i & 32) != 0) {
                str4 = contractViewState.tertiaryText;
            }
            if ((i & 64) != 0) {
                cardPills7 = contractViewState.pillState;
            }
            if ((i & 128) != 0) {
                z = contractViewState.isBold;
            }
            CardPills7 cardPills72 = cardPills7;
            boolean z2 = z;
            String str5 = str3;
            String str6 = str4;
            return contractViewState.copy(uuid, dayNightColor, str, str2, str5, str6, cardPills72, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getContractId() {
            return this.contractId;
        }

        /* renamed from: component2, reason: from getter */
        public final DayNightColor getContractColor() {
            return this.contractColor;
        }

        /* renamed from: component3, reason: from getter */
        public final String getImageUrl() {
            return this.imageUrl;
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
        public final String getTertiaryText() {
            return this.tertiaryText;
        }

        /* renamed from: component7, reason: from getter */
        public final CardPills7 getPillState() {
            return this.pillState;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getIsBold() {
            return this.isBold;
        }

        public final ContractViewState copy(UUID contractId, DayNightColor contractColor, String imageUrl, String primaryText, String secondaryText, String tertiaryText, CardPills7 pillState, boolean isBold) {
            Intrinsics.checkNotNullParameter(contractId, "contractId");
            Intrinsics.checkNotNullParameter(primaryText, "primaryText");
            return new ContractViewState(contractId, contractColor, imageUrl, primaryText, secondaryText, tertiaryText, pillState, isBold);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ContractViewState)) {
                return false;
            }
            ContractViewState contractViewState = (ContractViewState) other;
            return Intrinsics.areEqual(this.contractId, contractViewState.contractId) && Intrinsics.areEqual(this.contractColor, contractViewState.contractColor) && Intrinsics.areEqual(this.imageUrl, contractViewState.imageUrl) && Intrinsics.areEqual(this.primaryText, contractViewState.primaryText) && Intrinsics.areEqual(this.secondaryText, contractViewState.secondaryText) && Intrinsics.areEqual(this.tertiaryText, contractViewState.tertiaryText) && Intrinsics.areEqual(this.pillState, contractViewState.pillState) && this.isBold == contractViewState.isBold;
        }

        public int hashCode() {
            int iHashCode = this.contractId.hashCode() * 31;
            DayNightColor dayNightColor = this.contractColor;
            int iHashCode2 = (iHashCode + (dayNightColor == null ? 0 : dayNightColor.hashCode())) * 31;
            String str = this.imageUrl;
            int iHashCode3 = (((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.primaryText.hashCode()) * 31;
            String str2 = this.secondaryText;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.tertiaryText;
            int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            CardPills7 cardPills7 = this.pillState;
            return ((iHashCode5 + (cardPills7 != null ? cardPills7.hashCode() : 0)) * 31) + Boolean.hashCode(this.isBold);
        }

        public String toString() {
            return "ContractViewState(contractId=" + this.contractId + ", contractColor=" + this.contractColor + ", imageUrl=" + this.imageUrl + ", primaryText=" + this.primaryText + ", secondaryText=" + this.secondaryText + ", tertiaryText=" + this.tertiaryText + ", pillState=" + this.pillState + ", isBold=" + this.isBold + ")";
        }

        public ContractViewState(UUID contractId, DayNightColor dayNightColor, String str, String primaryText, String str2, String str3, CardPills7 cardPills7, boolean z) {
            Intrinsics.checkNotNullParameter(contractId, "contractId");
            Intrinsics.checkNotNullParameter(primaryText, "primaryText");
            this.contractId = contractId;
            this.contractColor = dayNightColor;
            this.imageUrl = str;
            this.primaryText = primaryText;
            this.secondaryText = str2;
            this.tertiaryText = str3;
            this.pillState = cardPills7;
            this.isBold = z;
        }

        public final UUID getContractId() {
            return this.contractId;
        }

        public final DayNightColor getContractColor() {
            return this.contractColor;
        }

        public final String getImageUrl() {
            return this.imageUrl;
        }

        public final String getPrimaryText() {
            return this.primaryText;
        }

        public final String getSecondaryText() {
            return this.secondaryText;
        }

        public final String getTertiaryText() {
            return this.tertiaryText;
        }

        public final CardPills7 getPillState() {
            return this.pillState;
        }

        public final boolean isBold() {
            return this.isBold;
        }

        public final boolean getHasPosition() {
            return this.pillState instanceof CardPills7.QuoteWithPositionPillState;
        }
    }
}
