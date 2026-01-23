package com.robinhood.android.inbox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.AvatarView;
import com.robinhood.android.common.p088ui.RoundedImageView;
import com.robinhood.android.designsystem.container.RdsRippleContainerView;
import com.robinhood.android.designsystem.progress.RdsProgressBar;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.inbox.C18721R;

/* loaded from: classes10.dex */
public final class MergeThreadMessageRowViewBinding implements ViewBinding {
    public final RhTextView inboxThreadInternalActionTxt;
    public final FrameLayout inboxThreadMessageAvatarLayout;
    public final AvatarView inboxThreadMessageAvatarView;
    public final RdsRippleContainerView inboxThreadMessageContainer;
    public final ImageView inboxThreadMessageErrorImg;
    public final RoundedImageView inboxThreadMessageImg;
    public final RdsProgressBar inboxThreadMessageResendingView;
    public final FrameLayout inboxThreadMessageStatusContainer;
    public final RhTextView inboxThreadMessageTextStatusTxt;
    public final RhTextView inboxThreadMessageTextTxt;
    private final View rootView;

    private MergeThreadMessageRowViewBinding(View view, RhTextView rhTextView, FrameLayout frameLayout, AvatarView avatarView, RdsRippleContainerView rdsRippleContainerView, ImageView imageView, RoundedImageView roundedImageView, RdsProgressBar rdsProgressBar, FrameLayout frameLayout2, RhTextView rhTextView2, RhTextView rhTextView3) {
        this.rootView = view;
        this.inboxThreadInternalActionTxt = rhTextView;
        this.inboxThreadMessageAvatarLayout = frameLayout;
        this.inboxThreadMessageAvatarView = avatarView;
        this.inboxThreadMessageContainer = rdsRippleContainerView;
        this.inboxThreadMessageErrorImg = imageView;
        this.inboxThreadMessageImg = roundedImageView;
        this.inboxThreadMessageResendingView = rdsProgressBar;
        this.inboxThreadMessageStatusContainer = frameLayout2;
        this.inboxThreadMessageTextStatusTxt = rhTextView2;
        this.inboxThreadMessageTextTxt = rhTextView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeThreadMessageRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C18721R.layout.merge_thread_message_row_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeThreadMessageRowViewBinding bind(View view) {
        int i = C18721R.id.inbox_thread_internal_action_txt;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C18721R.id.inbox_thread_message_avatar_layout;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = C18721R.id.inbox_thread_message_avatar_view;
                AvatarView avatarView = (AvatarView) ViewBindings.findChildViewById(view, i);
                if (avatarView != null) {
                    i = C18721R.id.inbox_thread_message_container;
                    RdsRippleContainerView rdsRippleContainerView = (RdsRippleContainerView) ViewBindings.findChildViewById(view, i);
                    if (rdsRippleContainerView != null) {
                        i = C18721R.id.inbox_thread_message_error_img;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView != null) {
                            i = C18721R.id.inbox_thread_message_img;
                            RoundedImageView roundedImageView = (RoundedImageView) ViewBindings.findChildViewById(view, i);
                            if (roundedImageView != null) {
                                i = C18721R.id.inbox_thread_message_resending_view;
                                RdsProgressBar rdsProgressBar = (RdsProgressBar) ViewBindings.findChildViewById(view, i);
                                if (rdsProgressBar != null) {
                                    i = C18721R.id.inbox_thread_message_status_container;
                                    FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                    if (frameLayout2 != null) {
                                        i = C18721R.id.inbox_thread_message_text_status_txt;
                                        RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                        if (rhTextView2 != null) {
                                            i = C18721R.id.inbox_thread_message_text_txt;
                                            RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                            if (rhTextView3 != null) {
                                                return new MergeThreadMessageRowViewBinding(view, rhTextView, frameLayout, avatarView, rdsRippleContainerView, imageView, roundedImageView, rdsProgressBar, frameLayout2, rhTextView2, rhTextView3);
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
