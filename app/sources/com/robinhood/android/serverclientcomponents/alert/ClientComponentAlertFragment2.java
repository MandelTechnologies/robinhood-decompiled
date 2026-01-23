package com.robinhood.android.serverclientcomponents.alert;

import android.view.View;
import com.robinhood.android.serverclientcomponents.databinding.FragmentClientComponentAlertBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ClientComponentAlertFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.serverclientcomponents.alert.ClientComponentAlertFragment$binding$2, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class ClientComponentAlertFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentClientComponentAlertBinding> {
    public static final ClientComponentAlertFragment2 INSTANCE = new ClientComponentAlertFragment2();

    ClientComponentAlertFragment2() {
        super(1, FragmentClientComponentAlertBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/serverclientcomponents/databinding/FragmentClientComponentAlertBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentClientComponentAlertBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentClientComponentAlertBinding.bind(p0);
    }
}
