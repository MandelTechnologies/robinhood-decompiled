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
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert;
import com.robinhood.compose.app.GenericComposeDialogFragment;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.trade.crypto.p397ui.validation.CryptoSduiOrderValidationAlertDialogFragmentV2;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.squareup.wire.AnyMessage;
import contracts.crypto.trade.proto.p431v1.ValidateCryptoOrderResponse;
import contracts.crypto.trade.proto.p431v1.ValidateCryptoOrderResponseDto;
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
import rh_server_driven_ui.p531v1.ActionDto;
import rh_server_driven_ui.p531v1.AlertDto;

/* compiled from: CryptoSduiOrderValidationAlertDialogFragmentV2.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0003\r\u000e\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\n\u001a\u00020\u000bH\u0017¢\u0006\u0002\u0010\fR\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/validation/CryptoSduiOrderValidationAlertDialogFragmentV2;", "Lcom/robinhood/compose/app/GenericComposeDialogFragment;", "<init>", "()V", "callbacks", "Lcom/robinhood/shared/trade/crypto/ui/validation/CryptoSduiOrderValidationAlertDialogFragmentV2$Callbacks;", "getCallbacks", "()Lcom/robinhood/shared/trade/crypto/ui/validation/CryptoSduiOrderValidationAlertDialogFragmentV2$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "Callbacks", "Args", "Companion", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class CryptoSduiOrderValidationAlertDialogFragmentV2 extends GenericComposeDialogFragment {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.shared.trade.crypto.ui.validation.CryptoSduiOrderValidationAlertDialogFragmentV2$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(CryptoSduiOrderValidationAlertDialogFragmentV2.class, "callbacks", "getCallbacks()Lcom/robinhood/shared/trade/crypto/ui/validation/CryptoSduiOrderValidationAlertDialogFragmentV2$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: CryptoSduiOrderValidationAlertDialogFragmentV2.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/validation/CryptoSduiOrderValidationAlertDialogFragmentV2$Callbacks;", "", "handleAction", "", "action", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto;", "handleDeeplink", "uri", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void handleAction(ValidateCryptoOrderResponseDto.MobileDto.ActionDto action);

        void handleDeeplink(String uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$2(CryptoSduiOrderValidationAlertDialogFragmentV2 cryptoSduiOrderValidationAlertDialogFragmentV2, int i, Composer composer, int i2) {
        cryptoSduiOrderValidationAlertDialogFragmentV2.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.compose.app.GenericComposeDialogFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1120799143);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1120799143, i2, -1, "com.robinhood.shared.trade.crypto.ui.validation.CryptoSduiOrderValidationAlertDialogFragmentV2.ComposeContent (CryptoSduiOrderValidationAlertDialogFragmentV2.kt:31)");
            }
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.validation.CryptoSduiOrderValidationAlertDialogFragmentV2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(CryptoSduiOrderValidationAlertDialogFragmentV2.ComposeContent$lambda$1$lambda$0(this.f$0, (ValidateCryptoOrderResponseDto.MobileDto.ActionDto) obj));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final Function1 function1 = (Function1) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            BentoTheme2.BentoTheme(null, null, null, null, null, Boolean.TRUE, null, null, ComposableLambda3.rememberComposableLambda(-385510495, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.validation.CryptoSduiOrderValidationAlertDialogFragmentV2.ComposeContent.1
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
                        ComposerKt.traceEventStart(-385510495, i3, -1, "com.robinhood.shared.trade.crypto.ui.validation.CryptoSduiOrderValidationAlertDialogFragmentV2.ComposeContent.<anonymous> (CryptoSduiOrderValidationAlertDialogFragmentV2.kt:37)");
                    }
                    Companion companion = CryptoSduiOrderValidationAlertDialogFragmentV2.INSTANCE;
                    AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, ((Args) companion.getArgs((Fragment) CryptoSduiOrderValidationAlertDialogFragmentV2.this)).getEventScreen(), null, ((Args) companion.getArgs((Fragment) CryptoSduiOrderValidationAlertDialogFragmentV2.this)).getEventContext(), null, null, 53, null), ComposableLambda3.rememberComposableLambda(-727684074, true, new AnonymousClass1(CryptoSduiOrderValidationAlertDialogFragmentV2.this, function1), composer2, 54), composer2, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: CryptoSduiOrderValidationAlertDialogFragmentV2.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.shared.trade.crypto.ui.validation.CryptoSduiOrderValidationAlertDialogFragmentV2$ComposeContent$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ Function1<ValidateCryptoOrderResponseDto.MobileDto.ActionDto, Boolean> $handleAction;
                    final /* synthetic */ CryptoSduiOrderValidationAlertDialogFragmentV2 this$0;

                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass1(CryptoSduiOrderValidationAlertDialogFragmentV2 cryptoSduiOrderValidationAlertDialogFragmentV2, Function1<? super ValidateCryptoOrderResponseDto.MobileDto.ActionDto, Boolean> function1) {
                        this.this$0 = cryptoSduiOrderValidationAlertDialogFragmentV2;
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
                            ComposerKt.traceEventStart(-727684074, i, -1, "com.robinhood.shared.trade.crypto.ui.validation.CryptoSduiOrderValidationAlertDialogFragmentV2.ComposeContent.<anonymous>.<anonymous> (CryptoSduiOrderValidationAlertDialogFragmentV2.kt:43)");
                        }
                        SduiAlert sduiAlert = SduiAlert.INSTANCE;
                        AlertDto alert = ((Args) CryptoSduiOrderValidationAlertDialogFragmentV2.INSTANCE.getArgs((Fragment) this.this$0)).getAlert();
                        composer.startReplaceGroup(1849434622);
                        Object objRememberedValue = composer.rememberedValue();
                        Composer.Companion companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.validation.CryptoSduiOrderValidationAlertDialogFragmentV2$ComposeContent$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return CryptoSduiOrderValidationAlertDialogFragmentV2.C408671.AnonymousClass1.invoke$lambda$2$lambda$1((ActionDto) obj);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        Function1 function1 = (Function1) objRememberedValue;
                        composer.endReplaceGroup();
                        CryptoSduiOrderValidationAlertDialogFragmentV22 cryptoSduiOrderValidationAlertDialogFragmentV22 = new CryptoSduiOrderValidationAlertDialogFragmentV22(this.$handleAction);
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance = composer.changedInstance(this.this$0);
                        final CryptoSduiOrderValidationAlertDialogFragmentV2 cryptoSduiOrderValidationAlertDialogFragmentV2 = this.this$0;
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.validation.CryptoSduiOrderValidationAlertDialogFragmentV2$ComposeContent$1$1$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return CryptoSduiOrderValidationAlertDialogFragmentV2.C408671.AnonymousClass1.invoke$lambda$4$lambda$3(cryptoSduiOrderValidationAlertDialogFragmentV2, (String) obj);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        composer.endReplaceGroup();
                        sduiAlert.Dialog(alert, function1, cryptoSduiOrderValidationAlertDialogFragmentV22, (Function1<? super String, Unit>) objRememberedValue2, (Function0<Unit>) null, composer, (SduiAlert.$stable << 15) | 48, 16);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final ValidateCryptoOrderResponseDto.MobileDto.ActionDto invoke$lambda$2$lambda$1(ActionDto actionDto) {
                        AnyMessage concrete;
                        if (actionDto == null || (concrete = actionDto.getConcrete()) == null) {
                            return null;
                        }
                        ValidateCryptoOrderResponseDto.MobileDto.ActionDto.Companion companion = ValidateCryptoOrderResponseDto.MobileDto.ActionDto.INSTANCE;
                        ValidateCryptoOrderResponse.Mobile.Action action = (ValidateCryptoOrderResponse.Mobile.Action) concrete.unpack(companion.getProtoAdapter());
                        if (action != null) {
                            return companion.fromProto(action);
                        }
                        return null;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$4$lambda$3(CryptoSduiOrderValidationAlertDialogFragmentV2 cryptoSduiOrderValidationAlertDialogFragmentV2, String uri) {
                        Intrinsics.checkNotNullParameter(uri, "uri");
                        cryptoSduiOrderValidationAlertDialogFragmentV2.getCallbacks().handleDeeplink(uri);
                        return Unit.INSTANCE;
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.validation.CryptoSduiOrderValidationAlertDialogFragmentV2$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoSduiOrderValidationAlertDialogFragmentV2.ComposeContent$lambda$2(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ComposeContent$lambda$1$lambda$0(CryptoSduiOrderValidationAlertDialogFragmentV2 cryptoSduiOrderValidationAlertDialogFragmentV2, ValidateCryptoOrderResponseDto.MobileDto.ActionDto action) {
        Intrinsics.checkNotNullParameter(action, "action");
        cryptoSduiOrderValidationAlertDialogFragmentV2.getCallbacks().handleAction(action);
        return true;
    }

    /* compiled from: CryptoSduiOrderValidationAlertDialogFragmentV2.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\r\u0010\u0013\u001a\u00060\u0007j\u0002`\bHÆ\u0003J+\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\f\b\u0002\u0010\u0006\u001a\u00060\u0007j\u0002`\bHÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0006\u001a\u00060\u0007j\u0002`\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006#"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/validation/CryptoSduiOrderValidationAlertDialogFragmentV2$Args;", "Landroid/os/Parcelable;", "alert", "Lrh_server_driven_ui/v1/AlertDto;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "<init>", "(Lrh_server_driven_ui/v1/AlertDto;Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/rosetta/eventlogging/Context;)V", "getAlert", "()Lrh_server_driven_ui/v1/AlertDto;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final AlertDto alert;
        private final Context eventContext;
        private final Screen eventScreen;

        /* compiled from: CryptoSduiOrderValidationAlertDialogFragmentV2.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((AlertDto) parcel.readParcelable(Args.class.getClassLoader()), (Screen) parcel.readSerializable(), (Context) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, AlertDto alertDto, Screen screen, Context context, int i, Object obj) {
            if ((i & 1) != 0) {
                alertDto = args.alert;
            }
            if ((i & 2) != 0) {
                screen = args.eventScreen;
            }
            if ((i & 4) != 0) {
                context = args.eventContext;
            }
            return args.copy(alertDto, screen, context);
        }

        /* renamed from: component1, reason: from getter */
        public final AlertDto getAlert() {
            return this.alert;
        }

        /* renamed from: component2, reason: from getter */
        public final Screen getEventScreen() {
            return this.eventScreen;
        }

        /* renamed from: component3, reason: from getter */
        public final Context getEventContext() {
            return this.eventContext;
        }

        public final Args copy(AlertDto alert, Screen eventScreen, Context eventContext) {
            Intrinsics.checkNotNullParameter(alert, "alert");
            Intrinsics.checkNotNullParameter(eventScreen, "eventScreen");
            Intrinsics.checkNotNullParameter(eventContext, "eventContext");
            return new Args(alert, eventScreen, eventContext);
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
            return Intrinsics.areEqual(this.alert, args.alert) && Intrinsics.areEqual(this.eventScreen, args.eventScreen) && Intrinsics.areEqual(this.eventContext, args.eventContext);
        }

        public int hashCode() {
            return (((this.alert.hashCode() * 31) + this.eventScreen.hashCode()) * 31) + this.eventContext.hashCode();
        }

        public String toString() {
            return "Args(alert=" + this.alert + ", eventScreen=" + this.eventScreen + ", eventContext=" + this.eventContext + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.alert, flags);
            dest.writeSerializable(this.eventScreen);
            dest.writeSerializable(this.eventContext);
        }

        public Args(AlertDto alert, Screen eventScreen, Context eventContext) {
            Intrinsics.checkNotNullParameter(alert, "alert");
            Intrinsics.checkNotNullParameter(eventScreen, "eventScreen");
            Intrinsics.checkNotNullParameter(eventContext, "eventContext");
            this.alert = alert;
            this.eventScreen = eventScreen;
            this.eventContext = eventContext;
        }

        public final AlertDto getAlert() {
            return this.alert;
        }

        public final Screen getEventScreen() {
            return this.eventScreen;
        }

        public final Context getEventContext() {
            return this.eventContext;
        }
    }

    /* compiled from: CryptoSduiOrderValidationAlertDialogFragmentV2.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/validation/CryptoSduiOrderValidationAlertDialogFragmentV2$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/shared/trade/crypto/ui/validation/CryptoSduiOrderValidationAlertDialogFragmentV2;", "Lcom/robinhood/shared/trade/crypto/ui/validation/CryptoSduiOrderValidationAlertDialogFragmentV2$Args;", "<init>", "()V", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<CryptoSduiOrderValidationAlertDialogFragmentV2, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(CryptoSduiOrderValidationAlertDialogFragmentV2 cryptoSduiOrderValidationAlertDialogFragmentV2) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, cryptoSduiOrderValidationAlertDialogFragmentV2);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public CryptoSduiOrderValidationAlertDialogFragmentV2 newInstance(Args args) {
            return (CryptoSduiOrderValidationAlertDialogFragmentV2) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(CryptoSduiOrderValidationAlertDialogFragmentV2 cryptoSduiOrderValidationAlertDialogFragmentV2, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, cryptoSduiOrderValidationAlertDialogFragmentV2, args);
        }
    }
}
