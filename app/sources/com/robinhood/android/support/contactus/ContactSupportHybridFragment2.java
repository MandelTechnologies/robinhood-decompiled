package com.robinhood.android.support.contactus;

import android.view.View;
import com.robinhood.shared.support.databinding.FragmentContactSupportHybridBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ContactSupportHybridFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.support.contactus.ContactSupportHybridFragment$bindings$2, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class ContactSupportHybridFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentContactSupportHybridBinding> {
    public static final ContactSupportHybridFragment2 INSTANCE = new ContactSupportHybridFragment2();

    ContactSupportHybridFragment2() {
        super(1, FragmentContactSupportHybridBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/shared/support/databinding/FragmentContactSupportHybridBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentContactSupportHybridBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentContactSupportHybridBinding.bind(p0);
    }
}
