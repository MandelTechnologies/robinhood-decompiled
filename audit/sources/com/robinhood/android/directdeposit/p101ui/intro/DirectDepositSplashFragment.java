package com.robinhood.android.directdeposit.p101ui.intro;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.directdeposit.C11131R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.directdeposit.C14044R;
import com.robinhood.android.directdeposit.p101ui.intro.DirectDepositSplashFragment;
import com.robinhood.android.directdeposit.p101ui.intro.DirectDepositSplashViewState2;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.mediaservice.ImageDensityUrl;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.rhimage.ImageLoader;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.android.wires.p278ui.WiresInvalidAccountContentComposable;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.common.contracts.RemoteDisclosureKey;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: DirectDepositSplashFragment.kt */
@Metadata(m3635d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\b\u0007\u0018\u0000 S2\u00020\u0001:\u0003QRSB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020B2\b\u0010C\u001a\u0004\u0018\u00010DH\u0016J\b\u0010E\u001a\u00020@H\u0016J\u0010\u0010F\u001a\u00020@2\u0006\u0010G\u001a\u00020HH\u0002J\u0014\u0010I\u001a\u00020@*\u00020=2\u0006\u0010J\u001a\u00020>H\u0002J\u0014\u0010K\u001a\u00020@*\u00020\u00052\u0006\u0010G\u001a\u00020HH\u0002J(\u0010L\u001a\u00020@2\u0006\u0010M\u001a\u00020N2\u0016\b\u0002\u0010O\u001a\u0010\u0012\u0004\u0012\u00020N\u0012\u0004\u0012\u00020N\u0018\u00010PH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000f\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\t\u001a\u0004\b\u0010\u0010\u0007R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\t\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\t\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001c\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\t\u001a\u0004\b\u001d\u0010\u001aR\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\t\u001a\u0004\b!\u0010\"R\u001e\u0010$\u001a\u00020%8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001e\u0010*\u001a\u00020+8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001b\u00100\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b2\u00103R\u001b\u00106\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010\t\u001a\u0004\b8\u00109R\u001a\u0010;\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020>0<X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006T"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/intro/DirectDepositSplashFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "titleTxt", "Landroid/widget/TextView;", "getTitleTxt", "()Landroid/widget/TextView;", "titleTxt$delegate", "Lkotlin/properties/ReadOnlyProperty;", "imageView", "Landroid/widget/ImageView;", "getImageView", "()Landroid/widget/ImageView;", "imageView$delegate", "disclosureTxt", "getDisclosureTxt", "disclosureTxt$delegate", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView$delegate", WiresInvalidAccountContentComposable.PrimaryButtonTag, "Landroid/widget/Button;", "getPrimaryButton", "()Landroid/widget/Button;", "primaryButton$delegate", WiresInvalidAccountContentComposable.SecondaryButtonTag, "getSecondaryButton", "secondaryButton$delegate", "loadingView", "Lcom/robinhood/android/common/ui/ShimmerLoadingView;", "getLoadingView", "()Lcom/robinhood/android/common/ui/ShimmerLoadingView;", "loadingView$delegate", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "imageLoader", "Lcom/robinhood/android/rhimage/ImageLoader;", "getImageLoader", "()Lcom/robinhood/android/rhimage/ImageLoader;", "setImageLoader", "(Lcom/robinhood/android/rhimage/ImageLoader;)V", "duxo", "Lcom/robinhood/android/directdeposit/ui/intro/DirectDepositSplashDuxo;", "getDuxo", "()Lcom/robinhood/android/directdeposit/ui/intro/DirectDepositSplashDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/android/directdeposit/ui/intro/DirectDepositSplashFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/directdeposit/ui/intro/DirectDepositSplashFragment$Callbacks;", "callbacks$delegate", "bulletsAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/designsystem/row/RdsRowView;", "Lcom/robinhood/android/directdeposit/ui/intro/Bullet;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "refreshUi", "state", "Lcom/robinhood/android/directdeposit/ui/intro/DirectDepositSplashViewState;", "bindBullet", "bullet", "bindDisclosure", "startDisclosureActivity", "contentfulId", "", "contentfulParams", "", "Callbacks", "Args", "Companion", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes27.dex */
public final class DirectDepositSplashFragment extends BaseFragment {
    private static final String DIRECT_DEPOSIT_SETUP_PATH = "rhy/direct_deposit";
    private static final String DIRECT_DEPOSIT_SETUP_PREFIX = "direct-deposit-";
    private final GenericListAdapter<RdsRowView, DirectDepositSplashViewState2> bulletsAdapter;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: disclosureTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 disclosureTxt;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public EventLogger eventLogger;
    public ImageLoader imageLoader;

    /* renamed from: imageView$delegate, reason: from kotlin metadata */
    private final Interfaces2 imageView;

    /* renamed from: loadingView$delegate, reason: from kotlin metadata */
    private final Interfaces2 loadingView;

    /* renamed from: primaryButton$delegate, reason: from kotlin metadata */
    private final Interfaces2 primaryButton;

    /* renamed from: recyclerView$delegate, reason: from kotlin metadata */
    private final Interfaces2 recyclerView;

    /* renamed from: secondaryButton$delegate, reason: from kotlin metadata */
    private final Interfaces2 secondaryButton;

    /* renamed from: titleTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 titleTxt;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(DirectDepositSplashFragment.class, "titleTxt", "getTitleTxt()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(DirectDepositSplashFragment.class, "imageView", "getImageView()Landroid/widget/ImageView;", 0)), Reflection.property1(new PropertyReference1Impl(DirectDepositSplashFragment.class, "disclosureTxt", "getDisclosureTxt()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(DirectDepositSplashFragment.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0)), Reflection.property1(new PropertyReference1Impl(DirectDepositSplashFragment.class, WiresInvalidAccountContentComposable.PrimaryButtonTag, "getPrimaryButton()Landroid/widget/Button;", 0)), Reflection.property1(new PropertyReference1Impl(DirectDepositSplashFragment.class, WiresInvalidAccountContentComposable.SecondaryButtonTag, "getSecondaryButton()Landroid/widget/Button;", 0)), Reflection.property1(new PropertyReference1Impl(DirectDepositSplashFragment.class, "loadingView", "getLoadingView()Lcom/robinhood/android/common/ui/ShimmerLoadingView;", 0)), Reflection.property1(new PropertyReference1Impl(DirectDepositSplashFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/directdeposit/ui/intro/DirectDepositSplashFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: DirectDepositSplashFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/intro/DirectDepositSplashFragment$Callbacks;", "", "onSplashPrimaryButtonClicked", "", "primaryButtonState", "Lcom/robinhood/android/directdeposit/ui/intro/DirectDepositSplashViewPrimaryButtonState;", "onSplashSecondaryButtonClicked", "secondaryButtonState", "Lcom/robinhood/android/directdeposit/ui/intro/DirectDepositSplashViewSecondaryButtonState;", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onSplashPrimaryButtonClicked(DirectDepositSplashViewState3 primaryButtonState);

        void onSplashSecondaryButtonClicked(DirectDepositSplashViewState4 secondaryButtonState);
    }

    public DirectDepositSplashFragment() {
        super(C14044R.layout.fragment_direct_deposit_value_prop);
        this.titleTxt = bindView(C14044R.id.direct_deposit_splash_title);
        this.imageView = bindView(C14044R.id.direct_deposit_splash_image);
        this.disclosureTxt = bindView(C14044R.id.direct_deposit_splash_disclosure_title);
        this.recyclerView = bindView(C14044R.id.direct_deposit_splash_recycler_view);
        this.primaryButton = bindView(C14044R.id.direct_deposit_splash_primary_button);
        this.secondaryButton = bindView(C14044R.id.direct_deposit_splash_secondary_button);
        this.loadingView = bindView(C14044R.id.direct_deposit_splash_loading);
        this.duxo = OldDuxos.oldDuxo(this, DirectDepositSplashDuxo.class);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.directdeposit.ui.intro.DirectDepositSplashFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof DirectDepositSplashFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.bulletsAdapter = GenericListAdapter.INSTANCE.m2985of(C11131R.layout.view_direct_deposit_splash_bullet_row, DiffCallbacks.Equality.INSTANCE, new Function2() { // from class: com.robinhood.android.directdeposit.ui.intro.DirectDepositSplashFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return DirectDepositSplashFragment.bulletsAdapter$lambda$0(this.f$0, (RdsRowView) obj, (DirectDepositSplashViewState2) obj2);
            }
        });
    }

    private final TextView getTitleTxt() {
        return (TextView) this.titleTxt.getValue(this, $$delegatedProperties[0]);
    }

    private final ImageView getImageView() {
        return (ImageView) this.imageView.getValue(this, $$delegatedProperties[1]);
    }

    private final TextView getDisclosureTxt() {
        return (TextView) this.disclosureTxt.getValue(this, $$delegatedProperties[2]);
    }

    private final RecyclerView getRecyclerView() {
        return (RecyclerView) this.recyclerView.getValue(this, $$delegatedProperties[3]);
    }

    private final Button getPrimaryButton() {
        return (Button) this.primaryButton.getValue(this, $$delegatedProperties[4]);
    }

    private final Button getSecondaryButton() {
        return (Button) this.secondaryButton.getValue(this, $$delegatedProperties[5]);
    }

    private final ShimmerLoadingView getLoadingView() {
        return (ShimmerLoadingView) this.loadingView.getValue(this, $$delegatedProperties[6]);
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

    private final DirectDepositSplashDuxo getDuxo() {
        return (DirectDepositSplashDuxo) this.duxo.getValue();
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[7]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bulletsAdapter$lambda$0(DirectDepositSplashFragment directDepositSplashFragment, RdsRowView of, DirectDepositSplashViewState2 it) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(it, "it");
        directDepositSplashFragment.bindBullet(of, it);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        ImageLoader imageLoader = getImageLoader();
        ImageDensityUrl imageDensityUrl = new ImageDensityUrl(DIRECT_DEPOSIT_SETUP_PATH, DIRECT_DEPOSIT_SETUP_PREFIX);
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        ImageLoader.ImageRequest.DefaultImpls.into$default(imageLoader.load(imageDensityUrl.getImageDensityUrl(ContextsUiExtensions.getDensitySpec(contextRequireContext))), getImageView(), null, null, 6, null);
        getRecyclerView().setLayoutManager(new LinearLayoutManager(getContext()));
        bindAdapter(getRecyclerView(), this.bulletsAdapter);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        EventLogger.DefaultImpls.logAppear$default(getEventLogger(), null, new Screen(Screen.Name.DD_INTRO, null, null, null, 14, null), null, null, null, 29, null);
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnFastPath(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C140871(this));
    }

    /* compiled from: DirectDepositSplashFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.directdeposit.ui.intro.DirectDepositSplashFragment$onStart$1 */
    /* synthetic */ class C140871 extends FunctionReferenceImpl implements Function1<DirectDepositSplashViewState, Unit> {
        C140871(Object obj) {
            super(1, obj, DirectDepositSplashFragment.class, "refreshUi", "refreshUi(Lcom/robinhood/android/directdeposit/ui/intro/DirectDepositSplashViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DirectDepositSplashViewState directDepositSplashViewState) {
            invoke2(directDepositSplashViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DirectDepositSplashViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((DirectDepositSplashFragment) this.receiver).refreshUi(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshUi(DirectDepositSplashViewState state) {
        getLoadingView().setVisibility(state.getIsLoading() ? 0 : 8);
        Integer titleResId = state.getTitleResId();
        if (titleResId != null) {
            getTitleTxt().setText(titleResId.intValue());
        }
        this.bulletsAdapter.submitList(state.getBullets());
        bindDisclosure(getDisclosureTxt(), state);
        final DirectDepositSplashViewState3 primaryButtonState = state.getPrimaryButtonState();
        TextViewsKt.setVisibilityText(getPrimaryButton(), primaryButtonState != null ? getResources().getString(primaryButtonState.getTextResId()) : null);
        OnClickListeners.onClick(getPrimaryButton(), new Function0() { // from class: com.robinhood.android.directdeposit.ui.intro.DirectDepositSplashFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DirectDepositSplashFragment.refreshUi$lambda$2(this.f$0, primaryButtonState);
            }
        });
        final DirectDepositSplashViewState4 secondaryButtonState = state.getSecondaryButtonState();
        Button secondaryButton = getSecondaryButton();
        DirectDepositSplashViewState4 secondaryButtonState2 = state.getSecondaryButtonState();
        TextViewsKt.setVisibilityText(secondaryButton, secondaryButtonState2 != null ? getResources().getString(secondaryButtonState2.getTextResId()) : null);
        OnClickListeners.onClick(getSecondaryButton(), new Function0() { // from class: com.robinhood.android.directdeposit.ui.intro.DirectDepositSplashFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DirectDepositSplashFragment.refreshUi$lambda$4(this.f$0, secondaryButtonState);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshUi$lambda$2(DirectDepositSplashFragment directDepositSplashFragment, DirectDepositSplashViewState3 directDepositSplashViewState3) {
        Callbacks callbacks = directDepositSplashFragment.getCallbacks();
        Intrinsics.checkNotNull(directDepositSplashViewState3);
        callbacks.onSplashPrimaryButtonClicked(directDepositSplashViewState3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshUi$lambda$4(DirectDepositSplashFragment directDepositSplashFragment, DirectDepositSplashViewState4 directDepositSplashViewState4) {
        Callbacks callbacks = directDepositSplashFragment.getCallbacks();
        Intrinsics.checkNotNull(directDepositSplashViewState4);
        callbacks.onSplashSecondaryButtonClicked(directDepositSplashViewState4);
        return Unit.INSTANCE;
    }

    private final void bindBullet(final RdsRowView rdsRowView, DirectDepositSplashViewState2 directDepositSplashViewState2) throws Resources.NotFoundException {
        CharSequence detailText;
        rdsRowView.setPrimaryText(ViewsKt.getString(rdsRowView, directDepositSplashViewState2.getTitleResId()));
        if (directDepositSplashViewState2 instanceof DirectDepositSplashViewState2.Security) {
            Resources resources = rdsRowView.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            detailText = ((DirectDepositSplashViewState2.Security) directDepositSplashViewState2).getDetailText(resources, new Function1() { // from class: com.robinhood.android.directdeposit.ui.intro.DirectDepositSplashFragment$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DirectDepositSplashFragment.bindBullet$lambda$5(rdsRowView, (String) obj);
                }
            });
        } else if (directDepositSplashViewState2 instanceof DirectDepositSplashViewState2.Earn) {
            Resources resources2 = rdsRowView.getResources();
            Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
            detailText = ((DirectDepositSplashViewState2.Earn) directDepositSplashViewState2).getDetailText(resources2);
        } else if (directDepositSplashViewState2 instanceof DirectDepositSplashViewState2.PartialPaycheck) {
            Resources resources3 = rdsRowView.getResources();
            Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
            detailText = ((DirectDepositSplashViewState2.PartialPaycheck) directDepositSplashViewState2).getDetailText(resources3, new C140862(this));
        } else if (directDepositSplashViewState2 instanceof DirectDepositSplashViewState2.EarlyPay) {
            Resources resources4 = rdsRowView.getResources();
            Intrinsics.checkNotNullExpressionValue(resources4, "getResources(...)");
            detailText = ((DirectDepositSplashViewState2.EarlyPay) directDepositSplashViewState2).getDetailText(resources4, new Function0() { // from class: com.robinhood.android.directdeposit.ui.intro.DirectDepositSplashFragment$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DirectDepositSplashFragment.bindBullet$lambda$6(this.f$0);
                }
            });
        } else {
            if (!(directDepositSplashViewState2 instanceof DirectDepositSplashViewState2.SplitYourPaycheck)) {
                throw new NoWhenBranchMatchedException();
            }
            Resources resources5 = rdsRowView.getResources();
            Intrinsics.checkNotNullExpressionValue(resources5, "getResources(...)");
            detailText = ((DirectDepositSplashViewState2.SplitYourPaycheck) directDepositSplashViewState2).getDetailText(resources5);
        }
        rdsRowView.setSecondaryText(detailText);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindBullet$lambda$5(RdsRowView rdsRowView, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        WebUtils.viewUrl$default(rdsRowView.getContext(), it, 0, 4, (Object) null);
        return Unit.INSTANCE;
    }

    /* compiled from: DirectDepositSplashFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.directdeposit.ui.intro.DirectDepositSplashFragment$bindBullet$2 */
    /* synthetic */ class C140862 extends AdaptedFunctionReference implements Function1<String, Unit> {
        C140862(Object obj) {
            super(1, obj, DirectDepositSplashFragment.class, "startDisclosureActivity", "startDisclosureActivity(Ljava/lang/String;Ljava/util/Map;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            DirectDepositSplashFragment.startDisclosureActivity$default((DirectDepositSplashFragment) this.receiver, p0, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindBullet$lambda$6(DirectDepositSplashFragment directDepositSplashFragment) {
        Navigator navigator = directDepositSplashFragment.getNavigator();
        Context contextRequireContext = directDepositSplashFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new LegacyIntentKey.EarlyPayEnrollment(true), null, false, null, null, 60, null);
        return Unit.INSTANCE;
    }

    private final void bindDisclosure(TextView textView, final DirectDepositSplashViewState directDepositSplashViewState) {
        textView.setVisibility(!directDepositSplashViewState.getIsLoading() ? 0 : 8);
        Integer disclosureLabelRes = directDepositSplashViewState.getDisclosureLabelRes();
        if (disclosureLabelRes != null) {
            textView.setText(disclosureLabelRes.intValue());
        }
        final String disclosureContentfulId = directDepositSplashViewState.getDisclosureContentfulId();
        if (disclosureContentfulId != null) {
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, C20690R.drawable.ic_rds_pop_out_16dp, 0);
            OnClickListeners.onClick(textView, new Function0() { // from class: com.robinhood.android.directdeposit.ui.intro.DirectDepositSplashFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DirectDepositSplashFragment.bindDisclosure$lambda$8(this.f$0, disclosureContentfulId, directDepositSplashViewState);
                }
            });
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            OnClickListeners.onClick(textView, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindDisclosure$lambda$8(DirectDepositSplashFragment directDepositSplashFragment, String str, DirectDepositSplashViewState directDepositSplashViewState) {
        directDepositSplashFragment.startDisclosureActivity(str, directDepositSplashViewState.getDisclosureContentfulParams());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void startDisclosureActivity$default(DirectDepositSplashFragment directDepositSplashFragment, String str, Map map, int i, Object obj) {
        if ((i & 2) != 0) {
            map = null;
        }
        directDepositSplashFragment.startDisclosureActivity(str, map);
    }

    private final void startDisclosureActivity(String contentfulId, Map<String, String> contentfulParams) {
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new RemoteDisclosureKey(contentfulId, contentfulParams, false, false, null, null, null, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, null), null, false, null, null, 60, null);
    }

    /* compiled from: DirectDepositSplashFragment.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/intro/DirectDepositSplashFragment$Args;", "Landroid/os/Parcelable;", "fromRhyMigration", "", "<init>", "(Z)V", "getFromRhyMigration", "()Z", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final boolean fromRhyMigration;

        /* compiled from: DirectDepositSplashFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readInt() != 0);
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
            dest.writeInt(this.fromRhyMigration ? 1 : 0);
        }

        public Args(boolean z) {
            this.fromRhyMigration = z;
        }

        public final boolean getFromRhyMigration() {
            return this.fromRhyMigration;
        }
    }

    /* compiled from: DirectDepositSplashFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/intro/DirectDepositSplashFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/directdeposit/ui/intro/DirectDepositSplashFragment;", "Lcom/robinhood/android/directdeposit/ui/intro/DirectDepositSplashFragment$Args;", "<init>", "()V", "DIRECT_DEPOSIT_SETUP_PATH", "", "DIRECT_DEPOSIT_SETUP_PREFIX", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<DirectDepositSplashFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(DirectDepositSplashFragment directDepositSplashFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, directDepositSplashFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public DirectDepositSplashFragment newInstance(Args args) {
            return (DirectDepositSplashFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(DirectDepositSplashFragment directDepositSplashFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, directDepositSplashFragment, args);
        }
    }
}
