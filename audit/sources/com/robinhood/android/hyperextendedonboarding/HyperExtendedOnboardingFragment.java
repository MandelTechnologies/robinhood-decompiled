package com.robinhood.android.hyperextendedonboarding;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.FragmentContainerLayout;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.hyperextendedonboarding.HyperExtendedOnboardingViewState;
import com.robinhood.android.hyperextendedonboarding.databinding.FragmentHyperExtendedOnboardingBinding;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoColorMapper;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.rhimage.ImageLoader;
import com.robinhood.android.serverclientcomponents.actionbutton.ClientComponentButtonView;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.bonfire.ApiNewTradingHoursOnboarding;
import com.robinhood.models.serverdriven.api.ApiGenericButton;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.models.serverdriven.p347db.ImageSource;
import com.robinhood.models.serverdriven.p347db.ServerDrivenButton;
import com.robinhood.models.serverdriven.p347db.ThemedColor;
import com.robinhood.models.serverdriven.p347db.ThemedImageSource;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import io.noties.markwon.Markwon;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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

/* compiled from: HyperExtendedOnboardingFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u0000 ;2\u00020\u00012\u00020\u0002:\u0001;B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0016J\u0010\u0010(\u001a\u00020%2\u0006\u0010)\u001a\u00020*H\u0016J\b\u0010+\u001a\u00020%H\u0016J\u001a\u0010,\u001a\u00020%2\u0006\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\u0010\u00101\u001a\u00020%2\u0006\u00102\u001a\u000203H\u0002J\u001a\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u000100H\u0016J\u0010\u00109\u001a\u0002052\u0006\u0010:\u001a\u00020\u0014H\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b \u0010!¨\u0006<"}, m3636d2 = {"Lcom/robinhood/android/hyperextendedonboarding/HyperExtendedOnboardingFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/serverclientcomponents/actionbutton/ClientComponentButtonView$Callbacks;", "<init>", "()V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "imageLoader", "Lcom/robinhood/android/rhimage/ImageLoader;", "getImageLoader", "()Lcom/robinhood/android/rhimage/ImageLoader;", "setImageLoader", "(Lcom/robinhood/android/rhimage/ImageLoader;)V", "serverButtonsAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/serverclientcomponents/actionbutton/ClientComponentButtonView;", "Lcom/robinhood/models/serverdriven/db/ServerDrivenButton;", "rowsAdapter", "Lcom/robinhood/android/designsystem/row/RdsRowView;", "Lcom/robinhood/models/api/bonfire/ApiNewTradingHoursOnboarding$HyperExtendedOnboardingRow;", "duxo", "Lcom/robinhood/android/hyperextendedonboarding/HyperExtendedOnboardingDuxo;", "getDuxo", "()Lcom/robinhood/android/hyperextendedonboarding/HyperExtendedOnboardingDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/hyperextendedonboarding/databinding/FragmentHyperExtendedOnboardingBinding;", "getBinding", "()Lcom/robinhood/android/hyperextendedonboarding/databinding/FragmentHyperExtendedOnboardingBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onAttach", "context", "Landroid/content/Context;", "onStart", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "bind", "state", "Lcom/robinhood/android/hyperextendedonboarding/HyperExtendedOnboardingViewState;", "onPositiveButtonClicked", "", "id", "", "passthroughArgs", "onActionClicked", "button", "Companion", "feature-hyper-extended-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class HyperExtendedOnboardingFragment extends BaseFragment implements ClientComponentButtonView.Callbacks {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public ImageLoader imageLoader;
    public Markwon markwon;
    private final GenericListAdapter<RdsRowView, ApiNewTradingHoursOnboarding.HyperExtendedOnboardingRow> rowsAdapter;
    private final GenericListAdapter<ClientComponentButtonView, ServerDrivenButton> serverButtonsAdapter;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(HyperExtendedOnboardingFragment.class, "binding", "getBinding()Lcom/robinhood/android/hyperextendedonboarding/databinding/FragmentHyperExtendedOnboardingBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: HyperExtendedOnboardingFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DayNightOverlay.values().length];
            try {
                iArr[DayNightOverlay.DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DayNightOverlay.NIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public HyperExtendedOnboardingFragment() {
        super(C18468R.layout.fragment_hyper_extended_onboarding);
        GenericListAdapter.Companion companion = GenericListAdapter.INSTANCE;
        ClientComponentButtonView.Companion companion2 = ClientComponentButtonView.INSTANCE;
        DiffCallbacks diffCallbacks = DiffCallbacks.INSTANCE;
        DiffCallbacks.Equality equality = DiffCallbacks.Equality.INSTANCE;
        this.serverButtonsAdapter = companion.m2987of(companion2, equality, new Function2() { // from class: com.robinhood.android.hyperextendedonboarding.HyperExtendedOnboardingFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return HyperExtendedOnboardingFragment.serverButtonsAdapter$lambda$0(this.f$0, (ClientComponentButtonView) obj, (ServerDrivenButton) obj2);
            }
        });
        this.rowsAdapter = companion.m2987of(RdsRowView.ValuePropRowInflater.INSTANCE, equality, new Function2() { // from class: com.robinhood.android.hyperextendedonboarding.HyperExtendedOnboardingFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return HyperExtendedOnboardingFragment.rowsAdapter$lambda$1(this.f$0, (RdsRowView) obj, (ApiNewTradingHoursOnboarding.HyperExtendedOnboardingRow) obj2);
            }
        });
        this.duxo = OldDuxos.oldDuxo(this, HyperExtendedOnboardingDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, HyperExtendedOnboardingFragment2.INSTANCE);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit serverButtonsAdapter$lambda$0(HyperExtendedOnboardingFragment hyperExtendedOnboardingFragment, ClientComponentButtonView of, ServerDrivenButton item) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(item, "item");
        of.setCallbacks(hyperExtendedOnboardingFragment);
        of.bind(item);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit rowsAdapter$lambda$1(HyperExtendedOnboardingFragment hyperExtendedOnboardingFragment, RdsRowView of, ApiNewTradingHoursOnboarding.HyperExtendedOnboardingRow item) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(item, "item");
        of.setLeadingIconDrawable(ViewsKt.getDrawable(of, item.getIcon().getResourceId()));
        of.setSecondaryText(hyperExtendedOnboardingFragment.getMarkwon().toMarkdown(item.getText_markdown()));
        return Unit.INSTANCE;
    }

    private final HyperExtendedOnboardingDuxo getDuxo() {
        return (HyperExtendedOnboardingDuxo) this.duxo.getValue();
    }

    private final FragmentHyperExtendedOnboardingBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentHyperExtendedOnboardingBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        RhToolbar rhToolbar = getRhToolbar();
        if (rhToolbar != null) {
            ScarletManager2.overrideAttribute(rhToolbar, android.R.attr.backgroundTint, new ThemedResourceReference(ResourceType.COLOR.INSTANCE, C20690R.attr.colorTransparent));
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(scarletContextWrapper), AchromaticOverlay.INSTANCE, null, 2, null);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C184671(this));
    }

    /* compiled from: HyperExtendedOnboardingFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.hyperextendedonboarding.HyperExtendedOnboardingFragment$onStart$1 */
    /* synthetic */ class C184671 extends FunctionReferenceImpl implements Function1<HyperExtendedOnboardingViewState, Unit> {
        C184671(Object obj) {
            super(1, obj, HyperExtendedOnboardingFragment.class, "bind", "bind(Lcom/robinhood/android/hyperextendedonboarding/HyperExtendedOnboardingViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HyperExtendedOnboardingViewState hyperExtendedOnboardingViewState) {
            invoke2(hyperExtendedOnboardingViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(HyperExtendedOnboardingViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((HyperExtendedOnboardingFragment) this.receiver).bind(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        getBinding().rowsRecyclerView.setAdapter(this.rowsAdapter);
        getBinding().buttonRecyclerView.setAdapter(this.serverButtonsAdapter);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.robinhood.android.common.ui.view.FragmentContainerLayout.LayoutParams");
        ((FragmentContainerLayout.LayoutParams) layoutParams).setUnderneathToolbar(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(HyperExtendedOnboardingViewState state) {
        ImageSource light;
        HyperExtendedOnboardingViewState.Result result = state.getResult();
        if (result instanceof HyperExtendedOnboardingViewState.Result.Success) {
            FragmentHyperExtendedOnboardingBinding binding = getBinding();
            ShimmerLoadingView loadingView = binding.loadingView;
            Intrinsics.checkNotNullExpressionValue(loadingView, "loadingView");
            loadingView.setVisibility(8);
            ApiNewTradingHoursOnboarding.HyperExtendedOnboardingViewModel viewModel = ((HyperExtendedOnboardingViewState.Result.Success) result).getViewModel();
            ThemedImageSource dbModel = viewModel.getImage_source().toDbModel();
            int i = WhenMappings.$EnumSwitchMapping$0[state.getDayNightOverlay().ordinal()];
            if (i == 1) {
                light = dbModel.getLight();
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                light = dbModel.getDark();
            }
            ImageLoader imageLoader = getImageLoader();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            ImageLoader.ImageRequest imageRequestLoad = imageLoader.load(light.toImageUrl(contextRequireContext));
            ImageView headerImg = binding.headerImg;
            Intrinsics.checkNotNullExpressionValue(headerImg, "headerImg");
            ImageLoader.ImageRequest.DefaultImpls.into$default(imageRequestLoad, headerImg, null, null, 6, null);
            ThemedColor dbModel2 = viewModel.getImage_background_color().toDbModel();
            ResourceReferences4<Integer> resourceReferences4MapDayNightSelectorServerColor = ServerToBentoColorMapper.INSTANCE.mapDayNightSelectorServerColor(dbModel2.getLight(), dbModel2.getDark());
            if (resourceReferences4MapDayNightSelectorServerColor != null) {
                ImageView headerImg2 = getBinding().headerImg;
                Intrinsics.checkNotNullExpressionValue(headerImg2, "headerImg");
                ScarletManager2.overrideAttribute(headerImg2, android.R.attr.backgroundTint, resourceReferences4MapDayNightSelectorServerColor);
            }
            binding.title.setText(viewModel.getTitle());
            binding.subtitle.setText(getMarkwon().toMarkdown(viewModel.getSubtitle_markdown()));
            this.rowsAdapter.submitList(viewModel.getRows());
            binding.disclosureTxt.setText(getMarkwon().toMarkdown(viewModel.getDisclosure_markdown()));
            GenericListAdapter<ClientComponentButtonView, ServerDrivenButton> genericListAdapter = this.serverButtonsAdapter;
            List<ApiGenericButton> footer_buttons = viewModel.getFooter_buttons();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(footer_buttons, 10));
            Iterator<T> it = footer_buttons.iterator();
            while (it.hasNext()) {
                arrayList.add(ServerDrivenButton.INSTANCE.from(((ApiGenericButton) it.next()).toDbModel()));
            }
            genericListAdapter.submitList(arrayList);
            return;
        }
        if (!Intrinsics.areEqual(result, HyperExtendedOnboardingViewState.Result.Loading.INSTANCE)) {
            if (!Intrinsics.areEqual(result, HyperExtendedOnboardingViewState.Result.Error.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
            Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
            RhDialogFragment.Builder theme = companion.create(contextRequireContext2).setId(C18468R.id.dialog_id_hyper_extended_unavailable).setMessage(C18468R.string.feature_not_available_error_description, new Object[0]).setPositiveButton(C11048R.string.general_label_dismiss, new Object[0]).setTheme(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome);
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            RhDialogFragment.Builder.show$default(theme, childFragmentManager, "feature-not-available", false, 4, null);
            ShimmerLoadingView loadingView2 = getBinding().loadingView;
            Intrinsics.checkNotNullExpressionValue(loadingView2, "loadingView");
            loadingView2.setVisibility(8);
            return;
        }
        ShimmerLoadingView loadingView3 = getBinding().loadingView;
        Intrinsics.checkNotNullExpressionValue(loadingView3, "loadingView");
        loadingView3.setVisibility(0);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C18468R.id.dialog_id_hyper_extended_unavailable) {
            requireActivity().finish();
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.serverclientcomponents.actionbutton.ClientComponentButtonView.Callbacks
    public boolean onActionClicked(ServerDrivenButton button) {
        Intrinsics.checkNotNullParameter(button, "button");
        if (!(button.getTypedAction() instanceof GenericAction.DismissAction)) {
            return false;
        }
        requireActivity().finish();
        return true;
    }

    /* compiled from: HyperExtendedOnboardingFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/hyperextendedonboarding/HyperExtendedOnboardingFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolver;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$HyperExtendedOnboarding;", "<init>", "()V", "createFragment", "Lcom/robinhood/android/hyperextendedonboarding/HyperExtendedOnboardingFragment;", "key", "feature-hyper-extended-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolver<LegacyFragmentKey.HyperExtendedOnboarding> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public HyperExtendedOnboardingFragment createFragment(LegacyFragmentKey.HyperExtendedOnboarding key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return new HyperExtendedOnboardingFragment();
        }
    }
}
