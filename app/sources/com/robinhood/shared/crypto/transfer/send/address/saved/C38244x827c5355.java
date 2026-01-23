package com.robinhood.shared.crypto.transfer.send.address.saved;

import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.component.BentoTextButton3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.shared.crypto.transfer.C37934R;
import com.robinhood.tooltips.popup.PopupPositioning;
import com.robinhood.tooltips.popup.PopupTooltipKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoTransferSendSavedAddressComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressComposableKt$SendSavedAddressToolbar$1$3 */
/* loaded from: classes6.dex */
final class C38244x827c5355 implements Function3<Row5, Composer, Integer, Unit> {
    final /* synthetic */ Function0<Unit> $makeScanTooltipSavedAddressesDisappear;
    final /* synthetic */ Function0<Unit> $markScanTooltipSavedAddressesAsSeen;
    final /* synthetic */ Function0<Unit> $onScanClick;
    final /* synthetic */ boolean $shouldShowScanTooltipSavedAddresses;
    final /* synthetic */ UserInteractionEventDescriptor $userInteractionEventData;

    C38244x827c5355(boolean z, Function0<Unit> function0, Function0<Unit> function02, UserInteractionEventDescriptor userInteractionEventDescriptor, Function0<Unit> function03) {
        this.$shouldShowScanTooltipSavedAddresses = z;
        this.$markScanTooltipSavedAddressesAsSeen = function0;
        this.$makeScanTooltipSavedAddressesDisappear = function02;
        this.$userInteractionEventData = userInteractionEventDescriptor;
        this.$onScanClick = function03;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) {
        invoke(row5, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Row5 BentoAppBar, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1180681191, i, -1, "com.robinhood.shared.crypto.transfer.send.address.saved.SendSavedAddressToolbar.<anonymous>.<anonymous> (CryptoTransferSendSavedAddressComposable.kt:418)");
        }
        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 11, null);
        Boolean boolValueOf = Boolean.valueOf(this.$shouldShowScanTooltipSavedAddresses);
        composer.startReplaceGroup(-1633490746);
        boolean zChanged = composer.changed(this.$markScanTooltipSavedAddressesAsSeen) | composer.changed(this.$makeScanTooltipSavedAddressesDisappear);
        final Function0<Unit> function0 = this.$markScanTooltipSavedAddressesAsSeen;
        final Function0<Unit> function02 = this.$makeScanTooltipSavedAddressesDisappear;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressComposableKt$SendSavedAddressToolbar$1$3$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C38244x827c5355.invoke$lambda$1$lambda$0(function0, function02);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        Function0<Unit> function03 = this.$markScanTooltipSavedAddressesAsSeen;
        PopupPositioning popupPositioning = PopupPositioning.BELOW;
        Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(PopupTooltipKt.m26519popupTooltipBgaGok8(modifierM5146paddingqDBjuR0$default, (16232 & 1) != 0 ? Boolean.TRUE : boolValueOf, (16232 & 2) != 0 ? new Function0() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        } : (Function0) objRememberedValue, (16232 & 4) != 0 ? new Function0() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        } : function03, (16232 & 8) != 0 ? new Function0() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        } : null, (16232 & 16) != 0 ? PopupPositioning.FREE : popupPositioning, (16232 & 32) != 0 ? null : null, (16232 & 64) != 0 ? null : null, (16232 & 128) != 0 ? C2002Dp.m7995constructorimpl(0) : 0.0f, (16232 & 256) != 0, (16232 & 512) != 0 ? C2002Dp.m7995constructorimpl(0) : 0.0f, (16232 & 1024) != 0 ? C2002Dp.m7995constructorimpl(0) : 0.0f, (16232 & 2048) != 0 ? null : null, (16232 & 4096) != 0 ? EnterTransition.INSTANCE.getNone() : null, (16232 & 8192) != 0 ? ExitTransition.INSTANCE.getNone() : null, ComposableSingletons$CryptoTransferSendSavedAddressComposableKt.INSTANCE.getLambda$1599440489$feature_crypto_transfer_externalDebug()), UserInteractionEventDescriptors.updateWith(this.$userInteractionEventData, new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.BUTTON, "scan_address", null, 4, null), null, 47, null)), true, false, false, true, false, null, 108, null);
        BentoTextButton2.m20715BentoTextButtonPIknLig(this.$onScanClick, StringResources_androidKt.stringResource(C37934R.string.crypto_send_address_v2_menu_item, composer, 0), modifierAutoLogEvents$default, null, BentoTextButton3.Size.f5147M, false, null, composer, 24576, 104);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Function0 function0, Function0 function02) {
        function0.invoke();
        function02.invoke();
        return Unit.INSTANCE;
    }
}
