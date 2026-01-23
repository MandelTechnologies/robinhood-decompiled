package com.robinhood.android.lib.performancechart;

import android.content.Context;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.lib.performancechart.PerformanceChartActionHandler;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper3;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlerKt;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlerts2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.serverdriven.experimental.api.Button;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertMobilePresentationStyle;
import com.robinhood.models.serverdriven.experimental.api.PerformanceChartAction;
import com.robinhood.models.serverdriven.experimental.api.Pictogram;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PerformanceChartActionHandler.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a/\u0010\u0004\u001a\u00020\u00012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\f²\u0006\u0016\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\n@\nX\u008a\u008e\u0002²\u0006\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u000b\u001a\u00020\n8\n@\nX\u008a\u008e\u0002"}, m3636d2 = {"Lkotlin/Function0;", "", "onDismiss", "content", "PerformanceChartActionHandler", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "Lcom/robinhood/models/serverdriven/experimental/api/PerformanceChartAction;", "dialogContent", "bottomSheetContent", "", "showMarginAlert", "lib-performance-chart_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.lib.performancechart.PerformanceChartActionHandlerKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class PerformanceChartActionHandler {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PerformanceChartActionHandler$lambda$10(Function0 function0, Function2 function2, int i, int i2, Composer composer, int i3) {
        PerformanceChartActionHandler(function0, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void PerformanceChartActionHandler(Function0<Unit> function0, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        Function0<Unit> function02;
        int i3;
        final Function0<Unit> function03;
        final SheetState sheetState;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1843163560);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            function02 = function0;
        } else if ((i & 6) == 0) {
            function02 = function0;
            i3 = (composerStartRestartGroup.changedInstance(function02) ? 4 : 2) | i;
        } else {
            function02 = function0;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(content) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            function03 = function02;
        } else {
            function03 = i4 != 0 ? null : function02;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1843163560, i3, -1, "com.robinhood.android.lib.performancechart.PerformanceChartActionHandler (PerformanceChartActionHandler.kt:34)");
            }
            final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
            SheetState sheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(true, null, composerStartRestartGroup, 6, 2);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            final SnapshotState snapshotState3 = (SnapshotState) objRememberedValue4;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changed(sheetStateRememberModalBottomSheetState) | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | ((i3 & 14) == 4);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue5 == companion.getEmpty()) {
                sheetState = sheetStateRememberModalBottomSheetState;
                SduiActionHandler sduiActionHandler = new SduiActionHandler() { // from class: com.robinhood.android.lib.performancechart.PerformanceChartActionHandlerKt$PerformanceChartActionHandler$handler$1$1

                    /* compiled from: PerformanceChartActionHandler.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    /* renamed from: com.robinhood.android.lib.performancechart.PerformanceChartActionHandlerKt$PerformanceChartActionHandler$handler$1$1$WhenMappings */
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[GenericAlertMobilePresentationStyle.values().length];
                            try {
                                iArr[GenericAlertMobilePresentationStyle.MODAL.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[GenericAlertMobilePresentationStyle.BOTTOM_SHEET.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    /* compiled from: PerformanceChartActionHandler.kt */
                    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.lib.performancechart.PerformanceChartActionHandlerKt$PerformanceChartActionHandler$handler$1$1$1", m3645f = "PerformanceChartActionHandler.kt", m3646l = {52}, m3647m = "invokeSuspend")
                    /* renamed from: com.robinhood.android.lib.performancechart.PerformanceChartActionHandlerKt$PerformanceChartActionHandler$handler$1$1$1, reason: invalid class name */
                    static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ SnapshotState<GenericAlertContent<PerformanceChartAction>> $bottomSheetContent$delegate;
                        final /* synthetic */ SheetState $bottomSheetState;
                        final /* synthetic */ SnapshotState<GenericAlertContent<PerformanceChartAction>> $dialogContent$delegate;
                        final /* synthetic */ SnapshotState<Boolean> $showMarginAlert$delegate;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass1(SheetState sheetState, SnapshotState<GenericAlertContent<PerformanceChartAction>> snapshotState, SnapshotState<GenericAlertContent<PerformanceChartAction>> snapshotState2, SnapshotState<Boolean> snapshotState3, Continuation<? super AnonymousClass1> continuation) {
                            super(2, continuation);
                            this.$bottomSheetState = sheetState;
                            this.$bottomSheetContent$delegate = snapshotState;
                            this.$dialogContent$delegate = snapshotState2;
                            this.$showMarginAlert$delegate = snapshotState3;
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new AnonymousClass1(this.$bottomSheetState, this.$bottomSheetContent$delegate, this.$dialogContent$delegate, this.$showMarginAlert$delegate, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i = this.label;
                            if (i == 0) {
                                ResultKt.throwOnFailure(obj);
                                SheetState sheetState = this.$bottomSheetState;
                                this.label = 1;
                                if (sheetState.hide(this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                            }
                            this.$bottomSheetContent$delegate.setValue(null);
                            PerformanceChartActionHandler.PerformanceChartActionHandler$lambda$2(this.$dialogContent$delegate, null);
                            PerformanceChartActionHandler.PerformanceChartActionHandler$lambda$8(this.$showMarginAlert$delegate, false);
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
                    /* renamed from: handle, reason: merged with bridge method [inline-methods] */
                    public final boolean mo15941handle(PerformanceChartAction action) {
                        Intrinsics.checkNotNullParameter(action, "action");
                        if (action instanceof PerformanceChartAction.Deeplink) {
                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(sheetState, snapshotState2, snapshotState, snapshotState3, null), 3, null);
                            return GenericActionHandlerKt.handleDeeplinkAction$default(navigator, context, ((PerformanceChartAction.Deeplink) action).getValue2(), null, 4, null);
                        }
                        if (action instanceof PerformanceChartAction.Dismiss) {
                            if (PerformanceChartActionHandler.PerformanceChartActionHandler$lambda$4(snapshotState2) != null || PerformanceChartActionHandler.PerformanceChartActionHandler$lambda$1(snapshotState) != null) {
                                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(sheetState, snapshotState2, snapshotState, snapshotState3, null), 3, null);
                            } else {
                                Function0<Unit> function04 = function03;
                                if (function04 != null) {
                                    function04.invoke();
                                }
                            }
                            return true;
                        }
                        if (action instanceof PerformanceChartAction.InfoAlert) {
                            PerformanceChartAction.InfoAlert infoAlert = (PerformanceChartAction.InfoAlert) action;
                            int i5 = WhenMappings.$EnumSwitchMapping$0[infoAlert.getValue2().getMobile_presentation_style().ordinal()];
                            if (i5 == 1) {
                                PerformanceChartActionHandler.PerformanceChartActionHandler$lambda$2(snapshotState, infoAlert.getValue2().getAlert());
                                return true;
                            }
                            if (i5 == 2) {
                                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(action, sheetState, snapshotState2, null), 3, null);
                                return true;
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        if (action instanceof PerformanceChartAction.PresentMarginAlertDescription) {
                            PerformanceChartActionHandler.PerformanceChartActionHandler$lambda$8(snapshotState3, true);
                            return true;
                        }
                        throw new NoWhenBranchMatchedException();
                    }

                    /* compiled from: PerformanceChartActionHandler.kt */
                    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.lib.performancechart.PerformanceChartActionHandlerKt$PerformanceChartActionHandler$handler$1$1$2", m3645f = "PerformanceChartActionHandler.kt", m3646l = {69}, m3647m = "invokeSuspend")
                    /* renamed from: com.robinhood.android.lib.performancechart.PerformanceChartActionHandlerKt$PerformanceChartActionHandler$handler$1$1$2, reason: invalid class name */
                    static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ SnapshotState<GenericAlertContent<PerformanceChartAction>> $bottomSheetContent$delegate;
                        final /* synthetic */ SheetState $bottomSheetState;
                        final /* synthetic */ SnapshotState<GenericAlertContent<PerformanceChartAction>> $dialogContent$delegate;
                        final /* synthetic */ SnapshotState<Boolean> $showMarginAlert$delegate;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass2(SheetState sheetState, SnapshotState<GenericAlertContent<PerformanceChartAction>> snapshotState, SnapshotState<GenericAlertContent<PerformanceChartAction>> snapshotState2, SnapshotState<Boolean> snapshotState3, Continuation<? super AnonymousClass2> continuation) {
                            super(2, continuation);
                            this.$bottomSheetState = sheetState;
                            this.$bottomSheetContent$delegate = snapshotState;
                            this.$dialogContent$delegate = snapshotState2;
                            this.$showMarginAlert$delegate = snapshotState3;
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new AnonymousClass2(this.$bottomSheetState, this.$bottomSheetContent$delegate, this.$dialogContent$delegate, this.$showMarginAlert$delegate, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i = this.label;
                            if (i == 0) {
                                ResultKt.throwOnFailure(obj);
                                SheetState sheetState = this.$bottomSheetState;
                                this.label = 1;
                                if (sheetState.hide(this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                            }
                            this.$bottomSheetContent$delegate.setValue(null);
                            PerformanceChartActionHandler.PerformanceChartActionHandler$lambda$2(this.$dialogContent$delegate, null);
                            PerformanceChartActionHandler.PerformanceChartActionHandler$lambda$8(this.$showMarginAlert$delegate, false);
                            return Unit.INSTANCE;
                        }
                    }

                    /* compiled from: PerformanceChartActionHandler.kt */
                    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.lib.performancechart.PerformanceChartActionHandlerKt$PerformanceChartActionHandler$handler$1$1$3", m3645f = "PerformanceChartActionHandler.kt", m3646l = {88}, m3647m = "invokeSuspend")
                    /* renamed from: com.robinhood.android.lib.performancechart.PerformanceChartActionHandlerKt$PerformanceChartActionHandler$handler$1$1$3, reason: invalid class name */
                    static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ PerformanceChartAction $action;
                        final /* synthetic */ SnapshotState<GenericAlertContent<PerformanceChartAction>> $bottomSheetContent$delegate;
                        final /* synthetic */ SheetState $bottomSheetState;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass3(PerformanceChartAction performanceChartAction, SheetState sheetState, SnapshotState<GenericAlertContent<PerformanceChartAction>> snapshotState, Continuation<? super AnonymousClass3> continuation) {
                            super(2, continuation);
                            this.$action = performanceChartAction;
                            this.$bottomSheetState = sheetState;
                            this.$bottomSheetContent$delegate = snapshotState;
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new AnonymousClass3(this.$action, this.$bottomSheetState, this.$bottomSheetContent$delegate, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i = this.label;
                            if (i == 0) {
                                ResultKt.throwOnFailure(obj);
                                this.$bottomSheetContent$delegate.setValue(((PerformanceChartAction.InfoAlert) this.$action).getValue2().getAlert());
                                SheetState sheetState = this.$bottomSheetState;
                                this.label = 1;
                                if (sheetState.show(this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                };
                composerStartRestartGroup.updateRememberedValue(sduiActionHandler);
                objRememberedValue5 = sduiActionHandler;
            } else {
                sheetState = sheetStateRememberModalBottomSheetState;
            }
            SduiActionHandler sduiActionHandler2 = (SduiActionHandler) objRememberedValue5;
            composerStartRestartGroup.endReplaceGroup();
            SduiActionHandler3.ProvideActionHandler(sduiActionHandler2, ComposableLambda3.rememberComposableLambda(1220088777, true, new C204731(content, snapshotState, sduiActionHandler2, snapshotState3, snapshotState2, coroutineScope, sheetState), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.lib.performancechart.PerformanceChartActionHandlerKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PerformanceChartActionHandler.PerformanceChartActionHandler$lambda$10(function03, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PerformanceChartActionHandler$lambda$8(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GenericAlertContent<PerformanceChartAction> PerformanceChartActionHandler$lambda$1(SnapshotState<GenericAlertContent<PerformanceChartAction>> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GenericAlertContent<PerformanceChartAction> PerformanceChartActionHandler$lambda$4(SnapshotState<GenericAlertContent<PerformanceChartAction>> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean PerformanceChartActionHandler$lambda$7(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* compiled from: PerformanceChartActionHandler.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.lib.performancechart.PerformanceChartActionHandlerKt$PerformanceChartActionHandler$1 */
    static final class C204731 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState<GenericAlertContent<PerformanceChartAction>> $bottomSheetContent$delegate;
        final /* synthetic */ SheetState $bottomSheetState;
        final /* synthetic */ Function2<Composer, Integer, Unit> $content;
        final /* synthetic */ CoroutineScope $coroutineScope;
        final /* synthetic */ SnapshotState<GenericAlertContent<PerformanceChartAction>> $dialogContent$delegate;
        final /* synthetic */ SduiActionHandler<PerformanceChartAction> $handler;
        final /* synthetic */ SnapshotState<Boolean> $showMarginAlert$delegate;

        /* JADX WARN: Multi-variable type inference failed */
        C204731(Function2<? super Composer, ? super Integer, Unit> function2, SnapshotState<GenericAlertContent<PerformanceChartAction>> snapshotState, SduiActionHandler<? super PerformanceChartAction> sduiActionHandler, SnapshotState<Boolean> snapshotState2, SnapshotState<GenericAlertContent<PerformanceChartAction>> snapshotState3, CoroutineScope coroutineScope, SheetState sheetState) {
            this.$content = function2;
            this.$dialogContent$delegate = snapshotState;
            this.$handler = sduiActionHandler;
            this.$showMarginAlert$delegate = snapshotState2;
            this.$bottomSheetContent$delegate = snapshotState3;
            this.$coroutineScope = coroutineScope;
            this.$bottomSheetState = sheetState;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1$lambda$0(SnapshotState snapshotState) {
            PerformanceChartActionHandler.PerformanceChartActionHandler$lambda$2(snapshotState, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$3(SnapshotState snapshotState) {
            PerformanceChartActionHandler.PerformanceChartActionHandler$lambda$8(snapshotState, false);
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1220088777, i, -1, "com.robinhood.android.lib.performancechart.PerformanceChartActionHandler.<anonymous> (PerformanceChartActionHandler.kt:102)");
            }
            this.$content.invoke(composer, 0);
            GenericAlertContent genericAlertContentPerformanceChartActionHandler$lambda$1 = PerformanceChartActionHandler.PerformanceChartActionHandler$lambda$1(this.$dialogContent$delegate);
            composer.startReplaceGroup(-20755461);
            if (genericAlertContentPerformanceChartActionHandler$lambda$1 != null) {
                SduiActionHandler<PerformanceChartAction> sduiActionHandler = this.$handler;
                final SnapshotState<GenericAlertContent<PerformanceChartAction>> snapshotState = this.$dialogContent$delegate;
                SduiAlert sduiAlert = SduiAlert.INSTANCE;
                composer.startReplaceGroup(5004770);
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.lib.performancechart.PerformanceChartActionHandlerKt$PerformanceChartActionHandler$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PerformanceChartActionHandler.C204731.invoke$lambda$2$lambda$1$lambda$0(snapshotState);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                sduiAlert.Dialog(genericAlertContentPerformanceChartActionHandler$lambda$1, sduiActionHandler, null, (Function0) objRememberedValue, composer, (SduiAlert.$stable << 12) | 3072, 4);
                Unit unit = Unit.INSTANCE;
            }
            composer.endReplaceGroup();
            composer.startReplaceGroup(-20748454);
            if (PerformanceChartActionHandler.PerformanceChartActionHandler$lambda$7(this.$showMarginAlert$delegate)) {
                composer.startReplaceGroup(5004770);
                final SnapshotState<Boolean> snapshotState2 = this.$showMarginAlert$delegate;
                Object objRememberedValue2 = composer.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.lib.performancechart.PerformanceChartActionHandlerKt$PerformanceChartActionHandler$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PerformanceChartActionHandler.C204731.invoke$lambda$4$lambda$3(snapshotState2);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                MarginAlertDialog.MarginAlertDialog((Function0) objRememberedValue2, composer, 6);
            }
            composer.endReplaceGroup();
            final GenericAlertContent genericAlertContentPerformanceChartActionHandler$lambda$4 = PerformanceChartActionHandler.PerformanceChartActionHandler$lambda$4(this.$bottomSheetContent$delegate);
            if (genericAlertContentPerformanceChartActionHandler$lambda$4 != null) {
                final CoroutineScope coroutineScope = this.$coroutineScope;
                final SheetState sheetState = this.$bottomSheetState;
                final SnapshotState<GenericAlertContent<PerformanceChartAction>> snapshotState3 = this.$bottomSheetContent$delegate;
                final SduiActionHandler<PerformanceChartAction> sduiActionHandler2 = this.$handler;
                composer.startReplaceGroup(-1746271574);
                boolean zChangedInstance = composer.changedInstance(coroutineScope) | composer.changed(sheetState);
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.lib.performancechart.PerformanceChartActionHandlerKt$PerformanceChartActionHandler$1$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PerformanceChartActionHandler.C204731.invoke$lambda$7$lambda$6$lambda$5(coroutineScope, sheetState, snapshotState3);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer.endReplaceGroup();
                GenericActionHandlerKt.SduiModalBottomSheet((Function0) objRememberedValue3, sheetState, null, ComposableLambda3.rememberComposableLambda(2029134651, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.robinhood.android.lib.performancechart.PerformanceChartActionHandlerKt$PerformanceChartActionHandler$1$3$2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer2, Integer num) {
                        invoke(column5, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Column5 SduiModalBottomSheet, Composer composer2, int i2) {
                        Intrinsics.checkNotNullParameter(SduiModalBottomSheet, "$this$SduiModalBottomSheet");
                        if ((i2 & 17) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2029134651, i2, -1, "com.robinhood.android.lib.performancechart.PerformanceChartActionHandler.<anonymous>.<anonymous>.<anonymous> (PerformanceChartActionHandler.kt:130)");
                        }
                        SduiAlert sduiAlert2 = SduiAlert.INSTANCE;
                        final GenericAlertContent<PerformanceChartAction> genericAlertContent = genericAlertContentPerformanceChartActionHandler$lambda$4;
                        SduiActionHandler<PerformanceChartAction> sduiActionHandler3 = sduiActionHandler2;
                        int i3 = SduiAlert.$stable << 6;
                        composer2.startReplaceGroup(1847729312);
                        final Button button = (Button) genericAlertContent.getAction_buttons().get(0);
                        final Button button2 = (Button) CollectionsKt.getOrNull(genericAlertContent.getAction_buttons(), 1);
                        SduiActionHandler3.ProvideActionHandler(sduiActionHandler3, ComposableLambda3.rememberComposableLambda(925557249, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.lib.performancechart.PerformanceChartActionHandlerKt$PerformanceChartActionHandler$1$3$2$invoke$$inlined$AlertSheet$1
                            public final void invoke(Composer composer3, int i4) {
                                long jM21372getBg20d7_KjU;
                                String serverValue;
                                if ((i4 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(925557249, i4, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert.AlertSheet.<anonymous> (SduiAlert.kt:186)");
                                }
                                Pictogram pog = genericAlertContent.getPog();
                                ServerToBentoAssetMapper3 serverToBentoAssetMapper3FromServerValue = (pog == null || (serverValue = pog.getServerValue()) == null) ? null : ServerToBentoAssetMapper3.INSTANCE.fromServerValue(serverValue);
                                String title = genericAlertContent.getTitle();
                                final String body_markdown = genericAlertContent.getBody_markdown();
                                final List body_components = genericAlertContent.getBody_components();
                                SduiAlert sduiAlert3 = SduiAlert.INSTANCE;
                                BentoAlertButton alertButton = sduiAlert3.toAlertButton(button, null, composer3, 0, 1);
                                Button button3 = button2;
                                composer3.startReplaceGroup(402298512);
                                BentoAlertButton alertButton2 = button3 == null ? null : sduiAlert3.toAlertButton(button3, null, composer3, 0, 1);
                                composer3.endReplaceGroup();
                                int i5 = BentoAlertButton.$stable;
                                int i6 = (i5 << 9) | (i5 << 12);
                                composer3.startReplaceGroup(221388998);
                                final int iM7919getCentere0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
                                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1694075195, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.lib.performancechart.PerformanceChartActionHandlerKt$PerformanceChartActionHandler$1$3$2$invoke$$inlined$AlertSheet$1.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer4, int i7) {
                                        if ((i7 & 3) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1694075195, i7, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.alerts.BentoSduiAlertSheet.<anonymous> (BentoSduiAlertSheet.kt:38)");
                                        }
                                        Alignment.Companion companion = Alignment.INSTANCE;
                                        Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
                                        String str = body_markdown;
                                        int i8 = iM7919getCentere0LSkKk;
                                        List list = body_components;
                                        Modifier.Companion companion2 = Modifier.INSTANCE;
                                        Arrangement arrangement = Arrangement.INSTANCE;
                                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer4, 48);
                                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, companion2);
                                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                        if (composer4.getApplier() == null) {
                                            Composables.invalidApplier();
                                        }
                                        composer4.startReusableNode();
                                        if (composer4.getInserting()) {
                                            composer4.createNode(constructor);
                                        } else {
                                            composer4.useNode();
                                        }
                                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                        Column6 column6 = Column6.INSTANCE;
                                        composer4.startReplaceGroup(1390346787);
                                        if (str.length() > 0) {
                                            BentoAlerts2.m20854AlertBodyText5stqomU(str, i8, composer4, 0, 0);
                                        }
                                        composer4.endReplaceGroup();
                                        composer4.startReplaceGroup(1390351170);
                                        if (list != null) {
                                            ImmutableList3 persistentList = extensions2.toPersistentList(list);
                                            HorizontalPadding horizontalPadding = HorizontalPadding.None;
                                            composer4.startReplaceGroup(-1772220517);
                                            SduiColumns.SduiColumn(persistentList, PerformanceChartAction.class, companion2, null, null, horizontalPadding, arrangement.getTop(), companion.getStart(), true, composer4, 100859904, 0);
                                            composer4.endReplaceGroup();
                                        }
                                        composer4.endReplaceGroup();
                                        composer4.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer3, 54);
                                Modifier.Companion companion = Modifier.INSTANCE;
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i7 = BentoTheme.$stable;
                                Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(companion, bentoTheme.getColors(composer3, i7).m21371getBg0d7_KjU(), null, 2, null);
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM4872backgroundbw27NRU$default);
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                if (composer3.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m5156height3ABfNKs(companion, C2002Dp.m7995constructorimpl(1)), 0.0f, 1, null);
                                if (bentoTheme.getColors(composer3, i7).getIsDay()) {
                                    composer3.startReplaceGroup(-2071673393);
                                    jM21372getBg20d7_KjU = bentoTheme.getColors(composer3, i7).getJet();
                                } else {
                                    composer3.startReplaceGroup(-2071672529);
                                    jM21372getBg20d7_KjU = bentoTheme.getColors(composer3, i7).m21372getBg20d7_KjU();
                                }
                                composer3.endReplaceGroup();
                                BoxKt.Box(Background3.m4872backgroundbw27NRU$default(modifierFillMaxWidth$default, jM21372getBg20d7_KjU, null, 2, null), composer3, 0);
                                BentoAlerts2.AlertContent(null, serverToBentoAssetMapper3FromServerValue, title, null, CollectionsKt.listOfNotNull((Object[]) new BentoAlertButton[]{alertButton, alertButton2}), false, composableLambdaRememberComposableLambda, composer3, ((i6 >> 12) & 112) | 1572864 | ((i6 << 6) & 896) | (i5 << 12), 41);
                                composer3.endNode();
                                composer3.endReplaceGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }
                        }, composer2, 54), composer2, ((i3 >> 3) & 14) | 48);
                        composer2.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, 3072, 4);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$7$lambda$6$lambda$5(CoroutineScope coroutineScope, SheetState sheetState, SnapshotState snapshotState) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new PerformanceChartActionHandler2(sheetState, snapshotState, null), 3, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void PerformanceChartActionHandler$lambda$2(SnapshotState<GenericAlertContent<PerformanceChartAction>> snapshotState, GenericAlertContent<? extends PerformanceChartAction> genericAlertContent) {
        snapshotState.setValue(genericAlertContent);
    }
}
