package com.robinhood.android.shareholderexperience.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.Barrier;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.shareholder.view.LiveInfoTag;
import com.robinhood.android.common.shareholder.view.ShareholderProfileIconView;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.designsystem.chip.RdsChip;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.shareholderexperience.C28477R;

/* loaded from: classes5.dex */
public final class MergeQuestionListHeaderViewBinding implements ViewBinding {
    public final View questionListHeaderBanner;
    public final RhTextView questionListHeaderDescription;
    public final LinearLayout questionListHeaderDropdowns;
    public final RdsTextButton questionListHeaderEventInfoButton;
    public final RdsChip questionListHeaderFilterChip;
    public final LiveInfoTag questionListHeaderInfoTag;
    public final RhTextView questionListHeaderSubtitle;
    public final Barrier questionListHeaderSubtitlePortraitBarrier;
    public final RhTextView questionListHeaderTitle;
    public final ShareholderProfileIconView questionListPortraitsCarousel;
    public final RdsChip questionListSortChip;
    private final View rootView;

    private MergeQuestionListHeaderViewBinding(View view, View view2, RhTextView rhTextView, LinearLayout linearLayout, RdsTextButton rdsTextButton, RdsChip rdsChip, LiveInfoTag liveInfoTag, RhTextView rhTextView2, Barrier barrier, RhTextView rhTextView3, ShareholderProfileIconView shareholderProfileIconView, RdsChip rdsChip2) {
        this.rootView = view;
        this.questionListHeaderBanner = view2;
        this.questionListHeaderDescription = rhTextView;
        this.questionListHeaderDropdowns = linearLayout;
        this.questionListHeaderEventInfoButton = rdsTextButton;
        this.questionListHeaderFilterChip = rdsChip;
        this.questionListHeaderInfoTag = liveInfoTag;
        this.questionListHeaderSubtitle = rhTextView2;
        this.questionListHeaderSubtitlePortraitBarrier = barrier;
        this.questionListHeaderTitle = rhTextView3;
        this.questionListPortraitsCarousel = shareholderProfileIconView;
        this.questionListSortChip = rdsChip2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeQuestionListHeaderViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C28477R.layout.merge_question_list_header_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeQuestionListHeaderViewBinding bind(View view) {
        int i = C28477R.id.question_list_header_banner;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            i = C28477R.id.question_list_header_description;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C28477R.id.question_list_header_dropdowns;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = C28477R.id.question_list_header_event_info_button;
                    RdsTextButton rdsTextButton = (RdsTextButton) ViewBindings.findChildViewById(view, i);
                    if (rdsTextButton != null) {
                        i = C28477R.id.question_list_header_filter_chip;
                        RdsChip rdsChip = (RdsChip) ViewBindings.findChildViewById(view, i);
                        if (rdsChip != null) {
                            i = C28477R.id.question_list_header_info_tag;
                            LiveInfoTag liveInfoTag = (LiveInfoTag) ViewBindings.findChildViewById(view, i);
                            if (liveInfoTag != null) {
                                i = C28477R.id.question_list_header_subtitle;
                                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                if (rhTextView2 != null) {
                                    i = C28477R.id.question_list_header_subtitle_portrait_barrier;
                                    Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
                                    if (barrier != null) {
                                        i = C28477R.id.question_list_header_title;
                                        RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                        if (rhTextView3 != null) {
                                            i = C28477R.id.question_list_portraits_carousel;
                                            ShareholderProfileIconView shareholderProfileIconView = (ShareholderProfileIconView) ViewBindings.findChildViewById(view, i);
                                            if (shareholderProfileIconView != null) {
                                                i = C28477R.id.question_list_sort_chip;
                                                RdsChip rdsChip2 = (RdsChip) ViewBindings.findChildViewById(view, i);
                                                if (rdsChip2 != null) {
                                                    return new MergeQuestionListHeaderViewBinding(view, viewFindChildViewById, rhTextView, linearLayout, rdsTextButton, rdsChip, liveInfoTag, rhTextView2, barrier, rhTextView3, shareholderProfileIconView, rdsChip2);
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
