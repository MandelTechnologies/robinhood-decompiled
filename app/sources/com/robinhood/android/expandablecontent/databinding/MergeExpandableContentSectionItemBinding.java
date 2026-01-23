package com.robinhood.android.expandablecontent.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.row.component.RdsRowTextContainerView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.expandablecontent.C16618R;

/* loaded from: classes3.dex */
public final class MergeExpandableContentSectionItemBinding implements ViewBinding {
    private final View rootView;
    public final RhTextView sectionBody;
    public final RhTextView sectionDisclosure;
    public final View sectionDivider;
    public final RdsRowTextContainerView sectionHeader;
    public final ImageView sectionImage;
    public final ImageView sectionToggleImage;

    private MergeExpandableContentSectionItemBinding(View view, RhTextView rhTextView, RhTextView rhTextView2, View view2, RdsRowTextContainerView rdsRowTextContainerView, ImageView imageView, ImageView imageView2) {
        this.rootView = view;
        this.sectionBody = rhTextView;
        this.sectionDisclosure = rhTextView2;
        this.sectionDivider = view2;
        this.sectionHeader = rdsRowTextContainerView;
        this.sectionImage = imageView;
        this.sectionToggleImage = imageView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeExpandableContentSectionItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C16618R.layout.merge_expandable_content_section_item, viewGroup);
        return bind(viewGroup);
    }

    public static MergeExpandableContentSectionItemBinding bind(View view) {
        View viewFindChildViewById;
        int i = C16618R.id.section_body;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C16618R.id.section_disclosure;
            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C16618R.id.section_divider))) != null) {
                i = C16618R.id.section_header;
                RdsRowTextContainerView rdsRowTextContainerView = (RdsRowTextContainerView) ViewBindings.findChildViewById(view, i);
                if (rdsRowTextContainerView != null) {
                    i = C16618R.id.section_image;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = C16618R.id.section_toggle_image;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView2 != null) {
                            return new MergeExpandableContentSectionItemBinding(view, rhTextView, rhTextView2, viewFindChildViewById, rdsRowTextContainerView, imageView, imageView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
