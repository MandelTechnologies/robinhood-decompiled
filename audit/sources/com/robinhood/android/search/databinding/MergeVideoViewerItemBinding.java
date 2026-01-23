package com.robinhood.android.search.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Space;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.newsfeed.p200ui.NewsFeedRelatedInstrumentsView;
import com.robinhood.android.search.C27909R;
import com.robinhood.android.video.VideoPlayerContainer;

/* loaded from: classes5.dex */
public final class MergeVideoViewerItemBinding implements ViewBinding {
    public final Space newsFeedVideoItemBottomSpace;
    public final View newsFeedVideoItemDarkOverlay;
    public final VideoPlayerContainer newsFeedVideoItemPlayerContainer;
    public final NewsFeedRelatedInstrumentsView newsFeedVideoItemRelatedInstruments;
    public final ImageView newsFeedVideoItemReplayImg;
    public final RhTextView newsFeedVideoItemSourceTxt;
    public final RhTextView newsFeedVideoItemTimeTxt;
    public final RhTextView newsFeedVideoItemTitleTxt;
    private final View rootView;

    private MergeVideoViewerItemBinding(View view, Space space, View view2, VideoPlayerContainer videoPlayerContainer, NewsFeedRelatedInstrumentsView newsFeedRelatedInstrumentsView, ImageView imageView, RhTextView rhTextView, RhTextView rhTextView2, RhTextView rhTextView3) {
        this.rootView = view;
        this.newsFeedVideoItemBottomSpace = space;
        this.newsFeedVideoItemDarkOverlay = view2;
        this.newsFeedVideoItemPlayerContainer = videoPlayerContainer;
        this.newsFeedVideoItemRelatedInstruments = newsFeedRelatedInstrumentsView;
        this.newsFeedVideoItemReplayImg = imageView;
        this.newsFeedVideoItemSourceTxt = rhTextView;
        this.newsFeedVideoItemTimeTxt = rhTextView2;
        this.newsFeedVideoItemTitleTxt = rhTextView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeVideoViewerItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C27909R.layout.merge_video_viewer_item, viewGroup);
        return bind(viewGroup);
    }

    public static MergeVideoViewerItemBinding bind(View view) {
        View viewFindChildViewById;
        int i = C27909R.id.news_feed_video_item_bottom_space;
        Space space = (Space) ViewBindings.findChildViewById(view, i);
        if (space != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C27909R.id.news_feed_video_item_dark_overlay))) != null) {
            i = C27909R.id.news_feed_video_item_player_container;
            VideoPlayerContainer videoPlayerContainer = (VideoPlayerContainer) ViewBindings.findChildViewById(view, i);
            if (videoPlayerContainer != null) {
                i = C27909R.id.news_feed_video_item_related_instruments;
                NewsFeedRelatedInstrumentsView newsFeedRelatedInstrumentsView = (NewsFeedRelatedInstrumentsView) ViewBindings.findChildViewById(view, i);
                if (newsFeedRelatedInstrumentsView != null) {
                    i = C27909R.id.news_feed_video_item_replay_img;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = C27909R.id.news_feed_video_item_source_txt;
                        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView != null) {
                            i = C27909R.id.news_feed_video_item_time_txt;
                            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView2 != null) {
                                i = C27909R.id.news_feed_video_item_title_txt;
                                RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                if (rhTextView3 != null) {
                                    return new MergeVideoViewerItemBinding(view, space, viewFindChildViewById, videoPlayerContainer, newsFeedRelatedInstrumentsView, imageView, rhTextView, rhTextView2, rhTextView3);
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
