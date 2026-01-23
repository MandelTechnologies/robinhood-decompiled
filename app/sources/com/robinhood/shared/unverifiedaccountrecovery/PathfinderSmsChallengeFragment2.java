package com.robinhood.shared.unverifiedaccountrecovery;

import android.view.View;
import com.robinhood.shared.unverifiedaccountrecovery.databinding.FragmentPathfinderSmsChallengeBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PathfinderSmsChallengeFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.unverifiedaccountrecovery.PathfinderSmsChallengeFragment$binding$2, reason: use source file name */
/* loaded from: classes12.dex */
/* synthetic */ class PathfinderSmsChallengeFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentPathfinderSmsChallengeBinding> {
    public static final PathfinderSmsChallengeFragment2 INSTANCE = new PathfinderSmsChallengeFragment2();

    PathfinderSmsChallengeFragment2() {
        super(1, FragmentPathfinderSmsChallengeBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/shared/unverifiedaccountrecovery/databinding/FragmentPathfinderSmsChallengeBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentPathfinderSmsChallengeBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentPathfinderSmsChallengeBinding.bind(p0);
    }
}
