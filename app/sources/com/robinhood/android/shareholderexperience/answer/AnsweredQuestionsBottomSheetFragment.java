package com.robinhood.android.shareholderexperience.answer;

import android.app.Dialog;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R$id;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.jakewharton.rxbinding3.recyclerview.RecyclerViewScrollEvent;
import com.jakewharton.rxbinding3.recyclerview.RxRecyclerView;
import com.jakewharton.rxbinding3.view.RxView;
import com.jakewharton.rxbinding3.view.ViewLayoutChangeEvent;
import com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.shareholder.view.UtilsKt;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.designsystem.pog.RdsPogView;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.rhimage.ImageLoader;
import com.robinhood.android.shareholderexperience.C28477R;
import com.robinhood.android.shareholderexperience.UtilKt;
import com.robinhood.android.shareholderexperience.answer.AnswerListAdapter;
import com.robinhood.android.shareholderexperience.databinding.FragmentAnsweredQuestionsBottomSheetBinding;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.shareholderx.models.p401db.CompanyIcon;
import com.robinhood.shareholderx.models.p401db.QaEventMetadata;
import com.robinhood.shareholderx.models.p401db.ShareholderQuestion;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ResourceTypes;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Observables;
import io.reactivex.subjects.BehaviorSubject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
import okhttp3.HttpUrl;

/* compiled from: AnsweredQuestionsBottomSheetFragment.kt */
@Metadata(m3635d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 62\u00020\u00012\u00020\u0002:\u000256B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u001a\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010%\u001a\u00020 H\u0016J\b\u0010&\u001a\u00020 H\u0016J\b\u0010'\u001a\u00020 H\u0016J\u0012\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010*\u001a\u00020\"H\u0002J\u0010\u0010+\u001a\u00020 2\u0006\u0010,\u001a\u00020-H\u0002J\u0018\u0010.\u001a\u00020 2\u0006\u0010/\u001a\u00020\u001b2\u0006\u00100\u001a\u000201H\u0002J\u0010\u00102\u001a\u00020 2\u0006\u00103\u001a\u000204H\u0002R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0019\u001a\u0010\u0012\f\u0012\n \u001c*\u0004\u0018\u00010\u001b0\u001b0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00067"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/answer/AnsweredQuestionsBottomSheetFragment;", "Lcom/robinhood/android/common/ui/BaseBottomSheetDialogFragment;", "Lcom/robinhood/android/shareholderexperience/answer/AnswerListAdapter$Callbacks;", "<init>", "()V", "imageLoader", "Lcom/robinhood/android/rhimage/ImageLoader;", "getImageLoader", "()Lcom/robinhood/android/rhimage/ImageLoader;", "setImageLoader", "(Lcom/robinhood/android/rhimage/ImageLoader;)V", "adapter", "Lcom/robinhood/android/shareholderexperience/answer/AnswerListAdapter;", "duxo", "Lcom/robinhood/android/shareholderexperience/answer/AnsweredQuestionsDuxo;", "getDuxo", "()Lcom/robinhood/android/shareholderexperience/answer/AnsweredQuestionsDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/shareholderexperience/databinding/FragmentAnsweredQuestionsBottomSheetBinding;", "getBinding", "()Lcom/robinhood/android/shareholderexperience/databinding/FragmentAnsweredQuestionsBottomSheetBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "headerPublisher", "Lio/reactivex/subjects/BehaviorSubject;", "Lcom/robinhood/shareholderx/models/db/QaEventMetadata$Header;", "kotlin.jvm.PlatformType", "getTheme", "", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onDoneClicked", "onNextQuestionClicked", "createMaterialShapeDrawable", "Lcom/google/android/material/shape/MaterialShapeDrawable;", "bottomSheet", "bind", "viewState", "Lcom/robinhood/android/shareholderexperience/answer/AnsweredQuestionsViewState;", "bindIcon", "header", ResourceTypes.STYLE, "Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "bindPog", "text", "", "Args", "Companion", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class AnsweredQuestionsBottomSheetFragment extends BaseBottomSheetDialogFragment implements AnswerListAdapter.Callbacks {
    private final AnswerListAdapter adapter;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final BehaviorSubject<QaEventMetadata.Header> headerPublisher;
    public ImageLoader imageLoader;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AnsweredQuestionsBottomSheetFragment.class, "binding", "getBinding()Lcom/robinhood/android/shareholderexperience/databinding/FragmentAnsweredQuestionsBottomSheetBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public AnsweredQuestionsBottomSheetFragment() {
        super(C28477R.layout.fragment_answered_questions_bottom_sheet);
        this.adapter = new AnswerListAdapter(this);
        this.duxo = OldDuxos.oldDuxo(this, AnsweredQuestionsDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, AnsweredQuestionsBottomSheetFragment2.INSTANCE);
        BehaviorSubject<QaEventMetadata.Header> behaviorSubjectCreate = BehaviorSubject.create();
        Intrinsics.checkNotNullExpressionValue(behaviorSubjectCreate, "create(...)");
        this.headerPublisher = behaviorSubjectCreate;
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

    private final AnsweredQuestionsDuxo getDuxo() {
        return (AnsweredQuestionsDuxo) this.duxo.getValue();
    }

    private final FragmentAnsweredQuestionsBottomSheetBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentAnsweredQuestionsBottomSheetBinding) value;
    }

    @Override // androidx.fragment.app.DialogFragment
    /* renamed from: getTheme */
    public int getThemeResId() {
        return C28477R.style.AnsweredQuestionsBottomSheetDialog;
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(final View view, Bundle savedInstanceState) {
        ViewGroup.LayoutParams layoutParams;
        BottomSheetBehavior<FrameLayout> behavior;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ImageButton answerSheetCloseButton = getBinding().answerSheetCloseButton;
        Intrinsics.checkNotNullExpressionValue(answerSheetCloseButton, "answerSheetCloseButton");
        OnClickListeners.onClick(answerSheetCloseButton, new C284821(this));
        getBinding().answerSheetRecyclerView.setAdapter(this.adapter);
        Dialog dialog = getDialog();
        BottomSheetDialog bottomSheetDialog = dialog instanceof BottomSheetDialog ? (BottomSheetDialog) dialog : null;
        if (bottomSheetDialog != null && (behavior = bottomSheetDialog.getBehavior()) != null) {
            behavior.setDraggable(false);
        }
        Dialog dialog2 = getDialog();
        final View viewFindViewById = dialog2 != null ? dialog2.findViewById(R$id.design_bottom_sheet) : null;
        if (viewFindViewById != null && (layoutParams = viewFindViewById.getLayoutParams()) != null) {
            layoutParams.height = -1;
        }
        view.post(new Runnable() { // from class: com.robinhood.android.shareholderexperience.answer.AnsweredQuestionsBottomSheetFragment.onViewCreated.2
            @Override // java.lang.Runnable
            public final void run() {
                Object parent = view.getParent();
                Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.View");
                ViewGroup.LayoutParams layoutParams2 = ((View) parent).getLayoutParams();
                Intrinsics.checkNotNull(layoutParams2, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
                CoordinatorLayout.Behavior behavior2 = ((CoordinatorLayout.LayoutParams) layoutParams2).getBehavior();
                Intrinsics.checkNotNull(behavior2, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetBehavior<@[FlexibleNullability] android.view.View?>");
                ((BottomSheetBehavior) behavior2).setPeekHeight(view.getMeasuredHeight());
                View view2 = viewFindViewById;
                if (view2 != null) {
                    MaterialShapeDrawable materialShapeDrawableCreateMaterialShapeDrawable = this.createMaterialShapeDrawable(view2);
                    if (materialShapeDrawableCreateMaterialShapeDrawable != null) {
                        viewFindViewById.setBackground(materialShapeDrawableCreateMaterialShapeDrawable);
                    }
                    Object parent2 = viewFindViewById.getParent();
                    View view3 = parent2 instanceof View ? (View) parent2 : null;
                    if (view3 != null) {
                        view3.setBackgroundColor(0);
                    }
                }
            }
        });
        final ConstraintLayout root = getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        if (root.isAttachedToWindow()) {
            Observables observables = Observables.INSTANCE;
            Observable<DayNightOverlay> dayNightStyleChanges = Fragments2.getBaseActivity(this).getDayNightStyleChanges();
            ObservableSource observableSourceDistinctUntilChanged = this.headerPublisher.distinctUntilChanged();
            Intrinsics.checkNotNullExpressionValue(observableSourceDistinctUntilChanged, "distinctUntilChanged(...)");
            LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observables.combineLatest(dayNightStyleChanges, observableSourceDistinctUntilChanged)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new AnsweredQuestionsBottomSheetFragment3(this));
        } else {
            root.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.robinhood.android.shareholderexperience.answer.AnsweredQuestionsBottomSheetFragment$onViewCreated$$inlined$doOnAttach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view2) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view2) {
                    root.removeOnAttachStateChangeListener(this);
                    AnsweredQuestionsBottomSheetFragment answeredQuestionsBottomSheetFragment = this;
                    Observables observables2 = Observables.INSTANCE;
                    Observable<DayNightOverlay> dayNightStyleChanges2 = Fragments2.getBaseActivity(answeredQuestionsBottomSheetFragment).getDayNightStyleChanges();
                    ObservableSource observableSourceDistinctUntilChanged2 = this.headerPublisher.distinctUntilChanged();
                    Intrinsics.checkNotNullExpressionValue(observableSourceDistinctUntilChanged2, "distinctUntilChanged(...)");
                    LifecycleHost.DefaultImpls.bind$default(answeredQuestionsBottomSheetFragment, ObservablesAndroid.observeOnMainThread(observables2.combineLatest(dayNightStyleChanges2, observableSourceDistinctUntilChanged2)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new AnsweredQuestionsBottomSheetFragment3(this));
                }
            });
        }
        RecyclerView answerSheetRecyclerView = getBinding().answerSheetRecyclerView;
        Intrinsics.checkNotNullExpressionValue(answerSheetRecyclerView, "answerSheetRecyclerView");
        Observable<R> map = RxView.layoutChangeEvents(answerSheetRecyclerView).map(new Function() { // from class: com.robinhood.android.shareholderexperience.answer.AnsweredQuestionsBottomSheetFragment.onViewCreated.4
            @Override // io.reactivex.functions.Function
            public final View apply(ViewLayoutChangeEvent it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getView();
            }
        });
        RecyclerView answerSheetRecyclerView2 = getBinding().answerSheetRecyclerView;
        Intrinsics.checkNotNullExpressionValue(answerSheetRecyclerView2, "answerSheetRecyclerView");
        Observable observableMergeWith = map.mergeWith((ObservableSource<? extends R>) RxRecyclerView.scrollEvents(answerSheetRecyclerView2).map(new Function() { // from class: com.robinhood.android.shareholderexperience.answer.AnsweredQuestionsBottomSheetFragment.onViewCreated.5
            @Override // io.reactivex.functions.Function
            public final RecyclerView apply(RecyclerViewScrollEvent it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getView();
            }
        }));
        Intrinsics.checkNotNullExpressionValue(observableMergeWith, "mergeWith(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableMergeWith), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.shareholderexperience.answer.AnsweredQuestionsBottomSheetFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AnsweredQuestionsBottomSheetFragment.onViewCreated$lambda$1(this.f$0, (View) obj);
            }
        });
    }

    /* compiled from: AnsweredQuestionsBottomSheetFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.shareholderexperience.answer.AnsweredQuestionsBottomSheetFragment$onViewCreated$1 */
    /* synthetic */ class C284821 extends FunctionReferenceImpl implements Function0<Unit> {
        C284821(Object obj) {
            super(0, obj, AnsweredQuestionsBottomSheetFragment.class, "dismiss", "dismiss()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((AnsweredQuestionsBottomSheetFragment) this.receiver).dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(AnsweredQuestionsBottomSheetFragment answeredQuestionsBottomSheetFragment, View view) {
        View answerSheetBottomShadow = answeredQuestionsBottomSheetFragment.getBinding().answerSheetBottomShadow;
        Intrinsics.checkNotNullExpressionValue(answerSheetBottomShadow, "answerSheetBottomShadow");
        answerSheetBottomShadow.setVisibility(view.canScrollVertically(1) ? 0 : 8);
        View answerSheetTopShadow = answeredQuestionsBottomSheetFragment.getBinding().answerSheetTopShadow;
        Intrinsics.checkNotNullExpressionValue(answerSheetTopShadow, "answerSheetTopShadow");
        answerSheetTopShadow.setVisibility(view.canScrollVertically(-1) ? 0 : 8);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C284811(this));
    }

    /* compiled from: AnsweredQuestionsBottomSheetFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.shareholderexperience.answer.AnsweredQuestionsBottomSheetFragment$onStart$1 */
    /* synthetic */ class C284811 extends FunctionReferenceImpl implements Function1<AnsweredQuestionsViewState, Unit> {
        C284811(Object obj) {
            super(1, obj, AnsweredQuestionsBottomSheetFragment.class, "bind", "bind(Lcom/robinhood/android/shareholderexperience/answer/AnsweredQuestionsViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AnsweredQuestionsViewState answeredQuestionsViewState) {
            invoke2(answeredQuestionsViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AnsweredQuestionsViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((AnsweredQuestionsBottomSheetFragment) this.receiver).bind(p0);
        }
    }

    @Override // com.robinhood.android.shareholderexperience.answer.AnswerListAdapter.Callbacks
    public void onDoneClicked() {
        dismiss();
    }

    @Override // com.robinhood.android.shareholderexperience.answer.AnswerListAdapter.Callbacks
    public void onNextQuestionClicked() {
        getDuxo().activateNextQuestion();
        getBinding().answerSheetRecyclerView.smoothScrollToPosition(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MaterialShapeDrawable createMaterialShapeDrawable(View bottomSheet) {
        ShapeAppearanceModel shapeAppearanceModelBuild = ShapeAppearanceModel.builder(getContext(), 0, C28477R.style.CustomShapeAppearanceAnsweredQuestionsBottomSheetDialog).build();
        Intrinsics.checkNotNullExpressionValue(shapeAppearanceModelBuild, "build(...)");
        Drawable background = bottomSheet.getBackground();
        MaterialShapeDrawable materialShapeDrawable = background instanceof MaterialShapeDrawable ? (MaterialShapeDrawable) background : null;
        if (materialShapeDrawable == null) {
            return null;
        }
        MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable(shapeAppearanceModelBuild);
        materialShapeDrawable2.initializeElevationOverlay(getContext());
        materialShapeDrawable2.setFillColor(materialShapeDrawable.getFillColor());
        materialShapeDrawable2.setTintList(materialShapeDrawable.getTintList());
        materialShapeDrawable2.setElevation(materialShapeDrawable.getElevation());
        materialShapeDrawable2.setStrokeWidth(materialShapeDrawable.getStrokeWidth());
        materialShapeDrawable2.setStrokeColor(materialShapeDrawable.getStrokeColor());
        return materialShapeDrawable2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(AnsweredQuestionsViewState viewState) {
        FragmentAnsweredQuestionsBottomSheetBinding binding = getBinding();
        this.headerPublisher.onNext(viewState.getMetadata().getHeader());
        binding.answerSheetTitle.setText(viewState.getTitle());
        final String shareCopy = viewState.getActiveQuestion().getShareCopy();
        binding.answerSheetShareButton.setVisibility(shareCopy != null ? 0 : 4);
        ImageButton answerSheetShareButton = binding.answerSheetShareButton;
        Intrinsics.checkNotNullExpressionValue(answerSheetShareButton, "answerSheetShareButton");
        OnClickListeners.onClick(answerSheetShareButton, new Function0() { // from class: com.robinhood.android.shareholderexperience.answer.AnsweredQuestionsBottomSheetFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AnsweredQuestionsBottomSheetFragment.bind$lambda$3$lambda$2(shareCopy, this);
            }
        });
        this.adapter.submitList(viewState.getItems());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$3$lambda$2(String str, AnsweredQuestionsBottomSheetFragment answeredQuestionsBottomSheetFragment) {
        if (str != null) {
            UtilKt.share(answeredQuestionsBottomSheetFragment, str);
        }
        answeredQuestionsBottomSheetFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindIcon(final QaEventMetadata.Header header, DayNightOverlay style) {
        RdsPogView answerSheetCompanyPog = getBinding().answerSheetCompanyPog;
        Intrinsics.checkNotNullExpressionValue(answerSheetCompanyPog, "answerSheetCompanyPog");
        answerSheetCompanyPog.setVisibility(8);
        CompanyIcon icon = header.getIcon();
        String themedUrl = icon != null ? UtilsKt.getThemedUrl(icon, style) : null;
        if (themedUrl == null) {
            bindPog(header.getSymbol());
            return;
        }
        ImageLoader.ImageRequest imageRequestCircle = getImageLoader().load(HttpUrl.INSTANCE.get(themedUrl)).circle();
        ImageView answerSheetCompanyLogo = getBinding().answerSheetCompanyLogo;
        Intrinsics.checkNotNullExpressionValue(answerSheetCompanyLogo, "answerSheetCompanyLogo");
        imageRequestCircle.into(answerSheetCompanyLogo, new Function0() { // from class: com.robinhood.android.shareholderexperience.answer.AnsweredQuestionsBottomSheetFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AnsweredQuestionsBottomSheetFragment.bindIcon$lambda$4(this.f$0);
            }
        }, new Function0() { // from class: com.robinhood.android.shareholderexperience.answer.AnsweredQuestionsBottomSheetFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AnsweredQuestionsBottomSheetFragment.bindIcon$lambda$5(this.f$0, header);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindIcon$lambda$4(AnsweredQuestionsBottomSheetFragment answeredQuestionsBottomSheetFragment) {
        RdsPogView answerSheetCompanyPog = answeredQuestionsBottomSheetFragment.getBinding().answerSheetCompanyPog;
        Intrinsics.checkNotNullExpressionValue(answerSheetCompanyPog, "answerSheetCompanyPog");
        answerSheetCompanyPog.setVisibility(8);
        ImageView answerSheetCompanyLogo = answeredQuestionsBottomSheetFragment.getBinding().answerSheetCompanyLogo;
        Intrinsics.checkNotNullExpressionValue(answerSheetCompanyLogo, "answerSheetCompanyLogo");
        answerSheetCompanyLogo.setVisibility(0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindIcon$lambda$5(AnsweredQuestionsBottomSheetFragment answeredQuestionsBottomSheetFragment, QaEventMetadata.Header header) {
        answeredQuestionsBottomSheetFragment.bindPog(header.getSymbol());
        return Unit.INSTANCE;
    }

    private final void bindPog(String text) {
        FragmentAnsweredQuestionsBottomSheetBinding binding = getBinding();
        ImageView answerSheetCompanyLogo = binding.answerSheetCompanyLogo;
        Intrinsics.checkNotNullExpressionValue(answerSheetCompanyLogo, "answerSheetCompanyLogo");
        answerSheetCompanyLogo.setVisibility(8);
        RdsPogView answerSheetCompanyPog = binding.answerSheetCompanyPog;
        Intrinsics.checkNotNullExpressionValue(answerSheetCompanyPog, "answerSheetCompanyPog");
        answerSheetCompanyPog.setVisibility(0);
        binding.answerSheetCompanyPog.setText(text);
    }

    /* compiled from: AnsweredQuestionsBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/answer/AnsweredQuestionsBottomSheetFragment$Args;", "Landroid/os/Parcelable;", "metadata", "Lcom/robinhood/shareholderx/models/db/QaEventMetadata;", "questions", "", "Lcom/robinhood/shareholderx/models/db/ShareholderQuestion;", "activeQuestion", "<init>", "(Lcom/robinhood/shareholderx/models/db/QaEventMetadata;Ljava/util/List;Lcom/robinhood/shareholderx/models/db/ShareholderQuestion;)V", "getMetadata", "()Lcom/robinhood/shareholderx/models/db/QaEventMetadata;", "getQuestions", "()Ljava/util/List;", "getActiveQuestion", "()Lcom/robinhood/shareholderx/models/db/ShareholderQuestion;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final ShareholderQuestion activeQuestion;
        private final QaEventMetadata metadata;
        private final List<ShareholderQuestion> questions;

        /* compiled from: AnsweredQuestionsBottomSheetFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                QaEventMetadata qaEventMetadata = (QaEventMetadata) parcel.readParcelable(Args.class.getClassLoader());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(Args.class.getClassLoader()));
                }
                return new Args(qaEventMetadata, arrayList, (ShareholderQuestion) parcel.readParcelable(Args.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Args copy$default(Args args, QaEventMetadata qaEventMetadata, List list, ShareholderQuestion shareholderQuestion, int i, Object obj) {
            if ((i & 1) != 0) {
                qaEventMetadata = args.metadata;
            }
            if ((i & 2) != 0) {
                list = args.questions;
            }
            if ((i & 4) != 0) {
                shareholderQuestion = args.activeQuestion;
            }
            return args.copy(qaEventMetadata, list, shareholderQuestion);
        }

        /* renamed from: component1, reason: from getter */
        public final QaEventMetadata getMetadata() {
            return this.metadata;
        }

        public final List<ShareholderQuestion> component2() {
            return this.questions;
        }

        /* renamed from: component3, reason: from getter */
        public final ShareholderQuestion getActiveQuestion() {
            return this.activeQuestion;
        }

        public final Args copy(QaEventMetadata metadata, List<ShareholderQuestion> questions, ShareholderQuestion activeQuestion) {
            Intrinsics.checkNotNullParameter(metadata, "metadata");
            Intrinsics.checkNotNullParameter(questions, "questions");
            Intrinsics.checkNotNullParameter(activeQuestion, "activeQuestion");
            return new Args(metadata, questions, activeQuestion);
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
            return Intrinsics.areEqual(this.metadata, args.metadata) && Intrinsics.areEqual(this.questions, args.questions) && Intrinsics.areEqual(this.activeQuestion, args.activeQuestion);
        }

        public int hashCode() {
            return (((this.metadata.hashCode() * 31) + this.questions.hashCode()) * 31) + this.activeQuestion.hashCode();
        }

        public String toString() {
            return "Args(metadata=" + this.metadata + ", questions=" + this.questions + ", activeQuestion=" + this.activeQuestion + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.metadata, flags);
            List<ShareholderQuestion> list = this.questions;
            dest.writeInt(list.size());
            Iterator<ShareholderQuestion> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            dest.writeParcelable(this.activeQuestion, flags);
        }

        public Args(QaEventMetadata metadata, List<ShareholderQuestion> questions, ShareholderQuestion activeQuestion) {
            Intrinsics.checkNotNullParameter(metadata, "metadata");
            Intrinsics.checkNotNullParameter(questions, "questions");
            Intrinsics.checkNotNullParameter(activeQuestion, "activeQuestion");
            this.metadata = metadata;
            this.questions = questions;
            this.activeQuestion = activeQuestion;
        }

        public final QaEventMetadata getMetadata() {
            return this.metadata;
        }

        public final List<ShareholderQuestion> getQuestions() {
            return this.questions;
        }

        public final ShareholderQuestion getActiveQuestion() {
            return this.activeQuestion;
        }
    }

    /* compiled from: AnsweredQuestionsBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/answer/AnsweredQuestionsBottomSheetFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/shareholderexperience/answer/AnsweredQuestionsBottomSheetFragment;", "Lcom/robinhood/android/shareholderexperience/answer/AnsweredQuestionsBottomSheetFragment$Args;", "<init>", "()V", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<AnsweredQuestionsBottomSheetFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(AnsweredQuestionsBottomSheetFragment answeredQuestionsBottomSheetFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, answeredQuestionsBottomSheetFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AnsweredQuestionsBottomSheetFragment newInstance(Args args) {
            return (AnsweredQuestionsBottomSheetFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AnsweredQuestionsBottomSheetFragment answeredQuestionsBottomSheetFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, answeredQuestionsBottomSheetFragment, args);
        }
    }
}
