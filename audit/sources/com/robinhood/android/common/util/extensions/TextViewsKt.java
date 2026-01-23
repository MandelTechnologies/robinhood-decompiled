package com.robinhood.android.common.util.extensions;

import android.content.res.Resources;
import android.text.Layout;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.widget.TextView;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.util.text.ActionSpan;
import com.robinhood.utils.extensions.ViewsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import me.saket.bettermovementmethod.BetterLinkMovementMethod;

/* compiled from: TextViews.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aH\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u000e\b\u0004\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0087\bø\u0001\u0000\u001aH\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\u000e\u001a\u00020\r2\u000e\b\u0004\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0087\bø\u0001\u0000\u001a:\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\u000e\u001a\u00020\r\u001a8\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\u000e\u001a\u00020\r\u001a:\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\u0011\u001aJ\u0010\u0012\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u0013\u001a\u00020\r2\b\b\u0001\u0010\u0014\u001a\u00020\r2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b\u001a\n\u0010\u0015\u001a\u00020\u0006*\u00020\u0002\u001a\n\u0010\u0016\u001a\u00020\u0006*\u00020\u0002\u001aJ\u0010\u0017\u001a\u00020\u0001*\u00020\u000228\b\u0004\u0010\u0018\u001a2\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00060\u0019H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001d"}, m3636d2 = {"setTextWithLearnMore", "", "Landroid/widget/TextView;", "mainStr", "", "underline", "", "bold", "learnMoreStr", "", "learnMore", "Lkotlin/Function0;", "mainStrRes", "", "learnMoreTextRes", "url", "clickableSpan", "Landroid/text/style/ClickableSpan;", "setTextWithLearnMoreAndSuffix", "learnMoreRes", "suffixRes", "isNotEmpty", "isTruncated", "setOnLinkClickListener", "action", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "v", "lib-common_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class TextViewsKt {
    public static /* synthetic */ void setTextWithLearnMore$default(TextView textView, CharSequence mainStr, boolean z, boolean z2, String str, Function0 learnMore, int i, Object obj) {
        boolean z3 = false;
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        DefaultConstructorMarker defaultConstructorMarker = null;
        if ((i & 8) != 0) {
            str = null;
        }
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(mainStr, "mainStr");
        Intrinsics.checkNotNullParameter(learnMore, "learnMore");
        setTextWithLearnMore(textView, mainStr, z, z2, str, new ActionSpan(z3, new C118781(learnMore), 1, defaultConstructorMarker));
    }

    /* compiled from: TextViews.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE)
    /* renamed from: com.robinhood.android.common.util.extensions.TextViewsKt$setTextWithLearnMore$1 */
    public static final class C118781 implements Function0<Unit> {
        final /* synthetic */ Function0<Unit> $learnMore;

        public C118781(Function0<Unit> function0) {
            this.$learnMore = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$learnMore.invoke();
        }
    }

    @JvmOverloads
    public static final void setTextWithLearnMore(TextView textView, CharSequence mainStr, Function0<Unit> learnMore) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(mainStr, "mainStr");
        Intrinsics.checkNotNullParameter(learnMore, "learnMore");
        setTextWithLearnMore(textView, mainStr, false, false, (String) null, (ClickableSpan) new ActionSpan(false, (Function0) new C118781(learnMore), 1, (DefaultConstructorMarker) null));
    }

    @JvmOverloads
    public static final void setTextWithLearnMore(TextView textView, CharSequence mainStr, boolean z, Function0<Unit> learnMore) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(mainStr, "mainStr");
        Intrinsics.checkNotNullParameter(learnMore, "learnMore");
        setTextWithLearnMore(textView, mainStr, z, false, (String) null, (ClickableSpan) new ActionSpan(false, (Function0) new C118781(learnMore), 1, (DefaultConstructorMarker) null));
    }

    @JvmOverloads
    public static final void setTextWithLearnMore(TextView textView, CharSequence mainStr, boolean z, boolean z2, String str, Function0<Unit> learnMore) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(mainStr, "mainStr");
        Intrinsics.checkNotNullParameter(learnMore, "learnMore");
        setTextWithLearnMore(textView, mainStr, z, z2, str, new ActionSpan(false, (Function0) new C118781(learnMore), 1, (DefaultConstructorMarker) null));
    }

    @JvmOverloads
    public static final void setTextWithLearnMore(TextView textView, CharSequence mainStr, boolean z, boolean z2, Function0<Unit> learnMore) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(mainStr, "mainStr");
        Intrinsics.checkNotNullParameter(learnMore, "learnMore");
        setTextWithLearnMore(textView, mainStr, z, z2, (String) null, new ActionSpan(false, (Function0) new C118781(learnMore), 1, (DefaultConstructorMarker) null));
    }

    public static /* synthetic */ void setTextWithLearnMore$default(TextView textView, int i, boolean z, boolean z2, int i2, Function0 learnMore, int i3, Object obj) {
        boolean z3 = false;
        if ((i3 & 2) != 0) {
            z = false;
        }
        if ((i3 & 4) != 0) {
            z2 = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(learnMore, "learnMore");
        String string2 = ViewsKt.getString(textView, i);
        Integer numValueOf = Integer.valueOf(i2);
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        setTextWithLearnMore(textView, string2, z, z2, numValueOf != null ? ViewsKt.getString(textView, numValueOf.intValue()) : null, new ActionSpan(z3, new C118794(learnMore), 1, defaultConstructorMarker));
    }

    /* compiled from: TextViews.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE)
    /* renamed from: com.robinhood.android.common.util.extensions.TextViewsKt$setTextWithLearnMore$4 */
    public static final class C118794 implements Function0<Unit> {
        final /* synthetic */ Function0<Unit> $learnMore;

        public C118794(Function0<Unit> function0) {
            this.$learnMore = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$learnMore.invoke();
        }
    }

    @JvmOverloads
    public static final void setTextWithLearnMore(TextView textView, int i, Function0<Unit> learnMore) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(learnMore, "learnMore");
        String string2 = ViewsKt.getString(textView, i);
        boolean z = false;
        DefaultConstructorMarker defaultConstructorMarker = null;
        num = num.intValue() == 0 ? null : 0;
        setTextWithLearnMore(textView, (CharSequence) string2, false, false, num != null ? ViewsKt.getString(textView, num.intValue()) : null, (ClickableSpan) new ActionSpan(z, new C118794(learnMore), 1, defaultConstructorMarker));
    }

    @JvmOverloads
    public static final void setTextWithLearnMore(TextView textView, int i, boolean z, Function0<Unit> learnMore) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(learnMore, "learnMore");
        String string2 = ViewsKt.getString(textView, i);
        boolean z2 = false;
        DefaultConstructorMarker defaultConstructorMarker = null;
        num = num.intValue() == 0 ? null : 0;
        setTextWithLearnMore(textView, (CharSequence) string2, z, false, num != null ? ViewsKt.getString(textView, num.intValue()) : null, (ClickableSpan) new ActionSpan(z2, new C118794(learnMore), 1, defaultConstructorMarker));
    }

    @JvmOverloads
    public static final void setTextWithLearnMore(TextView textView, int i, boolean z, boolean z2, int i2, Function0<Unit> learnMore) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(learnMore, "learnMore");
        String string2 = ViewsKt.getString(textView, i);
        Integer numValueOf = Integer.valueOf(i2);
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        setTextWithLearnMore(textView, string2, z, z2, numValueOf != null ? ViewsKt.getString(textView, numValueOf.intValue()) : null, new ActionSpan(false, (Function0) new C118794(learnMore), 1, defaultConstructorMarker));
    }

    @JvmOverloads
    public static final void setTextWithLearnMore(TextView textView, int i, boolean z, boolean z2, Function0<Unit> learnMore) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(learnMore, "learnMore");
        String string2 = ViewsKt.getString(textView, i);
        boolean z3 = false;
        DefaultConstructorMarker defaultConstructorMarker = null;
        num = num.intValue() == 0 ? null : 0;
        setTextWithLearnMore(textView, string2, z, z2, num != null ? ViewsKt.getString(textView, num.intValue()) : null, new ActionSpan(z3, new C118794(learnMore), 1, defaultConstructorMarker));
    }

    public static /* synthetic */ void setTextWithLearnMore$default(TextView textView, int i, String str, boolean z, boolean z2, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            z2 = false;
        }
        if ((i3 & 16) != 0) {
            i2 = 0;
        }
        setTextWithLearnMore(textView, i, str, z, z2, i2);
    }

    public static final void setTextWithLearnMore(TextView textView, int i, String url, boolean z, boolean z2, int i2) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(url, "url");
        String string2 = ViewsKt.getString(textView, i);
        Integer numValueOf = Integer.valueOf(i2);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        setTextWithLearnMore(textView, string2, z, z2, numValueOf != null ? ViewsKt.getString(textView, numValueOf.intValue()) : null, new URLSpan(url));
    }

    public static /* synthetic */ void setTextWithLearnMore$default(TextView textView, CharSequence charSequence, String str, boolean z, boolean z2, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        if ((i2 & 8) != 0) {
            z2 = false;
        }
        if ((i2 & 16) != 0) {
            i = 0;
        }
        setTextWithLearnMore(textView, charSequence, str, z, z2, i);
    }

    public static final void setTextWithLearnMore(TextView textView, CharSequence mainStr, String url, boolean z, boolean z2, int i) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(mainStr, "mainStr");
        Intrinsics.checkNotNullParameter(url, "url");
        Integer numValueOf = Integer.valueOf(i);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        setTextWithLearnMore(textView, mainStr, z, z2, numValueOf != null ? ViewsKt.getString(textView, numValueOf.intValue()) : null, new URLSpan(url));
    }

    public static /* synthetic */ void setTextWithLearnMore$default(TextView textView, CharSequence charSequence, boolean z, boolean z2, String str, ClickableSpan clickableSpan, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        if ((i & 8) != 0) {
            str = null;
        }
        setTextWithLearnMore(textView, charSequence, z, z2, str, clickableSpan);
    }

    public static final void setTextWithLearnMore(TextView textView, CharSequence mainStr, boolean z, boolean z2, String str, ClickableSpan clickableSpan) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(mainStr, "mainStr");
        Intrinsics.checkNotNullParameter(clickableSpan, "clickableSpan");
        Resources resources = textView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        textView.setText(LearnMoresKt.buildTextWithLearnMore$default(resources, mainStr, z2, null, z, str, clickableSpan, 4, null));
        textView.setMovementMethod(new LinkMovementMethod());
    }

    public static /* synthetic */ void setTextWithLearnMoreAndSuffix$default(TextView textView, int i, int i2, int i3, boolean z, boolean z2, Function0 function0, int i4, Object obj) {
        if ((i4 & 8) != 0) {
            z = false;
        }
        if ((i4 & 16) != 0) {
            z2 = false;
        }
        setTextWithLearnMoreAndSuffix(textView, i, i2, i3, z, z2, function0);
    }

    public static final void setTextWithLearnMoreAndSuffix(TextView textView, int i, int i2, int i3, boolean z, boolean z2, Function0<Unit> learnMore) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(learnMore, "learnMore");
        Resources resources = textView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        textView.setText(LearnMoresKt.buildTextWithLearnMoreAndSuffix(resources, i, i2, i3, z, z2, learnMore));
        textView.setMovementMethod(new LinkMovementMethod());
    }

    public static final boolean isNotEmpty(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        CharSequence text = textView.getText();
        return text != null && text.length() > 0;
    }

    public static final boolean isTruncated(TextView textView) {
        int lineCount;
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Layout layout = textView.getLayout();
        if (layout == null || (lineCount = layout.getLineCount()) < textView.getMaxLines()) {
            return false;
        }
        int iMax = 0;
        for (int i = 0; i < lineCount; i++) {
            if (layout.getEllipsisCount(i) > 0) {
                return true;
            }
            if (i < lineCount - 1) {
                iMax = Math.max(iMax, layout.getLineEnd(i) - layout.getLineStart(i));
            }
        }
        int i2 = lineCount - 1;
        return layout.getLineEnd(i2) - layout.getLineStart(i2) > iMax;
    }

    public static final void setOnLinkClickListener(TextView textView, final Function2<? super TextView, ? super String, Boolean> action) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        BetterLinkMovementMethod betterLinkMovementMethodNewInstance = BetterLinkMovementMethod.newInstance();
        betterLinkMovementMethodNewInstance.setOnLinkClickListener(new BetterLinkMovementMethod.OnLinkClickListener() { // from class: com.robinhood.android.common.util.extensions.TextViewsKt.setOnLinkClickListener.1
            @Override // me.saket.bettermovementmethod.BetterLinkMovementMethod.OnLinkClickListener
            public final boolean onClick(TextView textView2, String str) {
                Function2<TextView, String, Boolean> function2 = action;
                Intrinsics.checkNotNull(textView2);
                Intrinsics.checkNotNull(str);
                return function2.invoke(textView2, str).booleanValue();
            }
        });
        textView.setMovementMethod(betterLinkMovementMethodNewInstance);
    }
}
