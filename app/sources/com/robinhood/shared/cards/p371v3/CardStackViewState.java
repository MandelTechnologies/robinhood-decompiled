package com.robinhood.shared.cards.p371v3;

import androidx.compose.p011ui.unit.C2002Dp;
import com.robinhood.shared.cards.compose.NotificationCardComposable4;
import com.robinhood.shared.cards.compose.SwipeableStackState;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CardStackDuxo.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0010\u0010\u000f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ*\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u00020\u0006¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/shared/cards/v3/CardStackViewState;", "", "swipeableStackState", "Lcom/robinhood/shared/cards/compose/SwipeableStackState;", "Lcom/robinhood/shared/cards/compose/NotificationCardState;", "contentStartSpacingWithSideImage", "Landroidx/compose/ui/unit/Dp;", "<init>", "(Lcom/robinhood/shared/cards/compose/SwipeableStackState;FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getSwipeableStackState", "()Lcom/robinhood/shared/cards/compose/SwipeableStackState;", "getContentStartSpacingWithSideImage-D9Ej5fM", "()F", "F", "component1", "component2", "component2-D9Ej5fM", "copy", "copy-3ABfNKs", "(Lcom/robinhood/shared/cards/compose/SwipeableStackState;F)Lcom/robinhood/shared/cards/v3/CardStackViewState;", "equals", "", "other", "hashCode", "", "toString", "", "lib-cards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final /* data */ class CardStackViewState {
    public static final int $stable = 8;
    private final float contentStartSpacingWithSideImage;
    private final SwipeableStackState<NotificationCardComposable4> swipeableStackState;

    public /* synthetic */ CardStackViewState(SwipeableStackState swipeableStackState, float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(swipeableStackState, f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: copy-3ABfNKs$default, reason: not valid java name */
    public static /* synthetic */ CardStackViewState m24791copy3ABfNKs$default(CardStackViewState cardStackViewState, SwipeableStackState swipeableStackState, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            swipeableStackState = cardStackViewState.swipeableStackState;
        }
        if ((i & 2) != 0) {
            f = cardStackViewState.contentStartSpacingWithSideImage;
        }
        return cardStackViewState.m24793copy3ABfNKs(swipeableStackState, f);
    }

    public final SwipeableStackState<NotificationCardComposable4> component1() {
        return this.swipeableStackState;
    }

    /* renamed from: component2-D9Ej5fM, reason: not valid java name and from getter */
    public final float getContentStartSpacingWithSideImage() {
        return this.contentStartSpacingWithSideImage;
    }

    /* renamed from: copy-3ABfNKs, reason: not valid java name */
    public final CardStackViewState m24793copy3ABfNKs(SwipeableStackState<NotificationCardComposable4> swipeableStackState, float contentStartSpacingWithSideImage) {
        Intrinsics.checkNotNullParameter(swipeableStackState, "swipeableStackState");
        return new CardStackViewState(swipeableStackState, contentStartSpacingWithSideImage, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardStackViewState)) {
            return false;
        }
        CardStackViewState cardStackViewState = (CardStackViewState) other;
        return Intrinsics.areEqual(this.swipeableStackState, cardStackViewState.swipeableStackState) && C2002Dp.m7997equalsimpl0(this.contentStartSpacingWithSideImage, cardStackViewState.contentStartSpacingWithSideImage);
    }

    public int hashCode() {
        return (this.swipeableStackState.hashCode() * 31) + C2002Dp.m7998hashCodeimpl(this.contentStartSpacingWithSideImage);
    }

    public String toString() {
        return "CardStackViewState(swipeableStackState=" + this.swipeableStackState + ", contentStartSpacingWithSideImage=" + C2002Dp.m7999toStringimpl(this.contentStartSpacingWithSideImage) + ")";
    }

    private CardStackViewState(SwipeableStackState<NotificationCardComposable4> swipeableStackState, float f) {
        Intrinsics.checkNotNullParameter(swipeableStackState, "swipeableStackState");
        this.swipeableStackState = swipeableStackState;
        this.contentStartSpacingWithSideImage = f;
    }

    public final SwipeableStackState<NotificationCardComposable4> getSwipeableStackState() {
        return this.swipeableStackState;
    }

    /* renamed from: getContentStartSpacingWithSideImage-D9Ej5fM, reason: not valid java name */
    public final float m24794getContentStartSpacingWithSideImageD9Ej5fM() {
        return this.contentStartSpacingWithSideImage;
    }
}
