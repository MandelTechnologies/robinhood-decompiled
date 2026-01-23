package com.robinhood.android.feature.instantinfo;

import android.view.View;
import com.robinhood.android.feature_instant_info.databinding.FragmentPostDepositInstantInfoBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PostDepositInstantInfoScreenFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.feature.instantinfo.PostDepositInstantInfoScreenFragment$binding$2, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class PostDepositInstantInfoScreenFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentPostDepositInstantInfoBinding> {
    public static final PostDepositInstantInfoScreenFragment2 INSTANCE = new PostDepositInstantInfoScreenFragment2();

    PostDepositInstantInfoScreenFragment2() {
        super(1, FragmentPostDepositInstantInfoBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/feature_instant_info/databinding/FragmentPostDepositInstantInfoBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentPostDepositInstantInfoBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentPostDepositInstantInfoBinding.bind(p0);
    }
}
