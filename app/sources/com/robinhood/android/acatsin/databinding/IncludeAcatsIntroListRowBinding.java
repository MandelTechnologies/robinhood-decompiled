package com.robinhood.android.acatsin.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.acatsin.C7725R;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes24.dex */
public final class IncludeAcatsIntroListRowBinding implements ViewBinding {
    private final RhTextView rootView;

    private IncludeAcatsIntroListRowBinding(RhTextView rhTextView) {
        this.rootView = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RhTextView getRoot() {
        return this.rootView;
    }

    public static IncludeAcatsIntroListRowBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeAcatsIntroListRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C7725R.layout.include_acats_intro_list_row, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeAcatsIntroListRowBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeAcatsIntroListRowBinding((RhTextView) view);
    }
}
