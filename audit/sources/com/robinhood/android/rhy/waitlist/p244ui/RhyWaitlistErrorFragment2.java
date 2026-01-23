package com.robinhood.android.rhy.waitlist.p244ui;

import android.view.View;
import com.robinhood.android.rhy.waitlist.databinding.FragmentRhyWaitlistErrorBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyWaitlistErrorFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.rhy.waitlist.ui.RhyWaitlistErrorFragment$binding$2, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class RhyWaitlistErrorFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentRhyWaitlistErrorBinding> {
    public static final RhyWaitlistErrorFragment2 INSTANCE = new RhyWaitlistErrorFragment2();

    RhyWaitlistErrorFragment2() {
        super(1, FragmentRhyWaitlistErrorBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/rhy/waitlist/databinding/FragmentRhyWaitlistErrorBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentRhyWaitlistErrorBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentRhyWaitlistErrorBinding.bind(p0);
    }
}
