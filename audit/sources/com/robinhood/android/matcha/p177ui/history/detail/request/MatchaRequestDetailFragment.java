package com.robinhood.android.matcha.p177ui.history.detail.request;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.designsystem.button.RdsButtonBarView;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.designsystem.compose.ThemesFromScarlet;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.matcha.C21284R;
import com.robinhood.android.matcha.databinding.FragmentMatchaRequestDetailBinding;
import com.robinhood.android.matcha.p177ui.common.ErrorHandling;
import com.robinhood.android.matcha.p177ui.history.detail.request.MatchaRequestDetailState4;
import com.robinhood.android.models.matcha.api.MatchaMemo;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.compose.bento.component.BentoPogSize;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.p2p.common.ProfileAvatar3;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.resource.StringResource;
import io.reactivex.Observable;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
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

/* compiled from: MatchaRequestDetailFragment.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0011H\u0016J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001aH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/detail/request/MatchaRequestDetailFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "binding", "Lcom/robinhood/android/matcha/databinding/FragmentMatchaRequestDetailBinding;", "getBinding", "()Lcom/robinhood/android/matcha/databinding/FragmentMatchaRequestDetailBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/matcha/ui/history/detail/request/MatchaRequestDetailDuxo;", "getDuxo", "()Lcom/robinhood/android/matcha/ui/history/detail/request/MatchaRequestDetailDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "bind", "state", "Lcom/robinhood/android/matcha/ui/history/detail/request/MatchaRequestDetailState;", "onRequestActionComplete", MatchaRequestDetailFragment.EXTRA_CONFIRMATION_TEXT, "", "Companion", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class MatchaRequestDetailFragment extends BaseFragment {
    public static final String EXTRA_CONFIRMATION_TEXT = "confirmationText";
    public static final String EXTRA_REQUEST_ID = "requestId";

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(MatchaRequestDetailFragment.class, "binding", "getBinding()Lcom/robinhood/android/matcha/databinding/FragmentMatchaRequestDetailBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public MatchaRequestDetailFragment() {
        super(C21284R.layout.fragment_matcha_request_detail);
        this.binding = ViewBinding5.viewBinding(this, MatchaRequestDetailFragment3.INSTANCE);
        this.duxo = OldDuxos.oldDuxo(this, MatchaRequestDetailDuxo.class);
    }

    private final FragmentMatchaRequestDetailBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentMatchaRequestDetailBinding) value;
    }

    private final MatchaRequestDetailDuxo getDuxo() {
        return (MatchaRequestDetailDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ScarletManager.putOverlay$default(getScarletManager(), AchromaticOverlay.INSTANCE, null, 2, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C213281(this));
    }

    /* compiled from: MatchaRequestDetailFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.matcha.ui.history.detail.request.MatchaRequestDetailFragment$onResume$1 */
    /* synthetic */ class C213281 extends FunctionReferenceImpl implements Function1<MatchaRequestDetailState, Unit> {
        C213281(Object obj) {
            super(1, obj, MatchaRequestDetailFragment.class, "bind", "bind(Lcom/robinhood/android/matcha/ui/history/detail/request/MatchaRequestDetailState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MatchaRequestDetailState matchaRequestDetailState) throws Resources.NotFoundException {
            invoke2(matchaRequestDetailState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(MatchaRequestDetailState p0) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((MatchaRequestDetailFragment) this.receiver).bind(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(final MatchaRequestDetailState state) throws Resources.NotFoundException {
        CharSequence text;
        CharSequence text2;
        StringResource text3;
        StringResource text4;
        Throwable thConsume;
        FragmentMatchaRequestDetailBinding binding = getBinding();
        ShimmerLoadingView loadingView = binding.loadingView;
        Intrinsics.checkNotNullExpressionValue(loadingView, "loadingView");
        loadingView.setVisibility(state.getIsFullscreenLoading() ? 0 : 8);
        UiEvent<Throwable> errorEvent = state.getErrorEvent();
        if (errorEvent != null && (thConsume = errorEvent.consume()) != null) {
            ErrorHandling.getMatchaErrorHandler(requireBaseActivity()).invoke((ActivityErrorHandler) thConsume);
        }
        UiEvent<StringResource> requestActionComplete = state.getRequestActionComplete();
        CharSequence text5 = null;
        StringResource stringResourceConsume = requestActionComplete != null ? requestActionComplete.consume() : null;
        if (stringResourceConsume != null) {
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            onRequestActionComplete(stringResourceConsume.getText(resources));
        }
        final MatchaRequestDetailState4 requestState = state.getRequestState();
        if (requestState == null) {
            return;
        }
        RhTextView rhTextView = binding.titleText;
        StringResource title = requestState.getTitle();
        Resources resources2 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        rhTextView.setText(title.getText(resources2));
        RhTextView rhTextView2 = binding.subtitleText;
        Resources resources3 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
        rhTextView2.setText(requestState.getSubtitle(resources3));
        RhTextView memoText = binding.memoText;
        Intrinsics.checkNotNullExpressionValue(memoText, "memoText");
        MatchaMemo memo = requestState.getRequest().getMemo();
        TextViewsKt.setVisibilityText(memoText, memo != null ? memo.getContent() : null);
        binding.avatarComposeView.setContent(ComposableLambda3.composableLambdaInstance(-1409902247, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.matcha.ui.history.detail.request.MatchaRequestDetailFragment$bind$1$1
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
                    ComposerKt.traceEventStart(-1409902247, i, -1, "com.robinhood.android.matcha.ui.history.detail.request.MatchaRequestDetailFragment.bind.<anonymous>.<anonymous> (MatchaRequestDetailFragment.kt:60)");
                }
                Observable<ThemesFromScarlet> observableThemeChangesForCompose = ScarletComposeInterop.themeChangesForCompose(this.this$0.getScarletManager());
                final MatchaRequestDetailState4 matchaRequestDetailState4 = requestState;
                BentoTheme2.BentoTheme(observableThemeChangesForCompose, null, ComposableLambda3.rememberComposableLambda(312664295, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.matcha.ui.history.detail.request.MatchaRequestDetailFragment$bind$1$1.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i2) {
                        if ((i2 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(312664295, i2, -1, "com.robinhood.android.matcha.ui.history.detail.request.MatchaRequestDetailFragment.bind.<anonymous>.<anonymous>.<anonymous> (MatchaRequestDetailFragment.kt:61)");
                        }
                        ProfileAvatar3.ProfileAvatar(matchaRequestDetailState4.getProfileAvatarState(), Modifier.INSTANCE, BentoPogSize.ExtraLarge, null, composer2, 432, 8);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, 384, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        RdsButtonBarView rdsButtonBarView = binding.requestActionsButtonBar;
        Intrinsics.checkNotNull(rdsButtonBarView);
        rdsButtonBarView.setVisibility(state.isButtonBarVisible() ? 0 : 8);
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        StringResource summaryText = requestState.getSummaryText(contextRequireContext);
        if (summaryText != null) {
            Resources resources4 = rdsButtonBarView.getResources();
            Intrinsics.checkNotNullExpressionValue(resources4, "getResources(...)");
            text = summaryText.getText(resources4);
        } else {
            text = null;
        }
        rdsButtonBarView.setText(text);
        MatchaRequestDetailState4.ButtonAction primaryAction = requestState.getPrimaryAction();
        if (primaryAction == null || (text4 = primaryAction.getText()) == null) {
            text2 = null;
        } else {
            Resources resources5 = rdsButtonBarView.getResources();
            Intrinsics.checkNotNullExpressionValue(resources5, "getResources(...)");
            text2 = text4.getText(resources5);
        }
        rdsButtonBarView.setPrimaryButtonText(text2);
        MatchaRequestDetailState4.ButtonAction secondaryAction = requestState.getSecondaryAction();
        if (secondaryAction != null && (text3 = secondaryAction.getText()) != null) {
            Resources resources6 = rdsButtonBarView.getResources();
            Intrinsics.checkNotNullExpressionValue(resources6, "getResources(...)");
            text5 = text3.getText(resources6);
        }
        rdsButtonBarView.setSecondaryButtonText(text5);
        rdsButtonBarView.setPrimaryButtonLoading(state.getIsPrimaryButtonLoading());
        rdsButtonBarView.setSecondaryButtonLoading(state.getIsSecondaryButtonLoading());
        rdsButtonBarView.onPrimaryButtonClick(new Function0() { // from class: com.robinhood.android.matcha.ui.history.detail.request.MatchaRequestDetailFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MatchaRequestDetailFragment.bind$lambda$3$lambda$2$lambda$0(this.f$0, state);
            }
        });
        rdsButtonBarView.onSecondaryButtonClick(new Function0() { // from class: com.robinhood.android.matcha.ui.history.detail.request.MatchaRequestDetailFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MatchaRequestDetailFragment.bind$lambda$3$lambda$2$lambda$1(this.f$0, state);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$3$lambda$2$lambda$0(MatchaRequestDetailFragment matchaRequestDetailFragment, MatchaRequestDetailState matchaRequestDetailState) {
        matchaRequestDetailFragment.getDuxo().onPrimaryButtonClick(matchaRequestDetailState);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$3$lambda$2$lambda$1(MatchaRequestDetailFragment matchaRequestDetailFragment, MatchaRequestDetailState matchaRequestDetailState) {
        matchaRequestDetailFragment.getDuxo().onSecondaryButtonClick(matchaRequestDetailState);
        return Unit.INSTANCE;
    }

    private final void onRequestActionComplete(CharSequence confirmationText) {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        if (fragmentActivityRequireActivity.getCallingActivity() != null) {
            fragmentActivityRequireActivity.setResult(-1, new Intent().putExtra("requestId", ((LegacyFragmentKey.MatchaRequestDetail) INSTANCE.getArgs((Fragment) this)).getRequestId()).putExtra(EXTRA_CONFIRMATION_TEXT, confirmationText));
        } else {
            ContextsUiExtensions.showLongToast(fragmentActivityRequireActivity, confirmationText);
        }
        fragmentActivityRequireActivity.finish();
    }

    /* compiled from: MatchaRequestDetailFragment.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00030\u0004B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0080T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/detail/request/MatchaRequestDetailFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/matcha/ui/history/detail/request/MatchaRequestDetailFragment;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$MatchaRequestDetail;", "Lcom/robinhood/android/navigation/FragmentResolver;", "<init>", "()V", "EXTRA_REQUEST_ID", "", "EXTRA_CONFIRMATION_TEXT", "createFragment", "key", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<MatchaRequestDetailFragment, LegacyFragmentKey.MatchaRequestDetail>, FragmentResolver<LegacyFragmentKey.MatchaRequestDetail> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyFragmentKey.MatchaRequestDetail getArgs(MatchaRequestDetailFragment matchaRequestDetailFragment) {
            return (LegacyFragmentKey.MatchaRequestDetail) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, matchaRequestDetailFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public MatchaRequestDetailFragment newInstance(LegacyFragmentKey.MatchaRequestDetail matchaRequestDetail) {
            return (MatchaRequestDetailFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, matchaRequestDetail);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(MatchaRequestDetailFragment matchaRequestDetailFragment, LegacyFragmentKey.MatchaRequestDetail matchaRequestDetail) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, matchaRequestDetailFragment, matchaRequestDetail);
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public MatchaRequestDetailFragment createFragment(LegacyFragmentKey.MatchaRequestDetail key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return (MatchaRequestDetailFragment) newInstance((Parcelable) key);
        }
    }
}
