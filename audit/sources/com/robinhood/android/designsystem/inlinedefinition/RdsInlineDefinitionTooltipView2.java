package com.robinhood.android.designsystem.inlinedefinition;

import android.view.View;
import com.robinhood.android.designsystem.inlinedefinition.databinding.MergeRdsInlineDefinitionTooltipViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RdsInlineDefinitionTooltipView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.designsystem.inlinedefinition.RdsInlineDefinitionTooltipView$binding$2, reason: use source file name */
/* loaded from: classes2.dex */
/* synthetic */ class RdsInlineDefinitionTooltipView2 extends FunctionReferenceImpl implements Function1<View, MergeRdsInlineDefinitionTooltipViewBinding> {
    public static final RdsInlineDefinitionTooltipView2 INSTANCE = new RdsInlineDefinitionTooltipView2();

    RdsInlineDefinitionTooltipView2() {
        super(1, MergeRdsInlineDefinitionTooltipViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/designsystem/inlinedefinition/databinding/MergeRdsInlineDefinitionTooltipViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeRdsInlineDefinitionTooltipViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeRdsInlineDefinitionTooltipViewBinding.bind(p0);
    }
}
