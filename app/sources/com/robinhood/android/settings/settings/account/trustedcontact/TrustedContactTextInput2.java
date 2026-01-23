package com.robinhood.android.settings.settings.account.trustedcontact;

import android.view.View;
import com.robinhood.android.settings.settings.databinding.MergeTrustedContactTextInputBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TrustedContactTextInput.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.settings.settings.account.trustedcontact.TrustedContactTextInput$binding$2, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class TrustedContactTextInput2 extends FunctionReferenceImpl implements Function1<View, MergeTrustedContactTextInputBinding> {
    public static final TrustedContactTextInput2 INSTANCE = new TrustedContactTextInput2();

    TrustedContactTextInput2() {
        super(1, MergeTrustedContactTextInputBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/settings/settings/databinding/MergeTrustedContactTextInputBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeTrustedContactTextInputBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeTrustedContactTextInputBinding.bind(p0);
    }
}
