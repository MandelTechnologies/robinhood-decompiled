package com.robinhood.android.history.p153ui.transaction;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.history.p082ui.format.TransactionLineItem;
import com.robinhood.android.common.history.p082ui.format.TransactionSummary;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.transition.ToolbarScrollAnimator;
import com.robinhood.android.designsystem.row.RdsDataRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.font.CustomTypefaceSpan;
import com.robinhood.android.font.RhTypeface;
import com.robinhood.android.history.C18359R;
import com.robinhood.android.history.contracts.McDucklingTransactionFragmentKey;
import com.robinhood.android.history.databinding.FragmentTransactionDetailBinding;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.scarlet.util.resource.ResourceReferences5;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.color.ThemeColors;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import kotlin.ExceptionsH;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
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

/* compiled from: TransactionDetailFragment.kt */
@Metadata(m3635d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\b\u0007\u0018\u0000 >2\u00020\u0001:\u0001>B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0016J\u001a\u0010-\u001a\u00020*2\u0006\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101H\u0016J\u0010\u00102\u001a\u00020*2\u0006\u00103\u001a\u000204H\u0016J\u0012\u00105\u001a\u00020*2\b\u00100\u001a\u0004\u0018\u000101H\u0016J\b\u00106\u001a\u00020*H\u0016J\u0010\u00107\u001a\u00020*2\u0006\u00108\u001a\u000209H\u0002J\u0018\u0010:\u001a\u00020*2\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020<H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\t\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\t\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\t\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0 X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010#\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020$X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b(\u0010&¨\u0006?"}, m3636d2 = {"Lcom/robinhood/android/history/ui/transaction/TransactionDetailFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/android/history/ui/transaction/TransactionDetailDuxo;", "getDuxo", "()Lcom/robinhood/android/history/ui/transaction/TransactionDetailDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/history/databinding/FragmentTransactionDetailBinding;", "getBinding", "()Lcom/robinhood/android/history/databinding/FragmentTransactionDetailBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "toolbarScrollAnimator", "Lcom/robinhood/android/common/util/transition/ToolbarScrollAnimator;", "getToolbarScrollAnimator", "()Lcom/robinhood/android/common/util/transition/ToolbarScrollAnimator;", "toolbarScrollAnimator$delegate", "negativeColor", "", "getNegativeColor", "()I", "negativeColor$delegate", "boldTypeface", "Landroid/graphics/Typeface;", "getBoldTypeface", "()Landroid/graphics/Typeface;", "boldTypeface$delegate", "lineItemAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/designsystem/row/RdsDataRowView;", "Lcom/robinhood/android/common/history/ui/format/TransactionLineItem;", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "hasBottomBar", "getHasBottomBar", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onCreate", "onResume", "bind", "state", "Lcom/robinhood/android/history/ui/transaction/TransactionDetailState;", "showDescriptionDialog", "title", "", "message", "Companion", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class TransactionDetailFragment extends BaseFragment {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: boldTypeface$delegate, reason: from kotlin metadata */
    private final Lazy boldTypeface;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final boolean hasBottomBar;
    private final GenericListAdapter<RdsDataRowView, TransactionLineItem> lineItemAdapter;

    /* renamed from: negativeColor$delegate, reason: from kotlin metadata */
    private final Lazy negativeColor;

    /* renamed from: toolbarScrollAnimator$delegate, reason: from kotlin metadata */
    private final Lazy toolbarScrollAnimator;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(TransactionDetailFragment.class, "binding", "getBinding()Lcom/robinhood/android/history/databinding/FragmentTransactionDetailBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return true;
    }

    public TransactionDetailFragment() {
        super(C18359R.layout.fragment_transaction_detail);
        this.duxo = DuxosKt.duxo(this, TransactionDetailDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, TransactionDetailFragment2.INSTANCE);
        this.toolbarScrollAnimator = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0() { // from class: com.robinhood.android.history.ui.transaction.TransactionDetailFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransactionDetailFragment.toolbarScrollAnimator_delegate$lambda$0(this.f$0);
            }
        });
        this.negativeColor = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.history.ui.transaction.TransactionDetailFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(TransactionDetailFragment.negativeColor_delegate$lambda$1(this.f$0));
            }
        });
        this.boldTypeface = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.history.ui.transaction.TransactionDetailFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransactionDetailFragment.boldTypeface_delegate$lambda$2(this.f$0);
            }
        });
        this.lineItemAdapter = GenericListAdapter.INSTANCE.m2987of(RdsDataRowView.INSTANCE, DiffCallbacks.INSTANCE.byEquality(new PropertyReference1Impl() { // from class: com.robinhood.android.history.ui.transaction.TransactionDetailFragment$lineItemAdapter$1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((TransactionLineItem) obj).getTitle();
            }
        }), new Function2() { // from class: com.robinhood.android.history.ui.transaction.TransactionDetailFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return TransactionDetailFragment.lineItemAdapter$lambda$7(this.f$0, (RdsDataRowView) obj, (TransactionLineItem) obj2);
            }
        });
        this.hasBottomBar = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TransactionDetailDuxo getDuxo() {
        return (TransactionDetailDuxo) this.duxo.getValue();
    }

    private final FragmentTransactionDetailBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentTransactionDetailBinding) value;
    }

    private final ToolbarScrollAnimator getToolbarScrollAnimator() {
        return (ToolbarScrollAnimator) this.toolbarScrollAnimator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ToolbarScrollAnimator toolbarScrollAnimator_delegate$lambda$0(TransactionDetailFragment transactionDetailFragment) throws Resources.NotFoundException {
        float dimension = transactionDetailFragment.getResources().getDimension(C11048R.dimen.toolbar_scroll_height);
        RhToolbar rhToolbar = transactionDetailFragment.getRhToolbar();
        Intrinsics.checkNotNull(rhToolbar);
        return new ToolbarScrollAnimator(rhToolbar, dimension, false, false, false, (Float) null, 60, (DefaultConstructorMarker) null);
    }

    private final int getNegativeColor() {
        return ((Number) this.negativeColor.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int negativeColor_delegate$lambda$1(TransactionDetailFragment transactionDetailFragment) {
        Context contextRequireContext = transactionDetailFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        return ThemeColors.getThemeColor(contextRequireContext, C20690R.attr.colorNegative);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Typeface boldTypeface_delegate$lambda$2(TransactionDetailFragment transactionDetailFragment) {
        RhTypeface rhTypeface = RhTypeface.BOLD;
        Context contextRequireContext = transactionDetailFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        return rhTypeface.load(contextRequireContext);
    }

    private final Typeface getBoldTypeface() {
        return (Typeface) this.boldTypeface.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lineItemAdapter$lambda$7(final TransactionDetailFragment transactionDetailFragment, RdsDataRowView of, final TransactionLineItem lineItem) {
        CharSequence detail;
        ColorStateList colorStateListResolve;
        ResourceReferences4<Integer> colorReference;
        ResourceReferences4<ColorStateList> colorStateList;
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(lineItem, "lineItem");
        of.setLabelText(lineItem.getTitle());
        if (lineItem.isNegativeItem()) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            Object[] objArr = {new CustomTypefaceSpan(transactionDetailFragment.getBoldTypeface()), new ForegroundColorSpan(transactionDetailFragment.getNegativeColor())};
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append(lineItem.getDetail());
            for (int i = 0; i < 2; i++) {
                spannableStringBuilder.setSpan(objArr[i], length, spannableStringBuilder.length(), 17);
            }
            detail = new SpannedString(spannableStringBuilder);
        } else {
            detail = lineItem.getDetail();
        }
        of.setValueText(detail);
        Integer detailIconResId = lineItem.getDetailIconResId();
        of.setValueIconRightDrawable(detailIconResId != null ? ViewsKt.getDrawable(of, detailIconResId.intValue()) : null);
        TransactionSummary.Tint detailIconTint = lineItem.getDetailIconTint();
        if (detailIconTint == null || (colorReference = detailIconTint.getColorReference()) == null || (colorStateList = ResourceReferences5.toColorStateList(colorReference)) == null) {
            colorStateListResolve = null;
        } else {
            Resources.Theme theme = of.getContext().getTheme();
            Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
            colorStateListResolve = colorStateList.resolve(theme);
        }
        of.setValueIconTint(colorStateListResolve);
        of.setDescriptionText(lineItem.getDescription());
        if (lineItem.getDialogContent() != null) {
            of.setClickable(true);
            OnClickListeners.onClick(of, new Function0() { // from class: com.robinhood.android.history.ui.transaction.TransactionDetailFragment$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TransactionDetailFragment.lineItemAdapter$lambda$7$lambda$6(this.f$0, lineItem);
                }
            });
        } else {
            of.setClickable(false);
            of.setOnClickListener(null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lineItemAdapter$lambda$7$lambda$6(TransactionDetailFragment transactionDetailFragment, TransactionLineItem transactionLineItem) {
        TransactionLineItem.DialogContent dialogContent = transactionLineItem.getDialogContent();
        Intrinsics.checkNotNull(dialogContent);
        String title = dialogContent.getTitle();
        TransactionLineItem.DialogContent dialogContent2 = transactionLineItem.getDialogContent();
        Intrinsics.checkNotNull(dialogContent2);
        transactionDetailFragment.showDescriptionDialog(title, dialogContent2.getMessage());
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getHasBottomBar() {
        return this.hasBottomBar;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ToolbarScrollAnimator toolbarScrollAnimator = getToolbarScrollAnimator();
        NestedScrollView transactionDetailScrollView = getBinding().transactionDetailScrollView;
        Intrinsics.checkNotNullExpressionValue(transactionDetailScrollView, "transactionDetailScrollView");
        toolbarScrollAnimator.subscribe(transactionDetailScrollView, this);
        getBinding().transactionDetailRecyclerView.setAdapter(this.lineItemAdapter);
        BaseFragment.collectDuxoState$default(this, null, new C184371(null), 1, null);
    }

    /* compiled from: TransactionDetailFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.history.ui.transaction.TransactionDetailFragment$onViewCreated$1", m3645f = "TransactionDetailFragment.kt", m3646l = {106}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.history.ui.transaction.TransactionDetailFragment$onViewCreated$1 */
    static final class C184371 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C184371(Continuation<? super C184371> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TransactionDetailFragment.this.new C184371(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C184371) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: TransactionDetailFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.history.ui.transaction.TransactionDetailFragment$onViewCreated$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ TransactionDetailFragment $tmp0;

            AnonymousClass1(TransactionDetailFragment transactionDetailFragment) {
                this.$tmp0 = transactionDetailFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, TransactionDetailFragment.class, "bind", "bind(Lcom/robinhood/android/history/ui/transaction/TransactionDetailState;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(TransactionDetailState transactionDetailState, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$bind = C184371.invokeSuspend$bind(this.$tmp0, transactionDetailState, continuation);
                return objInvokeSuspend$bind == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$bind : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((TransactionDetailState) obj, (Continuation<? super Unit>) continuation);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<TransactionDetailState> stateFlow = TransactionDetailFragment.this.getDuxo().getStateFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(TransactionDetailFragment.this);
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
        public static final /* synthetic */ Object invokeSuspend$bind(TransactionDetailFragment transactionDetailFragment, TransactionDetailState transactionDetailState, Continuation continuation) {
            transactionDetailFragment.bind(transactionDetailState);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setTitle((CharSequence) null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ToolbarScrollAnimator toolbarScrollAnimator = getToolbarScrollAnimator();
        NestedScrollView transactionDetailScrollView = getBinding().transactionDetailScrollView;
        Intrinsics.checkNotNullExpressionValue(transactionDetailScrollView, "transactionDetailScrollView");
        toolbarScrollAnimator.dispatchScroll(transactionDetailScrollView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(TransactionDetailState state) {
        FragmentTransactionDetailBinding binding = getBinding();
        TransactionOverview overview = state.getOverview();
        if (overview != null) {
            binding.transactionDetailAmount.setText(overview.getAmountText());
            binding.transactionDetailSubtitle.setText(overview.getTitleText());
            this.lineItemAdapter.submitList(overview.getLineItems());
        }
        RhTextView rhTextView = binding.transactionDetailFooter;
        Intrinsics.checkNotNull(rhTextView);
        rhTextView.setVisibility(state.getDetail() != null ? 0 : 8);
        rhTextView.setText(state.getDetail());
        ShimmerLoadingView shimmerLoadingView = binding.loadingView;
        if (state.isLoading()) {
            shimmerLoadingView.show();
        } else {
            shimmerLoadingView.hide();
        }
    }

    private final void showDescriptionDialog(CharSequence title, CharSequence message) {
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder id = companion.create(contextRequireContext).setUseDesignSystemOverlay(true).setTitle(title).setMessage(message).setPositiveButton(C11048R.string.general_label_close, new Object[0]).setId(C18359R.id.dialog_id_transaction_item_description);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        RhDialogFragment.Builder.show$default(id, childFragmentManager, "transactionLineItemDescriptionDialog", false, 4, null);
    }

    /* compiled from: TransactionDetailFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/history/ui/transaction/TransactionDetailFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/history/ui/transaction/TransactionDetailFragment;", "Lcom/robinhood/android/history/contracts/McDucklingTransactionFragmentKey;", "<init>", "()V", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<TransactionDetailFragment, McDucklingTransactionFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(McDucklingTransactionFragmentKey mcDucklingTransactionFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, mcDucklingTransactionFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public McDucklingTransactionFragmentKey getArgs(TransactionDetailFragment transactionDetailFragment) {
            return (McDucklingTransactionFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, transactionDetailFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public TransactionDetailFragment newInstance(McDucklingTransactionFragmentKey mcDucklingTransactionFragmentKey) {
            return (TransactionDetailFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, mcDucklingTransactionFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(TransactionDetailFragment transactionDetailFragment, McDucklingTransactionFragmentKey mcDucklingTransactionFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, transactionDetailFragment, mcDucklingTransactionFragmentKey);
        }
    }
}
