package com.robinhood.android.transfers;

import android.view.View;
import com.robinhood.android.transfers.transferhub.databinding.ActivityLinkingOptionsBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LinkingOptionsActivity.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.LinkingOptionsActivity$binding$2, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class LinkingOptionsActivity2 extends FunctionReferenceImpl implements Function1<View, ActivityLinkingOptionsBinding> {
    public static final LinkingOptionsActivity2 INSTANCE = new LinkingOptionsActivity2();

    LinkingOptionsActivity2() {
        super(1, ActivityLinkingOptionsBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/transfers/transferhub/databinding/ActivityLinkingOptionsBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ActivityLinkingOptionsBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ActivityLinkingOptionsBinding.bind(p0);
    }
}
