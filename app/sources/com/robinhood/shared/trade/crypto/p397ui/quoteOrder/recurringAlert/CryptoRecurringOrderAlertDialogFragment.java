package com.robinhood.shared.trade.crypto.p397ui.quoteOrder.recurringAlert;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.regiongate.CryptoRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.compose.app.GenericComposeDialogFragment;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.shared.trade.crypto.p397ui.quoteOrder.recurringAlert.CryptoRecurringOrderAlertDialogFragment;
import com.robinhood.shared.trade.crypto.validation.alert.CryptoOrderValidationFailureAlertDialogComposable;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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

/* compiled from: CryptoRecurringOrderAlertDialogFragment.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0004\u0018\u0019\u001a\u001bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u000b\u001a\u00020\fH\u0017¢\u0006\u0002\u0010\rJ\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\t\u0010\u0011\u001a\u00020\u0012H\u0096\u0001R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/recurringAlert/CryptoRecurringOrderAlertDialogFragment;", "Lcom/robinhood/compose/app/GenericComposeDialogFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "callbacks", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/recurringAlert/CryptoRecurringOrderAlertDialogFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/recurringAlert/CryptoRecurringOrderAlertDialogFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "handleAction", "action", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/recurringAlert/CryptoRecurringOrderAlertDialogFragment$Action;", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Action", "Args", "Companion", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class CryptoRecurringOrderAlertDialogFragment extends GenericComposeDialogFragment implements RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(CryptoRegionGate.INSTANCE);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.shared.trade.crypto.ui.quoteOrder.recurringAlert.CryptoRecurringOrderAlertDialogFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(CryptoRecurringOrderAlertDialogFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/recurringAlert/CryptoRecurringOrderAlertDialogFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: CryptoRecurringOrderAlertDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/recurringAlert/CryptoRecurringOrderAlertDialogFragment$Callbacks;", "", "onContinueRecurringValidation", "", "onRecurringDepositFunds", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onContinueRecurringValidation();

        void onRecurringDepositFunds();
    }

    /* compiled from: CryptoRecurringOrderAlertDialogFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Action.values().length];
            try {
                iArr[Action.CONTINUE_WITH_RECURRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Action.DEPOSIT_FUNDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(CryptoRecurringOrderAlertDialogFragment cryptoRecurringOrderAlertDialogFragment, int i, Composer composer, int i2) {
        cryptoRecurringOrderAlertDialogFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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
    /* compiled from: CryptoRecurringOrderAlertDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/recurringAlert/CryptoRecurringOrderAlertDialogFragment$Action;", "", "<init>", "(Ljava/lang/String;I)V", "CONTINUE_WITH_RECURRING", "DEPOSIT_FUNDS", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Action {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Action[] $VALUES;
        public static final Action CONTINUE_WITH_RECURRING = new Action("CONTINUE_WITH_RECURRING", 0);
        public static final Action DEPOSIT_FUNDS = new Action("DEPOSIT_FUNDS", 1);

        private static final /* synthetic */ Action[] $values() {
            return new Action[]{CONTINUE_WITH_RECURRING, DEPOSIT_FUNDS};
        }

        public static EnumEntries<Action> getEntries() {
            return $ENTRIES;
        }

        private Action(String str, int i) {
        }

        static {
            Action[] actionArr$values = $values();
            $VALUES = actionArr$values;
            $ENTRIES = EnumEntries2.enumEntries(actionArr$values);
        }

        public static Action valueOf(String str) {
            return (Action) Enum.valueOf(Action.class, str);
        }

        public static Action[] values() {
            return (Action[]) $VALUES.clone();
        }
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* compiled from: CryptoRecurringOrderAlertDialogFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.recurringAlert.CryptoRecurringOrderAlertDialogFragment$ComposeContent$1 */
    static final class C406571 implements Function2<Composer, Integer, Unit> {
        C406571() {
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
                ComposerKt.traceEventStart(-494909161, i, -1, "com.robinhood.shared.trade.crypto.ui.quoteOrder.recurringAlert.CryptoRecurringOrderAlertDialogFragment.ComposeContent.<anonymous> (CryptoRecurringOrderAlertDialogFragment.kt:37)");
            }
            Companion companion = CryptoRecurringOrderAlertDialogFragment.INSTANCE;
            StringResource title = ((Args) companion.getArgs((Fragment) CryptoRecurringOrderAlertDialogFragment.this)).getTitle();
            int i2 = StringResource.$stable;
            String textAsString = StringResources6.getTextAsString(title, composer, i2);
            String textAsString2 = StringResources6.getTextAsString(((Args) companion.getArgs((Fragment) CryptoRecurringOrderAlertDialogFragment.this)).getBody(), composer, i2);
            String textAsString3 = StringResources6.getTextAsString(((Args) companion.getArgs((Fragment) CryptoRecurringOrderAlertDialogFragment.this)).getPrimaryButtonText(), composer, i2);
            StringResource secondaryButtonText = ((Args) companion.getArgs((Fragment) CryptoRecurringOrderAlertDialogFragment.this)).getSecondaryButtonText();
            composer.startReplaceGroup(1133676168);
            String textAsString4 = secondaryButtonText == null ? null : StringResources6.getTextAsString(secondaryButtonText, composer, i2);
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(CryptoRecurringOrderAlertDialogFragment.this);
            final CryptoRecurringOrderAlertDialogFragment cryptoRecurringOrderAlertDialogFragment = CryptoRecurringOrderAlertDialogFragment.this;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.quoteOrder.recurringAlert.CryptoRecurringOrderAlertDialogFragment$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoRecurringOrderAlertDialogFragment.C406571.invoke$lambda$2$lambda$1(cryptoRecurringOrderAlertDialogFragment);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(CryptoRecurringOrderAlertDialogFragment.this);
            final CryptoRecurringOrderAlertDialogFragment cryptoRecurringOrderAlertDialogFragment2 = CryptoRecurringOrderAlertDialogFragment.this;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.quoteOrder.recurringAlert.CryptoRecurringOrderAlertDialogFragment$ComposeContent$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoRecurringOrderAlertDialogFragment.C406571.invoke$lambda$5$lambda$4(cryptoRecurringOrderAlertDialogFragment2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            CryptoOrderValidationFailureAlertDialogComposable.CryptoOrderValidationFailureAlertDialogComposable(textAsString, textAsString2, textAsString3, textAsString4, function0, (Function0) objRememberedValue2, null, composer, 0, 64);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1(CryptoRecurringOrderAlertDialogFragment cryptoRecurringOrderAlertDialogFragment) {
            Action primaryAction = ((Args) CryptoRecurringOrderAlertDialogFragment.INSTANCE.getArgs((Fragment) cryptoRecurringOrderAlertDialogFragment)).getPrimaryAction();
            if (primaryAction != null) {
                cryptoRecurringOrderAlertDialogFragment.handleAction(primaryAction);
            }
            cryptoRecurringOrderAlertDialogFragment.dismiss();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4(CryptoRecurringOrderAlertDialogFragment cryptoRecurringOrderAlertDialogFragment) {
            Action secondaryAction = ((Args) CryptoRecurringOrderAlertDialogFragment.INSTANCE.getArgs((Fragment) cryptoRecurringOrderAlertDialogFragment)).getSecondaryAction();
            if (secondaryAction != null) {
                cryptoRecurringOrderAlertDialogFragment.handleAction(secondaryAction);
            }
            cryptoRecurringOrderAlertDialogFragment.dismiss();
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeDialogFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1814020769);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1814020769, i2, -1, "com.robinhood.shared.trade.crypto.ui.quoteOrder.recurringAlert.CryptoRecurringOrderAlertDialogFragment.ComposeContent (CryptoRecurringOrderAlertDialogFragment.kt:35)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-494909161, true, new C406571(), composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.quoteOrder.recurringAlert.CryptoRecurringOrderAlertDialogFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoRecurringOrderAlertDialogFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleAction(Action action) {
        int i = WhenMappings.$EnumSwitchMapping$0[action.ordinal()];
        if (i == 1) {
            getCallbacks().onContinueRecurringValidation();
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            getCallbacks().onRecurringDepositFunds();
        }
    }

    /* compiled from: CryptoRecurringOrderAlertDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003JK\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u001cHÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006)"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/recurringAlert/CryptoRecurringOrderAlertDialogFragment$Args;", "Landroid/os/Parcelable;", "title", "Lcom/robinhood/utils/resource/StringResource;", CarResultComposable2.BODY, "primaryButtonText", "secondaryButtonText", "primaryAction", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/recurringAlert/CryptoRecurringOrderAlertDialogFragment$Action;", "secondaryAction", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/recurringAlert/CryptoRecurringOrderAlertDialogFragment$Action;Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/recurringAlert/CryptoRecurringOrderAlertDialogFragment$Action;)V", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getBody", "getPrimaryButtonText", "getSecondaryButtonText", "getPrimaryAction", "()Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/recurringAlert/CryptoRecurringOrderAlertDialogFragment$Action;", "getSecondaryAction", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = StringResource.$stable;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final StringResource body;
        private final Action primaryAction;
        private final StringResource primaryButtonText;
        private final Action secondaryAction;
        private final StringResource secondaryButtonText;
        private final StringResource title;

        /* compiled from: CryptoRecurringOrderAlertDialogFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((StringResource) parcel.readParcelable(Args.class.getClassLoader()), (StringResource) parcel.readParcelable(Args.class.getClassLoader()), (StringResource) parcel.readParcelable(Args.class.getClassLoader()), (StringResource) parcel.readParcelable(Args.class.getClassLoader()), parcel.readInt() == 0 ? null : Action.valueOf(parcel.readString()), parcel.readInt() != 0 ? Action.valueOf(parcel.readString()) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, StringResource stringResource, StringResource stringResource2, StringResource stringResource3, StringResource stringResource4, Action action, Action action2, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = args.title;
            }
            if ((i & 2) != 0) {
                stringResource2 = args.body;
            }
            if ((i & 4) != 0) {
                stringResource3 = args.primaryButtonText;
            }
            if ((i & 8) != 0) {
                stringResource4 = args.secondaryButtonText;
            }
            if ((i & 16) != 0) {
                action = args.primaryAction;
            }
            if ((i & 32) != 0) {
                action2 = args.secondaryAction;
            }
            Action action3 = action;
            Action action4 = action2;
            return args.copy(stringResource, stringResource2, stringResource3, stringResource4, action3, action4);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final StringResource getBody() {
            return this.body;
        }

        /* renamed from: component3, reason: from getter */
        public final StringResource getPrimaryButtonText() {
            return this.primaryButtonText;
        }

        /* renamed from: component4, reason: from getter */
        public final StringResource getSecondaryButtonText() {
            return this.secondaryButtonText;
        }

        /* renamed from: component5, reason: from getter */
        public final Action getPrimaryAction() {
            return this.primaryAction;
        }

        /* renamed from: component6, reason: from getter */
        public final Action getSecondaryAction() {
            return this.secondaryAction;
        }

        public final Args copy(StringResource title, StringResource body, StringResource primaryButtonText, StringResource secondaryButtonText, Action primaryAction, Action secondaryAction) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(body, "body");
            Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
            return new Args(title, body, primaryButtonText, secondaryButtonText, primaryAction, secondaryAction);
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
            return Intrinsics.areEqual(this.title, args.title) && Intrinsics.areEqual(this.body, args.body) && Intrinsics.areEqual(this.primaryButtonText, args.primaryButtonText) && Intrinsics.areEqual(this.secondaryButtonText, args.secondaryButtonText) && this.primaryAction == args.primaryAction && this.secondaryAction == args.secondaryAction;
        }

        public int hashCode() {
            int iHashCode = ((((this.title.hashCode() * 31) + this.body.hashCode()) * 31) + this.primaryButtonText.hashCode()) * 31;
            StringResource stringResource = this.secondaryButtonText;
            int iHashCode2 = (iHashCode + (stringResource == null ? 0 : stringResource.hashCode())) * 31;
            Action action = this.primaryAction;
            int iHashCode3 = (iHashCode2 + (action == null ? 0 : action.hashCode())) * 31;
            Action action2 = this.secondaryAction;
            return iHashCode3 + (action2 != null ? action2.hashCode() : 0);
        }

        public String toString() {
            return "Args(title=" + this.title + ", body=" + this.body + ", primaryButtonText=" + this.primaryButtonText + ", secondaryButtonText=" + this.secondaryButtonText + ", primaryAction=" + this.primaryAction + ", secondaryAction=" + this.secondaryAction + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.title, flags);
            dest.writeParcelable(this.body, flags);
            dest.writeParcelable(this.primaryButtonText, flags);
            dest.writeParcelable(this.secondaryButtonText, flags);
            Action action = this.primaryAction;
            if (action == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(action.name());
            }
            Action action2 = this.secondaryAction;
            if (action2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(action2.name());
            }
        }

        public Args(StringResource title, StringResource body, StringResource primaryButtonText, StringResource stringResource, Action action, Action action2) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(body, "body");
            Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
            this.title = title;
            this.body = body;
            this.primaryButtonText = primaryButtonText;
            this.secondaryButtonText = stringResource;
            this.primaryAction = action;
            this.secondaryAction = action2;
        }

        public /* synthetic */ Args(StringResource stringResource, StringResource stringResource2, StringResource stringResource3, StringResource stringResource4, Action action, Action action2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(stringResource, stringResource2, stringResource3, (i & 8) != 0 ? null : stringResource4, (i & 16) != 0 ? null : action, (i & 32) != 0 ? null : action2);
        }

        public final StringResource getTitle() {
            return this.title;
        }

        public final StringResource getBody() {
            return this.body;
        }

        public final StringResource getPrimaryButtonText() {
            return this.primaryButtonText;
        }

        public final StringResource getSecondaryButtonText() {
            return this.secondaryButtonText;
        }

        public final Action getPrimaryAction() {
            return this.primaryAction;
        }

        public final Action getSecondaryAction() {
            return this.secondaryAction;
        }
    }

    /* compiled from: CryptoRecurringOrderAlertDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/recurringAlert/CryptoRecurringOrderAlertDialogFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/recurringAlert/CryptoRecurringOrderAlertDialogFragment;", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/recurringAlert/CryptoRecurringOrderAlertDialogFragment$Args;", "<init>", "()V", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<CryptoRecurringOrderAlertDialogFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(CryptoRecurringOrderAlertDialogFragment cryptoRecurringOrderAlertDialogFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, cryptoRecurringOrderAlertDialogFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public CryptoRecurringOrderAlertDialogFragment newInstance(Args args) {
            return (CryptoRecurringOrderAlertDialogFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(CryptoRecurringOrderAlertDialogFragment cryptoRecurringOrderAlertDialogFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, cryptoRecurringOrderAlertDialogFragment, args);
        }
    }
}
