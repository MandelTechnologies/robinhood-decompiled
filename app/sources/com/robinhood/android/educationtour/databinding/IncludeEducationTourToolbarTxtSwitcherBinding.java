package com.robinhood.android.educationtour.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextSwitcher;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.educationtour.C14469R;

/* loaded from: classes7.dex */
public final class IncludeEducationTourToolbarTxtSwitcherBinding implements ViewBinding {
    public final TextSwitcher educationTourToolbarTxtSwitcher;
    private final TextSwitcher rootView;

    private IncludeEducationTourToolbarTxtSwitcherBinding(TextSwitcher textSwitcher, TextSwitcher textSwitcher2) {
        this.rootView = textSwitcher;
        this.educationTourToolbarTxtSwitcher = textSwitcher2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public TextSwitcher getRoot() {
        return this.rootView;
    }

    public static IncludeEducationTourToolbarTxtSwitcherBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeEducationTourToolbarTxtSwitcherBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C14469R.layout.include_education_tour_toolbar_txt_switcher, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeEducationTourToolbarTxtSwitcherBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        TextSwitcher textSwitcher = (TextSwitcher) view;
        return new IncludeEducationTourToolbarTxtSwitcherBinding(textSwitcher, textSwitcher);
    }
}
