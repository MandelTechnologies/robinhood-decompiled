package com.robinhood.android.portfolio.contracts;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentResultListener;
import androidx.lifecycle.LifecycleOwner;
import com.robinhood.android.navigation.Navigator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PositionsSortOptionsKey.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a8\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\n\"\u000e\u0010\f\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"launchSortOptionsFragment", "", "Lcom/robinhood/android/navigation/Navigator;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "key", "Lcom/robinhood/android/portfolio/contracts/PositionsSortOptionsKey;", "tag", "", "onResult", "Lkotlin/Function1;", "Lcom/robinhood/android/portfolio/contracts/PositionsSortResult;", "SORT_OPTIONS_REQUEST_KEY", "SORT_OPTIONS_RESULT_BUNDLE_KEY", "contracts_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.portfolio.contracts.PositionsSortOptionsKeyKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class PositionsSortOptionsKey2 {
    public static final String SORT_OPTIONS_REQUEST_KEY = "sort_options_request_key";
    public static final String SORT_OPTIONS_RESULT_BUNDLE_KEY = "sort_options_result_bundle_key";

    public static /* synthetic */ void launchSortOptionsFragment$default(Navigator navigator, FragmentManager fragmentManager, PositionsSortOptionsKey positionsSortOptionsKey, String str, Function1 function1, int i, Object obj) {
        if ((i & 8) != 0) {
            function1 = new Function1() { // from class: com.robinhood.android.portfolio.contracts.PositionsSortOptionsKeyKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return PositionsSortOptionsKey2.launchSortOptionsFragment$lambda$0((PositionsSortResult) obj2);
                }
            };
        }
        launchSortOptionsFragment(navigator, fragmentManager, positionsSortOptionsKey, str, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchSortOptionsFragment$lambda$0(PositionsSortResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public static final void launchSortOptionsFragment(Navigator navigator, FragmentManager fragmentManager, PositionsSortOptionsKey key, String tag, final Function1<? super PositionsSortResult, Unit> onResult) {
        Intrinsics.checkNotNullParameter(navigator, "<this>");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        List<Fragment> fragments = fragmentManager.getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        fragmentManager.setFragmentResultListener(SORT_OPTIONS_REQUEST_KEY, (LifecycleOwner) CollectionsKt.last((List) fragments), new FragmentResultListener() { // from class: com.robinhood.android.portfolio.contracts.PositionsSortOptionsKeyKt.launchSortOptionsFragment.2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(String requestKey, Bundle bundle) {
                Intrinsics.checkNotNullParameter(requestKey, "requestKey");
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                if (requestKey.hashCode() == 2020167789 && requestKey.equals(PositionsSortOptionsKey2.SORT_OPTIONS_REQUEST_KEY)) {
                    Function1<PositionsSortResult, Unit> function1 = onResult;
                    Parcelable parcelable = bundle.getParcelable(PositionsSortOptionsKey2.SORT_OPTIONS_RESULT_BUNDLE_KEY);
                    Intrinsics.checkNotNull(parcelable);
                    function1.invoke(parcelable);
                }
            }
        });
        Navigator.DefaultImpls.createDialogFragment$default(navigator, key, null, 2, null).show(fragmentManager, tag);
    }
}
