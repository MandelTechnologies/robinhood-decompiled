package com.robinhood.android.optionsstrategybuilder;

import android.view.View;
import com.robinhood.android.optionsstrategybuilder.databinding.ActivityOptionStrategyBuilderBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionStrategyBuilderActivity.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderActivity$binding$2, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class OptionStrategyBuilderActivity2 extends FunctionReferenceImpl implements Function1<View, ActivityOptionStrategyBuilderBinding> {
    public static final OptionStrategyBuilderActivity2 INSTANCE = new OptionStrategyBuilderActivity2();

    OptionStrategyBuilderActivity2() {
        super(1, ActivityOptionStrategyBuilderBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/optionsstrategybuilder/databinding/ActivityOptionStrategyBuilderBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ActivityOptionStrategyBuilderBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ActivityOptionStrategyBuilderBinding.bind(p0);
    }
}
