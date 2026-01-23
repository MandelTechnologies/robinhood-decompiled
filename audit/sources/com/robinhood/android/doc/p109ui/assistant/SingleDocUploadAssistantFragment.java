package com.robinhood.android.doc.p109ui.assistant;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.daynight.DayNightChanges;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.doc.C14254R;
import com.robinhood.android.doc.databinding.FragmentSingleDocUploadAssistantBinding;
import com.robinhood.android.doc.p109ui.LoggingUtil2;
import com.robinhood.android.doc.p109ui.UtilKt;
import com.robinhood.android.doc.p109ui.assistant.DocUploadAssistantBaseCallbacks;
import com.robinhood.android.doc.p109ui.assistant.SingleDocUploadAssistantViewState;
import com.robinhood.android.maxonboarding.OnboardingProgress;
import com.robinhood.android.maxonboarding.ToolbarExt2;
import com.robinhood.android.util.extensions.LottieAnimationViewsKt;
import com.robinhood.models.api.ColorTheme;
import com.robinhood.models.api.identi.ApiDocumentRequest;
import com.robinhood.models.p355ui.DocumentRequest;
import com.robinhood.shared.remote.assets.LottieUrl;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.util.NoSuchElementException;
import kotlin.ExceptionsH;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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

/* compiled from: SingleDocUploadAssistantFragment.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0002+,B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010$\u001a\u00020\u00162\u0006\u0010%\u001a\u00020&H\u0002J\u0010\u0010'\u001a\u00020\u00162\u0006\u0010%\u001a\u00020(H\u0002J\u0010\u0010)\u001a\u00020\u00162\u0006\u0010*\u001a\u00020\u001fH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010 \u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/assistant/SingleDocUploadAssistantFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/android/doc/ui/assistant/SingleDocUploadAssistantDuxo;", "getDuxo", "()Lcom/robinhood/android/doc/ui/assistant/SingleDocUploadAssistantDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/doc/databinding/FragmentSingleDocUploadAssistantBinding;", "getBinding", "()Lcom/robinhood/android/doc/databinding/FragmentSingleDocUploadAssistantBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/doc/ui/assistant/DocUploadAssistantBaseCallbacks;", "getCallbacks", "()Lcom/robinhood/android/doc/ui/assistant/DocUploadAssistantBaseCallbacks;", "callbacks$delegate", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onBackPressed", "", "screenTag", "", "getScreenTag", "()Ljava/lang/String;", "bind", "state", "Lcom/robinhood/android/doc/ui/assistant/SingleDocUploadAssistantViewState;", "bindLoadedState", "Lcom/robinhood/android/doc/ui/assistant/SingleDocUploadAssistantViewState$Loaded;", "onLoading", "isLoading", "Args", "Companion", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class SingleDocUploadAssistantFragment extends BaseFragment {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SingleDocUploadAssistantFragment.class, "binding", "getBinding()Lcom/robinhood/android/doc/databinding/FragmentSingleDocUploadAssistantBinding;", 0)), Reflection.property1(new PropertyReference1Impl(SingleDocUploadAssistantFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/doc/ui/assistant/DocUploadAssistantBaseCallbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public SingleDocUploadAssistantFragment() {
        super(C14254R.layout.fragment_single_doc_upload_assistant);
        this.duxo = DuxosKt.duxo(this, SingleDocUploadAssistantDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, SingleDocUploadAssistantFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(DocUploadAssistantBaseCallbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.doc.ui.assistant.SingleDocUploadAssistantFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof DocUploadAssistantBaseCallbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SingleDocUploadAssistantDuxo getDuxo() {
        return (SingleDocUploadAssistantDuxo) this.duxo.getValue();
    }

    private final FragmentSingleDocUploadAssistantBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentSingleDocUploadAssistantBinding) value;
    }

    private final DocUploadAssistantBaseCallbacks getCallbacks() {
        return (DocUploadAssistantBaseCallbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        LottieUrl lottieUrl;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Companion companion = INSTANCE;
        if (((Args) companion.getArgs((Fragment) this)).isMockingRequest()) {
            UtilKt.showToastForMockingRequests(this);
        }
        RhTextView rhTextView = getBinding().singleDocUploadAssistantSubtitle;
        int i = C14254R.string.doc_upload_assistant_subtitle;
        ApiDocumentRequest.Type type2 = ((Args) companion.getArgs((Fragment) this)).getDocumentRequest().getType();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        rhTextView.setText(getString(i, UtilKt.getDisplayNameTitleCase(type2, resources)));
        RdsButton singleDocUploadAssistantPrimaryCta = getBinding().singleDocUploadAssistantPrimaryCta;
        Intrinsics.checkNotNullExpressionValue(singleDocUploadAssistantPrimaryCta, "singleDocUploadAssistantPrimaryCta");
        OnClickListeners.onClick(singleDocUploadAssistantPrimaryCta, new Function0() { // from class: com.robinhood.android.doc.ui.assistant.SingleDocUploadAssistantFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SingleDocUploadAssistantFragment.onViewCreated$lambda$0(this.f$0);
            }
        });
        RdsButton singleDocUploadAssistantSecondaryCta = getBinding().singleDocUploadAssistantSecondaryCta;
        Intrinsics.checkNotNullExpressionValue(singleDocUploadAssistantSecondaryCta, "singleDocUploadAssistantSecondaryCta");
        OnClickListeners.onClick(singleDocUploadAssistantSecondaryCta, new Function0() { // from class: com.robinhood.android.doc.ui.assistant.SingleDocUploadAssistantFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SingleDocUploadAssistantFragment.onViewCreated$lambda$1(this.f$0);
            }
        });
        BaseFragment.collectDuxoState$default(this, null, new C143453(null), 1, null);
        boolean z = ((Args) companion.getArgs((Fragment) this)).getTheme() != ColorTheme.DEFAULT;
        AppCompatImageView singleDocUploadSplashImage = getBinding().singleDocUploadSplashImage;
        Intrinsics.checkNotNullExpressionValue(singleDocUploadSplashImage, "singleDocUploadSplashImage");
        singleDocUploadSplashImage.setVisibility(!z ? 0 : 8);
        LottieAnimationView singleDocUploadSplashAnimation = getBinding().singleDocUploadSplashAnimation;
        Intrinsics.checkNotNullExpressionValue(singleDocUploadSplashAnimation, "singleDocUploadSplashAnimation");
        singleDocUploadSplashAnimation.setVisibility(z ? 0 : 8);
        if (z) {
            LottieAnimationView singleDocUploadSplashAnimation2 = getBinding().singleDocUploadSplashAnimation;
            Intrinsics.checkNotNullExpressionValue(singleDocUploadSplashAnimation2, "singleDocUploadSplashAnimation");
            if (!DayNightChanges.isDay(getScarletManager()) || ((Args) companion.getArgs((Fragment) this)).getTheme() == ColorTheme.DARK) {
                lottieUrl = LottieUrl.BRAND_REFRESH_VERIFY_IDENTITY_DARK;
            } else {
                lottieUrl = LottieUrl.BRAND_REFRESH_VERIFY_IDENTITY_LIGHT;
            }
            LottieAnimationViewsKt.setRemoteUrl(singleDocUploadSplashAnimation2, lottieUrl);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(SingleDocUploadAssistantFragment singleDocUploadAssistantFragment) {
        singleDocUploadAssistantFragment.getCallbacks().startDocUpload(CollectionsKt.listOf(((Args) INSTANCE.getArgs((Fragment) singleDocUploadAssistantFragment)).getDocumentRequest()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(SingleDocUploadAssistantFragment singleDocUploadAssistantFragment) {
        DocUploadAssistantBaseCallbacks.DefaultImpls.onSkipClicked$default(singleDocUploadAssistantFragment.getCallbacks(), null, 1, null);
        return Unit.INSTANCE;
    }

    /* compiled from: SingleDocUploadAssistantFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.doc.ui.assistant.SingleDocUploadAssistantFragment$onViewCreated$3", m3645f = "SingleDocUploadAssistantFragment.kt", m3646l = {54}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.doc.ui.assistant.SingleDocUploadAssistantFragment$onViewCreated$3 */
    static final class C143453 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C143453(Continuation<? super C143453> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SingleDocUploadAssistantFragment.this.new C143453(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C143453) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: SingleDocUploadAssistantFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.doc.ui.assistant.SingleDocUploadAssistantFragment$onViewCreated$3$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ SingleDocUploadAssistantFragment $tmp0;

            AnonymousClass1(SingleDocUploadAssistantFragment singleDocUploadAssistantFragment) {
                this.$tmp0 = singleDocUploadAssistantFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, SingleDocUploadAssistantFragment.class, "bind", "bind(Lcom/robinhood/android/doc/ui/assistant/SingleDocUploadAssistantViewState;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(SingleDocUploadAssistantViewState singleDocUploadAssistantViewState, Continuation<? super Unit> continuation) throws Throwable {
                Object objInvokeSuspend$bind = C143453.invokeSuspend$bind(this.$tmp0, singleDocUploadAssistantViewState, continuation);
                return objInvokeSuspend$bind == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$bind : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((SingleDocUploadAssistantViewState) obj, (Continuation<? super Unit>) continuation);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<SingleDocUploadAssistantViewState> stateFlow = SingleDocUploadAssistantFragment.this.getDuxo().getStateFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(SingleDocUploadAssistantFragment.this);
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

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$bind(SingleDocUploadAssistantFragment singleDocUploadAssistantFragment, SingleDocUploadAssistantViewState singleDocUploadAssistantViewState, Continuation continuation) throws Throwable {
            singleDocUploadAssistantFragment.bind(singleDocUploadAssistantViewState);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        ToolbarExt2.configureMaxFragment$default(toolbar, OnboardingProgress.DOC_UPLOAD, null, false, 4, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        DocUploadAssistantBaseCallbacks.DefaultImpls.onSkipClicked$default(getCallbacks(), null, 1, null);
        return true;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenTag() {
        return LoggingUtil2.getLoggingTag(((Args) INSTANCE.getArgs((Fragment) this)).getDocumentRequest());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(SingleDocUploadAssistantViewState state) throws Throwable {
        onLoading(state instanceof SingleDocUploadAssistantViewState.Loading);
        if (state instanceof SingleDocUploadAssistantViewState.Error) {
            ActivityErrorHandler.Companion companion = ActivityErrorHandler.INSTANCE;
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            ActivityErrorHandler.Companion.handle$default(companion, fragmentActivityRequireActivity, ((SingleDocUploadAssistantViewState.Error) state).getThrowable(), true, false, 0, null, 56, null);
            return;
        }
        if (state instanceof SingleDocUploadAssistantViewState.Loaded) {
            bindLoadedState((SingleDocUploadAssistantViewState.Loaded) state);
        } else if (!Intrinsics.areEqual(state, SingleDocUploadAssistantViewState.Loading.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    private final void bindLoadedState(SingleDocUploadAssistantViewState.Loaded state) {
        if (state.getIsDocUploadCompleted()) {
            getCallbacks().onAllDocsUploaded();
        }
    }

    private final void onLoading(boolean isLoading) {
        getBinding().singleDocUploadAssistantPrimaryCta.getIsLoading();
        requireToolbar().setLoadingViewVisible(isLoading);
    }

    /* compiled from: SingleDocUploadAssistantFragment.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/doc/ui/assistant/SingleDocUploadAssistantFragment$Args;", "Landroid/os/Parcelable;", "documentRequest", "Lcom/robinhood/models/ui/DocumentRequest;", "isMockingRequest", "", "theme", "Lcom/robinhood/models/api/ColorTheme;", "<init>", "(Lcom/robinhood/models/ui/DocumentRequest;ZLcom/robinhood/models/api/ColorTheme;)V", "getDocumentRequest", "()Lcom/robinhood/models/ui/DocumentRequest;", "()Z", "getTheme", "()Lcom/robinhood/models/api/ColorTheme;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final DocumentRequest documentRequest;
        private final boolean isMockingRequest;
        private final ColorTheme theme;

        /* compiled from: SingleDocUploadAssistantFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((DocumentRequest) parcel.readParcelable(Args.class.getClassLoader()), parcel.readInt() != 0, ColorTheme.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, DocumentRequest documentRequest, boolean z, ColorTheme colorTheme, int i, Object obj) {
            if ((i & 1) != 0) {
                documentRequest = args.documentRequest;
            }
            if ((i & 2) != 0) {
                z = args.isMockingRequest;
            }
            if ((i & 4) != 0) {
                colorTheme = args.theme;
            }
            return args.copy(documentRequest, z, colorTheme);
        }

        /* renamed from: component1, reason: from getter */
        public final DocumentRequest getDocumentRequest() {
            return this.documentRequest;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsMockingRequest() {
            return this.isMockingRequest;
        }

        /* renamed from: component3, reason: from getter */
        public final ColorTheme getTheme() {
            return this.theme;
        }

        public final Args copy(DocumentRequest documentRequest, boolean isMockingRequest, ColorTheme theme) {
            Intrinsics.checkNotNullParameter(documentRequest, "documentRequest");
            Intrinsics.checkNotNullParameter(theme, "theme");
            return new Args(documentRequest, isMockingRequest, theme);
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
            return Intrinsics.areEqual(this.documentRequest, args.documentRequest) && this.isMockingRequest == args.isMockingRequest && this.theme == args.theme;
        }

        public int hashCode() {
            return (((this.documentRequest.hashCode() * 31) + Boolean.hashCode(this.isMockingRequest)) * 31) + this.theme.hashCode();
        }

        public String toString() {
            return "Args(documentRequest=" + this.documentRequest + ", isMockingRequest=" + this.isMockingRequest + ", theme=" + this.theme + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.documentRequest, flags);
            dest.writeInt(this.isMockingRequest ? 1 : 0);
            dest.writeString(this.theme.name());
        }

        public Args(DocumentRequest documentRequest, boolean z, ColorTheme theme) {
            Intrinsics.checkNotNullParameter(documentRequest, "documentRequest");
            Intrinsics.checkNotNullParameter(theme, "theme");
            this.documentRequest = documentRequest;
            this.isMockingRequest = z;
            this.theme = theme;
        }

        public final DocumentRequest getDocumentRequest() {
            return this.documentRequest;
        }

        public final boolean isMockingRequest() {
            return this.isMockingRequest;
        }

        public final ColorTheme getTheme() {
            return this.theme;
        }
    }

    /* compiled from: SingleDocUploadAssistantFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/assistant/SingleDocUploadAssistantFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/doc/ui/assistant/SingleDocUploadAssistantFragment;", "Lcom/robinhood/android/doc/ui/assistant/SingleDocUploadAssistantFragment$Args;", "<init>", "()V", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<SingleDocUploadAssistantFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(SingleDocUploadAssistantFragment singleDocUploadAssistantFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, singleDocUploadAssistantFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public SingleDocUploadAssistantFragment newInstance(Args args) {
            return (SingleDocUploadAssistantFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(SingleDocUploadAssistantFragment singleDocUploadAssistantFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, singleDocUploadAssistantFragment, args);
        }
    }
}
