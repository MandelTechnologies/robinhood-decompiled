package com.robinhood.android.transfers.p271ui.max;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.view.result.ActivityResultCaller;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.banking.experiments.RecurringDepositIncludeCurrent;
import com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.selectioncontrol.NewRdsRadioGroup;
import com.robinhood.android.navigation.DialogFragmentResolverWithArgsCompanion;
import com.robinhood.android.transfers.C30065R;
import com.robinhood.android.transfers.contracts.TransferFrequencyBottomSheetCallbacks;
import com.robinhood.android.transfers.contracts.TransferFrequencyBottomSheetFragmentKey;
import com.robinhood.android.transfers.databinding.FragmentTransferFrequencyBottomSheetBinding;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.experiments.SimpleVariant;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: TransferFrequencyBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 /2\u00020\u0001:\u0001/B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\b\u0010,\u001a\u00020'H\u0002J\b\u0010-\u001a\u00020'H\u0016J\b\u0010.\u001a\u00020'H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010!\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b#\u0010$¨\u00060"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/TransferFrequencyBottomSheet;", "Lcom/robinhood/android/common/ui/BaseBottomSheetDialogFragment;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "getExperimentsStore", "()Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "setExperimentsStore", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;)V", "callbacks", "Lcom/robinhood/android/transfers/contracts/TransferFrequencyBottomSheetCallbacks;", "getCallbacks", "()Lcom/robinhood/android/transfers/contracts/TransferFrequencyBottomSheetCallbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "binding", "Lcom/robinhood/android/transfers/databinding/FragmentTransferFrequencyBottomSheetBinding;", "getBinding", "()Lcom/robinhood/android/transfers/databinding/FragmentTransferFrequencyBottomSheetBinding;", "binding$delegate", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "eventScreen$delegate", "Lkotlin/Lazy;", "eventComponent", "Lcom/robinhood/rosetta/eventlogging/Component;", "getEventComponent", "()Lcom/robinhood/rosetta/eventlogging/Component;", "eventComponent$delegate", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "showScreen", "onStart", "onStop", "Companion", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class TransferFrequencyBottomSheet extends BaseBottomSheetDialogFragment {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: eventComponent$delegate, reason: from kotlin metadata */
    private final Lazy eventComponent;
    public EventLogger eventLogger;

    /* renamed from: eventScreen$delegate, reason: from kotlin metadata */
    private final Lazy eventScreen;
    public ExperimentsStore experimentsStore;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(TransferFrequencyBottomSheet.class, "callbacks", "getCallbacks()Lcom/robinhood/android/transfers/contracts/TransferFrequencyBottomSheetCallbacks;", 0)), Reflection.property1(new PropertyReference1Impl(TransferFrequencyBottomSheet.class, "binding", "getBinding()Lcom/robinhood/android/transfers/databinding/FragmentTransferFrequencyBottomSheetBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: TransferFrequencyBottomSheet.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiCreateTransferRequest2.values().length];
            try {
                iArr[ApiCreateTransferRequest2.ONCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiCreateTransferRequest2.WEEKLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiCreateTransferRequest2.BIWEEKLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApiCreateTransferRequest2.MONTHLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ApiCreateTransferRequest2.QUARTERLY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ApiCreateTransferRequest2.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public TransferFrequencyBottomSheet() {
        super(C30065R.layout.fragment_transfer_frequency_bottom_sheet);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(TransferFrequencyBottomSheetCallbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.transfers.ui.max.TransferFrequencyBottomSheet$special$$inlined$parentFragmentThenActivityHostCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                ActivityResultCaller parentFragment = CallbacksProperty.getParentFragment();
                if (!(parentFragment instanceof TransferFrequencyBottomSheetCallbacks)) {
                    parentFragment = null;
                }
                TransferFrequencyBottomSheetCallbacks transferFrequencyBottomSheetCallbacks = (TransferFrequencyBottomSheetCallbacks) parentFragment;
                if (transferFrequencyBottomSheetCallbacks != null) {
                    return transferFrequencyBottomSheetCallbacks;
                }
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof TransferFrequencyBottomSheetCallbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.binding = ViewBinding5.viewBinding(this, TransferFrequencyBottomSheet2.INSTANCE);
        this.eventScreen = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.transfers.ui.max.TransferFrequencyBottomSheet$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransferFrequencyBottomSheet.eventScreen_delegate$lambda$0();
            }
        });
        this.eventComponent = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.transfers.ui.max.TransferFrequencyBottomSheet$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransferFrequencyBottomSheet.eventComponent_delegate$lambda$1();
            }
        });
    }

    public final EventLogger getEventLogger() {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            return eventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<set-?>");
        this.eventLogger = eventLogger;
    }

    public final ExperimentsStore getExperimentsStore() {
        ExperimentsStore experimentsStore = this.experimentsStore;
        if (experimentsStore != null) {
            return experimentsStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("experimentsStore");
        return null;
    }

    public final void setExperimentsStore(ExperimentsStore experimentsStore) {
        Intrinsics.checkNotNullParameter(experimentsStore, "<set-?>");
        this.experimentsStore = experimentsStore;
    }

    private final TransferFrequencyBottomSheetCallbacks getCallbacks() {
        return (TransferFrequencyBottomSheetCallbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final FragmentTransferFrequencyBottomSheetBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[1]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentTransferFrequencyBottomSheetBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Screen eventScreen_delegate$lambda$0() {
        return new Screen(Screen.Name.CREATE_MAX_TRANSFER, null, null, null, 14, null);
    }

    private final Screen getEventScreen() {
        return (Screen) this.eventScreen.getValue();
    }

    private final Component getEventComponent() {
        return (Component) this.eventComponent.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Component eventComponent_delegate$lambda$1() {
        return new Component(Component.ComponentType.BOTTOM_SHEET, "choose-frequency", null, 4, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (!CollectionsKt.contains(CollectionsKt.listOf((Object[]) new MAXTransferContext.EntryPoint[]{MAXTransferContext.EntryPoint.RECURRING_TRANSFER_HUB, MAXTransferContext.EntryPoint.RECURRING_DEPOSIT_UPSELL}), ((TransferFrequencyBottomSheetFragmentKey) INSTANCE.getArgs((Fragment) this)).getEntryPoint())) {
            ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, ExperimentsProvider.DefaultImpls.streamVariant$default(getExperimentsStore(), RecurringDepositIncludeCurrent.INSTANCE, SimpleVariant.CONTROL, false, 4, null), (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.transfers.ui.max.TransferFrequencyBottomSheet$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TransferFrequencyBottomSheet.onViewCreated$lambda$2(this.f$0, (SimpleVariant) obj);
                }
            }, new Function1() { // from class: com.robinhood.android.transfers.ui.max.TransferFrequencyBottomSheet$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TransferFrequencyBottomSheet.onViewCreated$lambda$3(this.f$0, (Throwable) obj);
                }
            }, null, null, 12, null);
        } else {
            showScreen();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2(TransferFrequencyBottomSheet transferFrequencyBottomSheet, SimpleVariant it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it == SimpleVariant.MEMBER) {
            transferFrequencyBottomSheet.getBinding().transferFrequencyWeekly.setSecondaryText(transferFrequencyBottomSheet.getString(C30065R.string.automatic_deposit_frequency_weekly_description_include_today));
            transferFrequencyBottomSheet.getBinding().transferFrequencyBiweekly.setSecondaryText(transferFrequencyBottomSheet.getString(C30065R.string.automatic_deposit_frequency_biweekly_description_include_today));
            transferFrequencyBottomSheet.getBinding().transferFrequencyMonthly.setSecondaryText(transferFrequencyBottomSheet.getString(C30065R.string.automatic_deposit_frequency_monthly_description_include_today));
            transferFrequencyBottomSheet.getBinding().transferFrequencyQuarterly.setSecondaryText(transferFrequencyBottomSheet.getString(C30065R.string.automatic_deposit_frequency_quarterly_description_include_today));
        }
        transferFrequencyBottomSheet.showScreen();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3(TransferFrequencyBottomSheet transferFrequencyBottomSheet, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        transferFrequencyBottomSheet.showScreen();
        return Unit.INSTANCE;
    }

    private final void showScreen() {
        int i;
        FragmentTransferFrequencyBottomSheetBinding binding = getBinding();
        Companion companion = INSTANCE;
        if (((TransferFrequencyBottomSheetFragmentKey) companion.getArgs((Fragment) this)).getDisableOnceOption()) {
            binding.transferFrequencyOnce.setEnabled(false);
        }
        NewRdsRadioGroup newRdsRadioGroup = binding.transferFrequencySelectionGroup;
        switch (WhenMappings.$EnumSwitchMapping$0[((TransferFrequencyBottomSheetFragmentKey) companion.getArgs((Fragment) this)).getSelectedFrequency().ordinal()]) {
            case 1:
                i = C30065R.id.transfer_frequency_once;
                break;
            case 2:
                i = C30065R.id.transfer_frequency_weekly;
                break;
            case 3:
                i = C30065R.id.transfer_frequency_biweekly;
                break;
            case 4:
                i = C30065R.id.transfer_frequency_monthly;
                break;
            case 5:
                i = C30065R.id.transfer_frequency_quarterly;
                break;
            case 6:
                throw new IllegalStateException("Unknown should not be an option!");
            default:
                throw new NoWhenBranchMatchedException();
        }
        newRdsRadioGroup.check(i);
        binding.transferFrequencySelectionGroup.onCheckedChange(new Function2() { // from class: com.robinhood.android.transfers.ui.max.TransferFrequencyBottomSheet$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return TransferFrequencyBottomSheet.showScreen$lambda$5$lambda$4(this.f$0, (NewRdsRadioGroup) obj, ((Integer) obj2).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showScreen$lambda$5$lambda$4(TransferFrequencyBottomSheet transferFrequencyBottomSheet, NewRdsRadioGroup newRdsRadioGroup, int i) {
        ApiCreateTransferRequest2 apiCreateTransferRequest2;
        Intrinsics.checkNotNullParameter(newRdsRadioGroup, "<unused var>");
        TransferFrequencyBottomSheetCallbacks callbacks = transferFrequencyBottomSheet.getCallbacks();
        if (i == C30065R.id.transfer_frequency_once) {
            apiCreateTransferRequest2 = ApiCreateTransferRequest2.ONCE;
        } else if (i == C30065R.id.transfer_frequency_weekly) {
            apiCreateTransferRequest2 = ApiCreateTransferRequest2.WEEKLY;
        } else if (i == C30065R.id.transfer_frequency_biweekly) {
            apiCreateTransferRequest2 = ApiCreateTransferRequest2.BIWEEKLY;
        } else if (i == C30065R.id.transfer_frequency_monthly) {
            apiCreateTransferRequest2 = ApiCreateTransferRequest2.MONTHLY;
        } else if (i == C30065R.id.transfer_frequency_quarterly) {
            apiCreateTransferRequest2 = ApiCreateTransferRequest2.QUARTERLY;
        } else {
            throw new IllegalStateException("unexpected id");
        }
        callbacks.onFrequencySelected(apiCreateTransferRequest2);
        transferFrequencyBottomSheet.dismiss();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        EventLogger.DefaultImpls.logAppear$default(getEventLogger(), null, getEventScreen(), getEventComponent(), null, null, 25, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        EventLogger.DefaultImpls.logDisappear$default(getEventLogger(), null, getEventScreen(), getEventComponent(), null, null, 25, null);
    }

    /* compiled from: TransferFrequencyBottomSheet.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/TransferFrequencyBottomSheet$Companion;", "Lcom/robinhood/android/navigation/DialogFragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/transfers/ui/max/TransferFrequencyBottomSheet;", "Lcom/robinhood/android/transfers/contracts/TransferFrequencyBottomSheetFragmentKey;", "<init>", "()V", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DialogFragmentResolverWithArgsCompanion<TransferFrequencyBottomSheet, TransferFrequencyBottomSheetFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.DialogFragmentResolverWithArgsCompanion, com.robinhood.android.navigation.DialogFragmentResolver
        public TransferFrequencyBottomSheet createDialogFragment(TransferFrequencyBottomSheetFragmentKey transferFrequencyBottomSheetFragmentKey) {
            return (TransferFrequencyBottomSheet) DialogFragmentResolverWithArgsCompanion.DefaultImpls.createDialogFragment(this, transferFrequencyBottomSheetFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public TransferFrequencyBottomSheetFragmentKey getArgs(TransferFrequencyBottomSheet transferFrequencyBottomSheet) {
            return (TransferFrequencyBottomSheetFragmentKey) DialogFragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, transferFrequencyBottomSheet);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public TransferFrequencyBottomSheet newInstance(TransferFrequencyBottomSheetFragmentKey transferFrequencyBottomSheetFragmentKey) {
            return (TransferFrequencyBottomSheet) DialogFragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, transferFrequencyBottomSheetFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(TransferFrequencyBottomSheet transferFrequencyBottomSheet, TransferFrequencyBottomSheetFragmentKey transferFrequencyBottomSheetFragmentKey) {
            DialogFragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, transferFrequencyBottomSheet, transferFrequencyBottomSheetFragmentKey);
        }
    }
}
