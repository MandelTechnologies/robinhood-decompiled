package com.robinhood.android.acatsin.dtcentry;

import android.view.View;
import com.robinhood.android.acatsin.databinding.FragmentAcatsInDtcEntryBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInDtcEntryFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.acatsin.dtcentry.AcatsInDtcEntryFragment$binding$2, reason: use source file name */
/* loaded from: classes24.dex */
/* synthetic */ class AcatsInDtcEntryFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentAcatsInDtcEntryBinding> {
    public static final AcatsInDtcEntryFragment2 INSTANCE = new AcatsInDtcEntryFragment2();

    AcatsInDtcEntryFragment2() {
        super(1, FragmentAcatsInDtcEntryBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/acatsin/databinding/FragmentAcatsInDtcEntryBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentAcatsInDtcEntryBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentAcatsInDtcEntryBinding.bind(p0);
    }
}
