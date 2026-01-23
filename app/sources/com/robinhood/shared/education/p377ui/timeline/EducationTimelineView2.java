package com.robinhood.shared.education.p377ui.timeline;

import android.view.View;
import com.robinhood.shared.education.databinding.MergeEducationTimelineViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EducationTimelineView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.education.ui.timeline.EducationTimelineView$binding$2, reason: use source file name */
/* loaded from: classes6.dex */
/* synthetic */ class EducationTimelineView2 extends FunctionReferenceImpl implements Function1<View, MergeEducationTimelineViewBinding> {
    public static final EducationTimelineView2 INSTANCE = new EducationTimelineView2();

    EducationTimelineView2() {
        super(1, MergeEducationTimelineViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/shared/education/databinding/MergeEducationTimelineViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeEducationTimelineViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeEducationTimelineViewBinding.bind(p0);
    }
}
