package com.robinhood.android.inbox.p156ui.messages;

import android.view.View;
import com.robinhood.android.inbox.databinding.FragmentInboxThreadListBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ThreadListFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.inbox.ui.messages.ThreadListFragment$binding$2, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class ThreadListFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentInboxThreadListBinding> {
    public static final ThreadListFragment2 INSTANCE = new ThreadListFragment2();

    ThreadListFragment2() {
        super(1, FragmentInboxThreadListBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/inbox/databinding/FragmentInboxThreadListBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentInboxThreadListBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentInboxThreadListBinding.bind(p0);
    }
}
