package com.robinhood.shared.crypto.acats.confirmation;

import android.content.Context;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.home.contracts.MainActivityIntentKey;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.crypto.acats.C37511R;
import com.robinhood.shared.crypto.acats.MigrationSubmissionConfirmationDest;
import com.robinhood.shared.crypto.acats.confirmation.MigrationSubmissionConfirmationComposable3;
import com.robinhood.shared.crypto.contracts.CryptoAcatsHistoryFragmentKey;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MigrationSubmissionConfirmationComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"MigrationSubmissionConfirmationComposable", "", "args", "Lcom/robinhood/shared/crypto/acats/MigrationSubmissionConfirmationDest$Args;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/shared/crypto/acats/MigrationSubmissionConfirmationDest$Args;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-acats_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.acats.confirmation.MigrationSubmissionConfirmationComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class MigrationSubmissionConfirmationComposable3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MigrationSubmissionConfirmationComposable$lambda$0(MigrationSubmissionConfirmationDest.Args args, Modifier modifier, int i, int i2, Composer composer, int i3) {
        MigrationSubmissionConfirmationComposable(args, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void MigrationSubmissionConfirmationComposable(final MigrationSubmissionConfirmationDest.Args args, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(args, "args");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1106725174);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(args) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1106725174, i3, -1, "com.robinhood.shared.crypto.acats.confirmation.MigrationSubmissionConfirmationComposable (MigrationSubmissionConfirmationComposable.kt:51)");
            }
            AutoLoggingCompositionLocals.EventLoggable(UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, new Screen(Screen.Name.ACATS_CRYPTO_MIGRATION_FLOW_ASSET_CONFIRMATION, null, null, null, 14, null), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(1980744949, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.acats.confirmation.MigrationSubmissionConfirmationComposableKt.MigrationSubmissionConfirmationComposable.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    if ((i5 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1980744949, i5, -1, "com.robinhood.shared.crypto.acats.confirmation.MigrationSubmissionConfirmationComposable.<anonymous> (MigrationSubmissionConfirmationComposable.kt:59)");
                    }
                    final Modifier modifier2 = modifier;
                    final MigrationSubmissionConfirmationDest.Args args2 = args;
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1576653750, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.acats.confirmation.MigrationSubmissionConfirmationComposableKt.MigrationSubmissionConfirmationComposable.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i6) {
                            if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1576653750, i6, -1, "com.robinhood.shared.crypto.acats.confirmation.MigrationSubmissionConfirmationComposable.<anonymous>.<anonymous> (MigrationSubmissionConfirmationComposable.kt:60)");
                            }
                            BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(ModifiersKt.logScreenTransitions$default(modifier2, null, 1, null), false, ComposableLambda3.rememberComposableLambda(-261032897, true, new C506681(args2), composer3, 54), MigrationSubmissionConfirmationComposable.INSTANCE.m24872getLambda$2072590030$feature_acats_externalRelease(), composer3, 3504, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* compiled from: MigrationSubmissionConfirmationComposable.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.shared.crypto.acats.confirmation.MigrationSubmissionConfirmationComposableKt$MigrationSubmissionConfirmationComposable$1$1$1, reason: invalid class name and collision with other inner class name */
                        static final class C506681 implements Function3<BentoButtonBar3, Composer, Integer, Unit> {
                            final /* synthetic */ MigrationSubmissionConfirmationDest.Args $args;

                            C506681(MigrationSubmissionConfirmationDest.Args args) {
                                this.$args = args;
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer, Integer num) {
                                invoke(bentoButtonBar3, composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer, int i) {
                                Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                if ((i & 17) == 16 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-261032897, i, -1, "com.robinhood.shared.crypto.acats.confirmation.MigrationSubmissionConfirmationComposable.<anonymous>.<anonymous>.<anonymous> (MigrationSubmissionConfirmationComposable.kt:64)");
                                }
                                final Navigator navigator = (Navigator) composer.consume(LocalNavigator.getLocalNavigator());
                                final Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                final EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer, AutoLoggingCompositionLocals4.$stable);
                                Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs = PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM());
                                String strStringResource = StringResources_androidKt.stringResource(C37511R.string.crypto_acats_confirmation_button_done, composer, 0);
                                String strStringResource2 = StringResources_androidKt.stringResource(C37511R.string.crypto_acats_confirmation_button_view_details, composer, 0);
                                composer.startReplaceGroup(-1746271574);
                                boolean zChangedInstance = composer.changedInstance(current) | composer.changedInstance(navigator) | composer.changedInstance(context);
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.acats.confirmation.MigrationSubmissionConfirmationComposableKt$MigrationSubmissionConfirmationComposable$1$1$1$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return MigrationSubmissionConfirmationComposable3.C375231.AnonymousClass1.C506681.invoke$lambda$1$lambda$0(current, navigator, context);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                Function0 function0 = (Function0) objRememberedValue;
                                composer.endReplaceGroup();
                                composer.startReplaceGroup(-1224400529);
                                boolean zChangedInstance2 = composer.changedInstance(current) | composer.changedInstance(this.$args) | composer.changedInstance(navigator) | composer.changedInstance(context);
                                final MigrationSubmissionConfirmationDest.Args args = this.$args;
                                Object objRememberedValue2 = composer.rememberedValue();
                                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.crypto.acats.confirmation.MigrationSubmissionConfirmationComposableKt$MigrationSubmissionConfirmationComposable$1$1$1$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return MigrationSubmissionConfirmationComposable3.C375231.AnonymousClass1.C506681.invoke$lambda$3$lambda$2(current, args, navigator, context);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue2);
                                }
                                composer.endReplaceGroup();
                                BentoButtonBar2.BentoButtonBar(modifierM21618defaultFillMaxWidthPadding3ABfNKs, null, null, false, null, null, function0, strStringResource, false, null, false, (Function0) objRememberedValue2, strStringResource2, false, null, false, composer, 0, 0, 59198);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$1$lambda$0(EventLogger eventLogger, Navigator navigator, Context context) {
                                EventLogger.DefaultImpls.logTap$default(eventLogger, null, null, new Component(Component.ComponentType.BUTTON, "done", null, 4, null), null, null, false, 59, null);
                                Navigator.DefaultImpls.startActivity$default(navigator, context, MainActivityIntentKey.INSTANCE, null, true, null, null, 52, null);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$3$lambda$2(EventLogger eventLogger, MigrationSubmissionConfirmationDest.Args args, Navigator navigator, Context context) {
                                EventLogger.DefaultImpls.logTap$default(eventLogger, null, null, new Component(Component.ComponentType.BUTTON, "view_details", null, 4, null), null, null, false, 59, null);
                                Navigator.DefaultImpls.showFragment$default(navigator, context, new CryptoAcatsHistoryFragmentKey(args.getMigrationId()), false, false, false, null, true, null, false, true, null, null, 3516, null);
                                return Unit.INSTANCE;
                            }
                        }
                    }, composer2, 54), composer2, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.acats.confirmation.MigrationSubmissionConfirmationComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MigrationSubmissionConfirmationComposable3.MigrationSubmissionConfirmationComposable$lambda$0(args, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
