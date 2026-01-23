package com.robinhood.android.equitydetail.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.equitydetail.p123ui.ipo.S1SectionView;

/* loaded from: classes3.dex */
public final class IncludeS1SectionViewBinding implements ViewBinding {
    private final S1SectionView rootView;

    private IncludeS1SectionViewBinding(S1SectionView s1SectionView) {
        this.rootView = s1SectionView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public S1SectionView getRoot() {
        return this.rootView;
    }

    public static IncludeS1SectionViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeS1SectionViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C15314R.layout.include_s1_section_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeS1SectionViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeS1SectionViewBinding((S1SectionView) view);
    }
}
