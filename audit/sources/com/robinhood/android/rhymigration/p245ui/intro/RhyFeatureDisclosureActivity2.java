package com.robinhood.android.rhymigration.p245ui.intro;

import android.view.View;
import com.robinhood.android.rhymigration.databinding.ActivityRhyFeatureDisclosureBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyFeatureDisclosureActivity.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.rhymigration.ui.intro.RhyFeatureDisclosureActivity$binding$2, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class RhyFeatureDisclosureActivity2 extends FunctionReferenceImpl implements Function1<View, ActivityRhyFeatureDisclosureBinding> {
    public static final RhyFeatureDisclosureActivity2 INSTANCE = new RhyFeatureDisclosureActivity2();

    RhyFeatureDisclosureActivity2() {
        super(1, ActivityRhyFeatureDisclosureBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/rhymigration/databinding/ActivityRhyFeatureDisclosureBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ActivityRhyFeatureDisclosureBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ActivityRhyFeatureDisclosureBinding.bind(p0);
    }
}
