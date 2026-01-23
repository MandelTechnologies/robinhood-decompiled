package com.robinhood.shared.crypto.transfer.send.memo;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.core.view.MenuProvider;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.progress.RdsSegmentedProgressBar;
import com.robinhood.android.regiongate.CryptoRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.models.crypto.p314db.transfer.CryptoTransferConfig;
import com.robinhood.shared.crypto.transfer.C37934R;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.Set;
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
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;

/* compiled from: CryptoTransferSendMemoFragment.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 ,2\u00020\u00012\u00020\u00022\u00020\u0003:\u0003*+,B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001a\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\r\u0010\u0015\u001a\u00020\rH\u0017¢\u0006\u0002\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u001a\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0014H\u0016J\t\u0010$\u001a\u00020\u001dH\u0096\u0001R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0018\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&X\u0096\u0005¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006-"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/memo/CryptoTransferSendMemoFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Landroidx/core/view/MenuProvider;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "callback", "Lcom/robinhood/shared/crypto/transfer/send/memo/CryptoTransferSendMemoFragment$Callbacks;", "getCallback", "()Lcom/robinhood/shared/crypto/transfer/send/memo/CryptoTransferSendMemoFragment$Callbacks;", "callback$delegate", "Lkotlin/properties/ReadOnlyProperty;", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onCreateMenu", "menu", "Landroid/view/Menu;", "menuInflater", "Landroid/view/MenuInflater;", "onMenuItemSelected", "", "menuItem", "Landroid/view/MenuItem;", "onPositiveButtonClicked", "id", "", "passthroughArgs", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Args", "Companion", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class CryptoTransferSendMemoFragment extends GenericComposeFragment implements MenuProvider, RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(CryptoRegionGate.INSTANCE);

    /* renamed from: callback$delegate, reason: from kotlin metadata */
    private final Interfaces2 callback = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.shared.crypto.transfer.send.memo.CryptoTransferSendMemoFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(CryptoTransferSendMemoFragment.class, "callback", "getCallback()Lcom/robinhood/shared/crypto/transfer/send/memo/CryptoTransferSendMemoFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: CryptoTransferSendMemoFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/memo/CryptoTransferSendMemoFragment$Callbacks;", "", "continueWithAddressTag", "", "addressTag", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void continueWithAddressTag(String addressTag);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(CryptoTransferSendMemoFragment cryptoTransferSendMemoFragment, int i, Composer composer, int i2) {
        cryptoTransferSendMemoFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    @Override // androidx.core.view.MenuProvider
    public /* bridge */ /* synthetic */ void onMenuClosed(Menu menu) {
        super.onMenuClosed(menu);
    }

    @Override // androidx.core.view.MenuProvider
    public /* bridge */ /* synthetic */ void onPrepareMenu(Menu menu) {
        super.onPrepareMenu(menu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallback() {
        return (Callbacks) this.callback.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        RdsSegmentedProgressBar progressBar = toolbar.getProgressBar();
        progressBar.setVisibility(0);
        progressBar.setNumSegments(1);
        progressBar.setProgress(0, 0.33f, true);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        fragmentActivityRequireActivity.addMenuProvider(this, getViewLifecycleOwner(), Lifecycle.State.RESUMED);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(373605465);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(373605465, i2, -1, "com.robinhood.shared.crypto.transfer.send.memo.CryptoTransferSendMemoFragment.ComposeContent (CryptoTransferSendMemoFragment.kt:61)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, Boolean.TRUE, null, null, ComposableLambda3.rememberComposableLambda(1400454673, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.memo.CryptoTransferSendMemoFragment.ComposeContent.1
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
                        ComposerKt.traceEventStart(1400454673, i3, -1, "com.robinhood.shared.crypto.transfer.send.memo.CryptoTransferSendMemoFragment.ComposeContent.<anonymous> (CryptoTransferSendMemoFragment.kt:63)");
                    }
                    Companion companion = CryptoTransferSendMemoFragment.INSTANCE;
                    String savedTag = ((Args) companion.getArgs((Fragment) CryptoTransferSendMemoFragment.this)).getSavedTag();
                    Callbacks callback = CryptoTransferSendMemoFragment.this.getCallback();
                    composer2.startReplaceGroup(5004770);
                    boolean zChangedInstance = composer2.changedInstance(callback);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new CryptoTransferSendMemoFragment2(callback);
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    composer2.endReplaceGroup();
                    CryptoTransferSendMemoComposable3.CryptoTransferSendMemoComposable(((Args) companion.getArgs((Fragment) CryptoTransferSendMemoFragment.this)).getAddressTag(), savedTag, (Function1) ((KFunction) objRememberedValue), null, composer2, 0, 8);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 100859904, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.send.memo.CryptoTransferSendMemoFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoTransferSendMemoFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // androidx.core.view.MenuProvider
    public void onCreateMenu(Menu menu, MenuInflater menuInflater) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(menuInflater, "menuInflater");
        menuInflater.inflate(C37934R.menu.menu_crypto_send_memo, menu);
    }

    @Override // androidx.core.view.MenuProvider
    public boolean onMenuItemSelected(MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        if (menuItem.getItemId() != C37934R.id.menu_crypto_send_memo) {
            return false;
        }
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder theme = companion.create(contextRequireContext).setId(C37934R.id.dialog_id_memo_skip).setTitle(C37934R.string.crypto_transfer_send_memo_skip_title, new Object[0]).setMessage(C37934R.string.crypto_transfer_send_memo_skip_message, new Object[0]).setPositiveButton(C37934R.string.crypto_transfer_send_memo_positive_btn, new Object[0]).setNegativeButton(C37934R.string.crypto_transfer_send_memo_negative_btn, new Object[0]).setTheme(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        RhDialogFragment.Builder.show$default(theme, childFragmentManager, "memo-skip-dialog", false, 4, null);
        return true;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C37934R.id.dialog_id_memo_skip) {
            getCallback().continueWithAddressTag("");
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    /* compiled from: CryptoTransferSendMemoFragment.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/memo/CryptoTransferSendMemoFragment$Args;", "Landroid/os/Parcelable;", "addressTag", "Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig$TransferAddressTag;", "savedTag", "", "<init>", "(Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig$TransferAddressTag;Ljava/lang/String;)V", "getAddressTag", "()Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig$TransferAddressTag;", "getSavedTag", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final CryptoTransferConfig.TransferAddressTag addressTag;
        private final String savedTag;

        /* compiled from: CryptoTransferSendMemoFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((CryptoTransferConfig.TransferAddressTag) parcel.readParcelable(Args.class.getClassLoader()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, CryptoTransferConfig.TransferAddressTag transferAddressTag, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                transferAddressTag = args.addressTag;
            }
            if ((i & 2) != 0) {
                str = args.savedTag;
            }
            return args.copy(transferAddressTag, str);
        }

        /* renamed from: component1, reason: from getter */
        public final CryptoTransferConfig.TransferAddressTag getAddressTag() {
            return this.addressTag;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSavedTag() {
            return this.savedTag;
        }

        public final Args copy(CryptoTransferConfig.TransferAddressTag addressTag, String savedTag) {
            Intrinsics.checkNotNullParameter(addressTag, "addressTag");
            return new Args(addressTag, savedTag);
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
            return Intrinsics.areEqual(this.addressTag, args.addressTag) && Intrinsics.areEqual(this.savedTag, args.savedTag);
        }

        public int hashCode() {
            int iHashCode = this.addressTag.hashCode() * 31;
            String str = this.savedTag;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Args(addressTag=" + this.addressTag + ", savedTag=" + this.savedTag + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.addressTag, flags);
            dest.writeString(this.savedTag);
        }

        public Args(CryptoTransferConfig.TransferAddressTag addressTag, String str) {
            Intrinsics.checkNotNullParameter(addressTag, "addressTag");
            this.addressTag = addressTag;
            this.savedTag = str;
        }

        public final CryptoTransferConfig.TransferAddressTag getAddressTag() {
            return this.addressTag;
        }

        public final String getSavedTag() {
            return this.savedTag;
        }
    }

    /* compiled from: CryptoTransferSendMemoFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/memo/CryptoTransferSendMemoFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/shared/crypto/transfer/send/memo/CryptoTransferSendMemoFragment;", "Lcom/robinhood/shared/crypto/transfer/send/memo/CryptoTransferSendMemoFragment$Args;", "<init>", "()V", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<CryptoTransferSendMemoFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(CryptoTransferSendMemoFragment cryptoTransferSendMemoFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, cryptoTransferSendMemoFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public CryptoTransferSendMemoFragment newInstance(Args args) {
            return (CryptoTransferSendMemoFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(CryptoTransferSendMemoFragment cryptoTransferSendMemoFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, cryptoTransferSendMemoFragment, args);
        }
    }
}
