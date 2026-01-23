package com.robinhood.android.common.mcduckling.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.mcduckling.C11257R;
import com.robinhood.android.common.p088ui.view.DotIndicators;
import com.robinhood.android.designsystem.numpad.RdsNumpadView;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes2.dex */
public final class FragmentChangeCardPinBinding implements ViewBinding {
    public final RdsNumpadView numpad;
    public final DotIndicators pinDotIndicators;
    public final EditText pinInputEdt;
    public final RhTextView pinInputPromptTxt;
    public final RhTextView pinInputTitle;
    private final ConstraintLayout rootView;

    private FragmentChangeCardPinBinding(ConstraintLayout constraintLayout, RdsNumpadView rdsNumpadView, DotIndicators dotIndicators, EditText editText, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = constraintLayout;
        this.numpad = rdsNumpadView;
        this.pinDotIndicators = dotIndicators;
        this.pinInputEdt = editText;
        this.pinInputPromptTxt = rhTextView;
        this.pinInputTitle = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentChangeCardPinBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentChangeCardPinBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C11257R.layout.fragment_change_card_pin, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentChangeCardPinBinding bind(View view) {
        int i = C11257R.id.numpad;
        RdsNumpadView rdsNumpadView = (RdsNumpadView) ViewBindings.findChildViewById(view, i);
        if (rdsNumpadView != null) {
            i = C11257R.id.pin_dot_indicators;
            DotIndicators dotIndicators = (DotIndicators) ViewBindings.findChildViewById(view, i);
            if (dotIndicators != null) {
                i = C11257R.id.pin_input_edt;
                EditText editText = (EditText) ViewBindings.findChildViewById(view, i);
                if (editText != null) {
                    i = C11257R.id.pin_input_prompt_txt;
                    RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView != null) {
                        i = C11257R.id.pin_input_title;
                        RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView2 != null) {
                            return new FragmentChangeCardPinBinding((ConstraintLayout) view, rdsNumpadView, dotIndicators, editText, rhTextView, rhTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
