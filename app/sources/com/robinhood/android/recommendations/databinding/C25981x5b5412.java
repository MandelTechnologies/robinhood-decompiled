package com.robinhood.android.recommendations.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.recommendations.C25978R;

/* renamed from: com.robinhood.android.recommendations.databinding.FragmentRecommendationsReentryQuestionnaireConfirmationFragmentBinding */
/* loaded from: classes11.dex */
public final class C25981x5b5412 implements ViewBinding {
    public final RdsButton confirmBtn;
    public final RhTextView disclosure;
    public final RecyclerView list;
    private final LinearLayout rootView;
    public final RhTextView subtitle;
    public final RhTextView title;

    private C25981x5b5412(LinearLayout linearLayout, RdsButton rdsButton, RhTextView rhTextView, RecyclerView recyclerView, RhTextView rhTextView2, RhTextView rhTextView3) {
        this.rootView = linearLayout;
        this.confirmBtn = rdsButton;
        this.disclosure = rhTextView;
        this.list = recyclerView;
        this.subtitle = rhTextView2;
        this.title = rhTextView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static C25981x5b5412 inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static C25981x5b5412 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C25978R.layout.f4863xed7c750a, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static C25981x5b5412 bind(View view) {
        int i = C25978R.id.confirm_btn;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C25978R.id.disclosure;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C25978R.id.list;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    i = C25978R.id.subtitle;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        i = C25978R.id.title;
                        RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView3 != null) {
                            return new C25981x5b5412((LinearLayout) view, rdsButton, rhTextView, recyclerView, rhTextView2, rhTextView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
