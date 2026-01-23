package com.robinhood.shared.onboarding.lib.menuofoption;

import com.robinhood.android.regiongate.FirstTradeUpsellRegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.identi.BaseSortingHatStore;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: FirstTradeUpsellBannerDuxo.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0010\u0011\u0012B)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/shared/onboarding/lib/menuofoption/FirstTradeUpsellBannerDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/shared/onboarding/lib/menuofoption/FirstTradeUpsellBannerDuxo$DataState;", "Lcom/robinhood/shared/onboarding/lib/menuofoption/FirstTradeUpsellBannerDuxo$ViewState;", "stateProvider", "Lcom/robinhood/shared/onboarding/lib/menuofoption/FirstTradeUpsellBannerDuxo$StateProvider;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "sortingHatStore", "Lcom/robinhood/librobinhood/data/store/identi/BaseSortingHatStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/shared/onboarding/lib/menuofoption/FirstTradeUpsellBannerDuxo$StateProvider;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/librobinhood/data/store/identi/BaseSortingHatStore;Lcom/robinhood/android/udf/DuxoBundle;)V", "onCreate", "", "ViewState", "DataState", "StateProvider", "lib-menu-of-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class FirstTradeUpsellBannerDuxo extends BaseDuxo<DataState, ViewState> {
    public static final int $stable = 8;
    private final RegionGateProvider regionGateProvider;
    private final BaseSortingHatStore sortingHatStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirstTradeUpsellBannerDuxo(StateProvider stateProvider, RegionGateProvider regionGateProvider, BaseSortingHatStore sortingHatStore, DuxoBundle duxoBundle) {
        super(new DataState(false), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(sortingHatStore, "sortingHatStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.regionGateProvider = regionGateProvider;
        this.sortingHatStore = sortingHatStore;
    }

    /* compiled from: FirstTradeUpsellBannerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/shared/onboarding/lib/menuofoption/FirstTradeUpsellBannerDuxo$ViewState;", "", "showContent", "", "<init>", "(Z)V", "getShowContent", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-menu-of-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ViewState {
        public static final int $stable = 0;
        private final boolean showContent;

        public static /* synthetic */ ViewState copy$default(ViewState viewState, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = viewState.showContent;
            }
            return viewState.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getShowContent() {
            return this.showContent;
        }

        public final ViewState copy(boolean showContent) {
            return new ViewState(showContent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ViewState) && this.showContent == ((ViewState) other).showContent;
        }

        public int hashCode() {
            return Boolean.hashCode(this.showContent);
        }

        public String toString() {
            return "ViewState(showContent=" + this.showContent + ")";
        }

        public ViewState(boolean z) {
            this.showContent = z;
        }

        public final boolean getShowContent() {
            return this.showContent;
        }
    }

    /* compiled from: FirstTradeUpsellBannerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/shared/onboarding/lib/menuofoption/FirstTradeUpsellBannerDuxo$DataState;", "", "eligible", "", "<init>", "(Z)V", "getEligible", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-menu-of-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class DataState {
        public static final int $stable = 0;
        private final boolean eligible;

        public static /* synthetic */ DataState copy$default(DataState dataState, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = dataState.eligible;
            }
            return dataState.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getEligible() {
            return this.eligible;
        }

        public final DataState copy(boolean eligible) {
            return new DataState(eligible);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DataState) && this.eligible == ((DataState) other).eligible;
        }

        public int hashCode() {
            return Boolean.hashCode(this.eligible);
        }

        public String toString() {
            return "DataState(eligible=" + this.eligible + ")";
        }

        public DataState(boolean z) {
            this.eligible = z;
        }

        public final boolean getEligible() {
            return this.eligible;
        }
    }

    /* compiled from: FirstTradeUpsellBannerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/onboarding/lib/menuofoption/FirstTradeUpsellBannerDuxo$StateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/shared/onboarding/lib/menuofoption/FirstTradeUpsellBannerDuxo$DataState;", "Lcom/robinhood/shared/onboarding/lib/menuofoption/FirstTradeUpsellBannerDuxo$ViewState;", "<init>", "()V", "reduce", "dataState", "lib-menu-of-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class StateProvider implements com.robinhood.android.udf.StateProvider<DataState, ViewState> {
        public static final int $stable = 0;

        @Override // com.robinhood.android.udf.StateProvider
        public ViewState reduce(DataState dataState) {
            Intrinsics.checkNotNullParameter(dataState, "dataState");
            return new ViewState(dataState.getEligible());
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C392371(null));
    }

    /* compiled from: FirstTradeUpsellBannerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.onboarding.lib.menuofoption.FirstTradeUpsellBannerDuxo$onCreate$1", m3645f = "FirstTradeUpsellBannerDuxo.kt", m3646l = {62}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.onboarding.lib.menuofoption.FirstTradeUpsellBannerDuxo$onCreate$1 */
    static final class C392371 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C392371(Continuation<? super C392371> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FirstTradeUpsellBannerDuxo.this.new C392371(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C392371) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowTransformLatest = FlowKt.transformLatest(RegionGateProvider.DefaultImpls.streamRegionGateStateFlow$default(FirstTradeUpsellBannerDuxo.this.regionGateProvider, FirstTradeUpsellRegionGate.INSTANCE, false, 2, null), new C39235xc3a3b1a7(null, FirstTradeUpsellBannerDuxo.this));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(FirstTradeUpsellBannerDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowTransformLatest, anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: FirstTradeUpsellBannerDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "eligible", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.onboarding.lib.menuofoption.FirstTradeUpsellBannerDuxo$onCreate$1$2", m3645f = "FirstTradeUpsellBannerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.onboarding.lib.menuofoption.FirstTradeUpsellBannerDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ FirstTradeUpsellBannerDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(FirstTradeUpsellBannerDuxo firstTradeUpsellBannerDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = firstTradeUpsellBannerDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: FirstTradeUpsellBannerDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/onboarding/lib/menuofoption/FirstTradeUpsellBannerDuxo$DataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.onboarding.lib.menuofoption.FirstTradeUpsellBannerDuxo$onCreate$1$2$1", m3645f = "FirstTradeUpsellBannerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.onboarding.lib.menuofoption.FirstTradeUpsellBannerDuxo$onCreate$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<DataState, Continuation<? super DataState>, Object> {
                final /* synthetic */ boolean $eligible;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(boolean z, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$eligible = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$eligible, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(DataState dataState, Continuation<? super DataState> continuation) {
                    return ((AnonymousClass1) create(dataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return ((DataState) this.L$0).copy(this.$eligible);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1(this.Z$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }
}
