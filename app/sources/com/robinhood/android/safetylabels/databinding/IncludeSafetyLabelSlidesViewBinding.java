package com.robinhood.android.safetylabels.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.safetylabels.C27803R;
import com.robinhood.android.safetylabels.p247ui.SafetyLabelsSlidesView;

/* loaded from: classes5.dex */
public final class IncludeSafetyLabelSlidesViewBinding implements ViewBinding {
    private final SafetyLabelsSlidesView rootView;

    private IncludeSafetyLabelSlidesViewBinding(SafetyLabelsSlidesView safetyLabelsSlidesView) {
        this.rootView = safetyLabelsSlidesView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public SafetyLabelsSlidesView getRoot() {
        return this.rootView;
    }

    public static IncludeSafetyLabelSlidesViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeSafetyLabelSlidesViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C27803R.layout.include_safety_label_slides_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeSafetyLabelSlidesViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeSafetyLabelSlidesViewBinding((SafetyLabelsSlidesView) view);
    }
}
