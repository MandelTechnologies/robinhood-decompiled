package com.robinhood.android.directipo.p106ui.allocation;

import android.view.View;
import com.robinhood.android.directipo.p106ui.databinding.MergeIpoAnnouncementCardHookViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DirectIpoAllocationClarityCardHookView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.directipo.ui.allocation.DirectIpoAllocationClarityCardHookView$binding$2, reason: use source file name */
/* loaded from: classes27.dex */
/* synthetic */ class DirectIpoAllocationClarityCardHookView2 extends FunctionReferenceImpl implements Function1<View, MergeIpoAnnouncementCardHookViewBinding> {
    public static final DirectIpoAllocationClarityCardHookView2 INSTANCE = new DirectIpoAllocationClarityCardHookView2();

    DirectIpoAllocationClarityCardHookView2() {
        super(1, MergeIpoAnnouncementCardHookViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/directipo/ui/databinding/MergeIpoAnnouncementCardHookViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeIpoAnnouncementCardHookViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeIpoAnnouncementCardHookViewBinding.bind(p0);
    }
}
