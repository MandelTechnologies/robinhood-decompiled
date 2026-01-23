package com.robinhood.android.recommendations.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.recommendations.C25978R;
import com.robinhood.utils.p409ui.view.FocusSafeNestedScrollView;

/* loaded from: classes11.dex */
public final class FragmentRecommendationsQuestionnaireConfirmationBinding implements ViewBinding {
    public final RdsButton backBtn;
    public final RdsButton confirmBtn;
    public final RecyclerView list;
    public final ImageView navCloseBtn;
    private final FocusSafeNestedScrollView rootView;
    public final RhTextView subtitle;
    public final RhTextView title;

    private FragmentRecommendationsQuestionnaireConfirmationBinding(FocusSafeNestedScrollView focusSafeNestedScrollView, RdsButton rdsButton, RdsButton rdsButton2, RecyclerView recyclerView, ImageView imageView, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = focusSafeNestedScrollView;
        this.backBtn = rdsButton;
        this.confirmBtn = rdsButton2;
        this.list = recyclerView;
        this.navCloseBtn = imageView;
        this.subtitle = rhTextView;
        this.title = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FocusSafeNestedScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentRecommendationsQuestionnaireConfirmationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentRecommendationsQuestionnaireConfirmationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C25978R.layout.fragment_recommendations_questionnaire_confirmation, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentRecommendationsQuestionnaireConfirmationBinding bind(View view) {
        int i = C25978R.id.back_btn;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C25978R.id.confirm_btn;
            RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
            if (rdsButton2 != null) {
                i = C25978R.id.list;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    i = C25978R.id.nav_close_btn;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = C25978R.id.subtitle;
                        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView != null) {
                            i = C25978R.id.title;
                            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView2 != null) {
                                return new FragmentRecommendationsQuestionnaireConfirmationBinding((FocusSafeNestedScrollView) view, rdsButton, rdsButton2, recyclerView, imageView, rhTextView, rhTextView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
