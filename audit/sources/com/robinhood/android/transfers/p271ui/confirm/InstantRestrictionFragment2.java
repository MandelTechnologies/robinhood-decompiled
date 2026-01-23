package com.robinhood.android.transfers.p271ui.confirm;

import android.view.View;
import com.robinhood.android.transfers.databinding.FragmentInstantRestrictionBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InstantRestrictionFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ui.confirm.InstantRestrictionFragment$binding$2, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class InstantRestrictionFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentInstantRestrictionBinding> {
    public static final InstantRestrictionFragment2 INSTANCE = new InstantRestrictionFragment2();

    InstantRestrictionFragment2() {
        super(1, FragmentInstantRestrictionBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/transfers/databinding/FragmentInstantRestrictionBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentInstantRestrictionBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentInstantRestrictionBinding.bind(p0);
    }
}
