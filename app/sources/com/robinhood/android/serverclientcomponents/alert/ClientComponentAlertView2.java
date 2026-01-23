package com.robinhood.android.serverclientcomponents.alert;

import android.view.View;
import com.robinhood.android.serverclientcomponents.databinding.MergeClientComponentAlertViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ClientComponentAlertView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.serverclientcomponents.alert.ClientComponentAlertView$binding$2, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class ClientComponentAlertView2 extends FunctionReferenceImpl implements Function1<View, MergeClientComponentAlertViewBinding> {
    public static final ClientComponentAlertView2 INSTANCE = new ClientComponentAlertView2();

    ClientComponentAlertView2() {
        super(1, MergeClientComponentAlertViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/serverclientcomponents/databinding/MergeClientComponentAlertViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeClientComponentAlertViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeClientComponentAlertViewBinding.bind(p0);
    }
}
