package com.robinhood.android.settings.p254ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.settings.p254ui.AccordionView;
import com.robinhood.android.settings.p254ui.C28356R;

/* loaded from: classes5.dex */
public final class IncludeSettingsAccordionViewBinding implements ViewBinding {
    private final AccordionView rootView;

    private IncludeSettingsAccordionViewBinding(AccordionView accordionView) {
        this.rootView = accordionView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public AccordionView getRoot() {
        return this.rootView;
    }

    public static IncludeSettingsAccordionViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeSettingsAccordionViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C28356R.layout.include_settings_accordion_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeSettingsAccordionViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeSettingsAccordionViewBinding((AccordionView) view);
    }
}
