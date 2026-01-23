package com.robinhood.android.lists.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.lists.C20839R;

/* loaded from: classes8.dex */
public final class EmojiFooterExpandItemBinding implements ViewBinding {
    public final RdsButton emojiFooterExpandButton;
    private final FrameLayout rootView;

    private EmojiFooterExpandItemBinding(FrameLayout frameLayout, RdsButton rdsButton) {
        this.rootView = frameLayout;
        this.emojiFooterExpandButton = rdsButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static EmojiFooterExpandItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static EmojiFooterExpandItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20839R.layout.emoji_footer_expand_item, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static EmojiFooterExpandItemBinding bind(View view) {
        int i = C20839R.id.emoji_footer_expand_button;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            return new EmojiFooterExpandItemBinding((FrameLayout) view, rdsButton);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
