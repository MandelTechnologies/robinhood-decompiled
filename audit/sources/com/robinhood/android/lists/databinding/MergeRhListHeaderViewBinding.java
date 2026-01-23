package com.robinhood.android.lists.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.chip.Chip;
import com.robinhood.android.designsystem.inlinedefinition.RdsInlineDefinitionTextView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.lists.C20839R;

/* loaded from: classes8.dex */
public final class MergeRhListHeaderViewBinding implements ViewBinding {
    public final Space fragmentRhListBottomSpace;
    public final RdsInlineDefinitionTextView fragmentRhListDescription;
    public final ComposeView fragmentRhListHeaderIllustration;
    public final Chip fragmentRhListNewChip;
    public final RhTextView fragmentRhListSubtitle;
    public final RhTextView fragmentRhListTitle;
    private final View rootView;

    private MergeRhListHeaderViewBinding(View view, Space space, RdsInlineDefinitionTextView rdsInlineDefinitionTextView, ComposeView composeView, Chip chip, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = view;
        this.fragmentRhListBottomSpace = space;
        this.fragmentRhListDescription = rdsInlineDefinitionTextView;
        this.fragmentRhListHeaderIllustration = composeView;
        this.fragmentRhListNewChip = chip;
        this.fragmentRhListSubtitle = rhTextView;
        this.fragmentRhListTitle = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeRhListHeaderViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C20839R.layout.merge_rh_list_header_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeRhListHeaderViewBinding bind(View view) {
        int i = C20839R.id.fragment_rh_list_bottom_space;
        Space space = (Space) ViewBindings.findChildViewById(view, i);
        if (space != null) {
            i = C20839R.id.fragment_rh_list_description;
            RdsInlineDefinitionTextView rdsInlineDefinitionTextView = (RdsInlineDefinitionTextView) ViewBindings.findChildViewById(view, i);
            if (rdsInlineDefinitionTextView != null) {
                i = C20839R.id.fragment_rh_list_header_illustration;
                ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
                if (composeView != null) {
                    i = C20839R.id.fragment_rh_list_new_chip;
                    Chip chip = (Chip) ViewBindings.findChildViewById(view, i);
                    if (chip != null) {
                        i = C20839R.id.fragment_rh_list_subtitle;
                        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView != null) {
                            i = C20839R.id.fragment_rh_list_title;
                            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView2 != null) {
                                return new MergeRhListHeaderViewBinding(view, space, rdsInlineDefinitionTextView, composeView, chip, rhTextView, rhTextView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
