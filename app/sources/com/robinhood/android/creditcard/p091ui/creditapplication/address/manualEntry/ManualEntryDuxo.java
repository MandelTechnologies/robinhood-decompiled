package com.robinhood.android.creditcard.p091ui.creditapplication.address.manualEntry;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel2;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.creditcard.p091ui.creditapplication.address.manualEntry.ManualAddressEntryFragment;
import com.robinhood.android.creditcard.p091ui.creditapplication.address.manualEntry.ManualEntryDuxo3;
import com.robinhood.android.lib.store.creditcard.CreditCardStore;
import com.robinhood.android.models.creditcard.api.graphql.AddressType;
import com.robinhood.android.models.creditcard.api.graphql.AddressType2;
import com.robinhood.android.models.creditcard.api.graphql.AddressValidityResponse;
import com.robinhood.android.models.creditcard.api.graphql.ResidencyPurposeType;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.coroutines.dagger.annotation.DefaultDispatcher;
import com.robinhood.utils.logging.CrashReporter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import timber.log.Timber;

/* compiled from: ManualEntryDuxo.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0017B+\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0001\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0011\u001a\u00020\u0012H\u0000¢\u0006\u0002\b\u0013J\u000e\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/address/manualEntry/ManualEntryDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/creditcard/ui/creditapplication/address/manualEntry/ManualEntryViewState;", "Lcom/robinhood/android/creditcard/ui/creditapplication/address/manualEntry/ManualEntryEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "creditCardStore", "Lcom/robinhood/android/lib/store/creditcard/CreditCardStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "defaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/lib/store/creditcard/CreditCardStore;Landroidx/lifecycle/SavedStateHandle;Lkotlinx/coroutines/CoroutineDispatcher;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "doneLoading", "", "doneLoading$feature_credit_card_externalDebug", "validateAddress", PlaceTypes.ADDRESS, "Lcom/robinhood/android/models/creditcard/api/graphql/AddressType;", "Companion", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class ManualEntryDuxo extends BaseDuxo5<ManualEntryViewState, ManualEntryDuxo3> implements HasSavedState {
    private final CreditCardStore creditCardStore;
    private final CoroutineDispatcher defaultDispatcher;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManualEntryDuxo(CreditCardStore creditCardStore, SavedStateHandle savedStateHandle, @DefaultDispatcher CoroutineDispatcher defaultDispatcher, DuxoBundle duxoBundle) {
        super(new ManualEntryViewState(false, null, 3, null), duxoBundle);
        Intrinsics.checkNotNullParameter(creditCardStore, "creditCardStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.creditCardStore = creditCardStore;
        this.savedStateHandle = savedStateHandle;
        this.defaultDispatcher = defaultDispatcher;
    }

    public final void doneLoading$feature_credit_card_externalDebug() {
        applyMutation(new ManualEntryDuxo2(null));
    }

    /* compiled from: ManualEntryDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.address.manualEntry.ManualEntryDuxo$validateAddress$1", m3645f = "ManualEntryDuxo.kt", m3646l = {40}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.address.manualEntry.ManualEntryDuxo$validateAddress$1 */
    static final class C122781 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AddressType $address;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C122781(AddressType addressType, Continuation<? super C122781> continuation) {
            super(2, continuation);
            this.$address = addressType;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ManualEntryDuxo.this.new C122781(this.$address, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C122781) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: ManualEntryDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/creditapplication/address/manualEntry/ManualEntryViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.address.manualEntry.ManualEntryDuxo$validateAddress$1$1", m3645f = "ManualEntryDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.address.manualEntry.ManualEntryDuxo$validateAddress$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<ManualEntryViewState, Continuation<? super ManualEntryViewState>, Object> {
            final /* synthetic */ AddressType $address;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(AddressType addressType, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$address = addressType;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$address, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ManualEntryViewState manualEntryViewState, Continuation<? super ManualEntryViewState> continuation) {
                return ((AnonymousClass1) create(manualEntryViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ((ManualEntryViewState) this.L$0).copy(true, this.$address);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            ResidencyPurposeType residencyPurposeType;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    ManualEntryDuxo.this.applyMutation(new AnonymousClass1(this.$address, null));
                    CreditCardStore creditCardStore = ManualEntryDuxo.this.creditCardStore;
                    AddressType addressType = this.$address;
                    if (((ManualAddressEntryFragment.Args) ManualEntryDuxo.INSTANCE.getArgs((HasSavedState) ManualEntryDuxo.this)).getIsShipping()) {
                        residencyPurposeType = ResidencyPurposeType.SHIPPING;
                    } else {
                        residencyPurposeType = ResidencyPurposeType.BILLING;
                    }
                    this.label = 1;
                    obj = creditCardStore.getAddressValidity(addressType, residencyPurposeType, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                AddressValidityResponse addressValidityResponse = (AddressValidityResponse) obj;
                AddressValidityResponse.Response addressValidity = addressValidityResponse != null ? addressValidityResponse.getAddressValidity() : null;
                if (addressValidity != null) {
                    AddressType formattedAddress = addressValidity.getFormattedAddress();
                    AddressType2 error = addressValidity.getError();
                    if (formattedAddress != null && !Intrinsics.areEqual(formattedAddress, addressValidity.getAddress())) {
                        ManualEntryDuxo.this.submit(new ManualEntryDuxo3.Suggestion(addressValidity.getAddress(), formattedAddress));
                    } else if (error != null) {
                        ManualEntryDuxo.this.submit(new ManualEntryDuxo3.Error(addressValidity.getAddress(), error, addressValidity.getErrorSkippable()));
                    } else {
                        ManualEntryDuxo.this.submit(new ManualEntryDuxo3.Continue(addressValidity.getAddress()));
                    }
                } else {
                    ManualEntryDuxo.this.submit(new ManualEntryDuxo3.Error(this.$address, AddressType2.SKIPPABLE_UNEXPECTED_ERROR, false));
                }
            } catch (Throwable th) {
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 6, null);
                Timber.INSTANCE.mo3355e(th, "addressValidity error", new Object[0]);
                ManualEntryDuxo.this.submit(new ManualEntryDuxo3.Error(this.$address, AddressType2.UNKNOWN, false));
            }
            return Unit.INSTANCE;
        }
    }

    public final void validateAddress(AddressType address) {
        Intrinsics.checkNotNullParameter(address, "address");
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), this.defaultDispatcher, null, new C122781(address, null), 2, null);
    }

    /* compiled from: ManualEntryDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/address/manualEntry/ManualEntryDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/creditcard/ui/creditapplication/address/manualEntry/ManualEntryDuxo;", "Lcom/robinhood/android/creditcard/ui/creditapplication/address/manualEntry/ManualAddressEntryFragment$Args;", "<init>", "()V", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<ManualEntryDuxo, ManualAddressEntryFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public ManualAddressEntryFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (ManualAddressEntryFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public ManualAddressEntryFragment.Args getArgs(ManualEntryDuxo manualEntryDuxo) {
            return (ManualAddressEntryFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, manualEntryDuxo);
        }
    }
}
