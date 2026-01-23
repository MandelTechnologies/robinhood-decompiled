package com.robinhood.android.dashboard.lib.footer;

import com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlerKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import rh_server_driven_ui.p531v1.ActionDto;
import rh_server_driven_ui.p531v1.GenericActionDto;

/* compiled from: DashboardFooterContent.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.dashboard.lib.footer.DashboardFooterContentKt$DashboardFooterContent$3$1$1$2$1, reason: use source file name */
/* loaded from: classes2.dex */
/* synthetic */ class DashboardFooterContent3 extends FunctionReferenceImpl implements Function1<ActionDto, GenericActionDto> {
    public static final DashboardFooterContent3 INSTANCE = new DashboardFooterContent3();

    DashboardFooterContent3() {
        super(1, GenericActionHandlerKt.class, "unpackGenericActionDto", "unpackGenericActionDto(Lrh_server_driven_ui/v1/ActionDto;)Lrh_server_driven_ui/v1/GenericActionDto;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final GenericActionDto invoke(ActionDto actionDto) {
        return GenericActionHandlerKt.unpackGenericActionDto(actionDto);
    }
}
