package com.robinhood.android.waitlist.spot;

import android.view.View;
import com.robinhood.android.waitlist.databinding.FragmentWaitlistSpotBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WaitlistSpotFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.waitlist.spot.WaitlistSpotFragment$binding$2, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class WaitlistSpotFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentWaitlistSpotBinding> {
    public static final WaitlistSpotFragment2 INSTANCE = new WaitlistSpotFragment2();

    WaitlistSpotFragment2() {
        super(1, FragmentWaitlistSpotBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/waitlist/databinding/FragmentWaitlistSpotBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentWaitlistSpotBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentWaitlistSpotBinding.bind(p0);
    }
}
