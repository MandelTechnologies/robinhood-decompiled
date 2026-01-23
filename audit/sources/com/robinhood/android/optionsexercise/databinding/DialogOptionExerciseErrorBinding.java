package com.robinhood.android.optionsexercise.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.optionsexercise.C24704R;

/* loaded from: classes11.dex */
public final class DialogOptionExerciseErrorBinding implements ViewBinding {
    public final RhTextView dialogFragmentMessage;
    public final RhTextView dialogFragmentNegativeBtn;
    public final RhTextView dialogFragmentTitle;
    public final LinearLayout optionExerciseRow1;
    public final RhTextView optionExerciseRow1Label;
    public final RhTextView optionExerciseRow1Value;
    public final LinearLayout optionExerciseRow2;
    public final RhTextView optionExerciseRow2Label;
    public final RhTextView optionExerciseRow2Value;
    public final LinearLayout optionExerciseRow3;
    public final RhTextView optionExerciseRow3Label;
    public final RhTextView optionExerciseRow3Value;
    private final LinearLayout rootView;

    private DialogOptionExerciseErrorBinding(LinearLayout linearLayout, RhTextView rhTextView, RhTextView rhTextView2, RhTextView rhTextView3, LinearLayout linearLayout2, RhTextView rhTextView4, RhTextView rhTextView5, LinearLayout linearLayout3, RhTextView rhTextView6, RhTextView rhTextView7, LinearLayout linearLayout4, RhTextView rhTextView8, RhTextView rhTextView9) {
        this.rootView = linearLayout;
        this.dialogFragmentMessage = rhTextView;
        this.dialogFragmentNegativeBtn = rhTextView2;
        this.dialogFragmentTitle = rhTextView3;
        this.optionExerciseRow1 = linearLayout2;
        this.optionExerciseRow1Label = rhTextView4;
        this.optionExerciseRow1Value = rhTextView5;
        this.optionExerciseRow2 = linearLayout3;
        this.optionExerciseRow2Label = rhTextView6;
        this.optionExerciseRow2Value = rhTextView7;
        this.optionExerciseRow3 = linearLayout4;
        this.optionExerciseRow3Label = rhTextView8;
        this.optionExerciseRow3Value = rhTextView9;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static DialogOptionExerciseErrorBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogOptionExerciseErrorBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C24704R.layout.dialog_option_exercise_error, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static DialogOptionExerciseErrorBinding bind(View view) {
        int i = C24704R.id.dialog_fragment_message;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C24704R.id.dialog_fragment_negative_btn;
            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView2 != null) {
                i = C24704R.id.dialog_fragment_title;
                RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView3 != null) {
                    i = C24704R.id.option_exercise_row_1;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        i = C24704R.id.option_exercise_row_1_label;
                        RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView4 != null) {
                            i = C24704R.id.option_exercise_row_1_value;
                            RhTextView rhTextView5 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView5 != null) {
                                i = C24704R.id.option_exercise_row_2;
                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                if (linearLayout2 != null) {
                                    i = C24704R.id.option_exercise_row_2_label;
                                    RhTextView rhTextView6 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                    if (rhTextView6 != null) {
                                        i = C24704R.id.option_exercise_row_2_value;
                                        RhTextView rhTextView7 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                        if (rhTextView7 != null) {
                                            i = C24704R.id.option_exercise_row_3;
                                            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                            if (linearLayout3 != null) {
                                                i = C24704R.id.option_exercise_row_3_label;
                                                RhTextView rhTextView8 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                if (rhTextView8 != null) {
                                                    i = C24704R.id.option_exercise_row_3_value;
                                                    RhTextView rhTextView9 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                    if (rhTextView9 != null) {
                                                        return new DialogOptionExerciseErrorBinding((LinearLayout) view, rhTextView, rhTextView2, rhTextView3, linearLayout, rhTextView4, rhTextView5, linearLayout2, rhTextView6, rhTextView7, linearLayout3, rhTextView8, rhTextView9);
                                                    }
                                                }
                                            }
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
