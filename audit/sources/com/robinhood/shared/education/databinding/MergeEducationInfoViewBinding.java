package com.robinhood.shared.education.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.inlinedefinition.RdsInlineDefinitionTextView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.shared.education.C38790R;

/* loaded from: classes6.dex */
public final class MergeEducationInfoViewBinding implements ViewBinding {
    public final RdsInlineDefinitionTextView contentTxt;
    public final RhTextView headerTxt;
    private final View rootView;
    public final RhTextView titleTxt;

    private MergeEducationInfoViewBinding(View view, RdsInlineDefinitionTextView rdsInlineDefinitionTextView, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = view;
        this.contentTxt = rdsInlineDefinitionTextView;
        this.headerTxt = rhTextView;
        this.titleTxt = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeEducationInfoViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C38790R.layout.merge_education_info_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeEducationInfoViewBinding bind(View view) {
        int i = C38790R.id.content_txt;
        RdsInlineDefinitionTextView rdsInlineDefinitionTextView = (RdsInlineDefinitionTextView) ViewBindings.findChildViewById(view, i);
        if (rdsInlineDefinitionTextView != null) {
            i = C38790R.id.header_txt;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C38790R.id.title_txt;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    return new MergeEducationInfoViewBinding(view, rdsInlineDefinitionTextView, rhTextView, rhTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
