package com.robinhood.android.crypto.p094ui.view.availableCoins;

import android.view.View;
import com.robinhood.android.crypto.databinding.MergeAvailableCoinsBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AvailableCoinsView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.crypto.ui.view.availableCoins.AvailableCoinsView$binding$2, reason: use source file name */
/* loaded from: classes2.dex */
/* synthetic */ class AvailableCoinsView2 extends FunctionReferenceImpl implements Function1<View, MergeAvailableCoinsBinding> {
    public static final AvailableCoinsView2 INSTANCE = new AvailableCoinsView2();

    AvailableCoinsView2() {
        super(1, MergeAvailableCoinsBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/crypto/databinding/MergeAvailableCoinsBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeAvailableCoinsBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeAvailableCoinsBinding.bind(p0);
    }
}
