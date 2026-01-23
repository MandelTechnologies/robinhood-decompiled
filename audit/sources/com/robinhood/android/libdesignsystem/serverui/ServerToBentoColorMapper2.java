package com.robinhood.android.libdesignsystem.serverui;

import com.robinhood.android.designsystem.color.RdsColor;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import kotlin.Metadata;

/* compiled from: ServerToBentoColorMapper.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u0002H\u0002\u001a\u0016\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0002¨\u0006\u0006"}, m3636d2 = {"colorResourceValue", "Lcom/robinhood/scarlet/util/resource/ThemedResourceReference;", "", "attrId", "rdsColor", "Lcom/robinhood/android/designsystem/color/RdsColor;", "lib-sdui-legacy_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.libdesignsystem.serverui.ServerToBentoColorMapperKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class ServerToBentoColorMapper2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final ThemedResourceReference<Integer> colorResourceValue(int i) {
        return new ThemedResourceReference<>(ResourceType.COLOR.INSTANCE, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ThemedResourceReference<Integer> colorResourceValue(RdsColor rdsColor) {
        return rdsColor.getBase();
    }
}
