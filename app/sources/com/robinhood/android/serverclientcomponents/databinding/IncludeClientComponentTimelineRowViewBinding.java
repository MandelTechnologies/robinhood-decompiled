package com.robinhood.android.serverclientcomponents.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.serverclientcomponents.C28308R;
import com.robinhood.android.serverclientcomponents.timeline.ClientComponentTimelineRowView;

/* loaded from: classes5.dex */
public final class IncludeClientComponentTimelineRowViewBinding implements ViewBinding {
    private final ClientComponentTimelineRowView rootView;

    private IncludeClientComponentTimelineRowViewBinding(ClientComponentTimelineRowView clientComponentTimelineRowView) {
        this.rootView = clientComponentTimelineRowView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ClientComponentTimelineRowView getRoot() {
        return this.rootView;
    }

    public static IncludeClientComponentTimelineRowViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeClientComponentTimelineRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C28308R.layout.include_client_component_timeline_row_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeClientComponentTimelineRowViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeClientComponentTimelineRowViewBinding((ClientComponentTimelineRowView) view);
    }
}
