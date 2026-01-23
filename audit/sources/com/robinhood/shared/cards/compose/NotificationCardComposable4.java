package com.robinhood.shared.cards.compose;

import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.card.p311db.CardAsset;
import com.robinhood.models.serverdriven.experimental.api.Color;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.shared.cards.compose.SwipeableStackState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NotificationCardComposable.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\t\nR\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\b\u0082\u0001\u0002\u000b\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/shared/cards/compose/NotificationCardState;", "Lcom/robinhood/shared/cards/compose/SwipeableStackState$CardInStack;", "id", "", "getId", "()Ljava/lang/String;", "isFixed", "", "()Z", "Regular", "End", "Lcom/robinhood/shared/cards/compose/NotificationCardState$End;", "Lcom/robinhood/shared/cards/compose/NotificationCardState$Regular;", "lib-cards-compose_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.cards.compose.NotificationCardState, reason: use source file name */
/* loaded from: classes26.dex */
public interface NotificationCardComposable4 extends SwipeableStackState.CardInStack {
    @Override // com.robinhood.shared.cards.compose.SwipeableStackState.CardInStack
    String getId();

    @Override // com.robinhood.shared.cards.compose.SwipeableStackState.CardInStack
    boolean isFixed();

    /* compiled from: NotificationCardComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.cards.compose.NotificationCardState$DefaultImpls */
    public static final class DefaultImpls {
        public static String getId(NotificationCardComposable4 notificationCardComposable4) {
            if (notificationCardComposable4 instanceof Regular) {
                return ((Regular) notificationCardComposable4).getCard().getId();
            }
            if (notificationCardComposable4 instanceof End) {
                return "end";
            }
            throw new NoWhenBranchMatchedException();
        }

        public static boolean isFixed(NotificationCardComposable4 notificationCardComposable4) {
            if (notificationCardComposable4 instanceof Regular) {
                return ((Regular) notificationCardComposable4).getCard().getFixed();
            }
            if (notificationCardComposable4 instanceof End) {
                return true;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: NotificationCardComposable.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\u0010\b\u001a\u00060\tj\u0002`\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\r\u0010\u001e\u001a\u00060\tj\u0002`\nHÆ\u0003J\t\u0010\u001f\u001a\u00020\fHÆ\u0003J\t\u0010 \u001a\u00020\fHÆ\u0003JI\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\f\b\u0002\u0010\b\u001a\u00060\tj\u0002`\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\b\u001a\u00060\tj\u0002`\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019¨\u0006)"}, m3636d2 = {"Lcom/robinhood/shared/cards/compose/NotificationCardState$Regular;", "Lcom/robinhood/shared/cards/compose/NotificationCardState;", "card", "Lcom/robinhood/models/card/db/Card;", "tint", "Lcom/robinhood/models/card/db/CardAsset$Tint;", "countText", "", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "cardColorOnTop", "Lcom/robinhood/models/serverdriven/experimental/api/Color;", "cardColorWhenHidden", "<init>", "(Lcom/robinhood/models/card/db/Card;Lcom/robinhood/models/card/db/CardAsset$Tint;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/Context;Lcom/robinhood/models/serverdriven/experimental/api/Color;Lcom/robinhood/models/serverdriven/experimental/api/Color;)V", "getCard", "()Lcom/robinhood/models/card/db/Card;", "getTint", "()Lcom/robinhood/models/card/db/CardAsset$Tint;", "getCountText", "()Ljava/lang/String;", "getEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "getCardColorOnTop", "()Lcom/robinhood/models/serverdriven/experimental/api/Color;", "getCardColorWhenHidden", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-cards-compose_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.cards.compose.NotificationCardState$Regular, reason: from toString */
    public static final /* data */ class Regular implements NotificationCardComposable4 {
        public static final int $stable = 8;
        private final Card card;
        private final Color cardColorOnTop;
        private final Color cardColorWhenHidden;
        private final String countText;
        private final Context eventContext;
        private final CardAsset.Tint tint;

        public static /* synthetic */ Regular copy$default(Regular regular, Card card, CardAsset.Tint tint, String str, Context context, Color color, Color color2, int i, Object obj) {
            if ((i & 1) != 0) {
                card = regular.card;
            }
            if ((i & 2) != 0) {
                tint = regular.tint;
            }
            if ((i & 4) != 0) {
                str = regular.countText;
            }
            if ((i & 8) != 0) {
                context = regular.eventContext;
            }
            if ((i & 16) != 0) {
                color = regular.cardColorOnTop;
            }
            if ((i & 32) != 0) {
                color2 = regular.cardColorWhenHidden;
            }
            Color color3 = color;
            Color color4 = color2;
            return regular.copy(card, tint, str, context, color3, color4);
        }

        /* renamed from: component1, reason: from getter */
        public final Card getCard() {
            return this.card;
        }

        /* renamed from: component2, reason: from getter */
        public final CardAsset.Tint getTint() {
            return this.tint;
        }

        /* renamed from: component3, reason: from getter */
        public final String getCountText() {
            return this.countText;
        }

        /* renamed from: component4, reason: from getter */
        public final Context getEventContext() {
            return this.eventContext;
        }

        /* renamed from: component5, reason: from getter */
        public final Color getCardColorOnTop() {
            return this.cardColorOnTop;
        }

        /* renamed from: component6, reason: from getter */
        public final Color getCardColorWhenHidden() {
            return this.cardColorWhenHidden;
        }

        public final Regular copy(Card card, CardAsset.Tint tint, String countText, Context eventContext, Color cardColorOnTop, Color cardColorWhenHidden) {
            Intrinsics.checkNotNullParameter(card, "card");
            Intrinsics.checkNotNullParameter(tint, "tint");
            Intrinsics.checkNotNullParameter(countText, "countText");
            Intrinsics.checkNotNullParameter(eventContext, "eventContext");
            Intrinsics.checkNotNullParameter(cardColorOnTop, "cardColorOnTop");
            Intrinsics.checkNotNullParameter(cardColorWhenHidden, "cardColorWhenHidden");
            return new Regular(card, tint, countText, eventContext, cardColorOnTop, cardColorWhenHidden);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Regular)) {
                return false;
            }
            Regular regular = (Regular) other;
            return Intrinsics.areEqual(this.card, regular.card) && this.tint == regular.tint && Intrinsics.areEqual(this.countText, regular.countText) && Intrinsics.areEqual(this.eventContext, regular.eventContext) && this.cardColorOnTop == regular.cardColorOnTop && this.cardColorWhenHidden == regular.cardColorWhenHidden;
        }

        public int hashCode() {
            return (((((((((this.card.hashCode() * 31) + this.tint.hashCode()) * 31) + this.countText.hashCode()) * 31) + this.eventContext.hashCode()) * 31) + this.cardColorOnTop.hashCode()) * 31) + this.cardColorWhenHidden.hashCode();
        }

        public String toString() {
            return "Regular(card=" + this.card + ", tint=" + this.tint + ", countText=" + this.countText + ", eventContext=" + this.eventContext + ", cardColorOnTop=" + this.cardColorOnTop + ", cardColorWhenHidden=" + this.cardColorWhenHidden + ")";
        }

        public Regular(Card card, CardAsset.Tint tint, String countText, Context eventContext, Color cardColorOnTop, Color cardColorWhenHidden) {
            Intrinsics.checkNotNullParameter(card, "card");
            Intrinsics.checkNotNullParameter(tint, "tint");
            Intrinsics.checkNotNullParameter(countText, "countText");
            Intrinsics.checkNotNullParameter(eventContext, "eventContext");
            Intrinsics.checkNotNullParameter(cardColorOnTop, "cardColorOnTop");
            Intrinsics.checkNotNullParameter(cardColorWhenHidden, "cardColorWhenHidden");
            this.card = card;
            this.tint = tint;
            this.countText = countText;
            this.eventContext = eventContext;
            this.cardColorOnTop = cardColorOnTop;
            this.cardColorWhenHidden = cardColorWhenHidden;
        }

        @Override // com.robinhood.shared.cards.compose.NotificationCardComposable4, com.robinhood.shared.cards.compose.SwipeableStackState.CardInStack
        public String getId() {
            return DefaultImpls.getId(this);
        }

        @Override // com.robinhood.shared.cards.compose.NotificationCardComposable4, com.robinhood.shared.cards.compose.SwipeableStackState.CardInStack
        public boolean isFixed() {
            return DefaultImpls.isFixed(this);
        }

        public final Card getCard() {
            return this.card;
        }

        public final CardAsset.Tint getTint() {
            return this.tint;
        }

        public final String getCountText() {
            return this.countText;
        }

        public final Context getEventContext() {
            return this.eventContext;
        }

        public final Color getCardColorOnTop() {
            return this.cardColorOnTop;
        }

        public final Color getCardColorWhenHidden() {
            return this.cardColorWhenHidden;
        }
    }

    /* compiled from: NotificationCardComposable.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/cards/compose/NotificationCardState$End;", "Lcom/robinhood/shared/cards/compose/NotificationCardState;", "useCosmonautColor", "", "<init>", "(Z)V", "getUseCosmonautColor", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "lib-cards-compose_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.cards.compose.NotificationCardState$End, reason: from toString */
    public static final /* data */ class End implements NotificationCardComposable4 {
        public static final int $stable = 0;
        private final boolean useCosmonautColor;

        public End() {
            this(false, 1, null);
        }

        public static /* synthetic */ End copy$default(End end, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = end.useCosmonautColor;
            }
            return end.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getUseCosmonautColor() {
            return this.useCosmonautColor;
        }

        public final End copy(boolean useCosmonautColor) {
            return new End(useCosmonautColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof End) && this.useCosmonautColor == ((End) other).useCosmonautColor;
        }

        public int hashCode() {
            return Boolean.hashCode(this.useCosmonautColor);
        }

        public String toString() {
            return "End(useCosmonautColor=" + this.useCosmonautColor + ")";
        }

        public End(boolean z) {
            this.useCosmonautColor = z;
        }

        public /* synthetic */ End(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }

        @Override // com.robinhood.shared.cards.compose.NotificationCardComposable4, com.robinhood.shared.cards.compose.SwipeableStackState.CardInStack
        public String getId() {
            return DefaultImpls.getId(this);
        }

        @Override // com.robinhood.shared.cards.compose.NotificationCardComposable4, com.robinhood.shared.cards.compose.SwipeableStackState.CardInStack
        public boolean isFixed() {
            return DefaultImpls.isFixed(this);
        }

        public final boolean getUseCosmonautColor() {
            return this.useCosmonautColor;
        }
    }
}
