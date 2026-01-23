package com.robinhood.android.redesigninvesting.highlights.p231ui;

import com.robinhood.android.redesigninvesting.highlights.models.HighlightCard;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: HighlightsCarouselDuxo.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/redesigninvesting/highlights/ui/HighlightsCarouselViewState;", "", "carouselItems", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/redesigninvesting/highlights/models/HighlightCard;", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;)V", "getCarouselItems", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-highlights-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class HighlightsCarouselViewState {
    public static final int $stable = 8;
    private final ImmutableList<HighlightCard> carouselItems;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HighlightsCarouselViewState copy$default(HighlightsCarouselViewState highlightsCarouselViewState, ImmutableList immutableList, int i, Object obj) {
        if ((i & 1) != 0) {
            immutableList = highlightsCarouselViewState.carouselItems;
        }
        return highlightsCarouselViewState.copy(immutableList);
    }

    public final ImmutableList<HighlightCard> component1() {
        return this.carouselItems;
    }

    public final HighlightsCarouselViewState copy(ImmutableList<? extends HighlightCard> carouselItems) {
        Intrinsics.checkNotNullParameter(carouselItems, "carouselItems");
        return new HighlightsCarouselViewState(carouselItems);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof HighlightsCarouselViewState) && Intrinsics.areEqual(this.carouselItems, ((HighlightsCarouselViewState) other).carouselItems);
    }

    public int hashCode() {
        return this.carouselItems.hashCode();
    }

    public String toString() {
        return "HighlightsCarouselViewState(carouselItems=" + this.carouselItems + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HighlightsCarouselViewState(ImmutableList<? extends HighlightCard> carouselItems) {
        Intrinsics.checkNotNullParameter(carouselItems, "carouselItems");
        this.carouselItems = carouselItems;
    }

    public final ImmutableList<HighlightCard> getCarouselItems() {
        return this.carouselItems;
    }
}
