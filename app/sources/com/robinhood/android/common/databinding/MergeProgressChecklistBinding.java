package com.robinhood.android.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.C11048R;

/* loaded from: classes2.dex */
public final class MergeProgressChecklistBinding implements ViewBinding {
    public final CardView progressChecklistCardCompleted;
    public final LinearLayout progressChecklistCardCompletedContent;
    public final CardView progressChecklistCardPending;
    public final LinearLayout progressChecklistCardPendingContent;
    private final View rootView;

    private MergeProgressChecklistBinding(View view, CardView cardView, LinearLayout linearLayout, CardView cardView2, LinearLayout linearLayout2) {
        this.rootView = view;
        this.progressChecklistCardCompleted = cardView;
        this.progressChecklistCardCompletedContent = linearLayout;
        this.progressChecklistCardPending = cardView2;
        this.progressChecklistCardPendingContent = linearLayout2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeProgressChecklistBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C11048R.layout.merge_progress_checklist, viewGroup);
        return bind(viewGroup);
    }

    public static MergeProgressChecklistBinding bind(View view) {
        int i = C11048R.id.progress_checklist_card_completed;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
        if (cardView != null) {
            i = C11048R.id.progress_checklist_card_completed_content;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = C11048R.id.progress_checklist_card_pending;
                CardView cardView2 = (CardView) ViewBindings.findChildViewById(view, i);
                if (cardView2 != null) {
                    i = C11048R.id.progress_checklist_card_pending_content;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout2 != null) {
                        return new MergeProgressChecklistBinding(view, cardView, linearLayout, cardView2, linearLayout2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
