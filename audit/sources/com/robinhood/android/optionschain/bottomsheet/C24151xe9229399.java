package com.robinhood.android.optionschain.bottomsheet;

import android.content.Context;
import android.content.Intent;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.options.contracts.OptionOrderIntentKey;
import com.robinhood.android.optionschain.sbschain.table.BidAskCellDisableType;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.p355ui.OptionLegBundle;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.ComponentHierarchy;
import com.robinhood.shared.lists.quickadd.C39088R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionChainBottomSheetComponent.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetComponentKt$OptionChainBottomSheetHeader$3$3 */
/* loaded from: classes11.dex */
final class C24151xe9229399 implements Function4<AnimatedContentScope, HeaderButtonMode, Composer, Integer, Unit> {
    final /* synthetic */ boolean $addedToWatchlist;
    final /* synthetic */ Context $context;
    final /* synthetic */ Navigator $navigator;
    final /* synthetic */ Function1<Intent, Unit> $onLaunchOrderForm;
    final /* synthetic */ Function3<Boolean, OptionLegBundle, BidAskCellDisableType, Unit> $onWatchlistButtonTapped;
    final /* synthetic */ OptionOrderIntentKey.FromOptionOrderBundle $optionOrderIntentKey;
    final /* synthetic */ UserInteractionEventDescriptor $parentDescriptor;
    final /* synthetic */ boolean $showTooManyLegsError;
    final /* synthetic */ OptionLegBundle $singleLegBundle;

    /* compiled from: OptionChainBottomSheetComponent.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetComponentKt$OptionChainBottomSheetHeader$3$3$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HeaderButtonMode.values().length];
            try {
                iArr[HeaderButtonMode.CONTINUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HeaderButtonMode.WATCHLIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    C24151xe9229399(UserInteractionEventDescriptor userInteractionEventDescriptor, boolean z, Function1<? super Intent, Unit> function1, Navigator navigator, Context context, OptionOrderIntentKey.FromOptionOrderBundle fromOptionOrderBundle, boolean z2, Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function3, OptionLegBundle optionLegBundle) {
        this.$parentDescriptor = userInteractionEventDescriptor;
        this.$showTooManyLegsError = z;
        this.$onLaunchOrderForm = function1;
        this.$navigator = navigator;
        this.$context = context;
        this.$optionOrderIntentKey = fromOptionOrderBundle;
        this.$addedToWatchlist = z2;
        this.$onWatchlistButtonTapped = function3;
        this.$singleLegBundle = optionLegBundle;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, HeaderButtonMode headerButtonMode, Composer composer, Integer num) {
        invoke(animatedContentScope, headerButtonMode, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(AnimatedContentScope AnimatedContent, HeaderButtonMode state, Composer composer, int i) {
        BentoIcon4.Size24 size24;
        int i2;
        long jM21425getFg0d7_KjU;
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        Intrinsics.checkNotNullParameter(state, "state");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1267589032, i, -1, "com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetHeader.<anonymous>.<anonymous> (OptionChainBottomSheetComponent.kt:381)");
        }
        int i3 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
        if (i3 == 1) {
            composer.startReplaceGroup(-1392273317);
            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, UserInteractionEventDescriptor.copy$default(this.$parentDescriptor, null, null, null, null, new Component(Component.ComponentType.BUTTON, "options-order-cart-header-cta", null, 4, null), new ComponentHierarchy(this.$parentDescriptor.getComponent(), null, null, null, null, 30, null), 15, null), false, false, false, true, false, null, 110, null);
            String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composer, 0);
            boolean z = !this.$showTooManyLegsError;
            composer.startReplaceGroup(-1224400529);
            boolean zChanged = composer.changed(this.$onLaunchOrderForm) | composer.changedInstance(this.$navigator) | composer.changedInstance(this.$context) | composer.changedInstance(this.$optionOrderIntentKey);
            final Function1<Intent, Unit> function1 = this.$onLaunchOrderForm;
            final Navigator navigator = this.$navigator;
            final Context context = this.$context;
            final OptionOrderIntentKey.FromOptionOrderBundle fromOptionOrderBundle = this.$optionOrderIntentKey;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetComponentKt$OptionChainBottomSheetHeader$3$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C24151xe9229399.invoke$lambda$1$lambda$0(function1, navigator, context, fromOptionOrderBundle);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, strStringResource, modifierAutoLogEvents$default, null, null, z, false, null, null, null, null, false, null, composer, 0, 0, 8152);
            composer.endReplaceGroup();
        } else if (i3 == 2) {
            composer.startReplaceGroup(-1391229764);
            Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, UserInteractionEventDescriptor.copy$default(this.$parentDescriptor, null, null, null, null, new Component(Component.ComponentType.BUTTON, "options-order-cart-watchlist", null, 4, null), new ComponentHierarchy(this.$parentDescriptor.getComponent(), null, null, null, null, 30, null), 15, null), false, false, false, true, false, null, 110, null);
            if (this.$addedToWatchlist) {
                size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.BUBBLE_CHECKED_24);
            } else {
                size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.BUBBLE_PLUS_24);
            }
            if (this.$addedToWatchlist) {
                i2 = C39088R.string.lists_item_removed_from_single_watchlist;
            } else {
                i2 = C39088R.string.lists_item_added_to_single_watchlist;
            }
            String strStringResource2 = StringResources_androidKt.stringResource(i2, composer, 0);
            if (this.$addedToWatchlist) {
                composer.startReplaceGroup(-1389922184);
                jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21456getPositive0d7_KjU();
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1389835074);
                jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU();
                composer.endReplaceGroup();
            }
            composer.startReplaceGroup(-1746271574);
            boolean zChanged2 = composer.changed(this.$onWatchlistButtonTapped) | composer.changed(this.$addedToWatchlist) | composer.changedInstance(this.$singleLegBundle);
            final Function3<Boolean, OptionLegBundle, BidAskCellDisableType, Unit> function3 = this.$onWatchlistButtonTapped;
            final boolean z2 = this.$addedToWatchlist;
            final OptionLegBundle optionLegBundle = this.$singleLegBundle;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetComponentKt$OptionChainBottomSheetHeader$3$3$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C24151xe9229399.invoke$lambda$3$lambda$2(function3, z2, optionLegBundle);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            BentoIcon2.m20644BentoIconFU0evQE(size24, strStringResource2, jM21425getFg0d7_KjU, modifierAutoLogEvents$default2, (Function0) objRememberedValue2, false, composer, BentoIcon4.Size24.$stable, 32);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1389345956);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Function1 function1, Navigator navigator, Context context, OptionOrderIntentKey.FromOptionOrderBundle fromOptionOrderBundle) {
        function1.invoke(Navigator.DefaultImpls.createIntent$default(navigator, context, fromOptionOrderBundle, null, false, 12, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(Function3 function3, boolean z, OptionLegBundle optionLegBundle) {
        if (function3 != null) {
            function3.invoke(Boolean.valueOf(z), optionLegBundle, null);
        }
        return Unit.INSTANCE;
    }
}
