package com.robinhood.shared.crypto.transfer.send.amount;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.regiongate.CryptoRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.api.transfer.ApiCryptoSupportedNetworks;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.CryptoTransferContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountViewState;
import com.robinhood.shared.formats.crypto.CryptoInputMode;
import com.robinhood.utils.extensions.Activity;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.math.BigDecimal;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: CryptoTransferSendAmountFragment.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0003\u0019\u001a\u001bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\r\u0010\u0011\u001a\u00020\u0010H\u0017¢\u0006\u0002\u0010\u0012J\t\u0010\u0013\u001a\u00020\fH\u0096\u0001R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "callbacks", "Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "toolbarVisible", "", "getToolbarVisible", "()Z", "onResume", "", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Args", "Companion", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class CryptoTransferSendAmountFragment extends GenericComposeFragment implements RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(CryptoRegionGate.INSTANCE);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(CryptoTransferSendAmountFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: CryptoTransferSendAmountFragment.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountFragment$Callbacks;", "", "saveLastEnteredAmount", "", "amountState", "Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountViewState$AmountState;", "reviewWithdrawalDetails", "withdrawal", "Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountViewState$WithdrawalAttempt;", "errorWithAddress", "errorWrapper", "Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountViewState$CryptoValidationErrorWrapper;", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void errorWithAddress(CryptoTransferSendAmountViewState.CryptoValidationErrorWrapper errorWrapper);

        void reviewWithdrawalDetails(CryptoTransferSendAmountViewState.WithdrawalAttempt withdrawal);

        void saveLastEnteredAmount(CryptoTransferSendAmountViewState.AmountState amountState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(CryptoTransferSendAmountFragment cryptoTransferSendAmountFragment, int i, Composer composer, int i2) {
        cryptoTransferSendAmountFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return false;
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        Activity.hideKeyboard$default(fragmentActivityRequireActivity, false, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1947255749);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1947255749, i2, -1, "com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountFragment.ComposeContent (CryptoTransferSendAmountFragment.kt:54)");
            }
            Screen.Name name = Screen.Name.CRYPTO_TRANSFER_SEND_AMOUNT;
            Companion companion = INSTANCE;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            Object[] objArr = 0 == true ? 1 : 0;
            Object[] objArr2 = 0 == true ? 1 : 0;
            Object[] objArr3 = 0 == true ? 1 : 0;
            Object[] objArr4 = 0 == true ? 1 : 0;
            Object[] objArr5 = 0 == true ? 1 : 0;
            Object[] objArr6 = 0 == true ? 1 : 0;
            Object[] objArr7 = 0 == true ? 1 : 0;
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(name, null, ((Args) companion.getArgs((Fragment) this)).getCurrencyIdString(), null, 10, null), null, new Context(0, 0, 0, str, null, null, str2, objArr2, 0, objArr3, objArr4, str3, objArr5, str4, objArr6, objArr7, null, objArr, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new CryptoTransferContext(((Args) companion.getArgs((Fragment) this)).getCurrencyIdString(), ((Args) companion.getArgs((Fragment) this)).getLoggingSessionIdString(), str, 0.0d, str2, null, null, null, null, str3, null, str4, null, null, 16380, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -257, -1, -1, -1, 16383, null), null, null, 53, null), ComposableLambda3.rememberComposableLambda(-604986010, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountFragment.ComposeContent.1
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
                        ComposerKt.traceEventStart(-604986010, i3, -1, "com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountFragment.ComposeContent.<anonymous> (CryptoTransferSendAmountFragment.kt:69)");
                    }
                    final CryptoTransferSendAmountFragment cryptoTransferSendAmountFragment = CryptoTransferSendAmountFragment.this;
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-109432389, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountFragment.ComposeContent.1.1
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
                                ComposerKt.traceEventStart(-109432389, i4, -1, "com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountFragment.ComposeContent.<anonymous>.<anonymous> (CryptoTransferSendAmountFragment.kt:70)");
                            }
                            CryptoTransferSendAmountComposableKt.CryptoTransferSendAmountComposable((Args) CryptoTransferSendAmountFragment.INSTANCE.getArgs((Fragment) cryptoTransferSendAmountFragment), cryptoTransferSendAmountFragment.getCallbacks(), WindowInsetsPadding_androidKt.navigationBarsPadding(Modifier.INSTANCE), null, composer3, 0, 8);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 6);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoTransferSendAmountFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: CryptoTransferSendAmountFragment.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0006\u0010+\u001a\u00020,J\u0016\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020,R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\f\u001a\u0004\u0018\u00010\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0016\u0010\r\u001a\u0004\u0018\u00010\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0014\u0010\u0010\u001a\u00020\u0011X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0017\u0010$\u001a\u00020\u0007¢\u0006\u000e\n\u0000\u0012\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0019R\u0017\u0010(\u001a\u00020\u0007¢\u0006\u000e\n\u0000\u0012\u0004\b)\u0010&\u001a\u0004\b*\u0010\u0019¨\u00062"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountFragment$Args;", "Landroid/os/Parcelable;", "uiCurrencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "loggingSessionId", "Ljava/util/UUID;", PlaceTypes.ADDRESS, "", "previouslySavedCryptoInputMode", "Lcom/robinhood/shared/formats/crypto/CryptoInputMode;", "previouslySavedCryptoAmount", "Ljava/math/BigDecimal;", "previouslySavedFiatAmount", "addressTag", "selectedNetwork", "Lcom/robinhood/models/api/transfer/ApiCryptoSupportedNetworks$CryptoNetwork;", "isFromGateway", "", "<init>", "(Lcom/robinhood/models/crypto/ui/UiCurrencyPair;Ljava/util/UUID;Ljava/lang/String;Lcom/robinhood/shared/formats/crypto/CryptoInputMode;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Lcom/robinhood/models/api/transfer/ApiCryptoSupportedNetworks$CryptoNetwork;Z)V", "getUiCurrencyPair", "()Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "getLoggingSessionId$feature_crypto_transfer_externalDebug", "()Ljava/util/UUID;", "getAddress$feature_crypto_transfer_externalDebug", "()Ljava/lang/String;", "getPreviouslySavedCryptoInputMode$feature_crypto_transfer_externalDebug", "()Lcom/robinhood/shared/formats/crypto/CryptoInputMode;", "getPreviouslySavedCryptoAmount$feature_crypto_transfer_externalDebug", "()Ljava/math/BigDecimal;", "getPreviouslySavedFiatAmount$feature_crypto_transfer_externalDebug", "getAddressTag$feature_crypto_transfer_externalDebug", "getSelectedNetwork$feature_crypto_transfer_externalDebug", "()Lcom/robinhood/models/api/transfer/ApiCryptoSupportedNetworks$CryptoNetwork;", "isFromGateway$feature_crypto_transfer_externalDebug", "()Z", "currencyIdString", "getCurrencyIdString$annotations", "()V", "getCurrencyIdString", "loggingSessionIdString", "getLoggingSessionIdString$annotations", "getLoggingSessionIdString", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String address;
        private final String addressTag;
        private final String currencyIdString;
        private final boolean isFromGateway;
        private final UUID loggingSessionId;
        private final String loggingSessionIdString;
        private final BigDecimal previouslySavedCryptoAmount;
        private final CryptoInputMode previouslySavedCryptoInputMode;
        private final BigDecimal previouslySavedFiatAmount;
        private final ApiCryptoSupportedNetworks.CryptoNetwork selectedNetwork;
        private final UiCurrencyPair uiCurrencyPair;

        /* compiled from: CryptoTransferSendAmountFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((UiCurrencyPair) parcel.readParcelable(Args.class.getClassLoader()), (UUID) parcel.readSerializable(), parcel.readString(), parcel.readInt() == 0 ? null : CryptoInputMode.valueOf(parcel.readString()), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readString(), (ApiCryptoSupportedNetworks.CryptoNetwork) parcel.readParcelable(Args.class.getClassLoader()), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ void getCurrencyIdString$annotations() {
        }

        public static /* synthetic */ void getLoggingSessionIdString$annotations() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.uiCurrencyPair, flags);
            dest.writeSerializable(this.loggingSessionId);
            dest.writeString(this.address);
            CryptoInputMode cryptoInputMode = this.previouslySavedCryptoInputMode;
            if (cryptoInputMode == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(cryptoInputMode.name());
            }
            dest.writeSerializable(this.previouslySavedCryptoAmount);
            dest.writeSerializable(this.previouslySavedFiatAmount);
            dest.writeString(this.addressTag);
            dest.writeParcelable(this.selectedNetwork, flags);
            dest.writeInt(this.isFromGateway ? 1 : 0);
        }

        public Args(UiCurrencyPair uiCurrencyPair, UUID loggingSessionId, String address, CryptoInputMode cryptoInputMode, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str, ApiCryptoSupportedNetworks.CryptoNetwork cryptoNetwork, boolean z) {
            Intrinsics.checkNotNullParameter(uiCurrencyPair, "uiCurrencyPair");
            Intrinsics.checkNotNullParameter(loggingSessionId, "loggingSessionId");
            Intrinsics.checkNotNullParameter(address, "address");
            this.uiCurrencyPair = uiCurrencyPair;
            this.loggingSessionId = loggingSessionId;
            this.address = address;
            this.previouslySavedCryptoInputMode = cryptoInputMode;
            this.previouslySavedCryptoAmount = bigDecimal;
            this.previouslySavedFiatAmount = bigDecimal2;
            this.addressTag = str;
            this.selectedNetwork = cryptoNetwork;
            this.isFromGateway = z;
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

        /* renamed from: getLoggingSessionId$feature_crypto_transfer_externalDebug, reason: from getter */
        public final UUID getLoggingSessionId() {
            return this.loggingSessionId;
        }

        /* renamed from: getAddress$feature_crypto_transfer_externalDebug, reason: from getter */
        public final String getAddress() {
            return this.address;
        }

        /* renamed from: getPreviouslySavedCryptoInputMode$feature_crypto_transfer_externalDebug, reason: from getter */
        public final CryptoInputMode getPreviouslySavedCryptoInputMode() {
            return this.previouslySavedCryptoInputMode;
        }

        /* renamed from: getPreviouslySavedCryptoAmount$feature_crypto_transfer_externalDebug, reason: from getter */
        public final BigDecimal getPreviouslySavedCryptoAmount() {
            return this.previouslySavedCryptoAmount;
        }

        /* renamed from: getPreviouslySavedFiatAmount$feature_crypto_transfer_externalDebug, reason: from getter */
        public final BigDecimal getPreviouslySavedFiatAmount() {
            return this.previouslySavedFiatAmount;
        }

        /* renamed from: getAddressTag$feature_crypto_transfer_externalDebug, reason: from getter */
        public final String getAddressTag() {
            return this.addressTag;
        }

        /* renamed from: getSelectedNetwork$feature_crypto_transfer_externalDebug, reason: from getter */
        public final ApiCryptoSupportedNetworks.CryptoNetwork getSelectedNetwork() {
            return this.selectedNetwork;
        }

        /* renamed from: isFromGateway$feature_crypto_transfer_externalDebug, reason: from getter */
        public final boolean getIsFromGateway() {
            return this.isFromGateway;
        }

        public final String getCurrencyIdString() {
            return this.currencyIdString;
        }

        public final String getLoggingSessionIdString() {
            return this.loggingSessionIdString;
        }
    }

    /* compiled from: CryptoTransferSendAmountFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountFragment;", "Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountFragment$Args;", "<init>", "()V", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<CryptoTransferSendAmountFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(CryptoTransferSendAmountFragment cryptoTransferSendAmountFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, cryptoTransferSendAmountFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public CryptoTransferSendAmountFragment newInstance(Args args) {
            return (CryptoTransferSendAmountFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(CryptoTransferSendAmountFragment cryptoTransferSendAmountFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, cryptoTransferSendAmountFragment, args);
        }
    }
}
