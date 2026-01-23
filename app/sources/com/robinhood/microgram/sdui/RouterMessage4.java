package com.robinhood.microgram.sdui;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import microgram.p507ui.p508v1.RouterOutboundDto;

/* compiled from: RouterMessage.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\"\u0015\u0010\u0004\u001a\u00020\u0005*\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b*\"\u0010\u0000\"\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\"\u0010\t\"\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u00012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u0001*\"\u0010\u000b\"\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u00012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u0001¨\u0006\u000e"}, m3636d2 = {"AnyEmbeddedSectionMessage", "Lcom/robinhood/android/shared/serverui/utils/UiObject;", "Lcom/robinhood/microgram/sdui/EmbeddedSectionMessage;", "Lmicrogram/ui/v1/RouterOutboundDto;", "legacyScreenType", "Lcom/robinhood/microgram/sdui/ScreenType;", "Lmicrogram/ui/v1/RouterOutboundDto$PushScreenDto;", "getLegacyScreenType", "(Lmicrogram/ui/v1/RouterOutboundDto$PushScreenDto;)Lcom/robinhood/microgram/sdui/ScreenType;", "AnyRouterMessage", "Lcom/robinhood/microgram/sdui/RouterMessage;", "AnyNavigationType", "Lcom/robinhood/microgram/sdui/NavigationType;", "Lmicrogram/ui/v1/NavigationTypeDto;", "lib-microgram-sdui-models_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.microgram.sdui.RouterMessageKt, reason: use source file name */
/* loaded from: classes13.dex */
public final class RouterMessage4 {
    public static final RouterMessage5 getLegacyScreenType(RouterOutboundDto.PushScreenDto pushScreenDto) {
        Intrinsics.checkNotNullParameter(pushScreenDto, "<this>");
        return RouterMessage5.INSTANCE.fromProtoValue(pushScreenDto.getScreen_type());
    }
}
