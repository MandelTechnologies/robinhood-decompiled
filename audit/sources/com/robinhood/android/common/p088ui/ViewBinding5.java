package com.robinhood.android.common.p088ui;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.Interfaces2;

/* compiled from: ViewBinding.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a4\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004*\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00030\u0006\u001a4\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004*\u00020\u00072\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00030\u0006\u001a4\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004*\u00020\b2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00030\u0006\u001a4\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004*\u00020\t2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00030\u0006¨\u0006\n"}, m3636d2 = {"viewBinding", "Lkotlin/properties/ReadOnlyProperty;", "Landroid/view/View;", "T", "", "factory", "Lkotlin/Function1;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/common/ui/RxFragment;", "Lcom/robinhood/android/common/ui/BaseDialogFragment;", "lib-common_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.ui.ViewBindingKt, reason: use source file name */
/* loaded from: classes17.dex */
public final class ViewBinding5 {
    public static final <T> Interfaces2<View, T> viewBinding(View view, Function1<? super View, ? extends T> factory) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new ViewBinding6(factory);
    }

    public static final <T> Interfaces2<BaseActivity, T> viewBinding(BaseActivity baseActivity, Function1<? super View, ? extends T> factory) {
        Intrinsics.checkNotNullParameter(baseActivity, "<this>");
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new ViewBinding2(factory);
    }

    public static final <T> Interfaces2<RxFragment, T> viewBinding(RxFragment rxFragment, Function1<? super View, ? extends T> factory) {
        Intrinsics.checkNotNullParameter(rxFragment, "<this>");
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new ViewBinding3(rxFragment.getClass(), rxFragment.getLifecycleEvents(), factory);
    }

    public static final <T> Interfaces2<BaseDialogFragment, T> viewBinding(BaseDialogFragment baseDialogFragment, Function1<? super View, ? extends T> factory) {
        Intrinsics.checkNotNullParameter(baseDialogFragment, "<this>");
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new ViewBinding3(baseDialogFragment.getClass(), baseDialogFragment.getLifecycleEvents(), factory);
    }
}
