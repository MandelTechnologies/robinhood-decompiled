package com.withpersona.sdk2.inquiry.steps.p423ui;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.withpersona.sdk2.inquiry.shared.databinding.Pi2GenericUiStepBottomSheetBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UiStepBottomSheet.kt */
@Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.steps.ui.UiStepBottomSheet$viewFactory$1, reason: use source file name */
/* loaded from: classes18.dex */
/* synthetic */ class UiStepBottomSheet2 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, Pi2GenericUiStepBottomSheetBinding> {
    public static final UiStepBottomSheet2 INSTANCE = new UiStepBottomSheet2();

    UiStepBottomSheet2() {
        super(3, Pi2GenericUiStepBottomSheetBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/shared/databinding/Pi2GenericUiStepBottomSheetBinding;", 0);
    }

    public final Pi2GenericUiStepBottomSheetBinding invoke(LayoutInflater p0, ViewGroup viewGroup, boolean z) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return Pi2GenericUiStepBottomSheetBinding.inflate(p0, viewGroup, z);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Pi2GenericUiStepBottomSheetBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
        return invoke(layoutInflater, viewGroup, bool.booleanValue());
    }
}
