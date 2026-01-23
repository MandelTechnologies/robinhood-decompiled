package com.robinhood.android.redesigninvesting.badges.p230ui;

import androidx.lifecycle.ViewModel2;
import com.robinhood.android.redesigninvesting.badges.p230ui.InvestingBadgeViewState;
import com.robinhood.android.redesigninvesting.experiments.RedesignInvestingExperimentStore;
import com.robinhood.android.redesigninvesting.models.badges.InvestingBadge;
import com.robinhood.android.redesigninvesting.redesignsettings.RedesignSettings;
import com.robinhood.android.redesigninvesting.redesignsettings.RedesignSettingsManager;
import com.robinhood.android.redesigninvesting.store.badges.InvestingBadgeStore;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.models.serverdriven.experimental.api.InstrumentType;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: InvestingBadgeDuxo.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/redesigninvesting/badges/ui/InvestingBadgeDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/redesigninvesting/badges/ui/InvestingBadgeViewState;", "redesignInvestingExperimentStore", "Lcom/robinhood/android/redesigninvesting/experiments/RedesignInvestingExperimentStore;", "investingBadgeStore", "Lcom/robinhood/android/redesigninvesting/store/badges/InvestingBadgeStore;", "redesignSettingsManager", "Lcom/robinhood/android/redesigninvesting/redesignsettings/RedesignSettingsManager;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/redesigninvesting/experiments/RedesignInvestingExperimentStore;Lcom/robinhood/android/redesigninvesting/store/badges/InvestingBadgeStore;Lcom/robinhood/android/redesigninvesting/redesignsettings/RedesignSettingsManager;Lcom/robinhood/android/udf/DuxoBundle;)V", "bind", "Lkotlinx/coroutines/Job;", "accountNumber", "", "instrumentType", "Lcom/robinhood/models/serverdriven/experimental/api/InstrumentType;", "metadataId", "Ljava/util/UUID;", "markPriceAlertSeen", "", "priceAlertId", "lib-badges-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class InvestingBadgeDuxo extends BaseDuxo4<InvestingBadgeViewState> {
    public static final int $stable = 8;
    private final InvestingBadgeStore investingBadgeStore;
    private final RedesignInvestingExperimentStore redesignInvestingExperimentStore;
    private final RedesignSettingsManager redesignSettingsManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestingBadgeDuxo(RedesignInvestingExperimentStore redesignInvestingExperimentStore, InvestingBadgeStore investingBadgeStore, RedesignSettingsManager redesignSettingsManager, DuxoBundle duxoBundle) {
        super(InvestingBadgeViewState.NoBadge.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(redesignInvestingExperimentStore, "redesignInvestingExperimentStore");
        Intrinsics.checkNotNullParameter(investingBadgeStore, "investingBadgeStore");
        Intrinsics.checkNotNullParameter(redesignSettingsManager, "redesignSettingsManager");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.redesignInvestingExperimentStore = redesignInvestingExperimentStore;
        this.investingBadgeStore = investingBadgeStore;
        this.redesignSettingsManager = redesignSettingsManager;
    }

    /* compiled from: InvestingBadgeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.badges.ui.InvestingBadgeDuxo$bind$1", m3645f = "InvestingBadgeDuxo.kt", m3646l = {37, 38, 47}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.redesigninvesting.badges.ui.InvestingBadgeDuxo$bind$1 */
    static final class C264751 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ InstrumentType $instrumentType;
        final /* synthetic */ UUID $metadataId;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C264751(String str, InstrumentType instrumentType, UUID uuid, Continuation<? super C264751> continuation) {
            super(2, continuation);
            this.$accountNumber = str;
            this.$instrumentType = instrumentType;
            this.$metadataId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C264751 c264751 = InvestingBadgeDuxo.this.new C264751(this.$accountNumber, this.$instrumentType, this.$metadataId, continuation);
            c264751.L$0 = obj;
            return c264751;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C264751) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0086, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(r8, r1, r7) == r0) goto L26;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0089  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            RedesignSettings redesignSettings;
            boolean zBooleanValue;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                RedesignSettingsManager redesignSettingsManager = InvestingBadgeDuxo.this.redesignSettingsManager;
                this.label = 1;
                obj = redesignSettingsManager.redesignSettings(coroutineScope, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                redesignSettings = (RedesignSettings) this.L$0;
                ResultKt.throwOnFailure(obj);
                Boolean bool = (Boolean) obj;
                zBooleanValue = bool == null ? bool.booleanValue() : false;
                StringResource.Companion companion = StringResource.INSTANCE;
                if (zBooleanValue) {
                    InvestingBadgeDuxo.this.applyMutation(new AnonymousClass2(null));
                } else {
                    Flow<InvestingBadge> flowStreamBadgeData = InvestingBadgeDuxo.this.investingBadgeStore.streamBadgeData(this.$accountNumber, this.$instrumentType, this.$metadataId, redesignSettings);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(InvestingBadgeDuxo.this, null);
                    this.L$0 = null;
                    this.label = 3;
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            redesignSettings = (RedesignSettings) obj;
            Flow<Boolean> flowIsInvestingBadgeEnabled = InvestingBadgeDuxo.this.redesignInvestingExperimentStore.isInvestingBadgeEnabled();
            this.L$0 = redesignSettings;
            this.label = 2;
            obj = FlowKt.firstOrNull(flowIsInvestingBadgeEnabled, this);
            if (obj != coroutine_suspended) {
                Boolean bool2 = (Boolean) obj;
                if (bool2 == null) {
                }
                StringResource.Companion companion2 = StringResource.INSTANCE;
                if (zBooleanValue) {
                }
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        }

        /* compiled from: InvestingBadgeDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "badgeDetails", "Lcom/robinhood/android/redesigninvesting/models/badges/InvestingBadge;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.badges.ui.InvestingBadgeDuxo$bind$1$1", m3645f = "InvestingBadgeDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.redesigninvesting.badges.ui.InvestingBadgeDuxo$bind$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<InvestingBadge, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ InvestingBadgeDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(InvestingBadgeDuxo investingBadgeDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = investingBadgeDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InvestingBadge investingBadge, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(investingBadge, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: InvestingBadgeDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/redesigninvesting/badges/ui/InvestingBadgeViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.badges.ui.InvestingBadgeDuxo$bind$1$1$1", m3645f = "InvestingBadgeDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.redesigninvesting.badges.ui.InvestingBadgeDuxo$bind$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C504921 extends ContinuationImpl7 implements Function2<InvestingBadgeViewState, Continuation<? super InvestingBadgeViewState>, Object> {
                final /* synthetic */ InvestingBadge $badgeDetails;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C504921(InvestingBadge investingBadge, Continuation<? super C504921> continuation) {
                    super(2, continuation);
                    this.$badgeDetails = investingBadge;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C504921(this.$badgeDetails, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InvestingBadgeViewState investingBadgeViewState, Continuation<? super InvestingBadgeViewState> continuation) {
                    return ((C504921) create(investingBadgeViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    if (Intrinsics.areEqual(this.$badgeDetails, InvestingBadge.None.INSTANCE)) {
                        return InvestingBadgeViewState.NoBadge.INSTANCE;
                    }
                    return new InvestingBadgeViewState.Badge(this.$badgeDetails);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C504921((InvestingBadge) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* compiled from: InvestingBadgeDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/redesigninvesting/badges/ui/InvestingBadgeViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.badges.ui.InvestingBadgeDuxo$bind$1$2", m3645f = "InvestingBadgeDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.redesigninvesting.badges.ui.InvestingBadgeDuxo$bind$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<InvestingBadgeViewState, Continuation<? super InvestingBadgeViewState>, Object> {
            int label;

            AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InvestingBadgeViewState investingBadgeViewState, Continuation<? super InvestingBadgeViewState> continuation) {
                return ((AnonymousClass2) create(investingBadgeViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return InvestingBadgeViewState.NoBadge.INSTANCE;
            }
        }
    }

    public final Job bind(String accountNumber, InstrumentType instrumentType, UUID metadataId) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
        Intrinsics.checkNotNullParameter(metadataId, "metadataId");
        return BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), null, null, new C264751(accountNumber, instrumentType, metadataId, null), 3, null);
    }

    /* compiled from: InvestingBadgeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.badges.ui.InvestingBadgeDuxo$markPriceAlertSeen$1", m3645f = "InvestingBadgeDuxo.kt", m3646l = {66}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.redesigninvesting.badges.ui.InvestingBadgeDuxo$markPriceAlertSeen$1 */
    static final class C264761 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $priceAlertId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C264761(String str, Continuation<? super C264761> continuation) {
            super(2, continuation);
            this.$priceAlertId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InvestingBadgeDuxo.this.new C264761(this.$priceAlertId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C264761) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                InvestingBadgeStore investingBadgeStore = InvestingBadgeDuxo.this.investingBadgeStore;
                String str = this.$priceAlertId;
                this.label = 1;
                if (investingBadgeStore.markPriceAlertSeen(str, this) == coroutine_suspended) {
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

    public final void markPriceAlertSeen(String priceAlertId) {
        Intrinsics.checkNotNullParameter(priceAlertId, "priceAlertId");
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), null, null, new C264761(priceAlertId, null), 3, null);
    }
}
