package com.withpersona.sdk2.inquiry.steps.p423ui.components.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.text.Spanned;
import android.text.style.URLSpan;
import android.util.Base64;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import com.withpersona.sdk2.inquiry.resources.R$color;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponentGroup;
import io.noties.markwon.Markwon;
import io.noties.markwon.core.spans.LinkSpan;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

/* compiled from: Extensions.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001aE\u0010\r\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0006*\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00050\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000e\u001a\u0019\u0010\u0013\u001a\u00020\u0012*\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0011\u0010\u0016\u001a\u00020\u0010*\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017\u001a'\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0001\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001d\"\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, m3636d2 = {"Landroid/content/Context;", "context", "Lio/noties/markwon/Markwon;", "getMarkwon", "(Landroid/content/Context;)Lio/noties/markwon/Markwon;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "T", "", "Lkotlin/reflect/KClass;", "type", "Lkotlin/Function1;", "", "predicate", "findFirst", "(Ljava/util/List;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function1;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Landroid/widget/TextView;", "", "text", "", "setMarkdown", "(Landroid/widget/TextView;Ljava/lang/String;)V", "Landroid/graphics/Bitmap;", "toBase64Png", "(Landroid/graphics/Bitmap;)Ljava/lang/String;", "", "defaultColor", "textSizeWidth", "Landroid/graphics/drawable/Drawable;", "getCountryPickerBackground", "(Landroid/content/Context;II)Landroid/graphics/drawable/Drawable;", "markwon", "Lio/noties/markwon/Markwon;", "ui-step-renderer_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes18.dex */
public final class ExtensionsKt {
    private static Markwon markwon;

    private static final Markwon getMarkwon(Context context) {
        Markwon markwon2 = markwon;
        if (markwon2 != null) {
            return markwon2;
        }
        Markwon markwonCreate = Markwon.create(context);
        markwon = markwonCreate;
        Intrinsics.checkNotNullExpressionValue(markwonCreate, "also(...)");
        return markwonCreate;
    }

    public static final <T extends UiComponent> T findFirst(List<? extends UiComponent> list, KClass<T> type2, Function1<? super T, Boolean> predicate) {
        T t;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Iterator<? extends UiComponent> it = list.iterator();
        while (it.hasNext()) {
            T t2 = (T) it.next();
            if (type2.isInstance(t2)) {
                Intrinsics.checkNotNull(t2, "null cannot be cast to non-null type T of com.withpersona.sdk2.inquiry.steps.ui.components.utils.ExtensionsKt.findFirst");
                if (predicate.invoke(t2).booleanValue()) {
                    return t2;
                }
            } else if ((t2 instanceof UiComponentGroup) && (t = (T) findFirst(((UiComponentGroup) t2).getChildren(), type2, predicate)) != null) {
                return t;
            }
        }
        return null;
    }

    public static final void setMarkdown(TextView textView, String text) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Markwon markwon2 = getMarkwon(context);
        Spanned markdown = markwon2.toMarkdown(text);
        Intrinsics.checkNotNullExpressionValue(markdown, "toMarkdown(...)");
        markwon2.setParsedMarkdown(textView, markdown);
        if (markdown.getSpans(0, markdown.length(), LinkSpan.class).length == 0 && markdown.getSpans(0, markdown.length(), URLSpan.class).length == 0) {
            textView.setMovementMethod(null);
        }
    }

    public static final String toBase64Png(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 3);
        Intrinsics.checkNotNull(strEncodeToString);
        return strEncodeToString;
    }

    public static final Drawable getCountryPickerBackground(Context context, int i, int i2) {
        Intrinsics.checkNotNullParameter(context, "context");
        int color = ContextCompat.getColor(context, R$color.pi2_country_code_selector_color);
        int color2 = ContextCompat.getColor(context, R$color.pi2_country_code_selector_color_dark);
        double dCalculateContrast = ColorUtils.calculateContrast(i, color);
        double dCalculateContrast2 = ColorUtils.calculateContrast(i, color2);
        float dpToPx = (float) com.withpersona.sdk2.inquiry.shared.ExtensionsKt.getDpToPx(8.0d);
        GradientDrawable gradientDrawable = new GradientDrawable();
        if (dCalculateContrast < dCalculateContrast2) {
            color = color2;
        }
        gradientDrawable.setColor(color);
        gradientDrawable.setCornerRadii(new float[]{dpToPx, dpToPx, dpToPx, dpToPx, dpToPx, dpToPx, dpToPx, dpToPx});
        gradientDrawable.setSize(i2 + ((int) com.withpersona.sdk2.inquiry.shared.ExtensionsKt.getDpToPx(24.0d)), gradientDrawable.getMinimumHeight());
        return new InsetDrawable((Drawable) gradientDrawable, (int) com.withpersona.sdk2.inquiry.shared.ExtensionsKt.getDpToPx(4.0d));
    }
}
