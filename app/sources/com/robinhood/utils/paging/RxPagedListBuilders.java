package com.robinhood.utils.paging;

import androidx.paging.PagedList;
import androidx.paging.RxPagedListBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RxPagedListBuilders.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aI\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004\"\b\b\u0001\u0010\u0003*\u00020\u0004*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0000\u0012\u0002H\u00030\u0006H\u0086\b¨\u0006\u0007"}, m3636d2 = {"setBoundaryCallback", "Landroidx/paging/RxPagedListBuilder;", "KeyT", "ValueT", "", "boundaryCallback", "Landroidx/paging/PagedList$BoundaryCallback;", "lib-utils-android_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.paging.RxPagedListBuildersKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class RxPagedListBuilders {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <KeyT, ValueT> RxPagedListBuilder<KeyT, ValueT> setBoundaryCallback(RxPagedListBuilder<KeyT, ValueT> rxPagedListBuilder, PagedList.BoundaryCallback<? super ValueT> boundaryCallback) {
        Intrinsics.checkNotNullParameter(rxPagedListBuilder, "<this>");
        Intrinsics.checkNotNullParameter(boundaryCallback, "boundaryCallback");
        return rxPagedListBuilder.setBoundaryCallback(boundaryCallback);
    }
}
