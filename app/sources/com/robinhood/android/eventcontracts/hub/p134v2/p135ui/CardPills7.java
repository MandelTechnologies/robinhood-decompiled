package com.robinhood.android.eventcontracts.hub.p134v2.p135ui;

import com.robinhood.android.eventcontracts.sharedeventui.DayNightColor;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CardPills.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/hub/v2/ui/ContractPillState;", "", "<init>", "()V", "QuoteWithNoPositionPillState", "QuoteWithPositionPillState", "Lcom/robinhood/android/eventcontracts/hub/v2/ui/ContractPillState$QuoteWithNoPositionPillState;", "Lcom/robinhood/android/eventcontracts/hub/v2/ui/ContractPillState$QuoteWithPositionPillState;", "feature-hub-v2_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.eventcontracts.hub.v2.ui.ContractPillState, reason: use source file name */
/* loaded from: classes3.dex */
public abstract class CardPills7 {
    public static final int $stable = 0;

    public /* synthetic */ CardPills7(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: CardPills.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/hub/v2/ui/ContractPillState$QuoteWithNoPositionPillState;", "Lcom/robinhood/android/eventcontracts/hub/v2/ui/ContractPillState;", "quoteText", "", "<init>", "(Ljava/lang/String;)V", "getQuoteText", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-hub-v2_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.eventcontracts.hub.v2.ui.ContractPillState$QuoteWithNoPositionPillState, reason: from toString */
    public static final /* data */ class QuoteWithNoPositionPillState extends CardPills7 {
        public static final int $stable = 0;
        private final String quoteText;

        public static /* synthetic */ QuoteWithNoPositionPillState copy$default(QuoteWithNoPositionPillState quoteWithNoPositionPillState, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = quoteWithNoPositionPillState.quoteText;
            }
            return quoteWithNoPositionPillState.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getQuoteText() {
            return this.quoteText;
        }

        public final QuoteWithNoPositionPillState copy(String quoteText) {
            Intrinsics.checkNotNullParameter(quoteText, "quoteText");
            return new QuoteWithNoPositionPillState(quoteText);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof QuoteWithNoPositionPillState) && Intrinsics.areEqual(this.quoteText, ((QuoteWithNoPositionPillState) other).quoteText);
        }

        public int hashCode() {
            return this.quoteText.hashCode();
        }

        public String toString() {
            return "QuoteWithNoPositionPillState(quoteText=" + this.quoteText + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QuoteWithNoPositionPillState(String quoteText) {
            super(null);
            Intrinsics.checkNotNullParameter(quoteText, "quoteText");
            this.quoteText = quoteText;
        }

        public final String getQuoteText() {
            return this.quoteText;
        }
    }

    private CardPills7() {
    }

    /* compiled from: CardPills.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/hub/v2/ui/ContractPillState$QuoteWithPositionPillState;", "Lcom/robinhood/android/eventcontracts/hub/v2/ui/ContractPillState;", "quoteText", "", "positionQuantity", "Lcom/robinhood/utils/resource/StringResource;", "dayNightColor", "Lcom/robinhood/android/eventcontracts/sharedeventui/DayNightColor;", "<init>", "(Ljava/lang/String;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/android/eventcontracts/sharedeventui/DayNightColor;)V", "getQuoteText", "()Ljava/lang/String;", "getPositionQuantity", "()Lcom/robinhood/utils/resource/StringResource;", "getDayNightColor", "()Lcom/robinhood/android/eventcontracts/sharedeventui/DayNightColor;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-hub-v2_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.eventcontracts.hub.v2.ui.ContractPillState$QuoteWithPositionPillState, reason: from toString */
    public static final /* data */ class QuoteWithPositionPillState extends CardPills7 {
        public static final int $stable = StringResource.$stable;
        private final DayNightColor dayNightColor;
        private final StringResource positionQuantity;
        private final String quoteText;

        public static /* synthetic */ QuoteWithPositionPillState copy$default(QuoteWithPositionPillState quoteWithPositionPillState, String str, StringResource stringResource, DayNightColor dayNightColor, int i, Object obj) {
            if ((i & 1) != 0) {
                str = quoteWithPositionPillState.quoteText;
            }
            if ((i & 2) != 0) {
                stringResource = quoteWithPositionPillState.positionQuantity;
            }
            if ((i & 4) != 0) {
                dayNightColor = quoteWithPositionPillState.dayNightColor;
            }
            return quoteWithPositionPillState.copy(str, stringResource, dayNightColor);
        }

        /* renamed from: component1, reason: from getter */
        public final String getQuoteText() {
            return this.quoteText;
        }

        /* renamed from: component2, reason: from getter */
        public final StringResource getPositionQuantity() {
            return this.positionQuantity;
        }

        /* renamed from: component3, reason: from getter */
        public final DayNightColor getDayNightColor() {
            return this.dayNightColor;
        }

        public final QuoteWithPositionPillState copy(String quoteText, StringResource positionQuantity, DayNightColor dayNightColor) {
            Intrinsics.checkNotNullParameter(quoteText, "quoteText");
            Intrinsics.checkNotNullParameter(positionQuantity, "positionQuantity");
            return new QuoteWithPositionPillState(quoteText, positionQuantity, dayNightColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof QuoteWithPositionPillState)) {
                return false;
            }
            QuoteWithPositionPillState quoteWithPositionPillState = (QuoteWithPositionPillState) other;
            return Intrinsics.areEqual(this.quoteText, quoteWithPositionPillState.quoteText) && Intrinsics.areEqual(this.positionQuantity, quoteWithPositionPillState.positionQuantity) && Intrinsics.areEqual(this.dayNightColor, quoteWithPositionPillState.dayNightColor);
        }

        public int hashCode() {
            int iHashCode = ((this.quoteText.hashCode() * 31) + this.positionQuantity.hashCode()) * 31;
            DayNightColor dayNightColor = this.dayNightColor;
            return iHashCode + (dayNightColor == null ? 0 : dayNightColor.hashCode());
        }

        public String toString() {
            return "QuoteWithPositionPillState(quoteText=" + this.quoteText + ", positionQuantity=" + this.positionQuantity + ", dayNightColor=" + this.dayNightColor + ")";
        }

        public final String getQuoteText() {
            return this.quoteText;
        }

        public final StringResource getPositionQuantity() {
            return this.positionQuantity;
        }

        public final DayNightColor getDayNightColor() {
            return this.dayNightColor;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QuoteWithPositionPillState(String quoteText, StringResource positionQuantity, DayNightColor dayNightColor) {
            super(null);
            Intrinsics.checkNotNullParameter(quoteText, "quoteText");
            Intrinsics.checkNotNullParameter(positionQuantity, "positionQuantity");
            this.quoteText = quoteText;
            this.positionQuantity = positionQuantity;
            this.dayNightColor = dayNightColor;
        }
    }
}
