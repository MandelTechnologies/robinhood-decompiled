package com.robinhood.android.common.recurring.schedule;

import android.text.Spanned;
import androidx.lifecycle.SavedStateHandle;
import com.jakewharton.rxrelay2.PublishRelay;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.recurring.schedule.RecurringOrderScheduleDuxo;
import com.robinhood.android.common.recurring.schedule.RecurringOrderScheduleFragment;
import com.robinhood.android.common.recurring.schedule.RecurringOrderScheduleViewState;
import com.robinhood.android.recurring.contracts.investflow.InvestFlowFrequency;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.contentful.StaticContentStore;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.repository.ContentRepository;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedMaybe;
import com.robinhood.librobinhood.data.store.EtpDetailsStore;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore;
import com.robinhood.librobinhood.data.store.bonfire.DirectDepositRelationshipStore;
import com.robinhood.librobinhood.data.store.bonfire.RhyAccountStore;
import com.robinhood.models.api.ApiRecurringHookStartDate;
import com.robinhood.models.entity.RhEntity;
import com.robinhood.models.p320db.EtpDetails;
import com.robinhood.models.p320db.EtpDocuments;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.bonfire.RhyAccount;
import com.robinhood.recurring.models.RecurringInvestmentsConstants;
import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import com.robinhood.recurring.models.api.ApiNextInvestmentDate;
import com.robinhood.recurring.models.p365db.InvestmentSchedule;
import com.robinhood.staticcontent.model.disclosure.Disclosure;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesKt;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import io.noties.markwon.Markwon;
import io.reactivex.Maybe;
import io.reactivex.MaybeSource;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import p479j$.time.LocalDate;

/* compiled from: RecurringOrderScheduleDuxo.kt */
@Metadata(m3635d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 A2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002BABI\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001c\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\u001f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b!\u0010\"J\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$2\u0006\u0010#\u001a\u00020 H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020(H\u0016¢\u0006\u0004\b+\u0010*J\u0017\u0010,\u001a\u00020(2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b,\u0010-J\u0015\u0010/\u001a\u00020(2\u0006\u0010.\u001a\u00020\u0019¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020(¢\u0006\u0004\b1\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00102R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00103R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00104R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00105R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00106R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00107R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00108R\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u00109\u001a\u0004\b:\u0010;R\"\u0010>\u001a\u0010\u0012\f\u0012\n =*\u0004\u0018\u00010\u00190\u00190<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\"\u0010@\u001a\u0010\u0012\f\u0012\n =*\u0004\u0018\u00010(0(0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010?¨\u0006C"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "Lcom/robinhood/librobinhood/data/store/bonfire/DirectDepositRelationshipStore;", "directDepositRelationshipStore", "Lcom/robinhood/librobinhood/data/store/TraderInvestmentScheduleStore;", "investmentScheduleStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "rhyAccountStore", "Lcom/robinhood/contentful/StaticContentStore;", "staticContentStore", "Lcom/robinhood/librobinhood/data/store/EtpDetailsStore;", "etpDetailsStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "instrumentStore", "Lio/noties/markwon/Markwon;", "markwon", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/DirectDepositRelationshipStore;Lcom/robinhood/librobinhood/data/store/TraderInvestmentScheduleStore;Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;Lcom/robinhood/contentful/StaticContentStore;Lcom/robinhood/librobinhood/data/store/EtpDetailsStore;Lcom/robinhood/librobinhood/data/store/InstrumentStore;Lio/noties/markwon/Markwon;Landroidx/lifecycle/SavedStateHandle;)V", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "frequency", "Lio/reactivex/Maybe;", "j$/time/LocalDate", "getInvestmentDateForRecurringHook", "(Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;)Lio/reactivex/Maybe;", InquiryField.DateField.TYPE, "getDeterminedInvestmentStartDate", "(Lj$/time/LocalDate;)Lio/reactivex/Maybe;", "state", "Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleDuxo$UpdateInvestmentScheduleArgs;", "getUpdateInvestmentScheduleArgs", "(Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleViewState;)Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleDuxo$UpdateInvestmentScheduleArgs;", "args", "Lio/reactivex/Observable;", "Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleViewState$UpdateInvestmentScheduleResult;", "getUpdateInvestmentScheduleObservable", "(Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleDuxo$UpdateInvestmentScheduleArgs;)Lio/reactivex/Observable;", "", "onCreate", "()V", "onStart", "setFrequency", "(Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;)V", "userSelectedStartDate", "setUserSelectedStartDate", "(Lj$/time/LocalDate;)V", "updateInvestmentSchedule", "Lcom/robinhood/librobinhood/data/store/bonfire/DirectDepositRelationshipStore;", "Lcom/robinhood/librobinhood/data/store/TraderInvestmentScheduleStore;", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "Lcom/robinhood/contentful/StaticContentStore;", "Lcom/robinhood/librobinhood/data/store/EtpDetailsStore;", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "Lio/noties/markwon/Markwon;", "Landroidx/lifecycle/SavedStateHandle;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "Lcom/jakewharton/rxrelay2/PublishRelay;", "kotlin.jvm.PlatformType", "userSelectedStartDateRelay", "Lcom/jakewharton/rxrelay2/PublishRelay;", "completeScheduleSelectionRelay", "Companion", "UpdateInvestmentScheduleArgs", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class RecurringOrderScheduleDuxo extends OldBaseDuxo<RecurringOrderScheduleViewState> implements HasSavedState {
    private final PublishRelay<Unit> completeScheduleSelectionRelay;
    private final DirectDepositRelationshipStore directDepositRelationshipStore;
    private final EtpDetailsStore etpDetailsStore;
    private final InstrumentStore instrumentStore;
    private final TraderInvestmentScheduleStore investmentScheduleStore;
    private final Markwon markwon;
    private final RhyAccountStore rhyAccountStore;
    private final SavedStateHandle savedStateHandle;
    private final StaticContentStore staticContentStore;
    private final PublishRelay<LocalDate> userSelectedStartDateRelay;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecurringOrderScheduleDuxo(DirectDepositRelationshipStore directDepositRelationshipStore, TraderInvestmentScheduleStore investmentScheduleStore, RhyAccountStore rhyAccountStore, StaticContentStore staticContentStore, EtpDetailsStore etpDetailsStore, InstrumentStore instrumentStore, Markwon markwon, SavedStateHandle savedStateHandle) {
        super(new RecurringOrderScheduleViewState(((RecurringOrderScheduleFragment.Args) INSTANCE.getArgs(savedStateHandle)).getAssetType(), false, null, null, false, null, null, null, null, null, null, null, 4094, null), null, 2, null);
        Intrinsics.checkNotNullParameter(directDepositRelationshipStore, "directDepositRelationshipStore");
        Intrinsics.checkNotNullParameter(investmentScheduleStore, "investmentScheduleStore");
        Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
        Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
        Intrinsics.checkNotNullParameter(etpDetailsStore, "etpDetailsStore");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(markwon, "markwon");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.directDepositRelationshipStore = directDepositRelationshipStore;
        this.investmentScheduleStore = investmentScheduleStore;
        this.rhyAccountStore = rhyAccountStore;
        this.staticContentStore = staticContentStore;
        this.etpDetailsStore = etpDetailsStore;
        this.instrumentStore = instrumentStore;
        this.markwon = markwon;
        this.savedStateHandle = savedStateHandle;
        PublishRelay<LocalDate> publishRelayCreate = PublishRelay.create();
        Intrinsics.checkNotNullExpressionValue(publishRelayCreate, "create(...)");
        this.userSelectedStartDateRelay = publishRelayCreate;
        PublishRelay<Unit> publishRelayCreate2 = PublishRelay.create();
        Intrinsics.checkNotNullExpressionValue(publishRelayCreate2, "create(...)");
        this.completeScheduleSelectionRelay = publishRelayCreate2;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        Maybe<LocalDate> determinedInvestmentStartDate;
        final RecurringOrderScheduleFragment.Args args = (RecurringOrderScheduleFragment.Args) INSTANCE.getArgs((HasSavedState) this);
        if (args instanceof RecurringOrderScheduleFragment.Args.Create) {
            this.directDepositRelationshipStore.getHasDirectDepositRelationships(RhEntity.RHY).subscribe(new C117001());
            if (((RecurringOrderScheduleFragment.Args.Create) args).getIsFromHook()) {
                determinedInvestmentStartDate = getInvestmentDateForRecurringHook$default(this, null, 1, null);
            } else {
                determinedInvestmentStartDate = getDeterminedInvestmentStartDate(InvestFlowFrequency.Companion.defaultInvestmentStartDate$default(InvestFlowFrequency.INSTANCE, null, 1, null));
            }
            ScopedMaybe.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, determinedInvestmentStartDate, (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.common.recurring.schedule.RecurringOrderScheduleDuxo$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RecurringOrderScheduleDuxo.onCreate$lambda$1(this.f$0, args, (LocalDate) obj);
                }
            }, null, new Function0() { // from class: com.robinhood.android.common.recurring.schedule.RecurringOrderScheduleDuxo$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RecurringOrderScheduleDuxo.onCreate$lambda$3(this.f$0, args);
                }
            }, 2, null);
            return;
        }
        if (!(args instanceof RecurringOrderScheduleFragment.Args.Edit)) {
            throw new NoWhenBranchMatchedException();
        }
        applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.schedule.RecurringOrderScheduleDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderScheduleDuxo.onCreate$lambda$4(args, (RecurringOrderScheduleViewState) obj);
            }
        });
    }

    /* compiled from: RecurringOrderScheduleDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.recurring.schedule.RecurringOrderScheduleDuxo$onCreate$1 */
    static final class C117001<T> implements Consumer {
        C117001() {
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(final Boolean bool) {
            RecurringOrderScheduleDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.schedule.RecurringOrderScheduleDuxo$onCreate$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RecurringOrderScheduleDuxo.C117001.accept$lambda$0(bool, (RecurringOrderScheduleViewState) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final RecurringOrderScheduleViewState accept$lambda$0(Boolean bool, RecurringOrderScheduleViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            Intrinsics.checkNotNull(bool);
            return RecurringOrderScheduleViewState.copy$default(applyMutation, null, false, null, null, bool.booleanValue(), null, null, null, null, null, null, null, 4079, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(RecurringOrderScheduleDuxo recurringOrderScheduleDuxo, final RecurringOrderScheduleFragment.Args args, final LocalDate nextInvestmentDate) {
        Intrinsics.checkNotNullParameter(nextInvestmentDate, "nextInvestmentDate");
        recurringOrderScheduleDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.schedule.RecurringOrderScheduleDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderScheduleDuxo.onCreate$lambda$1$lambda$0(args, nextInvestmentDate, (RecurringOrderScheduleViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringOrderScheduleViewState onCreate$lambda$1$lambda$0(RecurringOrderScheduleFragment.Args args, LocalDate localDate, RecurringOrderScheduleViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        RecurringOrderScheduleFragment.Args.Create create = (RecurringOrderScheduleFragment.Args.Create) args;
        return RecurringOrderScheduleViewState.copy$default(applyMutation, null, false, localDate, create, false, null, null, create.getLoggingReferrer(), create.getLoggingEntryPoint(), null, null, null, 3699, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$3(RecurringOrderScheduleDuxo recurringOrderScheduleDuxo, final RecurringOrderScheduleFragment.Args args) {
        recurringOrderScheduleDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.schedule.RecurringOrderScheduleDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderScheduleDuxo.onCreate$lambda$3$lambda$2(args, (RecurringOrderScheduleViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringOrderScheduleViewState onCreate$lambda$3$lambda$2(RecurringOrderScheduleFragment.Args args, RecurringOrderScheduleViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        RecurringOrderScheduleFragment.Args.Create create = (RecurringOrderScheduleFragment.Args.Create) args;
        return RecurringOrderScheduleViewState.copy$default(applyMutation, null, false, null, args, false, null, null, create.getLoggingReferrer(), create.getLoggingEntryPoint(), null, null, null, 3703, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringOrderScheduleViewState onCreate$lambda$4(RecurringOrderScheduleFragment.Args args, RecurringOrderScheduleViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        RecurringOrderScheduleFragment.Args.Edit edit = (RecurringOrderScheduleFragment.Args.Edit) args;
        LocalDate nextInvestmentDate = edit.getNextInvestmentDate();
        if (nextInvestmentDate == null) {
            nextInvestmentDate = applyMutation.getNextInvestmentDate();
        }
        return RecurringOrderScheduleViewState.copy$default(applyMutation, null, false, nextInvestmentDate, edit, false, edit.getFrequency(), null, edit.getLoggingReferrer(), edit.getLoggingEntryPoint(), null, null, null, 3667, null);
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        Observable<R> observableSwitchMapMaybe = this.userSelectedStartDateRelay.distinctUntilChanged().switchMapMaybe(new Function() { // from class: com.robinhood.android.common.recurring.schedule.RecurringOrderScheduleDuxo.onStart.1
            @Override // io.reactivex.functions.Function
            public final MaybeSource<? extends LocalDate> apply(LocalDate date) {
                Intrinsics.checkNotNullParameter(date, "date");
                return RecurringOrderScheduleDuxo.this.getDeterminedInvestmentStartDate(date);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMapMaybe, "switchMapMaybe(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMapMaybe, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.recurring.schedule.RecurringOrderScheduleDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderScheduleDuxo.onStart$lambda$6(this.f$0, (LocalDate) obj);
            }
        });
        Observable<R> map = getStates().map(new Function() { // from class: com.robinhood.android.common.recurring.schedule.RecurringOrderScheduleDuxo$onStart$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((RecurringOrderScheduleViewState) it).getUpdateNextInvestmentDateForHook());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((RecurringOrderScheduleDuxo$onStart$$inlined$mapNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableSwitchMapMaybe2 = ObservablesKt.filterIsPresent(map).distinctUntilChanged().switchMapMaybe(new Function() { // from class: com.robinhood.android.common.recurring.schedule.RecurringOrderScheduleDuxo.onStart.4
            @Override // io.reactivex.functions.Function
            public final MaybeSource<? extends LocalDate> apply(RecurringOrderScheduleViewState.UpdateNextInvestmentDateForHook updateNextInvestmentDateForHook) {
                Intrinsics.checkNotNullParameter(updateNextInvestmentDateForHook, "<destruct>");
                return RecurringOrderScheduleDuxo.this.getInvestmentDateForRecurringHook(updateNextInvestmentDateForHook.getFrequency());
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMapMaybe2, "switchMapMaybe(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMapMaybe2, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.recurring.schedule.RecurringOrderScheduleDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderScheduleDuxo.onStart$lambda$8(this.f$0, (LocalDate) obj);
            }
        });
        Observable<R> map2 = getStates().map(new Function() { // from class: com.robinhood.android.common.recurring.schedule.RecurringOrderScheduleDuxo$onStart$$inlined$mapNotNull$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(this.$receiver$inlined.getUpdateInvestmentScheduleArgs((RecurringOrderScheduleViewState) it));
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((RecurringOrderScheduleDuxo$onStart$$inlined$mapNotNull$2<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        Observable observableSwitchMap = io.reactivex.rxkotlin.ObservablesKt.withLatestFrom(this.completeScheduleSelectionRelay, ObservablesKt.filterIsPresent(map2)).switchMap(new Function() { // from class: com.robinhood.android.common.recurring.schedule.RecurringOrderScheduleDuxo.onStart.6
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends RecurringOrderScheduleViewState.UpdateInvestmentScheduleResult> apply(Tuples2<Unit, UpdateInvestmentScheduleArgs> tuples2) {
                Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                UpdateInvestmentScheduleArgs updateInvestmentScheduleArgsComponent2 = tuples2.component2();
                RecurringOrderScheduleDuxo recurringOrderScheduleDuxo = RecurringOrderScheduleDuxo.this;
                Intrinsics.checkNotNull(updateInvestmentScheduleArgsComponent2);
                return recurringOrderScheduleDuxo.getUpdateInvestmentScheduleObservable(updateInvestmentScheduleArgsComponent2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.recurring.schedule.RecurringOrderScheduleDuxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderScheduleDuxo.onStart$lambda$11(this.f$0, (RecurringOrderScheduleViewState.UpdateInvestmentScheduleResult) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, RxFactory.DefaultImpls.rxSingle$default(this, null, new C117048(null), 1, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.recurring.schedule.RecurringOrderScheduleDuxo$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderScheduleDuxo.onStart$lambda$13(this.f$0, (Spanned) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesKt.filterIsPresent(this.rhyAccountStore.streamSpendingAccount()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.recurring.schedule.RecurringOrderScheduleDuxo$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderScheduleDuxo.onStart$lambda$15(this.f$0, (RhyAccount) obj);
            }
        });
        final UUID instrumentId = ((RecurringOrderScheduleFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getInstrumentId();
        if (instrumentId != null) {
            Observable<R> observableSwitchMap2 = this.instrumentStore.getInstrument(instrumentId).switchMap(new Function() { // from class: com.robinhood.android.common.recurring.schedule.RecurringOrderScheduleDuxo$onStart$11$1
                @Override // io.reactivex.functions.Function
                public final ObservableSource<? extends EtpDetails> apply(Instrument instrument) {
                    Intrinsics.checkNotNullParameter(instrument, "instrument");
                    if (instrument.isEtpOrCef()) {
                        return this.this$0.etpDetailsStore.getStreamEtpDetails().asObservable(instrumentId);
                    }
                    return Observable.never();
                }
            });
            Intrinsics.checkNotNullExpressionValue(observableSwitchMap2, "switchMap(...)");
            LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap2, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.recurring.schedule.RecurringOrderScheduleDuxo$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RecurringOrderScheduleDuxo.onStart$lambda$18$lambda$17(this.f$0, (EtpDetails) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$6(RecurringOrderScheduleDuxo recurringOrderScheduleDuxo, final LocalDate localDate) {
        recurringOrderScheduleDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.schedule.RecurringOrderScheduleDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderScheduleDuxo.onStart$lambda$6$lambda$5(localDate, (RecurringOrderScheduleViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringOrderScheduleViewState onStart$lambda$6$lambda$5(LocalDate localDate, RecurringOrderScheduleViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Intrinsics.checkNotNull(localDate);
        return RecurringOrderScheduleViewState.copy$default(applyMutation, null, true, localDate, null, false, null, null, null, null, null, null, null, 4089, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$8(RecurringOrderScheduleDuxo recurringOrderScheduleDuxo, final LocalDate localDate) {
        recurringOrderScheduleDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.schedule.RecurringOrderScheduleDuxo$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderScheduleDuxo.onStart$lambda$8$lambda$7(localDate, (RecurringOrderScheduleViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringOrderScheduleViewState onStart$lambda$8$lambda$7(LocalDate localDate, RecurringOrderScheduleViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Intrinsics.checkNotNull(localDate);
        return RecurringOrderScheduleViewState.copy$default(applyMutation, null, false, localDate, null, false, null, null, null, null, null, null, null, 4091, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$11(RecurringOrderScheduleDuxo recurringOrderScheduleDuxo, final RecurringOrderScheduleViewState.UpdateInvestmentScheduleResult updateInvestmentScheduleResult) {
        recurringOrderScheduleDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.schedule.RecurringOrderScheduleDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderScheduleDuxo.onStart$lambda$11$lambda$10(updateInvestmentScheduleResult, (RecurringOrderScheduleViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringOrderScheduleViewState onStart$lambda$11$lambda$10(RecurringOrderScheduleViewState.UpdateInvestmentScheduleResult updateInvestmentScheduleResult, RecurringOrderScheduleViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RecurringOrderScheduleViewState.copy$default(applyMutation, null, false, null, null, false, null, updateInvestmentScheduleResult, null, null, null, null, null, 4031, null);
    }

    /* compiled from: RecurringOrderScheduleDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00070\u0001¢\u0006\u0002\b\u0002*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Landroid/text/Spanned;", "Lkotlin/jvm/internal/EnhancedNullability;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.recurring.schedule.RecurringOrderScheduleDuxo$onStart$8", m3645f = "RecurringOrderScheduleDuxo.kt", m3646l = {151}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.common.recurring.schedule.RecurringOrderScheduleDuxo$onStart$8 */
    static final class C117048 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Spanned>, Object> {
        int label;

        C117048(Continuation<? super C117048> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RecurringOrderScheduleDuxo.this.new C117048(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Spanned> continuation) {
            return ((C117048) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            C117048 c117048;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StaticContentStore staticContentStore = RecurringOrderScheduleDuxo.this.staticContentStore;
                this.label = 1;
                c117048 = this;
                obj = ContentRepository.DefaultImpls.loadEntry$default(staticContentStore, RecurringInvestmentsConstants.CONTENTFUL_ID_CRYPTO_ORDER_TIMING_DISCLOSURE, null, c117048, 2, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                c117048 = this;
            }
            return RecurringOrderScheduleDuxo.this.markwon.toMarkdown(((Disclosure) ((EntryResource) obj).getValue()).getContent().getRaw());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$13(RecurringOrderScheduleDuxo recurringOrderScheduleDuxo, final Spanned cryptoOrderTimingDisclosure) {
        Intrinsics.checkNotNullParameter(cryptoOrderTimingDisclosure, "cryptoOrderTimingDisclosure");
        recurringOrderScheduleDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.schedule.RecurringOrderScheduleDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderScheduleDuxo.onStart$lambda$13$lambda$12(cryptoOrderTimingDisclosure, (RecurringOrderScheduleViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringOrderScheduleViewState onStart$lambda$13$lambda$12(Spanned spanned, RecurringOrderScheduleViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RecurringOrderScheduleViewState.copy$default(applyMutation, null, false, null, null, false, null, null, null, null, spanned, null, null, 3583, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$15(RecurringOrderScheduleDuxo recurringOrderScheduleDuxo, final RhyAccount rhyAccount) {
        Intrinsics.checkNotNullParameter(rhyAccount, "rhyAccount");
        recurringOrderScheduleDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.schedule.RecurringOrderScheduleDuxo$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderScheduleDuxo.onStart$lambda$15$lambda$14(rhyAccount, (RecurringOrderScheduleViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringOrderScheduleViewState onStart$lambda$15$lambda$14(RhyAccount rhyAccount, RecurringOrderScheduleViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RecurringOrderScheduleViewState.copy$default(applyMutation, null, false, null, null, false, null, null, null, null, null, rhyAccount, null, 3071, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$18$lambda$17(RecurringOrderScheduleDuxo recurringOrderScheduleDuxo, final EtpDetails etpDetails) {
        recurringOrderScheduleDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.schedule.RecurringOrderScheduleDuxo$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderScheduleDuxo.onStart$lambda$18$lambda$17$lambda$16(etpDetails, (RecurringOrderScheduleViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringOrderScheduleViewState onStart$lambda$18$lambda$17$lambda$16(EtpDetails etpDetails, RecurringOrderScheduleViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        EtpDocuments documents = etpDetails.getDocuments();
        return RecurringOrderScheduleViewState.copy$default(applyMutation, null, false, null, null, false, null, null, null, null, null, null, documents != null ? documents.getProspectus() : null, 2047, null);
    }

    public final void setFrequency(final ApiInvestmentSchedule.Frequency frequency) {
        applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.schedule.RecurringOrderScheduleDuxo$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderScheduleDuxo.setFrequency$lambda$19(frequency, (RecurringOrderScheduleViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringOrderScheduleViewState setFrequency$lambda$19(ApiInvestmentSchedule.Frequency frequency, RecurringOrderScheduleViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RecurringOrderScheduleViewState.copy$default(applyMutation, null, false, null, null, false, frequency, null, null, null, null, null, null, 4063, null);
    }

    public final void setUserSelectedStartDate(LocalDate userSelectedStartDate) {
        Intrinsics.checkNotNullParameter(userSelectedStartDate, "userSelectedStartDate");
        this.userSelectedStartDateRelay.accept(userSelectedStartDate);
    }

    public final void updateInvestmentSchedule() {
        this.completeScheduleSelectionRelay.accept(Unit.INSTANCE);
    }

    static /* synthetic */ Maybe getInvestmentDateForRecurringHook$default(RecurringOrderScheduleDuxo recurringOrderScheduleDuxo, ApiInvestmentSchedule.Frequency frequency, int i, Object obj) {
        if ((i & 1) != 0) {
            frequency = ApiInvestmentSchedule.Frequency.DAILY;
        }
        return recurringOrderScheduleDuxo.getInvestmentDateForRecurringHook(frequency);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Maybe<LocalDate> getInvestmentDateForRecurringHook(ApiInvestmentSchedule.Frequency frequency) {
        Maybe<LocalDate> maybeOnErrorComplete = this.investmentScheduleStore.getRecurringHookStartDate(((RecurringOrderScheduleFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getAssetType(), frequency).map(new RecurringOrderScheduleDuxo3(new PropertyReference1Impl() { // from class: com.robinhood.android.common.recurring.schedule.RecurringOrderScheduleDuxo.getInvestmentDateForRecurringHook.1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((ApiRecurringHookStartDate) obj).getRecurring_hook_start_date();
            }
        })).toMaybe().onErrorComplete();
        Intrinsics.checkNotNullExpressionValue(maybeOnErrorComplete, "onErrorComplete(...)");
        return maybeOnErrorComplete;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Maybe<LocalDate> getDeterminedInvestmentStartDate(LocalDate date) {
        Maybe<LocalDate> maybeOnErrorComplete = this.investmentScheduleStore.getNextInvestmentDate(((RecurringOrderScheduleFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getAssetType(), date, ApiInvestmentSchedule.Frequency.DAILY).map(new RecurringOrderScheduleDuxo3(new PropertyReference1Impl() { // from class: com.robinhood.android.common.recurring.schedule.RecurringOrderScheduleDuxo.getDeterminedInvestmentStartDate.1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((ApiNextInvestmentDate) obj).getNext_investment_date();
            }
        })).toMaybe().onErrorComplete();
        Intrinsics.checkNotNullExpressionValue(maybeOnErrorComplete, "onErrorComplete(...)");
        return maybeOnErrorComplete;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UpdateInvestmentScheduleArgs getUpdateInvestmentScheduleArgs(RecurringOrderScheduleViewState state) {
        ApiInvestmentSchedule.Frequency frequency = state.getFrequency();
        if (frequency == null) {
            return null;
        }
        return new UpdateInvestmentScheduleArgs(state.getInvestmentScheduleId(), state.getNextInvestmentDate(), frequency);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Observable<RecurringOrderScheduleViewState.UpdateInvestmentScheduleResult> getUpdateInvestmentScheduleObservable(UpdateInvestmentScheduleArgs args) {
        UUID investmentScheduleId = args.getInvestmentScheduleId();
        final RecurringOrderScheduleViewState.InvestmentScheduleUpdate investmentScheduleUpdate = new RecurringOrderScheduleViewState.InvestmentScheduleUpdate(args.getStartDate(), args.getFrequency());
        if (investmentScheduleId != null) {
            Observable<RecurringOrderScheduleViewState.UpdateInvestmentScheduleResult> observableOnErrorReturn = TraderInvestmentScheduleStore.updateInvestmentSchedule$default(this.investmentScheduleStore, investmentScheduleId, null, null, null, null, null, args.getFrequency(), args.getStartDate(), null, EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_DARK_APPEARANCE_VALUE, null).toObservable().map(new Function() { // from class: com.robinhood.android.common.recurring.schedule.RecurringOrderScheduleDuxo.getUpdateInvestmentScheduleObservable.1
                @Override // io.reactivex.functions.Function
                public final RecurringOrderScheduleViewState.UpdateInvestmentScheduleResult apply(InvestmentSchedule it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new RecurringOrderScheduleViewState.UpdateInvestmentScheduleResult.Success(new UiEvent(investmentScheduleUpdate));
                }
            }).startWith((Observable) RecurringOrderScheduleViewState.UpdateInvestmentScheduleResult.Loading.INSTANCE).onErrorReturn(new Function() { // from class: com.robinhood.android.common.recurring.schedule.RecurringOrderScheduleDuxo.getUpdateInvestmentScheduleObservable.2
                @Override // io.reactivex.functions.Function
                public final RecurringOrderScheduleViewState.UpdateInvestmentScheduleResult apply(Throwable throwable) {
                    Intrinsics.checkNotNullParameter(throwable, "throwable");
                    return new RecurringOrderScheduleViewState.UpdateInvestmentScheduleResult.Failure(new UiEvent(throwable));
                }
            });
            Intrinsics.checkNotNull(observableOnErrorReturn);
            return observableOnErrorReturn;
        }
        Observable<RecurringOrderScheduleViewState.UpdateInvestmentScheduleResult> observableJust = Observable.just(new RecurringOrderScheduleViewState.UpdateInvestmentScheduleResult.Success(new UiEvent(investmentScheduleUpdate)));
        Intrinsics.checkNotNull(observableJust);
        return observableJust;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: RecurringOrderScheduleDuxo.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u000f¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleDuxo$UpdateInvestmentScheduleArgs;", "", "Ljava/util/UUID;", "investmentScheduleId", "j$/time/LocalDate", "startDate", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "frequency", "<init>", "(Ljava/util/UUID;Lj$/time/LocalDate;Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;)V", "component1", "()Ljava/util/UUID;", "component2", "()Lj$/time/LocalDate;", "component3", "()Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "copy", "(Ljava/util/UUID;Lj$/time/LocalDate;Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;)Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleDuxo$UpdateInvestmentScheduleArgs;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/UUID;", "getInvestmentScheduleId", "Lj$/time/LocalDate;", "getStartDate", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "getFrequency", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final /* data */ class UpdateInvestmentScheduleArgs {
        private final ApiInvestmentSchedule.Frequency frequency;
        private final UUID investmentScheduleId;
        private final LocalDate startDate;

        public static /* synthetic */ UpdateInvestmentScheduleArgs copy$default(UpdateInvestmentScheduleArgs updateInvestmentScheduleArgs, UUID uuid, LocalDate localDate, ApiInvestmentSchedule.Frequency frequency, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = updateInvestmentScheduleArgs.investmentScheduleId;
            }
            if ((i & 2) != 0) {
                localDate = updateInvestmentScheduleArgs.startDate;
            }
            if ((i & 4) != 0) {
                frequency = updateInvestmentScheduleArgs.frequency;
            }
            return updateInvestmentScheduleArgs.copy(uuid, localDate, frequency);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getInvestmentScheduleId() {
            return this.investmentScheduleId;
        }

        /* renamed from: component2, reason: from getter */
        public final LocalDate getStartDate() {
            return this.startDate;
        }

        /* renamed from: component3, reason: from getter */
        public final ApiInvestmentSchedule.Frequency getFrequency() {
            return this.frequency;
        }

        public final UpdateInvestmentScheduleArgs copy(UUID investmentScheduleId, LocalDate startDate, ApiInvestmentSchedule.Frequency frequency) {
            Intrinsics.checkNotNullParameter(startDate, "startDate");
            Intrinsics.checkNotNullParameter(frequency, "frequency");
            return new UpdateInvestmentScheduleArgs(investmentScheduleId, startDate, frequency);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UpdateInvestmentScheduleArgs)) {
                return false;
            }
            UpdateInvestmentScheduleArgs updateInvestmentScheduleArgs = (UpdateInvestmentScheduleArgs) other;
            return Intrinsics.areEqual(this.investmentScheduleId, updateInvestmentScheduleArgs.investmentScheduleId) && Intrinsics.areEqual(this.startDate, updateInvestmentScheduleArgs.startDate) && this.frequency == updateInvestmentScheduleArgs.frequency;
        }

        public int hashCode() {
            UUID uuid = this.investmentScheduleId;
            return ((((uuid == null ? 0 : uuid.hashCode()) * 31) + this.startDate.hashCode()) * 31) + this.frequency.hashCode();
        }

        public String toString() {
            return "UpdateInvestmentScheduleArgs(investmentScheduleId=" + this.investmentScheduleId + ", startDate=" + this.startDate + ", frequency=" + this.frequency + ")";
        }

        public UpdateInvestmentScheduleArgs(UUID uuid, LocalDate startDate, ApiInvestmentSchedule.Frequency frequency) {
            Intrinsics.checkNotNullParameter(startDate, "startDate");
            Intrinsics.checkNotNullParameter(frequency, "frequency");
            this.investmentScheduleId = uuid;
            this.startDate = startDate;
            this.frequency = frequency;
        }

        public final UUID getInvestmentScheduleId() {
            return this.investmentScheduleId;
        }

        public final LocalDate getStartDate() {
            return this.startDate;
        }

        public final ApiInvestmentSchedule.Frequency getFrequency() {
            return this.frequency;
        }
    }

    /* compiled from: RecurringOrderScheduleDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleDuxo;", "Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleFragment$Args;", "<init>", "()V", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<RecurringOrderScheduleDuxo, RecurringOrderScheduleFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RecurringOrderScheduleFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (RecurringOrderScheduleFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RecurringOrderScheduleFragment.Args getArgs(RecurringOrderScheduleDuxo recurringOrderScheduleDuxo) {
            return (RecurringOrderScheduleFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, recurringOrderScheduleDuxo);
        }
    }
}
