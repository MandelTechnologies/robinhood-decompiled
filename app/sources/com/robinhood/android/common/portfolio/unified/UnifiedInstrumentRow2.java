package com.robinhood.android.common.portfolio.unified;

import com.robinhood.android.common.portfolio.position.SwipeAnimationPreview;
import com.robinhood.android.models.portfolio.PositionsV2;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.models.p320db.CuratedListItem;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.InstrumentDisplayType;
import com.robinhood.models.serverdriven.experimental.api.InstrumentListItem;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UnifiedInstrumentRow.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/common/portfolio/unified/UnifiedRow;", "", "InstrumentRow", "OptionStrategyRow", "PositionRow", "Lcom/robinhood/android/common/portfolio/unified/UnifiedRow$InstrumentRow;", "Lcom/robinhood/android/common/portfolio/unified/UnifiedRow$OptionStrategyRow;", "Lcom/robinhood/android/common/portfolio/unified/UnifiedRow$PositionRow;", "feature-lib-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.portfolio.unified.UnifiedRow, reason: use source file name */
/* loaded from: classes2.dex */
public interface UnifiedInstrumentRow2 {

    /* compiled from: UnifiedInstrumentRow.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J/\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/common/portfolio/unified/UnifiedRow$InstrumentRow;", "Lcom/robinhood/android/common/portfolio/unified/UnifiedRow;", "instrument", "Lcom/robinhood/models/serverdriven/experimental/api/InstrumentListItem;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "displayType", "Lcom/robinhood/models/serverdriven/experimental/api/InstrumentDisplayType;", "accountNumber", "", "<init>", "(Lcom/robinhood/models/serverdriven/experimental/api/InstrumentListItem;Lcom/robinhood/models/serverdriven/experimental/api/InstrumentDisplayType;Ljava/lang/String;)V", "getInstrument", "()Lcom/robinhood/models/serverdriven/experimental/api/InstrumentListItem;", "getDisplayType", "()Lcom/robinhood/models/serverdriven/experimental/api/InstrumentDisplayType;", "getAccountNumber", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-lib-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.portfolio.unified.UnifiedRow$InstrumentRow, reason: from toString */
    public static final /* data */ class InstrumentRow implements UnifiedInstrumentRow2 {
        public static final int $stable = 8;
        private final String accountNumber;
        private final InstrumentDisplayType displayType;
        private final InstrumentListItem<GenericAction> instrument;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ InstrumentRow copy$default(InstrumentRow instrumentRow, InstrumentListItem instrumentListItem, InstrumentDisplayType instrumentDisplayType, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                instrumentListItem = instrumentRow.instrument;
            }
            if ((i & 2) != 0) {
                instrumentDisplayType = instrumentRow.displayType;
            }
            if ((i & 4) != 0) {
                str = instrumentRow.accountNumber;
            }
            return instrumentRow.copy(instrumentListItem, instrumentDisplayType, str);
        }

        public final InstrumentListItem<GenericAction> component1() {
            return this.instrument;
        }

        /* renamed from: component2, reason: from getter */
        public final InstrumentDisplayType getDisplayType() {
            return this.displayType;
        }

        /* renamed from: component3, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final InstrumentRow copy(InstrumentListItem<? extends GenericAction> instrument, InstrumentDisplayType displayType, String accountNumber) {
            Intrinsics.checkNotNullParameter(instrument, "instrument");
            Intrinsics.checkNotNullParameter(displayType, "displayType");
            return new InstrumentRow(instrument, displayType, accountNumber);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InstrumentRow)) {
                return false;
            }
            InstrumentRow instrumentRow = (InstrumentRow) other;
            return Intrinsics.areEqual(this.instrument, instrumentRow.instrument) && this.displayType == instrumentRow.displayType && Intrinsics.areEqual(this.accountNumber, instrumentRow.accountNumber);
        }

        public int hashCode() {
            int iHashCode = ((this.instrument.hashCode() * 31) + this.displayType.hashCode()) * 31;
            String str = this.accountNumber;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "InstrumentRow(instrument=" + this.instrument + ", displayType=" + this.displayType + ", accountNumber=" + this.accountNumber + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public InstrumentRow(InstrumentListItem<? extends GenericAction> instrument, InstrumentDisplayType displayType, String str) {
            Intrinsics.checkNotNullParameter(instrument, "instrument");
            Intrinsics.checkNotNullParameter(displayType, "displayType");
            this.instrument = instrument;
            this.displayType = displayType;
            this.accountNumber = str;
        }

        public final InstrumentListItem<GenericAction> getInstrument() {
            return this.instrument;
        }

        public final InstrumentDisplayType getDisplayType() {
            return this.displayType;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }
    }

    /* compiled from: UnifiedInstrumentRow.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/common/portfolio/unified/UnifiedRow$OptionStrategyRow;", "Lcom/robinhood/android/common/portfolio/unified/UnifiedRow;", "displayType", "", "optionCuratedListItem", "Lcom/robinhood/models/db/CuratedListItem;", "accountNumber", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/db/CuratedListItem;Ljava/lang/String;)V", "getDisplayType", "()Ljava/lang/String;", "getOptionCuratedListItem", "()Lcom/robinhood/models/db/CuratedListItem;", "getAccountNumber", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-lib-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.portfolio.unified.UnifiedRow$OptionStrategyRow, reason: from toString */
    public static final /* data */ class OptionStrategyRow implements UnifiedInstrumentRow2 {
        public static final int $stable = 8;
        private final String accountNumber;
        private final String displayType;
        private final CuratedListItem optionCuratedListItem;

        public static /* synthetic */ OptionStrategyRow copy$default(OptionStrategyRow optionStrategyRow, String str, CuratedListItem curatedListItem, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = optionStrategyRow.displayType;
            }
            if ((i & 2) != 0) {
                curatedListItem = optionStrategyRow.optionCuratedListItem;
            }
            if ((i & 4) != 0) {
                str2 = optionStrategyRow.accountNumber;
            }
            return optionStrategyRow.copy(str, curatedListItem, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getDisplayType() {
            return this.displayType;
        }

        /* renamed from: component2, reason: from getter */
        public final CuratedListItem getOptionCuratedListItem() {
            return this.optionCuratedListItem;
        }

        /* renamed from: component3, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final OptionStrategyRow copy(String displayType, CuratedListItem optionCuratedListItem, String accountNumber) {
            Intrinsics.checkNotNullParameter(displayType, "displayType");
            Intrinsics.checkNotNullParameter(optionCuratedListItem, "optionCuratedListItem");
            return new OptionStrategyRow(displayType, optionCuratedListItem, accountNumber);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OptionStrategyRow)) {
                return false;
            }
            OptionStrategyRow optionStrategyRow = (OptionStrategyRow) other;
            return Intrinsics.areEqual(this.displayType, optionStrategyRow.displayType) && Intrinsics.areEqual(this.optionCuratedListItem, optionStrategyRow.optionCuratedListItem) && Intrinsics.areEqual(this.accountNumber, optionStrategyRow.accountNumber);
        }

        public int hashCode() {
            int iHashCode = ((this.displayType.hashCode() * 31) + this.optionCuratedListItem.hashCode()) * 31;
            String str = this.accountNumber;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "OptionStrategyRow(displayType=" + this.displayType + ", optionCuratedListItem=" + this.optionCuratedListItem + ", accountNumber=" + this.accountNumber + ")";
        }

        public OptionStrategyRow(String displayType, CuratedListItem optionCuratedListItem, String str) {
            Intrinsics.checkNotNullParameter(displayType, "displayType");
            Intrinsics.checkNotNullParameter(optionCuratedListItem, "optionCuratedListItem");
            this.displayType = displayType;
            this.optionCuratedListItem = optionCuratedListItem;
            this.accountNumber = str;
        }

        public final String getDisplayType() {
            return this.displayType;
        }

        public final CuratedListItem getOptionCuratedListItem() {
            return this.optionCuratedListItem;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }
    }

    /* compiled from: UnifiedInstrumentRow.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\r\u0010\u0016\u001a\u00060\u0005j\u0002`\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003J7\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\b\u0002\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\bHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/common/portfolio/unified/UnifiedRow$PositionRow;", "Lcom/robinhood/android/common/portfolio/unified/UnifiedRow;", "position", "Lcom/robinhood/android/models/portfolio/PositionsV2$PositionListItemV2;", "displayType", "", "Lcom/robinhood/android/models/portfolio/PositionDisplayType;", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "swipeAnimationPreview", "Lcom/robinhood/android/common/portfolio/position/SwipeAnimationPreview;", "<init>", "(Lcom/robinhood/android/models/portfolio/PositionsV2$PositionListItemV2;Ljava/lang/String;ILcom/robinhood/android/common/portfolio/position/SwipeAnimationPreview;)V", "getPosition", "()Lcom/robinhood/android/models/portfolio/PositionsV2$PositionListItemV2;", "getDisplayType", "()Ljava/lang/String;", "getIndex", "()I", "getSwipeAnimationPreview", "()Lcom/robinhood/android/common/portfolio/position/SwipeAnimationPreview;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "feature-lib-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.portfolio.unified.UnifiedRow$PositionRow, reason: from toString */
    public static final /* data */ class PositionRow implements UnifiedInstrumentRow2 {
        public static final int $stable = 8;
        private final String displayType;
        private final int index;
        private final PositionsV2.PositionListItemV2 position;
        private final SwipeAnimationPreview swipeAnimationPreview;

        public static /* synthetic */ PositionRow copy$default(PositionRow positionRow, PositionsV2.PositionListItemV2 positionListItemV2, String str, int i, SwipeAnimationPreview swipeAnimationPreview, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                positionListItemV2 = positionRow.position;
            }
            if ((i2 & 2) != 0) {
                str = positionRow.displayType;
            }
            if ((i2 & 4) != 0) {
                i = positionRow.index;
            }
            if ((i2 & 8) != 0) {
                swipeAnimationPreview = positionRow.swipeAnimationPreview;
            }
            return positionRow.copy(positionListItemV2, str, i, swipeAnimationPreview);
        }

        /* renamed from: component1, reason: from getter */
        public final PositionsV2.PositionListItemV2 getPosition() {
            return this.position;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDisplayType() {
            return this.displayType;
        }

        /* renamed from: component3, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        /* renamed from: component4, reason: from getter */
        public final SwipeAnimationPreview getSwipeAnimationPreview() {
            return this.swipeAnimationPreview;
        }

        public final PositionRow copy(PositionsV2.PositionListItemV2 position, String displayType, int index, SwipeAnimationPreview swipeAnimationPreview) {
            Intrinsics.checkNotNullParameter(position, "position");
            Intrinsics.checkNotNullParameter(displayType, "displayType");
            return new PositionRow(position, displayType, index, swipeAnimationPreview);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PositionRow)) {
                return false;
            }
            PositionRow positionRow = (PositionRow) other;
            return Intrinsics.areEqual(this.position, positionRow.position) && Intrinsics.areEqual(this.displayType, positionRow.displayType) && this.index == positionRow.index && Intrinsics.areEqual(this.swipeAnimationPreview, positionRow.swipeAnimationPreview);
        }

        public int hashCode() {
            int iHashCode = ((((this.position.hashCode() * 31) + this.displayType.hashCode()) * 31) + Integer.hashCode(this.index)) * 31;
            SwipeAnimationPreview swipeAnimationPreview = this.swipeAnimationPreview;
            return iHashCode + (swipeAnimationPreview == null ? 0 : swipeAnimationPreview.hashCode());
        }

        public String toString() {
            return "PositionRow(position=" + this.position + ", displayType=" + this.displayType + ", index=" + this.index + ", swipeAnimationPreview=" + this.swipeAnimationPreview + ")";
        }

        public PositionRow(PositionsV2.PositionListItemV2 position, String displayType, int i, SwipeAnimationPreview swipeAnimationPreview) {
            Intrinsics.checkNotNullParameter(position, "position");
            Intrinsics.checkNotNullParameter(displayType, "displayType");
            this.position = position;
            this.displayType = displayType;
            this.index = i;
            this.swipeAnimationPreview = swipeAnimationPreview;
        }

        public /* synthetic */ PositionRow(PositionsV2.PositionListItemV2 positionListItemV2, String str, int i, SwipeAnimationPreview swipeAnimationPreview, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(positionListItemV2, str, i, (i2 & 8) != 0 ? null : swipeAnimationPreview);
        }

        public final PositionsV2.PositionListItemV2 getPosition() {
            return this.position;
        }

        public final String getDisplayType() {
            return this.displayType;
        }

        public final int getIndex() {
            return this.index;
        }

        public final SwipeAnimationPreview getSwipeAnimationPreview() {
            return this.swipeAnimationPreview;
        }
    }
}
