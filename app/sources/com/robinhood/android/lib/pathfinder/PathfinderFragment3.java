package com.robinhood.android.lib.pathfinder;

import android.view.View;
import com.robinhood.android.lib.pathfinder.databinding.FragmentPathfinderBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PathfinderFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lib.pathfinder.PathfinderFragment$bindings$2, reason: use source file name */
/* loaded from: classes8.dex */
/* synthetic */ class PathfinderFragment3 extends FunctionReferenceImpl implements Function1<View, FragmentPathfinderBinding> {
    public static final PathfinderFragment3 INSTANCE = new PathfinderFragment3();

    PathfinderFragment3() {
        super(1, FragmentPathfinderBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/lib/pathfinder/databinding/FragmentPathfinderBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentPathfinderBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentPathfinderBinding.bind(p0);
    }
}
