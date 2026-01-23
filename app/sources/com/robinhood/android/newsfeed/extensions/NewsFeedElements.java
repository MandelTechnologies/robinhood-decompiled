package com.robinhood.android.newsfeed.extensions;

import com.robinhood.android.newsfeed.model.Content;
import com.robinhood.android.newsfeed.model.Element;
import com.robinhood.models.newsfeed.p334db.NewsFeedElementTemplate;
import com.robinhood.models.newsfeed.p334db.dao.NewsFeedElement;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.ComponentHierarchy;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.NewsFeedItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt;

/* compiled from: NewsFeedElements.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a¨\u0001\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b0\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00052\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00110\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00130\r2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0001\u001a\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0001\u001a\u0016\u0010%\u001a\u00060!j\u0002`\"*\u00020\u00022\u0006\u0010&\u001a\u00020\u0017\u001a\u0012\u0010'\u001a\u00020\u0013*\u00020\u00022\u0006\u0010(\u001a\u00020\u0017\"\u0017\u0010\u0018\u001a\u0004\u0018\u00010\u0019*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\"\u0015\u0010\u001c\u001a\u00020\u001d*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\"\u001d\u0010 \u001a\n\u0018\u00010!j\u0004\u0018\u0001`\"*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b#\u0010$\"\u0015\u0010)\u001a\u00020**\u00020\u00028F¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006-"}, m3636d2 = {"toElements", "", "Lcom/robinhood/android/newsfeed/model/Element;", "Lcom/robinhood/models/newsfeed/db/dao/NewsFeedElement;", "filteredContentIds", "", "Ljava/util/UUID;", "showVideoContent", "", "autoplayVideoAudioEnabled", "showPopularListsCarousel", "showCuratedListChipBadges", "curatedListChipBadgesSeen", "", "", "startedEducationLessonIds", "educationLessonsFirstShownTimestamps", "", "educationUserProgressMap", "", "rankOffset", "excludedTemplates", "toInstrumentNewsContent", "Lcom/robinhood/android/newsfeed/model/Content;", "newsFeedItem", "Lcom/robinhood/rosetta/eventlogging/NewsFeedItem;", "getNewsFeedItem", "(Lcom/robinhood/android/newsfeed/model/Element;)Lcom/robinhood/rosetta/eventlogging/NewsFeedItem;", "eventComponentHierarchy", "Lcom/robinhood/rosetta/eventlogging/ComponentHierarchy;", "getEventComponentHierarchy", "(Lcom/robinhood/android/newsfeed/model/Element;)Lcom/robinhood/rosetta/eventlogging/ComponentHierarchy;", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "getEventContext", "(Lcom/robinhood/android/newsfeed/model/Element;)Lcom/robinhood/rosetta/eventlogging/Context;", "getChildEventContext", "child", "getContentPosition", "content", "eventComponent", "Lcom/robinhood/rosetta/eventlogging/Component;", "getEventComponent", "(Lcom/robinhood/android/newsfeed/model/Element;)Lcom/robinhood/rosetta/eventlogging/Component;", "feature-lib-newsfeed_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.newsfeed.extensions.NewsFeedElementsKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class NewsFeedElements {
    public static /* synthetic */ List toElements$default(List list, Set set, boolean z, boolean z2, boolean z3, boolean z4, Map map, Set set2, Map map2, Map map3, int i, List list2, int i2, Object obj) {
        return toElements(list, set, z, z2, z3, z4, map, set2, map2, map3, (i2 & 512) != 0 ? 0 : i, (i2 & 1024) != 0 ? CollectionsKt.emptyList() : list2);
    }

    public static final List<Element> toElements(List<NewsFeedElement> list, Set<UUID> filteredContentIds, boolean z, boolean z2, boolean z3, boolean z4, Map<String, Boolean> curatedListChipBadgesSeen, Set<String> startedEducationLessonIds, Map<String, Long> educationLessonsFirstShownTimestamps, Map<String, Integer> educationUserProgressMap, int i, final List<String> excludedTemplates) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(filteredContentIds, "filteredContentIds");
        Intrinsics.checkNotNullParameter(curatedListChipBadgesSeen, "curatedListChipBadgesSeen");
        Intrinsics.checkNotNullParameter(startedEducationLessonIds, "startedEducationLessonIds");
        Intrinsics.checkNotNullParameter(educationLessonsFirstShownTimestamps, "educationLessonsFirstShownTimestamps");
        Intrinsics.checkNotNullParameter(educationUserProgressMap, "educationUserProgressMap");
        Intrinsics.checkNotNullParameter(excludedTemplates, "excludedTemplates");
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = i;
        final NewsFeedElements2 newsFeedElements2 = new NewsFeedElements2(filteredContentIds, z, z2, z3, z4, curatedListChipBadgesSeen, startedEducationLessonIds, educationLessonsFirstShownTimestamps, educationUserProgressMap);
        if (excludedTemplates.contains("*")) {
            return CollectionsKt.emptyList();
        }
        return SequencesKt.toList(SequencesKt.mapNotNull(CollectionsKt.asSequence(list), new Function1() { // from class: com.robinhood.android.newsfeed.extensions.NewsFeedElementsKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewsFeedElements.toElements$lambda$2(excludedTemplates, newsFeedElements2, intRef, (NewsFeedElement) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Element toElements$lambda$2(final List list, final NewsFeedElements2 newsFeedElements2, final Ref.IntRef intRef, final NewsFeedElement element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return (Element) SequencesKt.firstOrNull(SequencesKt.mapNotNull(SequencesKt.filter(CollectionsKt.asSequence(element.getTemplates()), new Function1() { // from class: com.robinhood.android.newsfeed.extensions.NewsFeedElementsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(NewsFeedElements.toElements$lambda$2$lambda$0(list, (NewsFeedElementTemplate) obj));
            }
        }), new Function1() { // from class: com.robinhood.android.newsfeed.extensions.NewsFeedElementsKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewsFeedElements.toElements$lambda$2$lambda$1(newsFeedElements2, element, intRef, (NewsFeedElementTemplate) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean toElements$lambda$2$lambda$0(List list, NewsFeedElementTemplate template) {
        Intrinsics.checkNotNullParameter(template, "template");
        return !list.contains(template.getServerValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Element toElements$lambda$2$lambda$1(NewsFeedElements2 newsFeedElements2, NewsFeedElement newsFeedElement, Ref.IntRef intRef, NewsFeedElementTemplate template) {
        Intrinsics.checkNotNullParameter(template, "template");
        Element elementTransform = newsFeedElements2.transform(template, newsFeedElement, intRef.element);
        if (elementTransform != null) {
            intRef.element++;
        }
        return elementTransform;
    }

    public static final List<Content> toInstrumentNewsContent(List<NewsFeedElement> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List elements$default = toElements$default(list, SetsKt.emptySet(), false, false, false, false, MapsKt.emptyMap(), SetsKt.emptySet(), MapsKt.emptyMap(), MapsKt.emptyMap(), 0, null, 1536, null);
        ArrayList arrayList = new ArrayList();
        for (Object obj : elements$default) {
            if (obj instanceof Element.Regular) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Element.Regular) it.next()).getContent());
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            Content content = (Content) obj2;
            if ((content instanceof Content.Article) || (content instanceof Content.EmbeddedArticle)) {
                arrayList3.add(obj2);
            }
        }
        return arrayList3;
    }

    public static final NewsFeedItem getNewsFeedItem(Element element) {
        Intrinsics.checkNotNullParameter(element, "<this>");
        if (element instanceof Element.Carousel) {
            return new NewsFeedItem(null, NewsFeedItem.ContentType.CAROUSEL, null, null, ((Element.Carousel) element).getContents().size(), null, 45, null);
        }
        if (element instanceof Element.ListPreview) {
            return new NewsFeedItem(null, NewsFeedItem.ContentType.LIST_CHIP_GRID, null, null, ((Element.ListPreview) element).getContents().size(), null, 45, null);
        }
        if ((element instanceof Element.Regular) || (element instanceof Element.RecommendationsCard) || (element instanceof Element.MarketUpdates) || (element instanceof Element.MarketIndicators)) {
            return null;
        }
        if (!(element instanceof Element.EducationCarousel)) {
            throw new NoWhenBranchMatchedException();
        }
        return new NewsFeedItem(null, NewsFeedItem.ContentType.LEARNING_ENTRY_POINT, null, null, 0, null, 61, null);
    }

    public static final ComponentHierarchy getEventComponentHierarchy(Element element) {
        Intrinsics.checkNotNullParameter(element, "<this>");
        return new ComponentHierarchy(getEventComponent(element), null, null, null, null, 30, null);
    }

    public static final Context getEventContext(Element element) {
        Intrinsics.checkNotNullParameter(element, "<this>");
        if (element instanceof Element.Carousel) {
            return new Context(((Element.Carousel) element).getRank() + 1, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, getNewsFeedItem(element), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -65538, -1, -1, -1, -1, -1, 16383, null);
        }
        if (element instanceof Element.ListPreview) {
            return new Context(((Element.ListPreview) element).getRank() + 1, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, getNewsFeedItem(element), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -65538, -1, -1, -1, -1, -1, 16383, null);
        }
        if ((element instanceof Element.Regular) || (element instanceof Element.EducationCarousel) || (element instanceof Element.RecommendationsCard) || (element instanceof Element.MarketUpdates) || (element instanceof Element.MarketIndicators)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final Context getChildEventContext(Element element, Content child) {
        Intrinsics.checkNotNullParameter(element, "<this>");
        Intrinsics.checkNotNullParameter(child, "child");
        NewsFeedItem newsFeedItem = getNewsFeedItem(element);
        return new Context(getContentPosition(element, child), 0, 0, null, null, null, null, null, 0, null, null, null, null, null, Contents.getAsset(child), Contents.getList(child), newsFeedItem, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -114690, -1, -1, -1, -1, -1, 16383, null);
    }

    public static final int getContentPosition(Element element, Content content) {
        int iIndexOf;
        Intrinsics.checkNotNullParameter(element, "<this>");
        Intrinsics.checkNotNullParameter(content, "content");
        if (element instanceof Element.ListPreview) {
            iIndexOf = CollectionsKt.indexOf((List<? extends Content>) ((Element.ListPreview) element).getContents(), content);
        } else {
            if (!(element instanceof Element.Carousel)) {
                if ((element instanceof Element.Regular) || (element instanceof Element.EducationCarousel) || (element instanceof Element.RecommendationsCard) || (element instanceof Element.MarketUpdates) || (element instanceof Element.MarketIndicators)) {
                    return -1;
                }
                throw new NoWhenBranchMatchedException();
            }
            iIndexOf = ((Element.Carousel) element).getContents().indexOf(content);
        }
        return iIndexOf + 1;
    }

    public static final Component getEventComponent(Element element) {
        Intrinsics.checkNotNullParameter(element, "<this>");
        if (element instanceof Element.Carousel) {
            return new Component(Component.ComponentType.CAROUSEL, ((Element.Carousel) element).getTitle(), null, 4, null);
        }
        if (element instanceof Element.ListPreview) {
            return new Component(Component.ComponentType.LIST_CHIP_GRID, ((Element.ListPreview) element).getTitle(), null, 4, null);
        }
        if (!(element instanceof Element.Regular) && !(element instanceof Element.EducationCarousel) && !(element instanceof Element.RecommendationsCard) && !(element instanceof Element.MarketUpdates) && !(element instanceof Element.MarketIndicators)) {
            throw new NoWhenBranchMatchedException();
        }
        return new Component(Component.ComponentType.COMPONENT_TYPE_UNSPECIFIED, null, null, 6, null);
    }
}
