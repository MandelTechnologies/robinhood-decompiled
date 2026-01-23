package com.robinhood.shared.education.p377ui.overview;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.result.ActivityResultCaller;
import com.jakewharton.rxbinding3.recyclerview.RecyclerViewScrollEvent;
import com.jakewharton.rxbinding3.recyclerview.RxRecyclerView;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.UiCallbacks;
import com.robinhood.android.common.util.VisibleItemsManager;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.shared.education.C38790R;
import com.robinhood.shared.education.databinding.FragmentEducationOverviewBinding;
import com.robinhood.shared.education.p377ui.overview.EducationOverviewFragment;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationLessonPreview;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: EducationOverviewFragment.kt */
@Metadata(m3635d1 = {"\u0000g\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001 \b\u0007\u0018\u0000 22\u00020\u00012\u00020\u0002:\u000212B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u001a\u0010&\u001a\u00020#2\u0006\u0010'\u001a\u00020(2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\b\u0010)\u001a\u00020#H\u0016J\b\u0010*\u001a\u00020#H\u0016J\u0010\u0010+\u001a\u00020#2\u0006\u0010,\u001a\u00020-H\u0016J\u0010\u0010.\u001a\u00020#2\u0006\u0010/\u001a\u000200H\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u0017X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u001e0\u001dX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0004\n\u0002\u0010!¨\u00063"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/overview/EducationOverviewFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/common/util/UiCallbacks$ScreenViewAnalyticable;", "<init>", "()V", "callbacks", "Lcom/robinhood/shared/education/ui/overview/EducationOverviewFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/shared/education/ui/overview/EducationOverviewFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "binding", "Lcom/robinhood/shared/education/databinding/FragmentEducationOverviewBinding;", "getBinding", "()Lcom/robinhood/shared/education/databinding/FragmentEducationOverviewBinding;", "binding$delegate", "duxo", "Lcom/robinhood/shared/education/ui/overview/EducationOverviewDuxo;", "getDuxo", "()Lcom/robinhood/shared/education/ui/overview/EducationOverviewDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "screenName", "", "getScreenName", "()Ljava/lang/String;", "entityId", "getEntityId", "visibleItemsManager", "Lcom/robinhood/android/common/util/VisibleItemsManager;", "Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationLessonPreview;", "listAdapter", "com/robinhood/shared/education/ui/overview/EducationOverviewFragment$listAdapter$1", "Lcom/robinhood/shared/education/ui/overview/EducationOverviewFragment$listAdapter$1;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "onStart", "onStop", "onDialogDismissed", "id", "", "setViewState", "viewState", "Lcom/robinhood/shared/education/ui/overview/EducationOverviewViewState;", "Callbacks", "Companion", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class EducationOverviewFragment extends BaseFragment implements UiCallbacks.ScreenViewAnalyticable {
    private static final String TAG_ERROR = "educationOverviewError";

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final EducationOverviewFragment3 listAdapter;
    private final String screenName;
    private VisibleItemsManager<String, EducationLessonPreview> visibleItemsManager;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(EducationOverviewFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/shared/education/ui/overview/EducationOverviewFragment$Callbacks;", 0)), Reflection.property1(new PropertyReference1Impl(EducationOverviewFragment.class, "binding", "getBinding()Lcom/robinhood/shared/education/databinding/FragmentEducationOverviewBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: EducationOverviewFragment.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J \u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\u0003H&¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/overview/EducationOverviewFragment$Callbacks;", "", "onEducationLessonAppear", "", "educationLesson", "Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationLessonPreview;", "position", "", "onEducationLessonClicked", "source", "", "onLoadEducationOverviewFailed", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onEducationLessonAppear(EducationLessonPreview educationLesson, int position);

        void onEducationLessonClicked(EducationLessonPreview educationLesson, int position, String source);

        void onLoadEducationOverviewFailed();
    }

    public EducationOverviewFragment() {
        super(C38790R.layout.fragment_education_overview);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.shared.education.ui.overview.EducationOverviewFragment$special$$inlined$parentFragmentThenActivityHostCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                ActivityResultCaller parentFragment = CallbacksProperty.getParentFragment();
                if (!(parentFragment instanceof EducationOverviewFragment.Callbacks)) {
                    parentFragment = null;
                }
                EducationOverviewFragment.Callbacks callbacks = (EducationOverviewFragment.Callbacks) parentFragment;
                if (callbacks != null) {
                    return callbacks;
                }
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof EducationOverviewFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.binding = ViewBinding5.viewBinding(this, EducationOverviewFragment2.INSTANCE);
        this.duxo = OldDuxos.oldDuxo(this, EducationOverviewDuxo.class);
        this.screenName = "LEARNING_LESSON_SELECTOR";
        this.listAdapter = new EducationOverviewFragment3(this, EducationOverviewItemView.INSTANCE, DiffCallbacks.INSTANCE.byEquality(new PropertyReference1Impl() { // from class: com.robinhood.shared.education.ui.overview.EducationOverviewFragment$listAdapter$2
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((EducationLessonPreview) obj).getSysId();
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final FragmentEducationOverviewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[1]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentEducationOverviewBinding) value;
    }

    private final EducationOverviewDuxo getDuxo() {
        return (EducationOverviewDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenName() {
        return this.screenName;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getEntityId() {
        return ((LegacyIntentKey.EducationOverview) INSTANCE.getArgs((Fragment) this)).getContentfulResourceId();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.listAdapter.registerAdapterDataObserver(new RecyclerView.AdapterDataObserver() { // from class: com.robinhood.shared.education.ui.overview.EducationOverviewFragment.onCreate.1
            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeChanged(int positionStart, int itemCount) {
                VisibleItemsManager visibleItemsManager = EducationOverviewFragment.this.visibleItemsManager;
                if (visibleItemsManager == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("visibleItemsManager");
                    visibleItemsManager = null;
                }
                visibleItemsManager.update();
            }
        });
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        RecyclerView recyclerView = getBinding().learningModuleListRecyclerView;
        recyclerView.setAdapter(this.listAdapter);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        Intrinsics.checkNotNull(layoutManager);
        this.visibleItemsManager = new VisibleItemsManager<>(layoutManager, new Function0() { // from class: com.robinhood.shared.education.ui.overview.EducationOverviewFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(EducationOverviewFragment.onViewCreated$lambda$3$lambda$0(this.f$0));
            }
        }, new Function1() { // from class: com.robinhood.shared.education.ui.overview.EducationOverviewFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EducationOverviewFragment.onViewCreated$lambda$3$lambda$1(this.f$0, ((Integer) obj).intValue());
            }
        }, new PropertyReference1Impl() { // from class: com.robinhood.shared.education.ui.overview.EducationOverviewFragment$onViewCreated$1$3
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((EducationLessonPreview) obj).getSysId();
            }
        });
        Intrinsics.checkNotNull(recyclerView);
        LifecycleHost.DefaultImpls.bind$default(this, RxRecyclerView.scrollEvents(recyclerView), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.education.ui.overview.EducationOverviewFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EducationOverviewFragment.onViewCreated$lambda$3$lambda$2(this.f$0, (RecyclerViewScrollEvent) obj);
            }
        });
        VisibleItemsManager<String, EducationLessonPreview> visibleItemsManager = this.visibleItemsManager;
        if (visibleItemsManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("visibleItemsManager");
            visibleItemsManager = null;
        }
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(visibleItemsManager.getItemAppearances()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.education.ui.overview.EducationOverviewFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EducationOverviewFragment.onViewCreated$lambda$4(this.f$0, (EducationLessonPreview) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int onViewCreated$lambda$3$lambda$0(EducationOverviewFragment educationOverviewFragment) {
        return educationOverviewFragment.listAdapter.getSize();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EducationLessonPreview onViewCreated$lambda$3$lambda$1(EducationOverviewFragment educationOverviewFragment, int i) {
        return educationOverviewFragment.listAdapter.getItem(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3$lambda$2(EducationOverviewFragment educationOverviewFragment, RecyclerViewScrollEvent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        VisibleItemsManager<String, EducationLessonPreview> visibleItemsManager = educationOverviewFragment.visibleItemsManager;
        if (visibleItemsManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("visibleItemsManager");
            visibleItemsManager = null;
        }
        visibleItemsManager.update();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$4(EducationOverviewFragment educationOverviewFragment, EducationLessonPreview item) {
        Intrinsics.checkNotNullParameter(item, "item");
        educationOverviewFragment.getCallbacks().onEducationLessonAppear(item, educationOverviewFragment.listAdapter.getCurrentList().indexOf(item));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        VisibleItemsManager<String, EducationLessonPreview> visibleItemsManager = this.visibleItemsManager;
        if (visibleItemsManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("visibleItemsManager");
            visibleItemsManager = null;
        }
        visibleItemsManager.update();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C389191(this));
    }

    /* compiled from: EducationOverviewFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.education.ui.overview.EducationOverviewFragment$onStart$1 */
    /* synthetic */ class C389191 extends FunctionReferenceImpl implements Function1<EducationOverviewViewState, Unit> {
        C389191(Object obj) {
            super(1, obj, EducationOverviewFragment.class, "setViewState", "setViewState(Lcom/robinhood/shared/education/ui/overview/EducationOverviewViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(EducationOverviewViewState educationOverviewViewState) {
            invoke2(educationOverviewViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(EducationOverviewViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((EducationOverviewFragment) this.receiver).setViewState(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        VisibleItemsManager<String, EducationLessonPreview> visibleItemsManager = this.visibleItemsManager;
        if (visibleItemsManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("visibleItemsManager");
            visibleItemsManager = null;
        }
        visibleItemsManager.clear();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        super.onDialogDismissed(id);
        if (id == C38790R.id.dialog_error_education_overview) {
            getCallbacks().onLoadEducationOverviewFailed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setViewState(EducationOverviewViewState viewState) {
        RhToolbar rhToolbar = getRhToolbar();
        if (rhToolbar != null) {
            rhToolbar.setTitle(viewState.getTitle());
        }
        RhToolbar rhToolbar2 = getRhToolbar();
        if (rhToolbar2 != null) {
            rhToolbar2.setLoadingViewVisible(viewState.getIsLoading());
        }
        UiEvent<Unit> failure = viewState.getFailure();
        if ((failure != null ? failure.consume() : null) != null) {
            RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            RhDialogFragment.Builder message = companion.create(contextRequireContext).setId(C38790R.id.dialog_error_education_overview).setTitle(C11048R.string.error_title, new Object[0]).setMessage(C11048R.string.error_description, new Object[0]);
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            RhDialogFragment.Builder.show$default(message, childFragmentManager, TAG_ERROR, false, 4, null);
        }
        List<EducationLessonPreview> lessons = viewState.getLessons();
        if (lessons != null) {
            this.listAdapter.submitList(lessons);
        }
    }

    /* compiled from: EducationOverviewFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/overview/EducationOverviewFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/shared/education/ui/overview/EducationOverviewFragment;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$EducationOverview;", "<init>", "()V", "TAG_ERROR", "", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<EducationOverviewFragment, LegacyIntentKey.EducationOverview> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyIntentKey.EducationOverview getArgs(EducationOverviewFragment educationOverviewFragment) {
            return (LegacyIntentKey.EducationOverview) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, educationOverviewFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public EducationOverviewFragment newInstance(LegacyIntentKey.EducationOverview educationOverview) {
            return (EducationOverviewFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, educationOverview);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(EducationOverviewFragment educationOverviewFragment, LegacyIntentKey.EducationOverview educationOverview) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, educationOverviewFragment, educationOverview);
        }
    }
}
