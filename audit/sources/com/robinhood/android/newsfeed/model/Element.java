package com.robinhood.android.newsfeed.model;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.newsfeed.model.Content;
import com.robinhood.android.util.notification.RhGcmListenerService;
import com.robinhood.contentful.markdown.MarkdownContent;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationLessonPreview;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import p479j$.time.Instant;

/* compiled from: Element.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0010\u0011\u0012\u0013\u0014\u0015\u0016B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0000H\u0016J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0000H\u0016R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0007\u0017\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/newsfeed/model/Element;", "", "<init>", "()V", "id", "Ljava/util/UUID;", "getId", "()Ljava/util/UUID;", "rank", "", "getRank", "()I", "isTheSameAs", "", "other", "isTheSameContentAs", "Regular", "Carousel", "ListPreview", "EducationCarousel", "RecommendationsCard", "MarketUpdates", "MarketIndicators", "Lcom/robinhood/android/newsfeed/model/Element$Carousel;", "Lcom/robinhood/android/newsfeed/model/Element$EducationCarousel;", "Lcom/robinhood/android/newsfeed/model/Element$ListPreview;", "Lcom/robinhood/android/newsfeed/model/Element$MarketIndicators;", "Lcom/robinhood/android/newsfeed/model/Element$MarketUpdates;", "Lcom/robinhood/android/newsfeed/model/Element$RecommendationsCard;", "Lcom/robinhood/android/newsfeed/model/Element$Regular;", "feature-lib-newsfeed_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public abstract class Element {
    public static final int $stable = 0;

    public /* synthetic */ Element(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract UUID getId();

    public abstract int getRank();

    private Element() {
    }

    public boolean isTheSameAs(Element other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return Intrinsics.areEqual(getId(), other.getId());
    }

    public boolean isTheSameContentAs(Element other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return Intrinsics.areEqual(this, other);
    }

    /* compiled from: Element.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0001H\u0016J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J'\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/newsfeed/model/Element$Regular;", "Lcom/robinhood/android/newsfeed/model/Element;", "id", "Ljava/util/UUID;", "rank", "", "content", "Lcom/robinhood/android/newsfeed/model/Content;", "<init>", "(Ljava/util/UUID;ILcom/robinhood/android/newsfeed/model/Content;)V", "getId", "()Ljava/util/UUID;", "getRank", "()I", "getContent", "()Lcom/robinhood/android/newsfeed/model/Content;", "isTheSameAs", "", "other", "component1", "component2", "component3", "copy", "equals", "", "hashCode", "toString", "", "feature-lib-newsfeed_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Regular extends Element {
        public static final int $stable = 8;
        private final Content content;
        private final UUID id;
        private final int rank;

        public static /* synthetic */ Regular copy$default(Regular regular, UUID uuid, int i, Content content, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                uuid = regular.id;
            }
            if ((i2 & 2) != 0) {
                i = regular.rank;
            }
            if ((i2 & 4) != 0) {
                content = regular.content;
            }
            return regular.copy(uuid, i, content);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final int getRank() {
            return this.rank;
        }

        /* renamed from: component3, reason: from getter */
        public final Content getContent() {
            return this.content;
        }

        public final Regular copy(UUID id, int rank, Content content) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(content, "content");
            return new Regular(id, rank, content);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Regular)) {
                return false;
            }
            Regular regular = (Regular) other;
            return Intrinsics.areEqual(this.id, regular.id) && this.rank == regular.rank && Intrinsics.areEqual(this.content, regular.content);
        }

        public int hashCode() {
            return (((this.id.hashCode() * 31) + Integer.hashCode(this.rank)) * 31) + this.content.hashCode();
        }

        public String toString() {
            return "Regular(id=" + this.id + ", rank=" + this.rank + ", content=" + this.content + ")";
        }

        @Override // com.robinhood.android.newsfeed.model.Element
        public UUID getId() {
            return this.id;
        }

        @Override // com.robinhood.android.newsfeed.model.Element
        public int getRank() {
            return this.rank;
        }

        public final Content getContent() {
            return this.content;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Regular(UUID id, int i, Content content) {
            super(null);
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(content, "content");
            this.id = id;
            this.rank = i;
            this.content = content;
        }

        @Override // com.robinhood.android.newsfeed.model.Element
        public boolean isTheSameAs(Element other) {
            Content content;
            Intrinsics.checkNotNullParameter(other, "other");
            UUID id = this.content.getId();
            UUID id2 = null;
            Regular regular = other instanceof Regular ? (Regular) other : null;
            if (regular != null && (content = regular.content) != null) {
                id2 = content.getId();
            }
            return Intrinsics.areEqual(id, id2);
        }
    }

    /* compiled from: Element.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003JM\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u0005HÖ\u0001J\t\u0010%\u001a\u00020\u0007HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/newsfeed/model/Element$Carousel;", "Lcom/robinhood/android/newsfeed/model/Element;", "id", "Ljava/util/UUID;", "rank", "", RhGcmListenerService.EXTRA_CATEGORY, "", "title", "subtitle", "contents", "", "Lcom/robinhood/android/newsfeed/model/Content;", "<init>", "(Ljava/util/UUID;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getId", "()Ljava/util/UUID;", "getRank", "()I", "getCategory", "()Ljava/lang/String;", "getTitle", "getSubtitle", "getContents", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "toString", "feature-lib-newsfeed_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Carousel extends Element {
        public static final int $stable = 8;
        private final String category;
        private final List<Content> contents;
        private final UUID id;
        private final int rank;
        private final String subtitle;
        private final String title;

        public static /* synthetic */ Carousel copy$default(Carousel carousel, UUID uuid, int i, String str, String str2, String str3, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                uuid = carousel.id;
            }
            if ((i2 & 2) != 0) {
                i = carousel.rank;
            }
            if ((i2 & 4) != 0) {
                str = carousel.category;
            }
            if ((i2 & 8) != 0) {
                str2 = carousel.title;
            }
            if ((i2 & 16) != 0) {
                str3 = carousel.subtitle;
            }
            if ((i2 & 32) != 0) {
                list = carousel.contents;
            }
            String str4 = str3;
            List list2 = list;
            return carousel.copy(uuid, i, str, str2, str4, list2);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final int getRank() {
            return this.rank;
        }

        /* renamed from: component3, reason: from getter */
        public final String getCategory() {
            return this.category;
        }

        /* renamed from: component4, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component5, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        public final List<Content> component6() {
            return this.contents;
        }

        public final Carousel copy(UUID id, int rank, String category, String title, String subtitle, List<? extends Content> contents) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(category, "category");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(contents, "contents");
            return new Carousel(id, rank, category, title, subtitle, contents);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Carousel)) {
                return false;
            }
            Carousel carousel = (Carousel) other;
            return Intrinsics.areEqual(this.id, carousel.id) && this.rank == carousel.rank && Intrinsics.areEqual(this.category, carousel.category) && Intrinsics.areEqual(this.title, carousel.title) && Intrinsics.areEqual(this.subtitle, carousel.subtitle) && Intrinsics.areEqual(this.contents, carousel.contents);
        }

        public int hashCode() {
            int iHashCode = ((((((this.id.hashCode() * 31) + Integer.hashCode(this.rank)) * 31) + this.category.hashCode()) * 31) + this.title.hashCode()) * 31;
            String str = this.subtitle;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.contents.hashCode();
        }

        public String toString() {
            return "Carousel(id=" + this.id + ", rank=" + this.rank + ", category=" + this.category + ", title=" + this.title + ", subtitle=" + this.subtitle + ", contents=" + this.contents + ")";
        }

        @Override // com.robinhood.android.newsfeed.model.Element
        public UUID getId() {
            return this.id;
        }

        @Override // com.robinhood.android.newsfeed.model.Element
        public int getRank() {
            return this.rank;
        }

        public final String getCategory() {
            return this.category;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final List<Content> getContents() {
            return this.contents;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Carousel(UUID id, int i, String category, String title, String str, List<? extends Content> contents) {
            super(null);
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(category, "category");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(contents, "contents");
            this.id = id;
            this.rank = i;
            this.category = category;
            this.title = title;
            this.subtitle = str;
            this.contents = contents;
        }
    }

    /* compiled from: Element.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0001H\u0016J\u0010\u0010 \u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0001H\u0016J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000eHÆ\u0003JY\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u0010)\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020\u0005HÖ\u0001J\t\u0010,\u001a\u00020\u0007HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/newsfeed/model/Element$ListPreview;", "Lcom/robinhood/android/newsfeed/model/Element;", "id", "Ljava/util/UUID;", "rank", "", RhGcmListenerService.EXTRA_CATEGORY, "", "title", "subtitle", "contents", "", "Lcom/robinhood/android/newsfeed/model/Content$ListPreview;", "infoAction", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "<init>", "(Ljava/util/UUID;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;)V", "getId", "()Ljava/util/UUID;", "getRank", "()I", "getCategory", "()Ljava/lang/String;", "getTitle", "getSubtitle", "getContents", "()Ljava/util/List;", "getInfoAction", "()Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "isTheSameAs", "", "other", "isTheSameContentAs", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "hashCode", "toString", "feature-lib-newsfeed_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ListPreview extends Element {
        public static final int $stable = 8;
        private final String category;
        private final List<Content.ListPreview> contents;
        private final UUID id;
        private final GenericAction infoAction;
        private final int rank;
        private final String subtitle;
        private final String title;

        public static /* synthetic */ ListPreview copy$default(ListPreview listPreview, UUID uuid, int i, String str, String str2, String str3, List list, GenericAction genericAction, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                uuid = listPreview.id;
            }
            if ((i2 & 2) != 0) {
                i = listPreview.rank;
            }
            if ((i2 & 4) != 0) {
                str = listPreview.category;
            }
            if ((i2 & 8) != 0) {
                str2 = listPreview.title;
            }
            if ((i2 & 16) != 0) {
                str3 = listPreview.subtitle;
            }
            if ((i2 & 32) != 0) {
                list = listPreview.contents;
            }
            if ((i2 & 64) != 0) {
                genericAction = listPreview.infoAction;
            }
            List list2 = list;
            GenericAction genericAction2 = genericAction;
            String str4 = str3;
            String str5 = str;
            return listPreview.copy(uuid, i, str5, str2, str4, list2, genericAction2);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final int getRank() {
            return this.rank;
        }

        /* renamed from: component3, reason: from getter */
        public final String getCategory() {
            return this.category;
        }

        /* renamed from: component4, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component5, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        public final List<Content.ListPreview> component6() {
            return this.contents;
        }

        /* renamed from: component7, reason: from getter */
        public final GenericAction getInfoAction() {
            return this.infoAction;
        }

        public final ListPreview copy(UUID id, int rank, String category, String title, String subtitle, List<Content.ListPreview> contents, GenericAction infoAction) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(category, "category");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(contents, "contents");
            return new ListPreview(id, rank, category, title, subtitle, contents, infoAction);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ListPreview)) {
                return false;
            }
            ListPreview listPreview = (ListPreview) other;
            return Intrinsics.areEqual(this.id, listPreview.id) && this.rank == listPreview.rank && Intrinsics.areEqual(this.category, listPreview.category) && Intrinsics.areEqual(this.title, listPreview.title) && Intrinsics.areEqual(this.subtitle, listPreview.subtitle) && Intrinsics.areEqual(this.contents, listPreview.contents) && Intrinsics.areEqual(this.infoAction, listPreview.infoAction);
        }

        public int hashCode() {
            int iHashCode = ((((((this.id.hashCode() * 31) + Integer.hashCode(this.rank)) * 31) + this.category.hashCode()) * 31) + this.title.hashCode()) * 31;
            String str = this.subtitle;
            int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.contents.hashCode()) * 31;
            GenericAction genericAction = this.infoAction;
            return iHashCode2 + (genericAction != null ? genericAction.hashCode() : 0);
        }

        public String toString() {
            return "ListPreview(id=" + this.id + ", rank=" + this.rank + ", category=" + this.category + ", title=" + this.title + ", subtitle=" + this.subtitle + ", contents=" + this.contents + ", infoAction=" + this.infoAction + ")";
        }

        @Override // com.robinhood.android.newsfeed.model.Element
        public UUID getId() {
            return this.id;
        }

        @Override // com.robinhood.android.newsfeed.model.Element
        public int getRank() {
            return this.rank;
        }

        public final String getCategory() {
            return this.category;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final List<Content.ListPreview> getContents() {
            return this.contents;
        }

        public final GenericAction getInfoAction() {
            return this.infoAction;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ListPreview(UUID id, int i, String category, String title, String str, List<Content.ListPreview> contents, GenericAction genericAction) {
            super(null);
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(category, "category");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(contents, "contents");
            this.id = id;
            this.rank = i;
            this.category = category;
            this.title = title;
            this.subtitle = str;
            this.contents = contents;
            this.infoAction = genericAction;
        }

        @Override // com.robinhood.android.newsfeed.model.Element
        public boolean isTheSameAs(Element other) {
            Intrinsics.checkNotNullParameter(other, "other");
            String str = this.title;
            ListPreview listPreview = other instanceof ListPreview ? (ListPreview) other : null;
            return Intrinsics.areEqual(str, listPreview != null ? listPreview.title : null);
        }

        @Override // com.robinhood.android.newsfeed.model.Element
        public boolean isTheSameContentAs(Element other) {
            Intrinsics.checkNotNullParameter(other, "other");
            if (!(other instanceof ListPreview)) {
                return false;
            }
            ListPreview listPreview = (ListPreview) other;
            return getRank() == listPreview.getRank() && Intrinsics.areEqual(this.category, listPreview.category) && Intrinsics.areEqual(this.title, listPreview.title) && Intrinsics.areEqual(this.subtitle, listPreview.subtitle) && Intrinsics.areEqual(this.contents, listPreview.contents) && Intrinsics.areEqual(this.infoAction, listPreview.infoAction);
        }
    }

    /* compiled from: Element.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0001H\u0016J\u0010\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0001H\u0016J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J7\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u0005HÖ\u0001J\t\u0010!\u001a\u00020\u0007HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/newsfeed/model/Element$EducationCarousel;", "Lcom/robinhood/android/newsfeed/model/Element;", "id", "Ljava/util/UUID;", "rank", "", "title", "", "lessons", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationLessonPreview;", "<init>", "(Ljava/util/UUID;ILjava/lang/String;Lkotlinx/collections/immutable/ImmutableList;)V", "getId", "()Ljava/util/UUID;", "getRank", "()I", "getTitle", "()Ljava/lang/String;", "getLessons", "()Lkotlinx/collections/immutable/ImmutableList;", "isTheSameAs", "", "other", "isTheSameContentAs", "component1", "component2", "component3", "component4", "copy", "equals", "", "hashCode", "toString", "feature-lib-newsfeed_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class EducationCarousel extends Element {
        public static final int $stable = 8;
        private final UUID id;
        private final ImmutableList<EducationLessonPreview> lessons;
        private final int rank;
        private final String title;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ EducationCarousel copy$default(EducationCarousel educationCarousel, UUID uuid, int i, String str, ImmutableList immutableList, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                uuid = educationCarousel.id;
            }
            if ((i2 & 2) != 0) {
                i = educationCarousel.rank;
            }
            if ((i2 & 4) != 0) {
                str = educationCarousel.title;
            }
            if ((i2 & 8) != 0) {
                immutableList = educationCarousel.lessons;
            }
            return educationCarousel.copy(uuid, i, str, immutableList);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final int getRank() {
            return this.rank;
        }

        /* renamed from: component3, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final ImmutableList<EducationLessonPreview> component4() {
            return this.lessons;
        }

        public final EducationCarousel copy(UUID id, int rank, String title, ImmutableList<EducationLessonPreview> lessons) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(lessons, "lessons");
            return new EducationCarousel(id, rank, title, lessons);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EducationCarousel)) {
                return false;
            }
            EducationCarousel educationCarousel = (EducationCarousel) other;
            return Intrinsics.areEqual(this.id, educationCarousel.id) && this.rank == educationCarousel.rank && Intrinsics.areEqual(this.title, educationCarousel.title) && Intrinsics.areEqual(this.lessons, educationCarousel.lessons);
        }

        public int hashCode() {
            return (((((this.id.hashCode() * 31) + Integer.hashCode(this.rank)) * 31) + this.title.hashCode()) * 31) + this.lessons.hashCode();
        }

        public String toString() {
            return "EducationCarousel(id=" + this.id + ", rank=" + this.rank + ", title=" + this.title + ", lessons=" + this.lessons + ")";
        }

        @Override // com.robinhood.android.newsfeed.model.Element
        public UUID getId() {
            return this.id;
        }

        @Override // com.robinhood.android.newsfeed.model.Element
        public int getRank() {
            return this.rank;
        }

        public final String getTitle() {
            return this.title;
        }

        public final ImmutableList<EducationLessonPreview> getLessons() {
            return this.lessons;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EducationCarousel(UUID id, int i, String title, ImmutableList<EducationLessonPreview> lessons) {
            super(null);
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(lessons, "lessons");
            this.id = id;
            this.rank = i;
            this.title = title;
            this.lessons = lessons;
        }

        @Override // com.robinhood.android.newsfeed.model.Element
        public boolean isTheSameAs(Element other) {
            Intrinsics.checkNotNullParameter(other, "other");
            String str = this.title;
            EducationCarousel educationCarousel = other instanceof EducationCarousel ? (EducationCarousel) other : null;
            return Intrinsics.areEqual(str, educationCarousel != null ? educationCarousel.title : null);
        }

        @Override // com.robinhood.android.newsfeed.model.Element
        public boolean isTheSameContentAs(Element other) {
            Intrinsics.checkNotNullParameter(other, "other");
            if (!(other instanceof EducationCarousel)) {
                return false;
            }
            EducationCarousel educationCarousel = (EducationCarousel) other;
            return getRank() == educationCarousel.getRank() && Intrinsics.areEqual(this.title, educationCarousel.title) && Intrinsics.areEqual(this.lessons, educationCarousel.lessons);
        }
    }

    /* compiled from: Element.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/newsfeed/model/Element$RecommendationsCard;", "Lcom/robinhood/android/newsfeed/model/Element;", "id", "Ljava/util/UUID;", "rank", "", "<init>", "(Ljava/util/UUID;I)V", "getId", "()Ljava/util/UUID;", "getRank", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "feature-lib-newsfeed_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class RecommendationsCard extends Element {
        public static final int $stable = 8;
        private final UUID id;
        private final int rank;

        public static /* synthetic */ RecommendationsCard copy$default(RecommendationsCard recommendationsCard, UUID uuid, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                uuid = recommendationsCard.id;
            }
            if ((i2 & 2) != 0) {
                i = recommendationsCard.rank;
            }
            return recommendationsCard.copy(uuid, i);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final int getRank() {
            return this.rank;
        }

        public final RecommendationsCard copy(UUID id, int rank) {
            Intrinsics.checkNotNullParameter(id, "id");
            return new RecommendationsCard(id, rank);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RecommendationsCard)) {
                return false;
            }
            RecommendationsCard recommendationsCard = (RecommendationsCard) other;
            return Intrinsics.areEqual(this.id, recommendationsCard.id) && this.rank == recommendationsCard.rank;
        }

        public int hashCode() {
            return (this.id.hashCode() * 31) + Integer.hashCode(this.rank);
        }

        public String toString() {
            return "RecommendationsCard(id=" + this.id + ", rank=" + this.rank + ")";
        }

        @Override // com.robinhood.android.newsfeed.model.Element
        public UUID getId() {
            return this.id;
        }

        @Override // com.robinhood.android.newsfeed.model.Element
        public int getRank() {
            return this.rank;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RecommendationsCard(UUID id, int i) {
            super(null);
            Intrinsics.checkNotNullParameter(id, "id");
            this.id = id;
            this.rank = i;
        }
    }

    /* compiled from: Element.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJB\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0018J\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010\u0016J\u001a\u0010\"\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u0018R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010,\u001a\u0004\b-\u0010\u001c¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/newsfeed/model/Element$MarketUpdates;", "Lcom/robinhood/android/newsfeed/model/Element;", "Ljava/util/UUID;", "id", "", "rank", "", "title", "j$/time/Instant", "publishedAt", "Lcom/robinhood/contentful/markdown/MarkdownContent;", CarResultComposable2.BODY, "<init>", "(Ljava/util/UUID;ILjava/lang/String;Lj$/time/Instant;Lcom/robinhood/contentful/markdown/MarkdownContent;)V", "other", "", "isTheSameAs", "(Lcom/robinhood/android/newsfeed/model/Element;)Z", "isTheSameContentAs", "component1", "()Ljava/util/UUID;", "component2", "()I", "component3", "()Ljava/lang/String;", "component4", "()Lj$/time/Instant;", "component5", "()Lcom/robinhood/contentful/markdown/MarkdownContent;", "copy", "(Ljava/util/UUID;ILjava/lang/String;Lj$/time/Instant;Lcom/robinhood/contentful/markdown/MarkdownContent;)Lcom/robinhood/android/newsfeed/model/Element$MarketUpdates;", "toString", "hashCode", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/UUID;", "getId", "I", "getRank", "Ljava/lang/String;", "getTitle", "Lj$/time/Instant;", "getPublishedAt", "Lcom/robinhood/contentful/markdown/MarkdownContent;", "getBody", "feature-lib-newsfeed_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class MarketUpdates extends Element {
        public static final int $stable = 8;
        private final MarkdownContent body;
        private final UUID id;
        private final Instant publishedAt;
        private final int rank;
        private final String title;

        public static /* synthetic */ MarketUpdates copy$default(MarketUpdates marketUpdates, UUID uuid, int i, String str, Instant instant, MarkdownContent markdownContent, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                uuid = marketUpdates.id;
            }
            if ((i2 & 2) != 0) {
                i = marketUpdates.rank;
            }
            if ((i2 & 4) != 0) {
                str = marketUpdates.title;
            }
            if ((i2 & 8) != 0) {
                instant = marketUpdates.publishedAt;
            }
            if ((i2 & 16) != 0) {
                markdownContent = marketUpdates.body;
            }
            MarkdownContent markdownContent2 = markdownContent;
            String str2 = str;
            return marketUpdates.copy(uuid, i, str2, instant, markdownContent2);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final int getRank() {
            return this.rank;
        }

        /* renamed from: component3, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component4, reason: from getter */
        public final Instant getPublishedAt() {
            return this.publishedAt;
        }

        /* renamed from: component5, reason: from getter */
        public final MarkdownContent getBody() {
            return this.body;
        }

        public final MarketUpdates copy(UUID id, int rank, String title, Instant publishedAt, MarkdownContent body) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(publishedAt, "publishedAt");
            Intrinsics.checkNotNullParameter(body, "body");
            return new MarketUpdates(id, rank, title, publishedAt, body);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MarketUpdates)) {
                return false;
            }
            MarketUpdates marketUpdates = (MarketUpdates) other;
            return Intrinsics.areEqual(this.id, marketUpdates.id) && this.rank == marketUpdates.rank && Intrinsics.areEqual(this.title, marketUpdates.title) && Intrinsics.areEqual(this.publishedAt, marketUpdates.publishedAt) && Intrinsics.areEqual(this.body, marketUpdates.body);
        }

        public int hashCode() {
            return (((((((this.id.hashCode() * 31) + Integer.hashCode(this.rank)) * 31) + this.title.hashCode()) * 31) + this.publishedAt.hashCode()) * 31) + this.body.hashCode();
        }

        public String toString() {
            return "MarketUpdates(id=" + this.id + ", rank=" + this.rank + ", title=" + this.title + ", publishedAt=" + this.publishedAt + ", body=" + this.body + ")";
        }

        @Override // com.robinhood.android.newsfeed.model.Element
        public UUID getId() {
            return this.id;
        }

        @Override // com.robinhood.android.newsfeed.model.Element
        public int getRank() {
            return this.rank;
        }

        public final String getTitle() {
            return this.title;
        }

        public final Instant getPublishedAt() {
            return this.publishedAt;
        }

        public final MarkdownContent getBody() {
            return this.body;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MarketUpdates(UUID id, int i, String title, Instant publishedAt, MarkdownContent body) {
            super(null);
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(publishedAt, "publishedAt");
            Intrinsics.checkNotNullParameter(body, "body");
            this.id = id;
            this.rank = i;
            this.title = title;
            this.publishedAt = publishedAt;
            this.body = body;
        }

        @Override // com.robinhood.android.newsfeed.model.Element
        public boolean isTheSameAs(Element other) {
            Intrinsics.checkNotNullParameter(other, "other");
            String str = this.title;
            boolean z = other instanceof MarketUpdates;
            MarketUpdates marketUpdates = z ? (MarketUpdates) other : null;
            if (!Intrinsics.areEqual(str, marketUpdates != null ? marketUpdates.title : null)) {
                return false;
            }
            Instant instant = this.publishedAt;
            MarketUpdates marketUpdates2 = z ? (MarketUpdates) other : null;
            return Intrinsics.areEqual(instant, marketUpdates2 != null ? marketUpdates2.publishedAt : null);
        }

        @Override // com.robinhood.android.newsfeed.model.Element
        public boolean isTheSameContentAs(Element other) {
            Intrinsics.checkNotNullParameter(other, "other");
            if (!(other instanceof MarketUpdates)) {
                return false;
            }
            MarketUpdates marketUpdates = (MarketUpdates) other;
            return getRank() == marketUpdates.getRank() && Intrinsics.areEqual(this.title, marketUpdates.title) && Intrinsics.areEqual(this.publishedAt, marketUpdates.publishedAt) && Intrinsics.areEqual(this.body, marketUpdates.body);
        }
    }

    /* compiled from: Element.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0001H\u0016J\u0010\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0001H\u0016J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/newsfeed/model/Element$MarketIndicators;", "Lcom/robinhood/android/newsfeed/model/Element;", "id", "Ljava/util/UUID;", "rank", "", "contents", "", "Lcom/robinhood/android/newsfeed/model/Content$MarketIndicator;", "<init>", "(Ljava/util/UUID;ILjava/util/List;)V", "getId", "()Ljava/util/UUID;", "getRank", "()I", "getContents", "()Ljava/util/List;", "isTheSameAs", "", "other", "isTheSameContentAs", "component1", "component2", "component3", "copy", "equals", "", "hashCode", "toString", "", "feature-lib-newsfeed_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class MarketIndicators extends Element {
        public static final int $stable = 8;
        private final List<Content.MarketIndicator> contents;
        private final UUID id;
        private final int rank;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MarketIndicators copy$default(MarketIndicators marketIndicators, UUID uuid, int i, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                uuid = marketIndicators.id;
            }
            if ((i2 & 2) != 0) {
                i = marketIndicators.rank;
            }
            if ((i2 & 4) != 0) {
                list = marketIndicators.contents;
            }
            return marketIndicators.copy(uuid, i, list);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final int getRank() {
            return this.rank;
        }

        public final List<Content.MarketIndicator> component3() {
            return this.contents;
        }

        public final MarketIndicators copy(UUID id, int rank, List<Content.MarketIndicator> contents) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(contents, "contents");
            return new MarketIndicators(id, rank, contents);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MarketIndicators)) {
                return false;
            }
            MarketIndicators marketIndicators = (MarketIndicators) other;
            return Intrinsics.areEqual(this.id, marketIndicators.id) && this.rank == marketIndicators.rank && Intrinsics.areEqual(this.contents, marketIndicators.contents);
        }

        public int hashCode() {
            return (((this.id.hashCode() * 31) + Integer.hashCode(this.rank)) * 31) + this.contents.hashCode();
        }

        public String toString() {
            return "MarketIndicators(id=" + this.id + ", rank=" + this.rank + ", contents=" + this.contents + ")";
        }

        @Override // com.robinhood.android.newsfeed.model.Element
        public UUID getId() {
            return this.id;
        }

        @Override // com.robinhood.android.newsfeed.model.Element
        public int getRank() {
            return this.rank;
        }

        public final List<Content.MarketIndicator> getContents() {
            return this.contents;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MarketIndicators(UUID id, int i, List<Content.MarketIndicator> contents) {
            super(null);
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(contents, "contents");
            this.id = id;
            this.rank = i;
            this.contents = contents;
        }

        @Override // com.robinhood.android.newsfeed.model.Element
        public boolean isTheSameAs(Element other) {
            List<Content.MarketIndicator> list;
            Intrinsics.checkNotNullParameter(other, "other");
            List<Content.MarketIndicator> list2 = this.contents;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((Content.MarketIndicator) it.next()).getIndicatorKey());
            }
            ArrayList arrayList2 = null;
            MarketIndicators marketIndicators = other instanceof MarketIndicators ? (MarketIndicators) other : null;
            if (marketIndicators != null && (list = marketIndicators.contents) != null) {
                List<Content.MarketIndicator> list3 = list;
                arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                Iterator<T> it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((Content.MarketIndicator) it2.next()).getIndicatorKey());
                }
            }
            return Intrinsics.areEqual(arrayList, arrayList2);
        }

        @Override // com.robinhood.android.newsfeed.model.Element
        public boolean isTheSameContentAs(Element other) {
            Intrinsics.checkNotNullParameter(other, "other");
            if (!(other instanceof MarketIndicators)) {
                return false;
            }
            MarketIndicators marketIndicators = (MarketIndicators) other;
            return getRank() == marketIndicators.getRank() && Intrinsics.areEqual(this.contents, marketIndicators.contents);
        }
    }
}
