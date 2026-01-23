package com.robinhood.android.matcha.p177ui.confirmation;

import android.view.View;
import com.robinhood.android.matcha.databinding.FragmentMatchaTransferSuccessBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchaTransactionSuccessFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.matcha.ui.confirmation.MatchaTransactionSuccessFragment$binding$2, reason: use source file name */
/* loaded from: classes8.dex */
/* synthetic */ class MatchaTransactionSuccessFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentMatchaTransferSuccessBinding> {
    public static final MatchaTransactionSuccessFragment2 INSTANCE = new MatchaTransactionSuccessFragment2();

    MatchaTransactionSuccessFragment2() {
        super(1, FragmentMatchaTransferSuccessBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/matcha/databinding/FragmentMatchaTransferSuccessBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentMatchaTransferSuccessBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentMatchaTransferSuccessBinding.bind(p0);
    }
}
