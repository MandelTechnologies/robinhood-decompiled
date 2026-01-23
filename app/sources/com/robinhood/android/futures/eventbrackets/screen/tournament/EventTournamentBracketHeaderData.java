package com.robinhood.android.futures.eventbrackets.screen.tournament;

import com.robinhood.android.markdown.compose.MarkdownText4;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventTournamentBracketHeader.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/futures/eventbrackets/screen/tournament/EventTournamentBracketHeaderData;", "", "tradeButtonText", "", MarkdownText4.TagImageUrl, "navigationContractId", "Ljava/util/UUID;", "imageContentDescription", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/UUID;Ljava/lang/String;)V", "getTradeButtonText", "()Ljava/lang/String;", "getImageUrl", "getNavigationContractId", "()Ljava/util/UUID;", "getImageContentDescription", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-event-brackets_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EventTournamentBracketHeaderData {
    public static final int $stable = 0;
    private final String imageContentDescription;
    private final String imageUrl;
    private final UUID navigationContractId;
    private final String tradeButtonText;

    public static /* synthetic */ EventTournamentBracketHeaderData copy$default(EventTournamentBracketHeaderData eventTournamentBracketHeaderData, String str, String str2, UUID uuid, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eventTournamentBracketHeaderData.tradeButtonText;
        }
        if ((i & 2) != 0) {
            str2 = eventTournamentBracketHeaderData.imageUrl;
        }
        if ((i & 4) != 0) {
            uuid = eventTournamentBracketHeaderData.navigationContractId;
        }
        if ((i & 8) != 0) {
            str3 = eventTournamentBracketHeaderData.imageContentDescription;
        }
        return eventTournamentBracketHeaderData.copy(str, str2, uuid, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTradeButtonText() {
        return this.tradeButtonText;
    }

    /* renamed from: component2, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final UUID getNavigationContractId() {
        return this.navigationContractId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getImageContentDescription() {
        return this.imageContentDescription;
    }

    public final EventTournamentBracketHeaderData copy(String tradeButtonText, String imageUrl, UUID navigationContractId, String imageContentDescription) {
        Intrinsics.checkNotNullParameter(tradeButtonText, "tradeButtonText");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(navigationContractId, "navigationContractId");
        return new EventTournamentBracketHeaderData(tradeButtonText, imageUrl, navigationContractId, imageContentDescription);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventTournamentBracketHeaderData)) {
            return false;
        }
        EventTournamentBracketHeaderData eventTournamentBracketHeaderData = (EventTournamentBracketHeaderData) other;
        return Intrinsics.areEqual(this.tradeButtonText, eventTournamentBracketHeaderData.tradeButtonText) && Intrinsics.areEqual(this.imageUrl, eventTournamentBracketHeaderData.imageUrl) && Intrinsics.areEqual(this.navigationContractId, eventTournamentBracketHeaderData.navigationContractId) && Intrinsics.areEqual(this.imageContentDescription, eventTournamentBracketHeaderData.imageContentDescription);
    }

    public int hashCode() {
        int iHashCode = ((((this.tradeButtonText.hashCode() * 31) + this.imageUrl.hashCode()) * 31) + this.navigationContractId.hashCode()) * 31;
        String str = this.imageContentDescription;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "EventTournamentBracketHeaderData(tradeButtonText=" + this.tradeButtonText + ", imageUrl=" + this.imageUrl + ", navigationContractId=" + this.navigationContractId + ", imageContentDescription=" + this.imageContentDescription + ")";
    }

    public EventTournamentBracketHeaderData(String tradeButtonText, String imageUrl, UUID navigationContractId, String str) {
        Intrinsics.checkNotNullParameter(tradeButtonText, "tradeButtonText");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(navigationContractId, "navigationContractId");
        this.tradeButtonText = tradeButtonText;
        this.imageUrl = imageUrl;
        this.navigationContractId = navigationContractId;
        this.imageContentDescription = str;
    }

    public final String getTradeButtonText() {
        return this.tradeButtonText;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final UUID getNavigationContractId() {
        return this.navigationContractId;
    }

    public final String getImageContentDescription() {
        return this.imageContentDescription;
    }
}
