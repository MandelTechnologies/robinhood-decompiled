package com.robinhood.android.util.style;

import android.R;
import android.content.res.ColorStateList;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import kotlin.Metadata;

/* compiled from: ThemeAttributes.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\bR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\b¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/util/style/ThemeAttributes;", "", "<init>", "()V", "COLOR_PRIMARY", "Lcom/robinhood/scarlet/util/resource/ThemedResourceReference;", "", "getCOLOR_PRIMARY", "()Lcom/robinhood/scarlet/util/resource/ThemedResourceReference;", "TEXT_COLOR_PRIMARY", "Landroid/content/res/ColorStateList;", "getTEXT_COLOR_PRIMARY", "TEXT_COLOR_SECONDARY", "getTEXT_COLOR_SECONDARY", "TEXT_COLOR_PRIMARY_NO_DISABLE", "getTEXT_COLOR_PRIMARY_NO_DISABLE", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class ThemeAttributes {
    public static final int $stable;
    private static final ThemedResourceReference<ColorStateList> TEXT_COLOR_PRIMARY;
    private static final ThemedResourceReference<ColorStateList> TEXT_COLOR_PRIMARY_NO_DISABLE;
    private static final ThemedResourceReference<ColorStateList> TEXT_COLOR_SECONDARY;
    public static final ThemeAttributes INSTANCE = new ThemeAttributes();
    private static final ThemedResourceReference<Integer> COLOR_PRIMARY = new ThemedResourceReference<>(ResourceType.COLOR.INSTANCE, R.attr.colorPrimary);

    private ThemeAttributes() {
    }

    static {
        ResourceType.COLOR_STATE_LIST color_state_list = ResourceType.COLOR_STATE_LIST.INSTANCE;
        TEXT_COLOR_PRIMARY = new ThemedResourceReference<>(color_state_list, R.attr.textColorPrimary);
        TEXT_COLOR_SECONDARY = new ThemedResourceReference<>(color_state_list, R.attr.textColorSecondary);
        TEXT_COLOR_PRIMARY_NO_DISABLE = new ThemedResourceReference<>(color_state_list, R.attr.textColorPrimaryNoDisable);
        $stable = ThemedResourceReference.$stable;
    }

    public final ThemedResourceReference<Integer> getCOLOR_PRIMARY() {
        return COLOR_PRIMARY;
    }

    public final ThemedResourceReference<ColorStateList> getTEXT_COLOR_PRIMARY() {
        return TEXT_COLOR_PRIMARY;
    }

    public final ThemedResourceReference<ColorStateList> getTEXT_COLOR_SECONDARY() {
        return TEXT_COLOR_SECONDARY;
    }

    public final ThemedResourceReference<ColorStateList> getTEXT_COLOR_PRIMARY_NO_DISABLE() {
        return TEXT_COLOR_PRIMARY_NO_DISABLE;
    }
}
