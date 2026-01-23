package com.robinhood.android.util.extensions;

import android.content.Context;
import android.net.Uri;
import android.text.SpannableString;
import com.robinhood.android.common.util.extensions.RichTexts;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.models.serverdriven.experimental.api.Icon;
import com.robinhood.models.serverdriven.experimental.api.RichTextAttribute;
import com.robinhood.models.serverdriven.experimental.api.RichTextStyle;
import com.robinhood.models.serverdriven.p347db.RichText;
import com.robinhood.models.serverdriven.p347db.ThemedColor;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: IconExtensions.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001aE\u0010\u000e\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0017¢\u0006\u0002\u0010\u001a\u001a\n\u0010\u001b\u001a\u00020\u001c*\u00020\u0010\u001a\f\u0010\u001d\u001a\u00020\u001e*\u00020\u001fH\u0002\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u001a\u0010\t\u001a\u0004\u0018\u00010\n*\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006 "}, m3636d2 = {"resourceId", "", "Lcom/robinhood/models/serverdriven/experimental/api/Icon;", "getResourceId", "(Lcom/robinhood/models/serverdriven/experimental/api/Icon;)I", "contentDescription", "", "getContentDescription", "(Lcom/robinhood/models/serverdriven/experimental/api/Icon;)Ljava/lang/String;", "nonGeneratedStyle", "Lcom/robinhood/models/serverdriven/db/RichText$TextStyle;", "Lcom/robinhood/models/serverdriven/experimental/api/RichTextStyle;", "getNonGeneratedStyle", "(Lcom/robinhood/models/serverdriven/experimental/api/RichTextStyle;)Lcom/robinhood/models/serverdriven/db/RichText$TextStyle;", "toSpannableString", "Landroid/text/SpannableString;", "Lcom/robinhood/models/serverdriven/experimental/api/RichText;", "context", "Landroid/content/Context;", "linkTextColor", "underlineLinkText", "", "linkClickCallback", "Lkotlin/Function1;", "Landroid/net/Uri;", "", "(Lcom/robinhood/models/serverdriven/experimental/api/RichText;Landroid/content/Context;Ljava/lang/Integer;ZLkotlin/jvm/functions/Function1;)Landroid/text/SpannableString;", "toDbRichText", "Lcom/robinhood/models/serverdriven/db/RichText;", "toDbColor", "Lcom/robinhood/models/serverdriven/db/ThemedColor;", "Lcom/robinhood/models/serverdriven/experimental/api/ThemedColor;", "lib-common_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.util.extensions.IconExtensionsKt, reason: use source file name */
/* loaded from: classes20.dex */
public final class IconExtensions {

    /* compiled from: IconExtensions.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.util.extensions.IconExtensionsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RichTextStyle.values().length];
            try {
                iArr[RichTextStyle.BOLD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RichTextStyle.ITALIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RichTextStyle.UNDERLINED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RichTextStyle.HIGHLIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[RichTextStyle.NONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final int getResourceId(Icon icon) {
        Intrinsics.checkNotNullParameter(icon, "<this>");
        for (ServerToBentoAssetMapper2 serverToBentoAssetMapper2 : ServerToBentoAssetMapper2.values()) {
            if (Intrinsics.areEqual(serverToBentoAssetMapper2.getServerValue(), icon.getServerValue())) {
                return serverToBentoAssetMapper2.getResourceId();
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final String getContentDescription(Icon icon) {
        Intrinsics.checkNotNullParameter(icon, "<this>");
        return StringsKt.replace$default(icon.getServerValue(), "_", PlaceholderUtils.XXShortPlaceholderText, false, 4, (Object) null);
    }

    private static final RichText.TextStyle getNonGeneratedStyle(RichTextStyle richTextStyle) {
        int i = WhenMappings.$EnumSwitchMapping$0[richTextStyle.ordinal()];
        if (i == 1) {
            return RichText.TextStyle.BOLD;
        }
        if (i == 2) {
            return RichText.TextStyle.ITALIC;
        }
        if (i == 3) {
            return RichText.TextStyle.UNDERLINE;
        }
        if (i == 4) {
            return RichText.TextStyle.HIGHLIGHT;
        }
        if (i == 5) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ SpannableString toSpannableString$default(com.robinhood.models.serverdriven.experimental.api.RichText richText, Context context, Integer num, boolean z, Function1 function1, int i, Object obj) {
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

    public static final SpannableString toSpannableString(com.robinhood.models.serverdriven.experimental.api.RichText richText, Context context, Integer num, boolean z, Function1<? super Uri, Unit> function1) {
        Intrinsics.checkNotNullParameter(richText, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        return RichTexts.toSpannableString(toDbRichText(richText), context, num, z, function1);
    }

    public static final RichText toDbRichText(com.robinhood.models.serverdriven.experimental.api.RichText richText) {
        Intrinsics.checkNotNullParameter(richText, "<this>");
        String text = richText.getText();
        List<RichTextAttribute> attributes = richText.getAttributes();
        ArrayList arrayList = new ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(attributes, 10));
        for (RichTextAttribute richTextAttribute : attributes) {
            int location = richTextAttribute.getLocation();
            int length = richTextAttribute.getLength();
            String link = richTextAttribute.getLink();
            ThemedColor dbColor = null;
            Uri uri = link != null ? Uri.parse(link) : null;
            RichText.TextStyle nonGeneratedStyle = getNonGeneratedStyle(richTextAttribute.getStyle());
            com.robinhood.models.serverdriven.experimental.api.ThemedColor highlight_color = richTextAttribute.getHighlight_color();
            if (highlight_color != null) {
                dbColor = toDbColor(highlight_color);
            }
            arrayList.add(new RichText.Attribute(location, length, uri, nonGeneratedStyle, dbColor));
        }
        return new RichText(text, arrayList);
    }

    private static final ThemedColor toDbColor(com.robinhood.models.serverdriven.experimental.api.ThemedColor themedColor) {
        return new ThemedColor(themedColor.getLight().getServerValue(), themedColor.getDark().getServerValue());
    }
}
