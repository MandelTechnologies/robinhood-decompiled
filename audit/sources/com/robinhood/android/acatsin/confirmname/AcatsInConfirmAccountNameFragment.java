package com.robinhood.android.acatsin.confirmname;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.acatsin.C7725R;
import com.robinhood.android.acatsin.confirmname.AcatsInConfirmAccountNameContract;
import com.robinhood.android.acatsin.databinding.FragmentAcatsInConfirmAccountNameBinding;
import com.robinhood.android.acatsin.p058ui.AcatsFlowStepFragment3;
import com.robinhood.android.acatsin.util.AcatsFlowStep;
import com.robinhood.android.acatsin.util.Eithers;
import com.robinhood.android.acatsin.util.ImageViews;
import com.robinhood.android.acatsin.util.names.NamesOnAccount;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.rhimage.ImageLoader;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.view.Drawables;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.resource.StringResource;
import java.util.NoSuchElementException;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import okhttp3.HttpUrl;

/* compiled from: AcatsInConfirmAccountNameFragment.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 62\u00020\u00012\u00020\u00022\u00020\u0003:\u00016B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010%\u001a\u00020&H\u0016J\u001a\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\u0010\u0010,\u001a\u00020&2\u0006\u0010-\u001a\u00020.H\u0002J\u0012\u0010/\u001a\u00020&2\b\u00100\u001a\u0004\u0018\u000101H\u0016J\u0012\u00102\u001a\u00020&2\b\u00103\u001a\u0004\u0018\u000101H\u0016J\u0012\u00104\u001a\u00020&2\b\u00105\u001a\u0004\u0018\u000101H\u0016R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u001e\u0010\u001f\u001a\u00020 8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u00067"}, m3636d2 = {"Lcom/robinhood/android/acatsin/confirmname/AcatsInConfirmAccountNameFragment;", "Lcom/robinhood/android/acatsin/ui/BaseAcatsFlowStepFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "Lcom/robinhood/android/rhimage/ImageLoader$Target;", "<init>", "()V", "viewBinding", "Lcom/robinhood/android/acatsin/databinding/FragmentAcatsInConfirmAccountNameBinding;", "getViewBinding", "()Lcom/robinhood/android/acatsin/databinding/FragmentAcatsInConfirmAccountNameBinding;", "viewBinding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/acatsin/confirmname/AcatsInConfirmAccountNameDuxo;", "getDuxo", "()Lcom/robinhood/android/acatsin/confirmname/AcatsInConfirmAccountNameDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/android/acatsin/confirmname/AcatsInConfirmAccountNameContract$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/acatsin/confirmname/AcatsInConfirmAccountNameContract$Callbacks;", "callbacks$delegate", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenEventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "getScreenEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "imageLoader", "Lcom/robinhood/android/rhimage/ImageLoader;", "getImageLoader", "()Lcom/robinhood/android/rhimage/ImageLoader;", "setImageLoader", "(Lcom/robinhood/android/rhimage/ImageLoader;)V", "onResume", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "bindViewState", "viewState", "Lcom/robinhood/android/acatsin/confirmname/AcatsInConfirmAccountNameViewState;", "onSuccess", "result", "Landroid/graphics/drawable/Drawable;", "onError", "error", "onStart", "placeholder", "Companion", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AcatsInConfirmAccountNameFragment extends AcatsFlowStepFragment3 implements AutoLoggableFragment, ImageLoader.Target {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public ImageLoader imageLoader;

    /* renamed from: viewBinding$delegate, reason: from kotlin metadata */
    private final Interfaces2 viewBinding;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AcatsInConfirmAccountNameFragment.class, "viewBinding", "getViewBinding()Lcom/robinhood/android/acatsin/databinding/FragmentAcatsInConfirmAccountNameBinding;", 0)), Reflection.property1(new PropertyReference1Impl(AcatsInConfirmAccountNameFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/acatsin/confirmname/AcatsInConfirmAccountNameContract$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.rhimage.ImageLoader.Target
    public void onError(Drawable error) {
    }

    @Override // com.robinhood.android.rhimage.ImageLoader.Target
    public void onStart(Drawable placeholder) {
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenAppearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenDisappearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenSourceEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenSourceEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Component getScreenEventComponent() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventComponent(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    public AcatsInConfirmAccountNameFragment() {
        super(C7725R.layout.fragment_acats_in_confirm_account_name, null, AcatsFlowStep.CONFIRM_ACCOUNT_NAME, 2, null);
        this.viewBinding = ViewBinding5.viewBinding(this, AcatsInConfirmAccountNameFragment2.INSTANCE);
        this.duxo = DuxosKt.duxo(this, AcatsInConfirmAccountNameDuxo.class);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(AcatsInConfirmAccountNameContract.Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.acatsin.confirmname.AcatsInConfirmAccountNameFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof AcatsInConfirmAccountNameContract.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
    }

    /* compiled from: AcatsInConfirmAccountNameFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/acatsin/confirmname/AcatsInConfirmAccountNameFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/acatsin/confirmname/AcatsInConfirmAccountNameFragment;", "Lcom/robinhood/android/acatsin/confirmname/AcatsInConfirmAccountNameContract$Key;", "<init>", "()V", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<AcatsInConfirmAccountNameFragment, AcatsInConfirmAccountNameContract.Key> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(AcatsInConfirmAccountNameContract.Key key) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, key);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public AcatsInConfirmAccountNameContract.Key getArgs(AcatsInConfirmAccountNameFragment acatsInConfirmAccountNameFragment) {
            return (AcatsInConfirmAccountNameContract.Key) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, acatsInConfirmAccountNameFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AcatsInConfirmAccountNameFragment newInstance(AcatsInConfirmAccountNameContract.Key key) {
            return (AcatsInConfirmAccountNameFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, key);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AcatsInConfirmAccountNameFragment acatsInConfirmAccountNameFragment, AcatsInConfirmAccountNameContract.Key key) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, acatsInConfirmAccountNameFragment, key);
        }
    }

    private final FragmentAcatsInConfirmAccountNameBinding getViewBinding() {
        Object value = this.viewBinding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentAcatsInConfirmAccountNameBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AcatsInConfirmAccountNameDuxo getDuxo() {
        return (AcatsInConfirmAccountNameDuxo) this.duxo.getValue();
    }

    private final AcatsInConfirmAccountNameContract.Callbacks getCallbacks() {
        return (AcatsInConfirmAccountNameContract.Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        Screen.Name name = Screen.Name.ACATS_IN_CONFIRM_NAME;
        Companion companion = INSTANCE;
        return new Screen(name, ((AcatsInConfirmAccountNameContract.Key) companion.getArgs((Fragment) this)).getScreenContext().getSource(), Eithers.getLoggingIdentifier(((AcatsInConfirmAccountNameContract.Key) companion.getArgs((Fragment) this)).getBrokerageOrDtcNumber()), null, 8, null);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public com.robinhood.rosetta.eventlogging.Context getScreenEventContext() {
        return ((AcatsInConfirmAccountNameContract.Key) INSTANCE.getArgs((Fragment) this)).getScreenContext().toEventContext();
    }

    public final ImageLoader getImageLoader() {
        ImageLoader imageLoader = this.imageLoader;
        if (imageLoader != null) {
            return imageLoader;
        }
        Intrinsics.throwUninitializedPropertyAccessException("imageLoader");
        return null;
    }

    public final void setImageLoader(ImageLoader imageLoader) {
        Intrinsics.checkNotNullParameter(imageLoader, "<set-?>");
        this.imageLoader = imageLoader;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        HttpUrl logoUrl = Eithers.getLogoUrl(((AcatsInConfirmAccountNameContract.Key) INSTANCE.getArgs((Fragment) this)).getBrokerageOrDtcNumber());
        if (logoUrl != null) {
            getImageLoader().load(logoUrl).into(this);
            getDuxo().indicateLogoLoading();
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        BaseFragment.collectDuxoState$default(this, null, new C78561(null), 1, null);
        ImageView robinhoodBrokerChip = getViewBinding().robinhoodBrokerChip;
        Intrinsics.checkNotNullExpressionValue(robinhoodBrokerChip, "robinhoodBrokerChip");
        ImageViews.showRobinhoodBrokerageLogo(robinhoodBrokerChip);
        ImageView contraBrokerChip = getViewBinding().contraBrokerChip;
        Intrinsics.checkNotNullExpressionValue(contraBrokerChip, "contraBrokerChip");
        ImageViews.showDefaultBrokerageLogo(contraBrokerChip);
        RdsButton nameDoesntMatchButton = getViewBinding().nameDoesntMatchButton;
        Intrinsics.checkNotNullExpressionValue(nameDoesntMatchButton, "nameDoesntMatchButton");
        OnClickListeners.onClick(nameDoesntMatchButton, new Function0() { // from class: com.robinhood.android.acatsin.confirmname.AcatsInConfirmAccountNameFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AcatsInConfirmAccountNameFragment.onViewCreated$lambda$0(this.f$0);
            }
        });
    }

    /* compiled from: AcatsInConfirmAccountNameFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.confirmname.AcatsInConfirmAccountNameFragment$onViewCreated$1", m3645f = "AcatsInConfirmAccountNameFragment.kt", m3646l = {74}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.confirmname.AcatsInConfirmAccountNameFragment$onViewCreated$1 */
    static final class C78561 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C78561(Continuation<? super C78561> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AcatsInConfirmAccountNameFragment.this.new C78561(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C78561) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: AcatsInConfirmAccountNameFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.acatsin.confirmname.AcatsInConfirmAccountNameFragment$onViewCreated$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ AcatsInConfirmAccountNameFragment $tmp0;

            AnonymousClass1(AcatsInConfirmAccountNameFragment acatsInConfirmAccountNameFragment) {
                this.$tmp0 = acatsInConfirmAccountNameFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, AcatsInConfirmAccountNameFragment.class, "bindViewState", "bindViewState(Lcom/robinhood/android/acatsin/confirmname/AcatsInConfirmAccountNameViewState;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(AcatsInConfirmAccountNameViewState acatsInConfirmAccountNameViewState, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$bindViewState = C78561.invokeSuspend$bindViewState(this.$tmp0, acatsInConfirmAccountNameViewState, continuation);
                return objInvokeSuspend$bindViewState == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$bindViewState : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((AcatsInConfirmAccountNameViewState) obj, (Continuation<? super Unit>) continuation);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$bindViewState(AcatsInConfirmAccountNameFragment acatsInConfirmAccountNameFragment, AcatsInConfirmAccountNameViewState acatsInConfirmAccountNameViewState, Continuation continuation) {
            acatsInConfirmAccountNameFragment.bindViewState(acatsInConfirmAccountNameViewState);
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<AcatsInConfirmAccountNameViewState> stateFlow = AcatsInConfirmAccountNameFragment.this.getDuxo().getStateFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(AcatsInConfirmAccountNameFragment.this);
                this.label = 1;
                if (stateFlow.collect(anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(AcatsInConfirmAccountNameFragment acatsInConfirmAccountNameFragment) {
        acatsInConfirmAccountNameFragment.getCallbacks().showNameChangeFragment(((AcatsInConfirmAccountNameContract.Key) INSTANCE.getArgs((Fragment) acatsInConfirmAccountNameFragment)).getBrokerageOrDtcNumber());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindViewState(final AcatsInConfirmAccountNameViewState viewState) {
        RhTextView rhTextView = getViewBinding().confirmAccountNameTitle;
        StringResource title = viewState.getTitle();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        rhTextView.setText(title.getText(resources));
        getViewBinding().accountName.setText(viewState.getUserFullNamesString());
        RhTextView accountNameMustMatchMessage = getViewBinding().accountNameMustMatchMessage;
        Intrinsics.checkNotNullExpressionValue(accountNameMustMatchMessage, "accountNameMustMatchMessage");
        StringResource nameMustMatchMessage = viewState.getNameMustMatchMessage();
        Resources resources2 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        TextViewsKt.setVisibilityText(accountNameMustMatchMessage, nameMustMatchMessage.getText(resources2));
        getViewBinding().continueButton.setLoading(viewState.isContinueLoading());
        RdsButton continueButton = getViewBinding().continueButton;
        Intrinsics.checkNotNullExpressionValue(continueButton, "continueButton");
        OnClickListeners.onClick(continueButton, new Function0() { // from class: com.robinhood.android.acatsin.confirmname.AcatsInConfirmAccountNameFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AcatsInConfirmAccountNameFragment.bindViewState$lambda$2(viewState, this);
            }
        });
        getViewBinding().nameDoesntMatchButton.setEnabled(viewState.getNamesDontMatchEnabled());
        RdsButton rdsButton = getViewBinding().nameDoesntMatchButton;
        StringResource nameDoesntMatchButtonTitle = viewState.getNameDoesntMatchButtonTitle();
        Resources resources3 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
        rdsButton.setText(nameDoesntMatchButtonTitle.getText(resources3));
        ImageView imageView = getViewBinding().contraBrokerChip;
        if (viewState.getContraBrokerLogo() != null) {
            imageView.setImageBitmap(viewState.getContraBrokerLogo());
        } else {
            Intrinsics.checkNotNull(imageView);
            ImageViews.showDefaultBrokerageLogo(imageView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindViewState$lambda$2(AcatsInConfirmAccountNameViewState acatsInConfirmAccountNameViewState, AcatsInConfirmAccountNameFragment acatsInConfirmAccountNameFragment) {
        NamesOnAccount namesOnAccount = acatsInConfirmAccountNameViewState.getNamesOnAccount();
        if (namesOnAccount == null) {
            throw new IllegalStateException("cannot confirm empty user full name");
        }
        acatsInConfirmAccountNameFragment.getCallbacks().onAccountNamesConfirmed(namesOnAccount);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.rhimage.ImageLoader.Target
    public void onSuccess(Drawable result) {
        if (result != null) {
            getDuxo().setContraBrokerLogo(Drawables.toBitmap$default(result, 0, 0, null, 7, null));
        }
    }
}
