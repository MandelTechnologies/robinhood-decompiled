package com.withpersona.sdk2.inquiry.steps.p423ui.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.TextView;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.p423ui.styling.TextStyling2;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StyleableSelectArrayAdapter.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B/\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/adapter/StyleableSelectArrayAdapter;", "Landroid/widget/ArrayAdapter;", "", "context", "Landroid/content/Context;", "resource", "", "objects", "", "textStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "<init>", "(Landroid/content/Context;ILjava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;)V", "getObjects", "()Ljava/util/List;", "getView", "Landroid/view/View;", "position", "convertView", "parent", "Landroid/view/ViewGroup;", "getFilter", "Landroid/widget/Filter;", "DisabledFilter", "ui-step-renderer_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class StyleableSelectArrayAdapter extends ArrayAdapter<String> {
    private final List<String> objects;
    private final TextBasedComponentStyle textStyle;

    public final List<String> getObjects() {
        return this.objects;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StyleableSelectArrayAdapter(Context context, int i, List<String> objects, TextBasedComponentStyle textBasedComponentStyle) {
        super(context, i, objects);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(objects, "objects");
        this.objects = objects;
        this.textStyle = textBasedComponentStyle;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int position, View convertView, ViewGroup parent) throws IllegalArgumentException {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = super.getView(position, convertView, parent);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        TextBasedComponentStyle textBasedComponentStyle = this.textStyle;
        if (textBasedComponentStyle != null) {
            TextView textView = view instanceof TextView ? (TextView) view : null;
            if (textView != null) {
                TextStyling2.style$default(textView, textBasedComponentStyle, null, 2, null);
            }
        }
        return view;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Filterable
    public Filter getFilter() {
        return new DisabledFilter();
    }

    /* compiled from: StyleableSelectArrayAdapter.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014J\u001c\u0010\b\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u000b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/adapter/StyleableSelectArrayAdapter$DisabledFilter;", "Landroid/widget/Filter;", "<init>", "(Lcom/withpersona/sdk2/inquiry/steps/ui/adapter/StyleableSelectArrayAdapter;)V", "performFiltering", "Landroid/widget/Filter$FilterResults;", "arg0", "", "publishResults", "", "arg1", "ui-step-renderer_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    private final class DisabledFilter extends Filter {
        public DisabledFilter() {
        }

        @Override // android.widget.Filter
        protected Filter.FilterResults performFiltering(CharSequence arg0) {
            Filter.FilterResults filterResults = new Filter.FilterResults();
            filterResults.values = StyleableSelectArrayAdapter.this.getObjects();
            filterResults.count = StyleableSelectArrayAdapter.this.getObjects().size();
            return filterResults;
        }

        @Override // android.widget.Filter
        protected void publishResults(CharSequence arg0, Filter.FilterResults arg1) {
            StyleableSelectArrayAdapter.this.notifyDataSetChanged();
        }
    }
}
