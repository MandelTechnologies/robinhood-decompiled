package com.robinhood.android.crypto.costbasis.utils;

import android.content.Context;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.CryptoTransferContext;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: CostBasisErrorDialog.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"CostBasisErrorDialog", "", ErrorBundle.DETAIL_ENTRY, "Lcom/robinhood/android/crypto/costbasis/utils/CostBasisErrorDetails;", "dismiss", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/crypto/costbasis/utils/CostBasisErrorDetails;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-crypto-cost-basis_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.crypto.costbasis.utils.CostBasisErrorDialogKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CostBasisErrorDialog {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CostBasisErrorDialog$lambda$5(CostBasisErrorDetails costBasisErrorDetails, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CostBasisErrorDialog(costBasisErrorDetails, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CostBasisErrorDialog(final CostBasisErrorDetails details, final Function0<Unit> dismiss, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        final Context context;
        final Navigator navigator;
        final String primaryCtaDeeplink;
        Object objRememberedValue;
        Composer.Companion companion;
        final CoroutineScope coroutineScope;
        com.robinhood.rosetta.eventlogging.Context context2;
        com.robinhood.rosetta.eventlogging.Context contextCopy$default;
        boolean zChangedInstance;
        Object obj;
        int i5;
        StringResource secondaryCtaText;
        BentoAlertButton bentoAlertButton;
        BentoAlertButton bentoAlertButton2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(dismiss, "dismiss");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1307925519);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(details) : composerStartRestartGroup.changedInstance(details) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(dismiss) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i3;
            if ((i4 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1307925519, i4, -1, "com.robinhood.android.crypto.costbasis.utils.CostBasisErrorDialog (CostBasisErrorDialog.kt:29)");
                }
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                primaryCtaDeeplink = details.getPrimaryCtaDeeplink();
                final String secondaryCtaDeeplink = details.getSecondaryCtaDeeplink();
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                coroutineScope = (CoroutineScope) objRememberedValue;
                EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                context2 = userInteractionEventDescriptor.getContext();
                Component component = new Component(Component.ComponentType.ERROR_ALERT, null, null, 6, null);
                composerStartRestartGroup.startReplaceGroup(1509018758);
                if (context2 != null) {
                    contextCopy$default = null;
                } else {
                    CryptoTransferContext crypto_transfer_context = context2.getCrypto_transfer_context();
                    contextCopy$default = com.robinhood.rosetta.eventlogging.Context.copy$default(context2, 0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, crypto_transfer_context == null ? null : crypto_transfer_context.copy((16367 & 1) != 0 ? crypto_transfer_context.currency_id : null, (16367 & 2) != 0 ? crypto_transfer_context.session_id : null, (16367 & 4) != 0 ? crypto_transfer_context.withdrawal_id : null, (16367 & 8) != 0 ? crypto_transfer_context.amount : 0.0d, (16367 & 16) != 0 ? crypto_transfer_context.error_code : null, (16367 & 32) != 0 ? crypto_transfer_context.title : null, (16367 & 64) != 0 ? crypto_transfer_context.completed_kyc : null, (16367 & 128) != 0 ? crypto_transfer_context.completed_mfa : null, (16367 & 256) != 0 ? crypto_transfer_context.security_context : null, (16367 & 512) != 0 ? crypto_transfer_context.transfer_id : null, (16367 & 1024) != 0 ? crypto_transfer_context.party_selection : null, (16367 & 2048) != 0 ? crypto_transfer_context.wallet_selection : null, (16367 & 4096) != 0 ? crypto_transfer_context.error_message : StringResources6.getTextAsString(details.getMessage(), composerStartRestartGroup, StringResource.$stable), (16367 & 8192) != 0 ? crypto_transfer_context.unknownFields() : null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -257, -1, -1, -1, 16383, null);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1509018459);
                com.robinhood.rosetta.eventlogging.Context context3 = contextCopy$default != null ? new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new CryptoTransferContext(null, null, null, 0.0d, null, null, null, null, null, null, null, null, StringResources6.getTextAsString(details.getMessage(), composerStartRestartGroup, StringResource.$stable), null, 12287, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -257, -1, -1, -1, 16383, null) : contextCopy$default;
                composerStartRestartGroup.endReplaceGroup();
                EventLogger.DefaultImpls.logUserInteractionEvent$default(current, UserInteractionEventDescriptors.toEventData(UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor, new UserInteractionEventDescriptor(null, null, null, context3, component, null, 39, null)), UserInteractionEventData.EventType.APPEAR), false, false, 6, null);
                StringResource title = details.getTitle();
                int i7 = StringResource.$stable;
                String textAsString = StringResources6.getTextAsString(title, composerStartRestartGroup, i7);
                BentoAlertDialog2.Body.Text text = new BentoAlertDialog2.Body.Text(StringResources6.getTextAsString(details.getMessage(), composerStartRestartGroup, i7));
                String textAsString2 = StringResources6.getTextAsString(details.getPrimaryCtaText(), composerStartRestartGroup, i7);
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                int i8 = i4 & 112;
                zChangedInstance = (i8 != 32) | composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changed(primaryCtaDeeplink);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                    i5 = -1224400529;
                    obj = new Function0() { // from class: com.robinhood.android.crypto.costbasis.utils.CostBasisErrorDialogKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CostBasisErrorDialog.CostBasisErrorDialog$lambda$1$lambda$0(primaryCtaDeeplink, dismiss, coroutineScope, navigator, context);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(obj);
                } else {
                    obj = objRememberedValue2;
                    i5 = -1224400529;
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoAlertButton bentoAlertButton3 = new BentoAlertButton(textAsString2, (Function0) obj);
                secondaryCtaText = details.getSecondaryCtaText();
                composerStartRestartGroup.startReplaceGroup(1509059807);
                if (secondaryCtaText != null) {
                    bentoAlertButton = bentoAlertButton3;
                    bentoAlertButton2 = null;
                } else {
                    String textAsString3 = StringResources6.getTextAsString(secondaryCtaText, composerStartRestartGroup, i7);
                    composerStartRestartGroup.startReplaceGroup(i5);
                    boolean zChangedInstance2 = (i8 == 32) | composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changed(secondaryCtaDeeplink);
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue3 == companion.getEmpty()) {
                        bentoAlertButton = bentoAlertButton3;
                        Function0 function0 = new Function0() { // from class: com.robinhood.android.crypto.costbasis.utils.CostBasisErrorDialogKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CostBasisErrorDialog.CostBasisErrorDialog$lambda$4$lambda$3$lambda$2(secondaryCtaDeeplink, dismiss, coroutineScope, navigator, context);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(function0);
                        objRememberedValue3 = function0;
                    } else {
                        bentoAlertButton = bentoAlertButton3;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    bentoAlertButton2 = new BentoAlertButton(textAsString3, (Function0) objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                int i9 = BentoAlertDialog2.Body.Text.$stable << 3;
                int i10 = BentoAlertButton.$stable;
                Modifier modifier5 = modifier4;
                BentoAlertDialog.BentoAlertDialog(textAsString, text, bentoAlertButton, modifier5, bentoAlertButton2, null, false, null, dismiss, composerStartRestartGroup, i9 | (i10 << 6) | ((i4 << 3) & 7168) | (i10 << 12) | ((i4 << 21) & 234881024), 224);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.costbasis.utils.CostBasisErrorDialogKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return CostBasisErrorDialog.CostBasisErrorDialog$lambda$5(details, dismiss, modifier3, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & 147) == 146) {
            if (i6 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            primaryCtaDeeplink = details.getPrimaryCtaDeeplink();
            final String secondaryCtaDeeplink2 = details.getSecondaryCtaDeeplink();
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            coroutineScope = (CoroutineScope) objRememberedValue;
            EventLogger current2 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            context2 = userInteractionEventDescriptor2.getContext();
            Component component2 = new Component(Component.ComponentType.ERROR_ALERT, null, null, 6, null);
            composerStartRestartGroup.startReplaceGroup(1509018758);
            if (context2 != null) {
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1509018459);
            if (contextCopy$default != null) {
            }
            composerStartRestartGroup.endReplaceGroup();
            EventLogger.DefaultImpls.logUserInteractionEvent$default(current2, UserInteractionEventDescriptors.toEventData(UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor2, new UserInteractionEventDescriptor(null, null, null, context3, component2, null, 39, null)), UserInteractionEventData.EventType.APPEAR), false, false, 6, null);
            StringResource title2 = details.getTitle();
            int i72 = StringResource.$stable;
            String textAsString4 = StringResources6.getTextAsString(title2, composerStartRestartGroup, i72);
            BentoAlertDialog2.Body.Text text2 = new BentoAlertDialog2.Body.Text(StringResources6.getTextAsString(details.getMessage(), composerStartRestartGroup, i72));
            String textAsString22 = StringResources6.getTextAsString(details.getPrimaryCtaText(), composerStartRestartGroup, i72);
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            int i82 = i4 & 112;
            zChangedInstance = (i82 != 32) | composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changed(primaryCtaDeeplink);
            Object objRememberedValue22 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance) {
                i5 = -1224400529;
                obj = new Function0() { // from class: com.robinhood.android.crypto.costbasis.utils.CostBasisErrorDialogKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CostBasisErrorDialog.CostBasisErrorDialog$lambda$1$lambda$0(primaryCtaDeeplink, dismiss, coroutineScope, navigator, context);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(obj);
                composerStartRestartGroup.endReplaceGroup();
                BentoAlertButton bentoAlertButton32 = new BentoAlertButton(textAsString22, (Function0) obj);
                secondaryCtaText = details.getSecondaryCtaText();
                composerStartRestartGroup.startReplaceGroup(1509059807);
                if (secondaryCtaText != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                int i92 = BentoAlertDialog2.Body.Text.$stable << 3;
                int i102 = BentoAlertButton.$stable;
                Modifier modifier52 = modifier4;
                BentoAlertDialog.BentoAlertDialog(textAsString4, text2, bentoAlertButton, modifier52, bentoAlertButton2, null, false, null, dismiss, composerStartRestartGroup, i92 | (i102 << 6) | ((i4 << 3) & 7168) | (i102 << 12) | ((i4 << 21) & 234881024), 224);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void CostBasisErrorDialog$handleCtaClick(Function0<Unit> function0, CoroutineScope coroutineScope, Navigator navigator, Context context, String str) {
        if (str != null) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new CostBasisErrorDialog2(navigator, context, str, null), 3, null);
            function0.invoke();
        } else {
            function0.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CostBasisErrorDialog$lambda$1$lambda$0(String str, Function0 function0, CoroutineScope coroutineScope, Navigator navigator, Context context) {
        CostBasisErrorDialog$handleCtaClick(function0, coroutineScope, navigator, context, str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CostBasisErrorDialog$lambda$4$lambda$3$lambda$2(String str, Function0 function0, CoroutineScope coroutineScope, Navigator navigator, Context context) {
        CostBasisErrorDialog$handleCtaClick(function0, coroutineScope, navigator, context, str);
        return Unit.INSTANCE;
    }
}
