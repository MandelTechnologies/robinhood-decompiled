package com.withpersona.sdk2.inquiry.permissions;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.withpersona.sdk2.inquiry.permissions.databinding.Pi2RequestPermissionRationaleBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BottomSheetDialogView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.permissions.BottomSheetDialogView$viewFactory$1, reason: use source file name */
/* loaded from: classes18.dex */
/* synthetic */ class BottomSheetDialogView3 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, Pi2RequestPermissionRationaleBinding> {
    public static final BottomSheetDialogView3 INSTANCE = new BottomSheetDialogView3();

    BottomSheetDialogView3() {
        super(3, Pi2RequestPermissionRationaleBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/permissions/databinding/Pi2RequestPermissionRationaleBinding;", 0);
    }

    public final Pi2RequestPermissionRationaleBinding invoke(LayoutInflater p0, ViewGroup viewGroup, boolean z) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return Pi2RequestPermissionRationaleBinding.inflate(p0, viewGroup, z);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Pi2RequestPermissionRationaleBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
        return invoke(layoutInflater, viewGroup, bool.booleanValue());
    }
}
