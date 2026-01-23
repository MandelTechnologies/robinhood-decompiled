package com.robinhood.android.settings.p254ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.settings.p254ui.C28356R;
import com.robinhood.android.settings.p254ui.TitleSubtitleView;

/* loaded from: classes5.dex */
public final class IncludeTitleSubtitleViewBinding implements ViewBinding {
    private final TitleSubtitleView rootView;

    private IncludeTitleSubtitleViewBinding(TitleSubtitleView titleSubtitleView) {
        this.rootView = titleSubtitleView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public TitleSubtitleView getRoot() {
        return this.rootView;
    }

    public static IncludeTitleSubtitleViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeTitleSubtitleViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C28356R.layout.include_title_subtitle_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeTitleSubtitleViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeTitleSubtitleViewBinding((TitleSubtitleView) view);
    }
}
