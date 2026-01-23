package com.robinhood.android.settings.p254ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.settings.p254ui.C28356R;
import com.robinhood.android.settings.p254ui.TextButtonView;

/* loaded from: classes5.dex */
public final class IncludeTextButtonViewSmallBinding implements ViewBinding {
    public final RdsTextButton button;
    private final TextButtonView rootView;

    private IncludeTextButtonViewSmallBinding(TextButtonView textButtonView, RdsTextButton rdsTextButton) {
        this.rootView = textButtonView;
        this.button = rdsTextButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public TextButtonView getRoot() {
        return this.rootView;
    }

    public static IncludeTextButtonViewSmallBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeTextButtonViewSmallBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C28356R.layout.include_text_button_view_small, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeTextButtonViewSmallBinding bind(View view) {
        int i = C28356R.id.button;
        RdsTextButton rdsTextButton = (RdsTextButton) ViewBindings.findChildViewById(view, i);
        if (rdsTextButton != null) {
            return new IncludeTextButtonViewSmallBinding((TextButtonView) view, rdsTextButton);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
