package com.robinhood.android.recurring.hub;

import android.view.View;
import com.robinhood.android.recurring.hub.databinding.FragmentRecurringHubBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringHubFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.recurring.hub.RecurringHubFragment$binding$2, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class RecurringHubFragment3 extends FunctionReferenceImpl implements Function1<View, FragmentRecurringHubBinding> {
    public static final RecurringHubFragment3 INSTANCE = new RecurringHubFragment3();

    RecurringHubFragment3() {
        super(1, FragmentRecurringHubBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/recurring/hub/databinding/FragmentRecurringHubBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentRecurringHubBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentRecurringHubBinding.bind(p0);
    }
}
