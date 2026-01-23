package com.robinhood.android.directipo.allocation.clarity.p103ui.announcement;

import android.view.View;
import com.robinhood.android.directipo.allocation.clarity.databinding.MergeIpoAnnouncementStatsViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DirectIpoNewAnnouncementStatsView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.directipo.allocation.clarity.ui.announcement.DirectIpoNewAnnouncementStatsView$binding$2, reason: use source file name */
/* loaded from: classes27.dex */
/* synthetic */ class DirectIpoNewAnnouncementStatsView2 extends FunctionReferenceImpl implements Function1<View, MergeIpoAnnouncementStatsViewBinding> {
    public static final DirectIpoNewAnnouncementStatsView2 INSTANCE = new DirectIpoNewAnnouncementStatsView2();

    DirectIpoNewAnnouncementStatsView2() {
        super(1, MergeIpoAnnouncementStatsViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/directipo/allocation/clarity/databinding/MergeIpoAnnouncementStatsViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeIpoAnnouncementStatsViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeIpoAnnouncementStatsViewBinding.bind(p0);
    }
}
