package com.robinhood.android.common.recurring.bottomsheet.paymentmethod;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.ach.format.AchRelationships;
import com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.recurring.C11595R;
import com.robinhood.android.common.recurring.databinding.FragmentRecurringPaymentMethodBottomSheetBinding;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.transfers.contracts.CreateIavRelationshipIntentKey;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.models.util.Money;
import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import com.robinhood.shared.transfers.contracts.context.IavSource;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: RecurringPaymentMethodBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 /2\u00020\u0001:\u0003-./B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u001a\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\"\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u0010\u0010'\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020)H\u0002J\u0010\u0010*\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020,H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0019¨\u00060"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/bottomsheet/paymentmethod/RecurringPaymentMethodBottomSheet;", "Lcom/robinhood/android/common/ui/BaseBottomSheetDialogFragment;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/common/recurring/bottomsheet/paymentmethod/RecurringPaymentMethodBottomSheet$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/common/recurring/bottomsheet/paymentmethod/RecurringPaymentMethodBottomSheet$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "binding", "Lcom/robinhood/android/common/recurring/databinding/FragmentRecurringPaymentMethodBottomSheetBinding;", "getBinding", "()Lcom/robinhood/android/common/recurring/databinding/FragmentRecurringPaymentMethodBottomSheetBinding;", "binding$delegate", "duxo", "Lcom/robinhood/android/common/recurring/bottomsheet/paymentmethod/RecurringPaymentMethodDuxo;", "getDuxo", "()Lcom/robinhood/android/common/recurring/bottomsheet/paymentmethod/RecurringPaymentMethodDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "adapter", "Lcom/robinhood/android/common/recurring/bottomsheet/paymentmethod/RecurringPaymentMethodAdapter;", "isCryptoOrder", "", "()Z", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "onActivityResult", "requestCode", "", "resultCode", WebsocketGatewayConstants.DATA_KEY, "Landroid/content/Intent;", "setViewState", "state", "Lcom/robinhood/android/common/recurring/bottomsheet/paymentmethod/RecurringPaymentMethodViewState;", "onRowClicked", "row", "Lcom/robinhood/android/common/recurring/bottomsheet/paymentmethod/RecurringPaymentMethodBottomSheet$Row;", "Callbacks", "Row", "Companion", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class RecurringPaymentMethodBottomSheet extends BaseBottomSheetDialogFragment {
    private static final int REQUEST_CODE_IAV_FLOW = 2002;
    private final RecurringPaymentMethodAdapter adapter;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RecurringPaymentMethodBottomSheet.class, "callbacks", "getCallbacks()Lcom/robinhood/android/common/recurring/bottomsheet/paymentmethod/RecurringPaymentMethodBottomSheet$Callbacks;", 0)), Reflection.property1(new PropertyReference1Impl(RecurringPaymentMethodBottomSheet.class, "binding", "getBinding()Lcom/robinhood/android/common/recurring/databinding/FragmentRecurringPaymentMethodBottomSheetBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: RecurringPaymentMethodBottomSheet.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH&¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/bottomsheet/paymentmethod/RecurringPaymentMethodBottomSheet$Callbacks;", "", "onPaymentMethodSelected", "", "isBackup", "", "paymentMethod", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$SourceOfFunds;", "achRelationship", "Lcom/robinhood/models/db/AchRelationship;", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onPaymentMethodSelected(boolean isBackup, ApiInvestmentSchedule.SourceOfFunds paymentMethod, AchRelationship achRelationship);
    }

    public RecurringPaymentMethodBottomSheet() {
        super(C11595R.layout.fragment_recurring_payment_method_bottom_sheet);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.common.recurring.bottomsheet.paymentmethod.RecurringPaymentMethodBottomSheet$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        this.binding = ViewBinding5.viewBinding(this, RecurringPaymentMethodBottomSheet3.INSTANCE);
        this.duxo = OldDuxos.oldDuxo(this, RecurringPaymentMethodDuxo.class);
        this.adapter = new RecurringPaymentMethodAdapter(new RecurringPaymentMethodBottomSheet2(this));
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final FragmentRecurringPaymentMethodBottomSheetBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[1]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentRecurringPaymentMethodBottomSheetBinding) value;
    }

    private final RecurringPaymentMethodDuxo getDuxo() {
        return (RecurringPaymentMethodDuxo) this.duxo.getValue();
    }

    private final boolean isCryptoOrder() {
        return ((RecurringPaymentMethodBottomSheetArgs) INSTANCE.getArgs((Fragment) this)).isCrypto();
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C116861(this));
    }

    /* compiled from: RecurringPaymentMethodBottomSheet.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.recurring.bottomsheet.paymentmethod.RecurringPaymentMethodBottomSheet$onCreate$1 */
    /* synthetic */ class C116861 extends FunctionReferenceImpl implements Function1<RecurringPaymentMethodViewState, Unit> {
        C116861(Object obj) {
            super(1, obj, RecurringPaymentMethodBottomSheet.class, "setViewState", "setViewState(Lcom/robinhood/android/common/recurring/bottomsheet/paymentmethod/RecurringPaymentMethodViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RecurringPaymentMethodViewState recurringPaymentMethodViewState) {
            invoke2(recurringPaymentMethodViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(RecurringPaymentMethodViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((RecurringPaymentMethodBottomSheet) this.receiver).setViewState(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        int i;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        RhTextView rhTextView = getBinding().paymentMethodBottomSheetTitle;
        Resources resources = getResources();
        if (((RecurringPaymentMethodBottomSheetArgs) INSTANCE.getArgs((Fragment) this)).isBackup()) {
            i = C11595R.string.recurring_order_bottom_sheet_backup_payment_method;
        } else {
            i = C11595R.string.recurring_order_bottom_sheet_payment_method;
        }
        rhTextView.setText(resources.getText(i));
        RecyclerView recyclerView = getBinding().recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        recyclerView.setAdapter(this.adapter);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE_IAV_FLOW && resultCode == -1) {
            getDuxo().logAddAccountSuccess();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setViewState(RecurringPaymentMethodViewState state) {
        this.adapter.setState(state);
        RhTextView rhTextView = getBinding().paymentMethodBottomSheetDisclaimer;
        StringResource disclaimerString = state.getDisclaimerString();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        rhTextView.setText(disclaimerString.getText(resources));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onRowClicked(Row row) {
        if ((row instanceof Row.AchRelationship) || (row instanceof Row.CryptoBuyingPower) || (row instanceof Row.EquityBuyingPower) || (row instanceof Row.GenericBuyingPower)) {
            ApiInvestmentSchedule.SourceOfFunds paymentMethod = row.getPaymentMethod();
            if (paymentMethod == null) {
                throw new IllegalStateException("All non AddAccount rows will have a payment method");
            }
            getDuxo().onRowClicked(row);
            Callbacks callbacks = getCallbacks();
            boolean zIsBackup = ((RecurringPaymentMethodBottomSheetArgs) INSTANCE.getArgs((Fragment) this)).isBackup();
            Row.AchRelationship achRelationship = row instanceof Row.AchRelationship ? (Row.AchRelationship) row : null;
            callbacks.onPaymentMethodSelected(zIsBackup, paymentMethod, achRelationship != null ? achRelationship.getAchRelationship() : null);
            getDuxo().logDismiss();
            dismiss();
            return;
        }
        if (Intrinsics.areEqual(row, Row.AddAccount.INSTANCE)) {
            getDuxo().onRowClicked(row);
            Navigator.DefaultImpls.startActivityForResult$default(getNavigator(), (Fragment) this, (IntentKey) new CreateIavRelationshipIntentKey(IavSource.RECURRING, null, null, null, false, false, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null), REQUEST_CODE_IAV_FLOW, (PerformanceMetricEventData.Source) null, false, (Function1) null, (NavigationType) null, 120, (Object) null);
            getDuxo().clearSelectedRow();
        } else {
            if (!Intrinsics.areEqual(row, Row.RemoveBackup.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            getCallbacks().onPaymentMethodSelected(((RecurringPaymentMethodBottomSheetArgs) INSTANCE.getArgs((Fragment) this)).isBackup(), null, null);
            getDuxo().logDismiss();
            dismiss();
        }
    }

    /* compiled from: RecurringPaymentMethodBottomSheet.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0015\u0016\u0017\u0018\u0019\u001aB=\b\u0004\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013\u0082\u0001\u0006\u001b\u001c\u001d\u001e\u001f ¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/bottomsheet/paymentmethod/RecurringPaymentMethodBottomSheet$Row;", "", "paymentMethod", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$SourceOfFunds;", "title", "Lcom/robinhood/utils/resource/StringResource;", "subtitle", "highlightText", "leadingDrawableId", "", "<init>", "(Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$SourceOfFunds;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Ljava/lang/Integer;)V", "getPaymentMethod", "()Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$SourceOfFunds;", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getSubtitle", "getHighlightText", "getLeadingDrawableId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "CryptoBuyingPower", "EquityBuyingPower", "GenericBuyingPower", "AchRelationship", "AddAccount", "RemoveBackup", "Lcom/robinhood/android/common/recurring/bottomsheet/paymentmethod/RecurringPaymentMethodBottomSheet$Row$AchRelationship;", "Lcom/robinhood/android/common/recurring/bottomsheet/paymentmethod/RecurringPaymentMethodBottomSheet$Row$AddAccount;", "Lcom/robinhood/android/common/recurring/bottomsheet/paymentmethod/RecurringPaymentMethodBottomSheet$Row$CryptoBuyingPower;", "Lcom/robinhood/android/common/recurring/bottomsheet/paymentmethod/RecurringPaymentMethodBottomSheet$Row$EquityBuyingPower;", "Lcom/robinhood/android/common/recurring/bottomsheet/paymentmethod/RecurringPaymentMethodBottomSheet$Row$GenericBuyingPower;", "Lcom/robinhood/android/common/recurring/bottomsheet/paymentmethod/RecurringPaymentMethodBottomSheet$Row$RemoveBackup;", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class Row {
        public static final int $stable = StringResource.$stable;
        private final StringResource highlightText;
        private final Integer leadingDrawableId;
        private final ApiInvestmentSchedule.SourceOfFunds paymentMethod;
        private final StringResource subtitle;
        private final StringResource title;

        public /* synthetic */ Row(ApiInvestmentSchedule.SourceOfFunds sourceOfFunds, StringResource stringResource, StringResource stringResource2, StringResource stringResource3, Integer num, DefaultConstructorMarker defaultConstructorMarker) {
            this(sourceOfFunds, stringResource, stringResource2, stringResource3, num);
        }

        private Row(ApiInvestmentSchedule.SourceOfFunds sourceOfFunds, StringResource stringResource, StringResource stringResource2, StringResource stringResource3, Integer num) {
            this.paymentMethod = sourceOfFunds;
            this.title = stringResource;
            this.subtitle = stringResource2;
            this.highlightText = stringResource3;
            this.leadingDrawableId = num;
        }

        public /* synthetic */ Row(ApiInvestmentSchedule.SourceOfFunds sourceOfFunds, StringResource stringResource, StringResource stringResource2, StringResource stringResource3, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(sourceOfFunds, stringResource, stringResource2, (i & 8) != 0 ? null : stringResource3, num, null);
        }

        public final ApiInvestmentSchedule.SourceOfFunds getPaymentMethod() {
            return this.paymentMethod;
        }

        public final StringResource getTitle() {
            return this.title;
        }

        public final StringResource getSubtitle() {
            return this.subtitle;
        }

        public final StringResource getHighlightText() {
            return this.highlightText;
        }

        public final Integer getLeadingDrawableId() {
            return this.leadingDrawableId;
        }

        /* compiled from: RecurringPaymentMethodBottomSheet.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/bottomsheet/paymentmethod/RecurringPaymentMethodBottomSheet$Row$CryptoBuyingPower;", "Lcom/robinhood/android/common/recurring/bottomsheet/paymentmethod/RecurringPaymentMethodBottomSheet$Row;", "buyingPower", "Lcom/robinhood/models/util/Money;", "<init>", "(Lcom/robinhood/models/util/Money;)V", "getBuyingPower", "()Lcom/robinhood/models/util/Money;", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class CryptoBuyingPower extends Row {
            public static final int $stable = 8;
            private final Money buyingPower;

            /* JADX WARN: Multi-variable type inference failed */
            public CryptoBuyingPower() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public /* synthetic */ CryptoBuyingPower(Money money, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : money);
            }

            public final Money getBuyingPower() {
                return this.buyingPower;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public CryptoBuyingPower(Money money) {
                Money money2;
                ApiInvestmentSchedule.SourceOfFunds sourceOfFunds;
                int i;
                String str;
                ApiInvestmentSchedule.SourceOfFunds sourceOfFunds2 = ApiInvestmentSchedule.SourceOfFunds.BUYING_POWER;
                StringResource.Companion companion = StringResource.INSTANCE;
                StringResource stringResourceInvoke = companion.invoke(C11595R.string.investment_schedule_source_of_funds_crypto_buying_power, new Object[0]);
                int i2 = C11595R.string.equity_recurring_source_of_funds_buying_power_desc;
                if (money != null) {
                    sourceOfFunds = sourceOfFunds2;
                    i = i2;
                    str = Money.format$default(money, null, false, null, false, 0, null, false, null, false, false, 1023, null);
                    money2 = money;
                    if (str == null) {
                    }
                    ApiInvestmentSchedule.SourceOfFunds sourceOfFunds3 = sourceOfFunds;
                    super(sourceOfFunds3, stringResourceInvoke, companion.invoke(i, str), null, null, 8, null);
                    this.buyingPower = money2;
                }
                money2 = money;
                sourceOfFunds = sourceOfFunds2;
                i = i2;
                str = "-";
                ApiInvestmentSchedule.SourceOfFunds sourceOfFunds32 = sourceOfFunds;
                super(sourceOfFunds32, stringResourceInvoke, companion.invoke(i, str), null, null, 8, null);
                this.buyingPower = money2;
            }
        }

        /* compiled from: RecurringPaymentMethodBottomSheet.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/bottomsheet/paymentmethod/RecurringPaymentMethodBottomSheet$Row$EquityBuyingPower;", "Lcom/robinhood/android/common/recurring/bottomsheet/paymentmethod/RecurringPaymentMethodBottomSheet$Row;", "buyingPower", "Lcom/robinhood/models/util/Money;", "<init>", "(Lcom/robinhood/models/util/Money;)V", "getBuyingPower", "()Lcom/robinhood/models/util/Money;", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class EquityBuyingPower extends Row {
            public static final int $stable = 8;
            private final Money buyingPower;

            /* JADX WARN: Multi-variable type inference failed */
            public EquityBuyingPower() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public /* synthetic */ EquityBuyingPower(Money money, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : money);
            }

            public final Money getBuyingPower() {
                return this.buyingPower;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public EquityBuyingPower(Money money) {
                Money money2;
                ApiInvestmentSchedule.SourceOfFunds sourceOfFunds;
                int i;
                String str;
                ApiInvestmentSchedule.SourceOfFunds sourceOfFunds2 = ApiInvestmentSchedule.SourceOfFunds.BUYING_POWER;
                StringResource.Companion companion = StringResource.INSTANCE;
                StringResource stringResourceInvoke = companion.invoke(C11595R.string.investment_schedule_source_of_funds_buying_power, new Object[0]);
                int i2 = C11595R.string.equity_recurring_source_of_funds_buying_power_desc;
                if (money != null) {
                    sourceOfFunds = sourceOfFunds2;
                    i = i2;
                    str = Money.format$default(money, null, false, null, false, 0, null, false, null, false, false, 1023, null);
                    money2 = money;
                    if (str == null) {
                    }
                    ApiInvestmentSchedule.SourceOfFunds sourceOfFunds3 = sourceOfFunds;
                    super(sourceOfFunds3, stringResourceInvoke, companion.invoke(i, str), null, null, 8, null);
                    this.buyingPower = money2;
                }
                money2 = money;
                sourceOfFunds = sourceOfFunds2;
                i = i2;
                str = "-";
                ApiInvestmentSchedule.SourceOfFunds sourceOfFunds32 = sourceOfFunds;
                super(sourceOfFunds32, stringResourceInvoke, companion.invoke(i, str), null, null, 8, null);
                this.buyingPower = money2;
            }
        }

        /* compiled from: RecurringPaymentMethodBottomSheet.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/bottomsheet/paymentmethod/RecurringPaymentMethodBottomSheet$Row$GenericBuyingPower;", "Lcom/robinhood/android/common/recurring/bottomsheet/paymentmethod/RecurringPaymentMethodBottomSheet$Row;", "<init>", "()V", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class GenericBuyingPower extends Row {
            public static final GenericBuyingPower INSTANCE = new GenericBuyingPower();
            public static final int $stable = StringResource.$stable;

            private GenericBuyingPower() {
                super(ApiInvestmentSchedule.SourceOfFunds.BUYING_POWER, StringResource.INSTANCE.invoke(C11595R.string.investment_schedule_source_of_funds_buying_power, new Object[0]), null, null, null, 8, null);
            }
        }

        /* compiled from: RecurringPaymentMethodBottomSheet.kt */
        @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/bottomsheet/paymentmethod/RecurringPaymentMethodBottomSheet$Row$AchRelationship;", "Lcom/robinhood/android/common/recurring/bottomsheet/paymentmethod/RecurringPaymentMethodBottomSheet$Row;", "achRelationship", "Lcom/robinhood/models/db/AchRelationship;", "showPaymentMethodAnnotation", "", "<init>", "(Lcom/robinhood/models/db/AchRelationship;Z)V", "getAchRelationship", "()Lcom/robinhood/models/db/AchRelationship;", "getShowPaymentMethodAnnotation", "()Z", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class AchRelationship extends Row {
            public static final int $stable = 8;
            private final com.robinhood.models.p320db.AchRelationship achRelationship;
            private final boolean showPaymentMethodAnnotation;

            public final com.robinhood.models.p320db.AchRelationship getAchRelationship() {
                return this.achRelationship;
            }

            public final boolean getShowPaymentMethodAnnotation() {
                return this.showPaymentMethodAnnotation;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public AchRelationship(com.robinhood.models.p320db.AchRelationship achRelationship, boolean z) {
                StringResource typeAndLastFourDisplayStringResource;
                Intrinsics.checkNotNullParameter(achRelationship, "achRelationship");
                ApiInvestmentSchedule.SourceOfFunds sourceOfFunds = ApiInvestmentSchedule.SourceOfFunds.ACH_RELATIONSHIP;
                StringResource.Companion companion = StringResource.INSTANCE;
                String bankAccountNickname = achRelationship.getBankAccountNickname();
                Intrinsics.checkNotNull(bankAccountNickname);
                StringResource stringResourceInvoke = companion.invoke(bankAccountNickname);
                if (z) {
                    typeAndLastFourDisplayStringResource = companion.invoke(C11595R.string.ira_payment_method_separator_and_ach, AchRelationships.getTypeAndLastFourDisplayStringResource(achRelationship));
                } else {
                    typeAndLastFourDisplayStringResource = AchRelationships.getTypeAndLastFourDisplayStringResource(achRelationship);
                }
                super(sourceOfFunds, stringResourceInvoke, typeAndLastFourDisplayStringResource, z ? companion.invoke(C11595R.string.ira_payment_method_annotation, new Object[0]) : null, null, null);
                this.achRelationship = achRelationship;
                this.showPaymentMethodAnnotation = z;
            }
        }

        /* compiled from: RecurringPaymentMethodBottomSheet.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/bottomsheet/paymentmethod/RecurringPaymentMethodBottomSheet$Row$AddAccount;", "Lcom/robinhood/android/common/recurring/bottomsheet/paymentmethod/RecurringPaymentMethodBottomSheet$Row;", "<init>", "()V", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class AddAccount extends Row {
            public static final AddAccount INSTANCE = new AddAccount();
            public static final int $stable = StringResource.$stable;

            private AddAccount() {
                super(null, StringResource.INSTANCE.invoke(C11595R.string.equity_recurring_source_of_funds_add_account, new Object[0]), null, null, Integer.valueOf(C20690R.drawable.ic_rds_bubble_plus_24dp), 8, null);
            }
        }

        /* compiled from: RecurringPaymentMethodBottomSheet.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/bottomsheet/paymentmethod/RecurringPaymentMethodBottomSheet$Row$RemoveBackup;", "Lcom/robinhood/android/common/recurring/bottomsheet/paymentmethod/RecurringPaymentMethodBottomSheet$Row;", "<init>", "()V", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class RemoveBackup extends Row {
            public static final RemoveBackup INSTANCE = new RemoveBackup();
            public static final int $stable = StringResource.$stable;

            private RemoveBackup() {
                super(null, StringResource.INSTANCE.invoke(C11595R.string.recurring_backup_payment_method_remove, new Object[0]), null, null, Integer.valueOf(C20690R.drawable.ic_rds_action_remove_24dp), 8, null);
            }
        }
    }

    /* compiled from: RecurringPaymentMethodBottomSheet.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/bottomsheet/paymentmethod/RecurringPaymentMethodBottomSheet$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/common/recurring/bottomsheet/paymentmethod/RecurringPaymentMethodBottomSheet;", "Lcom/robinhood/android/common/recurring/bottomsheet/paymentmethod/RecurringPaymentMethodBottomSheetArgs;", "<init>", "()V", "REQUEST_CODE_IAV_FLOW", "", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<RecurringPaymentMethodBottomSheet, RecurringPaymentMethodBottomSheetArgs> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public RecurringPaymentMethodBottomSheetArgs getArgs(RecurringPaymentMethodBottomSheet recurringPaymentMethodBottomSheet) {
            return (RecurringPaymentMethodBottomSheetArgs) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, recurringPaymentMethodBottomSheet);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RecurringPaymentMethodBottomSheet newInstance(RecurringPaymentMethodBottomSheetArgs recurringPaymentMethodBottomSheetArgs) {
            return (RecurringPaymentMethodBottomSheet) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, recurringPaymentMethodBottomSheetArgs);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RecurringPaymentMethodBottomSheet recurringPaymentMethodBottomSheet, RecurringPaymentMethodBottomSheetArgs recurringPaymentMethodBottomSheetArgs) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, recurringPaymentMethodBottomSheet, recurringPaymentMethodBottomSheetArgs);
        }
    }
}
