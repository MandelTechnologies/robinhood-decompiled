package com.robinhood.android.crypto.p094ui.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlerKt;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.rosetta.eventlogging.Asset;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;

/* compiled from: CryptoTransfersActionsView.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\u0017\u001a\u00020\u0018H\u0017¢\u0006\u0002\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u000fH\u0000¢\u0006\u0002\b\u001cJ\u0012\u0010\u001d\u001a\u00020\u00182\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0002R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR/\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/view/CryptoTransfersActionsView;", "Lcom/robinhood/compose/app/GenericComposeView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "getNavigator", "()Lcom/robinhood/android/navigation/Navigator;", "setNavigator", "(Lcom/robinhood/android/navigation/Navigator;)V", "<set-?>", "Lcom/robinhood/android/crypto/ui/view/CryptoDetailTransferActionState;", "actionState", "getActionState", "()Lcom/robinhood/android/crypto/ui/view/CryptoDetailTransferActionState;", "setActionState", "(Lcom/robinhood/android/crypto/ui/view/CryptoDetailTransferActionState;)V", "actionState$delegate", "Landroidx/compose/runtime/MutableState;", "Content", "", "(Landroidx/compose/runtime/Composer;I)V", "bind", "actions", "bind$feature_crypto_externalDebug", "handleAction", "action", "Lcom/robinhood/models/serverdriven/db/GenericAction;", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class CryptoTransfersActionsView extends Hammer_CryptoTransfersActionsView {
    public static final int $stable = 8;

    /* renamed from: actionState$delegate, reason: from kotlin metadata */
    private final SnapshotState actionState;
    public Navigator navigator;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$0(CryptoTransfersActionsView cryptoTransfersActionsView, int i, Composer composer, int i2) {
        cryptoTransfersActionsView.Content(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$1(CryptoTransfersActionsView cryptoTransfersActionsView, int i, Composer composer, int i2) {
        cryptoTransfersActionsView.Content(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoTransfersActionsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.actionState = SnapshotState3.mutableStateOf$default(null, null, 2, null);
    }

    public final Navigator getNavigator() {
        Navigator navigator = this.navigator;
        if (navigator != null) {
            return navigator;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    public final void setNavigator(Navigator navigator) {
        Intrinsics.checkNotNullParameter(navigator, "<set-?>");
        this.navigator = navigator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final CryptoDetailTransferActionState getActionState() {
        return (CryptoDetailTransferActionState) this.actionState.getValue();
    }

    private final void setActionState(CryptoDetailTransferActionState cryptoDetailTransferActionState) {
        this.actionState.setValue(cryptoDetailTransferActionState);
    }

    @Override // com.robinhood.compose.app.GenericComposeView
    public void Content(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-220660205);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-220660205, i2, -1, "com.robinhood.android.crypto.ui.view.CryptoTransfersActionsView.Content (CryptoTransfersActionsView.kt:34)");
            }
            final CryptoDetailTransferActionState actionState = getActionState();
            if (actionState == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.ui.view.CryptoTransfersActionsView$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return CryptoTransfersActionsView.Content$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, Boolean.TRUE, null, null, ComposableLambda3.rememberComposableLambda(1398916443, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.view.CryptoTransfersActionsView.Content.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1398916443, i3, -1, "com.robinhood.android.crypto.ui.view.CryptoTransfersActionsView.Content.<anonymous> (CryptoTransfersActionsView.kt:39)");
                    }
                    Screen.Name name = Screen.Name.CRYPTO_DETAIL_PAGE;
                    String string2 = actionState.getCurrencyPairId().toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                    Screen screen = new Screen(name, null, string2, null, 10, null);
                    Asset.AssetType assetType = Asset.AssetType.CURRENCY_PAIR;
                    String string3 = actionState.getCurrencyPairId().toString();
                    Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                    int i4 = 0;
                    int i5 = 0;
                    int i6 = 0;
                    UserInteractionEventDescriptor userInteractionEventDescriptor = new UserInteractionEventDescriptor(null, screen, null, new com.robinhood.rosetta.eventlogging.Context(i4, i5, i6, null, null, null, null, null, 0, null, null, null, null, null, new Asset(string3, assetType, null, null, 12, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16385, -1, -1, -1, -1, -1, 16383, null), null, null, 53, null);
                    final CryptoTransfersActionsView cryptoTransfersActionsView = this;
                    final CryptoDetailTransferActionState cryptoDetailTransferActionState = actionState;
                    AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptor, ComposableLambda3.rememberComposableLambda(-1259087344, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.view.CryptoTransfersActionsView.Content.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i7) {
                            if ((i7 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1259087344, i7, -1, "com.robinhood.android.crypto.ui.view.CryptoTransfersActionsView.Content.<anonymous>.<anonymous> (CryptoTransfersActionsView.kt:53)");
                            }
                            Navigator navigator = cryptoTransfersActionsView.getNavigator();
                            final CryptoDetailTransferActionState cryptoDetailTransferActionState2 = cryptoDetailTransferActionState;
                            final CryptoTransfersActionsView cryptoTransfersActionsView2 = cryptoTransfersActionsView;
                            GenericActionHandlerKt.GenericActionHandler(null, false, null, navigator, ComposableLambda3.rememberComposableLambda(1297056958, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.view.CryptoTransfersActionsView.Content.1.1.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i8) {
                                    if ((i8 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1297056958, i8, -1, "com.robinhood.android.crypto.ui.view.CryptoTransfersActionsView.Content.<anonymous>.<anonymous>.<anonymous> (CryptoTransfersActionsView.kt:56)");
                                    }
                                    if (cryptoDetailTransferActionState2.getIsVisible()) {
                                        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composer4, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
                                        CryptoTransfersActionsView cryptoTransfersActionsView3 = cryptoTransfersActionsView2;
                                        composer4.startReplaceGroup(5004770);
                                        boolean zChangedInstance = composer4.changedInstance(cryptoTransfersActionsView3);
                                        Object objRememberedValue = composer4.rememberedValue();
                                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = new CryptoTransfersActionsView2(cryptoTransfersActionsView3);
                                            composer4.updateRememberedValue(objRememberedValue);
                                        }
                                        KFunction kFunction = (KFunction) objRememberedValue;
                                        composer4.endReplaceGroup();
                                        CryptoTransfersActionsView cryptoTransfersActionsView4 = cryptoTransfersActionsView2;
                                        composer4.startReplaceGroup(5004770);
                                        boolean zChangedInstance2 = composer4.changedInstance(cryptoTransfersActionsView4);
                                        Object objRememberedValue2 = composer4.rememberedValue();
                                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue2 = new CryptoTransfersActionsView3(cryptoTransfersActionsView4);
                                            composer4.updateRememberedValue(objRememberedValue2);
                                        }
                                        composer4.endReplaceGroup();
                                        CryptoDetailTransferActionsComposable2.CryptoDetailTransferActionsComposable(cryptoDetailTransferActionState2, (Function1) kFunction, (Function1) ((KFunction) objRememberedValue2), modifierM5146paddingqDBjuR0$default, composer4, 0, 0);
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), composer3, 24576, 7);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 100859904, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.crypto.ui.view.CryptoTransfersActionsView$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoTransfersActionsView.Content$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public final void bind$feature_crypto_externalDebug(CryptoDetailTransferActionState actions) {
        setActionState(actions);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleAction(GenericAction action) {
        if (action instanceof GenericAction.DeeplinkAction) {
            Navigator navigator = getNavigator();
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Navigator.DefaultImpls.handleDeepLink$default(navigator, context, ((GenericAction.DeeplinkAction) action).getUri(), null, null, false, null, 60, null);
        }
    }
}
