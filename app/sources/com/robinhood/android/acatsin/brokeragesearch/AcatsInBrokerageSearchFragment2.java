package com.robinhood.android.acatsin.brokeragesearch;

import android.view.View;
import com.robinhood.android.acatsin.databinding.FragmentAcatsInBrokerageSearchBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInBrokerageSearchFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.acatsin.brokeragesearch.AcatsInBrokerageSearchFragment$binding$2, reason: use source file name */
/* loaded from: classes24.dex */
/* synthetic */ class AcatsInBrokerageSearchFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentAcatsInBrokerageSearchBinding> {
    public static final AcatsInBrokerageSearchFragment2 INSTANCE = new AcatsInBrokerageSearchFragment2();

    AcatsInBrokerageSearchFragment2() {
        super(1, FragmentAcatsInBrokerageSearchBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/acatsin/databinding/FragmentAcatsInBrokerageSearchBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentAcatsInBrokerageSearchBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentAcatsInBrokerageSearchBinding.bind(p0);
    }
}
