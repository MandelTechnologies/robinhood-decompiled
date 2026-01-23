package com.robinhood.android.lib.newsfeed.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.lib.newsfeed.C20334R;
import com.robinhood.shared.education.p377ui.EducationSeriesLessonsCarouselView;

/* loaded from: classes8.dex */
public final class MergeNewsFeedEducationCarouselViewBinding implements ViewBinding {
    public final RhTextView newsFeedEducationCarouselTitleTxt;
    public final RdsTextButton newsFeedEducationEntryPointBtn;
    private final View rootView;
    public final EducationSeriesLessonsCarouselView seriesCarouselView;

    private MergeNewsFeedEducationCarouselViewBinding(View view, RhTextView rhTextView, RdsTextButton rdsTextButton, EducationSeriesLessonsCarouselView educationSeriesLessonsCarouselView) {
        this.rootView = view;
        this.newsFeedEducationCarouselTitleTxt = rhTextView;
        this.newsFeedEducationEntryPointBtn = rdsTextButton;
        this.seriesCarouselView = educationSeriesLessonsCarouselView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeNewsFeedEducationCarouselViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C20334R.layout.merge_news_feed_education_carousel_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeNewsFeedEducationCarouselViewBinding bind(View view) {
        int i = C20334R.id.news_feed_education_carousel_title_txt;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C20334R.id.news_feed_education_entry_point_btn;
            RdsTextButton rdsTextButton = (RdsTextButton) ViewBindings.findChildViewById(view, i);
            if (rdsTextButton != null) {
                i = C20334R.id.series_carousel_view;
                EducationSeriesLessonsCarouselView educationSeriesLessonsCarouselView = (EducationSeriesLessonsCarouselView) ViewBindings.findChildViewById(view, i);
                if (educationSeriesLessonsCarouselView != null) {
                    return new MergeNewsFeedEducationCarouselViewBinding(view, rhTextView, rdsTextButton, educationSeriesLessonsCarouselView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
