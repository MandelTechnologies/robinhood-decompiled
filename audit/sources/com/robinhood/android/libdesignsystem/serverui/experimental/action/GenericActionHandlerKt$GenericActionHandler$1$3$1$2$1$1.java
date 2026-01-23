package com.robinhood.android.libdesignsystem.serverui.experimental.action;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import rh_server_driven_ui.p531v1.ActionDto;
import rh_server_driven_ui.p531v1.GenericActionDto;

/* compiled from: GenericActionHandler.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
/* synthetic */ class GenericActionHandlerKt$GenericActionHandler$1$3$1$2$1$1 extends FunctionReferenceImpl implements Function1<ActionDto, GenericActionDto> {
    public static final GenericActionHandlerKt$GenericActionHandler$1$3$1$2$1$1 INSTANCE = new GenericActionHandlerKt$GenericActionHandler$1$3$1$2$1$1();

    GenericActionHandlerKt$GenericActionHandler$1$3$1$2$1$1() {
        super(1, GenericActionHandlerKt.class, "unpackGenericActionDto", "unpackGenericActionDto(Lrh_server_driven_ui/v1/ActionDto;)Lrh_server_driven_ui/v1/GenericActionDto;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final GenericActionDto invoke(ActionDto actionDto) {
        return GenericActionHandlerKt.unpackGenericActionDto(actionDto);
    }
}
