package com.robinhood.android.directipo.allocation.p104ui;

import android.view.View;
import com.robinhood.android.directipo.allocation.databinding.FragmentCancelOrderDialogBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CancelIpoOrderDialogFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.directipo.allocation.ui.CancelIpoOrderDialogFragment$binding$2, reason: use source file name */
/* loaded from: classes27.dex */
/* synthetic */ class CancelIpoOrderDialogFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentCancelOrderDialogBinding> {
    public static final CancelIpoOrderDialogFragment2 INSTANCE = new CancelIpoOrderDialogFragment2();

    CancelIpoOrderDialogFragment2() {
        super(1, FragmentCancelOrderDialogBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/directipo/allocation/databinding/FragmentCancelOrderDialogBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentCancelOrderDialogBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentCancelOrderDialogBinding.bind(p0);
    }
}
