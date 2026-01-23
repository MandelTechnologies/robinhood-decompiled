package com.robinhood.microgram.sdui;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import rh_server_driven_ui.p531v1.ActionDto;

/* compiled from: ListScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.microgram.sdui.ListScreenKt$Content$1$4$1, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class ListScreen7 extends FunctionReferenceImpl implements Function1<ActionDto, MicrogramAction> {
    public static final ListScreen7 INSTANCE = new ListScreen7();

    ListScreen7() {
        super(1, MicrogramAction2.class, "toMicrogramAction", "toMicrogramAction(Lrh_server_driven_ui/v1/ActionDto;)Lcom/robinhood/microgram/sdui/MicrogramAction;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MicrogramAction invoke(ActionDto actionDto) {
        return MicrogramAction2.toMicrogramAction(actionDto);
    }
}
