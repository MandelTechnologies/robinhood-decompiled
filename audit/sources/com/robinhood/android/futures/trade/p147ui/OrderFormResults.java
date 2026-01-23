package com.robinhood.android.futures.trade.p147ui;

import android.os.Bundle;
import androidx.core.os.Bundle2;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.Fragment2;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentResultListener;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrderFormResults.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a5\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00040\t\u001a\u0012\u0010\u000e\u001a\u00020\u0004*\u00020\u000f2\u0006\u0010\r\u001a\u00020\n\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"ORDER_FORM_REQUEST_KEY", "", "ARG_ORDER_FORM_IS_ORDER_SUBMITTED_SUCCESSFULLY", "listenToOrderFormResult", "", "Landroidx/fragment/app/FragmentManager;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "onOrderFormResult", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", OrderFormResults.ARG_ORDER_FORM_IS_ORDER_SUBMITTED_SUCCESSFULLY, "setOrderFormResult", "Landroidx/fragment/app/Fragment;", "feature-futures-trade_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.trade.ui.OrderFormResultsKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class OrderFormResults {
    private static final String ARG_ORDER_FORM_IS_ORDER_SUBMITTED_SUCCESSFULLY = "isOrderSubmittedSuccessfully";
    private static final String ORDER_FORM_REQUEST_KEY = "orderFormRequestKey";

    public static final void listenToOrderFormResult(final FragmentManager fragmentManager, LifecycleOwner lifecycleOwner, final Function1<? super Boolean, Unit> onOrderFormResult) {
        Intrinsics.checkNotNullParameter(fragmentManager, "<this>");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(onOrderFormResult, "onOrderFormResult");
        fragmentManager.setFragmentResultListener(ORDER_FORM_REQUEST_KEY, lifecycleOwner, new FragmentResultListener() { // from class: com.robinhood.android.futures.trade.ui.OrderFormResultsKt.listenToOrderFormResult.1
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(String requestKey, Bundle bundle) {
                Intrinsics.checkNotNullParameter(requestKey, "requestKey");
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                onOrderFormResult.invoke(Boolean.valueOf(bundle.getBoolean(OrderFormResults.ARG_ORDER_FORM_IS_ORDER_SUBMITTED_SUCCESSFULLY, false)));
                fragmentManager.clearFragmentResult(requestKey);
            }
        });
    }

    public static final void setOrderFormResult(Fragment fragment, boolean z) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Fragment2.setFragmentResult(fragment, ORDER_FORM_REQUEST_KEY, Bundle2.bundleOf(Tuples4.m3642to(ARG_ORDER_FORM_IS_ORDER_SUBMITTED_SUCCESSFULLY, Boolean.valueOf(z))));
    }
}
