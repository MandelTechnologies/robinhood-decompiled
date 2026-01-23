package com.withpersona.sdk2.inquiry.governmentid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.withpersona.sdk2.inquiry.governmentid.R$id;
import com.withpersona.sdk2.inquiry.governmentid.R$layout;
import com.withpersona.sdk2.inquiry.shared.p422ui.ButtonWithLoadingIndicator;
import com.withpersona.sdk2.inquiry.shared.p422ui.Pi2NavigationBar;

/* loaded from: classes18.dex */
public final class Pi2GovernmentidReviewSelectedImageBinding implements ViewBinding {
    public final TextView body;
    public final Button chooseNewPhotoButton;
    public final ImageView fileIcon;
    public final TextView fileNameTextview;
    public final ImageView imageView;
    public final CardView imageViewContainer;
    public final Pi2NavigationBar navigationBar;
    private final CoordinatorLayout rootView;
    public final TextView title;
    public final ButtonWithLoadingIndicator usePhotoButton;

    private Pi2GovernmentidReviewSelectedImageBinding(CoordinatorLayout coordinatorLayout, TextView textView, Button button, ImageView imageView, TextView textView2, ImageView imageView2, CardView cardView, Pi2NavigationBar pi2NavigationBar, TextView textView3, ButtonWithLoadingIndicator buttonWithLoadingIndicator) {
        this.rootView = coordinatorLayout;
        this.body = textView;
        this.chooseNewPhotoButton = button;
        this.fileIcon = imageView;
        this.fileNameTextview = textView2;
        this.imageView = imageView2;
        this.imageViewContainer = cardView;
        this.navigationBar = pi2NavigationBar;
        this.title = textView3;
        this.usePhotoButton = buttonWithLoadingIndicator;
    }

    @Override // androidx.viewbinding.ViewBinding
    public CoordinatorLayout getRoot() {
        return this.rootView;
    }

    public static Pi2GovernmentidReviewSelectedImageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R$layout.pi2_governmentid_review_selected_image, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static Pi2GovernmentidReviewSelectedImageBinding bind(View view) {
        int i = R$id.body;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R$id.choose_new_photo_button;
            Button button = (Button) ViewBindings.findChildViewById(view, i);
            if (button != null) {
                i = R$id.file_icon;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = R$id.file_name_textview;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        i = R$id.image_view;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView2 != null) {
                            i = R$id.image_view_container;
                            CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
                            if (cardView != null) {
                                i = R$id.navigation_bar;
                                Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) ViewBindings.findChildViewById(view, i);
                                if (pi2NavigationBar != null) {
                                    i = R$id.title;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView3 != null) {
                                        i = R$id.use_photo_button;
                                        ButtonWithLoadingIndicator buttonWithLoadingIndicator = (ButtonWithLoadingIndicator) ViewBindings.findChildViewById(view, i);
                                        if (buttonWithLoadingIndicator != null) {
                                            return new Pi2GovernmentidReviewSelectedImageBinding((CoordinatorLayout) view, textView, button, imageView, textView2, imageView2, cardView, pi2NavigationBar, textView3, buttonWithLoadingIndicator);
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
