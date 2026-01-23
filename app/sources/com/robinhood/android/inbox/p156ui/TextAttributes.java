package com.robinhood.android.inbox.p156ui;

import android.content.Context;
import android.net.Uri;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.adjust.sdk.Constants;
import com.robinhood.android.common.util.text.ActionSpan;
import com.robinhood.android.font.CustomTypefaceSpan;
import com.robinhood.android.font.RhTypeface;
import com.robinhood.android.inbox.p156ui.thread.ThreadDetailViewState4;
import com.robinhood.android.utils.web.WebUtils;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TextAttributes.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m3636d2 = {"textAsSpannableString", "Landroid/text/SpannableString;", "Lcom/robinhood/android/inbox/ui/thread/ViewType$Text;", "context", "Landroid/content/Context;", "feature-inbox_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.inbox.ui.TextAttributesKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class TextAttributes {

    /* compiled from: TextAttributes.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.inbox.ui.TextAttributesKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ThreadDetailViewState4.Text.TextStyle.values().length];
            try {
                iArr[ThreadDetailViewState4.Text.TextStyle.BOLD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ThreadDetailViewState4.Text.TextStyle.ITALIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ThreadDetailViewState4.Text.TextStyle.UNDERLINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ThreadDetailViewState4.Text.TextStyle.HIGHLIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final SpannableString textAsSpannableString(ThreadDetailViewState4.Text text, final Context context) {
        Object customTypefaceSpan;
        final Uri link;
        Intrinsics.checkNotNullParameter(text, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        if (text.getText() == null) {
            return null;
        }
        SpannableString spannableString = new SpannableString(text.getText());
        if (text.getTextAttributes() != null) {
            for (ThreadDetailViewState4.Text.Attribute attribute : text.getTextAttributes()) {
                ThreadDetailViewState4.Text.TextStyle style = attribute.getStyle();
                int i = style == null ? -1 : WhenMappings.$EnumSwitchMapping$0[style.ordinal()];
                if (i == -1) {
                    customTypefaceSpan = null;
                } else if (i == 1) {
                    customTypefaceSpan = new CustomTypefaceSpan(RhTypeface.MEDIUM.load(context));
                } else if (i == 2) {
                    customTypefaceSpan = new StyleSpan(2);
                } else if (i != 3) {
                    if (i != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    customTypefaceSpan = null;
                } else {
                    customTypefaceSpan = new UnderlineSpan();
                }
                if (customTypefaceSpan != null) {
                    spannableString.setSpan(customTypefaceSpan, attribute.getLocation(), attribute.getLocation() + attribute.getLength(), 17);
                }
                if (attribute.getLink() != null) {
                    if (attribute.getLink().getScheme() == null) {
                        link = attribute.getLink().buildUpon().scheme(Constants.SCHEME).build();
                    } else {
                        link = attribute.getLink();
                    }
                    spannableString.setSpan(new ActionSpan(false, new Function0() { // from class: com.robinhood.android.inbox.ui.TextAttributesKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TextAttributes.textAsSpannableString$lambda$0(context, link);
                        }
                    }, 1, (DefaultConstructorMarker) null), attribute.getLocation(), attribute.getLocation() + attribute.getLength(), 17);
                }
            }
        }
        return spannableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit textAsSpannableString$lambda$0(Context context, Uri uri) {
        WebUtils.viewUrl$default(context, uri.toString(), 0, 4, (Object) null);
        return Unit.INSTANCE;
    }
}
