package com.robinhood.android.feature.linking;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.blackwidow.contracts.MobileLinkingHostIntentKey;
import com.robinhood.android.feature.linking.MobileLinkingHostDuxo;
import com.robinhood.android.feature.linking.MobileLinkingHostDuxo8;
import com.robinhood.android.markethours.util.TraderMarketHoursManager;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesProduct;
import com.robinhood.android.store.linking.LinkingGroup;
import com.robinhood.android.store.linking.MobileLinkingStore;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion2;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.util.LockscreenManager;
import com.robinhood.disposer.LifecycleHostCoroutineScope;
import com.robinhood.librobinhood.data.store.AccountStore;
import com.robinhood.librobinhood.data.store.CryptoQuoteStore;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.PriceBookExistenceStore;
import com.robinhood.librobinhood.data.store.bonfire.instrument.InstrumentAccountSwitcherStore;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartStore;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p355ui.PriceBookExistence;
import com.robinhood.store.futures.arsenal.FuturesProductStore;
import hippo.model.p469v1.InstrumentTypeDto;
import hippo.model.p469v1.LinkingGroupColorsDto;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Tuples3;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: MobileLinkingHostDuxo.kt */
@Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 &2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001&Bi\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010!\u001a\u00020\"H\u0016J\u000e\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020%R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u00020\u001aX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/feature/linking/MobileLinkingHostDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/feature/linking/MobileLinkingHostState;", "Lcom/robinhood/android/feature/linking/MobileLinkingHostEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "accountStore", "Lcom/robinhood/librobinhood/data/store/AccountStore;", "mobileLinkingStore", "Lcom/robinhood/android/store/linking/MobileLinkingStore;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "futuresProductStore", "Lcom/robinhood/store/futures/arsenal/FuturesProductStore;", "marketHoursManager", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "performanceChartStore", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartStore;", "cryptoQuoteStore", "Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;", "priceBookExistenceStore", "Lcom/robinhood/librobinhood/data/store/PriceBookExistenceStore;", "lockscreenManager", "Lcom/robinhood/android/util/LockscreenManager;", "accountSwitcherStore", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentAccountSwitcherStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/AccountStore;Lcom/robinhood/android/store/linking/MobileLinkingStore;Lcom/robinhood/librobinhood/data/store/InstrumentStore;Lcom/robinhood/store/futures/arsenal/FuturesProductStore;Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartStore;Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;Lcom/robinhood/librobinhood/data/store/PriceBookExistenceStore;Lcom/robinhood/android/util/LockscreenManager;Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentAccountSwitcherStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "setSelectedGroupId", "groupId", "", "Companion", "feature-mobile-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class MobileLinkingHostDuxo extends BaseDuxo5<MobileLinkingHostState, MobileLinkingHostDuxo8> implements HasSavedState {
    public static final String BTC_UUID = "3d961844-d360-45fc-989b-f6fca761d511";
    private final AccountStore accountStore;
    private final InstrumentAccountSwitcherStore accountSwitcherStore;
    private final CryptoQuoteStore cryptoQuoteStore;
    private final FuturesProductStore futuresProductStore;
    private final InstrumentStore instrumentStore;
    private final LockscreenManager lockscreenManager;
    private final TraderMarketHoursManager marketHoursManager;
    private final MobileLinkingStore mobileLinkingStore;
    private final PerformanceChartStore performanceChartStore;
    private final PriceBookExistenceStore priceBookExistenceStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobileLinkingHostDuxo(AccountStore accountStore, MobileLinkingStore mobileLinkingStore, InstrumentStore instrumentStore, FuturesProductStore futuresProductStore, TraderMarketHoursManager marketHoursManager, PerformanceChartStore performanceChartStore, CryptoQuoteStore cryptoQuoteStore, PriceBookExistenceStore priceBookExistenceStore, LockscreenManager lockscreenManager, InstrumentAccountSwitcherStore accountSwitcherStore, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        super(new MobileLinkingHostState(((MobileLinkingHostIntentKey) INSTANCE.getExtras(savedStateHandle)).getAccountNumber(), null, null, null, 14, null), duxoBundle);
        Intrinsics.checkNotNullParameter(accountStore, "accountStore");
        Intrinsics.checkNotNullParameter(mobileLinkingStore, "mobileLinkingStore");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(futuresProductStore, "futuresProductStore");
        Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
        Intrinsics.checkNotNullParameter(performanceChartStore, "performanceChartStore");
        Intrinsics.checkNotNullParameter(cryptoQuoteStore, "cryptoQuoteStore");
        Intrinsics.checkNotNullParameter(priceBookExistenceStore, "priceBookExistenceStore");
        Intrinsics.checkNotNullParameter(lockscreenManager, "lockscreenManager");
        Intrinsics.checkNotNullParameter(accountSwitcherStore, "accountSwitcherStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.accountStore = accountStore;
        this.mobileLinkingStore = mobileLinkingStore;
        this.instrumentStore = instrumentStore;
        this.futuresProductStore = futuresProductStore;
        this.marketHoursManager = marketHoursManager;
        this.performanceChartStore = performanceChartStore;
        this.cryptoQuoteStore = cryptoQuoteStore;
        this.priceBookExistenceStore = priceBookExistenceStore;
        this.lockscreenManager = lockscreenManager;
        this.accountSwitcherStore = accountSwitcherStore;
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: MobileLinkingHostDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.feature.linking.MobileLinkingHostDuxo$onCreate$1", m3645f = "MobileLinkingHostDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.feature.linking.MobileLinkingHostDuxo$onCreate$1 */
    static final class C167441 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C167441(Continuation<? super C167441> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C167441 c167441 = MobileLinkingHostDuxo.this.new C167441(continuation);
            c167441.L$0 = obj;
            return c167441;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C167441) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                Flow<String> flowStreamAccountNumber = MobileLinkingHostDuxo.this.mobileLinkingStore.streamAccountNumber();
                LifecycleHostCoroutineScope lifecycleScope = MobileLinkingHostDuxo.this.getLifecycleScope();
                SharingStarted.Companion companion = SharingStarted.INSTANCE;
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.shareIn(flowStreamAccountNumber, lifecycleScope, SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), 1));
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(MobileLinkingHostDuxo.this, flowDistinctUntilChanged, null), 3, null);
                MobileLinkingHostDuxo mobileLinkingHostDuxo = MobileLinkingHostDuxo.this;
                try {
                    Result.Companion companion2 = Result.INSTANCE;
                    Flow flowDistinctUntilChanged2 = FlowKt.distinctUntilChanged(FlowKt.shareIn(mobileLinkingHostDuxo.mobileLinkingStore.streamBackgroundAura(), mobileLinkingHostDuxo.getLifecycleScope(), SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), 1));
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new MobileLinkingHostDuxo3(flowDistinctUntilChanged2, mobileLinkingHostDuxo, null), 3, null);
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new MobileLinkingHostDuxo4(flowDistinctUntilChanged, mobileLinkingHostDuxo, flowDistinctUntilChanged2, null), 3, null);
                    Result.m28550constructorimpl(BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new MobileLinkingHostDuxo6(flowDistinctUntilChanged2, mobileLinkingHostDuxo, null), 3, null));
                } catch (Throwable th) {
                    Result.Companion companion3 = Result.INSTANCE;
                    Result.m28550constructorimpl(ResultKt.createFailure(th));
                }
                try {
                    Result.m28550constructorimpl(BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new MobileLinkingHostDuxo7(flowDistinctUntilChanged, MobileLinkingHostDuxo.this, null), 3, null));
                } catch (Throwable th2) {
                    Result.Companion companion4 = Result.INSTANCE;
                    Result.m28550constructorimpl(ResultKt.createFailure(th2));
                }
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass4(MobileLinkingHostDuxo.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: MobileLinkingHostDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.feature.linking.MobileLinkingHostDuxo$onCreate$1$1", m3645f = "MobileLinkingHostDuxo.kt", m3646l = {107}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.feature.linking.MobileLinkingHostDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<String> $sharedAccountNumberFlow;
            int label;
            final /* synthetic */ MobileLinkingHostDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(MobileLinkingHostDuxo mobileLinkingHostDuxo, Flow<String> flow, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = mobileLinkingHostDuxo;
                this.$sharedAccountNumberFlow = flow;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$sharedAccountNumberFlow, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        String initialSelectedGroupId = ((MobileLinkingHostIntentKey) MobileLinkingHostDuxo.INSTANCE.getExtras((HasSavedState) this.this$0)).getInitialSelectedGroupId();
                        if (initialSelectedGroupId != null) {
                            MobileLinkingHostDuxo mobileLinkingHostDuxo = this.this$0;
                            mobileLinkingHostDuxo.mobileLinkingStore.updateSelectedGroupId(initialSelectedGroupId);
                            mobileLinkingHostDuxo.applyMutation(new MobileLinkingHostDuxo2(initialSelectedGroupId, null));
                        }
                        Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.onEach(FlowKt.combine(this.this$0.mobileLinkingStore.streamLinkingGroups(), this.this$0.mobileLinkingStore.streamSelectedGroupId(), this.$sharedAccountNumberFlow, new AnonymousClass2(null)), new AnonymousClass3(this.this$0, null)), new Function2() { // from class: com.robinhood.android.feature.linking.MobileLinkingHostDuxo$onCreate$1$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                return Boolean.valueOf(MobileLinkingHostDuxo.C167441.AnonymousClass1.invokeSuspend$lambda$3((Tuples3) obj2, (Tuples3) obj3));
                            }
                        });
                        AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.this$0, null);
                        this.label = 1;
                        if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass5, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                } catch (Exception e) {
                    this.this$0.submit(new MobileLinkingHostDuxo8.ShowNetworkError(e));
                }
                return Unit.INSTANCE;
            }

            /* compiled from: MobileLinkingHostDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\n"}, m3636d2 = {"<anonymous>", "Lkotlin/Triple;", "", "Lcom/robinhood/android/store/linking/LinkingGroup;", "", "groups", "selectedGroupId", "accountNumber"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.feature.linking.MobileLinkingHostDuxo$onCreate$1$1$2", m3645f = "MobileLinkingHostDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.feature.linking.MobileLinkingHostDuxo$onCreate$1$1$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function4<List<? extends LinkingGroup>, String, String, Continuation<? super Tuples3<? extends List<? extends LinkingGroup>, ? extends String, ? extends String>>, Object> {
                /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                /* synthetic */ Object L$2;
                int label;

                AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                    super(4, continuation);
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Object invoke(List<? extends LinkingGroup> list, String str, String str2, Continuation<? super Tuples3<? extends List<? extends LinkingGroup>, ? extends String, ? extends String>> continuation) {
                    return invoke2((List<LinkingGroup>) list, str, str2, (Continuation<? super Tuples3<? extends List<LinkingGroup>, String, String>>) continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(List<LinkingGroup> list, String str, String str2, Continuation<? super Tuples3<? extends List<LinkingGroup>, String, String>> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
                    anonymousClass2.L$0 = list;
                    anonymousClass2.L$1 = str;
                    anonymousClass2.L$2 = str2;
                    return anonymousClass2.invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return new Tuples3((List) this.L$0, (String) this.L$1, (String) this.L$2);
                }
            }

            /* compiled from: MobileLinkingHostDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012 \u0010\u0002\u001a\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Triple;", "", "Lcom/robinhood/android/store/linking/LinkingGroup;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.feature.linking.MobileLinkingHostDuxo$onCreate$1$1$3", m3645f = "MobileLinkingHostDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.feature.linking.MobileLinkingHostDuxo$onCreate$1$1$3, reason: invalid class name */
            static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<Tuples3<? extends List<? extends LinkingGroup>, ? extends String, ? extends String>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ MobileLinkingHostDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(MobileLinkingHostDuxo mobileLinkingHostDuxo, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.this$0 = mobileLinkingHostDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                    anonymousClass3.L$0 = obj;
                    return anonymousClass3;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Tuples3<? extends List<? extends LinkingGroup>, ? extends String, ? extends String> tuples3, Continuation<? super Unit> continuation) {
                    return invoke2((Tuples3<? extends List<LinkingGroup>, String, String>) tuples3, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Tuples3<? extends List<LinkingGroup>, String, String> tuples3, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(tuples3, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: MobileLinkingHostDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/feature/linking/MobileLinkingHostState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.feature.linking.MobileLinkingHostDuxo$onCreate$1$1$3$1", m3645f = "MobileLinkingHostDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.feature.linking.MobileLinkingHostDuxo$onCreate$1$1$3$1, reason: invalid class name and collision with other inner class name */
                static final class C500781 extends ContinuationImpl7 implements Function2<MobileLinkingHostState, Continuation<? super MobileLinkingHostState>, Object> {
                    final /* synthetic */ List<LinkingGroup> $groups;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C500781(List<LinkingGroup> list, Continuation<? super C500781> continuation) {
                        super(2, continuation);
                        this.$groups = list;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C500781 c500781 = new C500781(this.$groups, continuation);
                        c500781.L$0 = obj;
                        return c500781;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(MobileLinkingHostState mobileLinkingHostState, Continuation<? super MobileLinkingHostState> continuation) {
                        return ((C500781) create(mobileLinkingHostState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        MobileLinkingHostState mobileLinkingHostState = (MobileLinkingHostState) this.L$0;
                        List<LinkingGroup> list = this.$groups;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : list) {
                            if (((LinkingGroup) obj2).getColor() != LinkingGroupColorsDto.COLORS_EXTENDED_UNSPECIFIED) {
                                arrayList.add(obj2);
                            }
                        }
                        return MobileLinkingHostState.copy$default(mobileLinkingHostState, null, null, arrayList, null, 11, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C500781((List) ((Tuples3) this.L$0).component1(), null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final boolean invokeSuspend$lambda$3(Tuples3 tuples3, Tuples3 tuples32) {
                Object obj;
                Object next;
                List list = (List) tuples3.component1();
                String str = (String) tuples3.component2();
                String str2 = (String) tuples3.component3();
                List list2 = (List) tuples32.component1();
                String str3 = (String) tuples32.component2();
                String str4 = (String) tuples32.component3();
                Iterator it = list.iterator();
                while (true) {
                    obj = null;
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (Intrinsics.areEqual(((LinkingGroup) next).getId(), str)) {
                        break;
                    }
                }
                LinkingGroup linkingGroup = (LinkingGroup) next;
                Iterator it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next2 = it2.next();
                    if (Intrinsics.areEqual(((LinkingGroup) next2).getId(), str3)) {
                        obj = next2;
                        break;
                    }
                }
                return Intrinsics.areEqual(linkingGroup, (LinkingGroup) obj) && Intrinsics.areEqual(str2, str4);
            }

            /* compiled from: MobileLinkingHostDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012 \u0010\u0002\u001a\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Triple;", "", "Lcom/robinhood/android/store/linking/LinkingGroup;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.feature.linking.MobileLinkingHostDuxo$onCreate$1$1$5", m3645f = "MobileLinkingHostDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE, 398, EnumC7081g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.feature.linking.MobileLinkingHostDuxo$onCreate$1$1$5, reason: invalid class name */
            static final class AnonymousClass5 extends ContinuationImpl7 implements Function2<Tuples3<? extends List<? extends LinkingGroup>, ? extends String, ? extends String>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                Object L$1;
                Object L$2;
                int label;
                final /* synthetic */ MobileLinkingHostDuxo this$0;

                /* compiled from: MobileLinkingHostDuxo.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                /* renamed from: com.robinhood.android.feature.linking.MobileLinkingHostDuxo$onCreate$1$1$5$WhenMappings */
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[InstrumentTypeDto.values().length];
                        try {
                            iArr[InstrumentTypeDto.INSTRUMENT_TYPE_FUTURES_CONTRACT.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[InstrumentTypeDto.INSTRUMENT_TYPE_FUTURES_PRODUCT.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[InstrumentTypeDto.INSTRUMENT_TYPE_EQUITY.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        try {
                            iArr[InstrumentTypeDto.INSTRUMENT_TYPE_COMBO.ordinal()] = 4;
                        } catch (NoSuchFieldError unused4) {
                        }
                        try {
                            iArr[InstrumentTypeDto.INSTRUMENT_TYPE_CRYPTO.ordinal()] = 5;
                        } catch (NoSuchFieldError unused5) {
                        }
                        try {
                            iArr[InstrumentTypeDto.INSTRUMENT_TYPE_INDEX.ordinal()] = 6;
                        } catch (NoSuchFieldError unused6) {
                        }
                        try {
                            iArr[InstrumentTypeDto.INSTRUMENT_TYPE_OPTION.ordinal()] = 7;
                        } catch (NoSuchFieldError unused7) {
                        }
                        try {
                            iArr[InstrumentTypeDto.INSTRUMENT_TYPE_UNSPECIFIED.ordinal()] = 8;
                        } catch (NoSuchFieldError unused8) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass5(MobileLinkingHostDuxo mobileLinkingHostDuxo, Continuation<? super AnonymousClass5> continuation) {
                    super(2, continuation);
                    this.this$0 = mobileLinkingHostDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.this$0, continuation);
                    anonymousClass5.L$0 = obj;
                    return anonymousClass5;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Tuples3<? extends List<? extends LinkingGroup>, ? extends String, ? extends String> tuples3, Continuation<? super Unit> continuation) {
                    return invoke2((Tuples3<? extends List<LinkingGroup>, String, String>) tuples3, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Tuples3<? extends List<LinkingGroup>, String, String> tuples3, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass5) create(tuples3, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: MobileLinkingHostDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/feature/linking/MobileLinkingHostState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.feature.linking.MobileLinkingHostDuxo$onCreate$1$1$5$1", m3645f = "MobileLinkingHostDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.feature.linking.MobileLinkingHostDuxo$onCreate$1$1$5$1, reason: invalid class name and collision with other inner class name */
                static final class C500791 extends ContinuationImpl7 implements Function2<MobileLinkingHostState, Continuation<? super MobileLinkingHostState>, Object> {
                    final /* synthetic */ String $selectedGroupId;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C500791(String str, Continuation<? super C500791> continuation) {
                        super(2, continuation);
                        this.$selectedGroupId = str;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C500791 c500791 = new C500791(this.$selectedGroupId, continuation);
                        c500791.L$0 = obj;
                        return c500791;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(MobileLinkingHostState mobileLinkingHostState, Continuation<? super MobileLinkingHostState> continuation) {
                        return ((C500791) create(mobileLinkingHostState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return MobileLinkingHostState.copy$default((MobileLinkingHostState) this.L$0, null, this.$selectedGroupId, null, null, 13, null);
                    }
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Removed duplicated region for block: B:50:0x0147  */
                /* JADX WARN: Removed duplicated region for block: B:57:0x0156  */
                /* JADX WARN: Removed duplicated region for block: B:61:0x017e  */
                /* JADX WARN: Removed duplicated region for block: B:68:0x01af  */
                /* JADX WARN: Removed duplicated region for block: B:70:0x01b5  */
                /* JADX WARN: Removed duplicated region for block: B:71:0x01bb  */
                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    Object next;
                    LinkingGroup linkingGroup;
                    Object objFirstOrNull;
                    LinkingGroup linkingGroup2;
                    Object objAwaitFirst;
                    String str;
                    UUID uuid;
                    List<String> widgetIds;
                    UUID activeFuturesContractId;
                    String symbol;
                    MobileLinkingHostDuxo8 showUnsupportedError;
                    Object objFirstOrNull2;
                    Instrument instrument;
                    String accountNumber;
                    PriceBookExistence priceBookExistence;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    boolean z = false;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Tuples3 tuples3 = (Tuples3) this.L$0;
                        List list = (List) tuples3.component1();
                        String str2 = (String) tuples3.component2();
                        String str3 = (String) tuples3.component3();
                        this.this$0.applyMutation(new C500791(str2, null));
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            if (Intrinsics.areEqual(((LinkingGroup) next).getId(), str2)) {
                                break;
                            }
                        }
                        linkingGroup = (LinkingGroup) next;
                        if (linkingGroup != null && (widgetIds = linkingGroup.getWidgetIds()) != null && widgetIds.isEmpty()) {
                            this.this$0.submit(new MobileLinkingHostDuxo8.ShowNoWidgetsError(linkingGroup));
                            return Unit.INSTANCE;
                        }
                        if (linkingGroup != null ? Intrinsics.areEqual(linkingGroup.isLinked(), boxing.boxBoolean(false)) : false) {
                            this.this$0.submit(MobileLinkingHostDuxo8.ShowNoLinkedGroupError.INSTANCE);
                            return Unit.INSTANCE;
                        }
                        InstrumentTypeDto instrumentType = linkingGroup != null ? linkingGroup.getInstrumentType() : null;
                        switch (instrumentType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[instrumentType.ordinal()]) {
                            case -1:
                                break;
                            case 0:
                            default:
                                throw new NoWhenBranchMatchedException();
                            case 1:
                                MobileLinkingHostDuxo mobileLinkingHostDuxo = this.this$0;
                                UUID uuidFromString = UUID.fromString(linkingGroup.getInstrumentId());
                                Intrinsics.checkNotNullExpressionValue(uuidFromString, "fromString(...)");
                                mobileLinkingHostDuxo.submit(new MobileLinkingHostDuxo8.ShowFuturesLadder(linkingGroup, uuidFromString));
                                break;
                            case 2:
                                UUID uuidFromString2 = UUID.fromString(linkingGroup.getInstrumentId());
                                FuturesProductStore futuresProductStore = this.this$0.futuresProductStore;
                                Intrinsics.checkNotNull(uuidFromString2);
                                Flow<FuturesProduct> flowStreamFuturesProduct = futuresProductStore.streamFuturesProduct(uuidFromString2);
                                this.L$0 = linkingGroup;
                                this.label = 1;
                                objFirstOrNull = FlowKt.firstOrNull(flowStreamFuturesProduct, this);
                                if (objFirstOrNull != coroutine_suspended) {
                                    linkingGroup2 = linkingGroup;
                                    FuturesProduct futuresProduct = (FuturesProduct) objFirstOrNull;
                                    if (futuresProduct != null) {
                                    }
                                    if (activeFuturesContractId == null) {
                                    }
                                    this.this$0.submit(showUnsupportedError);
                                    break;
                                }
                                return coroutine_suspended;
                            case 3:
                                UUID uuidFromString3 = UUID.fromString(linkingGroup.getInstrumentId());
                                InstrumentStore instrumentStore = this.this$0.instrumentStore;
                                Intrinsics.checkNotNull(uuidFromString3);
                                instrumentStore.refresh(true, uuidFromString3);
                                Observable<Instrument> instrument2 = this.this$0.instrumentStore.getInstrument(uuidFromString3);
                                this.L$0 = str3;
                                this.L$1 = linkingGroup;
                                this.L$2 = uuidFromString3;
                                this.label = 2;
                                objAwaitFirst = RxAwait3.awaitFirst(instrument2, this);
                                if (objAwaitFirst != coroutine_suspended) {
                                    str = str3;
                                    uuid = uuidFromString3;
                                    Instrument instrument3 = (Instrument) objAwaitFirst;
                                    PriceBookExistenceStore priceBookExistenceStore = this.this$0.priceBookExistenceStore;
                                    Intrinsics.checkNotNull(uuid);
                                    Flow<PriceBookExistence> flowStreamPriceBookExistence = priceBookExistenceStore.streamPriceBookExistence(uuid);
                                    this.L$0 = str;
                                    this.L$1 = linkingGroup;
                                    this.L$2 = instrument3;
                                    this.label = 3;
                                    objFirstOrNull2 = FlowKt.firstOrNull(flowStreamPriceBookExistence, this);
                                    if (objFirstOrNull2 != coroutine_suspended) {
                                    }
                                }
                                return coroutine_suspended;
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                                this.this$0.submit(new MobileLinkingHostDuxo8.ShowUnsupportedError(linkingGroup));
                                break;
                        }
                    } else if (i == 1) {
                        LinkingGroup linkingGroup3 = (LinkingGroup) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        objFirstOrNull = obj;
                        linkingGroup2 = linkingGroup3;
                        FuturesProduct futuresProduct2 = (FuturesProduct) objFirstOrNull;
                        activeFuturesContractId = futuresProduct2 != null ? futuresProduct2.getActiveFuturesContractId() : null;
                        if (activeFuturesContractId == null) {
                            showUnsupportedError = new MobileLinkingHostDuxo8.ShowFuturesLadder(linkingGroup2, activeFuturesContractId);
                        } else {
                            if (futuresProduct2 == null || (symbol = futuresProduct2.getDisplaySymbol()) == null) {
                                symbol = futuresProduct2 != null ? futuresProduct2.getSymbol() : linkingGroup2.getInstrumentSymbol();
                            }
                            showUnsupportedError = new MobileLinkingHostDuxo8.ShowUnsupportedError(LinkingGroup.copy$default(linkingGroup2, null, null, null, null, null, symbol, null, 95, null));
                        }
                        this.this$0.submit(showUnsupportedError);
                    } else {
                        if (i == 2) {
                            uuid = (UUID) this.L$2;
                            LinkingGroup linkingGroup4 = (LinkingGroup) this.L$1;
                            str = (String) this.L$0;
                            ResultKt.throwOnFailure(obj);
                            linkingGroup = linkingGroup4;
                            objAwaitFirst = obj;
                            Instrument instrument32 = (Instrument) objAwaitFirst;
                            PriceBookExistenceStore priceBookExistenceStore2 = this.this$0.priceBookExistenceStore;
                            Intrinsics.checkNotNull(uuid);
                            Flow<PriceBookExistence> flowStreamPriceBookExistence2 = priceBookExistenceStore2.streamPriceBookExistence(uuid);
                            this.L$0 = str;
                            this.L$1 = linkingGroup;
                            this.L$2 = instrument32;
                            this.label = 3;
                            objFirstOrNull2 = FlowKt.firstOrNull(flowStreamPriceBookExistence2, this);
                            if (objFirstOrNull2 != coroutine_suspended) {
                                instrument = instrument32;
                                accountNumber = str;
                                priceBookExistence = (PriceBookExistence) objFirstOrNull2;
                                if (priceBookExistence != null) {
                                    z = true;
                                }
                                if (!z) {
                                }
                            }
                            return coroutine_suspended;
                        }
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        instrument = (Instrument) this.L$2;
                        LinkingGroup linkingGroup5 = (LinkingGroup) this.L$1;
                        accountNumber = (String) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        linkingGroup = linkingGroup5;
                        objFirstOrNull2 = obj;
                        priceBookExistence = (PriceBookExistence) objFirstOrNull2;
                        if (priceBookExistence != null && priceBookExistence.getExists()) {
                            z = true;
                        }
                        if (!z) {
                            InstrumentAccountSwitcherStore instrumentAccountSwitcherStore = this.this$0.accountSwitcherStore;
                            if (accountNumber == null) {
                                accountNumber = ((MobileLinkingHostIntentKey) MobileLinkingHostDuxo.INSTANCE.getExtras((HasSavedState) this.this$0)).getAccountNumber();
                            }
                            instrumentAccountSwitcherStore.setActiveAccountNumber(accountNumber);
                            MobileLinkingHostDuxo mobileLinkingHostDuxo2 = this.this$0;
                            Intrinsics.checkNotNull(instrument);
                            mobileLinkingHostDuxo2.submit(new MobileLinkingHostDuxo8.ShowEquitiesLadder(linkingGroup, instrument));
                        } else {
                            this.this$0.submit(new MobileLinkingHostDuxo8.ShowUnsupportedError(linkingGroup));
                        }
                    }
                    return Unit.INSTANCE;
                }
            }
        }

        /* compiled from: MobileLinkingHostDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.feature.linking.MobileLinkingHostDuxo$onCreate$1$4", m3645f = "MobileLinkingHostDuxo.kt", m3646l = {335}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.feature.linking.MobileLinkingHostDuxo$onCreate$1$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ MobileLinkingHostDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(MobileLinkingHostDuxo mobileLinkingHostDuxo, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = mobileLinkingHostDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: MobileLinkingHostDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "isLocked", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.feature.linking.MobileLinkingHostDuxo$onCreate$1$4$1", m3645f = "MobileLinkingHostDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.feature.linking.MobileLinkingHostDuxo$onCreate$1$4$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ MobileLinkingHostDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(MobileLinkingHostDuxo mobileLinkingHostDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = mobileLinkingHostDuxo;
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
                    if (!this.Z$0) {
                        this.this$0.submit(MobileLinkingHostDuxo8.TryPlaySound.INSTANCE);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<Boolean> lockState = this.this$0.lockscreenManager.getLockState();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(lockState, anonymousClass1, this) == coroutine_suspended) {
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
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C167441(null), 3, null);
    }

    /* compiled from: MobileLinkingHostDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.feature.linking.MobileLinkingHostDuxo$setSelectedGroupId$1", m3645f = "MobileLinkingHostDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.feature.linking.MobileLinkingHostDuxo$setSelectedGroupId$1 */
    static final class C167531 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $groupId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C167531(String str, Continuation<? super C167531> continuation) {
            super(2, continuation);
            this.$groupId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MobileLinkingHostDuxo.this.new C167531(this.$groupId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C167531) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                MobileLinkingHostDuxo.this.mobileLinkingStore.updateSelectedGroupId(this.$groupId);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void setSelectedGroupId(String groupId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C167531(groupId, null), 3, null);
    }

    /* compiled from: MobileLinkingHostDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/feature/linking/MobileLinkingHostDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoActivityCompanion;", "Lcom/robinhood/android/feature/linking/MobileLinkingHostDuxo;", "Lcom/robinhood/android/blackwidow/contracts/MobileLinkingHostIntentKey;", "<init>", "()V", "BTC_UUID", "", "feature-mobile-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion2<MobileLinkingHostDuxo, MobileLinkingHostIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion2
        public MobileLinkingHostIntentKey getExtras(SavedStateHandle savedStateHandle) {
            return (MobileLinkingHostIntentKey) DuxoCompanion2.DefaultImpls.getExtras(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion2
        public MobileLinkingHostIntentKey getExtras(MobileLinkingHostDuxo mobileLinkingHostDuxo) {
            return (MobileLinkingHostIntentKey) DuxoCompanion2.DefaultImpls.getExtras(this, mobileLinkingHostDuxo);
        }
    }
}
