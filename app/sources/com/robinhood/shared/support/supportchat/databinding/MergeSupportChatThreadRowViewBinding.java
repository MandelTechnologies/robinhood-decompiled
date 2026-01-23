package com.robinhood.shared.support.supportchat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.pog.RdsPogView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.shared.support.supportchat.C40042R;

/* loaded from: classes6.dex */
public final class MergeSupportChatThreadRowViewBinding implements ViewBinding {
    public final View divider;
    private final View rootView;
    public final ImageView supportChatThreadRowAlertBadge;
    public final RdsPogView supportChatThreadRowAvatar;
    public final View supportChatThreadRowAvatarSliver;
    public final ImageView supportChatThreadRowEndCaret;
    public final RhTextView supportChatThreadRowSubtitleText;
    public final RhTextView supportChatThreadRowTimestampText;
    public final RhTextView supportChatThreadRowTitleText;
    public final View supportChatUnreadBadge;

    private MergeSupportChatThreadRowViewBinding(View view, View view2, ImageView imageView, RdsPogView rdsPogView, View view3, ImageView imageView2, RhTextView rhTextView, RhTextView rhTextView2, RhTextView rhTextView3, View view4) {
        this.rootView = view;
        this.divider = view2;
        this.supportChatThreadRowAlertBadge = imageView;
        this.supportChatThreadRowAvatar = rdsPogView;
        this.supportChatThreadRowAvatarSliver = view3;
        this.supportChatThreadRowEndCaret = imageView2;
        this.supportChatThreadRowSubtitleText = rhTextView;
        this.supportChatThreadRowTimestampText = rhTextView2;
        this.supportChatThreadRowTitleText = rhTextView3;
        this.supportChatUnreadBadge = view4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeSupportChatThreadRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C40042R.layout.merge_support_chat_thread_row_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeSupportChatThreadRowViewBinding bind(View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i = C40042R.id.divider;
        View viewFindChildViewById3 = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById3 != null) {
            i = C40042R.id.support_chat_thread_row_alert_badge;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C40042R.id.support_chat_thread_row_avatar;
                RdsPogView rdsPogView = (RdsPogView) ViewBindings.findChildViewById(view, i);
                if (rdsPogView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C40042R.id.support_chat_thread_row_avatar_sliver))) != null) {
                    i = C40042R.id.support_chat_thread_row_end_caret;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView2 != null) {
                        i = C40042R.id.support_chat_thread_row_subtitle_text;
                        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView != null) {
                            i = C40042R.id.support_chat_thread_row_timestamp_text;
                            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView2 != null) {
                                i = C40042R.id.support_chat_thread_row_title_text;
                                RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                if (rhTextView3 != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = C40042R.id.support_chat_unread_badge))) != null) {
                                    return new MergeSupportChatThreadRowViewBinding(view, viewFindChildViewById3, imageView, rdsPogView, viewFindChildViewById, imageView2, rhTextView, rhTextView2, rhTextView3, viewFindChildViewById2);
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
