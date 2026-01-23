package com.robinhood.android.transfers.recurring.p270ui.experiment.extracash.accountselection;

import accio.service.p003v1.LinkedAccountDto;
import androidx.lifecycle.SavedStateHandle;
import bff_money_movement.service.p019v1.BffMoneyMovementService;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoHasArgsCompanion;
import com.robinhood.android.udf.HasArgs;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.AchRelationshipStore;
import com.robinhood.librobinhood.data.store.AutomaticDepositStore;
import com.robinhood.librobinhood.data.store.bonfire.TransferAccountStore;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.api.cashier.AchRelationshipVerificationMethod;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.models.p355ui.AutomaticDepositWithBankInfo;
import com.robinhood.utils.Either;
import io.reactivex.Observable;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import p479j$.time.Clock;
import p479j$.time.Instant;

/* compiled from: RecurringDepositExtraCashAccountSelectionDuxo.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 (2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00050\u0004:\u0001(BI\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001f\u001a\u00020\u00182\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001b¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\"R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010#R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010$R\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010%\u001a\u0004\b&\u0010'¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/accountselection/RecurringDepositExtraCashAccountSelectionDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/accountselection/RecurringDepositExtraCashAccountSelectionDataState;", "Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/accountselection/RecurringDepositExtraCashAccountSelectionViewState;", "Lcom/robinhood/android/udf/HasArgs;", "Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/accountselection/AccountType;", "Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;", "achRelationshipStore", "Lcom/robinhood/librobinhood/data/store/AutomaticDepositStore;", "automaticDepositStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;", "transferAccountStore", "Lbff_money_movement/service/v1/BffMoneyMovementService;", "bffMoneyMovementService", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/accountselection/RecurringDepositExtraCashAccountSelectionStateProvider;", "stateProvider", "<init>", "(Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;Lcom/robinhood/librobinhood/data/store/AutomaticDepositStore;Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;Lbff_money_movement/service/v1/BffMoneyMovementService;Landroidx/lifecycle/SavedStateHandle;Lj$/time/Clock;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/accountselection/RecurringDepositExtraCashAccountSelectionStateProvider;)V", "", "onResume", "()V", "Lcom/robinhood/utils/Either;", "Lcom/robinhood/models/db/AchRelationship;", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "account", "onAccountSelected", "(Lcom/robinhood/utils/Either;)V", "Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;", "Lcom/robinhood/librobinhood/data/store/AutomaticDepositStore;", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;", "Lbff_money_movement/service/v1/BffMoneyMovementService;", "Landroidx/lifecycle/SavedStateHandle;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "Companion", "feature-recurring-deposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class RecurringDepositExtraCashAccountSelectionDuxo extends BaseDuxo<RecurringDepositExtraCashAccountSelectionDataState, RecurringDepositExtraCashAccountSelectionViewState> implements HasArgs<AccountType> {
    private final AchRelationshipStore achRelationshipStore;
    private final AutomaticDepositStore automaticDepositStore;
    private final BffMoneyMovementService bffMoneyMovementService;
    private final SavedStateHandle savedStateHandle;
    private final TransferAccountStore transferAccountStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: RecurringDepositExtraCashAccountSelectionDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AccountType.values().length];
            try {
                iArr[AccountType.INTERNAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AccountType.EXTERNAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.udf.HasArgs
    public AccountType getArgs(SavedStateHandle savedStateHandle) {
        return (AccountType) HasArgs.DefaultImpls.getArgs(this, savedStateHandle);
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public RecurringDepositExtraCashAccountSelectionDuxo(AchRelationshipStore achRelationshipStore, AutomaticDepositStore automaticDepositStore, TransferAccountStore transferAccountStore, BffMoneyMovementService bffMoneyMovementService, SavedStateHandle savedStateHandle, Clock clock, DuxoBundle duxoBundle, RecurringDepositExtraCashAccountSelectionStateProvider stateProvider) {
        Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
        Intrinsics.checkNotNullParameter(automaticDepositStore, "automaticDepositStore");
        Intrinsics.checkNotNullParameter(transferAccountStore, "transferAccountStore");
        Intrinsics.checkNotNullParameter(bffMoneyMovementService, "bffMoneyMovementService");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Instant instantNow = Instant.now(clock);
        Intrinsics.checkNotNullExpressionValue(instantNow, "now(...)");
        super(new RecurringDepositExtraCashAccountSelectionDataState(null, null, null, instantNow, null, null, 55, null), stateProvider, duxoBundle);
        this.achRelationshipStore = achRelationshipStore;
        this.automaticDepositStore = automaticDepositStore;
        this.transferAccountStore = transferAccountStore;
        this.bffMoneyMovementService = bffMoneyMovementService;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onResume() {
        super.onResume();
        int i = WhenMappings.$EnumSwitchMapping$0[((AccountType) INSTANCE.getArgs((HasArgs) this)).ordinal()];
        if (i == 1) {
            Observable<R> map = this.transferAccountStore.fetchIfStaleThenStream().map(new Function() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.extracash.accountselection.RecurringDepositExtraCashAccountSelectionDuxo.onResume.1
                @Override // io.reactivex.functions.Function
                public final List<TransferAccount> apply(List<TransferAccount> accounts2) {
                    Intrinsics.checkNotNullParameter(accounts2, "accounts");
                    ArrayList arrayList = new ArrayList();
                    for (T t : accounts2) {
                        TransferAccount transferAccount = (TransferAccount) t;
                        if (transferAccount.getType() == ApiTransferAccount.TransferAccountType.RHS || transferAccount.getType() == ApiTransferAccount.TransferAccountType.JOINT_TENANCY_WITH_ROS) {
                            if (!transferAccount.isManaged() && transferAccount.getStatus() == ApiTransferAccount.TransferAccountStatus.APPROVED) {
                                arrayList.add(t);
                            }
                        }
                    }
                    return arrayList;
                }
            });
            Intrinsics.checkNotNullExpressionValue(map, "map(...)");
            LifecycleHost.DefaultImpls.bind$default(this, map, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.extracash.accountselection.RecurringDepositExtraCashAccountSelectionDuxo$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RecurringDepositExtraCashAccountSelectionDuxo.onResume$lambda$0(this.f$0, (List) obj);
                }
            });
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            Observable observableRefCount = this.achRelationshipStore.getLinkedAchRelationships().map(new Function() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.extracash.accountselection.RecurringDepositExtraCashAccountSelectionDuxo$onResume$linkedAchRelationships$1
                @Override // io.reactivex.functions.Function
                public final List<AchRelationship> apply(List<AchRelationship> linkedAchRelationships) {
                    Intrinsics.checkNotNullParameter(linkedAchRelationships, "linkedAchRelationships");
                    ArrayList arrayList = new ArrayList();
                    for (T t : linkedAchRelationships) {
                        if (((AchRelationship) t).getVerificationMethod() == AchRelationshipVerificationMethod.BANK_AUTH) {
                            arrayList.add(t);
                        }
                    }
                    return arrayList;
                }
            }).replay(1).refCount();
            Intrinsics.checkNotNullExpressionValue(observableRefCount, "refCount(...)");
            AchRelationshipStore.refresh$default(this.achRelationshipStore, false, 1, null);
            LifecycleHost.DefaultImpls.bind$default(this, observableRefCount, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.extracash.accountselection.RecurringDepositExtraCashAccountSelectionDuxo$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RecurringDepositExtraCashAccountSelectionDuxo.onResume$lambda$1(this.f$0, (List) obj);
                }
            });
            Observable observableSwitchMapSingle = observableRefCount.map(new Function() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.extracash.accountselection.RecurringDepositExtraCashAccountSelectionDuxo.onResume.4
                @Override // io.reactivex.functions.Function
                public final List<String> apply(List<AchRelationship> achRelationships) {
                    Intrinsics.checkNotNullParameter(achRelationships, "achRelationships");
                    List<AchRelationship> list = achRelationships;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((AchRelationship) it.next()).getId().toString());
                    }
                    return arrayList;
                }
            }).distinctUntilChanged().switchMapSingle(new Function() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.extracash.accountselection.RecurringDepositExtraCashAccountSelectionDuxo.onResume.5

                /* compiled from: RecurringDepositExtraCashAccountSelectionDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "", "", "Laccio/service/v1/LinkedAccountDto;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.transfers.recurring.ui.experiment.extracash.accountselection.RecurringDepositExtraCashAccountSelectionDuxo$onResume$5$1", m3645f = "RecurringDepositExtraCashAccountSelectionDuxo.kt", m3646l = {94}, m3647m = "invokeSuspend")
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.transfers.recurring.ui.experiment.extracash.accountselection.RecurringDepositExtraCashAccountSelectionDuxo$onResume$5$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Map<String, ? extends LinkedAccountDto>>, Object> {
                    final /* synthetic */ List<String> $bankAccountIds;
                    int label;
                    final /* synthetic */ RecurringDepositExtraCashAccountSelectionDuxo this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(RecurringDepositExtraCashAccountSelectionDuxo recurringDepositExtraCashAccountSelectionDuxo, List<String> list, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.this$0 = recurringDepositExtraCashAccountSelectionDuxo;
                        this.$bankAccountIds = list;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new AnonymousClass1(this.this$0, this.$bankAccountIds, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Map<String, ? extends LinkedAccountDto>> continuation) {
                        return invoke2(coroutineScope, (Continuation<? super Map<String, LinkedAccountDto>>) continuation);
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Map<String, LinkedAccountDto>> continuation) {
                        return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            BffMoneyMovementService bffMoneyMovementService = this.this$0.bffMoneyMovementService;
                            List<String> list = this.$bankAccountIds;
                            Intrinsics.checkNotNull(list);
                            this.label = 1;
                            obj = GetAccioAccounts.getAccioAccounts(bffMoneyMovementService, list, this);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        Iterable iterable = (Iterable) obj;
                        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(iterable, 10)), 16));
                        for (T t : iterable) {
                            linkedHashMap.put(((LinkedAccountDto) t).getId(), t);
                        }
                        return linkedHashMap;
                    }
                }

                @Override // io.reactivex.functions.Function
                public final SingleSource<? extends Map<String, LinkedAccountDto>> apply(List<String> bankAccountIds) {
                    Intrinsics.checkNotNullParameter(bankAccountIds, "bankAccountIds");
                    RecurringDepositExtraCashAccountSelectionDuxo recurringDepositExtraCashAccountSelectionDuxo = RecurringDepositExtraCashAccountSelectionDuxo.this;
                    return RxFactory.DefaultImpls.rxSingle$default(recurringDepositExtraCashAccountSelectionDuxo, null, new AnonymousClass1(recurringDepositExtraCashAccountSelectionDuxo, bankAccountIds, null), 1, null);
                }
            });
            Intrinsics.checkNotNullExpressionValue(observableSwitchMapSingle, "switchMapSingle(...)");
            LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMapSingle, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.extracash.accountselection.RecurringDepositExtraCashAccountSelectionDuxo$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RecurringDepositExtraCashAccountSelectionDuxo.onResume$lambda$2(this.f$0, (Map) obj);
                }
            });
            Observable<R> map2 = this.automaticDepositStore.getAutomaticDeposits().map(new Function() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.extracash.accountselection.RecurringDepositExtraCashAccountSelectionDuxo.onResume.7
                @Override // io.reactivex.functions.Function
                public final Map<String, List<AutomaticDepositWithBankInfo>> apply(List<AutomaticDepositWithBankInfo> automaticDeposit) {
                    Intrinsics.checkNotNullParameter(automaticDeposit, "automaticDeposit");
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (T t : automaticDeposit) {
                        String achRelationshipId = ((AutomaticDepositWithBankInfo) t).getAutomaticDeposit().getAchRelationshipId();
                        Object arrayList = linkedHashMap.get(achRelationshipId);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            linkedHashMap.put(achRelationshipId, arrayList);
                        }
                        ((List) arrayList).add(t);
                    }
                    return linkedHashMap;
                }
            });
            Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
            LifecycleHost.DefaultImpls.bind$default(this, map2, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.extracash.accountselection.RecurringDepositExtraCashAccountSelectionDuxo$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RecurringDepositExtraCashAccountSelectionDuxo.onResume$lambda$3(this.f$0, (Map) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$0(RecurringDepositExtraCashAccountSelectionDuxo recurringDepositExtraCashAccountSelectionDuxo, List list) {
        recurringDepositExtraCashAccountSelectionDuxo.applyMutation(new RecurringDepositExtraCashAccountSelectionDuxo2(list, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$1(RecurringDepositExtraCashAccountSelectionDuxo recurringDepositExtraCashAccountSelectionDuxo, List list) {
        recurringDepositExtraCashAccountSelectionDuxo.applyMutation(new RecurringDepositExtraCashAccountSelectionDuxo3(list, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$2(RecurringDepositExtraCashAccountSelectionDuxo recurringDepositExtraCashAccountSelectionDuxo, Map map) {
        recurringDepositExtraCashAccountSelectionDuxo.applyMutation(new RecurringDepositExtraCashAccountSelectionDuxo4(map, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$3(RecurringDepositExtraCashAccountSelectionDuxo recurringDepositExtraCashAccountSelectionDuxo, Map map) {
        recurringDepositExtraCashAccountSelectionDuxo.applyMutation(new RecurringDepositExtraCashAccountSelectionDuxo5(map, null));
        return Unit.INSTANCE;
    }

    /* compiled from: RecurringDepositExtraCashAccountSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/accountselection/RecurringDepositExtraCashAccountSelectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.recurring.ui.experiment.extracash.accountselection.RecurringDepositExtraCashAccountSelectionDuxo$onAccountSelected$1", m3645f = "RecurringDepositExtraCashAccountSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.recurring.ui.experiment.extracash.accountselection.RecurringDepositExtraCashAccountSelectionDuxo$onAccountSelected$1 */
    static final class C305071 extends ContinuationImpl7 implements Function2<RecurringDepositExtraCashAccountSelectionDataState, Continuation<? super RecurringDepositExtraCashAccountSelectionDataState>, Object> {
        final /* synthetic */ Either<AchRelationship, TransferAccount> $account;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C305071(Either<AchRelationship, TransferAccount> either, Continuation<? super C305071> continuation) {
            super(2, continuation);
            this.$account = either;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C305071 c305071 = new C305071(this.$account, continuation);
            c305071.L$0 = obj;
            return c305071;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(RecurringDepositExtraCashAccountSelectionDataState recurringDepositExtraCashAccountSelectionDataState, Continuation<? super RecurringDepositExtraCashAccountSelectionDataState> continuation) {
            return ((C305071) create(recurringDepositExtraCashAccountSelectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            RecurringDepositExtraCashAccountSelectionDataState recurringDepositExtraCashAccountSelectionDataState = (RecurringDepositExtraCashAccountSelectionDataState) this.L$0;
            Either<AchRelationship, TransferAccount> either = this.$account;
            if (either instanceof Either.Left) {
                return RecurringDepositExtraCashAccountSelectionDataState.copy$default(recurringDepositExtraCashAccountSelectionDataState, null, null, null, null, (AchRelationship) ((Either.Left) either).getValue(), null, 47, null);
            }
            if (either instanceof Either.Right) {
                return RecurringDepositExtraCashAccountSelectionDataState.copy$default(recurringDepositExtraCashAccountSelectionDataState, null, null, null, null, null, (TransferAccount) ((Either.Right) either).getValue(), 31, null);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public final void onAccountSelected(Either<AchRelationship, TransferAccount> account) {
        Intrinsics.checkNotNullParameter(account, "account");
        applyMutation(new C305071(account, null));
    }

    /* compiled from: RecurringDepositExtraCashAccountSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/accountselection/RecurringDepositExtraCashAccountSelectionDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoHasArgsCompanion;", "Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/accountselection/RecurringDepositExtraCashAccountSelectionDuxo;", "Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/accountselection/AccountType;", "<init>", "()V", "feature-recurring-deposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoHasArgsCompanion<RecurringDepositExtraCashAccountSelectionDuxo, AccountType> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public AccountType getArgs(SavedStateHandle savedStateHandle) {
            return (AccountType) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public AccountType getArgs(RecurringDepositExtraCashAccountSelectionDuxo recurringDepositExtraCashAccountSelectionDuxo) {
            return (AccountType) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, recurringDepositExtraCashAccountSelectionDuxo);
        }
    }
}
