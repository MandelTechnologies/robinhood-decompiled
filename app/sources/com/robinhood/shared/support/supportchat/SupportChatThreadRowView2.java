package com.robinhood.shared.support.supportchat;

import android.view.View;
import com.robinhood.shared.support.supportchat.databinding.MergeSupportChatThreadRowViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SupportChatThreadRowView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.support.supportchat.SupportChatThreadRowView$binding$2, reason: use source file name */
/* loaded from: classes6.dex */
/* synthetic */ class SupportChatThreadRowView2 extends FunctionReferenceImpl implements Function1<View, MergeSupportChatThreadRowViewBinding> {
    public static final SupportChatThreadRowView2 INSTANCE = new SupportChatThreadRowView2();

    SupportChatThreadRowView2() {
        super(1, MergeSupportChatThreadRowViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/shared/support/supportchat/databinding/MergeSupportChatThreadRowViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeSupportChatThreadRowViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeSupportChatThreadRowViewBinding.bind(p0);
    }
}
