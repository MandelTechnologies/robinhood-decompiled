package com.robinhood.shared.cards.p371v3;

import androidx.compose.p011ui.unit.C2002Dp;
import com.robinhood.compose.bento.theme.BentoTheme4;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.card.p311db.CardAsset;
import com.robinhood.models.serverdriven.experimental.api.Color;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.cards.NotificationCard;
import com.robinhood.shared.cards.ServerCard;
import com.robinhood.shared.cards.compose.NotificationCardComposable4;
import com.robinhood.shared.cards.compose.SwipeableStackState;
import com.robinhood.shared.cards.compose.utils.Cards;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableSet;
import kotlinx.collections.immutable.extensions2;

/* compiled from: CardStackDuxo.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010 \u001a\u00020\u0003HÂ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÂ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0007HÂ\u0003¢\u0006\u0002\u0010#J\u0010\u0010$\u001a\u0004\u0018\u00010\tHÀ\u0003¢\u0006\u0002\b%J\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÀ\u0003¢\u0006\u0002\b'JL\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001¢\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00020\u00072\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020/HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u00158AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u00060"}, m3636d2 = {"Lcom/robinhood/shared/cards/v3/CardStackDataState;", "", "appType", "Lcom/robinhood/shared/app/type/AppType;", "direction", "Lcom/robinhood/compose/bento/theme/Direction;", "isDay", "", "cards", "Lcom/robinhood/shared/cards/NotificationCard$Stack;", "dismissedCards", "Lkotlinx/collections/immutable/ImmutableSet;", "Lcom/robinhood/shared/cards/compose/NotificationCardState;", "<init>", "(Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/compose/bento/theme/Direction;Ljava/lang/Boolean;Lcom/robinhood/shared/cards/NotificationCard$Stack;Lkotlinx/collections/immutable/ImmutableSet;)V", "Ljava/lang/Boolean;", "getCards$lib_cards_externalDebug", "()Lcom/robinhood/shared/cards/NotificationCard$Stack;", "getDismissedCards$lib_cards_externalDebug", "()Lkotlinx/collections/immutable/ImmutableSet;", "notificationCardsStates", "Lkotlinx/collections/immutable/ImmutableList;", "getNotificationCardsStates$lib_cards_externalDebug", "()Lkotlinx/collections/immutable/ImmutableList;", "swipeableStackState", "Lcom/robinhood/shared/cards/compose/SwipeableStackState;", "getSwipeableStackState", "()Lcom/robinhood/shared/cards/compose/SwipeableStackState;", "contentStartSpacingWithSideImage", "Landroidx/compose/ui/unit/Dp;", "getContentStartSpacingWithSideImage-D9Ej5fM", "()F", "component1", "component2", "component3", "()Ljava/lang/Boolean;", "component4", "component4$lib_cards_externalDebug", "component5", "component5$lib_cards_externalDebug", "copy", "(Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/compose/bento/theme/Direction;Ljava/lang/Boolean;Lcom/robinhood/shared/cards/NotificationCard$Stack;Lkotlinx/collections/immutable/ImmutableSet;)Lcom/robinhood/shared/cards/v3/CardStackDataState;", "equals", "other", "hashCode", "", "toString", "", "lib-cards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes26.dex */
public final /* data */ class CardStackDataState {
    public static final int $stable = 8;
    private final AppType appType;
    private final NotificationCard.Stack cards;
    private final BentoTheme4 direction;
    private final ImmutableSet<NotificationCardComposable4> dismissedCards;
    private final Boolean isDay;

    /* compiled from: CardStackDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BentoTheme4.values().length];
            try {
                iArr[BentoTheme4.POSITIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BentoTheme4.NEGATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: component1, reason: from getter */
    private final AppType getAppType() {
        return this.appType;
    }

    /* renamed from: component2, reason: from getter */
    private final BentoTheme4 getDirection() {
        return this.direction;
    }

    /* renamed from: component3, reason: from getter */
    private final Boolean getIsDay() {
        return this.isDay;
    }

    public static /* synthetic */ CardStackDataState copy$default(CardStackDataState cardStackDataState, AppType appType, BentoTheme4 bentoTheme4, Boolean bool, NotificationCard.Stack stack, ImmutableSet immutableSet, int i, Object obj) {
        if ((i & 1) != 0) {
            appType = cardStackDataState.appType;
        }
        if ((i & 2) != 0) {
            bentoTheme4 = cardStackDataState.direction;
        }
        if ((i & 4) != 0) {
            bool = cardStackDataState.isDay;
        }
        if ((i & 8) != 0) {
            stack = cardStackDataState.cards;
        }
        if ((i & 16) != 0) {
            immutableSet = cardStackDataState.dismissedCards;
        }
        ImmutableSet immutableSet2 = immutableSet;
        Boolean bool2 = bool;
        return cardStackDataState.copy(appType, bentoTheme4, bool2, stack, immutableSet2);
    }

    /* renamed from: component4$lib_cards_externalDebug, reason: from getter */
    public final NotificationCard.Stack getCards() {
        return this.cards;
    }

    public final ImmutableSet<NotificationCardComposable4> component5$lib_cards_externalDebug() {
        return this.dismissedCards;
    }

    public final CardStackDataState copy(AppType appType, BentoTheme4 direction, Boolean isDay, NotificationCard.Stack cards, ImmutableSet<? extends NotificationCardComposable4> dismissedCards) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(dismissedCards, "dismissedCards");
        return new CardStackDataState(appType, direction, isDay, cards, dismissedCards);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardStackDataState)) {
            return false;
        }
        CardStackDataState cardStackDataState = (CardStackDataState) other;
        return this.appType == cardStackDataState.appType && this.direction == cardStackDataState.direction && Intrinsics.areEqual(this.isDay, cardStackDataState.isDay) && Intrinsics.areEqual(this.cards, cardStackDataState.cards) && Intrinsics.areEqual(this.dismissedCards, cardStackDataState.dismissedCards);
    }

    public int hashCode() {
        int iHashCode = this.appType.hashCode() * 31;
        BentoTheme4 bentoTheme4 = this.direction;
        int iHashCode2 = (iHashCode + (bentoTheme4 == null ? 0 : bentoTheme4.hashCode())) * 31;
        Boolean bool = this.isDay;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        NotificationCard.Stack stack = this.cards;
        return ((iHashCode3 + (stack != null ? stack.hashCode() : 0)) * 31) + this.dismissedCards.hashCode();
    }

    public String toString() {
        return "CardStackDataState(appType=" + this.appType + ", direction=" + this.direction + ", isDay=" + this.isDay + ", cards=" + this.cards + ", dismissedCards=" + this.dismissedCards + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CardStackDataState(AppType appType, BentoTheme4 bentoTheme4, Boolean bool, NotificationCard.Stack stack, ImmutableSet<? extends NotificationCardComposable4> dismissedCards) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(dismissedCards, "dismissedCards");
        this.appType = appType;
        this.direction = bentoTheme4;
        this.isDay = bool;
        this.cards = stack;
        this.dismissedCards = dismissedCards;
    }

    public final NotificationCard.Stack getCards$lib_cards_externalDebug() {
        return this.cards;
    }

    public /* synthetic */ CardStackDataState(AppType appType, BentoTheme4 bentoTheme4, Boolean bool, NotificationCard.Stack stack, ImmutableSet immutableSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(appType, (i & 2) != 0 ? null : bentoTheme4, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : stack, (i & 16) != 0 ? extensions2.persistentSetOf() : immutableSet);
    }

    public final ImmutableSet<NotificationCardComposable4> getDismissedCards$lib_cards_externalDebug() {
        return this.dismissedCards;
    }

    public final ImmutableList<NotificationCardComposable4> getNotificationCardsStates$lib_cards_externalDebug() {
        List<NotificationCard<?>> notificationCards;
        CardAsset.Tint tint;
        Color color;
        NotificationCard.Stack stack = this.cards;
        if (stack != null && (notificationCards = stack.getNotificationCards()) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : notificationCards) {
                if (obj instanceof ServerCard) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            if (arrayList != null) {
                int size = arrayList.size();
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                Iterator it = arrayList.iterator();
                int i = 0;
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        int i2 = i + 1;
                        if (i < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        ServerCard serverCard = (ServerCard) next;
                        Card card = serverCard.getCard();
                        BentoTheme4 bentoTheme4 = this.direction;
                        int i3 = bentoTheme4 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[bentoTheme4.ordinal()];
                        if (i3 == -1 || i3 == 1) {
                            tint = CardAsset.Tint.GREEN;
                        } else {
                            if (i3 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            tint = CardAsset.Tint.RED;
                        }
                        CardAsset.Tint tint2 = tint;
                        String str = i2 + "/" + size;
                        Boolean bool = this.isDay;
                        if (bool == null || Intrinsics.areEqual(bool, Boolean.TRUE)) {
                            color = Color.f5843BG;
                        } else {
                            if (!Intrinsics.areEqual(bool, Boolean.FALSE)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            color = Color.BG2;
                        }
                        arrayList2.add(new NotificationCardComposable4.Regular(card, tint2, str, new Context(i2, size, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Cards.getNotificationContext(serverCard.getCard()), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4, -1, -1, -8193, -1, -1, 16383, null), color, Color.f5843BG));
                        i = i2;
                    } else {
                        ImmutableList<NotificationCardComposable4> immutableList = extensions2.toImmutableList(CollectionsKt.asReversed(CollectionsKt.plus((Collection<? extends NotificationCardComposable4.End>) arrayList2, new NotificationCardComposable4.End(this.appType == AppType.RHC))));
                        if (immutableList != null) {
                            return immutableList;
                        }
                    }
                }
            }
        }
        return extensions2.persistentListOf();
    }

    public final SwipeableStackState<NotificationCardComposable4> getSwipeableStackState() {
        return new SwipeableStackState<>(getNotificationCardsStates$lib_cards_externalDebug(), this.cards == null && this.direction == null && this.isDay == null, 2, 0.5f, C2002Dp.m7995constructorimpl(8), 0.03f, this.dismissedCards, null);
    }

    /* renamed from: getContentStartSpacingWithSideImage-D9Ej5fM, reason: not valid java name */
    public final float m24788getContentStartSpacingWithSideImageD9Ej5fM() {
        return C2002Dp.m7995constructorimpl(this.appType == AppType.RHC ? 0 : 12);
    }
}
