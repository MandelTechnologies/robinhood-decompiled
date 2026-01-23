package com.robinhood.android.indexes.detail.components.about;

import android.content.res.Resources;
import com.robinhood.android.common.detail.component.about.DetailPageAboutViewState;
import com.robinhood.android.indexes.detail.C18813R;
import com.robinhood.android.indexes.models.p159db.Index;
import com.robinhood.android.udf.StateProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IndexDetailPageAboutStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/indexes/detail/components/about/IndexDetailPageAboutStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/indexes/detail/components/about/IndexDetailPageAboutDataState;", "Lcom/robinhood/android/common/detail/component/about/DetailPageAboutViewState;", "resources", "Landroid/content/res/Resources;", "<init>", "(Landroid/content/res/Resources;)V", "reduce", "dataState", "feature-index-detail-page_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class IndexDetailPageAboutStateProvider implements StateProvider<IndexDetailPageAboutDataState, DetailPageAboutViewState> {
    public static final int $stable = 8;
    private final Resources resources;

    public IndexDetailPageAboutStateProvider(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.resources = resources;
    }

    @Override // com.robinhood.android.udf.StateProvider
    public DetailPageAboutViewState reduce(IndexDetailPageAboutDataState dataState) {
        String string2;
        String description;
        String simpleName;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        Index index = dataState.getIndex();
        String str = "";
        if (index == null || (simpleName = index.getSimpleName()) == null || (string2 = this.resources.getString(C18813R.string.index_detail_page_about_section_instrument_title, simpleName)) == null) {
            string2 = "";
        }
        Index index2 = dataState.getIndex();
        if (index2 != null && (description = index2.getDescription()) != null) {
            str = description;
        }
        return new DetailPageAboutViewState(string2, str, dataState.getIndex() != null);
    }
}
