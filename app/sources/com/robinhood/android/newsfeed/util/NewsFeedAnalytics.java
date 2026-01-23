package com.robinhood.android.newsfeed.util;

import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.newsfeed.extensions.Contents;
import com.robinhood.android.newsfeed.model.Content;
import com.robinhood.android.newsfeed.model.Element;
import com.robinhood.android.newsfeed.model.RelatedInstrument;
import com.robinhood.models.newsfeed.extensions.NewsFeedEmbeddedContents;
import com.robinhood.models.newsfeed.p334db.NewsFeedEmbeddedContent;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.ComponentHierarchy;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NewsFeedAnalytics.kt */
@Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u001e\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0016\u001a\u00020\rJ\u0006\u0010\u0017\u001a\u00020\rJ\u0012\u0010\u0018\u001a\u00020\r2\n\u0010\u0019\u001a\u00060\u001aj\u0002`\u001bJ\u001e\u0010\u001c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0010\u001a\u00020\u0011J\u0018\u0010\u001f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010 2\u0006\u0010\u001d\u001a\u00020\u001eJ\u0018\u0010!\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010 2\u0006\u0010\"\u001a\u00020\u0005J\u0018\u0010#\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010 2\u0006\u0010\u001d\u001a\u00020\u001eJ\u0010\u0010$\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010 J\u000e\u0010%\u001a\u00020\r2\u0006\u0010&\u001a\u00020'J\u000e\u0010(\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010)\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010*\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020+J\u000e\u0010,\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020+J\r\u0010-\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010.J\u0016\u0010/\u001a\u00020\r2\u0006\u0010\u000e\u001a\u0002002\u0006\u00101\u001a\u00020\u0011J\u0016\u00102\u001a\u00020\r2\u0006\u0010\u000e\u001a\u0002002\u0006\u00101\u001a\u00020\u0011J\u001a\u00103\u001a\u00020\r2\u0006\u0010\u000e\u001a\u0002002\n\u0010\u0019\u001a\u00060\u001aj\u0002`\u001bJ\u001e\u00104\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\f\b\u0002\u0010\u0019\u001a\u00060\u001aj\u0002`\u001bH\u0002J\u001e\u00105\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\f\b\u0002\u0010\u0019\u001a\u00060\u001aj\u0002`\u001bH\u0002J \u00106\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u000e\u00107\u001a\u00020\r2\u0006\u00108\u001a\u00020\u0011J\u000e\u00109\u001a\u00020\r2\u0006\u00108\u001a\u00020\u0011J\u000e\u0010:\u001a\u00020\r2\u0006\u0010;\u001a\u00020\u0005J\u000e\u0010<\u001a\u00020\r2\u0006\u0010;\u001a\u00020\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006="}, m3636d2 = {"Lcom/robinhood/android/newsfeed/util/NewsFeedAnalytics;", "", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "analyticsPrefix", "", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "eventLogScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "<init>", "(Lcom/robinhood/analytics/AnalyticsLogger;Ljava/lang/String;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/rosetta/eventlogging/Screen;)V", "logContentAppear", "", "content", "Lcom/robinhood/android/newsfeed/model/Content;", "inCarousel", "", "logContentDisappear", "durationVisible", "", "logContentClick", "logRetryAppear", "logRetryClick", "logNetworkAction", "action", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "Lcom/robinhood/rosetta/eventlogging/EventAction;", "logContentRelatedInstrumentClick", "instrument", "Lcom/robinhood/android/newsfeed/model/RelatedInstrument;", "logEmbeddedArticleInstrumentAppear", "Lcom/robinhood/models/newsfeed/db/NewsFeedEmbeddedContent;", "logEmbeddedArticleLinkClick", "url", "logEmbeddedArticleInstrumentClick", "logEmbeddedArticleScroll", "logListPreviewElementAppear", "element", "Lcom/robinhood/android/newsfeed/model/Element$ListPreview;", "logCarouselContentAppear", "logCarouselContentClick", "logListPreviewContentAppear", "Lcom/robinhood/android/newsfeed/model/Content$ListPreview;", "logListPreviewContentClick", "logPageScroll", "()Lkotlin/Unit;", "logToggleVideoAudioClick", "Lcom/robinhood/android/newsfeed/model/Content$Video;", "enabled", "logToggleVideoAudioAppear", "logVideoControlButtonClick", "logEventLogContentAppear", "logEventLogContentClick", "logArticleRelatedInstrumentAppear", "logShowMoreClick", "isCrypto", "logShowMoreAppear", "logSearchBarAppear", "query", "logSearchBarTap", "feature-lib-newsfeed_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class NewsFeedAnalytics {
    public static final int $stable = 8;
    private final AnalyticsLogger analytics;
    private final String analyticsPrefix;
    private final Screen eventLogScreen;
    private final EventLogger eventLogger;

    public NewsFeedAnalytics(AnalyticsLogger analytics, String analyticsPrefix, EventLogger eventLogger, Screen screen) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(analyticsPrefix, "analyticsPrefix");
        this.analytics = analytics;
        this.analyticsPrefix = analyticsPrefix;
        this.eventLogger = eventLogger;
        this.eventLogScreen = screen;
    }

    public /* synthetic */ NewsFeedAnalytics(AnalyticsLogger analyticsLogger, String str, EventLogger eventLogger, Screen screen, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(analyticsLogger, str, (i & 4) != 0 ? null : eventLogger, (i & 8) != 0 ? null : screen);
    }

    public final void logContentAppear(Content content, boolean inCarousel) {
        Intrinsics.checkNotNullParameter(content, "content");
        Integer numValueOf = inCarousel ? Integer.valueOf(content.getRank()) : null;
        String category = inCarousel ? content.getParentElement().getCategory() : null;
        this.analytics.logNewsFeedContentAppear(this.analyticsPrefix + AnalyticsStrings.NEWS_FEED_SNIPPET, content.getAnalyticsContentType(), content.getParentElement().getTemplate(), content.getAnalyticsId(), content.getParentElement().getRank(), category, numValueOf);
        RelatedInstrument firstInstrument = Contents.getFirstInstrument(content);
        if (firstInstrument != null) {
            logArticleRelatedInstrumentAppear(content, firstInstrument, inCarousel);
        }
        RelatedInstrument secondInstrument = Contents.getSecondInstrument(content);
        if (secondInstrument != null) {
            logArticleRelatedInstrumentAppear(content, secondInstrument, inCarousel);
        }
    }

    public final void logContentDisappear(Content content, long durationVisible, boolean inCarousel) {
        Intrinsics.checkNotNullParameter(content, "content");
        Integer numValueOf = inCarousel ? Integer.valueOf(content.getRank()) : null;
        String category = inCarousel ? content.getParentElement().getCategory() : null;
        this.analytics.logNewsFeedContentDisappear(this.analyticsPrefix + AnalyticsStrings.NEWS_FEED_SNIPPET, content.getAnalyticsContentType(), content.getParentElement().getTemplate(), content.getAnalyticsId(), content.getParentElement().getRank(), (int) durationVisible, category, numValueOf);
    }

    public final void logContentClick(Content content, boolean inCarousel) {
        Intrinsics.checkNotNullParameter(content, "content");
        Integer numValueOf = inCarousel ? Integer.valueOf(content.getRank()) : null;
        String category = inCarousel ? content.getParentElement().getCategory() : null;
        this.analytics.logNewsFeedContentClick(this.analyticsPrefix + AnalyticsStrings.NEWS_FEED_ARTICLE, content.getAnalyticsContentType(), content.getParentElement().getTemplate(), content.getAnalyticsId(), content.getParentElement().getRank(), category, numValueOf);
    }

    public final void logRetryAppear() {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            EventLogger.DefaultImpls.logAppear$default(eventLogger, UserInteractionEventData.Action.RETRY, this.eventLogScreen, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, null, 24, null);
        }
    }

    public final void logRetryClick() {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.RETRY, this.eventLogScreen, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, null, false, 56, null);
        }
    }

    public final void logNetworkAction(UserInteractionEventData.Action action) {
        Intrinsics.checkNotNullParameter(action, "action");
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            eventLogger.logNetworkEvent(action, this.eventLogScreen);
        }
    }

    public final void logContentRelatedInstrumentClick(Content content, RelatedInstrument instrument, boolean inCarousel) {
        String str;
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        if (inCarousel) {
            str = AnalyticsStrings.BUTTON_GROUP_CAROUSEL_NEWS_SYMBOL_TICKER;
        } else {
            str = this.analyticsPrefix + AnalyticsStrings.BUTTON_GROUP_NEWS_FEED_SYMBOL_TICKER;
        }
        String str2 = str;
        AnalyticsLogger analyticsLogger = this.analytics;
        String string2 = content.getId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(analyticsLogger, str2, string2, instrument.getId().toString(), null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, null);
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.VIEW_STOCK_DETAIL_PAGE, this.eventLogScreen, new Component(Component.ComponentType.ASSET_TICKER_BUTTON, null, null, 6, null), new ComponentHierarchy(Contents.getEventComponent(content), null, null, null, null, 30, null), new Context(content.getParentElement().getRank(), 0, 0, null, null, null, null, null, 0, null, null, null, null, null, Contents.getAsset(instrument), null, Contents.getNewsFeedItem(content), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -81922, -1, -1, -1, -1, -1, 16383, null), false, 32, null);
        }
    }

    public final void logEmbeddedArticleInstrumentAppear(NewsFeedEmbeddedContent content, RelatedInstrument instrument) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            EventLogger.DefaultImpls.logAppear$default(eventLogger, UserInteractionEventData.Action.VIEW_STOCK_DETAIL_PAGE, this.eventLogScreen, new Component(Component.ComponentType.ASSET_TICKER_BUTTON, null, null, 6, null), null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, Contents.getAsset(instrument), null, content != null ? NewsFeedEmbeddedContents.getNewsFeedItem(content) : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -81921, -1, -1, -1, -1, -1, 16383, null), 8, null);
        }
    }

    public final void logEmbeddedArticleLinkClick(NewsFeedEmbeddedContent content, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.OPEN_URL, this.eventLogScreen, new Component(Component.ComponentType.LINK_BUTTON, null, null, 6, null), null, new Context(0, 0, 0, null, null, null, url, null, 0, null, null, null, null, null, null, null, content != null ? NewsFeedEmbeddedContents.getNewsFeedItem(content) : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -65601, -1, -1, -1, -1, -1, 16383, null), false, 40, null);
        }
    }

    public final void logEmbeddedArticleInstrumentClick(NewsFeedEmbeddedContent content, RelatedInstrument instrument) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.VIEW_STOCK_DETAIL_PAGE, this.eventLogScreen, new Component(Component.ComponentType.ASSET_TICKER_BUTTON, null, null, 6, null), null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, Contents.getAsset(instrument), null, content != null ? NewsFeedEmbeddedContents.getNewsFeedItem(content) : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -81921, -1, -1, -1, -1, -1, 16383, null), false, 40, null);
        }
    }

    public final void logEmbeddedArticleScroll(NewsFeedEmbeddedContent content) {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            EventLogger.DefaultImpls.logScroll$default(eventLogger, null, this.eventLogScreen, null, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, content != null ? NewsFeedEmbeddedContents.getNewsFeedItem(content) : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -65537, -1, -1, -1, -1, -1, 16383, null), 13, null);
        }
    }

    public final void logListPreviewElementAppear(Element.ListPreview element) {
        Intrinsics.checkNotNullParameter(element, "element");
        AnalyticsLogger analyticsLogger = this.analytics;
        String string2 = element.getId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        AnalyticsLogger.DefaultImpls.logButtonGroupAppear$default(analyticsLogger, AnalyticsStrings.BUTTON_LISTS_CHIP_GRID, string2, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
    }

    public final void logCarouselContentAppear(Content content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.analytics.logNewsFeedContentAppear(this.analyticsPrefix + AnalyticsStrings.NEWS_FEED_SNIPPET, content.getAnalyticsContentType(), content.getParentElement().getTemplate(), content.getAnalyticsId(), content.getParentElement().getRank(), content.getParentElement().getCategory(), Integer.valueOf(content.getRank()));
    }

    public final void logCarouselContentClick(Content content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.analytics.logNewsFeedContentClick(this.analyticsPrefix + AnalyticsStrings.NEWS_FEED_SNIPPET, content.getAnalyticsContentType(), content.getParentElement().getTemplate(), content.getAnalyticsId(), content.getParentElement().getRank(), content.getParentElement().getCategory(), Integer.valueOf(content.getRank()));
    }

    public final void logListPreviewContentAppear(Content.ListPreview content) {
        Intrinsics.checkNotNullParameter(content, "content");
        AnalyticsLogger analyticsLogger = this.analytics;
        String string2 = content.getId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        AnalyticsLogger.DefaultImpls.logButtonGroupAppear$default(analyticsLogger, AnalyticsStrings.BUTTON_GROUP_BROWSE_LIST, string2, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
    }

    public final void logListPreviewContentClick(Content.ListPreview content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.analytics.logNewsFeedContentClick(this.analyticsPrefix + AnalyticsStrings.NEWS_FEED_ARTICLE, content.getAnalyticsContentType(), content.getParentElement().getTemplate(), content.getAnalyticsId(), content.getParentElement().getRank(), content.getParentElement().getCategory(), Integer.valueOf(content.getRank()));
    }

    public final Unit logPageScroll() {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger == null) {
            return null;
        }
        EventLogger.DefaultImpls.logScroll$default(eventLogger, null, this.eventLogScreen, null, null, null, 29, null);
        return Unit.INSTANCE;
    }

    public final void logToggleVideoAudioClick(Content.Video content, boolean enabled) {
        Intrinsics.checkNotNullParameter(content, "content");
        logEventLogContentClick(content, enabled ? UserInteractionEventData.Action.UNMUTE : UserInteractionEventData.Action.MUTE);
    }

    public final void logToggleVideoAudioAppear(Content.Video content, boolean enabled) {
        Intrinsics.checkNotNullParameter(content, "content");
        logEventLogContentAppear(content, enabled ? UserInteractionEventData.Action.UNMUTE : UserInteractionEventData.Action.MUTE);
    }

    public final void logVideoControlButtonClick(Content.Video content, UserInteractionEventData.Action action) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(action, "action");
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            EventLogger.DefaultImpls.logTap$default(eventLogger, action, this.eventLogScreen, Contents.getEventComponent(content), null, Contents.getEventContext(content), false, 40, null);
        }
    }

    static /* synthetic */ void logEventLogContentAppear$default(NewsFeedAnalytics newsFeedAnalytics, Content content, UserInteractionEventData.Action action, int i, Object obj) {
        if ((i & 2) != 0) {
            action = Contents.getAction(content);
        }
        newsFeedAnalytics.logEventLogContentAppear(content, action);
    }

    private final void logEventLogContentAppear(Content content, UserInteractionEventData.Action action) {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            EventLogger.DefaultImpls.logAppear$default(eventLogger, action, this.eventLogScreen, Contents.getEventComponent(content), null, Contents.getEventContext(content), 8, null);
        }
    }

    static /* synthetic */ void logEventLogContentClick$default(NewsFeedAnalytics newsFeedAnalytics, Content content, UserInteractionEventData.Action action, int i, Object obj) {
        if ((i & 2) != 0) {
            action = Contents.getAction(content);
        }
        newsFeedAnalytics.logEventLogContentClick(content, action);
    }

    private final void logEventLogContentClick(Content content, UserInteractionEventData.Action action) {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            EventLogger.DefaultImpls.logTap$default(eventLogger, action, this.eventLogScreen, Contents.getEventComponent(content), null, Contents.getEventContext(content), false, 40, null);
        }
    }

    private final void logArticleRelatedInstrumentAppear(Content content, RelatedInstrument instrument, boolean inCarousel) {
        String str;
        if (inCarousel) {
            str = AnalyticsStrings.BUTTON_GROUP_CAROUSEL_NEWS_SYMBOL_TICKER;
        } else {
            str = this.analyticsPrefix + AnalyticsStrings.BUTTON_GROUP_NEWS_FEED_SYMBOL_TICKER;
        }
        String str2 = str;
        AnalyticsLogger analyticsLogger = this.analytics;
        String string2 = content.getId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        AnalyticsLogger.DefaultImpls.logButtonGroupAppear$default(analyticsLogger, str2, string2, instrument.getId().toString(), null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, null);
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            eventLogger.logAppear(UserInteractionEventData.Action.VIEW_STOCK_DETAIL_PAGE, this.eventLogScreen, new Component(Component.ComponentType.ASSET_TICKER_BUTTON, null, null, 6, null), new ComponentHierarchy(Contents.getEventComponent(content), null, null, null, null, 30, null), new Context(content.getParentElement().getRank(), 0, 0, null, null, null, null, null, 0, null, null, null, null, null, Contents.getAsset(instrument), null, Contents.getNewsFeedItem(content), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -81922, -1, -1, -1, -1, -1, 16383, null));
        }
    }

    public final void logShowMoreClick(boolean isCrypto) {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            EventLogger.DefaultImpls.logTap$default(eventLogger, isCrypto ? UserInteractionEventData.Action.VIEW_CRYPTO_NEWSFEED : UserInteractionEventData.Action.VIEW_STOCK_NEWSFEED, this.eventLogScreen, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, null, false, 56, null);
        }
    }

    public final void logShowMoreAppear(boolean isCrypto) {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            EventLogger.DefaultImpls.logAppear$default(eventLogger, isCrypto ? UserInteractionEventData.Action.VIEW_CRYPTO_NEWSFEED : UserInteractionEventData.Action.VIEW_STOCK_NEWSFEED, this.eventLogScreen, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, null, 24, null);
        }
    }

    public final void logSearchBarAppear(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            Screen screen = this.eventLogScreen;
            EventLogger.DefaultImpls.logAppear$default(eventLogger, UserInteractionEventData.Action.TYPE_SEARCH_QUERY, screen, new Component(Component.ComponentType.SEARCH_BAR, null, null, 6, null), null, new Context(0, 0, 0, null, null, query, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -33, -1, -1, -1, -1, -1, 16383, null), 8, null);
        }
    }

    public final void logSearchBarTap(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            Screen screen = this.eventLogScreen;
            EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.TYPE_SEARCH_QUERY, screen, new Component(Component.ComponentType.SEARCH_BAR, null, null, 6, null), null, new Context(0, 0, 0, null, null, query, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -33, -1, -1, -1, -1, -1, 16383, null), false, 40, null);
        }
    }
}
