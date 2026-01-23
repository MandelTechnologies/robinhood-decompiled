package com.robinhood.android.doc.p109ui.assistant;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.daynight.DayNightChanges;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.doc.C14254R;
import com.robinhood.android.doc.databinding.FragmentMultiDocUploadAssistantBinding;
import com.robinhood.android.doc.p109ui.LoggingUtil2;
import com.robinhood.android.doc.p109ui.UtilKt;
import com.robinhood.android.maxonboarding.OnboardingProgress;
import com.robinhood.android.maxonboarding.ToolbarExt2;
import com.robinhood.android.util.extensions.LottieAnimationViewsKt;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.ColorTheme;
import com.robinhood.models.p355ui.DocumentRequest;
import com.robinhood.shared.remote.assets.LottieUrl;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;

/* compiled from: MultiDocUploadAssistantFragment.kt */
@Metadata(m3635d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 :2\u00020\u0001:\u00029:B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0016J\u001a\u0010(\u001a\u00020%2\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\b\u0010-\u001a\u00020%H\u0016J\b\u0010.\u001a\u00020/H\u0016J\u0010\u00104\u001a\u00020%2\u0006\u00105\u001a\u000206H\u0002J\u0010\u00107\u001a\u00020%2\u0006\u00108\u001a\u00020/H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013RK\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00170\u0016j\b\u0012\u0004\u0012\u00020\u0017`\u00182\u0016\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00170\u0016j\b\u0012\u0004\u0012\u00020\u0017`\u00188B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR \u0010 \u001a\u0014\u0012\u0004\u0012\u00020\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170#0!X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00100\u001a\u0002018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u0006;"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/assistant/MultiDocUploadAssistantFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/android/doc/ui/assistant/MultiDocUploadAssistantDuxo;", "getDuxo", "()Lcom/robinhood/android/doc/ui/assistant/MultiDocUploadAssistantDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/doc/databinding/FragmentMultiDocUploadAssistantBinding;", "getBinding", "()Lcom/robinhood/android/doc/databinding/FragmentMultiDocUploadAssistantBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/doc/ui/assistant/DocUploadAssistantBaseCallbacks;", "getCallbacks", "()Lcom/robinhood/android/doc/ui/assistant/DocUploadAssistantBaseCallbacks;", "callbacks$delegate", "<set-?>", "Ljava/util/ArrayList;", "Lcom/robinhood/models/ui/DocumentRequest;", "Lkotlin/collections/ArrayList;", "completedDocRequests", "getCompletedDocRequests", "()Ljava/util/ArrayList;", "setCompletedDocRequests", "(Ljava/util/ArrayList;)V", "completedDocRequests$delegate", "Lkotlin/properties/ReadWriteProperty;", "adapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/doc/ui/assistant/MultiDocUploadAssistantRowView;", "", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onBackPressed", "", "screenTag", "", "getScreenTag", "()Ljava/lang/String;", "bind", "state", "Lcom/robinhood/android/doc/ui/assistant/MultiDocUploadAssistantViewState;", "onLoading", "isLoading", "Args", "Companion", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class MultiDocUploadAssistantFragment extends BaseFragment {
    public static final float SPLASH_IMAGE_HEIGHT_DP = 160.0f;
    public static final float SPLASH_IMAGE_SHRINK_PROPORTION = 0.25f;
    public static final float SPLASH_IMAGE_SMALL_HEIGHT_DP = 80.0f;
    private final GenericListAdapter<MultiDocUploadAssistantRowView, List<DocumentRequest>> adapter;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: completedDocRequests$delegate, reason: from kotlin metadata */
    private final Interfaces3 completedDocRequests;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(MultiDocUploadAssistantFragment.class, "binding", "getBinding()Lcom/robinhood/android/doc/databinding/FragmentMultiDocUploadAssistantBinding;", 0)), Reflection.property1(new PropertyReference1Impl(MultiDocUploadAssistantFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/doc/ui/assistant/DocUploadAssistantBaseCallbacks;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(MultiDocUploadAssistantFragment.class, "completedDocRequests", "getCompletedDocRequests()Ljava/util/ArrayList;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public MultiDocUploadAssistantFragment() {
        super(C14254R.layout.fragment_multi_doc_upload_assistant);
        this.duxo = OldDuxos.oldDuxo(this, MultiDocUploadAssistantDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, MultiDocUploadAssistantFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(DocUploadAssistantBaseCallbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.doc.ui.assistant.MultiDocUploadAssistantFragment$special$$inlined$hostActivityCallbacks$1
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
        this.completedDocRequests = (Interfaces3) BindSavedState2.savedParcelableArrayList(this, new ArrayList()).provideDelegate(this, $$delegatedProperties[2]);
        GenericListAdapter.Companion companion = GenericListAdapter.INSTANCE;
        int i = C14254R.layout.row_multi_doc_upload_assistant;
        DiffCallbacks diffCallbacks = DiffCallbacks.INSTANCE;
        this.adapter = companion.m2985of(i, DiffCallbacks.Equality.INSTANCE, new Function2() { // from class: com.robinhood.android.doc.ui.assistant.MultiDocUploadAssistantFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MultiDocUploadAssistantFragment.adapter$lambda$1(this.f$0, (MultiDocUploadAssistantRowView) obj, (List) obj2);
            }
        });
    }

    private final MultiDocUploadAssistantDuxo getDuxo() {
        return (MultiDocUploadAssistantDuxo) this.duxo.getValue();
    }

    private final FragmentMultiDocUploadAssistantBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentMultiDocUploadAssistantBinding) value;
    }

    private final DocUploadAssistantBaseCallbacks getCallbacks() {
        return (DocUploadAssistantBaseCallbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    private final ArrayList<DocumentRequest> getCompletedDocRequests() {
        return (ArrayList) this.completedDocRequests.getValue(this, $$delegatedProperties[2]);
    }

    private final void setCompletedDocRequests(ArrayList<DocumentRequest> arrayList) {
        this.completedDocRequests.setValue(this, $$delegatedProperties[2], arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit adapter$lambda$1(final MultiDocUploadAssistantFragment multiDocUploadAssistantFragment, MultiDocUploadAssistantRowView of, final List docRequests) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(docRequests, "docRequests");
        of.bind2((List<DocumentRequest>) docRequests);
        OnClickListeners.onClick(of, new Function0() { // from class: com.robinhood.android.doc.ui.assistant.MultiDocUploadAssistantFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MultiDocUploadAssistantFragment.adapter$lambda$1$lambda$0(docRequests, multiDocUploadAssistantFragment);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit adapter$lambda$1$lambda$0(List list, MultiDocUploadAssistantFragment multiDocUploadAssistantFragment) {
        if (UtilKt.isPending(list)) {
            multiDocUploadAssistantFragment.getCallbacks().startDocUpload(list);
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        ToolbarExt2.configureMaxFragment$default(toolbar, OnboardingProgress.DOC_UPLOAD, null, false, 4, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        LottieUrl lottieUrl;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Companion companion = INSTANCE;
        if (((Args) companion.getArgs((Fragment) this)).getIsMockingRequests()) {
            UtilKt.showToastForMockingRequests(this);
        }
        getBinding().multiDocUploadAssistantRecyclerView.setAdapter(this.adapter);
        RdsButton multiDocUploadAssistantPrimaryCta = getBinding().multiDocUploadAssistantPrimaryCta;
        Intrinsics.checkNotNullExpressionValue(multiDocUploadAssistantPrimaryCta, "multiDocUploadAssistantPrimaryCta");
        OnClickListeners.onClick(multiDocUploadAssistantPrimaryCta, new Function0() { // from class: com.robinhood.android.doc.ui.assistant.MultiDocUploadAssistantFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MultiDocUploadAssistantFragment.onViewCreated$lambda$2(this.f$0);
            }
        });
        RdsButton multiDocUploadAssistantSecondaryCta = getBinding().multiDocUploadAssistantSecondaryCta;
        Intrinsics.checkNotNullExpressionValue(multiDocUploadAssistantSecondaryCta, "multiDocUploadAssistantSecondaryCta");
        OnClickListeners.onClick(multiDocUploadAssistantSecondaryCta, new Function0() { // from class: com.robinhood.android.doc.ui.assistant.MultiDocUploadAssistantFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MultiDocUploadAssistantFragment.onViewCreated$lambda$3(this.f$0);
            }
        });
        boolean z = ((Args) companion.getArgs((Fragment) this)).getTheme() != ColorTheme.DEFAULT;
        AppCompatImageView multiDocUploadSplashImage = getBinding().multiDocUploadSplashImage;
        Intrinsics.checkNotNullExpressionValue(multiDocUploadSplashImage, "multiDocUploadSplashImage");
        multiDocUploadSplashImage.setVisibility(!z ? 0 : 8);
        LottieAnimationView multiDocUploadSplashAnimation = getBinding().multiDocUploadSplashAnimation;
        Intrinsics.checkNotNullExpressionValue(multiDocUploadSplashAnimation, "multiDocUploadSplashAnimation");
        multiDocUploadSplashAnimation.setVisibility(z ? 0 : 8);
        if (z) {
            LottieAnimationView multiDocUploadSplashAnimation2 = getBinding().multiDocUploadSplashAnimation;
            Intrinsics.checkNotNullExpressionValue(multiDocUploadSplashAnimation2, "multiDocUploadSplashAnimation");
            if (!DayNightChanges.isDay(getScarletManager()) || ((Args) companion.getArgs((Fragment) this)).getTheme() == ColorTheme.DARK) {
                lottieUrl = LottieUrl.BRAND_REFRESH_VERIFY_IDENTITY_DARK;
            } else {
                lottieUrl = LottieUrl.BRAND_REFRESH_VERIFY_IDENTITY_LIGHT;
            }
            LottieAnimationViewsKt.setRemoteUrl(multiDocUploadSplashAnimation2, lottieUrl);
        }
        DisplayMetrics displayMetrics = requireContext().getResources().getDisplayMetrics();
        if (160.0f / (displayMetrics.heightPixels / displayMetrics.density) > 0.25f) {
            ViewGroup.LayoutParams layoutParams = getBinding().multiDocUploadSplashContainer.getLayoutParams();
            layoutParams.height = (int) (displayMetrics.density * 80.0f);
            getBinding().multiDocUploadSplashContainer.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2(MultiDocUploadAssistantFragment multiDocUploadAssistantFragment) {
        multiDocUploadAssistantFragment.getCallbacks().onAllDocsUploaded();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3(MultiDocUploadAssistantFragment multiDocUploadAssistantFragment) {
        multiDocUploadAssistantFragment.getCallbacks().onSkipClicked(multiDocUploadAssistantFragment.getCompletedDocRequests());
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C143401(this));
    }

    /* compiled from: MultiDocUploadAssistantFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.doc.ui.assistant.MultiDocUploadAssistantFragment$onStart$1 */
    /* synthetic */ class C143401 extends FunctionReferenceImpl implements Function1<MultiDocUploadAssistantViewState, Unit> {
        C143401(Object obj) {
            super(1, obj, MultiDocUploadAssistantFragment.class, "bind", "bind(Lcom/robinhood/android/doc/ui/assistant/MultiDocUploadAssistantViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MultiDocUploadAssistantViewState multiDocUploadAssistantViewState) {
            invoke2(multiDocUploadAssistantViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(MultiDocUploadAssistantViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((MultiDocUploadAssistantFragment) this.receiver).bind(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        if (getCompletedDocRequests().size() == ((Args) INSTANCE.getArgs((Fragment) this)).getDocRequests().size()) {
            getCallbacks().onAllDocsUploaded();
            return true;
        }
        getCallbacks().onSkipClicked(getCompletedDocRequests());
        return true;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenTag() {
        return LoggingUtil2.getLoggingTag(((Args) INSTANCE.getArgs((Fragment) this)).getDocRequests());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(MultiDocUploadAssistantViewState state) {
        onLoading(state.isLoading());
        setCompletedDocRequests(state.getCompletedDocRequests());
        GenericListAdapter<MultiDocUploadAssistantRowView, List<DocumentRequest>> genericListAdapter = this.adapter;
        List<List<DocumentRequest>> listCombineRequests = UtilKt.combineRequests(state.getDocRequests());
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        genericListAdapter.submitList(UtilKt.toAlphabeticalOrder(listCombineRequests, resources));
        getBinding().multiDocUploadAssistantPrimaryCta.setEnabled(state.getAreAllDocUploadsCompleted());
    }

    private final void onLoading(boolean isLoading) {
        requireToolbar().setLoadingViewVisible(isLoading);
        getBinding().multiDocUploadAssistantPrimaryCta.setLoading(isLoading);
    }

    /* compiled from: MultiDocUploadAssistantFragment.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/assistant/MultiDocUploadAssistantFragment$Args;", "Landroid/os/Parcelable;", "docRequests", "", "Lcom/robinhood/models/ui/DocumentRequest;", "isMockingRequests", "", "theme", "Lcom/robinhood/models/api/ColorTheme;", "<init>", "(Ljava/util/List;ZLcom/robinhood/models/api/ColorTheme;)V", "getDocRequests", "()Ljava/util/List;", "()Z", "getTheme", "()Lcom/robinhood/models/api/ColorTheme;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final List<DocumentRequest> docRequests;
        private final boolean isMockingRequests;
        private final ColorTheme theme;

        /* compiled from: MultiDocUploadAssistantFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(Args.class.getClassLoader()));
                }
                return new Args(arrayList, parcel.readInt() != 0, ColorTheme.valueOf(parcel.readString()));
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
            List<DocumentRequest> list = this.docRequests;
            dest.writeInt(list.size());
            Iterator<DocumentRequest> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            dest.writeInt(this.isMockingRequests ? 1 : 0);
            dest.writeString(this.theme.name());
        }

        public Args(List<DocumentRequest> docRequests, boolean z, ColorTheme theme) {
            Intrinsics.checkNotNullParameter(docRequests, "docRequests");
            Intrinsics.checkNotNullParameter(theme, "theme");
            this.docRequests = docRequests;
            this.isMockingRequests = z;
            this.theme = theme;
        }

        public final List<DocumentRequest> getDocRequests() {
            return this.docRequests;
        }

        /* renamed from: isMockingRequests, reason: from getter */
        public final boolean getIsMockingRequests() {
            return this.isMockingRequests;
        }

        public final ColorTheme getTheme() {
            return this.theme;
        }
    }

    /* compiled from: MultiDocUploadAssistantFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/assistant/MultiDocUploadAssistantFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/doc/ui/assistant/MultiDocUploadAssistantFragment;", "Lcom/robinhood/android/doc/ui/assistant/MultiDocUploadAssistantFragment$Args;", "<init>", "()V", "SPLASH_IMAGE_SHRINK_PROPORTION", "", "SPLASH_IMAGE_HEIGHT_DP", "SPLASH_IMAGE_SMALL_HEIGHT_DP", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<MultiDocUploadAssistantFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(MultiDocUploadAssistantFragment multiDocUploadAssistantFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, multiDocUploadAssistantFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public MultiDocUploadAssistantFragment newInstance(Args args) {
            return (MultiDocUploadAssistantFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(MultiDocUploadAssistantFragment multiDocUploadAssistantFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, multiDocUploadAssistantFragment, args);
        }
    }
}
