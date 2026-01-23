package com.robinhood.android.lists.p173ui.ipo.video;

import android.view.View;
import com.robinhood.android.lists.databinding.MergeVideoViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VideoContainerView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lists.ui.ipo.video.VideoContainerView$binding$2, reason: use source file name */
/* loaded from: classes8.dex */
/* synthetic */ class VideoContainerView2 extends FunctionReferenceImpl implements Function1<View, MergeVideoViewBinding> {
    public static final VideoContainerView2 INSTANCE = new VideoContainerView2();

    VideoContainerView2() {
        super(1, MergeVideoViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/lists/databinding/MergeVideoViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeVideoViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeVideoViewBinding.bind(p0);
    }
}
