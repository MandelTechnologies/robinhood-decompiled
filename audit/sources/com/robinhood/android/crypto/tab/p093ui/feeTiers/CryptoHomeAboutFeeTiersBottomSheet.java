package com.robinhood.android.crypto.tab.p093ui.feeTiers;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.composebottomsheet.RhContentBottomSheet2;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.crypto.tab.C13013R;
import com.robinhood.android.crypto.tab.p093ui.feeTiers.CryptoHomeAboutFeeTiersBottomSheet;
import com.robinhood.android.regiongate.CryptoRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.ComponentHierarchy;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;

/* compiled from: CryptoHomeAboutFeeTiersBottomSheet.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00142\u00020\u00012\u00020\u0002:\u0002\u0013\u0014B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\t\u001a\u00020\nH\u0017¢\u0006\u0002\u0010\u000bJ\t\u0010\f\u001a\u00020\rH\u0096\u0001R\u0014\u0010\u0005\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/feeTiers/CryptoHomeAboutFeeTiersBottomSheet;", "Lcom/robinhood/compose/app/GenericComposeBottomSheetDialogFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "bottomSheetComponent", "Lcom/robinhood/rosetta/eventlogging/Component;", "getBottomSheetComponent", "()Lcom/robinhood/rosetta/eventlogging/Component;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Args", "Companion", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CryptoHomeAboutFeeTiersBottomSheet extends GenericComposeBottomSheetDialogFragment implements RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(CryptoRegionGate.INSTANCE);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(CryptoHomeAboutFeeTiersBottomSheet cryptoHomeAboutFeeTiersBottomSheet, int i, Composer composer, int i2) {
        cryptoHomeAboutFeeTiersBottomSheet.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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
    public final Component getBottomSheetComponent() {
        return new Component(Component.ComponentType.BOTTOM_SHEET, "about_fee_tiers", null, 4, null);
    }

    @Override // com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(65375868);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(65375868, i2, -1, "com.robinhood.android.crypto.tab.ui.feeTiers.CryptoHomeAboutFeeTiersBottomSheet.ComposeContent (CryptoHomeAboutFeeTiersBottomSheet.kt:38)");
            }
            CompositionLocal3.CompositionLocalProvider(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor().provides(new UserInteractionEventDescriptor(null, ((Args) INSTANCE.getArgs((Fragment) this)).getEventScreen(), null, null, null, null, 61, null)), ComposableLambda3.rememberComposableLambda(-57990340, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.feeTiers.CryptoHomeAboutFeeTiersBottomSheet.ComposeContent.1

                /* compiled from: CryptoHomeAboutFeeTiersBottomSheet.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.crypto.tab.ui.feeTiers.CryptoHomeAboutFeeTiersBottomSheet$ComposeContent$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ CryptoHomeAboutFeeTiersBottomSheet this$0;

                    AnonymousClass1(CryptoHomeAboutFeeTiersBottomSheet cryptoHomeAboutFeeTiersBottomSheet) {
                        this.this$0 = cryptoHomeAboutFeeTiersBottomSheet;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) throws Resources.NotFoundException {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer, int i) throws Resources.NotFoundException {
                        if ((i & 3) == 2 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-204603449, i, -1, "com.robinhood.android.crypto.tab.ui.feeTiers.CryptoHomeAboutFeeTiersBottomSheet.ComposeContent.<anonymous>.<anonymous> (CryptoHomeAboutFeeTiersBottomSheet.kt:45)");
                        }
                        final Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        final String strStringResource = StringResources_androidKt.stringResource(C13013R.string.crypto_home_tab_about_fee_tiers_secondary_cta_learn_more_link, composer, 0);
                        Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, this.this$0.getBottomSheetComponent(), null, 47, null), true, false, false, false, false, null, 108, null);
                        String strStringResource2 = StringResources_androidKt.stringResource(C13013R.string.crypto_home_tab_about_fee_tiers_title, composer, 0);
                        String strStringResource3 = StringResources_androidKt.stringResource(C13013R.string.crypto_home_tab_about_fee_tiers_description, new Object[]{Integer.valueOf(((Args) CryptoHomeAboutFeeTiersBottomSheet.INSTANCE.getArgs((Fragment) this.this$0)).getEvaluationPeriodDays())}, composer, 0);
                        String strStringResource4 = StringResources_androidKt.stringResource(C13013R.string.crypto_home_tab_about_fee_tiers_primary_cta_got_it, composer, 0);
                        String strStringResource5 = StringResources_androidKt.stringResource(C13013R.string.crypto_home_tab_about_fee_tiers_secondary_cta_learn_more, composer, 0);
                        Object obj = this.this$0;
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance = composer.changedInstance(obj);
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new CryptoHomeAboutFeeTiersBottomSheet2(obj);
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                        Component.ComponentType componentType = Component.ComponentType.BUTTON;
                        Component component = new Component(componentType, "fee_tiers_got_it", null, 4, null);
                        Component bottomSheetComponent = this.this$0.getBottomSheetComponent();
                        UserInteractionEventDescriptor userInteractionEventDescriptorCopy$default = UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, null, null, component, new ComponentHierarchy(bottomSheetComponent, null, null, null, null, 30, null), 15, null);
                        Component component2 = null;
                        Component component3 = new Component(componentType, "fee_tiers_learn_more", null, 4, null);
                        Component bottomSheetComponent2 = this.this$0.getBottomSheetComponent();
                        Component component4 = null;
                        UserInteractionEventDescriptor userInteractionEventDescriptorCopy$default2 = UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, component3, new ComponentHierarchy(bottomSheetComponent2, component2, component4, null, null, 30, null), 15, null);
                        Function0 function0 = (Function0) ((KFunction) objRememberedValue);
                        composer.startReplaceGroup(-1633490746);
                        boolean zChangedInstance2 = composer.changedInstance(context) | composer.changed(strStringResource);
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.crypto.tab.ui.feeTiers.CryptoHomeAboutFeeTiersBottomSheet$ComposeContent$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CryptoHomeAboutFeeTiersBottomSheet.C131391.AnonymousClass1.invoke$lambda$2$lambda$1(context, strStringResource);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        composer.endReplaceGroup();
                        RhContentBottomSheet2.RhContentBottomSheetLayout(strStringResource2, null, strStringResource3, strStringResource4, strStringResource5, function0, modifierAutoLogEvents$default, (Function0) objRememberedValue2, userInteractionEventDescriptorCopy$default, userInteractionEventDescriptorCopy$default2, composer, 48, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$2$lambda$1(Context context, String str) {
                        WebUtils.viewUrl$default(context, str, 0, 4, (Object) null);
                        return Unit.INSTANCE;
                    }
                }

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
                        ComposerKt.traceEventStart(-57990340, i3, -1, "com.robinhood.android.crypto.tab.ui.feeTiers.CryptoHomeAboutFeeTiersBottomSheet.ComposeContent.<anonymous> (CryptoHomeAboutFeeTiersBottomSheet.kt:44)");
                    }
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-204603449, true, new AnonymousClass1(CryptoHomeAboutFeeTiersBottomSheet.this), composer2, 54), composer2, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.tab.ui.feeTiers.CryptoHomeAboutFeeTiersBottomSheet$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoHomeAboutFeeTiersBottomSheet.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: CryptoHomeAboutFeeTiersBottomSheet.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0003J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/feeTiers/CryptoHomeAboutFeeTiersBottomSheet$Args;", "Landroid/os/Parcelable;", "evaluationPeriodDays", "", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "<init>", "(ILcom/robinhood/rosetta/eventlogging/Screen;)V", "getEvaluationPeriodDays", "()I", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final int evaluationPeriodDays;
        private final Screen eventScreen;

        /* compiled from: CryptoHomeAboutFeeTiersBottomSheet.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readInt(), (Screen) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, int i, Screen screen, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = args.evaluationPeriodDays;
            }
            if ((i2 & 2) != 0) {
                screen = args.eventScreen;
            }
            return args.copy(i, screen);
        }

        /* renamed from: component1, reason: from getter */
        public final int getEvaluationPeriodDays() {
            return this.evaluationPeriodDays;
        }

        /* renamed from: component2, reason: from getter */
        public final Screen getEventScreen() {
            return this.eventScreen;
        }

        public final Args copy(int evaluationPeriodDays, Screen eventScreen) {
            Intrinsics.checkNotNullParameter(eventScreen, "eventScreen");
            return new Args(evaluationPeriodDays, eventScreen);
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
            return this.evaluationPeriodDays == args.evaluationPeriodDays && Intrinsics.areEqual(this.eventScreen, args.eventScreen);
        }

        public int hashCode() {
            return (Integer.hashCode(this.evaluationPeriodDays) * 31) + this.eventScreen.hashCode();
        }

        public String toString() {
            return "Args(evaluationPeriodDays=" + this.evaluationPeriodDays + ", eventScreen=" + this.eventScreen + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.evaluationPeriodDays);
            dest.writeSerializable(this.eventScreen);
        }

        public Args(int i, Screen eventScreen) {
            Intrinsics.checkNotNullParameter(eventScreen, "eventScreen");
            this.evaluationPeriodDays = i;
            this.eventScreen = eventScreen;
        }

        public final int getEvaluationPeriodDays() {
            return this.evaluationPeriodDays;
        }

        public final Screen getEventScreen() {
            return this.eventScreen;
        }
    }

    /* compiled from: CryptoHomeAboutFeeTiersBottomSheet.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/feeTiers/CryptoHomeAboutFeeTiersBottomSheet$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/crypto/tab/ui/feeTiers/CryptoHomeAboutFeeTiersBottomSheet;", "Lcom/robinhood/android/crypto/tab/ui/feeTiers/CryptoHomeAboutFeeTiersBottomSheet$Args;", "<init>", "()V", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<CryptoHomeAboutFeeTiersBottomSheet, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(CryptoHomeAboutFeeTiersBottomSheet cryptoHomeAboutFeeTiersBottomSheet) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, cryptoHomeAboutFeeTiersBottomSheet);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public CryptoHomeAboutFeeTiersBottomSheet newInstance(Args args) {
            return (CryptoHomeAboutFeeTiersBottomSheet) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(CryptoHomeAboutFeeTiersBottomSheet cryptoHomeAboutFeeTiersBottomSheet, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, cryptoHomeAboutFeeTiersBottomSheet, args);
        }
    }
}
