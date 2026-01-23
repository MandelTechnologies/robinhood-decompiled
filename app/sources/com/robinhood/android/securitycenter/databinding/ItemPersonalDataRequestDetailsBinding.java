package com.robinhood.android.securitycenter.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.row.component.RdsRowTextContainerView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.securitycenter.C28186R;
import com.robinhood.android.securitycenter.p251ui.data.personal.PersonalDataRequestDetailsItemView;

/* loaded from: classes5.dex */
public final class ItemPersonalDataRequestDetailsBinding implements ViewBinding {
    public final RhTextView detailsBody;
    public final RdsRowTextContainerView detailsHeader;
    public final ImageView detailsToggleImage;
    private final PersonalDataRequestDetailsItemView rootView;
    public final View rowBottomDivider;

    private ItemPersonalDataRequestDetailsBinding(PersonalDataRequestDetailsItemView personalDataRequestDetailsItemView, RhTextView rhTextView, RdsRowTextContainerView rdsRowTextContainerView, ImageView imageView, View view) {
        this.rootView = personalDataRequestDetailsItemView;
        this.detailsBody = rhTextView;
        this.detailsHeader = rdsRowTextContainerView;
        this.detailsToggleImage = imageView;
        this.rowBottomDivider = view;
    }

    @Override // androidx.viewbinding.ViewBinding
    public PersonalDataRequestDetailsItemView getRoot() {
        return this.rootView;
    }

    public static ItemPersonalDataRequestDetailsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemPersonalDataRequestDetailsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C28186R.layout.item_personal_data_request_details, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ItemPersonalDataRequestDetailsBinding bind(View view) {
        View viewFindChildViewById;
        int i = C28186R.id.details_body;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C28186R.id.details_header;
            RdsRowTextContainerView rdsRowTextContainerView = (RdsRowTextContainerView) ViewBindings.findChildViewById(view, i);
            if (rdsRowTextContainerView != null) {
                i = C28186R.id.details_toggle_image;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C28186R.id.row_bottom_divider))) != null) {
                    return new ItemPersonalDataRequestDetailsBinding((PersonalDataRequestDetailsItemView) view, rhTextView, rdsRowTextContainerView, imageView, viewFindChildViewById);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
