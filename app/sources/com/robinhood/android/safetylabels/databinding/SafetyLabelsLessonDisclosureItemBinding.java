package com.robinhood.android.safetylabels.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.safetylabels.C27803R;

/* loaded from: classes5.dex */
public final class SafetyLabelsLessonDisclosureItemBinding implements ViewBinding {
    private final RhTextView rootView;
    public final RhTextView safetyLabelsLessonDisclosureTxt;

    private SafetyLabelsLessonDisclosureItemBinding(RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = rhTextView;
        this.safetyLabelsLessonDisclosureTxt = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RhTextView getRoot() {
        return this.rootView;
    }

    public static SafetyLabelsLessonDisclosureItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static SafetyLabelsLessonDisclosureItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C27803R.layout.safety_labels_lesson_disclosure_item, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static SafetyLabelsLessonDisclosureItemBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        RhTextView rhTextView = (RhTextView) view;
        return new SafetyLabelsLessonDisclosureItemBinding(rhTextView, rhTextView);
    }
}
