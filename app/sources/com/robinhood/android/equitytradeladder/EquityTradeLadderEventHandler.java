package com.robinhood.android.equitytradeladder;

import android.content.Context;
import android.view.View;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.SnackbarHostState;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.core.view.ViewCompat;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.equitytradeladder.EquityTradeLadderEvent;
import com.robinhood.android.equitytradeladder.popup.EquityOrderCheckPopup3;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.models.serverdriven.p347db.ServerDrivenButton;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: EquityTradeLadderEventHandler.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u001a[\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\f2\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u000fH\u0007¢\u0006\u0002\u0010\u0012\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013²\u0006\f\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u008a\u008e\u0002²\u0006\f\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u008a\u008e\u0002²\u0006\f\u0010\u0018\u001a\u0004\u0018\u00010\u0010X\u008a\u008e\u0002²\u0006\f\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u008a\u008e\u0002²\u0006\f\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u008a\u008e\u0002"}, m3636d2 = {"SNACKBAR_DURATION", "", "EquityTradeLadderEventHandler", "", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderEvent;", "listState", "Landroidx/compose/foundation/lazy/LazyListState;", "snackbarHostState", "Landroidx/compose/material3/SnackbarHostState;", "onError", "Lkotlin/Function1;", "", "onOrderCheckAction", "Lkotlin/Function2;", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderEvent$OrderCheckAlert;", "Lcom/robinhood/models/serverdriven/db/ServerDrivenButton;", "(Lcom/robinhood/android/udf/event/Event;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/material3/SnackbarHostState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "feature-equity-trade-ladder_externalDebug", "centerAtIndexEvent", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderEvent$CenterAtIndex;", "serverDrivenAlert", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderEvent$ServerDrivenAlert;", "orderCheckAlert", "alertDialog", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderEvent$ShowDialog;", "snackbarEvent", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderEvent$Snackbar;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderEventHandlerKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class EquityTradeLadderEventHandler {
    private static final long SNACKBAR_DURATION = 1500;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EquityTradeLadderEventHandler$lambda$38(Event event, LazyListState lazyListState, SnackbarHostState snackbarHostState, Function1 function1, Function2 function2, int i, Composer composer, int i2) {
        EquityTradeLadderEventHandler(event, lazyListState, snackbarHostState, function1, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [androidx.compose.runtime.SnapshotMutationPolicy, java.lang.Object, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r14v8 */
    public static final void EquityTradeLadderEventHandler(final Event<EquityTradeLadderEvent> event, final LazyListState listState, final SnackbarHostState snackbarHostState, final Function1<? super Throwable, Unit> onError, final Function2<? super EquityTradeLadderEvent.OrderCheckAlert, ? super ServerDrivenButton, Unit> onOrderCheckAction, Composer composer, final int i) {
        int i2;
        SnapshotMutationPolicy snapshotMutationPolicy;
        CoroutineScope coroutineScope;
        int i3;
        int i4;
        SnapshotState snapshotState;
        int i5;
        ?? r14;
        EventConsumer<EquityTradeLadderEvent> eventConsumerInvoke;
        EventConsumer<EquityTradeLadderEvent> eventConsumerInvoke2;
        EventConsumer<EquityTradeLadderEvent> eventConsumerInvoke3;
        EventConsumer<EquityTradeLadderEvent> eventConsumerInvoke4;
        EventConsumer<EquityTradeLadderEvent> eventConsumerInvoke5;
        EventConsumer<EquityTradeLadderEvent> eventConsumerInvoke6;
        EventConsumer<EquityTradeLadderEvent> eventConsumerInvoke7;
        EventConsumer<EquityTradeLadderEvent> eventConsumerInvoke8;
        EventConsumer<EquityTradeLadderEvent> eventConsumerInvoke9;
        EventConsumer<EquityTradeLadderEvent> eventConsumerInvoke10;
        Intrinsics.checkNotNullParameter(listState, "listState");
        Intrinsics.checkNotNullParameter(snackbarHostState, "snackbarHostState");
        Intrinsics.checkNotNullParameter(onError, "onError");
        Intrinsics.checkNotNullParameter(onOrderCheckAction, "onOrderCheckAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(162941847);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(event) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(listState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(snackbarHostState) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onError) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onOrderCheckAction) ? 16384 : 8192;
        }
        if ((i2 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(162941847, i2, -1, "com.robinhood.android.equitytradeladder.EquityTradeLadderEventHandler (EquityTradeLadderEventHandler.kt:41)");
            }
            final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            final View view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            CoroutineScope coroutineScope2 = (CoroutineScope) objRememberedValue;
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            if (event != null) {
                if ((event.getData() instanceof EquityTradeLadderEvent.CenterAtIndex) && (eventConsumerInvoke10 = event.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke10.consume(event, new Function1() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderEventHandlerKt$EquityTradeLadderEventHandler$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m14031invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m14031invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            snapshotState2.setValue((EquityTradeLadderEvent.CenterAtIndex) event.getData());
                        }
                    });
                }
                Unit unit = Unit.INSTANCE;
            }
            if (event != null) {
                if ((event.getData() instanceof EquityTradeLadderEvent.ApiOrNetworkError) && (eventConsumerInvoke9 = event.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke9.consume(event, new Function1() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderEventHandlerKt$EquityTradeLadderEventHandler$$inlined$consumeIfType$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m14033invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m14033invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            onError.invoke(((EquityTradeLadderEvent.ApiOrNetworkError) event.getData()).getThrowable());
                        }
                    });
                }
                Unit unit2 = Unit.INSTANCE;
            }
            if (event != null) {
                if ((event.getData() instanceof EquityTradeLadderEvent.HapticFeedbacks) && (eventConsumerInvoke8 = event.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke8.consume(event, new Function1() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderEventHandlerKt$EquityTradeLadderEventHandler$$inlined$consumeIfType$3
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m14034invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m14034invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            ViewCompat.performHapticFeedback(view, ((EquityTradeLadderEvent.HapticFeedbacks) event.getData()).getConstant());
                        }
                    });
                }
                Unit unit3 = Unit.INSTANCE;
            }
            if (event != null) {
                if ((event.getData() instanceof EquityTradeLadderEvent.LaunchActivity) && (eventConsumerInvoke7 = event.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke7.consume(event, new Function1() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderEventHandlerKt$EquityTradeLadderEventHandler$$inlined$consumeIfType$4
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m14035invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m14035invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            Navigator.DefaultImpls.startActivity$default(navigator, context, ((EquityTradeLadderEvent.LaunchActivity) event.getData()).getKey(), null, false, null, null, 60, null);
                        }
                    });
                }
                Unit unit4 = Unit.INSTANCE;
            }
            if (event != null) {
                if ((event.getData() instanceof EquityTradeLadderEvent.LaunchDeepLink) && (eventConsumerInvoke6 = event.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke6.consume(event, new Function1() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderEventHandlerKt$EquityTradeLadderEventHandler$$inlined$consumeIfType$5
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m14036invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m14036invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            Navigator.DefaultImpls.handleDeepLink$default(navigator, context, ((EquityTradeLadderEvent.LaunchDeepLink) event.getData()).getUri(), null, null, false, null, 60, null);
                        }
                    });
                }
                Unit unit5 = Unit.INSTANCE;
            }
            if (event != null) {
                if ((event.getData() instanceof EquityTradeLadderEvent.LaunchFragment) && (eventConsumerInvoke5 = event.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke5.consume(event, new Function1() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderEventHandlerKt$EquityTradeLadderEventHandler$$inlined$consumeIfType$6
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m14037invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m14037invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            Navigator.DefaultImpls.showFragment$default(navigator, context, ((EquityTradeLadderEvent.LaunchFragment) event.getData()).getKey(), false, false, false, null, false, null, false, false, null, null, 4092, null);
                        }
                    });
                }
                Unit unit6 = Unit.INSTANCE;
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final SnapshotState snapshotState3 = (SnapshotState) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            if (event != null) {
                if ((event.getData() instanceof EquityTradeLadderEvent.ServerDrivenAlert) && (eventConsumerInvoke4 = event.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke4.consume(event, new Function1() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderEventHandlerKt$EquityTradeLadderEventHandler$$inlined$consumeIfType$7
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m14038invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m14038invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            snapshotState3.setValue((EquityTradeLadderEvent.ServerDrivenAlert) event.getData());
                        }
                    });
                }
                Unit unit7 = Unit.INSTANCE;
            }
            EquityTradeLadderEvent.ServerDrivenAlert serverDrivenAlertEquityTradeLadderEventHandler$lambda$10 = EquityTradeLadderEventHandler$lambda$10(snapshotState3);
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(navigator);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue4 == companion.getEmpty()) {
                snapshotMutationPolicy = null;
                objRememberedValue4 = new EquityTradeLadderEventHandler6(snapshotState3, context, navigator, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            } else {
                snapshotMutationPolicy = null;
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(serverDrivenAlertEquityTradeLadderEventHandler$lambda$10, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = SnapshotState3.mutableStateOf$default(snapshotMutationPolicy, snapshotMutationPolicy, 2, snapshotMutationPolicy);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            final SnapshotState snapshotState4 = (SnapshotState) objRememberedValue5;
            composerStartRestartGroup.endReplaceGroup();
            if (event != null) {
                if ((event.getData() instanceof EquityTradeLadderEvent.OrderCheckAlert) && (eventConsumerInvoke3 = event.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke3.consume(event, new Function1() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderEventHandlerKt$EquityTradeLadderEventHandler$$inlined$consumeIfType$8
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m14039invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m14039invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            snapshotState4.setValue((EquityTradeLadderEvent.OrderCheckAlert) event.getData());
                        }
                    });
                }
                Unit unit8 = Unit.INSTANCE;
            }
            int i6 = i2;
            EquityTradeLadderEvent.OrderCheckAlert orderCheckAlertEquityTradeLadderEventHandler$lambda$15 = EquityTradeLadderEventHandler$lambda$15(snapshotState4);
            composerStartRestartGroup.startReplaceGroup(1968364720);
            if (orderCheckAlertEquityTradeLadderEventHandler$lambda$15 == null) {
                i4 = 1849434622;
                i3 = i6;
                coroutineScope = coroutineScope2;
            } else {
                composerStartRestartGroup.startReplaceGroup(5004770);
                Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue6 == companion.getEmpty()) {
                    objRememberedValue6 = new Function0() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderEventHandlerKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return EquityTradeLadderEventHandler.EquityTradeLadderEventHandler$lambda$22$lambda$19$lambda$18(snapshotState4);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                Function0 function0 = (Function0) objRememberedValue6;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean z = (57344 & i6) == 16384;
                Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue7 == companion.getEmpty()) {
                    objRememberedValue7 = new Function2() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderEventHandlerKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return EquityTradeLadderEventHandler.EquityTradeLadderEventHandler$lambda$22$lambda$21$lambda$20(onOrderCheckAction, (EquityTradeLadderEvent.OrderCheckAlert) obj, (ServerDrivenButton) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                composerStartRestartGroup.endReplaceGroup();
                coroutineScope = coroutineScope2;
                i3 = i6;
                i4 = 1849434622;
                EquityOrderCheckPopup3.EquityOrderCheckPopup(orderCheckAlertEquityTradeLadderEventHandler$lambda$15, function0, (Function2) objRememberedValue7, null, composerStartRestartGroup, 48, 8);
                Unit unit9 = Unit.INSTANCE;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(i4);
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue8 == companion.getEmpty()) {
                objRememberedValue8 = SnapshotState3.mutableStateOf$default(snapshotMutationPolicy, snapshotMutationPolicy, 2, snapshotMutationPolicy);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            final SnapshotState snapshotState5 = (SnapshotState) objRememberedValue8;
            composerStartRestartGroup.endReplaceGroup();
            if (event != null) {
                if ((event.getData() instanceof EquityTradeLadderEvent.ShowDialog) && (eventConsumerInvoke2 = event.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke2.consume(event, new Function1() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderEventHandlerKt$EquityTradeLadderEventHandler$$inlined$consumeIfType$9
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m14040invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m14040invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            snapshotState5.setValue((EquityTradeLadderEvent.ShowDialog) event.getData());
                        }
                    });
                }
                Unit unit10 = Unit.INSTANCE;
            }
            EquityTradeLadderEvent.ShowDialog showDialogEquityTradeLadderEventHandler$lambda$24 = EquityTradeLadderEventHandler$lambda$24(snapshotState5);
            composerStartRestartGroup.startReplaceGroup(1968381669);
            if (showDialogEquityTradeLadderEventHandler$lambda$24 == null) {
                snapshotState = snapshotState2;
                i5 = 32;
            } else {
                StringResource title = showDialogEquityTradeLadderEventHandler$lambda$24.getTitle();
                int i7 = StringResource.$stable;
                String textAsString = StringResources6.getTextAsString(title, composerStartRestartGroup, i7);
                StringResource message = showDialogEquityTradeLadderEventHandler$lambda$24.getMessage();
                composerStartRestartGroup.startReplaceGroup(1968386856);
                Object textAsString2 = message == null ? snapshotMutationPolicy : StringResources6.getTextAsString(message, composerStartRestartGroup, i7);
                composerStartRestartGroup.endReplaceGroup();
                String str = textAsString2;
                if (textAsString2 == null) {
                    str = "";
                }
                BentoAlertDialog2.Body.Text text = new BentoAlertDialog2.Body.Text(str);
                String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_dismiss, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(5004770);
                Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue9 == companion.getEmpty()) {
                    objRememberedValue9 = new Function0() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderEventHandlerKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return EquityTradeLadderEventHandler.EquityTradeLadderEventHandler$lambda$31$lambda$28$lambda$27(snapshotState5);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoAlertButton bentoAlertButton = new BentoAlertButton(strStringResource, (Function0) objRememberedValue9);
                composerStartRestartGroup.startReplaceGroup(5004770);
                Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue10 == companion.getEmpty()) {
                    objRememberedValue10 = new Function0() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderEventHandlerKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return EquityTradeLadderEventHandler.EquityTradeLadderEventHandler$lambda$31$lambda$30$lambda$29(snapshotState5);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                }
                composerStartRestartGroup.endReplaceGroup();
                snapshotState = snapshotState2;
                i5 = 32;
                BentoAlertDialog.BentoAlertDialog(textAsString, text, bentoAlertButton, null, null, null, false, null, (Function0) objRememberedValue10, composerStartRestartGroup, (BentoAlertDialog2.Body.Text.$stable << 3) | 100663296 | (BentoAlertButton.$stable << 6), EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
                composerStartRestartGroup = composerStartRestartGroup;
                Unit unit11 = Unit.INSTANCE;
            }
            composerStartRestartGroup.endReplaceGroup();
            EquityTradeLadderEvent.CenterAtIndex centerAtIndexEquityTradeLadderEventHandler$lambda$1 = EquityTradeLadderEventHandler$lambda$1(snapshotState);
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            int i8 = i3;
            CoroutineScope coroutineScope3 = coroutineScope;
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(coroutineScope3) | ((i8 & 112) == i5);
            Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue11 == companion.getEmpty()) {
                r14 = 0;
                objRememberedValue11 = new EquityTradeLadderEventHandler2(listState, snapshotState, coroutineScope3, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
            } else {
                r14 = 0;
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(centerAtIndexEquityTradeLadderEventHandler$lambda$1, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue11, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue12 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue12 == companion.getEmpty()) {
                objRememberedValue12 = SnapshotState3.mutableStateOf$default(r14, r14, 2, r14);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
            }
            final SnapshotState snapshotState6 = (SnapshotState) objRememberedValue12;
            composerStartRestartGroup.endReplaceGroup();
            if (event != null) {
                if ((event.getData() instanceof EquityTradeLadderEvent.Snackbar) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderEventHandlerKt$EquityTradeLadderEventHandler$$inlined$consumeIfType$10
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m14032invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m14032invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            snapshotState6.setValue((EquityTradeLadderEvent.Snackbar) event.getData());
                        }
                    });
                }
                Unit unit12 = Unit.INSTANCE;
            }
            EquityTradeLadderEvent.Snackbar snackbarEquityTradeLadderEventHandler$lambda$34 = EquityTradeLadderEventHandler$lambda$34(snapshotState6);
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(coroutineScope3) | ((i8 & 896) == 256);
            Object objRememberedValue13 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || objRememberedValue13 == companion.getEmpty()) {
                objRememberedValue13 = new EquityTradeLadderEventHandler4(snapshotState6, coroutineScope3, snackbarHostState, r14);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(snackbarEquityTradeLadderEventHandler$lambda$34, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue13, composerStartRestartGroup, StringResource.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderEventHandlerKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EquityTradeLadderEventHandler.EquityTradeLadderEventHandler$lambda$38(event, listState, snackbarHostState, onError, onOrderCheckAction, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EquityTradeLadderEvent.CenterAtIndex EquityTradeLadderEventHandler$lambda$1(SnapshotState<EquityTradeLadderEvent.CenterAtIndex> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EquityTradeLadderEvent.ServerDrivenAlert EquityTradeLadderEventHandler$lambda$10(SnapshotState<EquityTradeLadderEvent.ServerDrivenAlert> snapshotState) {
        return snapshotState.getValue();
    }

    private static final EquityTradeLadderEvent.OrderCheckAlert EquityTradeLadderEventHandler$lambda$15(SnapshotState<EquityTradeLadderEvent.OrderCheckAlert> snapshotState) {
        return snapshotState.getValue();
    }

    private static final EquityTradeLadderEvent.ShowDialog EquityTradeLadderEventHandler$lambda$24(SnapshotState<EquityTradeLadderEvent.ShowDialog> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EquityTradeLadderEvent.Snackbar EquityTradeLadderEventHandler$lambda$34(SnapshotState<EquityTradeLadderEvent.Snackbar> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EquityTradeLadderEventHandler$lambda$22$lambda$19$lambda$18(SnapshotState snapshotState) {
        snapshotState.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EquityTradeLadderEventHandler$lambda$22$lambda$21$lambda$20(Function2 function2, EquityTradeLadderEvent.OrderCheckAlert alert, ServerDrivenButton button) {
        Intrinsics.checkNotNullParameter(alert, "alert");
        Intrinsics.checkNotNullParameter(button, "button");
        function2.invoke(alert, button);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EquityTradeLadderEventHandler$lambda$31$lambda$28$lambda$27(SnapshotState snapshotState) {
        snapshotState.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EquityTradeLadderEventHandler$lambda$31$lambda$30$lambda$29(SnapshotState snapshotState) {
        snapshotState.setValue(null);
        return Unit.INSTANCE;
    }
}
