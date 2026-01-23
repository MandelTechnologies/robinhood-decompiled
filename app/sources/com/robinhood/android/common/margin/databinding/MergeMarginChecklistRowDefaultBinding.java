package com.robinhood.android.common.margin.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.margin.C11223R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.progress.RdsProgressBar;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes2.dex */
public final class MergeMarginChecklistRowDefaultBinding implements ViewBinding {
    public final RdsButton progressChecklistRowButtonNegative;
    public final RdsButton progressChecklistRowButtonPositive;
    public final ImageView progressChecklistRowImg;
    public final RhTextView progressChecklistRowMessageTxt;
    public final RdsProgressBar progressChecklistRowProgressBar;
    public final RhTextView progressChecklistRowTitleTxt;
    private final View rootView;

    private MergeMarginChecklistRowDefaultBinding(View view, RdsButton rdsButton, RdsButton rdsButton2, ImageView imageView, RhTextView rhTextView, RdsProgressBar rdsProgressBar, RhTextView rhTextView2) {
        this.rootView = view;
        this.progressChecklistRowButtonNegative = rdsButton;
        this.progressChecklistRowButtonPositive = rdsButton2;
        this.progressChecklistRowImg = imageView;
        this.progressChecklistRowMessageTxt = rhTextView;
        this.progressChecklistRowProgressBar = rdsProgressBar;
        this.progressChecklistRowTitleTxt = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeMarginChecklistRowDefaultBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C11223R.layout.merge_margin_checklist_row_default, viewGroup);
        return bind(viewGroup);
    }

    public static MergeMarginChecklistRowDefaultBinding bind(View view) {
        int i = C11223R.id.progress_checklist_row_button_negative;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C11223R.id.progress_checklist_row_button_positive;
            RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
            if (rdsButton2 != null) {
                i = C11223R.id.progress_checklist_row_img;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = C11223R.id.progress_checklist_row_message_txt;
                    RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView != null) {
                        i = C11223R.id.progress_checklist_row_progress_bar;
                        RdsProgressBar rdsProgressBar = (RdsProgressBar) ViewBindings.findChildViewById(view, i);
                        if (rdsProgressBar != null) {
                            i = C11223R.id.progress_checklist_row_title_txt;
                            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView2 != null) {
                                return new MergeMarginChecklistRowDefaultBinding(view, rdsButton, rdsButton2, imageView, rhTextView, rdsProgressBar, rhTextView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
