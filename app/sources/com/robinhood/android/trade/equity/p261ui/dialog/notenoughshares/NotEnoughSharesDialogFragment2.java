package com.robinhood.android.trade.equity.p261ui.dialog.notenoughshares;

import android.view.View;
import com.robinhood.android.trade.equity.databinding.NotEnoughSharesV2DialogFragmentBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NotEnoughSharesDialogFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.trade.equity.ui.dialog.notenoughshares.NotEnoughSharesDialogFragment$bindings$2, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class NotEnoughSharesDialogFragment2 extends FunctionReferenceImpl implements Function1<View, NotEnoughSharesV2DialogFragmentBinding> {
    public static final NotEnoughSharesDialogFragment2 INSTANCE = new NotEnoughSharesDialogFragment2();

    NotEnoughSharesDialogFragment2() {
        super(1, NotEnoughSharesV2DialogFragmentBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/trade/equity/databinding/NotEnoughSharesV2DialogFragmentBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final NotEnoughSharesV2DialogFragmentBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return NotEnoughSharesV2DialogFragmentBinding.bind(p0);
    }
}
