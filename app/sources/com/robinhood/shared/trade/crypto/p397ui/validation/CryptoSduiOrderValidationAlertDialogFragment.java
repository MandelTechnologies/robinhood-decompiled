package com.robinhood.shared.trade.crypto.p397ui.validation;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert;
import com.robinhood.compose.app.GenericComposeDialogFragment;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.models.serverdriven.experimental.api.CryptoValidateOrderAction;
import com.robinhood.models.serverdriven.experimental.api.DeeplinkAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import com.robinhood.shared.trade.crypto.p397ui.validation.CryptoSduiOrderValidationAlertDialogFragment;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
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

/* compiled from: CryptoSduiOrderValidationAlertDialogFragment.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0003\r\u000e\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\n\u001a\u00020\u000bH\u0017¢\u0006\u0002\u0010\fR\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/validation/CryptoSduiOrderValidationAlertDialogFragment;", "Lcom/robinhood/compose/app/GenericComposeDialogFragment;", "<init>", "()V", "callbacks", "Lcom/robinhood/shared/trade/crypto/ui/validation/CryptoSduiOrderValidationAlertDialogFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/shared/trade/crypto/ui/validation/CryptoSduiOrderValidationAlertDialogFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "Callbacks", "Args", "Companion", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class CryptoSduiOrderValidationAlertDialogFragment extends GenericComposeDialogFragment {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.shared.trade.crypto.ui.validation.CryptoSduiOrderValidationAlertDialogFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(CryptoSduiOrderValidationAlertDialogFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/shared/trade/crypto/ui/validation/CryptoSduiOrderValidationAlertDialogFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: CryptoSduiOrderValidationAlertDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/validation/CryptoSduiOrderValidationAlertDialogFragment$Callbacks;", "", "handleAction", "", "action", "Lcom/robinhood/models/serverdriven/experimental/api/CryptoValidateOrderAction;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void handleAction(CryptoValidateOrderAction action);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$2(CryptoSduiOrderValidationAlertDialogFragment cryptoSduiOrderValidationAlertDialogFragment, int i, Composer composer, int i2) {
        cryptoSduiOrderValidationAlertDialogFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.compose.app.GenericComposeDialogFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-982702639);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-982702639, i2, -1, "com.robinhood.shared.trade.crypto.ui.validation.CryptoSduiOrderValidationAlertDialogFragment.ComposeContent (CryptoSduiOrderValidationAlertDialogFragment.kt:26)");
            }
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.validation.CryptoSduiOrderValidationAlertDialogFragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(CryptoSduiOrderValidationAlertDialogFragment.ComposeContent$lambda$1$lambda$0(this.f$0, (CryptoValidateOrderAction) obj));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoTheme2.BentoTheme(null, null, null, null, null, Boolean.TRUE, null, null, ComposableLambda3.rememberComposableLambda(-1645041895, true, new C408601((Function1) objRememberedValue), composerStartRestartGroup, 54), composerStartRestartGroup, 100859904, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.validation.CryptoSduiOrderValidationAlertDialogFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoSduiOrderValidationAlertDialogFragment.ComposeContent$lambda$2(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ComposeContent$lambda$1$lambda$0(CryptoSduiOrderValidationAlertDialogFragment cryptoSduiOrderValidationAlertDialogFragment, CryptoValidateOrderAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        cryptoSduiOrderValidationAlertDialogFragment.getCallbacks().handleAction(action);
        return true;
    }

    /* compiled from: CryptoSduiOrderValidationAlertDialogFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.trade.crypto.ui.validation.CryptoSduiOrderValidationAlertDialogFragment$ComposeContent$1 */
    static final class C408601 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Function1<CryptoValidateOrderAction, Boolean> $handleAction;

        /* JADX WARN: Multi-variable type inference failed */
        C408601(Function1<? super CryptoValidateOrderAction, Boolean> function1) {
            this.$handleAction = function1;
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
                ComposerKt.traceEventStart(-1645041895, i, -1, "com.robinhood.shared.trade.crypto.ui.validation.CryptoSduiOrderValidationAlertDialogFragment.ComposeContent.<anonymous> (CryptoSduiOrderValidationAlertDialogFragment.kt:32)");
            }
            SduiAlert sduiAlert = SduiAlert.INSTANCE;
            GenericAlertContent<CryptoValidateOrderAction> alert = ((Args) CryptoSduiOrderValidationAlertDialogFragment.INSTANCE.getArgs((Fragment) CryptoSduiOrderValidationAlertDialogFragment.this)).getAlert();
            CryptoSduiOrderValidationAlertDialogFragment2 cryptoSduiOrderValidationAlertDialogFragment2 = new CryptoSduiOrderValidationAlertDialogFragment2(this.$handleAction);
            composer.startReplaceGroup(5004770);
            boolean zChanged = composer.changed(this.$handleAction);
            final Function1<CryptoValidateOrderAction, Boolean> function1 = this.$handleAction;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.validation.CryptoSduiOrderValidationAlertDialogFragment$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CryptoSduiOrderValidationAlertDialogFragment.C408601.invoke$lambda$1$lambda$0(function1, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            sduiAlert.Dialog(alert, cryptoSduiOrderValidationAlertDialogFragment2, (Function1) objRememberedValue, null, composer, SduiAlert.$stable << 12, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Function1 function1, String uri) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            function1.invoke(new CryptoValidateOrderAction.Deeplink(new DeeplinkAction(uri)));
            return Unit.INSTANCE;
        }
    }

    /* compiled from: CryptoSduiOrderValidationAlertDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/validation/CryptoSduiOrderValidationAlertDialogFragment$Args;", "Landroid/os/Parcelable;", "alert", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "Lcom/robinhood/models/serverdriven/experimental/api/CryptoValidateOrderAction;", "<init>", "(Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;)V", "getAlert", "()Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final GenericAlertContent<CryptoValidateOrderAction> alert;

        /* compiled from: CryptoSduiOrderValidationAlertDialogFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((GenericAlertContent) parcel.readParcelable(Args.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Args copy$default(Args args, GenericAlertContent genericAlertContent, int i, Object obj) {
            if ((i & 1) != 0) {
                genericAlertContent = args.alert;
            }
            return args.copy(genericAlertContent);
        }

        public final GenericAlertContent<CryptoValidateOrderAction> component1() {
            return this.alert;
        }

        public final Args copy(GenericAlertContent<? extends CryptoValidateOrderAction> alert) {
            Intrinsics.checkNotNullParameter(alert, "alert");
            return new Args(alert);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Args) && Intrinsics.areEqual(this.alert, ((Args) other).alert);
        }

        public int hashCode() {
            return this.alert.hashCode();
        }

        public String toString() {
            return "Args(alert=" + this.alert + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.alert, flags);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Args(GenericAlertContent<? extends CryptoValidateOrderAction> alert) {
            Intrinsics.checkNotNullParameter(alert, "alert");
            this.alert = alert;
        }

        public final GenericAlertContent<CryptoValidateOrderAction> getAlert() {
            return this.alert;
        }
    }

    /* compiled from: CryptoSduiOrderValidationAlertDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/validation/CryptoSduiOrderValidationAlertDialogFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/shared/trade/crypto/ui/validation/CryptoSduiOrderValidationAlertDialogFragment;", "Lcom/robinhood/shared/trade/crypto/ui/validation/CryptoSduiOrderValidationAlertDialogFragment$Args;", "<init>", "()V", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<CryptoSduiOrderValidationAlertDialogFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(CryptoSduiOrderValidationAlertDialogFragment cryptoSduiOrderValidationAlertDialogFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, cryptoSduiOrderValidationAlertDialogFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public CryptoSduiOrderValidationAlertDialogFragment newInstance(Args args) {
            return (CryptoSduiOrderValidationAlertDialogFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(CryptoSduiOrderValidationAlertDialogFragment cryptoSduiOrderValidationAlertDialogFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, cryptoSduiOrderValidationAlertDialogFragment, args);
        }
    }
}
