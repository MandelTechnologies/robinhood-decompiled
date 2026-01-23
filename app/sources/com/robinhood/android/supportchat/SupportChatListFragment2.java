package com.robinhood.android.supportchat;

import android.view.View;
import com.robinhood.android.supportchat.databinding.FragmentSupportChatListBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SupportChatListFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.supportchat.SupportChatListFragment$binding$2, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class SupportChatListFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentSupportChatListBinding> {
    public static final SupportChatListFragment2 INSTANCE = new SupportChatListFragment2();

    SupportChatListFragment2() {
        super(1, FragmentSupportChatListBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/supportchat/databinding/FragmentSupportChatListBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentSupportChatListBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentSupportChatListBinding.bind(p0);
    }
}
