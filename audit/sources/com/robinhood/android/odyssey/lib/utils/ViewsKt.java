package com.robinhood.android.odyssey.lib.utils;

import android.view.View;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ViewKt;
import com.robinhood.android.odyssey.lib.template.BaseSdFragment;
import com.robinhood.android.odyssey.lib.view.SdBaseView;
import com.robinhood.models.api.serverdrivenui.component.ApiSdBaseIndividualComponentData;
import com.robinhood.models.api.serverdrivenui.component.ApiSdTypedValue;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Views.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0000\u001a\u0018\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0004H\u0000\u001a\u0018\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b*\u00020\u0004H\u0000\u001a\u0012\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b*\u00020\u0004H\u0000¨\u0006\f"}, m3636d2 = {"requireOnSubmitValueMap", "", "", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdTypedValue;", "Landroid/view/View;", "requireComponentCallbacks", "Lcom/robinhood/android/odyssey/lib/view/SdBaseView$Callbacks;", "requireDataChangeMap", "Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdBaseIndividualComponentData;", "requireComponentIds", "", "feature-lib-odyssey_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class ViewsKt {
    public static final Map<String, ApiSdTypedValue> requireOnSubmitValueMap(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Fragment fragmentFindFragment = ViewKt.findFragment(view);
        while (!(fragmentFindFragment instanceof BaseSdFragment)) {
            fragmentFindFragment = fragmentFindFragment.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentFindFragment, "requireParentFragment(...)");
        }
        return ((BaseSdFragment) fragmentFindFragment).getAlternateComponentOnSubmitValueMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final SdBaseView.Callbacks requireComponentCallbacks(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Fragment fragmentFindFragment = ViewKt.findFragment(view);
        while (!(fragmentFindFragment instanceof SdBaseView.Callbacks)) {
            Fragment fragmentRequireParentFragment = fragmentFindFragment.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            fragmentFindFragment = fragmentRequireParentFragment;
        }
        return (SdBaseView.Callbacks) fragmentFindFragment;
    }

    public static final SnapshotStateMap<String, ApiSdBaseIndividualComponentData> requireDataChangeMap(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Fragment fragmentFindFragment = ViewKt.findFragment(view);
        while (!(fragmentFindFragment instanceof BaseSdFragment)) {
            fragmentFindFragment = fragmentFindFragment.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentFindFragment, "requireParentFragment(...)");
        }
        return ((BaseSdFragment) fragmentFindFragment).getComposeComponentDataChangeMap();
    }

    public static final Set<String> requireComponentIds(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Fragment fragmentFindFragment = ViewKt.findFragment(view);
        while (!(fragmentFindFragment instanceof BaseSdFragment)) {
            fragmentFindFragment = fragmentFindFragment.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentFindFragment, "requireParentFragment(...)");
        }
        return ((BaseSdFragment) fragmentFindFragment).getComposeComponentIds();
    }
}
