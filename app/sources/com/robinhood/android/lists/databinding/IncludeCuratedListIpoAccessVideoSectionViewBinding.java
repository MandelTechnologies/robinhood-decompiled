package com.robinhood.android.lists.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.lists.C20839R;
import com.robinhood.android.lists.p173ui.ipo.CuratedListIpoAccessVideoSectionView;

/* loaded from: classes8.dex */
public final class IncludeCuratedListIpoAccessVideoSectionViewBinding implements ViewBinding {
    private final CuratedListIpoAccessVideoSectionView rootView;

    private IncludeCuratedListIpoAccessVideoSectionViewBinding(CuratedListIpoAccessVideoSectionView curatedListIpoAccessVideoSectionView) {
        this.rootView = curatedListIpoAccessVideoSectionView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public CuratedListIpoAccessVideoSectionView getRoot() {
        return this.rootView;
    }

    public static IncludeCuratedListIpoAccessVideoSectionViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeCuratedListIpoAccessVideoSectionViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20839R.layout.include_curated_list_ipo_access_video_section_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeCuratedListIpoAccessVideoSectionViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeCuratedListIpoAccessVideoSectionViewBinding((CuratedListIpoAccessVideoSectionView) view);
    }
}
