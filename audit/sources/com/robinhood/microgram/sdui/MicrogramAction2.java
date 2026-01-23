package com.robinhood.microgram.sdui;

import com.robinhood.android.idl.common.DtoUtils;
import com.robinhood.android.shared.serverui.utils.UiObject;
import com.squareup.wire.AnyMessage;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import microgram.p507ui.p508v1.ActionDto;

/* compiled from: MicrogramAction.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0003\u001a\"\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0018\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0004j\b\u0012\u0004\u0012\u00020\u0001`\u0005¨\u0006\u0006"}, m3636d2 = {"toMicrogramAction", "Lcom/robinhood/microgram/sdui/MicrogramAction;", "Lmicrogram/ui/v1/ActionDto;", "Lrh_server_driven_ui/v1/ActionDto;", "Lcom/robinhood/android/shared/serverui/utils/UiObject;", "Lcom/robinhood/android/shared/serverui/utils/AnyAction;", "lib-microgram-sdui-models_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.microgram.sdui.MicrogramActionKt, reason: use source file name */
/* loaded from: classes13.dex */
public final class MicrogramAction2 {
    public static final MicrogramAction toMicrogramAction(ActionDto actionDto) {
        Intrinsics.checkNotNullParameter(actionDto, "<this>");
        return new MicrogramAction(actionDto.getIdentifier());
    }

    public static final MicrogramAction toMicrogramAction(rh_server_driven_ui.p531v1.ActionDto actionDto) {
        AnyMessage concrete;
        ActionDto actionDto2;
        if (actionDto == null || (concrete = actionDto.getConcrete()) == null || (actionDto2 = (ActionDto) DtoUtils.unpackOrNull(concrete, ActionDto.INSTANCE)) == null) {
            return null;
        }
        return toMicrogramAction(actionDto2);
    }

    public static final MicrogramAction toMicrogramAction(UiObject<MicrogramAction, rh_server_driven_ui.p531v1.ActionDto> uiObject) {
        ActionDto actionDto;
        String identifier;
        Intrinsics.checkNotNullParameter(uiObject, "<this>");
        if (uiObject instanceof UiObject.Legacy) {
            return (MicrogramAction) ((UiObject.Legacy) uiObject).getValue();
        }
        if (!(uiObject instanceof UiObject.Idl)) {
            throw new NoWhenBranchMatchedException();
        }
        AnyMessage concrete = ((rh_server_driven_ui.p531v1.ActionDto) ((UiObject.Idl) uiObject).getValue()).getConcrete();
        if (concrete == null || (actionDto = (ActionDto) DtoUtils.unpackOrNull(concrete, ActionDto.INSTANCE)) == null || (identifier = actionDto.getIdentifier()) == null) {
            return null;
        }
        return new MicrogramAction(identifier);
    }
}
