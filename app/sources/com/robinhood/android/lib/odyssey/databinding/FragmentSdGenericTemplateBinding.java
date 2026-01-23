package com.robinhood.android.lib.odyssey.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.lib.odyssey.C20335R;
import com.robinhood.android.odyssey.lib.view.SdFlexibleComponentListLayout;

/* loaded from: classes8.dex */
public final class FragmentSdGenericTemplateBinding implements ViewBinding {
    private final LinearLayout rootView;
    public final SdFlexibleComponentListLayout sdGenericTemplateBody;
    public final SdFlexibleComponentListLayout sdGenericTemplateFooter;
    public final SdFlexibleComponentListLayout sdGenericTemplateHeader;

    private FragmentSdGenericTemplateBinding(LinearLayout linearLayout, SdFlexibleComponentListLayout sdFlexibleComponentListLayout, SdFlexibleComponentListLayout sdFlexibleComponentListLayout2, SdFlexibleComponentListLayout sdFlexibleComponentListLayout3) {
        this.rootView = linearLayout;
        this.sdGenericTemplateBody = sdFlexibleComponentListLayout;
        this.sdGenericTemplateFooter = sdFlexibleComponentListLayout2;
        this.sdGenericTemplateHeader = sdFlexibleComponentListLayout3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentSdGenericTemplateBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentSdGenericTemplateBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20335R.layout.fragment_sd_generic_template, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentSdGenericTemplateBinding bind(View view) {
        int i = C20335R.id.sd_generic_template_body;
        SdFlexibleComponentListLayout sdFlexibleComponentListLayout = (SdFlexibleComponentListLayout) ViewBindings.findChildViewById(view, i);
        if (sdFlexibleComponentListLayout != null) {
            i = C20335R.id.sd_generic_template_footer;
            SdFlexibleComponentListLayout sdFlexibleComponentListLayout2 = (SdFlexibleComponentListLayout) ViewBindings.findChildViewById(view, i);
            if (sdFlexibleComponentListLayout2 != null) {
                i = C20335R.id.sd_generic_template_header;
                SdFlexibleComponentListLayout sdFlexibleComponentListLayout3 = (SdFlexibleComponentListLayout) ViewBindings.findChildViewById(view, i);
                if (sdFlexibleComponentListLayout3 != null) {
                    return new FragmentSdGenericTemplateBinding((LinearLayout) view, sdFlexibleComponentListLayout, sdFlexibleComponentListLayout2, sdFlexibleComponentListLayout3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
