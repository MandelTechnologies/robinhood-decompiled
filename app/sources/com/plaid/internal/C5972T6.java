package com.plaid.internal;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import com.plaid.internal.link.LinkActivity;
import com.plaid.link.C7279R;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.T6 */
/* loaded from: classes16.dex */
public final class C5972T6 {
    /* renamed from: a */
    public static final void m1321a(LinkActivity linkActivity) {
        Intrinsics.checkNotNullParameter(linkActivity, "<this>");
        linkActivity.getWindow().addFlags(Integer.MIN_VALUE);
        linkActivity.getWindow().setStatusBarColor(ContextCompat.getColor(linkActivity, C7279R.color.plaid_full_black_opacity_25));
    }

    /* renamed from: a */
    public static final void m1320a(FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "<this>");
        fragmentActivity.getWindow().addFlags(Integer.MIN_VALUE);
        fragmentActivity.getWindow().setStatusBarColor(-1);
        fragmentActivity.getWindow().getDecorView().setSystemUiVisibility(8192);
    }
}
