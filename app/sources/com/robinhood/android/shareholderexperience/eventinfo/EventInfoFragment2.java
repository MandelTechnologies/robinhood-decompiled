package com.robinhood.android.shareholderexperience.eventinfo;

import android.view.View;
import com.robinhood.android.shareholderexperience.databinding.FragmentEventInfoBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventInfoFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.shareholderexperience.eventinfo.EventInfoFragment$binding$2, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class EventInfoFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentEventInfoBinding> {
    public static final EventInfoFragment2 INSTANCE = new EventInfoFragment2();

    EventInfoFragment2() {
        super(1, FragmentEventInfoBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/shareholderexperience/databinding/FragmentEventInfoBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentEventInfoBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentEventInfoBinding.bind(p0);
    }
}
