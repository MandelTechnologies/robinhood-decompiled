package com.robinhood.shared.iac.herocards.analytics;

import com.plaid.internal.EnumC7081g;
import com.robinhood.models.p320db.herocard.IacHeroCard;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.ComponentHierarchy;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.InAppComm;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HeroCardLogging.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a.\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u00022\n\u0010\u000e\u001a\u00060\u000fj\u0002`\u00102\u0006\u0010\u0011\u001a\u00020\u0001H\u0000\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0018\u0010\u0005\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004\"\u0018\u0010\u0007\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006\u0012"}, m3636d2 = {"loggingDismissBtn", "Lcom/robinhood/rosetta/eventlogging/Component;", "Lcom/robinhood/models/db/herocard/IacHeroCard;", "getLoggingDismissBtn", "(Lcom/robinhood/models/db/herocard/IacHeroCard;)Lcom/robinhood/rosetta/eventlogging/Component;", "loggingCard", "getLoggingCard", "loggingCtaBtn", "getLoggingCtaBtn", "heroCardEventData", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "card", "eventType", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$EventType;", "Lcom/robinhood/rosetta/eventlogging/EventType;", "component", "lib-iac-hero-cards_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.iac.herocards.analytics.HeroCardLoggingKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class HeroCardLogging {
    public static final Component getLoggingDismissBtn(IacHeroCard iacHeroCard) {
        Intrinsics.checkNotNullParameter(iacHeroCard, "<this>");
        String cardIdentifier = iacHeroCard.getCardIdentifier();
        if (cardIdentifier == null) {
            cardIdentifier = "";
        }
        return new Component(Component.ComponentType.CLOSE_BUTTON, cardIdentifier, null, 4, null);
    }

    public static final Component getLoggingCard(IacHeroCard iacHeroCard) {
        Intrinsics.checkNotNullParameter(iacHeroCard, "<this>");
        String cardIdentifier = iacHeroCard.getCardIdentifier();
        if (cardIdentifier == null) {
            cardIdentifier = "";
        }
        return new Component(Component.ComponentType.HERO_CARD, cardIdentifier, null, 4, null);
    }

    public static final Component getLoggingCtaBtn(IacHeroCard iacHeroCard) {
        Intrinsics.checkNotNullParameter(iacHeroCard, "<this>");
        String cardIdentifier = iacHeroCard.getCardIdentifier();
        if (cardIdentifier == null) {
            cardIdentifier = "";
        }
        return new Component(Component.ComponentType.BUTTON, cardIdentifier, null, 4, null);
    }

    public static final UserInteractionEventData heroCardEventData(Screen screen, IacHeroCard card, UserInteractionEventData.EventType eventType, Component component) {
        UserInteractionEventData.Action action;
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(component, "component");
        ComponentHierarchy componentHierarchy = Intrinsics.areEqual(component, getLoggingCard(card)) ? null : new ComponentHierarchy(getLoggingCard(card), null, null, null, null, 30, null);
        if (Intrinsics.areEqual(component, getLoggingDismissBtn(card))) {
            action = UserInteractionEventData.Action.DISMISS;
        } else {
            action = UserInteractionEventData.Action.ACTION_UNSPECIFIED;
        }
        UserInteractionEventData.Action action2 = action;
        String string2 = card.getReceiptUuid().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        String title = card.getTitle();
        if (title == null) {
            title = "";
        }
        return new UserInteractionEventData(eventType, screen, component, action2, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new InAppComm(string2, title, card.getDescription().getText(), card.getAssociatedInfo().getLocationStr(), null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -33554433, -1, -1, -1, -1, -1, 16383, null), componentHierarchy, null, 64, null);
    }
}
