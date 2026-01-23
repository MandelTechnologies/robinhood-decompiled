package com.robinhood.android.transfers.i18n.compose;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.transfers.i18n.compose.I18nTransfersHubHeaderComposable;
import com.robinhood.android.transfers.transferhub.C30556R;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextWithLink;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: I18nTransfersHubHeaderComposable.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aE\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0007¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"TransfersHubHeaderComposable", "", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "scarletManager", "Lcom/robinhood/scarlet/ScarletManager;", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "showLimitsText", "", "modifier", "Landroidx/compose/ui/Modifier;", "onLimitTextClick", "Lkotlin/Function0;", "(Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/scarlet/ScarletManager;Lcom/robinhood/rosetta/eventlogging/Screen;ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "feature-transfer-hub_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.i18n.compose.I18nTransfersHubHeaderComposableKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class I18nTransfersHubHeaderComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TransfersHubHeaderComposable$lambda$0(EventLogger eventLogger, ScarletManager scarletManager, Screen screen, boolean z, Modifier modifier, Function0 function0, int i, int i2, Composer composer, int i3) {
        TransfersHubHeaderComposable(eventLogger, scarletManager, screen, z, modifier, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void TransfersHubHeaderComposable(final EventLogger eventLogger, final ScarletManager scarletManager, final Screen screen, final boolean z, Modifier modifier, final Function0<Unit> onLimitTextClick, Composer composer, final int i, final int i2) {
        int i3;
        Composer composer2;
        final Modifier modifier2;
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(scarletManager, "scarletManager");
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(onLimitTextClick, "onLimitTextClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(477404110);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(eventLogger) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(scarletManager) : composerStartRestartGroup.changedInstance(scarletManager) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(screen) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onLimitTextClick) ? 131072 : 65536;
        }
        if ((74899 & i3) != 74898 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(477404110, i3, -1, "com.robinhood.android.transfers.i18n.compose.TransfersHubHeaderComposable (I18nTransfersHubHeaderComposable.kt:27)");
            }
            Modifier modifier4 = modifier3;
            composer2 = composerStartRestartGroup;
            BentoTheme2.BentoTheme(ScarletComposeInterop.themeChangesForCompose(scarletManager), null, ComposableLambda3.rememberComposableLambda(1744178012, true, new C302931(modifier4, (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()), z, eventLogger, screen, onLimitTextClick), composerStartRestartGroup, 54), composer2, 384, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.i18n.compose.I18nTransfersHubHeaderComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return I18nTransfersHubHeaderComposable.TransfersHubHeaderComposable$lambda$0(eventLogger, scarletManager, screen, z, modifier2, onLimitTextClick, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: I18nTransfersHubHeaderComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.transfers.i18n.compose.I18nTransfersHubHeaderComposableKt$TransfersHubHeaderComposable$1 */
    static final class C302931 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Context $context;
        final /* synthetic */ EventLogger $eventLogger;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function0<Unit> $onLimitTextClick;
        final /* synthetic */ Screen $screen;
        final /* synthetic */ boolean $showLimitsText;

        C302931(Modifier modifier, Context context, boolean z, EventLogger eventLogger, Screen screen, Function0<Unit> function0) {
            this.$modifier = modifier;
            this.$context = context;
            this.$showLimitsText = z;
            this.$eventLogger = eventLogger;
            this.$screen = screen;
            this.$onLimitTextClick = function0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1$lambda$0(EventLogger eventLogger, Screen screen, Function0 function0) {
            EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.VIEW_LIMIT_HUB, screen, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, null, false, 56, null);
            function0.invoke();
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1744178012, i, -1, "com.robinhood.android.transfers.i18n.compose.TransfersHubHeaderComposable.<anonymous> (I18nTransfersHubHeaderComposable.kt:33)");
            }
            Modifier modifier = this.$modifier;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(modifier, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
            Context context = this.$context;
            boolean z = this.$showLimitsText;
            final EventLogger eventLogger = this.$eventLogger;
            final Screen screen = this.$screen;
            final Function0<Unit> function0 = this.$onLimitTextClick;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5144paddingVpY3zN4$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 7, null);
            String string2 = context.getString(C30556R.string.move_money_screen_title);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            BentoText2.m20747BentoText38GnDrw(string2, modifierM5146paddingqDBjuR0$default, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleLarge(), composer, 0, 0, 8188);
            composer.startReplaceGroup(1203108727);
            if (z) {
                Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 7, null);
                String string3 = context.getString(C30556R.string.uk_transfers_hub_subtitle);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                String string4 = context.getString(C30556R.string.uk_transfers_hub_subtitle_link);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                long jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU();
                TextStyle textM = bentoTheme.getTypography(composer, i2).getTextM();
                composer.startReplaceGroup(-1746271574);
                boolean zChangedInstance = composer.changedInstance(eventLogger) | composer.changedInstance(screen) | composer.changed(function0);
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.transfers.i18n.compose.I18nTransfersHubHeaderComposableKt$TransfersHubHeaderComposable$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return I18nTransfersHubHeaderComposable.C302931.invoke$lambda$2$lambda$1$lambda$0(eventLogger, screen, function0);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                BentoTextWithLink.m20753BentoTextWithSubstringLinkXkG1Q0A(string3, string4, (Function0) objRememberedValue, modifierM5146paddingqDBjuR0$default2, jM21425getFg0d7_KjU, 0L, textM, 0, composer, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE);
            }
            composer.endReplaceGroup();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }
}
