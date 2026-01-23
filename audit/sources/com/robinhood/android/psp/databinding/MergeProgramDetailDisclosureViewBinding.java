package com.robinhood.android.psp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.psp.C25966R;

/* loaded from: classes11.dex */
public final class MergeProgramDetailDisclosureViewBinding implements ViewBinding {
    public final RhTextView disclosureTxt;
    private final View rootView;

    private MergeProgramDetailDisclosureViewBinding(View view, RhTextView rhTextView) {
        this.rootView = view;
        this.disclosureTxt = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeProgramDetailDisclosureViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C25966R.layout.merge_program_detail_disclosure_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeProgramDetailDisclosureViewBinding bind(View view) {
        int i = C25966R.id.disclosure_txt;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            return new MergeProgramDetailDisclosureViewBinding(view, rhTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
