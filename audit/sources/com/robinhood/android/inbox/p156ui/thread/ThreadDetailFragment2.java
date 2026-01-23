package com.robinhood.android.inbox.p156ui.thread;

import android.view.View;
import com.robinhood.android.inbox.databinding.FragmentInboxThreadDetailBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ThreadDetailFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.inbox.ui.thread.ThreadDetailFragment$binding$2, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class ThreadDetailFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentInboxThreadDetailBinding> {
    public static final ThreadDetailFragment2 INSTANCE = new ThreadDetailFragment2();

    ThreadDetailFragment2() {
        super(1, FragmentInboxThreadDetailBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/inbox/databinding/FragmentInboxThreadDetailBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentInboxThreadDetailBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentInboxThreadDetailBinding.bind(p0);
    }
}
