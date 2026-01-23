package com.robinhood.android.search.newsfeed.asset;

import com.robinhood.android.newsfeed.extensions.NewsFeedElements;
import com.robinhood.android.newsfeed.model.Element;
import com.robinhood.models.newsfeed.p334db.dao.NewsFeedElement;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: NewsFeedAssetViewState.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÂ\u0003J\u0019\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/search/newsfeed/asset/NewsFeedAssetViewState;", "", "newsFeedElements", "", "Lcom/robinhood/models/newsfeed/db/dao/NewsFeedElement;", "<init>", "(Ljava/util/List;)V", "elements", "Lcom/robinhood/android/newsfeed/model/Element;", "getElements", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final /* data */ class NewsFeedAssetViewState {
    public static final int $stable = 8;
    private final List<Element> elements;
    private final List<NewsFeedElement> newsFeedElements;

    /* JADX WARN: Multi-variable type inference failed */
    public NewsFeedAssetViewState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final List<NewsFeedElement> component1() {
        return this.newsFeedElements;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NewsFeedAssetViewState copy$default(NewsFeedAssetViewState newsFeedAssetViewState, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = newsFeedAssetViewState.newsFeedElements;
        }
        return newsFeedAssetViewState.copy(list);
    }

    public final NewsFeedAssetViewState copy(List<NewsFeedElement> newsFeedElements) {
        Intrinsics.checkNotNullParameter(newsFeedElements, "newsFeedElements");
        return new NewsFeedAssetViewState(newsFeedElements);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof NewsFeedAssetViewState) && Intrinsics.areEqual(this.newsFeedElements, ((NewsFeedAssetViewState) other).newsFeedElements);
    }

    public int hashCode() {
        return this.newsFeedElements.hashCode();
    }

    public String toString() {
        return "NewsFeedAssetViewState(newsFeedElements=" + this.newsFeedElements + ")";
    }

    public NewsFeedAssetViewState(List<NewsFeedElement> newsFeedElements) {
        Intrinsics.checkNotNullParameter(newsFeedElements, "newsFeedElements");
        this.newsFeedElements = newsFeedElements;
        List elements$default = NewsFeedElements.toElements$default(newsFeedElements, SetsKt.emptySet(), false, false, false, false, MapsKt.emptyMap(), SetsKt.emptySet(), MapsKt.emptyMap(), MapsKt.emptyMap(), 0, null, 1536, null);
        ArrayList arrayList = new ArrayList();
        for (Object obj : elements$default) {
            if (obj instanceof Element.Regular) {
                arrayList.add(obj);
            }
        }
        this.elements = arrayList;
    }

    public /* synthetic */ NewsFeedAssetViewState(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final List<Element> getElements() {
        return this.elements;
    }
}
