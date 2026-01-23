package com.robinhood.android.advanced.alert.view;

import android.view.View;
import com.robinhood.android.advanced.alert.databinding.MergeAdvancedAlertItemRowViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvancedAlertSettingItemRowView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advanced.alert.view.AdvancedAlertSettingItemRowView$binding$2, reason: use source file name */
/* loaded from: classes24.dex */
/* synthetic */ class AdvancedAlertSettingItemRowView2 extends FunctionReferenceImpl implements Function1<View, MergeAdvancedAlertItemRowViewBinding> {
    public static final AdvancedAlertSettingItemRowView2 INSTANCE = new AdvancedAlertSettingItemRowView2();

    AdvancedAlertSettingItemRowView2() {
        super(1, MergeAdvancedAlertItemRowViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/advanced/alert/databinding/MergeAdvancedAlertItemRowViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeAdvancedAlertItemRowViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeAdvancedAlertItemRowViewBinding.bind(p0);
    }
}
