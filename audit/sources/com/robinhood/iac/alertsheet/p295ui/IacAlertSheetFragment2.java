package com.robinhood.iac.alertsheet.p295ui;

import android.view.View;
import com.robinhood.shared.iac.alertsheet.databinding.FragmentIacAlertSheetBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IacAlertSheetFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.iac.alertsheet.ui.IacAlertSheetFragment$binding$2, reason: use source file name */
/* loaded from: classes15.dex */
/* synthetic */ class IacAlertSheetFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentIacAlertSheetBinding> {
    public static final IacAlertSheetFragment2 INSTANCE = new IacAlertSheetFragment2();

    IacAlertSheetFragment2() {
        super(1, FragmentIacAlertSheetBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/shared/iac/alertsheet/databinding/FragmentIacAlertSheetBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentIacAlertSheetBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentIacAlertSheetBinding.bind(p0);
    }
}
