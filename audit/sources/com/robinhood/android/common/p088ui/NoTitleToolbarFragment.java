package com.robinhood.android.common.p088ui;

import android.content.res.Resources;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NoTitleToolbarFragment.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/common/ui/NoTitleToolbarFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "layoutRes", "", "<init>", "(I)V", "()V", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onPause", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public class NoTitleToolbarFragment extends BaseFragment {
    public static final int $stable = 8;

    public NoTitleToolbarFragment(int i) {
        super(i);
    }

    public NoTitleToolbarFragment() {
        this(0);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setTitle((CharSequence) null);
        toolbar.setElevation(0.0f);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onPause() throws Resources.NotFoundException {
        super.onPause();
        if (isRemoving()) {
            float dimension = getResources().getDimension(C11048R.dimen.toolbar_elevation);
            BaseActivity baseActivity = getBaseActivity();
            Intrinsics.checkNotNull(baseActivity);
            RhToolbar rhToolbar = baseActivity.getRhToolbar();
            Intrinsics.checkNotNull(rhToolbar);
            rhToolbar.setElevation(dimension);
        }
    }
}
