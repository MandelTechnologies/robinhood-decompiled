package com.robinhood.android.recommendations.p224ui.walkthrough.learnmore;

import android.app.Dialog;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.p088ui.BaseDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.progress.RdsProgressBar;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoColorMapper;
import com.robinhood.android.navigation.DialogFragmentResolver;
import com.robinhood.android.navigation.app.keys.LegacyDialogFragmentKey;
import com.robinhood.android.recommendations.C25978R;
import com.robinhood.android.recommendations.databinding.FragmentRecommendationsLearnMoreDialogBinding;
import com.robinhood.android.recommendations.p224ui.walkthrough.learnmore.RecommendationsLearnMoreViewState;
import com.robinhood.recommendations.models.api.RecommendationsLearnMoreEntryPoint;
import com.robinhood.recommendations.models.p362db.RecommendationsLearnMore;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.utils.p409ui.color.ThemeColors;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import com.robinhood.utils.resource.StringResource;
import io.noties.markwon.Markwon;
import java.util.List;
import java.util.UUID;
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

/* compiled from: RecommendationsLearnMoreDialogFragment.kt */
@Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 52\u00020\u00012\u00020\u0002:\u000245B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u001a\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u0010\u00101\u001a\u00020.2\u0006\u00102\u001a\u000203H\u0002R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0094D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\fX\u0094D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 0\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020&X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(¨\u00066"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/walkthrough/learnmore/RecommendationsLearnMoreDialogFragment;", "Lcom/robinhood/android/common/ui/BaseDialogFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "dialogWidth", "", "getDialogWidth", "()I", "dialogHeight", "getDialogHeight", "binding", "Lcom/robinhood/android/recommendations/databinding/FragmentRecommendationsLearnMoreDialogBinding;", "getBinding", "()Lcom/robinhood/android/recommendations/databinding/FragmentRecommendationsLearnMoreDialogBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/recommendations/ui/walkthrough/learnmore/RecommendationsLearnMoreDuxo;", "getDuxo", "()Lcom/robinhood/android/recommendations/ui/walkthrough/learnmore/RecommendationsLearnMoreDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "adapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/recommendations/ui/walkthrough/learnmore/LearnMoreRowView;", "Lcom/robinhood/android/recommendations/ui/walkthrough/learnmore/RecommendationsLearnMoreViewState$ExpandableRow;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "excludeFromAutoScreenDisappearEventLogging", "", "getExcludeFromAutoScreenDisappearEventLogging", "()Z", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "Landroid/view/View;", "setViewState", "state", "Lcom/robinhood/android/recommendations/ui/walkthrough/learnmore/RecommendationsLearnMoreViewState;", "Args", "Companion", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class RecommendationsLearnMoreDialogFragment extends BaseDialogFragment implements AutoLoggableFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RecommendationsLearnMoreDialogFragment.class, "binding", "getBinding()Lcom/robinhood/android/recommendations/databinding/FragmentRecommendationsLearnMoreDialogBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final GenericListAdapter<LearnMoreRowView, RecommendationsLearnMoreViewState.ExpandableRow> adapter;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private final int dialogHeight;
    private final int dialogWidth;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final boolean excludeFromAutoScreenDisappearEventLogging;
    public Markwon markwon;

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenAppearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(this);
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
    public Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    public RecommendationsLearnMoreDialogFragment() {
        super(C25978R.layout.fragment_recommendations_learn_more_dialog);
        this.dialogWidth = -1;
        this.dialogHeight = -1;
        this.binding = ViewBinding5.viewBinding(this, RecommendationsLearnMoreDialogFragment2.INSTANCE);
        this.duxo = DuxosKt.duxo(this, RecommendationsLearnMoreDuxo.class);
        this.adapter = GenericListAdapter.INSTANCE.m2987of(LearnMoreRowView.INSTANCE, DiffCallbacks.Equality.INSTANCE, new Function2() { // from class: com.robinhood.android.recommendations.ui.walkthrough.learnmore.RecommendationsLearnMoreDialogFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return RecommendationsLearnMoreDialogFragment.adapter$lambda$0((LearnMoreRowView) obj, (RecommendationsLearnMoreViewState.ExpandableRow) obj2);
            }
        });
        this.excludeFromAutoScreenDisappearEventLogging = true;
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

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment
    protected int getDialogWidth() {
        return this.dialogWidth;
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment
    protected int getDialogHeight() {
        return this.dialogHeight;
    }

    private final FragmentRecommendationsLearnMoreDialogBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentRecommendationsLearnMoreDialogBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RecommendationsLearnMoreDuxo getDuxo() {
        return (RecommendationsLearnMoreDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit adapter$lambda$0(LearnMoreRowView of, RecommendationsLearnMoreViewState.ExpandableRow expandableContentRow) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(expandableContentRow, "expandableContentRow");
        of.bind(expandableContentRow);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        Screen loggingScreen = ((Args) INSTANCE.getArgs((Fragment) this)).getLoggingScreen();
        return loggingScreen == null ? new Screen(null, null, null, null, 15, null) : loggingScreen;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return this.excludeFromAutoScreenDisappearEventLogging;
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(savedInstanceState);
        Window window = dialogOnCreateDialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        return dialogOnCreateDialog;
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        BaseDialogFragment.collectDuxoState$default(this, null, new C262021(null), 1, null);
        RecyclerView list = getBinding().list;
        Intrinsics.checkNotNullExpressionValue(list, "list");
        bindAdapter(list, this.adapter);
    }

    /* compiled from: RecommendationsLearnMoreDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.recommendations.ui.walkthrough.learnmore.RecommendationsLearnMoreDialogFragment$onViewCreated$1", m3645f = "RecommendationsLearnMoreDialogFragment.kt", m3646l = {75}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.recommendations.ui.walkthrough.learnmore.RecommendationsLearnMoreDialogFragment$onViewCreated$1 */
    static final class C262021 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C262021(Continuation<? super C262021> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RecommendationsLearnMoreDialogFragment.this.new C262021(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C262021) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: RecommendationsLearnMoreDialogFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.recommendations.ui.walkthrough.learnmore.RecommendationsLearnMoreDialogFragment$onViewCreated$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ RecommendationsLearnMoreDialogFragment $tmp0;

            AnonymousClass1(RecommendationsLearnMoreDialogFragment recommendationsLearnMoreDialogFragment) {
                this.$tmp0 = recommendationsLearnMoreDialogFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, RecommendationsLearnMoreDialogFragment.class, "setViewState", "setViewState(Lcom/robinhood/android/recommendations/ui/walkthrough/learnmore/RecommendationsLearnMoreViewState;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(RecommendationsLearnMoreViewState recommendationsLearnMoreViewState, Continuation<? super Unit> continuation) throws Resources.NotFoundException {
                Object objInvokeSuspend$setViewState = C262021.invokeSuspend$setViewState(this.$tmp0, recommendationsLearnMoreViewState, continuation);
                return objInvokeSuspend$setViewState == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$setViewState : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((RecommendationsLearnMoreViewState) obj, (Continuation<? super Unit>) continuation);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<RecommendationsLearnMoreViewState> stateFlow = RecommendationsLearnMoreDialogFragment.this.getDuxo().getStateFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(RecommendationsLearnMoreDialogFragment.this);
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
        public static final /* synthetic */ Object invokeSuspend$setViewState(RecommendationsLearnMoreDialogFragment recommendationsLearnMoreDialogFragment, RecommendationsLearnMoreViewState recommendationsLearnMoreViewState, Continuation continuation) throws Resources.NotFoundException {
            recommendationsLearnMoreDialogFragment.setViewState(recommendationsLearnMoreViewState);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setViewState(RecommendationsLearnMoreViewState state) throws Resources.NotFoundException {
        CharSequence text;
        int themeColor;
        FragmentRecommendationsLearnMoreDialogBinding binding = getBinding();
        RdsProgressBar loadingView = binding.loadingView;
        Intrinsics.checkNotNullExpressionValue(loadingView, "loadingView");
        loadingView.setVisibility(state.isLoading() ? 0 : 8);
        RdsButton doneBtn = binding.doneBtn;
        Intrinsics.checkNotNullExpressionValue(doneBtn, "doneBtn");
        OnClickListeners.onClick(doneBtn, new RecommendationsLearnMoreDialogFragment3(this));
        RecommendationsLearnMore learnMore = state.getLearnMore();
        if (learnMore == null) {
            return;
        }
        RhTextView rhTextView = binding.title;
        StringResource title = state.getTitle();
        if (title != null) {
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            text = title.getText(resources);
        } else {
            text = null;
        }
        rhTextView.setText(text);
        RhTextView rhTextView2 = binding.description;
        Companion companion = INSTANCE;
        String subtitleOverride = ((Args) companion.getArgs((Fragment) this)).getSubtitleOverride();
        if (subtitleOverride == null) {
            subtitleOverride = learnMore.getSubtitle();
        }
        rhTextView2.setText(subtitleOverride);
        binding.disclosure.setText(getMarkwon().toMarkdown(learnMore.getDisclosureMarkdown()));
        ServerToBentoColorMapper serverToBentoColorMapper = ServerToBentoColorMapper.INSTANCE;
        String pogColorOverride = ((Args) companion.getArgs((Fragment) this)).getPogColorOverride();
        if (pogColorOverride == null) {
            pogColorOverride = learnMore.getPogColor();
        }
        ResourceReferences4<Integer> resourceReferences4MapSimpleServerColor = serverToBentoColorMapper.mapSimpleServerColor(pogColorOverride);
        if (resourceReferences4MapSimpleServerColor != null) {
            Resources.Theme theme = requireContext().getTheme();
            Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
            Integer numResolve = resourceReferences4MapSimpleServerColor.resolve(theme);
            if (numResolve != null) {
                themeColor = numResolve.intValue();
            } else {
                android.content.Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                themeColor = ThemeColors.getThemeColor(contextRequireContext, C20690R.attr.colorBackground1Inverse);
            }
        }
        binding.pog.setText(learnMore.getPogTitle());
        binding.pog.setBackgroundTintList(ColorStateList.valueOf(themeColor));
        List<RecommendationsLearnMoreViewState.ExpandableRow> expandableRows = state.getExpandableRows();
        if (expandableRows != null) {
            this.adapter.submitList(expandableRows);
        }
    }

    /* compiled from: RecommendationsLearnMoreDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u001b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J^\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010%J\u0006\u0010&\u001a\u00020'J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+HÖ\u0003J\t\u0010,\u001a\u00020'HÖ\u0001J\t\u0010-\u001a\u00020\u0005HÖ\u0001J\u0016\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020'R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013¨\u00063"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/walkthrough/learnmore/RecommendationsLearnMoreDialogFragment$Args;", "Landroid/os/Parcelable;", "instrumentId", "Ljava/util/UUID;", "source", "", "loggingScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "entryPoint", "Lcom/robinhood/recommendations/models/api/RecommendationsLearnMoreEntryPoint;", "weight", "", "subtitleOverride", "pogColorOverride", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/recommendations/models/api/RecommendationsLearnMoreEntryPoint;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;)V", "getInstrumentId", "()Ljava/util/UUID;", "getSource", "()Ljava/lang/String;", "getLoggingScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "getEntryPoint", "()Lcom/robinhood/recommendations/models/api/RecommendationsLearnMoreEntryPoint;", "getWeight", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getSubtitleOverride", "getPogColorOverride", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/util/UUID;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/recommendations/models/api/RecommendationsLearnMoreEntryPoint;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;)Lcom/robinhood/android/recommendations/ui/walkthrough/learnmore/RecommendationsLearnMoreDialogFragment$Args;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final RecommendationsLearnMoreEntryPoint entryPoint;
        private final UUID instrumentId;
        private final Screen loggingScreen;
        private final String pogColorOverride;
        private final String source;
        private final String subtitleOverride;
        private final Float weight;

        /* compiled from: RecommendationsLearnMoreDialogFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((UUID) parcel.readSerializable(), parcel.readString(), (Screen) parcel.readSerializable(), RecommendationsLearnMoreEntryPoint.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, UUID uuid, String str, Screen screen, RecommendationsLearnMoreEntryPoint recommendationsLearnMoreEntryPoint, Float f, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = args.instrumentId;
            }
            if ((i & 2) != 0) {
                str = args.source;
            }
            if ((i & 4) != 0) {
                screen = args.loggingScreen;
            }
            if ((i & 8) != 0) {
                recommendationsLearnMoreEntryPoint = args.entryPoint;
            }
            if ((i & 16) != 0) {
                f = args.weight;
            }
            if ((i & 32) != 0) {
                str2 = args.subtitleOverride;
            }
            if ((i & 64) != 0) {
                str3 = args.pogColorOverride;
            }
            String str4 = str2;
            String str5 = str3;
            Float f2 = f;
            Screen screen2 = screen;
            return args.copy(uuid, str, screen2, recommendationsLearnMoreEntryPoint, f2, str4, str5);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* renamed from: component3, reason: from getter */
        public final Screen getLoggingScreen() {
            return this.loggingScreen;
        }

        /* renamed from: component4, reason: from getter */
        public final RecommendationsLearnMoreEntryPoint getEntryPoint() {
            return this.entryPoint;
        }

        /* renamed from: component5, reason: from getter */
        public final Float getWeight() {
            return this.weight;
        }

        /* renamed from: component6, reason: from getter */
        public final String getSubtitleOverride() {
            return this.subtitleOverride;
        }

        /* renamed from: component7, reason: from getter */
        public final String getPogColorOverride() {
            return this.pogColorOverride;
        }

        public final Args copy(UUID instrumentId, String source, Screen loggingScreen, RecommendationsLearnMoreEntryPoint entryPoint, Float weight, String subtitleOverride, String pogColorOverride) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
            return new Args(instrumentId, source, loggingScreen, entryPoint, weight, subtitleOverride, pogColorOverride);
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
            return Intrinsics.areEqual(this.instrumentId, args.instrumentId) && Intrinsics.areEqual(this.source, args.source) && Intrinsics.areEqual(this.loggingScreen, args.loggingScreen) && this.entryPoint == args.entryPoint && Intrinsics.areEqual((Object) this.weight, (Object) args.weight) && Intrinsics.areEqual(this.subtitleOverride, args.subtitleOverride) && Intrinsics.areEqual(this.pogColorOverride, args.pogColorOverride);
        }

        public int hashCode() {
            int iHashCode = this.instrumentId.hashCode() * 31;
            String str = this.source;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Screen screen = this.loggingScreen;
            int iHashCode3 = (((iHashCode2 + (screen == null ? 0 : screen.hashCode())) * 31) + this.entryPoint.hashCode()) * 31;
            Float f = this.weight;
            int iHashCode4 = (iHashCode3 + (f == null ? 0 : f.hashCode())) * 31;
            String str2 = this.subtitleOverride;
            int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.pogColorOverride;
            return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "Args(instrumentId=" + this.instrumentId + ", source=" + this.source + ", loggingScreen=" + this.loggingScreen + ", entryPoint=" + this.entryPoint + ", weight=" + this.weight + ", subtitleOverride=" + this.subtitleOverride + ", pogColorOverride=" + this.pogColorOverride + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.instrumentId);
            dest.writeString(this.source);
            dest.writeSerializable(this.loggingScreen);
            dest.writeString(this.entryPoint.name());
            Float f = this.weight;
            if (f == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeFloat(f.floatValue());
            }
            dest.writeString(this.subtitleOverride);
            dest.writeString(this.pogColorOverride);
        }

        public Args(UUID instrumentId, String str, Screen screen, RecommendationsLearnMoreEntryPoint entryPoint, Float f, String str2, String str3) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
            this.instrumentId = instrumentId;
            this.source = str;
            this.loggingScreen = screen;
            this.entryPoint = entryPoint;
            this.weight = f;
            this.subtitleOverride = str2;
            this.pogColorOverride = str3;
        }

        public /* synthetic */ Args(UUID uuid, String str, Screen screen, RecommendationsLearnMoreEntryPoint recommendationsLearnMoreEntryPoint, Float f, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(uuid, str, screen, recommendationsLearnMoreEntryPoint, (i & 16) != 0 ? null : f, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : str3);
        }

        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        public final String getSource() {
            return this.source;
        }

        public final Screen getLoggingScreen() {
            return this.loggingScreen;
        }

        public final RecommendationsLearnMoreEntryPoint getEntryPoint() {
            return this.entryPoint;
        }

        public final Float getWeight() {
            return this.weight;
        }

        public final String getSubtitleOverride() {
            return this.subtitleOverride;
        }

        public final String getPogColorOverride() {
            return this.pogColorOverride;
        }
    }

    /* compiled from: RecommendationsLearnMoreDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/walkthrough/learnmore/RecommendationsLearnMoreDialogFragment$Companion;", "Lcom/robinhood/android/navigation/DialogFragmentResolver;", "Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey$RecommendationsLearnMore;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/recommendations/ui/walkthrough/learnmore/RecommendationsLearnMoreDialogFragment;", "Lcom/robinhood/android/recommendations/ui/walkthrough/learnmore/RecommendationsLearnMoreDialogFragment$Args;", "<init>", "()V", "createDialogFragment", "Landroidx/fragment/app/DialogFragment;", "key", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DialogFragmentResolver<LegacyDialogFragmentKey.RecommendationsLearnMore>, FragmentWithArgsCompanion<RecommendationsLearnMoreDialogFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(RecommendationsLearnMoreDialogFragment recommendationsLearnMoreDialogFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, recommendationsLearnMoreDialogFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RecommendationsLearnMoreDialogFragment newInstance(Args args) {
            return (RecommendationsLearnMoreDialogFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RecommendationsLearnMoreDialogFragment recommendationsLearnMoreDialogFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, recommendationsLearnMoreDialogFragment, args);
        }

        @Override // com.robinhood.android.navigation.DialogFragmentResolver
        public DialogFragment createDialogFragment(LegacyDialogFragmentKey.RecommendationsLearnMore key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return (DialogFragment) newInstance((Parcelable) new Args(key.getInstrumentId(), key.getSource(), null, key.getEntryPoint(), key.getWeight(), key.getSubtitleOverride(), key.getPogColorOverride()));
        }
    }
}
