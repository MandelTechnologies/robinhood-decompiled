package com.robinhood.android.directipo.allocation.clarity.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.directipo.allocation.clarity.C14172R;

/* loaded from: classes27.dex */
public final class MergeIpoLearningHubParticipantVisualSectionViewBinding implements ViewBinding {
    private final View rootView;
    public final RhTextView sectionParticipantDescription;
    public final ImageView sectionParticipantImage;
    public final ImageView sectionParticipantKeyImage;
    public final RhTextView sectionParticipantKeyTitle;

    private MergeIpoLearningHubParticipantVisualSectionViewBinding(View view, RhTextView rhTextView, ImageView imageView, ImageView imageView2, RhTextView rhTextView2) {
        this.rootView = view;
        this.sectionParticipantDescription = rhTextView;
        this.sectionParticipantImage = imageView;
        this.sectionParticipantKeyImage = imageView2;
        this.sectionParticipantKeyTitle = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeIpoLearningHubParticipantVisualSectionViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C14172R.layout.merge_ipo_learning_hub_participant_visual_section_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeIpoLearningHubParticipantVisualSectionViewBinding bind(View view) {
        int i = C14172R.id.section_participant_description;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C14172R.id.section_participant_image;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C14172R.id.section_participant_key_image;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView2 != null) {
                    i = C14172R.id.section_participant_key_title;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        return new MergeIpoLearningHubParticipantVisualSectionViewBinding(view, rhTextView, imageView, imageView2, rhTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
