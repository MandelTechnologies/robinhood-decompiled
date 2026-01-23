package com.robinhood.android.margin.contracts;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.robinhood.android.navigation.Navigator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SlipHub.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a&\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\"\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"navigateToSlipHub", "", "Landroidx/fragment/app/Fragment;", "context", "Landroid/content/Context;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "source", "", "SLIP_LEARN_AND_EARN", "SLIP_LEARN_AND_EARN_NOT_ELIGIBLE", "contracts_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.margin.contracts.SlipHubKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class SlipHub2 {
    public static final String SLIP_LEARN_AND_EARN = "slip_learn_and_earn";
    public static final String SLIP_LEARN_AND_EARN_NOT_ELIGIBLE = "slip_learn_and_earn_not_eligible";

    public static /* synthetic */ void navigateToSlipHub$default(Fragment fragment, Context context, Navigator navigator, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        navigateToSlipHub(fragment, context, navigator, str);
    }

    public static final void navigateToSlipHub(Fragment fragment, Context context, Navigator navigator, String str) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Navigator.DefaultImpls.startActivity$default(navigator, context, new SlipOnboardingKey(str, null, false, false, 14, null), null, false, null, null, 60, null);
        fragment.requireActivity().finish();
    }
}
