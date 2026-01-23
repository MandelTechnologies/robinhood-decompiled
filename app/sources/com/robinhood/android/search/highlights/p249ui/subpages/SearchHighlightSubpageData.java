package com.robinhood.android.search.highlights.p249ui.subpages;

import com.robinhood.android.search.highlights.C27914R;
import com.robinhood.shared.education.order.OrderTypeEducationLearnMoreFragment;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import search_coprocessor.p542v1.SearchSubpageDto;

/* compiled from: SearchHighlightSubpageData.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/search/highlights/ui/subpages/SearchHighlightSubpageData;", "", "id", "", "getId", "()Ljava/lang/String;", "Now", "Remote", "Lcom/robinhood/android/search/highlights/ui/subpages/SearchHighlightSubpageData$Now;", "Lcom/robinhood/android/search/highlights/ui/subpages/SearchHighlightSubpageData$Remote;", "lib-search-highlights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public interface SearchHighlightSubpageData {
    String getId();

    /* compiled from: SearchHighlightSubpageData.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/search/highlights/ui/subpages/SearchHighlightSubpageData$Now;", "Lcom/robinhood/android/search/highlights/ui/subpages/SearchHighlightSubpageData;", "<init>", "()V", "id", "", "getId", "()Ljava/lang/String;", OrderTypeEducationLearnMoreFragment.ARG_TITLE_RES, "", "getTitleRes", "()I", "lib-search-highlights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Now implements SearchHighlightSubpageData {
        public static final int $stable = 0;
        public static final Now INSTANCE = new Now();
        private static final String id = "now";
        private static final int titleRes = C27914R.string.search_highlights_now;

        private Now() {
        }

        @Override // com.robinhood.android.search.highlights.p249ui.subpages.SearchHighlightSubpageData
        public String getId() {
            return id;
        }

        public final int getTitleRes() {
            return titleRes;
        }
    }

    /* compiled from: SearchHighlightSubpageData.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/search/highlights/ui/subpages/SearchHighlightSubpageData$Remote;", "Lcom/robinhood/android/search/highlights/ui/subpages/SearchHighlightSubpageData;", "id", "", "dto", "Lsearch_coprocessor/v1/SearchSubpageDto;", "<init>", "(Ljava/lang/String;Lsearch_coprocessor/v1/SearchSubpageDto;)V", "getId", "()Ljava/lang/String;", "getDto", "()Lsearch_coprocessor/v1/SearchSubpageDto;", "templatesToExclude", "", "getTemplatesToExclude", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-search-highlights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Remote implements SearchHighlightSubpageData {
        public static final int $stable = 8;
        private final SearchSubpageDto dto;
        private final String id;

        public static /* synthetic */ Remote copy$default(Remote remote, String str, SearchSubpageDto searchSubpageDto, int i, Object obj) {
            if ((i & 1) != 0) {
                str = remote.id;
            }
            if ((i & 2) != 0) {
                searchSubpageDto = remote.dto;
            }
            return remote.copy(str, searchSubpageDto);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final SearchSubpageDto getDto() {
            return this.dto;
        }

        public final Remote copy(String id, SearchSubpageDto dto) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(dto, "dto");
            return new Remote(id, dto);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Remote)) {
                return false;
            }
            Remote remote = (Remote) other;
            return Intrinsics.areEqual(this.id, remote.id) && Intrinsics.areEqual(this.dto, remote.dto);
        }

        public int hashCode() {
            return (this.id.hashCode() * 31) + this.dto.hashCode();
        }

        public String toString() {
            return "Remote(id=" + this.id + ", dto=" + this.dto + ")";
        }

        public Remote(String id, SearchSubpageDto dto) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(dto, "dto");
            this.id = id;
            this.dto = dto;
        }

        @Override // com.robinhood.android.search.highlights.p249ui.subpages.SearchHighlightSubpageData
        public String getId() {
            return this.id;
        }

        public final SearchSubpageDto getDto() {
            return this.dto;
        }

        public final List<String> getTemplatesToExclude() {
            return CollectionsKt.listOf("*");
        }
    }
}
