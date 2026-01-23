package com.robinhood.android.history.p153ui;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import com.robinhood.android.account.AccountDisplayNameStore;
import com.robinhood.android.account.strings.DisplayName;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.designsystem.row.RdsDataRowView;
import com.robinhood.android.history.C18359R;
import com.robinhood.android.history.databinding.FragmentSweepPaymentDetailBinding;
import com.robinhood.android.history.extensions.Sweeps;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.SweepStore;
import com.robinhood.models.p320db.bonfire.WithholdingAmount;
import com.robinhood.models.p320db.bonfire.WithholdingAmount2;
import com.robinhood.models.p320db.mcduckling.Sweep;
import com.robinhood.models.util.Money;
import com.robinhood.store.base.BackupWithholdingStore;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.datetime.format.InstantFormatter;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.resource.StringResource;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Observables;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples3;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SweepPaymentDetailFragment.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 :2\u00020\u0001:\u0001:B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101H\u0016J\b\u00102\u001a\u00020-H\u0016J\"\u00103\u001a\u00020-2\u0006\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u0001072\u0006\u00108\u001a\u000209H\u0002R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\u00020\u001b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010 \u001a\u00020!8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001e\u0010&\u001a\u00020'8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u0006;"}, m3636d2 = {"Lcom/robinhood/android/history/ui/SweepPaymentDetailFragment;", "Lcom/robinhood/android/history/ui/BaseDetailFragment;", "<init>", "()V", "revealTransitionName", "", "getRevealTransitionName", "()Ljava/lang/String;", SweepPaymentDetailFragment.ARG_SWEEP_ID, "Ljava/util/UUID;", "getSweepId", "()Ljava/util/UUID;", "sweepId$delegate", "Lkotlin/Lazy;", "bindings", "Lcom/robinhood/android/history/databinding/FragmentSweepPaymentDetailBinding;", "getBindings", "()Lcom/robinhood/android/history/databinding/FragmentSweepPaymentDetailBinding;", "bindings$delegate", "Lkotlin/properties/ReadOnlyProperty;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "getAccountProvider", "()Lcom/robinhood/android/lib/account/AccountProvider;", "setAccountProvider", "(Lcom/robinhood/android/lib/account/AccountProvider;)V", "sweepStore", "Lcom/robinhood/librobinhood/data/store/SweepStore;", "getSweepStore", "()Lcom/robinhood/librobinhood/data/store/SweepStore;", "setSweepStore", "(Lcom/robinhood/librobinhood/data/store/SweepStore;)V", "backupWithholdingStore", "Lcom/robinhood/store/base/BackupWithholdingStore;", "getBackupWithholdingStore", "()Lcom/robinhood/store/base/BackupWithholdingStore;", "setBackupWithholdingStore", "(Lcom/robinhood/store/base/BackupWithholdingStore;)V", "accountDisplayNameStore", "Lcom/robinhood/android/account/AccountDisplayNameStore;", "getAccountDisplayNameStore", "()Lcom/robinhood/android/account/AccountDisplayNameStore;", "setAccountDisplayNameStore", "(Lcom/robinhood/android/account/AccountDisplayNameStore;)V", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "bind", "transfer", "Lcom/robinhood/models/db/mcduckling/Sweep;", "backupWithholdingResponse", "Lcom/robinhood/models/db/bonfire/WithholdingAmount;", "displayName", "Lcom/robinhood/android/account/strings/DisplayName;", "Companion", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class SweepPaymentDetailFragment extends BaseDetailFragment {
    private static final String ARG_SWEEP_ID = "sweepId";
    public AccountDisplayNameStore accountDisplayNameStore;
    public AccountProvider accountProvider;
    public BackupWithholdingStore backupWithholdingStore;

    /* renamed from: bindings$delegate, reason: from kotlin metadata */
    private final Interfaces2 bindings;

    /* renamed from: sweepId$delegate, reason: from kotlin metadata */
    private final Lazy sweepId;
    public SweepStore sweepStore;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SweepPaymentDetailFragment.class, "bindings", "getBindings()Lcom/robinhood/android/history/databinding/FragmentSweepPaymentDetailBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public SweepPaymentDetailFragment() {
        super(C18359R.layout.fragment_sweep_payment_detail);
        this.sweepId = Fragments2.argument(this, ARG_SWEEP_ID);
        this.bindings = ViewBinding5.viewBinding(this, SweepPaymentDetailFragment2.INSTANCE);
    }

    @Override // com.robinhood.android.history.p153ui.BaseDetailFragment
    public String getRevealTransitionName() {
        String string2 = getSweepId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UUID getSweepId() {
        return (UUID) this.sweepId.getValue();
    }

    private final FragmentSweepPaymentDetailBinding getBindings() {
        Object value = this.bindings.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentSweepPaymentDetailBinding) value;
    }

    public final AccountProvider getAccountProvider() {
        AccountProvider accountProvider = this.accountProvider;
        if (accountProvider != null) {
            return accountProvider;
        }
        Intrinsics.throwUninitializedPropertyAccessException("accountProvider");
        return null;
    }

    public final void setAccountProvider(AccountProvider accountProvider) {
        Intrinsics.checkNotNullParameter(accountProvider, "<set-?>");
        this.accountProvider = accountProvider;
    }

    public final SweepStore getSweepStore() {
        SweepStore sweepStore = this.sweepStore;
        if (sweepStore != null) {
            return sweepStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sweepStore");
        return null;
    }

    public final void setSweepStore(SweepStore sweepStore) {
        Intrinsics.checkNotNullParameter(sweepStore, "<set-?>");
        this.sweepStore = sweepStore;
    }

    public final BackupWithholdingStore getBackupWithholdingStore() {
        BackupWithholdingStore backupWithholdingStore = this.backupWithholdingStore;
        if (backupWithholdingStore != null) {
            return backupWithholdingStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("backupWithholdingStore");
        return null;
    }

    public final void setBackupWithholdingStore(BackupWithholdingStore backupWithholdingStore) {
        Intrinsics.checkNotNullParameter(backupWithholdingStore, "<set-?>");
        this.backupWithholdingStore = backupWithholdingStore;
    }

    public final AccountDisplayNameStore getAccountDisplayNameStore() {
        AccountDisplayNameStore accountDisplayNameStore = this.accountDisplayNameStore;
        if (accountDisplayNameStore != null) {
            return accountDisplayNameStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("accountDisplayNameStore");
        return null;
    }

    public final void setAccountDisplayNameStore(AccountDisplayNameStore accountDisplayNameStore) {
        Intrinsics.checkNotNullParameter(accountDisplayNameStore, "<set-?>");
        this.accountDisplayNameStore = accountDisplayNameStore;
    }

    @Override // com.robinhood.android.history.p153ui.BaseDetailFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getExpandedToolbarTitleTxt().setText(C18359R.string.sweep_payment_detail_title);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        getSweepStore().refresh(getSweepId(), false);
        Observable<Sweep> observableStreamSweep = getSweepStore().streamSweep(getSweepId());
        ObservableSource observableSourceSwitchMap = observableStreamSweep.switchMap(new Function() { // from class: com.robinhood.android.history.ui.SweepPaymentDetailFragment$onStart$backupWithholdingObs$1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Optional<WithholdingAmount>> apply(Sweep sweep) {
                Intrinsics.checkNotNullParameter(sweep, "sweep");
                if (sweep.getDirection() == Money.Direction.CREDIT) {
                    return this.this$0.getBackupWithholdingStore().pollWithholdingAmount(new Tuples2<>(sweep.getAccountNumber(), CollectionsKt.listOf(this.this$0.getSweepId())));
                }
                Observable observableJust = Observable.just(Optional2.INSTANCE);
                Intrinsics.checkNotNull(observableJust);
                return observableJust;
            }
        });
        ObservableSource observableSourceSwitchMap2 = observableStreamSweep.switchMap(new Function() { // from class: com.robinhood.android.history.ui.SweepPaymentDetailFragment$onStart$displayNameObs$1

            /* compiled from: SweepPaymentDetailFragment.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/account/strings/DisplayName;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.history.ui.SweepPaymentDetailFragment$onStart$displayNameObs$1$1", m3645f = "SweepPaymentDetailFragment.kt", m3646l = {74}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.history.ui.SweepPaymentDetailFragment$onStart$displayNameObs$1$1 */
            static final class C184211 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super DisplayName>, Object> {
                final /* synthetic */ Sweep $sweep;
                int label;
                final /* synthetic */ SweepPaymentDetailFragment this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C184211(SweepPaymentDetailFragment sweepPaymentDetailFragment, Sweep sweep, Continuation<? super C184211> continuation) {
                    super(2, continuation);
                    this.this$0 = sweepPaymentDetailFragment;
                    this.$sweep = sweep;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C184211(this.this$0, this.$sweep, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super DisplayName> continuation) {
                    return ((C184211) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i != 0) {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    ResultKt.throwOnFailure(obj);
                    AccountDisplayNameStore accountDisplayNameStore = this.this$0.getAccountDisplayNameStore();
                    String accountNumber = this.$sweep.getAccountNumber();
                    this.label = 1;
                    Object displayName = accountDisplayNameStore.getDisplayName(accountNumber, this);
                    return displayName == coroutine_suspended ? coroutine_suspended : displayName;
                }
            }

            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends DisplayName> apply(Sweep sweep) {
                Intrinsics.checkNotNullParameter(sweep, "sweep");
                SweepPaymentDetailFragment sweepPaymentDetailFragment = this.this$0;
                return RxFactory.DefaultImpls.rxSingle$default(sweepPaymentDetailFragment, null, new C184211(sweepPaymentDetailFragment, sweep, null), 1, null).toObservable();
            }
        });
        Observables observables = Observables.INSTANCE;
        Intrinsics.checkNotNull(observableSourceSwitchMap);
        Intrinsics.checkNotNull(observableSourceSwitchMap2);
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observables.combineLatest(observableStreamSweep, observableSourceSwitchMap, observableSourceSwitchMap2)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.history.ui.SweepPaymentDetailFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SweepPaymentDetailFragment.onStart$lambda$0(this.f$0, (Tuples3) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$0(SweepPaymentDetailFragment sweepPaymentDetailFragment, Tuples3 tuples3) {
        Intrinsics.checkNotNullParameter(tuples3, "<destruct>");
        Sweep sweep = (Sweep) tuples3.component1();
        Optional optional = (Optional) tuples3.component2();
        DisplayName displayName = (DisplayName) tuples3.component3();
        WithholdingAmount withholdingAmount = (WithholdingAmount) optional.getOrNull();
        Intrinsics.checkNotNull(displayName);
        sweepPaymentDetailFragment.bind(sweep, withholdingAmount, displayName);
        return Unit.INSTANCE;
    }

    private final void bind(Sweep transfer, WithholdingAmount backupWithholdingResponse, DisplayName displayName) {
        FragmentSweepPaymentDetailBinding bindings = getBindings();
        RdsDataRowView rdsDataRowView = bindings.sweepPaymentDetailAccount;
        StringResource title = displayName.getWithAccount().getTitle();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        rdsDataRowView.setValueText(title.getText(resources));
        bindings.sweepPaymentDetailAmount.setValueText(Money.Adjustment.format$default(transfer.getAdjustment(), true, null, 2, null));
        bindings.sweepPaymentDetailBackupWithholding.setVisibilityValueText(backupWithholdingResponse != null ? WithholdingAmount2.getBackupWithholdingAmountString(backupWithholdingResponse) : null);
        bindings.sweepPaymentDetailNetCredit.setVisibilityValueText(backupWithholdingResponse != null ? WithholdingAmount2.getNetCreditAmountString(backupWithholdingResponse, transfer.getAdjustment().getAmount()) : null);
        bindings.sweepPaymentDetailPayDate.setValueText(InstantFormatter.MEDIUM_DATE_IN_SYSTEM_ZONE.format((InstantFormatter) transfer.getPayTimestamp()));
        RdsDataRowView rdsDataRowView2 = bindings.sweepPaymentDetailPaymentReason;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        rdsDataRowView2.setValueText(Sweeps.getPaymentReason(transfer, contextRequireContext));
    }

    /* compiled from: SweepPaymentDetailFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/history/ui/SweepPaymentDetailFragment$Companion;", "", "<init>", "()V", "ARG_SWEEP_ID", "", "newInstance", "Lcom/robinhood/android/history/ui/SweepPaymentDetailFragment;", SweepPaymentDetailFragment.ARG_SWEEP_ID, "Ljava/util/UUID;", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SweepPaymentDetailFragment newInstance(UUID sweepId) {
            Intrinsics.checkNotNullParameter(sweepId, "sweepId");
            SweepPaymentDetailFragment sweepPaymentDetailFragment = new SweepPaymentDetailFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable(SweepPaymentDetailFragment.ARG_SWEEP_ID, sweepId);
            sweepPaymentDetailFragment.setArguments(bundle);
            return sweepPaymentDetailFragment;
        }
    }
}
