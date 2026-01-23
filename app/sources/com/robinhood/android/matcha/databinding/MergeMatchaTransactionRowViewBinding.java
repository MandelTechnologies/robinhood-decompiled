package com.robinhood.android.matcha.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.constraintlayout.widget.Barrier;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.row.component.RdsRowTextContainerView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.matcha.C21284R;

/* loaded from: classes8.dex */
public final class MergeMatchaTransactionRowViewBinding implements ViewBinding {
    public final ComposeView avatarComposeView;
    public final Barrier buttonBarrier;
    public final View divider;
    public final RhTextView memoText;
    public final RdsButton primaryButton;
    private final View rootView;
    public final RdsRowTextContainerView rowTextContainer;
    public final RdsButton secondaryButton;

    private MergeMatchaTransactionRowViewBinding(View view, ComposeView composeView, Barrier barrier, View view2, RhTextView rhTextView, RdsButton rdsButton, RdsRowTextContainerView rdsRowTextContainerView, RdsButton rdsButton2) {
        this.rootView = view;
        this.avatarComposeView = composeView;
        this.buttonBarrier = barrier;
        this.divider = view2;
        this.memoText = rhTextView;
        this.primaryButton = rdsButton;
        this.rowTextContainer = rdsRowTextContainerView;
        this.secondaryButton = rdsButton2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeMatchaTransactionRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C21284R.layout.merge_matcha_transaction_row_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeMatchaTransactionRowViewBinding bind(View view) {
        View viewFindChildViewById;
        int i = C21284R.id.avatar_compose_view;
        ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
        if (composeView != null) {
            i = C21284R.id.button_barrier;
            Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
            if (barrier != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C21284R.id.divider))) != null) {
                i = C21284R.id.memo_text;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C21284R.id.primary_button;
                    RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                    if (rdsButton != null) {
                        i = C21284R.id.row_text_container;
                        RdsRowTextContainerView rdsRowTextContainerView = (RdsRowTextContainerView) ViewBindings.findChildViewById(view, i);
                        if (rdsRowTextContainerView != null) {
                            i = C21284R.id.secondary_button;
                            RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                            if (rdsButton2 != null) {
                                return new MergeMatchaTransactionRowViewBinding(view, composeView, barrier, viewFindChildViewById, rhTextView, rdsButton, rdsRowTextContainerView, rdsButton2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
