package com.robinhood.android.shareholderexperience.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.shareholderexperience.C28477R;

/* loaded from: classes5.dex */
public final class AnswerListSpacerBinding implements ViewBinding {
    private final Space rootView;

    private AnswerListSpacerBinding(Space space) {
        this.rootView = space;
    }

    @Override // androidx.viewbinding.ViewBinding
    public Space getRoot() {
        return this.rootView;
    }

    public static AnswerListSpacerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AnswerListSpacerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C28477R.layout.answer_list_spacer, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static AnswerListSpacerBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new AnswerListSpacerBinding((Space) view);
    }
}
