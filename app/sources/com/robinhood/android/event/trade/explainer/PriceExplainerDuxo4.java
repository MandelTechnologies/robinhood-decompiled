package com.robinhood.android.event.trade.explainer;

import com.robinhood.staticcontent.model.OtherMarkdown;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PriceExplainerDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/event/trade/explainer/PriceExplainerViewState;", "", "Loading", "Loaded", "Error", "Lcom/robinhood/android/event/trade/explainer/PriceExplainerViewState$Error;", "Lcom/robinhood/android/event/trade/explainer/PriceExplainerViewState$Loaded;", "Lcom/robinhood/android/event/trade/explainer/PriceExplainerViewState$Loading;", "feature-event-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.trade.explainer.PriceExplainerViewState, reason: use source file name */
/* loaded from: classes3.dex */
public interface PriceExplainerDuxo4 {

    /* compiled from: PriceExplainerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/event/trade/explainer/PriceExplainerViewState$Loading;", "Lcom/robinhood/android/event/trade/explainer/PriceExplainerViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-event-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.event.trade.explainer.PriceExplainerViewState$Loading */
    public static final /* data */ class Loading implements PriceExplainerDuxo4 {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return -1844173469;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }

    /* compiled from: PriceExplainerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/event/trade/explainer/PriceExplainerViewState$Loaded;", "Lcom/robinhood/android/event/trade/explainer/PriceExplainerViewState;", "content", "Lcom/robinhood/staticcontent/model/OtherMarkdown;", "<init>", "(Lcom/robinhood/staticcontent/model/OtherMarkdown;)V", "getContent", "()Lcom/robinhood/staticcontent/model/OtherMarkdown;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-event-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.event.trade.explainer.PriceExplainerViewState$Loaded, reason: from toString */
    public static final /* data */ class Loaded implements PriceExplainerDuxo4 {
        public static final int $stable = 8;
        private final OtherMarkdown content;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, OtherMarkdown otherMarkdown, int i, Object obj) {
            if ((i & 1) != 0) {
                otherMarkdown = loaded.content;
            }
            return loaded.copy(otherMarkdown);
        }

        /* renamed from: component1, reason: from getter */
        public final OtherMarkdown getContent() {
            return this.content;
        }

        public final Loaded copy(OtherMarkdown content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return new Loaded(content);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loaded) && Intrinsics.areEqual(this.content, ((Loaded) other).content);
        }

        public int hashCode() {
            return this.content.hashCode();
        }

        public String toString() {
            return "Loaded(content=" + this.content + ")";
        }

        public Loaded(OtherMarkdown content) {
            Intrinsics.checkNotNullParameter(content, "content");
            this.content = content;
        }

        public final OtherMarkdown getContent() {
            return this.content;
        }
    }

    /* compiled from: PriceExplainerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/event/trade/explainer/PriceExplainerViewState$Error;", "Lcom/robinhood/android/event/trade/explainer/PriceExplainerViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-event-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.event.trade.explainer.PriceExplainerViewState$Error */
    public static final /* data */ class Error implements PriceExplainerDuxo4 {
        public static final int $stable = 0;
        public static final Error INSTANCE = new Error();

        public boolean equals(Object other) {
            return this == other || (other instanceof Error);
        }

        public int hashCode() {
            return 340325359;
        }

        public String toString() {
            return "Error";
        }

        private Error() {
        }
    }
}
