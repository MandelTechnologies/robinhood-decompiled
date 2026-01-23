package com.robinhood.shared.crypto.transfer.send.receipt;

import android.content.ActivityNotFoundException;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.CryptoRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.models.api.transfer.ApiCryptoSupportedNetworks;
import com.robinhood.models.crypto.p314db.home.CryptoHomeCtaButtons;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.crypto.p315ui.transfer.CryptoTransferWithdrawal;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.CryptoTransferContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.crypto.contracts.transfers.CryptoTransferHistoryFragmentKey;
import com.robinhood.shared.crypto.transfer.GatewayDeepLinkIntent;
import com.robinhood.shared.crypto.transfer.model.NetworkFeeData;
import com.robinhood.shared.crypto.transfer.send.receipt.CryptoTransferSendReceiptFragment;
import com.robinhood.shared.formats.crypto.CryptoInputMode;
import com.robinhood.utils.extensions.Uuids;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.resource.StringResource;
import java.util.Set;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;

/* compiled from: CryptoTransferSendReceiptFragment.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\b\u0007\u0018\u0000 +2\u00020\u00012\u00020\u00022\u00020\u0003:\u0003)*+B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0007H\u0016J\r\u0010 \u001a\u00020\u001cH\u0017¢\u0006\u0002\u0010!J\b\u0010\"\u001a\u00020\u001cH\u0002J\t\u0010#\u001a\u00020\u0007H\u0096\u0001R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u000f\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%X\u0096\u0005¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006,²\u0006\n\u0010-\u001a\u00020.X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/receipt/CryptoTransferSendReceiptFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "excludeFromAnalyticsLogging", "", "getExcludeFromAnalyticsLogging", "()Z", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "eventScreen$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/shared/crypto/transfer/send/receipt/CryptoTransferSendReceiptFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/shared/crypto/transfer/send/receipt/CryptoTransferSendReceiptFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/shared/crypto/transfer/send/receipt/CryptoTransferSendReceiptDuxo;", "getDuxo", "()Lcom/robinhood/shared/crypto/transfer/send/receipt/CryptoTransferSendReceiptDuxo;", "duxo$delegate", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onBackPressed", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onCompletedFromGateway", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Args", "Companion", "feature-crypto-transfer_externalDebug", "viewState", "Lcom/robinhood/shared/crypto/transfer/send/receipt/CryptoTransferSendReceiptViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class CryptoTransferSendReceiptFragment extends GenericComposeFragment implements AutoLoggableFragment, RegionGated {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(CryptoTransferSendReceiptFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/shared/crypto/transfer/send/receipt/CryptoTransferSendReceiptFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(CryptoRegionGate.INSTANCE);

    /* renamed from: eventScreen$delegate, reason: from kotlin metadata */
    private final Lazy eventScreen = LazyKt.lazy(new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.receipt.CryptoTransferSendReceiptFragment$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CryptoTransferSendReceiptFragment.eventScreen_delegate$lambda$0(this.f$0);
        }
    });

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.shared.crypto.transfer.send.receipt.CryptoTransferSendReceiptFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, CryptoTransferSendReceiptDuxo.class);

    /* compiled from: CryptoTransferSendReceiptFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/receipt/CryptoTransferSendReceiptFragment$Callbacks;", "", "onCompleted", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onCompleted();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$2(CryptoTransferSendReceiptFragment cryptoTransferSendReceiptFragment, int i, Composer composer, int i2) {
        cryptoTransferSendReceiptFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public boolean getExcludeFromAnalyticsLogging() {
        return true;
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
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
    public Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return (Screen) this.eventScreen.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Screen eventScreen_delegate$lambda$0(CryptoTransferSendReceiptFragment cryptoTransferSendReceiptFragment) {
        return new Screen(Screen.Name.CRYPTO_TRANSFER_SEND_CONFIRMATION, null, ((Args) INSTANCE.getArgs((Fragment) cryptoTransferSendReceiptFragment)).getCurrencyIdString(), null, 10, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final CryptoTransferSendReceiptDuxo getDuxo() {
        return (CryptoTransferSendReceiptDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setTitle((CharSequence) null);
        requireBaseActivity().showCloseIcon();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        getCallbacks().onCompleted();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1206358523);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1206358523, i2, -1, "com.robinhood.shared.crypto.transfer.send.receipt.CryptoTransferSendReceiptFragment.ComposeContent (CryptoTransferSendReceiptFragment.kt:71)");
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            Screen eventScreen = getEventScreen();
            Companion companion = INSTANCE;
            String str = null;
            String str2 = null;
            String str3 = null;
            Object[] objArr = 0 == true ? 1 : 0;
            Object[] objArr2 = 0 == true ? 1 : 0;
            Object[] objArr3 = 0 == true ? 1 : 0;
            Object[] objArr4 = 0 == true ? 1 : 0;
            Object[] objArr5 = 0 == true ? 1 : 0;
            Object[] objArr6 = 0 == true ? 1 : 0;
            Object[] objArr7 = 0 == true ? 1 : 0;
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, eventScreen, null, new Context(0, 0, 0, null, null, null, str, objArr2, 0, objArr3, objArr4, str2, objArr5, str3, objArr6, objArr7, null, objArr, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new CryptoTransferContext(((Args) companion.getArgs((Fragment) this)).getCurrencyIdString(), ((Args) companion.getArgs((Fragment) this)).getLoggingSessionIdString(), Uuids.toStringOrEmpty(ComposeContent$lambda$1(snapshotState4CollectAsStateWithLifecycle).getWithdrawalId()), 0.0d, str, null, null, null, null, str2, null, str3, null, null, 16376, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -257, -1, -1, -1, 16383, null), null, null, 53, null), ComposableLambda3.rememberComposableLambda(-1676339984, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.receipt.CryptoTransferSendReceiptFragment.ComposeContent.1

                /* compiled from: CryptoTransferSendReceiptFragment.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.shared.crypto.transfer.send.receipt.CryptoTransferSendReceiptFragment$ComposeContent$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ SnapshotState4<CryptoTransferSendReceiptViewState> $viewState$delegate;
                    final /* synthetic */ CryptoTransferSendReceiptFragment this$0;

                    AnonymousClass1(CryptoTransferSendReceiptFragment cryptoTransferSendReceiptFragment, SnapshotState4<CryptoTransferSendReceiptViewState> snapshotState4) {
                        this.this$0 = cryptoTransferSendReceiptFragment;
                        this.$viewState$delegate = snapshotState4;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer, int i) {
                        Object objRememberedValue;
                        if ((i & 3) == 2 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-441013125, i, -1, "com.robinhood.shared.crypto.transfer.send.receipt.CryptoTransferSendReceiptFragment.ComposeContent.<anonymous>.<anonymous> (CryptoTransferSendReceiptFragment.kt:86)");
                        }
                        StringResource title = CryptoTransferSendReceiptFragment.ComposeContent$lambda$1(this.$viewState$delegate).getTitle();
                        int i2 = StringResource.$stable;
                        String string2 = StringResource2.getString(title, composer, i2);
                        String string3 = StringResource2.getString(CryptoTransferSendReceiptFragment.ComposeContent$lambda$1(this.$viewState$delegate).getSubtitle(), composer, i2);
                        String address = CryptoTransferSendReceiptFragment.ComposeContent$lambda$1(this.$viewState$delegate).getAddress();
                        String memo = CryptoTransferSendReceiptFragment.ComposeContent$lambda$1(this.$viewState$delegate).getMemo();
                        String network = CryptoTransferSendReceiptFragment.ComposeContent$lambda$1(this.$viewState$delegate).getNetwork();
                        NetworkFeeData networkFee = CryptoTransferSendReceiptFragment.ComposeContent$lambda$1(this.$viewState$delegate).getNetworkFee();
                        String string4 = StringResource2.getString(CryptoTransferSendReceiptFragment.ComposeContent$lambda$1(this.$viewState$delegate).getTotalLabel(), composer, i2);
                        String totalValue = CryptoTransferSendReceiptFragment.ComposeContent$lambda$1(this.$viewState$delegate).getTotalValue();
                        String string5 = StringResource2.getString(CryptoTransferSendReceiptFragment.ComposeContent$lambda$1(this.$viewState$delegate).getHelperText(), composer, i2);
                        String string6 = StringResource2.getString(CryptoTransferSendReceiptFragment.ComposeContent$lambda$1(this.$viewState$delegate).getPrimaryCtaText(), composer, i2);
                        if (CryptoTransferSendReceiptFragment.ComposeContent$lambda$1(this.$viewState$delegate).isFromGateway()) {
                            composer.startReplaceGroup(83639791);
                            CryptoTransferSendReceiptFragment cryptoTransferSendReceiptFragment = this.this$0;
                            composer.startReplaceGroup(5004770);
                            boolean zChangedInstance = composer.changedInstance(cryptoTransferSendReceiptFragment);
                            objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new CryptoTransferSendReceiptFragment2(cryptoTransferSendReceiptFragment);
                                composer.updateRememberedValue(objRememberedValue);
                            }
                        } else {
                            composer.startReplaceGroup(83669489);
                            Callbacks callbacks = this.this$0.getCallbacks();
                            composer.startReplaceGroup(5004770);
                            boolean zChangedInstance2 = composer.changedInstance(callbacks);
                            objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new CryptoTransferSendReceiptFragment3(callbacks);
                                composer.updateRememberedValue(objRememberedValue);
                            }
                        }
                        KFunction kFunction = (KFunction) objRememberedValue;
                        composer.endReplaceGroup();
                        composer.endReplaceGroup();
                        Function0 function0 = (Function0) kFunction;
                        composer.startReplaceGroup(-1633490746);
                        boolean zChangedInstance3 = composer.changedInstance(this.this$0) | composer.changed(this.$viewState$delegate);
                        final CryptoTransferSendReceiptFragment cryptoTransferSendReceiptFragment2 = this.this$0;
                        final SnapshotState4<CryptoTransferSendReceiptViewState> snapshotState4 = this.$viewState$delegate;
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (zChangedInstance3 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.receipt.CryptoTransferSendReceiptFragment$ComposeContent$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CryptoTransferSendReceiptFragment.C383691.AnonymousClass1.invoke$lambda$3$lambda$2(cryptoTransferSendReceiptFragment2, snapshotState4);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        composer.endReplaceGroup();
                        CryptoTransferSendReceiptComposable3.CryptoTransferSendReceiptComposable(string2, string3, address, memo, network, networkFee, totalValue, string4, string5, string6, function0, (Function0) objRememberedValue2, composer, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$3$lambda$2(CryptoTransferSendReceiptFragment cryptoTransferSendReceiptFragment, SnapshotState4 snapshotState4) {
                        Navigator navigator = cryptoTransferSendReceiptFragment.getNavigator();
                        android.content.Context contextRequireContext = cryptoTransferSendReceiptFragment.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new CryptoTransferHistoryFragmentKey(CryptoTransferSendReceiptFragment.ComposeContent$lambda$1(snapshotState4).getWithdrawalId(), true), false, false, false, null, false, null, false, false, null, null, 4092, null);
                        return Unit.INSTANCE;
                    }
                }

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
                        ComposerKt.traceEventStart(-1676339984, i3, -1, "com.robinhood.shared.crypto.transfer.send.receipt.CryptoTransferSendReceiptFragment.ComposeContent.<anonymous> (CryptoTransferSendReceiptFragment.kt:85)");
                    }
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-441013125, true, new AnonymousClass1(CryptoTransferSendReceiptFragment.this, snapshotState4CollectAsStateWithLifecycle), composer2, 54), composer2, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.send.receipt.CryptoTransferSendReceiptFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoTransferSendReceiptFragment.ComposeContent$lambda$2(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoTransferSendReceiptViewState ComposeContent$lambda$1(SnapshotState4<CryptoTransferSendReceiptViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCompletedFromGateway() {
        try {
            startActivity(GatewayDeepLinkIntent.gatewayDeepLinkIntent(CryptoHomeCtaButtons.DEFAULT_ID));
        } catch (ActivityNotFoundException unused) {
            getCallbacks().onCompleted();
        }
    }

    /* compiled from: CryptoTransferSendReceiptFragment.kt */
    @Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\t\u0010&\u001a\u00020\tHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010(\u001a\u00020\u0007HÆ\u0003J\t\u0010)\u001a\u00020\u000eHÂ\u0003JQ\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0006\u0010+\u001a\u00020,J\u0013\u0010-\u001a\u00020\u00072\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u00020,HÖ\u0001J\t\u00101\u001a\u00020\u001bHÖ\u0001J\u0016\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020,R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0015R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001a\u001a\u00020\u001b¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010 \u001a\u00020\u001b¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\u001f¨\u00067"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/receipt/CryptoTransferSendReceiptFragment$Args;", "Landroid/os/Parcelable;", "uiCurrencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "withdrawal", "Lcom/robinhood/models/crypto/ui/transfer/CryptoTransferWithdrawal;", "isFullAmount", "", "cryptoInputMode", "Lcom/robinhood/shared/formats/crypto/CryptoInputMode;", "selectedNetwork", "Lcom/robinhood/models/api/transfer/ApiCryptoSupportedNetworks$CryptoNetwork;", "isFromGateway", "loggingSessionId", "Ljava/util/UUID;", "<init>", "(Lcom/robinhood/models/crypto/ui/UiCurrencyPair;Lcom/robinhood/models/crypto/ui/transfer/CryptoTransferWithdrawal;ZLcom/robinhood/shared/formats/crypto/CryptoInputMode;Lcom/robinhood/models/api/transfer/ApiCryptoSupportedNetworks$CryptoNetwork;ZLjava/util/UUID;)V", "getUiCurrencyPair", "()Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "getWithdrawal", "()Lcom/robinhood/models/crypto/ui/transfer/CryptoTransferWithdrawal;", "()Z", "getCryptoInputMode", "()Lcom/robinhood/shared/formats/crypto/CryptoInputMode;", "getSelectedNetwork", "()Lcom/robinhood/models/api/transfer/ApiCryptoSupportedNetworks$CryptoNetwork;", "currencyIdString", "", "getCurrencyIdString$annotations", "()V", "getCurrencyIdString", "()Ljava/lang/String;", "loggingSessionIdString", "getLoggingSessionIdString$annotations", "getLoggingSessionIdString", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final CryptoInputMode cryptoInputMode;
        private final String currencyIdString;
        private final boolean isFromGateway;
        private final boolean isFullAmount;
        private final UUID loggingSessionId;
        private final String loggingSessionIdString;
        private final ApiCryptoSupportedNetworks.CryptoNetwork selectedNetwork;
        private final UiCurrencyPair uiCurrencyPair;
        private final CryptoTransferWithdrawal withdrawal;

        /* compiled from: CryptoTransferSendReceiptFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((UiCurrencyPair) parcel.readParcelable(Args.class.getClassLoader()), (CryptoTransferWithdrawal) parcel.readParcelable(Args.class.getClassLoader()), parcel.readInt() != 0, CryptoInputMode.valueOf(parcel.readString()), (ApiCryptoSupportedNetworks.CryptoNetwork) parcel.readParcelable(Args.class.getClassLoader()), parcel.readInt() != 0, (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        /* renamed from: component7, reason: from getter */
        private final UUID getLoggingSessionId() {
            return this.loggingSessionId;
        }

        public static /* synthetic */ Args copy$default(Args args, UiCurrencyPair uiCurrencyPair, CryptoTransferWithdrawal cryptoTransferWithdrawal, boolean z, CryptoInputMode cryptoInputMode, ApiCryptoSupportedNetworks.CryptoNetwork cryptoNetwork, boolean z2, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uiCurrencyPair = args.uiCurrencyPair;
            }
            if ((i & 2) != 0) {
                cryptoTransferWithdrawal = args.withdrawal;
            }
            if ((i & 4) != 0) {
                z = args.isFullAmount;
            }
            if ((i & 8) != 0) {
                cryptoInputMode = args.cryptoInputMode;
            }
            if ((i & 16) != 0) {
                cryptoNetwork = args.selectedNetwork;
            }
            if ((i & 32) != 0) {
                z2 = args.isFromGateway;
            }
            if ((i & 64) != 0) {
                uuid = args.loggingSessionId;
            }
            boolean z3 = z2;
            UUID uuid2 = uuid;
            ApiCryptoSupportedNetworks.CryptoNetwork cryptoNetwork2 = cryptoNetwork;
            boolean z4 = z;
            return args.copy(uiCurrencyPair, cryptoTransferWithdrawal, z4, cryptoInputMode, cryptoNetwork2, z3, uuid2);
        }

        public static /* synthetic */ void getCurrencyIdString$annotations() {
        }

        public static /* synthetic */ void getLoggingSessionIdString$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final UiCurrencyPair getUiCurrencyPair() {
            return this.uiCurrencyPair;
        }

        /* renamed from: component2, reason: from getter */
        public final CryptoTransferWithdrawal getWithdrawal() {
            return this.withdrawal;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsFullAmount() {
            return this.isFullAmount;
        }

        /* renamed from: component4, reason: from getter */
        public final CryptoInputMode getCryptoInputMode() {
            return this.cryptoInputMode;
        }

        /* renamed from: component5, reason: from getter */
        public final ApiCryptoSupportedNetworks.CryptoNetwork getSelectedNetwork() {
            return this.selectedNetwork;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getIsFromGateway() {
            return this.isFromGateway;
        }

        public final Args copy(UiCurrencyPair uiCurrencyPair, CryptoTransferWithdrawal withdrawal, boolean isFullAmount, CryptoInputMode cryptoInputMode, ApiCryptoSupportedNetworks.CryptoNetwork selectedNetwork, boolean isFromGateway, UUID loggingSessionId) {
            Intrinsics.checkNotNullParameter(uiCurrencyPair, "uiCurrencyPair");
            Intrinsics.checkNotNullParameter(withdrawal, "withdrawal");
            Intrinsics.checkNotNullParameter(cryptoInputMode, "cryptoInputMode");
            Intrinsics.checkNotNullParameter(loggingSessionId, "loggingSessionId");
            return new Args(uiCurrencyPair, withdrawal, isFullAmount, cryptoInputMode, selectedNetwork, isFromGateway, loggingSessionId);
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
            return Intrinsics.areEqual(this.uiCurrencyPair, args.uiCurrencyPair) && Intrinsics.areEqual(this.withdrawal, args.withdrawal) && this.isFullAmount == args.isFullAmount && this.cryptoInputMode == args.cryptoInputMode && Intrinsics.areEqual(this.selectedNetwork, args.selectedNetwork) && this.isFromGateway == args.isFromGateway && Intrinsics.areEqual(this.loggingSessionId, args.loggingSessionId);
        }

        public int hashCode() {
            int iHashCode = ((((((this.uiCurrencyPair.hashCode() * 31) + this.withdrawal.hashCode()) * 31) + Boolean.hashCode(this.isFullAmount)) * 31) + this.cryptoInputMode.hashCode()) * 31;
            ApiCryptoSupportedNetworks.CryptoNetwork cryptoNetwork = this.selectedNetwork;
            return ((((iHashCode + (cryptoNetwork == null ? 0 : cryptoNetwork.hashCode())) * 31) + Boolean.hashCode(this.isFromGateway)) * 31) + this.loggingSessionId.hashCode();
        }

        public String toString() {
            return "Args(uiCurrencyPair=" + this.uiCurrencyPair + ", withdrawal=" + this.withdrawal + ", isFullAmount=" + this.isFullAmount + ", cryptoInputMode=" + this.cryptoInputMode + ", selectedNetwork=" + this.selectedNetwork + ", isFromGateway=" + this.isFromGateway + ", loggingSessionId=" + this.loggingSessionId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.uiCurrencyPair, flags);
            dest.writeParcelable(this.withdrawal, flags);
            dest.writeInt(this.isFullAmount ? 1 : 0);
            dest.writeString(this.cryptoInputMode.name());
            dest.writeParcelable(this.selectedNetwork, flags);
            dest.writeInt(this.isFromGateway ? 1 : 0);
            dest.writeSerializable(this.loggingSessionId);
        }

        public Args(UiCurrencyPair uiCurrencyPair, CryptoTransferWithdrawal withdrawal, boolean z, CryptoInputMode cryptoInputMode, ApiCryptoSupportedNetworks.CryptoNetwork cryptoNetwork, boolean z2, UUID loggingSessionId) {
            Intrinsics.checkNotNullParameter(uiCurrencyPair, "uiCurrencyPair");
            Intrinsics.checkNotNullParameter(withdrawal, "withdrawal");
            Intrinsics.checkNotNullParameter(cryptoInputMode, "cryptoInputMode");
            Intrinsics.checkNotNullParameter(loggingSessionId, "loggingSessionId");
            this.uiCurrencyPair = uiCurrencyPair;
            this.withdrawal = withdrawal;
            this.isFullAmount = z;
            this.cryptoInputMode = cryptoInputMode;
            this.selectedNetwork = cryptoNetwork;
            this.isFromGateway = z2;
            this.loggingSessionId = loggingSessionId;
            String string2 = uiCurrencyPair.getAssetCurrencyId().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            this.currencyIdString = string2;
            String string3 = loggingSessionId.toString();
            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
            this.loggingSessionIdString = string3;
        }

        public final UiCurrencyPair getUiCurrencyPair() {
            return this.uiCurrencyPair;
        }

        public final CryptoTransferWithdrawal getWithdrawal() {
            return this.withdrawal;
        }

        public final boolean isFullAmount() {
            return this.isFullAmount;
        }

        public final CryptoInputMode getCryptoInputMode() {
            return this.cryptoInputMode;
        }

        public final ApiCryptoSupportedNetworks.CryptoNetwork getSelectedNetwork() {
            return this.selectedNetwork;
        }

        public final boolean isFromGateway() {
            return this.isFromGateway;
        }

        public final String getCurrencyIdString() {
            return this.currencyIdString;
        }

        public final String getLoggingSessionIdString() {
            return this.loggingSessionIdString;
        }
    }

    /* compiled from: CryptoTransferSendReceiptFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/receipt/CryptoTransferSendReceiptFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/shared/crypto/transfer/send/receipt/CryptoTransferSendReceiptFragment;", "Lcom/robinhood/shared/crypto/transfer/send/receipt/CryptoTransferSendReceiptFragment$Args;", "<init>", "()V", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<CryptoTransferSendReceiptFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(CryptoTransferSendReceiptFragment cryptoTransferSendReceiptFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, cryptoTransferSendReceiptFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public CryptoTransferSendReceiptFragment newInstance(Args args) {
            return (CryptoTransferSendReceiptFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(CryptoTransferSendReceiptFragment cryptoTransferSendReceiptFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, cryptoTransferSendReceiptFragment, args);
        }
    }
}
