package com.robinhood.android.expandablecontent.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.expandablecontent.C16618R;
import com.robinhood.android.expandablecontent.p136ui.ExpandableContentSectionItemView;

/* loaded from: classes3.dex */
public final class IncludeExpandableContentSectionItemBinding implements ViewBinding {
    private final ExpandableContentSectionItemView rootView;

    private IncludeExpandableContentSectionItemBinding(ExpandableContentSectionItemView expandableContentSectionItemView) {
        this.rootView = expandableContentSectionItemView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ExpandableContentSectionItemView getRoot() {
        return this.rootView;
    }

    public static IncludeExpandableContentSectionItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeExpandableContentSectionItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C16618R.layout.include_expandable_content_section_item, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeExpandableContentSectionItemBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeExpandableContentSectionItemBinding((ExpandableContentSectionItemView) view);
    }
}
