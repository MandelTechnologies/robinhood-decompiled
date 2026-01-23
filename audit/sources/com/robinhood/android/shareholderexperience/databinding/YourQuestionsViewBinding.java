package com.robinhood.android.shareholderexperience.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.shareholderexperience.C28477R;

/* loaded from: classes5.dex */
public final class YourQuestionsViewBinding implements ViewBinding {
    private final LinearLayout rootView;

    private YourQuestionsViewBinding(LinearLayout linearLayout) {
        this.rootView = linearLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static YourQuestionsViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static YourQuestionsViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C28477R.layout.your_questions_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static YourQuestionsViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new YourQuestionsViewBinding((LinearLayout) view);
    }
}
