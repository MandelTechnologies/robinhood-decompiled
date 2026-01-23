package com.robinhood.android.eventcontracts.hub.p134v2.cards;

import com.robinhood.android.eventcontracts.hub.p134v2.home.HubDefaultCategoryContentViewState2;
import com.robinhood.android.eventcontracts.sharedeventui.DayNightColor;
import com.robinhood.android.markdown.compose.MarkdownText4;
import com.robinhood.rosetta.eventlogging.EventContractHubCardContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: FinalEventCard.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001(B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003JA\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\n8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\n8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0016¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/hub/v2/cards/FinalEventCardViewState;", "Lcom/robinhood/android/eventcontracts/hub/v2/home/HubCardComponent;", "sectionIdentifier", "", "hubCardContext", "Lcom/robinhood/rosetta/eventlogging/EventContractHubCardContext;", "eventId", "Ljava/util/UUID;", "title", "contractViewStates", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/eventcontracts/hub/v2/cards/FinalEventCardViewState$ContractViewState;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/EventContractHubCardContext;Ljava/util/UUID;Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;)V", "getSectionIdentifier", "()Ljava/lang/String;", "getHubCardContext", "()Lcom/robinhood/rosetta/eventlogging/EventContractHubCardContext;", "getEventId", "()Ljava/util/UUID;", "getTitle", "getContractViewStates", "()Lkotlinx/collections/immutable/ImmutableList;", "quoteTextStrings", "getQuoteTextStrings", "secondaryTextStrings", "getSecondaryTextStrings", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ContractViewState", "feature-hub-v2_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final /* data */ class FinalEventCardViewState extends HubDefaultCategoryContentViewState2 {
    public static final int $stable = 0;
    private final ImmutableList<ContractViewState> contractViewStates;
    private final UUID eventId;
    private final EventContractHubCardContext hubCardContext;
    private final String sectionIdentifier;
    private final String title;

    public static /* synthetic */ FinalEventCardViewState copy$default(FinalEventCardViewState finalEventCardViewState, String str, EventContractHubCardContext eventContractHubCardContext, UUID uuid, String str2, ImmutableList immutableList, int i, Object obj) {
        if ((i & 1) != 0) {
            str = finalEventCardViewState.sectionIdentifier;
        }
        if ((i & 2) != 0) {
            eventContractHubCardContext = finalEventCardViewState.hubCardContext;
        }
        if ((i & 4) != 0) {
            uuid = finalEventCardViewState.eventId;
        }
        if ((i & 8) != 0) {
            str2 = finalEventCardViewState.title;
        }
        if ((i & 16) != 0) {
            immutableList = finalEventCardViewState.contractViewStates;
        }
        ImmutableList immutableList2 = immutableList;
        UUID uuid2 = uuid;
        return finalEventCardViewState.copy(str, eventContractHubCardContext, uuid2, str2, immutableList2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSectionIdentifier() {
        return this.sectionIdentifier;
    }

    /* renamed from: component2, reason: from getter */
    public final EventContractHubCardContext getHubCardContext() {
        return this.hubCardContext;
    }

    /* renamed from: component3, reason: from getter */
    public final UUID getEventId() {
        return this.eventId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final ImmutableList<ContractViewState> component5() {
        return this.contractViewStates;
    }

    public final FinalEventCardViewState copy(String sectionIdentifier, EventContractHubCardContext hubCardContext, UUID eventId, String title, ImmutableList<ContractViewState> contractViewStates) {
        Intrinsics.checkNotNullParameter(sectionIdentifier, "sectionIdentifier");
        Intrinsics.checkNotNullParameter(hubCardContext, "hubCardContext");
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(contractViewStates, "contractViewStates");
        return new FinalEventCardViewState(sectionIdentifier, hubCardContext, eventId, title, contractViewStates);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FinalEventCardViewState)) {
            return false;
        }
        FinalEventCardViewState finalEventCardViewState = (FinalEventCardViewState) other;
        return Intrinsics.areEqual(this.sectionIdentifier, finalEventCardViewState.sectionIdentifier) && Intrinsics.areEqual(this.hubCardContext, finalEventCardViewState.hubCardContext) && Intrinsics.areEqual(this.eventId, finalEventCardViewState.eventId) && Intrinsics.areEqual(this.title, finalEventCardViewState.title) && Intrinsics.areEqual(this.contractViewStates, finalEventCardViewState.contractViewStates);
    }

    public int hashCode() {
        return (((((((this.sectionIdentifier.hashCode() * 31) + this.hubCardContext.hashCode()) * 31) + this.eventId.hashCode()) * 31) + this.title.hashCode()) * 31) + this.contractViewStates.hashCode();
    }

    public String toString() {
        return "FinalEventCardViewState(sectionIdentifier=" + this.sectionIdentifier + ", hubCardContext=" + this.hubCardContext + ", eventId=" + this.eventId + ", title=" + this.title + ", contractViewStates=" + this.contractViewStates + ")";
    }

    @Override // com.robinhood.android.eventcontracts.hub.p134v2.home.HubDefaultCategoryContentViewState2, com.robinhood.android.eventcontracts.hub.p134v2.home.HubDefaultCategoryContentViewState4
    public String getSectionIdentifier() {
        return this.sectionIdentifier;
    }

    @Override // com.robinhood.android.eventcontracts.hub.p134v2.home.HubDefaultCategoryContentViewState2
    public EventContractHubCardContext getHubCardContext() {
        return this.hubCardContext;
    }

    public final UUID getEventId() {
        return this.eventId;
    }

    public final String getTitle() {
        return this.title;
    }

    public final ImmutableList<ContractViewState> getContractViewStates() {
        return this.contractViewStates;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinalEventCardViewState(String sectionIdentifier, EventContractHubCardContext hubCardContext, UUID eventId, String title, ImmutableList<ContractViewState> contractViewStates) {
        super(eventId, sectionIdentifier);
        Intrinsics.checkNotNullParameter(sectionIdentifier, "sectionIdentifier");
        Intrinsics.checkNotNullParameter(hubCardContext, "hubCardContext");
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(contractViewStates, "contractViewStates");
        this.sectionIdentifier = sectionIdentifier;
        this.hubCardContext = hubCardContext;
        this.eventId = eventId;
        this.title = title;
        this.contractViewStates = contractViewStates;
    }

    public final ImmutableList<String> getQuoteTextStrings() {
        ImmutableList<ContractViewState> immutableList = this.contractViewStates;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(immutableList, 10));
        Iterator<ContractViewState> it = immutableList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getQuote());
        }
        return extensions2.toPersistentList(arrayList);
    }

    public final ImmutableList<String> getSecondaryTextStrings() {
        ImmutableList<ContractViewState> immutableList = this.contractViewStates;
        ArrayList arrayList = new ArrayList();
        Iterator<ContractViewState> it = immutableList.iterator();
        while (it.hasNext()) {
            String secondaryText = it.next().getSecondaryText();
            if (secondaryText != null) {
                arrayList.add(secondaryText);
            }
        }
        return extensions2.toPersistentList(arrayList);
    }

    /* compiled from: FinalEventCard.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J_\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010!\u001a\u00020\u00032\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000f¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/hub/v2/cards/FinalEventCardViewState$ContractViewState;", "", "isWinner", "", "contractColor", "Lcom/robinhood/android/eventcontracts/sharedeventui/DayNightColor;", MarkdownText4.TagImageUrl, "", "primaryText", "secondaryText", "metadata", "quote", "isBold", "<init>", "(ZLcom/robinhood/android/eventcontracts/sharedeventui/DayNightColor;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "()Z", "getContractColor", "()Lcom/robinhood/android/eventcontracts/sharedeventui/DayNightColor;", "getImageUrl", "()Ljava/lang/String;", "getPrimaryText", "getSecondaryText", "getMetadata", "getQuote", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "feature-hub-v2_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ContractViewState {
        public static final int $stable = 0;
        private final DayNightColor contractColor;
        private final String imageUrl;
        private final boolean isBold;
        private final boolean isWinner;
        private final String metadata;
        private final String primaryText;
        private final String quote;
        private final String secondaryText;

        public static /* synthetic */ ContractViewState copy$default(ContractViewState contractViewState, boolean z, DayNightColor dayNightColor, String str, String str2, String str3, String str4, String str5, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = contractViewState.isWinner;
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
                str4 = contractViewState.metadata;
            }
            if ((i & 64) != 0) {
                str5 = contractViewState.quote;
            }
            if ((i & 128) != 0) {
                z2 = contractViewState.isBold;
            }
            String str6 = str5;
            boolean z3 = z2;
            String str7 = str3;
            String str8 = str4;
            return contractViewState.copy(z, dayNightColor, str, str2, str7, str8, str6, z3);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsWinner() {
            return this.isWinner;
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
        public final String getMetadata() {
            return this.metadata;
        }

        /* renamed from: component7, reason: from getter */
        public final String getQuote() {
            return this.quote;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getIsBold() {
            return this.isBold;
        }

        public final ContractViewState copy(boolean isWinner, DayNightColor contractColor, String imageUrl, String primaryText, String secondaryText, String metadata, String quote, boolean isBold) {
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            Intrinsics.checkNotNullParameter(primaryText, "primaryText");
            Intrinsics.checkNotNullParameter(quote, "quote");
            return new ContractViewState(isWinner, contractColor, imageUrl, primaryText, secondaryText, metadata, quote, isBold);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ContractViewState)) {
                return false;
            }
            ContractViewState contractViewState = (ContractViewState) other;
            return this.isWinner == contractViewState.isWinner && Intrinsics.areEqual(this.contractColor, contractViewState.contractColor) && Intrinsics.areEqual(this.imageUrl, contractViewState.imageUrl) && Intrinsics.areEqual(this.primaryText, contractViewState.primaryText) && Intrinsics.areEqual(this.secondaryText, contractViewState.secondaryText) && Intrinsics.areEqual(this.metadata, contractViewState.metadata) && Intrinsics.areEqual(this.quote, contractViewState.quote) && this.isBold == contractViewState.isBold;
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.isWinner) * 31;
            DayNightColor dayNightColor = this.contractColor;
            int iHashCode2 = (((((iHashCode + (dayNightColor == null ? 0 : dayNightColor.hashCode())) * 31) + this.imageUrl.hashCode()) * 31) + this.primaryText.hashCode()) * 31;
            String str = this.secondaryText;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.metadata;
            return ((((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.quote.hashCode()) * 31) + Boolean.hashCode(this.isBold);
        }

        public String toString() {
            return "ContractViewState(isWinner=" + this.isWinner + ", contractColor=" + this.contractColor + ", imageUrl=" + this.imageUrl + ", primaryText=" + this.primaryText + ", secondaryText=" + this.secondaryText + ", metadata=" + this.metadata + ", quote=" + this.quote + ", isBold=" + this.isBold + ")";
        }

        public ContractViewState(boolean z, DayNightColor dayNightColor, String imageUrl, String primaryText, String str, String str2, String quote, boolean z2) {
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            Intrinsics.checkNotNullParameter(primaryText, "primaryText");
            Intrinsics.checkNotNullParameter(quote, "quote");
            this.isWinner = z;
            this.contractColor = dayNightColor;
            this.imageUrl = imageUrl;
            this.primaryText = primaryText;
            this.secondaryText = str;
            this.metadata = str2;
            this.quote = quote;
            this.isBold = z2;
        }

        public final boolean isWinner() {
            return this.isWinner;
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

        public final String getMetadata() {
            return this.metadata;
        }

        public final String getQuote() {
            return this.quote;
        }

        public final boolean isBold() {
            return this.isBold;
        }
    }
}
