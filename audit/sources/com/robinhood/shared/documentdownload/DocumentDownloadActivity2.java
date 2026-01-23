package com.robinhood.shared.documentdownload;

import android.view.View;
import com.robinhood.shared.documentdownload.databinding.ActivityDocumentDownloadBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DocumentDownloadActivity.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.documentdownload.DocumentDownloadActivity$binding$2, reason: use source file name */
/* loaded from: classes6.dex */
/* synthetic */ class DocumentDownloadActivity2 extends FunctionReferenceImpl implements Function1<View, ActivityDocumentDownloadBinding> {
    public static final DocumentDownloadActivity2 INSTANCE = new DocumentDownloadActivity2();

    DocumentDownloadActivity2() {
        super(1, ActivityDocumentDownloadBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/shared/documentdownload/databinding/ActivityDocumentDownloadBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ActivityDocumentDownloadBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ActivityDocumentDownloadBinding.bind(p0);
    }
}
