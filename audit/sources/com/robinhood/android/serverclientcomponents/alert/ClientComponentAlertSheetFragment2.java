package com.robinhood.android.serverclientcomponents.alert;

import android.view.View;
import com.robinhood.android.serverclientcomponents.databinding.FragmentClientComponentAlertSheetBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ClientComponentAlertSheetFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.serverclientcomponents.alert.ClientComponentAlertSheetFragment$binding$2, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class ClientComponentAlertSheetFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentClientComponentAlertSheetBinding> {
    public static final ClientComponentAlertSheetFragment2 INSTANCE = new ClientComponentAlertSheetFragment2();

    ClientComponentAlertSheetFragment2() {
        super(1, FragmentClientComponentAlertSheetBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/serverclientcomponents/databinding/FragmentClientComponentAlertSheetBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentClientComponentAlertSheetBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentClientComponentAlertSheetBinding.bind(p0);
    }
}
