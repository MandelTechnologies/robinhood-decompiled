package com.robinhood.android.debitcard.linking.p098ui;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.transfers.lib.lastused.PaymentMethodLastUsagesPref;
import com.robinhood.android.transfers.lib.lastused.UpdatePaymentMethodLastUsed;
import com.robinhood.compose.app.ShimmerLoadingFragment;
import com.robinhood.compose.common.ShimmerLoaderType;
import com.robinhood.prefs.StringToLongMapPreference;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.UUID;
import kotlin.ExceptionsH;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
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
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: DebitCardVerificationLoadingFragment.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000 %2\u00020\u0001:\u0003#$%B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u001a\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010!\u001a\u00020\"H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/debitcard/linking/ui/DebitCardVerificationLoadingFragment;", "Lcom/robinhood/android/debitcard/linking/ui/AutoLoggableDebitCardLinkingFragment;", "<init>", "()V", "paymentMethodLastUsagesPref", "Lcom/robinhood/prefs/StringToLongMapPreference;", "getPaymentMethodLastUsagesPref", "()Lcom/robinhood/prefs/StringToLongMapPreference;", "setPaymentMethodLastUsagesPref", "(Lcom/robinhood/prefs/StringToLongMapPreference;)V", "protoScreenName", "Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "getProtoScreenName", "()Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "callbacks", "Lcom/robinhood/android/debitcard/linking/ui/DebitCardVerificationLoadingFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/debitcard/linking/ui/DebitCardVerificationLoadingFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/debitcard/linking/ui/DebitCardVerificationLoadingDuxo;", "getDuxo", "()Lcom/robinhood/android/debitcard/linking/ui/DebitCardVerificationLoadingDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "onBackPressed", "", "Callbacks", "Args", "Companion", "feature-debit-card-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class DebitCardVerificationLoadingFragment extends AutoLoggableDebitCardLinkingFragment {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    @PaymentMethodLastUsagesPref
    public StringToLongMapPreference paymentMethodLastUsagesPref;
    private final Screen.Name protoScreenName;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(DebitCardVerificationLoadingFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/debitcard/linking/ui/DebitCardVerificationLoadingFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: DebitCardVerificationLoadingFragment.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/debitcard/linking/ui/DebitCardVerificationLoadingFragment$Callbacks;", "", "onVerificationCompleted", "", "instrumentId", "Ljava/util/UUID;", "verifyOnly", "", "onFailedToVerifyDebitCard", "t", "", "feature-debit-card-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onFailedToVerifyDebitCard(Throwable t);

        void onVerificationCompleted(UUID instrumentId, boolean verifyOnly);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        return true;
    }

    public DebitCardVerificationLoadingFragment() {
        super(C11048R.layout.parent_fragment_container);
        this.protoScreenName = Screen.Name.NAME_UNSPECIFIED;
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.debitcard.linking.ui.DebitCardVerificationLoadingFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        this.duxo = DuxosKt.duxo(this, DebitCardVerificationLoadingDuxo.class);
    }

    public final StringToLongMapPreference getPaymentMethodLastUsagesPref() {
        StringToLongMapPreference stringToLongMapPreference = this.paymentMethodLastUsagesPref;
        if (stringToLongMapPreference != null) {
            return stringToLongMapPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("paymentMethodLastUsagesPref");
        return null;
    }

    public final void setPaymentMethodLastUsagesPref(StringToLongMapPreference stringToLongMapPreference) {
        Intrinsics.checkNotNullParameter(stringToLongMapPreference, "<set-?>");
        this.paymentMethodLastUsagesPref = stringToLongMapPreference;
    }

    @Override // com.robinhood.android.debitcard.linking.p098ui.AutoLoggableDebitCardLinkingFragment
    public Screen.Name getProtoScreenName() {
        return this.protoScreenName;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DebitCardVerificationLoadingDuxo getDuxo() {
        return (DebitCardVerificationLoadingDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setFragment(C11048R.id.fragment_container, ShimmerLoadingFragment.INSTANCE.newInstance((Parcelable) new ShimmerLoadingFragment.Args(new ShimmerLoaderType.Promo(0, 1, null), null, 2, null)));
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        DebitCardVerificationLoadingDuxo duxo = getDuxo();
        Companion companion = INSTANCE;
        duxo.setVerificationCode(((Args) companion.getArgs((Fragment) this)).getVerificationCode());
        getDuxo().setDebitCardInstrumentId(((Args) companion.getArgs((Fragment) this)).getDebitCardInstrumentId());
        getDuxo().setLoggingContext(getLoggingContext());
        BaseFragment.collectDuxoState$default(this, null, new C139251(null), 1, null);
    }

    /* compiled from: DebitCardVerificationLoadingFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.debitcard.linking.ui.DebitCardVerificationLoadingFragment$onViewCreated$1", m3645f = "DebitCardVerificationLoadingFragment.kt", m3646l = {59}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.debitcard.linking.ui.DebitCardVerificationLoadingFragment$onViewCreated$1 */
    static final class C139251 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C139251(Continuation<? super C139251> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DebitCardVerificationLoadingFragment.this.new C139251(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C139251) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<DebitCardVerificationLoadingViewState> stateFlow = DebitCardVerificationLoadingFragment.this.getDuxo().getStateFlow();
                final DebitCardVerificationLoadingFragment debitCardVerificationLoadingFragment = DebitCardVerificationLoadingFragment.this;
                FlowCollector<? super DebitCardVerificationLoadingViewState> flowCollector = new FlowCollector() { // from class: com.robinhood.android.debitcard.linking.ui.DebitCardVerificationLoadingFragment.onViewCreated.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((DebitCardVerificationLoadingViewState) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(DebitCardVerificationLoadingViewState debitCardVerificationLoadingViewState, Continuation<? super Unit> continuation) {
                        UUID debitCardInstrumentId = debitCardVerificationLoadingViewState.getDebitCardInstrumentId();
                        if (debitCardInstrumentId != null) {
                            DebitCardVerificationLoadingFragment debitCardVerificationLoadingFragment2 = debitCardVerificationLoadingFragment;
                            StringToLongMapPreference paymentMethodLastUsagesPref = debitCardVerificationLoadingFragment2.getPaymentMethodLastUsagesPref();
                            String string2 = debitCardInstrumentId.toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            UpdatePaymentMethodLastUsed.updatePaymentMethodLastUsed(paymentMethodLastUsagesPref, string2);
                            debitCardVerificationLoadingFragment2.getCallbacks().onVerificationCompleted(debitCardInstrumentId, debitCardVerificationLoadingViewState.getVerifyOnly());
                        }
                        Throwable verificationFailedError = debitCardVerificationLoadingViewState.getVerificationFailedError();
                        if (verificationFailedError != null) {
                            debitCardVerificationLoadingFragment.getCallbacks().onFailedToVerifyDebitCard(verificationFailedError);
                        }
                        return Unit.INSTANCE;
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

    /* compiled from: DebitCardVerificationLoadingFragment.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/debitcard/linking/ui/DebitCardVerificationLoadingFragment$Args;", "Landroid/os/Parcelable;", "debitCardInstrumentId", "Ljava/util/UUID;", "verificationCode", "", "<init>", "(Ljava/util/UUID;Ljava/lang/String;)V", "getDebitCardInstrumentId", "()Ljava/util/UUID;", "getVerificationCode", "()Ljava/lang/String;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-debit-card-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final UUID debitCardInstrumentId;
        private final String verificationCode;

        /* compiled from: DebitCardVerificationLoadingFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((UUID) parcel.readSerializable(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.debitCardInstrumentId);
            dest.writeString(this.verificationCode);
        }

        public Args(UUID debitCardInstrumentId, String verificationCode) {
            Intrinsics.checkNotNullParameter(debitCardInstrumentId, "debitCardInstrumentId");
            Intrinsics.checkNotNullParameter(verificationCode, "verificationCode");
            this.debitCardInstrumentId = debitCardInstrumentId;
            this.verificationCode = verificationCode;
        }

        public final UUID getDebitCardInstrumentId() {
            return this.debitCardInstrumentId;
        }

        public final String getVerificationCode() {
            return this.verificationCode;
        }
    }

    /* compiled from: DebitCardVerificationLoadingFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/debitcard/linking/ui/DebitCardVerificationLoadingFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/debitcard/linking/ui/DebitCardVerificationLoadingFragment;", "Lcom/robinhood/android/debitcard/linking/ui/DebitCardVerificationLoadingFragment$Args;", "<init>", "()V", "feature-debit-card-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<DebitCardVerificationLoadingFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(DebitCardVerificationLoadingFragment debitCardVerificationLoadingFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, debitCardVerificationLoadingFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public DebitCardVerificationLoadingFragment newInstance(Args args) {
            return (DebitCardVerificationLoadingFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(DebitCardVerificationLoadingFragment debitCardVerificationLoadingFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, debitCardVerificationLoadingFragment, args);
        }
    }
}
