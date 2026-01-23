package com.robinhood.android.account.accountfunding;

import com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlerKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import rh_server_driven_ui.p531v1.ActionDto;
import rh_server_driven_ui.p531v1.GenericActionDto;

/* compiled from: AccountFundingOptionsComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.account.accountfunding.AccountFundingOptionsComposableKt$AccountFundingOptionsContent$1$1$1$2$1, reason: use source file name */
/* loaded from: classes24.dex */
/* synthetic */ class AccountFundingOptionsComposable3 extends FunctionReferenceImpl implements Function1<ActionDto, GenericActionDto> {
    public static final AccountFundingOptionsComposable3 INSTANCE = new AccountFundingOptionsComposable3();

    AccountFundingOptionsComposable3() {
        super(1, GenericActionHandlerKt.class, "unpackGenericActionDto", "unpackGenericActionDto(Lrh_server_driven_ui/v1/ActionDto;)Lrh_server_driven_ui/v1/GenericActionDto;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final GenericActionDto invoke(ActionDto actionDto) {
        return GenericActionHandlerKt.unpackGenericActionDto(actionDto);
    }
}
