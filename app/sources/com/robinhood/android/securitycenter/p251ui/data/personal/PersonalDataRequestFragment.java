package com.robinhood.android.securitycenter.p251ui.data.personal;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.challenge.ChallengeResponseActivity;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract3;
import com.robinhood.android.securitycenter.C28186R;
import com.robinhood.android.securitycenter.databinding.FragmentPersonalDataRequestBinding;
import com.robinhood.android.securitycenter.p251ui.data.personal.PersonalDataRequestFragment;
import com.robinhood.android.securitycenter.p251ui.data.personal.PersonalDataRequestViewState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.p355ui.UiPersonalDataRequestDetailsItem;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.lib.challenge.ChallengeResponseResult;
import com.robinhood.shared.lib.challenge.ChallengeResponseResultContract;
import com.robinhood.shared.security.contracts.ChallengeResponseIntentKey;
import com.robinhood.shared.security.contracts.ChallengeSource;
import com.robinhood.shared.security.contracts.PersonalDataRequestType;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: PersonalDataRequestFragment.kt */
@Metadata(m3635d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 ;2\u00020\u0001:\u00039:;B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010 \u001a\u00020!H\u0016J\u001a\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u0014\u0010'\u001a\u00020!2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)H\u0002J\u0010\u0010*\u001a\u00020!2\u0006\u0010+\u001a\u00020,H\u0002J\u0010\u0010-\u001a\u00020!2\u0006\u0010.\u001a\u00020/H\u0002J\b\u00100\u001a\u00020!H\u0002J\b\u00101\u001a\u00020!H\u0002J\u001a\u00102\u001a\u00020/2\u0006\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010&H\u0016J\n\u00106\u001a\u000207*\u000208R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u0018\u0010\u0019R(\u0010\u001b\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u001e \u001f*\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d0\u001d0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006<"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataRequestFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "duxo", "Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataRequestDuxo;", "getDuxo", "()Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataRequestDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/securitycenter/databinding/FragmentPersonalDataRequestBinding;", "getBinding", "()Lcom/robinhood/android/securitycenter/databinding/FragmentPersonalDataRequestBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataRequestFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataRequestFragment$Callbacks;", "callbacks$delegate", "challengeResponseLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/robinhood/android/navigation/contracts/NavigationActivityResultContract$NavigationParams;", "Lcom/robinhood/shared/security/contracts/ChallengeResponseIntentKey;", "kotlin.jvm.PlatformType", "onStart", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "submitRequest", ChallengeResponseActivity.EXTRA_CHALLENGE_ID, "Ljava/util/UUID;", "bind", "state", "Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataRequestViewState;", "setLoading", "loading", "", "onRequestSuccess", "showSubmitErrorDialog", "onPositiveButtonClicked", "id", "", "passthroughArgs", "toScreenName", "Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "Lcom/robinhood/shared/security/contracts/PersonalDataRequestType;", "Callbacks", "Args", "Companion", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class PersonalDataRequestFragment extends BaseFragment {
    private static final String TAG_SUBMIT_ERROR_DIALOG = "dataRequestSubmitErrorDialog";

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    private final ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<ChallengeResponseIntentKey>> challengeResponseLauncher;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public EventLogger eventLogger;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(PersonalDataRequestFragment.class, "binding", "getBinding()Lcom/robinhood/android/securitycenter/databinding/FragmentPersonalDataRequestBinding;", 0)), Reflection.property1(new PropertyReference1Impl(PersonalDataRequestFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataRequestFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: PersonalDataRequestFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataRequestFragment$Callbacks;", "", "onSubmitRequestSuccess", "", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onSubmitRequestSuccess();
    }

    /* compiled from: PersonalDataRequestFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PersonalDataRequestType.values().length];
            try {
                iArr[PersonalDataRequestType.ACCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PersonalDataRequestType.DELETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PersonalDataRequestFragment() {
        super(C28186R.layout.fragment_personal_data_request);
        this.duxo = OldDuxos.oldDuxo(this, PersonalDataRequestDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, PersonalDataRequestFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.securitycenter.ui.data.personal.PersonalDataRequestFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof PersonalDataRequestFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<ChallengeResponseIntentKey>> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ChallengeResponseResultContract(new Function0() { // from class: com.robinhood.android.securitycenter.ui.data.personal.PersonalDataRequestFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.getNavigator();
            }
        }), new ActivityResultCallback() { // from class: com.robinhood.android.securitycenter.ui.data.personal.PersonalDataRequestFragment$challengeResponseLauncher$2
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(ChallengeResponseResult challengeResponseResult) {
                if ((challengeResponseResult != null ? challengeResponseResult.getChallengeId() : null) != null) {
                    this.this$0.submitRequest(challengeResponseResult.getChallengeId());
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.challengeResponseLauncher = activityResultLauncherRegisterForActivityResult;
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

    /* JADX INFO: Access modifiers changed from: private */
    public final PersonalDataRequestDuxo getDuxo() {
        return (PersonalDataRequestDuxo) this.duxo.getValue();
    }

    private final FragmentPersonalDataRequestBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentPersonalDataRequestBinding) value;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C282301(this));
    }

    /* compiled from: PersonalDataRequestFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.securitycenter.ui.data.personal.PersonalDataRequestFragment$onStart$1 */
    /* synthetic */ class C282301 extends FunctionReferenceImpl implements Function1<PersonalDataRequestViewState, Unit> {
        C282301(Object obj) {
            super(1, obj, PersonalDataRequestFragment.class, "bind", "bind(Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataRequestViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PersonalDataRequestViewState personalDataRequestViewState) {
            invoke2(personalDataRequestViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PersonalDataRequestViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((PersonalDataRequestFragment) this.receiver).bind(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        EventLogger eventLogger = getEventLogger();
        Companion companion = INSTANCE;
        PersonalDataRequestDetailsListAdapter personalDataRequestDetailsListAdapter = new PersonalDataRequestDetailsListAdapter(eventLogger, new Screen(toScreenName(((Args) companion.getArgs((Fragment) this)).getRequestType()), null, null, null, 14, null));
        FragmentPersonalDataRequestBinding binding = getBinding();
        binding.personalDataRequestDetailsList.setAdapter(personalDataRequestDetailsListAdapter);
        RdsButton personalDataRequestCta = binding.personalDataRequestCta;
        Intrinsics.checkNotNullExpressionValue(personalDataRequestCta, "personalDataRequestCta");
        OnClickListeners.onClick(personalDataRequestCta, new PersonalDataRequestFragment4(this));
        int i = WhenMappings.$EnumSwitchMapping$0[((Args) companion.getArgs((Fragment) this)).getRequestType().ordinal()];
        if (i == 1) {
            binding.personalDataRequestTitle.setText(C28186R.string.personal_data_access_request_title);
            binding.personalDataRequestSubtitle.setText(C28186R.string.personal_data_access_request_subtitle);
            binding.personalDataRequestDetailsTitle.setText(C28186R.string.personal_data_access_request_details_title);
            binding.personalDataRequestCta.setText(C28186R.string.personal_data_access_request_cta);
            RhTextView personalDataRequestFooter = binding.personalDataRequestFooter;
            Intrinsics.checkNotNullExpressionValue(personalDataRequestFooter, "personalDataRequestFooter");
            personalDataRequestFooter.setVisibility(0);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            binding.personalDataRequestTitle.setText(C28186R.string.personal_data_delete_request_title);
            binding.personalDataRequestSubtitle.setText(C28186R.string.personal_data_delete_request_subtitle);
            binding.personalDataRequestDetailsTitle.setText(C28186R.string.personal_data_delete_request_details_title);
            binding.personalDataRequestCta.setText(C28186R.string.personal_data_delete_request_cta);
            RhTextView personalDataRequestFooter2 = binding.personalDataRequestFooter;
            Intrinsics.checkNotNullExpressionValue(personalDataRequestFooter2, "personalDataRequestFooter");
            personalDataRequestFooter2.setVisibility(8);
        }
        personalDataRequestDetailsListAdapter.submitList(((Args) companion.getArgs((Fragment) this)).getDetails());
    }

    static /* synthetic */ void submitRequest$default(PersonalDataRequestFragment personalDataRequestFragment, UUID uuid, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = null;
        }
        personalDataRequestFragment.submitRequest(uuid);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void submitRequest(UUID challengeId) {
        EventLogger.DefaultImpls.logTap$default(getEventLogger(), null, new Screen(toScreenName(((Args) INSTANCE.getArgs((Fragment) this)).getRequestType()), null, null, null, 14, null), new Component(Component.ComponentType.CONTINUE_BUTTON, null, null, 6, null), null, null, false, 57, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C282311(challengeId, null), 3, null);
    }

    /* compiled from: PersonalDataRequestFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.securitycenter.ui.data.personal.PersonalDataRequestFragment$submitRequest$1", m3645f = "PersonalDataRequestFragment.kt", m3646l = {100}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.securitycenter.ui.data.personal.PersonalDataRequestFragment$submitRequest$1 */
    static final class C282311 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $challengeId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C282311(UUID uuid, Continuation<? super C282311> continuation) {
            super(2, continuation);
            this.$challengeId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PersonalDataRequestFragment.this.new C282311(this.$challengeId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C282311) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PersonalDataRequestDuxo duxo = PersonalDataRequestFragment.this.getDuxo();
                PersonalDataRequestType requestType = ((Args) PersonalDataRequestFragment.INSTANCE.getArgs((Fragment) PersonalDataRequestFragment.this)).getRequestType();
                UUID uuid = this.$challengeId;
                this.label = 1;
                if (duxo.submitRequest(requestType, uuid, this) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(PersonalDataRequestViewState state) {
        if (Intrinsics.areEqual(state, PersonalDataRequestViewState.Loading.INSTANCE)) {
            setLoading(true);
            return;
        }
        if (state instanceof PersonalDataRequestViewState.ChallengeReceived) {
            NavigationActivityResultContract3.launch$default(this.challengeResponseLauncher, new ChallengeResponseIntentKey(ChallengeSource.PERSONAL_DATA_DELETION, ((PersonalDataRequestViewState.ChallengeReceived) state).getChallenge(), null, 4, null), null, false, 6, null);
            setLoading(false);
        } else if (Intrinsics.areEqual(state, PersonalDataRequestViewState.Success.INSTANCE)) {
            onRequestSuccess();
        } else if (Intrinsics.areEqual(state, PersonalDataRequestViewState.Failure.INSTANCE)) {
            showSubmitErrorDialog();
        } else if (!Intrinsics.areEqual(state, PersonalDataRequestViewState.Default.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    private final void setLoading(boolean loading) {
        requireBaseActivity().showProgressBar(loading);
        getBinding().personalDataRequestCta.setLoading(loading);
    }

    private final void onRequestSuccess() {
        getCallbacks().onSubmitRequestSuccess();
        if (((Args) INSTANCE.getArgs((Fragment) this)).getRequestType() != PersonalDataRequestType.DELETE) {
            getDuxo().reset();
        }
    }

    private final void showSubmitErrorDialog() {
        setLoading(false);
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder positiveButton = companion.create(contextRequireContext).setUseDesignSystemOverlay(true).setId(C28186R.id.dialog_id_personal_data_error).setTitle(C28186R.string.personal_data_error_dialog_title, new Object[0]).setMessage(C28186R.string.personal_data_error_dialog_message, new Object[0]).setPositiveButton(C11048R.string.general_label_dismiss, new Object[0]);
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        RhDialogFragment.Builder.show$default(positiveButton, parentFragmentManager, TAG_SUBMIT_ERROR_DIALOG, false, 4, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C28186R.id.dialog_id_personal_data_error) {
            EventLogger.DefaultImpls.logTap$default(getEventLogger(), null, new Screen(toScreenName(((Args) INSTANCE.getArgs((Fragment) this)).getRequestType()), null, null, null, 14, null), new Component(Component.ComponentType.DONE_BUTTON, null, null, 6, null), null, null, false, 57, null);
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    public final Screen.Name toScreenName(PersonalDataRequestType personalDataRequestType) {
        Intrinsics.checkNotNullParameter(personalDataRequestType, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[personalDataRequestType.ordinal()];
        if (i == 1) {
            return Screen.Name.IRR_REQUEST;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return Screen.Name.IRR_DELETE;
    }

    /* compiled from: PersonalDataRequestFragment.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataRequestFragment$Args;", "Landroid/os/Parcelable;", "requestType", "Lcom/robinhood/shared/security/contracts/PersonalDataRequestType;", ErrorBundle.DETAIL_ENTRY, "", "Lcom/robinhood/models/ui/UiPersonalDataRequestDetailsItem;", "<init>", "(Lcom/robinhood/shared/security/contracts/PersonalDataRequestType;Ljava/util/List;)V", "getRequestType", "()Lcom/robinhood/shared/security/contracts/PersonalDataRequestType;", "getDetails", "()Ljava/util/List;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final List<UiPersonalDataRequestDetailsItem> details;
        private final PersonalDataRequestType requestType;

        /* compiled from: PersonalDataRequestFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                PersonalDataRequestType personalDataRequestTypeValueOf = PersonalDataRequestType.valueOf(parcel.readString());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(Args.class.getClassLoader()));
                }
                return new Args(personalDataRequestTypeValueOf, arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Args copy$default(Args args, PersonalDataRequestType personalDataRequestType, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                personalDataRequestType = args.requestType;
            }
            if ((i & 2) != 0) {
                list = args.details;
            }
            return args.copy(personalDataRequestType, list);
        }

        /* renamed from: component1, reason: from getter */
        public final PersonalDataRequestType getRequestType() {
            return this.requestType;
        }

        public final List<UiPersonalDataRequestDetailsItem> component2() {
            return this.details;
        }

        public final Args copy(PersonalDataRequestType requestType, List<UiPersonalDataRequestDetailsItem> details) {
            Intrinsics.checkNotNullParameter(requestType, "requestType");
            Intrinsics.checkNotNullParameter(details, "details");
            return new Args(requestType, details);
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
            return this.requestType == args.requestType && Intrinsics.areEqual(this.details, args.details);
        }

        public int hashCode() {
            return (this.requestType.hashCode() * 31) + this.details.hashCode();
        }

        public String toString() {
            return "Args(requestType=" + this.requestType + ", details=" + this.details + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.requestType.name());
            List<UiPersonalDataRequestDetailsItem> list = this.details;
            dest.writeInt(list.size());
            Iterator<UiPersonalDataRequestDetailsItem> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
        }

        public Args(PersonalDataRequestType requestType, List<UiPersonalDataRequestDetailsItem> details) {
            Intrinsics.checkNotNullParameter(requestType, "requestType");
            Intrinsics.checkNotNullParameter(details, "details");
            this.requestType = requestType;
            this.details = details;
        }

        public final PersonalDataRequestType getRequestType() {
            return this.requestType;
        }

        public final List<UiPersonalDataRequestDetailsItem> getDetails() {
            return this.details;
        }
    }

    /* compiled from: PersonalDataRequestFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataRequestFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataRequestFragment;", "Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataRequestFragment$Args;", "<init>", "()V", "TAG_SUBMIT_ERROR_DIALOG", "", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<PersonalDataRequestFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(PersonalDataRequestFragment personalDataRequestFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, personalDataRequestFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public PersonalDataRequestFragment newInstance(Args args) {
            return (PersonalDataRequestFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(PersonalDataRequestFragment personalDataRequestFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, personalDataRequestFragment, args);
        }
    }
}
