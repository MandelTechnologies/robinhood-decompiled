package com.robinhood.android.matcha.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsIconButton;
import com.robinhood.android.designsystem.progress.RdsProgressBar;
import com.robinhood.android.designsystem.row.component.RdsRowTextContainerView;
import com.robinhood.android.matcha.C21284R;
import com.robinhood.android.matcha.p177ui.search.MatchaSearchCheckBox;

/* loaded from: classes8.dex */
public final class IncludeMatchaSearchUserRowBinding implements ViewBinding {
    public final ComposeView avatarComposeView;
    public final View divider;
    public final RdsIconButton infoButton;
    public final RdsProgressBar loadingView;
    private final ConstraintLayout rootView;
    public final RdsRowTextContainerView rowTextContainer;
    public final MatchaSearchCheckBox selectTransactorCheckbox;

    private IncludeMatchaSearchUserRowBinding(ConstraintLayout constraintLayout, ComposeView composeView, View view, RdsIconButton rdsIconButton, RdsProgressBar rdsProgressBar, RdsRowTextContainerView rdsRowTextContainerView, MatchaSearchCheckBox matchaSearchCheckBox) {
        this.rootView = constraintLayout;
        this.avatarComposeView = composeView;
        this.divider = view;
        this.infoButton = rdsIconButton;
        this.loadingView = rdsProgressBar;
        this.rowTextContainer = rdsRowTextContainerView;
        this.selectTransactorCheckbox = matchaSearchCheckBox;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static IncludeMatchaSearchUserRowBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeMatchaSearchUserRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C21284R.layout.include_matcha_search_user_row, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeMatchaSearchUserRowBinding bind(View view) {
        View viewFindChildViewById;
        int i = C21284R.id.avatar_compose_view;
        ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
        if (composeView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C21284R.id.divider))) != null) {
            i = C21284R.id.info_button;
            RdsIconButton rdsIconButton = (RdsIconButton) ViewBindings.findChildViewById(view, i);
            if (rdsIconButton != null) {
                i = C21284R.id.loading_view;
                RdsProgressBar rdsProgressBar = (RdsProgressBar) ViewBindings.findChildViewById(view, i);
                if (rdsProgressBar != null) {
                    i = C21284R.id.row_text_container;
                    RdsRowTextContainerView rdsRowTextContainerView = (RdsRowTextContainerView) ViewBindings.findChildViewById(view, i);
                    if (rdsRowTextContainerView != null) {
                        i = C21284R.id.select_transactor_checkbox;
                        MatchaSearchCheckBox matchaSearchCheckBox = (MatchaSearchCheckBox) ViewBindings.findChildViewById(view, i);
                        if (matchaSearchCheckBox != null) {
                            return new IncludeMatchaSearchUserRowBinding((ConstraintLayout) view, composeView, viewFindChildViewById, rdsIconButton, rdsProgressBar, rdsRowTextContainerView, matchaSearchCheckBox);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
