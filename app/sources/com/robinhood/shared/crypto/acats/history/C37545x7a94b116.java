package com.robinhood.shared.crypto.acats.history;

import com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlerKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import rh_server_driven_ui.p531v1.ActionDto;
import rh_server_driven_ui.p531v1.GenericActionDto;

/* compiled from: CryptoAcatsHistoryComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.acats.history.CryptoAcatsHistoryComposableKt$CryptoAcatsHistoryComposable$1$1$1$1$1$1$1 */
/* loaded from: classes6.dex */
/* synthetic */ class C37545x7a94b116 extends FunctionReferenceImpl implements Function1<ActionDto, GenericActionDto> {
    public static final C37545x7a94b116 INSTANCE = new C37545x7a94b116();

    C37545x7a94b116() {
        super(1, GenericActionHandlerKt.class, "unpackGenericActionDto", "unpackGenericActionDto(Lrh_server_driven_ui/v1/ActionDto;)Lrh_server_driven_ui/v1/GenericActionDto;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final GenericActionDto invoke(ActionDto actionDto) {
        return GenericActionHandlerKt.unpackGenericActionDto(actionDto);
    }
}
