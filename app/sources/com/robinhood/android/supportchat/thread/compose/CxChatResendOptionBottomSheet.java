package com.robinhood.android.supportchat.thread.compose;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.supportchat.C29104R;
import com.robinhood.android.supportchat.thread.compose.CxChatBottomSheetData;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.support.supportchat.p396ui.models.UiChatMessage;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CxChatResendOptionBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a=\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0001¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m3636d2 = {"CxChatResendOptionBottomSheet", "", "resendOptions", "Lcom/robinhood/android/supportchat/thread/compose/CxChatBottomSheetData$ResendOptions;", "onClickResend", "Lkotlin/Function2;", "", "Lcom/robinhood/shared/support/supportchat/ui/models/UiChatMessage$Regular;", "onDismiss", "Lkotlin/Function0;", "(Lcom/robinhood/android/supportchat/thread/compose/CxChatBottomSheetData$ResendOptions;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "feature-support-chat_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.supportchat.thread.compose.CxChatResendOptionBottomSheetKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class CxChatResendOptionBottomSheet {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CxChatResendOptionBottomSheet$lambda$3(CxChatBottomSheetData.ResendOptions resendOptions, Function2 function2, Function0 function0, int i, Composer composer, int i2) {
        CxChatResendOptionBottomSheet(resendOptions, function2, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void CxChatResendOptionBottomSheet(final CxChatBottomSheetData.ResendOptions resendOptions, final Function2<? super String, ? super UiChatMessage.Regular, Unit> onClickResend, final Function0<Unit> onDismiss, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(resendOptions, "resendOptions");
        Intrinsics.checkNotNullParameter(onClickResend, "onClickResend");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1211978420);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(resendOptions) : composerStartRestartGroup.changedInstance(resendOptions) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onClickResend) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onDismiss) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1211978420, i2, -1, "com.robinhood.android.supportchat.thread.compose.CxChatResendOptionBottomSheet (CxChatResendOptionBottomSheet.kt:25)");
            }
            final EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            final UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            BentoBaseRowState bentoBaseRowState = new BentoBaseRowState((BentoBaseRowState.Start) null, StringResources_androidKt.stringResource(C29104R.string.support_chat_resend_message, composerStartRestartGroup, 0), (String) null, (String) null, (BentoBaseRowState.Meta) null, (BentoBaseRowState.End) null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, (DefaultConstructorMarker) null);
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(userInteractionEventDescriptor) | composerStartRestartGroup.changedInstance(current) | ((i2 & 112) == 32) | ((i2 & 14) == 4 || ((i2 & 8) != 0 && composerStartRestartGroup.changedInstance(resendOptions)));
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatResendOptionBottomSheetKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CxChatResendOptionBottomSheet.CxChatResendOptionBottomSheet$lambda$2$lambda$1$lambda$0(userInteractionEventDescriptor, current, onClickResend, resendOptions);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            int i3 = BentoBaseRowState.$stable;
            BentoBaseRowKt.m20915BentoBaseRowcd68TDI(null, bentoBaseRowState, true, false, false, 0L, (Function0) objRememberedValue, composerStartRestartGroup, (i3 << 3) | 384, 57);
            BentoBaseRowKt.m20915BentoBaseRowcd68TDI(null, new BentoBaseRowState((BentoBaseRowState.Start) null, StringResources_androidKt.stringResource(C29104R.string.support_chat_cancel, composerStartRestartGroup, 0), (String) null, (String) null, (BentoBaseRowState.Meta) null, (BentoBaseRowState.End) null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, (DefaultConstructorMarker) null), true, false, false, 0L, onDismiss, composerStartRestartGroup, (i3 << 3) | 384 | ((i2 << 12) & 3670016), 57);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatResendOptionBottomSheetKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CxChatResendOptionBottomSheet.CxChatResendOptionBottomSheet$lambda$3(resendOptions, onClickResend, onDismiss, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CxChatResendOptionBottomSheet$lambda$2$lambda$1$lambda$0(UserInteractionEventDescriptor userInteractionEventDescriptor, EventLogger eventLogger, Function2 function2, CxChatBottomSheetData.ResendOptions resendOptions) {
        EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, UserInteractionEventDescriptors.toEventData(UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor, new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.CX_CHAT_MESSAGE_FAILURE_BOTTOM_SHEET, null, null, 6, null), null, 47, null)), UserInteractionEventData.EventType.TAP), false, false, 6, null);
        function2.invoke(resendOptions.getConversationSid(), resendOptions.getMessage());
        return Unit.INSTANCE;
    }
}
