package com.robinhood.android.search.selector.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.CuratedListChipRecyclerView;
import com.robinhood.android.designsystem.button.RdsIconButton;
import com.robinhood.android.designsystem.card.RdsCardView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.search.selector.C28142R;

/* loaded from: classes5.dex */
public final class FragmentSearchSelectorBinding implements ViewBinding {
    public final ConstraintLayout containerLayout;
    public final RhTextView nullStateDescriptionText;
    public final RhTextView nullStateDisclosureText;
    public final ImageView nullStateImage;
    private final ConstraintLayout rootView;
    public final RdsCardView searchCardView;
    public final RdsIconButton searchClearBtn;
    public final EditText searchEditText;
    public final ImageView searchMagIcon;
    public final RecyclerView searchResultRecyclerView;
    public final CuratedListChipRecyclerView stockChipsRecyclerView;
    public final RhTextView stockChipsTitle;

    private FragmentSearchSelectorBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, RhTextView rhTextView, RhTextView rhTextView2, ImageView imageView, RdsCardView rdsCardView, RdsIconButton rdsIconButton, EditText editText, ImageView imageView2, RecyclerView recyclerView, CuratedListChipRecyclerView curatedListChipRecyclerView, RhTextView rhTextView3) {
        this.rootView = constraintLayout;
        this.containerLayout = constraintLayout2;
        this.nullStateDescriptionText = rhTextView;
        this.nullStateDisclosureText = rhTextView2;
        this.nullStateImage = imageView;
        this.searchCardView = rdsCardView;
        this.searchClearBtn = rdsIconButton;
        this.searchEditText = editText;
        this.searchMagIcon = imageView2;
        this.searchResultRecyclerView = recyclerView;
        this.stockChipsRecyclerView = curatedListChipRecyclerView;
        this.stockChipsTitle = rhTextView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentSearchSelectorBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentSearchSelectorBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C28142R.layout.fragment_search_selector, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentSearchSelectorBinding bind(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = C28142R.id.null_state_description_text;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C28142R.id.null_state_disclosure_text;
            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView2 != null) {
                i = C28142R.id.null_state_image;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = C28142R.id.search_card_view;
                    RdsCardView rdsCardView = (RdsCardView) ViewBindings.findChildViewById(view, i);
                    if (rdsCardView != null) {
                        i = C28142R.id.search_clear_btn;
                        RdsIconButton rdsIconButton = (RdsIconButton) ViewBindings.findChildViewById(view, i);
                        if (rdsIconButton != null) {
                            i = C28142R.id.search_edit_text;
                            EditText editText = (EditText) ViewBindings.findChildViewById(view, i);
                            if (editText != null) {
                                i = C28142R.id.search_mag_icon;
                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView2 != null) {
                                    i = C28142R.id.search_result_recycler_view;
                                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                    if (recyclerView != null) {
                                        i = C28142R.id.stock_chips_recycler_view;
                                        CuratedListChipRecyclerView curatedListChipRecyclerView = (CuratedListChipRecyclerView) ViewBindings.findChildViewById(view, i);
                                        if (curatedListChipRecyclerView != null) {
                                            i = C28142R.id.stock_chips_title;
                                            RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                            if (rhTextView3 != null) {
                                                return new FragmentSearchSelectorBinding(constraintLayout, constraintLayout, rhTextView, rhTextView2, imageView, rdsCardView, rdsIconButton, editText, imageView2, recyclerView, curatedListChipRecyclerView, rhTextView3);
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
