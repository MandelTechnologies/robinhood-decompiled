package com.robinhood.android.common.emojipicker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.common.emojipicker.C11149R;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes2.dex */
public final class EmojiHeaderItemBinding implements ViewBinding {
    private final RhTextView rootView;

    private EmojiHeaderItemBinding(RhTextView rhTextView) {
        this.rootView = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RhTextView getRoot() {
        return this.rootView;
    }

    public static EmojiHeaderItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static EmojiHeaderItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C11149R.layout.emoji_header_item, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static EmojiHeaderItemBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new EmojiHeaderItemBinding((RhTextView) view);
    }
}
