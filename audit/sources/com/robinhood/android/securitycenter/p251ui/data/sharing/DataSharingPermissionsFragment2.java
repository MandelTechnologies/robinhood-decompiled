package com.robinhood.android.securitycenter.p251ui.data.sharing;

import android.view.View;
import com.robinhood.android.securitycenter.databinding.FragmentDataSharingPermissionsBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DataSharingPermissionsFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.securitycenter.ui.data.sharing.DataSharingPermissionsFragment$binding$2, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class DataSharingPermissionsFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentDataSharingPermissionsBinding> {
    public static final DataSharingPermissionsFragment2 INSTANCE = new DataSharingPermissionsFragment2();

    DataSharingPermissionsFragment2() {
        super(1, FragmentDataSharingPermissionsBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/securitycenter/databinding/FragmentDataSharingPermissionsBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentDataSharingPermissionsBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentDataSharingPermissionsBinding.bind(p0);
    }
}
