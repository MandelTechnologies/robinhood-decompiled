package com.robinhood.android.optionchain.views;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.common.options.C11303R;
import com.robinhood.android.optionchain.extensions.UnderlyingQuoteModelUtil;
import com.robinhood.models.p355ui.UnderlyingQuote;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UnderlyingQuoteRowViewHolder.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/optionchain/views/UnderlyingQuoteRowViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "textView", "Landroid/widget/TextView;", "setUnderlyingQuote", "", "underlyingQuote", "Lcom/robinhood/models/ui/UnderlyingQuote;", "feature-lib-option-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class UnderlyingQuoteRowViewHolder extends RecyclerView.ViewHolder {
    public static final int $stable = 8;
    private final TextView textView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnderlyingQuoteRowViewHolder(View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(C11303R.id.section_header_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.textView = (TextView) viewFindViewById;
    }

    public final void setUnderlyingQuote(UnderlyingQuote underlyingQuote) {
        Intrinsics.checkNotNullParameter(underlyingQuote, "underlyingQuote");
        TextView textView = this.textView;
        Resources resources = textView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        textView.setText(UnderlyingQuoteModelUtil.getUnderlyingQuoteIndicatorText(underlyingQuote, resources));
    }
}
