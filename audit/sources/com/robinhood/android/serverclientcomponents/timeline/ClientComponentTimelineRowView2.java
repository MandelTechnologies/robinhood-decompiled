package com.robinhood.android.serverclientcomponents.timeline;

import android.view.View;
import com.robinhood.android.serverclientcomponents.databinding.MergeClientComponentTimelineRowViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ClientComponentTimelineRowView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.serverclientcomponents.timeline.ClientComponentTimelineRowView$binding$2, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class ClientComponentTimelineRowView2 extends FunctionReferenceImpl implements Function1<View, MergeClientComponentTimelineRowViewBinding> {
    public static final ClientComponentTimelineRowView2 INSTANCE = new ClientComponentTimelineRowView2();

    ClientComponentTimelineRowView2() {
        super(1, MergeClientComponentTimelineRowViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/serverclientcomponents/databinding/MergeClientComponentTimelineRowViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeClientComponentTimelineRowViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeClientComponentTimelineRowViewBinding.bind(p0);
    }
}
