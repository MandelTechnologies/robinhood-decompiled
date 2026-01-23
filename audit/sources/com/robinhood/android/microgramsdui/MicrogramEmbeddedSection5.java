package com.robinhood.android.microgramsdui;

import com.robinhood.microgram.sdui.MicrogramAction;
import com.robinhood.microgram.sdui.MicrogramAction2;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import rh_server_driven_ui.p531v1.ActionDto;

/* compiled from: MicrogramEmbeddedSection.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.microgramsdui.MicrogramEmbeddedSectionKt$MicrogramEmbeddedSection$2$2$3$1, reason: use source file name */
/* loaded from: classes8.dex */
/* synthetic */ class MicrogramEmbeddedSection5 extends FunctionReferenceImpl implements Function1<ActionDto, MicrogramAction> {
    public static final MicrogramEmbeddedSection5 INSTANCE = new MicrogramEmbeddedSection5();

    MicrogramEmbeddedSection5() {
        super(1, MicrogramAction2.class, "toMicrogramAction", "toMicrogramAction(Lrh_server_driven_ui/v1/ActionDto;)Lcom/robinhood/microgram/sdui/MicrogramAction;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MicrogramAction invoke(ActionDto actionDto) {
        return MicrogramAction2.toMicrogramAction(actionDto);
    }
}
