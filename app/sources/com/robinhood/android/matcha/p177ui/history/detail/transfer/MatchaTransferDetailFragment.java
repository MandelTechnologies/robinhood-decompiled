package com.robinhood.android.matcha.p177ui.history.detail.transfer;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.FragmentManager;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.extensions.Contexts7;
import com.robinhood.android.common.util.extensions.LearnMoresKt;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.common.util.text.ActionSpan;
import com.robinhood.android.designsystem.banner.RdsInfoBannerView;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.designsystem.compose.ThemesFromScarlet;
import com.robinhood.android.designsystem.row.RdsDataRowView;
import com.robinhood.android.designsystem.snackbar.RdsSnackbar;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.history.contracts.MatchaTransferDetailFragmentKey;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.matcha.C21284R;
import com.robinhood.android.matcha.databinding.FragmentMatchaTransferDetailBinding;
import com.robinhood.android.matcha.p177ui.block.MatchaBlockConfirmationDialogFragment;
import com.robinhood.android.matcha.p177ui.common.RosettaConverters;
import com.robinhood.android.matcha.p177ui.history.detail.transfer.MatchaTransferDetailFragment;
import com.robinhood.android.matcha.p177ui.history.detail.transfer.MatchaTransferDetailViewState;
import com.robinhood.android.matcha.p177ui.memo.MemoInputActivity;
import com.robinhood.android.matcha.p177ui.profile.MatchaProfileMenuBottomSheet;
import com.robinhood.android.models.matcha.api.ApiMatchaIdentifier;
import com.robinhood.android.models.matcha.api.ApiMatchaIdentifier2;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.social.contracts.CreateReportFragmentKey;
import com.robinhood.android.social.contracts.matcha.MatchaProfile;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoInfoBanner2;
import com.robinhood.compose.bento.component.BentoPogSize;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.models.p320db.matcha.MatchaUser;
import com.robinhood.p2p.common.ProfileAvatar3;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.resource.StringResource;
import io.reactivex.Observable;
import kotlin.ExceptionsH;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: MatchaTransferDetailFragment.kt */
@Metadata(m3635d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 g2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001gB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0016J\u0010\u00102\u001a\u00020/2\u0006\u00103\u001a\u000204H\u0016J\u001a\u00105\u001a\u00020/2\u0006\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u000109H\u0016J\u0010\u0010:\u001a\u00020/2\u0006\u0010;\u001a\u00020<H\u0002J\u0012\u0010=\u001a\u00020/2\b\u00108\u001a\u0004\u0018\u000109H\u0016J\u0018\u0010>\u001a\u00020/2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020BH\u0014J\u0010\u0010C\u001a\u00020\u001d2\u0006\u0010D\u001a\u00020EH\u0016J\u0010\u0010F\u001a\u00020/2\u0006\u0010?\u001a\u00020@H\u0016J\b\u0010G\u001a\u00020/H\u0016J\b\u0010H\u001a\u00020/H\u0016J\b\u0010I\u001a\u00020/H\u0016J\b\u0010J\u001a\u00020/H\u0016J\u0010\u0010K\u001a\u00020/2\u0006\u0010L\u001a\u00020MH\u0002J\u0010\u0010N\u001a\u00020/2\u0006\u0010O\u001a\u00020PH\u0002J\u0018\u0010Q\u001a\u00020/2\u0006\u0010R\u001a\u00020\u001d2\u0006\u0010S\u001a\u00020TH\u0002J\u0010\u0010U\u001a\u00020/2\u0006\u0010V\u001a\u00020WH\u0002J\u0015\u0010X\u001a\u00020/2\u0006\u0010Y\u001a\u00020ZH\u0003¢\u0006\u0002\u0010[J\u001f\u0010\\\u001a\u00020/2\u0006\u0010]\u001a\u00020^2\b\u0010_\u001a\u0004\u0018\u00010^H\u0003¢\u0006\u0002\u0010`J\r\u0010a\u001a\u00020/H\u0003¢\u0006\u0002\u0010bJ\u0016\u0010c\u001a\u00020/*\u00020d2\b\u0010e\u001a\u0004\u0018\u00010fH\u0002R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR/\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u000e8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u001dX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020!X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020%X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u001e\u0010(\u001a\u00020)8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u0006h²\u0006\n\u0010i\u001a\u00020\u001dX\u008a\u008e\u0002"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/detail/transfer/MatchaTransferDetailFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/matcha/ui/profile/MatchaProfileMenuBottomSheet$Callbacks;", "Lcom/robinhood/android/matcha/ui/block/MatchaBlockConfirmationDialogFragment$Callbacks;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "binding", "Lcom/robinhood/android/matcha/databinding/FragmentMatchaTransferDetailBinding;", "getBinding", "()Lcom/robinhood/android/matcha/databinding/FragmentMatchaTransferDetailBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "<set-?>", "Lcom/robinhood/models/db/matcha/MatchaUser;", "transactor", "getTransactor", "()Lcom/robinhood/models/db/matcha/MatchaUser;", "setTransactor", "(Lcom/robinhood/models/db/matcha/MatchaUser;)V", "transactor$delegate", "Lkotlin/properties/ReadWriteProperty;", "duxo", "Lcom/robinhood/android/matcha/ui/history/detail/transfer/MatchaTransferDetailDuxo;", "getDuxo", "()Lcom/robinhood/android/matcha/ui/history/detail/transfer/MatchaTransferDetailDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenEventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "getScreenEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onAttach", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "bind", "state", "Lcom/robinhood/android/matcha/ui/history/detail/transfer/MatchaTransferDetailViewState;", "onCreate", "createOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onOptionsItemSelected", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Landroid/view/MenuItem;", "onPrepareOptionsMenu", "onReportUserRequested", "viewProfile", "onBlockUserRequested", "onBlockActionConfirmed", "showMenuSheet", "args", "Lcom/robinhood/android/matcha/ui/profile/MatchaProfileMenuBottomSheet$Args;", "launchReporting", "key", "Lcom/robinhood/android/social/contracts/CreateReportFragmentKey;", "showBlockConfirmationDialog", "isBlocked", "userFullName", "", "showConfirmationSnackbar", "stringResource", "Lcom/robinhood/utils/resource/StringResource;", "MemoRow", MemoInputActivity.EXTRA_MEMO, "Lcom/robinhood/android/matcha/ui/history/detail/transfer/MatchaTransferDetailViewState$Loaded$Memo;", "(Lcom/robinhood/android/matcha/ui/history/detail/transfer/MatchaTransferDetailViewState$Loaded$Memo;Landroidx/compose/runtime/Composer;I)V", "MemoBanner", "bannerText", "", "bannerCta", "(ILjava/lang/Integer;Landroidx/compose/runtime/Composer;I)V", "BlockedBanner", "(Landroidx/compose/runtime/Composer;I)V", "bindStatusBanner", "Lcom/robinhood/android/designsystem/banner/RdsInfoBannerView;", "statusBanner", "Lcom/robinhood/android/matcha/ui/history/detail/transfer/MatchaTransferDetailViewState$Loaded$StatusBanner;", "Companion", "feature-p2p_externalDebug", "revealedMemo"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class MatchaTransferDetailFragment extends BaseFragment implements MatchaProfileMenuBottomSheet.Callbacks, MatchaBlockConfirmationDialogFragment.Callbacks, AutoLoggableFragment {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public EventLogger eventLogger;
    private final Screen eventScreen;
    private final Context screenEventContext;

    /* renamed from: transactor$delegate, reason: from kotlin metadata */
    private final Interfaces3 transactor;
    private final boolean useDesignSystemToolbar;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(MatchaTransferDetailFragment.class, "binding", "getBinding()Lcom/robinhood/android/matcha/databinding/FragmentMatchaTransferDetailBinding;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(MatchaTransferDetailFragment.class, "transactor", "getTransactor()Lcom/robinhood/models/db/matcha/MatchaUser;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BlockedBanner$lambda$18(MatchaTransferDetailFragment matchaTransferDetailFragment, int i, Composer composer, int i2) {
        matchaTransferDetailFragment.BlockedBanner(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MemoBanner$lambda$15(MatchaTransferDetailFragment matchaTransferDetailFragment, int i, Integer num, int i2, Composer composer, int i3) {
        matchaTransferDetailFragment.MemoBanner(i, num, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MemoRow$lambda$11(MatchaTransferDetailFragment matchaTransferDetailFragment, MatchaTransferDetailViewState.Loaded.Memo memo, int i, Composer composer, int i2) {
        matchaTransferDetailFragment.MemoRow(memo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenAppearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenDisappearEventLogging(this);
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
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    public MatchaTransferDetailFragment() {
        super(C21284R.layout.fragment_matcha_transfer_detail);
        this.binding = ViewBinding5.viewBinding(this, MatchaTransferDetailFragment9.INSTANCE);
        this.transactor = (Interfaces3) BindSavedState2.savedParcelable(this).provideDelegate(this, $$delegatedProperties[1]);
        this.duxo = DuxosKt.duxo(this, MatchaTransferDetailDuxo.class);
        this.useDesignSystemToolbar = true;
        this.eventScreen = new Screen(Screen.Name.TRANSACTION_DETAIL_PAGE, null, null, null, 14, null);
        this.screenEventContext = RosettaConverters.getBaseP2PEventContext();
    }

    private final FragmentMatchaTransferDetailBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentMatchaTransferDetailBinding) value;
    }

    private final MatchaUser getTransactor() {
        return (MatchaUser) this.transactor.getValue(this, $$delegatedProperties[1]);
    }

    private final void setTransactor(MatchaUser matchaUser) {
        this.transactor.setValue(this, $$delegatedProperties[1], matchaUser);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MatchaTransferDetailDuxo getDuxo() {
        return (MatchaTransferDetailDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Context getScreenEventContext() {
        return this.screenEventContext;
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MemoRow$lambda$9(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setElevation(0.0f);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    /* compiled from: MatchaTransferDetailFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.history.detail.transfer.MatchaTransferDetailFragment$onViewCreated$1", m3645f = "MatchaTransferDetailFragment.kt", m3646l = {99}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.matcha.ui.history.detail.transfer.MatchaTransferDetailFragment$onViewCreated$1 */
    static final class C213451 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C213451(Continuation<? super C213451> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MatchaTransferDetailFragment.this.new C213451(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C213451) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: MatchaTransferDetailFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.matcha.ui.history.detail.transfer.MatchaTransferDetailFragment$onViewCreated$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ MatchaTransferDetailFragment $tmp0;

            AnonymousClass1(MatchaTransferDetailFragment matchaTransferDetailFragment) {
                this.$tmp0 = matchaTransferDetailFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, MatchaTransferDetailFragment.class, "bind", "bind(Lcom/robinhood/android/matcha/ui/history/detail/transfer/MatchaTransferDetailViewState;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(MatchaTransferDetailViewState matchaTransferDetailViewState, Continuation<? super Unit> continuation) throws Resources.NotFoundException {
                Object objInvokeSuspend$bind = C213451.invokeSuspend$bind(this.$tmp0, matchaTransferDetailViewState, continuation);
                return objInvokeSuspend$bind == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$bind : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((MatchaTransferDetailViewState) obj, (Continuation<? super Unit>) continuation);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<MatchaTransferDetailViewState> stateFlow = MatchaTransferDetailFragment.this.getDuxo().getStateFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(MatchaTransferDetailFragment.this);
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
        public static final /* synthetic */ Object invokeSuspend$bind(MatchaTransferDetailFragment matchaTransferDetailFragment, MatchaTransferDetailViewState matchaTransferDetailViewState, Continuation continuation) throws Resources.NotFoundException {
            matchaTransferDetailFragment.bind(matchaTransferDetailViewState);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C213451(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bind(final MatchaTransferDetailViewState state) throws Resources.NotFoundException {
        CharSequence text;
        CharSequence charSequenceBuildTextWithLearnMore$default;
        Result<StringResource> resultConsume;
        if (state instanceof MatchaTransferDetailViewState.Loaded) {
            MatchaTransferDetailViewState.Loaded loaded = (MatchaTransferDetailViewState.Loaded) state;
            setTransactor(loaded.getTransactor());
            requireActivity().invalidateOptionsMenu();
            FragmentMatchaTransferDetailBinding binding = getBinding();
            binding.avatarComposeView.setContent(ComposableLambda3.composableLambdaInstance(1602341751, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.matcha.ui.history.detail.transfer.MatchaTransferDetailFragment$bind$1$1
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
                        ComposerKt.traceEventStart(1602341751, i, -1, "com.robinhood.android.matcha.ui.history.detail.transfer.MatchaTransferDetailFragment.bind.<anonymous>.<anonymous> (MatchaTransferDetailFragment.kt:108)");
                    }
                    Observable<ThemesFromScarlet> observableThemeChangesForCompose = ScarletComposeInterop.themeChangesForCompose(this.this$0.getScarletManager());
                    final MatchaTransferDetailViewState matchaTransferDetailViewState = state;
                    BentoTheme2.BentoTheme(observableThemeChangesForCompose, null, ComposableLambda3.rememberComposableLambda(-1618014935, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.matcha.ui.history.detail.transfer.MatchaTransferDetailFragment$bind$1$1.1
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
                                ComposerKt.traceEventStart(-1618014935, i2, -1, "com.robinhood.android.matcha.ui.history.detail.transfer.MatchaTransferDetailFragment.bind.<anonymous>.<anonymous>.<anonymous> (MatchaTransferDetailFragment.kt:109)");
                            }
                            ProfileAvatar3.ProfileAvatar(((MatchaTransferDetailViewState.Loaded) matchaTransferDetailViewState).getAvatarState(), Modifier.INSTANCE, BentoPogSize.Hero, null, composer2, 432, 8);
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
            binding.amountText.setText(loaded.getFormattedAmount());
            RhTextView rhTextView = binding.subtitleText;
            StringResource subtitle = loaded.getSubtitle();
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            rhTextView.setText(subtitle.getText(resources).toString());
            binding.memoComposeView.setContent(ComposableLambda3.composableLambdaInstance(-1480221074, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.matcha.ui.history.detail.transfer.MatchaTransferDetailFragment$bind$1$2
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
                        ComposerKt.traceEventStart(-1480221074, i, -1, "com.robinhood.android.matcha.ui.history.detail.transfer.MatchaTransferDetailFragment.bind.<anonymous>.<anonymous> (MatchaTransferDetailFragment.kt:119)");
                    }
                    final MatchaTransferDetailViewState.Loaded.Memo memo = ((MatchaTransferDetailViewState.Loaded) state).getMemo();
                    if (memo != null) {
                        Observable<ThemesFromScarlet> observableThemeChangesForCompose = ScarletComposeInterop.themeChangesForCompose(this.getScarletManager());
                        final MatchaTransferDetailFragment matchaTransferDetailFragment = this;
                        BentoTheme2.BentoTheme(observableThemeChangesForCompose, null, ComposableLambda3.rememberComposableLambda(-642260229, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.matcha.ui.history.detail.transfer.MatchaTransferDetailFragment$bind$1$2.1
                            public final void invoke(Composer composer2, int i2) {
                                if ((i2 & 3) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-642260229, i2, -1, "com.robinhood.android.matcha.ui.history.detail.transfer.MatchaTransferDetailFragment.bind.<anonymous>.<anonymous>.<anonymous> (MatchaTransferDetailFragment.kt:122)");
                                }
                                MatchaTransferDetailFragment matchaTransferDetailFragment2 = matchaTransferDetailFragment;
                                MatchaTransferDetailViewState.Loaded.Memo memo2 = memo;
                                Modifier.Companion companion = Modifier.INSTANCE;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, companion);
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                if (composer2.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor);
                                } else {
                                    composer2.useNode();
                                }
                                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                Column6 column6 = Column6.INSTANCE;
                                matchaTransferDetailFragment2.MemoRow(memo2, composer2, 0);
                                composer2.startReplaceGroup(582498369);
                                if (memo2.getBannerText() != null) {
                                    matchaTransferDetailFragment2.MemoBanner(memo2.getBannerText().intValue(), memo2.getBannerCta(), composer2, 0);
                                }
                                composer2.endReplaceGroup();
                                composer2.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }
                        }, composer, 54), composer, 384, 2);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
            RdsDataRowView rdsDataRowView = binding.statusRow;
            StringResource status = loaded.getStatus();
            CharSequence text2 = null;
            if (status != null) {
                Resources resources2 = getResources();
                Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                text = status.getText(resources2);
            } else {
                text = null;
            }
            rdsDataRowView.setVisibilityValueText(text);
            RdsInfoBannerView statusBanner = binding.statusBanner;
            Intrinsics.checkNotNullExpressionValue(statusBanner, "statusBanner");
            bindStatusBanner(statusBanner, loaded.getStatusBanner());
            binding.dateRow.setValueText(loaded.getFormattedDate());
            RdsDataRowView rdsDataRowView2 = binding.transactorIdentifierRow;
            rdsDataRowView2.setVisibilityValueText(loaded.getTransactorIdValue());
            Intrinsics.checkNotNull(rdsDataRowView2);
            rdsDataRowView2.setLabelText(ViewsKt.getString(rdsDataRowView2, loaded.getTransactorIdLabel()));
            binding.transactionIdRow.setValueText(loaded.getTransactionId());
            binding.accountRow.setLabelText(getString(loaded.getAccountLabel()));
            LinearLayout disputeContainer = binding.disputeContainer;
            Intrinsics.checkNotNullExpressionValue(disputeContainer, "disputeContainer");
            disputeContainer.setVisibility(loaded.getShowDispute() ? 0 : 8);
            RdsInfoBannerView disputeClawbackBanner = binding.disputeClawbackBanner;
            Intrinsics.checkNotNullExpressionValue(disputeClawbackBanner, "disputeClawbackBanner");
            disputeClawbackBanner.setVisibility(loaded.getDisputeClawbackBannerText() != null ? 0 : 8);
            RdsInfoBannerView rdsInfoBannerView = binding.disputeClawbackBanner;
            StringResource disputeClawbackBannerText = loaded.getDisputeClawbackBannerText();
            if (disputeClawbackBannerText != null) {
                Resources resources3 = getResources();
                Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
                CharSequence text3 = disputeClawbackBannerText.getText(resources3);
                if (text3 != null) {
                    Resources resources4 = getResources();
                    Intrinsics.checkNotNullExpressionValue(resources4, "getResources(...)");
                    charSequenceBuildTextWithLearnMore$default = LearnMoresKt.buildTextWithLearnMore$default(resources4, text3, true, null, true, getString(C21284R.string.matcha_transaction_dispute_contact_support), new ActionSpan(false, (Function0) new Function0<Unit>() { // from class: com.robinhood.android.matcha.ui.history.detail.transfer.MatchaTransferDetailFragment$bind$lambda$7$lambda$3$$inlined$buildTextWithLearnMore$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            WebUtils.viewUrl$default(this.this$0.requireContext(), C21284R.string.matcha_transaction_dispute_contact_support_url, 0, 4, (Object) null);
                        }
                    }, 1, (DefaultConstructorMarker) null), 4, null);
                } else {
                    charSequenceBuildTextWithLearnMore$default = null;
                }
            }
            rdsInfoBannerView.setText(charSequenceBuildTextWithLearnMore$default);
            ComposeView composeView = binding.blockedBanner;
            Intrinsics.checkNotNull(composeView);
            composeView.setVisibility(loaded.isBlocked() ? 0 : 8);
            composeView.setContent(ComposableLambda3.composableLambdaInstance(-2045193996, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.matcha.ui.history.detail.transfer.MatchaTransferDetailFragment$bind$1$5$1
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
                        ComposerKt.traceEventStart(-2045193996, i, -1, "com.robinhood.android.matcha.ui.history.detail.transfer.MatchaTransferDetailFragment.bind.<anonymous>.<anonymous>.<anonymous> (MatchaTransferDetailFragment.kt:156)");
                    }
                    Observable<ThemesFromScarlet> observableThemeChangesForCompose = ScarletComposeInterop.themeChangesForCompose(this.this$0.getScarletManager());
                    final MatchaTransferDetailFragment matchaTransferDetailFragment = this.this$0;
                    BentoTheme2.BentoTheme(observableThemeChangesForCompose, null, ComposableLambda3.rememberComposableLambda(-1842445786, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.matcha.ui.history.detail.transfer.MatchaTransferDetailFragment$bind$1$5$1.1
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
                                ComposerKt.traceEventStart(-1842445786, i2, -1, "com.robinhood.android.matcha.ui.history.detail.transfer.MatchaTransferDetailFragment.bind.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MatchaTransferDetailFragment.kt:157)");
                            }
                            matchaTransferDetailFragment.BlockedBanner(composer2, 0);
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
            MatchaTransferDetailViewState.Loaded.Dispute dispute = loaded.getDispute();
            if (dispute != null) {
                binding.disputeStatusRow.setValueText(dispute.getStatus());
                RdsInfoBannerView rdsInfoBannerView2 = binding.disputeStatusDesc;
                StringResource statusDescription = dispute.getStatusDescription();
                if (statusDescription != null) {
                    Resources resources5 = getResources();
                    Intrinsics.checkNotNullExpressionValue(resources5, "getResources(...)");
                    text2 = statusDescription.getText(resources5);
                }
                rdsInfoBannerView2.setText(text2);
                binding.disputeCreatedAtRow.setValueText(dispute.getCreatedAt());
                binding.disputeUpdatedAtRow.setValueText(dispute.getUpdatedAt());
            }
            UiEvent<MatchaProfileMenuBottomSheet.Args> showMenuSheet = loaded.getShowMenuSheet();
            if (showMenuSheet != null) {
                showMenuSheet.consumeWith(new MatchaTransferDetailFragment7(this));
            }
            UiEvent<CreateReportFragmentKey> launchReporting = loaded.getLaunchReporting();
            if (launchReporting != null) {
                launchReporting.consumeWith(new MatchaTransferDetailFragment8(this));
            }
            UiEvent<ShowBlockConfirmationDialogEvent> showBlockConfirmationDialog = loaded.getShowBlockConfirmationDialog();
            if (showBlockConfirmationDialog != null) {
                showBlockConfirmationDialog.consumeWith(new Function1() { // from class: com.robinhood.android.matcha.ui.history.detail.transfer.MatchaTransferDetailFragment$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MatchaTransferDetailFragment.bind$lambda$7$lambda$6(this.f$0, (ShowBlockConfirmationDialogEvent) obj);
                    }
                });
            }
            UiEvent<Result<StringResource>> blockResultEvent = loaded.getBlockResultEvent();
            if (blockResultEvent == null || (resultConsume = blockResultEvent.consume()) == null) {
                return;
            }
            Object value = resultConsume.getValue();
            ActivityErrorHandler activityErrorHandler = getActivityErrorHandler();
            Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(value);
            if (thM28553exceptionOrNullimpl != null) {
                activityErrorHandler.invoke((ActivityErrorHandler) thM28553exceptionOrNullimpl);
            } else {
                showConfirmationSnackbar((StringResource) value);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$7$lambda$6(MatchaTransferDetailFragment matchaTransferDetailFragment, ShowBlockConfirmationDialogEvent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        matchaTransferDetailFragment.showBlockConfirmationDialog(it.isBlocked(), it.getFullName());
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    protected void createOptionsMenu(Menu menu, MenuInflater inflater) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        super.createOptionsMenu(menu, inflater);
        inflater.inflate(C21284R.menu.menu_matcha_transfer_detail, menu);
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == C21284R.id.action_view_transactor_profile) {
            getDuxo().showMenuSheet();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPrepareOptionsMenu(Menu menu) {
        ApiMatchaIdentifier identifier;
        Intrinsics.checkNotNullParameter(menu, "menu");
        super.onPrepareOptionsMenu(menu);
        MenuItem menuItemFindItem = menu.findItem(C21284R.id.action_view_transactor_profile);
        MatchaUser transactor = getTransactor();
        menuItemFindItem.setVisible(((transactor == null || (identifier = transactor.getIdentifier()) == null) ? null : identifier.getType()) == ApiMatchaIdentifier2.USER_UUID);
    }

    @Override // com.robinhood.android.matcha.ui.profile.MatchaProfileMenuBottomSheet.Callbacks
    public void onReportUserRequested() {
        getDuxo().launchReporting();
    }

    @Override // com.robinhood.android.matcha.ui.profile.MatchaProfileMenuBottomSheet.Callbacks
    public void viewProfile() {
        EventLogger eventLogger = getEventLogger();
        Screen eventScreen = getEventScreen();
        Context screenEventContext = getScreenEventContext();
        EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.VIEW_PROFILE, eventScreen, new Component(Component.ComponentType.BOTTOM_SHEET, null, null, 6, null), null, screenEventContext, false, 40, null);
        Navigator navigator = getNavigator();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        MatchaUser transactor = getTransactor();
        if (transactor != null) {
            Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, contextRequireContext, new MatchaProfile(transactor.getIdentifier().getValue(), null, false, 6, null), false, false, false, false, null, false, null, null, 1020, null);
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // com.robinhood.android.matcha.ui.profile.MatchaProfileMenuBottomSheet.Callbacks
    public void onBlockUserRequested() {
        getDuxo().showBlockConfirmationDialog();
    }

    @Override // com.robinhood.android.matcha.ui.block.MatchaBlockConfirmationDialogFragment.Callbacks
    public void onBlockActionConfirmed() {
        getDuxo().toggleBlockState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showMenuSheet(MatchaProfileMenuBottomSheet.Args args) {
        MatchaProfileMenuBottomSheet matchaProfileMenuBottomSheet = (MatchaProfileMenuBottomSheet) MatchaProfileMenuBottomSheet.INSTANCE.newInstance((Parcelable) args);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        matchaProfileMenuBottomSheet.show(childFragmentManager, "profileMenuBottomSheet");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launchReporting(CreateReportFragmentKey key) {
        Navigator navigator = getNavigator();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, contextRequireContext, key, false, false, false, false, null, false, null, null, 1020, null);
    }

    private final void bindStatusBanner(RdsInfoBannerView rdsInfoBannerView, MatchaTransferDetailViewState.Loaded.StatusBanner statusBanner) throws Resources.NotFoundException {
        CharSequence string2;
        rdsInfoBannerView.setVisibility(statusBanner != null ? 0 : 8);
        CharSequence charSequence = null;
        if (statusBanner != null) {
            int text = statusBanner.getText();
            if (statusBanner.getShowContactSupport()) {
                Resources resources = rdsInfoBannerView.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                int i = C21284R.string.matcha_transfer_status_banner_contact_support;
                CharSequence text2 = resources.getText(text);
                Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                string2 = LearnMoresKt.buildTextWithLearnMore$default(resources, text2, true, null, true, resources.getText(i), new ActionSpan(false, (Function0) new Function0<Unit>() { // from class: com.robinhood.android.matcha.ui.history.detail.transfer.MatchaTransferDetailFragment$bindStatusBanner$lambda$20$$inlined$buildTextWithLearnMore$1
                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        WebUtils.viewUrl$default(this.this$0.requireContext(), C21284R.string.matcha_transaction_dispute_contact_support_url, 0, 4, (Object) null);
                    }
                }, 1, (DefaultConstructorMarker) null), 4, null);
            } else {
                string2 = ViewsKt.getString(rdsInfoBannerView, text);
            }
            charSequence = string2;
        }
        rdsInfoBannerView.setText(charSequence);
    }

    private final void showBlockConfirmationDialog(boolean isBlocked, String userFullName) {
        MatchaBlockConfirmationDialogFragment matchaBlockConfirmationDialogFragment = (MatchaBlockConfirmationDialogFragment) MatchaBlockConfirmationDialogFragment.INSTANCE.newInstance((Parcelable) new MatchaBlockConfirmationDialogFragment.Args(isBlocked, userFullName));
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        matchaBlockConfirmationDialogFragment.show(childFragmentManager, "blockConfirmationDialog");
    }

    private final void showConfirmationSnackbar(StringResource stringResource) {
        RdsSnackbar.Companion companion = RdsSnackbar.INSTANCE;
        View viewRequireView = requireView();
        Intrinsics.checkNotNullExpressionValue(viewRequireView, "requireView(...)");
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        RdsSnackbar rdsSnackbarMake = companion.make(viewRequireView, stringResource.getText(resources), -1);
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Drawable themeDrawable = Contexts7.getThemeDrawable(contextRequireContext, C20690R.attr.iconCheckmark16dp);
        Intrinsics.checkNotNull(themeDrawable);
        rdsSnackbarMake.setLeadingIcon(themeDrawable).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MemoRow(final MatchaTransferDetailViewState.Loaded.Memo memo, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2125848164);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(memo) : composerStartRestartGroup.changedInstance(memo) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2125848164, i2, -1, "com.robinhood.android.matcha.ui.history.detail.transfer.MatchaTransferDetailFragment.MemoRow (MatchaTransferDetailFragment.kt:276)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            BentoBaseRowLayout.BentoBaseRowLayout(null, null, null, MatchaTransferDetailFragment2.INSTANCE.m16333getLambda$1165457895$feature_p2p_externalDebug(), ComposableLambda3.rememberComposableLambda(-1573481510, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.matcha.ui.history.detail.transfer.MatchaTransferDetailFragment.MemoRow.1
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
                        ComposerKt.traceEventStart(-1573481510, i3, -1, "com.robinhood.android.matcha.ui.history.detail.transfer.MatchaTransferDetailFragment.MemoRow.<anonymous> (MatchaTransferDetailFragment.kt:287)");
                    }
                    String revealedText = MatchaTransferDetailFragment.MemoRow$lambda$9(snapshotState) ? memo.getContent().getRevealedText() : memo.getContent().getText();
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i4 = BentoTheme.$stable;
                    BentoText2.m20747BentoText38GnDrw(revealedText, null, Color.m6701boximpl(bentoTheme.getColors(composer2, i4).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i4).getTextM(), composer2, 0, 0, 8186);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, ComposableLambda3.rememberComposableLambda(1905438556, true, new C213412(memo, snapshotState), composerStartRestartGroup, 54), false, false, false, null, composerStartRestartGroup, 14183424, 0, 1831);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.matcha.ui.history.detail.transfer.MatchaTransferDetailFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MatchaTransferDetailFragment.MemoRow$lambda$11(this.f$0, memo, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MemoRow$lambda$10(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* compiled from: MatchaTransferDetailFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.matcha.ui.history.detail.transfer.MatchaTransferDetailFragment$MemoRow$2 */
    static final class C213412 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ MatchaTransferDetailViewState.Loaded.Memo $memo;
        final /* synthetic */ SnapshotState<Boolean> $revealedMemo$delegate;

        C213412(MatchaTransferDetailViewState.Loaded.Memo memo, SnapshotState<Boolean> snapshotState) {
            this.$memo = memo;
            this.$revealedMemo$delegate = snapshotState;
        }

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
                ComposerKt.traceEventStart(1905438556, i, -1, "com.robinhood.android.matcha.ui.history.detail.transfer.MatchaTransferDetailFragment.MemoRow.<anonymous> (MatchaTransferDetailFragment.kt:298)");
            }
            if (this.$memo.getContent().getShowRevealButton() && !MatchaTransferDetailFragment.MemoRow$lambda$9(this.$revealedMemo$delegate)) {
                composer.startReplaceGroup(5004770);
                final SnapshotState<Boolean> snapshotState = this.$revealedMemo$delegate;
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.matcha.ui.history.detail.transfer.MatchaTransferDetailFragment$MemoRow$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MatchaTransferDetailFragment.C213412.invoke$lambda$1$lambda$0(snapshotState);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                BentoTextButton2.m20715BentoTextButtonPIknLig((Function0) objRememberedValue, StringResources_androidKt.stringResource(C21284R.string.matcha_transaction_detail_reveal_memo, composer, 0), null, null, null, false, Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU()), composer, 6, 60);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(SnapshotState snapshotState) {
            MatchaTransferDetailFragment.MemoRow$lambda$10(snapshotState, true);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MemoBanner(final int i, final Integer num, Composer composer, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1385587918);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(num) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(this) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1385587918, i3, -1, "com.robinhood.android.matcha.ui.history.detail.transfer.MatchaTransferDetailFragment.MemoBanner (MatchaTransferDetailFragment.kt:311)");
            }
            String strStringResource = StringResources_androidKt.stringResource(i, composerStartRestartGroup, i3 & 14);
            BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.INFO_FILLED_24);
            composerStartRestartGroup.startReplaceGroup(110135464);
            String strStringResource2 = num == null ? null : StringResources_androidKt.stringResource(num.intValue(), composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceGroup();
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i4 = BentoTheme.$stable;
            Modifier modifierM5145paddingqDBjuR0 = PaddingKt.m5145paddingqDBjuR0(companion, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i4).m21595getXsmallD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i4).m21590getDefaultD9Ej5fM());
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.matcha.ui.history.detail.transfer.MatchaTransferDetailFragment$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MatchaTransferDetailFragment.MemoBanner$lambda$14$lambda$13(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoInfoBanner2.BentoPinnedInfoBanner(modifierM5145paddingqDBjuR0, strStringResource, size24, strStringResource2, (Function0) objRememberedValue, composerStartRestartGroup, BentoIcon4.Size24.$stable << 6, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.matcha.ui.history.detail.transfer.MatchaTransferDetailFragment$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MatchaTransferDetailFragment.MemoBanner$lambda$15(this.f$0, i, num, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MemoBanner$lambda$14$lambda$13(MatchaTransferDetailFragment matchaTransferDetailFragment) {
        WebUtils.viewUrl$default(matchaTransferDetailFragment.requireContext(), C21284R.string.rh_app_use_standards_url, 0, 4, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void BlockedBanner(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(862806318);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(862806318, i2, -1, "com.robinhood.android.matcha.ui.history.detail.transfer.MatchaTransferDetailFragment.BlockedBanner (MatchaTransferDetailFragment.kt:330)");
            }
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
            String strStringResource = StringResources_androidKt.stringResource(C21284R.string.matcha_transaction_blocked_user_message, composerStartRestartGroup, 0);
            BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.INFO_FILLED_24);
            String strStringResource2 = StringResources_androidKt.stringResource(C21284R.string.matcha_transaction_unblock_action, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.matcha.ui.history.detail.transfer.MatchaTransferDetailFragment$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MatchaTransferDetailFragment.BlockedBanner$lambda$17$lambda$16(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoInfoBanner2.BentoUrgentInfoBanner(modifierM5144paddingVpY3zN4$default, strStringResource, size24, strStringResource2, (Function0) objRememberedValue, composerStartRestartGroup, BentoIcon4.Size24.$stable << 6, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.matcha.ui.history.detail.transfer.MatchaTransferDetailFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MatchaTransferDetailFragment.BlockedBanner$lambda$18(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BlockedBanner$lambda$17$lambda$16(MatchaTransferDetailFragment matchaTransferDetailFragment) {
        matchaTransferDetailFragment.getDuxo().toggleBlockState();
        return Unit.INSTANCE;
    }

    /* compiled from: MatchaTransferDetailFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00030\u0004B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0003H\u0016¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/detail/transfer/MatchaTransferDetailFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/matcha/ui/history/detail/transfer/MatchaTransferDetailFragment;", "Lcom/robinhood/android/history/contracts/MatchaTransferDetailFragmentKey;", "Lcom/robinhood/android/navigation/FragmentResolver;", "<init>", "()V", "createFragment", "key", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<MatchaTransferDetailFragment, MatchaTransferDetailFragmentKey>, FragmentResolver<MatchaTransferDetailFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public MatchaTransferDetailFragmentKey getArgs(MatchaTransferDetailFragment matchaTransferDetailFragment) {
            return (MatchaTransferDetailFragmentKey) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, matchaTransferDetailFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public MatchaTransferDetailFragment newInstance(MatchaTransferDetailFragmentKey matchaTransferDetailFragmentKey) {
            return (MatchaTransferDetailFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, matchaTransferDetailFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(MatchaTransferDetailFragment matchaTransferDetailFragment, MatchaTransferDetailFragmentKey matchaTransferDetailFragmentKey) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, matchaTransferDetailFragment, matchaTransferDetailFragmentKey);
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public MatchaTransferDetailFragment createFragment(MatchaTransferDetailFragmentKey key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return (MatchaTransferDetailFragment) newInstance((Parcelable) key);
        }
    }
}
