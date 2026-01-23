package com.robinhood.android.recommendations.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.selectioncontrol.NewRdsRadioGroup;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.recommendations.C25978R;

/* loaded from: classes11.dex */
public final class FragmentRecommendationsReentryConfirmAnswerDialogBinding implements ViewBinding {
    public final RdsButton confirmBtn;
    public final RhTextView disclosure;
    public final ImageView navCloseBtn;
    public final NewRdsRadioGroup radioGroup;
    private final LinearLayout rootView;
    public final RhTextView subtitle;
    public final RhTextView title;

    private FragmentRecommendationsReentryConfirmAnswerDialogBinding(LinearLayout linearLayout, RdsButton rdsButton, RhTextView rhTextView, ImageView imageView, NewRdsRadioGroup newRdsRadioGroup, RhTextView rhTextView2, RhTextView rhTextView3) {
        this.rootView = linearLayout;
        this.confirmBtn = rdsButton;
        this.disclosure = rhTextView;
        this.navCloseBtn = imageView;
        this.radioGroup = newRdsRadioGroup;
        this.subtitle = rhTextView2;
        this.title = rhTextView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentRecommendationsReentryConfirmAnswerDialogBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentRecommendationsReentryConfirmAnswerDialogBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C25978R.layout.fragment_recommendations_reentry_confirm_answer_dialog, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentRecommendationsReentryConfirmAnswerDialogBinding bind(View view) {
        int i = C25978R.id.confirm_btn;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C25978R.id.disclosure;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C25978R.id.nav_close_btn;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = C25978R.id.radio_group;
                    NewRdsRadioGroup newRdsRadioGroup = (NewRdsRadioGroup) ViewBindings.findChildViewById(view, i);
                    if (newRdsRadioGroup != null) {
                        i = C25978R.id.subtitle;
                        RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView2 != null) {
                            i = C25978R.id.title;
                            RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView3 != null) {
                                return new FragmentRecommendationsReentryConfirmAnswerDialogBinding((LinearLayout) view, rdsButton, rhTextView, imageView, newRdsRadioGroup, rhTextView2, rhTextView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
