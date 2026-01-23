package com.robinhood.shared.trade.crypto.p397ui.fee.notificationPrimer;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.regiongate.CryptoRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.shared.trade.crypto.p397ui.fee.notificationPrimer.CryptoFeeTierNotificationPrimerFragment;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: CryptoFeeTierNotificationPrimerFragment.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001e2\u00020\u00012\u00020\u0002:\u0003\u001c\u001d\u001eB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\r\u0010\u0013\u001a\u00020\u0010H\u0017¢\u0006\u0002\u0010\u0014J\b\u0010\u0015\u001a\u00020\fH\u0016J\t\u0010\u0016\u001a\u00020\fH\u0096\u0001R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\fX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/fee/notificationPrimer/CryptoFeeTierNotificationPrimerFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "callbacks", "Lcom/robinhood/shared/trade/crypto/ui/fee/notificationPrimer/CryptoFeeTierNotificationPrimerFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/shared/trade/crypto/ui/fee/notificationPrimer/CryptoFeeTierNotificationPrimerFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "toolbarVisible", "", "getToolbarVisible", "()Z", "onAttach", "", "context", "Landroid/content/Context;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onBackPressed", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "CryptoFeeTierNotificationPrimerFragmentKey", "Companion", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class CryptoFeeTierNotificationPrimerFragment extends GenericComposeFragment implements RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(CryptoRegionGate.INSTANCE);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.shared.trade.crypto.ui.fee.notificationPrimer.CryptoFeeTierNotificationPrimerFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof CryptoFeeTierNotificationPrimerFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });
    private final boolean toolbarVisible;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(CryptoFeeTierNotificationPrimerFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/shared/trade/crypto/ui/fee/notificationPrimer/CryptoFeeTierNotificationPrimerFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: CryptoFeeTierNotificationPrimerFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/fee/notificationPrimer/CryptoFeeTierNotificationPrimerFragment$Callbacks;", "", "onOrderFlowFinished", "", "isOrderFilled", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onOrderFlowFinished(boolean isOrderFilled);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$3(CryptoFeeTierNotificationPrimerFragment cryptoFeeTierNotificationPrimerFragment, int i, Composer composer, int i2) {
        cryptoFeeTierNotificationPrimerFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putAchromaticOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-986128432);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-986128432, i2, -1, "com.robinhood.shared.trade.crypto.ui.fee.notificationPrimer.CryptoFeeTierNotificationPrimerFragment.ComposeContent (CryptoFeeTierNotificationPrimerFragment.kt:37)");
            }
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.fee.notificationPrimer.CryptoFeeTierNotificationPrimerFragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoFeeTierNotificationPrimerFragment.ComposeContent$lambda$2$lambda$1(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            CryptoFeeTierNotificationPrimerComposable3.CryptoFeeTierNotificationPrimerComposable((Function0) objRememberedValue, null, null, composerStartRestartGroup, 0, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.fee.notificationPrimer.CryptoFeeTierNotificationPrimerFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoFeeTierNotificationPrimerFragment.ComposeContent$lambda$3(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$2$lambda$1(CryptoFeeTierNotificationPrimerFragment cryptoFeeTierNotificationPrimerFragment) {
        cryptoFeeTierNotificationPrimerFragment.requireActivity().finish();
        cryptoFeeTierNotificationPrimerFragment.getCallbacks().onOrderFlowFinished(((CryptoFeeTierNotificationPrimerFragmentKey) INSTANCE.getArgs((Fragment) cryptoFeeTierNotificationPrimerFragment)).isOrderFilled());
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return true;
        }
        activity.finish();
        return true;
    }

    /* compiled from: CryptoFeeTierNotificationPrimerFragment.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\t\u001a\u00020\nJ\u0013\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\nHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/fee/notificationPrimer/CryptoFeeTierNotificationPrimerFragment$CryptoFeeTierNotificationPrimerFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "isOrderFilled", "", "<init>", "(Z)V", "()Z", "component1", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class CryptoFeeTierNotificationPrimerFragmentKey implements FragmentKey {
        public static final int $stable = 0;
        public static final Parcelable.Creator<CryptoFeeTierNotificationPrimerFragmentKey> CREATOR = new Creator();
        private final boolean isOrderFilled;

        /* compiled from: CryptoFeeTierNotificationPrimerFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<CryptoFeeTierNotificationPrimerFragmentKey> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CryptoFeeTierNotificationPrimerFragmentKey createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CryptoFeeTierNotificationPrimerFragmentKey(parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CryptoFeeTierNotificationPrimerFragmentKey[] newArray(int i) {
                return new CryptoFeeTierNotificationPrimerFragmentKey[i];
            }
        }

        public static /* synthetic */ CryptoFeeTierNotificationPrimerFragmentKey copy$default(CryptoFeeTierNotificationPrimerFragmentKey cryptoFeeTierNotificationPrimerFragmentKey, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = cryptoFeeTierNotificationPrimerFragmentKey.isOrderFilled;
            }
            return cryptoFeeTierNotificationPrimerFragmentKey.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsOrderFilled() {
            return this.isOrderFilled;
        }

        public final CryptoFeeTierNotificationPrimerFragmentKey copy(boolean isOrderFilled) {
            return new CryptoFeeTierNotificationPrimerFragmentKey(isOrderFilled);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CryptoFeeTierNotificationPrimerFragmentKey) && this.isOrderFilled == ((CryptoFeeTierNotificationPrimerFragmentKey) other).isOrderFilled;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isOrderFilled);
        }

        public String toString() {
            return "CryptoFeeTierNotificationPrimerFragmentKey(isOrderFilled=" + this.isOrderFilled + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.isOrderFilled ? 1 : 0);
        }

        public CryptoFeeTierNotificationPrimerFragmentKey(boolean z) {
            this.isOrderFilled = z;
        }

        public final boolean isOrderFilled() {
            return this.isOrderFilled;
        }
    }

    /* compiled from: CryptoFeeTierNotificationPrimerFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/fee/notificationPrimer/CryptoFeeTierNotificationPrimerFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/shared/trade/crypto/ui/fee/notificationPrimer/CryptoFeeTierNotificationPrimerFragment;", "Lcom/robinhood/shared/trade/crypto/ui/fee/notificationPrimer/CryptoFeeTierNotificationPrimerFragment$CryptoFeeTierNotificationPrimerFragmentKey;", "<init>", "()V", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<CryptoFeeTierNotificationPrimerFragment, CryptoFeeTierNotificationPrimerFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(CryptoFeeTierNotificationPrimerFragmentKey cryptoFeeTierNotificationPrimerFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, cryptoFeeTierNotificationPrimerFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public CryptoFeeTierNotificationPrimerFragmentKey getArgs(CryptoFeeTierNotificationPrimerFragment cryptoFeeTierNotificationPrimerFragment) {
            return (CryptoFeeTierNotificationPrimerFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, cryptoFeeTierNotificationPrimerFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public CryptoFeeTierNotificationPrimerFragment newInstance(CryptoFeeTierNotificationPrimerFragmentKey cryptoFeeTierNotificationPrimerFragmentKey) {
            return (CryptoFeeTierNotificationPrimerFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, cryptoFeeTierNotificationPrimerFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(CryptoFeeTierNotificationPrimerFragment cryptoFeeTierNotificationPrimerFragment, CryptoFeeTierNotificationPrimerFragmentKey cryptoFeeTierNotificationPrimerFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, cryptoFeeTierNotificationPrimerFragment, cryptoFeeTierNotificationPrimerFragmentKey);
        }
    }
}
