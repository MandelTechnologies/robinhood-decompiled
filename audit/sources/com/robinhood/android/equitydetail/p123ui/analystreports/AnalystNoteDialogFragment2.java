package com.robinhood.android.equitydetail.p123ui.analystreports;

import android.view.View;
import com.robinhood.android.equitydetail.databinding.DialogAnalystNoteBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AnalystNoteDialogFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equitydetail.ui.analystreports.AnalystNoteDialogFragment$binding$2, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class AnalystNoteDialogFragment2 extends FunctionReferenceImpl implements Function1<View, DialogAnalystNoteBinding> {
    public static final AnalystNoteDialogFragment2 INSTANCE = new AnalystNoteDialogFragment2();

    AnalystNoteDialogFragment2() {
        super(1, DialogAnalystNoteBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/equitydetail/databinding/DialogAnalystNoteBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final DialogAnalystNoteBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return DialogAnalystNoteBinding.bind(p0);
    }
}
