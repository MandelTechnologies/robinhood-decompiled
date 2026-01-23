package com.robinhood.shared.cards.compose;

import androidx.compose.p011ui.unit.C2002Dp;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.shared.cards.compose.SwipeableStackState.CardInStack;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableSet;

/* compiled from: SwipeableStackComposable.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0001:BU\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010'\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\tJ\u000e\u0010)\u001a\u00020\t2\u0006\u0010(\u001a\u00020\tJ\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0007HÆ\u0003J\t\u0010,\u001a\u00020\tHÆ\u0003J\t\u0010-\u001a\u00020\u000bHÆ\u0003J\u0010\u0010.\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b/\u0010\u0019J\t\u00100\u001a\u00020\u000bHÆ\u0003J\u000f\u00101\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010HÆ\u0003Jh\u00102\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010HÆ\u0001¢\u0006\u0004\b3\u00104J\u0013\u00105\u001a\u00020\u00072\b\u00106\u001a\u0004\u0018\u00010\u0003HÖ\u0003J\t\u00107\u001a\u00020\tHÖ\u0001J\t\u00108\u001a\u000209HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\f\u001a\u00020\r¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u001f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b \u0010\u0017R\u0014\u0010!\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0017R\u0011\u0010#\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b$\u0010\u0015R\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058F¢\u0006\u0006\u001a\u0004\b&\u0010\u0014¨\u0006;"}, m3636d2 = {"Lcom/robinhood/shared/cards/compose/SwipeableStackState;", "T", "Lcom/robinhood/shared/cards/compose/SwipeableStackState$CardInStack;", "", "items", "Lkotlinx/collections/immutable/ImmutableList;", "isLoading", "", "maxCardsToShow", "", "cardThreshold", "", "verticalSpacingBetweenCards", "Landroidx/compose/ui/unit/Dp;", "hiddenCardScale", "dismissedItems", "Lkotlinx/collections/immutable/ImmutableSet;", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;ZIFFFLkotlinx/collections/immutable/ImmutableSet;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getItems", "()Lkotlinx/collections/immutable/ImmutableList;", "()Z", "getMaxCardsToShow", "()I", "getCardThreshold", "()F", "getVerticalSpacingBetweenCards-D9Ej5fM", "F", "getHiddenCardScale", "getDismissedItems", "()Lkotlinx/collections/immutable/ImmutableSet;", "dismissCount", "getDismissCount", "adjustedTotalSize", "getAdjustedTotalSize", "dismissedAll", "getDismissedAll", "undismissedItems", "getUndismissedItems", "isTopCard", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "positionFromTopAfterDismissals", "component1", "component2", "component3", "component4", "component5", "component5-D9Ej5fM", "component6", "component7", "copy", "copy-3xixttE", "(Lkotlinx/collections/immutable/ImmutableList;ZIFFFLkotlinx/collections/immutable/ImmutableSet;)Lcom/robinhood/shared/cards/compose/SwipeableStackState;", "equals", "other", "hashCode", "toString", "", "CardInStack", "lib-cards-compose_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes26.dex */
public final /* data */ class SwipeableStackState<T extends CardInStack> {
    public static final int $stable = 0;
    private final float cardThreshold;
    private final ImmutableSet<T> dismissedItems;
    private final float hiddenCardScale;
    private final boolean isLoading;
    private final ImmutableList<T> items;
    private final int maxCardsToShow;
    private final float verticalSpacingBetweenCards;

    /* compiled from: SwipeableStackComposable.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/shared/cards/compose/SwipeableStackState$CardInStack;", "", "id", "", "getId", "()Ljava/lang/String;", "isFixed", "", "()Z", "lib-cards-compose_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface CardInStack {
        String getId();

        boolean isFixed();
    }

    public /* synthetic */ SwipeableStackState(ImmutableList immutableList, boolean z, int i, float f, float f2, float f3, ImmutableSet immutableSet, DefaultConstructorMarker defaultConstructorMarker) {
        this(immutableList, z, i, f, f2, f3, immutableSet);
    }

    /* renamed from: copy-3xixttE$default, reason: not valid java name */
    public static /* synthetic */ SwipeableStackState m24784copy3xixttE$default(SwipeableStackState swipeableStackState, ImmutableList immutableList, boolean z, int i, float f, float f2, float f3, ImmutableSet immutableSet, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            immutableList = swipeableStackState.items;
        }
        if ((i2 & 2) != 0) {
            z = swipeableStackState.isLoading;
        }
        if ((i2 & 4) != 0) {
            i = swipeableStackState.maxCardsToShow;
        }
        if ((i2 & 8) != 0) {
            f = swipeableStackState.cardThreshold;
        }
        if ((i2 & 16) != 0) {
            f2 = swipeableStackState.verticalSpacingBetweenCards;
        }
        if ((i2 & 32) != 0) {
            f3 = swipeableStackState.hiddenCardScale;
        }
        if ((i2 & 64) != 0) {
            immutableSet = swipeableStackState.dismissedItems;
        }
        float f4 = f3;
        ImmutableSet immutableSet2 = immutableSet;
        float f5 = f2;
        int i3 = i;
        return swipeableStackState.m24786copy3xixttE(immutableList, z, i3, f, f5, f4, immutableSet2);
    }

    public final ImmutableList<T> component1() {
        return this.items;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component3, reason: from getter */
    public final int getMaxCardsToShow() {
        return this.maxCardsToShow;
    }

    /* renamed from: component4, reason: from getter */
    public final float getCardThreshold() {
        return this.cardThreshold;
    }

    /* renamed from: component5-D9Ej5fM, reason: not valid java name and from getter */
    public final float getVerticalSpacingBetweenCards() {
        return this.verticalSpacingBetweenCards;
    }

    /* renamed from: component6, reason: from getter */
    public final float getHiddenCardScale() {
        return this.hiddenCardScale;
    }

    public final ImmutableSet<T> component7() {
        return this.dismissedItems;
    }

    /* renamed from: copy-3xixttE, reason: not valid java name */
    public final SwipeableStackState<T> m24786copy3xixttE(ImmutableList<? extends T> items, boolean isLoading, int maxCardsToShow, float cardThreshold, float verticalSpacingBetweenCards, float hiddenCardScale, ImmutableSet<? extends T> dismissedItems) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(dismissedItems, "dismissedItems");
        return new SwipeableStackState<>(items, isLoading, maxCardsToShow, cardThreshold, verticalSpacingBetweenCards, hiddenCardScale, dismissedItems, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SwipeableStackState)) {
            return false;
        }
        SwipeableStackState swipeableStackState = (SwipeableStackState) other;
        return Intrinsics.areEqual(this.items, swipeableStackState.items) && this.isLoading == swipeableStackState.isLoading && this.maxCardsToShow == swipeableStackState.maxCardsToShow && Float.compare(this.cardThreshold, swipeableStackState.cardThreshold) == 0 && C2002Dp.m7997equalsimpl0(this.verticalSpacingBetweenCards, swipeableStackState.verticalSpacingBetweenCards) && Float.compare(this.hiddenCardScale, swipeableStackState.hiddenCardScale) == 0 && Intrinsics.areEqual(this.dismissedItems, swipeableStackState.dismissedItems);
    }

    public int hashCode() {
        return (((((((((((this.items.hashCode() * 31) + Boolean.hashCode(this.isLoading)) * 31) + Integer.hashCode(this.maxCardsToShow)) * 31) + Float.hashCode(this.cardThreshold)) * 31) + C2002Dp.m7998hashCodeimpl(this.verticalSpacingBetweenCards)) * 31) + Float.hashCode(this.hiddenCardScale)) * 31) + this.dismissedItems.hashCode();
    }

    public String toString() {
        return "SwipeableStackState(items=" + this.items + ", isLoading=" + this.isLoading + ", maxCardsToShow=" + this.maxCardsToShow + ", cardThreshold=" + this.cardThreshold + ", verticalSpacingBetweenCards=" + C2002Dp.m7999toStringimpl(this.verticalSpacingBetweenCards) + ", hiddenCardScale=" + this.hiddenCardScale + ", dismissedItems=" + this.dismissedItems + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    private SwipeableStackState(ImmutableList<? extends T> items, boolean z, int i, float f, float f2, float f3, ImmutableSet<? extends T> dismissedItems) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(dismissedItems, "dismissedItems");
        this.items = items;
        this.isLoading = z;
        this.maxCardsToShow = i;
        this.cardThreshold = f;
        this.verticalSpacingBetweenCards = f2;
        this.hiddenCardScale = f3;
        this.dismissedItems = dismissedItems;
    }

    public final ImmutableList<T> getItems() {
        return this.items;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final int getMaxCardsToShow() {
        return this.maxCardsToShow;
    }

    public final float getCardThreshold() {
        return this.cardThreshold;
    }

    /* renamed from: getVerticalSpacingBetweenCards-D9Ej5fM, reason: not valid java name */
    public final float m24787getVerticalSpacingBetweenCardsD9Ej5fM() {
        return this.verticalSpacingBetweenCards;
    }

    public final float getHiddenCardScale() {
        return this.hiddenCardScale;
    }

    public final ImmutableSet<T> getDismissedItems() {
        return this.dismissedItems;
    }

    public final int getDismissCount() {
        return this.dismissedItems.size();
    }

    private final int getAdjustedTotalSize() {
        return this.items.size() - 1;
    }

    public final boolean getDismissedAll() {
        return !this.isLoading && this.dismissedItems.containsAll(this.items);
    }

    public /* synthetic */ SwipeableStackState(ImmutableList immutableList, boolean z, int i, float f, float f2, float f3, ImmutableSet immutableSet, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(immutableList, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? 2 : i, (i2 & 8) != 0 ? 0.5f : f, (i2 & 16) != 0 ? C2002Dp.m7995constructorimpl(12) : f2, (i2 & 32) != 0 ? 0.01f : f3, immutableSet, null);
    }

    public final ImmutableList<T> getUndismissedItems() {
        ImmutableList<T> immutableList = this.items;
        return immutableList.subList(0, Math.max(0, immutableList.size() - getDismissCount()));
    }

    public final boolean isTopCard(int index) {
        return index == getAdjustedTotalSize() - getDismissCount();
    }

    public final int positionFromTopAfterDismissals(int index) {
        return Math.min(this.maxCardsToShow, (getAdjustedTotalSize() - index) - getDismissCount());
    }
}
