package com.robinhood.android.lists.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.lists.C20839R;

/* loaded from: classes8.dex */
public final class MergeUserListHeaderViewBinding implements ViewBinding {
    public final RhTextView fragmentUserListEmojiTxt;
    public final RhTextView fragmentUserListInstrumentQuantity;
    public final RhTextView fragmentUserListTitle;
    private final View rootView;

    private MergeUserListHeaderViewBinding(View view, RhTextView rhTextView, RhTextView rhTextView2, RhTextView rhTextView3) {
        this.rootView = view;
        this.fragmentUserListEmojiTxt = rhTextView;
        this.fragmentUserListInstrumentQuantity = rhTextView2;
        this.fragmentUserListTitle = rhTextView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeUserListHeaderViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C20839R.layout.merge_user_list_header_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeUserListHeaderViewBinding bind(View view) {
        int i = C20839R.id.fragment_user_list_emoji_txt;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C20839R.id.fragment_user_list_instrument_quantity;
            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView2 != null) {
                i = C20839R.id.fragment_user_list_title;
                RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView3 != null) {
                    return new MergeUserListHeaderViewBinding(view, rhTextView, rhTextView2, rhTextView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
