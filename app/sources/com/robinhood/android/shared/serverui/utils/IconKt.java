package com.robinhood.android.shared.serverui.utils;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import rh_server_driven_ui.p531v1.Icon;
import rh_server_driven_ui.p531v1.IconDto;

/* compiled from: Icon.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"serverValue", "", "Lrh_server_driven_ui/v1/IconDto;", "getServerValue", "(Lrh_server_driven_ui/v1/IconDto;)Ljava/lang/String;", "Lrh_server_driven_ui/v1/Icon;", "(Lrh_server_driven_ui/v1/Icon;)Ljava/lang/String;", "lib-sdui-utils_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class IconKt {
    public static final String getServerValue(IconDto iconDto) {
        Intrinsics.checkNotNullParameter(iconDto, "<this>");
        String lowerCase = iconDto.name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String strSubstring = lowerCase.substring(5);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final String getServerValue(Icon icon) {
        Intrinsics.checkNotNullParameter(icon, "<this>");
        return getServerValue(IconDto.INSTANCE.fromProto(icon));
    }
}
