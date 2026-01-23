package com.robinhood.compose.app;

import android.view.View;
import com.robinhood.android.compose.app.databinding.FragmentGenericComposeBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GenericComposeFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.compose.app.GenericComposeFragment$binding$2, reason: use source file name */
/* loaded from: classes20.dex */
/* synthetic */ class GenericComposeFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentGenericComposeBinding> {
    public static final GenericComposeFragment2 INSTANCE = new GenericComposeFragment2();

    GenericComposeFragment2() {
        super(1, FragmentGenericComposeBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/compose/app/databinding/FragmentGenericComposeBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentGenericComposeBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentGenericComposeBinding.bind(p0);
    }
}
