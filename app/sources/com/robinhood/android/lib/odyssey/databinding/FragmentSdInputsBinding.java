package com.robinhood.android.lib.odyssey.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.numpad.RdsNumpadView;
import com.robinhood.android.lib.odyssey.C20335R;
import com.robinhood.android.odyssey.lib.view.SdButton;
import com.robinhood.android.odyssey.lib.view.SdInputsContainerView;
import com.robinhood.android.odyssey.lib.view.SdTextView;

/* loaded from: classes8.dex */
public final class FragmentSdInputsBinding implements ViewBinding {
    private final LinearLayout rootView;
    public final SdTextView sdInputHelperText;
    public final Space sdInputsButtonBottomMargin;
    public final SdTextView sdInputsDisclosure;
    public final SdInputsContainerView sdInputsInputContainer;
    public final RdsNumpadView sdInputsNumpad;
    public final SdButton sdInputsPrimaryCta;
    public final SdButton sdInputsSecondaryCta;
    public final SdTextView sdInputsSubtitle;
    public final SdTextView sdInputsTitle;

    private FragmentSdInputsBinding(LinearLayout linearLayout, SdTextView sdTextView, Space space, SdTextView sdTextView2, SdInputsContainerView sdInputsContainerView, RdsNumpadView rdsNumpadView, SdButton sdButton, SdButton sdButton2, SdTextView sdTextView3, SdTextView sdTextView4) {
        this.rootView = linearLayout;
        this.sdInputHelperText = sdTextView;
        this.sdInputsButtonBottomMargin = space;
        this.sdInputsDisclosure = sdTextView2;
        this.sdInputsInputContainer = sdInputsContainerView;
        this.sdInputsNumpad = rdsNumpadView;
        this.sdInputsPrimaryCta = sdButton;
        this.sdInputsSecondaryCta = sdButton2;
        this.sdInputsSubtitle = sdTextView3;
        this.sdInputsTitle = sdTextView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentSdInputsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentSdInputsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20335R.layout.fragment_sd_inputs, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentSdInputsBinding bind(View view) {
        int i = C20335R.id.sd_input_helper_text;
        SdTextView sdTextView = (SdTextView) ViewBindings.findChildViewById(view, i);
        if (sdTextView != null) {
            i = C20335R.id.sd_inputs_button_bottom_margin;
            Space space = (Space) ViewBindings.findChildViewById(view, i);
            if (space != null) {
                i = C20335R.id.sd_inputs_disclosure;
                SdTextView sdTextView2 = (SdTextView) ViewBindings.findChildViewById(view, i);
                if (sdTextView2 != null) {
                    i = C20335R.id.sd_inputs_input_container;
                    SdInputsContainerView sdInputsContainerView = (SdInputsContainerView) ViewBindings.findChildViewById(view, i);
                    if (sdInputsContainerView != null) {
                        i = C20335R.id.sd_inputs_numpad;
                        RdsNumpadView rdsNumpadView = (RdsNumpadView) ViewBindings.findChildViewById(view, i);
                        if (rdsNumpadView != null) {
                            i = C20335R.id.sd_inputs_primary_cta;
                            SdButton sdButton = (SdButton) ViewBindings.findChildViewById(view, i);
                            if (sdButton != null) {
                                i = C20335R.id.sd_inputs_secondary_cta;
                                SdButton sdButton2 = (SdButton) ViewBindings.findChildViewById(view, i);
                                if (sdButton2 != null) {
                                    i = C20335R.id.sd_inputs_subtitle;
                                    SdTextView sdTextView3 = (SdTextView) ViewBindings.findChildViewById(view, i);
                                    if (sdTextView3 != null) {
                                        i = C20335R.id.sd_inputs_title;
                                        SdTextView sdTextView4 = (SdTextView) ViewBindings.findChildViewById(view, i);
                                        if (sdTextView4 != null) {
                                            return new FragmentSdInputsBinding((LinearLayout) view, sdTextView, space, sdTextView2, sdInputsContainerView, rdsNumpadView, sdButton, sdButton2, sdTextView3, sdTextView4);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
