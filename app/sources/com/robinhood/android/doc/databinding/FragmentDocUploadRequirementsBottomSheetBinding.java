package com.robinhood.android.doc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.doc.C14254R;

/* loaded from: classes7.dex */
public final class FragmentDocUploadRequirementsBottomSheetBinding implements ViewBinding {
    public final RhTextView docUploadRequirementsBody;
    public final LinearLayout docUploadRequirementsContentContainer;
    public final LinearLayout docUploadRequirementsOuterContainer;
    public final RdsButton docUploadRequirementsPrimaryCta;
    public final ScrollView docUploadRequirementsScrollView;
    public final ComposeView docUploadRequirementsSduiComposeView;
    public final ScrollView docUploadRequirementsSduiScrollView;
    public final RhTextView docUploadRequirementsTitle;
    private final LinearLayout rootView;

    private FragmentDocUploadRequirementsBottomSheetBinding(LinearLayout linearLayout, RhTextView rhTextView, LinearLayout linearLayout2, LinearLayout linearLayout3, RdsButton rdsButton, ScrollView scrollView, ComposeView composeView, ScrollView scrollView2, RhTextView rhTextView2) {
        this.rootView = linearLayout;
        this.docUploadRequirementsBody = rhTextView;
        this.docUploadRequirementsContentContainer = linearLayout2;
        this.docUploadRequirementsOuterContainer = linearLayout3;
        this.docUploadRequirementsPrimaryCta = rdsButton;
        this.docUploadRequirementsScrollView = scrollView;
        this.docUploadRequirementsSduiComposeView = composeView;
        this.docUploadRequirementsSduiScrollView = scrollView2;
        this.docUploadRequirementsTitle = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentDocUploadRequirementsBottomSheetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentDocUploadRequirementsBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C14254R.layout.fragment_doc_upload_requirements_bottom_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentDocUploadRequirementsBottomSheetBinding bind(View view) {
        int i = C14254R.id.doc_upload_requirements_body;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C14254R.id.doc_upload_requirements_content_container;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                LinearLayout linearLayout2 = (LinearLayout) view;
                i = C14254R.id.doc_upload_requirements_primary_cta;
                RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                if (rdsButton != null) {
                    i = C14254R.id.doc_upload_requirements_scroll_view;
                    ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, i);
                    if (scrollView != null) {
                        i = C14254R.id.doc_upload_requirements_sdui_compose_view;
                        ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
                        if (composeView != null) {
                            i = C14254R.id.doc_upload_requirements_sdui_scroll_view;
                            ScrollView scrollView2 = (ScrollView) ViewBindings.findChildViewById(view, i);
                            if (scrollView2 != null) {
                                i = C14254R.id.doc_upload_requirements_title;
                                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                if (rhTextView2 != null) {
                                    return new FragmentDocUploadRequirementsBottomSheetBinding(linearLayout2, rhTextView, linearLayout, linearLayout2, rdsButton, scrollView, composeView, scrollView2, rhTextView2);
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
