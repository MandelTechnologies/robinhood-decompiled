package com.robinhood.android.settings.settings.account.trustedcontact;

import android.view.View;
import com.robinhood.android.settings.settings.databinding.MergeTrustedContactAddressInputBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TrustedContactAddressInput.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.settings.settings.account.trustedcontact.TrustedContactAddressInput$binding$2, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class TrustedContactAddressInput2 extends FunctionReferenceImpl implements Function1<View, MergeTrustedContactAddressInputBinding> {
    public static final TrustedContactAddressInput2 INSTANCE = new TrustedContactAddressInput2();

    TrustedContactAddressInput2() {
        super(1, MergeTrustedContactAddressInputBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/settings/settings/databinding/MergeTrustedContactAddressInputBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeTrustedContactAddressInputBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeTrustedContactAddressInputBinding.bind(p0);
    }
}
