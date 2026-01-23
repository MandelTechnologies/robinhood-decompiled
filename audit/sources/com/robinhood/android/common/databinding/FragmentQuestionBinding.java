package com.robinhood.android.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.common.C11048R;

/* loaded from: classes2.dex */
public final class FragmentQuestionBinding implements ViewBinding {
    public final ListView listView;
    private final ListView rootView;

    private FragmentQuestionBinding(ListView listView, ListView listView2) {
        this.rootView = listView;
        this.listView = listView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ListView getRoot() {
        return this.rootView;
    }

    public static FragmentQuestionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentQuestionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C11048R.layout.fragment_question, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentQuestionBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        ListView listView = (ListView) view;
        return new FragmentQuestionBinding(listView, listView);
    }
}
