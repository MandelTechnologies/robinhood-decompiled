package com.robinhood.android.cortex.digest.portfolio.detail;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import rh_server_driven_ui.p531v1.ActionDto;
import rh_server_driven_ui.p531v1.GenericActionDto;

/* compiled from: PortfolioDigestDetailComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cortex.digest.portfolio.detail.PortfolioDigestDetailComposableKt$PortfolioDigestDetailComposable$1$1$1$2$1$1$1$1 */
/* loaded from: classes2.dex */
/* synthetic */ class C12127xa236cfa2 extends FunctionReferenceImpl implements Function1<ActionDto, GenericActionDto> {
    public static final C12127xa236cfa2 INSTANCE = new C12127xa236cfa2();

    C12127xa236cfa2() {
        super(1, PortfolioDigestDetailComposableKt.class, "parseAction", "parseAction(Lrh_server_driven_ui/v1/ActionDto;)Lrh_server_driven_ui/v1/GenericActionDto;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final GenericActionDto invoke(ActionDto actionDto) {
        return PortfolioDigestDetailComposableKt.parseAction(actionDto);
    }
}
