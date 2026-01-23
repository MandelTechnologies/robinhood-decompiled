package com.withpersona.sdk2.inquiry.permissions;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.withpersona.sdk2.inquiry.permissions.databinding.Pi2CheckRequestPermissionRationaleStateBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CheckRequestPermissionRationaleStateView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.permissions.CheckRequestPermissionRationaleStateView$viewFactory$1, reason: use source file name */
/* loaded from: classes18.dex */
/* synthetic */ class CheckRequestPermissionRationaleStateView2 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, Pi2CheckRequestPermissionRationaleStateBinding> {
    public static final CheckRequestPermissionRationaleStateView2 INSTANCE = new CheckRequestPermissionRationaleStateView2();

    CheckRequestPermissionRationaleStateView2() {
        super(3, Pi2CheckRequestPermissionRationaleStateBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/permissions/databinding/Pi2CheckRequestPermissionRationaleStateBinding;", 0);
    }

    public final Pi2CheckRequestPermissionRationaleStateBinding invoke(LayoutInflater p0, ViewGroup viewGroup, boolean z) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return Pi2CheckRequestPermissionRationaleStateBinding.inflate(p0, viewGroup, z);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Pi2CheckRequestPermissionRationaleStateBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
        return invoke(layoutInflater, viewGroup, bool.booleanValue());
    }
}
