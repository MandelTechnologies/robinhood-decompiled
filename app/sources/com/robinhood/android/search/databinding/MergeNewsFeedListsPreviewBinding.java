package com.robinhood.android.search.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.CuratedListChipRecyclerView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.search.C27909R;

/* loaded from: classes5.dex */
public final class MergeNewsFeedListsPreviewBinding implements ViewBinding {
    public final ImageView newsFeedListsPreviewInfoIcon;
    public final CuratedListChipRecyclerView newsFeedListsPreviewRecyclerView;
    public final RhTextView newsFeedListsPreviewSubtitleTxt;
    public final RhTextView newsFeedListsPreviewTitleTxt;
    private final View rootView;

    private MergeNewsFeedListsPreviewBinding(View view, ImageView imageView, CuratedListChipRecyclerView curatedListChipRecyclerView, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = view;
        this.newsFeedListsPreviewInfoIcon = imageView;
        this.newsFeedListsPreviewRecyclerView = curatedListChipRecyclerView;
        this.newsFeedListsPreviewSubtitleTxt = rhTextView;
        this.newsFeedListsPreviewTitleTxt = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeNewsFeedListsPreviewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C27909R.layout.merge_news_feed_lists_preview, viewGroup);
        return bind(viewGroup);
    }

    public static MergeNewsFeedListsPreviewBinding bind(View view) {
        int i = C27909R.id.news_feed_lists_preview_info_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C27909R.id.news_feed_lists_preview_recycler_view;
            CuratedListChipRecyclerView curatedListChipRecyclerView = (CuratedListChipRecyclerView) ViewBindings.findChildViewById(view, i);
            if (curatedListChipRecyclerView != null) {
                i = C27909R.id.news_feed_lists_preview_subtitle_txt;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C27909R.id.news_feed_lists_preview_title_txt;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        return new MergeNewsFeedListsPreviewBinding(view, imageView, curatedListChipRecyclerView, rhTextView, rhTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
