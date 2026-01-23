package com.robinhood.android.settings.settings.account.trustedcontact;

import android.view.View;
import com.robinhood.android.settings.settings.databinding.FragmentTrustedContactDetailBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TrustedContactDetailFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.settings.settings.account.trustedcontact.TrustedContactDetailFragment$binding$2, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class TrustedContactDetailFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentTrustedContactDetailBinding> {
    public static final TrustedContactDetailFragment2 INSTANCE = new TrustedContactDetailFragment2();

    TrustedContactDetailFragment2() {
        super(1, FragmentTrustedContactDetailBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/settings/settings/databinding/FragmentTrustedContactDetailBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentTrustedContactDetailBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentTrustedContactDetailBinding.bind(p0);
    }
}
