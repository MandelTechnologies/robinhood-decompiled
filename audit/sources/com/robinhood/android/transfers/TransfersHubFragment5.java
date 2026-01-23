package com.robinhood.android.transfers;

import android.view.View;
import com.robinhood.android.transfers.transferhub.databinding.FragmentTransfersHubBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransfersHubFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.TransfersHubFragment$binding$2, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class TransfersHubFragment5 extends FunctionReferenceImpl implements Function1<View, FragmentTransfersHubBinding> {
    public static final TransfersHubFragment5 INSTANCE = new TransfersHubFragment5();

    TransfersHubFragment5() {
        super(1, FragmentTransfersHubBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/transfers/transferhub/databinding/FragmentTransfersHubBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentTransfersHubBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentTransfersHubBinding.bind(p0);
    }
}
