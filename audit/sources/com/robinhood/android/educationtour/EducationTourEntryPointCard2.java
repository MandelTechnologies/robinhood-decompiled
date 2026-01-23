package com.robinhood.android.educationtour;

import android.view.View;
import com.robinhood.android.educationtour.databinding.MergeEducationTourEntryPointCardBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EducationTourEntryPointCard.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.educationtour.EducationTourEntryPointCard$binding$2, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class EducationTourEntryPointCard2 extends FunctionReferenceImpl implements Function1<View, MergeEducationTourEntryPointCardBinding> {
    public static final EducationTourEntryPointCard2 INSTANCE = new EducationTourEntryPointCard2();

    EducationTourEntryPointCard2() {
        super(1, MergeEducationTourEntryPointCardBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/educationtour/databinding/MergeEducationTourEntryPointCardBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeEducationTourEntryPointCardBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeEducationTourEntryPointCardBinding.bind(p0);
    }
}
