package com.robinhood.android.history.p153ui;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.util.extensions.TextViewsKt;
import com.robinhood.android.common.util.text.ActionSpan;
import com.robinhood.android.designsystem.row.RdsDataRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.history.C18359R;
import com.robinhood.android.history.databinding.FragmentInstrumentSplitPaymentDetailBinding;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.extensions.Navigators3;
import com.robinhood.common.strings.UiInstrumentSplitPayments;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.InstrumentSplitPaymentStore;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p355ui.UiInstrumentSplitPayment;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.resource.StringResource;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Observables;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: InstrumentSplitPaymentDetailFragment.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 &2\u00020\u0001:\u0002%&B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010$\u001a\u00020\u001fH\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/history/ui/InstrumentSplitPaymentDetailFragment;", "Lcom/robinhood/android/history/ui/BaseDetailFragment;", "<init>", "()V", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "getAccountProvider", "()Lcom/robinhood/android/lib/account/AccountProvider;", "setAccountProvider", "(Lcom/robinhood/android/lib/account/AccountProvider;)V", "instrumentSplitPaymentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentSplitPaymentStore;", "getInstrumentSplitPaymentStore", "()Lcom/robinhood/librobinhood/data/store/InstrumentSplitPaymentStore;", "setInstrumentSplitPaymentStore", "(Lcom/robinhood/librobinhood/data/store/InstrumentSplitPaymentStore;)V", "binding", "Lcom/robinhood/android/history/databinding/FragmentInstrumentSplitPaymentDetailBinding;", "getBinding", "()Lcom/robinhood/android/history/databinding/FragmentInstrumentSplitPaymentDetailBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "id", "Ljava/util/UUID;", "getId", "()Ljava/util/UUID;", "revealTransitionName", "", "getRevealTransitionName", "()Ljava/lang/String;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "Args", "Companion", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class InstrumentSplitPaymentDetailFragment extends BaseDetailFragment {
    public AccountProvider accountProvider;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    public InstrumentSplitPaymentStore instrumentSplitPaymentStore;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(InstrumentSplitPaymentDetailFragment.class, "binding", "getBinding()Lcom/robinhood/android/history/databinding/FragmentInstrumentSplitPaymentDetailBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public InstrumentSplitPaymentDetailFragment() {
        super(C18359R.layout.fragment_instrument_split_payment_detail);
        this.binding = ViewBinding5.viewBinding(this, InstrumentSplitPaymentDetailFragment2.INSTANCE);
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

    public final InstrumentSplitPaymentStore getInstrumentSplitPaymentStore() {
        InstrumentSplitPaymentStore instrumentSplitPaymentStore = this.instrumentSplitPaymentStore;
        if (instrumentSplitPaymentStore != null) {
            return instrumentSplitPaymentStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("instrumentSplitPaymentStore");
        return null;
    }

    public final void setInstrumentSplitPaymentStore(InstrumentSplitPaymentStore instrumentSplitPaymentStore) {
        Intrinsics.checkNotNullParameter(instrumentSplitPaymentStore, "<set-?>");
        this.instrumentSplitPaymentStore = instrumentSplitPaymentStore;
    }

    private final FragmentInstrumentSplitPaymentDetailBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentInstrumentSplitPaymentDetailBinding) value;
    }

    private final UUID getId() {
        return ((Args) INSTANCE.getArgs((Fragment) this)).getInstrumentSplitPaymentId();
    }

    @Override // com.robinhood.android.history.p153ui.BaseDetailFragment
    public String getRevealTransitionName() {
        String string2 = ((Args) INSTANCE.getArgs((Fragment) this)).getInstrumentSplitPaymentId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    @Override // com.robinhood.android.history.p153ui.BaseDetailFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        RhTextView instrumentSplitPaymentInfo = getBinding().instrumentSplitPaymentInfo;
        Intrinsics.checkNotNullExpressionValue(instrumentSplitPaymentInfo, "instrumentSplitPaymentInfo");
        int i = C18359R.string.instrument_split_payment_detail_info_text;
        int i2 = C18359R.string.instrument_split_payment_detail_info_link_text;
        String string2 = ViewsKt.getString(instrumentSplitPaymentInfo, i);
        Integer numValueOf = Integer.valueOf(i2);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        TextViewsKt.setTextWithLearnMore((TextView) instrumentSplitPaymentInfo, (CharSequence) string2, false, false, numValueOf != null ? ViewsKt.getString(instrumentSplitPaymentInfo, numValueOf.intValue()) : null, (ClickableSpan) new ActionSpan(false, (Function0) new Function0<Unit>() { // from class: com.robinhood.android.history.ui.InstrumentSplitPaymentDetailFragment$onViewCreated$$inlined$setTextWithLearnMore$default$1
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() throws Resources.NotFoundException {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() throws Resources.NotFoundException {
                String string3 = this.this$0.getResources().getString(C18359R.string.instrument_split_payment_detail_info_link_url);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                Navigator navigator = this.this$0.getNavigator();
                Context contextRequireContext = this.this$0.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                Navigators3.showHelpCenterWebViewFragment(navigator, contextRequireContext, string3);
            }
        }, 1, (DefaultConstructorMarker) null));
    }

    @Override // com.robinhood.android.history.p153ui.BaseDetailFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Observable<UiInstrumentSplitPayment> observableRefCount = getInstrumentSplitPaymentStore().streamInstrumentSplitPayment(getId()).replay(1).refCount();
        Intrinsics.checkNotNullExpressionValue(observableRefCount, "refCount(...)");
        AccountProvider.DefaultImpls.refresh$default(getAccountProvider(), false, 1, null);
        Observable observableSwitchMap = observableRefCount.map(new Function() { // from class: com.robinhood.android.history.ui.InstrumentSplitPaymentDetailFragment$onResume$accountObs$1
            @Override // io.reactivex.functions.Function
            public final String apply(UiInstrumentSplitPayment it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getInstrumentSplitPayment().getAccountNumber();
            }
        }).distinctUntilChanged().switchMap(new Function() { // from class: com.robinhood.android.history.ui.InstrumentSplitPaymentDetailFragment$onResume$accountObs$2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Account> apply(String accountNumber) {
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                return this.this$0.getAccountProvider().streamAccount(accountNumber);
            }
        });
        Observables observables = Observables.INSTANCE;
        Intrinsics.checkNotNull(observableSwitchMap);
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observables.combineLatest(observableRefCount, observableSwitchMap)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.history.ui.InstrumentSplitPaymentDetailFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InstrumentSplitPaymentDetailFragment.onResume$lambda$1(this.f$0, (Tuples2) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$1(InstrumentSplitPaymentDetailFragment instrumentSplitPaymentDetailFragment, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        UiInstrumentSplitPayment uiInstrumentSplitPayment = (UiInstrumentSplitPayment) tuples2.component1();
        Account account = (Account) tuples2.component2();
        TextView expandedToolbarTitleTxt = instrumentSplitPaymentDetailFragment.getExpandedToolbarTitleTxt();
        Intrinsics.checkNotNull(uiInstrumentSplitPayment);
        Resources resources = instrumentSplitPaymentDetailFragment.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        expandedToolbarTitleTxt.setText(UiInstrumentSplitPayments.getDetailTitleText(uiInstrumentSplitPayment, resources));
        instrumentSplitPaymentDetailFragment.getExpandedToolbarSubtitleTxt().setVisibility(0);
        instrumentSplitPaymentDetailFragment.getExpandedToolbarSubtitleTxt().setText(UiInstrumentSplitPayments.getInstrumentDisplayName(uiInstrumentSplitPayment));
        RdsDataRowView rdsDataRowView = instrumentSplitPaymentDetailFragment.getBinding().instrumentSplitPaymentAccountUsed;
        Intrinsics.checkNotNull(account);
        StringResource title = AccountDisplayNames.getDisplayName(account).getWithAccount().getTitle();
        Resources resources2 = instrumentSplitPaymentDetailFragment.getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        rdsDataRowView.setValueText(title.getText(resources2));
        instrumentSplitPaymentDetailFragment.getBinding().instrumentSplitPaymentDateRecieved.setValueText(UiInstrumentSplitPayments.getDateReceivedText(uiInstrumentSplitPayment));
        instrumentSplitPaymentDetailFragment.getBinding().instrumentSplitPaymentNewShares.setValueText(UiInstrumentSplitPayments.getNewSharesText(uiInstrumentSplitPayment));
        instrumentSplitPaymentDetailFragment.getBinding().instrumentSplitPaymentPreviousShares.setValueText(UiInstrumentSplitPayments.getPreviousSharesText(uiInstrumentSplitPayment));
        RdsDataRowView rdsDataRowView2 = instrumentSplitPaymentDetailFragment.getBinding().instrumentSplitPaymentSplitQuantity;
        Resources resources3 = instrumentSplitPaymentDetailFragment.getResources();
        Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
        rdsDataRowView2.setValueText(UiInstrumentSplitPayments.getSplitQuantityText(uiInstrumentSplitPayment, resources3));
        return Unit.INSTANCE;
    }

    /* compiled from: InstrumentSplitPaymentDetailFragment.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/history/ui/InstrumentSplitPaymentDetailFragment$Args;", "Landroid/os/Parcelable;", "instrumentSplitPaymentId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getInstrumentSplitPaymentId", "()Ljava/util/UUID;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final UUID instrumentSplitPaymentId;

        /* compiled from: InstrumentSplitPaymentDetailFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = args.instrumentSplitPaymentId;
            }
            return args.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getInstrumentSplitPaymentId() {
            return this.instrumentSplitPaymentId;
        }

        public final Args copy(UUID instrumentSplitPaymentId) {
            Intrinsics.checkNotNullParameter(instrumentSplitPaymentId, "instrumentSplitPaymentId");
            return new Args(instrumentSplitPaymentId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Args) && Intrinsics.areEqual(this.instrumentSplitPaymentId, ((Args) other).instrumentSplitPaymentId);
        }

        public int hashCode() {
            return this.instrumentSplitPaymentId.hashCode();
        }

        public String toString() {
            return "Args(instrumentSplitPaymentId=" + this.instrumentSplitPaymentId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.instrumentSplitPaymentId);
        }

        public Args(UUID instrumentSplitPaymentId) {
            Intrinsics.checkNotNullParameter(instrumentSplitPaymentId, "instrumentSplitPaymentId");
            this.instrumentSplitPaymentId = instrumentSplitPaymentId;
        }

        public final UUID getInstrumentSplitPaymentId() {
            return this.instrumentSplitPaymentId;
        }
    }

    /* compiled from: InstrumentSplitPaymentDetailFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/history/ui/InstrumentSplitPaymentDetailFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/history/ui/InstrumentSplitPaymentDetailFragment;", "Lcom/robinhood/android/history/ui/InstrumentSplitPaymentDetailFragment$Args;", "<init>", "()V", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<InstrumentSplitPaymentDetailFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(InstrumentSplitPaymentDetailFragment instrumentSplitPaymentDetailFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, instrumentSplitPaymentDetailFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public InstrumentSplitPaymentDetailFragment newInstance(Args args) {
            return (InstrumentSplitPaymentDetailFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(InstrumentSplitPaymentDetailFragment instrumentSplitPaymentDetailFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, instrumentSplitPaymentDetailFragment, args);
        }
    }
}
