package com.robinhood.android.matcha.p177ui.confirmation;

import android.view.View;
import com.robinhood.android.matcha.databinding.FragmentMatchaTransferDeclineBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchaTransferDeclineFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.matcha.ui.confirmation.MatchaTransferDeclineFragment$binding$2, reason: use source file name */
/* loaded from: classes8.dex */
/* synthetic */ class MatchaTransferDeclineFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentMatchaTransferDeclineBinding> {
    public static final MatchaTransferDeclineFragment2 INSTANCE = new MatchaTransferDeclineFragment2();

    MatchaTransferDeclineFragment2() {
        super(1, FragmentMatchaTransferDeclineBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/matcha/databinding/FragmentMatchaTransferDeclineBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentMatchaTransferDeclineBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentMatchaTransferDeclineBinding.bind(p0);
    }
}
