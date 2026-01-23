package com.robinhood.android.trade.directipo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.trade.directipo.C29323R;

/* loaded from: classes9.dex */
public final class IncludeDirectIpoConfirmationSpaceBinding implements ViewBinding {
    private final Space rootView;

    private IncludeDirectIpoConfirmationSpaceBinding(Space space) {
        this.rootView = space;
    }

    @Override // androidx.viewbinding.ViewBinding
    public Space getRoot() {
        return this.rootView;
    }

    public static IncludeDirectIpoConfirmationSpaceBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeDirectIpoConfirmationSpaceBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C29323R.layout.include_direct_ipo_confirmation_space, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeDirectIpoConfirmationSpaceBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeDirectIpoConfirmationSpaceBinding((Space) view);
    }
}
