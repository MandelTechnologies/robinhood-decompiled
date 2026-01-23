package com.robinhood.shared.crypto.transfer.send.address.allowlisting;

import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AllowlistPrimerComposable.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a%\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a\r\u0010\n\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000b\"\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"AllowlistPrimerComposable", "", "onClickContinue", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PrimerAssetUrlDark", "", "PrimerAssetUrlLight", "Preview", "(Landroidx/compose/runtime/Composer;I)V", "feature-crypto-transfer_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.transfer.send.address.allowlisting.AllowlistPrimerComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class AllowlistPrimerComposable {
    private static final String PrimerAssetUrlDark = "https://cdn.robinhood.com/app_assets/crypto/crypto_transfers/allowlist/primer/dark/1x.svg";
    private static final String PrimerAssetUrlLight = "https://cdn.robinhood.com/app_assets/crypto/crypto_transfers/allowlist/primer/light/1x.svg";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AllowlistPrimerComposable$lambda$0(Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AllowlistPrimerComposable(function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview$lambda$1(int i, Composer composer, int i2) {
        Preview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AllowlistPrimerComposable(final Function0<Unit> onClickContinue, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onClickContinue, "onClickContinue");
        Composer composerStartRestartGroup = composer.startRestartGroup(1066157216);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onClickContinue) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1066157216, i3, -1, "com.robinhood.shared.crypto.transfer.send.address.allowlisting.AllowlistPrimerComposable (AllowlistPrimerComposable.kt:44)");
                }
                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(Screen.Name.CRYPTO_TRANSFER_ALLOWLIST_ENABLED_PRIMER, null, null, null, 14, null), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(419455829, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.address.allowlisting.AllowlistPrimerComposableKt.AllowlistPrimerComposable.1
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
                            ComposerKt.traceEventStart(419455829, i5, -1, "com.robinhood.shared.crypto.transfer.send.address.allowlisting.AllowlistPrimerComposable.<anonymous> (AllowlistPrimerComposable.kt:50)");
                        }
                        Modifier modifierLogScreenTransitions$default = ModifiersKt.logScreenTransitions$default(modifier3, null, 1, null);
                        AllowlistPrimerComposable2 allowlistPrimerComposable2 = AllowlistPrimerComposable2.INSTANCE;
                        Function2<Composer, Integer, Unit> lambda$1259574297$feature_crypto_transfer_externalDebug = allowlistPrimerComposable2.getLambda$1259574297$feature_crypto_transfer_externalDebug();
                        final Function0<Unit> function0 = onClickContinue;
                        ScaffoldKt.m5939ScaffoldTvnljyQ(modifierLogScreenTransitions$default, lambda$1259574297$feature_crypto_transfer_externalDebug, ComposableLambda3.rememberComposableLambda(-1769322214, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.address.allowlisting.AllowlistPrimerComposableKt.AllowlistPrimerComposable.1.1
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
                                    ComposerKt.traceEventStart(-1769322214, i6, -1, "com.robinhood.shared.crypto.transfer.send.address.allowlisting.AllowlistPrimerComposable.<anonymous>.<anonymous> (AllowlistPrimerComposable.kt:106)");
                                }
                                Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer3.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.BUTTON, "continue", null, 4, null), null, 47, null)), false, false, false, true, false, null, 110, null), 0.0f, BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 1, null));
                                BentoButtonKt.m20586BentoButtonEikTQX8(function0, StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composer3, 0), modifierNavigationBarsPadding, null, null, false, false, null, null, null, null, false, null, composer3, 0, 0, 8184);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), null, null, 0, 0L, 0L, null, allowlistPrimerComposable2.m25045getLambda$27222044$feature_crypto_transfer_externalDebug(), composer2, 805306800, 504);
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
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.send.address.allowlisting.AllowlistPrimerComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AllowlistPrimerComposable.AllowlistPrimerComposable$lambda$0(onClickContinue, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(Screen.Name.CRYPTO_TRANSFER_ALLOWLIST_ENABLED_PRIMER, null, null, null, 14, null), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(419455829, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.address.allowlisting.AllowlistPrimerComposableKt.AllowlistPrimerComposable.1
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
                        ComposerKt.traceEventStart(419455829, i5, -1, "com.robinhood.shared.crypto.transfer.send.address.allowlisting.AllowlistPrimerComposable.<anonymous> (AllowlistPrimerComposable.kt:50)");
                    }
                    Modifier modifierLogScreenTransitions$default = ModifiersKt.logScreenTransitions$default(modifier3, null, 1, null);
                    AllowlistPrimerComposable2 allowlistPrimerComposable2 = AllowlistPrimerComposable2.INSTANCE;
                    Function2<Composer, Integer, Unit> lambda$1259574297$feature_crypto_transfer_externalDebug = allowlistPrimerComposable2.getLambda$1259574297$feature_crypto_transfer_externalDebug();
                    final Function0<Unit> function0 = onClickContinue;
                    ScaffoldKt.m5939ScaffoldTvnljyQ(modifierLogScreenTransitions$default, lambda$1259574297$feature_crypto_transfer_externalDebug, ComposableLambda3.rememberComposableLambda(-1769322214, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.address.allowlisting.AllowlistPrimerComposableKt.AllowlistPrimerComposable.1.1
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
                                ComposerKt.traceEventStart(-1769322214, i6, -1, "com.robinhood.shared.crypto.transfer.send.address.allowlisting.AllowlistPrimerComposable.<anonymous>.<anonymous> (AllowlistPrimerComposable.kt:106)");
                            }
                            Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer3.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.BUTTON, "continue", null, 4, null), null, 47, null)), false, false, false, true, false, null, 110, null), 0.0f, BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 1, null));
                            BentoButtonKt.m20586BentoButtonEikTQX8(function0, StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composer3, 0), modifierNavigationBarsPadding, null, null, false, false, null, null, null, null, false, null, composer3, 0, 0, 8184);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), null, null, 0, 0L, 0L, null, allowlistPrimerComposable2.m25045getLambda$27222044$feature_crypto_transfer_externalDebug(), composer2, 805306800, 504);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void Preview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(66858772);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(66858772, i, -1, "com.robinhood.shared.crypto.transfer.send.address.allowlisting.Preview (AllowlistPrimerComposable.kt:138)");
            }
            Boolean bool = Boolean.TRUE;
            BentoTheme2.BentoTheme(bool, null, null, null, null, bool, null, null, AllowlistPrimerComposable2.INSTANCE.getLambda$1061469788$feature_crypto_transfer_externalDebug(), composerStartRestartGroup, 100859910, EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.send.address.allowlisting.AllowlistPrimerComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AllowlistPrimerComposable.Preview$lambda$1(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
