package com.robinhood.android.cash.disputes.p070ui.question.duplicate;

import android.view.View;
import com.robinhood.android.cash.disputes.databinding.FragmentDuplicateAuthorizedTransactionBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DuplicateAuthorizedTransactionFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cash.disputes.ui.question.duplicate.DuplicateAuthorizedTransactionFragment$binding$2, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class DuplicateAuthorizedTransactionFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentDuplicateAuthorizedTransactionBinding> {
    public static final DuplicateAuthorizedTransactionFragment2 INSTANCE = new DuplicateAuthorizedTransactionFragment2();

    DuplicateAuthorizedTransactionFragment2() {
        super(1, FragmentDuplicateAuthorizedTransactionBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/cash/disputes/databinding/FragmentDuplicateAuthorizedTransactionBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentDuplicateAuthorizedTransactionBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentDuplicateAuthorizedTransactionBinding.bind(p0);
    }
}
