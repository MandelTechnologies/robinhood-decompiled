package com.robinhood.android.futures.eventbrackets.p141ui;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: BracketRound.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\nHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/futures/eventbrackets/ui/BracketRoundData;", "", "cards", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/futures/eventbrackets/ui/BracketGameOverviewCardData;", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;)V", "getCards", "()Lkotlinx/collections/immutable/ImmutableList;", "numberOfCards", "", "getNumberOfCards", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "feature-event-brackets_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BracketRoundData {
    public static final int $stable = 0;
    private final ImmutableList<BracketGameOverviewCardData> cards;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BracketRoundData copy$default(BracketRoundData bracketRoundData, ImmutableList immutableList, int i, Object obj) {
        if ((i & 1) != 0) {
            immutableList = bracketRoundData.cards;
        }
        return bracketRoundData.copy(immutableList);
    }

    public final ImmutableList<BracketGameOverviewCardData> component1() {
        return this.cards;
    }

    public final BracketRoundData copy(ImmutableList<BracketGameOverviewCardData> cards) {
        Intrinsics.checkNotNullParameter(cards, "cards");
        return new BracketRoundData(cards);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BracketRoundData) && Intrinsics.areEqual(this.cards, ((BracketRoundData) other).cards);
    }

    public int hashCode() {
        return this.cards.hashCode();
    }

    public String toString() {
        return "BracketRoundData(cards=" + this.cards + ")";
    }

    public BracketRoundData(ImmutableList<BracketGameOverviewCardData> cards) {
        Intrinsics.checkNotNullParameter(cards, "cards");
        this.cards = cards;
    }

    public final ImmutableList<BracketGameOverviewCardData> getCards() {
        return this.cards;
    }

    public final int getNumberOfCards() {
        return this.cards.size();
    }
}
