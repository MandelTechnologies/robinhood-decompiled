package com.robinhood.android.common.history.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.history.C11183R;
import com.robinhood.android.common.history.p082ui.HistoryListView;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes2.dex */
public final class MergeUnifiedHistoryViewBinding implements ViewBinding {
    private final View rootView;
    public final RhTextView unifiedHistoryEmptyTxt;
    public final HistoryListView unifiedHistoryListView;
    public final RecyclerView unifiedHistoryPlaceholderList;

    private MergeUnifiedHistoryViewBinding(View view, RhTextView rhTextView, HistoryListView historyListView, RecyclerView recyclerView) {
        this.rootView = view;
        this.unifiedHistoryEmptyTxt = rhTextView;
        this.unifiedHistoryListView = historyListView;
        this.unifiedHistoryPlaceholderList = recyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeUnifiedHistoryViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C11183R.layout.merge_unified_history_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeUnifiedHistoryViewBinding bind(View view) {
        int i = C11183R.id.unified_history_empty_txt;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C11183R.id.unified_history_list_view;
            HistoryListView historyListView = (HistoryListView) ViewBindings.findChildViewById(view, i);
            if (historyListView != null) {
                i = C11183R.id.unified_history_placeholder_list;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    return new MergeUnifiedHistoryViewBinding(view, rhTextView, historyListView, recyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
