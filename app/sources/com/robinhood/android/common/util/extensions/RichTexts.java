package com.robinhood.android.common.util.extensions;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.adjust.sdk.Constants;
import com.robinhood.android.common.util.text.ActionSpan;
import com.robinhood.android.deeplink.config.DeeplinkConfig;
import com.robinhood.android.designsystem.text.ThemableColorSpans3;
import com.robinhood.android.font.CustomTypefaceSpan;
import com.robinhood.android.font.RhTypeface;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.models.serverdriven.p347db.RichText;
import com.robinhood.models.serverdriven.p347db.ThemedColor;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: RichTexts.kt */
@Metadata(m3635d1 = {"\u00004\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001aE\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f¢\u0006\u0002\u0010\u000f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"ACCENT", "", "toSpannableString", "Landroid/text/SpannableString;", "Lcom/robinhood/models/serverdriven/db/RichText;", "context", "Landroid/content/Context;", "linkTextColor", "", "underlineLinkText", "", "linkClickCallback", "Lkotlin/Function1;", "Landroid/net/Uri;", "", "(Lcom/robinhood/models/serverdriven/db/RichText;Landroid/content/Context;Ljava/lang/Integer;ZLkotlin/jvm/functions/Function1;)Landroid/text/SpannableString;", "lib-common_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.common.util.extensions.RichTextsKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class RichTexts {
    private static final String ACCENT = "accent";

    /* compiled from: RichTexts.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.util.extensions.RichTextsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RichText.TextStyle.values().length];
            try {
                iArr[RichText.TextStyle.BOLD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RichText.TextStyle.ITALIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RichText.TextStyle.UNDERLINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RichText.TextStyle.HIGHLIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ SpannableString toSpannableString$default(RichText richText, Context context, Integer num, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            function1 = null;
        }
        return toSpannableString(richText, context, num, z, function1);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final SpannableString toSpannableString(RichText richText, final Context context, Integer num, boolean z, final Function1<? super Uri, Unit> function1) {
        Object customTypefaceSpan;
        Intrinsics.checkNotNullParameter(richText, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        SpannableString spannableString = new SpannableString(richText.getText());
        for (RichText.Attribute attribute : richText.getAttributes()) {
            TemporaryServerToBentoColorMapper temporaryServerToBentoColorMapper = TemporaryServerToBentoColorMapper.INSTANCE;
            ThemedColor highlight_color = attribute.getHighlight_color();
            if (highlight_color == null) {
                highlight_color = new ThemedColor(ACCENT, ACCENT);
            }
            ResourceReferences4<Integer> resourceReferences4MapColor = temporaryServerToBentoColorMapper.mapColor(highlight_color);
            RichText.TextStyle style = attribute.getStyle();
            int i = style == null ? -1 : WhenMappings.$EnumSwitchMapping$0[style.ordinal()];
            boolean z2 = true;
            if (i == -1) {
                customTypefaceSpan = null;
            } else if (i == 1) {
                customTypefaceSpan = new CustomTypefaceSpan(RhTypeface.BOLD.load(context));
            } else if (i == 2) {
                customTypefaceSpan = new StyleSpan(2);
            } else if (i == 3) {
                customTypefaceSpan = new UnderlineSpan();
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                if (resourceReferences4MapColor != null) {
                    customTypefaceSpan = new ThemableColorSpans3(resourceReferences4MapColor);
                }
            }
            if (customTypefaceSpan != null) {
                spannableString.setSpan(customTypefaceSpan, attribute.getLocation(), attribute.getLocation() + attribute.getLength(), 17);
            }
            Uri link = attribute.getLink();
            if (link != null) {
                String string2 = link.toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                final Uri uriBuild = StringsKt.isBlank(string2) ? null : link;
                if (uriBuild != null) {
                    if (uriBuild.getScheme() == null) {
                        uriBuild = uriBuild.buildUpon().scheme(Constants.SCHEME).build();
                    }
                    if (!z && attribute.getStyle() != RichText.TextStyle.UNDERLINE) {
                        z2 = false;
                    }
                    spannableString.setSpan(new ActionSpan(z2, (Function0<Unit>) new Function0() { // from class: com.robinhood.android.common.util.extensions.RichTextsKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return RichTexts.toSpannableString$lambda$2$lambda$1(uriBuild, context, function1);
                        }
                    }), attribute.getLocation(), attribute.getLocation() + attribute.getLength(), 17);
                    if (num != null) {
                        spannableString.setSpan(new ForegroundColorSpan(num.intValue()), attribute.getLocation(), attribute.getLocation() + attribute.getLength(), 17);
                    }
                }
            }
        }
        return spannableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit toSpannableString$lambda$2$lambda$1(Uri uri, Context context, Function1 function1) {
        if (Intrinsics.areEqual(uri != null ? uri.getScheme() : null, DeeplinkConfig.INSTANCE.getScheme())) {
            context.startActivity(new Intent("android.intent.action.VIEW", uri));
        } else {
            WebUtils.viewUrl$default(context, uri.toString(), 0, 4, (Object) null);
        }
        if (function1 != null) {
            Intrinsics.checkNotNull(uri);
            function1.invoke(uri);
        }
        return Unit.INSTANCE;
    }
}
