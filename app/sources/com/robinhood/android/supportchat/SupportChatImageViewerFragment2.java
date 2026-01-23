package com.robinhood.android.supportchat;

import android.view.View;
import com.robinhood.android.supportchat.databinding.FragmentImageViewerBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SupportChatImageViewerFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.supportchat.SupportChatImageViewerFragment$binding$2, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class SupportChatImageViewerFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentImageViewerBinding> {
    public static final SupportChatImageViewerFragment2 INSTANCE = new SupportChatImageViewerFragment2();

    SupportChatImageViewerFragment2() {
        super(1, FragmentImageViewerBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/supportchat/databinding/FragmentImageViewerBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentImageViewerBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentImageViewerBinding.bind(p0);
    }
}
