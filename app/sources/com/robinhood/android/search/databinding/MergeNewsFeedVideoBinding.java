package com.robinhood.android.search.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.newsfeed.p200ui.NewsFeedRelatedInstrumentsView;
import com.robinhood.android.search.C27909R;
import com.robinhood.android.video.VideoPlayerContainer;

/* loaded from: classes5.dex */
public final class MergeNewsFeedVideoBinding implements ViewBinding {
    public final View newsFeedVideoBottomDivider;
    public final Space newsFeedVideoBottomSpace;
    public final VideoPlayerContainer newsFeedVideoPlayerContainer;
    public final NewsFeedRelatedInstrumentsView newsFeedVideoRelatedInstruments;
    public final ConstraintLayout newsFeedVideoRootView;
    public final ImageView newsFeedVideoSoundOffBtn;
    public final ImageView newsFeedVideoSoundOnBtn;
    public final RhTextView newsFeedVideoSourceTxt;
    public final RhTextView newsFeedVideoTimeTxt;
    public final RhTextView newsFeedVideoTitleTxt;
    private final ConstraintLayout rootView;

    private MergeNewsFeedVideoBinding(ConstraintLayout constraintLayout, View view, Space space, VideoPlayerContainer videoPlayerContainer, NewsFeedRelatedInstrumentsView newsFeedRelatedInstrumentsView, ConstraintLayout constraintLayout2, ImageView imageView, ImageView imageView2, RhTextView rhTextView, RhTextView rhTextView2, RhTextView rhTextView3) {
        this.rootView = constraintLayout;
        this.newsFeedVideoBottomDivider = view;
        this.newsFeedVideoBottomSpace = space;
        this.newsFeedVideoPlayerContainer = videoPlayerContainer;
        this.newsFeedVideoRelatedInstruments = newsFeedRelatedInstrumentsView;
        this.newsFeedVideoRootView = constraintLayout2;
        this.newsFeedVideoSoundOffBtn = imageView;
        this.newsFeedVideoSoundOnBtn = imageView2;
        this.newsFeedVideoSourceTxt = rhTextView;
        this.newsFeedVideoTimeTxt = rhTextView2;
        this.newsFeedVideoTitleTxt = rhTextView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static MergeNewsFeedVideoBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static MergeNewsFeedVideoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C27909R.layout.merge_news_feed_video, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static MergeNewsFeedVideoBinding bind(View view) {
        int i = C27909R.id.news_feed_video_bottom_divider;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            i = C27909R.id.news_feed_video_bottom_space;
            Space space = (Space) ViewBindings.findChildViewById(view, i);
            if (space != null) {
                i = C27909R.id.news_feed_video_player_container;
                VideoPlayerContainer videoPlayerContainer = (VideoPlayerContainer) ViewBindings.findChildViewById(view, i);
                if (videoPlayerContainer != null) {
                    i = C27909R.id.news_feed_video_related_instruments;
                    NewsFeedRelatedInstrumentsView newsFeedRelatedInstrumentsView = (NewsFeedRelatedInstrumentsView) ViewBindings.findChildViewById(view, i);
                    if (newsFeedRelatedInstrumentsView != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                        i = C27909R.id.news_feed_video_sound_off_btn;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView != null) {
                            i = C27909R.id.news_feed_video_sound_on_btn;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView2 != null) {
                                i = C27909R.id.news_feed_video_source_txt;
                                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                                if (rhTextView != null) {
                                    i = C27909R.id.news_feed_video_time_txt;
                                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                    if (rhTextView2 != null) {
                                        i = C27909R.id.news_feed_video_title_txt;
                                        RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                        if (rhTextView3 != null) {
                                            return new MergeNewsFeedVideoBinding(constraintLayout, viewFindChildViewById, space, videoPlayerContainer, newsFeedRelatedInstrumentsView, constraintLayout, imageView, imageView2, rhTextView, rhTextView2, rhTextView3);
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
