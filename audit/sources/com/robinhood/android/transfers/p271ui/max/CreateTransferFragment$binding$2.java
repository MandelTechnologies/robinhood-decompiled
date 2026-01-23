package com.robinhood.android.transfers.p271ui.max;

import android.view.View;
import com.robinhood.android.transfers.databinding.FragmentCreateTransferV2Binding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreateTransferFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
/* synthetic */ class CreateTransferFragment$binding$2 extends FunctionReferenceImpl implements Function1<View, FragmentCreateTransferV2Binding> {
    public static final CreateTransferFragment$binding$2 INSTANCE = new CreateTransferFragment$binding$2();

    CreateTransferFragment$binding$2() {
        super(1, FragmentCreateTransferV2Binding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/transfers/databinding/FragmentCreateTransferV2Binding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentCreateTransferV2Binding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentCreateTransferV2Binding.bind(p0);
    }
}
