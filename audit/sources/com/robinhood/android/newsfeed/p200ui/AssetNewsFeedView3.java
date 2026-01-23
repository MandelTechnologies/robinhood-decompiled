package com.robinhood.android.newsfeed.p200ui;

import com.robinhood.android.newsfeed.model.Content;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AssetNewsFeedView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.newsfeed.ui.AssetNewsFeedView$diffCallback$1, reason: use source file name */
/* loaded from: classes8.dex */
/* synthetic */ class AssetNewsFeedView3 extends FunctionReferenceImpl implements Function1<Content, Integer> {
    AssetNewsFeedView3(Object obj) {
        super(1, obj, AssetNewsFeedView.class, "getViewType", "getViewType(Lcom/robinhood/android/newsfeed/model/Content;)I", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Integer invoke(Content p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return Integer.valueOf(((AssetNewsFeedView) this.receiver).getViewType(p0));
    }
}
