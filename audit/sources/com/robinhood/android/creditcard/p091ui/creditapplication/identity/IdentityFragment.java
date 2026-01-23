package com.robinhood.android.creditcard.p091ui.creditapplication.identity;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.creditcard.p091ui.creditapplication.address.AddressFragment;
import com.robinhood.android.creditcard.p091ui.creditapplication.identity.EditBottomSheet;
import com.robinhood.android.creditcard.p091ui.creditapplication.identity.IdentityDuxo4;
import com.robinhood.android.creditcard.p091ui.creditapplication.identity.IdentityFragment;
import com.robinhood.android.creditcard.p091ui.creditapplication.identity.annualIncome.AnnualIncomeFragment;
import com.robinhood.android.creditcard.p091ui.creditapplication.identity.confirmInfo.ConfirmInfoFragment;
import com.robinhood.android.creditcard.p091ui.creditapplication.identity.residentialAddress.ResidentialAddressFragment;
import com.robinhood.android.creditcard.p091ui.creditapplication.identity.ssn.SsnFragment;
import com.robinhood.android.creditcard.p091ui.creditapplication.identity.updateInfo.UpdatelnfoFragment;
import com.robinhood.android.creditcard.p091ui.creditapplication.navigation.NavigationUtils;
import com.robinhood.android.creditcard.p091ui.creditapplication.navigation.WebViewFragment;
import com.robinhood.android.creditcard.p091ui.creditapplication.terms.TermsFragment;
import com.robinhood.android.models.creditcard.api.graphql.AddressType;
import com.robinhood.android.models.creditcard.api.graphql.CreditApplicationsResponse;
import com.robinhood.android.models.creditcard.api.graphql.IdentityDetailsPrefillResponse2;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.CreditCardRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.shared.discovery.sdui.SduiFeatureDiscovery3;
import com.robinhood.shared.settings.contracts.Constants6;
import com.robinhood.shared.settings.contracts.SettingsPage;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.io.IOException;
import java.util.Set;
import kotlin.Function;
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
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: IdentityFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 B2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b:\u0002ABB\u0007¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0019\u001a\u00020\u000fH\u0016J\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u001a\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0016\u0010!\u001a\u00020\u001b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#H\u0002J\u0012\u0010%\u001a\u00020\u001b2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\u0010\u0010(\u001a\u00020\u001b2\u0006\u0010)\u001a\u00020*H\u0016J\b\u0010+\u001a\u00020\u001bH\u0016J\b\u0010,\u001a\u00020\u001bH\u0016J\u0010\u0010-\u001a\u00020\u001b2\u0006\u0010.\u001a\u00020/H\u0016J\b\u00100\u001a\u00020\u001bH\u0016J\u0010\u00101\u001a\u00020\u001b2\u0006\u00102\u001a\u000203H\u0016J\b\u00104\u001a\u00020\u001bH\u0016J\u0010\u00105\u001a\u00020\u001b2\u0006\u00106\u001a\u00020/H\u0016J\u0018\u00107\u001a\u00020\u001b2\u0006\u00108\u001a\u00020/2\u0006\u00109\u001a\u00020\u000fH\u0016J\b\u0010:\u001a\u00020\u001bH\u0016J\t\u0010;\u001a\u00020\u000fH\u0096\u0001R\u0014\u0010\u000e\u001a\u00020\u000fX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0018\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010<\u001a\b\u0012\u0004\u0012\u00020>0=X\u0096\u0005¢\u0006\u0006\u001a\u0004\b?\u0010@¨\u0006C"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/identity/IdentityFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/creditcard/ui/creditapplication/identity/confirmInfo/ConfirmInfoFragment$Callbacks;", "Lcom/robinhood/android/creditcard/ui/creditapplication/identity/updateInfo/UpdateInfoFragment$Callbacks;", "Lcom/robinhood/android/creditcard/ui/creditapplication/identity/ssn/SsnFragment$Callbacks;", "Lcom/robinhood/android/creditcard/ui/creditapplication/identity/residentialAddress/ResidentialAddressFragment$Callbacks;", "Lcom/robinhood/android/creditcard/ui/creditapplication/identity/annualIncome/AnnualIncomeFragment$Callbacks;", "Lcom/robinhood/android/creditcard/ui/creditapplication/terms/TermsFragment$ParentCallbacks;", "Lcom/robinhood/android/creditcard/ui/creditapplication/terms/TermsFragment$Callbacks;", "Lcom/robinhood/android/creditcard/ui/creditapplication/identity/EditBottomSheet$Callbacks;", "Lcom/robinhood/android/creditcard/ui/creditapplication/address/AddressFragment$Callbacks;", "<init>", "()V", "toolbarVisible", "", "getToolbarVisible", "()Z", "duxo", "Lcom/robinhood/android/creditcard/ui/creditapplication/identity/IdentityDuxo;", "getDuxo", "()Lcom/robinhood/android/creditcard/ui/creditapplication/identity/IdentityDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "go2Back", "onBackPressed", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "handleEvent", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/creditcard/ui/creditapplication/identity/IdentityEvent;", "onConfirmInfoContinue", "prefill", "Lcom/robinhood/android/models/creditcard/api/graphql/IdentityDetailsPrefillObject;", "onUpdateInfoContinue", SduiFeatureDiscovery3.INFO_TAG, "Lcom/robinhood/android/creditcard/ui/creditapplication/identity/PersonalInfo;", "onOpenEditDialog", "onOpenSettings", "onSsnContinue", "ssn", "", "onEditAddress", "onSaveAddress", PlaceTypes.ADDRESS, "Lcom/robinhood/android/models/creditcard/api/graphql/AddressType;", "onAddressContinue", "onIncomeContinue", "income", "onUrl", "url", "withAuthHeader", "backToAddress", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Args", "Companion", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class IdentityFragment extends BaseFragment implements RegionGated, ConfirmInfoFragment.Callbacks, UpdatelnfoFragment.Callbacks, SsnFragment.Callbacks, ResidentialAddressFragment.Callbacks, AnnualIncomeFragment.Callbacks, TermsFragment.ParentCallbacks, TermsFragment.Callbacks, EditBottomSheet.Callbacks, AddressFragment.Callbacks {
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private boolean go2Back;
    private final boolean toolbarVisible;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public IdentityFragment() {
        super(C11048R.layout.parent_fragment_container);
        this.$$delegate_0 = new RegionGated2(CreditCardRegionGate.INSTANCE);
        this.duxo = DuxosKt.duxo(this, IdentityDuxo.class);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IdentityDuxo getDuxo() {
        return (IdentityDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        if (this.go2Back) {
            popFragments(2);
            return true;
        }
        return super.onBackPressed();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) throws IOException {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            IdentityDuxo duxo = getDuxo();
            Companion companion = INSTANCE;
            PersonalInfo details$feature_credit_card_externalDebug = duxo.setDetails$feature_credit_card_externalDebug(((Args) companion.getArgs((Fragment) this)).getPrefill());
            if (((Args) companion.getArgs((Fragment) this)).getPrefill().getMissingInfo() || getDuxo().invalidPhone(((Args) companion.getArgs((Fragment) this)).getPrefill().getE164())) {
                setFragment(C11048R.id.fragment_container, UpdatelnfoFragment.INSTANCE.newInstance((Parcelable) new UpdatelnfoFragment.Args(details$feature_credit_card_externalDebug)));
            } else {
                setFragment(C11048R.id.fragment_container, ConfirmInfoFragment.INSTANCE.newInstance((Parcelable) new ConfirmInfoFragment.Args(details$feature_credit_card_externalDebug)));
            }
        }
    }

    /* compiled from: IdentityFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.identity.IdentityFragment$onViewCreated$1", m3645f = "IdentityFragment.kt", m3646l = {85}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.identity.IdentityFragment$onViewCreated$1 */
    static final class C123991 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C123991(Continuation<? super C123991> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return IdentityFragment.this.new C123991(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C123991) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: IdentityFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.identity.IdentityFragment$onViewCreated$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ IdentityFragment $tmp0;

            AnonymousClass1(IdentityFragment identityFragment) {
                this.$tmp0 = identityFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, IdentityFragment.class, "handleEvent", "handleEvent(Lcom/robinhood/android/udf/event/Event;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(Event<IdentityDuxo4> event, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$handleEvent = C123991.invokeSuspend$handleEvent(this.$tmp0, event, continuation);
                return objInvokeSuspend$handleEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$handleEvent : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((Event<IdentityDuxo4>) obj, (Continuation<? super Unit>) continuation);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$handleEvent(IdentityFragment identityFragment, Event event, Continuation continuation) {
            identityFragment.handleEvent(event);
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(IdentityFragment.this.getDuxo().getEventFlow());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(IdentityFragment.this);
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

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C123991(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent(final Event<IdentityDuxo4> event) {
        EventConsumer<IdentityDuxo4> eventConsumerInvoke;
        EventConsumer<IdentityDuxo4> eventConsumerInvoke2;
        EventConsumer<IdentityDuxo4> eventConsumerInvoke3;
        EventConsumer<IdentityDuxo4> eventConsumerInvoke4;
        EventConsumer<IdentityDuxo4> eventConsumerInvoke5;
        this.go2Back = false;
        if ((event.getData() instanceof IdentityDuxo4.Ssn) && (eventConsumerInvoke5 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke5.consume(event, new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.identity.IdentityFragment$handleEvent$$inlined$consumeIfType$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m12725invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m12725invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    NavigationUtils.appReplaceFragment(this, SsnFragment.INSTANCE.newInstance());
                }
            });
        }
        if ((event.getData() instanceof IdentityDuxo4.Address) && (eventConsumerInvoke4 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke4.consume(event, new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.identity.IdentityFragment$handleEvent$$inlined$consumeIfType$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m12726invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m12726invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    IdentityViewState value = this.getDuxo().getStateFlow().getValue();
                    if (value.getAddress().getMissingInfo()) {
                        this.onEditAddress();
                    } else {
                        NavigationUtils.appReplaceFragment(this, ResidentialAddressFragment.INSTANCE.newInstance((Parcelable) new ResidentialAddressFragment.Args(value.getAddress(), value.getLat(), value.getLong())));
                    }
                }
            });
        }
        if ((event.getData() instanceof IdentityDuxo4.UpdatedAddress) && (eventConsumerInvoke3 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke3.consume(event, new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.identity.IdentityFragment$handleEvent$$inlined$consumeIfType$3
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m12727invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m12727invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    IdentityDuxo4.UpdatedAddress updatedAddress = (IdentityDuxo4.UpdatedAddress) event.getData();
                    if (this.getChildFragmentManager().findFragmentByTag("ResidentialAddressFragment") != null) {
                        this.go2Back = true;
                    }
                    NavigationUtils.appReplaceFragmentWithoutBackStack(this, ResidentialAddressFragment.INSTANCE.newInstance((Parcelable) new ResidentialAddressFragment.Args(updatedAddress.getAddress(), updatedAddress.getLat(), updatedAddress.getLong())));
                }
            });
        }
        if ((event.getData() instanceof IdentityDuxo4.Income) && (eventConsumerInvoke2 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke2.consume(event, new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.identity.IdentityFragment$handleEvent$$inlined$consumeIfType$4
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m12728invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m12728invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    NavigationUtils.appReplaceFragment(this, AnnualIncomeFragment.INSTANCE.newInstance());
                }
            });
        }
        if (!(event.getData() instanceof IdentityDuxo4.Complete) || (eventConsumerInvoke = event.getGetEventConsumer().invoke()) == null) {
            return;
        }
        eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.identity.IdentityFragment$handleEvent$$inlined$consumeIfType$5
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m12729invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m12729invoke(Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                NavigationUtils.appReplaceFragment(this, TermsFragment.INSTANCE.newInstance((Parcelable) new TermsFragment.Args(((IdentityDuxo4.Complete) event.getData()).getState(), ((IdentityFragment.Args) IdentityFragment.INSTANCE.getArgs((Fragment) this)).getAuthUser())));
            }
        });
    }

    @Override // com.robinhood.android.creditcard.ui.creditapplication.identity.confirmInfo.ConfirmInfoFragment.Callbacks
    public void onConfirmInfoContinue(IdentityDetailsPrefillResponse2 prefill) throws IOException {
        if (prefill != null) {
            getDuxo().setDetails$feature_credit_card_externalDebug(prefill);
        }
        if (getDuxo().getStateFlow().getValue().getInfo().getSsnLast4().length() == 0) {
            getDuxo().onNext(IdentityDuxo4.Ssn.INSTANCE);
        } else {
            getDuxo().onNext(IdentityDuxo4.Address.INSTANCE);
        }
    }

    @Override // com.robinhood.android.creditcard.p091ui.creditapplication.identity.updateInfo.UpdatelnfoFragment.Callbacks
    public void onUpdateInfoContinue(PersonalInfo info) throws IOException {
        Intrinsics.checkNotNullParameter(info, "info");
        getDuxo().updateInfo(info);
        onConfirmInfoContinue(null);
    }

    @Override // com.robinhood.android.creditcard.ui.creditapplication.identity.confirmInfo.ConfirmInfoFragment.Callbacks
    public void onOpenEditDialog() {
        EditBottomSheet editBottomSheet = (EditBottomSheet) EditBottomSheet.INSTANCE.newInstance();
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        editBottomSheet.show(childFragmentManager, "edit-modal");
    }

    @Override // com.robinhood.android.creditcard.ui.creditapplication.identity.EditBottomSheet.Callbacks
    public void onOpenSettings() {
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new SettingsPage(Constants6.ACCOUNT_INFO_PAGE_ID, null, null, 6, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
    }

    @Override // com.robinhood.android.creditcard.ui.creditapplication.identity.ssn.SsnFragment.Callbacks
    public void onSsnContinue(String ssn) {
        Intrinsics.checkNotNullParameter(ssn, "ssn");
        getDuxo().updateSsn(ssn);
        getDuxo().onNext(IdentityDuxo4.Address.INSTANCE);
    }

    @Override // com.robinhood.android.creditcard.ui.creditapplication.identity.residentialAddress.ResidentialAddressFragment.Callbacks
    public void onEditAddress() {
        NavigationUtils.appReplaceFragment(this, AddressFragment.INSTANCE.newInstance((Parcelable) new AddressFragment.Args(false)));
    }

    @Override // com.robinhood.android.creditcard.ui.creditapplication.address.AddressFragment.Callbacks
    public void onSaveAddress(AddressType address) throws IOException {
        Intrinsics.checkNotNullParameter(address, "address");
        getDuxo().updateAddress(address, true);
    }

    @Override // com.robinhood.android.creditcard.ui.creditapplication.identity.residentialAddress.ResidentialAddressFragment.Callbacks
    public void onAddressContinue() {
        getDuxo().onNext(IdentityDuxo4.Income.INSTANCE);
    }

    @Override // com.robinhood.android.creditcard.ui.creditapplication.identity.annualIncome.AnnualIncomeFragment.Callbacks
    public void onIncomeContinue(String income) throws IOException {
        Intrinsics.checkNotNullParameter(income, "income");
        getDuxo().onComplete(income, getDuxo().getStateFlow().getValue());
    }

    @Override // com.robinhood.android.creditcard.ui.creditapplication.terms.TermsFragment.ParentCallbacks, com.robinhood.android.creditcard.ui.creditapplication.creditfrozen.CreditFrozenFragment.Callbacks, com.robinhood.android.creditcard.ui.creditapplication.rejected.RejectedFragment.Callbacks, com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsFragment.Callbacks
    public void onUrl(String url, boolean withAuthHeader) {
        Intrinsics.checkNotNullParameter(url, "url");
        NavigationUtils.appReplaceFragment(this, WebViewFragment.INSTANCE.newInstance((Parcelable) new WebViewFragment.Args(url, withAuthHeader)));
    }

    @Override // com.robinhood.android.creditcard.ui.creditapplication.terms.TermsFragment.Callbacks
    public void backToAddress() {
        popFragments(2);
    }

    /* compiled from: IdentityFragment.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/identity/IdentityFragment$Args;", "Landroid/os/Parcelable;", "prefill", "Lcom/robinhood/android/models/creditcard/api/graphql/IdentityDetailsPrefillObject;", "authUser", "Lcom/robinhood/android/models/creditcard/api/graphql/CreditApplicationsResponse$AuthIdentityObject$CreditCustomer;", "<init>", "(Lcom/robinhood/android/models/creditcard/api/graphql/IdentityDetailsPrefillObject;Lcom/robinhood/android/models/creditcard/api/graphql/CreditApplicationsResponse$AuthIdentityObject$CreditCustomer;)V", "getPrefill", "()Lcom/robinhood/android/models/creditcard/api/graphql/IdentityDetailsPrefillObject;", "getAuthUser", "()Lcom/robinhood/android/models/creditcard/api/graphql/CreditApplicationsResponse$AuthIdentityObject$CreditCustomer;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final CreditApplicationsResponse.AuthIdentityObject.CreditCustomer authUser;
        private final IdentityDetailsPrefillResponse2 prefill;

        /* compiled from: IdentityFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((IdentityDetailsPrefillResponse2) parcel.readParcelable(Args.class.getClassLoader()), (CreditApplicationsResponse.AuthIdentityObject.CreditCustomer) parcel.readParcelable(Args.class.getClassLoader()));
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
            dest.writeParcelable(this.prefill, flags);
            dest.writeParcelable(this.authUser, flags);
        }

        public Args(IdentityDetailsPrefillResponse2 prefill, CreditApplicationsResponse.AuthIdentityObject.CreditCustomer creditCustomer) {
            Intrinsics.checkNotNullParameter(prefill, "prefill");
            this.prefill = prefill;
            this.authUser = creditCustomer;
        }

        public final IdentityDetailsPrefillResponse2 getPrefill() {
            return this.prefill;
        }

        public final CreditApplicationsResponse.AuthIdentityObject.CreditCustomer getAuthUser() {
            return this.authUser;
        }
    }

    /* compiled from: IdentityFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/identity/IdentityFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/creditcard/ui/creditapplication/identity/IdentityFragment;", "Lcom/robinhood/android/creditcard/ui/creditapplication/identity/IdentityFragment$Args;", "<init>", "()V", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<IdentityFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(IdentityFragment identityFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, identityFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public IdentityFragment newInstance(Args args) {
            return (IdentityFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(IdentityFragment identityFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, identityFragment, args);
        }
    }
}
