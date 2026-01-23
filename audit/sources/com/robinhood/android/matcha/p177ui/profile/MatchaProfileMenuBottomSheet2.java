package com.robinhood.android.matcha.p177ui.profile;

import android.view.View;
import com.robinhood.android.matcha.databinding.FragmentMatchaProfileMenuBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchaProfileMenuBottomSheet.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.matcha.ui.profile.MatchaProfileMenuBottomSheet$binding$2, reason: use source file name */
/* loaded from: classes8.dex */
/* synthetic */ class MatchaProfileMenuBottomSheet2 extends FunctionReferenceImpl implements Function1<View, FragmentMatchaProfileMenuBinding> {
    public static final MatchaProfileMenuBottomSheet2 INSTANCE = new MatchaProfileMenuBottomSheet2();

    MatchaProfileMenuBottomSheet2() {
        super(1, FragmentMatchaProfileMenuBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/matcha/databinding/FragmentMatchaProfileMenuBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentMatchaProfileMenuBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentMatchaProfileMenuBinding.bind(p0);
    }
}
