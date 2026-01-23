package com.robinhood.android.common.util.extensions;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* compiled from: Fragments.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\f0\u000b\"\u0004\b\u0000\u0010\f*\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e\u001a0\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\f0\u000b\"\b\b\u0000\u0010\f*\u00020\u000f*\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\f0\u0011\u001a/\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\f0\u000b\"\b\b\u0000\u0010\f*\u00020\u000f*\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u0002H\f¢\u0006\u0002\u0010\u0012\u001a8\u0010\u0013\u001a\u0002H\f\"\b\b\u0000\u0010\f*\u00020\u0002*\u0002H\f2\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015¢\u0006\u0002\b\u0018H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u0019\u001a\u0010\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b*\u00020\u0002\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u001b\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001c"}, m3636d2 = {"baseActivity", "Lcom/robinhood/android/common/ui/BaseActivity;", "Landroidx/fragment/app/Fragment;", "getBaseActivity", "(Landroidx/fragment/app/Fragment;)Lcom/robinhood/android/common/ui/BaseActivity;", "activityErrorHandler", "Lcom/robinhood/android/common/util/rx/ActivityErrorHandler;", "", "getActivityErrorHandler", "(Landroidx/fragment/app/Fragment;)Lcom/robinhood/android/common/util/rx/ActivityErrorHandler;", "argument", "Lkotlin/Lazy;", "T", "key", "", "", "defaultValue", "Lkotlin/Function0;", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;Ljava/lang/Object;)Lkotlin/Lazy;", "applyArguments", "argsFn", "Lkotlin/Function1;", "Landroid/os/Bundle;", "", "Lkotlin/ExtensionFunctionType;", "(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)Landroidx/fragment/app/Fragment;", "parentFragments", "Lkotlin/sequences/Sequence;", "lib-common_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.util.extensions.FragmentsKt, reason: use source file name */
/* loaded from: classes17.dex */
public final class Fragments2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Object argument$lambda$3(Object obj) {
        return obj;
    }

    public static final BaseActivity getBaseActivity(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        FragmentActivity activity = fragment.getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.robinhood.android.common.ui.BaseActivity");
        return (BaseActivity) activity;
    }

    public static final ActivityErrorHandler getActivityErrorHandler(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        return getBaseActivity(fragment).getActivityErrorHandler();
    }

    public static final <T> Lazy<T> argument(final Fragment fragment, final String key) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0() { // from class: com.robinhood.android.common.util.extensions.FragmentsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Fragments2.argument$lambda$1(fragment, key);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object argument$lambda$1(Fragment fragment, String str) {
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            String tag = fragment.getTag();
            if (tag == null) {
                tag = "";
            }
            throw new IllegalStateException(("Error: arguments to fragment " + tag + " must not be null.").toString());
        }
        return arguments.get(str);
    }

    public static final <T> Lazy<T> argument(final Fragment fragment, final String key, final Function0<? extends T> defaultValue) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0() { // from class: com.robinhood.android.common.util.extensions.FragmentsKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Fragments2.argument$lambda$2(fragment, key, defaultValue);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object argument$lambda$2(Fragment fragment, String str, Function0 function0) {
        Bundle arguments = fragment.getArguments();
        Object obj = arguments != null ? arguments.get(str) : null;
        return obj == null ? function0.invoke() : obj;
    }

    public static final <T> Lazy<T> argument(Fragment fragment, String key, final T defaultValue) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return argument(fragment, key, new Function0() { // from class: com.robinhood.android.common.util.extensions.FragmentsKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Fragments2.argument$lambda$3(defaultValue);
            }
        });
    }

    public static final <T extends Fragment> T applyArguments(T t, Function1<? super Bundle, Unit> argsFn) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(argsFn, "argsFn");
        Bundle bundle = new Bundle();
        argsFn.invoke(bundle);
        t.setArguments(bundle);
        return t;
    }

    public static final Sequence<Fragment> parentFragments(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        return SequencesKt.generateSequence(fragment, (Function1<? super Fragment, ? extends Fragment>) new Function1() { // from class: com.robinhood.android.common.util.extensions.FragmentsKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Fragments2.parentFragments$lambda$5((Fragment) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Fragment parentFragments$lambda$5(Fragment it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getParentFragment();
    }
}
