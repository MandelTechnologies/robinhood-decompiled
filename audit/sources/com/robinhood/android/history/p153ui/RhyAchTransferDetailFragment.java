package com.robinhood.android.history.p153ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.rxjava2.RxJava2Adapter;
import androidx.fragment.app.Fragment;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.extensions.Snackbars;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.designsystem.row.RdsDataRowView;
import com.robinhood.android.history.C18359R;
import com.robinhood.android.history.databinding.FragmentRhyAchTransferDetailBinding;
import com.robinhood.android.history.util.UppercaseFirst;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.transfers.gold.GoldDepositBoostTransferDetail;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.resource.StringResource;
import io.noties.markwon.Markwon;
import java.util.List;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: RhyAchTransferDetailFragment.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\b\u0007\u0018\u0000 &2\u00020\u0001:\u0002%&B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010$\u001a\u00020\u001fH\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u0017X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006'²\u0006\n\u0010(\u001a\u00020)X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/history/ui/RhyAchTransferDetailFragment;", "Lcom/robinhood/android/history/ui/BaseDetailFragment;", "<init>", "()V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "binding", "Lcom/robinhood/android/history/databinding/FragmentRhyAchTransferDetailBinding;", "getBinding", "()Lcom/robinhood/android/history/databinding/FragmentRhyAchTransferDetailBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/history/ui/RhyAchTransferDetailDuxo;", "getDuxo", "()Lcom/robinhood/android/history/ui/RhyAchTransferDetailDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "hasBottomBar", "", "getHasBottomBar", "()Z", "revealTransitionName", "", "getRevealTransitionName", "()Ljava/lang/String;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "Args", "Companion", "feature-history_externalDebug", "viewState", "Lcom/robinhood/android/history/ui/RhyAchTransferDetailViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class RhyAchTransferDetailFragment extends BaseDetailFragment {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final boolean hasBottomBar;
    public Markwon markwon;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RhyAchTransferDetailFragment.class, "binding", "getBinding()Lcom/robinhood/android/history/databinding/FragmentRhyAchTransferDetailBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public RhyAchTransferDetailFragment() {
        super(C18359R.layout.fragment_rhy_ach_transfer_detail);
        this.binding = ViewBinding5.viewBinding(this, RhyAchTransferDetailFragment2.INSTANCE);
        this.duxo = OldDuxos.oldDuxo(this, RhyAchTransferDetailDuxo.class);
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

    private final FragmentRhyAchTransferDetailBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentRhyAchTransferDetailBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RhyAchTransferDetailDuxo getDuxo() {
        return (RhyAchTransferDetailDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getHasBottomBar() {
        return this.hasBottomBar;
    }

    @Override // com.robinhood.android.history.p153ui.BaseDetailFragment
    public String getRevealTransitionName() {
        String string2 = ((Args) INSTANCE.getArgs((Fragment) this)).getTransferId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    @Override // com.robinhood.android.history.p153ui.BaseDetailFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getExpandedToolbarSubtitleTxt().setVisibility(0);
        RdsButton cancelButton = getBinding().cancelButton;
        Intrinsics.checkNotNullExpressionValue(cancelButton, "cancelButton");
        OnClickListeners.onClick(cancelButton, new C184151(getDuxo()));
        getBinding().iraInfoSection.setContent(ComposableLambda3.composableLambdaInstance(1522671861, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.history.ui.RhyAchTransferDetailFragment.onViewCreated.2
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
                    ComposerKt.traceEventStart(1522671861, i, -1, "com.robinhood.android.history.ui.RhyAchTransferDetailFragment.onViewCreated.<anonymous> (RhyAchTransferDetailFragment.kt:50)");
                }
                final List<UIComponent<GenericAction>> iraInfoRows = invoke$lambda$0(RxJava2Adapter.subscribeAsState(RhyAchTransferDetailFragment.this.getDuxo().getStates(), new RhyAchTransferDetailViewState(null, null, null, null, false, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null), composer, 0)).getIraInfoRows();
                if (iraInfoRows != null) {
                    final RhyAchTransferDetailFragment rhyAchTransferDetailFragment = RhyAchTransferDetailFragment.this;
                    BentoTheme2.BentoTheme(ScarletComposeInterop.themeChangesForCompose(rhyAchTransferDetailFragment.getScarletManager()), null, ComposableLambda3.rememberComposableLambda(-1186962286, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.history.ui.RhyAchTransferDetailFragment$onViewCreated$2$1$1
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
                                ComposerKt.traceEventStart(-1186962286, i2, -1, "com.robinhood.android.history.ui.RhyAchTransferDetailFragment.onViewCreated.<anonymous>.<anonymous>.<anonymous> (RhyAchTransferDetailFragment.kt:53)");
                            }
                            ImmutableList3 persistentList = extensions2.toPersistentList(iraInfoRows);
                            composer2.startReplaceGroup(5004770);
                            boolean zChangedInstance = composer2.changedInstance(rhyAchTransferDetailFragment);
                            final RhyAchTransferDetailFragment rhyAchTransferDetailFragment2 = rhyAchTransferDetailFragment;
                            Object objRememberedValue = composer2.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new SduiActionHandler() { // from class: com.robinhood.android.history.ui.RhyAchTransferDetailFragment$onViewCreated$2$1$1$1$1
                                    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
                                    /* renamed from: handle, reason: merged with bridge method [inline-methods] */
                                    public final boolean mo15941handle(GenericAction action) {
                                        Intrinsics.checkNotNullParameter(action, "action");
                                        if (action instanceof GenericAction.Deeplink) {
                                            Uri uri = Uri.parse(((GenericAction.Deeplink) action).getValue2().getUri());
                                            Navigator navigator = rhyAchTransferDetailFragment2.getNavigator();
                                            Context contextRequireContext = rhyAchTransferDetailFragment2.requireContext();
                                            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                                            Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, uri, null, null, false, null, 60, null);
                                            return true;
                                        }
                                        if ((action instanceof GenericAction.Dismiss) || (action instanceof GenericAction.InfoAlert)) {
                                            return true;
                                        }
                                        throw new NoWhenBranchMatchedException();
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue);
                            }
                            composer2.endReplaceGroup();
                            composer2.startReplaceGroup(-1772220517);
                            SduiColumns.SduiColumn(persistentList, GenericAction.class, Modifier.INSTANCE, null, (SduiActionHandler) objRememberedValue, HorizontalPadding.Default, Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), false, composer2, 100663296, 0);
                            composer2.endReplaceGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer, 54), composer, 384, 2);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            private static final RhyAchTransferDetailViewState invoke$lambda$0(SnapshotState4<RhyAchTransferDetailViewState> snapshotState4) {
                return snapshotState4.getValue();
            }
        }));
    }

    /* compiled from: RhyAchTransferDetailFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.history.ui.RhyAchTransferDetailFragment$onViewCreated$1 */
    /* synthetic */ class C184151 extends FunctionReferenceImpl implements Function0<Unit> {
        C184151(Object obj) {
            super(0, obj, RhyAchTransferDetailDuxo.class, "cancelTransfer", "cancelTransfer()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((RhyAchTransferDetailDuxo) this.receiver).cancelTransfer();
        }
    }

    @Override // com.robinhood.android.history.p153ui.BaseDetailFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.history.ui.RhyAchTransferDetailFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyAchTransferDetailFragment.onResume$lambda$3(this.f$0, (RhyAchTransferDetailViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit onResume$lambda$3(RhyAchTransferDetailFragment rhyAchTransferDetailFragment, RhyAchTransferDetailViewState state) throws Resources.NotFoundException {
        CharSequence text;
        String strUppercaseFirst;
        String strUppercaseFirst2;
        CharSequence text2;
        Drawable drawable;
        String detailText;
        Throwable thConsume;
        Intrinsics.checkNotNullParameter(state, "state");
        rhyAchTransferDetailFragment.getExpandedToolbarTitleTxt().setText(state.getTitleText());
        TextView expandedToolbarSubtitleTxt = rhyAchTransferDetailFragment.getExpandedToolbarSubtitleTxt();
        StringResource subtitleText = state.getSubtitleText();
        if (subtitleText != null) {
            Resources resources = rhyAchTransferDetailFragment.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            text = subtitleText.getText(resources);
        } else {
            text = null;
        }
        expandedToolbarSubtitleTxt.setText(text);
        rhyAchTransferDetailFragment.getBinding().initiatedRow.setVisibilityValueText(state.getInitiatedText());
        rhyAchTransferDetailFragment.getBinding().estAvailabilityRow.setVisibilityValueText(state.getEstimatedAvailabilityText());
        RdsDataRowView rdsDataRowView = rhyAchTransferDetailFragment.getBinding().statusRow;
        Integer statusResId = state.getStatusResId();
        rdsDataRowView.setVisibilityValueText(statusResId != null ? rhyAchTransferDetailFragment.getString(statusResId.intValue()) : null);
        RdsDataRowView rdsDataRowView2 = rhyAchTransferDetailFragment.getBinding().sourceRow;
        StringResource sourceText = state.getSourceText();
        if (sourceText != null) {
            Resources resources2 = rhyAchTransferDetailFragment.getResources();
            Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
            CharSequence text3 = sourceText.getText(resources2);
            strUppercaseFirst = text3 != null ? UppercaseFirst.uppercaseFirst(text3) : null;
        }
        rdsDataRowView2.setVisibilityValueText(strUppercaseFirst);
        RdsDataRowView rdsDataRowView3 = rhyAchTransferDetailFragment.getBinding().destinationRow;
        StringResource destinationText = state.getDestinationText();
        if (destinationText != null) {
            Resources resources3 = rhyAchTransferDetailFragment.getResources();
            Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
            CharSequence text4 = destinationText.getText(resources3);
            strUppercaseFirst2 = text4 != null ? UppercaseFirst.uppercaseFirst(text4) : null;
        }
        rdsDataRowView3.setVisibilityValueText(strUppercaseFirst2);
        ComposeView iraInfoSection = rhyAchTransferDetailFragment.getBinding().iraInfoSection;
        Intrinsics.checkNotNullExpressionValue(iraInfoSection, "iraInfoSection");
        List<UIComponent<GenericAction>> iraInfoRows = state.getIraInfoRows();
        iraInfoSection.setVisibility(!(iraInfoRows == null || iraInfoRows.isEmpty()) ? 0 : 8);
        RdsButton cancelButton = rhyAchTransferDetailFragment.getBinding().cancelButton;
        Intrinsics.checkNotNullExpressionValue(cancelButton, "cancelButton");
        cancelButton.setVisibility(state.isCancelButtonVisible() ? 0 : 8);
        LinearLayout stickyFooterContent = rhyAchTransferDetailFragment.getBinding().stickyFooterContent;
        Intrinsics.checkNotNullExpressionValue(stickyFooterContent, "stickyFooterContent");
        stickyFooterContent.setVisibility(state.getIsAnyFooterContentVisible() ? 0 : 8);
        ShimmerLoadingView loadingView = rhyAchTransferDetailFragment.getBinding().loadingView;
        Intrinsics.checkNotNullExpressionValue(loadingView, "loadingView");
        loadingView.setVisibility(state.isCancelRequestInFlight() ? 0 : 8);
        RdsDataRowView rdsDataRowView4 = rhyAchTransferDetailFragment.getBinding().acatMatchRemovalRow;
        StringResource acatMatchRemovalText = state.getAcatMatchRemovalText();
        if (acatMatchRemovalText != null) {
            Resources resources4 = rhyAchTransferDetailFragment.getResources();
            Intrinsics.checkNotNullExpressionValue(resources4, "getResources(...)");
            text2 = acatMatchRemovalText.getText(resources4);
        } else {
            text2 = null;
        }
        rdsDataRowView4.setVisibilityValueText(text2);
        UiEvent<Throwable> cancelErrorEvent = state.getCancelErrorEvent();
        if (cancelErrorEvent != null && (thConsume = cancelErrorEvent.consume()) != null) {
            rhyAchTransferDetailFragment.getActivityErrorHandler().invoke((ActivityErrorHandler) thConsume);
        }
        UiEvent<Unit> cancelSuccessEvent = state.getCancelSuccessEvent();
        if ((cancelSuccessEvent != null ? cancelSuccessEvent.consume() : null) != null) {
            FrameLayout root = rhyAchTransferDetailFragment.getBinding().getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            Snackbars.make(root, C18359R.string.ach_transfer_detail_canceled_confirmation, 0).show();
        }
        RdsDataRowView rdsDataRowView5 = rhyAchTransferDetailFragment.getBinding().goldDepositBoostRow;
        Integer goldDepositBoostIconRes = state.getGoldDepositBoostIconRes();
        if (goldDepositBoostIconRes != null) {
            Intrinsics.checkNotNull(rdsDataRowView5);
            drawable = ViewsKt.getDrawable(rdsDataRowView5, goldDepositBoostIconRes.intValue());
        } else {
            drawable = null;
        }
        rdsDataRowView5.setValueIconRightDrawable(drawable);
        GoldDepositBoostTransferDetail goldDepositBoost = state.getGoldDepositBoost();
        rdsDataRowView5.setLabelText(goldDepositBoost != null ? goldDepositBoost.getAmountTitle() : null);
        GoldDepositBoostTransferDetail goldDepositBoost2 = state.getGoldDepositBoost();
        rdsDataRowView5.setValueText(goldDepositBoost2 != null ? goldDepositBoost2.getAmountText() : null);
        GoldDepositBoostTransferDetail goldDepositBoost3 = state.getGoldDepositBoost();
        if (goldDepositBoost3 != null && (detailText = goldDepositBoost3.getDetailText()) != null) {
            rdsDataRowView5.setDescriptionText(rhyAchTransferDetailFragment.getMarkwon().toMarkdown(detailText));
        }
        Intrinsics.checkNotNull(rdsDataRowView5);
        rdsDataRowView5.setVisibility(state.getIsGoldDepositBoostRowVisible() ? 0 : 8);
        return Unit.INSTANCE;
    }

    /* compiled from: RhyAchTransferDetailFragment.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/history/ui/RhyAchTransferDetailFragment$Args;", "Landroid/os/Parcelable;", "transferId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getTransferId", "()Ljava/util/UUID;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final UUID transferId;

        /* compiled from: RhyAchTransferDetailFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = args.transferId;
            }
            return args.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getTransferId() {
            return this.transferId;
        }

        public final Args copy(UUID transferId) {
            Intrinsics.checkNotNullParameter(transferId, "transferId");
            return new Args(transferId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Args) && Intrinsics.areEqual(this.transferId, ((Args) other).transferId);
        }

        public int hashCode() {
            return this.transferId.hashCode();
        }

        public String toString() {
            return "Args(transferId=" + this.transferId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.transferId);
        }

        public Args(UUID transferId) {
            Intrinsics.checkNotNullParameter(transferId, "transferId");
            this.transferId = transferId;
        }

        public final UUID getTransferId() {
            return this.transferId;
        }
    }

    /* compiled from: RhyAchTransferDetailFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/history/ui/RhyAchTransferDetailFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/history/ui/RhyAchTransferDetailFragment;", "Lcom/robinhood/android/history/ui/RhyAchTransferDetailFragment$Args;", "<init>", "()V", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<RhyAchTransferDetailFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(RhyAchTransferDetailFragment rhyAchTransferDetailFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, rhyAchTransferDetailFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RhyAchTransferDetailFragment newInstance(Args args) {
            return (RhyAchTransferDetailFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RhyAchTransferDetailFragment rhyAchTransferDetailFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, rhyAchTransferDetailFragment, args);
        }
    }
}
