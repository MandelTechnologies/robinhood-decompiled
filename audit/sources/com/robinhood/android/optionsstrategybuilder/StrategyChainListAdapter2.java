package com.robinhood.android.optionsstrategybuilder;

import com.robinhood.android.optionsstrategybuilder.rows.OptionStrategyRowModel;
import com.robinhood.models.p355ui.UnderlyingQuote;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StrategyChainListAdapter.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\b\t\nB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/optionsstrategybuilder/StrategyChain;", "", "viewType", "", "<init>", "(I)V", "getViewType", "()I", "StrategyData", "UnderlyingQuoteData", "Disclosure", "Lcom/robinhood/android/optionsstrategybuilder/StrategyChain$Disclosure;", "Lcom/robinhood/android/optionsstrategybuilder/StrategyChain$StrategyData;", "Lcom/robinhood/android/optionsstrategybuilder/StrategyChain$UnderlyingQuoteData;", "feature-options-strategy-builder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionsstrategybuilder.StrategyChain, reason: use source file name */
/* loaded from: classes11.dex */
public abstract class StrategyChainListAdapter2 {
    public static final int $stable = 0;
    private final int viewType;

    public /* synthetic */ StrategyChainListAdapter2(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    private StrategyChainListAdapter2(int i) {
        this.viewType = i;
    }

    public final int getViewType() {
        return this.viewType;
    }

    /* compiled from: StrategyChainListAdapter.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/optionsstrategybuilder/StrategyChain$StrategyData;", "Lcom/robinhood/android/optionsstrategybuilder/StrategyChain;", "optionStrategyRowModel", "Lcom/robinhood/android/optionsstrategybuilder/rows/OptionStrategyRowModel;", "<init>", "(Lcom/robinhood/android/optionsstrategybuilder/rows/OptionStrategyRowModel;)V", "getOptionStrategyRowModel", "()Lcom/robinhood/android/optionsstrategybuilder/rows/OptionStrategyRowModel;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-options-strategy-builder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.optionsstrategybuilder.StrategyChain$StrategyData, reason: from toString */
    public static final /* data */ class StrategyData extends StrategyChainListAdapter2 {
        public static final int $stable = 8;
        private final OptionStrategyRowModel optionStrategyRowModel;

        public static /* synthetic */ StrategyData copy$default(StrategyData strategyData, OptionStrategyRowModel optionStrategyRowModel, int i, Object obj) {
            if ((i & 1) != 0) {
                optionStrategyRowModel = strategyData.optionStrategyRowModel;
            }
            return strategyData.copy(optionStrategyRowModel);
        }

        /* renamed from: component1, reason: from getter */
        public final OptionStrategyRowModel getOptionStrategyRowModel() {
            return this.optionStrategyRowModel;
        }

        public final StrategyData copy(OptionStrategyRowModel optionStrategyRowModel) {
            Intrinsics.checkNotNullParameter(optionStrategyRowModel, "optionStrategyRowModel");
            return new StrategyData(optionStrategyRowModel);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof StrategyData) && Intrinsics.areEqual(this.optionStrategyRowModel, ((StrategyData) other).optionStrategyRowModel);
        }

        public int hashCode() {
            return this.optionStrategyRowModel.hashCode();
        }

        public String toString() {
            return "StrategyData(optionStrategyRowModel=" + this.optionStrategyRowModel + ")";
        }

        public final OptionStrategyRowModel getOptionStrategyRowModel() {
            return this.optionStrategyRowModel;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StrategyData(OptionStrategyRowModel optionStrategyRowModel) {
            super(0, null);
            Intrinsics.checkNotNullParameter(optionStrategyRowModel, "optionStrategyRowModel");
            this.optionStrategyRowModel = optionStrategyRowModel;
        }
    }

    /* compiled from: StrategyChainListAdapter.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/optionsstrategybuilder/StrategyChain$UnderlyingQuoteData;", "Lcom/robinhood/android/optionsstrategybuilder/StrategyChain;", "underlyingQuote", "Lcom/robinhood/models/ui/UnderlyingQuote;", "<init>", "(Lcom/robinhood/models/ui/UnderlyingQuote;)V", "getUnderlyingQuote", "()Lcom/robinhood/models/ui/UnderlyingQuote;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-options-strategy-builder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.optionsstrategybuilder.StrategyChain$UnderlyingQuoteData, reason: from toString */
    public static final /* data */ class UnderlyingQuoteData extends StrategyChainListAdapter2 {
        public static final int $stable = 8;
        private final UnderlyingQuote underlyingQuote;

        public static /* synthetic */ UnderlyingQuoteData copy$default(UnderlyingQuoteData underlyingQuoteData, UnderlyingQuote underlyingQuote, int i, Object obj) {
            if ((i & 1) != 0) {
                underlyingQuote = underlyingQuoteData.underlyingQuote;
            }
            return underlyingQuoteData.copy(underlyingQuote);
        }

        /* renamed from: component1, reason: from getter */
        public final UnderlyingQuote getUnderlyingQuote() {
            return this.underlyingQuote;
        }

        public final UnderlyingQuoteData copy(UnderlyingQuote underlyingQuote) {
            Intrinsics.checkNotNullParameter(underlyingQuote, "underlyingQuote");
            return new UnderlyingQuoteData(underlyingQuote);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UnderlyingQuoteData) && Intrinsics.areEqual(this.underlyingQuote, ((UnderlyingQuoteData) other).underlyingQuote);
        }

        public int hashCode() {
            return this.underlyingQuote.hashCode();
        }

        public String toString() {
            return "UnderlyingQuoteData(underlyingQuote=" + this.underlyingQuote + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnderlyingQuoteData(UnderlyingQuote underlyingQuote) {
            super(1, null);
            Intrinsics.checkNotNullParameter(underlyingQuote, "underlyingQuote");
            this.underlyingQuote = underlyingQuote;
        }

        public final UnderlyingQuote getUnderlyingQuote() {
            return this.underlyingQuote;
        }
    }

    /* compiled from: StrategyChainListAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/optionsstrategybuilder/StrategyChain$Disclosure;", "Lcom/robinhood/android/optionsstrategybuilder/StrategyChain;", "<init>", "()V", "feature-options-strategy-builder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.optionsstrategybuilder.StrategyChain$Disclosure */
    public static final class Disclosure extends StrategyChainListAdapter2 {
        public static final int $stable = 0;
        public static final Disclosure INSTANCE = new Disclosure();

        private Disclosure() {
            super(2, null);
        }
    }
}
