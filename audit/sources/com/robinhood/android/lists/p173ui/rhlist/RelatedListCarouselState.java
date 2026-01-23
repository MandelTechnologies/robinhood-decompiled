package com.robinhood.android.lists.p173ui.rhlist;

import com.robinhood.android.common.p088ui.CuratedListChipItem;
import com.robinhood.models.api.ApiCuratedList;
import com.robinhood.models.p320db.CuratedListPartial;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;

/* compiled from: CuratedListRhListViewState.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÂ\u0003J\u0019\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/rhlist/RelatedListCarouselState;", "", "relatedLists", "", "Lcom/robinhood/models/db/CuratedListPartial;", "<init>", "(Ljava/util/List;)V", "partialListItems", "Lcom/robinhood/android/common/ui/CuratedListChipItem;", "getPartialListItems", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class RelatedListCarouselState {
    public static final int $stable = 8;
    private final List<CuratedListChipItem> partialListItems;
    private final List<CuratedListPartial> relatedLists;

    private final List<CuratedListPartial> component1() {
        return this.relatedLists;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RelatedListCarouselState copy$default(RelatedListCarouselState relatedListCarouselState, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = relatedListCarouselState.relatedLists;
        }
        return relatedListCarouselState.copy(list);
    }

    public final RelatedListCarouselState copy(List<CuratedListPartial> relatedLists) {
        Intrinsics.checkNotNullParameter(relatedLists, "relatedLists");
        return new RelatedListCarouselState(relatedLists);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RelatedListCarouselState) && Intrinsics.areEqual(this.relatedLists, ((RelatedListCarouselState) other).relatedLists);
    }

    public int hashCode() {
        return this.relatedLists.hashCode();
    }

    public String toString() {
        return "RelatedListCarouselState(relatedLists=" + this.relatedLists + ")";
    }

    public RelatedListCarouselState(List<CuratedListPartial> relatedLists) {
        Intrinsics.checkNotNullParameter(relatedLists, "relatedLists");
        this.relatedLists = relatedLists;
        this.partialListItems = SequencesKt.toList(SequencesKt.map(CollectionsKt.asSequence(relatedLists), new Function1() { // from class: com.robinhood.android.lists.ui.rhlist.RelatedListCarouselState$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RelatedListCarouselState.partialListItems$lambda$0((CuratedListPartial) obj);
            }
        }));
    }

    public final List<CuratedListChipItem> getPartialListItems() {
        return this.partialListItems;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CuratedListChipItem partialListItems$lambda$0(CuratedListPartial relatedList) {
        Intrinsics.checkNotNullParameter(relatedList, "relatedList");
        return new CuratedListChipItem(relatedList.getId(), relatedList.getDisplayName(), ApiCuratedList.OwnerType.ROBINHOOD, relatedList.getCircleImageUrls(), null, Integer.valueOf(relatedList.getItemCount()), null, false, false, null, false, 2000, null);
    }
}
