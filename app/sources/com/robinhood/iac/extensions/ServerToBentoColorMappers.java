package com.robinhood.iac.extensions;

import com.robinhood.android.libdesignsystem.serverui.ServerToBentoColorMapper;
import com.robinhood.models.serverdriven.p347db.ThemedColor;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ServerToBentoColorMappers.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m3636d2 = {"mapDayNightSelectorServerColor", "Lcom/robinhood/scarlet/util/resource/ResourceReference;", "", "Lcom/robinhood/android/libdesignsystem/serverui/ServerToBentoColorMapper;", "themedColor", "Lcom/robinhood/models/serverdriven/db/ThemedColor;", "lib-iac-status-banner_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.iac.extensions.ServerToBentoColorMappersKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class ServerToBentoColorMappers {
    public static final ResourceReferences4<Integer> mapDayNightSelectorServerColor(ServerToBentoColorMapper serverToBentoColorMapper, ThemedColor themedColor) {
        Intrinsics.checkNotNullParameter(serverToBentoColorMapper, "<this>");
        Intrinsics.checkNotNullParameter(themedColor, "themedColor");
        return serverToBentoColorMapper.mapDayNightSelectorServerColor(themedColor.getLight(), themedColor.getDark());
    }
}
