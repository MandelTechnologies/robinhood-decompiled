package com.robinhood.shared.trade.crypto.p397ui.price.orderPriceDialog;

import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoOrderPriceDialogComposable.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a[\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"CryptoOrderPriceDialogComposable", "", "title", "", CarResultComposable2.BODY, "primaryButtonText", "secondaryButtonText", "onPositiveRequest", "Lkotlin/Function0;", "onNegativeRequest", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/robinhood/rosetta/eventlogging/Screen;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-trade-crypto_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.trade.crypto.ui.price.orderPriceDialog.CryptoOrderPriceDialogComposableKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class CryptoOrderPriceDialogComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoOrderPriceDialogComposable$lambda$0(String str, String str2, String str3, String str4, Function0 function0, Function0 function02, Screen screen, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CryptoOrderPriceDialogComposable(str, str2, str3, str4, function0, function02, screen, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoOrderPriceDialogComposable(final String title, final String body, final String primaryButtonText, final String secondaryButtonText, final Function0<Unit> onPositiveRequest, final Function0<Unit> onNegativeRequest, final Screen screen, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
        Intrinsics.checkNotNullParameter(secondaryButtonText, "secondaryButtonText");
        Intrinsics.checkNotNullParameter(onPositiveRequest, "onPositiveRequest");
        Intrinsics.checkNotNullParameter(onNegativeRequest, "onNegativeRequest");
        Intrinsics.checkNotNullParameter(screen, "screen");
        Composer composerStartRestartGroup = composer.startRestartGroup(-805683174);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(title) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(body) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(primaryButtonText) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(secondaryButtonText) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onPositiveRequest) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onNegativeRequest) ? 131072 : 65536;
        }
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(screen) ? 1048576 : 524288;
        }
        int i4 = i2 & 128;
        if (i4 == 0) {
            if ((12582912 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 8388608 : 4194304;
            }
            if ((4793491 & i3) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-805683174, i3, -1, "com.robinhood.shared.trade.crypto.ui.price.orderPriceDialog.CryptoOrderPriceDialogComposable (CryptoOrderPriceDialogComposable.kt:22)");
                }
                BentoAlertDialog2.Body.MarkdownText markdownText = new BentoAlertDialog2.Body.MarkdownText(body);
                Component.ComponentType componentType = Component.ComponentType.BUTTON;
                modifier2 = modifier3;
                int i5 = i3;
                composer2 = composerStartRestartGroup;
                BentoAlertButton bentoAlertButton = new BentoAlertButton(primaryButtonText, onPositiveRequest, ModifiersKt.autoLogEvents$default(modifier2, new UserInteractionEventDescriptor(null, screen, null, null, new Component(componentType, "update order", null, 4, null), null, 45, null), true, false, false, true, false, null, 108, null), null, null, false, 56, null);
                BentoAlertButton bentoAlertButton2 = new BentoAlertButton(secondaryButtonText, onNegativeRequest, ModifiersKt.autoLogEvents$default(modifier2, new UserInteractionEventDescriptor(null, screen, null, null, new Component(componentType, "continue", null, 4, null), null, 45, null), true, false, false, true, false, null, 108, null), null, null, false, 56, null);
                int i6 = (i5 & 14) | (BentoAlertDialog2.Body.MarkdownText.$stable << 3);
                int i7 = BentoAlertButton.$stable;
                BentoAlertDialog.BentoAlertDialog(title, markdownText, bentoAlertButton, null, bentoAlertButton2, null, false, null, onPositiveRequest, composer2, i6 | (i7 << 6) | (i7 << 12) | (234881024 & (i5 << 12)), EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
            }
            final Modifier modifier4 = modifier2;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.price.orderPriceDialog.CryptoOrderPriceDialogComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoOrderPriceDialogComposable.CryptoOrderPriceDialogComposable$lambda$0(title, body, primaryButtonText, secondaryButtonText, onPositiveRequest, onNegativeRequest, screen, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 12582912;
        modifier2 = modifier;
        if ((4793491 & i3) == 4793490) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            BentoAlertDialog2.Body.MarkdownText markdownText2 = new BentoAlertDialog2.Body.MarkdownText(body);
            Component.ComponentType componentType2 = Component.ComponentType.BUTTON;
            modifier2 = modifier3;
            int i52 = i3;
            composer2 = composerStartRestartGroup;
            BentoAlertButton bentoAlertButton3 = new BentoAlertButton(primaryButtonText, onPositiveRequest, ModifiersKt.autoLogEvents$default(modifier2, new UserInteractionEventDescriptor(null, screen, null, null, new Component(componentType2, "update order", null, 4, null), null, 45, null), true, false, false, true, false, null, 108, null), null, null, false, 56, null);
            BentoAlertButton bentoAlertButton22 = new BentoAlertButton(secondaryButtonText, onNegativeRequest, ModifiersKt.autoLogEvents$default(modifier2, new UserInteractionEventDescriptor(null, screen, null, null, new Component(componentType2, "continue", null, 4, null), null, 45, null), true, false, false, true, false, null, 108, null), null, null, false, 56, null);
            int i62 = (i52 & 14) | (BentoAlertDialog2.Body.MarkdownText.$stable << 3);
            int i72 = BentoAlertButton.$stable;
            BentoAlertDialog.BentoAlertDialog(title, markdownText2, bentoAlertButton3, null, bentoAlertButton22, null, false, null, onPositiveRequest, composer2, i62 | (i72 << 6) | (i72 << 12) | (234881024 & (i52 << 12)), EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        final Modifier modifier42 = modifier2;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
