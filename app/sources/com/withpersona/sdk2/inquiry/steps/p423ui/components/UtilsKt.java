package com.withpersona.sdk2.inquiry.steps.p423ui.components;

import android.content.Context;
import android.graphics.Typeface;
import androidx.core.content.res.ResourcesCompat;
import com.withpersona.sdk2.inquiry.shared.ResTools;
import com.withpersona.sdk2.inquiry.shared.ResTools2;
import com.withpersona.sdk2.inquiry.shared.p422ui.FontManager;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Utils.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Landroid/content/Context;", "context", "", "fontName", "Landroid/graphics/Typeface;", "getTypeface", "(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Typeface;", "ui-step-renderer_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class UtilsKt {
    public static final Typeface getTypeface(Context context, String fontName) {
        Typeface font;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fontName, "fontName");
        String str = fontName + ".ttf";
        FontManager.Companion companion = FontManager.INSTANCE;
        if (companion.getFontCache().containsKey(str)) {
            font = companion.getFontCache().get(str);
        } else {
            String[] list = context.getAssets().list("fonts");
            if (list != null && ArraysKt.contains(list, str)) {
                font = Typeface.createFromAsset(context.getAssets(), "fonts/" + str);
            } else {
                Integer numResourceIdFromName = ResTools.resourceIdFromName(context, fontName, ResTools2.Font);
                if (numResourceIdFromName != null) {
                    font = ResourcesCompat.getFont(context, numResourceIdFromName.intValue());
                }
                font = null;
            }
        }
        FontManager.INSTANCE.getFontCache().put(str, font);
        return font;
    }
}
