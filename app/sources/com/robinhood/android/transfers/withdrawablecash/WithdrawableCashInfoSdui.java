package com.robinhood.android.transfers.withdrawablecash;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlerKt;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: WithdrawableCashInfoSdui.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a1\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m3636d2 = {"WithdrawableCashInfoSdui", "", "content", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "screenData", "Lcom/robinhood/rosetta/eventlogging/Screen;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "(Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/android/navigation/Navigator;Landroidx/compose/runtime/Composer;I)V", "feature-transfer-hub_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.withdrawablecash.WithdrawableCashInfoSduiKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class WithdrawableCashInfoSdui {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WithdrawableCashInfoSdui$lambda$0(ImmutableList immutableList, Screen screen, Navigator navigator, int i, Composer composer, int i2) {
        WithdrawableCashInfoSdui(immutableList, screen, navigator, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void WithdrawableCashInfoSdui(final ImmutableList<? extends UIComponent<? extends GenericAction>> content, final Screen screenData, final Navigator navigator, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(screenData, "screenData");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Composer composerStartRestartGroup = composer.startRestartGroup(1236119684);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(content) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(screenData) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(navigator) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1236119684, i2, -1, "com.robinhood.android.transfers.withdrawablecash.WithdrawableCashInfoSdui (WithdrawableCashInfoSdui.kt:20)");
            }
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, screenData, null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(-1862307399, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.withdrawablecash.WithdrawableCashInfoSduiKt.WithdrawableCashInfoSdui.1
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
                        ComposerKt.traceEventStart(-1862307399, i3, -1, "com.robinhood.android.transfers.withdrawablecash.WithdrawableCashInfoSdui.<anonymous> (WithdrawableCashInfoSdui.kt:28)");
                    }
                    ProvidedValue<Navigator> providedValueProvides = LocalNavigator.getLocalNavigator().provides(navigator);
                    final ImmutableList<UIComponent<GenericAction>> immutableList = content;
                    CompositionLocal3.CompositionLocalProvider(providedValueProvides, ComposableLambda3.rememberComposableLambda(1369523833, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.withdrawablecash.WithdrawableCashInfoSduiKt.WithdrawableCashInfoSdui.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i4) {
                            if ((i4 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1369523833, i4, -1, "com.robinhood.android.transfers.withdrawablecash.WithdrawableCashInfoSdui.<anonymous>.<anonymous> (WithdrawableCashInfoSdui.kt:31)");
                            }
                            final ImmutableList<UIComponent<GenericAction>> immutableList2 = immutableList;
                            GenericActionHandlerKt.GenericActionHandler(null, false, null, null, ComposableLambda3.rememberComposableLambda(278232743, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.withdrawablecash.WithdrawableCashInfoSduiKt.WithdrawableCashInfoSdui.1.1.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i5) {
                                    if ((i5 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(278232743, i5, -1, "com.robinhood.android.transfers.withdrawablecash.WithdrawableCashInfoSdui.<anonymous>.<anonymous>.<anonymous> (WithdrawableCashInfoSdui.kt:32)");
                                    }
                                    ImmutableList<UIComponent<GenericAction>> immutableList3 = immutableList2;
                                    composer4.startReplaceGroup(-1772220517);
                                    SduiColumns.SduiColumn(immutableList3, GenericAction.class, Modifier.INSTANCE, null, null, HorizontalPadding.Default, Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), false, composer4, 0, 0);
                                    composer4.endReplaceGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), composer3, 24576, 15);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, ProvidedValue.$stable | 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.withdrawablecash.WithdrawableCashInfoSduiKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return WithdrawableCashInfoSdui.WithdrawableCashInfoSdui$lambda$0(content, screenData, navigator, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
