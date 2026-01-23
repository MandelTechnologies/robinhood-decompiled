package com.robinhood.android.advisory.portfolio.update;

import advisory.update_investor_profile.proto.p009v1.AdvisoryUpdateInvestorProfileAllocationService;
import advisory.update_investor_profile.proto.p009v1.GetAllocationFlowRequestDto;
import advisory.update_investor_profile.proto.p009v1.GetAllocationFlowResponse;
import advisory.update_investor_profile.proto.p009v1.GetAllocationFlowResponseDto;
import advisory.update_investor_profile.proto.p009v1.GetNavigationFlowRequestDto;
import advisory.update_investor_profile.proto.p009v1.GetNavigationFlowResponseDto;
import advisory.update_investor_profile.proto.p009v1.UpdateInvestorProfileAllocationBreakdown;
import advisory.update_investor_profile.proto.p009v1.UpdateInvestorProfilePage;
import android.content.Context;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.advisory.contracts.AdvisoryUpdatePortfolioFragmentKey;
import com.robinhood.android.advisory.portfolio.update.UpdateInvestorProfileEvent;
import com.robinhood.android.advisory.portfolio.update.donut.UpdateInvestorProfileDonutData;
import com.robinhood.android.microgramsdui.MicrogramManager;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.shared.common.microgramdeeplinklaunch.RealMicrogramDeeplinkService;
import com.robinhood.shared.common.microgramuilaunch.RealMicrogramUiLaunchService2;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.moshi.LazyMoshi;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import microgram.android.RemoteMicrogramApplication;
import microgram.android.inject.MicrogramComponent;

/* compiled from: UpdateInvestorProfileDuxo.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 $2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001$BC\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\"\u001a\u00020#H\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u001f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/advisory/portfolio/update/UpdateInvestorProfileDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/advisory/portfolio/update/UpdateInvestorProfileDataState;", "Lcom/robinhood/android/advisory/portfolio/update/UpdateInvestorProfileViewState;", "Lcom/robinhood/android/advisory/portfolio/update/UpdateInvestorProfileEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "microgramManager", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/advisory/portfolio/update/UpdateInvestorProfileStateProvider;", "context", "Landroid/content/Context;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/microgramsdui/MicrogramManager;Lcom/robinhood/utils/moshi/LazyMoshi;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/advisory/portfolio/update/UpdateInvestorProfileStateProvider;Landroid/content/Context;Lcom/robinhood/android/navigation/Navigator;Landroidx/lifecycle/SavedStateHandle;)V", "getMoshi", "()Lcom/robinhood/utils/moshi/LazyMoshi;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "component", "Lmicrogram/android/inject/MicrogramComponent;", "getComponent", "()Lmicrogram/android/inject/MicrogramComponent;", "advisoryUpdateInvestorProfileAllocationService", "Ladvisory/update_investor_profile/proto/v1/AdvisoryUpdateInvestorProfileAllocationService;", "getAdvisoryUpdateInvestorProfileAllocationService", "()Ladvisory/update_investor_profile/proto/v1/AdvisoryUpdateInvestorProfileAllocationService;", "onStart", "", "Companion", "feature-advisory-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class UpdateInvestorProfileDuxo extends BaseDuxo3<UpdateInvestorProfileDataState, UpdateInvestorProfileViewState, UpdateInvestorProfileEvent> implements HasSavedState {
    private final AdvisoryUpdateInvestorProfileAllocationService advisoryUpdateInvestorProfileAllocationService;
    private final MicrogramComponent component;
    private final Context context;
    private final LazyMoshi moshi;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public final LazyMoshi getMoshi() {
        return this.moshi;
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public UpdateInvestorProfileDuxo(MicrogramManager microgramManager, LazyMoshi moshi, DuxoBundle duxoBundle, UpdateInvestorProfileStateProvider stateProvider, Context context, Navigator navigator, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Companion companion = INSTANCE;
        super(new UpdateInvestorProfileDataState(false, ((AdvisoryUpdatePortfolioFragmentKey) companion.getArgs(savedStateHandle)).getAccountNumber(), ((AdvisoryUpdatePortfolioFragmentKey) companion.getArgs(savedStateHandle)).getApplicationId(), null, ((AdvisoryUpdatePortfolioFragmentKey) companion.getArgs(savedStateHandle)).getBrokerageAccountType(), null, 41, null), stateProvider, duxoBundle);
        this.moshi = moshi;
        this.context = context;
        this.savedStateHandle = savedStateHandle;
        MicrogramComponent componentWithUiLaunch = RealMicrogramUiLaunchService2.getComponentWithUiLaunch(microgramManager, new RemoteMicrogramApplication("app-advisory-update-investor-profile", null, 2, null), getLifecycleScope(), moshi, MapsKt.mapOf(RealMicrogramDeeplinkService.INSTANCE.getExtension(context, navigator)), new Function1() { // from class: com.robinhood.android.advisory.portfolio.update.UpdateInvestorProfileDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UpdateInvestorProfileDuxo.component$lambda$0((FragmentKey) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.advisory.portfolio.update.UpdateInvestorProfileDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UpdateInvestorProfileDuxo.component$lambda$1((DialogFragmentKey) obj);
            }
        });
        this.component = componentWithUiLaunch;
        this.advisoryUpdateInvestorProfileAllocationService = (AdvisoryUpdateInvestorProfileAllocationService) componentWithUiLaunch.getServiceLocator().getClient(AdvisoryUpdateInvestorProfileAllocationService.class);
    }

    public final MicrogramComponent getComponent() {
        return this.component;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit component$lambda$0(FragmentKey it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit component$lambda$1(DialogFragmentKey it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public final AdvisoryUpdateInvestorProfileAllocationService getAdvisoryUpdateInvestorProfileAllocationService() {
        return this.advisoryUpdateInvestorProfileAllocationService;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        getLifecycleScope().launchWhenStarted(new C92191(null));
        getLifecycleScope().launchWhenStarted(new C92202(null));
    }

    /* compiled from: UpdateInvestorProfileDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.portfolio.update.UpdateInvestorProfileDuxo$onStart$1", m3645f = "UpdateInvestorProfileDuxo.kt", m3646l = {69}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.portfolio.update.UpdateInvestorProfileDuxo$onStart$1 */
    static final class C92191 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C92191(Continuation<? super C92191> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return UpdateInvestorProfileDuxo.this.new C92191(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C92191) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<GetAllocationFlowResponseDto> flowGetAllocationFlow = UpdateInvestorProfileDuxo.this.getAdvisoryUpdateInvestorProfileAllocationService().GetAllocationFlow(new GetAllocationFlowRequestDto());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(UpdateInvestorProfileDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowGetAllocationFlow, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: UpdateInvestorProfileDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "response", "Ladvisory/update_investor_profile/proto/v1/GetAllocationFlowResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advisory.portfolio.update.UpdateInvestorProfileDuxo$onStart$1$1", m3645f = "UpdateInvestorProfileDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.advisory.portfolio.update.UpdateInvestorProfileDuxo$onStart$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<GetAllocationFlowResponseDto, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ UpdateInvestorProfileDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(UpdateInvestorProfileDuxo updateInvestorProfileDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = updateInvestorProfileDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(GetAllocationFlowResponseDto getAllocationFlowResponseDto, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(getAllocationFlowResponseDto, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                ImmutableList3 persistentList;
                List<UpdateInvestorProfileAllocationBreakdown> items;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                GetAllocationFlowResponse proto = ((GetAllocationFlowResponseDto) this.L$0).toProto();
                UpdateInvestorProfilePage page = proto.getPage();
                String title = page != null ? page.getTitle() : null;
                UpdateInvestorProfilePage page2 = proto.getPage();
                String subtitle = page2 != null ? page2.getSubtitle() : null;
                UpdateInvestorProfilePage page3 = proto.getPage();
                if (page3 == null || (items = page3.getItems()) == null) {
                    persistentList = null;
                } else {
                    List<UpdateInvestorProfileAllocationBreakdown> list = items;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    for (UpdateInvestorProfileAllocationBreakdown updateInvestorProfileAllocationBreakdown : list) {
                        arrayList.add(new UpdateInvestorProfileDonutData.Slice(updateInvestorProfileAllocationBreakdown.getTitle(), updateInvestorProfileAllocationBreakdown.getDescription(), Float.parseFloat(updateInvestorProfileAllocationBreakdown.getAllocation_percentage()), updateInvestorProfileAllocationBreakdown.getDirection()));
                    }
                    persistentList = extensions2.toPersistentList(arrayList);
                }
                this.this$0.applyMutation(new C495981(title, subtitle, persistentList, null));
                return Unit.INSTANCE;
            }

            /* compiled from: UpdateInvestorProfileDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/portfolio/update/UpdateInvestorProfileDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.advisory.portfolio.update.UpdateInvestorProfileDuxo$onStart$1$1$1", m3645f = "UpdateInvestorProfileDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.advisory.portfolio.update.UpdateInvestorProfileDuxo$onStart$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C495981 extends ContinuationImpl7 implements Function2<UpdateInvestorProfileDataState, Continuation<? super UpdateInvestorProfileDataState>, Object> {
                final /* synthetic */ ImmutableList3<UpdateInvestorProfileDonutData.Slice> $donutItems;
                final /* synthetic */ String $incomingBondPercent;
                final /* synthetic */ String $incomingStockPercent;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C495981(String str, String str2, ImmutableList3<UpdateInvestorProfileDonutData.Slice> immutableList3, Continuation<? super C495981> continuation) {
                    super(2, continuation);
                    this.$incomingStockPercent = str;
                    this.$incomingBondPercent = str2;
                    this.$donutItems = immutableList3;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C495981 c495981 = new C495981(this.$incomingStockPercent, this.$incomingBondPercent, this.$donutItems, continuation);
                    c495981.L$0 = obj;
                    return c495981;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(UpdateInvestorProfileDataState updateInvestorProfileDataState, Continuation<? super UpdateInvestorProfileDataState> continuation) {
                    return ((C495981) create(updateInvestorProfileDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    UpdateInvestorProfileDataState updateInvestorProfileDataState = (UpdateInvestorProfileDataState) this.L$0;
                    String str = this.$incomingStockPercent;
                    if (str == null) {
                        str = "";
                    }
                    String str2 = this.$incomingBondPercent;
                    String str3 = str2 != null ? str2 : "";
                    ImmutableList3<UpdateInvestorProfileDonutData.Slice> immutableList3PersistentListOf = this.$donutItems;
                    if (immutableList3PersistentListOf == null) {
                        immutableList3PersistentListOf = extensions2.persistentListOf();
                    }
                    return UpdateInvestorProfileDataState.copy$default(updateInvestorProfileDataState, true, null, null, null, null, new UpdateInvestorProfileDonutData(str, str3, immutableList3PersistentListOf), 30, null);
                }
            }
        }
    }

    /* compiled from: UpdateInvestorProfileDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.portfolio.update.UpdateInvestorProfileDuxo$onStart$2", m3645f = "UpdateInvestorProfileDuxo.kt", m3646l = {98}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.portfolio.update.UpdateInvestorProfileDuxo$onStart$2 */
    static final class C92202 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C92202(Continuation<? super C92202> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return UpdateInvestorProfileDuxo.this.new C92202(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C92202) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<GetNavigationFlowResponseDto> flowGetNavigationFlow = UpdateInvestorProfileDuxo.this.getAdvisoryUpdateInvestorProfileAllocationService().GetNavigationFlow(new GetNavigationFlowRequestDto());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(UpdateInvestorProfileDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowGetNavigationFlow, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: UpdateInvestorProfileDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "response", "Ladvisory/update_investor_profile/proto/v1/GetNavigationFlowResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advisory.portfolio.update.UpdateInvestorProfileDuxo$onStart$2$1", m3645f = "UpdateInvestorProfileDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.advisory.portfolio.update.UpdateInvestorProfileDuxo$onStart$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<GetNavigationFlowResponseDto, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ UpdateInvestorProfileDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(UpdateInvestorProfileDuxo updateInvestorProfileDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = updateInvestorProfileDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(GetNavigationFlowResponseDto getNavigationFlowResponseDto, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(getNavigationFlowResponseDto, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                GetNavigationFlowResponseDto getNavigationFlowResponseDto = (GetNavigationFlowResponseDto) this.L$0;
                Companion companion = UpdateInvestorProfileDuxo.INSTANCE;
                String accountNumber = ((AdvisoryUpdatePortfolioFragmentKey) companion.getArgs((HasSavedState) this.this$0)).getAccountNumber();
                if (accountNumber != null) {
                    this.this$0.submit(new UpdateInvestorProfileEvent.ShowResults(accountNumber));
                } else if (getNavigationFlowResponseDto.getNext_screen_title().length() > 0) {
                    this.this$0.submit(new UpdateInvestorProfileEvent.Done(getNavigationFlowResponseDto.getNext_screen_title()));
                } else {
                    CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalStateException("Received navigation event with no account number and empty titlefor account type " + ((AdvisoryUpdatePortfolioFragmentKey) companion.getArgs((HasSavedState) this.this$0)).getBrokerageAccountType()), false, null, 6, null);
                }
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: UpdateInvestorProfileDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advisory/portfolio/update/UpdateInvestorProfileDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/advisory/portfolio/update/UpdateInvestorProfileDuxo;", "Lcom/robinhood/android/advisory/contracts/AdvisoryUpdatePortfolioFragmentKey;", "<init>", "()V", "feature-advisory-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<UpdateInvestorProfileDuxo, AdvisoryUpdatePortfolioFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AdvisoryUpdatePortfolioFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (AdvisoryUpdatePortfolioFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AdvisoryUpdatePortfolioFragmentKey getArgs(UpdateInvestorProfileDuxo updateInvestorProfileDuxo) {
            return (AdvisoryUpdatePortfolioFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, updateInvestorProfileDuxo);
        }
    }
}
