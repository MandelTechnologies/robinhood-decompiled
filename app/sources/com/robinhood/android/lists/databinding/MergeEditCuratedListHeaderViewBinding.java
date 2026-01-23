package com.robinhood.android.lists.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.designsystem.textinput.RdsTextInputEditText;
import com.robinhood.android.lists.C20839R;

/* loaded from: classes8.dex */
public final class MergeEditCuratedListHeaderViewBinding implements ViewBinding {
    public final RhTextView editCuratedListHeaderEmojiBox;
    public final RdsTextInputEditText editCuratedListHeaderTitleInput;
    private final View rootView;

    private MergeEditCuratedListHeaderViewBinding(View view, RhTextView rhTextView, RdsTextInputEditText rdsTextInputEditText) {
        this.rootView = view;
        this.editCuratedListHeaderEmojiBox = rhTextView;
        this.editCuratedListHeaderTitleInput = rdsTextInputEditText;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeEditCuratedListHeaderViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C20839R.layout.merge_edit_curated_list_header_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeEditCuratedListHeaderViewBinding bind(View view) {
        int i = C20839R.id.edit_curated_list_header_emoji_box;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C20839R.id.edit_curated_list_header_title_input;
            RdsTextInputEditText rdsTextInputEditText = (RdsTextInputEditText) ViewBindings.findChildViewById(view, i);
            if (rdsTextInputEditText != null) {
                return new MergeEditCuratedListHeaderViewBinding(view, rhTextView, rdsTextInputEditText);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
