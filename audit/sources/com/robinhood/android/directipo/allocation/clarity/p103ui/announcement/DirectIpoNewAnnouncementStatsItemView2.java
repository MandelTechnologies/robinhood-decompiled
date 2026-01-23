package com.robinhood.android.directipo.allocation.clarity.p103ui.announcement;

import android.view.View;
import com.robinhood.android.directipo.allocation.clarity.databinding.MergeIpoAnnouncementStatsItemViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DirectIpoNewAnnouncementStatsItemView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.directipo.allocation.clarity.ui.announcement.DirectIpoNewAnnouncementStatsItemView$binding$2, reason: use source file name */
/* loaded from: classes27.dex */
/* synthetic */ class DirectIpoNewAnnouncementStatsItemView2 extends FunctionReferenceImpl implements Function1<View, MergeIpoAnnouncementStatsItemViewBinding> {
    public static final DirectIpoNewAnnouncementStatsItemView2 INSTANCE = new DirectIpoNewAnnouncementStatsItemView2();

    DirectIpoNewAnnouncementStatsItemView2() {
        super(1, MergeIpoAnnouncementStatsItemViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/directipo/allocation/clarity/databinding/MergeIpoAnnouncementStatsItemViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeIpoAnnouncementStatsItemViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeIpoAnnouncementStatsItemViewBinding.bind(p0);
    }
}
