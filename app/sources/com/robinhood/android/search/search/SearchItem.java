package com.robinhood.android.search.search;

import android.net.Uri;
import com.robinhood.android.common.p088ui.CuratedListChipItem;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.models.futures.api.bonfire.FuturesSearchItem;
import com.robinhood.android.models.futures.p189db.UiFuturesPosition;
import com.robinhood.models.crypto.p315ui.UiCryptoHolding;
import com.robinhood.models.p320db.Security;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SearchItem.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0000H&\u0082\u0001\u0006\r\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/search/search/SearchItem;", "", "<init>", "()V", "isTheSameAs", "", "other", "Header", "HeaderWithAction", "SecurityRow", "CuratedListCarousel", "DeeplinkRow", "EducationRow", "Lcom/robinhood/android/search/search/SearchItem$CuratedListCarousel;", "Lcom/robinhood/android/search/search/SearchItem$DeeplinkRow;", "Lcom/robinhood/android/search/search/SearchItem$EducationRow;", "Lcom/robinhood/android/search/search/SearchItem$Header;", "Lcom/robinhood/android/search/search/SearchItem$HeaderWithAction;", "Lcom/robinhood/android/search/search/SearchItem$SecurityRow;", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public abstract class SearchItem {
    public static final int $stable = 0;

    public /* synthetic */ SearchItem(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract boolean isTheSameAs(SearchItem other);

    private SearchItem() {
    }

    /* compiled from: SearchItem.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0001H\u0016J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/search/search/SearchItem$Header;", "Lcom/robinhood/android/search/search/SearchItem;", "displayTitle", "", "defaultDisplayTitleRes", "", "<init>", "(Ljava/lang/String;I)V", "getDisplayTitle", "()Ljava/lang/String;", "getDefaultDisplayTitleRes", "()I", "isTheSameAs", "", "other", "component1", "component2", "copy", "equals", "", "hashCode", "toString", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Header extends SearchItem {
        public static final int $stable = 0;
        private final int defaultDisplayTitleRes;
        private final String displayTitle;

        public static /* synthetic */ Header copy$default(Header header, String str, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = header.displayTitle;
            }
            if ((i2 & 2) != 0) {
                i = header.defaultDisplayTitleRes;
            }
            return header.copy(str, i);
        }

        /* renamed from: component1, reason: from getter */
        public final String getDisplayTitle() {
            return this.displayTitle;
        }

        /* renamed from: component2, reason: from getter */
        public final int getDefaultDisplayTitleRes() {
            return this.defaultDisplayTitleRes;
        }

        public final Header copy(String displayTitle, int defaultDisplayTitleRes) {
            return new Header(displayTitle, defaultDisplayTitleRes);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Header)) {
                return false;
            }
            Header header = (Header) other;
            return Intrinsics.areEqual(this.displayTitle, header.displayTitle) && this.defaultDisplayTitleRes == header.defaultDisplayTitleRes;
        }

        public int hashCode() {
            String str = this.displayTitle;
            return ((str == null ? 0 : str.hashCode()) * 31) + Integer.hashCode(this.defaultDisplayTitleRes);
        }

        public String toString() {
            return "Header(displayTitle=" + this.displayTitle + ", defaultDisplayTitleRes=" + this.defaultDisplayTitleRes + ")";
        }

        public Header(String str, int i) {
            super(null);
            this.displayTitle = str;
            this.defaultDisplayTitleRes = i;
        }

        public final int getDefaultDisplayTitleRes() {
            return this.defaultDisplayTitleRes;
        }

        public final String getDisplayTitle() {
            return this.displayTitle;
        }

        @Override // com.robinhood.android.search.search.SearchItem
        public boolean isTheSameAs(SearchItem other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return Intrinsics.areEqual(this, other);
        }
    }

    /* compiled from: SearchItem.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\u0010\t\u001a\u00060\nj\u0002`\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0001H\u0016J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\r\u0010\"\u001a\u00060\nj\u0002`\u000bHÆ\u0003J\t\u0010#\u001a\u00020\rHÆ\u0003JK\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\f\b\u0002\u0010\t\u001a\u00060\nj\u0002`\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010%\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020\u0005HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\t\u001a\u00060\nj\u0002`\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/search/search/SearchItem$HeaderWithAction;", "Lcom/robinhood/android/search/search/SearchItem;", "displayTitle", "", "defaultDisplayTitleRes", "", "actionTitleRes", "actionUri", "Landroid/net/Uri;", "eventAction", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "Lcom/robinhood/rosetta/eventlogging/EventAction;", "eventData", "Lcom/robinhood/android/search/search/SearchResultEventData;", "<init>", "(Ljava/lang/String;IILandroid/net/Uri;Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;Lcom/robinhood/android/search/search/SearchResultEventData;)V", "getDisplayTitle", "()Ljava/lang/String;", "getDefaultDisplayTitleRes", "()I", "getActionTitleRes", "getActionUri", "()Landroid/net/Uri;", "getEventAction", "()Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "getEventData", "()Lcom/robinhood/android/search/search/SearchResultEventData;", "isTheSameAs", "", "other", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "hashCode", "toString", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class HeaderWithAction extends SearchItem {
        public static final int $stable = 8;
        private final int actionTitleRes;
        private final Uri actionUri;
        private final int defaultDisplayTitleRes;
        private final String displayTitle;
        private final UserInteractionEventData.Action eventAction;
        private final SearchResultEventData eventData;

        public static /* synthetic */ HeaderWithAction copy$default(HeaderWithAction headerWithAction, String str, int i, int i2, Uri uri, UserInteractionEventData.Action action, SearchResultEventData searchResultEventData, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = headerWithAction.displayTitle;
            }
            if ((i3 & 2) != 0) {
                i = headerWithAction.defaultDisplayTitleRes;
            }
            if ((i3 & 4) != 0) {
                i2 = headerWithAction.actionTitleRes;
            }
            if ((i3 & 8) != 0) {
                uri = headerWithAction.actionUri;
            }
            if ((i3 & 16) != 0) {
                action = headerWithAction.eventAction;
            }
            if ((i3 & 32) != 0) {
                searchResultEventData = headerWithAction.eventData;
            }
            UserInteractionEventData.Action action2 = action;
            SearchResultEventData searchResultEventData2 = searchResultEventData;
            return headerWithAction.copy(str, i, i2, uri, action2, searchResultEventData2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getDisplayTitle() {
            return this.displayTitle;
        }

        /* renamed from: component2, reason: from getter */
        public final int getDefaultDisplayTitleRes() {
            return this.defaultDisplayTitleRes;
        }

        /* renamed from: component3, reason: from getter */
        public final int getActionTitleRes() {
            return this.actionTitleRes;
        }

        /* renamed from: component4, reason: from getter */
        public final Uri getActionUri() {
            return this.actionUri;
        }

        /* renamed from: component5, reason: from getter */
        public final UserInteractionEventData.Action getEventAction() {
            return this.eventAction;
        }

        /* renamed from: component6, reason: from getter */
        public final SearchResultEventData getEventData() {
            return this.eventData;
        }

        public final HeaderWithAction copy(String displayTitle, int defaultDisplayTitleRes, int actionTitleRes, Uri actionUri, UserInteractionEventData.Action eventAction, SearchResultEventData eventData) {
            Intrinsics.checkNotNullParameter(actionUri, "actionUri");
            Intrinsics.checkNotNullParameter(eventAction, "eventAction");
            Intrinsics.checkNotNullParameter(eventData, "eventData");
            return new HeaderWithAction(displayTitle, defaultDisplayTitleRes, actionTitleRes, actionUri, eventAction, eventData);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HeaderWithAction)) {
                return false;
            }
            HeaderWithAction headerWithAction = (HeaderWithAction) other;
            return Intrinsics.areEqual(this.displayTitle, headerWithAction.displayTitle) && this.defaultDisplayTitleRes == headerWithAction.defaultDisplayTitleRes && this.actionTitleRes == headerWithAction.actionTitleRes && Intrinsics.areEqual(this.actionUri, headerWithAction.actionUri) && this.eventAction == headerWithAction.eventAction && Intrinsics.areEqual(this.eventData, headerWithAction.eventData);
        }

        public int hashCode() {
            String str = this.displayTitle;
            return ((((((((((str == null ? 0 : str.hashCode()) * 31) + Integer.hashCode(this.defaultDisplayTitleRes)) * 31) + Integer.hashCode(this.actionTitleRes)) * 31) + this.actionUri.hashCode()) * 31) + this.eventAction.hashCode()) * 31) + this.eventData.hashCode();
        }

        public String toString() {
            return "HeaderWithAction(displayTitle=" + this.displayTitle + ", defaultDisplayTitleRes=" + this.defaultDisplayTitleRes + ", actionTitleRes=" + this.actionTitleRes + ", actionUri=" + this.actionUri + ", eventAction=" + this.eventAction + ", eventData=" + this.eventData + ")";
        }

        public final String getDisplayTitle() {
            return this.displayTitle;
        }

        public final int getDefaultDisplayTitleRes() {
            return this.defaultDisplayTitleRes;
        }

        public final int getActionTitleRes() {
            return this.actionTitleRes;
        }

        public final Uri getActionUri() {
            return this.actionUri;
        }

        public final UserInteractionEventData.Action getEventAction() {
            return this.eventAction;
        }

        public final SearchResultEventData getEventData() {
            return this.eventData;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HeaderWithAction(String str, int i, int i2, Uri actionUri, UserInteractionEventData.Action eventAction, SearchResultEventData eventData) {
            super(null);
            Intrinsics.checkNotNullParameter(actionUri, "actionUri");
            Intrinsics.checkNotNullParameter(eventAction, "eventAction");
            Intrinsics.checkNotNullParameter(eventData, "eventData");
            this.displayTitle = str;
            this.defaultDisplayTitleRes = i;
            this.actionTitleRes = i2;
            this.actionUri = actionUri;
            this.eventAction = eventAction;
            this.eventData = eventData;
        }

        @Override // com.robinhood.android.search.search.SearchItem
        public boolean isTheSameAs(SearchItem other) {
            Intrinsics.checkNotNullParameter(other, "other");
            HeaderWithAction headerWithAction = other instanceof HeaderWithAction ? (HeaderWithAction) other : null;
            return headerWithAction != null && Intrinsics.areEqual(this.displayTitle, headerWithAction.displayTitle) && this.defaultDisplayTitleRes == headerWithAction.defaultDisplayTitleRes && this.actionTitleRes == headerWithAction.actionTitleRes && Intrinsics.areEqual(this.actionUri, headerWithAction.actionUri);
        }
    }

    /* compiled from: SearchItem.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0016\u0017\u0018\u0019\u001aB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0001H\u0016R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0010\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000fR\u0012\u0010\u0011\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\rX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f\u0082\u0001\u0005\u001b\u001c\u001d\u001e\u001f¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/search/search/SearchItem$SecurityRow;", "Lcom/robinhood/android/search/search/SearchItem;", "<init>", "()V", "security", "Lcom/robinhood/models/db/Security;", "getSecurity", "()Lcom/robinhood/models/db/Security;", "eventData", "Lcom/robinhood/android/search/search/SearchResultEventData;", "getEventData", "()Lcom/robinhood/android/search/search/SearchResultEventData;", "canAddToMultipleLists", "", "getCanAddToMultipleLists", "()Z", "isInAnyUserLists", "isInUserList", "disallowAddToListButton", "getDisallowAddToListButton", "isTheSameAs", "other", "Crypto", "Instrument", "Futures", "EventContract", "MarketIndex", "Lcom/robinhood/android/search/search/SearchItem$SecurityRow$Crypto;", "Lcom/robinhood/android/search/search/SearchItem$SecurityRow$EventContract;", "Lcom/robinhood/android/search/search/SearchItem$SecurityRow$Futures;", "Lcom/robinhood/android/search/search/SearchItem$SecurityRow$Instrument;", "Lcom/robinhood/android/search/search/SearchItem$SecurityRow$MarketIndex;", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class SecurityRow extends SearchItem {
        public static final int $stable = 0;
        private final boolean disallowAddToListButton;

        public /* synthetic */ SecurityRow(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract boolean getCanAddToMultipleLists();

        public abstract SearchResultEventData getEventData();

        public abstract Security getSecurity();

        /* renamed from: isInAnyUserLists */
        public abstract boolean getIsInAnyUserLists();

        /* renamed from: isInUserList */
        public abstract boolean getIsInUserList();

        private SecurityRow() {
            super(null);
        }

        public boolean getDisallowAddToListButton() {
            return this.disallowAddToListButton;
        }

        @Override // com.robinhood.android.search.search.SearchItem
        public boolean isTheSameAs(SearchItem other) {
            Intrinsics.checkNotNullParameter(other, "other");
            if (other instanceof SecurityRow) {
                return Intrinsics.areEqual(getSecurity().getId(), ((SecurityRow) other).getSecurity().getId());
            }
            return false;
        }

        /* compiled from: SearchItem.kt */
        @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u000bHÆ\u0003JG\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\b\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0013R\u0014\u0010\t\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/search/search/SearchItem$SecurityRow$Crypto;", "Lcom/robinhood/android/search/search/SearchItem$SecurityRow;", "security", "Lcom/robinhood/models/db/Security;", "eventData", "Lcom/robinhood/android/search/search/SearchResultEventData;", "canAddToMultipleLists", "", "isInAnyUserLists", "isInUserList", "cryptoHolding", "Lcom/robinhood/models/crypto/ui/UiCryptoHolding;", "<init>", "(Lcom/robinhood/models/db/Security;Lcom/robinhood/android/search/search/SearchResultEventData;ZZZLcom/robinhood/models/crypto/ui/UiCryptoHolding;)V", "getSecurity", "()Lcom/robinhood/models/db/Security;", "getEventData", "()Lcom/robinhood/android/search/search/SearchResultEventData;", "getCanAddToMultipleLists", "()Z", "getCryptoHolding", "()Lcom/robinhood/models/crypto/ui/UiCryptoHolding;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Crypto extends SecurityRow {
            public static final int $stable = 8;
            private final boolean canAddToMultipleLists;
            private final UiCryptoHolding cryptoHolding;
            private final SearchResultEventData eventData;
            private final boolean isInAnyUserLists;
            private final boolean isInUserList;
            private final Security security;

            public static /* synthetic */ Crypto copy$default(Crypto crypto2, Security security, SearchResultEventData searchResultEventData, boolean z, boolean z2, boolean z3, UiCryptoHolding uiCryptoHolding, int i, Object obj) {
                if ((i & 1) != 0) {
                    security = crypto2.security;
                }
                if ((i & 2) != 0) {
                    searchResultEventData = crypto2.eventData;
                }
                if ((i & 4) != 0) {
                    z = crypto2.canAddToMultipleLists;
                }
                if ((i & 8) != 0) {
                    z2 = crypto2.isInAnyUserLists;
                }
                if ((i & 16) != 0) {
                    z3 = crypto2.isInUserList;
                }
                if ((i & 32) != 0) {
                    uiCryptoHolding = crypto2.cryptoHolding;
                }
                boolean z4 = z3;
                UiCryptoHolding uiCryptoHolding2 = uiCryptoHolding;
                return crypto2.copy(security, searchResultEventData, z, z2, z4, uiCryptoHolding2);
            }

            /* renamed from: component1, reason: from getter */
            public final Security getSecurity() {
                return this.security;
            }

            /* renamed from: component2, reason: from getter */
            public final SearchResultEventData getEventData() {
                return this.eventData;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getCanAddToMultipleLists() {
                return this.canAddToMultipleLists;
            }

            /* renamed from: component4, reason: from getter */
            public final boolean getIsInAnyUserLists() {
                return this.isInAnyUserLists;
            }

            /* renamed from: component5, reason: from getter */
            public final boolean getIsInUserList() {
                return this.isInUserList;
            }

            /* renamed from: component6, reason: from getter */
            public final UiCryptoHolding getCryptoHolding() {
                return this.cryptoHolding;
            }

            public final Crypto copy(Security security, SearchResultEventData eventData, boolean canAddToMultipleLists, boolean isInAnyUserLists, boolean isInUserList, UiCryptoHolding cryptoHolding) {
                Intrinsics.checkNotNullParameter(security, "security");
                Intrinsics.checkNotNullParameter(eventData, "eventData");
                return new Crypto(security, eventData, canAddToMultipleLists, isInAnyUserLists, isInUserList, cryptoHolding);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Crypto)) {
                    return false;
                }
                Crypto crypto2 = (Crypto) other;
                return Intrinsics.areEqual(this.security, crypto2.security) && Intrinsics.areEqual(this.eventData, crypto2.eventData) && this.canAddToMultipleLists == crypto2.canAddToMultipleLists && this.isInAnyUserLists == crypto2.isInAnyUserLists && this.isInUserList == crypto2.isInUserList && Intrinsics.areEqual(this.cryptoHolding, crypto2.cryptoHolding);
            }

            public int hashCode() {
                int iHashCode = ((((((((this.security.hashCode() * 31) + this.eventData.hashCode()) * 31) + Boolean.hashCode(this.canAddToMultipleLists)) * 31) + Boolean.hashCode(this.isInAnyUserLists)) * 31) + Boolean.hashCode(this.isInUserList)) * 31;
                UiCryptoHolding uiCryptoHolding = this.cryptoHolding;
                return iHashCode + (uiCryptoHolding == null ? 0 : uiCryptoHolding.hashCode());
            }

            public String toString() {
                return "Crypto(security=" + this.security + ", eventData=" + this.eventData + ", canAddToMultipleLists=" + this.canAddToMultipleLists + ", isInAnyUserLists=" + this.isInAnyUserLists + ", isInUserList=" + this.isInUserList + ", cryptoHolding=" + this.cryptoHolding + ")";
            }

            @Override // com.robinhood.android.search.search.SearchItem.SecurityRow
            public Security getSecurity() {
                return this.security;
            }

            @Override // com.robinhood.android.search.search.SearchItem.SecurityRow
            public SearchResultEventData getEventData() {
                return this.eventData;
            }

            @Override // com.robinhood.android.search.search.SearchItem.SecurityRow
            public boolean getCanAddToMultipleLists() {
                return this.canAddToMultipleLists;
            }

            @Override // com.robinhood.android.search.search.SearchItem.SecurityRow
            /* renamed from: isInAnyUserLists */
            public boolean getIsInAnyUserLists() {
                return this.isInAnyUserLists;
            }

            @Override // com.robinhood.android.search.search.SearchItem.SecurityRow
            /* renamed from: isInUserList */
            public boolean getIsInUserList() {
                return this.isInUserList;
            }

            public final UiCryptoHolding getCryptoHolding() {
                return this.cryptoHolding;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Crypto(Security security, SearchResultEventData eventData, boolean z, boolean z2, boolean z3, UiCryptoHolding uiCryptoHolding) {
                super(null);
                Intrinsics.checkNotNullParameter(security, "security");
                Intrinsics.checkNotNullParameter(eventData, "eventData");
                this.security = security;
                this.eventData = eventData;
                this.canAddToMultipleLists = z;
                this.isInAnyUserLists = z2;
                this.isInUserList = z3;
                this.cryptoHolding = uiCryptoHolding;
            }
        }

        /* compiled from: SearchItem.kt */
        @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u000bHÆ\u0003JG\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\b\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0013R\u0014\u0010\t\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/search/search/SearchItem$SecurityRow$Instrument;", "Lcom/robinhood/android/search/search/SearchItem$SecurityRow;", "security", "Lcom/robinhood/models/db/Security;", "eventData", "Lcom/robinhood/android/search/search/SearchResultEventData;", "canAddToMultipleLists", "", "isInAnyUserLists", "isInUserList", "displayQuantity", "Ljava/math/BigDecimal;", "<init>", "(Lcom/robinhood/models/db/Security;Lcom/robinhood/android/search/search/SearchResultEventData;ZZZLjava/math/BigDecimal;)V", "getSecurity", "()Lcom/robinhood/models/db/Security;", "getEventData", "()Lcom/robinhood/android/search/search/SearchResultEventData;", "getCanAddToMultipleLists", "()Z", "getDisplayQuantity", "()Ljava/math/BigDecimal;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Instrument extends SecurityRow {
            public static final int $stable = 8;
            private final boolean canAddToMultipleLists;
            private final BigDecimal displayQuantity;
            private final SearchResultEventData eventData;
            private final boolean isInAnyUserLists;
            private final boolean isInUserList;
            private final Security security;

            public static /* synthetic */ Instrument copy$default(Instrument instrument, Security security, SearchResultEventData searchResultEventData, boolean z, boolean z2, boolean z3, BigDecimal bigDecimal, int i, Object obj) {
                if ((i & 1) != 0) {
                    security = instrument.security;
                }
                if ((i & 2) != 0) {
                    searchResultEventData = instrument.eventData;
                }
                if ((i & 4) != 0) {
                    z = instrument.canAddToMultipleLists;
                }
                if ((i & 8) != 0) {
                    z2 = instrument.isInAnyUserLists;
                }
                if ((i & 16) != 0) {
                    z3 = instrument.isInUserList;
                }
                if ((i & 32) != 0) {
                    bigDecimal = instrument.displayQuantity;
                }
                boolean z4 = z3;
                BigDecimal bigDecimal2 = bigDecimal;
                return instrument.copy(security, searchResultEventData, z, z2, z4, bigDecimal2);
            }

            /* renamed from: component1, reason: from getter */
            public final Security getSecurity() {
                return this.security;
            }

            /* renamed from: component2, reason: from getter */
            public final SearchResultEventData getEventData() {
                return this.eventData;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getCanAddToMultipleLists() {
                return this.canAddToMultipleLists;
            }

            /* renamed from: component4, reason: from getter */
            public final boolean getIsInAnyUserLists() {
                return this.isInAnyUserLists;
            }

            /* renamed from: component5, reason: from getter */
            public final boolean getIsInUserList() {
                return this.isInUserList;
            }

            /* renamed from: component6, reason: from getter */
            public final BigDecimal getDisplayQuantity() {
                return this.displayQuantity;
            }

            public final Instrument copy(Security security, SearchResultEventData eventData, boolean canAddToMultipleLists, boolean isInAnyUserLists, boolean isInUserList, BigDecimal displayQuantity) {
                Intrinsics.checkNotNullParameter(security, "security");
                Intrinsics.checkNotNullParameter(eventData, "eventData");
                return new Instrument(security, eventData, canAddToMultipleLists, isInAnyUserLists, isInUserList, displayQuantity);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Instrument)) {
                    return false;
                }
                Instrument instrument = (Instrument) other;
                return Intrinsics.areEqual(this.security, instrument.security) && Intrinsics.areEqual(this.eventData, instrument.eventData) && this.canAddToMultipleLists == instrument.canAddToMultipleLists && this.isInAnyUserLists == instrument.isInAnyUserLists && this.isInUserList == instrument.isInUserList && Intrinsics.areEqual(this.displayQuantity, instrument.displayQuantity);
            }

            public int hashCode() {
                int iHashCode = ((((((((this.security.hashCode() * 31) + this.eventData.hashCode()) * 31) + Boolean.hashCode(this.canAddToMultipleLists)) * 31) + Boolean.hashCode(this.isInAnyUserLists)) * 31) + Boolean.hashCode(this.isInUserList)) * 31;
                BigDecimal bigDecimal = this.displayQuantity;
                return iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode());
            }

            public String toString() {
                return "Instrument(security=" + this.security + ", eventData=" + this.eventData + ", canAddToMultipleLists=" + this.canAddToMultipleLists + ", isInAnyUserLists=" + this.isInAnyUserLists + ", isInUserList=" + this.isInUserList + ", displayQuantity=" + this.displayQuantity + ")";
            }

            @Override // com.robinhood.android.search.search.SearchItem.SecurityRow
            public Security getSecurity() {
                return this.security;
            }

            @Override // com.robinhood.android.search.search.SearchItem.SecurityRow
            public SearchResultEventData getEventData() {
                return this.eventData;
            }

            @Override // com.robinhood.android.search.search.SearchItem.SecurityRow
            public boolean getCanAddToMultipleLists() {
                return this.canAddToMultipleLists;
            }

            @Override // com.robinhood.android.search.search.SearchItem.SecurityRow
            /* renamed from: isInAnyUserLists */
            public boolean getIsInAnyUserLists() {
                return this.isInAnyUserLists;
            }

            @Override // com.robinhood.android.search.search.SearchItem.SecurityRow
            /* renamed from: isInUserList */
            public boolean getIsInUserList() {
                return this.isInUserList;
            }

            public final BigDecimal getDisplayQuantity() {
                return this.displayQuantity;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Instrument(Security security, SearchResultEventData eventData, boolean z, boolean z2, boolean z3, BigDecimal bigDecimal) {
                super(null);
                Intrinsics.checkNotNullParameter(security, "security");
                Intrinsics.checkNotNullParameter(eventData, "eventData");
                this.security = security;
                this.eventData = eventData;
                this.canAddToMultipleLists = z;
                this.isInAnyUserLists = z2;
                this.isInUserList = z3;
                this.displayQuantity = bigDecimal;
            }
        }

        /* compiled from: SearchItem.kt */
        @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\fHÆ\u0003JQ\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010 \u001a\u00020\u00072\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\b\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0014R\u0014\u0010\t\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0014R\u0014\u0010\n\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/search/search/SearchItem$SecurityRow$Futures;", "Lcom/robinhood/android/search/search/SearchItem$SecurityRow;", "security", "Lcom/robinhood/android/models/futures/api/bonfire/FuturesSearchItem;", "eventData", "Lcom/robinhood/android/search/search/SearchResultEventData;", "canAddToMultipleLists", "", "isInAnyUserLists", "isInUserList", "disallowAddToListButton", "position", "Lcom/robinhood/android/models/futures/db/UiFuturesPosition;", "<init>", "(Lcom/robinhood/android/models/futures/api/bonfire/FuturesSearchItem;Lcom/robinhood/android/search/search/SearchResultEventData;ZZZZLcom/robinhood/android/models/futures/db/UiFuturesPosition;)V", "getSecurity", "()Lcom/robinhood/android/models/futures/api/bonfire/FuturesSearchItem;", "getEventData", "()Lcom/robinhood/android/search/search/SearchResultEventData;", "getCanAddToMultipleLists", "()Z", "getDisallowAddToListButton", "getPosition", "()Lcom/robinhood/android/models/futures/db/UiFuturesPosition;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Futures extends SecurityRow {
            public static final int $stable = 8;
            private final boolean canAddToMultipleLists;
            private final boolean disallowAddToListButton;
            private final SearchResultEventData eventData;
            private final boolean isInAnyUserLists;
            private final boolean isInUserList;
            private final UiFuturesPosition position;
            private final FuturesSearchItem security;

            public static /* synthetic */ Futures copy$default(Futures futures, FuturesSearchItem futuresSearchItem, SearchResultEventData searchResultEventData, boolean z, boolean z2, boolean z3, boolean z4, UiFuturesPosition uiFuturesPosition, int i, Object obj) {
                if ((i & 1) != 0) {
                    futuresSearchItem = futures.security;
                }
                if ((i & 2) != 0) {
                    searchResultEventData = futures.eventData;
                }
                if ((i & 4) != 0) {
                    z = futures.canAddToMultipleLists;
                }
                if ((i & 8) != 0) {
                    z2 = futures.isInAnyUserLists;
                }
                if ((i & 16) != 0) {
                    z3 = futures.isInUserList;
                }
                if ((i & 32) != 0) {
                    z4 = futures.disallowAddToListButton;
                }
                if ((i & 64) != 0) {
                    uiFuturesPosition = futures.position;
                }
                boolean z5 = z4;
                UiFuturesPosition uiFuturesPosition2 = uiFuturesPosition;
                boolean z6 = z3;
                boolean z7 = z;
                return futures.copy(futuresSearchItem, searchResultEventData, z7, z2, z6, z5, uiFuturesPosition2);
            }

            /* renamed from: component1, reason: from getter */
            public final FuturesSearchItem getSecurity() {
                return this.security;
            }

            /* renamed from: component2, reason: from getter */
            public final SearchResultEventData getEventData() {
                return this.eventData;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getCanAddToMultipleLists() {
                return this.canAddToMultipleLists;
            }

            /* renamed from: component4, reason: from getter */
            public final boolean getIsInAnyUserLists() {
                return this.isInAnyUserLists;
            }

            /* renamed from: component5, reason: from getter */
            public final boolean getIsInUserList() {
                return this.isInUserList;
            }

            /* renamed from: component6, reason: from getter */
            public final boolean getDisallowAddToListButton() {
                return this.disallowAddToListButton;
            }

            /* renamed from: component7, reason: from getter */
            public final UiFuturesPosition getPosition() {
                return this.position;
            }

            public final Futures copy(FuturesSearchItem security, SearchResultEventData eventData, boolean canAddToMultipleLists, boolean isInAnyUserLists, boolean isInUserList, boolean disallowAddToListButton, UiFuturesPosition position) {
                Intrinsics.checkNotNullParameter(security, "security");
                Intrinsics.checkNotNullParameter(eventData, "eventData");
                return new Futures(security, eventData, canAddToMultipleLists, isInAnyUserLists, isInUserList, disallowAddToListButton, position);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Futures)) {
                    return false;
                }
                Futures futures = (Futures) other;
                return Intrinsics.areEqual(this.security, futures.security) && Intrinsics.areEqual(this.eventData, futures.eventData) && this.canAddToMultipleLists == futures.canAddToMultipleLists && this.isInAnyUserLists == futures.isInAnyUserLists && this.isInUserList == futures.isInUserList && this.disallowAddToListButton == futures.disallowAddToListButton && Intrinsics.areEqual(this.position, futures.position);
            }

            public int hashCode() {
                int iHashCode = ((((((((((this.security.hashCode() * 31) + this.eventData.hashCode()) * 31) + Boolean.hashCode(this.canAddToMultipleLists)) * 31) + Boolean.hashCode(this.isInAnyUserLists)) * 31) + Boolean.hashCode(this.isInUserList)) * 31) + Boolean.hashCode(this.disallowAddToListButton)) * 31;
                UiFuturesPosition uiFuturesPosition = this.position;
                return iHashCode + (uiFuturesPosition == null ? 0 : uiFuturesPosition.hashCode());
            }

            public String toString() {
                return "Futures(security=" + this.security + ", eventData=" + this.eventData + ", canAddToMultipleLists=" + this.canAddToMultipleLists + ", isInAnyUserLists=" + this.isInAnyUserLists + ", isInUserList=" + this.isInUserList + ", disallowAddToListButton=" + this.disallowAddToListButton + ", position=" + this.position + ")";
            }

            @Override // com.robinhood.android.search.search.SearchItem.SecurityRow
            public FuturesSearchItem getSecurity() {
                return this.security;
            }

            @Override // com.robinhood.android.search.search.SearchItem.SecurityRow
            public SearchResultEventData getEventData() {
                return this.eventData;
            }

            @Override // com.robinhood.android.search.search.SearchItem.SecurityRow
            public boolean getCanAddToMultipleLists() {
                return this.canAddToMultipleLists;
            }

            @Override // com.robinhood.android.search.search.SearchItem.SecurityRow
            /* renamed from: isInAnyUserLists */
            public boolean getIsInAnyUserLists() {
                return this.isInAnyUserLists;
            }

            @Override // com.robinhood.android.search.search.SearchItem.SecurityRow
            /* renamed from: isInUserList */
            public boolean getIsInUserList() {
                return this.isInUserList;
            }

            @Override // com.robinhood.android.search.search.SearchItem.SecurityRow
            public boolean getDisallowAddToListButton() {
                return this.disallowAddToListButton;
            }

            public final UiFuturesPosition getPosition() {
                return this.position;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Futures(FuturesSearchItem security, SearchResultEventData eventData, boolean z, boolean z2, boolean z3, boolean z4, UiFuturesPosition uiFuturesPosition) {
                super(null);
                Intrinsics.checkNotNullParameter(security, "security");
                Intrinsics.checkNotNullParameter(eventData, "eventData");
                this.security = security;
                this.eventData = eventData;
                this.canAddToMultipleLists = z;
                this.isInAnyUserLists = z2;
                this.isInUserList = z3;
                this.disallowAddToListButton = z4;
                this.position = uiFuturesPosition;
            }
        }

        /* compiled from: SearchItem.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\rX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\rX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\rX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/search/search/SearchItem$SecurityRow$EventContract;", "Lcom/robinhood/android/search/search/SearchItem$SecurityRow;", "security", "Lcom/robinhood/models/db/Security;", "eventData", "Lcom/robinhood/android/search/search/SearchResultEventData;", "<init>", "(Lcom/robinhood/models/db/Security;Lcom/robinhood/android/search/search/SearchResultEventData;)V", "getSecurity", "()Lcom/robinhood/models/db/Security;", "getEventData", "()Lcom/robinhood/android/search/search/SearchResultEventData;", "canAddToMultipleLists", "", "getCanAddToMultipleLists", "()Z", "isInAnyUserLists", "isInUserList", "disallowAddToListButton", "getDisallowAddToListButton", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class EventContract extends SecurityRow {
            public static final int $stable = 8;
            private final boolean canAddToMultipleLists;
            private final boolean disallowAddToListButton;
            private final SearchResultEventData eventData;
            private final boolean isInAnyUserLists;
            private final boolean isInUserList;
            private final Security security;

            public static /* synthetic */ EventContract copy$default(EventContract eventContract, Security security, SearchResultEventData searchResultEventData, int i, Object obj) {
                if ((i & 1) != 0) {
                    security = eventContract.security;
                }
                if ((i & 2) != 0) {
                    searchResultEventData = eventContract.eventData;
                }
                return eventContract.copy(security, searchResultEventData);
            }

            /* renamed from: component1, reason: from getter */
            public final Security getSecurity() {
                return this.security;
            }

            /* renamed from: component2, reason: from getter */
            public final SearchResultEventData getEventData() {
                return this.eventData;
            }

            public final EventContract copy(Security security, SearchResultEventData eventData) {
                Intrinsics.checkNotNullParameter(security, "security");
                Intrinsics.checkNotNullParameter(eventData, "eventData");
                return new EventContract(security, eventData);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof EventContract)) {
                    return false;
                }
                EventContract eventContract = (EventContract) other;
                return Intrinsics.areEqual(this.security, eventContract.security) && Intrinsics.areEqual(this.eventData, eventContract.eventData);
            }

            public int hashCode() {
                return (this.security.hashCode() * 31) + this.eventData.hashCode();
            }

            public String toString() {
                return "EventContract(security=" + this.security + ", eventData=" + this.eventData + ")";
            }

            @Override // com.robinhood.android.search.search.SearchItem.SecurityRow
            public Security getSecurity() {
                return this.security;
            }

            @Override // com.robinhood.android.search.search.SearchItem.SecurityRow
            public SearchResultEventData getEventData() {
                return this.eventData;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EventContract(Security security, SearchResultEventData eventData) {
                super(null);
                Intrinsics.checkNotNullParameter(security, "security");
                Intrinsics.checkNotNullParameter(eventData, "eventData");
                this.security = security;
                this.eventData = eventData;
                this.disallowAddToListButton = true;
            }

            @Override // com.robinhood.android.search.search.SearchItem.SecurityRow
            public boolean getCanAddToMultipleLists() {
                return this.canAddToMultipleLists;
            }

            @Override // com.robinhood.android.search.search.SearchItem.SecurityRow
            /* renamed from: isInAnyUserLists, reason: from getter */
            public boolean getIsInAnyUserLists() {
                return this.isInAnyUserLists;
            }

            @Override // com.robinhood.android.search.search.SearchItem.SecurityRow
            /* renamed from: isInUserList, reason: from getter */
            public boolean getIsInUserList() {
                return this.isInUserList;
            }

            @Override // com.robinhood.android.search.search.SearchItem.SecurityRow
            public boolean getDisallowAddToListButton() {
                return this.disallowAddToListButton;
            }
        }

        /* compiled from: SearchItem.kt */
        @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\b\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0011R\u0014\u0010\t\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0011¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/search/search/SearchItem$SecurityRow$MarketIndex;", "Lcom/robinhood/android/search/search/SearchItem$SecurityRow;", "security", "Lcom/robinhood/models/db/Security;", "eventData", "Lcom/robinhood/android/search/search/SearchResultEventData;", "canAddToMultipleLists", "", "isInAnyUserLists", "isInUserList", "<init>", "(Lcom/robinhood/models/db/Security;Lcom/robinhood/android/search/search/SearchResultEventData;ZZZ)V", "getSecurity", "()Lcom/robinhood/models/db/Security;", "getEventData", "()Lcom/robinhood/android/search/search/SearchResultEventData;", "getCanAddToMultipleLists", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class MarketIndex extends SecurityRow {
            public static final int $stable = 8;
            private final boolean canAddToMultipleLists;
            private final SearchResultEventData eventData;
            private final boolean isInAnyUserLists;
            private final boolean isInUserList;
            private final Security security;

            public static /* synthetic */ MarketIndex copy$default(MarketIndex marketIndex, Security security, SearchResultEventData searchResultEventData, boolean z, boolean z2, boolean z3, int i, Object obj) {
                if ((i & 1) != 0) {
                    security = marketIndex.security;
                }
                if ((i & 2) != 0) {
                    searchResultEventData = marketIndex.eventData;
                }
                if ((i & 4) != 0) {
                    z = marketIndex.canAddToMultipleLists;
                }
                if ((i & 8) != 0) {
                    z2 = marketIndex.isInAnyUserLists;
                }
                if ((i & 16) != 0) {
                    z3 = marketIndex.isInUserList;
                }
                boolean z4 = z3;
                boolean z5 = z;
                return marketIndex.copy(security, searchResultEventData, z5, z2, z4);
            }

            /* renamed from: component1, reason: from getter */
            public final Security getSecurity() {
                return this.security;
            }

            /* renamed from: component2, reason: from getter */
            public final SearchResultEventData getEventData() {
                return this.eventData;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getCanAddToMultipleLists() {
                return this.canAddToMultipleLists;
            }

            /* renamed from: component4, reason: from getter */
            public final boolean getIsInAnyUserLists() {
                return this.isInAnyUserLists;
            }

            /* renamed from: component5, reason: from getter */
            public final boolean getIsInUserList() {
                return this.isInUserList;
            }

            public final MarketIndex copy(Security security, SearchResultEventData eventData, boolean canAddToMultipleLists, boolean isInAnyUserLists, boolean isInUserList) {
                Intrinsics.checkNotNullParameter(security, "security");
                Intrinsics.checkNotNullParameter(eventData, "eventData");
                return new MarketIndex(security, eventData, canAddToMultipleLists, isInAnyUserLists, isInUserList);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof MarketIndex)) {
                    return false;
                }
                MarketIndex marketIndex = (MarketIndex) other;
                return Intrinsics.areEqual(this.security, marketIndex.security) && Intrinsics.areEqual(this.eventData, marketIndex.eventData) && this.canAddToMultipleLists == marketIndex.canAddToMultipleLists && this.isInAnyUserLists == marketIndex.isInAnyUserLists && this.isInUserList == marketIndex.isInUserList;
            }

            public int hashCode() {
                return (((((((this.security.hashCode() * 31) + this.eventData.hashCode()) * 31) + Boolean.hashCode(this.canAddToMultipleLists)) * 31) + Boolean.hashCode(this.isInAnyUserLists)) * 31) + Boolean.hashCode(this.isInUserList);
            }

            public String toString() {
                return "MarketIndex(security=" + this.security + ", eventData=" + this.eventData + ", canAddToMultipleLists=" + this.canAddToMultipleLists + ", isInAnyUserLists=" + this.isInAnyUserLists + ", isInUserList=" + this.isInUserList + ")";
            }

            @Override // com.robinhood.android.search.search.SearchItem.SecurityRow
            public Security getSecurity() {
                return this.security;
            }

            @Override // com.robinhood.android.search.search.SearchItem.SecurityRow
            public SearchResultEventData getEventData() {
                return this.eventData;
            }

            @Override // com.robinhood.android.search.search.SearchItem.SecurityRow
            public boolean getCanAddToMultipleLists() {
                return this.canAddToMultipleLists;
            }

            @Override // com.robinhood.android.search.search.SearchItem.SecurityRow
            /* renamed from: isInAnyUserLists */
            public boolean getIsInAnyUserLists() {
                return this.isInAnyUserLists;
            }

            @Override // com.robinhood.android.search.search.SearchItem.SecurityRow
            /* renamed from: isInUserList */
            public boolean getIsInUserList() {
                return this.isInUserList;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MarketIndex(Security security, SearchResultEventData eventData, boolean z, boolean z2, boolean z3) {
                super(null);
                Intrinsics.checkNotNullParameter(security, "security");
                Intrinsics.checkNotNullParameter(eventData, "eventData");
                this.security = security;
                this.eventData = eventData;
                this.canAddToMultipleLists = z;
                this.isInAnyUserLists = z2;
                this.isInUserList = z3;
            }
        }
    }

    /* compiled from: SearchItem.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0001H\u0016J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/search/search/SearchItem$CuratedListCarousel;", "Lcom/robinhood/android/search/search/SearchItem;", "id", "", "curatedLists", "", "Lcom/robinhood/android/common/ui/CuratedListChipItem;", "<init>", "(ILjava/util/List;)V", "getId", "()I", "getCuratedLists", "()Ljava/util/List;", "isTheSameAs", "", "other", "component1", "component2", "copy", "equals", "", "hashCode", "toString", "", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class CuratedListCarousel extends SearchItem {
        public static final int $stable = 8;
        private final List<CuratedListChipItem> curatedLists;
        private final int id;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CuratedListCarousel copy$default(CuratedListCarousel curatedListCarousel, int i, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = curatedListCarousel.id;
            }
            if ((i2 & 2) != 0) {
                list = curatedListCarousel.curatedLists;
            }
            return curatedListCarousel.copy(i, list);
        }

        /* renamed from: component1, reason: from getter */
        public final int getId() {
            return this.id;
        }

        public final List<CuratedListChipItem> component2() {
            return this.curatedLists;
        }

        public final CuratedListCarousel copy(int id, List<CuratedListChipItem> curatedLists) {
            Intrinsics.checkNotNullParameter(curatedLists, "curatedLists");
            return new CuratedListCarousel(id, curatedLists);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CuratedListCarousel)) {
                return false;
            }
            CuratedListCarousel curatedListCarousel = (CuratedListCarousel) other;
            return this.id == curatedListCarousel.id && Intrinsics.areEqual(this.curatedLists, curatedListCarousel.curatedLists);
        }

        public int hashCode() {
            return (Integer.hashCode(this.id) * 31) + this.curatedLists.hashCode();
        }

        public String toString() {
            return "CuratedListCarousel(id=" + this.id + ", curatedLists=" + this.curatedLists + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CuratedListCarousel(int i, List<CuratedListChipItem> curatedLists) {
            super(null);
            Intrinsics.checkNotNullParameter(curatedLists, "curatedLists");
            this.id = i;
            this.curatedLists = curatedLists;
        }

        public final List<CuratedListChipItem> getCuratedLists() {
            return this.curatedLists;
        }

        public final int getId() {
            return this.id;
        }

        @Override // com.robinhood.android.search.search.SearchItem
        public boolean isTheSameAs(SearchItem other) {
            Intrinsics.checkNotNullParameter(other, "other");
            CuratedListCarousel curatedListCarousel = other instanceof CuratedListCarousel ? (CuratedListCarousel) other : null;
            return curatedListCarousel != null && this.id == curatedListCarousel.id;
        }
    }

    /* compiled from: SearchItem.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0001H\u0016J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010!\u001a\u00020\nHÆ\u0003J\t\u0010\"\u001a\u00020\fHÆ\u0003JI\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010$\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/search/search/SearchItem$DeeplinkRow;", "Lcom/robinhood/android/search/search/SearchItem;", "id", "Ljava/util/UUID;", "title", "", "subtitle", "icon", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "uri", "Landroid/net/Uri;", "eventData", "Lcom/robinhood/android/search/search/SearchResultEventData;", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;Landroid/net/Uri;Lcom/robinhood/android/search/search/SearchResultEventData;)V", "getId", "()Ljava/util/UUID;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getIcon", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getUri", "()Landroid/net/Uri;", "getEventData", "()Lcom/robinhood/android/search/search/SearchResultEventData;", "isTheSameAs", "", "other", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "hashCode", "", "toString", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class DeeplinkRow extends SearchItem {
        public static final int $stable = 8;
        private final SearchResultEventData eventData;
        private final ServerToBentoAssetMapper2 icon;
        private final UUID id;
        private final String subtitle;
        private final String title;
        private final Uri uri;

        public static /* synthetic */ DeeplinkRow copy$default(DeeplinkRow deeplinkRow, UUID uuid, String str, String str2, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, Uri uri, SearchResultEventData searchResultEventData, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = deeplinkRow.id;
            }
            if ((i & 2) != 0) {
                str = deeplinkRow.title;
            }
            if ((i & 4) != 0) {
                str2 = deeplinkRow.subtitle;
            }
            if ((i & 8) != 0) {
                serverToBentoAssetMapper2 = deeplinkRow.icon;
            }
            if ((i & 16) != 0) {
                uri = deeplinkRow.uri;
            }
            if ((i & 32) != 0) {
                searchResultEventData = deeplinkRow.eventData;
            }
            Uri uri2 = uri;
            SearchResultEventData searchResultEventData2 = searchResultEventData;
            return deeplinkRow.copy(uuid, str, str2, serverToBentoAssetMapper2, uri2, searchResultEventData2);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component4, reason: from getter */
        public final ServerToBentoAssetMapper2 getIcon() {
            return this.icon;
        }

        /* renamed from: component5, reason: from getter */
        public final Uri getUri() {
            return this.uri;
        }

        /* renamed from: component6, reason: from getter */
        public final SearchResultEventData getEventData() {
            return this.eventData;
        }

        public final DeeplinkRow copy(UUID id, String title, String subtitle, ServerToBentoAssetMapper2 icon, Uri uri, SearchResultEventData eventData) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(uri, "uri");
            Intrinsics.checkNotNullParameter(eventData, "eventData");
            return new DeeplinkRow(id, title, subtitle, icon, uri, eventData);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DeeplinkRow)) {
                return false;
            }
            DeeplinkRow deeplinkRow = (DeeplinkRow) other;
            return Intrinsics.areEqual(this.id, deeplinkRow.id) && Intrinsics.areEqual(this.title, deeplinkRow.title) && Intrinsics.areEqual(this.subtitle, deeplinkRow.subtitle) && this.icon == deeplinkRow.icon && Intrinsics.areEqual(this.uri, deeplinkRow.uri) && Intrinsics.areEqual(this.eventData, deeplinkRow.eventData);
        }

        public int hashCode() {
            int iHashCode = ((this.id.hashCode() * 31) + this.title.hashCode()) * 31;
            String str = this.subtitle;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = this.icon;
            return ((((iHashCode2 + (serverToBentoAssetMapper2 != null ? serverToBentoAssetMapper2.hashCode() : 0)) * 31) + this.uri.hashCode()) * 31) + this.eventData.hashCode();
        }

        public String toString() {
            return "DeeplinkRow(id=" + this.id + ", title=" + this.title + ", subtitle=" + this.subtitle + ", icon=" + this.icon + ", uri=" + this.uri + ", eventData=" + this.eventData + ")";
        }

        public final UUID getId() {
            return this.id;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final ServerToBentoAssetMapper2 getIcon() {
            return this.icon;
        }

        public final Uri getUri() {
            return this.uri;
        }

        public final SearchResultEventData getEventData() {
            return this.eventData;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeeplinkRow(UUID id, String title, String str, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, Uri uri, SearchResultEventData eventData) {
            super(null);
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(uri, "uri");
            Intrinsics.checkNotNullParameter(eventData, "eventData");
            this.id = id;
            this.title = title;
            this.subtitle = str;
            this.icon = serverToBentoAssetMapper2;
            this.uri = uri;
            this.eventData = eventData;
        }

        @Override // com.robinhood.android.search.search.SearchItem
        public boolean isTheSameAs(SearchItem other) {
            Intrinsics.checkNotNullParameter(other, "other");
            String str = this.title;
            DeeplinkRow deeplinkRow = other instanceof DeeplinkRow ? (DeeplinkRow) other : null;
            return Intrinsics.areEqual(str, deeplinkRow != null ? deeplinkRow.title : null) && Intrinsics.areEqual(this.uri, ((DeeplinkRow) other).uri);
        }
    }

    /* compiled from: SearchItem.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0001H\u0016J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003JG\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010 \u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/search/search/SearchItem$EducationRow;", "Lcom/robinhood/android/search/search/SearchItem;", "id", "", "analyticsId", "title", "blurb", "uri", "Landroid/net/Uri;", "eventData", "Lcom/robinhood/android/search/search/SearchResultEventData;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Lcom/robinhood/android/search/search/SearchResultEventData;)V", "getId", "()Ljava/lang/String;", "getAnalyticsId", "getTitle", "getBlurb", "getUri", "()Landroid/net/Uri;", "getEventData", "()Lcom/robinhood/android/search/search/SearchResultEventData;", "isTheSameAs", "", "other", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "hashCode", "", "toString", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class EducationRow extends SearchItem {
        public static final int $stable = 8;
        private final String analyticsId;
        private final String blurb;
        private final SearchResultEventData eventData;
        private final String id;
        private final String title;
        private final Uri uri;

        public static /* synthetic */ EducationRow copy$default(EducationRow educationRow, String str, String str2, String str3, String str4, Uri uri, SearchResultEventData searchResultEventData, int i, Object obj) {
            if ((i & 1) != 0) {
                str = educationRow.id;
            }
            if ((i & 2) != 0) {
                str2 = educationRow.analyticsId;
            }
            if ((i & 4) != 0) {
                str3 = educationRow.title;
            }
            if ((i & 8) != 0) {
                str4 = educationRow.blurb;
            }
            if ((i & 16) != 0) {
                uri = educationRow.uri;
            }
            if ((i & 32) != 0) {
                searchResultEventData = educationRow.eventData;
            }
            Uri uri2 = uri;
            SearchResultEventData searchResultEventData2 = searchResultEventData;
            return educationRow.copy(str, str2, str3, str4, uri2, searchResultEventData2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAnalyticsId() {
            return this.analyticsId;
        }

        /* renamed from: component3, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component4, reason: from getter */
        public final String getBlurb() {
            return this.blurb;
        }

        /* renamed from: component5, reason: from getter */
        public final Uri getUri() {
            return this.uri;
        }

        /* renamed from: component6, reason: from getter */
        public final SearchResultEventData getEventData() {
            return this.eventData;
        }

        public final EducationRow copy(String id, String analyticsId, String title, String blurb, Uri uri, SearchResultEventData eventData) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(analyticsId, "analyticsId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(uri, "uri");
            Intrinsics.checkNotNullParameter(eventData, "eventData");
            return new EducationRow(id, analyticsId, title, blurb, uri, eventData);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EducationRow)) {
                return false;
            }
            EducationRow educationRow = (EducationRow) other;
            return Intrinsics.areEqual(this.id, educationRow.id) && Intrinsics.areEqual(this.analyticsId, educationRow.analyticsId) && Intrinsics.areEqual(this.title, educationRow.title) && Intrinsics.areEqual(this.blurb, educationRow.blurb) && Intrinsics.areEqual(this.uri, educationRow.uri) && Intrinsics.areEqual(this.eventData, educationRow.eventData);
        }

        public int hashCode() {
            int iHashCode = ((((this.id.hashCode() * 31) + this.analyticsId.hashCode()) * 31) + this.title.hashCode()) * 31;
            String str = this.blurb;
            return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.uri.hashCode()) * 31) + this.eventData.hashCode();
        }

        public String toString() {
            return "EducationRow(id=" + this.id + ", analyticsId=" + this.analyticsId + ", title=" + this.title + ", blurb=" + this.blurb + ", uri=" + this.uri + ", eventData=" + this.eventData + ")";
        }

        public final String getId() {
            return this.id;
        }

        public final String getAnalyticsId() {
            return this.analyticsId;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getBlurb() {
            return this.blurb;
        }

        public final Uri getUri() {
            return this.uri;
        }

        public final SearchResultEventData getEventData() {
            return this.eventData;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EducationRow(String id, String analyticsId, String title, String str, Uri uri, SearchResultEventData eventData) {
            super(null);
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(analyticsId, "analyticsId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(uri, "uri");
            Intrinsics.checkNotNullParameter(eventData, "eventData");
            this.id = id;
            this.analyticsId = analyticsId;
            this.title = title;
            this.blurb = str;
            this.uri = uri;
            this.eventData = eventData;
        }

        @Override // com.robinhood.android.search.search.SearchItem
        public boolean isTheSameAs(SearchItem other) {
            Intrinsics.checkNotNullParameter(other, "other");
            String str = this.title;
            EducationRow educationRow = other instanceof EducationRow ? (EducationRow) other : null;
            return Intrinsics.areEqual(str, educationRow != null ? educationRow.title : null) && Intrinsics.areEqual(this.uri, ((EducationRow) other).uri);
        }
    }
}
