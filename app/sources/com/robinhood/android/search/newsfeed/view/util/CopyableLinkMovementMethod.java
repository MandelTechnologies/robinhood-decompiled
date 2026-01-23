package com.robinhood.android.search.newsfeed.view.util;

import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.saket.bettermovementmethod.BetterLinkMovementMethod;

/* compiled from: CopyableLinkMovementMethod.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J \u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0016¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/search/newsfeed/view/util/CopyableLinkMovementMethod;", "Lme/saket/bettermovementmethod/BetterLinkMovementMethod;", "<init>", "()V", "initialize", "", "widget", "Landroid/widget/TextView;", "text", "Landroid/text/Spannable;", "onTakeFocus", "view", "dir", "", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class CopyableLinkMovementMethod extends BetterLinkMovementMethod {
    public static final int $stable = 8;

    @Override // android.text.method.LinkMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public void initialize(TextView widget, Spannable text) {
        Intrinsics.checkNotNullParameter(widget, "widget");
        Intrinsics.checkNotNullParameter(text, "text");
        Selection.setSelection(text, text.length());
    }

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public void onTakeFocus(TextView view, Spannable text, int dir) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(text, "text");
        if ((dir & EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE) != 0) {
            if (view.getLayout() == null) {
                Selection.setSelection(text, text.length());
                return;
            }
            return;
        }
        Selection.setSelection(text, text.length());
    }
}
