package com.robinhood.shared.trade.crypto.p397ui.price.orderPriceDialog;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.regiongate.CryptoRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.compose.app.GenericComposeDialogFragment;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.trade.crypto.p397ui.price.orderPriceDialog.CryptoOrderPriceDialogFragment;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.resource.StringResource;
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

/* compiled from: CryptoOrderPriceDialogFragment.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001c2\u00020\u00012\u00020\u00022\u00020\u0003:\u0003\u001a\u001b\u001cB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0010\u001a\u00020\u0011H\u0017¢\u0006\u0002\u0010\u0012J\t\u0010\u0013\u001a\u00020\u0014H\u0096\u0001R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/price/orderPriceDialog/CryptoOrderPriceDialogFragment;", "Lcom/robinhood/compose/app/GenericComposeDialogFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "callbacks", "Lcom/robinhood/shared/trade/crypto/ui/price/orderPriceDialog/CryptoOrderPriceDialogFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/shared/trade/crypto/ui/price/orderPriceDialog/CryptoOrderPriceDialogFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Args", "Companion", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class CryptoOrderPriceDialogFragment extends GenericComposeDialogFragment implements AutoLoggableFragment, RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(CryptoRegionGate.INSTANCE);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.shared.trade.crypto.ui.price.orderPriceDialog.CryptoOrderPriceDialogFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(CryptoOrderPriceDialogFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/shared/trade/crypto/ui/price/orderPriceDialog/CryptoOrderPriceDialogFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: CryptoOrderPriceDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/price/orderPriceDialog/CryptoOrderPriceDialogFragment$Callbacks;", "", "onNegativeRequest", "", "id", "", "onPositiveRequest", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onNegativeRequest(int id);

        void onPositiveRequest(int id);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(CryptoOrderPriceDialogFragment cryptoOrderPriceDialogFragment, int i, Composer composer, int i2) {
        cryptoOrderPriceDialogFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return ((Args) INSTANCE.getArgs((Fragment) this)).getEventScreen();
    }

    /* compiled from: CryptoOrderPriceDialogFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.trade.crypto.ui.price.orderPriceDialog.CryptoOrderPriceDialogFragment$ComposeContent$1 */
    static final class C405311 implements Function2<Composer, Integer, Unit> {
        C405311() {
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
                ComposerKt.traceEventStart(-649857240, i, -1, "com.robinhood.shared.trade.crypto.ui.price.orderPriceDialog.CryptoOrderPriceDialogFragment.ComposeContent.<anonymous> (CryptoOrderPriceDialogFragment.kt:35)");
            }
            Companion companion = CryptoOrderPriceDialogFragment.INSTANCE;
            StringResource title = ((Args) companion.getArgs((Fragment) CryptoOrderPriceDialogFragment.this)).getTitle();
            int i2 = StringResource.$stable;
            String string2 = StringResource2.getString(title, composer, i2);
            String string3 = StringResource2.getString(((Args) companion.getArgs((Fragment) CryptoOrderPriceDialogFragment.this)).getBody(), composer, i2);
            String string4 = StringResource2.getString(((Args) companion.getArgs((Fragment) CryptoOrderPriceDialogFragment.this)).getPrimaryButtonText(), composer, i2);
            String string5 = StringResource2.getString(((Args) companion.getArgs((Fragment) CryptoOrderPriceDialogFragment.this)).getSecondaryButtonText(), composer, i2);
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(CryptoOrderPriceDialogFragment.this);
            final CryptoOrderPriceDialogFragment cryptoOrderPriceDialogFragment = CryptoOrderPriceDialogFragment.this;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.price.orderPriceDialog.CryptoOrderPriceDialogFragment$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoOrderPriceDialogFragment.C405311.invoke$lambda$1$lambda$0(cryptoOrderPriceDialogFragment);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(CryptoOrderPriceDialogFragment.this);
            final CryptoOrderPriceDialogFragment cryptoOrderPriceDialogFragment2 = CryptoOrderPriceDialogFragment.this;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.price.orderPriceDialog.CryptoOrderPriceDialogFragment$ComposeContent$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoOrderPriceDialogFragment.C405311.invoke$lambda$3$lambda$2(cryptoOrderPriceDialogFragment2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            CryptoOrderPriceDialogComposable.CryptoOrderPriceDialogComposable(string2, string3, string4, string5, function0, (Function0) objRememberedValue2, CryptoOrderPriceDialogFragment.this.getEventScreen(), null, composer, 0, 128);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(CryptoOrderPriceDialogFragment cryptoOrderPriceDialogFragment) {
            cryptoOrderPriceDialogFragment.getCallbacks().onPositiveRequest(((Args) CryptoOrderPriceDialogFragment.INSTANCE.getArgs((Fragment) cryptoOrderPriceDialogFragment)).getId());
            cryptoOrderPriceDialogFragment.dismiss();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(CryptoOrderPriceDialogFragment cryptoOrderPriceDialogFragment) {
            cryptoOrderPriceDialogFragment.getCallbacks().onNegativeRequest(((Args) CryptoOrderPriceDialogFragment.INSTANCE.getArgs((Fragment) cryptoOrderPriceDialogFragment)).getId());
            cryptoOrderPriceDialogFragment.dismiss();
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeDialogFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-700258848);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-700258848, i2, -1, "com.robinhood.shared.trade.crypto.ui.price.orderPriceDialog.CryptoOrderPriceDialogFragment.ComposeContent (CryptoOrderPriceDialogFragment.kt:33)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-649857240, true, new C405311(), composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.price.orderPriceDialog.CryptoOrderPriceDialogFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoOrderPriceDialogFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: CryptoOrderPriceDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0006\u0010\u001d\u001a\u00020\u0003J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001J\u0016\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006*"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/price/orderPriceDialog/CryptoOrderPriceDialogFragment$Args;", "Landroid/os/Parcelable;", "id", "", "title", "Lcom/robinhood/utils/resource/StringResource;", CarResultComposable2.BODY, "primaryButtonText", "secondaryButtonText", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "<init>", "(ILcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/rosetta/eventlogging/Screen;)V", "getId", "()I", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getBody", "getPrimaryButtonText", "getSecondaryButtonText", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final StringResource body;
        private final Screen eventScreen;
        private final int id;
        private final StringResource primaryButtonText;
        private final StringResource secondaryButtonText;
        private final StringResource title;

        /* compiled from: CryptoOrderPriceDialogFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readInt(), (StringResource) parcel.readParcelable(Args.class.getClassLoader()), (StringResource) parcel.readParcelable(Args.class.getClassLoader()), (StringResource) parcel.readParcelable(Args.class.getClassLoader()), (StringResource) parcel.readParcelable(Args.class.getClassLoader()), (Screen) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, int i, StringResource stringResource, StringResource stringResource2, StringResource stringResource3, StringResource stringResource4, Screen screen, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = args.id;
            }
            if ((i2 & 2) != 0) {
                stringResource = args.title;
            }
            if ((i2 & 4) != 0) {
                stringResource2 = args.body;
            }
            if ((i2 & 8) != 0) {
                stringResource3 = args.primaryButtonText;
            }
            if ((i2 & 16) != 0) {
                stringResource4 = args.secondaryButtonText;
            }
            if ((i2 & 32) != 0) {
                screen = args.eventScreen;
            }
            StringResource stringResource5 = stringResource4;
            Screen screen2 = screen;
            return args.copy(i, stringResource, stringResource2, stringResource3, stringResource5, screen2);
        }

        /* renamed from: component1, reason: from getter */
        public final int getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final StringResource getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final StringResource getBody() {
            return this.body;
        }

        /* renamed from: component4, reason: from getter */
        public final StringResource getPrimaryButtonText() {
            return this.primaryButtonText;
        }

        /* renamed from: component5, reason: from getter */
        public final StringResource getSecondaryButtonText() {
            return this.secondaryButtonText;
        }

        /* renamed from: component6, reason: from getter */
        public final Screen getEventScreen() {
            return this.eventScreen;
        }

        public final Args copy(int id, StringResource title, StringResource body, StringResource primaryButtonText, StringResource secondaryButtonText, Screen eventScreen) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(body, "body");
            Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
            Intrinsics.checkNotNullParameter(secondaryButtonText, "secondaryButtonText");
            Intrinsics.checkNotNullParameter(eventScreen, "eventScreen");
            return new Args(id, title, body, primaryButtonText, secondaryButtonText, eventScreen);
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
            return this.id == args.id && Intrinsics.areEqual(this.title, args.title) && Intrinsics.areEqual(this.body, args.body) && Intrinsics.areEqual(this.primaryButtonText, args.primaryButtonText) && Intrinsics.areEqual(this.secondaryButtonText, args.secondaryButtonText) && Intrinsics.areEqual(this.eventScreen, args.eventScreen);
        }

        public int hashCode() {
            return (((((((((Integer.hashCode(this.id) * 31) + this.title.hashCode()) * 31) + this.body.hashCode()) * 31) + this.primaryButtonText.hashCode()) * 31) + this.secondaryButtonText.hashCode()) * 31) + this.eventScreen.hashCode();
        }

        public String toString() {
            return "Args(id=" + this.id + ", title=" + this.title + ", body=" + this.body + ", primaryButtonText=" + this.primaryButtonText + ", secondaryButtonText=" + this.secondaryButtonText + ", eventScreen=" + this.eventScreen + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.id);
            dest.writeParcelable(this.title, flags);
            dest.writeParcelable(this.body, flags);
            dest.writeParcelable(this.primaryButtonText, flags);
            dest.writeParcelable(this.secondaryButtonText, flags);
            dest.writeSerializable(this.eventScreen);
        }

        public Args(int i, StringResource title, StringResource body, StringResource primaryButtonText, StringResource secondaryButtonText, Screen eventScreen) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(body, "body");
            Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
            Intrinsics.checkNotNullParameter(secondaryButtonText, "secondaryButtonText");
            Intrinsics.checkNotNullParameter(eventScreen, "eventScreen");
            this.id = i;
            this.title = title;
            this.body = body;
            this.primaryButtonText = primaryButtonText;
            this.secondaryButtonText = secondaryButtonText;
            this.eventScreen = eventScreen;
        }

        public final int getId() {
            return this.id;
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

        public final Screen getEventScreen() {
            return this.eventScreen;
        }
    }

    /* compiled from: CryptoOrderPriceDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/price/orderPriceDialog/CryptoOrderPriceDialogFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/shared/trade/crypto/ui/price/orderPriceDialog/CryptoOrderPriceDialogFragment;", "Lcom/robinhood/shared/trade/crypto/ui/price/orderPriceDialog/CryptoOrderPriceDialogFragment$Args;", "<init>", "()V", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<CryptoOrderPriceDialogFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(CryptoOrderPriceDialogFragment cryptoOrderPriceDialogFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, cryptoOrderPriceDialogFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public CryptoOrderPriceDialogFragment newInstance(Args args) {
            return (CryptoOrderPriceDialogFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(CryptoOrderPriceDialogFragment cryptoOrderPriceDialogFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, cryptoOrderPriceDialogFragment, args);
        }
    }
}
