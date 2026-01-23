package com.robinhood.android.securitycenter.p251ui.devices;

import android.view.View;
import com.robinhood.android.securitycenter.databinding.FragmentDeviceDetailsBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeviceDetailsFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.securitycenter.ui.devices.DeviceDetailsFragment$binding$2, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class DeviceDetailsFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentDeviceDetailsBinding> {
    public static final DeviceDetailsFragment2 INSTANCE = new DeviceDetailsFragment2();

    DeviceDetailsFragment2() {
        super(1, FragmentDeviceDetailsBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/securitycenter/databinding/FragmentDeviceDetailsBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentDeviceDetailsBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentDeviceDetailsBinding.bind(p0);
    }
}
