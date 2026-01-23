package com.robinhood.android.common.options.upgrade;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.robinhood.android.designsystem.row.RdsRowView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RdsRowAdapter.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b¢\u0006\u0004\b\t\u0010\nJ\"\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/common/options/upgrade/RdsRowAdapter;", "Landroid/widget/ArrayAdapter;", "", "context", "Landroid/content/Context;", "layoutResource", "", "answers", "", "<init>", "(Landroid/content/Context;ILjava/util/List;)V", "layoutRes", "getView", "Landroid/view/View;", "position", "currentView", "parent", "Landroid/view/ViewGroup;", "feature-lib-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class RdsRowAdapter extends ArrayAdapter<String> {
    public static final int $stable = 8;
    private int layoutRes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RdsRowAdapter(Context context, int i, List<String> answers) {
        super(context, i, answers);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(answers, "answers");
        this.layoutRes = i;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int position, View currentView, ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (currentView == null) {
            currentView = LayoutInflater.from(getContext()).inflate(this.layoutRes, (ViewGroup) null);
        }
        String str = (String) getItem(position);
        if (str != null) {
            Intrinsics.checkNotNull(currentView, "null cannot be cast to non-null type com.robinhood.android.designsystem.row.RdsRowView");
            ((RdsRowView) currentView).setPrimaryText(str);
        }
        Intrinsics.checkNotNull(currentView);
        return currentView;
    }
}
