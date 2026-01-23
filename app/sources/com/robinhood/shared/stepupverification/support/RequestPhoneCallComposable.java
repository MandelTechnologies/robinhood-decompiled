package com.robinhood.shared.stepupverification.support;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.util.InternationalInfo;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.common.strings.C32428R;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.stepupverification.C39791R;
import com.robinhood.shared.stepupverification.support.RequestPhoneCallComposable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;

/* compiled from: RequestPhoneCallComposable.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\u001a-\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b¨\u0006\t²\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u0084\u0002²\u0006\n\u0010\f\u001a\u00020\rX\u008a\u008e\u0002"}, m3636d2 = {"RequestPhoneCallComposable", "", "onChangeCountryCode", "Lkotlin/Function0;", "duxo", "Lcom/robinhood/shared/stepupverification/support/RequestPhoneCallDuxo;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lkotlin/jvm/functions/Function0;Lcom/robinhood/shared/stepupverification/support/RequestPhoneCallDuxo;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-step-up-verification_externalDebug", "viewState", "Lcom/robinhood/shared/stepupverification/support/RequestPhoneCallViewState;", "showEditBottomSheet", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.stepupverification.support.RequestPhoneCallComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class RequestPhoneCallComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RequestPhoneCallComposable$lambda$7(Function0 function0, RequestPhoneCallDuxo requestPhoneCallDuxo, Modifier modifier, int i, int i2, Composer composer, int i3) {
        RequestPhoneCallComposable(function0, requestPhoneCallDuxo, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RequestPhoneCallComposable(final Function0<Unit> onChangeCountryCode, final RequestPhoneCallDuxo duxo, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        EventLogger eventLogger;
        UserInteractionEventDescriptor userInteractionEventDescriptor;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onChangeCountryCode, "onChangeCountryCode");
        Intrinsics.checkNotNullParameter(duxo, "duxo");
        Composer composerStartRestartGroup = composer.startRestartGroup(-140932847);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onChangeCountryCode) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(duxo) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i3;
            if ((i4 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-140932847, i4, -1, "com.robinhood.shared.stepupverification.support.RequestPhoneCallComposable (RequestPhoneCallComposable.kt:35)");
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(duxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                final EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                final UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(2002502491);
                if (RequestPhoneCallComposable$lambda$2(snapshotState)) {
                    eventLogger = current;
                    userInteractionEventDescriptor = userInteractionEventDescriptor2;
                } else {
                    InternationalInfo bottomSheetInternationalInfo = RequestPhoneCallComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getBottomSheetInternationalInfo();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(duxo);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new RequestPhoneCallComposable2(duxo);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Function2 function2 = (Function2) ((KFunction) objRememberedValue2);
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor2);
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new Function0() { // from class: com.robinhood.shared.stepupverification.support.RequestPhoneCallComposableKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return RequestPhoneCallComposable.RequestPhoneCallComposable$lambda$6$lambda$5(current, userInteractionEventDescriptor2, snapshotState);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    eventLogger = current;
                    userInteractionEventDescriptor = userInteractionEventDescriptor2;
                    PhoneInputBottomSheetComposable.PhoneInputBottomSheetComposable(bottomSheetInternationalInfo, function2, onChangeCountryCode, (Function0) objRememberedValue3, null, null, composerStartRestartGroup, InternationalInfo.$stable | ((i4 << 6) & 896), 48);
                }
                composerStartRestartGroup.endReplaceGroup();
                UserInteractionEventDescriptor userInteractionEventDescriptor3 = userInteractionEventDescriptor;
                Modifier modifier5 = modifier4;
                BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(modifier5, false, ComposableLambda3.rememberComposableLambda(1572145990, true, new C399353(context, eventLogger, userInteractionEventDescriptor3, duxo, snapshotState4CollectAsStateWithLifecycle), composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-986281991, true, new C399364(userInteractionEventDescriptor3, snapshotState4CollectAsStateWithLifecycle, snapshotState), composerStartRestartGroup, 54), composerStartRestartGroup, ((i4 >> 6) & 14) | 3456, 2);
                composerStartRestartGroup = composerStartRestartGroup;
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.stepupverification.support.RequestPhoneCallComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return RequestPhoneCallComposable.RequestPhoneCallComposable$lambda$7(onChangeCountryCode, duxo, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(duxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            final EventLogger current2 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            final UserInteractionEventDescriptor userInteractionEventDescriptor22 = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(2002502491);
            if (RequestPhoneCallComposable$lambda$2(snapshotState)) {
            }
            composerStartRestartGroup.endReplaceGroup();
            UserInteractionEventDescriptor userInteractionEventDescriptor32 = userInteractionEventDescriptor;
            Modifier modifier52 = modifier4;
            BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(modifier52, false, ComposableLambda3.rememberComposableLambda(1572145990, true, new C399353(context2, eventLogger, userInteractionEventDescriptor32, duxo, snapshotState4CollectAsStateWithLifecycle2), composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-986281991, true, new C399364(userInteractionEventDescriptor32, snapshotState4CollectAsStateWithLifecycle2, snapshotState), composerStartRestartGroup, 54), composerStartRestartGroup, ((i4 >> 6) & 14) | 3456, 2);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RequestPhoneCallComposable$lambda$3(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RequestPhoneCallComposable$lambda$6$lambda$5(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, SnapshotState snapshotState) {
        EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, UserInteractionEventDescriptors.toEventData(UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, new Screen(Screen.Name.WORKFLOW_REQUEST_PHONE_CALL_EDIT, null, null, null, 14, null), UserInteractionEventData.Action.BACK, null, null, null, 57, null), UserInteractionEventData.EventType.TAP), false, false, 6, null);
        RequestPhoneCallComposable$lambda$3(snapshotState, false);
        return Unit.INSTANCE;
    }

    /* compiled from: RequestPhoneCallComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.stepupverification.support.RequestPhoneCallComposableKt$RequestPhoneCallComposable$3 */
    static final class C399353 implements Function3<BentoButtonBar3, Composer, Integer, Unit> {
        final /* synthetic */ Context $context;
        final /* synthetic */ RequestPhoneCallDuxo $duxo;
        final /* synthetic */ UserInteractionEventDescriptor $eventDescriptor;
        final /* synthetic */ EventLogger $eventLogger;
        final /* synthetic */ SnapshotState4<RequestPhoneCallViewState> $viewState$delegate;

        C399353(Context context, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, RequestPhoneCallDuxo requestPhoneCallDuxo, SnapshotState4<RequestPhoneCallViewState> snapshotState4) {
            this.$context = context;
            this.$eventLogger = eventLogger;
            this.$eventDescriptor = userInteractionEventDescriptor;
            this.$duxo = requestPhoneCallDuxo;
            this.$viewState$delegate = snapshotState4;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer, Integer num) {
            invoke(bentoButtonBar3, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1572145990, i, -1, "com.robinhood.shared.stepupverification.support.RequestPhoneCallComposable.<anonymous> (RequestPhoneCallComposable.kt:63)");
            }
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer, 6, 1);
            String strStringResource = StringResources_androidKt.stringResource(C39791R.string.request_phone_call_disclaimer_helper_text, composer, 0);
            String strStringResource2 = StringResources_androidKt.stringResource(C39791R.string.request_phone_call_disclaimer_link_text, composer, 0);
            boolean zIsLoading = RequestPhoneCallComposable.RequestPhoneCallComposable$lambda$0(this.$viewState$delegate).isLoading();
            boolean primaryCtaEnabled = RequestPhoneCallComposable.RequestPhoneCallComposable$lambda$0(this.$viewState$delegate).getPrimaryCtaEnabled();
            String strStringResource3 = StringResources_androidKt.stringResource(C39791R.string.request_phone_call_primary_cta_text, composer, 0);
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(this.$context);
            final Context context = this.$context;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.shared.stepupverification.support.RequestPhoneCallComposableKt$RequestPhoneCallComposable$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RequestPhoneCallComposable.C399353.invoke$lambda$1$lambda$0(context);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1746271574);
            boolean zChangedInstance2 = composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$eventDescriptor) | composer.changedInstance(this.$duxo);
            final EventLogger eventLogger = this.$eventLogger;
            final UserInteractionEventDescriptor userInteractionEventDescriptor = this.$eventDescriptor;
            final RequestPhoneCallDuxo requestPhoneCallDuxo = this.$duxo;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.stepupverification.support.RequestPhoneCallComposableKt$RequestPhoneCallComposable$3$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RequestPhoneCallComposable.C399353.invoke$lambda$3$lambda$2(eventLogger, userInteractionEventDescriptor, requestPhoneCallDuxo);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            BentoButtonBar2.BentoButtonBar(modifierM21623defaultHorizontalPaddingrAjV9yQ, strStringResource, strStringResource2, false, function0, null, (Function0) objRememberedValue2, strStringResource3, zIsLoading, null, primaryCtaEnabled, null, null, false, null, false, composer, 0, 0, 64040);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Context context) {
            WebUtils.viewUrl$default(context, C32428R.string.url_privacy, 0, 4, (Object) null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, RequestPhoneCallDuxo requestPhoneCallDuxo) {
            EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, UserInteractionEventDescriptors.toEventData(UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, UserInteractionEventData.Action.REQUEST_CX_CALL, null, null, null, 59, null), UserInteractionEventData.EventType.TAP), false, false, 6, null);
            requestPhoneCallDuxo.requestCall();
            return Unit.INSTANCE;
        }
    }

    /* compiled from: RequestPhoneCallComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.stepupverification.support.RequestPhoneCallComposableKt$RequestPhoneCallComposable$4 */
    static final class C399364 implements Function3<BoxScope, Composer, Integer, Unit> {
        final /* synthetic */ UserInteractionEventDescriptor $eventDescriptor;
        final /* synthetic */ SnapshotState<Boolean> $showEditBottomSheet$delegate;
        final /* synthetic */ SnapshotState4<RequestPhoneCallViewState> $viewState$delegate;

        C399364(UserInteractionEventDescriptor userInteractionEventDescriptor, SnapshotState4<RequestPhoneCallViewState> snapshotState4, SnapshotState<Boolean> snapshotState) {
            this.$eventDescriptor = userInteractionEventDescriptor;
            this.$viewState$delegate = snapshotState4;
            this.$showEditBottomSheet$delegate = snapshotState;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
            invoke(boxScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-986281991, i, -1, "com.robinhood.shared.stepupverification.support.RequestPhoneCallComposable.<anonymous> (RequestPhoneCallComposable.kt:83)");
            }
            UserInteractionEventDescriptor userInteractionEventDescriptor = this.$eventDescriptor;
            SnapshotState4<RequestPhoneCallViewState> snapshotState4 = this.$viewState$delegate;
            final SnapshotState<Boolean> snapshotState = this.$showEditBottomSheet$delegate;
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C39791R.string.request_phone_call_title, composer, 0), PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 0.0f, composer, 6, 2), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleMedium(), composer, 0, 0, 8188);
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C39791R.string.request_phone_call_subtitle, composer, 0), PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 0.0f, composer, 6, 2), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextM(), composer, 0, 0, 8188);
            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, UserInteractionEventData.Action.VIEW_EDIT_PHONE_NUMBER, null, null, null, 59, null), false, false, false, true, false, null, 110, null);
            String strStringResource = StringResources_androidKt.stringResource(C39791R.string.request_phone_call_row_title, composer, 0);
            String phoneNumber = RequestPhoneCallComposable.RequestPhoneCallComposable$lambda$0(snapshotState4).getPhoneNumber();
            BentoBaseRowState.Meta.CallToAction callToAction = new BentoBaseRowState.Meta.CallToAction(StringResources_androidKt.stringResource(C39791R.string.request_phone_call_row_cta_text, composer, 0), null, 2, null);
            composer.startReplaceGroup(5004770);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.shared.stepupverification.support.RequestPhoneCallComposableKt$RequestPhoneCallComposable$4$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RequestPhoneCallComposable.C399364.invoke$lambda$2$lambda$1$lambda$0(snapshotState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoBaseRowKt.m20916BentoBaseRowygcbOzY(modifierAutoLogEvents$default, null, strStringResource, phoneNumber, null, callToAction, null, false, false, false, 0L, (Function0) objRememberedValue, composer, BentoBaseRowState.Meta.CallToAction.$stable << 15, 48, 2002);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1$lambda$0(SnapshotState snapshotState) {
            RequestPhoneCallComposable.RequestPhoneCallComposable$lambda$3(snapshotState, true);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RequestPhoneCallViewState RequestPhoneCallComposable$lambda$0(SnapshotState4<RequestPhoneCallViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final boolean RequestPhoneCallComposable$lambda$2(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }
}
