package com.robinhood.android.equitydetail.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.shareholder.view.LiveInfoTag;
import com.robinhood.android.common.shareholder.view.ShareholderProfileIconView;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.equitydetail.C15314R;

/* loaded from: classes3.dex */
public final class MergeQaEventViewBinding implements ViewBinding {
    public final Barrier contentBarrier;
    public final Space headerSpace;
    private final View rootView;
    public final RdsTextButton shareholderEventCta;
    public final Barrier shareholderEventDynamicContentBottomBarrier;
    public final RhTextView shareholderEventHeader;
    public final ShareholderProfileIconView shareholderEventIconCarousel;
    public final LiveInfoTag shareholderEventInfoTag;
    public final Guideline shareholderEventMidpoint;
    public final RhTextView shareholderEventNumberParticipated;
    public final Barrier shareholderEventNumberParticipatedEndBarrier;
    public final RhTextView shareholderEventNumberParticipatedLabel;
    public final RhTextView shareholderEventNumberQuestions;
    public final RhTextView shareholderEventNumberQuestionsLabel;
    public final RhTextView shareholderEventSubheader;

    private MergeQaEventViewBinding(View view, Barrier barrier, Space space, RdsTextButton rdsTextButton, Barrier barrier2, RhTextView rhTextView, ShareholderProfileIconView shareholderProfileIconView, LiveInfoTag liveInfoTag, Guideline guideline, RhTextView rhTextView2, Barrier barrier3, RhTextView rhTextView3, RhTextView rhTextView4, RhTextView rhTextView5, RhTextView rhTextView6) {
        this.rootView = view;
        this.contentBarrier = barrier;
        this.headerSpace = space;
        this.shareholderEventCta = rdsTextButton;
        this.shareholderEventDynamicContentBottomBarrier = barrier2;
        this.shareholderEventHeader = rhTextView;
        this.shareholderEventIconCarousel = shareholderProfileIconView;
        this.shareholderEventInfoTag = liveInfoTag;
        this.shareholderEventMidpoint = guideline;
        this.shareholderEventNumberParticipated = rhTextView2;
        this.shareholderEventNumberParticipatedEndBarrier = barrier3;
        this.shareholderEventNumberParticipatedLabel = rhTextView3;
        this.shareholderEventNumberQuestions = rhTextView4;
        this.shareholderEventNumberQuestionsLabel = rhTextView5;
        this.shareholderEventSubheader = rhTextView6;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeQaEventViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C15314R.layout.merge_qa_event_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeQaEventViewBinding bind(View view) {
        int i = C15314R.id.content_barrier;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
        if (barrier != null) {
            i = C15314R.id.header_space;
            Space space = (Space) ViewBindings.findChildViewById(view, i);
            if (space != null) {
                i = C15314R.id.shareholder_event_cta;
                RdsTextButton rdsTextButton = (RdsTextButton) ViewBindings.findChildViewById(view, i);
                if (rdsTextButton != null) {
                    i = C15314R.id.shareholder_event_dynamic_content_bottom_barrier;
                    Barrier barrier2 = (Barrier) ViewBindings.findChildViewById(view, i);
                    if (barrier2 != null) {
                        i = C15314R.id.shareholder_event_header;
                        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView != null) {
                            i = C15314R.id.shareholder_event_icon_carousel;
                            ShareholderProfileIconView shareholderProfileIconView = (ShareholderProfileIconView) ViewBindings.findChildViewById(view, i);
                            if (shareholderProfileIconView != null) {
                                i = C15314R.id.shareholder_event_info_tag;
                                LiveInfoTag liveInfoTag = (LiveInfoTag) ViewBindings.findChildViewById(view, i);
                                if (liveInfoTag != null) {
                                    i = C15314R.id.shareholder_event_midpoint;
                                    Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                                    if (guideline != null) {
                                        i = C15314R.id.shareholder_event_number_participated;
                                        RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                        if (rhTextView2 != null) {
                                            i = C15314R.id.shareholder_event_number_participated_end_barrier;
                                            Barrier barrier3 = (Barrier) ViewBindings.findChildViewById(view, i);
                                            if (barrier3 != null) {
                                                i = C15314R.id.shareholder_event_number_participated_label;
                                                RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                if (rhTextView3 != null) {
                                                    i = C15314R.id.shareholder_event_number_questions;
                                                    RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                    if (rhTextView4 != null) {
                                                        i = C15314R.id.shareholder_event_number_questions_label;
                                                        RhTextView rhTextView5 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                        if (rhTextView5 != null) {
                                                            i = C15314R.id.shareholder_event_subheader;
                                                            RhTextView rhTextView6 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                            if (rhTextView6 != null) {
                                                                return new MergeQaEventViewBinding(view, barrier, space, rdsTextButton, barrier2, rhTextView, shareholderProfileIconView, liveInfoTag, guideline, rhTextView2, barrier3, rhTextView3, rhTextView4, rhTextView5, rhTextView6);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
