package com.robinhood.shared.trade.crypto.p397ui.fee.definitionBottomSheet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.crypto.lib.UiCryptoOrders;
import com.robinhood.android.regiongate.CryptoRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.models.crypto.p314db.fee.CryptoFee;
import com.robinhood.models.crypto.p315ui.UiCryptoOrder;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.math.BigDecimal;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;

/* compiled from: CryptoFeeDefinitionBottomSheetFragment.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001f2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u001e\u001fB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0014\u001a\u00020\u0015H\u0017¢\u0006\u0002\u0010\u0016J\t\u0010\u0017\u001a\u00020\u0018H\u0096\u0001R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/fee/definitionBottomSheet/CryptoFeeDefinitionBottomSheetFragment;", "Lcom/robinhood/compose/app/GenericComposeBottomSheetDialogFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenEventComponent", "Lcom/robinhood/rosetta/eventlogging/Component;", "getScreenEventComponent", "()Lcom/robinhood/rosetta/eventlogging/Component;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "getAppType", "()Lcom/robinhood/shared/app/type/AppType;", "setAppType", "(Lcom/robinhood/shared/app/type/AppType;)V", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Args", "Companion", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class CryptoFeeDefinitionBottomSheetFragment extends GenericComposeBottomSheetDialogFragment implements AutoLoggableFragment, RegionGated {
    public AppType appType;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(CryptoRegionGate.INSTANCE);
    private final Component screenEventComponent = new Component(Component.ComponentType.BOTTOM_SHEET, "crypto_fees", null, 4, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(CryptoFeeDefinitionBottomSheetFragment cryptoFeeDefinitionBottomSheetFragment, int i, Composer composer, int i2) {
        cryptoFeeDefinitionBottomSheetFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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
    public Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return ((Args) INSTANCE.getArgs((Fragment) this)).getEventScreen();
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Component getScreenEventComponent() {
        return this.screenEventComponent;
    }

    public final AppType getAppType() {
        AppType appType = this.appType;
        if (appType != null) {
            return appType;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appType");
        return null;
    }

    public final void setAppType(AppType appType) {
        Intrinsics.checkNotNullParameter(appType, "<set-?>");
        this.appType = appType;
    }

    @Override // com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1063639841);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1063639841, i2, -1, "com.robinhood.shared.trade.crypto.ui.fee.definitionBottomSheet.CryptoFeeDefinitionBottomSheetFragment.ComposeContent (CryptoFeeDefinitionBottomSheetFragment.kt:41)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, Boolean.TRUE, null, null, ComposableLambda3.rememberComposableLambda(394622169, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.fee.definitionBottomSheet.CryptoFeeDefinitionBottomSheetFragment.ComposeContent.1
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
                        ComposerKt.traceEventStart(394622169, i3, -1, "com.robinhood.shared.trade.crypto.ui.fee.definitionBottomSheet.CryptoFeeDefinitionBottomSheetFragment.ComposeContent.<anonymous> (CryptoFeeDefinitionBottomSheetFragment.kt:43)");
                    }
                    CryptoFeeDefinitionBottomSheetFragment cryptoFeeDefinitionBottomSheetFragment = CryptoFeeDefinitionBottomSheetFragment.this;
                    composer2.startReplaceGroup(5004770);
                    boolean zChangedInstance = composer2.changedInstance(cryptoFeeDefinitionBottomSheetFragment);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new CryptoFeeDefinitionBottomSheetFragment2(cryptoFeeDefinitionBottomSheetFragment);
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    composer2.endReplaceGroup();
                    CryptoFeeDefinitionComposable3.CryptoFeeDefinitionComposable((Function0) ((KFunction) objRememberedValue), null, null, composer2, 0, 6);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.fee.definitionBottomSheet.CryptoFeeDefinitionBottomSheetFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoFeeDefinitionBottomSheetFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: CryptoFeeDefinitionBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000245BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\t\u0010$\u001a\u00020\fHÆ\u0003J\t\u0010%\u001a\u00020\u000eHÆ\u0003JY\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0006\u0010'\u001a\u00020(J\u0013\u0010)\u001a\u00020\f2\b\u0010*\u001a\u0004\u0018\u00010+HÖ\u0003J\t\u0010,\u001a\u00020(HÖ\u0001J\t\u0010-\u001a\u00020.HÖ\u0001J\u0016\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020(R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u00066"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/fee/definitionBottomSheet/CryptoFeeDefinitionBottomSheetFragment$Args;", "Landroid/os/Parcelable;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "currencyPairId", "Ljava/util/UUID;", "feeRatio", "Ljava/math/BigDecimal;", "minFeeAmount", "robinhoodFeeRatio", "exchangeFeeRatio", "hasOrderExecutions", "", "feeStructure", "Lcom/robinhood/shared/trade/crypto/ui/fee/definitionBottomSheet/CryptoFeeDefinitionBottomSheetFragment$Args$FeeStructure;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/Screen;Ljava/util/UUID;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ZLcom/robinhood/shared/trade/crypto/ui/fee/definitionBottomSheet/CryptoFeeDefinitionBottomSheetFragment$Args$FeeStructure;)V", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "getCurrencyPairId", "()Ljava/util/UUID;", "getFeeRatio", "()Ljava/math/BigDecimal;", "getMinFeeAmount", "getRobinhoodFeeRatio", "getExchangeFeeRatio", "getHasOrderExecutions", "()Z", "getFeeStructure", "()Lcom/robinhood/shared/trade/crypto/ui/fee/definitionBottomSheet/CryptoFeeDefinitionBottomSheetFragment$Args$FeeStructure;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "FeeStructure", "Companion", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        private final UUID currencyPairId;
        private final Screen eventScreen;
        private final BigDecimal exchangeFeeRatio;
        private final BigDecimal feeRatio;
        private final FeeStructure feeStructure;
        private final boolean hasOrderExecutions;
        private final BigDecimal minFeeAmount;
        private final BigDecimal robinhoodFeeRatio;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();

        /* compiled from: CryptoFeeDefinitionBottomSheetFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((Screen) parcel.readSerializable(), (UUID) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readInt() != 0, FeeStructure.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, Screen screen, UUID uuid, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, boolean z, FeeStructure feeStructure, int i, Object obj) {
            if ((i & 1) != 0) {
                screen = args.eventScreen;
            }
            if ((i & 2) != 0) {
                uuid = args.currencyPairId;
            }
            if ((i & 4) != 0) {
                bigDecimal = args.feeRatio;
            }
            if ((i & 8) != 0) {
                bigDecimal2 = args.minFeeAmount;
            }
            if ((i & 16) != 0) {
                bigDecimal3 = args.robinhoodFeeRatio;
            }
            if ((i & 32) != 0) {
                bigDecimal4 = args.exchangeFeeRatio;
            }
            if ((i & 64) != 0) {
                z = args.hasOrderExecutions;
            }
            if ((i & 128) != 0) {
                feeStructure = args.feeStructure;
            }
            boolean z2 = z;
            FeeStructure feeStructure2 = feeStructure;
            BigDecimal bigDecimal5 = bigDecimal3;
            BigDecimal bigDecimal6 = bigDecimal4;
            return args.copy(screen, uuid, bigDecimal, bigDecimal2, bigDecimal5, bigDecimal6, z2, feeStructure2);
        }

        /* renamed from: component1, reason: from getter */
        public final Screen getEventScreen() {
            return this.eventScreen;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getCurrencyPairId() {
            return this.currencyPairId;
        }

        /* renamed from: component3, reason: from getter */
        public final BigDecimal getFeeRatio() {
            return this.feeRatio;
        }

        /* renamed from: component4, reason: from getter */
        public final BigDecimal getMinFeeAmount() {
            return this.minFeeAmount;
        }

        /* renamed from: component5, reason: from getter */
        public final BigDecimal getRobinhoodFeeRatio() {
            return this.robinhoodFeeRatio;
        }

        /* renamed from: component6, reason: from getter */
        public final BigDecimal getExchangeFeeRatio() {
            return this.exchangeFeeRatio;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getHasOrderExecutions() {
            return this.hasOrderExecutions;
        }

        /* renamed from: component8, reason: from getter */
        public final FeeStructure getFeeStructure() {
            return this.feeStructure;
        }

        public final Args copy(Screen eventScreen, UUID currencyPairId, BigDecimal feeRatio, BigDecimal minFeeAmount, BigDecimal robinhoodFeeRatio, BigDecimal exchangeFeeRatio, boolean hasOrderExecutions, FeeStructure feeStructure) {
            Intrinsics.checkNotNullParameter(eventScreen, "eventScreen");
            Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
            Intrinsics.checkNotNullParameter(feeRatio, "feeRatio");
            Intrinsics.checkNotNullParameter(minFeeAmount, "minFeeAmount");
            Intrinsics.checkNotNullParameter(robinhoodFeeRatio, "robinhoodFeeRatio");
            Intrinsics.checkNotNullParameter(exchangeFeeRatio, "exchangeFeeRatio");
            Intrinsics.checkNotNullParameter(feeStructure, "feeStructure");
            return new Args(eventScreen, currencyPairId, feeRatio, minFeeAmount, robinhoodFeeRatio, exchangeFeeRatio, hasOrderExecutions, feeStructure);
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
            return Intrinsics.areEqual(this.eventScreen, args.eventScreen) && Intrinsics.areEqual(this.currencyPairId, args.currencyPairId) && Intrinsics.areEqual(this.feeRatio, args.feeRatio) && Intrinsics.areEqual(this.minFeeAmount, args.minFeeAmount) && Intrinsics.areEqual(this.robinhoodFeeRatio, args.robinhoodFeeRatio) && Intrinsics.areEqual(this.exchangeFeeRatio, args.exchangeFeeRatio) && this.hasOrderExecutions == args.hasOrderExecutions && this.feeStructure == args.feeStructure;
        }

        public int hashCode() {
            return (((((((((((((this.eventScreen.hashCode() * 31) + this.currencyPairId.hashCode()) * 31) + this.feeRatio.hashCode()) * 31) + this.minFeeAmount.hashCode()) * 31) + this.robinhoodFeeRatio.hashCode()) * 31) + this.exchangeFeeRatio.hashCode()) * 31) + Boolean.hashCode(this.hasOrderExecutions)) * 31) + this.feeStructure.hashCode();
        }

        public String toString() {
            return "Args(eventScreen=" + this.eventScreen + ", currencyPairId=" + this.currencyPairId + ", feeRatio=" + this.feeRatio + ", minFeeAmount=" + this.minFeeAmount + ", robinhoodFeeRatio=" + this.robinhoodFeeRatio + ", exchangeFeeRatio=" + this.exchangeFeeRatio + ", hasOrderExecutions=" + this.hasOrderExecutions + ", feeStructure=" + this.feeStructure + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.eventScreen);
            dest.writeSerializable(this.currencyPairId);
            dest.writeSerializable(this.feeRatio);
            dest.writeSerializable(this.minFeeAmount);
            dest.writeSerializable(this.robinhoodFeeRatio);
            dest.writeSerializable(this.exchangeFeeRatio);
            dest.writeInt(this.hasOrderExecutions ? 1 : 0);
            dest.writeString(this.feeStructure.name());
        }

        public Args(Screen eventScreen, UUID currencyPairId, BigDecimal feeRatio, BigDecimal minFeeAmount, BigDecimal robinhoodFeeRatio, BigDecimal exchangeFeeRatio, boolean z, FeeStructure feeStructure) {
            Intrinsics.checkNotNullParameter(eventScreen, "eventScreen");
            Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
            Intrinsics.checkNotNullParameter(feeRatio, "feeRatio");
            Intrinsics.checkNotNullParameter(minFeeAmount, "minFeeAmount");
            Intrinsics.checkNotNullParameter(robinhoodFeeRatio, "robinhoodFeeRatio");
            Intrinsics.checkNotNullParameter(exchangeFeeRatio, "exchangeFeeRatio");
            Intrinsics.checkNotNullParameter(feeStructure, "feeStructure");
            this.eventScreen = eventScreen;
            this.currencyPairId = currencyPairId;
            this.feeRatio = feeRatio;
            this.minFeeAmount = minFeeAmount;
            this.robinhoodFeeRatio = robinhoodFeeRatio;
            this.exchangeFeeRatio = exchangeFeeRatio;
            this.hasOrderExecutions = z;
            this.feeStructure = feeStructure;
        }

        public final Screen getEventScreen() {
            return this.eventScreen;
        }

        public final UUID getCurrencyPairId() {
            return this.currencyPairId;
        }

        public final BigDecimal getFeeRatio() {
            return this.feeRatio;
        }

        public final BigDecimal getMinFeeAmount() {
            return this.minFeeAmount;
        }

        public final BigDecimal getRobinhoodFeeRatio() {
            return this.robinhoodFeeRatio;
        }

        public final BigDecimal getExchangeFeeRatio() {
            return this.exchangeFeeRatio;
        }

        public final boolean getHasOrderExecutions() {
            return this.hasOrderExecutions;
        }

        public /* synthetic */ Args(Screen screen, UUID uuid, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, boolean z, FeeStructure feeStructure, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(screen, uuid, bigDecimal, bigDecimal2, bigDecimal3, bigDecimal4, z, (i & 128) != 0 ? FeeStructure.VOLUME_TIERED : feeStructure);
        }

        public final FeeStructure getFeeStructure() {
            return this.feeStructure;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: CryptoFeeDefinitionBottomSheetFragment.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/fee/definitionBottomSheet/CryptoFeeDefinitionBottomSheetFragment$Args$FeeStructure;", "", "<init>", "(Ljava/lang/String;I)V", "FIXED_RATE", "VOLUME_TIERED", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class FeeStructure {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ FeeStructure[] $VALUES;
            public static final FeeStructure FIXED_RATE = new FeeStructure("FIXED_RATE", 0);
            public static final FeeStructure VOLUME_TIERED = new FeeStructure("VOLUME_TIERED", 1);

            private static final /* synthetic */ FeeStructure[] $values() {
                return new FeeStructure[]{FIXED_RATE, VOLUME_TIERED};
            }

            public static EnumEntries<FeeStructure> getEntries() {
                return $ENTRIES;
            }

            private FeeStructure(String str, int i) {
            }

            static {
                FeeStructure[] feeStructureArr$values = $values();
                $VALUES = feeStructureArr$values;
                $ENTRIES = EnumEntries2.enumEntries(feeStructureArr$values);
            }

            public static FeeStructure valueOf(String str) {
                return (FeeStructure) Enum.valueOf(FeeStructure.class, str);
            }

            public static FeeStructure[] values() {
                return (FeeStructure[]) $VALUES.clone();
            }
        }

        /* compiled from: CryptoFeeDefinitionBottomSheetFragment.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/fee/definitionBottomSheet/CryptoFeeDefinitionBottomSheetFragment$Args$Companion;", "", "<init>", "()V", "createArgs", "Lcom/robinhood/shared/trade/crypto/ui/fee/definitionBottomSheet/CryptoFeeDefinitionBottomSheetFragment$Args;", "uiCryptoOrder", "Lcom/robinhood/models/crypto/ui/UiCryptoOrder;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final Args createArgs(UiCryptoOrder uiCryptoOrder, Screen eventScreen) {
                Intrinsics.checkNotNullParameter(uiCryptoOrder, "uiCryptoOrder");
                Intrinsics.checkNotNullParameter(eventScreen, "eventScreen");
                boolean z = !uiCryptoOrder.getExecutions().isEmpty();
                UUID id = uiCryptoOrder.getCurrencyPair().getId();
                CryptoFee cryptoFee = UiCryptoOrders.getCryptoFee(uiCryptoOrder);
                if (cryptoFee instanceof CryptoFee.FixedRateFee) {
                    CryptoFee.FixedRateFee fixedRateFee = (CryptoFee.FixedRateFee) cryptoFee;
                    return new Args(eventScreen, id, fixedRateFee.getFeeData().getFeeRatio(), fixedRateFee.getFeeData().getMinFeeAmount(), fixedRateFee.getFeeData().getRobinhoodFeeRatio(), fixedRateFee.getFeeData().getExchangeFeeRatio(), z, FeeStructure.FIXED_RATE);
                }
                if (cryptoFee instanceof CryptoFee.VolumeTieredFee) {
                    CryptoFee.VolumeTieredFee volumeTieredFee = (CryptoFee.VolumeTieredFee) cryptoFee;
                    return new Args(eventScreen, id, volumeTieredFee.getFeeData().getFeeRatio(), volumeTieredFee.getFeeData().getMinFeeAmount(), volumeTieredFee.getFeeData().getRobinhoodFeeRatio(), volumeTieredFee.getFeeData().getExchangeFeeRatio(), z, FeeStructure.VOLUME_TIERED);
                }
                if (!(cryptoFee instanceof CryptoFee.Unspecified) && cryptoFee != null) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException("Invalid state");
            }
        }
    }

    /* compiled from: CryptoFeeDefinitionBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/fee/definitionBottomSheet/CryptoFeeDefinitionBottomSheetFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/shared/trade/crypto/ui/fee/definitionBottomSheet/CryptoFeeDefinitionBottomSheetFragment;", "Lcom/robinhood/shared/trade/crypto/ui/fee/definitionBottomSheet/CryptoFeeDefinitionBottomSheetFragment$Args;", "<init>", "()V", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<CryptoFeeDefinitionBottomSheetFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(CryptoFeeDefinitionBottomSheetFragment cryptoFeeDefinitionBottomSheetFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, cryptoFeeDefinitionBottomSheetFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public CryptoFeeDefinitionBottomSheetFragment newInstance(Args args) {
            return (CryptoFeeDefinitionBottomSheetFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(CryptoFeeDefinitionBottomSheetFragment cryptoFeeDefinitionBottomSheetFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, cryptoFeeDefinitionBottomSheetFragment, args);
        }
    }
}
