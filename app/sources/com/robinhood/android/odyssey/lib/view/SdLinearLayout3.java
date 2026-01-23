package com.robinhood.android.odyssey.lib.view;

import android.util.SparseArray;
import com.robinhood.utils.extensions.SparseArrays2;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SdLinearLayout.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.odyssey.lib.view.SdLinearLayout$SavedState$hashCode$1, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class SdLinearLayout3 extends FunctionReferenceImpl implements Function1<SparseArray<?>, Integer> {
    public static final SdLinearLayout3 INSTANCE = new SdLinearLayout3();

    SdLinearLayout3() {
        super(1, SparseArrays2.class, "contentHashCodeCompat", "contentHashCodeCompat(Landroid/util/SparseArray;)I", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Integer invoke(SparseArray<?> p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return Integer.valueOf(SparseArrays2.contentHashCodeCompat(p0));
    }
}
