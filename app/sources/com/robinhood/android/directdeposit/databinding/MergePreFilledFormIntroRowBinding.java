package com.robinhood.android.directdeposit.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.directdeposit.C14044R;

/* loaded from: classes27.dex */
public final class MergePreFilledFormIntroRowBinding implements ViewBinding {
    public final RhTextView descriptionTxt;
    public final RhTextView numberTxt;
    private final View rootView;
    public final RhTextView titleTxt;

    private MergePreFilledFormIntroRowBinding(View view, RhTextView rhTextView, RhTextView rhTextView2, RhTextView rhTextView3) {
        this.rootView = view;
        this.descriptionTxt = rhTextView;
        this.numberTxt = rhTextView2;
        this.titleTxt = rhTextView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergePreFilledFormIntroRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C14044R.layout.merge_pre_filled_form_intro_row, viewGroup);
        return bind(viewGroup);
    }

    public static MergePreFilledFormIntroRowBinding bind(View view) {
        int i = C14044R.id.description_txt;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C14044R.id.number_txt;
            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView2 != null) {
                i = C14044R.id.title_txt;
                RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView3 != null) {
                    return new MergePreFilledFormIntroRowBinding(view, rhTextView, rhTextView2, rhTextView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
