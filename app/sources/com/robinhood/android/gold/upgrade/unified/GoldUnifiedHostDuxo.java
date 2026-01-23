package com.robinhood.android.gold.upgrade.unified;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.CardManager;
import com.robinhood.android.data.store.portfolio.TraderPortfolioStore;
import com.robinhood.android.gold.upgrade.unified.GoldUnifiedHostEvent;
import com.robinhood.android.gold.upgrade.unified.GoldUnifiedHostFragment;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.store.margin.MarginSubscriptionStore;
import com.robinhood.android.microgramsdui.MicrogramManager;
import com.robinhood.android.microgramsdui.SharedMicrogramRouterFragmentKey;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.lib.sweep.enrollment.SweepEnrollmentStore;
import com.robinhood.librobinhood.data.store.SweepsInterestStore;
import com.robinhood.librobinhood.data.store.identi.BaseSortingHatStore;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.moshi.LazyMoshi;
import gold_flow.proto.p466v1.GoldFlowScreen;
import gold_flow.proto.p466v1.GoldFlowService;
import gold_flow.proto.p466v1.OpenDeeplink;
import gold_flow.proto.p466v1.PresentRouterMetadata;
import gold_flow.proto.p466v1.PresentRouterMetadataDto;
import gold_flow.proto.p466v1.PresentationType;
import gold_flow.proto.p466v1.PushScreen;
import gold_flow.proto.p466v1.StreamRouterMessageRequestDto;
import gold_flow.proto.p466v1.StreamRouterMessageResponseDto;
import gold_flow.proto.p466v1.TransitionAnimation;
import java.util.Map;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MagicApiIntrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KType;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.modules.SerializersModule;

/* compiled from: GoldUnifiedHostDuxo.kt */
@Metadata(m3635d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 +2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001+Ba\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u001f\u001a\u00020\u0002H\u0016J\u0010\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\"H\u0016J\u0010\u0010#\u001a\u00020\u00022\u0006\u0010$\u001a\u00020%H\u0016J\u0010\u0010&\u001a\u00020\u00022\u0006\u0010'\u001a\u00020(H\u0002J\u0006\u0010)\u001a\u00020*R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/unified/GoldUnifiedHostDuxo;", "Lcom/robinhood/android/gold/upgrade/unified/GoldUnifiedBaseEventDuxo;", "", "Lcom/robinhood/android/gold/upgrade/unified/GoldUnifiedHostEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "microgramManager", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "cardManager", "Lcom/robinhood/android/common/util/CardManager;", "marginSubscriptionStore", "Lcom/robinhood/android/lib/store/margin/MarginSubscriptionStore;", "portfolioStore", "Lcom/robinhood/android/data/store/portfolio/TraderPortfolioStore;", "sortingHatStore", "Lcom/robinhood/librobinhood/data/store/identi/BaseSortingHatStore;", "sweepEnrollmentStore", "Lcom/robinhood/lib/sweep/enrollment/SweepEnrollmentStore;", "sweepsInterestStore", "Lcom/robinhood/librobinhood/data/store/SweepsInterestStore;", "<init>", "(Lcom/robinhood/android/microgramsdui/MicrogramManager;Lcom/robinhood/utils/moshi/LazyMoshi;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/android/common/util/CardManager;Lcom/robinhood/android/lib/store/margin/MarginSubscriptionStore;Lcom/robinhood/android/data/store/portfolio/TraderPortfolioStore;Lcom/robinhood/librobinhood/data/store/identi/BaseSortingHatStore;Lcom/robinhood/lib/sweep/enrollment/SweepEnrollmentStore;Lcom/robinhood/librobinhood/data/store/SweepsInterestStore;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "microgramLaunchUi", "fragmentKey", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "microgramLaunchDialog", "dialogFragmentKey", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "handleRouterMessage", "routerMessage", "Lgold_flow/proto/v1/StreamRouterMessageResponseDto$RouterMessageDto;", "onBackPressed", "", "Companion", "feature-gold-upgrade_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class GoldUnifiedHostDuxo extends GoldUnifiedBaseDuxo4<Unit, GoldUnifiedHostEvent> implements HasSavedState {
    private final AccountProvider accountProvider;
    private final CardManager cardManager;
    private final MarginSubscriptionStore marginSubscriptionStore;
    private final TraderPortfolioStore portfolioStore;
    private final SavedStateHandle savedStateHandle;
    private final BaseSortingHatStore sortingHatStore;
    private final SweepEnrollmentStore sweepEnrollmentStore;
    private final SweepsInterestStore sweepsInterestStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoldUnifiedHostDuxo(MicrogramManager microgramManager, LazyMoshi moshi, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle, AccountProvider accountProvider, CardManager cardManager, MarginSubscriptionStore marginSubscriptionStore, TraderPortfolioStore portfolioStore, BaseSortingHatStore sortingHatStore, SweepEnrollmentStore sweepEnrollmentStore, SweepsInterestStore sweepsInterestStore) {
        super(microgramManager, moshi, duxoBundle, Unit.INSTANCE);
        Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(cardManager, "cardManager");
        Intrinsics.checkNotNullParameter(marginSubscriptionStore, "marginSubscriptionStore");
        Intrinsics.checkNotNullParameter(portfolioStore, "portfolioStore");
        Intrinsics.checkNotNullParameter(sortingHatStore, "sortingHatStore");
        Intrinsics.checkNotNullParameter(sweepEnrollmentStore, "sweepEnrollmentStore");
        Intrinsics.checkNotNullParameter(sweepsInterestStore, "sweepsInterestStore");
        this.savedStateHandle = savedStateHandle;
        this.accountProvider = accountProvider;
        this.cardManager = cardManager;
        this.marginSubscriptionStore = marginSubscriptionStore;
        this.portfolioStore = portfolioStore;
        this.sortingHatStore = sortingHatStore;
        this.sweepEnrollmentStore = sweepEnrollmentStore;
        this.sweepsInterestStore = sweepsInterestStore;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.CREATED, new C181751(null));
    }

    /* compiled from: GoldUnifiedHostDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.gold.upgrade.unified.GoldUnifiedHostDuxo$onCreate$1", m3645f = "GoldUnifiedHostDuxo.kt", m3646l = {81}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.gold.upgrade.unified.GoldUnifiedHostDuxo$onCreate$1 */
    static final class C181751 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C181751(Continuation<? super C181751> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GoldUnifiedHostDuxo.this.new C181751(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C181751) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                GoldFlowService goldFlowService = GoldUnifiedHostDuxo.this.getGoldFlowService();
                Companion companion = GoldUnifiedHostDuxo.INSTANCE;
                final Flow<StreamRouterMessageResponseDto> flowStreamRouterMessage = goldFlowService.StreamRouterMessage(new StreamRouterMessageRequestDto(((GoldUnifiedHostFragment.Args) companion.getArgs((HasSavedState) GoldUnifiedHostDuxo.this)).getFeature(), null, ((GoldUnifiedHostFragment.Args) companion.getArgs((HasSavedState) GoldUnifiedHostDuxo.this)).getExitDeeplink(), ((GoldUnifiedHostFragment.Args) companion.getArgs((HasSavedState) GoldUnifiedHostDuxo.this)).getLoggingContext().getEntry_point_identifier(), null, ((GoldUnifiedHostFragment.Args) companion.getArgs((HasSavedState) GoldUnifiedHostDuxo.this)).getSageId(), 18, null));
                Flow flowM28818catch = FlowKt.m28818catch(FlowKt.filterNotNull(new Flow<StreamRouterMessageResponseDto.RouterMessageDto>() { // from class: com.robinhood.android.gold.upgrade.unified.GoldUnifiedHostDuxo$onCreate$1$invokeSuspend$$inlined$map$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.gold.upgrade.unified.GoldUnifiedHostDuxo$onCreate$1$invokeSuspend$$inlined$map$1$2 */
                    public static final class C181742<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.gold.upgrade.unified.GoldUnifiedHostDuxo$onCreate$1$invokeSuspend$$inlined$map$1$2", m3645f = "GoldUnifiedHostDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.gold.upgrade.unified.GoldUnifiedHostDuxo$onCreate$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return C181742.this.emit(null, this);
                            }
                        }

                        public C181742(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                StreamRouterMessageResponseDto.RouterMessageDto router_message = ((StreamRouterMessageResponseDto) obj).getRouter_message();
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(router_message, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super StreamRouterMessageResponseDto.RouterMessageDto> flowCollector, Continuation continuation) {
                        Object objCollect = flowStreamRouterMessage.collect(new C181742(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                }), new AnonymousClass2(GoldUnifiedHostDuxo.this, null));
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(GoldUnifiedHostDuxo.this);
                this.label = 1;
                if (flowM28818catch.collect(anonymousClass3, this) == coroutine_suspended) {
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

        /* compiled from: GoldUnifiedHostDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lgold_flow/proto/v1/StreamRouterMessageResponseDto$RouterMessageDto;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.gold.upgrade.unified.GoldUnifiedHostDuxo$onCreate$1$2", m3645f = "GoldUnifiedHostDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.gold.upgrade.unified.GoldUnifiedHostDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function3<FlowCollector<? super StreamRouterMessageResponseDto.RouterMessageDto>, Throwable, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ GoldUnifiedHostDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(GoldUnifiedHostDuxo goldUnifiedHostDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(3, continuation);
                this.this$0 = goldUnifiedHostDuxo;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(FlowCollector<? super StreamRouterMessageResponseDto.RouterMessageDto> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = th;
                return anonymousClass2.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, (Throwable) this.L$0, false, null, 4, null);
                this.this$0.submit(new GoldUnifiedHostEvent.PushScreen(GoldFlowScreen.ERROR, MapsKt.emptyMap(), PresentationType.REPLACE, TransitionAnimation.NONE, null, null, 48, null));
                return Unit.INSTANCE;
            }
        }

        /* compiled from: GoldUnifiedHostDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.gold.upgrade.unified.GoldUnifiedHostDuxo$onCreate$1$3, reason: invalid class name */
        /* synthetic */ class AnonymousClass3 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ GoldUnifiedHostDuxo $tmp0;

            AnonymousClass3(GoldUnifiedHostDuxo goldUnifiedHostDuxo) {
                this.$tmp0 = goldUnifiedHostDuxo;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, GoldUnifiedHostDuxo.class, "handleRouterMessage", "handleRouterMessage(Lgold_flow/proto/v1/StreamRouterMessageResponseDto$RouterMessageDto;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(StreamRouterMessageResponseDto.RouterMessageDto routerMessageDto, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$handleRouterMessage = C181751.invokeSuspend$handleRouterMessage(this.$tmp0, routerMessageDto, continuation);
                return objInvokeSuspend$handleRouterMessage == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$handleRouterMessage : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((StreamRouterMessageResponseDto.RouterMessageDto) obj, (Continuation<? super Unit>) continuation);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$handleRouterMessage(GoldUnifiedHostDuxo goldUnifiedHostDuxo, StreamRouterMessageResponseDto.RouterMessageDto routerMessageDto, Continuation continuation) {
            goldUnifiedHostDuxo.handleRouterMessage(routerMessageDto);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.gold.upgrade.unified.GoldUnifiedBaseDuxo4
    public void microgramLaunchUi(FragmentKey fragmentKey) {
        Map<String, String> metadata;
        String str;
        Intrinsics.checkNotNullParameter(fragmentKey, "fragmentKey");
        PresentRouterMetadata proto = null;
        SharedMicrogramRouterFragmentKey sharedMicrogramRouterFragmentKey = fragmentKey instanceof SharedMicrogramRouterFragmentKey ? (SharedMicrogramRouterFragmentKey) fragmentKey : null;
        if (sharedMicrogramRouterFragmentKey != null && (metadata = sharedMicrogramRouterFragmentKey.getMetadata()) != null && (str = metadata.get("present_router_metadata")) != null) {
            try {
                Json.Companion companion = Json.INSTANCE;
                SerializersModule serializersModule = companion.getSerializersModule();
                KType kTypeTypeOf = Reflection.typeOf(PresentRouterMetadataDto.class);
                MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
                proto = ((PresentRouterMetadataDto) companion.decodeFromString(SerializersKt.serializer(serializersModule, kTypeTypeOf), str)).toProto();
            } catch (Exception unused) {
            }
        }
        submit(new GoldUnifiedHostEvent.PresentRouter(fragmentKey, proto));
    }

    @Override // com.robinhood.android.gold.upgrade.unified.GoldUnifiedBaseDuxo4
    public void microgramLaunchDialog(DialogFragmentKey dialogFragmentKey) {
        Intrinsics.checkNotNullParameter(dialogFragmentKey, "dialogFragmentKey");
        submit(new GoldUnifiedHostEvent.PresentDialog(dialogFragmentKey));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleRouterMessage(StreamRouterMessageResponseDto.RouterMessageDto routerMessage) {
        if (routerMessage instanceof StreamRouterMessageResponseDto.RouterMessageDto.PushScreen) {
            PushScreen proto = ((StreamRouterMessageResponseDto.RouterMessageDto.PushScreen) routerMessage).getValue().toProto();
            submit(new GoldUnifiedHostEvent.PushScreen(proto.getScreen(), proto.getGeneric_args(), proto.getPresentation_type(), proto.getTransition_animation(), proto.getCustom_back_action(), proto.getDismiss_on_custom_back_action()));
            Unit unit = Unit.INSTANCE;
            return;
        }
        if (routerMessage instanceof StreamRouterMessageResponseDto.RouterMessageDto.OpenDeeplink) {
            OpenDeeplink proto2 = ((StreamRouterMessageResponseDto.RouterMessageDto.OpenDeeplink) routerMessage).getValue().toProto();
            submit(new GoldUnifiedHostEvent.OpenDeeplink(proto2.getDeeplink_uri(), proto2.getPresentation_type(), proto2.getGeneric_args()));
            Unit unit2 = Unit.INSTANCE;
            return;
        }
        if (routerMessage instanceof StreamRouterMessageResponseDto.RouterMessageDto.DismissScreen) {
            submit(GoldUnifiedHostEvent.DismissScreen.INSTANCE);
            Unit unit3 = Unit.INSTANCE;
            return;
        }
        if (routerMessage instanceof StreamRouterMessageResponseDto.RouterMessageDto.DismissAll) {
            submit(new GoldUnifiedHostEvent.DismissAll(((StreamRouterMessageResponseDto.RouterMessageDto.DismissAll) routerMessage).getValue().is_success()));
            Unit unit4 = Unit.INSTANCE;
            return;
        }
        if (routerMessage instanceof StreamRouterMessageResponseDto.RouterMessageDto.OnSubscribe) {
            this.accountProvider.refresh(true);
            this.portfolioStore.refreshIndividualAccountPortfolio(true);
            this.marginSubscriptionStore.refreshCurrentMarginSubscription(true);
            this.sortingHatStore.invalidateSortingHatCacheIfNeeded();
            this.cardManager.invalidateCardsBestEffort();
            SweepEnrollmentStore.refreshSweepSplash$default(this.sweepEnrollmentStore, null, true, 1, null);
            this.sweepsInterestStore.refreshNoAccountNumber(true);
            return;
        }
        if (!(routerMessage instanceof StreamRouterMessageResponseDto.RouterMessageDto.OnComplete)) {
            throw new NoWhenBranchMatchedException();
        }
        new GoldUnifiedHostEvent.DismissAll(true);
    }

    public final boolean onBackPressed() {
        submit(GoldUnifiedHostEvent.DismissScreen.INSTANCE);
        return true;
    }

    /* compiled from: GoldUnifiedHostDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/unified/GoldUnifiedHostDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/gold/upgrade/unified/GoldUnifiedHostDuxo;", "Lcom/robinhood/android/gold/upgrade/unified/GoldUnifiedHostFragment$Args;", "<init>", "()V", "feature-gold-upgrade_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<GoldUnifiedHostDuxo, GoldUnifiedHostFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public GoldUnifiedHostFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (GoldUnifiedHostFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public GoldUnifiedHostFragment.Args getArgs(GoldUnifiedHostDuxo goldUnifiedHostDuxo) {
            return (GoldUnifiedHostFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, goldUnifiedHostDuxo);
        }
    }
}
