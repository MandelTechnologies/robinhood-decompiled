package com.robinhood.utils.text;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Spannables.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0004\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/utils/text/Spans;", "", "<init>", "()V", "clickable", "Landroid/text/style/ClickableSpan;", "underline", "", "bold", "action", "Lkotlin/Function0;", "", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class Spans {
    public static final Spans INSTANCE = new Spans();

    private Spans() {
    }

    public static /* synthetic */ ClickableSpan clickable$default(Spans spans, boolean z, boolean z2, Function0 action, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        Intrinsics.checkNotNullParameter(action, "action");
        return new C420031(z, z2, action);
    }

    /* compiled from: Spannables.kt */
    @Metadata(m3635d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m3636d2 = {"com/robinhood/utils/text/Spans$clickable$1", "Landroid/text/style/ClickableSpan;", "updateDrawState", "", "textPaint", "Landroid/text/TextPaint;", "onClick", "widget", "Landroid/view/View;", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE)
    /* renamed from: com.robinhood.utils.text.Spans$clickable$1 */
    public static final class C420031 extends ClickableSpan {
        final /* synthetic */ Function0<Unit> $action;
        final /* synthetic */ boolean $bold;
        final /* synthetic */ boolean $underline;

        public C420031(boolean z, boolean z2, Function0<Unit> function0) {
            this.$underline = z;
            this.$bold = z2;
            this.$action = function0;
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "textPaint");
            textPaint.setColor(textPaint.linkColor);
            textPaint.setUnderlineText(this.$underline);
            if (this.$bold) {
                textPaint.setTypeface(Typeface.DEFAULT_BOLD);
            }
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            Intrinsics.checkNotNullParameter(widget, "widget");
            this.$action.invoke();
        }
    }

    public final ClickableSpan clickable(boolean underline, boolean bold, Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return new C420031(underline, bold, action);
    }
}
