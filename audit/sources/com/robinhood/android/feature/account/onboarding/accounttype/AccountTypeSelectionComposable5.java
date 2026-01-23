package com.robinhood.android.feature.account.onboarding.accounttype;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import bonfire.proto.idl.accounts.p028v1.AccountEligibilityWarningDto;
import com.plaid.internal.EnumC7081g;
import com.robinhood.compose.bento.component.alerts.BentoAlertSheet6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import rh_server_driven_ui.p531v1.ButtonDto;
import rh_server_driven_ui.p531v1.ButtonTypeDto;
import rh_server_driven_ui.p531v1.PictogramDto;
import rh_server_driven_ui.p531v1.PictogramSizeDto;
import rh_server_driven_ui.p531v1.PogWithPictogramDto;

/* compiled from: AccountTypeSelectionComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.feature.account.onboarding.accounttype.ComposableSingletons$AccountTypeSelectionComposableKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class AccountTypeSelectionComposable5 {
    public static final AccountTypeSelectionComposable5 INSTANCE = new AccountTypeSelectionComposable5();
    private static Function2<Composer, Integer, Unit> lambda$1250395542 = ComposableLambda3.composableLambdaInstance(1250395542, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.feature.account.onboarding.accounttype.ComposableSingletons$AccountTypeSelectionComposableKt$lambda$1250395542$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1250395542, i, -1, "com.robinhood.android.feature.account.onboarding.accounttype.ComposableSingletons$AccountTypeSelectionComposableKt.lambda$1250395542.<anonymous> (AccountTypeSelectionComposable.kt:125)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1305642919, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8963lambda$1305642919 = ComposableLambda3.composableLambdaInstance(-1305642919, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.feature.account.onboarding.accounttype.ComposableSingletons$AccountTypeSelectionComposableKt$lambda$-1305642919$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1305642919, i, -1, "com.robinhood.android.feature.account.onboarding.accounttype.ComposableSingletons$AccountTypeSelectionComposableKt.lambda$-1305642919.<anonymous> (AccountTypeSelectionComposable.kt:357)");
            }
            AccountTypeSelectionComposable.AccountEligibilityWarning(new AccountEligibilityWarningDto("Confirm your tax status", "Before you can open another individual account, you'll need to confirm your tax status", CollectionsKt.listOf((Object[]) new ButtonDto[]{new ButtonDto(null, "Confirm tax status", ButtonTypeDto.BUTTON_TYPE_PRIMARY, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, null), new ButtonDto(null, BentoAlertSheet6.button2Title, ButtonTypeDto.BUTTON_TYPE_SECONDARY, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, null)}), new PogWithPictogramDto(PictogramDto.PICTOGRAM_WARNING, PictogramSizeDto.PICTOGRAM_SIZE_LARGE_80, null, null, false, 28, null)), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1966345129 = ComposableLambda3.composableLambdaInstance(1966345129, false, AccountTypeSelectionComposable8.INSTANCE);

    /* renamed from: getLambda$-1305642919$feature_account_onboarding_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m14443getLambda$1305642919$feature_account_onboarding_externalDebug() {
        return f8963lambda$1305642919;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1250395542$feature_account_onboarding_externalDebug() {
        return lambda$1250395542;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1966345129$feature_account_onboarding_externalDebug() {
        return lambda$1966345129;
    }
}
