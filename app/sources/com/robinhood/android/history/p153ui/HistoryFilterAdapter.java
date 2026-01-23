package com.robinhood.android.history.p153ui;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.appcompat.R$layout;
import androidx.appcompat.widget.ThemedSpinnerAdapter;
import com.robinhood.android.font.RhTypeface;
import com.robinhood.android.history.C18359R;
import com.robinhood.utils.extensions.ContextSystemServices;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HistoryFilterAdapter.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0018\u00010\u0013R\u00020\u0014H\u0016J\u000e\u0010\u0015\u001a\b\u0018\u00010\u0013R\u00020\u0014H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0017H\u0016J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u0017H\u0016J\"\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u00172\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010 \u001a\u00020!H\u0016J\"\u0010\"\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u00172\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010 \u001a\u00020!H\u0016R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/history/ui/HistoryFilterAdapter;", "Landroid/widget/BaseAdapter;", "Landroidx/appcompat/widget/ThemedSpinnerAdapter;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "items", "", "", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "helper", "Landroidx/appcompat/widget/ThemedSpinnerAdapter$Helper;", "setDropDownViewTheme", "", "theme", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "getDropDownViewTheme", "getCount", "", "getItem", "", "position", "getItemId", "", "getView", "Landroid/view/View;", "convertView", "parent", "Landroid/view/ViewGroup;", "getDropDownView", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class HistoryFilterAdapter extends BaseAdapter implements ThemedSpinnerAdapter {
    public static final int $stable = 8;
    private final ThemedSpinnerAdapter.Helper helper;
    private List<String> items;

    @Override // android.widget.Adapter
    public long getItemId(int position) {
        return position;
    }

    public HistoryFilterAdapter(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.items = CollectionsKt.emptyList();
        this.helper = new ThemedSpinnerAdapter.Helper(context);
    }

    public final List<String> getItems() {
        return this.items;
    }

    public final void setItems(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.items = list;
    }

    @Override // androidx.appcompat.widget.ThemedSpinnerAdapter
    public void setDropDownViewTheme(Resources.Theme theme) {
        this.helper.setDropDownViewTheme(theme);
    }

    @Override // androidx.appcompat.widget.ThemedSpinnerAdapter
    public Resources.Theme getDropDownViewTheme() {
        return this.helper.getDropDownViewTheme();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.items.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int position) {
        return this.items.get(position);
    }

    @Override // android.widget.Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (convertView == null) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            convertView = ContextSystemServices.getLayoutInflater(context).inflate(C18359R.layout.include_filter_spinner_item, parent, false);
        }
        Intrinsics.checkNotNull(convertView, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) convertView).setText(this.items.get(position));
        return convertView;
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (convertView == null) {
            convertView = this.helper.getDropDownViewInflater().inflate(R$layout.support_simple_spinner_dropdown_item, parent, false);
        }
        Intrinsics.checkNotNull(convertView, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) convertView;
        textView.setText(this.items.get(position));
        RhTypeface rhTypeface = RhTypeface.REGULAR;
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        textView.setTypeface(rhTypeface.load(context));
        textView.setTextSize(2, 20.0f);
        return convertView;
    }
}
