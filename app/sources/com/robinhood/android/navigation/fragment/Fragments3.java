package com.robinhood.android.navigation.fragment;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Fragments.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0006\u001a\u00020\u0001*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086\bø\u0001\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0003*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0005\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"}, m3636d2 = {"UNKNOWN_FRAGMENT_TRANSACTION_ID", "", "isStateActive", "", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;)Z", "commitIfActive", "transaction", "Lkotlin/Function0;", "Landroidx/fragment/app/FragmentTransaction;", "lib-navigation_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.navigation.fragment.FragmentsKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class Fragments3 {
    public static final int UNKNOWN_FRAGMENT_TRANSACTION_ID = -1;

    public static final boolean isStateActive(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        return (fragment.isRemoving() || fragment.getChildFragmentManager().isStateSaved()) ? false : true;
    }

    public static final int commitIfActive(Fragment fragment, Function0<? extends FragmentTransaction> transaction) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        if (fragment.isRemoving() || fragment.getChildFragmentManager().isStateSaved()) {
            return -1;
        }
        return transaction.invoke().commitAllowingStateLoss();
    }
}
