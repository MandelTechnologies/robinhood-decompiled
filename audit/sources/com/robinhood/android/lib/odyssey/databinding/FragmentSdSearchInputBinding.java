package com.robinhood.android.lib.odyssey.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.numpad.RdsNumpadView;
import com.robinhood.android.designsystem.textinput.RdsFormattedEditText;
import com.robinhood.android.lib.odyssey.C20335R;
import com.robinhood.android.odyssey.lib.view.SdInputRow;
import com.robinhood.android.odyssey.lib.view.SdListOptionsView;
import com.robinhood.android.odyssey.lib.view.SdTextView;

/* loaded from: classes8.dex */
public final class FragmentSdSearchInputBinding implements ViewBinding {
    private final LinearLayout rootView;
    public final RdsFormattedEditText sdSearchInputEditText;
    public final SdInputRow sdSearchInputInputContainer;
    public final SdListOptionsView sdSearchInputListOptionsView;
    public final RdsNumpadView sdSearchInputNumpad;
    public final SdTextView sdSearchInputSubtitle;
    public final SdTextView sdSearchInputTitle;

    private FragmentSdSearchInputBinding(LinearLayout linearLayout, RdsFormattedEditText rdsFormattedEditText, SdInputRow sdInputRow, SdListOptionsView sdListOptionsView, RdsNumpadView rdsNumpadView, SdTextView sdTextView, SdTextView sdTextView2) {
        this.rootView = linearLayout;
        this.sdSearchInputEditText = rdsFormattedEditText;
        this.sdSearchInputInputContainer = sdInputRow;
        this.sdSearchInputListOptionsView = sdListOptionsView;
        this.sdSearchInputNumpad = rdsNumpadView;
        this.sdSearchInputSubtitle = sdTextView;
        this.sdSearchInputTitle = sdTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentSdSearchInputBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentSdSearchInputBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20335R.layout.fragment_sd_search_input, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentSdSearchInputBinding bind(View view) {
        int i = C20335R.id.sd_search_input_edit_text;
        RdsFormattedEditText rdsFormattedEditText = (RdsFormattedEditText) ViewBindings.findChildViewById(view, i);
        if (rdsFormattedEditText != null) {
            i = C20335R.id.sd_search_input_input_container;
            SdInputRow sdInputRow = (SdInputRow) ViewBindings.findChildViewById(view, i);
            if (sdInputRow != null) {
                i = C20335R.id.sd_search_input_list_options_view;
                SdListOptionsView sdListOptionsView = (SdListOptionsView) ViewBindings.findChildViewById(view, i);
                if (sdListOptionsView != null) {
                    i = C20335R.id.sd_search_input_numpad;
                    RdsNumpadView rdsNumpadView = (RdsNumpadView) ViewBindings.findChildViewById(view, i);
                    if (rdsNumpadView != null) {
                        i = C20335R.id.sd_search_input_subtitle;
                        SdTextView sdTextView = (SdTextView) ViewBindings.findChildViewById(view, i);
                        if (sdTextView != null) {
                            i = C20335R.id.sd_search_input_title;
                            SdTextView sdTextView2 = (SdTextView) ViewBindings.findChildViewById(view, i);
                            if (sdTextView2 != null) {
                                return new FragmentSdSearchInputBinding((LinearLayout) view, rdsFormattedEditText, sdInputRow, sdListOptionsView, rdsNumpadView, sdTextView, sdTextView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
