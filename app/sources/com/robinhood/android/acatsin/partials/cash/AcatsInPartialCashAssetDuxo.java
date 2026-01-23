package com.robinhood.android.acatsin.partials.cash;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.acatsin.partials.UiAcatsAsset;
import com.robinhood.android.acatsin.partials.cash.AcatsInPartialCashAssetEvent;
import com.robinhood.android.acatsin.partials.cash.AcatsInPartialCashAssetFragment;
import com.robinhood.android.lib.margin.LeveredMarginSettingsStore;
import com.robinhood.android.lib.margin.p167db.models.MarginSettings;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.AccountAccessStore;
import com.robinhood.librobinhood.data.store.AccountFeature;
import com.robinhood.models.util.Money;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: AcatsInPartialCashAssetDuxo.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001d2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001\u001dB)\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\u000e\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0019J\u0010\u0010\u001a\u001a\u00020\u00132\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/acatsin/partials/cash/AcatsInPartialCashAssetDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/acatsin/partials/cash/AcatsInPartialCashAssetDataState;", "Lcom/robinhood/android/acatsin/partials/cash/AcatsInPartialCashAssetViewState;", "Lcom/robinhood/android/acatsin/partials/cash/AcatsInPartialCashAssetEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "marginSettingsStore", "Lcom/robinhood/android/lib/margin/LeveredMarginSettingsStore;", "accountAccessStore", "Lcom/robinhood/librobinhood/data/store/AccountAccessStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/lib/margin/LeveredMarginSettingsStore;Lcom/robinhood/librobinhood/data/store/AccountAccessStore;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "updateCashType", "cashType", "Lcom/robinhood/android/acatsin/partials/UiAcatsAsset$CashAsset$CashType;", "updateIsEntireBalance", "isEntireBalance", "", "updateAmountEntered", "amount", "Lcom/robinhood/models/util/Money;", "Companion", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AcatsInPartialCashAssetDuxo extends BaseDuxo3<AcatsInPartialCashAssetDataState, AcatsInPartialCashAssetViewState, AcatsInPartialCashAssetEvent> implements HasSavedState {
    private final AccountAccessStore accountAccessStore;
    private final LeveredMarginSettingsStore marginSettingsStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AcatsInPartialCashAssetDuxo(LeveredMarginSettingsStore marginSettingsStore, AccountAccessStore accountAccessStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(marginSettingsStore, "marginSettingsStore");
        Intrinsics.checkNotNullParameter(accountAccessStore, "accountAccessStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Companion companion = INSTANCE;
        super(new AcatsInPartialCashAssetDataState(((AcatsInPartialCashAssetFragment.Args) companion.getArgs(savedStateHandle)).isMarginSupported(), ((AcatsInPartialCashAssetFragment.Args) companion.getArgs(savedStateHandle)).isMarginPreselected(), ((AcatsInPartialCashAssetFragment.Args) companion.getArgs(savedStateHandle)).getAssetToModify(), false, null, null, null, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, null), new AcatsInPartialCashAssetStateProvider(), duxoBundle);
        this.marginSettingsStore = marginSettingsStore;
        this.accountAccessStore = accountAccessStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        Companion companion = INSTANCE;
        UiAcatsAsset.CashAsset assetToModify = ((AcatsInPartialCashAssetFragment.Args) companion.getArgs((HasSavedState) this)).getAssetToModify();
        if (assetToModify != null) {
            submit(new AcatsInPartialCashAssetEvent.PopulateEditingAssetInfoEvent(assetToModify));
        }
        if (!((AcatsInPartialCashAssetFragment.Args) companion.getArgs((HasSavedState) this)).isMarginSupported()) {
            updateCashType(UiAcatsAsset.CashAsset.CashType.CASH);
        }
        String rhsAccountNumber = ((AcatsInPartialCashAssetFragment.Args) companion.getArgs((HasSavedState) this)).getRhsAccountNumber();
        if (rhsAccountNumber != null) {
            LifecycleHost.DefaultImpls.bind$default(this, this.marginSettingsStore.streamMarginSettings(rhsAccountNumber), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.acatsin.partials.cash.AcatsInPartialCashAssetDuxo$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AcatsInPartialCashAssetDuxo.onStart$lambda$1(this.f$0, (MarginSettings) obj);
                }
            });
            getLifecycleScope().launchWhenStarted(new C79703(rhsAccountNumber, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(AcatsInPartialCashAssetDuxo acatsInPartialCashAssetDuxo, MarginSettings marginSettings) {
        Intrinsics.checkNotNullParameter(marginSettings, "marginSettings");
        acatsInPartialCashAssetDuxo.applyMutation(new AcatsInPartialCashAssetDuxo2(marginSettings, null));
        return Unit.INSTANCE;
    }

    /* compiled from: AcatsInPartialCashAssetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.partials.cash.AcatsInPartialCashAssetDuxo$onStart$3", m3645f = "AcatsInPartialCashAssetDuxo.kt", m3646l = {57}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.partials.cash.AcatsInPartialCashAssetDuxo$onStart$3 */
    static final class C79703 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $rhsAccountNumber;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C79703(String str, Continuation<? super C79703> continuation) {
            super(2, continuation);
            this.$rhsAccountNumber = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AcatsInPartialCashAssetDuxo.this.new C79703(this.$rhsAccountNumber, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C79703) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Boolean> featureAccess = AcatsInPartialCashAssetDuxo.this.accountAccessStore.getFeatureAccess(this.$rhsAccountNumber, AccountFeature.MARGIN);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(AcatsInPartialCashAssetDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(featureAccess, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: AcatsInPartialCashAssetDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "isMarginSupported", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.acatsin.partials.cash.AcatsInPartialCashAssetDuxo$onStart$3$1", m3645f = "AcatsInPartialCashAssetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.acatsin.partials.cash.AcatsInPartialCashAssetDuxo$onStart$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ AcatsInPartialCashAssetDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(AcatsInPartialCashAssetDuxo acatsInPartialCashAssetDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = acatsInPartialCashAssetDuxo;
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

            /* compiled from: AcatsInPartialCashAssetDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/partials/cash/AcatsInPartialCashAssetDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.acatsin.partials.cash.AcatsInPartialCashAssetDuxo$onStart$3$1$1", m3645f = "AcatsInPartialCashAssetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.acatsin.partials.cash.AcatsInPartialCashAssetDuxo$onStart$3$1$1, reason: invalid class name and collision with other inner class name */
            static final class C495081 extends ContinuationImpl7 implements Function2<AcatsInPartialCashAssetDataState, Continuation<? super AcatsInPartialCashAssetDataState>, Object> {
                final /* synthetic */ boolean $isMarginSupported;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C495081(boolean z, Continuation<? super C495081> continuation) {
                    super(2, continuation);
                    this.$isMarginSupported = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C495081 c495081 = new C495081(this.$isMarginSupported, continuation);
                    c495081.L$0 = obj;
                    return c495081;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(AcatsInPartialCashAssetDataState acatsInPartialCashAssetDataState, Continuation<? super AcatsInPartialCashAssetDataState> continuation) {
                    return ((C495081) create(acatsInPartialCashAssetDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return AcatsInPartialCashAssetDataState.copy$default((AcatsInPartialCashAssetDataState) this.L$0, false, false, null, false, null, null, null, this.$isMarginSupported, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C495081(this.Z$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: AcatsInPartialCashAssetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/partials/cash/AcatsInPartialCashAssetDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.partials.cash.AcatsInPartialCashAssetDuxo$updateCashType$1", m3645f = "AcatsInPartialCashAssetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.partials.cash.AcatsInPartialCashAssetDuxo$updateCashType$1 */
    static final class C79721 extends ContinuationImpl7 implements Function2<AcatsInPartialCashAssetDataState, Continuation<? super AcatsInPartialCashAssetDataState>, Object> {
        final /* synthetic */ UiAcatsAsset.CashAsset.CashType $cashType;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AcatsInPartialCashAssetDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C79721(UiAcatsAsset.CashAsset.CashType cashType, AcatsInPartialCashAssetDuxo acatsInPartialCashAssetDuxo, Continuation<? super C79721> continuation) {
            super(2, continuation);
            this.$cashType = cashType;
            this.this$0 = acatsInPartialCashAssetDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C79721 c79721 = new C79721(this.$cashType, this.this$0, continuation);
            c79721.L$0 = obj;
            return c79721;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AcatsInPartialCashAssetDataState acatsInPartialCashAssetDataState, Continuation<? super AcatsInPartialCashAssetDataState> continuation) {
            return ((C79721) create(acatsInPartialCashAssetDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AcatsInPartialCashAssetDataState acatsInPartialCashAssetDataState = (AcatsInPartialCashAssetDataState) this.L$0;
            if (this.$cashType == UiAcatsAsset.CashAsset.CashType.MARGIN && !acatsInPartialCashAssetDataState.isMarginInvestingEnabled()) {
                if (acatsInPartialCashAssetDataState.isMarginSupportedForCurrentRhsAccount()) {
                    this.this$0.submit(new AcatsInPartialCashAssetEvent.ShowMarginDisabledBottomSheetEvent(new AcatsInPartialCashAssetStateProvider().reduce(acatsInPartialCashAssetDataState)));
                }
                return AcatsInPartialCashAssetDataState.copy$default(acatsInPartialCashAssetDataState, false, false, null, false, null, null, null, false, 239, null);
            }
            return AcatsInPartialCashAssetDataState.copy$default(acatsInPartialCashAssetDataState, false, false, null, false, this.$cashType, null, null, false, 239, null);
        }
    }

    public final void updateCashType(UiAcatsAsset.CashAsset.CashType cashType) {
        applyMutation(new C79721(cashType, this, null));
    }

    /* compiled from: AcatsInPartialCashAssetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/partials/cash/AcatsInPartialCashAssetDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.partials.cash.AcatsInPartialCashAssetDuxo$updateIsEntireBalance$1", m3645f = "AcatsInPartialCashAssetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.partials.cash.AcatsInPartialCashAssetDuxo$updateIsEntireBalance$1 */
    static final class C79731 extends ContinuationImpl7 implements Function2<AcatsInPartialCashAssetDataState, Continuation<? super AcatsInPartialCashAssetDataState>, Object> {
        final /* synthetic */ boolean $isEntireBalance;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C79731(boolean z, Continuation<? super C79731> continuation) {
            super(2, continuation);
            this.$isEntireBalance = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C79731 c79731 = new C79731(this.$isEntireBalance, continuation);
            c79731.L$0 = obj;
            return c79731;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AcatsInPartialCashAssetDataState acatsInPartialCashAssetDataState, Continuation<? super AcatsInPartialCashAssetDataState> continuation) {
            return ((C79731) create(acatsInPartialCashAssetDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AcatsInPartialCashAssetDataState.copy$default((AcatsInPartialCashAssetDataState) this.L$0, false, false, null, false, null, boxing.boxBoolean(this.$isEntireBalance), null, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, null);
        }
    }

    public final void updateIsEntireBalance(boolean isEntireBalance) {
        applyMutation(new C79731(isEntireBalance, null));
    }

    /* compiled from: AcatsInPartialCashAssetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/partials/cash/AcatsInPartialCashAssetDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.partials.cash.AcatsInPartialCashAssetDuxo$updateAmountEntered$1", m3645f = "AcatsInPartialCashAssetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.partials.cash.AcatsInPartialCashAssetDuxo$updateAmountEntered$1 */
    static final class C79711 extends ContinuationImpl7 implements Function2<AcatsInPartialCashAssetDataState, Continuation<? super AcatsInPartialCashAssetDataState>, Object> {
        final /* synthetic */ Money $amount;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C79711(Money money, Continuation<? super C79711> continuation) {
            super(2, continuation);
            this.$amount = money;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C79711 c79711 = new C79711(this.$amount, continuation);
            c79711.L$0 = obj;
            return c79711;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AcatsInPartialCashAssetDataState acatsInPartialCashAssetDataState, Continuation<? super AcatsInPartialCashAssetDataState> continuation) {
            return ((C79711) create(acatsInPartialCashAssetDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AcatsInPartialCashAssetDataState.copy$default((AcatsInPartialCashAssetDataState) this.L$0, false, false, null, false, null, null, this.$amount, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, null);
        }
    }

    public final void updateAmountEntered(Money amount) {
        applyMutation(new C79711(amount, null));
    }

    /* compiled from: AcatsInPartialCashAssetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/acatsin/partials/cash/AcatsInPartialCashAssetDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/acatsin/partials/cash/AcatsInPartialCashAssetDuxo;", "Lcom/robinhood/android/acatsin/partials/cash/AcatsInPartialCashAssetFragment$Args;", "<init>", "()V", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<AcatsInPartialCashAssetDuxo, AcatsInPartialCashAssetFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AcatsInPartialCashAssetFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (AcatsInPartialCashAssetFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AcatsInPartialCashAssetFragment.Args getArgs(AcatsInPartialCashAssetDuxo acatsInPartialCashAssetDuxo) {
            return (AcatsInPartialCashAssetFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, acatsInPartialCashAssetDuxo);
        }
    }
}
