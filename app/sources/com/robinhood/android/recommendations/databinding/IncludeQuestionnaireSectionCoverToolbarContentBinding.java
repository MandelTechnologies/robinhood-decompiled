package com.robinhood.android.recommendations.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.recommendations.C25978R;

/* loaded from: classes11.dex */
public final class IncludeQuestionnaireSectionCoverToolbarContentBinding implements ViewBinding {
    public final RhTextView progressPercentageTxt;
    private final FrameLayout rootView;
    public final FrameLayout sectionCoverToolbarContent;

    private IncludeQuestionnaireSectionCoverToolbarContentBinding(FrameLayout frameLayout, RhTextView rhTextView, FrameLayout frameLayout2) {
        this.rootView = frameLayout;
        this.progressPercentageTxt = rhTextView;
        this.sectionCoverToolbarContent = frameLayout2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static IncludeQuestionnaireSectionCoverToolbarContentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeQuestionnaireSectionCoverToolbarContentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C25978R.layout.include_questionnaire_section_cover_toolbar_content, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeQuestionnaireSectionCoverToolbarContentBinding bind(View view) {
        int i = C25978R.id.progress_percentage_txt;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            FrameLayout frameLayout = (FrameLayout) view;
            return new IncludeQuestionnaireSectionCoverToolbarContentBinding(frameLayout, rhTextView, frameLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
