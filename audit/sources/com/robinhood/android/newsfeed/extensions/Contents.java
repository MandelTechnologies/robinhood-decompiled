package com.robinhood.android.newsfeed.extensions;

import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.newsfeed.model.Content;
import com.robinhood.android.newsfeed.model.RelatedInstrument;
import com.robinhood.rosetta.eventlogging.Asset;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.List;
import com.robinhood.rosetta.eventlogging.NewsFeedItem;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Contents.kt */
@Metadata(m3635d1 = {"\u0000\u0080\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010;\u001a\u00020<*\u00020\u00032\n\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002\"\u0019\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u0015\u0010\u0006\u001a\u00020\u0007*\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\n\"\u0015\u0010\u0006\u001a\u00020\u0007*\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\f\"\u0015\u0010\r\u001a\u00020\u000e*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\"\u0019\u0010\u0011\u001a\u00060\u0012j\u0002`\u0013*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\"\u0017\u0010\u0016\u001a\u0004\u0018\u00010\u0017*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\"\u0017\u0010\u001a\u001a\u0004\u0018\u00010\u0017*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019\"\u0015\u0010\u001c\u001a\u00020\u001d*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\"\u0017\u0010 \u001a\u0004\u0018\u00010!*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\"\u0010#\"\u0017\u0010$\u001a\u0004\u0018\u00010%*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b&\u0010'\"\u0015\u0010(\u001a\u00020)*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b*\u0010+\"\u0015\u0010,\u001a\u00020-*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b.\u0010/\"\u0015\u00100\u001a\u000201*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b2\u00103\"\u0015\u00104\u001a\u00020-*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b5\u0010/\"\u0015\u00106\u001a\u000207*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b8\u00109\"\u0015\u0010 \u001a\u00020!*\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\"\u0010:¨\u0006="}, m3636d2 = {"action", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "Lcom/robinhood/rosetta/eventlogging/EventAction;", "Lcom/robinhood/android/newsfeed/model/Content;", "getAction", "(Lcom/robinhood/android/newsfeed/model/Content;)Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "hasImage", "", "Lcom/robinhood/android/newsfeed/model/Content$Article;", "getHasImage", "(Lcom/robinhood/android/newsfeed/model/Content$Article;)Z", "Lcom/robinhood/android/newsfeed/model/Content$EmbeddedArticle;", "(Lcom/robinhood/android/newsfeed/model/Content$EmbeddedArticle;)Z", "source", "", "getSource", "(Lcom/robinhood/android/newsfeed/model/Content;)Ljava/lang/String;", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "getEventContext", "(Lcom/robinhood/android/newsfeed/model/Content;)Lcom/robinhood/rosetta/eventlogging/Context;", "firstInstrument", "Lcom/robinhood/android/newsfeed/model/RelatedInstrument;", "getFirstInstrument", "(Lcom/robinhood/android/newsfeed/model/Content;)Lcom/robinhood/android/newsfeed/model/RelatedInstrument;", "secondInstrument", "getSecondInstrument", "newsFeedItem", "Lcom/robinhood/rosetta/eventlogging/NewsFeedItem;", "getNewsFeedItem", "(Lcom/robinhood/android/newsfeed/model/Content;)Lcom/robinhood/rosetta/eventlogging/NewsFeedItem;", "asset", "Lcom/robinhood/rosetta/eventlogging/Asset;", "getAsset", "(Lcom/robinhood/android/newsfeed/model/Content;)Lcom/robinhood/rosetta/eventlogging/Asset;", "list", "Lcom/robinhood/rosetta/eventlogging/List;", "getList", "(Lcom/robinhood/android/newsfeed/model/Content;)Lcom/robinhood/rosetta/eventlogging/List;", "contentType", "Lcom/robinhood/rosetta/eventlogging/NewsFeedItem$ContentType;", "getContentType", "(Lcom/robinhood/android/newsfeed/model/Content;)Lcom/robinhood/rosetta/eventlogging/NewsFeedItem$ContentType;", "carouselItemCount", "", "getCarouselItemCount", "(Lcom/robinhood/android/newsfeed/model/Content;)I", "mediaType", "Lcom/robinhood/rosetta/eventlogging/NewsFeedItem$MediaType;", "getMediaType", "(Lcom/robinhood/android/newsfeed/model/Content;)Lcom/robinhood/rosetta/eventlogging/NewsFeedItem$MediaType;", "itemPosition", "getItemPosition", "eventComponent", "Lcom/robinhood/rosetta/eventlogging/Component;", "getEventComponent", "(Lcom/robinhood/android/newsfeed/model/Content;)Lcom/robinhood/rosetta/eventlogging/Component;", "(Lcom/robinhood/android/newsfeed/model/RelatedInstrument;)Lcom/robinhood/rosetta/eventlogging/Asset;", "toEventData", "Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "feature-lib-newsfeed_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.newsfeed.extensions.ContentsKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class Contents {
    public static final UserInteractionEventData.Action getAction(Content content) {
        Intrinsics.checkNotNullParameter(content, "<this>");
        if (content instanceof Content.Video) {
            return UserInteractionEventData.Action.VIEW_BROWSE_NEWSFEED_THEATRE;
        }
        if (content instanceof Content.Instrument) {
            return UserInteractionEventData.Action.VIEW_STOCK_DETAIL_PAGE;
        }
        if ((content instanceof Content.Article) || (content instanceof Content.EmbeddedArticle)) {
            return UserInteractionEventData.Action.VIEW_NEWS_ARTICLE;
        }
        if (content instanceof Content.ListPreview) {
            return UserInteractionEventData.Action.ACTION_UNSPECIFIED;
        }
        if (content instanceof Content.EducationSeries) {
            return UserInteractionEventData.Action.VIEW_LEARNING_LESSON;
        }
        if (!(content instanceof Content.MarketUpdates) && !(content instanceof Content.MarketIndicator)) {
            throw new NoWhenBranchMatchedException();
        }
        return UserInteractionEventData.Action.ACTION_UNSPECIFIED;
    }

    public static final boolean getHasImage(Content.Article article) {
        Intrinsics.checkNotNullParameter(article, "<this>");
        return article.getPreviewImageUrl() != null;
    }

    public static final boolean getHasImage(Content.EmbeddedArticle embeddedArticle) {
        Intrinsics.checkNotNullParameter(embeddedArticle, "<this>");
        return embeddedArticle.getPreviewImageUrl() != null;
    }

    public static final String getSource(Content content) {
        Intrinsics.checkNotNullParameter(content, "<this>");
        if (content instanceof Content.Article) {
            return ((Content.Article) content).getSource();
        }
        if (content instanceof Content.EmbeddedArticle) {
            return ((Content.EmbeddedArticle) content).getSource();
        }
        if (content instanceof Content.Video) {
            return ((Content.Video) content).getSource();
        }
        if (!(content instanceof Content.Instrument) && !(content instanceof Content.ListPreview) && !(content instanceof Content.MarketUpdates) && !(content instanceof Content.EducationSeries) && !(content instanceof Content.MarketIndicator)) {
            throw new NoWhenBranchMatchedException();
        }
        return "";
    }

    public static final Context getEventContext(Content content) {
        Intrinsics.checkNotNullParameter(content, "<this>");
        NewsFeedItem newsFeedItem = getNewsFeedItem(content);
        return new Context(getItemPosition(content), 0, 0, null, null, null, null, null, 0, null, null, null, null, null, getAsset(content), getList(content), newsFeedItem, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -114690, -1, -1, -1, -1, -1, 16383, null);
    }

    public static final RelatedInstrument getFirstInstrument(Content content) {
        Intrinsics.checkNotNullParameter(content, "<this>");
        if (content instanceof Content.Article) {
            return ((Content.Article) content).getFirstInstrument();
        }
        if (content instanceof Content.EmbeddedArticle) {
            return ((Content.EmbeddedArticle) content).getFirstInstrument();
        }
        if (content instanceof Content.Video) {
            return ((Content.Video) content).getFirstInstrument();
        }
        if ((content instanceof Content.Instrument) || (content instanceof Content.ListPreview) || (content instanceof Content.EducationSeries) || (content instanceof Content.MarketUpdates) || (content instanceof Content.MarketIndicator)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final RelatedInstrument getSecondInstrument(Content content) {
        Intrinsics.checkNotNullParameter(content, "<this>");
        if (content instanceof Content.Article) {
            return ((Content.Article) content).getSecondInstrument();
        }
        if (content instanceof Content.EmbeddedArticle) {
            return ((Content.EmbeddedArticle) content).getSecondInstrument();
        }
        if (content instanceof Content.Video) {
            return ((Content.Video) content).getSecondInstrument();
        }
        if ((content instanceof Content.Instrument) || (content instanceof Content.ListPreview) || (content instanceof Content.EducationSeries) || (content instanceof Content.MarketUpdates) || (content instanceof Content.MarketIndicator)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final NewsFeedItem getNewsFeedItem(Content content) {
        String string2;
        Intrinsics.checkNotNullParameter(content, "<this>");
        if ((content instanceof Content.Instrument) || (content instanceof Content.ListPreview)) {
            string2 = "";
        } else {
            string2 = content.getId().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        }
        return new NewsFeedItem(string2, getContentType(content), getMediaType(content), getSource(content), getCarouselItemCount(content), null, 32, null);
    }

    public static final Asset getAsset(Content content) {
        Intrinsics.checkNotNullParameter(content, "<this>");
        if (!(content instanceof Content.Instrument)) {
            return null;
        }
        String string2 = ((Content.Instrument) content).getInstrumentId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return new Asset(string2, Asset.AssetType.INSTRUMENT, null, null, 12, null);
    }

    public static final List getList(Content content) {
        Intrinsics.checkNotNullParameter(content, "<this>");
        if (!(content instanceof Content.ListPreview)) {
            return null;
        }
        Content.ListPreview listPreview = (Content.ListPreview) content;
        String string2 = listPreview.getId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return new List(string2, listPreview.getDisplayName(), List.OwnerType.ROBINHOOD, null, 8, null);
    }

    public static final NewsFeedItem.ContentType getContentType(Content content) {
        Intrinsics.checkNotNullParameter(content, "<this>");
        if (content instanceof Content.Article) {
            return NewsFeedItem.ContentType.REGULAR_ARTICLE;
        }
        if (content instanceof Content.EmbeddedArticle) {
            return NewsFeedItem.ContentType.EMBEDDED_ARTICLE;
        }
        if (content instanceof Content.Video) {
            return NewsFeedItem.ContentType.VIDEO;
        }
        if (content instanceof Content.Instrument) {
            return NewsFeedItem.ContentType.CAROUSEL;
        }
        if (content instanceof Content.ListPreview) {
            return NewsFeedItem.ContentType.LIST_CHIP_GRID;
        }
        if (content instanceof Content.EducationSeries) {
            return NewsFeedItem.ContentType.LEARNING_ENTRY_POINT;
        }
        if (content instanceof Content.MarketUpdates) {
            return NewsFeedItem.ContentType.MARKET_UPDATES;
        }
        if (content instanceof Content.MarketIndicator) {
            return NewsFeedItem.ContentType.MARKET_INDICATOR;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int getCarouselItemCount(Content content) {
        Intrinsics.checkNotNullParameter(content, "<this>");
        if (content.isInCarousel() || (content instanceof Content.ListPreview)) {
            return content.getParentElement().getContentCount();
        }
        return 0;
    }

    public static final NewsFeedItem.MediaType getMediaType(Content content) {
        Intrinsics.checkNotNullParameter(content, "<this>");
        if (content instanceof Content.Article) {
            return getHasImage((Content.Article) content) ? NewsFeedItem.MediaType.MEDIA_TYPE_IMAGE : NewsFeedItem.MediaType.MEDIA_TYPE_NONE;
        }
        if (content instanceof Content.EmbeddedArticle) {
            return getHasImage((Content.EmbeddedArticle) content) ? NewsFeedItem.MediaType.MEDIA_TYPE_IMAGE : NewsFeedItem.MediaType.MEDIA_TYPE_NONE;
        }
        if (content instanceof Content.Video) {
            return NewsFeedItem.MediaType.MEDIA_TYPE_VIDEO;
        }
        if (!(content instanceof Content.Instrument) && !(content instanceof Content.ListPreview) && !(content instanceof Content.EducationSeries) && !(content instanceof Content.MarketUpdates) && !(content instanceof Content.MarketIndicator)) {
            throw new NoWhenBranchMatchedException();
        }
        return NewsFeedItem.MediaType.MEDIA_TYPE_NONE;
    }

    public static final int getItemPosition(Content content) {
        int rank;
        Intrinsics.checkNotNullParameter(content, "<this>");
        if ((content instanceof Content.Article) || (content instanceof Content.EmbeddedArticle)) {
            rank = content.isInCarousel() ? content.getRank() : content.getParentElement().getRank();
        } else if (content instanceof Content.Video) {
            rank = ((Content.Video) content).getParentElement().getRank();
        } else {
            if (!(content instanceof Content.Instrument) && !(content instanceof Content.ListPreview) && !(content instanceof Content.EducationSeries) && !(content instanceof Content.MarketUpdates) && !(content instanceof Content.MarketIndicator)) {
                throw new NoWhenBranchMatchedException();
            }
            rank = content.getRank();
        }
        return rank + 1;
    }

    public static final Component getEventComponent(Content content) {
        Component.ComponentType componentType;
        Intrinsics.checkNotNullParameter(content, "<this>");
        if (content instanceof Content.Article) {
            componentType = ((Content.Article) content).isHero() ? Component.ComponentType.HERO_NEWS_ROW : Component.ComponentType.NEWS_ROW;
        } else if (content instanceof Content.EmbeddedArticle) {
            componentType = ((Content.EmbeddedArticle) content).isHero() ? Component.ComponentType.HERO_NEWS_ROW : Component.ComponentType.NEWS_ROW;
        } else if (content instanceof Content.Video) {
            componentType = ((Content.Video) content).isHero() ? Component.ComponentType.HERO_VIDEO_ROW : Component.ComponentType.VIDEO_ROW;
        } else if (content instanceof Content.Instrument) {
            componentType = Component.ComponentType.ASSET_CARD;
        } else if (content instanceof Content.ListPreview) {
            componentType = Component.ComponentType.LIST_CHIP;
        } else if (content instanceof Content.EducationSeries) {
            componentType = Component.ComponentType.LEARNING_ENTRY_POINT;
        } else if (content instanceof Content.MarketUpdates) {
            componentType = Component.ComponentType.MARKET_UPDATES;
        } else {
            if (!(content instanceof Content.MarketIndicator)) {
                throw new NoWhenBranchMatchedException();
            }
            componentType = Component.ComponentType.COMPONENT_TYPE_UNSPECIFIED;
        }
        return new Component(componentType, content instanceof Content.ListPreview ? ((Content.ListPreview) content).getDisplayName() : "", null, 4, null);
    }

    public static final Asset getAsset(RelatedInstrument relatedInstrument) {
        Intrinsics.checkNotNullParameter(relatedInstrument, "<this>");
        String string2 = relatedInstrument.getId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return new Asset(string2, Asset.AssetType.INSTRUMENT, null, null, 12, null);
    }

    public static final UserInteractionEventDescriptor toEventData(Content content, UserInteractionEventData.Action action) {
        Intrinsics.checkNotNullParameter(content, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        return new UserInteractionEventDescriptor(null, null, action, getEventContext(content), getEventComponent(content), null, 35, null);
    }
}
