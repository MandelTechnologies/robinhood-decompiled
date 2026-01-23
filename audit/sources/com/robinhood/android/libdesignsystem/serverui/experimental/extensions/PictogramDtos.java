package com.robinhood.android.libdesignsystem.serverui.experimental.extensions;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import rh_server_driven_ui.p531v1.PictogramDto;

/* compiled from: PictogramDtos.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"serverValue", "", "Lrh_server_driven_ui/v1/PictogramDto;", "getServerValue", "(Lrh_server_driven_ui/v1/PictogramDto;)Ljava/lang/String;", "lib-sdui_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.extensions.PictogramDtosKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class PictogramDtos {
    public static final String getServerValue(PictogramDto pictogramDto) {
        Intrinsics.checkNotNullParameter(pictogramDto, "<this>");
        String lowerCase = pictogramDto.name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return StringsKt.drop(lowerCase, 10);
    }
}
