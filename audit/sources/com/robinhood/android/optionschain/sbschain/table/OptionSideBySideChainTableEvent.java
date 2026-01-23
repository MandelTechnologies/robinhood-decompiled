package com.robinhood.android.optionschain.sbschain.table;

import com.robinhood.android.optionschain.sbschain.table.gestures.OptionLegBundlesToReplace;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionSideBySideChainTableEvent.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableEvent;", "", "<init>", "()V", "DragUpdateSelectedLegs", "ScrollToTargetRowIndex", "ScrollToQuotePosition", "NuxScrollToQuotePosition", "ScrollToPosition", "Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableEvent$DragUpdateSelectedLegs;", "Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableEvent$NuxScrollToQuotePosition;", "Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableEvent$ScrollToPosition;", "Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableEvent$ScrollToQuotePosition;", "Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableEvent$ScrollToTargetRowIndex;", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public abstract class OptionSideBySideChainTableEvent {
    public static final int $stable = 0;

    public /* synthetic */ OptionSideBySideChainTableEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private OptionSideBySideChainTableEvent() {
    }

    /* compiled from: OptionSideBySideChainTableEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableEvent$DragUpdateSelectedLegs;", "Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableEvent;", "legBundlesToReplace", "Lcom/robinhood/android/optionschain/sbschain/table/gestures/OptionLegBundlesToReplace;", "<init>", "(Lcom/robinhood/android/optionschain/sbschain/table/gestures/OptionLegBundlesToReplace;)V", "getLegBundlesToReplace", "()Lcom/robinhood/android/optionschain/sbschain/table/gestures/OptionLegBundlesToReplace;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class DragUpdateSelectedLegs extends OptionSideBySideChainTableEvent {
        public static final int $stable = 8;
        private final OptionLegBundlesToReplace legBundlesToReplace;

        public static /* synthetic */ DragUpdateSelectedLegs copy$default(DragUpdateSelectedLegs dragUpdateSelectedLegs, OptionLegBundlesToReplace optionLegBundlesToReplace, int i, Object obj) {
            if ((i & 1) != 0) {
                optionLegBundlesToReplace = dragUpdateSelectedLegs.legBundlesToReplace;
            }
            return dragUpdateSelectedLegs.copy(optionLegBundlesToReplace);
        }

        /* renamed from: component1, reason: from getter */
        public final OptionLegBundlesToReplace getLegBundlesToReplace() {
            return this.legBundlesToReplace;
        }

        public final DragUpdateSelectedLegs copy(OptionLegBundlesToReplace legBundlesToReplace) {
            Intrinsics.checkNotNullParameter(legBundlesToReplace, "legBundlesToReplace");
            return new DragUpdateSelectedLegs(legBundlesToReplace);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DragUpdateSelectedLegs) && Intrinsics.areEqual(this.legBundlesToReplace, ((DragUpdateSelectedLegs) other).legBundlesToReplace);
        }

        public int hashCode() {
            return this.legBundlesToReplace.hashCode();
        }

        public String toString() {
            return "DragUpdateSelectedLegs(legBundlesToReplace=" + this.legBundlesToReplace + ")";
        }

        public final OptionLegBundlesToReplace getLegBundlesToReplace() {
            return this.legBundlesToReplace;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DragUpdateSelectedLegs(OptionLegBundlesToReplace legBundlesToReplace) {
            super(null);
            Intrinsics.checkNotNullParameter(legBundlesToReplace, "legBundlesToReplace");
            this.legBundlesToReplace = legBundlesToReplace;
        }
    }

    /* compiled from: OptionSideBySideChainTableEvent.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableEvent$ScrollToTargetRowIndex;", "Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableEvent;", "targetRowIndex", "", "<init>", "(I)V", "getTargetRowIndex", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ScrollToTargetRowIndex extends OptionSideBySideChainTableEvent {
        public static final int $stable = 0;
        private final int targetRowIndex;

        public static /* synthetic */ ScrollToTargetRowIndex copy$default(ScrollToTargetRowIndex scrollToTargetRowIndex, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = scrollToTargetRowIndex.targetRowIndex;
            }
            return scrollToTargetRowIndex.copy(i);
        }

        /* renamed from: component1, reason: from getter */
        public final int getTargetRowIndex() {
            return this.targetRowIndex;
        }

        public final ScrollToTargetRowIndex copy(int targetRowIndex) {
            return new ScrollToTargetRowIndex(targetRowIndex);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ScrollToTargetRowIndex) && this.targetRowIndex == ((ScrollToTargetRowIndex) other).targetRowIndex;
        }

        public int hashCode() {
            return Integer.hashCode(this.targetRowIndex);
        }

        public String toString() {
            return "ScrollToTargetRowIndex(targetRowIndex=" + this.targetRowIndex + ")";
        }

        public final int getTargetRowIndex() {
            return this.targetRowIndex;
        }

        public ScrollToTargetRowIndex(int i) {
            super(null);
            this.targetRowIndex = i;
        }
    }

    /* compiled from: OptionSideBySideChainTableEvent.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableEvent$ScrollToQuotePosition;", "Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableEvent;", "quoteIndex", "", "<init>", "(I)V", "getQuoteIndex", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ScrollToQuotePosition extends OptionSideBySideChainTableEvent {
        public static final int $stable = 0;
        private final int quoteIndex;

        public static /* synthetic */ ScrollToQuotePosition copy$default(ScrollToQuotePosition scrollToQuotePosition, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = scrollToQuotePosition.quoteIndex;
            }
            return scrollToQuotePosition.copy(i);
        }

        /* renamed from: component1, reason: from getter */
        public final int getQuoteIndex() {
            return this.quoteIndex;
        }

        public final ScrollToQuotePosition copy(int quoteIndex) {
            return new ScrollToQuotePosition(quoteIndex);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ScrollToQuotePosition) && this.quoteIndex == ((ScrollToQuotePosition) other).quoteIndex;
        }

        public int hashCode() {
            return Integer.hashCode(this.quoteIndex);
        }

        public String toString() {
            return "ScrollToQuotePosition(quoteIndex=" + this.quoteIndex + ")";
        }

        public final int getQuoteIndex() {
            return this.quoteIndex;
        }

        public ScrollToQuotePosition(int i) {
            super(null);
            this.quoteIndex = i;
        }
    }

    /* compiled from: OptionSideBySideChainTableEvent.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableEvent$NuxScrollToQuotePosition;", "Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableEvent;", "quoteIndex", "", "<init>", "(I)V", "getQuoteIndex", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class NuxScrollToQuotePosition extends OptionSideBySideChainTableEvent {
        public static final int $stable = 0;
        private final int quoteIndex;

        public static /* synthetic */ NuxScrollToQuotePosition copy$default(NuxScrollToQuotePosition nuxScrollToQuotePosition, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = nuxScrollToQuotePosition.quoteIndex;
            }
            return nuxScrollToQuotePosition.copy(i);
        }

        /* renamed from: component1, reason: from getter */
        public final int getQuoteIndex() {
            return this.quoteIndex;
        }

        public final NuxScrollToQuotePosition copy(int quoteIndex) {
            return new NuxScrollToQuotePosition(quoteIndex);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NuxScrollToQuotePosition) && this.quoteIndex == ((NuxScrollToQuotePosition) other).quoteIndex;
        }

        public int hashCode() {
            return Integer.hashCode(this.quoteIndex);
        }

        public String toString() {
            return "NuxScrollToQuotePosition(quoteIndex=" + this.quoteIndex + ")";
        }

        public final int getQuoteIndex() {
            return this.quoteIndex;
        }

        public NuxScrollToQuotePosition(int i) {
            super(null);
            this.quoteIndex = i;
        }
    }

    /* compiled from: OptionSideBySideChainTableEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableEvent$ScrollToPosition;", "Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableEvent;", "position", "Lcom/robinhood/android/optionschain/sbschain/table/ScrollPosition;", "<init>", "(Lcom/robinhood/android/optionschain/sbschain/table/ScrollPosition;)V", "getPosition", "()Lcom/robinhood/android/optionschain/sbschain/table/ScrollPosition;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ScrollToPosition extends OptionSideBySideChainTableEvent {
        public static final int $stable = 0;
        private final ScrollPosition position;

        public static /* synthetic */ ScrollToPosition copy$default(ScrollToPosition scrollToPosition, ScrollPosition scrollPosition, int i, Object obj) {
            if ((i & 1) != 0) {
                scrollPosition = scrollToPosition.position;
            }
            return scrollToPosition.copy(scrollPosition);
        }

        /* renamed from: component1, reason: from getter */
        public final ScrollPosition getPosition() {
            return this.position;
        }

        public final ScrollToPosition copy(ScrollPosition position) {
            Intrinsics.checkNotNullParameter(position, "position");
            return new ScrollToPosition(position);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ScrollToPosition) && Intrinsics.areEqual(this.position, ((ScrollToPosition) other).position);
        }

        public int hashCode() {
            return this.position.hashCode();
        }

        public String toString() {
            return "ScrollToPosition(position=" + this.position + ")";
        }

        public final ScrollPosition getPosition() {
            return this.position;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ScrollToPosition(ScrollPosition position) {
            super(null);
            Intrinsics.checkNotNullParameter(position, "position");
            this.position = position;
        }
    }
}
