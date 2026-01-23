package com.robinhood.android.odyssey.lib.view;

import android.util.SparseArray;
import com.robinhood.utils.extensions.SparseArrays2;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SdLinearLayout.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.odyssey.lib.view.SdLinearLayout$SavedState$equals$1, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class SdLinearLayout2 extends FunctionReferenceImpl implements Function2<SparseArray<?>, SparseArray<? extends Object>, Boolean> {
    public static final SdLinearLayout2 INSTANCE = new SdLinearLayout2();

    SdLinearLayout2() {
        super(2, SparseArrays2.class, "contentEqualsCompat", "contentEqualsCompat(Landroid/util/SparseArray;Landroid/util/SparseArray;)Z", 1);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Boolean invoke(SparseArray<?> p0, SparseArray<? extends Object> sparseArray) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return Boolean.valueOf(SparseArrays2.contentEqualsCompat(p0, sparseArray));
    }
}
