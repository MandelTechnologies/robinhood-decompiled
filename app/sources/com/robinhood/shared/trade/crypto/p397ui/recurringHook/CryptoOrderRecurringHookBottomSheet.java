package com.robinhood.shared.trade.crypto.p397ui.recurringHook;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.BaseDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.selectioncontrol.RdsRadioButtonRowView;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.regiongate.CryptoRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.models.crypto.p314db.Currency;
import com.robinhood.models.crypto.p315ui.fee.CryptoOrderMonetizationModel;
import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.shared.crypto.p375ui.fee.unsupported.recurring.CryptoFeeUnsupportedRecurringAlertDialogFragment;
import com.robinhood.shared.trade.crypto.C40095R;
import com.robinhood.shared.trade.crypto.databinding.FragmentCryptoRecurringHookBottomSheetBinding;
import com.robinhood.shared.trade.crypto.p397ui.recurringHook.CryptoOrderRecurringHookBottomSheet;
import com.robinhood.shared.trade.crypto.p397ui.recurringHook.CryptoOrderRecurringHookEvent;
import com.robinhood.shared.trade.crypto.p397ui.recurringHook.CryptoOrderRecurringHookViewState;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import com.robinhood.utils.resource.StringResource;
import java.util.Set;
import kotlin.ExceptionsH;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import p479j$.time.LocalDate;

/* compiled from: CryptoOrderRecurringHookBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 52\u00020\u00012\u00020\u00022\u00020\u0003:\u0003345B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u001a\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0016\u0010$\u001a\u00020\u001c2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&H\u0002J\u0010\u0010(\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020*H\u0016J\b\u0010+\u001a\u00020\u001cH\u0016J\t\u0010,\u001a\u00020-H\u0096\u0001R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010.\u001a\b\u0012\u0004\u0012\u0002000/X\u0096\u0005¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00066"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/recurringHook/CryptoOrderRecurringHookBottomSheet;", "Lcom/robinhood/android/common/ui/BaseBottomSheetDialogFragment;", "Lcom/robinhood/shared/crypto/ui/fee/unsupported/recurring/CryptoFeeUnsupportedRecurringAlertDialogFragment$Callbacks;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "binding", "Lcom/robinhood/shared/trade/crypto/databinding/FragmentCryptoRecurringHookBottomSheetBinding;", "getBinding", "()Lcom/robinhood/shared/trade/crypto/databinding/FragmentCryptoRecurringHookBottomSheetBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/shared/trade/crypto/ui/recurringHook/CryptoOrderRecurringHookDuxo;", "getDuxo", "()Lcom/robinhood/shared/trade/crypto/ui/recurringHook/CryptoOrderRecurringHookDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/shared/trade/crypto/ui/recurringHook/CryptoOrderRecurringHookBottomSheet$Callbacks;", "getCallbacks", "()Lcom/robinhood/shared/trade/crypto/ui/recurringHook/CryptoOrderRecurringHookBottomSheet$Callbacks;", "callbacks$delegate", "frequencyItemAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/designsystem/selectioncontrol/RdsRadioButtonRowView;", "Lcom/robinhood/shared/trade/crypto/ui/recurringHook/CryptoOrderRecurringHookViewState$FrequencyRowItem;", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "handleEvent", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/shared/trade/crypto/ui/recurringHook/CryptoOrderRecurringHookEvent;", "onPositiveAction", "action", "Lcom/robinhood/shared/crypto/ui/fee/unsupported/recurring/CryptoFeeUnsupportedRecurringAlertDialogFragment$PositiveAction;", "onCancel", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Args", "Companion", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class CryptoOrderRecurringHookBottomSheet extends BaseBottomSheetDialogFragment implements CryptoFeeUnsupportedRecurringAlertDialogFragment.Callbacks, RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final GenericListAdapter<RdsRadioButtonRowView, CryptoOrderRecurringHookViewState.FrequencyRowItem> frequencyItemAdapter;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(CryptoOrderRecurringHookBottomSheet.class, "binding", "getBinding()Lcom/robinhood/shared/trade/crypto/databinding/FragmentCryptoRecurringHookBottomSheetBinding;", 0)), Reflection.property1(new PropertyReference1Impl(CryptoOrderRecurringHookBottomSheet.class, "callbacks", "getCallbacks()Lcom/robinhood/shared/trade/crypto/ui/recurringHook/CryptoOrderRecurringHookBottomSheet$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: CryptoOrderRecurringHookBottomSheet.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/recurringHook/CryptoOrderRecurringHookBottomSheet$Callbacks;", "", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "frequency", "j$/time/LocalDate", "startDate", "", "onRecurringOptionsSelected", "(Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;Lj$/time/LocalDate;)V", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onRecurringOptionsSelected(ApiInvestmentSchedule.Frequency frequency, LocalDate startDate);
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent(final Event<CryptoOrderRecurringHookEvent> event) {
        EventConsumer<CryptoOrderRecurringHookEvent> eventConsumerInvoke;
        EventConsumer<CryptoOrderRecurringHookEvent> eventConsumerInvoke2;
        if ((event.getData() instanceof CryptoOrderRecurringHookEvent.ContinueWithSelectedRecurringOption) && (eventConsumerInvoke2 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke2.consume(event, new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.recurringHook.CryptoOrderRecurringHookBottomSheet$handleEvent$$inlined$consumeIfType$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m25993invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m25993invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    CryptoOrderRecurringHookEvent.ContinueWithSelectedRecurringOption continueWithSelectedRecurringOption = (CryptoOrderRecurringHookEvent.ContinueWithSelectedRecurringOption) event.getData();
                    this.getCallbacks().onRecurringOptionsSelected(continueWithSelectedRecurringOption.getFrequency(), continueWithSelectedRecurringOption.getStartDate());
                    this.dismiss();
                }
            });
        }
        if (!(event.getData() instanceof CryptoOrderRecurringHookEvent.ShowCryptoFeeUnsupportedRecurringAlert) || (eventConsumerInvoke = event.getGetEventConsumer().invoke()) == null) {
            return;
        }
        eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.recurringHook.CryptoOrderRecurringHookBottomSheet$handleEvent$$inlined$consumeIfType$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m25994invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m25994invoke(Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                CryptoFeeUnsupportedRecurringAlertDialogFragment cryptoFeeUnsupportedRecurringAlertDialogFragment = (CryptoFeeUnsupportedRecurringAlertDialogFragment) CryptoFeeUnsupportedRecurringAlertDialogFragment.INSTANCE.newInstance((Parcelable) new CryptoFeeUnsupportedRecurringAlertDialogFragment.Args(new Screen(Screen.Name.CRYPTO_ORDER_ENTRY, null, null, null, 14, null), ((CryptoOrderRecurringHookBottomSheet.Args) CryptoOrderRecurringHookBottomSheet.INSTANCE.getArgs((Fragment) this)).getCurrency().getCode(), CryptoFeeUnsupportedRecurringAlertDialogFragment.PositiveAction.CONTINUE_WITH_RECURRING));
                FragmentManager childFragmentManager = this.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                cryptoFeeUnsupportedRecurringAlertDialogFragment.show(childFragmentManager, "cryptoFeeUnsupportedRecurringAlertDialogFragment");
            }
        });
    }

    public CryptoOrderRecurringHookBottomSheet() {
        super(C40095R.layout.fragment_crypto_recurring_hook_bottom_sheet);
        this.$$delegate_0 = new RegionGated2(CryptoRegionGate.INSTANCE);
        this.binding = ViewBinding5.viewBinding(this, CryptoOrderRecurringHookBottomSheet2.INSTANCE);
        this.duxo = DuxosKt.duxo(this, CryptoOrderRecurringHookDuxo.class);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.shared.trade.crypto.ui.recurringHook.CryptoOrderRecurringHookBottomSheet$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        this.frequencyItemAdapter = GenericListAdapter.INSTANCE.m2987of(RdsRadioButtonRowView.INSTANCE, DiffCallbacks.INSTANCE.byEquality(new PropertyReference1Impl() { // from class: com.robinhood.shared.trade.crypto.ui.recurringHook.CryptoOrderRecurringHookBottomSheet$frequencyItemAdapter$1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((CryptoOrderRecurringHookViewState.FrequencyRowItem) obj).getFrequency();
            }
        }), new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.recurringHook.CryptoOrderRecurringHookBottomSheet$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CryptoOrderRecurringHookBottomSheet.frequencyItemAdapter$lambda$1(this.f$0, (RdsRadioButtonRowView) obj, (CryptoOrderRecurringHookViewState.FrequencyRowItem) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentCryptoRecurringHookBottomSheetBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentCryptoRecurringHookBottomSheetBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CryptoOrderRecurringHookDuxo getDuxo() {
        return (CryptoOrderRecurringHookDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit frequencyItemAdapter$lambda$1(final CryptoOrderRecurringHookBottomSheet cryptoOrderRecurringHookBottomSheet, RdsRadioButtonRowView of, final CryptoOrderRecurringHookViewState.FrequencyRowItem row) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(row, "row");
        StringResource primaryText = row.getPrimaryText();
        Resources resources = of.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        of.setPrimaryText(primaryText.getText(resources));
        StringResource secondaryText = row.getSecondaryText();
        Resources resources2 = of.getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        of.setSecondaryText(secondaryText.getText(resources2));
        of.setChecked(row.isChecked());
        OnClickListeners.onClick(of, new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.recurringHook.CryptoOrderRecurringHookBottomSheet$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CryptoOrderRecurringHookBottomSheet.frequencyItemAdapter$lambda$1$lambda$0(this.f$0, row);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit frequencyItemAdapter$lambda$1$lambda$0(CryptoOrderRecurringHookBottomSheet cryptoOrderRecurringHookBottomSheet, CryptoOrderRecurringHookViewState.FrequencyRowItem frequencyRowItem) {
        cryptoOrderRecurringHookBottomSheet.getDuxo().setSelectedFrequency(frequencyRowItem.getFrequency());
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, com.robinhood.hammer.android.fragment.HammerDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(scarletContextWrapper), AchromaticOverlay.INSTANCE, null, 2, null);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getBinding().cryptoOrderRecurringHookRecyclerView.setAdapter(this.frequencyItemAdapter);
        BaseDialogFragment.collectDuxoState$default(this, null, new C406611(null), 1, null);
        BaseDialogFragment.collectDuxoState$default(this, null, new C406622(null), 1, null);
    }

    /* compiled from: CryptoOrderRecurringHookBottomSheet.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.recurringHook.CryptoOrderRecurringHookBottomSheet$onViewCreated$1", m3645f = "CryptoOrderRecurringHookBottomSheet.kt", m3646l = {78}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.recurringHook.CryptoOrderRecurringHookBottomSheet$onViewCreated$1 */
    static final class C406611 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C406611(Continuation<? super C406611> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoOrderRecurringHookBottomSheet.this.new C406611(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C406611) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<CryptoOrderRecurringHookViewState> stateFlow = CryptoOrderRecurringHookBottomSheet.this.getDuxo().getStateFlow();
                final CryptoOrderRecurringHookBottomSheet cryptoOrderRecurringHookBottomSheet = CryptoOrderRecurringHookBottomSheet.this;
                FlowCollector<? super CryptoOrderRecurringHookViewState> flowCollector = new FlowCollector() { // from class: com.robinhood.shared.trade.crypto.ui.recurringHook.CryptoOrderRecurringHookBottomSheet.onViewCreated.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((CryptoOrderRecurringHookViewState) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(CryptoOrderRecurringHookViewState cryptoOrderRecurringHookViewState, Continuation<? super Unit> continuation) {
                        cryptoOrderRecurringHookBottomSheet.frequencyItemAdapter.submitList(cryptoOrderRecurringHookViewState.getRowItems());
                        RhTextView rhTextView = cryptoOrderRecurringHookBottomSheet.getBinding().cryptoOrderRecurringHookSubtitle;
                        StringResource subtitleText = cryptoOrderRecurringHookViewState.getSubtitleText();
                        Resources resources = cryptoOrderRecurringHookBottomSheet.getResources();
                        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                        rhTextView.setText(subtitleText.getText(resources));
                        RhTextView rhTextView2 = cryptoOrderRecurringHookBottomSheet.getBinding().cryptoOrderRecurringHookFooter;
                        StringResource footerText = cryptoOrderRecurringHookViewState.getFooterText();
                        Resources resources2 = cryptoOrderRecurringHookBottomSheet.getResources();
                        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                        rhTextView2.setText(footerText.getText(resources2));
                        RdsButton cryptoOrderRecurringHookBtn = cryptoOrderRecurringHookBottomSheet.getBinding().cryptoOrderRecurringHookBtn;
                        Intrinsics.checkNotNullExpressionValue(cryptoOrderRecurringHookBtn, "cryptoOrderRecurringHookBtn");
                        OnClickListeners.onClick(cryptoOrderRecurringHookBtn, new C508031(cryptoOrderRecurringHookBottomSheet.getDuxo()));
                        return Unit.INSTANCE;
                    }

                    /* compiled from: CryptoOrderRecurringHookBottomSheet.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    /* renamed from: com.robinhood.shared.trade.crypto.ui.recurringHook.CryptoOrderRecurringHookBottomSheet$onViewCreated$1$1$1, reason: invalid class name and collision with other inner class name */
                    /* synthetic */ class C508031 extends FunctionReferenceImpl implements Function0<Unit> {
                        C508031(Object obj) {
                            super(0, obj, CryptoOrderRecurringHookDuxo.class, "onContinueTapped", "onContinueTapped()V", 0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            ((CryptoOrderRecurringHookDuxo) this.receiver).onContinueTapped();
                        }
                    }
                };
                this.label = 1;
                if (stateFlow.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new ExceptionsH();
        }
    }

    /* compiled from: CryptoOrderRecurringHookBottomSheet.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.recurringHook.CryptoOrderRecurringHookBottomSheet$onViewCreated$2", m3645f = "CryptoOrderRecurringHookBottomSheet.kt", m3646l = {85}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.recurringHook.CryptoOrderRecurringHookBottomSheet$onViewCreated$2 */
    static final class C406622 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C406622(Continuation<? super C406622> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoOrderRecurringHookBottomSheet.this.new C406622(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C406622) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CryptoOrderRecurringHookBottomSheet.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.shared.trade.crypto.ui.recurringHook.CryptoOrderRecurringHookBottomSheet$onViewCreated$2$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ CryptoOrderRecurringHookBottomSheet $tmp0;

            AnonymousClass1(CryptoOrderRecurringHookBottomSheet cryptoOrderRecurringHookBottomSheet) {
                this.$tmp0 = cryptoOrderRecurringHookBottomSheet;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, CryptoOrderRecurringHookBottomSheet.class, "handleEvent", "handleEvent(Lcom/robinhood/android/udf/event/Event;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(Event<CryptoOrderRecurringHookEvent> event, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$handleEvent = C406622.invokeSuspend$handleEvent(this.$tmp0, event, continuation);
                return objInvokeSuspend$handleEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$handleEvent : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((Event<CryptoOrderRecurringHookEvent>) obj, (Continuation<? super Unit>) continuation);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$handleEvent(CryptoOrderRecurringHookBottomSheet cryptoOrderRecurringHookBottomSheet, Event event, Continuation continuation) {
            cryptoOrderRecurringHookBottomSheet.handleEvent(event);
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(CryptoOrderRecurringHookBottomSheet.this.getDuxo().getEventFlow());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoOrderRecurringHookBottomSheet.this);
                this.label = 1;
                if (flowFilterNotNull.collect(anonymousClass1, this) == coroutine_suspended) {
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

    @Override // com.robinhood.shared.crypto.ui.fee.unsupported.recurring.CryptoFeeUnsupportedRecurringAlertDialogFragment.Callbacks
    public void onPositiveAction(CryptoFeeUnsupportedRecurringAlertDialogFragment.PositiveAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        getDuxo().continueWithSelectedRecurringOption();
    }

    @Override // com.robinhood.shared.crypto.ui.fee.unsupported.recurring.CryptoFeeUnsupportedRecurringAlertDialogFragment.Callbacks
    public void onCancel() {
        getDuxo().setSelectedFrequency(CryptoOrderRecurringHookFrequency.ONE_TIME);
        dismiss();
    }

    /* compiled from: CryptoOrderRecurringHookBottomSheet.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\""}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/recurringHook/CryptoOrderRecurringHookBottomSheet$Args;", "Landroid/os/Parcelable;", "currency", "Lcom/robinhood/models/crypto/db/Currency;", "frequency", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "cryptoOrderMonetizationModel", "Lcom/robinhood/models/crypto/ui/fee/CryptoOrderMonetizationModel;", "<init>", "(Lcom/robinhood/models/crypto/db/Currency;Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;Lcom/robinhood/models/crypto/ui/fee/CryptoOrderMonetizationModel;)V", "getCurrency", "()Lcom/robinhood/models/crypto/db/Currency;", "getFrequency", "()Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "getCryptoOrderMonetizationModel", "()Lcom/robinhood/models/crypto/ui/fee/CryptoOrderMonetizationModel;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final CryptoOrderMonetizationModel cryptoOrderMonetizationModel;
        private final Currency currency;
        private final ApiInvestmentSchedule.Frequency frequency;

        /* compiled from: CryptoOrderRecurringHookBottomSheet.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((Currency) parcel.readParcelable(Args.class.getClassLoader()), parcel.readInt() == 0 ? null : ApiInvestmentSchedule.Frequency.valueOf(parcel.readString()), (CryptoOrderMonetizationModel) parcel.readParcelable(Args.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, Currency currency, ApiInvestmentSchedule.Frequency frequency, CryptoOrderMonetizationModel cryptoOrderMonetizationModel, int i, Object obj) {
            if ((i & 1) != 0) {
                currency = args.currency;
            }
            if ((i & 2) != 0) {
                frequency = args.frequency;
            }
            if ((i & 4) != 0) {
                cryptoOrderMonetizationModel = args.cryptoOrderMonetizationModel;
            }
            return args.copy(currency, frequency, cryptoOrderMonetizationModel);
        }

        /* renamed from: component1, reason: from getter */
        public final Currency getCurrency() {
            return this.currency;
        }

        /* renamed from: component2, reason: from getter */
        public final ApiInvestmentSchedule.Frequency getFrequency() {
            return this.frequency;
        }

        /* renamed from: component3, reason: from getter */
        public final CryptoOrderMonetizationModel getCryptoOrderMonetizationModel() {
            return this.cryptoOrderMonetizationModel;
        }

        public final Args copy(Currency currency, ApiInvestmentSchedule.Frequency frequency, CryptoOrderMonetizationModel cryptoOrderMonetizationModel) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            return new Args(currency, frequency, cryptoOrderMonetizationModel);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return Intrinsics.areEqual(this.currency, args.currency) && this.frequency == args.frequency && Intrinsics.areEqual(this.cryptoOrderMonetizationModel, args.cryptoOrderMonetizationModel);
        }

        public int hashCode() {
            int iHashCode = this.currency.hashCode() * 31;
            ApiInvestmentSchedule.Frequency frequency = this.frequency;
            int iHashCode2 = (iHashCode + (frequency == null ? 0 : frequency.hashCode())) * 31;
            CryptoOrderMonetizationModel cryptoOrderMonetizationModel = this.cryptoOrderMonetizationModel;
            return iHashCode2 + (cryptoOrderMonetizationModel != null ? cryptoOrderMonetizationModel.hashCode() : 0);
        }

        public String toString() {
            return "Args(currency=" + this.currency + ", frequency=" + this.frequency + ", cryptoOrderMonetizationModel=" + this.cryptoOrderMonetizationModel + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.currency, flags);
            ApiInvestmentSchedule.Frequency frequency = this.frequency;
            if (frequency == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(frequency.name());
            }
            dest.writeParcelable(this.cryptoOrderMonetizationModel, flags);
        }

        public Args(Currency currency, ApiInvestmentSchedule.Frequency frequency, CryptoOrderMonetizationModel cryptoOrderMonetizationModel) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.currency = currency;
            this.frequency = frequency;
            this.cryptoOrderMonetizationModel = cryptoOrderMonetizationModel;
        }

        public final Currency getCurrency() {
            return this.currency;
        }

        public final ApiInvestmentSchedule.Frequency getFrequency() {
            return this.frequency;
        }

        public final CryptoOrderMonetizationModel getCryptoOrderMonetizationModel() {
            return this.cryptoOrderMonetizationModel;
        }
    }

    /* compiled from: CryptoOrderRecurringHookBottomSheet.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/recurringHook/CryptoOrderRecurringHookBottomSheet$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/shared/trade/crypto/ui/recurringHook/CryptoOrderRecurringHookBottomSheet;", "Lcom/robinhood/shared/trade/crypto/ui/recurringHook/CryptoOrderRecurringHookBottomSheet$Args;", "<init>", "()V", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<CryptoOrderRecurringHookBottomSheet, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(CryptoOrderRecurringHookBottomSheet cryptoOrderRecurringHookBottomSheet) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, cryptoOrderRecurringHookBottomSheet);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public CryptoOrderRecurringHookBottomSheet newInstance(Args args) {
            return (CryptoOrderRecurringHookBottomSheet) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(CryptoOrderRecurringHookBottomSheet cryptoOrderRecurringHookBottomSheet, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, cryptoOrderRecurringHookBottomSheet, args);
        }
    }
}
