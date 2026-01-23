package com.robinhood.android.profiles.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.view.ErrorView;
import com.robinhood.android.designsystem.button.RdsButtonBarView;
import com.robinhood.android.designsystem.progress.RdsProgressBar;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.designsystem.textinput.RdsTextInputContainerView;
import com.robinhood.android.designsystem.textinput.RdsTextInputEditText;
import com.robinhood.android.profiles.C25898R;
import com.robinhood.android.profiles.p218ui.view.ProfilePictureView;

/* loaded from: classes11.dex */
public final class FragmentProfileEditBinding implements ViewBinding {
    public final RecyclerView profileEditColorRecyclerView;
    public final RhTextView profileEditColorTitle;
    public final ScrollView profileEditContentScrollView;
    public final RhTextView profileEditDisclosure;
    public final ErrorView profileEditErrorView;
    public final ProfilePictureView profileEditPictureView;
    public final RdsProgressBar profileEditProgressBar;
    public final RhTextView profileEditTicker;
    public final RdsTextInputEditText profileEditUsernameInput;
    public final RdsTextInputContainerView profileEditUsernameInputContainer;
    private final ConstraintLayout rootView;
    public final RdsButtonBarView saveBtnBar;

    private FragmentProfileEditBinding(ConstraintLayout constraintLayout, RecyclerView recyclerView, RhTextView rhTextView, ScrollView scrollView, RhTextView rhTextView2, ErrorView errorView, ProfilePictureView profilePictureView, RdsProgressBar rdsProgressBar, RhTextView rhTextView3, RdsTextInputEditText rdsTextInputEditText, RdsTextInputContainerView rdsTextInputContainerView, RdsButtonBarView rdsButtonBarView) {
        this.rootView = constraintLayout;
        this.profileEditColorRecyclerView = recyclerView;
        this.profileEditColorTitle = rhTextView;
        this.profileEditContentScrollView = scrollView;
        this.profileEditDisclosure = rhTextView2;
        this.profileEditErrorView = errorView;
        this.profileEditPictureView = profilePictureView;
        this.profileEditProgressBar = rdsProgressBar;
        this.profileEditTicker = rhTextView3;
        this.profileEditUsernameInput = rdsTextInputEditText;
        this.profileEditUsernameInputContainer = rdsTextInputContainerView;
        this.saveBtnBar = rdsButtonBarView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentProfileEditBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentProfileEditBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C25898R.layout.fragment_profile_edit, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentProfileEditBinding bind(View view) {
        int i = C25898R.id.profile_edit_color_recycler_view;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = C25898R.id.profile_edit_color_title;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C25898R.id.profile_edit_content_scroll_view;
                ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, i);
                if (scrollView != null) {
                    i = C25898R.id.profile_edit_disclosure;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        i = C25898R.id.profile_edit_error_view;
                        ErrorView errorView = (ErrorView) ViewBindings.findChildViewById(view, i);
                        if (errorView != null) {
                            i = C25898R.id.profile_edit_picture_view;
                            ProfilePictureView profilePictureView = (ProfilePictureView) ViewBindings.findChildViewById(view, i);
                            if (profilePictureView != null) {
                                i = C25898R.id.profile_edit_progress_bar;
                                RdsProgressBar rdsProgressBar = (RdsProgressBar) ViewBindings.findChildViewById(view, i);
                                if (rdsProgressBar != null) {
                                    i = C25898R.id.profile_edit_ticker;
                                    RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                    if (rhTextView3 != null) {
                                        i = C25898R.id.profile_edit_username_input;
                                        RdsTextInputEditText rdsTextInputEditText = (RdsTextInputEditText) ViewBindings.findChildViewById(view, i);
                                        if (rdsTextInputEditText != null) {
                                            i = C25898R.id.profile_edit_username_input_container;
                                            RdsTextInputContainerView rdsTextInputContainerView = (RdsTextInputContainerView) ViewBindings.findChildViewById(view, i);
                                            if (rdsTextInputContainerView != null) {
                                                i = C25898R.id.save_btn_bar;
                                                RdsButtonBarView rdsButtonBarView = (RdsButtonBarView) ViewBindings.findChildViewById(view, i);
                                                if (rdsButtonBarView != null) {
                                                    return new FragmentProfileEditBinding((ConstraintLayout) view, recyclerView, rhTextView, scrollView, rhTextView2, errorView, profilePictureView, rdsProgressBar, rhTextView3, rdsTextInputEditText, rdsTextInputContainerView, rdsButtonBarView);
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
