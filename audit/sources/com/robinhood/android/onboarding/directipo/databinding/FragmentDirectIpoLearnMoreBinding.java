package com.robinhood.android.onboarding.directipo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.onboarding.directipo.C22750R;

/* loaded from: classes10.dex */
public final class FragmentDirectIpoLearnMoreBinding implements ViewBinding {
    public final RhTextView directIpoOnboardingLearnMoreDescription;
    public final RdsButton directIpoOnboardingLearnMoreDismiss;
    public final ImageView directIpoOnboardingLearnMoreImage;
    public final RecyclerView directIpoOnboardingLearnMoreRecyclerView;
    public final RhTextView directIpoOnboardingLearnMoreTitle;
    private final ConstraintLayout rootView;

    private FragmentDirectIpoLearnMoreBinding(ConstraintLayout constraintLayout, RhTextView rhTextView, RdsButton rdsButton, ImageView imageView, RecyclerView recyclerView, RhTextView rhTextView2) {
        this.rootView = constraintLayout;
        this.directIpoOnboardingLearnMoreDescription = rhTextView;
        this.directIpoOnboardingLearnMoreDismiss = rdsButton;
        this.directIpoOnboardingLearnMoreImage = imageView;
        this.directIpoOnboardingLearnMoreRecyclerView = recyclerView;
        this.directIpoOnboardingLearnMoreTitle = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentDirectIpoLearnMoreBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentDirectIpoLearnMoreBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C22750R.layout.fragment_direct_ipo_learn_more, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentDirectIpoLearnMoreBinding bind(View view) {
        int i = C22750R.id.direct_ipo_onboarding_learn_more_description;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C22750R.id.direct_ipo_onboarding_learn_more_dismiss;
            RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
            if (rdsButton != null) {
                i = C22750R.id.direct_ipo_onboarding_learn_more_image;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = C22750R.id.direct_ipo_onboarding_learn_more_recycler_view;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                    if (recyclerView != null) {
                        i = C22750R.id.direct_ipo_onboarding_learn_more_title;
                        RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView2 != null) {
                            return new FragmentDirectIpoLearnMoreBinding((ConstraintLayout) view, rhTextView, rdsButton, imageView, recyclerView, rhTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
