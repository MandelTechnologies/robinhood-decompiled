package com.robinhood.android.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ScrollView;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.pog.RdsPogView;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes2.dex */
public final class FragmentBottomSheetBinding implements ViewBinding {
    public final RhTextView bottomSheetDescriptionTxt;
    public final ImageView bottomSheetIconImg;
    public final FrameLayout bottomSheetImgContainer;
    public final RdsPogView bottomSheetPictogram;
    public final ViewStub bottomSheetPrimaryBtn;
    public final View bottomSheetRuleLine;
    public final RdsButton bottomSheetSecondaryBtn;
    public final RhTextView bottomSheetSubtitleTxt;
    public final RhTextView bottomSheetTitleTxt;
    public final ComposeView composableView;
    private final ScrollView rootView;

    private FragmentBottomSheetBinding(ScrollView scrollView, RhTextView rhTextView, ImageView imageView, FrameLayout frameLayout, RdsPogView rdsPogView, ViewStub viewStub, View view, RdsButton rdsButton, RhTextView rhTextView2, RhTextView rhTextView3, ComposeView composeView) {
        this.rootView = scrollView;
        this.bottomSheetDescriptionTxt = rhTextView;
        this.bottomSheetIconImg = imageView;
        this.bottomSheetImgContainer = frameLayout;
        this.bottomSheetPictogram = rdsPogView;
        this.bottomSheetPrimaryBtn = viewStub;
        this.bottomSheetRuleLine = view;
        this.bottomSheetSecondaryBtn = rdsButton;
        this.bottomSheetSubtitleTxt = rhTextView2;
        this.bottomSheetTitleTxt = rhTextView3;
        this.composableView = composeView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentBottomSheetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C11048R.layout.fragment_bottom_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentBottomSheetBinding bind(View view) {
        View viewFindChildViewById;
        int i = C11048R.id.bottom_sheet_description_txt;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C11048R.id.bottom_sheet_icon_img;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C11048R.id.bottom_sheet_img_container;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                if (frameLayout != null) {
                    i = C11048R.id.bottom_sheet_pictogram;
                    RdsPogView rdsPogView = (RdsPogView) ViewBindings.findChildViewById(view, i);
                    if (rdsPogView != null) {
                        i = C11048R.id.bottom_sheet_primary_btn;
                        ViewStub viewStub = (ViewStub) ViewBindings.findChildViewById(view, i);
                        if (viewStub != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C11048R.id.bottom_sheet_rule_line))) != null) {
                            i = C11048R.id.bottom_sheet_secondary_btn;
                            RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                            if (rdsButton != null) {
                                i = C11048R.id.bottom_sheet_subtitle_txt;
                                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                if (rhTextView2 != null) {
                                    i = C11048R.id.bottom_sheet_title_txt;
                                    RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                    if (rhTextView3 != null) {
                                        i = C11048R.id.composable_view;
                                        ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
                                        if (composeView != null) {
                                            return new FragmentBottomSheetBinding((ScrollView) view, rhTextView, imageView, frameLayout, rdsPogView, viewStub, viewFindChildViewById, rdsButton, rhTextView2, rhTextView3, composeView);
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
