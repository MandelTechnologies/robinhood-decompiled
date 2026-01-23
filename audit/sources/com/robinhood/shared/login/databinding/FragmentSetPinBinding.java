package com.robinhood.shared.login.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.view.DotIndicators;
import com.robinhood.android.designsystem.numpad.RdsNumpadView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.shared.login.C39089R;

/* loaded from: classes6.dex */
public final class FragmentSetPinBinding implements ViewBinding {
    public final EditText inputEdt;
    public final RdsNumpadView numpad;
    public final RhTextView pinMainHeader;
    public final DotIndicators pinbar;
    private final LinearLayout rootView;

    private FragmentSetPinBinding(LinearLayout linearLayout, EditText editText, RdsNumpadView rdsNumpadView, RhTextView rhTextView, DotIndicators dotIndicators) {
        this.rootView = linearLayout;
        this.inputEdt = editText;
        this.numpad = rdsNumpadView;
        this.pinMainHeader = rhTextView;
        this.pinbar = dotIndicators;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentSetPinBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentSetPinBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C39089R.layout.fragment_set_pin, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentSetPinBinding bind(View view) {
        int i = C39089R.id.input_edt;
        EditText editText = (EditText) ViewBindings.findChildViewById(view, i);
        if (editText != null) {
            i = C39089R.id.numpad;
            RdsNumpadView rdsNumpadView = (RdsNumpadView) ViewBindings.findChildViewById(view, i);
            if (rdsNumpadView != null) {
                i = C39089R.id.pin_main_header;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C39089R.id.pinbar;
                    DotIndicators dotIndicators = (DotIndicators) ViewBindings.findChildViewById(view, i);
                    if (dotIndicators != null) {
                        return new FragmentSetPinBinding((LinearLayout) view, editText, rdsNumpadView, rhTextView, dotIndicators);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
