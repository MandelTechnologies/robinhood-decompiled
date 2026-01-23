package com.robinhood.android.inbox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.AvatarView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.inbox.C18721R;

/* loaded from: classes10.dex */
public final class MergeThreadRowViewBinding implements ViewBinding {
    private final View rootView;
    public final FrameLayout threadAvatarContainer;
    public final View threadAvatarSliver;
    public final AvatarView threadAvatarView;
    public final ImageView threadCriticalImg;
    public final ImageView threadSelectedView;
    public final RhTextView threadSubtitleTxt;
    public final RhTextView threadTimeTxt;
    public final RhTextView threadTitleTxt;

    private MergeThreadRowViewBinding(View view, FrameLayout frameLayout, View view2, AvatarView avatarView, ImageView imageView, ImageView imageView2, RhTextView rhTextView, RhTextView rhTextView2, RhTextView rhTextView3) {
        this.rootView = view;
        this.threadAvatarContainer = frameLayout;
        this.threadAvatarSliver = view2;
        this.threadAvatarView = avatarView;
        this.threadCriticalImg = imageView;
        this.threadSelectedView = imageView2;
        this.threadSubtitleTxt = rhTextView;
        this.threadTimeTxt = rhTextView2;
        this.threadTitleTxt = rhTextView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeThreadRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C18721R.layout.merge_thread_row_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeThreadRowViewBinding bind(View view) {
        View viewFindChildViewById;
        int i = C18721R.id.thread_avatar_container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C18721R.id.thread_avatar_sliver))) != null) {
            i = C18721R.id.thread_avatar_view;
            AvatarView avatarView = (AvatarView) ViewBindings.findChildViewById(view, i);
            if (avatarView != null) {
                i = C18721R.id.thread_critical_img;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = C18721R.id.thread_selected_view;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView2 != null) {
                        i = C18721R.id.thread_subtitle_txt;
                        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView != null) {
                            i = C18721R.id.thread_time_txt;
                            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView2 != null) {
                                i = C18721R.id.thread_title_txt;
                                RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                if (rhTextView3 != null) {
                                    return new MergeThreadRowViewBinding(view, frameLayout, viewFindChildViewById, avatarView, imageView, imageView2, rhTextView, rhTextView2, rhTextView3);
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
