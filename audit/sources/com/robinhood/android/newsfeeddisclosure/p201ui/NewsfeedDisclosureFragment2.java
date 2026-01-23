package com.robinhood.android.newsfeeddisclosure.p201ui;

import android.view.View;
import com.robinhood.android.newsfeeddisclosure.databinding.FragmentNewsfeedDisclosureBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NewsfeedDisclosureFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.newsfeeddisclosure.ui.NewsfeedDisclosureFragment$binding$2, reason: use source file name */
/* loaded from: classes8.dex */
/* synthetic */ class NewsfeedDisclosureFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentNewsfeedDisclosureBinding> {
    public static final NewsfeedDisclosureFragment2 INSTANCE = new NewsfeedDisclosureFragment2();

    NewsfeedDisclosureFragment2() {
        super(1, FragmentNewsfeedDisclosureBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/newsfeeddisclosure/databinding/FragmentNewsfeedDisclosureBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentNewsfeedDisclosureBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentNewsfeedDisclosureBinding.bind(p0);
    }
}
