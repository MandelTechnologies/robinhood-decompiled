package com.robinhood.android.matcha.p177ui.p178qr;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.matcha.p177ui.p178qr.MatchaQrCodeEvent;
import com.robinhood.android.matcha.p177ui.p178qr.menu.QrCodeMenuBottomSheet;
import com.robinhood.android.models.matcha.api.MatchaTransactionType;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.social.contracts.matcha.MatchaProfile;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.utils.extensions.Files;
import com.robinhood.utils.math.BigDecimals7;
import java.io.File;
import java.math.BigDecimal;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: MatchaQrCodeFragment.kt */
@Metadata(m3635d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\b\u0007\u0018\u0000 82\u00020\u00012\u00020\u00022\u00020\u0003:\u00018B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0016J\u0012\u0010'\u001a\u00020$2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\u001a\u0010*\u001a\u00020$2\u0006\u0010+\u001a\u00020,2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\r\u0010-\u001a\u00020$H\u0017¢\u0006\u0002\u0010.J\b\u0010/\u001a\u00020$H\u0016J\b\u00100\u001a\u00020$H\u0016J\u001a\u00101\u001a\u00020$2\u0006\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u000105H\u0002J\u0012\u00106\u001a\u00020$2\b\u00107\u001a\u0004\u0018\u000103H\u0002R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\rX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u00069²\u0006\n\u0010:\u001a\u00020;X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/qr/MatchaQrCodeFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "Lcom/robinhood/android/matcha/ui/qr/menu/QrCodeMenuBottomSheet$Callbacks;", "<init>", "()V", "duxo", "Lcom/robinhood/android/matcha/ui/qr/MatchaQrCodeDuxo;", "getDuxo", "()Lcom/robinhood/android/matcha/ui/qr/MatchaQrCodeDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "initialIndex", "", "getInitialIndex", "()I", "initialIndex$delegate", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenEventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "getScreenEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onShareClick", "onPrintClick", "handleScannedData", "userId", "", "amount", "Ljava/math/BigDecimal;", "shareLink", "qrContent", "Companion", "feature-p2p_externalDebug", "state", "Lcom/robinhood/android/matcha/ui/qr/MatchaQrCodeViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class MatchaQrCodeFragment extends GenericComposeFragment implements AutoLoggableFragment, QrCodeMenuBottomSheet.Callbacks {
    public EventLogger eventLogger;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, MatchaQrCodeDuxo.class);
    private final boolean useDesignSystemToolbar = true;

    /* renamed from: initialIndex$delegate, reason: from kotlin metadata */
    private final Lazy initialIndex = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.matcha.ui.qr.MatchaQrCodeFragment$$ExternalSyntheticLambda4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(MatchaQrCodeFragment.initialIndex_delegate$lambda$0(this.f$0));
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$10(MatchaQrCodeFragment matchaQrCodeFragment, int i, Composer composer, int i2) {
        matchaQrCodeFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenAppearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenDisappearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenSourceEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenSourceEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Component getScreenEventComponent() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventComponent(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MatchaQrCodeDuxo getDuxo() {
        return (MatchaQrCodeDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    private final int getInitialIndex() {
        return ((Number) this.initialIndex.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int initialIndex_delegate$lambda$0(MatchaQrCodeFragment matchaQrCodeFragment) {
        LegacyFragmentKey.MatchaQrCode matchaQrCode = (LegacyFragmentKey.MatchaQrCode) INSTANCE.getArgs((Fragment) matchaQrCodeFragment);
        if (Intrinsics.areEqual(matchaQrCode, LegacyFragmentKey.MatchaQrCode.Scan.INSTANCE)) {
            return 1;
        }
        if (Intrinsics.areEqual(matchaQrCode, LegacyFragmentKey.MatchaQrCode.View.INSTANCE)) {
            return 0;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final EventLogger getEventLogger() {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            return eventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<set-?>");
        this.eventLogger = eventLogger;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        Screen.Name name;
        LegacyFragmentKey.MatchaQrCode matchaQrCode = (LegacyFragmentKey.MatchaQrCode) INSTANCE.getArgs((Fragment) this);
        if (Intrinsics.areEqual(matchaQrCode, LegacyFragmentKey.MatchaQrCode.Scan.INSTANCE)) {
            name = Screen.Name.P2P_SCAN_QR_CODE;
        } else {
            if (!Intrinsics.areEqual(matchaQrCode, LegacyFragmentKey.MatchaQrCode.View.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            name = Screen.Name.P2P_VIEW_QR_CODE;
        }
        return new Screen(name, null, null, null, 14, null);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Context getScreenEventContext() {
        return new Context(0, 0, 0, null, null, null, null, Context.ProductTag.PEER_TO_PEER, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -129, -1, -1, -1, -1, -1, 16383, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        requireBaseActivity().hideToolbar();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ScarletManager.putOverlay$default(getScarletManager(), AchromaticOverlay.INSTANCE, null, 2, null);
    }

    /* compiled from: MatchaQrCodeFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.qr.MatchaQrCodeFragment$onViewCreated$1", m3645f = "MatchaQrCodeFragment.kt", m3646l = {76}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.matcha.ui.qr.MatchaQrCodeFragment$onViewCreated$1 */
    static final class C214231 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C214231(Continuation<? super C214231> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MatchaQrCodeFragment.this.new C214231(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C214231) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(MatchaQrCodeFragment.this.getDuxo().getEventFlow());
                final MatchaQrCodeFragment matchaQrCodeFragment = MatchaQrCodeFragment.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.matcha.ui.qr.MatchaQrCodeFragment.onViewCreated.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Event<MatchaQrCodeEvent>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(final Event<MatchaQrCodeEvent> event, Continuation<? super Unit> continuation) {
                        EventConsumer<MatchaQrCodeEvent> eventConsumerInvoke;
                        EventConsumer<MatchaQrCodeEvent> eventConsumerInvoke2;
                        final MatchaQrCodeFragment matchaQrCodeFragment2 = matchaQrCodeFragment;
                        if ((event.getData() instanceof MatchaQrCodeEvent.OpenPdf) && (eventConsumerInvoke2 = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke2.consume(event, new Function1() { // from class: com.robinhood.android.matcha.ui.qr.MatchaQrCodeFragment$onViewCreated$1$1$emit$$inlined$consumeIfType$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m16383invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m16383invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    File pdfFile = ((MatchaQrCodeEvent.OpenPdf) event.getData()).getPdfFile();
                                    android.content.Context contextRequireContext = matchaQrCodeFragment2.requireContext();
                                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                                    Intent openIntent = Files.getOpenIntent(pdfFile, contextRequireContext, "application/pdf", "matcha_fileprovider");
                                    if (openIntent != null) {
                                        matchaQrCodeFragment2.startActivity(openIntent);
                                    }
                                }
                            });
                        }
                        final MatchaQrCodeFragment matchaQrCodeFragment3 = matchaQrCodeFragment;
                        if ((event.getData() instanceof MatchaQrCodeEvent.Error) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.matcha.ui.qr.MatchaQrCodeFragment$onViewCreated$1$1$emit$$inlined$consumeIfType$2
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m16384invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m16384invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    AbsErrorHandler.handleError$default(matchaQrCodeFragment3.getActivityErrorHandler(), ((MatchaQrCodeEvent.Error) event.getData()).getThrowable(), false, 2, null);
                                }
                            });
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowFilterNotNull.collect(flowCollector, this) == coroutine_suspended) {
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

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C214231(null), 1, null);
    }

    private static final MatchaQrCodeViewState ComposeContent$lambda$1(SnapshotState4<MatchaQrCodeViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(693616434);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(693616434, i2, -1, "com.robinhood.android.matcha.ui.qr.MatchaQrCodeFragment.ComposeContent (MatchaQrCodeFragment.kt:92)");
            }
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            User user = ComposeContent$lambda$1(snapshotState4CollectAsStateWithLifecycle).getUser();
            Bitmap qrCodeBitmap = ComposeContent$lambda$1(snapshotState4CollectAsStateWithLifecycle).getQrCodeBitmap();
            boolean zIsDiscoverabilityEnabled = ComposeContent$lambda$1(snapshotState4CollectAsStateWithLifecycle).isDiscoverabilityEnabled();
            int initialIndex = getInitialIndex();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new MatchaQrCodeFragment2(this);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            KFunction kFunction = (KFunction) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(fragmentActivityRequireActivity);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new MatchaQrCodeFragment3(fragmentActivityRequireActivity);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            KFunction kFunction2 = (KFunction) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.robinhood.android.matcha.ui.qr.MatchaQrCodeFragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MatchaQrCodeFragment.ComposeContent$lambda$5$lambda$4(this.f$0, (UserInteractionEventData.Action) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Function1 function1 = (Function1) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            Function2 function2 = (Function2) kFunction;
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new Function0() { // from class: com.robinhood.android.matcha.ui.qr.MatchaQrCodeFragment$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MatchaQrCodeFragment.ComposeContent$lambda$7$lambda$6(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            Function0 function0 = (Function0) objRememberedValue4;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance5 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = new Function0() { // from class: com.robinhood.android.matcha.ui.qr.MatchaQrCodeFragment$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MatchaQrCodeFragment.ComposeContent$lambda$9$lambda$8(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            composerStartRestartGroup.endReplaceGroup();
            MatchaQrComposable.QrCodeSegmentedScreen(user, qrCodeBitmap, zIsDiscoverabilityEnabled, initialIndex, function1, function2, function0, (Function0) objRememberedValue5, (Function0) kFunction2, composerStartRestartGroup, 0);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.matcha.ui.qr.MatchaQrCodeFragment$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MatchaQrCodeFragment.ComposeContent$lambda$10(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$5$lambda$4(MatchaQrCodeFragment matchaQrCodeFragment, UserInteractionEventData.Action it) {
        Intrinsics.checkNotNullParameter(it, "it");
        EventLogger.DefaultImpls.logTap$default(matchaQrCodeFragment.getEventLogger(), it, matchaQrCodeFragment.getEventScreen(), new Component(Component.ComponentType.TAB, null, null, 6, null), null, matchaQrCodeFragment.getScreenEventContext(), false, 40, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$7$lambda$6(MatchaQrCodeFragment matchaQrCodeFragment) {
        QrCodeMenuBottomSheet qrCodeMenuBottomSheet = new QrCodeMenuBottomSheet();
        FragmentManager childFragmentManager = matchaQrCodeFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        qrCodeMenuBottomSheet.show(childFragmentManager, "qr-menu");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$9$lambda$8(MatchaQrCodeFragment matchaQrCodeFragment) {
        Navigator navigator = matchaQrCodeFragment.getNavigator();
        android.content.Context contextRequireContext = matchaQrCodeFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, contextRequireContext, new LegacyFragmentKey.ProfileVisibility(false, 1, null), false, false, false, false, null, false, null, null, 1020, null);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.matcha.ui.qr.menu.QrCodeMenuBottomSheet.Callbacks
    public void onShareClick() {
        shareLink(getDuxo().getStateFlow().getValue().getQrContent());
    }

    @Override // com.robinhood.android.matcha.ui.qr.menu.QrCodeMenuBottomSheet.Callbacks
    public void onPrintClick() {
        getDuxo().requestQrCodePdf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleScannedData(String userId, BigDecimal amount) {
        if (amount != null) {
            Navigator navigator = getNavigator();
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            startActivity(Navigator.DefaultImpls.createIntent$default(navigator, contextRequireContext, new LegacyIntentKey.MatchaTransferFromDeepLink(userId, BigDecimals7.toBigDecimal(amount), MatchaTransactionType.MATCHA_TRANSFER), null, false, 12, null));
            return;
        }
        Navigator navigator2 = getNavigator();
        android.content.Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
        Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator2, contextRequireContext2, new MatchaProfile(userId, null, false, 6, null), false, false, false, false, null, false, null, null, 1020, null);
    }

    private final void shareLink(String qrContent) {
        EventLogger.DefaultImpls.logTap$default(getEventLogger(), UserInteractionEventData.Action.SHARE, getEventScreen(), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, getScreenEventContext(), false, 40, null);
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", qrContent);
        intent.setType("text/plain");
        startActivity(Intent.createChooser(intent, null));
    }

    /* compiled from: MatchaQrCodeFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/qr/MatchaQrCodeFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/matcha/ui/qr/MatchaQrCodeFragment;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$MatchaQrCode;", "<init>", "()V", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<MatchaQrCodeFragment, LegacyFragmentKey.MatchaQrCode> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.MatchaQrCode matchaQrCode) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, matchaQrCode);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyFragmentKey.MatchaQrCode getArgs(MatchaQrCodeFragment matchaQrCodeFragment) {
            return (LegacyFragmentKey.MatchaQrCode) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, matchaQrCodeFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public MatchaQrCodeFragment newInstance(LegacyFragmentKey.MatchaQrCode matchaQrCode) {
            return (MatchaQrCodeFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, matchaQrCode);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(MatchaQrCodeFragment matchaQrCodeFragment, LegacyFragmentKey.MatchaQrCode matchaQrCode) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, matchaQrCodeFragment, matchaQrCode);
        }
    }
}
