package com.robinhood.android.common.emojipicker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.emojipicker.C11149R;
import com.robinhood.android.designsystem.button.RdsButton;

/* loaded from: classes2.dex */
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
        View viewInflate = layoutInflater.inflate(C11149R.layout.emoji_footer_expand_item, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static EmojiFooterExpandItemBinding bind(View view) {
        int i = C11149R.id.emoji_footer_expand_button;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            return new EmojiFooterExpandItemBinding((FrameLayout) view, rdsButton);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
