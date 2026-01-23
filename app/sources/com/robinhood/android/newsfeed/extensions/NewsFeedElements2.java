package com.robinhood.android.newsfeed.extensions;

import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.newsfeed.model.Content;
import com.robinhood.android.newsfeed.model.Element;
import com.robinhood.android.newsfeed.model.ParentElement;
import com.robinhood.android.newsfeed.model.RelatedAsset;
import com.robinhood.android.newsfeed.model.RelatedInstrument;
import com.robinhood.lists.models.shared.p298db.SizedUrlHolder;
import com.robinhood.models.api.ApiCuratedList;
import com.robinhood.models.newsfeed.p334db.NewsFeedContent;
import com.robinhood.models.newsfeed.p334db.NewsFeedElementTemplate;
import com.robinhood.models.newsfeed.p334db.NewsFeedMedia;
import com.robinhood.models.newsfeed.p334db.dao.NewsFeedElement;
import com.robinhood.shared.models.api.bonfire.education.lesson.ApiLessonPreview;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationLessonPreview;
import com.robinhood.utils.datetime.Durations;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlinx.collections.immutable.extensions2;
import okhttp3.HttpUrl;
import p479j$.time.Instant;

/* compiled from: NewsFeedElements.kt */
@Metadata(m3635d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u007f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u000b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000f0\u000b\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00110\u000b¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0011J\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u001b*\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0011H\u0002J.\u0010 \u001a\u00020!*\u00020\"2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u00062\b\u0010$\u001a\u0004\u0018\u00010%H\u0002J$\u0010 \u001a\u00020&*\u00020'2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u0006H\u0002J\u001c\u0010 \u001a\u00020(*\u00020)2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0011H\u0002J$\u0010 \u001a\u00020**\u00020+2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u0006H\u0002J8\u0010 \u001a\u00020,*\u00020-2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00112\u0006\u0010.\u001a\u00020\u00062\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u000bH\u0002J0\u0010 \u001a\u000200*\u0002012\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00112\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00110\u000bH\u0002J\u001c\u0010 \u001a\u000203*\u0002042\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0011H\u0002J\u001c\u0010 \u001a\u000205*\u0002062\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0011H\u0002R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00110\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00067"}, m3636d2 = {"Lcom/robinhood/android/newsfeed/extensions/Transformer;", "", "filteredContentIds", "", "Ljava/util/UUID;", "showVideoContent", "", "autoplayVideoAudioEnabled", "showPopularListsCarousel", "showCuratedListChipBadges", "curatedListChipBadgesSeen", "", "", "startedEducationLessonIds", "educationLessonsFirstShownTimestamps", "", "educationUserProgressMap", "", "<init>", "(Ljava/util/Set;ZZZZLjava/util/Map;Ljava/util/Set;Ljava/util/Map;Ljava/util/Map;)V", "transform", "Lcom/robinhood/android/newsfeed/model/Element;", "template", "Lcom/robinhood/models/newsfeed/db/NewsFeedElementTemplate;", "element", "Lcom/robinhood/models/newsfeed/db/dao/NewsFeedElement;", "elementRank", "Lcom/robinhood/android/newsfeed/model/Content;", "Lcom/robinhood/models/newsfeed/db/NewsFeedContent;", "parentElement", "Lcom/robinhood/android/newsfeed/model/ParentElement;", "rank", "toContent", "Lcom/robinhood/android/newsfeed/model/Content$Article;", "Lcom/robinhood/models/newsfeed/db/NewsFeedContent$Article;", "isHero", "logoAssetName", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "Lcom/robinhood/android/newsfeed/model/Content$EmbeddedArticle;", "Lcom/robinhood/models/newsfeed/db/NewsFeedContent$EmbeddedArticle;", "Lcom/robinhood/android/newsfeed/model/Content$Instrument;", "Lcom/robinhood/models/newsfeed/db/NewsFeedContent$Instrument;", "Lcom/robinhood/android/newsfeed/model/Content$Video;", "Lcom/robinhood/models/newsfeed/db/NewsFeedContent$Video;", "Lcom/robinhood/android/newsfeed/model/Content$ListPreview;", "Lcom/robinhood/models/newsfeed/db/NewsFeedContent$ListPreview;", "showBadge", "badgesSeen", "Lcom/robinhood/android/newsfeed/model/Content$EducationSeries;", "Lcom/robinhood/models/newsfeed/db/NewsFeedContent$EducationSeries;", "userProgressMap", "Lcom/robinhood/android/newsfeed/model/Content$MarketUpdates;", "Lcom/robinhood/models/newsfeed/db/NewsFeedContent$MarketUpdates;", "Lcom/robinhood/android/newsfeed/model/Content$MarketIndicator;", "Lcom/robinhood/models/newsfeed/db/NewsFeedContent$MarketIndicator;", "feature-lib-newsfeed_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.newsfeed.extensions.Transformer, reason: use source file name */
/* loaded from: classes8.dex */
final class NewsFeedElements2 {
    private final boolean autoplayVideoAudioEnabled;
    private final Map<String, Boolean> curatedListChipBadgesSeen;
    private final Map<String, Long> educationLessonsFirstShownTimestamps;
    private final Map<String, Integer> educationUserProgressMap;
    private final Set<UUID> filteredContentIds;
    private final boolean showCuratedListChipBadges;
    private final boolean showPopularListsCarousel;
    private final boolean showVideoContent;
    private final Set<String> startedEducationLessonIds;

    /* compiled from: NewsFeedElements.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.newsfeed.extensions.Transformer$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NewsFeedElementTemplate.values().length];
            try {
                iArr[NewsFeedElementTemplate.CAROUSEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NewsFeedElementTemplate.NEWS_REGULAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NewsFeedElementTemplate.NEWS_HERO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NewsFeedElementTemplate.VIDEO_REGULAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[NewsFeedElementTemplate.VIDEO_HERO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[NewsFeedElementTemplate.LISTS_CHIP_GRID.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[NewsFeedElementTemplate.EDUCATION_CAROUSEL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[NewsFeedElementTemplate.MARKET_UPDATES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[NewsFeedElementTemplate.MARKET_INDICATORS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public NewsFeedElements2(Set<UUID> filteredContentIds, boolean z, boolean z2, boolean z3, boolean z4, Map<String, Boolean> curatedListChipBadgesSeen, Set<String> startedEducationLessonIds, Map<String, Long> educationLessonsFirstShownTimestamps, Map<String, Integer> educationUserProgressMap) {
        Intrinsics.checkNotNullParameter(filteredContentIds, "filteredContentIds");
        Intrinsics.checkNotNullParameter(curatedListChipBadgesSeen, "curatedListChipBadgesSeen");
        Intrinsics.checkNotNullParameter(startedEducationLessonIds, "startedEducationLessonIds");
        Intrinsics.checkNotNullParameter(educationLessonsFirstShownTimestamps, "educationLessonsFirstShownTimestamps");
        Intrinsics.checkNotNullParameter(educationUserProgressMap, "educationUserProgressMap");
        this.filteredContentIds = filteredContentIds;
        this.showVideoContent = z;
        this.autoplayVideoAudioEnabled = z2;
        this.showPopularListsCarousel = z3;
        this.showCuratedListChipBadges = z4;
        this.curatedListChipBadgesSeen = curatedListChipBadgesSeen;
        this.startedEducationLessonIds = startedEducationLessonIds;
        this.educationLessonsFirstShownTimestamps = educationLessonsFirstShownTimestamps;
        this.educationUserProgressMap = educationUserProgressMap;
    }

    public final Element transform(NewsFeedElementTemplate template, NewsFeedElement element, int elementRank) {
        boolean z;
        int i;
        Content content;
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(element, "element");
        Sequence sequenceFilter = SequencesKt.filter(CollectionsKt.asSequence(element.getContents()), new Function1() { // from class: com.robinhood.android.newsfeed.extensions.Transformer$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(NewsFeedElements2.transform$lambda$0(this.f$0, (NewsFeedContent) obj));
            }
        });
        final ParentElement parentElement = new ParentElement(element.getId(), template.getServerValue(), element.getCategory(), elementRank, SequencesKt.count(sequenceFilter));
        switch (WhenMappings.$EnumSwitchMapping$0[template.ordinal()]) {
            case 1:
                final Ref.IntRef intRef = new Ref.IntRef();
                List list = SequencesKt.toList(SequencesKt.mapNotNull(sequenceFilter, new Function1() { // from class: com.robinhood.android.newsfeed.extensions.Transformer$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return NewsFeedElements2.transform$lambda$1(this.f$0, parentElement, intRef, (NewsFeedContent) obj);
                    }
                }));
                if (list.isEmpty()) {
                    return null;
                }
                return new Element.Carousel(element.getId(), elementRank, element.getCategory(), element.getDisplayLabel(), element.getDescription(), list);
            case 2:
            case 3:
                NewsFeedContent newsFeedContent = (NewsFeedContent) SequencesKt.firstOrNull(sequenceFilter);
                z = template == NewsFeedElementTemplate.NEWS_HERO;
                if (newsFeedContent instanceof NewsFeedContent.Article) {
                    content = toContent((NewsFeedContent.Article) newsFeedContent, ParentElement.copy$default(parentElement, null, null, null, 0, 1, 15, null), 0, z, element.getLogoAssetName());
                    i = elementRank;
                } else {
                    boolean z2 = z;
                    if (newsFeedContent instanceof NewsFeedContent.EmbeddedArticle) {
                        i = elementRank;
                        content = toContent((NewsFeedContent.EmbeddedArticle) newsFeedContent, ParentElement.copy$default(parentElement, null, null, null, 0, 1, 15, null), 0, z2);
                    } else {
                        i = elementRank;
                        content = null;
                    }
                }
                if (content != null) {
                    return new Element.Regular(element.getId(), i, content);
                }
                return null;
            case 4:
            case 5:
                if (this.showVideoContent) {
                    z = template == NewsFeedElementTemplate.VIDEO_HERO;
                    NewsFeedContent.Video video = (NewsFeedContent.Video) SequencesKt.firstOrNull(sequenceFilter);
                    Content.Video content2 = video != null ? toContent(video, ParentElement.copy$default(parentElement, null, null, null, 0, 1, 15, null), 0, z) : null;
                    if (content2 != null) {
                        return new Element.Regular(element.getId(), elementRank, content2);
                    }
                }
                return null;
            case 6:
                if (this.showPopularListsCarousel) {
                    return new Element.ListPreview(element.getId(), elementRank, element.getCategory(), element.getDisplayLabel(), element.getDescription(), SequencesKt.toList(SequencesKt.mapIndexed(sequenceFilter, new Function2() { // from class: com.robinhood.android.newsfeed.extensions.Transformer$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return NewsFeedElements2.transform$lambda$2(this.f$0, parentElement, ((Integer) obj).intValue(), (NewsFeedContent) obj2);
                        }
                    })), element.getLabelInfoAction());
                }
                return null;
            case 7:
                Object objFirstOrNull = SequencesKt.firstOrNull(sequenceFilter);
                NewsFeedContent.EducationSeries educationSeries = objFirstOrNull instanceof NewsFeedContent.EducationSeries ? (NewsFeedContent.EducationSeries) objFirstOrNull : null;
                Content contentTransform = educationSeries != null ? transform(educationSeries, parentElement, 0) : null;
                Content.EducationSeries educationSeries2 = contentTransform instanceof Content.EducationSeries ? (Content.EducationSeries) contentTransform : null;
                if (educationSeries2 == null) {
                    return null;
                }
                List<EducationLessonPreview> lessons = educationSeries2.getLessons();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(lessons, 10));
                int i2 = 0;
                for (Object obj : lessons) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    EducationLessonPreview educationLessonPreviewCopy$default = (EducationLessonPreview) obj;
                    if (i2 == 0) {
                        String trackingId = educationLessonPreviewCopy$default.getTrackingId();
                        Long l = this.educationLessonsFirstShownTimestamps.get(trackingId);
                        Instant instantOfEpochMilli = Instant.ofEpochMilli(l != null ? l.longValue() : System.currentTimeMillis());
                        Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(...)");
                        educationLessonPreviewCopy$default = EducationLessonPreview.copy$default(educationLessonPreviewCopy$default, null, null, null, 0, null, null, null, 0, 0, 0, 0, 0, null, null, null, null, false, ((Durations.since(instantOfEpochMilli).toDays() > 14L ? 1 : (Durations.since(instantOfEpochMilli).toDays() == 14L ? 0 : -1)) < 0) && !this.startedEducationLessonIds.contains(trackingId), 0, 393215, null);
                    }
                    arrayList.add(educationLessonPreviewCopy$default);
                    i2 = i3;
                }
                return new Element.EducationCarousel(element.getId(), elementRank, educationSeries2.getTitle(), extensions2.toImmutableList(arrayList));
            case 8:
                Object objFirstOrNull2 = SequencesKt.firstOrNull(sequenceFilter);
                NewsFeedContent.MarketUpdates marketUpdates = objFirstOrNull2 instanceof NewsFeedContent.MarketUpdates ? (NewsFeedContent.MarketUpdates) objFirstOrNull2 : null;
                Content contentTransform2 = marketUpdates != null ? transform(marketUpdates, parentElement, 0) : null;
                Content.MarketUpdates marketUpdates2 = contentTransform2 instanceof Content.MarketUpdates ? (Content.MarketUpdates) contentTransform2 : null;
                if (marketUpdates2 != null) {
                    return new Element.MarketUpdates(element.getId(), elementRank, marketUpdates2.getTitle(), marketUpdates2.getPublishedAt(), marketUpdates2.getBody());
                }
                return null;
            case 9:
                List list2 = SequencesKt.toList(SequencesKt.mapIndexed(sequenceFilter, new Function2() { // from class: com.robinhood.android.newsfeed.extensions.Transformer$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return NewsFeedElements2.transform$lambda$4(this.f$0, parentElement, ((Integer) obj2).intValue(), (NewsFeedContent) obj3);
                    }
                }));
                if (list2.isEmpty()) {
                    return null;
                }
                return new Element.MarketIndicators(element.getId(), elementRank, list2);
            default:
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean transform$lambda$0(NewsFeedElements2 newsFeedElements2, NewsFeedContent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return !newsFeedElements2.filteredContentIds.contains(it.getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Content transform$lambda$1(NewsFeedElements2 newsFeedElements2, ParentElement parentElement, Ref.IntRef intRef, NewsFeedContent content) {
        Intrinsics.checkNotNullParameter(content, "content");
        Content contentTransform = newsFeedElements2.transform(content, parentElement, intRef.element);
        if (contentTransform != null) {
            intRef.element++;
        }
        return contentTransform;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Content.ListPreview transform$lambda$2(NewsFeedElements2 newsFeedElements2, ParentElement parentElement, int i, NewsFeedContent content) {
        Intrinsics.checkNotNullParameter(content, "content");
        Content contentTransform = newsFeedElements2.transform(content, parentElement, i);
        Intrinsics.checkNotNull(contentTransform, "null cannot be cast to non-null type com.robinhood.android.newsfeed.model.Content.ListPreview");
        return (Content.ListPreview) contentTransform;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Content.MarketIndicator transform$lambda$4(NewsFeedElements2 newsFeedElements2, ParentElement parentElement, int i, NewsFeedContent content) {
        Intrinsics.checkNotNullParameter(content, "content");
        Content contentTransform = newsFeedElements2.transform(content, parentElement, i);
        Intrinsics.checkNotNull(contentTransform, "null cannot be cast to non-null type com.robinhood.android.newsfeed.model.Content.MarketIndicator");
        return (Content.MarketIndicator) contentTransform;
    }

    private final Content transform(NewsFeedContent newsFeedContent, ParentElement parentElement, int i) {
        if (newsFeedContent instanceof NewsFeedContent.Article) {
            return toContent((NewsFeedContent.Article) newsFeedContent, parentElement, i, false, (ServerToBentoAssetMapper2) null);
        }
        if (newsFeedContent instanceof NewsFeedContent.EmbeddedArticle) {
            return toContent((NewsFeedContent.EmbeddedArticle) newsFeedContent, parentElement, i, false);
        }
        if (newsFeedContent instanceof NewsFeedContent.Instrument) {
            return toContent((NewsFeedContent.Instrument) newsFeedContent, parentElement, i);
        }
        if (newsFeedContent instanceof NewsFeedContent.EducationSeries) {
            return toContent((NewsFeedContent.EducationSeries) newsFeedContent, parentElement, i, this.educationUserProgressMap);
        }
        if (newsFeedContent instanceof NewsFeedContent.ListPreview) {
            return toContent((NewsFeedContent.ListPreview) newsFeedContent, parentElement, i, this.showCuratedListChipBadges, this.curatedListChipBadgesSeen);
        }
        if (newsFeedContent instanceof NewsFeedContent.MarketUpdates) {
            return toContent((NewsFeedContent.MarketUpdates) newsFeedContent, parentElement, i);
        }
        if (newsFeedContent instanceof NewsFeedContent.MarketIndicator) {
            return toContent((NewsFeedContent.MarketIndicator) newsFeedContent, parentElement, i);
        }
        return null;
    }

    private final Content.Article toContent(NewsFeedContent.Article article, ParentElement parentElement, int i, boolean z, ServerToBentoAssetMapper2 serverToBentoAssetMapper2) {
        HttpUrl imageUrl;
        List<RelatedInstrument> listTakeRelatedInstruments = NewsFeedInstruments.takeRelatedInstruments(article.getRelatedInstruments(), 2);
        List<RelatedAsset> listTakeRelatedAssets = NewsFeedInstruments.takeRelatedAssets(article.getRelatedAssets(), 2);
        UUID id = article.getId();
        String serverContentType = article.getServerContentType();
        String title = article.getTitle();
        HttpUrl url = article.getUrl();
        RelatedInstrument relatedInstrument = (RelatedInstrument) CollectionsKt.getOrNull(listTakeRelatedInstruments, 0);
        RelatedInstrument relatedInstrument2 = (RelatedInstrument) CollectionsKt.getOrNull(listTakeRelatedInstruments, 1);
        RelatedAsset relatedAsset = (RelatedAsset) CollectionsKt.getOrNull(listTakeRelatedAssets, 0);
        RelatedAsset relatedAsset2 = (RelatedAsset) CollectionsKt.getOrNull(listTakeRelatedAssets, 1);
        String source = article.getSource();
        Instant publishedAt = article.getPublishedAt();
        NewsFeedMedia previewMedia = article.getPreviewMedia();
        if (previewMedia == null || (imageUrl = previewMedia.getImageUrl()) == null) {
            NewsFeedMedia media = article.getMedia();
            imageUrl = media != null ? media.getImageUrl() : null;
        }
        return new Content.Article(id, i, parentElement, serverContentType, title, url, relatedInstrument, relatedInstrument2, relatedAsset, relatedAsset2, null, source, publishedAt, imageUrl, z, serverToBentoAssetMapper2, 1024, null);
    }

    private final Content.EmbeddedArticle toContent(NewsFeedContent.EmbeddedArticle embeddedArticle, ParentElement parentElement, int i, boolean z) {
        HttpUrl imageUrl;
        List<RelatedInstrument> listTakeRelatedInstruments = NewsFeedInstruments.takeRelatedInstruments(embeddedArticle.getRelatedInstruments(), 2);
        UUID id = embeddedArticle.getId();
        String serverContentType = embeddedArticle.getServerContentType();
        String title = embeddedArticle.getTitle();
        RelatedInstrument relatedInstrument = (RelatedInstrument) CollectionsKt.getOrNull(listTakeRelatedInstruments, 0);
        RelatedInstrument relatedInstrument2 = (RelatedInstrument) CollectionsKt.getOrNull(listTakeRelatedInstruments, 1);
        String source = embeddedArticle.getSource();
        Instant publishedAt = embeddedArticle.getPublishedAt();
        NewsFeedMedia previewMedia = embeddedArticle.getPreviewMedia();
        if (previewMedia == null || (imageUrl = previewMedia.getImageUrl()) == null) {
            NewsFeedMedia media = embeddedArticle.getMedia();
            imageUrl = media != null ? media.getImageUrl() : null;
        }
        return new Content.EmbeddedArticle(id, i, parentElement, serverContentType, title, relatedInstrument, relatedInstrument2, null, source, publishedAt, imageUrl, z, 128, null);
    }

    private final Content.Instrument toContent(NewsFeedContent.Instrument instrument, ParentElement parentElement, int i) {
        UUID id = instrument.getId();
        String serverContentType = instrument.getServerContentType();
        UUID instrumentId = instrument.getInstrumentId();
        String simpleName = instrument.getSimpleName();
        if (simpleName == null) {
            simpleName = instrument.getName();
        }
        return new Content.Instrument(id, i, parentElement, serverContentType, instrumentId, simpleName, instrument.getSymbol());
    }

    private final Content.Video toContent(NewsFeedContent.Video video, ParentElement parentElement, int i, boolean z) {
        List<RelatedInstrument> listTakeRelatedInstruments = NewsFeedInstruments.takeRelatedInstruments(video.getRelatedInstruments(), 2);
        UUID id = video.getId();
        String serverContentType = video.getServerContentType();
        String title = video.getTitle();
        HttpUrl url = video.getUrl();
        RelatedInstrument relatedInstrument = (RelatedInstrument) CollectionsKt.getOrNull(listTakeRelatedInstruments, 0);
        RelatedInstrument relatedInstrument2 = (RelatedInstrument) CollectionsKt.getOrNull(listTakeRelatedInstruments, 1);
        String source = video.getSource();
        Instant publishedAt = video.getPublishedAt();
        NewsFeedMedia thumbnail = video.getThumbnail();
        return new Content.Video(id, i, parentElement, serverContentType, title, url, relatedInstrument, relatedInstrument2, source, publishedAt, thumbnail != null ? thumbnail.getImageUrl() : null, video.getCaptions(), this.autoplayVideoAudioEnabled, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Content.ListPreview toContent(NewsFeedContent.ListPreview listPreview, ParentElement parentElement, int i, boolean z, Map<String, Boolean> map) {
        boolean z2;
        UUID id = listPreview.getId();
        String serverContentType = listPreview.getServerContentType();
        String displayName = listPreview.getDisplayName();
        SizedUrlHolder imageUrls = listPreview.getImageUrls();
        ApiCuratedList.OwnerType ownerType = listPreview.getOwnerType();
        int itemCount = listPreview.getItemCount();
        if (Intrinsics.areEqual(listPreview.isBadged(), Boolean.TRUE) && z) {
            String string2 = listPreview.getId().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            if (!map.getOrDefault(string2, Boolean.FALSE).booleanValue()) {
                z2 = true;
            }
        } else {
            z2 = false;
        }
        return new Content.ListPreview(id, i, parentElement, serverContentType, displayName, imageUrls, ownerType, itemCount, z2);
    }

    private final Content.EducationSeries toContent(NewsFeedContent.EducationSeries educationSeries, ParentElement parentElement, int i, final Map<String, Integer> map) {
        return new Content.EducationSeries(educationSeries.getId(), i, parentElement, educationSeries.getServerContentType(), educationSeries.getTitle(), SequencesKt.toList(SequencesKt.mapIndexed(CollectionsKt.asSequence(educationSeries.getLessons()), new Function2() { // from class: com.robinhood.android.newsfeed.extensions.Transformer$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return NewsFeedElements2.toContent$lambda$5(map, ((Integer) obj).intValue(), (ApiLessonPreview) obj2);
            }
        })));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EducationLessonPreview toContent$lambda$5(Map map, int i, ApiLessonPreview content) {
        Intrinsics.checkNotNullParameter(content, "content");
        Integer num = (Integer) map.get(content.getTrackingId());
        return content.toDbModel(num != null && num.intValue() == 100, i);
    }

    private final Content.MarketUpdates toContent(NewsFeedContent.MarketUpdates marketUpdates, ParentElement parentElement, int i) {
        return new Content.MarketUpdates(marketUpdates.getId(), i, parentElement, marketUpdates.getServerContentType(), marketUpdates.getTitle(), marketUpdates.getPublishedAt(), marketUpdates.getBody());
    }

    private final Content.MarketIndicator toContent(NewsFeedContent.MarketIndicator marketIndicator, ParentElement parentElement, int i) {
        return new Content.MarketIndicator(marketIndicator.getId(), i, parentElement, marketIndicator.getServerContentType(), marketIndicator.getLabel(), marketIndicator.getIndicatorType(), marketIndicator.getIndicatorKey());
    }
}
