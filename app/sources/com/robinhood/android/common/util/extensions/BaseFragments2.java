package com.robinhood.android.common.util.extensions;

import android.view.View;
import android.view.ViewGroup;
import com.jakewharton.rxbinding3.view.RxView;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.view.FragmentContainerLayout;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.compose.bento.component.BentoCurrencyPicker;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.utils.extensions.ViewsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseFragments.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0007"}, m3636d2 = {"setContentBelowToolbar", "", "Lcom/robinhood/android/common/ui/BaseFragment;", BentoCurrencyPicker.ROOT_TEST_TAG, "Landroid/view/View;", "setFullScreenWithSystemUiFlags", "removeFullScreenWithSystemUiFlags", "lib-common_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.util.extensions.BaseFragmentsKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class BaseFragments2 {
    public static final void setContentBelowToolbar(final BaseFragment baseFragment, final View root) {
        Intrinsics.checkNotNullParameter(baseFragment, "<this>");
        Intrinsics.checkNotNullParameter(root, "root");
        ViewGroup.LayoutParams layoutParams = root.getLayoutParams();
        FragmentContainerLayout.LayoutParams layoutParams2 = layoutParams instanceof FragmentContainerLayout.LayoutParams ? (FragmentContainerLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            throw new IllegalStateException("View must be inside FragmentContainerLayout");
        }
        layoutParams2.setUnderneathToolbar(true);
        LifecycleHost.DefaultImpls.bind$default(baseFragment, RxView.layoutChanges(baseFragment.requireToolbar()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.util.extensions.BaseFragmentsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseFragments2.setContentBelowToolbar$lambda$0(root, baseFragment, (Unit) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setContentBelowToolbar$lambda$0(View view, BaseFragment baseFragment, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        RhToolbar rhToolbar = baseFragment.getRhToolbar();
        ViewsKt.setTopPadding(view, rhToolbar != null ? rhToolbar.getBottom() : 0);
        return Unit.INSTANCE;
    }

    public static final void setFullScreenWithSystemUiFlags(BaseFragment baseFragment) {
        Intrinsics.checkNotNullParameter(baseFragment, "<this>");
        View decorView = baseFragment.requireActivity().getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1280);
    }

    public static final void removeFullScreenWithSystemUiFlags(BaseFragment baseFragment) {
        Intrinsics.checkNotNullParameter(baseFragment, "<this>");
        View decorView = baseFragment.requireActivity().getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-1281));
    }
}
