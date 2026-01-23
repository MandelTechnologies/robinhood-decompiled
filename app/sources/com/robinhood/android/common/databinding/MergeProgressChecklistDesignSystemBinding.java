package com.robinhood.android.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.C11048R;

/* loaded from: classes2.dex */
public final class MergeProgressChecklistDesignSystemBinding implements ViewBinding {
    public final LinearLayout progressChecklistCardCompletedContent;
    public final LinearLayout progressChecklistCardPendingContent;
    private final View rootView;

    private MergeProgressChecklistDesignSystemBinding(View view, LinearLayout linearLayout, LinearLayout linearLayout2) {
        this.rootView = view;
        this.progressChecklistCardCompletedContent = linearLayout;
        this.progressChecklistCardPendingContent = linearLayout2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeProgressChecklistDesignSystemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C11048R.layout.merge_progress_checklist_design_system, viewGroup);
        return bind(viewGroup);
    }

    public static MergeProgressChecklistDesignSystemBinding bind(View view) {
        int i = C11048R.id.progress_checklist_card_completed_content;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = C11048R.id.progress_checklist_card_pending_content;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout2 != null) {
                return new MergeProgressChecklistDesignSystemBinding(view, linearLayout, linearLayout2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
