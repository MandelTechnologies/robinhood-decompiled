package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocal6;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.dto.DtoActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.dto.DtoActionHandler2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.idl.Dto3;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertMobilePresentationStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import rh_server_driven_ui.p531v1.AlertDto;

/* compiled from: SduiActionHandler.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a3\u0010\b\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\u001aS\u0010\b\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000\"\f\b\u0001\u0010\u000b*\u0006\u0012\u0002\b\u00030\n2\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¢\u0006\u0004\b\b\u0010\u000e\u001a-\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u000f\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a=\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u000f\u001a\u00028\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0004\b\u0010\u0010\u0014\"\u001e\u0010\u0016\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m3636d2 = {"ActionT", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "currentActionHandler", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "actionHandler", "Lkotlin/Function0;", "", "content", "ProvideActionHandler", "(Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Lcom/robinhood/idl/MessageDto;", "DtoT", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/action/dto/DtoActionHandler;", "dtoHandler", "(Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;Lcom/robinhood/android/libdesignsystem/serverui/experimental/action/dto/DtoActionHandler;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "action", "handling", "(Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;Ljava/lang/Object;)Lkotlin/jvm/functions/Function0;", "fallbackHandler", "dtoActionHandler", "(Ljava/lang/Object;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;Lcom/robinhood/android/libdesignsystem/serverui/experimental/action/dto/DtoActionHandler;)Lkotlin/jvm/functions/Function0;", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalActionHandler", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "lib-sdui_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandlerKt, reason: use source file name */
/* loaded from: classes17.dex */
public final class SduiActionHandler3 {
    private static final CompositionLocal6<SduiActionHandler<?>> LocalActionHandler = CompositionLocal3.compositionLocalOf$default(null, new Function0() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandlerKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SduiActionHandler.NotImplemented.INSTANCE;
        }
    }, 1, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProvideActionHandler$lambda$1(SduiActionHandler sduiActionHandler, Function2 function2, int i, Composer composer, int i2) {
        ProvideActionHandler(sduiActionHandler, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProvideActionHandler$lambda$3(SduiActionHandler sduiActionHandler, DtoActionHandler dtoActionHandler, Function2 function2, int i, int i2, Composer composer, int i3) {
        ProvideActionHandler(sduiActionHandler, dtoActionHandler, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final <ActionT> SduiActionHandler<ActionT> currentActionHandler(Composer composer, int i) {
        composer.startReplaceGroup(2114589015);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2114589015, i, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.currentActionHandler (SduiActionHandler.kt:41)");
        }
        Object objConsume = composer.consume(LocalActionHandler);
        Intrinsics.checkNotNull(objConsume, "null cannot be cast to non-null type com.robinhood.android.libdesignsystem.serverui.experimental.compose.ActionHandler<ActionT of com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandlerKt.currentActionHandler>");
        SduiActionHandler<ActionT> sduiActionHandler = (SduiActionHandler) objConsume;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return sduiActionHandler;
    }

    public static final <ActionT> void ProvideActionHandler(SduiActionHandler<? super ActionT> sduiActionHandler, Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i) {
        int i2;
        final SduiActionHandler<? super ActionT> sduiActionHandler2;
        final Function2<? super Composer, ? super Integer, Unit> function2;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2040329426);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(sduiActionHandler) : composerStartRestartGroup.changedInstance(sduiActionHandler) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(content) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            sduiActionHandler2 = sduiActionHandler;
            function2 = content;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2040329426, i2, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.ProvideActionHandler (SduiActionHandler.kt:48)");
            }
            sduiActionHandler2 = sduiActionHandler;
            function2 = content;
            ProvideActionHandler(sduiActionHandler2, null, function2, composerStartRestartGroup, (i2 & 14) | 48 | ((i2 << 3) & 896), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandlerKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiActionHandler3.ProvideActionHandler$lambda$1(sduiActionHandler2, function2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <ActionT, DtoT extends Dto3<?>> void ProvideActionHandler(final SduiActionHandler<? super ActionT> sduiActionHandler, final DtoActionHandler<DtoT> dtoActionHandler, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(353243687);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(sduiActionHandler) : composerStartRestartGroup.changedInstance(sduiActionHandler) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(dtoActionHandler) : composerStartRestartGroup.changedInstance(dtoActionHandler) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(content) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                dtoActionHandler = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(353243687, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.ProvideActionHandler (SduiActionHandler.kt:62)");
            }
            final SduiActionHandler<?> sduiActionHandlerCurrentActionHandler = currentActionHandler(composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(164776399);
            if (sduiActionHandler != null) {
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean zChangedInstance = ((i3 & 14) == 4 || ((i3 & 8) != 0 && composerStartRestartGroup.changedInstance(sduiActionHandler))) | composerStartRestartGroup.changedInstance(sduiActionHandlerCurrentActionHandler);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new SduiActionHandler() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandlerKt$ProvideActionHandler$newActionHandler$1$1
                        @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
                        /* renamed from: handle */
                        public final boolean mo15941handle(ActionT actiont) {
                            return sduiActionHandler.mo15941handle(actiont) || sduiActionHandlerCurrentActionHandler.mo15941handle(actiont);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                sduiActionHandlerCurrentActionHandler = (SduiActionHandler) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endReplaceGroup();
            final DtoActionHandler dtoActionHandlerCurrentDtoActionHandler = DtoActionHandler2.currentDtoActionHandler(composerStartRestartGroup, 0);
            if (dtoActionHandler != null) {
                dtoActionHandlerCurrentDtoActionHandler = new DtoActionHandler<DtoT>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandlerKt$ProvideActionHandler$newDtoHandler$1
                    /* JADX WARN: Incorrect return type in method signature: (Lrh_server_driven_ui/v1/AlertDto;)TDtoT; */
                    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.action.dto.DtoActionHandler
                    public Dto3 convertAlertToAction(AlertDto alert) {
                        Intrinsics.checkNotNullParameter(alert, "alert");
                        return (Dto3) dtoActionHandler.convertAlertToAction(alert);
                    }

                    /* JADX WARN: Incorrect types in method signature: (TDtoT;Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertMobilePresentationStyle;I)Z */
                    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.action.dto.DtoActionHandler
                    /* renamed from: handle-RsTtcXE, reason: not valid java name and merged with bridge method [inline-methods] */
                    public boolean mo10782handleRsTtcXE(Dto3 action, GenericAlertMobilePresentationStyle alertType, int textAlign) {
                        Intrinsics.checkNotNullParameter(action, "action");
                        Intrinsics.checkNotNullParameter(alertType, "alertType");
                        return dtoActionHandler.mo10782handleRsTtcXE(action, alertType, textAlign) || dtoActionHandlerCurrentDtoActionHandler.mo10782handleRsTtcXE(action, alertType, textAlign);
                    }
                };
            }
            CompositionLocal3.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{LocalActionHandler.provides(sduiActionHandlerCurrentActionHandler), DtoActionHandler2.getLocalDtoActionHandler().provides(dtoActionHandlerCurrentDtoActionHandler)}, ComposableLambda3.rememberComposableLambda(-1715931801, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandlerKt.ProvideActionHandler.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    if ((i5 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1715931801, i5, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.ProvideActionHandler.<anonymous> (SduiActionHandler.kt:96)");
                    }
                    content.invoke(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final DtoActionHandler<DtoT> dtoActionHandler2 = dtoActionHandler;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandlerKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiActionHandler3.ProvideActionHandler$lambda$3(sduiActionHandler, dtoActionHandler2, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final <ActionT> Function0<Unit> handling(final SduiActionHandler<? super ActionT> sduiActionHandler, final ActionT actiont) {
        Intrinsics.checkNotNullParameter(sduiActionHandler, "<this>");
        return new Function0() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandlerKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SduiActionHandler3.handling$lambda$4(actiont, sduiActionHandler);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handling$lambda$4(Object obj, SduiActionHandler sduiActionHandler) {
        if (obj != null) {
            sduiActionHandler.mo15941handle(obj);
        }
        return Unit.INSTANCE;
    }

    public static final <ActionT> Function0<Unit> handling(ActionT actiont, SduiActionHandler<? super ActionT> fallbackHandler, DtoActionHandler<ActionT> dtoActionHandler) {
        Intrinsics.checkNotNullParameter(fallbackHandler, "fallbackHandler");
        Intrinsics.checkNotNullParameter(dtoActionHandler, "dtoActionHandler");
        if (actiont instanceof Dto3) {
            return DtoActionHandler2.m15938handling1Vfn_Dk$default(dtoActionHandler, actiont, null, 0, 6, null);
        }
        return handling(fallbackHandler, actiont);
    }
}
