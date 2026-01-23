package com.robinhood.shared.cards;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.robinhood.models.card.p311db.Card;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: NotificationCard.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0002'(J\u0015\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u0019H&¢\u0006\u0002\u0010\u001aJ\u001d\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00028\u0000H&¢\u0006\u0002\u0010 J\b\u0010!\u001a\u00020\u001cH&J\u0010\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020$H&J\u0010\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u0005H&R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0006R\u0012\u0010\b\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0012\u0010\t\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0006R\u0012\u0010\n\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0012\u0010\u000b\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0006R\u0012\u0010\f\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006R\u0012\u0010\r\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0006R\u0012\u0010\u000e\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006R\u0012\u0010\u000f\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0006R\u0012\u0010\u0011\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0006R\u0012\u0010\u0013\u001a\u00020\u0014X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006)"}, m3636d2 = {"Lcom/robinhood/shared/cards/NotificationCard;", "T", "Landroid/view/View;", "", "isDismissable", "", "()Z", "isClaimableReward", "isClickable", "isCrypto", "isGold", "isGoldSplash", "isSpooky", "isRhdMargin", "isCreditCard", "shouldBounce", "getShouldBounce", "showDismissBtn", "getShowDismissBtn", "type", "", "getType", "()Ljava/lang/String;", "generateView", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)Landroid/view/View;", "bind", "", "callbacks", "Lcom/robinhood/shared/cards/NotificationCard$Callbacks;", "view", "(Lcom/robinhood/shared/cards/NotificationCard$Callbacks;Landroid/view/View;)V", "onImpression", "onClicked", "context", "Landroid/content/Context;", "onDismissed", "shouldLogEvent", "Stack", "Callbacks", "lib-cards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public interface NotificationCard<T extends View> {

    /* compiled from: NotificationCard.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/shared/cards/NotificationCard$Callbacks;", "", "onDismissSelf", "", "onDismissButtonTap", "notificationCard", "Lcom/robinhood/shared/cards/ServerCard;", "lib-cards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onDismissButtonTap(ServerCard notificationCard);

        void onDismissSelf();
    }

    void bind(Callbacks callbacks, T view);

    T generateView(ViewGroup parent);

    boolean getShouldBounce();

    boolean getShowDismissBtn();

    String getType();

    boolean isClaimableReward();

    boolean isClickable();

    boolean isCreditCard();

    boolean isCrypto();

    boolean isDismissable();

    boolean isGold();

    boolean isGoldSplash();

    boolean isRhdMargin();

    boolean isSpooky();

    void onClicked(Context context);

    void onDismissed(boolean shouldLogEvent);

    void onImpression();

    /* compiled from: NotificationCard.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0010\u0010\u0002\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\f\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0013\u0010\u0010\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u001b\u0010\u0002\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/shared/cards/NotificationCard$Stack;", "", "notificationCards", "", "Lcom/robinhood/shared/cards/NotificationCard;", "isFromLocal", "", "<init>", "(Ljava/util/List;Z)V", "getNotificationCards", "()Ljava/util/List;", "()Z", "equals", "other", "hashCode", "", "component1", "component2", "copy", "toString", "", "lib-cards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class Stack {
        public static final int $stable = 8;
        private final boolean isFromLocal;
        private final List<NotificationCard<?>> notificationCards;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Stack copy$default(Stack stack, List list, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                list = stack.notificationCards;
            }
            if ((i & 2) != 0) {
                z = stack.isFromLocal;
            }
            return stack.copy(list, z);
        }

        public final List<NotificationCard<?>> component1() {
            return this.notificationCards;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsFromLocal() {
            return this.isFromLocal;
        }

        public final Stack copy(List<? extends NotificationCard<?>> notificationCards, boolean isFromLocal) {
            Intrinsics.checkNotNullParameter(notificationCards, "notificationCards");
            return new Stack(notificationCards, isFromLocal);
        }

        public String toString() {
            return "Stack(notificationCards=" + this.notificationCards + ", isFromLocal=" + this.isFromLocal + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Stack(List<? extends NotificationCard<?>> notificationCards, boolean z) {
            Intrinsics.checkNotNullParameter(notificationCards, "notificationCards");
            this.notificationCards = notificationCards;
            this.isFromLocal = z;
        }

        public final List<NotificationCard<?>> getNotificationCards() {
            return this.notificationCards;
        }

        public final boolean isFromLocal() {
            return this.isFromLocal;
        }

        public boolean equals(Object other) {
            Card card;
            Card card2;
            if (this == other) {
                return true;
            }
            if (!Intrinsics.areEqual(Stack.class, other != null ? other.getClass() : null)) {
                return false;
            }
            Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.robinhood.shared.cards.NotificationCard.Stack");
            Stack stack = (Stack) other;
            if (this.notificationCards.size() != stack.notificationCards.size()) {
                return false;
            }
            int i = 0;
            for (Object obj : this.notificationCards) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                NotificationCard notificationCard = (NotificationCard) obj;
                NotificationCard<?> notificationCard2 = stack.notificationCards.get(i);
                ServerCard serverCard = notificationCard instanceof ServerCard ? (ServerCard) notificationCard : null;
                String cardId = (serverCard == null || (card2 = serverCard.getCard()) == null) ? null : card2.getCardId();
                ServerCard serverCard2 = notificationCard2 instanceof ServerCard ? (ServerCard) notificationCard2 : null;
                if (!Intrinsics.areEqual(cardId, (serverCard2 == null || (card = serverCard2.getCard()) == null) ? null : card.getCardId()) || notificationCard.isDismissable() != notificationCard2.isDismissable() || notificationCard.isClaimableReward() != notificationCard2.isClaimableReward() || notificationCard.isClickable() != notificationCard2.isClickable() || notificationCard.isCrypto() != notificationCard2.isCrypto() || notificationCard.isGold() != notificationCard2.isGold() || notificationCard.isGoldSplash() != notificationCard2.isGoldSplash() || notificationCard.isSpooky() != notificationCard2.isSpooky() || notificationCard.isRhdMargin() != notificationCard2.isRhdMargin() || notificationCard.isCreditCard() != notificationCard2.isCreditCard() || notificationCard.getShouldBounce() != notificationCard2.getShouldBounce() || notificationCard.getShowDismissBtn() != notificationCard2.getShowDismissBtn() || !Intrinsics.areEqual(notificationCard.getType(), notificationCard2.getType())) {
                    return false;
                }
                i = i2;
            }
            return true;
        }

        public int hashCode() {
            return (this.notificationCards.hashCode() * 31) + Boolean.hashCode(this.isFromLocal);
        }
    }
}
