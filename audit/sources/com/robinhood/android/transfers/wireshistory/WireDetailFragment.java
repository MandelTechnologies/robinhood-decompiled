package com.robinhood.android.transfers.wireshistory;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.history.p082ui.format.TransactionLineItem;
import com.robinhood.android.common.history.p082ui.format.TransactionSummary;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BaseRhBottomSheetDialogHostFragment;
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
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.ActionHandlingFragment2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlertKt;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.transfers.contracts.WireDetailFragmentKey;
import com.robinhood.android.transfers.wireshistory.databinding.FragmentWireDetailBinding;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.scarlet.util.resource.ResourceReferences5;
import com.robinhood.transfers.api.ApiGracePeriodContent;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.color.ThemeColors;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import io.noties.markwon.Markwon;
import kotlin.ExceptionsH;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: WireDetailFragment.kt */
@Metadata(m3635d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0003\b\u0007\u0018\u0000 O2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001OB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u00101\u001a\u0002022\u0006\u00103\u001a\u000204H\u0016J\u001a\u00105\u001a\u0002022\u0006\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u000109H\u0016J\u0010\u0010:\u001a\u0002022\u0006\u0010;\u001a\u00020<H\u0016J\u0012\u0010=\u001a\u0002022\b\u00108\u001a\u0004\u0018\u000109H\u0016J\b\u0010>\u001a\u000202H\u0016J\u0010\u0010?\u001a\u0002022\u0006\u0010@\u001a\u00020AH\u0002J\u0010\u0010B\u001a\u0002022\u0006\u0010C\u001a\u00020DH\u0002J\u001b\u0010E\u001a\u0002022\f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00030GH\u0003¢\u0006\u0002\u0010HJ\u0010\u0010I\u001a\u00020,2\u0006\u0010J\u001a\u00020\u0003H\u0016J\u0018\u0010K\u001a\u0002022\u0006\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020MH\u0002R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0011\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0011\u001a\u0004\b\u001f\u0010 R\u001b\u0010\"\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u0011\u001a\u0004\b$\u0010%R\u001a\u0010'\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0(X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010+\u001a\u00020,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020,X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b0\u0010.¨\u0006P"}, m3636d2 = {"Lcom/robinhood/android/transfers/wireshistory/WireDetailFragment;", "Lcom/robinhood/android/common/ui/BaseRhBottomSheetDialogHostFragment;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "<init>", "()V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "duxo", "Lcom/robinhood/android/transfers/wireshistory/WireDetailDuxo;", "getDuxo", "()Lcom/robinhood/android/transfers/wireshistory/WireDetailDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/transfers/wireshistory/databinding/FragmentWireDetailBinding;", "getBinding", "()Lcom/robinhood/android/transfers/wireshistory/databinding/FragmentWireDetailBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "toolbarScrollAnimator", "Lcom/robinhood/android/common/util/transition/ToolbarScrollAnimator;", "getToolbarScrollAnimator", "()Lcom/robinhood/android/common/util/transition/ToolbarScrollAnimator;", "toolbarScrollAnimator$delegate", "negativeColor", "", "getNegativeColor", "()I", "negativeColor$delegate", "boldTypeface", "Landroid/graphics/Typeface;", "getBoldTypeface", "()Landroid/graphics/Typeface;", "boldTypeface$delegate", "lineItemAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/designsystem/row/RdsDataRowView;", "Lcom/robinhood/android/common/history/ui/format/TransactionLineItem;", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "hasBottomBar", "getHasBottomBar", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onCreate", "onResume", "bind", "state", "Lcom/robinhood/android/transfers/wireshistory/WireDetailState;", "setupGracePeriodContent", "gracePeriod", "Lcom/robinhood/transfers/api/ApiGracePeriodContent;", "GracePeriodContent", "component", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "(Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;Landroidx/compose/runtime/Composer;I)V", "handle", "action", "showDescriptionDialog", "title", "", "message", "Companion", "feature-wires-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class WireDetailFragment extends BaseRhBottomSheetDialogHostFragment implements SduiActionHandler<GenericAction> {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: boldTypeface$delegate, reason: from kotlin metadata */
    private final Lazy boldTypeface;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final boolean hasBottomBar;
    private final GenericListAdapter<RdsDataRowView, TransactionLineItem> lineItemAdapter;
    public Markwon markwon;

    /* renamed from: negativeColor$delegate, reason: from kotlin metadata */
    private final Lazy negativeColor;

    /* renamed from: toolbarScrollAnimator$delegate, reason: from kotlin metadata */
    private final Lazy toolbarScrollAnimator;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(WireDetailFragment.class, "binding", "getBinding()Lcom/robinhood/android/transfers/wireshistory/databinding/FragmentWireDetailBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GracePeriodContent$lambda$16(WireDetailFragment wireDetailFragment, UIComponent uIComponent, int i, Composer composer, int i2) {
        wireDetailFragment.GracePeriodContent(uIComponent, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return true;
    }

    public WireDetailFragment() {
        super(C31240R.layout.fragment_wire_detail);
        this.duxo = DuxosKt.duxo(this, WireDetailDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, WireDetailFragment2.INSTANCE);
        this.toolbarScrollAnimator = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0() { // from class: com.robinhood.android.transfers.wireshistory.WireDetailFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WireDetailFragment.toolbarScrollAnimator_delegate$lambda$0(this.f$0);
            }
        });
        this.negativeColor = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.transfers.wireshistory.WireDetailFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(WireDetailFragment.negativeColor_delegate$lambda$1(this.f$0));
            }
        });
        this.boldTypeface = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.transfers.wireshistory.WireDetailFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WireDetailFragment.boldTypeface_delegate$lambda$2(this.f$0);
            }
        });
        this.lineItemAdapter = GenericListAdapter.INSTANCE.m2987of(RdsDataRowView.INSTANCE, DiffCallbacks.INSTANCE.byEquality(new PropertyReference1Impl() { // from class: com.robinhood.android.transfers.wireshistory.WireDetailFragment$lineItemAdapter$1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((TransactionLineItem) obj).getTitle();
            }
        }), new Function2() { // from class: com.robinhood.android.transfers.wireshistory.WireDetailFragment$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return WireDetailFragment.lineItemAdapter$lambda$7(this.f$0, (RdsDataRowView) obj, (TransactionLineItem) obj2);
            }
        });
        this.hasBottomBar = true;
    }

    public final Markwon getMarkwon() {
        Markwon markwon = this.markwon;
        if (markwon != null) {
            return markwon;
        }
        Intrinsics.throwUninitializedPropertyAccessException("markwon");
        return null;
    }

    public final void setMarkwon(Markwon markwon) {
        Intrinsics.checkNotNullParameter(markwon, "<set-?>");
        this.markwon = markwon;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WireDetailDuxo getDuxo() {
        return (WireDetailDuxo) this.duxo.getValue();
    }

    private final FragmentWireDetailBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentWireDetailBinding) value;
    }

    private final ToolbarScrollAnimator getToolbarScrollAnimator() {
        return (ToolbarScrollAnimator) this.toolbarScrollAnimator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ToolbarScrollAnimator toolbarScrollAnimator_delegate$lambda$0(WireDetailFragment wireDetailFragment) throws Resources.NotFoundException {
        float dimension = wireDetailFragment.getResources().getDimension(C11048R.dimen.toolbar_scroll_height);
        RhToolbar rhToolbar = wireDetailFragment.getRhToolbar();
        if (rhToolbar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        return new ToolbarScrollAnimator(rhToolbar, dimension, false, false, false, (Float) null, 60, (DefaultConstructorMarker) null);
    }

    private final int getNegativeColor() {
        return ((Number) this.negativeColor.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int negativeColor_delegate$lambda$1(WireDetailFragment wireDetailFragment) {
        Context contextRequireContext = wireDetailFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        return ThemeColors.getThemeColor(contextRequireContext, C20690R.attr.colorNegative);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Typeface boldTypeface_delegate$lambda$2(WireDetailFragment wireDetailFragment) {
        RhTypeface rhTypeface = RhTypeface.BOLD;
        Context contextRequireContext = wireDetailFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        return rhTypeface.load(contextRequireContext);
    }

    private final Typeface getBoldTypeface() {
        return (Typeface) this.boldTypeface.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lineItemAdapter$lambda$7(final WireDetailFragment wireDetailFragment, RdsDataRowView of, TransactionLineItem lineItem) {
        CharSequence detail;
        ColorStateList colorStateListResolve;
        ResourceReferences4<Integer> colorReference;
        ResourceReferences4<ColorStateList> colorStateList;
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(lineItem, "lineItem");
        of.setLabelText(lineItem.getTitle());
        if (lineItem.isNegativeItem()) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            Object[] objArr = {new CustomTypefaceSpan(wireDetailFragment.getBoldTypeface()), new ForegroundColorSpan(wireDetailFragment.getNegativeColor())};
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
        final TransactionLineItem.DialogContent dialogContent = lineItem.getDialogContent();
        if (dialogContent != null) {
            of.setClickable(true);
            OnClickListeners.onClick(of, new Function0() { // from class: com.robinhood.android.transfers.wireshistory.WireDetailFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return WireDetailFragment.lineItemAdapter$lambda$7$lambda$6(this.f$0, dialogContent);
                }
            });
        } else {
            of.setClickable(false);
            of.setOnClickListener(null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lineItemAdapter$lambda$7$lambda$6(WireDetailFragment wireDetailFragment, TransactionLineItem.DialogContent dialogContent) {
        wireDetailFragment.showDescriptionDialog(dialogContent.getTitle(), dialogContent.getMessage());
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
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        ToolbarScrollAnimator toolbarScrollAnimator = getToolbarScrollAnimator();
        NestedScrollView transactionDetailScrollView = getBinding().transactionDetailScrollView;
        Intrinsics.checkNotNullExpressionValue(transactionDetailScrollView, "transactionDetailScrollView");
        toolbarScrollAnimator.subscribe(transactionDetailScrollView, this);
        getBinding().transactionDetailRecyclerView.setAdapter(this.lineItemAdapter);
        BaseFragment.collectDuxoState$default(this, null, new C312431(null), 1, null);
    }

    /* compiled from: WireDetailFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.wireshistory.WireDetailFragment$onViewCreated$1", m3645f = "WireDetailFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.wireshistory.WireDetailFragment$onViewCreated$1 */
    static final class C312431 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C312431(Continuation<? super C312431> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WireDetailFragment.this.new C312431(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C312431) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: WireDetailFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.transfers.wireshistory.WireDetailFragment$onViewCreated$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ WireDetailFragment $tmp0;

            AnonymousClass1(WireDetailFragment wireDetailFragment) {
                this.$tmp0 = wireDetailFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, WireDetailFragment.class, "bind", "bind(Lcom/robinhood/android/transfers/wireshistory/WireDetailState;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(WireDetailState wireDetailState, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$bind = C312431.invokeSuspend$bind(this.$tmp0, wireDetailState, continuation);
                return objInvokeSuspend$bind == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$bind : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((WireDetailState) obj, (Continuation<? super Unit>) continuation);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<WireDetailState> stateFlow = WireDetailFragment.this.getDuxo().getStateFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(WireDetailFragment.this);
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
        public static final /* synthetic */ Object invokeSuspend$bind(WireDetailFragment wireDetailFragment, WireDetailState wireDetailState, Continuation continuation) {
            wireDetailFragment.bind(wireDetailState);
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
    public final void bind(WireDetailState state) {
        FragmentWireDetailBinding binding = getBinding();
        WireOverview overview = state.getOverview();
        if (overview != null) {
            binding.transactionDetailAmount.setText(overview.getAmountText());
            binding.transactionDetailSubtitle.setText(overview.getTitleText());
            this.lineItemAdapter.submitList(overview.getLineItems());
            ApiGracePeriodContent gracePeriodContent = overview.getGracePeriodContent();
            if (gracePeriodContent != null) {
                setupGracePeriodContent(gracePeriodContent);
            } else {
                binding.gracePeriodBanner.setVisibility(8);
                binding.gracePeriodDetails.setVisibility(8);
                binding.gracePeriodCta.setVisibility(8);
            }
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

    private final void setupGracePeriodContent(final ApiGracePeriodContent gracePeriod) {
        getBinding().gracePeriodBanner.setVisibility(0);
        getBinding().gracePeriodBanner.setContent(ComposableLambda3.composableLambdaInstance(952194977, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.wireshistory.WireDetailFragment.setupGracePeriodContent.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                if ((i & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(952194977, i, -1, "com.robinhood.android.transfers.wireshistory.WireDetailFragment.setupGracePeriodContent.<anonymous> (WireDetailFragment.kt:176)");
                }
                WireDetailFragment.this.GracePeriodContent(gracePeriod.getBanner_sdui(), composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        getBinding().gracePeriodDetails.setVisibility(0);
        getBinding().gracePeriodDetails.setContent(ComposableLambda3.composableLambdaInstance(-899684968, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.wireshistory.WireDetailFragment.setupGracePeriodContent.2
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                if ((i & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-899684968, i, -1, "com.robinhood.android.transfers.wireshistory.WireDetailFragment.setupGracePeriodContent.<anonymous> (WireDetailFragment.kt:179)");
                }
                WireDetailFragment.this.GracePeriodContent(gracePeriod.getDetails_sdui(), composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        final UIComponent<GenericAction> cta = gracePeriod.getCta();
        if (cta != null) {
            getBinding().gracePeriodCta.setVisibility(0);
            getBinding().gracePeriodCta.setContent(ComposableLambda3.composableLambdaInstance(-737693851, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.wireshistory.WireDetailFragment$setupGracePeriodContent$3$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i) {
                    if ((i & 3) == 2 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-737693851, i, -1, "com.robinhood.android.transfers.wireshistory.WireDetailFragment.setupGracePeriodContent.<anonymous>.<anonymous> (WireDetailFragment.kt:183)");
                    }
                    this.this$0.GracePeriodContent(cta, composer, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void GracePeriodContent(final UIComponent<? extends GenericAction> uIComponent, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(650224363);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(uIComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(this) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(650224363, i2, -1, "com.robinhood.android.transfers.wireshistory.WireDetailFragment.GracePeriodContent (WireDetailFragment.kt:188)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-828896205, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.wireshistory.WireDetailFragment.GracePeriodContent.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-828896205, i3, -1, "com.robinhood.android.transfers.wireshistory.WireDetailFragment.GracePeriodContent.<anonymous> (WireDetailFragment.kt:190)");
                    }
                    final WireDetailFragment wireDetailFragment = WireDetailFragment.this;
                    final UIComponent<GenericAction> uIComponent2 = uIComponent;
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-2108599032, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.wireshistory.WireDetailFragment.GracePeriodContent.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i4) {
                            if ((i4 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-2108599032, i4, -1, "com.robinhood.android.transfers.wireshistory.WireDetailFragment.GracePeriodContent.<anonymous>.<anonymous> (WireDetailFragment.kt:191)");
                            }
                            WireDetailFragment wireDetailFragment2 = wireDetailFragment;
                            final UIComponent<GenericAction> uIComponent3 = uIComponent2;
                            SduiActionHandler3.ProvideActionHandler(wireDetailFragment2, ComposableLambda3.rememberComposableLambda(1647076807, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.wireshistory.WireDetailFragment.GracePeriodContent.1.1.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i5) {
                                    if ((i5 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1647076807, i5, -1, "com.robinhood.android.transfers.wireshistory.WireDetailFragment.GracePeriodContent.<anonymous>.<anonymous>.<anonymous> (WireDetailFragment.kt:192)");
                                    }
                                    ImmutableList3 immutableList3PersistentListOf = extensions2.persistentListOf(uIComponent3);
                                    composer4.startReplaceGroup(-1772220517);
                                    SduiColumns.SduiColumn(immutableList3PersistentListOf, GenericAction.class, Modifier.INSTANCE, null, null, HorizontalPadding.Default, Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), false, composer4, 0, 0);
                                    composer4.endReplaceGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), composer3, 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.wireshistory.WireDetailFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return WireDetailFragment.GracePeriodContent$lambda$16(this.f$0, uIComponent, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
    /* renamed from: handle, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean mo15941handle(GenericAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof GenericAction.Dismiss) {
            requireActivity().getOnBackPressedDispatcher().onBackPressed();
            return true;
        }
        if (action instanceof GenericAction.Deeplink) {
            return ActionHandlingFragment2.handleDeeplink$default(this, ((GenericAction.Deeplink) action).getValue2(), null, 2, null);
        }
        if (!(action instanceof GenericAction.InfoAlert)) {
            throw new NoWhenBranchMatchedException();
        }
        SduiAlertKt.presentSduiAlertSheet(this, getMarkwon(), ((GenericAction.InfoAlert) action).getValue2().getAlert(), this, (1016 & 8) != 0 ? 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x004b: INVOKE 
              (r16v0 'this' com.robinhood.android.transfers.wireshistory.WireDetailFragment A[IMMUTABLE_TYPE, THIS])
              (wrap:io.noties.markwon.Markwon:0x0031: INVOKE (r16v0 'this' com.robinhood.android.transfers.wireshistory.WireDetailFragment A[IMMUTABLE_TYPE, THIS]) VIRTUAL call: com.robinhood.android.transfers.wireshistory.WireDetailFragment.getMarkwon():io.noties.markwon.Markwon A[MD:():io.noties.markwon.Markwon (m), WRAPPED] (LINE:210))
              (wrap:com.robinhood.models.serverdriven.experimental.api.GenericAlertContent:0x003b: INVOKE 
              (wrap:com.robinhood.models.serverdriven.experimental.api.AlertAction:0x0037: INVOKE 
              (wrap:com.robinhood.models.serverdriven.experimental.api.GenericAction$InfoAlert:0x0035: CHECK_CAST (com.robinhood.models.serverdriven.experimental.api.GenericAction$InfoAlert) (r17v0 'action' com.robinhood.models.serverdriven.experimental.api.GenericAction))
             VIRTUAL call: com.robinhood.models.serverdriven.experimental.api.GenericAction.InfoAlert.getValue():com.robinhood.models.serverdriven.experimental.api.AlertAction A[MD:():java.lang.Object (m), WRAPPED] (LINE:211))
             VIRTUAL call: com.robinhood.models.serverdriven.experimental.api.AlertAction.getAlert():com.robinhood.models.serverdriven.experimental.api.GenericAlertContent A[MD:():com.robinhood.models.serverdriven.experimental.api.GenericAlertContent<ActionT extends android.os.Parcelable> (m), WRAPPED] (LINE:211))
              (r16v0 'this' com.robinhood.android.transfers.wireshistory.WireDetailFragment A[IMMUTABLE_TYPE, THIS])
              (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0002: ARITH (1016 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000b: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:520) call: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlertKt$$ExternalSyntheticLambda0.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function1))
              (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x000f: ARITH (1016 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0018: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:521) call: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlertKt$$ExternalSyntheticLambda1.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function1))
              (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x001c: ARITH (1016 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0025: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:522) call: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlertKt$$ExternalSyntheticLambda2.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function0))
              (wrap:boolean:?: TERNARY null = ((wrap:int:0x0029: ARITH (1016 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : false)
              (wrap:boolean:?: TERNARY null = ((wrap:int:0x0032: ARITH (1016 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : true)
              (wrap:boolean:?: TERNARY null = ((wrap:int:0x003a: ARITH (1016 int) & (256 int) A[WRAPPED]) != (0 int)) ? true : false)
              (wrap:com.robinhood.android.common.ui.RhButtonType:?: TERNARY null = ((wrap:int:0x0043: ARITH (1016 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null com.robinhood.android.common.ui.RhButtonType) : (null com.robinhood.android.common.ui.RhButtonType))
             STATIC call: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlertKt.presentSduiAlertSheet(com.robinhood.android.common.ui.RhBottomSheetDialogFragmentHost, io.noties.markwon.Markwon, com.robinhood.models.serverdriven.experimental.api.GenericAlertContent, com.robinhood.android.libdesignsystem.serverui.experimental.compose.ActionHandler, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, boolean, boolean, boolean, com.robinhood.android.common.ui.RhButtonType):void A[MD:<ActionT extends android.os.Parcelable>:(com.robinhood.android.common.ui.RhBottomSheetDialogFragmentHost, io.noties.markwon.Markwon, com.robinhood.models.serverdriven.experimental.api.GenericAlertContent<? extends ActionT extends android.os.Parcelable>, com.robinhood.android.libdesignsystem.serverui.experimental.compose.ActionHandler<? super ActionT extends android.os.Parcelable>, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, boolean, boolean, boolean, com.robinhood.android.common.ui.RhButtonType):void (m)] (LINE:516) in method: com.robinhood.android.transfers.wireshistory.WireDetailFragment.handle(com.robinhood.models.serverdriven.experimental.api.GenericAction):boolean, file: classes9.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlertKt$$ExternalSyntheticLambda0, state: NOT_LOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
            	at jadx.core.codegen.InsnGen.makeTernary(InsnGen.java:1187)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:536)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
            	... 27 more
            */
        /*
            this = this;
            r0 = r17
            java.lang.String r1 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            boolean r1 = r0 instanceof com.robinhood.models.serverdriven.experimental.api.GenericAction.Dismiss
            r2 = 1
            if (r1 == 0) goto L18
            androidx.fragment.app.FragmentActivity r0 = r16.requireActivity()
            androidx.activity.OnBackPressedDispatcher r0 = r0.getOnBackPressedDispatcher()
            r0.onBackPressed()
            return r2
        L18:
            boolean r1 = r0 instanceof com.robinhood.models.serverdriven.experimental.api.GenericAction.Deeplink
            if (r1 == 0) goto L2b
            com.robinhood.models.serverdriven.experimental.api.GenericAction$Deeplink r0 = (com.robinhood.models.serverdriven.experimental.api.GenericAction.Deeplink) r0
            com.robinhood.models.serverdriven.experimental.api.DeeplinkAction r0 = r0.getValue2()
            r1 = 2
            r2 = 0
            r3 = r16
            boolean r0 = com.robinhood.android.libdesignsystem.serverui.experimental.action.ActionHandlingFragment2.handleDeeplink$default(r3, r0, r2, r1, r2)
            return r0
        L2b:
            r3 = r16
            boolean r1 = r0 instanceof com.robinhood.models.serverdriven.experimental.api.GenericAction.InfoAlert
            if (r1 == 0) goto L4f
            io.noties.markwon.Markwon r4 = r3.getMarkwon()
            com.robinhood.models.serverdriven.experimental.api.GenericAction$InfoAlert r0 = (com.robinhood.models.serverdriven.experimental.api.GenericAction.InfoAlert) r0
            com.robinhood.models.serverdriven.experimental.api.AlertAction r0 = r0.getValue2()
            com.robinhood.models.serverdriven.experimental.api.GenericAlertContent r5 = r0.getAlert()
            r14 = 888(0x378, float:1.244E-42)
            r15 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 1
            r12 = 0
            r13 = 0
            r6 = r16
            com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlertKt.presentSduiAlertSheet$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r2
        L4f:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.transfers.wireshistory.WireDetailFragment.mo15941handle(com.robinhood.models.serverdriven.experimental.api.GenericAction):boolean");
    }

    private final void showDescriptionDialog(CharSequence title, CharSequence message) {
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder id = companion.create(contextRequireContext).setUseDesignSystemOverlay(true).setTitle(title).setMessage(message).setPositiveButton(C11048R.string.general_label_close, new Object[0]).setId(C31240R.id.dialog_id_transaction_item_description);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        RhDialogFragment.Builder.show$default(id, childFragmentManager, "transactionLineItemDescriptionDialog", false, 4, null);
    }

    /* compiled from: WireDetailFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/wireshistory/WireDetailFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/transfers/wireshistory/WireDetailFragment;", "Lcom/robinhood/android/transfers/contracts/WireDetailFragmentKey;", "<init>", "()V", "feature-wires-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<WireDetailFragment, WireDetailFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(WireDetailFragmentKey wireDetailFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, wireDetailFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public WireDetailFragmentKey getArgs(WireDetailFragment wireDetailFragment) {
            return (WireDetailFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, wireDetailFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public WireDetailFragment newInstance(WireDetailFragmentKey wireDetailFragmentKey) {
            return (WireDetailFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, wireDetailFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(WireDetailFragment wireDetailFragment, WireDetailFragmentKey wireDetailFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, wireDetailFragment, wireDetailFragmentKey);
        }
    }
}
