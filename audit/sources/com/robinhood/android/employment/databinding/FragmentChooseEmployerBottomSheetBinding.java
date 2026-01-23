package com.robinhood.android.employment.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.employment.C14481R;

/* loaded from: classes7.dex */
public final class FragmentChooseEmployerBottomSheetBinding implements ViewBinding {
    public final RecyclerView chooseEmployerRecyclerView;
    private final RecyclerView rootView;

    private FragmentChooseEmployerBottomSheetBinding(RecyclerView recyclerView, RecyclerView recyclerView2) {
        this.rootView = recyclerView;
        this.chooseEmployerRecyclerView = recyclerView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RecyclerView getRoot() {
        return this.rootView;
    }

    public static FragmentChooseEmployerBottomSheetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentChooseEmployerBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C14481R.layout.fragment_choose_employer_bottom_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentChooseEmployerBottomSheetBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        RecyclerView recyclerView = (RecyclerView) view;
        return new FragmentChooseEmployerBottomSheetBinding(recyclerView, recyclerView);
    }
}
