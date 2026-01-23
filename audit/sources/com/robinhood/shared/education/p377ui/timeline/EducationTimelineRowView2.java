package com.robinhood.shared.education.p377ui.timeline;

import android.view.View;
import com.robinhood.shared.education.databinding.MergeEducationTimelineRowViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EducationTimelineRowView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.education.ui.timeline.EducationTimelineRowView$binding$2, reason: use source file name */
/* loaded from: classes6.dex */
/* synthetic */ class EducationTimelineRowView2 extends FunctionReferenceImpl implements Function1<View, MergeEducationTimelineRowViewBinding> {
    public static final EducationTimelineRowView2 INSTANCE = new EducationTimelineRowView2();

    EducationTimelineRowView2() {
        super(1, MergeEducationTimelineRowViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/shared/education/databinding/MergeEducationTimelineRowViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeEducationTimelineRowViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeEducationTimelineRowViewBinding.bind(p0);
    }
}
