package com.robinhood.android.settings.settings.account.trustedcontact;

import android.view.View;
import com.robinhood.android.settings.settings.databinding.FragmentTrustedContactUpdateBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TrustedContactUpdateFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.settings.settings.account.trustedcontact.TrustedContactUpdateFragment$binding$2, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class TrustedContactUpdateFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentTrustedContactUpdateBinding> {
    public static final TrustedContactUpdateFragment2 INSTANCE = new TrustedContactUpdateFragment2();

    TrustedContactUpdateFragment2() {
        super(1, FragmentTrustedContactUpdateBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/settings/settings/databinding/FragmentTrustedContactUpdateBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentTrustedContactUpdateBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentTrustedContactUpdateBinding.bind(p0);
    }
}
