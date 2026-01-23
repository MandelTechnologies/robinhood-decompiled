package com.robinhood.android.safetylabels.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.designsystem.inlinedefinition.RdsInlineDefinitionTextView;
import com.robinhood.android.safetylabels.C27803R;

/* loaded from: classes5.dex */
public final class IncludeSafetyLabelsLessonContentTextViewBinding implements ViewBinding {
    private final RdsInlineDefinitionTextView rootView;

    private IncludeSafetyLabelsLessonContentTextViewBinding(RdsInlineDefinitionTextView rdsInlineDefinitionTextView) {
        this.rootView = rdsInlineDefinitionTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RdsInlineDefinitionTextView getRoot() {
        return this.rootView;
    }

    public static IncludeSafetyLabelsLessonContentTextViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeSafetyLabelsLessonContentTextViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C27803R.layout.include_safety_labels_lesson_content_text_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeSafetyLabelsLessonContentTextViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeSafetyLabelsLessonContentTextViewBinding((RdsInlineDefinitionTextView) view);
    }
}
