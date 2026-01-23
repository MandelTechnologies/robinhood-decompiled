package com.robinhood.android.common.detail.component.news;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.robinhood.android.common.detail.component.databinding.IncludeAssetNewsFeedBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DetailPageNewsComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.detail.component.news.DetailPageNewsComposableKt$DetailPageNewsComposable$1$1$1, reason: use source file name */
/* loaded from: classes2.dex */
/* synthetic */ class DetailPageNewsComposable2 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, IncludeAssetNewsFeedBinding> {
    public static final DetailPageNewsComposable2 INSTANCE = new DetailPageNewsComposable2();

    DetailPageNewsComposable2() {
        super(3, IncludeAssetNewsFeedBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/robinhood/android/common/detail/component/databinding/IncludeAssetNewsFeedBinding;", 0);
    }

    public final IncludeAssetNewsFeedBinding invoke(LayoutInflater p0, ViewGroup viewGroup, boolean z) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return IncludeAssetNewsFeedBinding.inflate(p0, viewGroup, z);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ IncludeAssetNewsFeedBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
        return invoke(layoutInflater, viewGroup, bool.booleanValue());
    }
}
