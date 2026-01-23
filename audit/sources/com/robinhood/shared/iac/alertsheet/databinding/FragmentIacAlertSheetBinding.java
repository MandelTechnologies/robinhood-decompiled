package com.robinhood.shared.iac.alertsheet.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.pog.RdsPogView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.shared.iac.alertsheet.C39038R;

/* loaded from: classes6.dex */
public final class FragmentIacAlertSheetBinding implements ViewBinding {
    public final ConstraintLayout container;
    public final RhTextView descriptionTextView;
    public final ComposeView gradientBackground;
    public final Guideline guideline;
    public final RdsButton primaryButton;
    public final RdsPogView rdsPogView;
    public final ComposeView remoteImage;
    private final NestedScrollView rootView;
    public final RdsButton secondaryButton;
    public final RhTextView titleTextView;

    private FragmentIacAlertSheetBinding(NestedScrollView nestedScrollView, ConstraintLayout constraintLayout, RhTextView rhTextView, ComposeView composeView, Guideline guideline, RdsButton rdsButton, RdsPogView rdsPogView, ComposeView composeView2, RdsButton rdsButton2, RhTextView rhTextView2) {
        this.rootView = nestedScrollView;
        this.container = constraintLayout;
        this.descriptionTextView = rhTextView;
        this.gradientBackground = composeView;
        this.guideline = guideline;
        this.primaryButton = rdsButton;
        this.rdsPogView = rdsPogView;
        this.remoteImage = composeView2;
        this.secondaryButton = rdsButton2;
        this.titleTextView = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public NestedScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentIacAlertSheetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentIacAlertSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C39038R.layout.fragment_iac_alert_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentIacAlertSheetBinding bind(View view) {
        int i = C39038R.id.container;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = C39038R.id.description_text_view;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C39038R.id.gradient_background;
                ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
                if (composeView != null) {
                    i = C39038R.id.guideline;
                    Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                    if (guideline != null) {
                        i = C39038R.id.primary_button;
                        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                        if (rdsButton != null) {
                            i = C39038R.id.rds_pog_view;
                            RdsPogView rdsPogView = (RdsPogView) ViewBindings.findChildViewById(view, i);
                            if (rdsPogView != null) {
                                i = C39038R.id.remote_image;
                                ComposeView composeView2 = (ComposeView) ViewBindings.findChildViewById(view, i);
                                if (composeView2 != null) {
                                    i = C39038R.id.secondary_button;
                                    RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                                    if (rdsButton2 != null) {
                                        i = C39038R.id.title_text_view;
                                        RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                        if (rhTextView2 != null) {
                                            return new FragmentIacAlertSheetBinding((NestedScrollView) view, constraintLayout, rhTextView, composeView, guideline, rdsButton, rdsPogView, composeView2, rdsButton2, rhTextView2);
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
