package com.robinhood.android.optionsexercise.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.optionsexercise.C24704R;

/* loaded from: classes11.dex */
public final class FragmentOptionExercisePsaBinding implements ViewBinding {
    public final RhTextView exercisePsaDescription;
    public final RhTextView exercisePsaFirstDescription;
    public final RhTextView exercisePsaFirstIcon;
    public final RhTextView exercisePsaFirstTitle;
    public final RhTextView exercisePsaSecondDescription;
    public final RhTextView exercisePsaSecondIcon;
    public final RhTextView exercisePsaSecondTitle;
    public final RhTextView exercisePsaThirdDescription;
    public final RhTextView exercisePsaThirdIcon;
    public final RhTextView exercisePsaThirdTitle;
    public final RhTextView exercisePsaTitle;
    private final ConstraintLayout rootView;

    private FragmentOptionExercisePsaBinding(ConstraintLayout constraintLayout, RhTextView rhTextView, RhTextView rhTextView2, RhTextView rhTextView3, RhTextView rhTextView4, RhTextView rhTextView5, RhTextView rhTextView6, RhTextView rhTextView7, RhTextView rhTextView8, RhTextView rhTextView9, RhTextView rhTextView10, RhTextView rhTextView11) {
        this.rootView = constraintLayout;
        this.exercisePsaDescription = rhTextView;
        this.exercisePsaFirstDescription = rhTextView2;
        this.exercisePsaFirstIcon = rhTextView3;
        this.exercisePsaFirstTitle = rhTextView4;
        this.exercisePsaSecondDescription = rhTextView5;
        this.exercisePsaSecondIcon = rhTextView6;
        this.exercisePsaSecondTitle = rhTextView7;
        this.exercisePsaThirdDescription = rhTextView8;
        this.exercisePsaThirdIcon = rhTextView9;
        this.exercisePsaThirdTitle = rhTextView10;
        this.exercisePsaTitle = rhTextView11;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentOptionExercisePsaBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentOptionExercisePsaBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C24704R.layout.fragment_option_exercise_psa, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentOptionExercisePsaBinding bind(View view) {
        int i = C24704R.id.exercise_psa_description;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C24704R.id.exercise_psa_first_description;
            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView2 != null) {
                i = C24704R.id.exercise_psa_first_icon;
                RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView3 != null) {
                    i = C24704R.id.exercise_psa_first_title;
                    RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView4 != null) {
                        i = C24704R.id.exercise_psa_second_description;
                        RhTextView rhTextView5 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView5 != null) {
                            i = C24704R.id.exercise_psa_second_icon;
                            RhTextView rhTextView6 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView6 != null) {
                                i = C24704R.id.exercise_psa_second_title;
                                RhTextView rhTextView7 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                if (rhTextView7 != null) {
                                    i = C24704R.id.exercise_psa_third_description;
                                    RhTextView rhTextView8 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                    if (rhTextView8 != null) {
                                        i = C24704R.id.exercise_psa_third_icon;
                                        RhTextView rhTextView9 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                        if (rhTextView9 != null) {
                                            i = C24704R.id.exercise_psa_third_title;
                                            RhTextView rhTextView10 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                            if (rhTextView10 != null) {
                                                i = C24704R.id.exercise_psa_title;
                                                RhTextView rhTextView11 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                if (rhTextView11 != null) {
                                                    return new FragmentOptionExercisePsaBinding((ConstraintLayout) view, rhTextView, rhTextView2, rhTextView3, rhTextView4, rhTextView5, rhTextView6, rhTextView7, rhTextView8, rhTextView9, rhTextView10, rhTextView11);
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
