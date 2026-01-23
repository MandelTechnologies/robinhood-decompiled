package com.withpersona.sdk2.inquiry.governmentid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.withpersona.sdk2.inquiry.governmentid.R$id;
import com.withpersona.sdk2.inquiry.governmentid.R$layout;
import com.withpersona.sdk2.inquiry.shared.p422ui.Pi2NavigationBar;

/* loaded from: classes18.dex */
public final class Pi2GovernmentidInstructionsBinding implements ViewBinding {
    public final Barrier governmentidHeaderBottomBarrier;
    public final ConstraintLayout governmentidHeaderImageContainer;
    public final ImageView imageviewGovernmentidHeaderImage;
    public final View listDivider;
    public final Pi2NavigationBar navigationBar;
    public final RecyclerView recyclerviewGovernmentidIdlist;
    private final CoordinatorLayout rootView;
    public final TextView textviewGovernmentidInstructionsBody;
    public final TextView textviewGovernmentidInstructionsDisclaimer;
    public final TextView textviewGovernmentidInstructionsTitle;
    public final TextView textviewGovernmentidInstructionslistheader;

    private Pi2GovernmentidInstructionsBinding(CoordinatorLayout coordinatorLayout, Barrier barrier, ConstraintLayout constraintLayout, ImageView imageView, View view, Pi2NavigationBar pi2NavigationBar, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = coordinatorLayout;
        this.governmentidHeaderBottomBarrier = barrier;
        this.governmentidHeaderImageContainer = constraintLayout;
        this.imageviewGovernmentidHeaderImage = imageView;
        this.listDivider = view;
        this.navigationBar = pi2NavigationBar;
        this.recyclerviewGovernmentidIdlist = recyclerView;
        this.textviewGovernmentidInstructionsBody = textView;
        this.textviewGovernmentidInstructionsDisclaimer = textView2;
        this.textviewGovernmentidInstructionsTitle = textView3;
        this.textviewGovernmentidInstructionslistheader = textView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public CoordinatorLayout getRoot() {
        return this.rootView;
    }

    public static Pi2GovernmentidInstructionsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R$layout.pi2_governmentid_instructions, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static Pi2GovernmentidInstructionsBinding bind(View view) {
        View viewFindChildViewById;
        int i = R$id.governmentid_header_bottom_barrier;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
        if (barrier != null) {
            i = R$id.governmentid_header_image_container;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null) {
                i = R$id.imageview_governmentid_header_image;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R$id.list_divider))) != null) {
                    i = R$id.navigation_bar;
                    Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) ViewBindings.findChildViewById(view, i);
                    if (pi2NavigationBar != null) {
                        i = R$id.recyclerview_governmentid_idlist;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                        if (recyclerView != null) {
                            i = R$id.textview_governmentid_instructions_body;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView != null) {
                                i = R$id.textview_governmentid_instructions_disclaimer;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView2 != null) {
                                    i = R$id.textview_governmentid_instructions_title;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView3 != null) {
                                        i = R$id.textview_governmentid_instructionslistheader;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView4 != null) {
                                            return new Pi2GovernmentidInstructionsBinding((CoordinatorLayout) view, barrier, constraintLayout, imageView, viewFindChildViewById, pi2NavigationBar, recyclerView, textView, textView2, textView3, textView4);
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
