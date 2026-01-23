package com.robinhood.android.onboarding.directipo.p203ui;

import android.view.View;
import com.robinhood.android.onboarding.directipo.databinding.FragmentDirectIpoLearnMoreBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DirectIpoOnboardingLearnMoreDialogFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.onboarding.directipo.ui.DirectIpoOnboardingLearnMoreDialogFragment$binding$2, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class DirectIpoOnboardingLearnMoreDialogFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentDirectIpoLearnMoreBinding> {
    public static final DirectIpoOnboardingLearnMoreDialogFragment2 INSTANCE = new DirectIpoOnboardingLearnMoreDialogFragment2();

    DirectIpoOnboardingLearnMoreDialogFragment2() {
        super(1, FragmentDirectIpoLearnMoreBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/onboarding/directipo/databinding/FragmentDirectIpoLearnMoreBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentDirectIpoLearnMoreBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentDirectIpoLearnMoreBinding.bind(p0);
    }
}
