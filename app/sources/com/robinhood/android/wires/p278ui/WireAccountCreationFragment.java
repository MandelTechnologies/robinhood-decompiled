package com.robinhood.android.wires.p278ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.view.result.ActivityResultCaller;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.lib.transfers.ScamPreventionEventBus;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.transfers.contracts.wires.WireAccountCreation;
import com.robinhood.android.wires.p278ui.OutgoingWiresInfoFragment;
import com.robinhood.librobinhood.data.store.bonfire.TransferWireAccountStore;
import com.robinhood.models.api.bonfire.wires.RecipientType;
import com.robinhood.models.api.bonfire.wires.RecipientType2;
import com.robinhood.shared.common.contracts.MicrogramRouterFragmentKey;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.wiretransfers.contracts.ScamPreventionButtonType;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces;
import kotlin.properties.Interfaces2;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow2;
import microgram.android.RemoteMicrogramApplication;
import microgram.contracts.money_movement.wire_account_creation.proto.p502v1.DidLinkAccountRequestDto;

/* compiled from: WireAccountCreationFragment.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 12\u00020\u00012\u00020\u0002:\u00011B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\b\u0010/\u001a\u00020*H\u0016J\b\u00100\u001a\u00020*H\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR+\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001e8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R+\u0010%\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001e8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b(\u0010$\u001a\u0004\b&\u0010 \"\u0004\b'\u0010\"¨\u00062"}, m3636d2 = {"Lcom/robinhood/android/wires/ui/WireAccountCreationFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/wires/ui/OutgoingWiresInfoFragment$Callbacks;", "<init>", "()V", "transferWireAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferWireAccountStore;", "getTransferWireAccountStore", "()Lcom/robinhood/librobinhood/data/store/bonfire/TransferWireAccountStore;", "setTransferWireAccountStore", "(Lcom/robinhood/librobinhood/data/store/bonfire/TransferWireAccountStore;)V", "scamPreventionEventBus", "Lcom/robinhood/android/lib/transfers/ScamPreventionEventBus;", "getScamPreventionEventBus", "()Lcom/robinhood/android/lib/transfers/ScamPreventionEventBus;", "setScamPreventionEventBus", "(Lcom/robinhood/android/lib/transfers/ScamPreventionEventBus;)V", "wireAccountCreationEventBus", "Lcom/robinhood/android/wires/ui/WireAccountCreationEventBus;", "getWireAccountCreationEventBus", "()Lcom/robinhood/android/wires/ui/WireAccountCreationEventBus;", "setWireAccountCreationEventBus", "(Lcom/robinhood/android/wires/ui/WireAccountCreationEventBus;)V", "callbacks", "Lcom/robinhood/android/transfers/contracts/wires/WireAccountCreation$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/transfers/contracts/wires/WireAccountCreation$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "<set-?>", "", "isScamPreventionVisible", "()Z", "setScamPreventionVisible", "(Z)V", "isScamPreventionVisible$delegate", "Lkotlin/properties/ReadWriteProperty;", "didUserAcknowledgeScamPrevention", "getDidUserAcknowledgeScamPrevention", "setDidUserAcknowledgeScamPrevention", "didUserAcknowledgeScamPrevention$delegate", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onContinuePastOutgoingWiresInfo", "onResume", "Companion", "feature-wires_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes16.dex */
public final class WireAccountCreationFragment extends BaseFragment implements OutgoingWiresInfoFragment.Callbacks {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: didUserAcknowledgeScamPrevention$delegate, reason: from kotlin metadata */
    private final Interfaces3 didUserAcknowledgeScamPrevention;

    /* renamed from: isScamPreventionVisible$delegate, reason: from kotlin metadata */
    private final Interfaces3 isScamPreventionVisible;
    public ScamPreventionEventBus scamPreventionEventBus;
    public TransferWireAccountStore transferWireAccountStore;
    public WireAccountCreationEventBus wireAccountCreationEventBus;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(WireAccountCreationFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/transfers/contracts/wires/WireAccountCreation$Callbacks;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(WireAccountCreationFragment.class, "isScamPreventionVisible", "isScamPreventionVisible()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(WireAccountCreationFragment.class, "didUserAcknowledgeScamPrevention", "getDidUserAcknowledgeScamPrevention()Z", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: WireAccountCreationFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[RecipientType.values().length];
            try {
                iArr[RecipientType.FIRST_PARTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RecipientType.THIRD_PARTY_OTHERS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RecipientType.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RecipientType.THIRD_PARTY_HOME_CLOSING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ScamPreventionButtonType.values().length];
            try {
                iArr2[ScamPreventionButtonType.CONTINUE_BUTTON.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ScamPreventionButtonType.REPORT_BUTTON.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public WireAccountCreationFragment() {
        super(C11048R.layout.parent_fragment_container);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(WireAccountCreation.Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.wires.ui.WireAccountCreationFragment$special$$inlined$parentFragmentThenActivityHostCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                ActivityResultCaller parentFragment = CallbacksProperty.getParentFragment();
                if (!(parentFragment instanceof WireAccountCreation.Callbacks)) {
                    parentFragment = null;
                }
                WireAccountCreation.Callbacks callbacks = (WireAccountCreation.Callbacks) parentFragment;
                if (callbacks != null) {
                    return callbacks;
                }
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof WireAccountCreation.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        Interfaces<Object, Interfaces3<Object, Boolean>> interfacesSavedBoolean = BindSavedState2.savedBoolean(this, false);
        KProperty<?>[] kPropertyArr = $$delegatedProperties;
        this.isScamPreventionVisible = interfacesSavedBoolean.provideDelegate(this, kPropertyArr[1]);
        this.didUserAcknowledgeScamPrevention = BindSavedState2.savedBoolean(this, false).provideDelegate(this, kPropertyArr[2]);
    }

    public final TransferWireAccountStore getTransferWireAccountStore() {
        TransferWireAccountStore transferWireAccountStore = this.transferWireAccountStore;
        if (transferWireAccountStore != null) {
            return transferWireAccountStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("transferWireAccountStore");
        return null;
    }

    public final void setTransferWireAccountStore(TransferWireAccountStore transferWireAccountStore) {
        Intrinsics.checkNotNullParameter(transferWireAccountStore, "<set-?>");
        this.transferWireAccountStore = transferWireAccountStore;
    }

    public final ScamPreventionEventBus getScamPreventionEventBus() {
        ScamPreventionEventBus scamPreventionEventBus = this.scamPreventionEventBus;
        if (scamPreventionEventBus != null) {
            return scamPreventionEventBus;
        }
        Intrinsics.throwUninitializedPropertyAccessException("scamPreventionEventBus");
        return null;
    }

    public final void setScamPreventionEventBus(ScamPreventionEventBus scamPreventionEventBus) {
        Intrinsics.checkNotNullParameter(scamPreventionEventBus, "<set-?>");
        this.scamPreventionEventBus = scamPreventionEventBus;
    }

    public final WireAccountCreationEventBus getWireAccountCreationEventBus() {
        WireAccountCreationEventBus wireAccountCreationEventBus = this.wireAccountCreationEventBus;
        if (wireAccountCreationEventBus != null) {
            return wireAccountCreationEventBus;
        }
        Intrinsics.throwUninitializedPropertyAccessException("wireAccountCreationEventBus");
        return null;
    }

    public final void setWireAccountCreationEventBus(WireAccountCreationEventBus wireAccountCreationEventBus) {
        Intrinsics.checkNotNullParameter(wireAccountCreationEventBus, "<set-?>");
        this.wireAccountCreationEventBus = wireAccountCreationEventBus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WireAccountCreation.Callbacks getCallbacks() {
        return (WireAccountCreation.Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final boolean isScamPreventionVisible() {
        return ((Boolean) this.isScamPreventionVisible.getValue(this, $$delegatedProperties[1])).booleanValue();
    }

    private final void setScamPreventionVisible(boolean z) {
        this.isScamPreventionVisible.setValue(this, $$delegatedProperties[1], Boolean.valueOf(z));
    }

    private final boolean getDidUserAcknowledgeScamPrevention() {
        return ((Boolean) this.didUserAcknowledgeScamPrevention.getValue(this, $$delegatedProperties[2])).booleanValue();
    }

    private final void setDidUserAcknowledgeScamPrevention(boolean z) {
        this.didUserAcknowledgeScamPrevention.setValue(this, $$delegatedProperties[2], Boolean.valueOf(z));
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, OutgoingWiresInfoFragment.INSTANCE.newInstance());
        }
        BaseFragment.collectDuxoState$default(this, null, new C315061(null), 1, null);
    }

    /* compiled from: WireAccountCreationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.wires.ui.WireAccountCreationFragment$onViewCreated$1", m3645f = "WireAccountCreationFragment.kt", m3646l = {53}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.wires.ui.WireAccountCreationFragment$onViewCreated$1 */
    static final class C315061 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C315061(Continuation<? super C315061> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WireAccountCreationFragment.this.new C315061(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C315061) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SharedFlow2<DidLinkAccountRequestDto> accountCreationEventFlow = WireAccountCreationFragment.this.getWireAccountCreationEventBus().getAccountCreationEventFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(WireAccountCreationFragment.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(accountCreationEventFlow, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: WireAccountCreationFragment.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "request", "Lmicrogram/contracts/money_movement/wire_account_creation/proto/v1/DidLinkAccountRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.wires.ui.WireAccountCreationFragment$onViewCreated$1$1", m3645f = "WireAccountCreationFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.wires.ui.WireAccountCreationFragment$onViewCreated$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<DidLinkAccountRequestDto, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ WireAccountCreationFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(WireAccountCreationFragment wireAccountCreationFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = wireAccountCreationFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(DidLinkAccountRequestDto didLinkAccountRequestDto, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(didLinkAccountRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                DidLinkAccountRequestDto didLinkAccountRequestDto = (DidLinkAccountRequestDto) this.L$0;
                this.this$0.getTransferWireAccountStore().refresh(RecipientType2.dtoToRecipientType(didLinkAccountRequestDto.getRecipient_type()), true);
                try {
                    this.this$0.getCallbacks().onAccountCreated(didLinkAccountRequestDto);
                } catch (Throwable unused) {
                    this.this$0.requireActivity().setResult(-1, new Intent().putExtra(WireAccountCreation.WireAccountResultKey, didLinkAccountRequestDto));
                    this.this$0.requireActivity().finish();
                }
                return Unit.INSTANCE;
            }
        }
    }

    @Override // com.robinhood.android.wires.ui.OutgoingWiresInfoFragment.Callbacks
    public void onContinuePastOutgoingWiresInfo() {
        String str;
        Navigator navigator = getNavigator();
        RemoteMicrogramApplication remoteMicrogramApplication = new RemoteMicrogramApplication("app-wire-account-creation", null, 2, null);
        Companion companion = INSTANCE;
        replaceFragment(Navigator.DefaultImpls.createFragment$default(navigator, new MicrogramRouterFragmentKey(remoteMicrogramApplication, "robinhood://wire-account-creation?recipient_type=" + ((WireAccountCreation) companion.getArgs((Fragment) this)).getRecipientType().getServerValue(), null, null, null, 28, null), null, 2, null));
        if (isScamPreventionVisible() || getDidUserAcknowledgeScamPrevention()) {
            return;
        }
        setScamPreventionVisible(true);
        Navigator navigator2 = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RemoteMicrogramApplication remoteMicrogramApplication2 = new RemoteMicrogramApplication("app-wire-transfers", null, 2, null);
        int i = WhenMappings.$EnumSwitchMapping$0[((WireAccountCreation) companion.getArgs((Fragment) this)).getRecipientType().ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            str = "SCAM_PREVENTION_DETAILS";
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            str = "THIRD_PARTY_SCAM_PREVENTION_DETAILS";
        }
        Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator2, contextRequireContext, new MicrogramRouterFragmentKey(remoteMicrogramApplication2, "robinhood://wire_transfer?screenStartType=" + str, null, null, null, 28, null), false, false, false, false, null, false, null, null, 1020, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        ScamPreventionButtonType scamPreventionButtonTypeConsume;
        super.onResume();
        if (isScamPreventionVisible()) {
            UiEvent<ScamPreventionButtonType> scamPreventionContinueButtonEvent = getScamPreventionEventBus().getScamPreventionContinueButtonEvent();
            if (scamPreventionContinueButtonEvent != null && (scamPreventionButtonTypeConsume = scamPreventionContinueButtonEvent.consume()) != null) {
                setScamPreventionVisible(false);
                int i = WhenMappings.$EnumSwitchMapping$1[scamPreventionButtonTypeConsume.ordinal()];
                if (i == 1) {
                    setDidUserAcknowledgeScamPrevention(true);
                    return;
                }
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                Navigator navigator = getNavigator();
                Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, Uri.parse("robinhood://web?url=https://robinhood.com/us/en/support/articles/how-to-identify-and-report-scams/"), null, null, false, null, 60, null);
                requireActivity().finish();
                return;
            }
            requireActivity().finish();
        }
    }

    /* compiled from: WireAccountCreationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/wires/ui/WireAccountCreationFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/wires/ui/WireAccountCreationFragment;", "Lcom/robinhood/android/transfers/contracts/wires/WireAccountCreation;", "<init>", "()V", "feature-wires_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<WireAccountCreationFragment, WireAccountCreation> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(WireAccountCreation wireAccountCreation) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, wireAccountCreation);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public WireAccountCreation getArgs(WireAccountCreationFragment wireAccountCreationFragment) {
            return (WireAccountCreation) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, wireAccountCreationFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public WireAccountCreationFragment newInstance(WireAccountCreation wireAccountCreation) {
            return (WireAccountCreationFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, wireAccountCreation);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(WireAccountCreationFragment wireAccountCreationFragment, WireAccountCreation wireAccountCreation) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, wireAccountCreationFragment, wireAccountCreation);
        }
    }
}
