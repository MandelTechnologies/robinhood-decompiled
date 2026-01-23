package com.robinhood.android.portfolio.pnl;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.equities.contracts.PnlHubContract;
import com.robinhood.android.indexes.contracts.IndexDetailPageFragmentKey;
import com.robinhood.android.indexes.contracts.IndexDetailPageFragmentKey2;
import com.robinhood.android.models.portfolio.api.AssetClass;
import com.robinhood.android.navigation.DialogFragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.app.keys.data.InstrumentDetailSource;
import com.robinhood.android.portfolio.contracts.PnlTradeDetailDialogFragmentKey;
import com.robinhood.android.portfolio.pnl.PnlTradeDetailDialogFragment;
import com.robinhood.android.portfolio.pnl.composable.PnlTradeDetailBottomSheetState;
import com.robinhood.android.portfolio.pnl.composable.PnlTradeDetailComposable2;
import com.robinhood.android.portfolio.pnl.p214db.ProfitAndLossOrderDetails;
import com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.CryptoExperimentsStore;
import com.robinhood.shared.crypto.contracts.detail.CryptoDetailFragmentKey;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: PnlTradeDetailDialogFragment.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\r\u0010\u0017\u001a\u00020\u0014H\u0017¢\u0006\u0002\u0010\u0018R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR/\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnl/PnlTradeDetailDialogFragment;", "Lcom/robinhood/compose/app/GenericComposeBottomSheetDialogFragment;", "<init>", "()V", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "getCryptoExperimentsStore", "()Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "setCryptoExperimentsStore", "(Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;)V", "<set-?>", "Lcom/robinhood/android/portfolio/pnl/composable/PnlTradeDetailBottomSheetState;", "state", "getState", "()Lcom/robinhood/android/portfolio/pnl/composable/PnlTradeDetailBottomSheetState;", "setState", "(Lcom/robinhood/android/portfolio/pnl/composable/PnlTradeDetailBottomSheetState;)V", "state$delegate", "Landroidx/compose/runtime/MutableState;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "Companion", "lib-profit-and-loss_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class PnlTradeDetailDialogFragment extends GenericComposeBottomSheetDialogFragment {
    public CryptoExperimentsStore cryptoExperimentsStore;

    /* renamed from: state$delegate, reason: from kotlin metadata */
    private final SnapshotState state = SnapshotState3.mutableStateOf$default(null, null, 2, null);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(PnlTradeDetailDialogFragment pnlTradeDetailDialogFragment, int i, Composer composer, int i2) {
        pnlTradeDetailDialogFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(PnlTradeDetailDialogFragment pnlTradeDetailDialogFragment, int i, Composer composer, int i2) {
        pnlTradeDetailDialogFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public final CryptoExperimentsStore getCryptoExperimentsStore() {
        CryptoExperimentsStore cryptoExperimentsStore = this.cryptoExperimentsStore;
        if (cryptoExperimentsStore != null) {
            return cryptoExperimentsStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("cryptoExperimentsStore");
        return null;
    }

    public final void setCryptoExperimentsStore(CryptoExperimentsStore cryptoExperimentsStore) {
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "<set-?>");
        this.cryptoExperimentsStore = cryptoExperimentsStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final PnlTradeDetailBottomSheetState getState() {
        return (PnlTradeDetailBottomSheetState) this.state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setState(PnlTradeDetailBottomSheetState pnlTradeDetailBottomSheetState) {
        this.state.setValue(pnlTradeDetailBottomSheetState);
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Companion companion = INSTANCE;
        setState(new PnlTradeDetailBottomSheetState(((PnlTradeDetailDialogFragmentKey) companion.getArgs((Fragment) this)).getItem(), false, ((PnlTradeDetailDialogFragmentKey) companion.getArgs((Fragment) this)).getPnlUpdatesEnabled()));
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C256681(null));
    }

    /* compiled from: PnlTradeDetailDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnl.PnlTradeDetailDialogFragment$onCreate$1", m3645f = "PnlTradeDetailDialogFragment.kt", m3646l = {51}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.portfolio.pnl.PnlTradeDetailDialogFragment$onCreate$1 */
    static final class C256681 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C256681(Continuation<? super C256681> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PnlTradeDetailDialogFragment.this.new C256681(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C256681) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Boolean> flowStreamCryptoUsCostBasisExperiment = PnlTradeDetailDialogFragment.this.getCryptoExperimentsStore().streamCryptoUsCostBasisExperiment();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(PnlTradeDetailDialogFragment.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamCryptoUsCostBasisExperiment, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: PnlTradeDetailDialogFragment.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnl.PnlTradeDetailDialogFragment$onCreate$1$1", m3645f = "PnlTradeDetailDialogFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.portfolio.pnl.PnlTradeDetailDialogFragment$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ PnlTradeDetailDialogFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(PnlTradeDetailDialogFragment pnlTradeDetailDialogFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = pnlTradeDetailDialogFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                boolean z = this.Z$0;
                PnlTradeDetailDialogFragment pnlTradeDetailDialogFragment = this.this$0;
                PnlTradeDetailBottomSheetState state = pnlTradeDetailDialogFragment.getState();
                pnlTradeDetailDialogFragment.setState(state != null ? PnlTradeDetailBottomSheetState.copy$default(state, null, z, false, 5, null) : null);
                return Unit.INSTANCE;
            }
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(196939465);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(196939465, i2, -1, "com.robinhood.android.portfolio.pnl.PnlTradeDetailDialogFragment.ComposeContent (PnlTradeDetailDialogFragment.kt:56)");
            }
            PnlTradeDetailBottomSheetState state = getState();
            if (state == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.portfolio.pnl.PnlTradeDetailDialogFragment$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return PnlTradeDetailDialogFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, ((PnlTradeDetailDialogFragmentKey) INSTANCE.getArgs((Fragment) this)).getScreen(), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(-791420738, true, new C256671(state, this), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.portfolio.pnl.PnlTradeDetailDialogFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PnlTradeDetailDialogFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: PnlTradeDetailDialogFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.portfolio.pnl.PnlTradeDetailDialogFragment$ComposeContent$1 */
    static final class C256671 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ PnlTradeDetailBottomSheetState $state;
        final /* synthetic */ PnlTradeDetailDialogFragment this$0;

        /* compiled from: PnlTradeDetailDialogFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.portfolio.pnl.PnlTradeDetailDialogFragment$ComposeContent$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[ProfitAndLossOrderDetails.Instrument.Type.values().length];
                try {
                    iArr[ProfitAndLossOrderDetails.Instrument.Type.EQUITY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ProfitAndLossOrderDetails.Instrument.Type.INDEX.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ProfitAndLossOrderDetails.Instrument.Type.CRYPTO.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[AssetClass.values().length];
                try {
                    iArr2[AssetClass.EQUITY.ordinal()] = 1;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr2[AssetClass.OPTION.ordinal()] = 2;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[AssetClass.FOREX.ordinal()] = 3;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr2[AssetClass.CRYPTO.ordinal()] = 4;
                } catch (NoSuchFieldError unused7) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        C256671(PnlTradeDetailBottomSheetState pnlTradeDetailBottomSheetState, PnlTradeDetailDialogFragment pnlTradeDetailDialogFragment) {
            this.$state = pnlTradeDetailBottomSheetState;
            this.this$0 = pnlTradeDetailDialogFragment;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            Function0 function0;
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-791420738, i, -1, "com.robinhood.android.portfolio.pnl.PnlTradeDetailDialogFragment.ComposeContent.<anonymous> (PnlTradeDetailDialogFragment.kt:63)");
            }
            PnlTradeDetailBottomSheetState pnlTradeDetailBottomSheetState = this.$state;
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(this.this$0);
            final PnlTradeDetailDialogFragment pnlTradeDetailDialogFragment = this.this$0;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.portfolio.pnl.PnlTradeDetailDialogFragment$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PnlTradeDetailDialogFragment.C256671.invoke$lambda$1$lambda$0(pnlTradeDetailDialogFragment);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function02 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-346110112);
            Companion companion = PnlTradeDetailDialogFragment.INSTANCE;
            Function0 function03 = null;
            if (((PnlTradeDetailDialogFragmentKey) companion.getArgs((Fragment) this.this$0)).getShowSdpButton()) {
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance2 = composer.changedInstance(this.this$0);
                final PnlTradeDetailDialogFragment pnlTradeDetailDialogFragment2 = this.this$0;
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.portfolio.pnl.PnlTradeDetailDialogFragment$ComposeContent$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PnlTradeDetailDialogFragment.C256671.invoke$lambda$3$lambda$2(pnlTradeDetailDialogFragment2);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                function0 = (Function0) objRememberedValue2;
                composer.endReplaceGroup();
            } else {
                function0 = null;
            }
            composer.endReplaceGroup();
            composer.startReplaceGroup(-346053468);
            if (((PnlTradeDetailDialogFragmentKey) companion.getArgs((Fragment) this.this$0)).getShowPnlHubButton()) {
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance3 = composer.changedInstance(this.this$0);
                final PnlTradeDetailDialogFragment pnlTradeDetailDialogFragment3 = this.this$0;
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.portfolio.pnl.PnlTradeDetailDialogFragment$ComposeContent$1$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PnlTradeDetailDialogFragment.C256671.invoke$lambda$5$lambda$4(pnlTradeDetailDialogFragment3);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                function03 = (Function0) objRememberedValue3;
                composer.endReplaceGroup();
            }
            composer.endReplaceGroup();
            PnlTradeDetailComposable2.PnlTradeDetailBottomSheet(pnlTradeDetailBottomSheetState, function02, null, function0, function03, composer, 0, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(PnlTradeDetailDialogFragment pnlTradeDetailDialogFragment) {
            pnlTradeDetailDialogFragment.dismiss();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(PnlTradeDetailDialogFragment pnlTradeDetailDialogFragment) {
            Companion companion = PnlTradeDetailDialogFragment.INSTANCE;
            ProfitAndLossOrderDetails orderDetails = ((PnlTradeDetailDialogFragmentKey) companion.getArgs((Fragment) pnlTradeDetailDialogFragment)).getItem().getOrderDetails();
            ProfitAndLossOrderDetails.Instrument instrumentToView = orderDetails != null ? orderDetails.getInstrumentToView() : null;
            ProfitAndLossOrderDetails.Instrument.Type type2 = instrumentToView != null ? instrumentToView.getType() : null;
            int i = type2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type2.ordinal()];
            if (i != -1) {
                if (i == 1) {
                    ProfitAndLossOrderDetails.Instrument instrument = instrumentToView;
                    Navigator navigator = pnlTradeDetailDialogFragment.getNavigator();
                    Context contextRequireContext = pnlTradeDetailDialogFragment.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                    Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new LegacyFragmentKey.EquityInstrumentDetail(instrument.getId(), null, ((PnlTradeDetailDialogFragmentKey) companion.getArgs((Fragment) pnlTradeDetailDialogFragment)).getAccountNumber(), InstrumentDetailSource.ASSET_HOME, false, 18, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
                } else if (i == 2) {
                    Navigator navigator2 = pnlTradeDetailDialogFragment.getNavigator();
                    ProfitAndLossOrderDetails.Instrument instrument2 = instrumentToView;
                    Context contextRequireContext2 = pnlTradeDetailDialogFragment.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                    Navigator.DefaultImpls.showFragment$default(navigator2, contextRequireContext2, new IndexDetailPageFragmentKey(instrument2.getId(), ((PnlTradeDetailDialogFragmentKey) companion.getArgs((Fragment) pnlTradeDetailDialogFragment)).getAccountNumber(), IndexDetailPageFragmentKey2.ProfitLossHub.INSTANCE), false, false, false, null, false, null, false, false, null, null, 4092, null);
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Navigator navigator3 = pnlTradeDetailDialogFragment.getNavigator();
                    Context contextRequireContext3 = pnlTradeDetailDialogFragment.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "requireContext(...)");
                    Navigator.DefaultImpls.showFragment$default(navigator3, contextRequireContext3, new CryptoDetailFragmentKey(instrumentToView.getId(), null, false, null, null, null, 62, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4(PnlTradeDetailDialogFragment pnlTradeDetailDialogFragment) {
            String str;
            pnlTradeDetailDialogFragment.dismiss();
            Navigator navigator = pnlTradeDetailDialogFragment.getNavigator();
            Context contextRequireContext = pnlTradeDetailDialogFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Companion companion = PnlTradeDetailDialogFragment.INSTANCE;
            int i = WhenMappings.$EnumSwitchMapping$1[((PnlTradeDetailDialogFragmentKey) companion.getArgs((Fragment) pnlTradeDetailDialogFragment)).getItem().getAssetClass().ordinal()];
            if (i == 1) {
                str = "equity_order_detail";
            } else if (i == 2) {
                str = "option_order_detail";
            } else if (i == 3 || i == 4) {
                str = "crypto_order_detail";
            } else {
                str = "unknown";
            }
            String str2 = str;
            Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new PnlHubContract.Key.AccountNumberKey(((PnlTradeDetailDialogFragmentKey) companion.getArgs((Fragment) pnlTradeDetailDialogFragment)).getAccountNumber(), str2, CollectionsKt.listOf(((PnlTradeDetailDialogFragmentKey) companion.getArgs((Fragment) pnlTradeDetailDialogFragment)).getItem().getAssetClass()), null, 8, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: PnlTradeDetailDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnl/PnlTradeDetailDialogFragment$Companion;", "Lcom/robinhood/android/navigation/DialogFragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/portfolio/pnl/PnlTradeDetailDialogFragment;", "Lcom/robinhood/android/portfolio/contracts/PnlTradeDetailDialogFragmentKey;", "<init>", "()V", "lib-profit-and-loss_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DialogFragmentResolverWithArgsCompanion<PnlTradeDetailDialogFragment, PnlTradeDetailDialogFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.DialogFragmentResolverWithArgsCompanion, com.robinhood.android.navigation.DialogFragmentResolver
        public PnlTradeDetailDialogFragment createDialogFragment(PnlTradeDetailDialogFragmentKey pnlTradeDetailDialogFragmentKey) {
            return (PnlTradeDetailDialogFragment) DialogFragmentResolverWithArgsCompanion.DefaultImpls.createDialogFragment(this, pnlTradeDetailDialogFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public PnlTradeDetailDialogFragmentKey getArgs(PnlTradeDetailDialogFragment pnlTradeDetailDialogFragment) {
            return (PnlTradeDetailDialogFragmentKey) DialogFragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, pnlTradeDetailDialogFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public PnlTradeDetailDialogFragment newInstance(PnlTradeDetailDialogFragmentKey pnlTradeDetailDialogFragmentKey) {
            return (PnlTradeDetailDialogFragment) DialogFragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, pnlTradeDetailDialogFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(PnlTradeDetailDialogFragment pnlTradeDetailDialogFragment, PnlTradeDetailDialogFragmentKey pnlTradeDetailDialogFragmentKey) {
            DialogFragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, pnlTradeDetailDialogFragment, pnlTradeDetailDialogFragmentKey);
        }
    }
}
