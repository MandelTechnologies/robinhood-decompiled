package com.robinhood.android.transfers.transferhub.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.transfers.transferhub.C30556R;

/* loaded from: classes9.dex */
public final class ViewMoveMoneyRowBinding implements ViewBinding {
    public final RhTextView moveMoneyRowDescription;
    public final ImageView moveMoneyRowIcon;
    public final RhTextView moveMoneyRowTitle;
    private final View rootView;

    private ViewMoveMoneyRowBinding(View view, RhTextView rhTextView, ImageView imageView, RhTextView rhTextView2) {
        this.rootView = view;
        this.moveMoneyRowDescription = rhTextView;
        this.moveMoneyRowIcon = imageView;
        this.moveMoneyRowTitle = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static ViewMoveMoneyRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C30556R.layout.view_move_money_row, viewGroup);
        return bind(viewGroup);
    }

    public static ViewMoveMoneyRowBinding bind(View view) {
        int i = C30556R.id.move_money_row_description;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C30556R.id.move_money_row_icon;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C30556R.id.move_money_row_title;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    return new ViewMoveMoneyRowBinding(view, rhTextView, imageView, rhTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
