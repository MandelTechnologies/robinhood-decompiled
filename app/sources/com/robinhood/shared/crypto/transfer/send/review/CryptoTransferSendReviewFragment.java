package com.robinhood.shared.crypto.transfer.send.review;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.designsystem.progress.RdsSegmentedProgressBar;
import com.robinhood.android.regiongate.CryptoRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.api.ErrorResponse3;
import com.robinhood.models.api.transfer.ApiCryptoSupportedNetworks;
import com.robinhood.models.crypto.p314db.transfer.CryptoTransferConfig;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.crypto.p315ui.transfer.CryptoTransferWithdrawal;
import com.robinhood.shared.formats.crypto.CryptoInputMode;
import com.robinhood.shared.lib.crypto.transfer.CryptoTransferErrorHandler;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
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

/* compiled from: CryptoTransferSendReviewFragment.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u0003\u001d\u001e\u001fB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\r\u0010\u0015\u001a\u00020\fH\u0017¢\u0006\u0002\u0010\u0016J\t\u0010\u0017\u001a\u00020\u0010H\u0096\u0001R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/review/CryptoTransferSendReviewFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "callbacks", "Lcom/robinhood/shared/crypto/transfer/send/review/CryptoTransferSendReviewFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/shared/crypto/transfer/send/review/CryptoTransferSendReviewFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onPositiveButtonClicked", "", "id", "", "passthroughArgs", "Landroid/os/Bundle;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Args", "Companion", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class CryptoTransferSendReviewFragment extends GenericComposeFragment implements RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(CryptoRegionGate.INSTANCE);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.shared.crypto.transfer.send.review.CryptoTransferSendReviewFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(CryptoTransferSendReviewFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/shared/crypto/transfer/send/review/CryptoTransferSendReviewFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: CryptoTransferSendReviewFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0003H&¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/review/CryptoTransferSendReviewFragment$Callbacks;", "", "onEditAddress", "", "onSentSuccessfully", "completedWithdrawal", "Lcom/robinhood/models/crypto/ui/transfer/CryptoTransferWithdrawal;", "onTransferExpired", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onEditAddress();

        void onSentSuccessfully(CryptoTransferWithdrawal completedWithdrawal);

        void onTransferExpired();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(CryptoTransferSendReviewFragment cryptoTransferSendReviewFragment, int i, Composer composer, int i2) {
        cryptoTransferSendReviewFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        RdsSegmentedProgressBar progressBar = toolbar.getProgressBar();
        progressBar.setVisibility(0);
        progressBar.setNumSegments(1);
        progressBar.setProgress(0, 1.0f, true);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        ErrorResponse3 errorCodedErrorResponse;
        if (id == C11048R.id.dialog_id_generic_error) {
            if (((passthroughArgs == null || (errorCodedErrorResponse = CryptoTransferErrorHandler.INSTANCE.getErrorCodedErrorResponse(passthroughArgs)) == null) ? null : errorCodedErrorResponse.getError_code()) == ErrorResponse3.ErrorCode.INVALID_OR_EXPIRED_FEE_TOKEN) {
                getCallbacks().onTransferExpired();
                return true;
            }
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-847850181);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-847850181, i2, -1, "com.robinhood.shared.crypto.transfer.send.review.CryptoTransferSendReviewFragment.ComposeContent (CryptoTransferSendReviewFragment.kt:68)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1192146310, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.review.CryptoTransferSendReviewFragment.ComposeContent.1
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
                        ComposerKt.traceEventStart(1192146310, i3, -1, "com.robinhood.shared.crypto.transfer.send.review.CryptoTransferSendReviewFragment.ComposeContent.<anonymous> (CryptoTransferSendReviewFragment.kt:70)");
                    }
                    CryptoTransferSendReviewComposable3.CryptoTransferSendReviewComposable(CryptoTransferSendReviewFragment.this.getCallbacks(), null, null, composer2, 0, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.send.review.CryptoTransferSendReviewFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoTransferSendReviewFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: CryptoTransferSendReviewFragment.kt */
    @Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0007HÆ\u0003J\t\u0010-\u001a\u00020\tHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u00101\u001a\u00020\u0011HÂ\u0003J_\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011HÆ\u0001J\u0006\u00103\u001a\u000204J\u0013\u00105\u001a\u00020\t2\b\u00106\u001a\u0004\u0018\u000107HÖ\u0003J\t\u00108\u001a\u000204HÖ\u0001J\t\u00109\u001a\u00020\"HÖ\u0001J\u0016\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u000204R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u001aR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010!\u001a\u00020\"¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010'\u001a\u00020\"¢\u0006\u000e\n\u0000\u0012\u0004\b(\u0010$\u001a\u0004\b)\u0010&¨\u0006?"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/review/CryptoTransferSendReviewFragment$Args;", "Landroid/os/Parcelable;", "uiCurrencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "withdrawal", "Lcom/robinhood/models/crypto/ui/transfer/CryptoTransferWithdrawal;", "cryptoInputMode", "Lcom/robinhood/shared/formats/crypto/CryptoInputMode;", "isFullAmount", "", "selectedNetwork", "Lcom/robinhood/models/api/transfer/ApiCryptoSupportedNetworks$CryptoNetwork;", "submitWarningSheet", "Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig$TransferWarnings$Stage$Warning;", "addressTagConfig", "Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig$TransferAddressTag;", "loggingSessionId", "Ljava/util/UUID;", "<init>", "(Lcom/robinhood/models/crypto/ui/UiCurrencyPair;Lcom/robinhood/models/crypto/ui/transfer/CryptoTransferWithdrawal;Lcom/robinhood/shared/formats/crypto/CryptoInputMode;ZLcom/robinhood/models/api/transfer/ApiCryptoSupportedNetworks$CryptoNetwork;Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig$TransferWarnings$Stage$Warning;Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig$TransferAddressTag;Ljava/util/UUID;)V", "getUiCurrencyPair", "()Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "getWithdrawal", "()Lcom/robinhood/models/crypto/ui/transfer/CryptoTransferWithdrawal;", "getCryptoInputMode", "()Lcom/robinhood/shared/formats/crypto/CryptoInputMode;", "()Z", "getSelectedNetwork", "()Lcom/robinhood/models/api/transfer/ApiCryptoSupportedNetworks$CryptoNetwork;", "getSubmitWarningSheet", "()Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig$TransferWarnings$Stage$Warning;", "getAddressTagConfig", "()Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig$TransferAddressTag;", "currencyIdString", "", "getCurrencyIdString$annotations", "()V", "getCurrencyIdString", "()Ljava/lang/String;", "loggingSessionIdString", "getLoggingSessionIdString$annotations", "getLoggingSessionIdString", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final CryptoTransferConfig.TransferAddressTag addressTagConfig;
        private final CryptoInputMode cryptoInputMode;
        private final String currencyIdString;
        private final boolean isFullAmount;
        private final UUID loggingSessionId;
        private final String loggingSessionIdString;
        private final ApiCryptoSupportedNetworks.CryptoNetwork selectedNetwork;
        private final CryptoTransferConfig.TransferWarnings.Stage.Warning submitWarningSheet;
        private final UiCurrencyPair uiCurrencyPair;
        private final CryptoTransferWithdrawal withdrawal;

        /* compiled from: CryptoTransferSendReviewFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((UiCurrencyPair) parcel.readParcelable(Args.class.getClassLoader()), (CryptoTransferWithdrawal) parcel.readParcelable(Args.class.getClassLoader()), CryptoInputMode.valueOf(parcel.readString()), parcel.readInt() != 0, (ApiCryptoSupportedNetworks.CryptoNetwork) parcel.readParcelable(Args.class.getClassLoader()), (CryptoTransferConfig.TransferWarnings.Stage.Warning) parcel.readParcelable(Args.class.getClassLoader()), (CryptoTransferConfig.TransferAddressTag) parcel.readParcelable(Args.class.getClassLoader()), (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        /* renamed from: component8, reason: from getter */
        private final UUID getLoggingSessionId() {
            return this.loggingSessionId;
        }

        public static /* synthetic */ Args copy$default(Args args, UiCurrencyPair uiCurrencyPair, CryptoTransferWithdrawal cryptoTransferWithdrawal, CryptoInputMode cryptoInputMode, boolean z, ApiCryptoSupportedNetworks.CryptoNetwork cryptoNetwork, CryptoTransferConfig.TransferWarnings.Stage.Warning warning, CryptoTransferConfig.TransferAddressTag transferAddressTag, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uiCurrencyPair = args.uiCurrencyPair;
            }
            if ((i & 2) != 0) {
                cryptoTransferWithdrawal = args.withdrawal;
            }
            if ((i & 4) != 0) {
                cryptoInputMode = args.cryptoInputMode;
            }
            if ((i & 8) != 0) {
                z = args.isFullAmount;
            }
            if ((i & 16) != 0) {
                cryptoNetwork = args.selectedNetwork;
            }
            if ((i & 32) != 0) {
                warning = args.submitWarningSheet;
            }
            if ((i & 64) != 0) {
                transferAddressTag = args.addressTagConfig;
            }
            if ((i & 128) != 0) {
                uuid = args.loggingSessionId;
            }
            CryptoTransferConfig.TransferAddressTag transferAddressTag2 = transferAddressTag;
            UUID uuid2 = uuid;
            ApiCryptoSupportedNetworks.CryptoNetwork cryptoNetwork2 = cryptoNetwork;
            CryptoTransferConfig.TransferWarnings.Stage.Warning warning2 = warning;
            return args.copy(uiCurrencyPair, cryptoTransferWithdrawal, cryptoInputMode, z, cryptoNetwork2, warning2, transferAddressTag2, uuid2);
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
        public final CryptoInputMode getCryptoInputMode() {
            return this.cryptoInputMode;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsFullAmount() {
            return this.isFullAmount;
        }

        /* renamed from: component5, reason: from getter */
        public final ApiCryptoSupportedNetworks.CryptoNetwork getSelectedNetwork() {
            return this.selectedNetwork;
        }

        /* renamed from: component6, reason: from getter */
        public final CryptoTransferConfig.TransferWarnings.Stage.Warning getSubmitWarningSheet() {
            return this.submitWarningSheet;
        }

        /* renamed from: component7, reason: from getter */
        public final CryptoTransferConfig.TransferAddressTag getAddressTagConfig() {
            return this.addressTagConfig;
        }

        public final Args copy(UiCurrencyPair uiCurrencyPair, CryptoTransferWithdrawal withdrawal, CryptoInputMode cryptoInputMode, boolean isFullAmount, ApiCryptoSupportedNetworks.CryptoNetwork selectedNetwork, CryptoTransferConfig.TransferWarnings.Stage.Warning submitWarningSheet, CryptoTransferConfig.TransferAddressTag addressTagConfig, UUID loggingSessionId) {
            Intrinsics.checkNotNullParameter(uiCurrencyPair, "uiCurrencyPair");
            Intrinsics.checkNotNullParameter(withdrawal, "withdrawal");
            Intrinsics.checkNotNullParameter(cryptoInputMode, "cryptoInputMode");
            Intrinsics.checkNotNullParameter(loggingSessionId, "loggingSessionId");
            return new Args(uiCurrencyPair, withdrawal, cryptoInputMode, isFullAmount, selectedNetwork, submitWarningSheet, addressTagConfig, loggingSessionId);
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
            return Intrinsics.areEqual(this.uiCurrencyPair, args.uiCurrencyPair) && Intrinsics.areEqual(this.withdrawal, args.withdrawal) && this.cryptoInputMode == args.cryptoInputMode && this.isFullAmount == args.isFullAmount && Intrinsics.areEqual(this.selectedNetwork, args.selectedNetwork) && Intrinsics.areEqual(this.submitWarningSheet, args.submitWarningSheet) && Intrinsics.areEqual(this.addressTagConfig, args.addressTagConfig) && Intrinsics.areEqual(this.loggingSessionId, args.loggingSessionId);
        }

        public int hashCode() {
            int iHashCode = ((((((this.uiCurrencyPair.hashCode() * 31) + this.withdrawal.hashCode()) * 31) + this.cryptoInputMode.hashCode()) * 31) + Boolean.hashCode(this.isFullAmount)) * 31;
            ApiCryptoSupportedNetworks.CryptoNetwork cryptoNetwork = this.selectedNetwork;
            int iHashCode2 = (iHashCode + (cryptoNetwork == null ? 0 : cryptoNetwork.hashCode())) * 31;
            CryptoTransferConfig.TransferWarnings.Stage.Warning warning = this.submitWarningSheet;
            int iHashCode3 = (iHashCode2 + (warning == null ? 0 : warning.hashCode())) * 31;
            CryptoTransferConfig.TransferAddressTag transferAddressTag = this.addressTagConfig;
            return ((iHashCode3 + (transferAddressTag != null ? transferAddressTag.hashCode() : 0)) * 31) + this.loggingSessionId.hashCode();
        }

        public String toString() {
            return "Args(uiCurrencyPair=" + this.uiCurrencyPair + ", withdrawal=" + this.withdrawal + ", cryptoInputMode=" + this.cryptoInputMode + ", isFullAmount=" + this.isFullAmount + ", selectedNetwork=" + this.selectedNetwork + ", submitWarningSheet=" + this.submitWarningSheet + ", addressTagConfig=" + this.addressTagConfig + ", loggingSessionId=" + this.loggingSessionId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.uiCurrencyPair, flags);
            dest.writeParcelable(this.withdrawal, flags);
            dest.writeString(this.cryptoInputMode.name());
            dest.writeInt(this.isFullAmount ? 1 : 0);
            dest.writeParcelable(this.selectedNetwork, flags);
            dest.writeParcelable(this.submitWarningSheet, flags);
            dest.writeParcelable(this.addressTagConfig, flags);
            dest.writeSerializable(this.loggingSessionId);
        }

        public Args(UiCurrencyPair uiCurrencyPair, CryptoTransferWithdrawal withdrawal, CryptoInputMode cryptoInputMode, boolean z, ApiCryptoSupportedNetworks.CryptoNetwork cryptoNetwork, CryptoTransferConfig.TransferWarnings.Stage.Warning warning, CryptoTransferConfig.TransferAddressTag transferAddressTag, UUID loggingSessionId) {
            Intrinsics.checkNotNullParameter(uiCurrencyPair, "uiCurrencyPair");
            Intrinsics.checkNotNullParameter(withdrawal, "withdrawal");
            Intrinsics.checkNotNullParameter(cryptoInputMode, "cryptoInputMode");
            Intrinsics.checkNotNullParameter(loggingSessionId, "loggingSessionId");
            this.uiCurrencyPair = uiCurrencyPair;
            this.withdrawal = withdrawal;
            this.cryptoInputMode = cryptoInputMode;
            this.isFullAmount = z;
            this.selectedNetwork = cryptoNetwork;
            this.submitWarningSheet = warning;
            this.addressTagConfig = transferAddressTag;
            this.loggingSessionId = loggingSessionId;
            String string2 = uiCurrencyPair.getAssetCurrencyId().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            this.currencyIdString = string2;
            String string3 = loggingSessionId.toString();
            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
            this.loggingSessionIdString = string3;
        }

        public /* synthetic */ Args(UiCurrencyPair uiCurrencyPair, CryptoTransferWithdrawal cryptoTransferWithdrawal, CryptoInputMode cryptoInputMode, boolean z, ApiCryptoSupportedNetworks.CryptoNetwork cryptoNetwork, CryptoTransferConfig.TransferWarnings.Stage.Warning warning, CryptoTransferConfig.TransferAddressTag transferAddressTag, UUID uuid, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(uiCurrencyPair, cryptoTransferWithdrawal, cryptoInputMode, z, cryptoNetwork, warning, (i & 64) != 0 ? null : transferAddressTag, uuid);
        }

        public final UiCurrencyPair getUiCurrencyPair() {
            return this.uiCurrencyPair;
        }

        public final CryptoTransferWithdrawal getWithdrawal() {
            return this.withdrawal;
        }

        public final CryptoInputMode getCryptoInputMode() {
            return this.cryptoInputMode;
        }

        public final boolean isFullAmount() {
            return this.isFullAmount;
        }

        public final ApiCryptoSupportedNetworks.CryptoNetwork getSelectedNetwork() {
            return this.selectedNetwork;
        }

        public final CryptoTransferConfig.TransferWarnings.Stage.Warning getSubmitWarningSheet() {
            return this.submitWarningSheet;
        }

        public final CryptoTransferConfig.TransferAddressTag getAddressTagConfig() {
            return this.addressTagConfig;
        }

        public final String getCurrencyIdString() {
            return this.currencyIdString;
        }

        public final String getLoggingSessionIdString() {
            return this.loggingSessionIdString;
        }
    }

    /* compiled from: CryptoTransferSendReviewFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/review/CryptoTransferSendReviewFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/shared/crypto/transfer/send/review/CryptoTransferSendReviewFragment;", "Lcom/robinhood/shared/crypto/transfer/send/review/CryptoTransferSendReviewFragment$Args;", "<init>", "()V", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<CryptoTransferSendReviewFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(CryptoTransferSendReviewFragment cryptoTransferSendReviewFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, cryptoTransferSendReviewFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public CryptoTransferSendReviewFragment newInstance(Args args) {
            return (CryptoTransferSendReviewFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(CryptoTransferSendReviewFragment cryptoTransferSendReviewFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, cryptoTransferSendReviewFragment, args);
        }
    }
}
