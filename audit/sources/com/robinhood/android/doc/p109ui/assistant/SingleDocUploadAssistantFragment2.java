package com.robinhood.android.doc.p109ui.assistant;

import android.view.View;
import com.robinhood.android.doc.databinding.FragmentSingleDocUploadAssistantBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SingleDocUploadAssistantFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.doc.ui.assistant.SingleDocUploadAssistantFragment$binding$2, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class SingleDocUploadAssistantFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentSingleDocUploadAssistantBinding> {
    public static final SingleDocUploadAssistantFragment2 INSTANCE = new SingleDocUploadAssistantFragment2();

    SingleDocUploadAssistantFragment2() {
        super(1, FragmentSingleDocUploadAssistantBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/doc/databinding/FragmentSingleDocUploadAssistantBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentSingleDocUploadAssistantBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentSingleDocUploadAssistantBinding.bind(p0);
    }
}
