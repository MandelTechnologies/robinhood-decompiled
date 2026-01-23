package com.robinhood.android.lists.p173ui.ipo;

import android.view.View;
import com.robinhood.android.lists.databinding.FragmentIpoNotificationBottomSheetBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IpoNotificationSettingBottomSheet.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lists.ui.ipo.IpoNotificationSettingBottomSheet$binding$2, reason: use source file name */
/* loaded from: classes8.dex */
/* synthetic */ class IpoNotificationSettingBottomSheet2 extends FunctionReferenceImpl implements Function1<View, FragmentIpoNotificationBottomSheetBinding> {
    public static final IpoNotificationSettingBottomSheet2 INSTANCE = new IpoNotificationSettingBottomSheet2();

    IpoNotificationSettingBottomSheet2() {
        super(1, FragmentIpoNotificationBottomSheetBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/lists/databinding/FragmentIpoNotificationBottomSheetBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentIpoNotificationBottomSheetBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentIpoNotificationBottomSheetBinding.bind(p0);
    }
}
