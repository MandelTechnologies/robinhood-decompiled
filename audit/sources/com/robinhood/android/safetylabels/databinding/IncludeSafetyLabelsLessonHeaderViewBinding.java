package com.robinhood.android.safetylabels.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.safetylabels.C27803R;

/* loaded from: classes5.dex */
public final class IncludeSafetyLabelsLessonHeaderViewBinding implements ViewBinding {
    private final RhTextView rootView;
    public final RhTextView safetyLabelsLessonTitle;

    private IncludeSafetyLabelsLessonHeaderViewBinding(RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = rhTextView;
        this.safetyLabelsLessonTitle = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RhTextView getRoot() {
        return this.rootView;
    }

    public static IncludeSafetyLabelsLessonHeaderViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeSafetyLabelsLessonHeaderViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C27803R.layout.include_safety_labels_lesson_header_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeSafetyLabelsLessonHeaderViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        RhTextView rhTextView = (RhTextView) view;
        return new IncludeSafetyLabelsLessonHeaderViewBinding(rhTextView, rhTextView);
    }
}
