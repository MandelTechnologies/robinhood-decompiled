package com.robinhood.android.directipo.disclosure.p105ui;

import android.view.View;
import com.robinhood.android.directipo.disclosure.databinding.FragmentDirectIpoNotificationDisclosureBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DirectIpoNotificationDisclosureFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.directipo.disclosure.ui.DirectIpoNotificationDisclosureFragment$viewBinding$2, reason: use source file name */
/* loaded from: classes27.dex */
/* synthetic */ class DirectIpoNotificationDisclosureFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentDirectIpoNotificationDisclosureBinding> {
    public static final DirectIpoNotificationDisclosureFragment2 INSTANCE = new DirectIpoNotificationDisclosureFragment2();

    DirectIpoNotificationDisclosureFragment2() {
        super(1, FragmentDirectIpoNotificationDisclosureBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/directipo/disclosure/databinding/FragmentDirectIpoNotificationDisclosureBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentDirectIpoNotificationDisclosureBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentDirectIpoNotificationDisclosureBinding.bind(p0);
    }
}
