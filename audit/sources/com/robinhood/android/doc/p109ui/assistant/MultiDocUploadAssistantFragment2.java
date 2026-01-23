package com.robinhood.android.doc.p109ui.assistant;

import android.view.View;
import com.robinhood.android.doc.databinding.FragmentMultiDocUploadAssistantBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MultiDocUploadAssistantFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.doc.ui.assistant.MultiDocUploadAssistantFragment$binding$2, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class MultiDocUploadAssistantFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentMultiDocUploadAssistantBinding> {
    public static final MultiDocUploadAssistantFragment2 INSTANCE = new MultiDocUploadAssistantFragment2();

    MultiDocUploadAssistantFragment2() {
        super(1, FragmentMultiDocUploadAssistantBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/doc/databinding/FragmentMultiDocUploadAssistantBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentMultiDocUploadAssistantBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentMultiDocUploadAssistantBinding.bind(p0);
    }
}
