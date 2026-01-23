package com.robinhood.android.resumeapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.pog.RdsPogView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.resumeapplication.C26935R;

/* loaded from: classes5.dex */
public final class MergeResumeApplicationTimelineRowBinding implements ViewBinding {
    public final View dash;
    public final RdsPogView mainPog;
    private final View rootView;
    public final RhTextView subtitleText;
    public final RhTextView titleText;

    private MergeResumeApplicationTimelineRowBinding(View view, View view2, RdsPogView rdsPogView, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = view;
        this.dash = view2;
        this.mainPog = rdsPogView;
        this.subtitleText = rhTextView;
        this.titleText = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeResumeApplicationTimelineRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C26935R.layout.merge_resume_application_timeline_row, viewGroup);
        return bind(viewGroup);
    }

    public static MergeResumeApplicationTimelineRowBinding bind(View view) {
        int i = C26935R.id.dash;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            i = C26935R.id.main_pog;
            RdsPogView rdsPogView = (RdsPogView) ViewBindings.findChildViewById(view, i);
            if (rdsPogView != null) {
                i = C26935R.id.subtitle_text;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C26935R.id.title_text;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        return new MergeResumeApplicationTimelineRowBinding(view, viewFindChildViewById, rdsPogView, rhTextView, rhTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
