package com.robinhood.android.transfers.i18n;

import android.view.View;
import com.robinhood.android.transfers.transferhub.databinding.FragmentI18nTransfersHubBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InternationalTransfersHubFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
/* synthetic */ class InternationalTransfersHubFragment$binding$2 extends FunctionReferenceImpl implements Function1<View, FragmentI18nTransfersHubBinding> {
    public static final InternationalTransfersHubFragment$binding$2 INSTANCE = new InternationalTransfersHubFragment$binding$2();

    InternationalTransfersHubFragment$binding$2() {
        super(1, FragmentI18nTransfersHubBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/transfers/transferhub/databinding/FragmentI18nTransfersHubBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentI18nTransfersHubBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentI18nTransfersHubBinding.bind(p0);
    }
}
