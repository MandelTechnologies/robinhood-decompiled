package com.robinhood.android.acatsin.partials;

import androidx.lifecycle.SavedStateHandle;
import com.adjust.sdk.network.ErrorCodes;
import com.robinhood.android.acatsin.partials.AcatsInBuildPartialDuxo;
import com.robinhood.android.acatsin.partials.AcatsInBuildPartialEvent;
import com.robinhood.android.acatsin.partials.AcatsInBuildPartialFragment;
import com.robinhood.android.acatsin.partials.UiAcatsAsset;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.contentful.StaticContentStore;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.AccountAccessStore;
import com.robinhood.librobinhood.data.store.AccountFeature;
import com.robinhood.models.api.bonfire.ApiAcatsTransfer;
import com.robinhood.models.p320db.Account;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: AcatsInBuildPartialDuxo.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001f2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001\u001fB1\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\u000e\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019J\u0010\u0010\u001c\u001a\u00020\u00152\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/acatsin/partials/AcatsInBuildPartialDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/acatsin/partials/AcatsInBuildPartialDataState;", "Lcom/robinhood/android/acatsin/partials/AcatsInBuildPartialViewState;", "Lcom/robinhood/android/acatsin/partials/AcatsInBuildPartialEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "staticContentStore", "Lcom/robinhood/contentful/StaticContentStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "accountAccessStore", "Lcom/robinhood/librobinhood/data/store/AccountAccessStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/contentful/StaticContentStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/librobinhood/data/store/AccountAccessStore;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "onStart", "addAsset", "asset", "Lcom/robinhood/android/acatsin/partials/UiAcatsAsset;", "updateAsset", "removeAsset", "setAssetFilterType", "assetFilterType", "Lcom/robinhood/models/api/bonfire/ApiAcatsTransfer$Asset$AssetType;", "Companion", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AcatsInBuildPartialDuxo extends BaseDuxo3<AcatsInBuildPartialDataState, AcatsInBuildPartialViewState, AcatsInBuildPartialEvent> implements HasSavedState {
    private final AccountAccessStore accountAccessStore;
    private final AccountProvider accountProvider;
    private final SavedStateHandle savedStateHandle;
    private final StaticContentStore staticContentStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AcatsInBuildPartialDuxo(AccountProvider accountProvider, StaticContentStore staticContentStore, SavedStateHandle savedStateHandle, AccountAccessStore accountAccessStore, DuxoBundle duxoBundle) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(accountAccessStore, "accountAccessStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Companion companion = INSTANCE;
        super(new AcatsInBuildPartialDataState(((AcatsInBuildPartialFragment.Args) companion.getArgs(savedStateHandle)).getBrokerageOrDtcNumber(), ((AcatsInBuildPartialFragment.Args) companion.getArgs(savedStateHandle)).getRhsAccountTitle(), ((AcatsInBuildPartialFragment.Args) companion.getArgs(savedStateHandle)).getSupportedContentTypes(), null, null, null, null, null, null, false, 1016, null), new AcatsInBuildPartialStateProvider(), duxoBundle);
        this.accountProvider = accountProvider;
        this.staticContentStore = staticContentStore;
        this.savedStateHandle = savedStateHandle;
        this.accountAccessStore = accountAccessStore;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        Companion companion = INSTANCE;
        if (((AcatsInBuildPartialFragment.Args) companion.getArgs((HasSavedState) this)).isAcatsRetry()) {
            Iterator<UiAcatsAsset> it = ((AcatsInBuildPartialFragment.Args) companion.getArgs((HasSavedState) this)).getAssets().iterator();
            while (it.hasNext()) {
                addAsset(it.next());
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        Observable<Account> observableStreamIndividualAccount;
        Companion companion = INSTANCE;
        String rhsAccountNumber = ((AcatsInBuildPartialFragment.Args) companion.getArgs((HasSavedState) this)).getRhsAccountNumber();
        if (rhsAccountNumber != null) {
            observableStreamIndividualAccount = this.accountProvider.streamAccountByRhs(rhsAccountNumber);
        } else {
            observableStreamIndividualAccount = this.accountProvider.streamIndividualAccount();
        }
        Observable<R> observableSwitchMap = observableStreamIndividualAccount.switchMap(new Function() { // from class: com.robinhood.android.acatsin.partials.AcatsInBuildPartialDuxo.onStart.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Tuples2<Account, Boolean>> apply(final Account account) {
                Intrinsics.checkNotNullParameter(account, "account");
                AcatsInBuildPartialDuxo acatsInBuildPartialDuxo = AcatsInBuildPartialDuxo.this;
                final Flow<Boolean> featureAccess = acatsInBuildPartialDuxo.accountAccessStore.getFeatureAccess(account, AccountFeature.OPTIONS_HAS_ACCESS);
                return acatsInBuildPartialDuxo.asObservable(new Flow<Tuples2<? extends Account, ? extends Boolean>>() { // from class: com.robinhood.android.acatsin.partials.AcatsInBuildPartialDuxo$onStart$1$apply$$inlined$map$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.acatsin.partials.AcatsInBuildPartialDuxo$onStart$1$apply$$inlined$map$1$2 */
                    public static final class C79542<T> implements FlowCollector {
                        final /* synthetic */ Account $account$inlined;
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.acatsin.partials.AcatsInBuildPartialDuxo$onStart$1$apply$$inlined$map$1$2", m3645f = "AcatsInBuildPartialDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.acatsin.partials.AcatsInBuildPartialDuxo$onStart$1$apply$$inlined$map$1$2$1, reason: invalid class name */
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
                                return C79542.this.emit(null, this);
                            }
                        }

                        public C79542(FlowCollector flowCollector, Account account) {
                            this.$this_unsafeFlow = flowCollector;
                            this.$account$inlined = account;
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
                                Tuples2 tuples2M3642to = Tuples4.m3642to(this.$account$inlined, boxing.boxBoolean(((Boolean) obj).booleanValue()));
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(tuples2M3642to, anonymousClass1) == coroutine_suspended) {
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
                    public Object collect(FlowCollector<? super Tuples2<? extends Account, ? extends Boolean>> flowCollector, Continuation continuation) {
                        Object objCollect = featureAccess.collect(new C79542(flowCollector, account), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                });
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.acatsin.partials.AcatsInBuildPartialDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AcatsInBuildPartialDuxo.onStart$lambda$0(this.f$0, (Tuples2) obj);
            }
        });
        String bannerContentfulId = ((AcatsInBuildPartialFragment.Args) companion.getArgs((HasSavedState) this)).getBannerContentfulId();
        if (bannerContentfulId != null) {
            BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new AcatsInBuildPartialDuxo3(this, bannerContentfulId, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$0(AcatsInBuildPartialDuxo acatsInBuildPartialDuxo, Tuples2 tuples2) {
        Object objComponent1 = tuples2.component1();
        Intrinsics.checkNotNullExpressionValue(objComponent1, "component1(...)");
        acatsInBuildPartialDuxo.applyMutation(new AcatsInBuildPartialDuxo2((Account) objComponent1, ((Boolean) tuples2.component2()).booleanValue(), null));
        return Unit.INSTANCE;
    }

    /* compiled from: AcatsInBuildPartialDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/partials/AcatsInBuildPartialDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.partials.AcatsInBuildPartialDuxo$addAsset$1", m3645f = "AcatsInBuildPartialDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.partials.AcatsInBuildPartialDuxo$addAsset$1 */
    static final class C79551 extends ContinuationImpl7 implements Function2<AcatsInBuildPartialDataState, Continuation<? super AcatsInBuildPartialDataState>, Object> {
        final /* synthetic */ UiAcatsAsset $asset;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AcatsInBuildPartialDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C79551(UiAcatsAsset uiAcatsAsset, AcatsInBuildPartialDuxo acatsInBuildPartialDuxo, Continuation<? super C79551> continuation) {
            super(2, continuation);
            this.$asset = uiAcatsAsset;
            this.this$0 = acatsInBuildPartialDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C79551 c79551 = new C79551(this.$asset, this.this$0, continuation);
            c79551.L$0 = obj;
            return c79551;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AcatsInBuildPartialDataState acatsInBuildPartialDataState, Continuation<? super AcatsInBuildPartialDataState> continuation) {
            return ((C79551) create(acatsInBuildPartialDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AcatsInBuildPartialDataState acatsInBuildPartialDataState = (AcatsInBuildPartialDataState) this.L$0;
            UiAcatsAsset uiAcatsAsset = this.$asset;
            if (uiAcatsAsset instanceof UiAcatsAsset.CashAsset) {
                return AcatsInBuildPartialDataState.copy$default(acatsInBuildPartialDataState, null, null, null, null, null, null, (UiAcatsAsset.CashAsset) uiAcatsAsset, null, null, false, 959, null);
            }
            if (uiAcatsAsset instanceof UiAcatsAsset.EquityAsset) {
                if (acatsInBuildPartialDataState.getEquityAssets$lib_acats_ui_externalDebug().containsKey(((UiAcatsAsset.EquityAsset) this.$asset).getInstrumentId())) {
                    this.this$0.submit(new AcatsInBuildPartialEvent.ConflictingAssetEvent((UiAcatsAsset.EquityAsset) MapsKt.getValue(acatsInBuildPartialDataState.getEquityAssets$lib_acats_ui_externalDebug(), ((UiAcatsAsset.EquityAsset) this.$asset).getInstrumentId())));
                    return AcatsInBuildPartialDataState.copy$default(acatsInBuildPartialDataState, null, null, null, null, null, null, null, null, null, false, 1023, null);
                }
                return AcatsInBuildPartialDataState.copy$default(acatsInBuildPartialDataState, null, null, null, null, null, null, null, MapsKt.plus(acatsInBuildPartialDataState.getEquityAssets$lib_acats_ui_externalDebug(), Tuples4.m3642to(((UiAcatsAsset.EquityAsset) this.$asset).getInstrumentId(), this.$asset)), null, false, 895, null);
            }
            if (!(uiAcatsAsset instanceof UiAcatsAsset.OptionAsset)) {
                throw new NoWhenBranchMatchedException();
            }
            if (acatsInBuildPartialDataState.getOptionAssets$lib_acats_ui_externalDebug().containsKey(((UiAcatsAsset.OptionAsset) this.$asset).getOptionId())) {
                this.this$0.submit(new AcatsInBuildPartialEvent.ConflictingAssetEvent((UiAcatsAsset.OptionAsset) MapsKt.getValue(acatsInBuildPartialDataState.getOptionAssets$lib_acats_ui_externalDebug(), ((UiAcatsAsset.OptionAsset) this.$asset).getOptionId())));
                return AcatsInBuildPartialDataState.copy$default(acatsInBuildPartialDataState, null, null, null, null, null, null, null, null, null, false, 1023, null);
            }
            return AcatsInBuildPartialDataState.copy$default(acatsInBuildPartialDataState, null, null, null, null, null, null, null, null, MapsKt.plus(acatsInBuildPartialDataState.getOptionAssets$lib_acats_ui_externalDebug(), Tuples4.m3642to(((UiAcatsAsset.OptionAsset) this.$asset).getOptionId(), this.$asset)), false, 767, null);
        }
    }

    public final void addAsset(UiAcatsAsset asset) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        applyMutation(new C79551(asset, this, null));
    }

    /* compiled from: AcatsInBuildPartialDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/partials/AcatsInBuildPartialDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.partials.AcatsInBuildPartialDuxo$updateAsset$1", m3645f = "AcatsInBuildPartialDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.partials.AcatsInBuildPartialDuxo$updateAsset$1 */
    static final class C79601 extends ContinuationImpl7 implements Function2<AcatsInBuildPartialDataState, Continuation<? super AcatsInBuildPartialDataState>, Object> {
        final /* synthetic */ UiAcatsAsset $asset;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C79601(UiAcatsAsset uiAcatsAsset, Continuation<? super C79601> continuation) {
            super(2, continuation);
            this.$asset = uiAcatsAsset;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C79601 c79601 = new C79601(this.$asset, continuation);
            c79601.L$0 = obj;
            return c79601;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AcatsInBuildPartialDataState acatsInBuildPartialDataState, Continuation<? super AcatsInBuildPartialDataState> continuation) {
            return ((C79601) create(acatsInBuildPartialDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AcatsInBuildPartialDataState acatsInBuildPartialDataState = (AcatsInBuildPartialDataState) this.L$0;
            final UiAcatsAsset uiAcatsAsset = this.$asset;
            if (uiAcatsAsset instanceof UiAcatsAsset.CashAsset) {
                return AcatsInBuildPartialDataState.copy$default(acatsInBuildPartialDataState, null, null, null, null, null, null, (UiAcatsAsset.CashAsset) uiAcatsAsset, null, null, false, 959, null);
            }
            if (uiAcatsAsset instanceof UiAcatsAsset.EquityAsset) {
                return acatsInBuildPartialDataState.modifyEquityAssetMap(new Function1() { // from class: com.robinhood.android.acatsin.partials.AcatsInBuildPartialDuxo$updateAsset$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return AcatsInBuildPartialDuxo.C79601.invokeSuspend$lambda$0(uiAcatsAsset, (Map) obj2);
                    }
                });
            }
            if (uiAcatsAsset instanceof UiAcatsAsset.OptionAsset) {
                return acatsInBuildPartialDataState.modifyOptionAssetMap(new Function1() { // from class: com.robinhood.android.acatsin.partials.AcatsInBuildPartialDuxo$updateAsset$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return AcatsInBuildPartialDuxo.C79601.invokeSuspend$lambda$1(uiAcatsAsset, (Map) obj2);
                    }
                });
            }
            throw new NoWhenBranchMatchedException();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(UiAcatsAsset uiAcatsAsset, Map map) {
            map.put(((UiAcatsAsset.EquityAsset) uiAcatsAsset).getInstrumentId(), uiAcatsAsset);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(UiAcatsAsset uiAcatsAsset, Map map) {
            map.put(((UiAcatsAsset.OptionAsset) uiAcatsAsset).getOptionId(), uiAcatsAsset);
            return Unit.INSTANCE;
        }
    }

    public final void updateAsset(UiAcatsAsset asset) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        applyMutation(new C79601(asset, null));
    }

    /* compiled from: AcatsInBuildPartialDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/partials/AcatsInBuildPartialDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.partials.AcatsInBuildPartialDuxo$removeAsset$1", m3645f = "AcatsInBuildPartialDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.partials.AcatsInBuildPartialDuxo$removeAsset$1 */
    static final class C79581 extends ContinuationImpl7 implements Function2<AcatsInBuildPartialDataState, Continuation<? super AcatsInBuildPartialDataState>, Object> {
        final /* synthetic */ UiAcatsAsset $asset;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C79581(UiAcatsAsset uiAcatsAsset, Continuation<? super C79581> continuation) {
            super(2, continuation);
            this.$asset = uiAcatsAsset;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C79581 c79581 = new C79581(this.$asset, continuation);
            c79581.L$0 = obj;
            return c79581;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AcatsInBuildPartialDataState acatsInBuildPartialDataState, Continuation<? super AcatsInBuildPartialDataState> continuation) {
            return ((C79581) create(acatsInBuildPartialDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AcatsInBuildPartialDataState acatsInBuildPartialDataState = (AcatsInBuildPartialDataState) this.L$0;
            final UiAcatsAsset uiAcatsAsset = this.$asset;
            if (uiAcatsAsset instanceof UiAcatsAsset.CashAsset) {
                return AcatsInBuildPartialDataState.copy$default(acatsInBuildPartialDataState, null, null, null, null, null, null, null, null, null, false, 959, null);
            }
            if (uiAcatsAsset instanceof UiAcatsAsset.EquityAsset) {
                return acatsInBuildPartialDataState.modifyEquityAssetMap(new Function1() { // from class: com.robinhood.android.acatsin.partials.AcatsInBuildPartialDuxo$removeAsset$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return AcatsInBuildPartialDuxo.C79581.invokeSuspend$lambda$0(uiAcatsAsset, (Map) obj2);
                    }
                });
            }
            if (uiAcatsAsset instanceof UiAcatsAsset.OptionAsset) {
                return acatsInBuildPartialDataState.modifyOptionAssetMap(new Function1() { // from class: com.robinhood.android.acatsin.partials.AcatsInBuildPartialDuxo$removeAsset$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return AcatsInBuildPartialDuxo.C79581.invokeSuspend$lambda$1(uiAcatsAsset, (Map) obj2);
                    }
                });
            }
            throw new NoWhenBranchMatchedException();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(UiAcatsAsset uiAcatsAsset, Map map) {
            map.remove(((UiAcatsAsset.EquityAsset) uiAcatsAsset).getInstrumentId());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(UiAcatsAsset uiAcatsAsset, Map map) {
            map.remove(((UiAcatsAsset.OptionAsset) uiAcatsAsset).getOptionId());
            return Unit.INSTANCE;
        }
    }

    public final void removeAsset(UiAcatsAsset asset) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        applyMutation(new C79581(asset, null));
    }

    /* compiled from: AcatsInBuildPartialDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/partials/AcatsInBuildPartialDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.partials.AcatsInBuildPartialDuxo$setAssetFilterType$1", m3645f = "AcatsInBuildPartialDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.partials.AcatsInBuildPartialDuxo$setAssetFilterType$1 */
    static final class C79591 extends ContinuationImpl7 implements Function2<AcatsInBuildPartialDataState, Continuation<? super AcatsInBuildPartialDataState>, Object> {
        final /* synthetic */ ApiAcatsTransfer.Asset.AssetType $assetFilterType;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C79591(ApiAcatsTransfer.Asset.AssetType assetType, Continuation<? super C79591> continuation) {
            super(2, continuation);
            this.$assetFilterType = assetType;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C79591 c79591 = new C79591(this.$assetFilterType, continuation);
            c79591.L$0 = obj;
            return c79591;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AcatsInBuildPartialDataState acatsInBuildPartialDataState, Continuation<? super AcatsInBuildPartialDataState> continuation) {
            return ((C79591) create(acatsInBuildPartialDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AcatsInBuildPartialDataState.copy$default((AcatsInBuildPartialDataState) this.L$0, null, null, null, null, this.$assetFilterType, null, null, null, null, false, ErrorCodes.IO_EXCEPTION, null);
        }
    }

    public final void setAssetFilterType(ApiAcatsTransfer.Asset.AssetType assetFilterType) {
        applyMutation(new C79591(assetFilterType, null));
    }

    /* compiled from: AcatsInBuildPartialDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/acatsin/partials/AcatsInBuildPartialDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/acatsin/partials/AcatsInBuildPartialDuxo;", "Lcom/robinhood/android/acatsin/partials/AcatsInBuildPartialFragment$Args;", "<init>", "()V", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<AcatsInBuildPartialDuxo, AcatsInBuildPartialFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AcatsInBuildPartialFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (AcatsInBuildPartialFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AcatsInBuildPartialFragment.Args getArgs(AcatsInBuildPartialDuxo acatsInBuildPartialDuxo) {
            return (AcatsInBuildPartialFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, acatsInBuildPartialDuxo);
        }
    }
}
