package com.robinhood.android.educationtour.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.educationtour.C14469R;

/* loaded from: classes7.dex */
public final class MergeEducationTourEntryPointCardBinding implements ViewBinding {
    public final RdsTextButton entryPointActionTxt;
    public final ImageButton entryPointCardDismissBtn;
    public final ImageView entryPointCardImage;
    public final RhTextView entryPointCardMessageTxt;
    private final View rootView;

    private MergeEducationTourEntryPointCardBinding(View view, RdsTextButton rdsTextButton, ImageButton imageButton, ImageView imageView, RhTextView rhTextView) {
        this.rootView = view;
        this.entryPointActionTxt = rdsTextButton;
        this.entryPointCardDismissBtn = imageButton;
        this.entryPointCardImage = imageView;
        this.entryPointCardMessageTxt = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeEducationTourEntryPointCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C14469R.layout.merge_education_tour_entry_point_card, viewGroup);
        return bind(viewGroup);
    }

    public static MergeEducationTourEntryPointCardBinding bind(View view) {
        int i = C14469R.id.entry_point_action_txt;
        RdsTextButton rdsTextButton = (RdsTextButton) ViewBindings.findChildViewById(view, i);
        if (rdsTextButton != null) {
            i = C14469R.id.entry_point_card_dismiss_btn;
            ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, i);
            if (imageButton != null) {
                i = C14469R.id.entry_point_card_image;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = C14469R.id.entry_point_card_message_txt;
                    RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView != null) {
                        return new MergeEducationTourEntryPointCardBinding(view, rdsTextButton, imageButton, imageView, rhTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
