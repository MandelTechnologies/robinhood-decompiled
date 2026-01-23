package com.robinhood.android.navigation.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Activities.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0004\u001a\u00020\u0005*\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0086\bø\u0001\u0000\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\t"}, m3636d2 = {"isStateActive", "", "Landroidx/appcompat/app/AppCompatActivity;", "(Landroidx/appcompat/app/AppCompatActivity;)Z", "commitIfActive", "", "transaction", "Lkotlin/Function0;", "Landroidx/fragment/app/FragmentTransaction;", "lib-navigation_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.navigation.fragment.ActivitiesKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class Activities2 {
    public static final boolean isStateActive(AppCompatActivity appCompatActivity) {
        Intrinsics.checkNotNullParameter(appCompatActivity, "<this>");
        return (appCompatActivity.isFinishing() || appCompatActivity.getSupportFragmentManager().isStateSaved()) ? false : true;
    }

    public static final int commitIfActive(AppCompatActivity appCompatActivity, Function0<? extends FragmentTransaction> transaction) {
        Intrinsics.checkNotNullParameter(appCompatActivity, "<this>");
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        if (appCompatActivity.isFinishing() || appCompatActivity.getSupportFragmentManager().isStateSaved()) {
            return -1;
        }
        return transaction.invoke().commitAllowingStateLoss();
    }
}
