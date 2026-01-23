package com.robinhood.shared.crypto.p375ui.fee.unsupported.recurring;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.regiongate.CryptoRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.compose.app.GenericComposeDialogFragment;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.crypto.p375ui.fee.unsupported.recurring.CryptoFeeUnsupportedRecurringAlertDialogFragment;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
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

/* compiled from: CryptoFeeUnsupportedRecurringAlertDialogFragment.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00182\u00020\u00012\u00020\u0002:\u0004\u0015\u0016\u0017\u0018B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u000b\u001a\u00020\fH\u0017¢\u0006\u0002\u0010\rJ\t\u0010\u000e\u001a\u00020\u000fH\u0096\u0001R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/fee/unsupported/recurring/CryptoFeeUnsupportedRecurringAlertDialogFragment;", "Lcom/robinhood/compose/app/GenericComposeDialogFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "callbacks", "Lcom/robinhood/shared/crypto/ui/fee/unsupported/recurring/CryptoFeeUnsupportedRecurringAlertDialogFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/shared/crypto/ui/fee/unsupported/recurring/CryptoFeeUnsupportedRecurringAlertDialogFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "PositiveAction", "Args", "Companion", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class CryptoFeeUnsupportedRecurringAlertDialogFragment extends GenericComposeDialogFragment implements RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(CryptoRegionGate.INSTANCE);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.shared.crypto.ui.fee.unsupported.recurring.CryptoFeeUnsupportedRecurringAlertDialogFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(CryptoFeeUnsupportedRecurringAlertDialogFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/shared/crypto/ui/fee/unsupported/recurring/CryptoFeeUnsupportedRecurringAlertDialogFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: CryptoFeeUnsupportedRecurringAlertDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/fee/unsupported/recurring/CryptoFeeUnsupportedRecurringAlertDialogFragment$Callbacks;", "", "onPositiveAction", "", "action", "Lcom/robinhood/shared/crypto/ui/fee/unsupported/recurring/CryptoFeeUnsupportedRecurringAlertDialogFragment$PositiveAction;", "onCancel", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onCancel();

        void onPositiveAction(PositiveAction action);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(CryptoFeeUnsupportedRecurringAlertDialogFragment cryptoFeeUnsupportedRecurringAlertDialogFragment, int i, Composer composer, int i2) {
        cryptoFeeUnsupportedRecurringAlertDialogFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CryptoFeeUnsupportedRecurringAlertDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/fee/unsupported/recurring/CryptoFeeUnsupportedRecurringAlertDialogFragment$PositiveAction;", "", "<init>", "(Ljava/lang/String;I)V", "CONTINUE_WITH_RECURRING", "DISMISS", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class PositiveAction {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ PositiveAction[] $VALUES;
        public static final PositiveAction CONTINUE_WITH_RECURRING = new PositiveAction("CONTINUE_WITH_RECURRING", 0);
        public static final PositiveAction DISMISS = new PositiveAction("DISMISS", 1);

        private static final /* synthetic */ PositiveAction[] $values() {
            return new PositiveAction[]{CONTINUE_WITH_RECURRING, DISMISS};
        }

        public static EnumEntries<PositiveAction> getEntries() {
            return $ENTRIES;
        }

        private PositiveAction(String str, int i) {
        }

        static {
            PositiveAction[] positiveActionArr$values = $values();
            $VALUES = positiveActionArr$values;
            $ENTRIES = EnumEntries2.enumEntries(positiveActionArr$values);
        }

        public static PositiveAction valueOf(String str) {
            return (PositiveAction) Enum.valueOf(PositiveAction.class, str);
        }

        public static PositiveAction[] values() {
            return (PositiveAction[]) $VALUES.clone();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.compose.app.GenericComposeDialogFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1542557652);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1542557652, i2, -1, "com.robinhood.shared.crypto.ui.fee.unsupported.recurring.CryptoFeeUnsupportedRecurringAlertDialogFragment.ComposeContent (CryptoFeeUnsupportedRecurringAlertDialogFragment.kt:43)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, Boolean.TRUE, null, null, ComposableLambda3.rememberComposableLambda(-905590900, true, new C385911(), composerStartRestartGroup, 54), composerStartRestartGroup, 100859904, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.ui.fee.unsupported.recurring.CryptoFeeUnsupportedRecurringAlertDialogFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoFeeUnsupportedRecurringAlertDialogFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: CryptoFeeUnsupportedRecurringAlertDialogFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.crypto.ui.fee.unsupported.recurring.CryptoFeeUnsupportedRecurringAlertDialogFragment$ComposeContent$1 */
    static final class C385911 implements Function2<Composer, Integer, Unit> {
        C385911() {
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
                ComposerKt.traceEventStart(-905590900, i, -1, "com.robinhood.shared.crypto.ui.fee.unsupported.recurring.CryptoFeeUnsupportedRecurringAlertDialogFragment.ComposeContent.<anonymous> (CryptoFeeUnsupportedRecurringAlertDialogFragment.kt:47)");
            }
            Companion companion = CryptoFeeUnsupportedRecurringAlertDialogFragment.INSTANCE;
            String assetCurrencyCode = ((Args) companion.getArgs((Fragment) CryptoFeeUnsupportedRecurringAlertDialogFragment.this)).getAssetCurrencyCode();
            Screen eventScreen = ((Args) companion.getArgs((Fragment) CryptoFeeUnsupportedRecurringAlertDialogFragment.this)).getEventScreen();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(CryptoFeeUnsupportedRecurringAlertDialogFragment.this);
            final CryptoFeeUnsupportedRecurringAlertDialogFragment cryptoFeeUnsupportedRecurringAlertDialogFragment = CryptoFeeUnsupportedRecurringAlertDialogFragment.this;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.ui.fee.unsupported.recurring.CryptoFeeUnsupportedRecurringAlertDialogFragment$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoFeeUnsupportedRecurringAlertDialogFragment.C385911.invoke$lambda$1$lambda$0(cryptoFeeUnsupportedRecurringAlertDialogFragment);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(CryptoFeeUnsupportedRecurringAlertDialogFragment.this);
            final CryptoFeeUnsupportedRecurringAlertDialogFragment cryptoFeeUnsupportedRecurringAlertDialogFragment2 = CryptoFeeUnsupportedRecurringAlertDialogFragment.this;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.crypto.ui.fee.unsupported.recurring.CryptoFeeUnsupportedRecurringAlertDialogFragment$ComposeContent$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoFeeUnsupportedRecurringAlertDialogFragment.C385911.invoke$lambda$3$lambda$2(cryptoFeeUnsupportedRecurringAlertDialogFragment2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            CryptoFeeUnsupportedRecurringAlertDialogComposable.CryptoFeeUnsupportedRecurringAlertDialogComposable(assetCurrencyCode, eventScreen, function0, (Function0) objRememberedValue2, null, composer, 0, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(CryptoFeeUnsupportedRecurringAlertDialogFragment cryptoFeeUnsupportedRecurringAlertDialogFragment) {
            cryptoFeeUnsupportedRecurringAlertDialogFragment.getCallbacks().onPositiveAction(((Args) CryptoFeeUnsupportedRecurringAlertDialogFragment.INSTANCE.getArgs((Fragment) cryptoFeeUnsupportedRecurringAlertDialogFragment)).getPositiveAction());
            cryptoFeeUnsupportedRecurringAlertDialogFragment.dismiss();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(CryptoFeeUnsupportedRecurringAlertDialogFragment cryptoFeeUnsupportedRecurringAlertDialogFragment) {
            cryptoFeeUnsupportedRecurringAlertDialogFragment.getCallbacks().onCancel();
            cryptoFeeUnsupportedRecurringAlertDialogFragment.dismiss();
            return Unit.INSTANCE;
        }
    }

    /* compiled from: CryptoFeeUnsupportedRecurringAlertDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/fee/unsupported/recurring/CryptoFeeUnsupportedRecurringAlertDialogFragment$Args;", "Landroid/os/Parcelable;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "assetCurrencyCode", "", "positiveAction", "Lcom/robinhood/shared/crypto/ui/fee/unsupported/recurring/CryptoFeeUnsupportedRecurringAlertDialogFragment$PositiveAction;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/Screen;Ljava/lang/String;Lcom/robinhood/shared/crypto/ui/fee/unsupported/recurring/CryptoFeeUnsupportedRecurringAlertDialogFragment$PositiveAction;)V", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "getAssetCurrencyCode", "()Ljava/lang/String;", "getPositiveAction", "()Lcom/robinhood/shared/crypto/ui/fee/unsupported/recurring/CryptoFeeUnsupportedRecurringAlertDialogFragment$PositiveAction;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String assetCurrencyCode;
        private final Screen eventScreen;
        private final PositiveAction positiveAction;

        /* compiled from: CryptoFeeUnsupportedRecurringAlertDialogFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((Screen) parcel.readSerializable(), parcel.readString(), PositiveAction.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, Screen screen, String str, PositiveAction positiveAction, int i, Object obj) {
            if ((i & 1) != 0) {
                screen = args.eventScreen;
            }
            if ((i & 2) != 0) {
                str = args.assetCurrencyCode;
            }
            if ((i & 4) != 0) {
                positiveAction = args.positiveAction;
            }
            return args.copy(screen, str, positiveAction);
        }

        /* renamed from: component1, reason: from getter */
        public final Screen getEventScreen() {
            return this.eventScreen;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAssetCurrencyCode() {
            return this.assetCurrencyCode;
        }

        /* renamed from: component3, reason: from getter */
        public final PositiveAction getPositiveAction() {
            return this.positiveAction;
        }

        public final Args copy(Screen eventScreen, String assetCurrencyCode, PositiveAction positiveAction) {
            Intrinsics.checkNotNullParameter(eventScreen, "eventScreen");
            Intrinsics.checkNotNullParameter(assetCurrencyCode, "assetCurrencyCode");
            Intrinsics.checkNotNullParameter(positiveAction, "positiveAction");
            return new Args(eventScreen, assetCurrencyCode, positiveAction);
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
            return Intrinsics.areEqual(this.eventScreen, args.eventScreen) && Intrinsics.areEqual(this.assetCurrencyCode, args.assetCurrencyCode) && this.positiveAction == args.positiveAction;
        }

        public int hashCode() {
            return (((this.eventScreen.hashCode() * 31) + this.assetCurrencyCode.hashCode()) * 31) + this.positiveAction.hashCode();
        }

        public String toString() {
            return "Args(eventScreen=" + this.eventScreen + ", assetCurrencyCode=" + this.assetCurrencyCode + ", positiveAction=" + this.positiveAction + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.eventScreen);
            dest.writeString(this.assetCurrencyCode);
            dest.writeString(this.positiveAction.name());
        }

        public Args(Screen eventScreen, String assetCurrencyCode, PositiveAction positiveAction) {
            Intrinsics.checkNotNullParameter(eventScreen, "eventScreen");
            Intrinsics.checkNotNullParameter(assetCurrencyCode, "assetCurrencyCode");
            Intrinsics.checkNotNullParameter(positiveAction, "positiveAction");
            this.eventScreen = eventScreen;
            this.assetCurrencyCode = assetCurrencyCode;
            this.positiveAction = positiveAction;
        }

        public final Screen getEventScreen() {
            return this.eventScreen;
        }

        public final String getAssetCurrencyCode() {
            return this.assetCurrencyCode;
        }

        public final PositiveAction getPositiveAction() {
            return this.positiveAction;
        }
    }

    /* compiled from: CryptoFeeUnsupportedRecurringAlertDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/fee/unsupported/recurring/CryptoFeeUnsupportedRecurringAlertDialogFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/shared/crypto/ui/fee/unsupported/recurring/CryptoFeeUnsupportedRecurringAlertDialogFragment;", "Lcom/robinhood/shared/crypto/ui/fee/unsupported/recurring/CryptoFeeUnsupportedRecurringAlertDialogFragment$Args;", "<init>", "()V", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<CryptoFeeUnsupportedRecurringAlertDialogFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(CryptoFeeUnsupportedRecurringAlertDialogFragment cryptoFeeUnsupportedRecurringAlertDialogFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, cryptoFeeUnsupportedRecurringAlertDialogFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public CryptoFeeUnsupportedRecurringAlertDialogFragment newInstance(Args args) {
            return (CryptoFeeUnsupportedRecurringAlertDialogFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(CryptoFeeUnsupportedRecurringAlertDialogFragment cryptoFeeUnsupportedRecurringAlertDialogFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, cryptoFeeUnsupportedRecurringAlertDialogFragment, args);
        }
    }
}
