package com.robinhood.android.event.history.p131ui.settlement;

import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventCashSettlementDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/event/history/ui/settlement/EventCashSettlementDetailViewState;", "", "Loading", "Loaded", "Lcom/robinhood/android/event/history/ui/settlement/EventCashSettlementDetailViewState$Loaded;", "Lcom/robinhood/android/event/history/ui/settlement/EventCashSettlementDetailViewState$Loading;", "feature-event-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.history.ui.settlement.EventCashSettlementDetailViewState, reason: use source file name */
/* loaded from: classes3.dex */
public interface EventCashSettlementDetailDuxo3 {

    /* compiled from: EventCashSettlementDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/event/history/ui/settlement/EventCashSettlementDetailViewState$Loading;", "Lcom/robinhood/android/event/history/ui/settlement/EventCashSettlementDetailViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-event-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.event.history.ui.settlement.EventCashSettlementDetailViewState$Loading */
    public static final /* data */ class Loading implements EventCashSettlementDetailDuxo3 {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return 1045137248;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }

    /* compiled from: EventCashSettlementDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010$\u001a\u00020\bHÆ\u0003Jk\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\r\u001a\u00020\bHÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/event/history/ui/settlement/EventCashSettlementDetailViewState$Loaded;", "Lcom/robinhood/android/event/history/ui/settlement/EventCashSettlementDetailViewState;", "eventId", "Ljava/util/UUID;", "pageTitle", "Lcom/robinhood/utils/resource/StringResource;", "pageSubtitle", "eventName", "", "settlementTime", "settlementPrice", "quantity", "realizedPnlLabel", "realizedPnlValue", "<init>", "(Ljava/util/UUID;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/utils/resource/StringResource;Ljava/lang/String;)V", "getEventId", "()Ljava/util/UUID;", "getPageTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getPageSubtitle", "getEventName", "()Ljava/lang/String;", "getSettlementTime", "getSettlementPrice", "getQuantity", "getRealizedPnlLabel", "getRealizedPnlValue", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-event-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.event.history.ui.settlement.EventCashSettlementDetailViewState$Loaded, reason: from toString */
    public static final /* data */ class Loaded implements EventCashSettlementDetailDuxo3 {
        public static final int $stable = 8;
        private final UUID eventId;
        private final String eventName;
        private final StringResource pageSubtitle;
        private final StringResource pageTitle;
        private final String quantity;
        private final StringResource realizedPnlLabel;
        private final String realizedPnlValue;
        private final String settlementPrice;
        private final String settlementTime;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, UUID uuid, StringResource stringResource, StringResource stringResource2, String str, String str2, String str3, String str4, StringResource stringResource3, String str5, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = loaded.eventId;
            }
            if ((i & 2) != 0) {
                stringResource = loaded.pageTitle;
            }
            if ((i & 4) != 0) {
                stringResource2 = loaded.pageSubtitle;
            }
            if ((i & 8) != 0) {
                str = loaded.eventName;
            }
            if ((i & 16) != 0) {
                str2 = loaded.settlementTime;
            }
            if ((i & 32) != 0) {
                str3 = loaded.settlementPrice;
            }
            if ((i & 64) != 0) {
                str4 = loaded.quantity;
            }
            if ((i & 128) != 0) {
                stringResource3 = loaded.realizedPnlLabel;
            }
            if ((i & 256) != 0) {
                str5 = loaded.realizedPnlValue;
            }
            StringResource stringResource4 = stringResource3;
            String str6 = str5;
            String str7 = str3;
            String str8 = str4;
            String str9 = str2;
            StringResource stringResource5 = stringResource2;
            return loaded.copy(uuid, stringResource, stringResource5, str, str9, str7, str8, stringResource4, str6);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getEventId() {
            return this.eventId;
        }

        /* renamed from: component2, reason: from getter */
        public final StringResource getPageTitle() {
            return this.pageTitle;
        }

        /* renamed from: component3, reason: from getter */
        public final StringResource getPageSubtitle() {
            return this.pageSubtitle;
        }

        /* renamed from: component4, reason: from getter */
        public final String getEventName() {
            return this.eventName;
        }

        /* renamed from: component5, reason: from getter */
        public final String getSettlementTime() {
            return this.settlementTime;
        }

        /* renamed from: component6, reason: from getter */
        public final String getSettlementPrice() {
            return this.settlementPrice;
        }

        /* renamed from: component7, reason: from getter */
        public final String getQuantity() {
            return this.quantity;
        }

        /* renamed from: component8, reason: from getter */
        public final StringResource getRealizedPnlLabel() {
            return this.realizedPnlLabel;
        }

        /* renamed from: component9, reason: from getter */
        public final String getRealizedPnlValue() {
            return this.realizedPnlValue;
        }

        public final Loaded copy(UUID eventId, StringResource pageTitle, StringResource pageSubtitle, String eventName, String settlementTime, String settlementPrice, String quantity, StringResource realizedPnlLabel, String realizedPnlValue) {
            Intrinsics.checkNotNullParameter(pageTitle, "pageTitle");
            Intrinsics.checkNotNullParameter(settlementTime, "settlementTime");
            Intrinsics.checkNotNullParameter(settlementPrice, "settlementPrice");
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            Intrinsics.checkNotNullParameter(realizedPnlValue, "realizedPnlValue");
            return new Loaded(eventId, pageTitle, pageSubtitle, eventName, settlementTime, settlementPrice, quantity, realizedPnlLabel, realizedPnlValue);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.eventId, loaded.eventId) && Intrinsics.areEqual(this.pageTitle, loaded.pageTitle) && Intrinsics.areEqual(this.pageSubtitle, loaded.pageSubtitle) && Intrinsics.areEqual(this.eventName, loaded.eventName) && Intrinsics.areEqual(this.settlementTime, loaded.settlementTime) && Intrinsics.areEqual(this.settlementPrice, loaded.settlementPrice) && Intrinsics.areEqual(this.quantity, loaded.quantity) && Intrinsics.areEqual(this.realizedPnlLabel, loaded.realizedPnlLabel) && Intrinsics.areEqual(this.realizedPnlValue, loaded.realizedPnlValue);
        }

        public int hashCode() {
            UUID uuid = this.eventId;
            int iHashCode = (((uuid == null ? 0 : uuid.hashCode()) * 31) + this.pageTitle.hashCode()) * 31;
            StringResource stringResource = this.pageSubtitle;
            int iHashCode2 = (iHashCode + (stringResource == null ? 0 : stringResource.hashCode())) * 31;
            String str = this.eventName;
            int iHashCode3 = (((((((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.settlementTime.hashCode()) * 31) + this.settlementPrice.hashCode()) * 31) + this.quantity.hashCode()) * 31;
            StringResource stringResource2 = this.realizedPnlLabel;
            return ((iHashCode3 + (stringResource2 != null ? stringResource2.hashCode() : 0)) * 31) + this.realizedPnlValue.hashCode();
        }

        public String toString() {
            return "Loaded(eventId=" + this.eventId + ", pageTitle=" + this.pageTitle + ", pageSubtitle=" + this.pageSubtitle + ", eventName=" + this.eventName + ", settlementTime=" + this.settlementTime + ", settlementPrice=" + this.settlementPrice + ", quantity=" + this.quantity + ", realizedPnlLabel=" + this.realizedPnlLabel + ", realizedPnlValue=" + this.realizedPnlValue + ")";
        }

        public Loaded(UUID uuid, StringResource pageTitle, StringResource stringResource, String str, String settlementTime, String settlementPrice, String quantity, StringResource stringResource2, String realizedPnlValue) {
            Intrinsics.checkNotNullParameter(pageTitle, "pageTitle");
            Intrinsics.checkNotNullParameter(settlementTime, "settlementTime");
            Intrinsics.checkNotNullParameter(settlementPrice, "settlementPrice");
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            Intrinsics.checkNotNullParameter(realizedPnlValue, "realizedPnlValue");
            this.eventId = uuid;
            this.pageTitle = pageTitle;
            this.pageSubtitle = stringResource;
            this.eventName = str;
            this.settlementTime = settlementTime;
            this.settlementPrice = settlementPrice;
            this.quantity = quantity;
            this.realizedPnlLabel = stringResource2;
            this.realizedPnlValue = realizedPnlValue;
        }

        public final UUID getEventId() {
            return this.eventId;
        }

        public final StringResource getPageTitle() {
            return this.pageTitle;
        }

        public final StringResource getPageSubtitle() {
            return this.pageSubtitle;
        }

        public final String getEventName() {
            return this.eventName;
        }

        public final String getSettlementTime() {
            return this.settlementTime;
        }

        public final String getSettlementPrice() {
            return this.settlementPrice;
        }

        public final String getQuantity() {
            return this.quantity;
        }

        public final StringResource getRealizedPnlLabel() {
            return this.realizedPnlLabel;
        }

        public final String getRealizedPnlValue() {
            return this.realizedPnlValue;
        }
    }
}
